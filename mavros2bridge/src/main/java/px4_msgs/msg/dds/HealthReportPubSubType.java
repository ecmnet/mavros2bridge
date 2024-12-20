package px4_msgs.msg.dds;

/**
* 
* Topic data type of the struct "HealthReport" defined in "HealthReport_.idl". Use this class to provide the TopicDataType to a Participant. 
*
* This file was automatically generated from HealthReport_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit HealthReport_.idl instead.
*
*/
public class HealthReportPubSubType implements us.ihmc.pubsub.TopicDataType<px4_msgs.msg.dds.HealthReport>
{
   public static final java.lang.String name = "px4_msgs::msg::dds_::HealthReport_";
   
   @Override
   public final java.lang.String getDefinitionChecksum()
   {
   		return "00f76d9fca74fd703cd779431a0518367f2d4d1cf981e62a82197c0245cf6838";
   }
   
   @Override
   public final java.lang.String getDefinitionVersion()
   {
   		return "";
   }

   private final us.ihmc.idl.CDR serializeCDR = new us.ihmc.idl.CDR();
   private final us.ihmc.idl.CDR deserializeCDR = new us.ihmc.idl.CDR();

   @Override
   public void serialize(px4_msgs.msg.dds.HealthReport data, us.ihmc.pubsub.common.SerializedPayload serializedPayload) throws java.io.IOException
   {
      serializeCDR.serialize(serializedPayload);
      write(data, serializeCDR);
      serializeCDR.finishSerialize();
   }

   @Override
   public void deserialize(us.ihmc.pubsub.common.SerializedPayload serializedPayload, px4_msgs.msg.dds.HealthReport data) throws java.io.IOException
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

      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);

      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);

      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);

      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);

      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);

      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      return current_alignment - initial_alignment;
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.HealthReport data)
   {
      return getCdrSerializedSize(data, 0);
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.HealthReport data, int current_alignment)
   {
      int initial_alignment = current_alignment;

      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);



      return current_alignment - initial_alignment;
   }

   public static void write(px4_msgs.msg.dds.HealthReport data, us.ihmc.idl.CDR cdr)
   {
      cdr.write_type_12(data.getTimestamp());

      cdr.write_type_12(data.getCanArmModeFlags());

      cdr.write_type_12(data.getCanRunModeFlags());

      cdr.write_type_12(data.getHealthIsPresentFlags());

      cdr.write_type_12(data.getHealthWarningFlags());

      cdr.write_type_12(data.getHealthErrorFlags());

      cdr.write_type_12(data.getArmingCheckWarningFlags());

      cdr.write_type_12(data.getArmingCheckErrorFlags());

   }

   public static void read(px4_msgs.msg.dds.HealthReport data, us.ihmc.idl.CDR cdr)
   {
      data.setTimestamp(cdr.read_type_12());
      	
      data.setCanArmModeFlags(cdr.read_type_12());
      	
      data.setCanRunModeFlags(cdr.read_type_12());
      	
      data.setHealthIsPresentFlags(cdr.read_type_12());
      	
      data.setHealthWarningFlags(cdr.read_type_12());
      	
      data.setHealthErrorFlags(cdr.read_type_12());
      	
      data.setArmingCheckWarningFlags(cdr.read_type_12());
      	
      data.setArmingCheckErrorFlags(cdr.read_type_12());
      	

   }

   @Override
   public final void serialize(px4_msgs.msg.dds.HealthReport data, us.ihmc.idl.InterchangeSerializer ser)
   {
      ser.write_type_12("timestamp", data.getTimestamp());
      ser.write_type_12("can_arm_mode_flags", data.getCanArmModeFlags());
      ser.write_type_12("can_run_mode_flags", data.getCanRunModeFlags());
      ser.write_type_12("health_is_present_flags", data.getHealthIsPresentFlags());
      ser.write_type_12("health_warning_flags", data.getHealthWarningFlags());
      ser.write_type_12("health_error_flags", data.getHealthErrorFlags());
      ser.write_type_12("arming_check_warning_flags", data.getArmingCheckWarningFlags());
      ser.write_type_12("arming_check_error_flags", data.getArmingCheckErrorFlags());
   }

   @Override
   public final void deserialize(us.ihmc.idl.InterchangeSerializer ser, px4_msgs.msg.dds.HealthReport data)
   {
      data.setTimestamp(ser.read_type_12("timestamp"));
      data.setCanArmModeFlags(ser.read_type_12("can_arm_mode_flags"));
      data.setCanRunModeFlags(ser.read_type_12("can_run_mode_flags"));
      data.setHealthIsPresentFlags(ser.read_type_12("health_is_present_flags"));
      data.setHealthWarningFlags(ser.read_type_12("health_warning_flags"));
      data.setHealthErrorFlags(ser.read_type_12("health_error_flags"));
      data.setArmingCheckWarningFlags(ser.read_type_12("arming_check_warning_flags"));
      data.setArmingCheckErrorFlags(ser.read_type_12("arming_check_error_flags"));
   }

   public static void staticCopy(px4_msgs.msg.dds.HealthReport src, px4_msgs.msg.dds.HealthReport dest)
   {
      dest.set(src);
   }

   @Override
   public px4_msgs.msg.dds.HealthReport createData()
   {
      return new px4_msgs.msg.dds.HealthReport();
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
   
   public void serialize(px4_msgs.msg.dds.HealthReport data, us.ihmc.idl.CDR cdr)
   {
      write(data, cdr);
   }

   public void deserialize(px4_msgs.msg.dds.HealthReport data, us.ihmc.idl.CDR cdr)
   {
      read(data, cdr);
   }
   
   public void copy(px4_msgs.msg.dds.HealthReport src, px4_msgs.msg.dds.HealthReport dest)
   {
      staticCopy(src, dest);
   }

   @Override
   public HealthReportPubSubType newInstance()
   {
      return new HealthReportPubSubType();
   }
}
