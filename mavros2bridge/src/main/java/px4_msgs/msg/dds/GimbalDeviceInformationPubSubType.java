package px4_msgs.msg.dds;

/**
* 
* Topic data type of the struct "GimbalDeviceInformation" defined in "GimbalDeviceInformation_.idl". Use this class to provide the TopicDataType to a Participant. 
*
* This file was automatically generated from GimbalDeviceInformation_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit GimbalDeviceInformation_.idl instead.
*
*/
public class GimbalDeviceInformationPubSubType implements us.ihmc.pubsub.TopicDataType<px4_msgs.msg.dds.GimbalDeviceInformation>
{
   public static final java.lang.String name = "px4_msgs::msg::dds_::GimbalDeviceInformation_";
   
   @Override
   public final java.lang.String getDefinitionChecksum()
   {
   		return "f9bdd2365d37810b2bacb2be407b14b32a2bd2c7a09e136f4ea0d2f091dfaa8e";
   }
   
   @Override
   public final java.lang.String getDefinitionVersion()
   {
   		return "";
   }

   private final us.ihmc.idl.CDR serializeCDR = new us.ihmc.idl.CDR();
   private final us.ihmc.idl.CDR deserializeCDR = new us.ihmc.idl.CDR();

   @Override
   public void serialize(px4_msgs.msg.dds.GimbalDeviceInformation data, us.ihmc.pubsub.common.SerializedPayload serializedPayload) throws java.io.IOException
   {
      serializeCDR.serialize(serializedPayload);
      write(data, serializeCDR);
      serializeCDR.finishSerialize();
   }

   @Override
   public void deserialize(us.ihmc.pubsub.common.SerializedPayload serializedPayload, px4_msgs.msg.dds.GimbalDeviceInformation data) throws java.io.IOException
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

