package px4_msgs.msg.dds;

/**
* 
* Topic data type of the struct "EstimatorSensorBias" defined in "EstimatorSensorBias_.idl". Use this class to provide the TopicDataType to a Participant. 
*
* This file was automatically generated from EstimatorSensorBias_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit EstimatorSensorBias_.idl instead.
*
*/
public class EstimatorSensorBiasPubSubType implements us.ihmc.pubsub.TopicDataType<px4_msgs.msg.dds.EstimatorSensorBias>
{
   public static final java.lang.String name = "px4_msgs::msg::dds_::EstimatorSensorBias_";
   
   @Override
   public final java.lang.String getDefinitionChecksum()
   {
   		return "ecef08cb07090f161697d135361b30d6f496263aff294d850e69aba38db2e62d";
   }
   
   @Override
   public final java.lang.String getDefinitionVersion()
   {
   		return "";
   }

   private final us.ihmc.idl.CDR serializeCDR = new us.ihmc.idl.CDR();
   private final us.ihmc.idl.CDR deserializeCDR = new us.ihmc.idl.CDR();

   @Override
   public void serialize(px4_msgs.msg.dds.EstimatorSensorBias data, us.ihmc.pubsub.common.SerializedPayload serializedPayload) throws java.io.IOException
   {
      serializeCDR.serialize(serializedPayload);
      write(data, serializeCDR);
      serializeCDR.finishSerialize();
   }

   @Override
   public void deserialize(us.ihmc.pubsub.common.SerializedPayload serializedPayload, px4_msgs.msg.dds.EstimatorSensorBias data) throws java.io.IOException
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

