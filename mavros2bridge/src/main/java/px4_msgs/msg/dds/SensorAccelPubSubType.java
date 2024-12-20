package px4_msgs.msg.dds;

/**
* 
* Topic data type of the struct "SensorAccel" defined in "SensorAccel_.idl". Use this class to provide the TopicDataType to a Participant. 
*
* This file was automatically generated from SensorAccel_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit SensorAccel_.idl instead.
*
*/
public class SensorAccelPubSubType implements us.ihmc.pubsub.TopicDataType<px4_msgs.msg.dds.SensorAccel>
{
   public static final java.lang.String name = "px4_msgs::msg::dds_::SensorAccel_";
   
   @Override
   public final java.lang.String getDefinitionChecksum()
   {
   		return "64bc89444c69b9165f7b4a19a30452a4c31f09f44323089fda2274461f977416";
   }
   
   @Override
   public final java.lang.String getDefinitionVersion()
   {
   		return "";
   }

   private final us.ihmc.idl.CDR serializeCDR = new us.ihmc.idl.CDR();
   private final us.ihmc.idl.CDR deserializeCDR = new us.ihmc.idl.CDR();

   @Override
   public void serialize(px4_msgs.msg.dds.SensorAccel data, us.ihmc.pubsub.common.SerializedPayload serializedPayload) throws java.io.IOException
   {
      serializeCDR.serialize(serializedPayload);
      write(data, serializeCDR);
      serializeCDR.finishSerialize();
   }

   @Override
   public void deserialize(us.ihmc.pubsub.common.SerializedPayload serializedPayload, px4_msgs.msg.dds.SensorAccel data) throws java.io.IOException
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

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += ((3) * 1) + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      return current_alignment - initial_alignment;
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.SensorAccel data)
   {
      return getCdrSerializedSize(data, 0);
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.SensorAccel data, int current_alignment)
   {
      int initial_alignment = current_alignment;

      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += ((3) * 1) + us.ihmc.idl.CDR.alignment(current_alignment, 1);
      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);



      return current_alignment - initial_alignment;
   }

   public static void write(px4_msgs.msg.dds.SensorAccel data, us.ihmc.idl.CDR cdr)
   {
      cdr.write_type_12(data.getTimestamp());

      cdr.write_type_12(data.getTimestampSample());

      cdr.write_type_4(data.getDeviceId());

      cdr.write_type_5(data.getX());

      cdr.write_type_5(data.getY());

      cdr.write_type_5(data.getZ());

      cdr.write_type_5(data.getTemperature());

      cdr.write_type_4(data.getErrorCount());

      for(int i0 = 0; i0 < data.getClipCounter().length; ++i0)
      {
        	cdr.write_type_9(data.getClipCounter()[i0]);	
      }

      cdr.write_type_9(data.getSamples());

   }

   public static void read(px4_msgs.msg.dds.SensorAccel data, us.ihmc.idl.CDR cdr)
   {
      data.setTimestamp(cdr.read_type_12());
      	
      data.setTimestampSample(cdr.read_type_12());
      	
      data.setDeviceId(cdr.read_type_4());
      	
      data.setX(cdr.read_type_5());
      	
      data.setY(cdr.read_type_5());
      	
      data.setZ(cdr.read_type_5());
      	
      data.setTemperature(cdr.read_type_5());
      	
      data.setErrorCount(cdr.read_type_4());
      	
      for(int i0 = 0; i0 < data.getClipCounter().length; ++i0)
      {
        	data.getClipCounter()[i0] = cdr.read_type_9();
        	
      }
      	
      data.setSamples(cdr.read_type_9());
      	

   }

   @Override
   public final void serialize(px4_msgs.msg.dds.SensorAccel data, us.ihmc.idl.InterchangeSerializer ser)
   {
      ser.write_type_12("timestamp", data.getTimestamp());
      ser.write_type_12("timestamp_sample", data.getTimestampSample());
      ser.write_type_4("device_id", data.getDeviceId());
      ser.write_type_5("x", data.getX());
      ser.write_type_5("y", data.getY());
      ser.write_type_5("z", data.getZ());
      ser.write_type_5("temperature", data.getTemperature());
      ser.write_type_4("error_count", data.getErrorCount());
      ser.write_type_f("clip_counter", data.getClipCounter());
      ser.write_type_9("samples", data.getSamples());
   }

   @Override
   public final void deserialize(us.ihmc.idl.InterchangeSerializer ser, px4_msgs.msg.dds.SensorAccel data)
   {
      data.setTimestamp(ser.read_type_12("timestamp"));
      data.setTimestampSample(ser.read_type_12("timestamp_sample"));
      data.setDeviceId(ser.read_type_4("device_id"));
      data.setX(ser.read_type_5("x"));
      data.setY(ser.read_type_5("y"));
      data.setZ(ser.read_type_5("z"));
      data.setTemperature(ser.read_type_5("temperature"));
      data.setErrorCount(ser.read_type_4("error_count"));
      ser.read_type_f("clip_counter", data.getClipCounter());
      data.setSamples(ser.read_type_9("samples"));
   }

   public static void staticCopy(px4_msgs.msg.dds.SensorAccel src, px4_msgs.msg.dds.SensorAccel dest)
   {
      dest.set(src);
   }

   @Override
   public px4_msgs.msg.dds.SensorAccel createData()
   {
      return new px4_msgs.msg.dds.SensorAccel();
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
   
   public void serialize(px4_msgs.msg.dds.SensorAccel data, us.ihmc.idl.CDR cdr)
   {
      write(data, cdr);
   }

   public void deserialize(px4_msgs.msg.dds.SensorAccel data, us.ihmc.idl.CDR cdr)
   {
      read(data, cdr);
   }
   
   public void copy(px4_msgs.msg.dds.SensorAccel src, px4_msgs.msg.dds.SensorAccel dest)
   {
      staticCopy(src, dest);
   }

   @Override
   public SensorAccelPubSubType newInstance()
   {
      return new SensorAccelPubSubType();
   }
}
