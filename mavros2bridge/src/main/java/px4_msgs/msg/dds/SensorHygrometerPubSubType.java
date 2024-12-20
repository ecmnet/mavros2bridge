package px4_msgs.msg.dds;

/**
* 
* Topic data type of the struct "SensorHygrometer" defined in "SensorHygrometer_.idl". Use this class to provide the TopicDataType to a Participant. 
*
* This file was automatically generated from SensorHygrometer_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit SensorHygrometer_.idl instead.
*
*/
public class SensorHygrometerPubSubType implements us.ihmc.pubsub.TopicDataType<px4_msgs.msg.dds.SensorHygrometer>
{
   public static final java.lang.String name = "px4_msgs::msg::dds_::SensorHygrometer_";
   
   @Override
   public final java.lang.String getDefinitionChecksum()
   {
   		return "f4d77657fad79bbb9f9cdd4c67f562b8beaf9ddd0d80f1402f87fb8fab55d7f5";
   }
   
   @Override
   public final java.lang.String getDefinitionVersion()
   {
   		return "";
   }

   private final us.ihmc.idl.CDR serializeCDR = new us.ihmc.idl.CDR();
   private final us.ihmc.idl.CDR deserializeCDR = new us.ihmc.idl.CDR();

   @Override
   public void serialize(px4_msgs.msg.dds.SensorHygrometer data, us.ihmc.pubsub.common.SerializedPayload serializedPayload) throws java.io.IOException
   {
      serializeCDR.serialize(serializedPayload);
      write(data, serializeCDR);
      serializeCDR.finishSerialize();
   }

   @Override
   public void deserialize(us.ihmc.pubsub.common.SerializedPayload serializedPayload, px4_msgs.msg.dds.SensorHygrometer data) throws java.io.IOException
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

      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      return current_alignment - initial_alignment;
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.SensorHygrometer data)
   {
      return getCdrSerializedSize(data, 0);
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.SensorHygrometer data, int current_alignment)
   {
      int initial_alignment = current_alignment;

      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);



      return current_alignment - initial_alignment;
   }

   public static void write(px4_msgs.msg.dds.SensorHygrometer data, us.ihmc.idl.CDR cdr)
   {
      cdr.write_type_12(data.getTimestamp());

      cdr.write_type_12(data.getTimestampSample());

      cdr.write_type_4(data.getDeviceId());

      cdr.write_type_5(data.getTemperature());

      cdr.write_type_5(data.getHumidity());

   }

   public static void read(px4_msgs.msg.dds.SensorHygrometer data, us.ihmc.idl.CDR cdr)
   {
      data.setTimestamp(cdr.read_type_12());
      	
      data.setTimestampSample(cdr.read_type_12());
      	
      data.setDeviceId(cdr.read_type_4());
      	
      data.setTemperature(cdr.read_type_5());
      	
      data.setHumidity(cdr.read_type_5());
      	

   }

   @Override
   public final void serialize(px4_msgs.msg.dds.SensorHygrometer data, us.ihmc.idl.InterchangeSerializer ser)
   {
      ser.write_type_12("timestamp", data.getTimestamp());
      ser.write_type_12("timestamp_sample", data.getTimestampSample());
      ser.write_type_4("device_id", data.getDeviceId());
      ser.write_type_5("temperature", data.getTemperature());
      ser.write_type_5("humidity", data.getHumidity());
   }

   @Override
   public final void deserialize(us.ihmc.idl.InterchangeSerializer ser, px4_msgs.msg.dds.SensorHygrometer data)
   {
      data.setTimestamp(ser.read_type_12("timestamp"));
      data.setTimestampSample(ser.read_type_12("timestamp_sample"));
      data.setDeviceId(ser.read_type_4("device_id"));
      data.setTemperature(ser.read_type_5("temperature"));
      data.setHumidity(ser.read_type_5("humidity"));
   }

   public static void staticCopy(px4_msgs.msg.dds.SensorHygrometer src, px4_msgs.msg.dds.SensorHygrometer dest)
   {
      dest.set(src);
   }

   @Override
   public px4_msgs.msg.dds.SensorHygrometer createData()
   {
      return new px4_msgs.msg.dds.SensorHygrometer();
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
   
   public void serialize(px4_msgs.msg.dds.SensorHygrometer data, us.ihmc.idl.CDR cdr)
   {
      write(data, cdr);
   }

   public void deserialize(px4_msgs.msg.dds.SensorHygrometer data, us.ihmc.idl.CDR cdr)
   {
      read(data, cdr);
   }
   
   public void copy(px4_msgs.msg.dds.SensorHygrometer src, px4_msgs.msg.dds.SensorHygrometer dest)
   {
      staticCopy(src, dest);
   }

   @Override
   public SensorHygrometerPubSubType newInstance()
   {
      return new SensorHygrometerPubSubType();
   }
}
