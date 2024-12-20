package px4_msgs.msg.dds;

/**
* 
* Topic data type of the struct "SensorGyroFifo" defined in "SensorGyroFifo_.idl". Use this class to provide the TopicDataType to a Participant. 
*
* This file was automatically generated from SensorGyroFifo_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit SensorGyroFifo_.idl instead.
*
*/
public class SensorGyroFifoPubSubType implements us.ihmc.pubsub.TopicDataType<px4_msgs.msg.dds.SensorGyroFifo>
{
   public static final java.lang.String name = "px4_msgs::msg::dds_::SensorGyroFifo_";
   
   @Override
   public final java.lang.String getDefinitionChecksum()
   {
   		return "bda355ea18449b9daf8015f80cb1702b0724119db00dd358be845f95845d8227";
   }
   
   @Override
   public final java.lang.String getDefinitionVersion()
   {
   		return "";
   }

   private final us.ihmc.idl.CDR serializeCDR = new us.ihmc.idl.CDR();
   private final us.ihmc.idl.CDR deserializeCDR = new us.ihmc.idl.CDR();

   @Override
   public void serialize(px4_msgs.msg.dds.SensorGyroFifo data, us.ihmc.pubsub.common.SerializedPayload serializedPayload) throws java.io.IOException
   {
      serializeCDR.serialize(serializedPayload);
      write(data, serializeCDR);
      serializeCDR.finishSerialize();
   }

   @Override
   public void deserialize(us.ihmc.pubsub.common.SerializedPayload serializedPayload, px4_msgs.msg.dds.SensorGyroFifo data) throws java.io.IOException
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

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += ((32) * 2) + us.ihmc.idl.CDR.alignment(current_alignment, 2);

      current_alignment += ((32) * 2) + us.ihmc.idl.CDR.alignment(current_alignment, 2);

      current_alignment += ((32) * 2) + us.ihmc.idl.CDR.alignment(current_alignment, 2);


      return current_alignment - initial_alignment;
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.SensorGyroFifo data)
   {
      return getCdrSerializedSize(data, 0);
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.SensorGyroFifo data, int current_alignment)
   {
      int initial_alignment = current_alignment;

      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += ((32) * 2) + us.ihmc.idl.CDR.alignment(current_alignment, 2);
      current_alignment += ((32) * 2) + us.ihmc.idl.CDR.alignment(current_alignment, 2);
      current_alignment += ((32) * 2) + us.ihmc.idl.CDR.alignment(current_alignment, 2);

      return current_alignment - initial_alignment;
   }

   public static void write(px4_msgs.msg.dds.SensorGyroFifo data, us.ihmc.idl.CDR cdr)
   {
      cdr.write_type_12(data.getTimestamp());

      cdr.write_type_12(data.getTimestampSample());

      cdr.write_type_4(data.getDeviceId());

      cdr.write_type_5(data.getDt());

      cdr.write_type_5(data.getScale());

      cdr.write_type_9(data.getSamples());

      for(int i0 = 0; i0 < data.getX().length; ++i0)
      {
        	cdr.write_type_1(data.getX()[i0]);	
      }

      for(int i0 = 0; i0 < data.getY().length; ++i0)
      {
        	cdr.write_type_1(data.getY()[i0]);	
      }

      for(int i0 = 0; i0 < data.getZ().length; ++i0)
      {
        	cdr.write_type_1(data.getZ()[i0]);	
      }

   }

   public static void read(px4_msgs.msg.dds.SensorGyroFifo data, us.ihmc.idl.CDR cdr)
   {
      data.setTimestamp(cdr.read_type_12());
      	
      data.setTimestampSample(cdr.read_type_12());
      	
      data.setDeviceId(cdr.read_type_4());
      	
      data.setDt(cdr.read_type_5());
      	
      data.setScale(cdr.read_type_5());
      	
      data.setSamples(cdr.read_type_9());
      	
      for(int i0 = 0; i0 < data.getX().length; ++i0)
      {
        	data.getX()[i0] = cdr.read_type_1();
        	
      }
      	
      for(int i0 = 0; i0 < data.getY().length; ++i0)
      {
        	data.getY()[i0] = cdr.read_type_1();
        	
      }
      	
      for(int i0 = 0; i0 < data.getZ().length; ++i0)
      {
        	data.getZ()[i0] = cdr.read_type_1();
        	
      }
      	

   }

   @Override
   public final void serialize(px4_msgs.msg.dds.SensorGyroFifo data, us.ihmc.idl.InterchangeSerializer ser)
   {
      ser.write_type_12("timestamp", data.getTimestamp());
      ser.write_type_12("timestamp_sample", data.getTimestampSample());
      ser.write_type_4("device_id", data.getDeviceId());
      ser.write_type_5("dt", data.getDt());
      ser.write_type_5("scale", data.getScale());
      ser.write_type_9("samples", data.getSamples());
      ser.write_type_f("x", data.getX());
      ser.write_type_f("y", data.getY());
      ser.write_type_f("z", data.getZ());
   }

   @Override
   public final void deserialize(us.ihmc.idl.InterchangeSerializer ser, px4_msgs.msg.dds.SensorGyroFifo data)
   {
      data.setTimestamp(ser.read_type_12("timestamp"));
      data.setTimestampSample(ser.read_type_12("timestamp_sample"));
      data.setDeviceId(ser.read_type_4("device_id"));
      data.setDt(ser.read_type_5("dt"));
      data.setScale(ser.read_type_5("scale"));
      data.setSamples(ser.read_type_9("samples"));
      ser.read_type_f("x", data.getX());
      ser.read_type_f("y", data.getY());
      ser.read_type_f("z", data.getZ());
   }

   public static void staticCopy(px4_msgs.msg.dds.SensorGyroFifo src, px4_msgs.msg.dds.SensorGyroFifo dest)
   {
      dest.set(src);
   }

   @Override
   public px4_msgs.msg.dds.SensorGyroFifo createData()
   {
      return new px4_msgs.msg.dds.SensorGyroFifo();
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
   
   public void serialize(px4_msgs.msg.dds.SensorGyroFifo data, us.ihmc.idl.CDR cdr)
   {
      write(data, cdr);
   }

   public void deserialize(px4_msgs.msg.dds.SensorGyroFifo data, us.ihmc.idl.CDR cdr)
   {
      read(data, cdr);
   }
   
   public void copy(px4_msgs.msg.dds.SensorGyroFifo src, px4_msgs.msg.dds.SensorGyroFifo dest)
   {
      staticCopy(src, dest);
   }

   @Override
   public SensorGyroFifoPubSubType newInstance()
   {
      return new SensorGyroFifoPubSubType();
   }
}
