package px4_msgs.msg.dds;

/**
* 
* Topic data type of the struct "SensorGps" defined in "SensorGps_.idl". Use this class to provide the TopicDataType to a Participant. 
*
* This file was automatically generated from SensorGps_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit SensorGps_.idl instead.
*
*/
public class SensorGpsPubSubType implements us.ihmc.pubsub.TopicDataType<px4_msgs.msg.dds.SensorGps>
{
   public static final java.lang.String name = "px4_msgs::msg::dds_::SensorGps_";
   
   @Override
   public final java.lang.String getDefinitionChecksum()
   {
   		return "641e1b124f1fce894d606e29217b249c27f32138a3fc5ef326653ba1590b2329";
   }
   
   @Override
   public final java.lang.String getDefinitionVersion()
   {
   		return "";
   }

   private final us.ihmc.idl.CDR serializeCDR = new us.ihmc.idl.CDR();
   private final us.ihmc.idl.CDR deserializeCDR = new us.ihmc.idl.CDR();

   @Override
   public void serialize(px4_msgs.msg.dds.SensorGps data, us.ihmc.pubsub.common.SerializedPayload serializedPayload) throws java.io.IOException
   {
      serializeCDR.serialize(serializedPayload);
      write(data, serializeCDR);
      serializeCDR.finishSerialize();
   }

