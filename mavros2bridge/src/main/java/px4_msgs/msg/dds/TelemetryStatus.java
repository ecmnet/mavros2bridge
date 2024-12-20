package px4_msgs.msg.dds;

import us.ihmc.communication.packets.Packet;
import us.ihmc.euclid.interfaces.Settable;
import us.ihmc.euclid.interfaces.EpsilonComparable;
import java.util.function.Supplier;
import us.ihmc.pubsub.TopicDataType;

public class TelemetryStatus extends Packet<TelemetryStatus> implements Settable<TelemetryStatus>, EpsilonComparable<TelemetryStatus>
{
   public static final byte LINK_TYPE_GENERIC = (byte) 0;
   public static final byte LINK_TYPE_UBIQUITY_BULLET = (byte) 1;
   public static final byte LINK_TYPE_WIRE = (byte) 2;
   public static final byte LINK_TYPE_USB = (byte) 3;
   public static final byte LINK_TYPE_IRIDIUM = (byte) 4;
   /**
          * Heartbeat timeout (tolerate missing 1 + jitter)
          */
   public static final long HEARTBEAT_TIMEOUT_US = 2500000;
   /**
            * time since system start (microseconds)
            */
   public long timestamp_;
   /**
            * type of the radio hardware (LINK_TYPE_*)
            */
   public byte type_;
   public byte mode_;
   public boolean flow_control_;
   public boolean forwarding_;
   public boolean mavlink_v2_;
   public boolean ftp_;
   public byte streams_;
   /**
            * configured maximum data rate (Bytes/s)
            */
   public float data_rate_;
   public float rate_multiplier_;
   /**
            * transmit rate average (Bytes/s)
            */
   public float tx_rate_avg_;
   /**
            * transmit error rate average (Bytes/s)
            */
   public float tx_error_rate_avg_;
   /**
            * total message sent count
            */
   public long tx_message_count_;
   /**
            * number of TX buffer overruns
            */
   public long tx_buffer_overruns_;
   /**
            * transmit rate average (Bytes/s)
            */
   public float rx_rate_avg_;
   /**
            * count of total messages received
            */
   public long rx_message_count_;
   public long rx_message_lost_count_;
   /**
            * number of RX buffer overruns
            */
   public long rx_buffer_overruns_;
   /**
            * number of parse errors
            */
   public long rx_parse_errors_;
   /**
            * number of packet drops
            */
   public long rx_packet_drop_count_;
   public float rx_message_lost_rate_;
   /**
            * Heartbeats per type
            * MAV_TYPE_ANTENNA_TRACKER
            */
   public boolean heartbeat_type_antenna_tracker_;
   /**
            * MAV_TYPE_GCS
            */
   public boolean heartbeat_type_gcs_;
   /**
            * MAV_TYPE_ONBOARD_CONTROLLER
            */
   public boolean heartbeat_type_onboard_controller_;
   /**
            * MAV_TYPE_GIMBAL
            */
   public boolean heartbeat_type_gimbal_;
   /**
            * MAV_TYPE_ADSB
            */
   public boolean heartbeat_type_adsb_;
   /**
            * MAV_TYPE_CAMERA
            */
   public boolean heartbeat_type_camera_;
   /**
            * MAV_TYPE_PARACHUTE
            */
   public boolean heartbeat_type_parachute_;
   /**
            * MAV_TYPE_ODID
            */
   public boolean heartbeat_type_open_drone_id_;
   /**
            * Heartbeats per component
            * MAV_COMP_ID_TELEMETRY_RADIO
            */
   public boolean heartbeat_component_telemetry_radio_;
   /**
            * MAV_COMP_ID_LOG
            */
   public boolean heartbeat_component_log_;
   /**
            * MAV_COMP_ID_OSD
            */
   public boolean heartbeat_component_osd_;
   /**
            * MAV_COMP_ID_OBSTACLE_AVOIDANCE
            */
   public boolean heartbeat_component_obstacle_avoidance_;
   /**
            * MAV_COMP_ID_VISUAL_INERTIAL_ODOMETRY
            */
   public boolean heartbeat_component_vio_;
   /**
            * MAV_COMP_ID_PAIRING_MANAGER
            */
   public boolean heartbeat_component_pairing_manager_;
   /**
            * MAV_COMP_ID_UDP_BRIDGE
            */
   public boolean heartbeat_component_udp_bridge_;
   /**
            * MAV_COMP_ID_UART_BRIDGE
            */
   public boolean heartbeat_component_uart_bridge_;
   /**
            * Misc component health
            */
   public boolean avoidance_system_healthy_;
   public boolean open_drone_id_system_healthy_;
   public boolean parachute_system_healthy_;

