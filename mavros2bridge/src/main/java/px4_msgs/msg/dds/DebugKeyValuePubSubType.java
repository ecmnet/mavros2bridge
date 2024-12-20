package px4_msgs.msg.dds;

/**
* 
* Topic data type of the struct "DebugKeyValue" defined in "DebugKeyValue_.idl". Use this class to provide the TopicDataType to a Participant. 
*
* This file was automatically generated from DebugKeyValue_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit DebugKeyValue_.idl instead.
*
*/
public class DebugKeyValuePubSubType implements us.ihmc.pubsub.TopicDataType<px4_msgs.msg.dds.DebugKeyValue>
{
   public static final java.lang.String name = "px4_msgs::msg::dds_::DebugKeyValue_";
   
   @Override
   public final java.lang.String getDefinitionChecksum()
   {
   		return "331871054f074f8e3d6676618e134ece1da42362a11901cbdf8b981e0e39996a";
   }
   
   @Override
   public final java.lang.String getDefinitionVersion()
   {
   		return "";
   }

   private final us.ihmc.idl.CDR serializeCDR = new us.ihmc.idl.CDR();
   private final us.ihmc.idl.CDR deserializeCDR = new us.ihmc.idl.CDR();

   @Override
   public void serialize(px4_msgs.msg.dds.DebugKeyValue data, us.ihmc.pubsub.common.SerializedPayload serializedPayload) throws java.io.IOException
   {
      serializeCDR.serialize(serializedPayload);
      write(data, serializeCDR);
      serializeCDR.finishSerialize();
   }

   @Override
   public void deserialize(us.ihmc.pubsub.common.SerializedPayload serializedPayload, px4_msgs.msg.dds.DebugKeyValue data) throws java.io.IOException
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

      current_alignment += ((10) * 1) + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      return current_alignment - initial_alignment;
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.DebugKeyValue data)
   {
      return getCdrSerializedSize(data, 0);
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.DebugKeyValue data, int current_alignment)
   {
      int initial_alignment = current_alignment;

      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += ((10) * 1) + us.ihmc.idl.CDR.alignment(current_alignment, 1);
      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);



      return current_alignment - initial_alignment;
   }

   public static void write(px4_msgs.msg.dds.DebugKeyValue data, us.ihmc.idl.CDR cdr)
   {
      cdr.write_type_12(data.getTimestamp());

      for(int i0 = 0; i0 < data.getKey().length; ++i0)
      {
        	cdr.write_type_8(data.getKey()[i0]);	
      }

      cdr.write_type_5(data.getValue());

   }

   public static void read(px4_msgs.msg.dds.DebugKeyValue data, us.ihmc.idl.CDR cdr)
   {
      data.setTimestamp(cdr.read_type_12());
      	
      for(int i0 = 0; i0 < data.getKey().length; ++i0)
      {
        	data.getKey()[i0] = cdr.read_type_8();
        	
      }
      	
      data.setValue(cdr.read_type_5());
      	

   }

   @Override
   public final void serialize(px4_msgs.msg.dds.DebugKeyValue data, us.ihmc.idl.InterchangeSerializer ser)
   {
      ser.write_type_12("timestamp", data.getTimestamp());
      ser.write_type_f("key", data.getKey());
      ser.write_type_5("value", data.getValue());
   }

   @Override
   public final void deserialize(us.ihmc.idl.InterchangeSerializer ser, px4_msgs.msg.dds.DebugKeyValue data)
   {
      data.setTimestamp(ser.read_type_12("timestamp"));
      ser.read_type_f("key", data.getKey());
      data.setValue(ser.read_type_5("value"));
   }

   public static void staticCopy(px4_msgs.msg.dds.DebugKeyValue src, px4_msgs.msg.dds.DebugKeyValue dest)
   {
      dest.set(src);
   }

   @Override
   public px4_msgs.msg.dds.DebugKeyValue createData()
   {
      return new px4_msgs.msg.dds.DebugKeyValue();
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
   
   public void serialize(px4_msgs.msg.dds.DebugKeyValue data, us.ihmc.idl.CDR cdr)
   {
      write(data, cdr);
   }

   public void deserialize(px4_msgs.msg.dds.DebugKeyValue data, us.ihmc.idl.CDR cdr)
   {
      read(data, cdr);
   }
   
   public void copy(px4_msgs.msg.dds.DebugKeyValue src, px4_msgs.msg.dds.DebugKeyValue dest)
   {
      staticCopy(src, dest);
   }

   @Override
   public DebugKeyValuePubSubType newInstance()
   {
      return new DebugKeyValuePubSubType();
   }
}
