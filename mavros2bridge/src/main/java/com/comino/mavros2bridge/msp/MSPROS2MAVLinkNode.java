package com.comino.mavros2bridge.msp;

import com.comino.mavcom.control.IMAVController;
import com.comino.mavcom.model.DataModel;
import com.eprosima.xmlschemas.fastrtps_profiles.DurabilityQosKindPolicyType;
import com.eprosima.xmlschemas.fastrtps_profiles.HistoryQosKindPolicyType;
import com.eprosima.xmlschemas.fastrtps_profiles.ReliabilityQosKindPolicyType;

import us.ihmc.log.LogTools;
import us.ihmc.pubsub.DomainFactory;
import us.ihmc.pubsub.common.SampleInfo;
import us.ihmc.ros2.ROS2Node;
import us.ihmc.ros2.ROS2Publisher;
import us.ihmc.ros2.ROS2QosProfile;

public class MSPROS2MAVLinkNode {

	private static MSPROS2MAVLinkNode instance;

	private final ROS2Node       node;
	private final DataModel      model;
	private final IMAVController control;

	public static MSPROS2MAVLinkNode getInstance(IMAVController control) {
		if(instance == null) {
			instance = new MSPROS2MAVLinkNode(control);
		}
		return instance;
	}

	public static MSPROS2MAVLinkNode getInstance() {
		return instance;
	}

	private MSPROS2MAVLinkNode(IMAVController control) {
		this.node       = new ROS2Node(DomainFactory.getDefaultDomain(),"MSPRos2MavLinkNode");
		this.control    = control;
		this.model      = control.getCurrentModel();

		this.vehicle_subscription_setup();
		this.vehicle_publisher_setup( );
		
		LogTools.info("ROS2 MAVLink node started");
	}

	public ROS2Node getNode() {
		return node;
	}

	public void close() {
		if(node!=null)
			node.destroy();
	}


	private void vehicle_subscription_setup() {

		var info    = new SampleInfo();
		var profile = getSubProfile();

	}

	private void vehicle_publisher_setup( ) {

		var profile = this.getPubProfile();

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
