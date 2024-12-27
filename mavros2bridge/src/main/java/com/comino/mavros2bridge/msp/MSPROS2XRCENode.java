package com.comino.mavros2bridge.msp;

import java.util.ArrayList;


import com.comino.mavcom.control.IMAVController;
import com.comino.mavcom.model.DataModel;
import com.comino.mavcom.model.segment.Vision;
import com.comino.mavros2bridge.msp.callbacks.xrce.IModeCompletedCallback;
import com.eprosima.xmlschemas.fastrtps_profiles.DurabilityQosKindPolicyType;
import com.eprosima.xmlschemas.fastrtps_profiles.HistoryQosKindPolicyType;
import com.eprosima.xmlschemas.fastrtps_profiles.ReliabilityQosKindPolicyType;

import georegression.struct.point.Point3D_F32;
import us.ihmc.log.LogTools;
import us.ihmc.pubsub.DomainFactory;
import us.ihmc.pubsub.common.SampleInfo;
import us.ihmc.ros2.ROS2Node;
import us.ihmc.ros2.ROS2Publisher;
import us.ihmc.ros2.ROS2QosProfile;

public class MSPROS2XRCENode {

	private static MSPROS2XRCENode instance;

	private final ROS2Node  node;
	private final DataModel model;

	private ROS2Publisher<px4_msgs.msg.dds.TrajectorySetpoint>           pubTrajectorySetpoint;
	private px4_msgs.msg.dds.TrajectorySetpoint                          msgTrajectorySetpoint = new  px4_msgs.msg.dds.TrajectorySetpoint( );

	private ROS2Publisher<px4_msgs.msg.dds.VehicleLocalPositionSetpoint> pubVehicleLocalPositionSetpoint;
	private px4_msgs.msg.dds.VehicleLocalPositionSetpoint                msgVehicleLocalPositionSetpoint = new  px4_msgs.msg.dds.VehicleLocalPositionSetpoint( );

	private ROS2Publisher<px4_msgs.msg.dds.OffboardControlMode>          pubOffboardControlMode;
	private px4_msgs.msg.dds.OffboardControlMode                         msgOffboardControlMode = new  px4_msgs.msg.dds.OffboardControlMode( );

	private ArrayList<IModeCompletedCallback>                            modeCompletedListeners   = new ArrayList<IModeCompletedCallback>( );

	private long tms_vision_old;
	private int  nav_state_old;

	public static MSPROS2XRCENode getInstance(IMAVController control) {
		if(instance == null) {
			instance = new MSPROS2XRCENode(control);
		}
		return instance;
	}

	public static MSPROS2XRCENode getInstance() {
		return instance;
	}

	private MSPROS2XRCENode(IMAVController control) {
		this.node       = new ROS2Node(DomainFactory.getDefaultDomain(),"MSPRos2XRCENode");
		this.model      = control.getCurrentModel();

		this.vehicle_subscription_setup();
		this.vehicle_publisher_setup( );
		
		LogTools.info("ROS2 XRCE DDS node started");
	}

	public ROS2Node getNode() {
		return node;
	}

	public void close() {
		if(node!=null)
			node.destroy();
	}

	public void publishRos2VehicleLocalPositionSetpoint(float x, float y, float z, float eta_s) {
		//TODO
		msgVehicleLocalPositionSetpoint.timestamp_ = DataModel.getSynchronizedPX4Time_us();
		pubVehicleLocalPositionSetpoint.publish(msgVehicleLocalPositionSetpoint);
		LogTools.debug("Publish:"+msgVehicleLocalPositionSetpoint);
	}

