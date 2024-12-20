package px4_msgs.msg.dds;

/**
* 
* Topic data type of the struct "MessageFormatRequest" defined in "MessageFormatRequest_.idl". Use this class to provide the TopicDataType to a Participant. 
*
* This file was automatically generated from MessageFormatRequest_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit MessageFormatRequest_.idl instead.
*
*/
public class MessageFormatRequestPubSubType implements us.ihmc.pubsub.TopicDataType<px4_msgs.msg.dds.MessageFormatRequest>
{
   public static final java.lang.String name = "px4_msgs::msg::dds_::MessageFormatRequest_";
   
   @Override
   public final java.lang.String getDefinitionChecksum()
   {
   		return "9fb900136d982efe9f34e102cc9b79b0f820489b0fd1afe51089b304e3bfe6d5";
   }
   
   @Override
   public final java.lang.String getDefinitionVersion()
   {
   		return "";
   }

   private final us.ihmc.idl.CDR serializeCDR = new us.ihmc.idl.CDR();
   private final us.ihmc.idl.CDR deserializeCDR = new us.ihmc.idl.CDR();

   @Override
   public void serialize(px4_msgs.msg.dds.MessageFormatRequest data, us.ihmc.pubsub.common.SerializedPayload serializedPayload) throws java.io.IOException
   {
      serializeCDR.serialize(serializedPayload);
      write(data, serializeCDR);
      serializeCDR.finishSerialize();
   }

   @Override
   public void deserialize(us.ihmc.pubsub.common.SerializedPayload serializedPayload, px4_msgs.msg.dds.MessageFormatRequest data) throws java.io.IOException
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


      return current_alignment - initial_alignment;
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.MessageFormatRequest data)
   {
      return getCdrSerializedSize(data, 0);
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.MessageFormatRequest data, int current_alignment)
   {
      int initial_alignment = current_alignment;

      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += 2 + us.ihmc.idl.CDR.alignment(current_alignment, 2);


      current_alignment += ((50) * 1) + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      return current_alignment - initial_alignment;
   }

   public static void write(px4_msgs.msg.dds.MessageFormatRequest data, us.ihmc.idl.CDR cdr)
   {
      cdr.write_type_12(data.getTimestamp());

      cdr.write_type_3(data.getProtocolVersion());

      for(int i0 = 0; i0 < data.getTopicName().length; ++i0)
      {
        	cdr.write_type_8(data.getTopicName()[i0]);	
      }

   }

   public static void read(px4_msgs.msg.dds.MessageFormatRequest data, us.ihmc.idl.CDR cdr)
   {
      data.setTimestamp(cdr.read_type_12());
      	
      data.setProtocolVersion(cdr.read_type_3());
      	
      for(int i0 = 0; i0 < data.getTopicName().length; ++i0)
      {
        	data.getTopicName()[i0] = cdr.read_type_8();
        	
      }
      	

   }

   @Override
   public final void serialize(px4_msgs.msg.dds.MessageFormatRequest data, us.ihmc.idl.InterchangeSerializer ser)
   {
      ser.write_type_12("timestamp", data.getTimestamp());
      ser.write_type_3("protocol_version", data.getProtocolVersion());
      ser.write_type_f("topic_name", data.getTopicName());
   }

   @Override
   public final void deserialize(us.ihmc.idl.InterchangeSerializer ser, px4_msgs.msg.dds.MessageFormatRequest data)
   {
      data.setTimestamp(ser.read_type_12("timestamp"));
      data.setProtocolVersion(ser.read_type_3("protocol_version"));
      ser.read_type_f("topic_name", data.getTopicName());
   }

   public static void staticCopy(px4_msgs.msg.dds.MessageFormatRequest src, px4_msgs.msg.dds.MessageFormatRequest dest)
   {
      dest.set(src);
   }

   @Override
   public px4_msgs.msg.dds.MessageFormatRequest createData()
   {
      return new px4_msgs.msg.dds.MessageFormatRequest();
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
   
   public void serialize(px4_msgs.msg.dds.MessageFormatRequest data, us.ihmc.idl.CDR cdr)
   {
      write(data, cdr);
   }

   public void deserialize(px4_msgs.msg.dds.MessageFormatRequest data, us.ihmc.idl.CDR cdr)
   {
      read(data, cdr);
   }
   
   public void copy(px4_msgs.msg.dds.MessageFormatRequest src, px4_msgs.msg.dds.MessageFormatRequest dest)
   {
      staticCopy(src, dest);
   }

   @Override
   public MessageFormatRequestPubSubType newInstance()
   {
      return new MessageFormatRequestPubSubType();
   }
}
