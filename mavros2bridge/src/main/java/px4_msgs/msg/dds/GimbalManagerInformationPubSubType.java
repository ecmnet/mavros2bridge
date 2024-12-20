package px4_msgs.msg.dds;

/**
* 
* Topic data type of the struct "GimbalManagerInformation" defined in "GimbalManagerInformation_.idl". Use this class to provide the TopicDataType to a Participant. 
*
* This file was automatically generated from GimbalManagerInformation_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit GimbalManagerInformation_.idl instead.
*
*/
public class GimbalManagerInformationPubSubType implements us.ihmc.pubsub.TopicDataType<px4_msgs.msg.dds.GimbalManagerInformation>
{
   public static final java.lang.String name = "px4_msgs::msg::dds_::GimbalManagerInformation_";
   
   @Override
   public final java.lang.String getDefinitionChecksum()
   {
   		return "8a82bfd34c68242f08d389bea6ff20100d6f93d49b490759de992763da2bc161";
   }
   
   @Override
   public final java.lang.String getDefinitionVersion()
   {
   		return "";
   }

   private final us.ihmc.idl.CDR serializeCDR = new us.ihmc.idl.CDR();
   private final us.ihmc.idl.CDR deserializeCDR = new us.ihmc.idl.CDR();

   @Override
   public void serialize(px4_msgs.msg.dds.GimbalManagerInformation data, us.ihmc.pubsub.common.SerializedPayload serializedPayload) throws java.io.IOException
   {
      serializeCDR.serialize(serializedPayload);
      write(data, serializeCDR);
      serializeCDR.finishSerialize();
   }

   @Override
   public void deserialize(us.ihmc.pubsub.common.SerializedPayload serializedPayload, px4_msgs.msg.dds.GimbalManagerInformation data) throws java.io.IOException
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

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      return current_alignment - initial_alignment;
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.GimbalManagerInformation data)
   {
      return getCdrSerializedSize(data, 0);
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.GimbalManagerInformation data, int current_alignment)
   {
      int initial_alignment = current_alignment;

      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);



      return current_alignment - initial_alignment;
   }

   public static void write(px4_msgs.msg.dds.GimbalManagerInformation data, us.ihmc.idl.CDR cdr)
   {
      cdr.write_type_12(data.getTimestamp());

      cdr.write_type_4(data.getCapFlags());

      cdr.write_type_9(data.getGimbalDeviceId());

      cdr.write_type_5(data.getRollMin());

      cdr.write_type_5(data.getRollMax());

      cdr.write_type_5(data.getPitchMin());

      cdr.write_type_5(data.getPitchMax());

      cdr.write_type_5(data.getYawMin());

      cdr.write_type_5(data.getYawMax());

   }

   public static void read(px4_msgs.msg.dds.GimbalManagerInformation data, us.ihmc.idl.CDR cdr)
   {
      data.setTimestamp(cdr.read_type_12());
      	
      data.setCapFlags(cdr.read_type_4());
      	
      data.setGimbalDeviceId(cdr.read_type_9());
      	
      data.setRollMin(cdr.read_type_5());
      	
      data.setRollMax(cdr.read_type_5());
      	
      data.setPitchMin(cdr.read_type_5());
      	
      data.setPitchMax(cdr.read_type_5());
      	
      data.setYawMin(cdr.read_type_5());
      	
      data.setYawMax(cdr.read_type_5());
      	

   }

   @Override
   public final void serialize(px4_msgs.msg.dds.GimbalManagerInformation data, us.ihmc.idl.InterchangeSerializer ser)
   {
      ser.write_type_12("timestamp", data.getTimestamp());
      ser.write_type_4("cap_flags", data.getCapFlags());
      ser.write_type_9("gimbal_device_id", data.getGimbalDeviceId());
      ser.write_type_5("roll_min", data.getRollMin());
      ser.write_type_5("roll_max", data.getRollMax());
      ser.write_type_5("pitch_min", data.getPitchMin());
      ser.write_type_5("pitch_max", data.getPitchMax());
      ser.write_type_5("yaw_min", data.getYawMin());
      ser.write_type_5("yaw_max", data.getYawMax());
   }

   @Override
   public final void deserialize(us.ihmc.idl.InterchangeSerializer ser, px4_msgs.msg.dds.GimbalManagerInformation data)
   {
      data.setTimestamp(ser.read_type_12("timestamp"));
      data.setCapFlags(ser.read_type_4("cap_flags"));
      data.setGimbalDeviceId(ser.read_type_9("gimbal_device_id"));
      data.setRollMin(ser.read_type_5("roll_min"));
      data.setRollMax(ser.read_type_5("roll_max"));
      data.setPitchMin(ser.read_type_5("pitch_min"));
      data.setPitchMax(ser.read_type_5("pitch_max"));
      data.setYawMin(ser.read_type_5("yaw_min"));
      data.setYawMax(ser.read_type_5("yaw_max"));
   }

   public static void staticCopy(px4_msgs.msg.dds.GimbalManagerInformation src, px4_msgs.msg.dds.GimbalManagerInformation dest)
   {
      dest.set(src);
   }

   @Override
   public px4_msgs.msg.dds.GimbalManagerInformation createData()
   {
      return new px4_msgs.msg.dds.GimbalManagerInformation();
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
   
   public void serialize(px4_msgs.msg.dds.GimbalManagerInformation data, us.ihmc.idl.CDR cdr)
   {
      write(data, cdr);
   }

   public void deserialize(px4_msgs.msg.dds.GimbalManagerInformation data, us.ihmc.idl.CDR cdr)
   {
      read(data, cdr);
   }
   
   public void copy(px4_msgs.msg.dds.GimbalManagerInformation src, px4_msgs.msg.dds.GimbalManagerInformation dest)
   {
      staticCopy(src, dest);
   }

   @Override
   public GimbalManagerInformationPubSubType newInstance()
   {
      return new GimbalManagerInformationPubSubType();
   }
}
