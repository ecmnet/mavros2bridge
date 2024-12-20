package px4_msgs.msg.dds;

/**
* 
* Topic data type of the struct "EstimatorEventFlags" defined in "EstimatorEventFlags_.idl". Use this class to provide the TopicDataType to a Participant. 
*
* This file was automatically generated from EstimatorEventFlags_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit EstimatorEventFlags_.idl instead.
*
*/
public class EstimatorEventFlagsPubSubType implements us.ihmc.pubsub.TopicDataType<px4_msgs.msg.dds.EstimatorEventFlags>
{
   public static final java.lang.String name = "px4_msgs::msg::dds_::EstimatorEventFlags_";
   
   @Override
   public final java.lang.String getDefinitionChecksum()
   {
   		return "c6635507dc4e348d327c822f7187321fd2484d273b42b728089f3606f5fa47b1";
   }
   
   @Override
   public final java.lang.String getDefinitionVersion()
   {
   		return "";
   }

   private final us.ihmc.idl.CDR serializeCDR = new us.ihmc.idl.CDR();
   private final us.ihmc.idl.CDR deserializeCDR = new us.ihmc.idl.CDR();

   @Override
   public void serialize(px4_msgs.msg.dds.EstimatorEventFlags data, us.ihmc.pubsub.common.SerializedPayload serializedPayload) throws java.io.IOException
   {
      serializeCDR.serialize(serializedPayload);
      write(data, serializeCDR);
      serializeCDR.finishSerialize();
   }

