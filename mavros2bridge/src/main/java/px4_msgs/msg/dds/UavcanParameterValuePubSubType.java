package px4_msgs.msg.dds;

/**
* 
* Topic data type of the struct "UavcanParameterValue" defined in "UavcanParameterValue_.idl". Use this class to provide the TopicDataType to a Participant. 
*
* This file was automatically generated from UavcanParameterValue_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit UavcanParameterValue_.idl instead.
*
*/
public class UavcanParameterValuePubSubType implements us.ihmc.pubsub.TopicDataType<px4_msgs.msg.dds.UavcanParameterValue>
{
   public static final java.lang.String name = "px4_msgs::msg::dds_::UavcanParameterValue_";
   
   @Override
   public final java.lang.String getDefinitionChecksum()
   {
   		return "7420905f712d438d4716266f8f425adb0a871779449739b847c811bb3663ed47";
   }
   
   @Override
   public final java.lang.String getDefinitionVersion()
   {
   		return "";
   }

   private final us.ihmc.idl.CDR serializeCDR = new us.ihmc.idl.CDR();
   private final us.ihmc.idl.CDR deserializeCDR = new us.ihmc.idl.CDR();

   @Override
   public void serialize(px4_msgs.msg.dds.UavcanParameterValue data, us.ihmc.pubsub.common.SerializedPayload serializedPayload) throws java.io.IOException
   {
      serializeCDR.serialize(serializedPayload);
      write(data, serializeCDR);
      serializeCDR.finishSerialize();
   }

   @Override
   public void deserialize(us.ihmc.pubsub.common.SerializedPayload serializedPayload, px4_msgs.msg.dds.UavcanParameterValue data) throws java.io.IOException
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

      current_alignment += ((17) * 1) + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 2 + us.ihmc.idl.CDR.alignment(current_alignment, 2);

      current_alignment += 2 + us.ihmc.idl.CDR.alignment(current_alignment, 2);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      return current_alignment - initial_alignment;
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.UavcanParameterValue data)
   {
      return getCdrSerializedSize(data, 0);
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.UavcanParameterValue data, int current_alignment)
   {
      int initial_alignment = current_alignment;

      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += ((17) * 1) + us.ihmc.idl.CDR.alignment(current_alignment, 1);
      current_alignment += 2 + us.ihmc.idl.CDR.alignment(current_alignment, 2);


      current_alignment += 2 + us.ihmc.idl.CDR.alignment(current_alignment, 2);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);



      return current_alignment - initial_alignment;
   }

   public static void write(px4_msgs.msg.dds.UavcanParameterValue data, us.ihmc.idl.CDR cdr)
   {
      cdr.write_type_12(data.getTimestamp());

      cdr.write_type_9(data.getNodeId());

      for(int i0 = 0; i0 < data.getParamId().length; ++i0)
      {
        	cdr.write_type_8(data.getParamId()[i0]);	
      }

      cdr.write_type_1(data.getParamIndex());

      cdr.write_type_3(data.getParamCount());

      cdr.write_type_9(data.getParamType());

      cdr.write_type_11(data.getIntValue());

      cdr.write_type_5(data.getRealValue());

   }

   public static void read(px4_msgs.msg.dds.UavcanParameterValue data, us.ihmc.idl.CDR cdr)
   {
      data.setTimestamp(cdr.read_type_12());
      	
      data.setNodeId(cdr.read_type_9());
      	
      for(int i0 = 0; i0 < data.getParamId().length; ++i0)
      {
        	data.getParamId()[i0] = cdr.read_type_8();
        	
      }
      	
      data.setParamIndex(cdr.read_type_1());
      	
      data.setParamCount(cdr.read_type_3());
      	
      data.setParamType(cdr.read_type_9());
      	
      data.setIntValue(cdr.read_type_11());
      	
      data.setRealValue(cdr.read_type_5());
      	

   }

   @Override
   public final void serialize(px4_msgs.msg.dds.UavcanParameterValue data, us.ihmc.idl.InterchangeSerializer ser)
   {
      ser.write_type_12("timestamp", data.getTimestamp());
      ser.write_type_9("node_id", data.getNodeId());
      ser.write_type_f("param_id", data.getParamId());
      ser.write_type_1("param_index", data.getParamIndex());
      ser.write_type_3("param_count", data.getParamCount());
      ser.write_type_9("param_type", data.getParamType());
      ser.write_type_11("int_value", data.getIntValue());
      ser.write_type_5("real_value", data.getRealValue());
   }

   @Override
   public final void deserialize(us.ihmc.idl.InterchangeSerializer ser, px4_msgs.msg.dds.UavcanParameterValue data)
   {
      data.setTimestamp(ser.read_type_12("timestamp"));
      data.setNodeId(ser.read_type_9("node_id"));
      ser.read_type_f("param_id", data.getParamId());
      data.setParamIndex(ser.read_type_1("param_index"));
      data.setParamCount(ser.read_type_3("param_count"));
      data.setParamType(ser.read_type_9("param_type"));
      data.setIntValue(ser.read_type_11("int_value"));
      data.setRealValue(ser.read_type_5("real_value"));
   }

   public static void staticCopy(px4_msgs.msg.dds.UavcanParameterValue src, px4_msgs.msg.dds.UavcanParameterValue dest)
   {
      dest.set(src);
   }

   @Override
   public px4_msgs.msg.dds.UavcanParameterValue createData()
   {
      return new px4_msgs.msg.dds.UavcanParameterValue();
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
   
   public void serialize(px4_msgs.msg.dds.UavcanParameterValue data, us.ihmc.idl.CDR cdr)
   {
      write(data, cdr);
   }

   public void deserialize(px4_msgs.msg.dds.UavcanParameterValue data, us.ihmc.idl.CDR cdr)
   {
      read(data, cdr);
   }
   
   public void copy(px4_msgs.msg.dds.UavcanParameterValue src, px4_msgs.msg.dds.UavcanParameterValue dest)
   {
      staticCopy(src, dest);
   }

   @Override
   public UavcanParameterValuePubSubType newInstance()
   {
      return new UavcanParameterValuePubSubType();
   }
}
