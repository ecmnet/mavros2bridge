package px4_msgs.msg.dds;

/**
* 
* Topic data type of the struct "EstimatorGpsStatus" defined in "EstimatorGpsStatus_.idl". Use this class to provide the TopicDataType to a Participant. 
*
* This file was automatically generated from EstimatorGpsStatus_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit EstimatorGpsStatus_.idl instead.
*
*/
public class EstimatorGpsStatusPubSubType implements us.ihmc.pubsub.TopicDataType<px4_msgs.msg.dds.EstimatorGpsStatus>
{
   public static final java.lang.String name = "px4_msgs::msg::dds_::EstimatorGpsStatus_";
   
   @Override
   public final java.lang.String getDefinitionChecksum()
   {
   		return "58c88348f2b209544d32f607bae38bb895a987d12c50fabec3aa953d5eac9a1f";
   }
   
   @Override
   public final java.lang.String getDefinitionVersion()
   {
   		return "";
   }

   private final us.ihmc.idl.CDR serializeCDR = new us.ihmc.idl.CDR();
   private final us.ihmc.idl.CDR deserializeCDR = new us.ihmc.idl.CDR();

   @Override
   public void serialize(px4_msgs.msg.dds.EstimatorGpsStatus data, us.ihmc.pubsub.common.SerializedPayload serializedPayload) throws java.io.IOException
   {
      serializeCDR.serialize(serializedPayload);
      write(data, serializeCDR);
      serializeCDR.finishSerialize();
   }

