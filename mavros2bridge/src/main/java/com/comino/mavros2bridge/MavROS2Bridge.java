package com.comino.mavros2bridge;

import com.eprosima.xmlschemas.fastrtps_profiles.DurabilityQosKindPolicyType;
import com.eprosima.xmlschemas.fastrtps_profiles.HistoryQosKindPolicyType;
import com.eprosima.xmlschemas.fastrtps_profiles.ReliabilityQosKindPolicyType;

import std_msgs.msg.dds.StringPubSubType;
import us.ihmc.log.LogTools;
import us.ihmc.pubsub.DomainFactory;
import us.ihmc.pubsub.common.SampleInfo;
import us.ihmc.ros2.ROS2Node;
import us.ihmc.ros2.ROS2Publisher;
import us.ihmc.ros2.ROS2QosProfile;

public class MavROS2Bridge {

	public static void main(String[] args) throws Exception {

		std_msgs.msg.dds.String message = new std_msgs.msg.dds.String();
		std_msgs.msg.dds.String sending = new std_msgs.msg.dds.String();
		
		px4_msgs.msg.dds.EstimatorStatusFlags sensors = new px4_msgs.msg.dds.EstimatorStatusFlags( );

		SampleInfo info = new SampleInfo();
		ROS2Node node = new ROS2Node(DomainFactory.getDefaultDomain(),"javaNode");
		
//        // Polling queued subscriber
//		QueuedROS2Subscription<std_msgs.msg.dds.String> subscription = node.createQueuedSubscription(new StringPubSubType(), 
//				"/chatter",ROS2QosProfile.RELIABLE(),10);

		// Callback subscriber
		node.createSubscription(new StringPubSubType(), subscriber -> {
			if (subscriber.takeNextData(message, info)) {
				LogTools.info("Text: "+message.getData().toString());
			}
		},"/chatter",ROS2QosProfile.RELIABLE());
		
		node.createSubscription(new px4_msgs.msg.dds.EstimatorStatusFlagsPubSubType(), subscriber -> {
			if (subscriber.takeNextData(sensors, info)) {
				LogTools.info("Sensor: "+sensors.cs_ev_vel_);
			}
		},"/fmu/out/estimator_status_flags",MavROS2Bridge.getProfile());


		// Publisher
		ROS2Publisher<std_msgs.msg.dds.String> publisher = (ROS2Publisher<std_msgs.msg.dds.String>) node.createPublisher(new StringPubSubType(), "/chatter",ROS2QosProfile.RELIABLE());

		
		while(true) {
			sending.setData("T"+System.currentTimeMillis());
//			while(subscription.poll(sending)) {
				publisher.publish(sending);
//			}
			Thread.sleep(3000);
		}

	}
	
	public static ROS2QosProfile getProfile()
	   {
	      int depth = 1;
	      return new ROS2QosProfile(HistoryQosKindPolicyType.KEEP_LAST, depth, ReliabilityQosKindPolicyType.BEST_EFFORT, DurabilityQosKindPolicyType.VOLATILE, false);
	   }

}
