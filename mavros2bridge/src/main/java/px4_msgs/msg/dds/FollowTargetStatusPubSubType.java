package px4_msgs.msg.dds;

/**
* 
* Topic data type of the struct "FollowTargetStatus" defined in "FollowTargetStatus_.idl". Use this class to provide the TopicDataType to a Participant. 
*
* This file was automatically generated from FollowTargetStatus_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit FollowTargetStatus_.idl instead.
*
*/
public class FollowTargetStatusPubSubType implements us.ihmc.pubsub.TopicDataType<px4_msgs.msg.dds.FollowTargetStatus>
{
   public static final java.lang.String name = "px4_msgs::msg::dds_::FollowTargetStatus_";
   
   @Override
   public final java.lang.String getDefinitionChecksum()
   {
   		return "92a28b7c7a8f48e4ea0662fb6ddad047e466075770cc4c34c7705f5efbb57f7b";
   }
   
   @Override
   public final java.lang.String getDefinitionVersion()
   {
   		return "";
   }

   private final us.ihmc.idl.CDR serializeCDR = new us.ihmc.idl.CDR();
   private final us.ihmc.idl.CDR deserializeCDR = new us.ihmc.idl.CDR();

   @Override
   public void serialize(px4_msgs.msg.dds.FollowTargetStatus data, us.ihmc.pubsub.common.SerializedPayload serializedPayload) throws java.io.IOException
   {
      serializeCDR.serialize(serializedPayload);
      write(data, serializeCDR);
      serializeCDR.finishSerialize();
   }

   @Override
   public void deserialize(us.ihmc.pubsub.common.SerializedPayload serializedPayload, px4_msgs.msg.dds.FollowTargetStatus data) throws java.io.IOException
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

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += ((3) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      return current_alignment - initial_alignment;
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.FollowTargetStatus data)
   {
      return getCdrSerializedSize(data, 0);
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.FollowTargetStatus data, int current_alignment)
   {
      int initial_alignment = current_alignment;

      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += ((3) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);
      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);



      return current_alignment - initial_alignment;
   }

   public static void write(px4_msgs.msg.dds.FollowTargetStatus data, us.ihmc.idl.CDR cdr)
   {
      cdr.write_type_12(data.getTimestamp());

      cdr.write_type_5(data.getTrackedTargetCourse());

      cdr.write_type_5(data.getFollowAngle());

      cdr.write_type_5(data.getOrbitAngleSetpoint());

      cdr.write_type_5(data.getAngularRateSetpoint());

      for(int i0 = 0; i0 < data.getDesiredPositionRaw().length; ++i0)
      {
        	cdr.write_type_5(data.getDesiredPositionRaw()[i0]);	
      }

      cdr.write_type_7(data.getInEmergencyAscent());

      cdr.write_type_5(data.getGimbalPitch());

   }

   public static void read(px4_msgs.msg.dds.FollowTargetStatus data, us.ihmc.idl.CDR cdr)
   {
      data.setTimestamp(cdr.read_type_12());
      	
      data.setTrackedTargetCourse(cdr.read_type_5());
      	
      data.setFollowAngle(cdr.read_type_5());
      	
      data.setOrbitAngleSetpoint(cdr.read_type_5());
      	
      data.setAngularRateSetpoint(cdr.read_type_5());
      	
      for(int i0 = 0; i0 < data.getDesiredPositionRaw().length; ++i0)
      {
        	data.getDesiredPositionRaw()[i0] = cdr.read_type_5();
        	
      }
      	
      data.setInEmergencyAscent(cdr.read_type_7());
      	
      data.setGimbalPitch(cdr.read_type_5());
      	

   }

   @Override
   public final void serialize(px4_msgs.msg.dds.FollowTargetStatus data, us.ihmc.idl.InterchangeSerializer ser)
   {
      ser.write_type_12("timestamp", data.getTimestamp());
      ser.write_type_5("tracked_target_course", data.getTrackedTargetCourse());
      ser.write_type_5("follow_angle", data.getFollowAngle());
      ser.write_type_5("orbit_angle_setpoint", data.getOrbitAngleSetpoint());
      ser.write_type_5("angular_rate_setpoint", data.getAngularRateSetpoint());
      ser.write_type_f("desired_position_raw", data.getDesiredPositionRaw());
      ser.write_type_7("in_emergency_ascent", data.getInEmergencyAscent());
      ser.write_type_5("gimbal_pitch", data.getGimbalPitch());
   }

   @Override
   public final void deserialize(us.ihmc.idl.InterchangeSerializer ser, px4_msgs.msg.dds.FollowTargetStatus data)
   {
      data.setTimestamp(ser.read_type_12("timestamp"));
      data.setTrackedTargetCourse(ser.read_type_5("tracked_target_course"));
      data.setFollowAngle(ser.read_type_5("follow_angle"));
      data.setOrbitAngleSetpoint(ser.read_type_5("orbit_angle_setpoint"));
      data.setAngularRateSetpoint(ser.read_type_5("angular_rate_setpoint"));
      ser.read_type_f("desired_position_raw", data.getDesiredPositionRaw());
      data.setInEmergencyAscent(ser.read_type_7("in_emergency_ascent"));
      data.setGimbalPitch(ser.read_type_5("gimbal_pitch"));
   }

   public static void staticCopy(px4_msgs.msg.dds.FollowTargetStatus src, px4_msgs.msg.dds.FollowTargetStatus dest)
   {
      dest.set(src);
   }

   @Override
   public px4_msgs.msg.dds.FollowTargetStatus createData()
   {
      return new px4_msgs.msg.dds.FollowTargetStatus();
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
   
   public void serialize(px4_msgs.msg.dds.FollowTargetStatus data, us.ihmc.idl.CDR cdr)
   {
      write(data, cdr);
   }

   public void deserialize(px4_msgs.msg.dds.FollowTargetStatus data, us.ihmc.idl.CDR cdr)
   {
      read(data, cdr);
   }
   
   public void copy(px4_msgs.msg.dds.FollowTargetStatus src, px4_msgs.msg.dds.FollowTargetStatus dest)
   {
      staticCopy(src, dest);
   }

   @Override
   public FollowTargetStatusPubSubType newInstance()
   {
      return new FollowTargetStatusPubSubType();
   }
}