   @Override
   public void deserialize(us.ihmc.pubsub.common.SerializedPayload serializedPayload, px4_msgs.msg.dds.SensorGps data) throws java.io.IOException
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

      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);

      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);

      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);

      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 2 + us.ihmc.idl.CDR.alignment(current_alignment, 2);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      return current_alignment - initial_alignment;
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.SensorGps data)
   {
      return getCdrSerializedSize(data, 0);
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.SensorGps data, int current_alignment)
   {
      int initial_alignment = current_alignment;

      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 2 + us.ihmc.idl.CDR.alignment(current_alignment, 2);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);



      return current_alignment - initial_alignment;
   }

   public static void write(px4_msgs.msg.dds.SensorGps data, us.ihmc.idl.CDR cdr)
   {
      cdr.write_type_12(data.getTimestamp());

      cdr.write_type_12(data.getTimestampSample());

      cdr.write_type_4(data.getDeviceId());

      cdr.write_type_6(data.getLatitudeDeg());

      cdr.write_type_6(data.getLongitudeDeg());

      cdr.write_type_6(data.getAltitudeMslM());

      cdr.write_type_6(data.getAltitudeEllipsoidM());

      cdr.write_type_5(data.getSVarianceMS());

      cdr.write_type_5(data.getCVarianceRad());

      cdr.write_type_9(data.getFixType());

      cdr.write_type_5(data.getEph());

      cdr.write_type_5(data.getEpv());

      cdr.write_type_5(data.getHdop());

      cdr.write_type_5(data.getVdop());

      cdr.write_type_2(data.getNoisePerMs());

      cdr.write_type_3(data.getAutomaticGainControl());

      cdr.write_type_9(data.getJammingState());

      cdr.write_type_2(data.getJammingIndicator());

      cdr.write_type_9(data.getSpoofingState());

      cdr.write_type_5(data.getVelMS());

      cdr.write_type_5(data.getVelNMS());

      cdr.write_type_5(data.getVelEMS());

      cdr.write_type_5(data.getVelDMS());

      cdr.write_type_5(data.getCogRad());

      cdr.write_type_7(data.getVelNedValid());

      cdr.write_type_2(data.getTimestampTimeRelative());

      cdr.write_type_12(data.getTimeUtcUsec());

      cdr.write_type_9(data.getSatellitesUsed());

      cdr.write_type_5(data.getHeading());

      cdr.write_type_5(data.getHeadingOffset());

      cdr.write_type_5(data.getHeadingAccuracy());

      cdr.write_type_5(data.getRtcmInjectionRate());

      cdr.write_type_9(data.getSelectedRtcmInstance());

      cdr.write_type_7(data.getRtcmCrcFailed());

      cdr.write_type_9(data.getRtcmMsgUsed());

   }

   public static void read(px4_msgs.msg.dds.SensorGps data, us.ihmc.idl.CDR cdr)
   {
      data.setTimestamp(cdr.read_type_12());
      	
      data.setTimestampSample(cdr.read_type_12());
      	
      data.setDeviceId(cdr.read_type_4());
      	
      data.setLatitudeDeg(cdr.read_type_6());
      	
      data.setLongitudeDeg(cdr.read_type_6());
      	
      data.setAltitudeMslM(cdr.read_type_6());
      	
      data.setAltitudeEllipsoidM(cdr.read_type_6());
      	
      data.setSVarianceMS(cdr.read_type_5());
      	
      data.setCVarianceRad(cdr.read_type_5());
      	
      data.setFixType(cdr.read_type_9());
      	
      data.setEph(cdr.read_type_5());
      	
      data.setEpv(cdr.read_type_5());
      	
      data.setHdop(cdr.read_type_5());
      	
      data.setVdop(cdr.read_type_5());
      	
      data.setNoisePerMs(cdr.read_type_2());
      	
      data.setAutomaticGainControl(cdr.read_type_3());
      	
      data.setJammingState(cdr.read_type_9());
      	
      data.setJammingIndicator(cdr.read_type_2());
      	
      data.setSpoofingState(cdr.read_type_9());
      	
      data.setVelMS(cdr.read_type_5());
      	
      data.setVelNMS(cdr.read_type_5());
      	
      data.setVelEMS(cdr.read_type_5());
      	
      data.setVelDMS(cdr.read_type_5());
      	
      data.setCogRad(cdr.read_type_5());
      	
      data.setVelNedValid(cdr.read_type_7());
      	
      data.setTimestampTimeRelative(cdr.read_type_2());
      	
      data.setTimeUtcUsec(cdr.read_type_12());
      	
      data.setSatellitesUsed(cdr.read_type_9());
      	
      data.setHeading(cdr.read_type_5());
      	
      data.setHeadingOffset(cdr.read_type_5());
      	
      data.setHeadingAccuracy(cdr.read_type_5());
      	
      data.setRtcmInjectionRate(cdr.read_type_5());
      	
      data.setSelectedRtcmInstance(cdr.read_type_9());
      	
      data.setRtcmCrcFailed(cdr.read_type_7());
      	
      data.setRtcmMsgUsed(cdr.read_type_9());
      	

   }

   @Override
   public final void serialize(px4_msgs.msg.dds.SensorGps data, us.ihmc.idl.InterchangeSerializer ser)
   {
      ser.write_type_12("timestamp", data.getTimestamp());
      ser.write_type_12("timestamp_sample", data.getTimestampSample());
      ser.write_type_4("device_id", data.getDeviceId());
      ser.write_type_6("latitude_deg", data.getLatitudeDeg());
      ser.write_type_6("longitude_deg", data.getLongitudeDeg());
      ser.write_type_6("altitude_msl_m", data.getAltitudeMslM());
      ser.write_type_6("altitude_ellipsoid_m", data.getAltitudeEllipsoidM());
      ser.write_type_5("s_variance_m_s", data.getSVarianceMS());
      ser.write_type_5("c_variance_rad", data.getCVarianceRad());
      ser.write_type_9("fix_type", data.getFixType());
      ser.write_type_5("eph", data.getEph());
      ser.write_type_5("epv", data.getEpv());
      ser.write_type_5("hdop", data.getHdop());
      ser.write_type_5("vdop", data.getVdop());
      ser.write_type_2("noise_per_ms", data.getNoisePerMs());
      ser.write_type_3("automatic_gain_control", data.getAutomaticGainControl());
      ser.write_type_9("jamming_state", data.getJammingState());
      ser.write_type_2("jamming_indicator", data.getJammingIndicator());
      ser.write_type_9("spoofing_state", data.getSpoofingState());
      ser.write_type_5("vel_m_s", data.getVelMS());
      ser.write_type_5("vel_n_m_s", data.getVelNMS());
      ser.write_type_5("vel_e_m_s", data.getVelEMS());
      ser.write_type_5("vel_d_m_s", data.getVelDMS());
      ser.write_type_5("cog_rad", data.getCogRad());
      ser.write_type_7("vel_ned_valid", data.getVelNedValid());
      ser.write_type_2("timestamp_time_relative", data.getTimestampTimeRelative());
      ser.write_type_12("time_utc_usec", data.getTimeUtcUsec());
      ser.write_type_9("satellites_used", data.getSatellitesUsed());
      ser.write_type_5("heading", data.getHeading());
      ser.write_type_5("heading_offset", data.getHeadingOffset());
      ser.write_type_5("heading_accuracy", data.getHeadingAccuracy());
      ser.write_type_5("rtcm_injection_rate", data.getRtcmInjectionRate());
      ser.write_type_9("selected_rtcm_instance", data.getSelectedRtcmInstance());
      ser.write_type_7("rtcm_crc_failed", data.getRtcmCrcFailed());
      ser.write_type_9("rtcm_msg_used", data.getRtcmMsgUsed());
   }

   @Override
   public final void deserialize(us.ihmc.idl.InterchangeSerializer ser, px4_msgs.msg.dds.SensorGps data)
   {
      data.setTimestamp(ser.read_type_12("timestamp"));
      data.setTimestampSample(ser.read_type_12("timestamp_sample"));
      data.setDeviceId(ser.read_type_4("device_id"));
      data.setLatitudeDeg(ser.read_type_6("latitude_deg"));
      data.setLongitudeDeg(ser.read_type_6("longitude_deg"));
      data.setAltitudeMslM(ser.read_type_6("altitude_msl_m"));
      data.setAltitudeEllipsoidM(ser.read_type_6("altitude_ellipsoid_m"));
      data.setSVarianceMS(ser.read_type_5("s_variance_m_s"));
      data.setCVarianceRad(ser.read_type_5("c_variance_rad"));
      data.setFixType(ser.read_type_9("fix_type"));
      data.setEph(ser.read_type_5("eph"));
      data.setEpv(ser.read_type_5("epv"));
      data.setHdop(ser.read_type_5("hdop"));
      data.setVdop(ser.read_type_5("vdop"));
      data.setNoisePerMs(ser.read_type_2("noise_per_ms"));
      data.setAutomaticGainControl(ser.read_type_3("automatic_gain_control"));
      data.setJammingState(ser.read_type_9("jamming_state"));
      data.setJammingIndicator(ser.read_type_2("jamming_indicator"));
      data.setSpoofingState(ser.read_type_9("spoofing_state"));
      data.setVelMS(ser.read_type_5("vel_m_s"));
      data.setVelNMS(ser.read_type_5("vel_n_m_s"));
      data.setVelEMS(ser.read_type_5("vel_e_m_s"));
      data.setVelDMS(ser.read_type_5("vel_d_m_s"));
      data.setCogRad(ser.read_type_5("cog_rad"));
      data.setVelNedValid(ser.read_type_7("vel_ned_valid"));
      data.setTimestampTimeRelative(ser.read_type_2("timestamp_time_relative"));
      data.setTimeUtcUsec(ser.read_type_12("time_utc_usec"));
      data.setSatellitesUsed(ser.read_type_9("satellites_used"));
      data.setHeading(ser.read_type_5("heading"));
      data.setHeadingOffset(ser.read_type_5("heading_offset"));
      data.setHeadingAccuracy(ser.read_type_5("heading_accuracy"));
      data.setRtcmInjectionRate(ser.read_type_5("rtcm_injection_rate"));
      data.setSelectedRtcmInstance(ser.read_type_9("selected_rtcm_instance"));
      data.setRtcmCrcFailed(ser.read_type_7("rtcm_crc_failed"));
      data.setRtcmMsgUsed(ser.read_type_9("rtcm_msg_used"));
   }

   public static void staticCopy(px4_msgs.msg.dds.SensorGps src, px4_msgs.msg.dds.SensorGps dest)
   {
      dest.set(src);
   }

   @Override
   public px4_msgs.msg.dds.SensorGps createData()
   {
      return new px4_msgs.msg.dds.SensorGps();
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
   
   public void serialize(px4_msgs.msg.dds.SensorGps data, us.ihmc.idl.CDR cdr)
   {
      write(data, cdr);
   }

   public void deserialize(px4_msgs.msg.dds.SensorGps data, us.ihmc.idl.CDR cdr)
   {
      read(data, cdr);
   }
   
   public void copy(px4_msgs.msg.dds.SensorGps src, px4_msgs.msg.dds.SensorGps dest)
   {
      staticCopy(src, dest);
   }

   @Override
   public SensorGpsPubSubType newInstance()
   {
      return new SensorGpsPubSubType();
   }
}