   @Override
   public void deserialize(us.ihmc.pubsub.common.SerializedPayload serializedPayload, px4_msgs.msg.dds.EstimatorGpsStatus data) throws java.io.IOException
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

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      return current_alignment - initial_alignment;
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.EstimatorGpsStatus data)
   {
      return getCdrSerializedSize(data, 0);
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.EstimatorGpsStatus data, int current_alignment)
   {
      int initial_alignment = current_alignment;

      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


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


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);



      return current_alignment - initial_alignment;
   }

   public static void write(px4_msgs.msg.dds.EstimatorGpsStatus data, us.ihmc.idl.CDR cdr)
   {
      cdr.write_type_12(data.getTimestamp());

      cdr.write_type_12(data.getTimestampSample());

      cdr.write_type_7(data.getChecksPassed());

      cdr.write_type_7(data.getCheckFailGpsFix());

      cdr.write_type_7(data.getCheckFailMinSatCount());

      cdr.write_type_7(data.getCheckFailMaxPdop());

      cdr.write_type_7(data.getCheckFailMaxHorzErr());

      cdr.write_type_7(data.getCheckFailMaxVertErr());

      cdr.write_type_7(data.getCheckFailMaxSpdErr());

      cdr.write_type_7(data.getCheckFailMaxHorzDrift());

      cdr.write_type_7(data.getCheckFailMaxVertDrift());

      cdr.write_type_7(data.getCheckFailMaxHorzSpdErr());

      cdr.write_type_7(data.getCheckFailMaxVertSpdErr());

      cdr.write_type_7(data.getCheckFailSpoofedGps());

      cdr.write_type_5(data.getPositionDriftRateHorizontalMS());

      cdr.write_type_5(data.getPositionDriftRateVerticalMS());

      cdr.write_type_5(data.getFilteredHorizontalSpeedMS());

   }

   public static void read(px4_msgs.msg.dds.EstimatorGpsStatus data, us.ihmc.idl.CDR cdr)
   {
      data.setTimestamp(cdr.read_type_12());
      	
      data.setTimestampSample(cdr.read_type_12());
      	
      data.setChecksPassed(cdr.read_type_7());
      	
      data.setCheckFailGpsFix(cdr.read_type_7());
      	
      data.setCheckFailMinSatCount(cdr.read_type_7());
      	
      data.setCheckFailMaxPdop(cdr.read_type_7());
      	
      data.setCheckFailMaxHorzErr(cdr.read_type_7());
      	
      data.setCheckFailMaxVertErr(cdr.read_type_7());
      	
      data.setCheckFailMaxSpdErr(cdr.read_type_7());
      	
      data.setCheckFailMaxHorzDrift(cdr.read_type_7());
      	
      data.setCheckFailMaxVertDrift(cdr.read_type_7());
      	
      data.setCheckFailMaxHorzSpdErr(cdr.read_type_7());
      	
      data.setCheckFailMaxVertSpdErr(cdr.read_type_7());
      	
      data.setCheckFailSpoofedGps(cdr.read_type_7());
      	
      data.setPositionDriftRateHorizontalMS(cdr.read_type_5());
      	
      data.setPositionDriftRateVerticalMS(cdr.read_type_5());
      	
      data.setFilteredHorizontalSpeedMS(cdr.read_type_5());
      	

   }

   @Override
   public final void serialize(px4_msgs.msg.dds.EstimatorGpsStatus data, us.ihmc.idl.InterchangeSerializer ser)
   {
      ser.write_type_12("timestamp", data.getTimestamp());
      ser.write_type_12("timestamp_sample", data.getTimestampSample());
      ser.write_type_7("checks_passed", data.getChecksPassed());
      ser.write_type_7("check_fail_gps_fix", data.getCheckFailGpsFix());
      ser.write_type_7("check_fail_min_sat_count", data.getCheckFailMinSatCount());
      ser.write_type_7("check_fail_max_pdop", data.getCheckFailMaxPdop());
      ser.write_type_7("check_fail_max_horz_err", data.getCheckFailMaxHorzErr());
      ser.write_type_7("check_fail_max_vert_err", data.getCheckFailMaxVertErr());
      ser.write_type_7("check_fail_max_spd_err", data.getCheckFailMaxSpdErr());
      ser.write_type_7("check_fail_max_horz_drift", data.getCheckFailMaxHorzDrift());
      ser.write_type_7("check_fail_max_vert_drift", data.getCheckFailMaxVertDrift());
      ser.write_type_7("check_fail_max_horz_spd_err", data.getCheckFailMaxHorzSpdErr());
      ser.write_type_7("check_fail_max_vert_spd_err", data.getCheckFailMaxVertSpdErr());
      ser.write_type_7("check_fail_spoofed_gps", data.getCheckFailSpoofedGps());
      ser.write_type_5("position_drift_rate_horizontal_m_s", data.getPositionDriftRateHorizontalMS());
      ser.write_type_5("position_drift_rate_vertical_m_s", data.getPositionDriftRateVerticalMS());
      ser.write_type_5("filtered_horizontal_speed_m_s", data.getFilteredHorizontalSpeedMS());
   }

   @Override
   public final void deserialize(us.ihmc.idl.InterchangeSerializer ser, px4_msgs.msg.dds.EstimatorGpsStatus data)
   {
      data.setTimestamp(ser.read_type_12("timestamp"));
      data.setTimestampSample(ser.read_type_12("timestamp_sample"));
      data.setChecksPassed(ser.read_type_7("checks_passed"));
      data.setCheckFailGpsFix(ser.read_type_7("check_fail_gps_fix"));
      data.setCheckFailMinSatCount(ser.read_type_7("check_fail_min_sat_count"));
      data.setCheckFailMaxPdop(ser.read_type_7("check_fail_max_pdop"));
      data.setCheckFailMaxHorzErr(ser.read_type_7("check_fail_max_horz_err"));
      data.setCheckFailMaxVertErr(ser.read_type_7("check_fail_max_vert_err"));
      data.setCheckFailMaxSpdErr(ser.read_type_7("check_fail_max_spd_err"));
      data.setCheckFailMaxHorzDrift(ser.read_type_7("check_fail_max_horz_drift"));
      data.setCheckFailMaxVertDrift(ser.read_type_7("check_fail_max_vert_drift"));
      data.setCheckFailMaxHorzSpdErr(ser.read_type_7("check_fail_max_horz_spd_err"));
      data.setCheckFailMaxVertSpdErr(ser.read_type_7("check_fail_max_vert_spd_err"));
      data.setCheckFailSpoofedGps(ser.read_type_7("check_fail_spoofed_gps"));
      data.setPositionDriftRateHorizontalMS(ser.read_type_5("position_drift_rate_horizontal_m_s"));
      data.setPositionDriftRateVerticalMS(ser.read_type_5("position_drift_rate_vertical_m_s"));
      data.setFilteredHorizontalSpeedMS(ser.read_type_5("filtered_horizontal_speed_m_s"));
   }

   public static void staticCopy(px4_msgs.msg.dds.EstimatorGpsStatus src, px4_msgs.msg.dds.EstimatorGpsStatus dest)
   {
      dest.set(src);
   }

   @Override
   public px4_msgs.msg.dds.EstimatorGpsStatus createData()
   {
      return new px4_msgs.msg.dds.EstimatorGpsStatus();
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
   
   public void serialize(px4_msgs.msg.dds.EstimatorGpsStatus data, us.ihmc.idl.CDR cdr)
   {
      write(data, cdr);
   }

   public void deserialize(px4_msgs.msg.dds.EstimatorGpsStatus data, us.ihmc.idl.CDR cdr)
   {
      read(data, cdr);
   }
   
   public void copy(px4_msgs.msg.dds.EstimatorGpsStatus src, px4_msgs.msg.dds.EstimatorGpsStatus dest)
   {
      staticCopy(src, dest);
   }

   @Override
   public EstimatorGpsStatusPubSubType newInstance()
   {
      return new EstimatorGpsStatusPubSubType();
   }
}