      current_alignment += ((3) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += ((3) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += ((3) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += ((3) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += ((3) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += ((3) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      return current_alignment - initial_alignment;
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.EstimatorSensorBias data)
   {
      return getCdrSerializedSize(data, 0);
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.EstimatorSensorBias data, int current_alignment)
   {
      int initial_alignment = current_alignment;

      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += ((3) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);
      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += ((3) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);
      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += ((3) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);
      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += ((3) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);
      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += ((3) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);
      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += ((3) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);
      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);



      return current_alignment - initial_alignment;
   }

   public static void write(px4_msgs.msg.dds.EstimatorSensorBias data, us.ihmc.idl.CDR cdr)
   {
      cdr.write_type_12(data.getTimestamp());

      cdr.write_type_12(data.getTimestampSample());

      cdr.write_type_4(data.getGyroDeviceId());

      for(int i0 = 0; i0 < data.getGyroBias().length; ++i0)
      {
        	cdr.write_type_5(data.getGyroBias()[i0]);	
      }

      cdr.write_type_5(data.getGyroBiasLimit());

      for(int i0 = 0; i0 < data.getGyroBiasVariance().length; ++i0)
      {
        	cdr.write_type_5(data.getGyroBiasVariance()[i0]);	
      }

      cdr.write_type_7(data.getGyroBiasValid());

      cdr.write_type_7(data.getGyroBiasStable());

      cdr.write_type_4(data.getAccelDeviceId());

      for(int i0 = 0; i0 < data.getAccelBias().length; ++i0)
      {
        	cdr.write_type_5(data.getAccelBias()[i0]);	
      }

      cdr.write_type_5(data.getAccelBiasLimit());

      for(int i0 = 0; i0 < data.getAccelBiasVariance().length; ++i0)
      {
        	cdr.write_type_5(data.getAccelBiasVariance()[i0]);	
      }

      cdr.write_type_7(data.getAccelBiasValid());

      cdr.write_type_7(data.getAccelBiasStable());

      cdr.write_type_4(data.getMagDeviceId());

      for(int i0 = 0; i0 < data.getMagBias().length; ++i0)
      {
        	cdr.write_type_5(data.getMagBias()[i0]);	
      }

      cdr.write_type_5(data.getMagBiasLimit());

      for(int i0 = 0; i0 < data.getMagBiasVariance().length; ++i0)
      {
        	cdr.write_type_5(data.getMagBiasVariance()[i0]);	
      }

      cdr.write_type_7(data.getMagBiasValid());

      cdr.write_type_7(data.getMagBiasStable());

   }

   public static void read(px4_msgs.msg.dds.EstimatorSensorBias data, us.ihmc.idl.CDR cdr)
   {
      data.setTimestamp(cdr.read_type_12());
      	
      data.setTimestampSample(cdr.read_type_12());
      	
      data.setGyroDeviceId(cdr.read_type_4());
      	
      for(int i0 = 0; i0 < data.getGyroBias().length; ++i0)
      {
        	data.getGyroBias()[i0] = cdr.read_type_5();
        	
      }
      	
      data.setGyroBiasLimit(cdr.read_type_5());
      	
      for(int i0 = 0; i0 < data.getGyroBiasVariance().length; ++i0)
      {
        	data.getGyroBiasVariance()[i0] = cdr.read_type_5();
        	
      }
      	
      data.setGyroBiasValid(cdr.read_type_7());
      	
      data.setGyroBiasStable(cdr.read_type_7());
      	
      data.setAccelDeviceId(cdr.read_type_4());
      	
      for(int i0 = 0; i0 < data.getAccelBias().length; ++i0)
      {
        	data.getAccelBias()[i0] = cdr.read_type_5();
        	
      }
      	
      data.setAccelBiasLimit(cdr.read_type_5());
      	
      for(int i0 = 0; i0 < data.getAccelBiasVariance().length; ++i0)
      {
        	data.getAccelBiasVariance()[i0] = cdr.read_type_5();
        	
      }
      	
      data.setAccelBiasValid(cdr.read_type_7());
      	
      data.setAccelBiasStable(cdr.read_type_7());
      	
      data.setMagDeviceId(cdr.read_type_4());
      	
      for(int i0 = 0; i0 < data.getMagBias().length; ++i0)
      {
        	data.getMagBias()[i0] = cdr.read_type_5();
        	
      }
      	
      data.setMagBiasLimit(cdr.read_type_5());
      	
      for(int i0 = 0; i0 < data.getMagBiasVariance().length; ++i0)
      {
        	data.getMagBiasVariance()[i0] = cdr.read_type_5();
        	
      }
      	
      data.setMagBiasValid(cdr.read_type_7());
      	
      data.setMagBiasStable(cdr.read_type_7());
      	

   }

   @Override
   public final void serialize(px4_msgs.msg.dds.EstimatorSensorBias data, us.ihmc.idl.InterchangeSerializer ser)
   {
      ser.write_type_12("timestamp", data.getTimestamp());
      ser.write_type_12("timestamp_sample", data.getTimestampSample());
      ser.write_type_4("gyro_device_id", data.getGyroDeviceId());
      ser.write_type_f("gyro_bias", data.getGyroBias());
      ser.write_type_5("gyro_bias_limit", data.getGyroBiasLimit());
      ser.write_type_f("gyro_bias_variance", data.getGyroBiasVariance());
      ser.write_type_7("gyro_bias_valid", data.getGyroBiasValid());
      ser.write_type_7("gyro_bias_stable", data.getGyroBiasStable());
      ser.write_type_4("accel_device_id", data.getAccelDeviceId());
      ser.write_type_f("accel_bias", data.getAccelBias());
      ser.write_type_5("accel_bias_limit", data.getAccelBiasLimit());
      ser.write_type_f("accel_bias_variance", data.getAccelBiasVariance());
      ser.write_type_7("accel_bias_valid", data.getAccelBiasValid());
      ser.write_type_7("accel_bias_stable", data.getAccelBiasStable());
      ser.write_type_4("mag_device_id", data.getMagDeviceId());
      ser.write_type_f("mag_bias", data.getMagBias());
      ser.write_type_5("mag_bias_limit", data.getMagBiasLimit());
      ser.write_type_f("mag_bias_variance", data.getMagBiasVariance());
      ser.write_type_7("mag_bias_valid", data.getMagBiasValid());
      ser.write_type_7("mag_bias_stable", data.getMagBiasStable());
   }

   @Override
   public final void deserialize(us.ihmc.idl.InterchangeSerializer ser, px4_msgs.msg.dds.EstimatorSensorBias data)
   {
      data.setTimestamp(ser.read_type_12("timestamp"));
      data.setTimestampSample(ser.read_type_12("timestamp_sample"));
      data.setGyroDeviceId(ser.read_type_4("gyro_device_id"));
      ser.read_type_f("gyro_bias", data.getGyroBias());
      data.setGyroBiasLimit(ser.read_type_5("gyro_bias_limit"));
      ser.read_type_f("gyro_bias_variance", data.getGyroBiasVariance());
      data.setGyroBiasValid(ser.read_type_7("gyro_bias_valid"));
      data.setGyroBiasStable(ser.read_type_7("gyro_bias_stable"));
      data.setAccelDeviceId(ser.read_type_4("accel_device_id"));
      ser.read_type_f("accel_bias", data.getAccelBias());
      data.setAccelBiasLimit(ser.read_type_5("accel_bias_limit"));
      ser.read_type_f("accel_bias_variance", data.getAccelBiasVariance());
      data.setAccelBiasValid(ser.read_type_7("accel_bias_valid"));
      data.setAccelBiasStable(ser.read_type_7("accel_bias_stable"));
      data.setMagDeviceId(ser.read_type_4("mag_device_id"));
      ser.read_type_f("mag_bias", data.getMagBias());
      data.setMagBiasLimit(ser.read_type_5("mag_bias_limit"));
      ser.read_type_f("mag_bias_variance", data.getMagBiasVariance());
      data.setMagBiasValid(ser.read_type_7("mag_bias_valid"));
      data.setMagBiasStable(ser.read_type_7("mag_bias_stable"));
   }

   public static void staticCopy(px4_msgs.msg.dds.EstimatorSensorBias src, px4_msgs.msg.dds.EstimatorSensorBias dest)
   {
      dest.set(src);
   }

   @Override
   public px4_msgs.msg.dds.EstimatorSensorBias createData()
   {
      return new px4_msgs.msg.dds.EstimatorSensorBias();
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
   
   public void serialize(px4_msgs.msg.dds.EstimatorSensorBias data, us.ihmc.idl.CDR cdr)
   {
      write(data, cdr);
   }

   public void deserialize(px4_msgs.msg.dds.EstimatorSensorBias data, us.ihmc.idl.CDR cdr)
   {
      read(data, cdr);
   }
   
   public void copy(px4_msgs.msg.dds.EstimatorSensorBias src, px4_msgs.msg.dds.EstimatorSensorBias dest)
   {
      staticCopy(src, dest);
   }

   @Override
   public EstimatorSensorBiasPubSubType newInstance()
   {
      return new EstimatorSensorBiasPubSubType();
   }
}
