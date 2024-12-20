package px4_msgs.msg.dds;

/**
* 
* Topic data type of the struct "GimbalManagerSetAttitude" defined in "GimbalManagerSetAttitude_.idl". Use this class to provide the TopicDataType to a Participant. 
*
* This file was automatically generated from GimbalManagerSetAttitude_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit GimbalManagerSetAttitude_.idl instead.
*
*/
public class GimbalManagerSetAttitudePubSubType implements us.ihmc.pubsub.TopicDataType<px4_msgs.msg.dds.GimbalManagerSetAttitude>
{
   public static final java.lang.String name = "px4_msgs::msg::dds_::GimbalManagerSetAttitude_";
   
   @Override
   public final java.lang.String getDefinitionChecksum()
   {
   		return "8dce99a5d58cbb54f0e4ec53f6570d187e31e89a0459ee2adea071556a41711b";
   }
   
   @Override
   public final java.lang.String getDefinitionVersion()
   {
   		return "";
   }

   private final us.ihmc.idl.CDR serializeCDR = new us.ihmc.idl.CDR();
   private final us.ihmc.idl.CDR deserializeCDR = new us.ihmc.idl.CDR();

   @Override
   public void serialize(px4_msgs.msg.dds.GimbalManagerSetAttitude data, us.ihmc.pubsub.common.SerializedPayload serializedPayload) throws java.io.IOException
   {
      serializeCDR.serialize(serializedPayload);
      write(data, serializeCDR);
      serializeCDR.finishSerialize();
   }

   @Override
   public void deserialize(us.ihmc.pubsub.common.SerializedPayload serializedPayload, px4_msgs.msg.dds.GimbalManagerSetAttitude data) throws java.io.IOException
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

      current_alignment += ((4) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      return current_alignment - initial_alignment;
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.GimbalManagerSetAttitude data)
   {
      return getCdrSerializedSize(data, 0);
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.GimbalManagerSetAttitude data, int current_alignment)
   {
      int initial_alignment = current_alignment;

      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += ((4) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);
      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);



      return current_alignment - initial_alignment;
   }

   public static void write(px4_msgs.msg.dds.GimbalManagerSetAttitude data, us.ihmc.idl.CDR cdr)
   {
      cdr.write_type_12(data.getTimestamp());

      cdr.write_type_9(data.getOriginSysid());

      cdr.write_type_9(data.getOriginCompid());

      cdr.write_type_9(data.getTargetSystem());

      cdr.write_type_9(data.getTargetComponent());

      cdr.write_type_4(data.getFlags());

      cdr.write_type_9(data.getGimbalDeviceId());

      for(int i0 = 0; i0 < data.getQ().length; ++i0)
      {
        	cdr.write_type_5(data.getQ()[i0]);	
      }

      cdr.write_type_5(data.getAngularVelocityX());

      cdr.write_type_5(data.getAngularVelocityY());

      cdr.write_type_5(data.getAngularVelocityZ());

   }

   public static void read(px4_msgs.msg.dds.GimbalManagerSetAttitude data, us.ihmc.idl.CDR cdr)
   {
      data.setTimestamp(cdr.read_type_12());
      	
      data.setOriginSysid(cdr.read_type_9());
      	
      data.setOriginCompid(cdr.read_type_9());
      	
      data.setTargetSystem(cdr.read_type_9());
      	
      data.setTargetComponent(cdr.read_type_9());
      	
      data.setFlags(cdr.read_type_4());
      	
      data.setGimbalDeviceId(cdr.read_type_9());
      	
      for(int i0 = 0; i0 < data.getQ().length; ++i0)
      {
        	data.getQ()[i0] = cdr.read_type_5();
        	
      }
      	
      data.setAngularVelocityX(cdr.read_type_5());
      	
      data.setAngularVelocityY(cdr.read_type_5());
      	
      data.setAngularVelocityZ(cdr.read_type_5());
      	

   }

   @Override
   public final void serialize(px4_msgs.msg.dds.GimbalManagerSetAttitude data, us.ihmc.idl.InterchangeSerializer ser)
   {
      ser.write_type_12("timestamp", data.getTimestamp());
      ser.write_type_9("origin_sysid", data.getOriginSysid());
      ser.write_type_9("origin_compid", data.getOriginCompid());
      ser.write_type_9("target_system", data.getTargetSystem());
      ser.write_type_9("target_component", data.getTargetComponent());
      ser.write_type_4("flags", data.getFlags());
      ser.write_type_9("gimbal_device_id", data.getGimbalDeviceId());
      ser.write_type_f("q", data.getQ());
      ser.write_type_5("angular_velocity_x", data.getAngularVelocityX());
      ser.write_type_5("angular_velocity_y", data.getAngularVelocityY());
      ser.write_type_5("angular_velocity_z", data.getAngularVelocityZ());
   }

   @Override
   public final void deserialize(us.ihmc.idl.InterchangeSerializer ser, px4_msgs.msg.dds.GimbalManagerSetAttitude data)
   {
      data.setTimestamp(ser.read_type_12("timestamp"));
      data.setOriginSysid(ser.read_type_9("origin_sysid"));
      data.setOriginCompid(ser.read_type_9("origin_compid"));
      data.setTargetSystem(ser.read_type_9("target_system"));
      data.setTargetComponent(ser.read_type_9("target_component"));
      data.setFlags(ser.read_type_4("flags"));
      data.setGimbalDeviceId(ser.read_type_9("gimbal_device_id"));
      ser.read_type_f("q", data.getQ());
      data.setAngularVelocityX(ser.read_type_5("angular_velocity_x"));
      data.setAngularVelocityY(ser.read_type_5("angular_velocity_y"));
      data.setAngularVelocityZ(ser.read_type_5("angular_velocity_z"));
   }

   public static void staticCopy(px4_msgs.msg.dds.GimbalManagerSetAttitude src, px4_msgs.msg.dds.GimbalManagerSetAttitude dest)
   {
      dest.set(src);
   }

   @Override
   public px4_msgs.msg.dds.GimbalManagerSetAttitude createData()
   {
      return new px4_msgs.msg.dds.GimbalManagerSetAttitude();
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
   
   public void serialize(px4_msgs.msg.dds.GimbalManagerSetAttitude data, us.ihmc.idl.CDR cdr)
   {
      write(data, cdr);
   }

   public void deserialize(px4_msgs.msg.dds.GimbalManagerSetAttitude data, us.ihmc.idl.CDR cdr)
   {
      read(data, cdr);
   }
   
   public void copy(px4_msgs.msg.dds.GimbalManagerSetAttitude src, px4_msgs.msg.dds.GimbalManagerSetAttitude dest)
   {
      staticCopy(src, dest);
   }

   @Override
   public GimbalManagerSetAttitudePubSubType newInstance()
   {
      return new GimbalManagerSetAttitudePubSubType();
   }
}
