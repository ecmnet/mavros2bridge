package px4_msgs.msg.dds;

/**
* 
* Topic data type of the struct "GimbalDeviceSetAttitude" defined in "GimbalDeviceSetAttitude_.idl". Use this class to provide the TopicDataType to a Participant. 
*
* This file was automatically generated from GimbalDeviceSetAttitude_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit GimbalDeviceSetAttitude_.idl instead.
*
*/
public class GimbalDeviceSetAttitudePubSubType implements us.ihmc.pubsub.TopicDataType<px4_msgs.msg.dds.GimbalDeviceSetAttitude>
{
   public static final java.lang.String name = "px4_msgs::msg::dds_::GimbalDeviceSetAttitude_";
   
   @Override
   public final java.lang.String getDefinitionChecksum()
   {
   		return "4c3b2b1bb247f9ab3e4ad9dae2731ff7e5812758c9bde8c148675c8533a3fd04";
   }
   
   @Override
   public final java.lang.String getDefinitionVersion()
   {
   		return "";
   }

   private final us.ihmc.idl.CDR serializeCDR = new us.ihmc.idl.CDR();
   private final us.ihmc.idl.CDR deserializeCDR = new us.ihmc.idl.CDR();

   @Override
   public void serialize(px4_msgs.msg.dds.GimbalDeviceSetAttitude data, us.ihmc.pubsub.common.SerializedPayload serializedPayload) throws java.io.IOException
   {
      serializeCDR.serialize(serializedPayload);
      write(data, serializeCDR);
      serializeCDR.finishSerialize();
   }

   @Override
   public void deserialize(us.ihmc.pubsub.common.SerializedPayload serializedPayload, px4_msgs.msg.dds.GimbalDeviceSetAttitude data) throws java.io.IOException
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

      current_alignment += 2 + us.ihmc.idl.CDR.alignment(current_alignment, 2);

      current_alignment += ((4) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      return current_alignment - initial_alignment;
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.GimbalDeviceSetAttitude data)
   {
      return getCdrSerializedSize(data, 0);
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.GimbalDeviceSetAttitude data, int current_alignment)
   {
      int initial_alignment = current_alignment;

      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 2 + us.ihmc.idl.CDR.alignment(current_alignment, 2);


      current_alignment += ((4) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);
      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);



      return current_alignment - initial_alignment;
   }

   public static void write(px4_msgs.msg.dds.GimbalDeviceSetAttitude data, us.ihmc.idl.CDR cdr)
   {
      cdr.write_type_12(data.getTimestamp());

      cdr.write_type_9(data.getTargetSystem());

      cdr.write_type_9(data.getTargetComponent());

      cdr.write_type_3(data.getFlags());

      for(int i0 = 0; i0 < data.getQ().length; ++i0)
      {
        	cdr.write_type_5(data.getQ()[i0]);	
      }

      cdr.write_type_5(data.getAngularVelocityX());

      cdr.write_type_5(data.getAngularVelocityY());

      cdr.write_type_5(data.getAngularVelocityZ());

   }

   public static void read(px4_msgs.msg.dds.GimbalDeviceSetAttitude data, us.ihmc.idl.CDR cdr)
   {
      data.setTimestamp(cdr.read_type_12());
      	
      data.setTargetSystem(cdr.read_type_9());
      	
      data.setTargetComponent(cdr.read_type_9());
      	
      data.setFlags(cdr.read_type_3());
      	
      for(int i0 = 0; i0 < data.getQ().length; ++i0)
      {
        	data.getQ()[i0] = cdr.read_type_5();
        	
      }
      	
      data.setAngularVelocityX(cdr.read_type_5());
      	
      data.setAngularVelocityY(cdr.read_type_5());
      	
      data.setAngularVelocityZ(cdr.read_type_5());
      	

   }

   @Override
   public final void serialize(px4_msgs.msg.dds.GimbalDeviceSetAttitude data, us.ihmc.idl.InterchangeSerializer ser)
   {
      ser.write_type_12("timestamp", data.getTimestamp());
      ser.write_type_9("target_system", data.getTargetSystem());
      ser.write_type_9("target_component", data.getTargetComponent());
      ser.write_type_3("flags", data.getFlags());
      ser.write_type_f("q", data.getQ());
      ser.write_type_5("angular_velocity_x", data.getAngularVelocityX());
      ser.write_type_5("angular_velocity_y", data.getAngularVelocityY());
      ser.write_type_5("angular_velocity_z", data.getAngularVelocityZ());
   }

   @Override
   public final void deserialize(us.ihmc.idl.InterchangeSerializer ser, px4_msgs.msg.dds.GimbalDeviceSetAttitude data)
   {
      data.setTimestamp(ser.read_type_12("timestamp"));
      data.setTargetSystem(ser.read_type_9("target_system"));
      data.setTargetComponent(ser.read_type_9("target_component"));
      data.setFlags(ser.read_type_3("flags"));
      ser.read_type_f("q", data.getQ());
      data.setAngularVelocityX(ser.read_type_5("angular_velocity_x"));
      data.setAngularVelocityY(ser.read_type_5("angular_velocity_y"));
      data.setAngularVelocityZ(ser.read_type_5("angular_velocity_z"));
   }

   public static void staticCopy(px4_msgs.msg.dds.GimbalDeviceSetAttitude src, px4_msgs.msg.dds.GimbalDeviceSetAttitude dest)
   {
      dest.set(src);
   }

   @Override
   public px4_msgs.msg.dds.GimbalDeviceSetAttitude createData()
   {
      return new px4_msgs.msg.dds.GimbalDeviceSetAttitude();
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
   
   public void serialize(px4_msgs.msg.dds.GimbalDeviceSetAttitude data, us.ihmc.idl.CDR cdr)
   {
      write(data, cdr);
   }

   public void deserialize(px4_msgs.msg.dds.GimbalDeviceSetAttitude data, us.ihmc.idl.CDR cdr)
   {
      read(data, cdr);
   }
   
   public void copy(px4_msgs.msg.dds.GimbalDeviceSetAttitude src, px4_msgs.msg.dds.GimbalDeviceSetAttitude dest)
   {
      staticCopy(src, dest);
   }

   @Override
   public GimbalDeviceSetAttitudePubSubType newInstance()
   {
      return new GimbalDeviceSetAttitudePubSubType();
   }
}