   @Override
   public void deserialize(us.ihmc.pubsub.common.SerializedPayload serializedPayload, px4_msgs.msg.dds.EstimatorEventFlags data) throws java.io.IOException
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

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.EstimatorEventFlags data)
   {
      return getCdrSerializedSize(data, 0);
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.EstimatorEventFlags data, int current_alignment)
   {
      int initial_alignment = current_alignment;

      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


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



      return current_alignment - initial_alignment;
   }

   public static void write(px4_msgs.msg.dds.EstimatorEventFlags data, us.ihmc.idl.CDR cdr)
   {
      cdr.write_type_12(data.getTimestamp());

      cdr.write_type_12(data.getTimestampSample());

      cdr.write_type_4(data.getInformationEventChanges());

      cdr.write_type_7(data.getGpsChecksPassed());

      cdr.write_type_7(data.getResetVelToGps());

      cdr.write_type_7(data.getResetVelToFlow());

      cdr.write_type_7(data.getResetVelToVision());

      cdr.write_type_7(data.getResetVelToZero());

      cdr.write_type_7(data.getResetPosToLastKnown());

      cdr.write_type_7(data.getResetPosToGps());

      cdr.write_type_7(data.getResetPosToVision());

      cdr.write_type_7(data.getStartingGpsFusion());

      cdr.write_type_7(data.getStartingVisionPosFusion());

      cdr.write_type_7(data.getStartingVisionVelFusion());

      cdr.write_type_7(data.getStartingVisionYawFusion());

      cdr.write_type_7(data.getYawAlignedToImuGps());

      cdr.write_type_7(data.getResetHgtToBaro());

      cdr.write_type_7(data.getResetHgtToGps());

      cdr.write_type_7(data.getResetHgtToRng());

      cdr.write_type_7(data.getResetHgtToEv());

   }

   public static void read(px4_msgs.msg.dds.EstimatorEventFlags data, us.ihmc.idl.CDR cdr)
   {
      data.setTimestamp(cdr.read_type_12());
      	
      data.setTimestampSample(cdr.read_type_12());
      	
      data.setInformationEventChanges(cdr.read_type_4());
      	
      data.setGpsChecksPassed(cdr.read_type_7());
      	
      data.setResetVelToGps(cdr.read_type_7());
      	
      data.setResetVelToFlow(cdr.read_type_7());
      	
      data.setResetVelToVision(cdr.read_type_7());
      	
      data.setResetVelToZero(cdr.read_type_7());
      	
      data.setResetPosToLastKnown(cdr.read_type_7());
      	
      data.setResetPosToGps(cdr.read_type_7());
      	
      data.setResetPosToVision(cdr.read_type_7());
      	
      data.setStartingGpsFusion(cdr.read_type_7());
      	
      data.setStartingVisionPosFusion(cdr.read_type_7());
      	
      data.setStartingVisionVelFusion(cdr.read_type_7());
      	
      data.setStartingVisionYawFusion(cdr.read_type_7());
      	
      data.setYawAlignedToImuGps(cdr.read_type_7());
      	
      data.setResetHgtToBaro(cdr.read_type_7());
      	
      data.setResetHgtToGps(cdr.read_type_7());
      	
      data.setResetHgtToRng(cdr.read_type_7());
      	
      data.setResetHgtToEv(cdr.read_type_7());
      	

   }

   @Override
   public final void serialize(px4_msgs.msg.dds.EstimatorEventFlags data, us.ihmc.idl.InterchangeSerializer ser)
   {
      ser.write_type_12("timestamp", data.getTimestamp());
      ser.write_type_12("timestamp_sample", data.getTimestampSample());
      ser.write_type_4("information_event_changes", data.getInformationEventChanges());
      ser.write_type_7("gps_checks_passed", data.getGpsChecksPassed());
      ser.write_type_7("reset_vel_to_gps", data.getResetVelToGps());
      ser.write_type_7("reset_vel_to_flow", data.getResetVelToFlow());
      ser.write_type_7("reset_vel_to_vision", data.getResetVelToVision());
      ser.write_type_7("reset_vel_to_zero", data.getResetVelToZero());
      ser.write_type_7("reset_pos_to_last_known", data.getResetPosToLastKnown());
      ser.write_type_7("reset_pos_to_gps", data.getResetPosToGps());
      ser.write_type_7("reset_pos_to_vision", data.getResetPosToVision());
      ser.write_type_7("starting_gps_fusion", data.getStartingGpsFusion());
      ser.write_type_7("starting_vision_pos_fusion", data.getStartingVisionPosFusion());
      ser.write_type_7("starting_vision_vel_fusion", data.getStartingVisionVelFusion());
      ser.write_type_7("starting_vision_yaw_fusion", data.getStartingVisionYawFusion());
      ser.write_type_7("yaw_aligned_to_imu_gps", data.getYawAlignedToImuGps());
      ser.write_type_7("reset_hgt_to_baro", data.getResetHgtToBaro());
      ser.write_type_7("reset_hgt_to_gps", data.getResetHgtToGps());
      ser.write_type_7("reset_hgt_to_rng", data.getResetHgtToRng());
      ser.write_type_7("reset_hgt_to_ev", data.getResetHgtToEv());
   }

   @Override
   public final void deserialize(us.ihmc.idl.InterchangeSerializer ser, px4_msgs.msg.dds.EstimatorEventFlags data)
   {
      data.setTimestamp(ser.read_type_12("timestamp"));
      data.setTimestampSample(ser.read_type_12("timestamp_sample"));
      data.setInformationEventChanges(ser.read_type_4("information_event_changes"));
      data.setGpsChecksPassed(ser.read_type_7("gps_checks_passed"));
      data.setResetVelToGps(ser.read_type_7("reset_vel_to_gps"));
      data.setResetVelToFlow(ser.read_type_7("reset_vel_to_flow"));
      data.setResetVelToVision(ser.read_type_7("reset_vel_to_vision"));
      data.setResetVelToZero(ser.read_type_7("reset_vel_to_zero"));
      data.setResetPosToLastKnown(ser.read_type_7("reset_pos_to_last_known"));
      data.setResetPosToGps(ser.read_type_7("reset_pos_to_gps"));
      data.setResetPosToVision(ser.read_type_7("reset_pos_to_vision"));
      data.setStartingGpsFusion(ser.read_type_7("starting_gps_fusion"));
      data.setStartingVisionPosFusion(ser.read_type_7("starting_vision_pos_fusion"));
      data.setStartingVisionVelFusion(ser.read_type_7("starting_vision_vel_fusion"));
      data.setStartingVisionYawFusion(ser.read_type_7("starting_vision_yaw_fusion"));
      data.setYawAlignedToImuGps(ser.read_type_7("yaw_aligned_to_imu_gps"));
      data.setResetHgtToBaro(ser.read_type_7("reset_hgt_to_baro"));
      data.setResetHgtToGps(ser.read_type_7("reset_hgt_to_gps"));
      data.setResetHgtToRng(ser.read_type_7("reset_hgt_to_rng"));
      data.setResetHgtToEv(ser.read_type_7("reset_hgt_to_ev"));
   }

   public static void staticCopy(px4_msgs.msg.dds.EstimatorEventFlags src, px4_msgs.msg.dds.EstimatorEventFlags dest)
   {
      dest.set(src);
   }

   @Override
   public px4_msgs.msg.dds.EstimatorEventFlags createData()
   {
      return new px4_msgs.msg.dds.EstimatorEventFlags();
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
   
   public void serialize(px4_msgs.msg.dds.EstimatorEventFlags data, us.ihmc.idl.CDR cdr)
   {
      write(data, cdr);
   }

   public void deserialize(px4_msgs.msg.dds.EstimatorEventFlags data, us.ihmc.idl.CDR cdr)
   {
      read(data, cdr);
   }
   
   public void copy(px4_msgs.msg.dds.EstimatorEventFlags src, px4_msgs.msg.dds.EstimatorEventFlags dest)
   {
      staticCopy(src, dest);
   }

   @Override
   public EstimatorEventFlagsPubSubType newInstance()
   {
      return new EstimatorEventFlagsPubSubType();
   }
}
