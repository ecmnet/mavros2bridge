package px4_msgs.msg.dds;

/**
* 
* Topic data type of the struct "TelemetryStatus" defined in "TelemetryStatus_.idl". Use this class to provide the TopicDataType to a Participant. 
*
* This file was automatically generated from TelemetryStatus_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit TelemetryStatus_.idl instead.
*
*/
public class TelemetryStatusPubSubType implements us.ihmc.pubsub.TopicDataType<px4_msgs.msg.dds.TelemetryStatus>
{
   public static final java.lang.String name = "px4_msgs::msg::dds_::TelemetryStatus_";
   
   @Override
   public final java.lang.String getDefinitionChecksum()
   {
   		return "c1202b228ea426fa7fcedb5ea4e87a811db1f7738fd0abce80bb717624eb5857";
   }
   
   @Override
   public final java.lang.String getDefinitionVersion()
   {
   		return "";
   }

   private final us.ihmc.idl.CDR serializeCDR = new us.ihmc.idl.CDR();
   private final us.ihmc.idl.CDR deserializeCDR = new us.ihmc.idl.CDR();

   @Override
   public void serialize(px4_msgs.msg.dds.TelemetryStatus data, us.ihmc.pubsub.common.SerializedPayload serializedPayload) throws java.io.IOException
   {
      serializeCDR.serialize(serializedPayload);
      write(data, serializeCDR);
      serializeCDR.finishSerialize();
   }

   @Override
   public void deserialize(us.ihmc.pubsub.common.SerializedPayload serializedPayload, px4_msgs.msg.dds.TelemetryStatus data) throws java.io.IOException
   {
      deserializeCDR.deserialize(serializedPayload);
      read(data, deserializeCDR);
      deserializeCDR.finishDeserialize();
   }

   public static int getMaxCdrSerializedSize()
   {
      return getMaxCdrSerializedSize(0);
   }

   public static int getMaxCdrSerializedSize(int current_alignment)
   {
      int initial_alignment = current_alignment;

      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      return current_alignment - initial_alignment;
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.TelemetryStatus data)
   {
      return getCdrSerializedSize(data, 0);
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.TelemetryStatus data, int current_alignment)
   {
      int initial_alignment = current_alignment;

      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);



