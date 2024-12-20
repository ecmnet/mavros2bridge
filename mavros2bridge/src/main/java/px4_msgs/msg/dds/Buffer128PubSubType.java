package px4_msgs.msg.dds;

/**
* 
* Topic data type of the struct "Buffer128" defined in "Buffer128_.idl". Use this class to provide the TopicDataType to a Participant. 
*
* This file was automatically generated from Buffer128_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit Buffer128_.idl instead.
*
*/
public class Buffer128PubSubType implements us.ihmc.pubsub.TopicDataType<px4_msgs.msg.dds.Buffer128>
{
   public static final java.lang.String name = "px4_msgs::msg::dds_::Buffer128_";
   
   @Override
   public final java.lang.String getDefinitionChecksum()
   {
   		return "b962c26be9279444e102133c1249ad6e910deb892f287e1edeb1b1825277ab02";
   }
   
   @Override
   public final java.lang.String getDefinitionVersion()
   {
   		return "";
   }

   private final us.ihmc.idl.CDR serializeCDR = new us.ihmc.idl.CDR();
   private final us.ihmc.idl.CDR deserializeCDR = new us.ihmc.idl.CDR();

   @Override
   public void serialize(px4_msgs.msg.dds.Buffer128 data, us.ihmc.pubsub.common.SerializedPayload serializedPayload) throws java.io.IOException
   {
      serializeCDR.serialize(serializedPayload);
      write(data, serializeCDR);
      serializeCDR.finishSerialize();
   }

   @Override
   public void deserialize(us.ihmc.pubsub.common.SerializedPayload serializedPayload, px4_msgs.msg.dds.Buffer128 data) throws java.io.IOException
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

      current_alignment += ((128) * 1) + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      return current_alignment - initial_alignment;
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.Buffer128 data)
   {
      return getCdrSerializedSize(data, 0);
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.Buffer128 data, int current_alignment)
   {
      int initial_alignment = current_alignment;

      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += ((128) * 1) + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      return current_alignment - initial_alignment;
   }

   public static void write(px4_msgs.msg.dds.Buffer128 data, us.ihmc.idl.CDR cdr)
   {
      cdr.write_type_12(data.getTimestamp());

      cdr.write_type_9(data.getLen());

      for(int i0 = 0; i0 < data.getData().length; ++i0)
      {
        	cdr.write_type_9(data.getData()[i0]);	
      }

   }

   public static void read(px4_msgs.msg.dds.Buffer128 data, us.ihmc.idl.CDR cdr)
   {
      data.setTimestamp(cdr.read_type_12());
      	
      data.setLen(cdr.read_type_9());
      	
      for(int i0 = 0; i0 < data.getData().length; ++i0)
      {
        	data.getData()[i0] = cdr.read_type_9();
        	
      }
      	

   }

   @Override
   public final void serialize(px4_msgs.msg.dds.Buffer128 data, us.ihmc.idl.InterchangeSerializer ser)
   {
      ser.write_type_12("timestamp", data.getTimestamp());
      ser.write_type_9("len", data.getLen());
      ser.write_type_f("data", data.getData());
   }

   @Override
   public final void deserialize(us.ihmc.idl.InterchangeSerializer ser, px4_msgs.msg.dds.Buffer128 data)
   {
      data.setTimestamp(ser.read_type_12("timestamp"));
      data.setLen(ser.read_type_9("len"));
      ser.read_type_f("data", data.getData());
   }

   public static void staticCopy(px4_msgs.msg.dds.Buffer128 src, px4_msgs.msg.dds.Buffer128 dest)
   {
      dest.set(src);
   }

   @Override
   public px4_msgs.msg.dds.Buffer128 createData()
   {
      return new px4_msgs.msg.dds.Buffer128();
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
   
   public void serialize(px4_msgs.msg.dds.Buffer128 data, us.ihmc.idl.CDR cdr)
   {
      write(data, cdr);
   }

   public void deserialize(px4_msgs.msg.dds.Buffer128 data, us.ihmc.idl.CDR cdr)
   {
      read(data, cdr);
   }
   
   public void copy(px4_msgs.msg.dds.Buffer128 src, px4_msgs.msg.dds.Buffer128 dest)
   {
      staticCopy(src, dest);
   }

   @Override
   public Buffer128PubSubType newInstance()
   {
      return new Buffer128PubSubType();
   }
}