	public void publishRos2TrajectorySetpoint(Point3D_F32 pos, Point3D_F32 vel, Point3D_F32 acc, Point3D_F32 jrk, Float yaw, Float yaw_speed ) {
		for(int i=0; i<3;i++) {
			msgTrajectorySetpoint.position_[i]     = pos.getIdx(i);
			msgTrajectorySetpoint.velocity_[i]     = vel.getIdx(i);
			msgTrajectorySetpoint.acceleration_[i] = acc.getIdx(i);
			msgTrajectorySetpoint.jerk_[i]         = jrk.getIdx(i);
		}
		msgTrajectorySetpoint.yaw_        = yaw;
		msgTrajectorySetpoint.yawspeed_   = yaw_speed;
		msgTrajectorySetpoint.timestamp_ = DataModel.getSynchronizedPX4Time_us();
		pubTrajectorySetpoint.publish(msgTrajectorySetpoint);
		LogTools.debug("Publish:"+msgTrajectorySetpoint);
	}

	public void publishRos2ffboardControlMode( boolean pos, boolean vel, boolean acc) {
		msgOffboardControlMode.position_          = pos;
		msgOffboardControlMode.velocity_          = vel;
		msgOffboardControlMode.acceleration_      = acc;
		msgOffboardControlMode.attitude_          = false;
		msgOffboardControlMode.thrust_and_torque_ = false;
		msgOffboardControlMode.timestamp_         = DataModel.getSynchronizedPX4Time_us();
		pubOffboardControlMode.publish(msgOffboardControlMode);
		LogTools.debug("Publish:"+pubOffboardControlMode);
	}

	public ArrayList<IModeCompletedCallback> getModeCompletedListeners( ) {
		return modeCompletedListeners;
	}


	private void vehicle_subscription_setup() {

		var info    = new SampleInfo();
		var profile = getSubProfile();

		// Vehicle Odometry
		px4_msgs.msg.dds.VehicleOdometry vehicleOdometry = new px4_msgs.msg.dds.VehicleOdometry( );
		node.createSubscription(new px4_msgs.msg.dds.VehicleOdometryPubSubType(), subscriber -> {
			if (subscriber.takeNextData(vehicleOdometry, info)) {

				if(!model.vision.isStatus(Vision.AVAILABLE)) {
					model.vision.clear();
					return;
				}
				model.vision.tms = vehicleOdometry.timestamp_;

				model.vision.x   = vehicleOdometry.getPosition()[0];
				model.vision.y   = vehicleOdometry.getPosition()[1];
				model.vision.z   = vehicleOdometry.getPosition()[2];

				model.vision.vx  = vehicleOdometry.getVelocity()[0];
				model.vision.vy  = vehicleOdometry.getVelocity()[1];
				model.vision.vz  = vehicleOdometry.getVelocity()[2];

				model.vision.fps =  1000_000f / (model.vision.tms - tms_vision_old);
				tms_vision_old = model.vision.tms;

				model.vision.qual   = vehicleOdometry.getQuality();

				model.vision.setStatus(Vision.ERROR, model.vision.errors != vehicleOdometry.getResetCounter());		
				model.vision.errors = vehicleOdometry.getResetCounter();

			}
		},"/fmu/out/vehicle_odometry",profile);
		LogTools.info("Register subscriber: "+vehicleOdometry.getClass().getName());

		// TimeSync Status
		px4_msgs.msg.dds.TimesyncStatus timesyncStatus = new px4_msgs.msg.dds.TimesyncStatus( );
		node.createSubscription(new px4_msgs.msg.dds.TimesyncStatusPubSubType(), subscriber -> {
			if (subscriber.takeNextData(timesyncStatus, info)) {
				System.err.println("XRC "+timesyncStatus.estimated_offset_);
				//	LogTools.info("Timesync roundtrip: "+timesyncStatus.round_trip_time_);
			}
		},"fmu/out/timesync_status",profile);
		LogTools.info("Register subscriber: "+timesyncStatus.getClass().getName());


		// EstimatorStatusFlags
		px4_msgs.msg.dds.EstimatorStatusFlags estStatusFlags = new px4_msgs.msg.dds.EstimatorStatusFlags( );
		node.createSubscription(new px4_msgs.msg.dds.EstimatorStatusFlagsPubSubType(), subscriber -> {
			if (subscriber.takeNextData(estStatusFlags, info)) {
				model.vision.setStatus(Vision.AVAILABLE, estStatusFlags.cs_ev_vel_ || estStatusFlags.cs_ev_pos_);
				model.vision.setStatus(Vision.SPEED_VALID, estStatusFlags.cs_ev_vel_);
				model.vision.setStatus(Vision.POS_VALID, estStatusFlags.cs_ev_pos_);	
			}
		},"/fmu/out/estimator_status_flags",profile);
		LogTools.info("Register subscriber: "+estStatusFlags.getClass().getName());

		// Failsafe flags 
		px4_msgs.msg.dds.FailsafeFlags failsafeFlags = new px4_msgs.msg.dds.FailsafeFlags( );
		node.createSubscription(new px4_msgs.msg.dds.FailsafeFlagsPubSubType(), subscriber -> {
			if (subscriber.takeNextData(failsafeFlags, info)) {

				// TODO MSP Actions required when failsafe is triggered

			}
		},"/fmu/out/failsafe_flags",profile);
		LogTools.info("Register subscriber: "+failsafeFlags.getClass().getName());


		// Mode completed - Note: Topics sometimes triggered more than once
		px4_msgs.msg.dds.ModeCompleted modeCompleted = new px4_msgs.msg.dds.ModeCompleted( );
		node.createSubscription(new px4_msgs.msg.dds.ModeCompletedPubSubType(), subscriber -> {
			if (subscriber.takeNextData(modeCompleted, info)) {
				if(nav_state_old != modeCompleted.nav_state_) {
					for(var listener : modeCompletedListeners)
						listener.changed(modeCompleted.nav_state_);
				}
				nav_state_old = modeCompleted.nav_state_;
			}
		},"/fmu/out/mode_completed",profile);
		LogTools.info("Register subscriber: "+modeCompleted.getClass().getName());

	}

