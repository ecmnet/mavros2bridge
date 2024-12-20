package px4_msgs.msg.dds;

/**
* 
* Topic data type of the struct "MessageFormatResponse" defined in "MessageFormatResponse_.idl". Use this class to provide the TopicDataType to a Participant. 
*
* This file was automatically generated from MessageFormatResponse_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit MessageFormatResponse_.idl instead.
*
*/
public class MessageFormatResponsePubSubType implements us.ihmc.pubsub.TopicDataType<px4_msgs.msg.dds.MessageFormatResponse>
{
   public static final java.lang.String name = "px4_msgs::msg::dds_::MessageFormatResponse_";
   
   @Override
   public final java.lang.String getDefinitionChecksum()
   {
   		return "812c80c4c1faeab8e4e4f6b0045d7bbb7dbb38bd4d076b3dc19db8bb66e60991";
   }
   
   @Override
   public final java.lang.String getDefinitionVersion()
   {
   		return "";
   }

   private final us.ihmc.idl.CDR serializeCDR = new us.ihmc.idl.CDR();
   private final us.ihmc.idl.CDR deserializeCDR = new us.ihmc.idl.CDR();

   @Override
   public void serialize(px4_msgs.msg.dds.MessageFormatResponse data, us.ihmc.pubsub.common.SerializedPayload serializedPayload) throws java.io.IOException
   {
      serializeCDR.serialize(serializedPayload);
      write(data, serializeCDR);
      serializeCDR.finishSerialize();
   }

   @Override
   public void deserialize(us.ihmc.pubsub.common.SerializedPayload serializedPayload, px4_msgs.msg.dds.MessageFormatResponse data) throws java.io.IOException
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

      current_alignment += 2 + us.ihmc.idl.CDR.alignment(current_alignment, 2);

      current_alignment += ((50) * 1) + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      return current_alignment - initial_alignment;
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.MessageFormatResponse data)
   {
      return getCdrSerializedSize(data, 0);
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.MessageFormatResponse data, int current_alignment)
   {
      int initial_alignment = current_alignment;

      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += 2 + us.ihmc.idl.CDR.alignment(current_alignment, 2);


      current_alignment += ((50) * 1) + us.ihmc.idl.CDR.alignment(current_alignment, 1);
      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);



      return current_alignment - initial_alignment;
   }

   public static void write(px4_msgs.msg.dds.MessageFormatResponse data, us.ihmc.idl.CDR cdr)
   {
      cdr.write_type_12(data.getTimestamp());

      cdr.write_type_3(data.getProtocolVersion());

      for(int i0 = 0; i0 < data.getTopicName().length; ++i0)
      {
        	cdr.write_type_8(data.getTopicName()[i0]);	
      }

      cdr.write_type_7(data.getSuccess());

      cdr.write_type_4(data.getMessageHash());

   }

   public static void read(px4_msgs.msg.dds.MessageFormatResponse data, us.ihmc.idl.CDR cdr)
   {
      data.setTimestamp(cdr.read_type_12());
      	
      data.setProtocolVersion(cdr.read_type_3());
      	
      for(int i0 = 0; i0 < data.getTopicName().length; ++i0)
      {
        	data.getTopicName()[i0] = cdr.read_type_8();
        	
      }
      	
      data.setSuccess(cdr.read_type_7());
      	
      data.setMessageHash(cdr.read_type_4());
      	

   }

   @Override
   public final void serialize(px4_msgs.msg.dds.MessageFormatResponse data, us.ihmc.idl.InterchangeSerializer ser)
   {
      ser.write_type_12("timestamp", data.getTimestamp());
      ser.write_type_3("protocol_version", data.getProtocolVersion());
      ser.write_type_f("topic_name", data.getTopicName());
      ser.write_type_7("success", data.getSuccess());
      ser.write_type_4("message_hash", data.getMessageHash());
   }

   @Override
   public final void deserialize(us.ihmc.idl.InterchangeSerializer ser, px4_msgs.msg.dds.MessageFormatResponse data)
   {
      data.setTimestamp(ser.read_type_12("timestamp"));
      data.setProtocolVersion(ser.read_type_3("protocol_version"));
      ser.read_type_f("topic_name", data.getTopicName());
      data.setSuccess(ser.read_type_7("success"));
      data.setMessageHash(ser.read_type_4("message_hash"));
   }

   public static void staticCopy(px4_msgs.msg.dds.MessageFormatResponse src, px4_msgs.msg.dds.MessageFormatResponse dest)
   {
      dest.set(src);
   }

   @Override
   public px4_msgs.msg.dds.MessageFormatResponse createData()
   {
      return new px4_msgs.msg.dds.MessageFormatResponse();
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
   
   public void serialize(px4_msgs.msg.dds.MessageFormatResponse data, us.ihmc.idl.CDR cdr)
   {
      write(data, cdr);
   }

   public void deserialize(px4_msgs.msg.dds.MessageFormatResponse data, us.ihmc.idl.CDR cdr)
   {
      read(data, cdr);
   }
   
   public void copy(px4_msgs.msg.dds.MessageFormatResponse src, px4_msgs.msg.dds.MessageFormatResponse dest)
   {
      staticCopy(src, dest);
   }

   @Override
   public MessageFormatResponsePubSubType newInstance()
   {
      return new MessageFormatResponsePubSubType();
   }
}
