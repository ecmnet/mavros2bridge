package px4_msgs.msg.dds;

/**
* 
* Topic data type of the struct "SensorBaro" defined in "SensorBaro_.idl". Use this class to provide the TopicDataType to a Participant. 
*
* This file was automatically generated from SensorBaro_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit SensorBaro_.idl instead.
*
*/
public class SensorBaroPubSubType implements us.ihmc.pubsub.TopicDataType<px4_msgs.msg.dds.SensorBaro>
{
   public static final java.lang.String name = "px4_msgs::msg::dds_::SensorBaro_";
   
   @Override
   public final java.lang.String getDefinitionChecksum()
   {
   		return "472cd6b5e9b800de31aefab47b0ba8bb3ca8ab04e51dc9e7f2d721420c153b98";
   }
   
   @Override
   public final java.lang.String getDefinitionVersion()
   {
   		return "";
   }

   private final us.ihmc.idl.CDR serializeCDR = new us.ihmc.idl.CDR();
   private final us.ihmc.idl.CDR deserializeCDR = new us.ihmc.idl.CDR();

   @Override
   public void serialize(px4_msgs.msg.dds.SensorBaro data, us.ihmc.pubsub.common.SerializedPayload serializedPayload) throws java.io.IOException
   {
      serializeCDR.serialize(serializedPayload);
      write(data, serializeCDR);
      serializeCDR.finishSerialize();
   }

   @Override
   public void deserialize(us.ihmc.pubsub.common.SerializedPayload serializedPayload, px4_msgs.msg.dds.SensorBaro data) throws java.io.IOException
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

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      return current_alignment - initial_alignment;
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.SensorBaro data)
   {
      return getCdrSerializedSize(data, 0);
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.SensorBaro data, int current_alignment)
   {
      int initial_alignment = current_alignment;

      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);



      return current_alignment - initial_alignment;
   }

   public static void write(px4_msgs.msg.dds.SensorBaro data, us.ihmc.idl.CDR cdr)
   {
      cdr.write_type_12(data.getTimestamp());

      cdr.write_type_12(data.getTimestampSample());

      cdr.write_type_4(data.getDeviceId());

      cdr.write_type_5(data.getPressure());

      cdr.write_type_5(data.getTemperature());

      cdr.write_type_4(data.getErrorCount());

   }

   public static void read(px4_msgs.msg.dds.SensorBaro data, us.ihmc.idl.CDR cdr)
   {
      data.setTimestamp(cdr.read_type_12());
      	
      data.setTimestampSample(cdr.read_type_12());
      	
      data.setDeviceId(cdr.read_type_4());
      	
      data.setPressure(cdr.read_type_5());
      	
      data.setTemperature(cdr.read_type_5());
      	
      data.setErrorCount(cdr.read_type_4());
      	

   }

   @Override
   public final void serialize(px4_msgs.msg.dds.SensorBaro data, us.ihmc.idl.InterchangeSerializer ser)
   {
      ser.write_type_12("timestamp", data.getTimestamp());
      ser.write_type_12("timestamp_sample", data.getTimestampSample());
      ser.write_type_4("device_id", data.getDeviceId());
      ser.write_type_5("pressure", data.getPressure());
      ser.write_type_5("temperature", data.getTemperature());
      ser.write_type_4("error_count", data.getErrorCount());
   }

   @Override
   public final void deserialize(us.ihmc.idl.InterchangeSerializer ser, px4_msgs.msg.dds.SensorBaro data)
   {
      data.setTimestamp(ser.read_type_12("timestamp"));
      data.setTimestampSample(ser.read_type_12("timestamp_sample"));
      data.setDeviceId(ser.read_type_4("device_id"));
      data.setPressure(ser.read_type_5("pressure"));
      data.setTemperature(ser.read_type_5("temperature"));
      data.setErrorCount(ser.read_type_4("error_count"));
   }

   public static void staticCopy(px4_msgs.msg.dds.SensorBaro src, px4_msgs.msg.dds.SensorBaro dest)
   {
      dest.set(src);
   }

   @Override
   public px4_msgs.msg.dds.SensorBaro createData()
   {
      return new px4_msgs.msg.dds.SensorBaro();
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
   
   public void serialize(px4_msgs.msg.dds.SensorBaro data, us.ihmc.idl.CDR cdr)
   {
      write(data, cdr);
   }

   public void deserialize(px4_msgs.msg.dds.SensorBaro data, us.ihmc.idl.CDR cdr)
   {
      read(data, cdr);
   }
   
   public void copy(px4_msgs.msg.dds.SensorBaro src, px4_msgs.msg.dds.SensorBaro dest)
   {
      staticCopy(src, dest);
   }

   @Override
   public SensorBaroPubSubType newInstance()
   {
      return new SensorBaroPubSubType();
   }
}