   public TelemetryStatus()
   {
   }

   public TelemetryStatus(TelemetryStatus other)
   {
      this();
      set(other);
   }

   public void set(TelemetryStatus other)
   {
      timestamp_ = other.timestamp_;

      type_ = other.type_;

      mode_ = other.mode_;

      flow_control_ = other.flow_control_;

      forwarding_ = other.forwarding_;

      mavlink_v2_ = other.mavlink_v2_;

      ftp_ = other.ftp_;

      streams_ = other.streams_;

      data_rate_ = other.data_rate_;

      rate_multiplier_ = other.rate_multiplier_;

      tx_rate_avg_ = other.tx_rate_avg_;

      tx_error_rate_avg_ = other.tx_error_rate_avg_;

      tx_message_count_ = other.tx_message_count_;

      tx_buffer_overruns_ = other.tx_buffer_overruns_;

      rx_rate_avg_ = other.rx_rate_avg_;

      rx_message_count_ = other.rx_message_count_;

      rx_message_lost_count_ = other.rx_message_lost_count_;

      rx_buffer_overruns_ = other.rx_buffer_overruns_;

      rx_parse_errors_ = other.rx_parse_errors_;

      rx_packet_drop_count_ = other.rx_packet_drop_count_;

      rx_message_lost_rate_ = other.rx_message_lost_rate_;

      heartbeat_type_antenna_tracker_ = other.heartbeat_type_antenna_tracker_;

      heartbeat_type_gcs_ = other.heartbeat_type_gcs_;

      heartbeat_type_onboard_controller_ = other.heartbeat_type_onboard_controller_;

      heartbeat_type_gimbal_ = other.heartbeat_type_gimbal_;

      heartbeat_type_adsb_ = other.heartbeat_type_adsb_;

      heartbeat_type_camera_ = other.heartbeat_type_camera_;

      heartbeat_type_parachute_ = other.heartbeat_type_parachute_;

      heartbeat_type_open_drone_id_ = other.heartbeat_type_open_drone_id_;

      heartbeat_component_telemetry_radio_ = other.heartbeat_component_telemetry_radio_;

      heartbeat_component_log_ = other.heartbeat_component_log_;

      heartbeat_component_osd_ = other.heartbeat_component_osd_;

      heartbeat_component_obstacle_avoidance_ = other.heartbeat_component_obstacle_avoidance_;

      heartbeat_component_vio_ = other.heartbeat_component_vio_;

      heartbeat_component_pairing_manager_ = other.heartbeat_component_pairing_manager_;

      heartbeat_component_udp_bridge_ = other.heartbeat_component_udp_bridge_;

      heartbeat_component_uart_bridge_ = other.heartbeat_component_uart_bridge_;

      avoidance_system_healthy_ = other.avoidance_system_healthy_;

      open_drone_id_system_healthy_ = other.open_drone_id_system_healthy_;

      parachute_system_healthy_ = other.parachute_system_healthy_;

   }

   /**
            * time since system start (microseconds)
            */
   public void setTimestamp(long timestamp)
   {
      timestamp_ = timestamp;
   }
   /**
            * time since system start (microseconds)
            */
   public long getTimestamp()
   {
      return timestamp_;
   }

   /**
            * type of the radio hardware (LINK_TYPE_*)
            */
   public void setType(byte type)
   {
      type_ = type;
   }
   /**
            * type of the radio hardware (LINK_TYPE_*)
            */
   public byte getType()
   {
      return type_;
   }

   public void setMode(byte mode)
   {
      mode_ = mode;
   }
   public byte getMode()
   {
      return mode_;
   }

