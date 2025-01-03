package px4_msgs.msg.dds;

/**
* 
* Topic data type of the struct "ParameterSetValueRequest" defined in "ParameterSetValueRequest_.idl". Use this class to provide the TopicDataType to a Participant. 
*
* This file was automatically generated from ParameterSetValueRequest_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit ParameterSetValueRequest_.idl instead.
*
*/
public class ParameterSetValueRequestPubSubType implements us.ihmc.pubsub.TopicDataType<px4_msgs.msg.dds.ParameterSetValueRequest>
{
   public static final java.lang.String name = "px4_msgs::msg::dds_::ParameterSetValueRequest_";
   
   @Override
   public final java.lang.String getDefinitionChecksum()
   {
   		return "4e2291d551eb5353e5b8abb2129102adfaf1a152ae6a094b2a1da5b061c3c8db";
   }
   
   @Override
   public final java.lang.String getDefinitionVersion()
   {
   		return "";
   }

   private final us.ihmc.idl.CDR serializeCDR = new us.ihmc.idl.CDR();
   private final us.ihmc.idl.CDR deserializeCDR = new us.ihmc.idl.CDR();

   @Override
   public void serialize(px4_msgs.msg.dds.ParameterSetValueRequest data, us.ihmc.pubsub.common.SerializedPayload serializedPayload) throws java.io.IOException
   {
      serializeCDR.serialize(serializedPayload);
      write(data, serializeCDR);
      serializeCDR.finishSerialize();
   }

   @Override
   public void deserialize(us.ihmc.pubsub.common.SerializedPayload serializedPayload, px4_msgs.msg.dds.ParameterSetValueRequest data) throws java.io.IOException
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

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      return current_alignment - initial_alignment;
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.ParameterSetValueRequest data)
   {
      return getCdrSerializedSize(data, 0);
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.ParameterSetValueRequest data, int current_alignment)
   {
      int initial_alignment = current_alignment;

      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += 2 + us.ihmc.idl.CDR.alignment(current_alignment, 2);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);



      return current_alignment - initial_alignment;
   }

   public static void write(px4_msgs.msg.dds.ParameterSetValueRequest data, us.ihmc.idl.CDR cdr)
   {
      cdr.write_type_12(data.getTimestamp());

      cdr.write_type_3(data.getParameterIndex());

      cdr.write_type_2(data.getIntValue());

      cdr.write_type_5(data.getFloatValue());

   }

   public static void read(px4_msgs.msg.dds.ParameterSetValueRequest data, us.ihmc.idl.CDR cdr)
   {
      data.setTimestamp(cdr.read_type_12());
      	
      data.setParameterIndex(cdr.read_type_3());
      	
      data.setIntValue(cdr.read_type_2());
      	
      data.setFloatValue(cdr.read_type_5());
      	

   }

   @Override
   public final void serialize(px4_msgs.msg.dds.ParameterSetValueRequest data, us.ihmc.idl.InterchangeSerializer ser)
   {
      ser.write_type_12("timestamp", data.getTimestamp());
      ser.write_type_3("parameter_index", data.getParameterIndex());
      ser.write_type_2("int_value", data.getIntValue());
      ser.write_type_5("float_value", data.getFloatValue());
   }

   @Override
   public final void deserialize(us.ihmc.idl.InterchangeSerializer ser, px4_msgs.msg.dds.ParameterSetValueRequest data)
   {
      data.setTimestamp(ser.read_type_12("timestamp"));
      data.setParameterIndex(ser.read_type_3("parameter_index"));
      data.setIntValue(ser.read_type_2("int_value"));
      data.setFloatValue(ser.read_type_5("float_value"));
   }

   public static void staticCopy(px4_msgs.msg.dds.ParameterSetValueRequest src, px4_msgs.msg.dds.ParameterSetValueRequest dest)
   {
      dest.set(src);
   }

   @Override
   public px4_msgs.msg.dds.ParameterSetValueRequest createData()
   {
      return new px4_msgs.msg.dds.ParameterSetValueRequest();
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
   
   public void serialize(px4_msgs.msg.dds.ParameterSetValueRequest data, us.ihmc.idl.CDR cdr)
   {
      write(data, cdr);
   }

   public void deserialize(px4_msgs.msg.dds.ParameterSetValueRequest data, us.ihmc.idl.CDR cdr)
   {
      read(data, cdr);
   }
   
   public void copy(px4_msgs.msg.dds.ParameterSetValueRequest src, px4_msgs.msg.dds.ParameterSetValueRequest dest)
   {
      staticCopy(src, dest);
   }

   @Override
   public ParameterSetValueRequestPubSubType newInstance()
   {
      return new ParameterSetValueRequestPubSubType();
   }
}
