package px4_msgs.msg.dds;

/**
* 
* Topic data type of the struct "ActuatorServosTrim" defined in "ActuatorServosTrim_.idl". Use this class to provide the TopicDataType to a Participant. 
*
* This file was automatically generated from ActuatorServosTrim_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit ActuatorServosTrim_.idl instead.
*
*/
public class ActuatorServosTrimPubSubType implements us.ihmc.pubsub.TopicDataType<px4_msgs.msg.dds.ActuatorServosTrim>
{
   public static final java.lang.String name = "px4_msgs::msg::dds_::ActuatorServosTrim_";
   
   @Override
   public final java.lang.String getDefinitionChecksum()
   {
   		return "92d1bd4eddac9ba3d47c14a276dbaf3546e190be0d8da602df0e69736a4496df";
   }
   
   @Override
   public final java.lang.String getDefinitionVersion()
   {
   		return "";
   }

   private final us.ihmc.idl.CDR serializeCDR = new us.ihmc.idl.CDR();
   private final us.ihmc.idl.CDR deserializeCDR = new us.ihmc.idl.CDR();

   @Override
   public void serialize(px4_msgs.msg.dds.ActuatorServosTrim data, us.ihmc.pubsub.common.SerializedPayload serializedPayload) throws java.io.IOException
   {
      serializeCDR.serialize(serializedPayload);
      write(data, serializeCDR);
      serializeCDR.finishSerialize();
   }

   @Override
   public void deserialize(us.ihmc.pubsub.common.SerializedPayload serializedPayload, px4_msgs.msg.dds.ActuatorServosTrim data) throws java.io.IOException
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

      current_alignment += ((8) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      return current_alignment - initial_alignment;
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.ActuatorServosTrim data)
   {
      return getCdrSerializedSize(data, 0);
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.ActuatorServosTrim data, int current_alignment)
   {
      int initial_alignment = current_alignment;

      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += ((8) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      return current_alignment - initial_alignment;
   }

   public static void write(px4_msgs.msg.dds.ActuatorServosTrim data, us.ihmc.idl.CDR cdr)
   {
      cdr.write_type_12(data.getTimestamp());

      for(int i0 = 0; i0 < data.getTrim().length; ++i0)
      {
        	cdr.write_type_5(data.getTrim()[i0]);	
      }

   }

   public static void read(px4_msgs.msg.dds.ActuatorServosTrim data, us.ihmc.idl.CDR cdr)
   {
      data.setTimestamp(cdr.read_type_12());
      	
      for(int i0 = 0; i0 < data.getTrim().length; ++i0)
      {
        	data.getTrim()[i0] = cdr.read_type_5();
        	
      }
      	

   }

   @Override
   public final void serialize(px4_msgs.msg.dds.ActuatorServosTrim data, us.ihmc.idl.InterchangeSerializer ser)
   {
      ser.write_type_12("timestamp", data.getTimestamp());
      ser.write_type_f("trim", data.getTrim());
   }

   @Override
   public final void deserialize(us.ihmc.idl.InterchangeSerializer ser, px4_msgs.msg.dds.ActuatorServosTrim data)
   {
      data.setTimestamp(ser.read_type_12("timestamp"));
      ser.read_type_f("trim", data.getTrim());
   }

   public static void staticCopy(px4_msgs.msg.dds.ActuatorServosTrim src, px4_msgs.msg.dds.ActuatorServosTrim dest)
   {
      dest.set(src);
   }

   @Override
   public px4_msgs.msg.dds.ActuatorServosTrim createData()
   {
      return new px4_msgs.msg.dds.ActuatorServosTrim();
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
   
   public void serialize(px4_msgs.msg.dds.ActuatorServosTrim data, us.ihmc.idl.CDR cdr)
   {
      write(data, cdr);
   }

   public void deserialize(px4_msgs.msg.dds.ActuatorServosTrim data, us.ihmc.idl.CDR cdr)
   {
      read(data, cdr);
   }
   
   public void copy(px4_msgs.msg.dds.ActuatorServosTrim src, px4_msgs.msg.dds.ActuatorServosTrim dest)
   {
      staticCopy(src, dest);
   }

   @Override
   public ActuatorServosTrimPubSubType newInstance()
   {
      return new ActuatorServosTrimPubSubType();
   }
}
