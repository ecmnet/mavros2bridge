package px4_msgs.msg.dds;

/**
* 
* Topic data type of the struct "SensorCorrection" defined in "SensorCorrection_.idl". Use this class to provide the TopicDataType to a Participant. 
*
* This file was automatically generated from SensorCorrection_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit SensorCorrection_.idl instead.
*
*/
public class SensorCorrectionPubSubType implements us.ihmc.pubsub.TopicDataType<px4_msgs.msg.dds.SensorCorrection>
{
   public static final java.lang.String name = "px4_msgs::msg::dds_::SensorCorrection_";
   
   @Override
   public final java.lang.String getDefinitionChecksum()
   {
   		return "573b27c557f776f11d427dcb142b45f36c03a6bc5f4aadb185a9185b8e069411";
   }
   
   @Override
   public final java.lang.String getDefinitionVersion()
   {
   		return "";
   }

   private final us.ihmc.idl.CDR serializeCDR = new us.ihmc.idl.CDR();
   private final us.ihmc.idl.CDR deserializeCDR = new us.ihmc.idl.CDR();

   @Override
   public void serialize(px4_msgs.msg.dds.SensorCorrection data, us.ihmc.pubsub.common.SerializedPayload serializedPayload) throws java.io.IOException
   {
      serializeCDR.serialize(serializedPayload);
      write(data, serializeCDR);
      serializeCDR.finishSerialize();
   }

   @Override
   public void deserialize(us.ihmc.pubsub.common.SerializedPayload serializedPayload, px4_msgs.msg.dds.SensorCorrection data) throws java.io.IOException
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