      return current_alignment - initial_alignment;
   }

   public static void write(px4_msgs.msg.dds.TelemetryStatus data, us.ihmc.idl.CDR cdr)
   {
      cdr.write_type_12(data.getTimestamp());

      cdr.write_type_9(data.getType());

      cdr.write_type_9(data.getMode());

      cdr.write_type_7(data.getFlowControl());

      cdr.write_type_7(data.getForwarding());

      cdr.write_type_7(data.getMavlinkV2());

      cdr.write_type_7(data.getFtp());

      cdr.write_type_9(data.getStreams());

      cdr.write_type_5(data.getDataRate());

      cdr.write_type_5(data.getRateMultiplier());

      cdr.write_type_5(data.getTxRateAvg());

      cdr.write_type_5(data.getTxErrorRateAvg());

      cdr.write_type_4(data.getTxMessageCount());

      cdr.write_type_4(data.getTxBufferOverruns());

      cdr.write_type_5(data.getRxRateAvg());

      cdr.write_type_4(data.getRxMessageCount());

      cdr.write_type_4(data.getRxMessageLostCount());

      cdr.write_type_4(data.getRxBufferOverruns());

      cdr.write_type_4(data.getRxParseErrors());

      cdr.write_type_4(data.getRxPacketDropCount());

      cdr.write_type_5(data.getRxMessageLostRate());

      cdr.write_type_7(data.getHeartbeatTypeAntennaTracker());

      cdr.write_type_7(data.getHeartbeatTypeGcs());

      cdr.write_type_7(data.getHeartbeatTypeOnboardController());

      cdr.write_type_7(data.getHeartbeatTypeGimbal());

      cdr.write_type_7(data.getHeartbeatTypeAdsb());

      cdr.write_type_7(data.getHeartbeatTypeCamera());

      cdr.write_type_7(data.getHeartbeatTypeParachute());

      cdr.write_type_7(data.getHeartbeatTypeOpenDroneId());

      cdr.write_type_7(data.getHeartbeatComponentTelemetryRadio());

      cdr.write_type_7(data.getHeartbeatComponentLog());

      cdr.write_type_7(data.getHeartbeatComponentOsd());

      cdr.write_type_7(data.getHeartbeatComponentObstacleAvoidance());

      cdr.write_type_7(data.getHeartbeatComponentVio());

      cdr.write_type_7(data.getHeartbeatComponentPairingManager());

      cdr.write_type_7(data.getHeartbeatComponentUdpBridge());

      cdr.write_type_7(data.getHeartbeatComponentUartBridge());

      cdr.write_type_7(data.getAvoidanceSystemHealthy());

      cdr.write_type_7(data.getOpenDroneIdSystemHealthy());

      cdr.write_type_7(data.getParachuteSystemHealthy());

   }

   public static void read(px4_msgs.msg.dds.TelemetryStatus data, us.ihmc.idl.CDR cdr)
   {
      data.setTimestamp(cdr.read_type_12());
      	
      data.setType(cdr.read_type_9());
      	
      data.setMode(cdr.read_type_9());
      	
      data.setFlowControl(cdr.read_type_7());
      	
      data.setForwarding(cdr.read_type_7());
      	
      data.setMavlinkV2(cdr.read_type_7());
      	
      data.setFtp(cdr.read_type_7());
      	
      data.setStreams(cdr.read_type_9());
      	
      data.setDataRate(cdr.read_type_5());
      	
      data.setRateMultiplier(cdr.read_type_5());
      	
      data.setTxRateAvg(cdr.read_type_5());
      	
      data.setTxErrorRateAvg(cdr.read_type_5());
      	
      data.setTxMessageCount(cdr.read_type_4());
      	
      data.setTxBufferOverruns(cdr.read_type_4());
      	
      data.setRxRateAvg(cdr.read_type_5());
      	
      data.setRxMessageCount(cdr.read_type_4());
      	
      data.setRxMessageLostCount(cdr.read_type_4());
      	
      data.setRxBufferOverruns(cdr.read_type_4());
      	
      data.setRxParseErrors(cdr.read_type_4());
      	
      data.setRxPacketDropCount(cdr.read_type_4());
      	
      data.setRxMessageLostRate(cdr.read_type_5());
      	
      data.setHeartbeatTypeAntennaTracker(cdr.read_type_7());
      	
      data.setHeartbeatTypeGcs(cdr.read_type_7());
      	
      data.setHeartbeatTypeOnboardController(cdr.read_type_7());
      	
      data.setHeartbeatTypeGimbal(cdr.read_type_7());
      	
      data.setHeartbeatTypeAdsb(cdr.read_type_7());
      	
      data.setHeartbeatTypeCamera(cdr.read_type_7());
      	
      data.setHeartbeatTypeParachute(cdr.read_type_7());
      	
      data.setHeartbeatTypeOpenDroneId(cdr.read_type_7());
      	
      data.setHeartbeatComponentTelemetryRadio(cdr.read_type_7());
      	
      data.setHeartbeatComponentLog(cdr.read_type_7());
      	
      data.setHeartbeatComponentOsd(cdr.read_type_7());
      	
      data.setHeartbeatComponentObstacleAvoidance(cdr.read_type_7());
      	
      data.setHeartbeatComponentVio(cdr.read_type_7());
      	
      data.setHeartbeatComponentPairingManager(cdr.read_type_7());
      	
      data.setHeartbeatComponentUdpBridge(cdr.read_type_7());
      	
      data.setHeartbeatComponentUartBridge(cdr.read_type_7());
      	
      data.setAvoidanceSystemHealthy(cdr.read_type_7());
      	
      data.setOpenDroneIdSystemHealthy(cdr.read_type_7());
      	
      data.setParachuteSystemHealthy(cdr.read_type_7());
      	

   }

   @Override
   public final void serialize(px4_msgs.msg.dds.TelemetryStatus data, us.ihmc.idl.InterchangeSerializer ser)
   {
      ser.write_type_12("timestamp", data.getTimestamp());
      ser.write_type_9("type", data.getType());
      ser.write_type_9("mode", data.getMode());
      ser.write_type_7("flow_control", data.getFlowControl());
      ser.write_type_7("forwarding", data.getForwarding());
      ser.write_type_7("mavlink_v2", data.getMavlinkV2());
      ser.write_type_7("ftp", data.getFtp());
      ser.write_type_9("streams", data.getStreams());
      ser.write_type_5("data_rate", data.getDataRate());
      ser.write_type_5("rate_multiplier", data.getRateMultiplier());
      ser.write_type_5("tx_rate_avg", data.getTxRateAvg());
      ser.write_type_5("tx_error_rate_avg", data.getTxErrorRateAvg());
      ser.write_type_4("tx_message_count", data.getTxMessageCount());
      ser.write_type_4("tx_buffer_overruns", data.getTxBufferOverruns());
      ser.write_type_5("rx_rate_avg", data.getRxRateAvg());
      ser.write_type_4("rx_message_count", data.getRxMessageCount());
      ser.write_type_4("rx_message_lost_count", data.getRxMessageLostCount());
      ser.write_type_4("rx_buffer_overruns", data.getRxBufferOverruns());
      ser.write_type_4("rx_parse_errors", data.getRxParseErrors());
      ser.write_type_4("rx_packet_drop_count", data.getRxPacketDropCount());
      ser.write_type_5("rx_message_lost_rate", data.getRxMessageLostRate());
      ser.write_type_7("heartbeat_type_antenna_tracker", data.getHeartbeatTypeAntennaTracker());
      ser.write_type_7("heartbeat_type_gcs", data.getHeartbeatTypeGcs());
      ser.write_type_7("heartbeat_type_onboard_controller", data.getHeartbeatTypeOnboardController());
      ser.write_type_7("heartbeat_type_gimbal", data.getHeartbeatTypeGimbal());
      ser.write_type_7("heartbeat_type_adsb", data.getHeartbeatTypeAdsb());
      ser.write_type_7("heartbeat_type_camera", data.getHeartbeatTypeCamera());
      ser.write_type_7("heartbeat_type_parachute", data.getHeartbeatTypeParachute());
      ser.write_type_7("heartbeat_type_open_drone_id", data.getHeartbeatTypeOpenDroneId());
      ser.write_type_7("heartbeat_component_telemetry_radio", data.getHeartbeatComponentTelemetryRadio());
      ser.write_type_7("heartbeat_component_log", data.getHeartbeatComponentLog());
      ser.write_type_7("heartbeat_component_osd", data.getHeartbeatComponentOsd());
      ser.write_type_7("heartbeat_component_obstacle_avoidance", data.getHeartbeatComponentObstacleAvoidance());
      ser.write_type_7("heartbeat_component_vio", data.getHeartbeatComponentVio());
      ser.write_type_7("heartbeat_component_pairing_manager", data.getHeartbeatComponentPairingManager());
      ser.write_type_7("heartbeat_component_udp_bridge", data.getHeartbeatComponentUdpBridge());
      ser.write_type_7("heartbeat_component_uart_bridge", data.getHeartbeatComponentUartBridge());
      ser.write_type_7("avoidance_system_healthy", data.getAvoidanceSystemHealthy());
      ser.write_type_7("open_drone_id_system_healthy", data.getOpenDroneIdSystemHealthy());
      ser.write_type_7("parachute_system_healthy", data.getParachuteSystemHealthy());
   }

   @Override
   public final void deserialize(us.ihmc.idl.InterchangeSerializer ser, px4_msgs.msg.dds.TelemetryStatus data)
   {
      data.setTimestamp(ser.read_type_12("timestamp"));
      data.setType(ser.read_type_9("type"));
      data.setMode(ser.read_type_9("mode"));
      data.setFlowControl(ser.read_type_7("flow_control"));
      data.setForwarding(ser.read_type_7("forwarding"));
      data.setMavlinkV2(ser.read_type_7("mavlink_v2"));
      data.setFtp(ser.read_type_7("ftp"));
      data.setStreams(ser.read_type_9("streams"));
      data.setDataRate(ser.read_type_5("data_rate"));
      data.setRateMultiplier(ser.read_type_5("rate_multiplier"));
      data.setTxRateAvg(ser.read_type_5("tx_rate_avg"));
      data.setTxErrorRateAvg(ser.read_type_5("tx_error_rate_avg"));
      data.setTxMessageCount(ser.read_type_4("tx_message_count"));
      data.setTxBufferOverruns(ser.read_type_4("tx_buffer_overruns"));
      data.setRxRateAvg(ser.read_type_5("rx_rate_avg"));
      data.setRxMessageCount(ser.read_type_4("rx_message_count"));
      data.setRxMessageLostCount(ser.read_type_4("rx_message_lost_count"));
      data.setRxBufferOverruns(ser.read_type_4("rx_buffer_overruns"));
      data.setRxParseErrors(ser.read_type_4("rx_parse_errors"));
      data.setRxPacketDropCount(ser.read_type_4("rx_packet_drop_count"));
      data.setRxMessageLostRate(ser.read_type_5("rx_message_lost_rate"));
      data.setHeartbeatTypeAntennaTracker(ser.read_type_7("heartbeat_type_antenna_tracker"));
      data.setHeartbeatTypeGcs(ser.read_type_7("heartbeat_type_gcs"));
      data.setHeartbeatTypeOnboardController(ser.read_type_7("heartbeat_type_onboard_controller"));
      data.setHeartbeatTypeGimbal(ser.read_type_7("heartbeat_type_gimbal"));
      data.setHeartbeatTypeAdsb(ser.read_type_7("heartbeat_type_adsb"));
      data.setHeartbeatTypeCamera(ser.read_type_7("heartbeat_type_camera"));
      data.setHeartbeatTypeParachute(ser.read_type_7("heartbeat_type_parachute"));
      data.setHeartbeatTypeOpenDroneId(ser.read_type_7("heartbeat_type_open_drone_id"));
      data.setHeartbeatComponentTelemetryRadio(ser.read_type_7("heartbeat_component_telemetry_radio"));
      data.setHeartbeatComponentLog(ser.read_type_7("heartbeat_component_log"));
      data.setHeartbeatComponentOsd(ser.read_type_7("heartbeat_component_osd"));
      data.setHeartbeatComponentObstacleAvoidance(ser.read_type_7("heartbeat_component_obstacle_avoidance"));
      data.setHeartbeatComponentVio(ser.read_type_7("heartbeat_component_vio"));
      data.setHeartbeatComponentPairingManager(ser.read_type_7("heartbeat_component_pairing_manager"));
      data.setHeartbeatComponentUdpBridge(ser.read_type_7("heartbeat_component_udp_bridge"));
      data.setHeartbeatComponentUartBridge(ser.read_type_7("heartbeat_component_uart_bridge"));
      data.setAvoidanceSystemHealthy(ser.read_type_7("avoidance_system_healthy"));
      data.setOpenDroneIdSystemHealthy(ser.read_type_7("open_drone_id_system_healthy"));
      data.setParachuteSystemHealthy(ser.read_type_7("parachute_system_healthy"));
   }

   public static void staticCopy(px4_msgs.msg.dds.TelemetryStatus src, px4_msgs.msg.dds.TelemetryStatus dest)
   {
      dest.set(src);
   }

   @Override
   public px4_msgs.msg.dds.TelemetryStatus createData()
   {
      return new px4_msgs.msg.dds.TelemetryStatus();
   }
   @Override
   public int getTypeSize()
   {
      return us.ihmc.idl.CDR.getTypeSize(getMaxCdrSerializedSize());
   }

   @Override
   public java.lang.String getName()
   {
      return name;
   }
   
   public void serialize(px4_msgs.msg.dds.TelemetryStatus data, us.ihmc.idl.CDR cdr)
   {
      write(data, cdr);
   }

   public void deserialize(px4_msgs.msg.dds.TelemetryStatus data, us.ihmc.idl.CDR cdr)
   {
      read(data, cdr);
   }
   
   public void copy(px4_msgs.msg.dds.TelemetryStatus src, px4_msgs.msg.dds.TelemetryStatus dest)
   {
      staticCopy(src, dest);
   }

   @Override
   public TelemetryStatusPubSubType newInstance()
   {
      return new TelemetryStatusPubSubType();
   }
}
