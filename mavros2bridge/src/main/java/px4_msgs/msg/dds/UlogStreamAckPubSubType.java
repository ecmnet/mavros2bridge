package px4_msgs.msg.dds;

/**
* 
* Topic data type of the struct "UlogStreamAck" defined in "UlogStreamAck_.idl". Use this class to provide the TopicDataType to a Participant. 
*
* This file was automatically generated from UlogStreamAck_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit UlogStreamAck_.idl instead.
*
*/
public class UlogStreamAckPubSubType implements us.ihmc.pubsub.TopicDataType<px4_msgs.msg.dds.UlogStreamAck>
{
   public static final java.lang.String name = "px4_msgs::msg::dds_::UlogStreamAck_";
   
   @Override
   public final java.lang.String getDefinitionChecksum()
   {
   		return "a5e9f2cbfe45ac34b51709fdd2f85e5621fd8e7c94f24ec20314b3257dce9f2f";
   }
   
   @Override
   public final java.lang.String getDefinitionVersion()
   {
   		return "";
   }

   private final us.ihmc.idl.CDR serializeCDR = new us.ihmc.idl.CDR();
   private final us.ihmc.idl.CDR deserializeCDR = new us.ihmc.idl.CDR();

   @Override
   public void serialize(px4_msgs.msg.dds.UlogStreamAck data, us.ihmc.pubsub.common.SerializedPayload serializedPayload) throws java.io.IOException
   {
      serializeCDR.serialize(serializedPayload);
      write(data, serializeCDR);
      serializeCDR.finishSerialize();
   }

   @Override
   public void deserialize(us.ihmc.pubsub.common.SerializedPayload serializedPayload, px4_msgs.msg.dds.UlogStreamAck data) throws java.io.IOException
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


      return current_alignment - initial_alignment;
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.UlogStreamAck data)
   {
      return getCdrSerializedSize(data, 0);
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.UlogStreamAck data, int current_alignment)
   {
      int initial_alignment = current_alignment;

      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += 2 + us.ihmc.idl.CDR.alignment(current_alignment, 2);



      return current_alignment - initial_alignment;
   }

   public static void write(px4_msgs.msg.dds.UlogStreamAck data, us.ihmc.idl.CDR cdr)
   {
      cdr.write_type_12(data.getTimestamp());

      cdr.write_type_3(data.getMsgSequence());

   }

   public static void read(px4_msgs.msg.dds.UlogStreamAck data, us.ihmc.idl.CDR cdr)
   {
      data.setTimestamp(cdr.read_type_12());
      	
      data.setMsgSequence(cdr.read_type_3());
      	

   }

   @Override
   public final void serialize(px4_msgs.msg.dds.UlogStreamAck data, us.ihmc.idl.InterchangeSerializer ser)
   {
      ser.write_type_12("timestamp", data.getTimestamp());
      ser.write_type_3("msg_sequence", data.getMsgSequence());
   }

   @Override
   public final void deserialize(us.ihmc.idl.InterchangeSerializer ser, px4_msgs.msg.dds.UlogStreamAck data)
   {
      data.setTimestamp(ser.read_type_12("timestamp"));
      data.setMsgSequence(ser.read_type_3("msg_sequence"));
   }

   public static void staticCopy(px4_msgs.msg.dds.UlogStreamAck src, px4_msgs.msg.dds.UlogStreamAck dest)
   {
      dest.set(src);
   }

   @Override
   public px4_msgs.msg.dds.UlogStreamAck createData()
   {
      return new px4_msgs.msg.dds.UlogStreamAck();
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
   
   public void serialize(px4_msgs.msg.dds.UlogStreamAck data, us.ihmc.idl.CDR cdr)
   {
      write(data, cdr);
   }

   public void deserialize(px4_msgs.msg.dds.UlogStreamAck data, us.ihmc.idl.CDR cdr)
   {
      read(data, cdr);
   }
   
   public void copy(px4_msgs.msg.dds.UlogStreamAck src, px4_msgs.msg.dds.UlogStreamAck dest)
   {
      staticCopy(src, dest);
   }

   @Override
   public UlogStreamAckPubSubType newInstance()
   {
      return new UlogStreamAckPubSubType();
   }
}
