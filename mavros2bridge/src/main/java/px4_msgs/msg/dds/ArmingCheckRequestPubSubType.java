package px4_msgs.msg.dds;

/**
* 
* Topic data type of the struct "ArmingCheckRequest" defined in "ArmingCheckRequest_.idl". Use this class to provide the TopicDataType to a Participant. 
*
* This file was automatically generated from ArmingCheckRequest_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit ArmingCheckRequest_.idl instead.
*
*/
public class ArmingCheckRequestPubSubType implements us.ihmc.pubsub.TopicDataType<px4_msgs.msg.dds.ArmingCheckRequest>
{
   public static final java.lang.String name = "px4_msgs::msg::dds_::ArmingCheckRequest_";
   
   @Override
   public final java.lang.String getDefinitionChecksum()
   {
   		return "a068afa67e479a83c800f62c9200a6f55ed655b7a9857377496f7bbea1328af5";
   }
   
   @Override
   public final java.lang.String getDefinitionVersion()
   {
   		return "";
   }

   private final us.ihmc.idl.CDR serializeCDR = new us.ihmc.idl.CDR();
   private final us.ihmc.idl.CDR deserializeCDR = new us.ihmc.idl.CDR();

   @Override
   public void serialize(px4_msgs.msg.dds.ArmingCheckRequest data, us.ihmc.pubsub.common.SerializedPayload serializedPayload) throws java.io.IOException
   {
      serializeCDR.serialize(serializedPayload);
      write(data, serializeCDR);
      serializeCDR.finishSerialize();
   }

   @Override
   public void deserialize(us.ihmc.pubsub.common.SerializedPayload serializedPayload, px4_msgs.msg.dds.ArmingCheckRequest data) throws java.io.IOException
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


      return current_alignment - initial_alignment;
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.ArmingCheckRequest data)
   {
      return getCdrSerializedSize(data, 0);
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.ArmingCheckRequest data, int current_alignment)
   {
      int initial_alignment = current_alignment;

      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);



      return current_alignment - initial_alignment;
   }

   public static void write(px4_msgs.msg.dds.ArmingCheckRequest data, us.ihmc.idl.CDR cdr)
   {
      cdr.write_type_12(data.getTimestamp());

      cdr.write_type_9(data.getRequestId());

   }

   public static void read(px4_msgs.msg.dds.ArmingCheckRequest data, us.ihmc.idl.CDR cdr)
   {
      data.setTimestamp(cdr.read_type_12());
      	
      data.setRequestId(cdr.read_type_9());
      	

   }

   @Override
   public final void serialize(px4_msgs.msg.dds.ArmingCheckRequest data, us.ihmc.idl.InterchangeSerializer ser)
   {
      ser.write_type_12("timestamp", data.getTimestamp());
      ser.write_type_9("request_id", data.getRequestId());
   }

   @Override
   public final void deserialize(us.ihmc.idl.InterchangeSerializer ser, px4_msgs.msg.dds.ArmingCheckRequest data)
   {
      data.setTimestamp(ser.read_type_12("timestamp"));
      data.setRequestId(ser.read_type_9("request_id"));
   }

   public static void staticCopy(px4_msgs.msg.dds.ArmingCheckRequest src, px4_msgs.msg.dds.ArmingCheckRequest dest)
   {
      dest.set(src);
   }

   @Override
   public px4_msgs.msg.dds.ArmingCheckRequest createData()
   {
      return new px4_msgs.msg.dds.ArmingCheckRequest();
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
   
   public void serialize(px4_msgs.msg.dds.ArmingCheckRequest data, us.ihmc.idl.CDR cdr)
   {
      write(data, cdr);
   }

   public void deserialize(px4_msgs.msg.dds.ArmingCheckRequest data, us.ihmc.idl.CDR cdr)
   {
      read(data, cdr);
   }
   
   public void copy(px4_msgs.msg.dds.ArmingCheckRequest src, px4_msgs.msg.dds.ArmingCheckRequest dest)
   {
      staticCopy(src, dest);
   }

   @Override
   public ArmingCheckRequestPubSubType newInstance()
   {
      return new ArmingCheckRequestPubSubType();
   }
}