   public void setFlowControl(boolean flow_control)
   {
      flow_control_ = flow_control;
   }
   public boolean getFlowControl()
   {
      return flow_control_;
   }

   public void setForwarding(boolean forwarding)
   {
      forwarding_ = forwarding;
   }
   public boolean getForwarding()
   {
      return forwarding_;
   }

   public void setMavlinkV2(boolean mavlink_v2)
   {
      mavlink_v2_ = mavlink_v2;
   }
   public boolean getMavlinkV2()
   {
      return mavlink_v2_;
   }

   public void setFtp(boolean ftp)
   {
      ftp_ = ftp;
   }
   public boolean getFtp()
   {
      return ftp_;
   }

   public void setStreams(byte streams)
   {
      streams_ = streams;
   }
   public byte getStreams()
   {
      return streams_;
   }

   /**
            * configured maximum data rate (Bytes/s)
            */
   public void setDataRate(float data_rate)
   {
      data_rate_ = data_rate;
   }
   /**
            * configured maximum data rate (Bytes/s)
            */
   public float getDataRate()
   {
      return data_rate_;
   }

   public void setRateMultiplier(float rate_multiplier)
   {
      rate_multiplier_ = rate_multiplier;
   }
   public float getRateMultiplier()
   {
      return rate_multiplier_;
   }

   /**
            * transmit rate average (Bytes/s)
            */
   public void setTxRateAvg(float tx_rate_avg)
   {
      tx_rate_avg_ = tx_rate_avg;
   }
   /**
            * transmit rate average (Bytes/s)
            */
   public float getTxRateAvg()
   {
      return tx_rate_avg_;
   }

   /**
            * transmit error rate average (Bytes/s)
            */
   public void setTxErrorRateAvg(float tx_error_rate_avg)
   {
      tx_error_rate_avg_ = tx_error_rate_avg;
   }
   /**
            * transmit error rate average (Bytes/s)
            */
   public float getTxErrorRateAvg()
   {
      return tx_error_rate_avg_;
   }

   /**
            * total message sent count
            */
   public void setTxMessageCount(long tx_message_count)
   {
      tx_message_count_ = tx_message_count;
   }
   /**
            * total message sent count
            */
   public long getTxMessageCount()
   {
      return tx_message_count_;
   }

   /**
            * number of TX buffer overruns
            */
   public void setTxBufferOverruns(long tx_buffer_overruns)
   {
      tx_buffer_overruns_ = tx_buffer_overruns;
   }
   /**
            * number of TX buffer overruns
            */
   public long getTxBufferOverruns()
   {
      return tx_buffer_overruns_;
   }

   /**
            * transmit rate average (Bytes/s)
            */
   public void setRxRateAvg(float rx_rate_avg)
   {
      rx_rate_avg_ = rx_rate_avg;
   }
   /**
            * transmit rate average (Bytes/s)
            */
   public float getRxRateAvg()
   {
      return rx_rate_avg_;
   }

   /**
            * count of total messages received
            */
   public void setRxMessageCount(long rx_message_count)
   {
      rx_message_count_ = rx_message_count;
   }
   /**
            * count of total messages received
            */
   public long getRxMessageCount()
   {
      return rx_message_count_;
   }

   public void setRxMessageLostCount(long rx_message_lost_count)
   {
      rx_message_lost_count_ = rx_message_lost_count;
   }
   public long getRxMessageLostCount()
   {
      return rx_message_lost_count_;
   }

   /**
            * number of RX buffer overruns
            */
   public void setRxBufferOverruns(long rx_buffer_overruns)
   {
      rx_buffer_overruns_ = rx_buffer_overruns;
   }
   /**
            * number of RX buffer overruns
            */
   public long getRxBufferOverruns()
   {
      return rx_buffer_overruns_;
   }

   /**
            * number of parse errors
            */
   public void setRxParseErrors(long rx_parse_errors)
   {
      rx_parse_errors_ = rx_parse_errors;
   }
   /**
            * number of parse errors
            */
   public long getRxParseErrors()
   {
      return rx_parse_errors_;
   }