      current_alignment += ((32) * 1) + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += ((32) * 1) + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += ((32) * 1) + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);

      current_alignment += 2 + us.ihmc.idl.CDR.alignment(current_alignment, 2);

      current_alignment += 2 + us.ihmc.idl.CDR.alignment(current_alignment, 2);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      return current_alignment - initial_alignment;
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.GimbalDeviceInformation data)
   {
      return getCdrSerializedSize(data, 0);
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.GimbalDeviceInformation data, int current_alignment)
   {
      int initial_alignment = current_alignment;

      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += ((32) * 1) + us.ihmc.idl.CDR.alignment(current_alignment, 1);
      current_alignment += ((32) * 1) + us.ihmc.idl.CDR.alignment(current_alignment, 1);
      current_alignment += ((32) * 1) + us.ihmc.idl.CDR.alignment(current_alignment, 1);
      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += 2 + us.ihmc.idl.CDR.alignment(current_alignment, 2);


      current_alignment += 2 + us.ihmc.idl.CDR.alignment(current_alignment, 2);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);



      return current_alignment - initial_alignment;
   }

   public static void write(px4_msgs.msg.dds.GimbalDeviceInformation data, us.ihmc.idl.CDR cdr)
   {
      cdr.write_type_12(data.getTimestamp());

      for(int i0 = 0; i0 < data.getVendorName().length; ++i0)
      {
        	cdr.write_type_9(data.getVendorName()[i0]);	
      }

      for(int i0 = 0; i0 < data.getModelName().length; ++i0)
      {
        	cdr.write_type_9(data.getModelName()[i0]);	
      }

      for(int i0 = 0; i0 < data.getCustomName().length; ++i0)
      {
        	cdr.write_type_9(data.getCustomName()[i0]);	
      }

      cdr.write_type_4(data.getFirmwareVersion());

      cdr.write_type_4(data.getHardwareVersion());

      cdr.write_type_12(data.getUid());

      cdr.write_type_3(data.getCapFlags());

      cdr.write_type_3(data.getCustomCapFlags());

      cdr.write_type_5(data.getRollMin());

      cdr.write_type_5(data.getRollMax());

      cdr.write_type_5(data.getPitchMin());

      cdr.write_type_5(data.getPitchMax());

      cdr.write_type_5(data.getYawMin());

      cdr.write_type_5(data.getYawMax());

      cdr.write_type_9(data.getGimbalDeviceCompid());

   }

   public static void read(px4_msgs.msg.dds.GimbalDeviceInformation data, us.ihmc.idl.CDR cdr)
   {
      data.setTimestamp(cdr.read_type_12());
      	
      for(int i0 = 0; i0 < data.getVendorName().length; ++i0)
      {
        	data.getVendorName()[i0] = cdr.read_type_9();
        	
      }
      	
      for(int i0 = 0; i0 < data.getModelName().length; ++i0)
      {
        	data.getModelName()[i0] = cdr.read_type_9();
        	
      }
      	
      for(int i0 = 0; i0 < data.getCustomName().length; ++i0)
      {
        	data.getCustomName()[i0] = cdr.read_type_9();
        	
      }
      	
      data.setFirmwareVersion(cdr.read_type_4());
      	
      data.setHardwareVersion(cdr.read_type_4());
      	
      data.setUid(cdr.read_type_12());
      	
      data.setCapFlags(cdr.read_type_3());
      	
      data.setCustomCapFlags(cdr.read_type_3());
      	
      data.setRollMin(cdr.read_type_5());
      	
      data.setRollMax(cdr.read_type_5());
      	
      data.setPitchMin(cdr.read_type_5());
      	
      data.setPitchMax(cdr.read_type_5());
      	
      data.setYawMin(cdr.read_type_5());
      	
      data.setYawMax(cdr.read_type_5());
      	
      data.setGimbalDeviceCompid(cdr.read_type_9());
      	

   }

   @Override
   public final void serialize(px4_msgs.msg.dds.GimbalDeviceInformation data, us.ihmc.idl.InterchangeSerializer ser)
   {
      ser.write_type_12("timestamp", data.getTimestamp());
      ser.write_type_f("vendor_name", data.getVendorName());
      ser.write_type_f("model_name", data.getModelName());
      ser.write_type_f("custom_name", data.getCustomName());
      ser.write_type_4("firmware_version", data.getFirmwareVersion());
      ser.write_type_4("hardware_version", data.getHardwareVersion());
      ser.write_type_12("uid", data.getUid());
      ser.write_type_3("cap_flags", data.getCapFlags());
      ser.write_type_3("custom_cap_flags", data.getCustomCapFlags());
      ser.write_type_5("roll_min", data.getRollMin());
      ser.write_type_5("roll_max", data.getRollMax());
      ser.write_type_5("pitch_min", data.getPitchMin());
      ser.write_type_5("pitch_max", data.getPitchMax());
      ser.write_type_5("yaw_min", data.getYawMin());
      ser.write_type_5("yaw_max", data.getYawMax());
      ser.write_type_9("gimbal_device_compid", data.getGimbalDeviceCompid());
   }

   @Override
   public final void deserialize(us.ihmc.idl.InterchangeSerializer ser, px4_msgs.msg.dds.GimbalDeviceInformation data)
   {
      data.setTimestamp(ser.read_type_12("timestamp"));
      ser.read_type_f("vendor_name", data.getVendorName());
      ser.read_type_f("model_name", data.getModelName());
      ser.read_type_f("custom_name", data.getCustomName());
      data.setFirmwareVersion(ser.read_type_4("firmware_version"));
      data.setHardwareVersion(ser.read_type_4("hardware_version"));
      data.setUid(ser.read_type_12("uid"));
      data.setCapFlags(ser.read_type_3("cap_flags"));
      data.setCustomCapFlags(ser.read_type_3("custom_cap_flags"));
      data.setRollMin(ser.read_type_5("roll_min"));
      data.setRollMax(ser.read_type_5("roll_max"));
      data.setPitchMin(ser.read_type_5("pitch_min"));
      data.setPitchMax(ser.read_type_5("pitch_max"));
      data.setYawMin(ser.read_type_5("yaw_min"));
      data.setYawMax(ser.read_type_5("yaw_max"));
      data.setGimbalDeviceCompid(ser.read_type_9("gimbal_device_compid"));
   }

   public static void staticCopy(px4_msgs.msg.dds.GimbalDeviceInformation src, px4_msgs.msg.dds.GimbalDeviceInformation dest)
   {
      dest.set(src);
   }

   @Override
   public px4_msgs.msg.dds.GimbalDeviceInformation createData()
   {
      return new px4_msgs.msg.dds.GimbalDeviceInformation();
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
   
   public void serialize(px4_msgs.msg.dds.GimbalDeviceInformation data, us.ihmc.idl.CDR cdr)
   {
      write(data, cdr);
   }

   public void deserialize(px4_msgs.msg.dds.GimbalDeviceInformation data, us.ihmc.idl.CDR cdr)
   {
      read(data, cdr);
   }
   
   public void copy(px4_msgs.msg.dds.GimbalDeviceInformation src, px4_msgs.msg.dds.GimbalDeviceInformation dest)
   {
      staticCopy(src, dest);
   }

   @Override
   public GimbalDeviceInformationPubSubType newInstance()
   {
      return new GimbalDeviceInformationPubSubType();
   }
}