      current_alignment += ((4) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += ((3) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += ((3) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += ((3) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += ((3) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += ((4) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += ((3) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += ((3) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += ((3) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += ((3) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += ((4) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += ((3) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += ((3) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += ((3) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += ((3) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += ((4) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      return current_alignment - initial_alignment;
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.SensorCorrection data)
   {
      return getCdrSerializedSize(data, 0);
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.SensorCorrection data, int current_alignment)
   {
      int initial_alignment = current_alignment;

      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += ((4) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);
      current_alignment += ((3) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);
      current_alignment += ((3) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);
      current_alignment += ((3) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);
      current_alignment += ((3) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);
      current_alignment += ((4) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);
      current_alignment += ((3) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);
      current_alignment += ((3) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);
      current_alignment += ((3) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);
      current_alignment += ((3) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);
      current_alignment += ((4) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);
      current_alignment += ((3) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);
      current_alignment += ((3) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);
      current_alignment += ((3) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);
      current_alignment += ((3) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);
      current_alignment += ((4) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);
      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);



      return current_alignment - initial_alignment;
   }

   public static void write(px4_msgs.msg.dds.SensorCorrection data, us.ihmc.idl.CDR cdr)
   {
      cdr.write_type_12(data.getTimestamp());

      for(int i0 = 0; i0 < data.getAccelTemperature().length; ++i0)
      {
        	cdr.write_type_5(data.getAccelTemperature()[i0]);	
      }

      for(int i0 = 0; i0 < data.getAccelOffset0().length; ++i0)
      {
        	cdr.write_type_5(data.getAccelOffset0()[i0]);	
      }

      for(int i0 = 0; i0 < data.getAccelOffset1().length; ++i0)
      {
        	cdr.write_type_5(data.getAccelOffset1()[i0]);	
      }

      for(int i0 = 0; i0 < data.getAccelOffset2().length; ++i0)
      {
        	cdr.write_type_5(data.getAccelOffset2()[i0]);	
      }

      for(int i0 = 0; i0 < data.getAccelOffset3().length; ++i0)
      {
        	cdr.write_type_5(data.getAccelOffset3()[i0]);	
      }

      for(int i0 = 0; i0 < data.getGyroTemperature().length; ++i0)
      {
        	cdr.write_type_5(data.getGyroTemperature()[i0]);	
      }

      for(int i0 = 0; i0 < data.getGyroOffset0().length; ++i0)
      {
        	cdr.write_type_5(data.getGyroOffset0()[i0]);	
      }

      for(int i0 = 0; i0 < data.getGyroOffset1().length; ++i0)
      {
        	cdr.write_type_5(data.getGyroOffset1()[i0]);	
      }

      for(int i0 = 0; i0 < data.getGyroOffset2().length; ++i0)
      {
        	cdr.write_type_5(data.getGyroOffset2()[i0]);	
      }

      for(int i0 = 0; i0 < data.getGyroOffset3().length; ++i0)
      {
        	cdr.write_type_5(data.getGyroOffset3()[i0]);	
      }

      for(int i0 = 0; i0 < data.getMagTemperature().length; ++i0)
      {
        	cdr.write_type_5(data.getMagTemperature()[i0]);	
      }

      for(int i0 = 0; i0 < data.getMagOffset0().length; ++i0)
      {
        	cdr.write_type_5(data.getMagOffset0()[i0]);	
      }

      for(int i0 = 0; i0 < data.getMagOffset1().length; ++i0)
      {
        	cdr.write_type_5(data.getMagOffset1()[i0]);	
      }

      for(int i0 = 0; i0 < data.getMagOffset2().length; ++i0)
      {
        	cdr.write_type_5(data.getMagOffset2()[i0]);	
      }

      for(int i0 = 0; i0 < data.getMagOffset3().length; ++i0)
      {
        	cdr.write_type_5(data.getMagOffset3()[i0]);	
      }

      for(int i0 = 0; i0 < data.getBaroTemperature().length; ++i0)
      {
        	cdr.write_type_5(data.getBaroTemperature()[i0]);	
      }

      cdr.write_type_5(data.getBaroOffset0());

      cdr.write_type_5(data.getBaroOffset1());

      cdr.write_type_5(data.getBaroOffset2());

      cdr.write_type_5(data.getBaroOffset3());

   }

   public static void read(px4_msgs.msg.dds.SensorCorrection data, us.ihmc.idl.CDR cdr)
   {
      data.setTimestamp(cdr.read_type_12());
      	
      for(int i0 = 0; i0 < data.getAccelTemperature().length; ++i0)
      {
        	data.getAccelTemperature()[i0] = cdr.read_type_5();
        	
      }
      	
      for(int i0 = 0; i0 < data.getAccelOffset0().length; ++i0)
      {
        	data.getAccelOffset0()[i0] = cdr.read_type_5();
        	
      }
      	
      for(int i0 = 0; i0 < data.getAccelOffset1().length; ++i0)
      {
        	data.getAccelOffset1()[i0] = cdr.read_type_5();
        	
      }
      	
      for(int i0 = 0; i0 < data.getAccelOffset2().length; ++i0)
      {
        	data.getAccelOffset2()[i0] = cdr.read_type_5();
        	
      }
      	
      for(int i0 = 0; i0 < data.getAccelOffset3().length; ++i0)
      {
        	data.getAccelOffset3()[i0] = cdr.read_type_5();
        	
      }
      	
      for(int i0 = 0; i0 < data.getGyroTemperature().length; ++i0)
      {
        	data.getGyroTemperature()[i0] = cdr.read_type_5();
        	
      }
      	
      for(int i0 = 0; i0 < data.getGyroOffset0().length; ++i0)
      {
        	data.getGyroOffset0()[i0] = cdr.read_type_5();
        	
      }
      	
      for(int i0 = 0; i0 < data.getGyroOffset1().length; ++i0)
      {
        	data.getGyroOffset1()[i0] = cdr.read_type_5();
        	
      }
      	
      for(int i0 = 0; i0 < data.getGyroOffset2().length; ++i0)
      {
        	data.getGyroOffset2()[i0] = cdr.read_type_5();
        	
      }
      	
      for(int i0 = 0; i0 < data.getGyroOffset3().length; ++i0)
      {
        	data.getGyroOffset3()[i0] = cdr.read_type_5();
        	
      }
      	
      for(int i0 = 0; i0 < data.getMagTemperature().length; ++i0)
      {
        	data.getMagTemperature()[i0] = cdr.read_type_5();
        	
      }
      	
      for(int i0 = 0; i0 < data.getMagOffset0().length; ++i0)
      {
        	data.getMagOffset0()[i0] = cdr.read_type_5();
        	
      }
      	
      for(int i0 = 0; i0 < data.getMagOffset1().length; ++i0)
      {
        	data.getMagOffset1()[i0] = cdr.read_type_5();
        	
      }
      	
      for(int i0 = 0; i0 < data.getMagOffset2().length; ++i0)
      {
        	data.getMagOffset2()[i0] = cdr.read_type_5();
        	
      }
      	
      for(int i0 = 0; i0 < data.getMagOffset3().length; ++i0)
      {
        	data.getMagOffset3()[i0] = cdr.read_type_5();
        	
      }
      	
      for(int i0 = 0; i0 < data.getBaroTemperature().length; ++i0)
      {
        	data.getBaroTemperature()[i0] = cdr.read_type_5();
        	
      }
      	
      data.setBaroOffset0(cdr.read_type_5());
      	
      data.setBaroOffset1(cdr.read_type_5());
      	
      data.setBaroOffset2(cdr.read_type_5());
      	
      data.setBaroOffset3(cdr.read_type_5());
      	

   }

   @Override
   public final void serialize(px4_msgs.msg.dds.SensorCorrection data, us.ihmc.idl.InterchangeSerializer ser)
   {
      ser.write_type_12("timestamp", data.getTimestamp());
      ser.write_type_f("accel_temperature", data.getAccelTemperature());
      ser.write_type_f("accel_offset_0", data.getAccelOffset0());
      ser.write_type_f("accel_offset_1", data.getAccelOffset1());
      ser.write_type_f("accel_offset_2", data.getAccelOffset2());
      ser.write_type_f("accel_offset_3", data.getAccelOffset3());
      ser.write_type_f("gyro_temperature", data.getGyroTemperature());
      ser.write_type_f("gyro_offset_0", data.getGyroOffset0());
      ser.write_type_f("gyro_offset_1", data.getGyroOffset1());
      ser.write_type_f("gyro_offset_2", data.getGyroOffset2());
      ser.write_type_f("gyro_offset_3", data.getGyroOffset3());
      ser.write_type_f("mag_temperature", data.getMagTemperature());
      ser.write_type_f("mag_offset_0", data.getMagOffset0());
      ser.write_type_f("mag_offset_1", data.getMagOffset1());
      ser.write_type_f("mag_offset_2", data.getMagOffset2());
      ser.write_type_f("mag_offset_3", data.getMagOffset3());
      ser.write_type_f("baro_temperature", data.getBaroTemperature());
      ser.write_type_5("baro_offset_0", data.getBaroOffset0());
      ser.write_type_5("baro_offset_1", data.getBaroOffset1());
      ser.write_type_5("baro_offset_2", data.getBaroOffset2());
      ser.write_type_5("baro_offset_3", data.getBaroOffset3());
   }

   @Override
   public final void deserialize(us.ihmc.idl.InterchangeSerializer ser, px4_msgs.msg.dds.SensorCorrection data)
   {
      data.setTimestamp(ser.read_type_12("timestamp"));
      ser.read_type_f("accel_temperature", data.getAccelTemperature());
      ser.read_type_f("accel_offset_0", data.getAccelOffset0());
      ser.read_type_f("accel_offset_1", data.getAccelOffset1());
      ser.read_type_f("accel_offset_2", data.getAccelOffset2());
      ser.read_type_f("accel_offset_3", data.getAccelOffset3());
      ser.read_type_f("gyro_temperature", data.getGyroTemperature());
      ser.read_type_f("gyro_offset_0", data.getGyroOffset0());
      ser.read_type_f("gyro_offset_1", data.getGyroOffset1());
      ser.read_type_f("gyro_offset_2", data.getGyroOffset2());
      ser.read_type_f("gyro_offset_3", data.getGyroOffset3());
      ser.read_type_f("mag_temperature", data.getMagTemperature());
      ser.read_type_f("mag_offset_0", data.getMagOffset0());
      ser.read_type_f("mag_offset_1", data.getMagOffset1());
      ser.read_type_f("mag_offset_2", data.getMagOffset2());
      ser.read_type_f("mag_offset_3", data.getMagOffset3());
      ser.read_type_f("baro_temperature", data.getBaroTemperature());
      data.setBaroOffset0(ser.read_type_5("baro_offset_0"));
      data.setBaroOffset1(ser.read_type_5("baro_offset_1"));
      data.setBaroOffset2(ser.read_type_5("baro_offset_2"));
      data.setBaroOffset3(ser.read_type_5("baro_offset_3"));
   }

   public static void staticCopy(px4_msgs.msg.dds.SensorCorrection src, px4_msgs.msg.dds.SensorCorrection dest)
   {
      dest.set(src);
   }

   @Override
   public px4_msgs.msg.dds.SensorCorrection createData()
   {
      return new px4_msgs.msg.dds.SensorCorrection();
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
   
   public void serialize(px4_msgs.msg.dds.SensorCorrection data, us.ihmc.idl.CDR cdr)
   {
      write(data, cdr);
   }

   public void deserialize(px4_msgs.msg.dds.SensorCorrection data, us.ihmc.idl.CDR cdr)
   {
      read(data, cdr);
   }
   
   public void copy(px4_msgs.msg.dds.SensorCorrection src, px4_msgs.msg.dds.SensorCorrection dest)
   {
      staticCopy(src, dest);
   }

   @Override
   public SensorCorrectionPubSubType newInstance()
   {
      return new SensorCorrectionPubSubType();
   }
}