   /**
            * number of packet drops
            */
   public void setRxPacketDropCount(long rx_packet_drop_count)
   {
      rx_packet_drop_count_ = rx_packet_drop_count;
   }
   /**
            * number of packet drops
            */
   public long getRxPacketDropCount()
   {
      return rx_packet_drop_count_;
   }

   public void setRxMessageLostRate(float rx_message_lost_rate)
   {
      rx_message_lost_rate_ = rx_message_lost_rate;
   }
   public float getRxMessageLostRate()
   {
      return rx_message_lost_rate_;
   }

   /**
            * Heartbeats per type
            * MAV_TYPE_ANTENNA_TRACKER
            */
   public void setHeartbeatTypeAntennaTracker(boolean heartbeat_type_antenna_tracker)
   {
      heartbeat_type_antenna_tracker_ = heartbeat_type_antenna_tracker;
   }
   /**
            * Heartbeats per type
            * MAV_TYPE_ANTENNA_TRACKER
            */
   public boolean getHeartbeatTypeAntennaTracker()
   {
      return heartbeat_type_antenna_tracker_;
   }

   /**
            * MAV_TYPE_GCS
            */
   public void setHeartbeatTypeGcs(boolean heartbeat_type_gcs)
   {
      heartbeat_type_gcs_ = heartbeat_type_gcs;
   }
   /**
            * MAV_TYPE_GCS
            */
   public boolean getHeartbeatTypeGcs()
   {
      return heartbeat_type_gcs_;
   }

   /**
            * MAV_TYPE_ONBOARD_CONTROLLER
            */
   public void setHeartbeatTypeOnboardController(boolean heartbeat_type_onboard_controller)
   {
      heartbeat_type_onboard_controller_ = heartbeat_type_onboard_controller;
   }
   /**
            * MAV_TYPE_ONBOARD_CONTROLLER
            */
   public boolean getHeartbeatTypeOnboardController()
   {
      return heartbeat_type_onboard_controller_;
   }

   /**
            * MAV_TYPE_GIMBAL
            */
   public void setHeartbeatTypeGimbal(boolean heartbeat_type_gimbal)
   {
      heartbeat_type_gimbal_ = heartbeat_type_gimbal;
   }
   /**
            * MAV_TYPE_GIMBAL
            */
   public boolean getHeartbeatTypeGimbal()
   {
      return heartbeat_type_gimbal_;
   }

   /**
            * MAV_TYPE_ADSB
            */
   public void setHeartbeatTypeAdsb(boolean heartbeat_type_adsb)
   {
      heartbeat_type_adsb_ = heartbeat_type_adsb;
   }
   /**
            * MAV_TYPE_ADSB
            */
   public boolean getHeartbeatTypeAdsb()
   {
      return heartbeat_type_adsb_;
   }

   /**
            * MAV_TYPE_CAMERA
            */
   public void setHeartbeatTypeCamera(boolean heartbeat_type_camera)
   {
      heartbeat_type_camera_ = heartbeat_type_camera;
   }
   /**
            * MAV_TYPE_CAMERA
            */
   public boolean getHeartbeatTypeCamera()
   {
      return heartbeat_type_camera_;
   }

   /**
            * MAV_TYPE_PARACHUTE
            */
   public void setHeartbeatTypeParachute(boolean heartbeat_type_parachute)
   {
      heartbeat_type_parachute_ = heartbeat_type_parachute;
   }
   /**
            * MAV_TYPE_PARACHUTE
            */
   public boolean getHeartbeatTypeParachute()
   {
      return heartbeat_type_parachute_;
   }

   /**
            * MAV_TYPE_ODID
            */
   public void setHeartbeatTypeOpenDroneId(boolean heartbeat_type_open_drone_id)
   {
      heartbeat_type_open_drone_id_ = heartbeat_type_open_drone_id;
   }
   /**
            * MAV_TYPE_ODID
            */
   public boolean getHeartbeatTypeOpenDroneId()
   {
      return heartbeat_type_open_drone_id_;
   }

