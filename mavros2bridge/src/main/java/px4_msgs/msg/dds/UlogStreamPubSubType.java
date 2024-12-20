package px4_msgs.msg.dds;

/**
* 
* Topic data type of the struct "UlogStream" defined in "UlogStream_.idl". Use this class to provide the TopicDataType to a Participant. 
*
* This file was automatically generated from UlogStream_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit UlogStream_.idl instead.
*
*/
public class UlogStreamPubSubType implements us.ihmc.pubsub.TopicDataType<px4_msgs.msg.dds.UlogStream>
{
   public static final java.lang.String name = "px4_msgs::msg::dds_::UlogStream_";
   
   @Override
   public final java.lang.String getDefinitionChecksum()
   {
   		return "41ed342aa4600ce2b1ce56fbe4739ae23aa24da7256cbec5567e3457a22da1ac";
   }
   
   @Override
   public final java.lang.String getDefinitionVersion()
   {
   		return "";
   }

   private final us.ihmc.idl.CDR serializeCDR = new us.ihmc.idl.CDR();
   private final us.ihmc.idl.CDR deserializeCDR = new us.ihmc.idl.CDR();

   @Override
   public void serialize(px4_msgs.msg.dds.UlogStream data, us.ihmc.pubsub.common.SerializedPayload serializedPayload) throws java.io.IOException
   {
      serializeCDR.serialize(serializedPayload);
      write(data, serializeCDR);
      serializeCDR.finishSerialize();
   }

   @Override
   public void deserialize(us.ihmc.pubsub.common.SerializedPayload serializedPayload, px4_msgs.msg.dds.UlogStream data) throws java.io.IOException
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

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += ((249) * 1) + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      return current_alignment - initial_alignment;
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.UlogStream data)
   {
      return getCdrSerializedSize(data, 0);
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.UlogStream data, int current_alignment)
   {
      int initial_alignment = current_alignment;

      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 2 + us.ihmc.idl.CDR.alignment(current_alignment, 2);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += ((249) * 1) + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      return current_alignment - initial_alignment;
   }

   public static void write(px4_msgs.msg.dds.UlogStream data, us.ihmc.idl.CDR cdr)
   {
      cdr.write_type_12(data.getTimestamp());

      cdr.write_type_9(data.getLength());

      cdr.write_type_9(data.getFirstMessageOffset());

      cdr.write_type_3(data.getMsgSequence());

      cdr.write_type_9(data.getFlags());

      for(int i0 = 0; i0 < data.getData().length; ++i0)
      {
        	cdr.write_type_9(data.getData()[i0]);	
      }

   }

   public static void read(px4_msgs.msg.dds.UlogStream data, us.ihmc.idl.CDR cdr)
   {
      data.setTimestamp(cdr.read_type_12());
      	
      data.setLength(cdr.read_type_9());
      	
      data.setFirstMessageOffset(cdr.read_type_9());
      	
      data.setMsgSequence(cdr.read_type_3());
      	
      data.setFlags(cdr.read_type_9());
      	
      for(int i0 = 0; i0 < data.getData().length; ++i0)
      {
        	data.getData()[i0] = cdr.read_type_9();
        	
      }
      	

   }

   @Override
   public final void serialize(px4_msgs.msg.dds.UlogStream data, us.ihmc.idl.InterchangeSerializer ser)
   {
      ser.write_type_12("timestamp", data.getTimestamp());
      ser.write_type_9("length", data.getLength());
      ser.write_type_9("first_message_offset", data.getFirstMessageOffset());
      ser.write_type_3("msg_sequence", data.getMsgSequence());
      ser.write_type_9("flags", data.getFlags());
      ser.write_type_f("data", data.getData());
   }

   @Override
   public final void deserialize(us.ihmc.idl.InterchangeSerializer ser, px4_msgs.msg.dds.UlogStream data)
   {
      data.setTimestamp(ser.read_type_12("timestamp"));
      data.setLength(ser.read_type_9("length"));
      data.setFirstMessageOffset(ser.read_type_9("first_message_offset"));
      data.setMsgSequence(ser.read_type_3("msg_sequence"));
      data.setFlags(ser.read_type_9("flags"));
      ser.read_type_f("data", data.getData());
   }

   public static void staticCopy(px4_msgs.msg.dds.UlogStream src, px4_msgs.msg.dds.UlogStream dest)
   {
      dest.set(src);
   }

   @Override
   public px4_msgs.msg.dds.UlogStream createData()
   {
      return new px4_msgs.msg.dds.UlogStream();
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
   
   public void serialize(px4_msgs.msg.dds.UlogStream data, us.ihmc.idl.CDR cdr)
   {
      write(data, cdr);
   }

   public void deserialize(px4_msgs.msg.dds.UlogStream data, us.ihmc.idl.CDR cdr)
   {
      read(data, cdr);
   }
   
   public void copy(px4_msgs.msg.dds.UlogStream src, px4_msgs.msg.dds.UlogStream dest)
   {
      staticCopy(src, dest);
   }

   @Override
   public UlogStreamPubSubType newInstance()
   {
      return new UlogStreamPubSubType();
   }
}
