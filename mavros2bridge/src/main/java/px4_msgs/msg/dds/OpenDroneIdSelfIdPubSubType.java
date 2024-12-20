package px4_msgs.msg.dds;

/**
* 
* Topic data type of the struct "OpenDroneIdSelfId" defined in "OpenDroneIdSelfId_.idl". Use this class to provide the TopicDataType to a Participant. 
*
* This file was automatically generated from OpenDroneIdSelfId_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit OpenDroneIdSelfId_.idl instead.
*
*/
public class OpenDroneIdSelfIdPubSubType implements us.ihmc.pubsub.TopicDataType<px4_msgs.msg.dds.OpenDroneIdSelfId>
{
   public static final java.lang.String name = "px4_msgs::msg::dds_::OpenDroneIdSelfId_";
   
   @Override
   public final java.lang.String getDefinitionChecksum()
   {
   		return "3fdbea92756fa9eb4f5bd07ae008065f62a6e3d3abae4e619493b20936e20655";
   }
   
   @Override
   public final java.lang.String getDefinitionVersion()
   {
   		return "";
   }

   private final us.ihmc.idl.CDR serializeCDR = new us.ihmc.idl.CDR();
   private final us.ihmc.idl.CDR deserializeCDR = new us.ihmc.idl.CDR();

   @Override
   public void serialize(px4_msgs.msg.dds.OpenDroneIdSelfId data, us.ihmc.pubsub.common.SerializedPayload serializedPayload) throws java.io.IOException
   {
      serializeCDR.serialize(serializedPayload);
      write(data, serializeCDR);
      serializeCDR.finishSerialize();
   }

   @Override
   public void deserialize(us.ihmc.pubsub.common.SerializedPayload serializedPayload, px4_msgs.msg.dds.OpenDroneIdSelfId data) throws java.io.IOException
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

      current_alignment += ((20) * 1) + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += ((23) * 1) + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      return current_alignment - initial_alignment;
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.OpenDroneIdSelfId data)
   {
      return getCdrSerializedSize(data, 0);
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.OpenDroneIdSelfId data, int current_alignment)
   {
      int initial_alignment = current_alignment;

      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += ((20) * 1) + us.ihmc.idl.CDR.alignment(current_alignment, 1);
      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += ((23) * 1) + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      return current_alignment - initial_alignment;
   }

   public static void write(px4_msgs.msg.dds.OpenDroneIdSelfId data, us.ihmc.idl.CDR cdr)
   {
      cdr.write_type_12(data.getTimestamp());

      for(int i0 = 0; i0 < data.getIdOrMac().length; ++i0)
      {
        	cdr.write_type_9(data.getIdOrMac()[i0]);	
      }

      cdr.write_type_9(data.getDescriptionType());

      for(int i0 = 0; i0 < data.getDescription().length; ++i0)
      {
        	cdr.write_type_8(data.getDescription()[i0]);	
      }

   }

   public static void read(px4_msgs.msg.dds.OpenDroneIdSelfId data, us.ihmc.idl.CDR cdr)
   {
      data.setTimestamp(cdr.read_type_12());
      	
      for(int i0 = 0; i0 < data.getIdOrMac().length; ++i0)
      {
        	data.getIdOrMac()[i0] = cdr.read_type_9();
        	
      }
      	
      data.setDescriptionType(cdr.read_type_9());
      	
      for(int i0 = 0; i0 < data.getDescription().length; ++i0)
      {
        	data.getDescription()[i0] = cdr.read_type_8();
        	
      }
      	

   }

   @Override
   public final void serialize(px4_msgs.msg.dds.OpenDroneIdSelfId data, us.ihmc.idl.InterchangeSerializer ser)
   {
      ser.write_type_12("timestamp", data.getTimestamp());
      ser.write_type_f("id_or_mac", data.getIdOrMac());
      ser.write_type_9("description_type", data.getDescriptionType());
      ser.write_type_f("description", data.getDescription());
   }

   @Override
   public final void deserialize(us.ihmc.idl.InterchangeSerializer ser, px4_msgs.msg.dds.OpenDroneIdSelfId data)
   {
      data.setTimestamp(ser.read_type_12("timestamp"));
      ser.read_type_f("id_or_mac", data.getIdOrMac());
      data.setDescriptionType(ser.read_type_9("description_type"));
      ser.read_type_f("description", data.getDescription());
   }

   public static void staticCopy(px4_msgs.msg.dds.OpenDroneIdSelfId src, px4_msgs.msg.dds.OpenDroneIdSelfId dest)
   {
      dest.set(src);
   }

   @Override
   public px4_msgs.msg.dds.OpenDroneIdSelfId createData()
   {
      return new px4_msgs.msg.dds.OpenDroneIdSelfId();
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
   
   public void serialize(px4_msgs.msg.dds.OpenDroneIdSelfId data, us.ihmc.idl.CDR cdr)
   {
      write(data, cdr);
   }

   public void deserialize(px4_msgs.msg.dds.OpenDroneIdSelfId data, us.ihmc.idl.CDR cdr)
   {
      read(data, cdr);
   }
   
   public void copy(px4_msgs.msg.dds.OpenDroneIdSelfId src, px4_msgs.msg.dds.OpenDroneIdSelfId dest)
   {
      staticCopy(src, dest);
   }

   @Override
   public OpenDroneIdSelfIdPubSubType newInstance()
   {
      return new OpenDroneIdSelfIdPubSubType();
   }
}
