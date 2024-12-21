package com.comino.mavros2bridge.msp;

import com.comino.mavcom.control.IMAVController;
import com.comino.mavcom.model.DataModel;
import com.comino.mavcom.model.segment.Vision;
import com.eprosima.xmlschemas.fastrtps_profiles.DurabilityQosKindPolicyType;
import com.eprosima.xmlschemas.fastrtps_profiles.HistoryQosKindPolicyType;
import com.eprosima.xmlschemas.fastrtps_profiles.ReliabilityQosKindPolicyType;

import us.ihmc.pubsub.DomainFactory;
import us.ihmc.pubsub.common.SampleInfo;
import us.ihmc.ros2.ROS2Node;
import us.ihmc.ros2.ROS2QosProfile;

public class MSPROS2Node {

	private final ROS2Node  node;
	private final DataModel model;
	
	private long tms_vision_old;

	public MSPROS2Node(IMAVController control) {
		this.node = new ROS2Node(DomainFactory.getDefaultDomain(),"MSPRos2Node");
		this.model = control.getCurrentModel();
	}

	public void setup() {

		SampleInfo info = new SampleInfo();

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
		},"/fmu/out/vehicle_odometry",this.getProfile());

		// EstimatorStatusFlags
		px4_msgs.msg.dds.EstimatorStatusFlags estStatusFlags = new px4_msgs.msg.dds.EstimatorStatusFlags( );
		node.createSubscription(new px4_msgs.msg.dds.EstimatorStatusFlagsPubSubType(), subscriber -> {
			if (subscriber.takeNextData(estStatusFlags, info)) {
				model.vision.setStatus(Vision.AVAILABLE, estStatusFlags.cs_ev_vel_ || estStatusFlags.cs_ev_pos_);
				model.vision.setStatus(Vision.SPEED_VALID, estStatusFlags.cs_ev_vel_);
				model.vision.setStatus(Vision.POS_VALID, estStatusFlags.cs_ev_pos_);	
			}
		},"/fmu/out/estimator_status_flags",this.getProfile());

	}

	private ROS2QosProfile getProfile()
	{
		int depth = 1;
		return new ROS2QosProfile(HistoryQosKindPolicyType.KEEP_LAST, depth, ReliabilityQosKindPolicyType.BEST_EFFORT, DurabilityQosKindPolicyType.VOLATILE, false);
	}

}
