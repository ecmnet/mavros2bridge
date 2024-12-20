package px4_msgs.msg.dds;

/**
* 
* Topic data type of the struct "EstimatorStatus" defined in "EstimatorStatus_.idl". Use this class to provide the TopicDataType to a Participant. 
*
* This file was automatically generated from EstimatorStatus_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit EstimatorStatus_.idl instead.
*
*/
public class EstimatorStatusPubSubType implements us.ihmc.pubsub.TopicDataType<px4_msgs.msg.dds.EstimatorStatus>
{
   public static final java.lang.String name = "px4_msgs::msg::dds_::EstimatorStatus_";
   
   @Override
   public final java.lang.String getDefinitionChecksum()
   {
   		return "2e1603490ed15c6136e65d1a46a8ab8713cd9c1b89a239143c3b46bdfae13e36";
   }
   
   @Override
   public final java.lang.String getDefinitionVersion()
   {
   		return "";
   }

   private final us.ihmc.idl.CDR serializeCDR = new us.ihmc.idl.CDR();
   private final us.ihmc.idl.CDR deserializeCDR = new us.ihmc.idl.CDR();

   @Override
   public void serialize(px4_msgs.msg.dds.EstimatorStatus data, us.ihmc.pubsub.common.SerializedPayload serializedPayload) throws java.io.IOException
   {
      serializeCDR.serialize(serializedPayload);
      write(data, serializeCDR);
      serializeCDR.finishSerialize();
   }

   @Override
   public void deserialize(us.ihmc.pubsub.common.SerializedPayload serializedPayload, px4_msgs.msg.dds.EstimatorStatus data) throws java.io.IOException
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

      current_alignment += ((3) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 2 + us.ihmc.idl.CDR.alignment(current_alignment, 2);

      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);

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

