package px4_msgs.msg.dds;

/**
* 
* Topic data type of the struct "GimbalManagerStatus" defined in "GimbalManagerStatus_.idl". Use this class to provide the TopicDataType to a Participant. 
*
* This file was automatically generated from GimbalManagerStatus_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit GimbalManagerStatus_.idl instead.
*
*/
public class GimbalManagerStatusPubSubType implements us.ihmc.pubsub.TopicDataType<px4_msgs.msg.dds.GimbalManagerStatus>
{
   public static final java.lang.String name = "px4_msgs::msg::dds_::GimbalManagerStatus_";
   
   @Override
   public final java.lang.String getDefinitionChecksum()
   {
   		return "86842503e8e267e409695361008efbc06721d01b9173e8d7a5b27fbf40254c6b";
   }
   
   @Override
   public final java.lang.String getDefinitionVersion()
   {
   		return "";
   }

   private final us.ihmc.idl.CDR serializeCDR = new us.ihmc.idl.CDR();
   private final us.ihmc.idl.CDR deserializeCDR = new us.ihmc.idl.CDR();

   @Override
   public void serialize(px4_msgs.msg.dds.GimbalManagerStatus data, us.ihmc.pubsub.common.SerializedPayload serializedPayload) throws java.io.IOException
   {
      serializeCDR.serialize(serializedPayload);
      write(data, serializeCDR);
      serializeCDR.finishSerialize();
   }

   @Override
   public void deserialize(us.ihmc.pubsub.common.SerializedPayload serializedPayload, px4_msgs.msg.dds.GimbalManagerStatus data) throws java.io.IOException
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

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      return current_alignment - initial_alignment;
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.GimbalManagerStatus data)
   {
      return getCdrSerializedSize(data, 0);
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.GimbalManagerStatus data, int current_alignment)
   {
      int initial_alignment = current_alignment;

      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);



      return current_alignment - initial_alignment;
   }

   public static void write(px4_msgs.msg.dds.GimbalManagerStatus data, us.ihmc.idl.CDR cdr)
   {
      cdr.write_type_12(data.getTimestamp());

      cdr.write_type_4(data.getFlags());

      cdr.write_type_9(data.getGimbalDeviceId());

      cdr.write_type_9(data.getPrimaryControlSysid());

      cdr.write_type_9(data.getPrimaryControlCompid());

      cdr.write_type_9(data.getSecondaryControlSysid());

      cdr.write_type_9(data.getSecondaryControlCompid());

   }

   public static void read(px4_msgs.msg.dds.GimbalManagerStatus data, us.ihmc.idl.CDR cdr)
   {
      data.setTimestamp(cdr.read_type_12());
      	
      data.setFlags(cdr.read_type_4());
      	
      data.setGimbalDeviceId(cdr.read_type_9());
      	
      data.setPrimaryControlSysid(cdr.read_type_9());
      	
      data.setPrimaryControlCompid(cdr.read_type_9());
      	
      data.setSecondaryControlSysid(cdr.read_type_9());
      	
      data.setSecondaryControlCompid(cdr.read_type_9());
      	

   }

   @Override
   public final void serialize(px4_msgs.msg.dds.GimbalManagerStatus data, us.ihmc.idl.InterchangeSerializer ser)
   {
      ser.write_type_12("timestamp", data.getTimestamp());
      ser.write_type_4("flags", data.getFlags());
      ser.write_type_9("gimbal_device_id", data.getGimbalDeviceId());
      ser.write_type_9("primary_control_sysid", data.getPrimaryControlSysid());
      ser.write_type_9("primary_control_compid", data.getPrimaryControlCompid());
      ser.write_type_9("secondary_control_sysid", data.getSecondaryControlSysid());
      ser.write_type_9("secondary_control_compid", data.getSecondaryControlCompid());
   }

   @Override
   public final void deserialize(us.ihmc.idl.InterchangeSerializer ser, px4_msgs.msg.dds.GimbalManagerStatus data)
   {
      data.setTimestamp(ser.read_type_12("timestamp"));
      data.setFlags(ser.read_type_4("flags"));
      data.setGimbalDeviceId(ser.read_type_9("gimbal_device_id"));
      data.setPrimaryControlSysid(ser.read_type_9("primary_control_sysid"));
      data.setPrimaryControlCompid(ser.read_type_9("primary_control_compid"));
      data.setSecondaryControlSysid(ser.read_type_9("secondary_control_sysid"));
      data.setSecondaryControlCompid(ser.read_type_9("secondary_control_compid"));
   }

   public static void staticCopy(px4_msgs.msg.dds.GimbalManagerStatus src, px4_msgs.msg.dds.GimbalManagerStatus dest)
   {
      dest.set(src);
   }

   @Override
   public px4_msgs.msg.dds.GimbalManagerStatus createData()
   {
      return new px4_msgs.msg.dds.GimbalManagerStatus();
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
   
   public void serialize(px4_msgs.msg.dds.GimbalManagerStatus data, us.ihmc.idl.CDR cdr)
   {
      write(data, cdr);
   }

   public void deserialize(px4_msgs.msg.dds.GimbalManagerStatus data, us.ihmc.idl.CDR cdr)
   {
      read(data, cdr);
   }
   
   public void copy(px4_msgs.msg.dds.GimbalManagerStatus src, px4_msgs.msg.dds.GimbalManagerStatus dest)
   {
      staticCopy(src, dest);
   }

   @Override
   public GimbalManagerStatusPubSubType newInstance()
   {
      return new GimbalManagerStatusPubSubType();
   }
}
