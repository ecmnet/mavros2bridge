package px4_msgs.msg.dds;

/**
* 
* Topic data type of the struct "ActuatorTest" defined in "ActuatorTest_.idl". Use this class to provide the TopicDataType to a Participant. 
*
* This file was automatically generated from ActuatorTest_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit ActuatorTest_.idl instead.
*
*/
public class ActuatorTestPubSubType implements us.ihmc.pubsub.TopicDataType<px4_msgs.msg.dds.ActuatorTest>
{
   public static final java.lang.String name = "px4_msgs::msg::dds_::ActuatorTest_";
   
   @Override
   public final java.lang.String getDefinitionChecksum()
   {
   		return "0f265f8edf0061a63d1ff4ed2445b27292ba1076e3f067c0c4fc8b15478d51e8";
   }
   
   @Override
   public final java.lang.String getDefinitionVersion()
   {
   		return "";
   }

   private final us.ihmc.idl.CDR serializeCDR = new us.ihmc.idl.CDR();
   private final us.ihmc.idl.CDR deserializeCDR = new us.ihmc.idl.CDR();

   @Override
   public void serialize(px4_msgs.msg.dds.ActuatorTest data, us.ihmc.pubsub.common.SerializedPayload serializedPayload) throws java.io.IOException
   {
      serializeCDR.serialize(serializedPayload);
      write(data, serializeCDR);
      serializeCDR.finishSerialize();
   }

   @Override
   public void deserialize(us.ihmc.pubsub.common.SerializedPayload serializedPayload, px4_msgs.msg.dds.ActuatorTest data) throws java.io.IOException
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

      current_alignment += 2 + us.ihmc.idl.CDR.alignment(current_alignment, 2);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      return current_alignment - initial_alignment;
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.ActuatorTest data)
   {
      return getCdrSerializedSize(data, 0);
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.ActuatorTest data, int current_alignment)
   {
      int initial_alignment = current_alignment;

      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 2 + us.ihmc.idl.CDR.alignment(current_alignment, 2);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);



      return current_alignment - initial_alignment;
   }

   public static void write(px4_msgs.msg.dds.ActuatorTest data, us.ihmc.idl.CDR cdr)
   {
      cdr.write_type_12(data.getTimestamp());

      cdr.write_type_9(data.getAction());

      cdr.write_type_3(data.getFunction());

      cdr.write_type_5(data.getValue());

      cdr.write_type_4(data.getTimeoutMs());

   }

   public static void read(px4_msgs.msg.dds.ActuatorTest data, us.ihmc.idl.CDR cdr)
   {
      data.setTimestamp(cdr.read_type_12());
      	
      data.setAction(cdr.read_type_9());
      	
      data.setFunction(cdr.read_type_3());
      	
      data.setValue(cdr.read_type_5());
      	
      data.setTimeoutMs(cdr.read_type_4());
      	

   }

   @Override
   public final void serialize(px4_msgs.msg.dds.ActuatorTest data, us.ihmc.idl.InterchangeSerializer ser)
   {
      ser.write_type_12("timestamp", data.getTimestamp());
      ser.write_type_9("action", data.getAction());
      ser.write_type_3("function", data.getFunction());
      ser.write_type_5("value", data.getValue());
      ser.write_type_4("timeout_ms", data.getTimeoutMs());
   }

   @Override
   public final void deserialize(us.ihmc.idl.InterchangeSerializer ser, px4_msgs.msg.dds.ActuatorTest data)
   {
      data.setTimestamp(ser.read_type_12("timestamp"));
      data.setAction(ser.read_type_9("action"));
      data.setFunction(ser.read_type_3("function"));
      data.setValue(ser.read_type_5("value"));
      data.setTimeoutMs(ser.read_type_4("timeout_ms"));
   }

   public static void staticCopy(px4_msgs.msg.dds.ActuatorTest src, px4_msgs.msg.dds.ActuatorTest dest)
   {
      dest.set(src);
   }

   @Override
   public px4_msgs.msg.dds.ActuatorTest createData()
   {
      return new px4_msgs.msg.dds.ActuatorTest();
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
   
   public void serialize(px4_msgs.msg.dds.ActuatorTest data, us.ihmc.idl.CDR cdr)
   {
      write(data, cdr);
   }

   public void deserialize(px4_msgs.msg.dds.ActuatorTest data, us.ihmc.idl.CDR cdr)
   {
      read(data, cdr);
   }
   
   public void copy(px4_msgs.msg.dds.ActuatorTest src, px4_msgs.msg.dds.ActuatorTest dest)
   {
      staticCopy(src, dest);
   }

   @Override
   public ActuatorTestPubSubType newInstance()
   {
      return new ActuatorTestPubSubType();
   }
}