      current_alignment += 2 + us.ihmc.idl.CDR.alignment(current_alignment, 2);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

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

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      return current_alignment - initial_alignment;
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.EstimatorStatus data)
   {
      return getCdrSerializedSize(data, 0);
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.EstimatorStatus data, int current_alignment)
   {
      int initial_alignment = current_alignment;

      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += ((3) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);
      current_alignment += 2 + us.ihmc.idl.CDR.alignment(current_alignment, 2);


      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


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


      current_alignment += 2 + us.ihmc.idl.CDR.alignment(current_alignment, 2);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


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


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);



      return current_alignment - initial_alignment;
   }

   public static void write(px4_msgs.msg.dds.EstimatorStatus data, us.ihmc.idl.CDR cdr)
   {
      cdr.write_type_12(data.getTimestamp());

      cdr.write_type_12(data.getTimestampSample());

      for(int i0 = 0; i0 < data.getOutputTrackingError().length; ++i0)
      {
        	cdr.write_type_5(data.getOutputTrackingError()[i0]);	
      }

      cdr.write_type_3(data.getGpsCheckFailFlags());

      cdr.write_type_12(data.getControlModeFlags());

      cdr.write_type_4(data.getFilterFaultFlags());

      cdr.write_type_5(data.getPosHorizAccuracy());

      cdr.write_type_5(data.getPosVertAccuracy());

      cdr.write_type_5(data.getHdgTestRatio());

      cdr.write_type_5(data.getVelTestRatio());

      cdr.write_type_5(data.getPosTestRatio());

      cdr.write_type_5(data.getHgtTestRatio());

      cdr.write_type_5(data.getTasTestRatio());

      cdr.write_type_5(data.getHaglTestRatio());

      cdr.write_type_5(data.getBetaTestRatio());

      cdr.write_type_3(data.getSolutionStatusFlags());

      cdr.write_type_9(data.getResetCountVelNe());

      cdr.write_type_9(data.getResetCountVelD());

      cdr.write_type_9(data.getResetCountPosNe());

      cdr.write_type_9(data.getResetCountPodD());

      cdr.write_type_9(data.getResetCountQuat());

      cdr.write_type_5(data.getTimeSlip());

      cdr.write_type_7(data.getPreFltFailInnovHeading());

      cdr.write_type_7(data.getPreFltFailInnovHeight());

      cdr.write_type_7(data.getPreFltFailInnovPosHoriz());

      cdr.write_type_7(data.getPreFltFailInnovVelHoriz());

      cdr.write_type_7(data.getPreFltFailInnovVelVert());

      cdr.write_type_7(data.getPreFltFailMagFieldDisturbed());

      cdr.write_type_4(data.getAccelDeviceId());

      cdr.write_type_4(data.getGyroDeviceId());

      cdr.write_type_4(data.getBaroDeviceId());

      cdr.write_type_4(data.getMagDeviceId());

      cdr.write_type_9(data.getHealthFlags());

      cdr.write_type_9(data.getTimeoutFlags());

      cdr.write_type_5(data.getMagInclinationDeg());

      cdr.write_type_5(data.getMagInclinationRefDeg());

      cdr.write_type_5(data.getMagStrengthGs());

      cdr.write_type_5(data.getMagStrengthRefGs());

   }

   public static void read(px4_msgs.msg.dds.EstimatorStatus data, us.ihmc.idl.CDR cdr)
   {
      data.setTimestamp(cdr.read_type_12());
      	
      data.setTimestampSample(cdr.read_type_12());
      	
      for(int i0 = 0; i0 < data.getOutputTrackingError().length; ++i0)
      {
        	data.getOutputTrackingError()[i0] = cdr.read_type_5();
        	
      }
      	
      data.setGpsCheckFailFlags(cdr.read_type_3());
      	
      data.setControlModeFlags(cdr.read_type_12());
      	
      data.setFilterFaultFlags(cdr.read_type_4());
      	
      data.setPosHorizAccuracy(cdr.read_type_5());
      	
      data.setPosVertAccuracy(cdr.read_type_5());
      	
      data.setHdgTestRatio(cdr.read_type_5());
      	
      data.setVelTestRatio(cdr.read_type_5());
      	
      data.setPosTestRatio(cdr.read_type_5());
      	
      data.setHgtTestRatio(cdr.read_type_5());
      	
      data.setTasTestRatio(cdr.read_type_5());
      	
      data.setHaglTestRatio(cdr.read_type_5());
      	
      data.setBetaTestRatio(cdr.read_type_5());
      	
      data.setSolutionStatusFlags(cdr.read_type_3());
      	
      data.setResetCountVelNe(cdr.read_type_9());
      	
      data.setResetCountVelD(cdr.read_type_9());
      	
      data.setResetCountPosNe(cdr.read_type_9());
      	
      data.setResetCountPodD(cdr.read_type_9());
      	
      data.setResetCountQuat(cdr.read_type_9());
      	
      data.setTimeSlip(cdr.read_type_5());
      	
      data.setPreFltFailInnovHeading(cdr.read_type_7());
      	
      data.setPreFltFailInnovHeight(cdr.read_type_7());
      	
      data.setPreFltFailInnovPosHoriz(cdr.read_type_7());
      	
      data.setPreFltFailInnovVelHoriz(cdr.read_type_7());
      	
      data.setPreFltFailInnovVelVert(cdr.read_type_7());
      	
      data.setPreFltFailMagFieldDisturbed(cdr.read_type_7());
      	
      data.setAccelDeviceId(cdr.read_type_4());
      	
      data.setGyroDeviceId(cdr.read_type_4());
      	
      data.setBaroDeviceId(cdr.read_type_4());
      	
      data.setMagDeviceId(cdr.read_type_4());
      	
      data.setHealthFlags(cdr.read_type_9());
      	
      data.setTimeoutFlags(cdr.read_type_9());
      	
      data.setMagInclinationDeg(cdr.read_type_5());
      	
      data.setMagInclinationRefDeg(cdr.read_type_5());
      	
      data.setMagStrengthGs(cdr.read_type_5());
      	
      data.setMagStrengthRefGs(cdr.read_type_5());
      	

   }

   @Override
   public final void serialize(px4_msgs.msg.dds.EstimatorStatus data, us.ihmc.idl.InterchangeSerializer ser)
   {
      ser.write_type_12("timestamp", data.getTimestamp());
      ser.write_type_12("timestamp_sample", data.getTimestampSample());
      ser.write_type_f("output_tracking_error", data.getOutputTrackingError());
      ser.write_type_3("gps_check_fail_flags", data.getGpsCheckFailFlags());
      ser.write_type_12("control_mode_flags", data.getControlModeFlags());
      ser.write_type_4("filter_fault_flags", data.getFilterFaultFlags());
      ser.write_type_5("pos_horiz_accuracy", data.getPosHorizAccuracy());
      ser.write_type_5("pos_vert_accuracy", data.getPosVertAccuracy());
      ser.write_type_5("hdg_test_ratio", data.getHdgTestRatio());
      ser.write_type_5("vel_test_ratio", data.getVelTestRatio());
      ser.write_type_5("pos_test_ratio", data.getPosTestRatio());
      ser.write_type_5("hgt_test_ratio", data.getHgtTestRatio());
      ser.write_type_5("tas_test_ratio", data.getTasTestRatio());
      ser.write_type_5("hagl_test_ratio", data.getHaglTestRatio());
      ser.write_type_5("beta_test_ratio", data.getBetaTestRatio());
      ser.write_type_3("solution_status_flags", data.getSolutionStatusFlags());
      ser.write_type_9("reset_count_vel_ne", data.getResetCountVelNe());
      ser.write_type_9("reset_count_vel_d", data.getResetCountVelD());
      ser.write_type_9("reset_count_pos_ne", data.getResetCountPosNe());
      ser.write_type_9("reset_count_pod_d", data.getResetCountPodD());
      ser.write_type_9("reset_count_quat", data.getResetCountQuat());
      ser.write_type_5("time_slip", data.getTimeSlip());
      ser.write_type_7("pre_flt_fail_innov_heading", data.getPreFltFailInnovHeading());
      ser.write_type_7("pre_flt_fail_innov_height", data.getPreFltFailInnovHeight());
      ser.write_type_7("pre_flt_fail_innov_pos_horiz", data.getPreFltFailInnovPosHoriz());
      ser.write_type_7("pre_flt_fail_innov_vel_horiz", data.getPreFltFailInnovVelHoriz());
      ser.write_type_7("pre_flt_fail_innov_vel_vert", data.getPreFltFailInnovVelVert());
      ser.write_type_7("pre_flt_fail_mag_field_disturbed", data.getPreFltFailMagFieldDisturbed());
      ser.write_type_4("accel_device_id", data.getAccelDeviceId());
      ser.write_type_4("gyro_device_id", data.getGyroDeviceId());
      ser.write_type_4("baro_device_id", data.getBaroDeviceId());
      ser.write_type_4("mag_device_id", data.getMagDeviceId());
      ser.write_type_9("health_flags", data.getHealthFlags());
      ser.write_type_9("timeout_flags", data.getTimeoutFlags());
      ser.write_type_5("mag_inclination_deg", data.getMagInclinationDeg());
      ser.write_type_5("mag_inclination_ref_deg", data.getMagInclinationRefDeg());
      ser.write_type_5("mag_strength_gs", data.getMagStrengthGs());
      ser.write_type_5("mag_strength_ref_gs", data.getMagStrengthRefGs());
   }

   @Override
   public final void deserialize(us.ihmc.idl.InterchangeSerializer ser, px4_msgs.msg.dds.EstimatorStatus data)
   {
      data.setTimestamp(ser.read_type_12("timestamp"));
      data.setTimestampSample(ser.read_type_12("timestamp_sample"));
      ser.read_type_f("output_tracking_error", data.getOutputTrackingError());
      data.setGpsCheckFailFlags(ser.read_type_3("gps_check_fail_flags"));
      data.setControlModeFlags(ser.read_type_12("control_mode_flags"));
      data.setFilterFaultFlags(ser.read_type_4("filter_fault_flags"));
      data.setPosHorizAccuracy(ser.read_type_5("pos_horiz_accuracy"));
      data.setPosVertAccuracy(ser.read_type_5("pos_vert_accuracy"));
      data.setHdgTestRatio(ser.read_type_5("hdg_test_ratio"));
      data.setVelTestRatio(ser.read_type_5("vel_test_ratio"));
      data.setPosTestRatio(ser.read_type_5("pos_test_ratio"));
      data.setHgtTestRatio(ser.read_type_5("hgt_test_ratio"));
      data.setTasTestRatio(ser.read_type_5("tas_test_ratio"));
      data.setHaglTestRatio(ser.read_type_5("hagl_test_ratio"));
      data.setBetaTestRatio(ser.read_type_5("beta_test_ratio"));
      data.setSolutionStatusFlags(ser.read_type_3("solution_status_flags"));
      data.setResetCountVelNe(ser.read_type_9("reset_count_vel_ne"));
      data.setResetCountVelD(ser.read_type_9("reset_count_vel_d"));
      data.setResetCountPosNe(ser.read_type_9("reset_count_pos_ne"));
      data.setResetCountPodD(ser.read_type_9("reset_count_pod_d"));
      data.setResetCountQuat(ser.read_type_9("reset_count_quat"));
      data.setTimeSlip(ser.read_type_5("time_slip"));
      data.setPreFltFailInnovHeading(ser.read_type_7("pre_flt_fail_innov_heading"));
      data.setPreFltFailInnovHeight(ser.read_type_7("pre_flt_fail_innov_height"));
      data.setPreFltFailInnovPosHoriz(ser.read_type_7("pre_flt_fail_innov_pos_horiz"));
      data.setPreFltFailInnovVelHoriz(ser.read_type_7("pre_flt_fail_innov_vel_horiz"));
      data.setPreFltFailInnovVelVert(ser.read_type_7("pre_flt_fail_innov_vel_vert"));
      data.setPreFltFailMagFieldDisturbed(ser.read_type_7("pre_flt_fail_mag_field_disturbed"));
      data.setAccelDeviceId(ser.read_type_4("accel_device_id"));
      data.setGyroDeviceId(ser.read_type_4("gyro_device_id"));
      data.setBaroDeviceId(ser.read_type_4("baro_device_id"));
      data.setMagDeviceId(ser.read_type_4("mag_device_id"));
      data.setHealthFlags(ser.read_type_9("health_flags"));
      data.setTimeoutFlags(ser.read_type_9("timeout_flags"));
      data.setMagInclinationDeg(ser.read_type_5("mag_inclination_deg"));
      data.setMagInclinationRefDeg(ser.read_type_5("mag_inclination_ref_deg"));
      data.setMagStrengthGs(ser.read_type_5("mag_strength_gs"));
      data.setMagStrengthRefGs(ser.read_type_5("mag_strength_ref_gs"));
   }

   public static void staticCopy(px4_msgs.msg.dds.EstimatorStatus src, px4_msgs.msg.dds.EstimatorStatus dest)
   {
      dest.set(src);
   }

   @Override
   public px4_msgs.msg.dds.EstimatorStatus createData()
   {
      return new px4_msgs.msg.dds.EstimatorStatus();
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
   
   public void serialize(px4_msgs.msg.dds.EstimatorStatus data, us.ihmc.idl.CDR cdr)
   {
      write(data, cdr);
   }

   public void deserialize(px4_msgs.msg.dds.EstimatorStatus data, us.ihmc.idl.CDR cdr)
   {
      read(data, cdr);
   }
   
   public void copy(px4_msgs.msg.dds.EstimatorStatus src, px4_msgs.msg.dds.EstimatorStatus dest)
   {
      staticCopy(src, dest);
   }

   @Override
   public EstimatorStatusPubSubType newInstance()
   {
      return new EstimatorStatusPubSubType();
   }
}
