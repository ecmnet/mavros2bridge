package px4_msgs.msg.dds;

/**
* 
* Topic data type of the struct "GimbalManagerSetManualControl" defined in "GimbalManagerSetManualControl_.idl". Use this class to provide the TopicDataType to a Participant. 
*
* This file was automatically generated from GimbalManagerSetManualControl_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit GimbalManagerSetManualControl_.idl instead.
*
*/
public class GimbalManagerSetManualControlPubSubType implements us.ihmc.pubsub.TopicDataType<px4_msgs.msg.dds.GimbalManagerSetManualControl>
{
   public static final java.lang.String name = "px4_msgs::msg::dds_::GimbalManagerSetManualControl_";
   
   @Override
   public final java.lang.String getDefinitionChecksum()
   {
   		return "2b6b991a121df0a4d3a693fc53d348548319dc862610e7a7fb4633eabd197854";
   }
   
   @Override
   public final java.lang.String getDefinitionVersion()
   {
   		return "";
   }

   private final us.ihmc.idl.CDR serializeCDR = new us.ihmc.idl.CDR();
   private final us.ihmc.idl.CDR deserializeCDR = new us.ihmc.idl.CDR();

   @Override
   public void serialize(px4_msgs.msg.dds.GimbalManagerSetManualControl data, us.ihmc.pubsub.common.SerializedPayload serializedPayload) throws java.io.IOException
   {
      serializeCDR.serialize(serializedPayload);
      write(data, serializeCDR);
      serializeCDR.finishSerialize();
   }

   @Override
   public void deserialize(us.ihmc.pubsub.common.SerializedPayload serializedPayload, px4_msgs.msg.dds.GimbalManagerSetManualControl data) throws java.io.IOException
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

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      return current_alignment - initial_alignment;
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.GimbalManagerSetManualControl data)
   {
      return getCdrSerializedSize(data, 0);
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.GimbalManagerSetManualControl data, int current_alignment)
   {
      int initial_alignment = current_alignment;

      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);



      return current_alignment - initial_alignment;
   }

   public static void write(px4_msgs.msg.dds.GimbalManagerSetManualControl data, us.ihmc.idl.CDR cdr)
   {
      cdr.write_type_12(data.getTimestamp());

      cdr.write_type_9(data.getOriginSysid());

      cdr.write_type_9(data.getOriginCompid());

      cdr.write_type_9(data.getTargetSystem());

      cdr.write_type_9(data.getTargetComponent());

      cdr.write_type_4(data.getFlags());

      cdr.write_type_9(data.getGimbalDeviceId());

      cdr.write_type_5(data.getPitch());

      cdr.write_type_5(data.getYaw());

      cdr.write_type_5(data.getPitchRate());

      cdr.write_type_5(data.getYawRate());

   }

   public static void read(px4_msgs.msg.dds.GimbalManagerSetManualControl data, us.ihmc.idl.CDR cdr)
   {
      data.setTimestamp(cdr.read_type_12());
      	
      data.setOriginSysid(cdr.read_type_9());
      	
      data.setOriginCompid(cdr.read_type_9());
      	
      data.setTargetSystem(cdr.read_type_9());
      	
      data.setTargetComponent(cdr.read_type_9());
      	
      data.setFlags(cdr.read_type_4());
      	
      data.setGimbalDeviceId(cdr.read_type_9());
      	
      data.setPitch(cdr.read_type_5());
      	
      data.setYaw(cdr.read_type_5());
      	
      data.setPitchRate(cdr.read_type_5());
      	
      data.setYawRate(cdr.read_type_5());
      	

   }

   @Override
   public final void serialize(px4_msgs.msg.dds.GimbalManagerSetManualControl data, us.ihmc.idl.InterchangeSerializer ser)
   {
      ser.write_type_12("timestamp", data.getTimestamp());
      ser.write_type_9("origin_sysid", data.getOriginSysid());
      ser.write_type_9("origin_compid", data.getOriginCompid());
      ser.write_type_9("target_system", data.getTargetSystem());
      ser.write_type_9("target_component", data.getTargetComponent());
      ser.write_type_4("flags", data.getFlags());
      ser.write_type_9("gimbal_device_id", data.getGimbalDeviceId());
      ser.write_type_5("pitch", data.getPitch());
      ser.write_type_5("yaw", data.getYaw());
      ser.write_type_5("pitch_rate", data.getPitchRate());
      ser.write_type_5("yaw_rate", data.getYawRate());
   }

   @Override
   public final void deserialize(us.ihmc.idl.InterchangeSerializer ser, px4_msgs.msg.dds.GimbalManagerSetManualControl data)
   {
      data.setTimestamp(ser.read_type_12("timestamp"));
      data.setOriginSysid(ser.read_type_9("origin_sysid"));
      data.setOriginCompid(ser.read_type_9("origin_compid"));
      data.setTargetSystem(ser.read_type_9("target_system"));
      data.setTargetComponent(ser.read_type_9("target_component"));
      data.setFlags(ser.read_type_4("flags"));
      data.setGimbalDeviceId(ser.read_type_9("gimbal_device_id"));
      data.setPitch(ser.read_type_5("pitch"));
      data.setYaw(ser.read_type_5("yaw"));
      data.setPitchRate(ser.read_type_5("pitch_rate"));
      data.setYawRate(ser.read_type_5("yaw_rate"));
   }

   public static void staticCopy(px4_msgs.msg.dds.GimbalManagerSetManualControl src, px4_msgs.msg.dds.GimbalManagerSetManualControl dest)
   {
      dest.set(src);
   }

   @Override
   public px4_msgs.msg.dds.GimbalManagerSetManualControl createData()
   {
      return new px4_msgs.msg.dds.GimbalManagerSetManualControl();
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
   
   public void serialize(px4_msgs.msg.dds.GimbalManagerSetManualControl data, us.ihmc.idl.CDR cdr)
   {
      write(data, cdr);
   }

   public void deserialize(px4_msgs.msg.dds.GimbalManagerSetManualControl data, us.ihmc.idl.CDR cdr)
   {
      read(data, cdr);
   }
   
   public void copy(px4_msgs.msg.dds.GimbalManagerSetManualControl src, px4_msgs.msg.dds.GimbalManagerSetManualControl dest)
   {
      staticCopy(src, dest);
   }

   @Override
   public GimbalManagerSetManualControlPubSubType newInstance()
   {
      return new GimbalManagerSetManualControlPubSubType();
   }
}