   /**
            * Heartbeats per component
            * MAV_COMP_ID_TELEMETRY_RADIO
            */
   public void setHeartbeatComponentTelemetryRadio(boolean heartbeat_component_telemetry_radio)
   {
      heartbeat_component_telemetry_radio_ = heartbeat_component_telemetry_radio;
   }
   /**
            * Heartbeats per component
            * MAV_COMP_ID_TELEMETRY_RADIO
            */
   public boolean getHeartbeatComponentTelemetryRadio()
   {
      return heartbeat_component_telemetry_radio_;
   }

   /**
            * MAV_COMP_ID_LOG
            */
   public void setHeartbeatComponentLog(boolean heartbeat_component_log)
   {
      heartbeat_component_log_ = heartbeat_component_log;
   }
   /**
            * MAV_COMP_ID_LOG
            */
   public boolean getHeartbeatComponentLog()
   {
      return heartbeat_component_log_;
   }

   /**
            * MAV_COMP_ID_OSD
            */
   public void setHeartbeatComponentOsd(boolean heartbeat_component_osd)
   {
      heartbeat_component_osd_ = heartbeat_component_osd;
   }
   /**
            * MAV_COMP_ID_OSD
            */
   public boolean getHeartbeatComponentOsd()
   {
      return heartbeat_component_osd_;
   }

   /**
            * MAV_COMP_ID_OBSTACLE_AVOIDANCE
            */
   public void setHeartbeatComponentObstacleAvoidance(boolean heartbeat_component_obstacle_avoidance)
   {
      heartbeat_component_obstacle_avoidance_ = heartbeat_component_obstacle_avoidance;
   }
   /**
            * MAV_COMP_ID_OBSTACLE_AVOIDANCE
            */
   public boolean getHeartbeatComponentObstacleAvoidance()
   {
      return heartbeat_component_obstacle_avoidance_;
   }

   /**
            * MAV_COMP_ID_VISUAL_INERTIAL_ODOMETRY
            */
   public void setHeartbeatComponentVio(boolean heartbeat_component_vio)
   {
      heartbeat_component_vio_ = heartbeat_component_vio;
   }
   /**
            * MAV_COMP_ID_VISUAL_INERTIAL_ODOMETRY
            */
   public boolean getHeartbeatComponentVio()
   {
      return heartbeat_component_vio_;
   }

   /**
            * MAV_COMP_ID_PAIRING_MANAGER
            */
   public void setHeartbeatComponentPairingManager(boolean heartbeat_component_pairing_manager)
   {
      heartbeat_component_pairing_manager_ = heartbeat_component_pairing_manager;
   }
   /**
            * MAV_COMP_ID_PAIRING_MANAGER
            */
   public boolean getHeartbeatComponentPairingManager()
   {
      return heartbeat_component_pairing_manager_;
   }

   /**
            * MAV_COMP_ID_UDP_BRIDGE
            */
   public void setHeartbeatComponentUdpBridge(boolean heartbeat_component_udp_bridge)
   {
      heartbeat_component_udp_bridge_ = heartbeat_component_udp_bridge;
   }
   /**
            * MAV_COMP_ID_UDP_BRIDGE
            */
   public boolean getHeartbeatComponentUdpBridge()
   {
      return heartbeat_component_udp_bridge_;
   }

   /**
            * MAV_COMP_ID_UART_BRIDGE
            */
   public void setHeartbeatComponentUartBridge(boolean heartbeat_component_uart_bridge)
   {
      heartbeat_component_uart_bridge_ = heartbeat_component_uart_bridge;
   }
   /**
            * MAV_COMP_ID_UART_BRIDGE
            */
   public boolean getHeartbeatComponentUartBridge()
   {
      return heartbeat_component_uart_bridge_;
   }

   /**
            * Misc component health
            */
   public void setAvoidanceSystemHealthy(boolean avoidance_system_healthy)
   {
      avoidance_system_healthy_ = avoidance_system_healthy;
   }
   /**
            * Misc component health
            */
   public boolean getAvoidanceSystemHealthy()
   {
      return avoidance_system_healthy_;
   }

   public void setOpenDroneIdSystemHealthy(boolean open_drone_id_system_healthy)
   {
      open_drone_id_system_healthy_ = open_drone_id_system_healthy;
   }
   public boolean getOpenDroneIdSystemHealthy()
   {
      return open_drone_id_system_healthy_;
   }

