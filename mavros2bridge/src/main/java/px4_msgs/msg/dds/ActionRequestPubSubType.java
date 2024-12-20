package px4_msgs.msg.dds;

/**
* 
* Topic data type of the struct "ActionRequest" defined in "ActionRequest_.idl". Use this class to provide the TopicDataType to a Participant. 
*
* This file was automatically generated from ActionRequest_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit ActionRequest_.idl instead.
*
*/
public class ActionRequestPubSubType implements us.ihmc.pubsub.TopicDataType<px4_msgs.msg.dds.ActionRequest>
{
   public static final java.lang.String name = "px4_msgs::msg::dds_::ActionRequest_";
   
   @Override
   public final java.lang.String getDefinitionChecksum()
   {
   		return "1b96d8e412204db847e18f46bf70119dc4dc7d6963b7fdc7d4891887f4df873a";
   }
   
   @Override
   public final java.lang.String getDefinitionVersion()
   {
   		return "";
   }

   private final us.ihmc.idl.CDR serializeCDR = new us.ihmc.idl.CDR();
   private final us.ihmc.idl.CDR deserializeCDR = new us.ihmc.idl.CDR();

   @Override
   public void serialize(px4_msgs.msg.dds.ActionRequest data, us.ihmc.pubsub.common.SerializedPayload serializedPayload) throws java.io.IOException
   {
      serializeCDR.serialize(serializedPayload);
      write(data, serializeCDR);
      serializeCDR.finishSerialize();
   }

   @Override
   public void deserialize(us.ihmc.pubsub.common.SerializedPayload serializedPayload, px4_msgs.msg.dds.ActionRequest data) throws java.io.IOException
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


      return current_alignment - initial_alignment;
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.ActionRequest data)
   {
      return getCdrSerializedSize(data, 0);
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.ActionRequest data, int current_alignment)
   {
      int initial_alignment = current_alignment;

      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);



      return current_alignment - initial_alignment;
   }

   public static void write(px4_msgs.msg.dds.ActionRequest data, us.ihmc.idl.CDR cdr)
   {
      cdr.write_type_12(data.getTimestamp());

      cdr.write_type_9(data.getAction());

      cdr.write_type_9((byte) data.getSource());

      cdr.write_type_9(data.getMode());

   }

   public static void read(px4_msgs.msg.dds.ActionRequest data, us.ihmc.idl.CDR cdr)
   {
      data.setTimestamp(cdr.read_type_12());
      	
      data.setAction(cdr.read_type_9());
      	
      data.setSource(cdr.read_type_9());
      	
      data.setMode(cdr.read_type_9());
      	

   }

   @Override
   public final void serialize(px4_msgs.msg.dds.ActionRequest data, us.ihmc.idl.InterchangeSerializer ser)
   {
      ser.write_type_12("timestamp", data.getTimestamp());
      ser.write_type_9("action", data.getAction());
      ser.write_type_9("source", (byte) data.getSource());
      ser.write_type_9("mode", data.getMode());
   }

   @Override
   public final void deserialize(us.ihmc.idl.InterchangeSerializer ser, px4_msgs.msg.dds.ActionRequest data)
   {
      data.setTimestamp(ser.read_type_12("timestamp"));
      data.setAction(ser.read_type_9("action"));
      data.setSource(ser.read_type_9("source"));
      data.setMode(ser.read_type_9("mode"));
   }

   public static void staticCopy(px4_msgs.msg.dds.ActionRequest src, px4_msgs.msg.dds.ActionRequest dest)
   {
      dest.set(src);
   }

   @Override
   public px4_msgs.msg.dds.ActionRequest createData()
   {
      return new px4_msgs.msg.dds.ActionRequest();
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
   
   public void serialize(px4_msgs.msg.dds.ActionRequest data, us.ihmc.idl.CDR cdr)
   {
      write(data, cdr);
   }

   public void deserialize(px4_msgs.msg.dds.ActionRequest data, us.ihmc.idl.CDR cdr)
   {
      read(data, cdr);
   }
   
   public void copy(px4_msgs.msg.dds.ActionRequest src, px4_msgs.msg.dds.ActionRequest dest)
   {
      staticCopy(src, dest);
   }

   @Override
   public ActionRequestPubSubType newInstance()
   {
      return new ActionRequestPubSubType();
   }
}
