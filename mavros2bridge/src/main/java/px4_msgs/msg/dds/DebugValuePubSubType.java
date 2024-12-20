package px4_msgs.msg.dds;

/**
* 
* Topic data type of the struct "DebugValue" defined in "DebugValue_.idl". Use this class to provide the TopicDataType to a Participant. 
*
* This file was automatically generated from DebugValue_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit DebugValue_.idl instead.
*
*/
public class DebugValuePubSubType implements us.ihmc.pubsub.TopicDataType<px4_msgs.msg.dds.DebugValue>
{
   public static final java.lang.String name = "px4_msgs::msg::dds_::DebugValue_";
   
   @Override
   public final java.lang.String getDefinitionChecksum()
   {
   		return "e2134d1933424c45d964c29f6c6f4142ad0419b4984bac61d48565ba842181a1";
   }
   
   @Override
   public final java.lang.String getDefinitionVersion()
   {
   		return "";
   }

   private final us.ihmc.idl.CDR serializeCDR = new us.ihmc.idl.CDR();
   private final us.ihmc.idl.CDR deserializeCDR = new us.ihmc.idl.CDR();

   @Override
   public void serialize(px4_msgs.msg.dds.DebugValue data, us.ihmc.pubsub.common.SerializedPayload serializedPayload) throws java.io.IOException
   {
      serializeCDR.serialize(serializedPayload);
      write(data, serializeCDR);
      serializeCDR.finishSerialize();
   }

   @Override
   public void deserialize(us.ihmc.pubsub.common.SerializedPayload serializedPayload, px4_msgs.msg.dds.DebugValue data) throws java.io.IOException
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

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      return current_alignment - initial_alignment;
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.DebugValue data)
   {
      return getCdrSerializedSize(data, 0);
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.DebugValue data, int current_alignment)
   {
      int initial_alignment = current_alignment;

      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);



      return current_alignment - initial_alignment;
   }

   public static void write(px4_msgs.msg.dds.DebugValue data, us.ihmc.idl.CDR cdr)
   {
      cdr.write_type_12(data.getTimestamp());

      cdr.write_type_9(data.getInd());

      cdr.write_type_5(data.getValue());

   }

   public static void read(px4_msgs.msg.dds.DebugValue data, us.ihmc.idl.CDR cdr)
   {
      data.setTimestamp(cdr.read_type_12());
      	
      data.setInd(cdr.read_type_9());
      	
      data.setValue(cdr.read_type_5());
      	

   }

   @Override
   public final void serialize(px4_msgs.msg.dds.DebugValue data, us.ihmc.idl.InterchangeSerializer ser)
   {
      ser.write_type_12("timestamp", data.getTimestamp());
      ser.write_type_9("ind", data.getInd());
      ser.write_type_5("value", data.getValue());
   }

   @Override
   public final void deserialize(us.ihmc.idl.InterchangeSerializer ser, px4_msgs.msg.dds.DebugValue data)
   {
      data.setTimestamp(ser.read_type_12("timestamp"));
      data.setInd(ser.read_type_9("ind"));
      data.setValue(ser.read_type_5("value"));
   }

   public static void staticCopy(px4_msgs.msg.dds.DebugValue src, px4_msgs.msg.dds.DebugValue dest)
   {
      dest.set(src);
   }

   @Override
   public px4_msgs.msg.dds.DebugValue createData()
   {
      return new px4_msgs.msg.dds.DebugValue();
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
   
   public void serialize(px4_msgs.msg.dds.DebugValue data, us.ihmc.idl.CDR cdr)
   {
      write(data, cdr);
   }

   public void deserialize(px4_msgs.msg.dds.DebugValue data, us.ihmc.idl.CDR cdr)
   {
      read(data, cdr);
   }
   
   public void copy(px4_msgs.msg.dds.DebugValue src, px4_msgs.msg.dds.DebugValue dest)
   {
      staticCopy(src, dest);
   }

   @Override
   public DebugValuePubSubType newInstance()
   {
      return new DebugValuePubSubType();
   }
}