   public void setParachuteSystemHealthy(boolean parachute_system_healthy)
   {
      parachute_system_healthy_ = parachute_system_healthy;
   }
   public boolean getParachuteSystemHealthy()
   {
      return parachute_system_healthy_;
   }


   public static Supplier<TelemetryStatusPubSubType> getPubSubType()
   {
      return TelemetryStatusPubSubType::new;
   }

   @Override
   public Supplier<TopicDataType> getPubSubTypePacket()
   {
      return TelemetryStatusPubSubType::new;
   }

   @Override
   public boolean epsilonEquals(TelemetryStatus other, double epsilon)
   {
      if(other == null) return false;
      if(other == this) return true;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_, other.timestamp_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.type_, other.type_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.mode_, other.mode_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.flow_control_, other.flow_control_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.forwarding_, other.forwarding_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.mavlink_v2_, other.mavlink_v2_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.ftp_, other.ftp_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.streams_, other.streams_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.data_rate_, other.data_rate_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.rate_multiplier_, other.rate_multiplier_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.tx_rate_avg_, other.tx_rate_avg_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.tx_error_rate_avg_, other.tx_error_rate_avg_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.tx_message_count_, other.tx_message_count_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.tx_buffer_overruns_, other.tx_buffer_overruns_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.rx_rate_avg_, other.rx_rate_avg_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.rx_message_count_, other.rx_message_count_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.rx_message_lost_count_, other.rx_message_lost_count_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.rx_buffer_overruns_, other.rx_buffer_overruns_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.rx_parse_errors_, other.rx_parse_errors_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.rx_packet_drop_count_, other.rx_packet_drop_count_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.rx_message_lost_rate_, other.rx_message_lost_rate_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.heartbeat_type_antenna_tracker_, other.heartbeat_type_antenna_tracker_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.heartbeat_type_gcs_, other.heartbeat_type_gcs_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.heartbeat_type_onboard_controller_, other.heartbeat_type_onboard_controller_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.heartbeat_type_gimbal_, other.heartbeat_type_gimbal_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.heartbeat_type_adsb_, other.heartbeat_type_adsb_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.heartbeat_type_camera_, other.heartbeat_type_camera_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.heartbeat_type_parachute_, other.heartbeat_type_parachute_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.heartbeat_type_open_drone_id_, other.heartbeat_type_open_drone_id_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.heartbeat_component_telemetry_radio_, other.heartbeat_component_telemetry_radio_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.heartbeat_component_log_, other.heartbeat_component_log_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.heartbeat_component_osd_, other.heartbeat_component_osd_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.heartbeat_component_obstacle_avoidance_, other.heartbeat_component_obstacle_avoidance_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.heartbeat_component_vio_, other.heartbeat_component_vio_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.heartbeat_component_pairing_manager_, other.heartbeat_component_pairing_manager_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.heartbeat_component_udp_bridge_, other.heartbeat_component_udp_bridge_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.heartbeat_component_uart_bridge_, other.heartbeat_component_uart_bridge_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.avoidance_system_healthy_, other.avoidance_system_healthy_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.open_drone_id_system_healthy_, other.open_drone_id_system_healthy_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.parachute_system_healthy_, other.parachute_system_healthy_, epsilon)) return false;


      return true;
   }

   @Override
   public boolean equals(Object other)
   {
      if(other == null) return false;
      if(other == this) return true;
      if(!(other instanceof TelemetryStatus)) return false;

      TelemetryStatus otherMyClass = (TelemetryStatus) other;

      if(this.timestamp_ != otherMyClass.timestamp_) return false;

      if(this.type_ != otherMyClass.type_) return false;

      if(this.mode_ != otherMyClass.mode_) return false;

      if(this.flow_control_ != otherMyClass.flow_control_) return false;

      if(this.forwarding_ != otherMyClass.forwarding_) return false;

      if(this.mavlink_v2_ != otherMyClass.mavlink_v2_) return false;

      if(this.ftp_ != otherMyClass.ftp_) return false;

      if(this.streams_ != otherMyClass.streams_) return false;

      if(this.data_rate_ != otherMyClass.data_rate_) return false;

      if(this.rate_multiplier_ != otherMyClass.rate_multiplier_) return false;

      if(this.tx_rate_avg_ != otherMyClass.tx_rate_avg_) return false;

      if(this.tx_error_rate_avg_ != otherMyClass.tx_error_rate_avg_) return false;

      if(this.tx_message_count_ != otherMyClass.tx_message_count_) return false;

      if(this.tx_buffer_overruns_ != otherMyClass.tx_buffer_overruns_) return false;

      if(this.rx_rate_avg_ != otherMyClass.rx_rate_avg_) return false;

      if(this.rx_message_count_ != otherMyClass.rx_message_count_) return false;

      if(this.rx_message_lost_count_ != otherMyClass.rx_message_lost_count_) return false;

      if(this.rx_buffer_overruns_ != otherMyClass.rx_buffer_overruns_) return false;

      if(this.rx_parse_errors_ != otherMyClass.rx_parse_errors_) return false;

      if(this.rx_packet_drop_count_ != otherMyClass.rx_packet_drop_count_) return false;

      if(this.rx_message_lost_rate_ != otherMyClass.rx_message_lost_rate_) return false;

      if(this.heartbeat_type_antenna_tracker_ != otherMyClass.heartbeat_type_antenna_tracker_) return false;

      if(this.heartbeat_type_gcs_ != otherMyClass.heartbeat_type_gcs_) return false;

      if(this.heartbeat_type_onboard_controller_ != otherMyClass.heartbeat_type_onboard_controller_) return false;

      if(this.heartbeat_type_gimbal_ != otherMyClass.heartbeat_type_gimbal_) return false;

      if(this.heartbeat_type_adsb_ != otherMyClass.heartbeat_type_adsb_) return false;

      if(this.heartbeat_type_camera_ != otherMyClass.heartbeat_type_camera_) return false;

      if(this.heartbeat_type_parachute_ != otherMyClass.heartbeat_type_parachute_) return false;

      if(this.heartbeat_type_open_drone_id_ != otherMyClass.heartbeat_type_open_drone_id_) return false;

      if(this.heartbeat_component_telemetry_radio_ != otherMyClass.heartbeat_component_telemetry_radio_) return false;

      if(this.heartbeat_component_log_ != otherMyClass.heartbeat_component_log_) return false;

      if(this.heartbeat_component_osd_ != otherMyClass.heartbeat_component_osd_) return false;

      if(this.heartbeat_component_obstacle_avoidance_ != otherMyClass.heartbeat_component_obstacle_avoidance_) return false;

      if(this.heartbeat_component_vio_ != otherMyClass.heartbeat_component_vio_) return false;

      if(this.heartbeat_component_pairing_manager_ != otherMyClass.heartbeat_component_pairing_manager_) return false;

      if(this.heartbeat_component_udp_bridge_ != otherMyClass.heartbeat_component_udp_bridge_) return false;

      if(this.heartbeat_component_uart_bridge_ != otherMyClass.heartbeat_component_uart_bridge_) return false;

      if(this.avoidance_system_healthy_ != otherMyClass.avoidance_system_healthy_) return false;

      if(this.open_drone_id_system_healthy_ != otherMyClass.open_drone_id_system_healthy_) return false;

      if(this.parachute_system_healthy_ != otherMyClass.parachute_system_healthy_) return false;


      return true;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("TelemetryStatus {");
      builder.append("timestamp=");
      builder.append(this.timestamp_);      builder.append(", ");
      builder.append("type=");
      builder.append(this.type_);      builder.append(", ");
      builder.append("mode=");
      builder.append(this.mode_);      builder.append(", ");
      builder.append("flow_control=");
      builder.append(this.flow_control_);      builder.append(", ");
      builder.append("forwarding=");
      builder.append(this.forwarding_);      builder.append(", ");
      builder.append("mavlink_v2=");
      builder.append(this.mavlink_v2_);      builder.append(", ");
      builder.append("ftp=");
      builder.append(this.ftp_);      builder.append(", ");
      builder.append("streams=");
      builder.append(this.streams_);      builder.append(", ");
      builder.append("data_rate=");
      builder.append(this.data_rate_);      builder.append(", ");
      builder.append("rate_multiplier=");
      builder.append(this.rate_multiplier_);      builder.append(", ");
      builder.append("tx_rate_avg=");
      builder.append(this.tx_rate_avg_);      builder.append(", ");
      builder.append("tx_error_rate_avg=");
      builder.append(this.tx_error_rate_avg_);      builder.append(", ");
      builder.append("tx_message_count=");
      builder.append(this.tx_message_count_);      builder.append(", ");
      builder.append("tx_buffer_overruns=");
      builder.append(this.tx_buffer_overruns_);      builder.append(", ");
      builder.append("rx_rate_avg=");
      builder.append(this.rx_rate_avg_);      builder.append(", ");
      builder.append("rx_message_count=");
      builder.append(this.rx_message_count_);      builder.append(", ");
      builder.append("rx_message_lost_count=");
      builder.append(this.rx_message_lost_count_);      builder.append(", ");
      builder.append("rx_buffer_overruns=");
      builder.append(this.rx_buffer_overruns_);      builder.append(", ");
      builder.append("rx_parse_errors=");
      builder.append(this.rx_parse_errors_);      builder.append(", ");
      builder.append("rx_packet_drop_count=");
      builder.append(this.rx_packet_drop_count_);      builder.append(", ");
      builder.append("rx_message_lost_rate=");
      builder.append(this.rx_message_lost_rate_);      builder.append(", ");
      builder.append("heartbeat_type_antenna_tracker=");
      builder.append(this.heartbeat_type_antenna_tracker_);      builder.append(", ");
      builder.append("heartbeat_type_gcs=");
      builder.append(this.heartbeat_type_gcs_);      builder.append(", ");
      builder.append("heartbeat_type_onboard_controller=");
      builder.append(this.heartbeat_type_onboard_controller_);      builder.append(", ");
      builder.append("heartbeat_type_gimbal=");
      builder.append(this.heartbeat_type_gimbal_);      builder.append(", ");
      builder.append("heartbeat_type_adsb=");
      builder.append(this.heartbeat_type_adsb_);      builder.append(", ");
      builder.append("heartbeat_type_camera=");
      builder.append(this.heartbeat_type_camera_);      builder.append(", ");
      builder.append("heartbeat_type_parachute=");
      builder.append(this.heartbeat_type_parachute_);      builder.append(", ");
      builder.append("heartbeat_type_open_drone_id=");
      builder.append(this.heartbeat_type_open_drone_id_);      builder.append(", ");
      builder.append("heartbeat_component_telemetry_radio=");
      builder.append(this.heartbeat_component_telemetry_radio_);      builder.append(", ");
      builder.append("heartbeat_component_log=");
      builder.append(this.heartbeat_component_log_);      builder.append(", ");
      builder.append("heartbeat_component_osd=");
      builder.append(this.heartbeat_component_osd_);      builder.append(", ");
      builder.append("heartbeat_component_obstacle_avoidance=");
      builder.append(this.heartbeat_component_obstacle_avoidance_);      builder.append(", ");
      builder.append("heartbeat_component_vio=");
      builder.append(this.heartbeat_component_vio_);      builder.append(", ");
      builder.append("heartbeat_component_pairing_manager=");
      builder.append(this.heartbeat_component_pairing_manager_);      builder.append(", ");
      builder.append("heartbeat_component_udp_bridge=");
      builder.append(this.heartbeat_component_udp_bridge_);      builder.append(", ");
      builder.append("heartbeat_component_uart_bridge=");
      builder.append(this.heartbeat_component_uart_bridge_);      builder.append(", ");
      builder.append("avoidance_system_healthy=");
      builder.append(this.avoidance_system_healthy_);      builder.append(", ");
      builder.append("open_drone_id_system_healthy=");
      builder.append(this.open_drone_id_system_healthy_);      builder.append(", ");
      builder.append("parachute_system_healthy=");
      builder.append(this.parachute_system_healthy_);
      builder.append("}");
      return builder.toString();
   }
}