	private void vehicle_publisher_setup( ) {

		var profile = this.getPubProfile();

		this.pubVehicleLocalPositionSetpoint =  (ROS2Publisher<px4_msgs.msg.dds.VehicleLocalPositionSetpoint>) node.createPublisher(new px4_msgs.msg.dds.VehicleLocalPositionSetpointPubSubType(), 
				"/fmu/in/vehicle_local_position",profile);
		LogTools.info("Register publisher: "+msgVehicleLocalPositionSetpoint.getClass().getName());

		this.pubTrajectorySetpoint =  (ROS2Publisher<px4_msgs.msg.dds.TrajectorySetpoint>) node.createPublisher(new px4_msgs.msg.dds.TrajectorySetpointPubSubType(), 
				"/fmu/in/vehicle_trajectory_setpoint",profile);
		LogTools.info("Register publisher: "+msgTrajectorySetpoint.getClass().getName());


		this.pubOffboardControlMode =  (ROS2Publisher<px4_msgs.msg.dds.OffboardControlMode>) node.createPublisher(new px4_msgs.msg.dds.OffboardControlModePubSubType(), 
				"fmu/in/offboard_control_mode",profile);
		LogTools.info("Register publisher: "+msgOffboardControlMode.getClass().getName());

	}


	private ROS2QosProfile getSubProfile()
	{
		int depth = 1;
		return new ROS2QosProfile(HistoryQosKindPolicyType.KEEP_LAST, depth, ReliabilityQosKindPolicyType.BEST_EFFORT, DurabilityQosKindPolicyType.VOLATILE, false);
	}

	private ROS2QosProfile getPubProfile()
	{
		int depth = 1;
		return new ROS2QosProfile(HistoryQosKindPolicyType.KEEP_LAST, depth, ReliabilityQosKindPolicyType.BEST_EFFORT, DurabilityQosKindPolicyType.TRANSIENT_LOCAL, false);
	}

}
