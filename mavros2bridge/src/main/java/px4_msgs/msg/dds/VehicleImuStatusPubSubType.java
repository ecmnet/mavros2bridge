package px4_msgs.msg.dds;

/**
* 
* Topic data type of the struct "VehicleImuStatus" defined in "VehicleImuStatus_.idl". Use this class to provide the TopicDataType to a Participant. 
*
* This file was automatically generated from VehicleImuStatus_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit VehicleImuStatus_.idl instead.
*
*/
public class VehicleImuStatusPubSubType implements us.ihmc.pubsub.TopicDataType<px4_msgs.msg.dds.VehicleImuStatus>
{
   public static final java.lang.String name = "px4_msgs::msg::dds_::VehicleImuStatus_";
   
   @Override
   public final java.lang.String getDefinitionChecksum()
   {
   		return "f43114ff6f4c62a6a13f43bfe457ae6b737e2f5195599d9f3a396e3df1b82a2e";
   }
   
   @Override
   public final java.lang.String getDefinitionVersion()
   {
   		return "";
   }

   private final us.ihmc.idl.CDR serializeCDR = new us.ihmc.idl.CDR();
   private final us.ihmc.idl.CDR deserializeCDR = new us.ihmc.idl.CDR();

   @Override
   public void serialize(px4_msgs.msg.dds.VehicleImuStatus data, us.ihmc.pubsub.common.SerializedPayload serializedPayload) throws java.io.IOException
   {
      serializeCDR.serialize(serializedPayload);
      write(data, serializeCDR);
      serializeCDR.finishSerialize();
   }

   @Override
   public void deserialize(us.ihmc.pubsub.common.SerializedPayload serializedPayload, px4_msgs.msg.dds.VehicleImuStatus data) throws java.io.IOException
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

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += ((3) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += ((3) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += ((3) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += ((3) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      return current_alignment - initial_alignment;
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.VehicleImuStatus data)
   {
      return getCdrSerializedSize(data, 0);
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.VehicleImuStatus data, int current_alignment)
   {
      int initial_alignment = current_alignment;

      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += ((3) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);
      current_alignment += ((3) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);
      current_alignment += ((3) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);
      current_alignment += ((3) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);
      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);



      return current_alignment - initial_alignment;
   }

   public static void write(px4_msgs.msg.dds.VehicleImuStatus data, us.ihmc.idl.CDR cdr)
   {
      cdr.write_type_12(data.getTimestamp());

      cdr.write_type_4(data.getAccelDeviceId());

      cdr.write_type_4(data.getGyroDeviceId());

      cdr.write_type_4(data.getAccelErrorCount());

      cdr.write_type_4(data.getGyroErrorCount());

      cdr.write_type_5(data.getAccelRateHz());

      cdr.write_type_5(data.getGyroRateHz());

      cdr.write_type_5(data.getAccelRawRateHz());

      cdr.write_type_5(data.getGyroRawRateHz());

      cdr.write_type_5(data.getAccelVibrationMetric());

      cdr.write_type_5(data.getGyroVibrationMetric());

      cdr.write_type_5(data.getDeltaAngleConingMetric());

      for(int i0 = 0; i0 < data.getMeanAccel().length; ++i0)
      {
        	cdr.write_type_5(data.getMeanAccel()[i0]);	
      }

      for(int i0 = 0; i0 < data.getMeanGyro().length; ++i0)
      {
        	cdr.write_type_5(data.getMeanGyro()[i0]);	
      }

      for(int i0 = 0; i0 < data.getVarAccel().length; ++i0)
      {
        	cdr.write_type_5(data.getVarAccel()[i0]);	
      }

      for(int i0 = 0; i0 < data.getVarGyro().length; ++i0)
      {
        	cdr.write_type_5(data.getVarGyro()[i0]);	
      }

      cdr.write_type_5(data.getTemperatureAccel());

      cdr.write_type_5(data.getTemperatureGyro());

   }

   public static void read(px4_msgs.msg.dds.VehicleImuStatus data, us.ihmc.idl.CDR cdr)
   {
      data.setTimestamp(cdr.read_type_12());
      	
      data.setAccelDeviceId(cdr.read_type_4());
      	
      data.setGyroDeviceId(cdr.read_type_4());
      	
      data.setAccelErrorCount(cdr.read_type_4());
      	
      data.setGyroErrorCount(cdr.read_type_4());
      	
      data.setAccelRateHz(cdr.read_type_5());
      	
      data.setGyroRateHz(cdr.read_type_5());
      	
      data.setAccelRawRateHz(cdr.read_type_5());
      	
      data.setGyroRawRateHz(cdr.read_type_5());
      	
      data.setAccelVibrationMetric(cdr.read_type_5());
      	
      data.setGyroVibrationMetric(cdr.read_type_5());
      	
      data.setDeltaAngleConingMetric(cdr.read_type_5());
      	
      for(int i0 = 0; i0 < data.getMeanAccel().length; ++i0)
      {
        	data.getMeanAccel()[i0] = cdr.read_type_5();
        	
      }
      	
      for(int i0 = 0; i0 < data.getMeanGyro().length; ++i0)
      {
        	data.getMeanGyro()[i0] = cdr.read_type_5();
        	
      }
      	
      for(int i0 = 0; i0 < data.getVarAccel().length; ++i0)
      {
        	data.getVarAccel()[i0] = cdr.read_type_5();
        	
      }
      	
      for(int i0 = 0; i0 < data.getVarGyro().length; ++i0)
      {
        	data.getVarGyro()[i0] = cdr.read_type_5();
        	
      }
      	
      data.setTemperatureAccel(cdr.read_type_5());
      	
      data.setTemperatureGyro(cdr.read_type_5());
      	

   }

   @Override
   public final void serialize(px4_msgs.msg.dds.VehicleImuStatus data, us.ihmc.idl.InterchangeSerializer ser)
   {
      ser.write_type_12("timestamp", data.getTimestamp());
      ser.write_type_4("accel_device_id", data.getAccelDeviceId());
      ser.write_type_4("gyro_device_id", data.getGyroDeviceId());
      ser.write_type_4("accel_error_count", data.getAccelErrorCount());
      ser.write_type_4("gyro_error_count", data.getGyroErrorCount());
      ser.write_type_5("accel_rate_hz", data.getAccelRateHz());
      ser.write_type_5("gyro_rate_hz", data.getGyroRateHz());
      ser.write_type_5("accel_raw_rate_hz", data.getAccelRawRateHz());
      ser.write_type_5("gyro_raw_rate_hz", data.getGyroRawRateHz());
      ser.write_type_5("accel_vibration_metric", data.getAccelVibrationMetric());
      ser.write_type_5("gyro_vibration_metric", data.getGyroVibrationMetric());
      ser.write_type_5("delta_angle_coning_metric", data.getDeltaAngleConingMetric());
      ser.write_type_f("mean_accel", data.getMeanAccel());
      ser.write_type_f("mean_gyro", data.getMeanGyro());
      ser.write_type_f("var_accel", data.getVarAccel());
      ser.write_type_f("var_gyro", data.getVarGyro());
      ser.write_type_5("temperature_accel", data.getTemperatureAccel());
      ser.write_type_5("temperature_gyro", data.getTemperatureGyro());
   }

   @Override
   public final void deserialize(us.ihmc.idl.InterchangeSerializer ser, px4_msgs.msg.dds.VehicleImuStatus data)
   {
      data.setTimestamp(ser.read_type_12("timestamp"));
      data.setAccelDeviceId(ser.read_type_4("accel_device_id"));
      data.setGyroDeviceId(ser.read_type_4("gyro_device_id"));
      data.setAccelErrorCount(ser.read_type_4("accel_error_count"));
      data.setGyroErrorCount(ser.read_type_4("gyro_error_count"));
      data.setAccelRateHz(ser.read_type_5("accel_rate_hz"));
      data.setGyroRateHz(ser.read_type_5("gyro_rate_hz"));
      data.setAccelRawRateHz(ser.read_type_5("accel_raw_rate_hz"));
      data.setGyroRawRateHz(ser.read_type_5("gyro_raw_rate_hz"));
      data.setAccelVibrationMetric(ser.read_type_5("accel_vibration_metric"));
      data.setGyroVibrationMetric(ser.read_type_5("gyro_vibration_metric"));
      data.setDeltaAngleConingMetric(ser.read_type_5("delta_angle_coning_metric"));
      ser.read_type_f("mean_accel", data.getMeanAccel());
      ser.read_type_f("mean_gyro", data.getMeanGyro());
      ser.read_type_f("var_accel", data.getVarAccel());
      ser.read_type_f("var_gyro", data.getVarGyro());
      data.setTemperatureAccel(ser.read_type_5("temperature_accel"));
      data.setTemperatureGyro(ser.read_type_5("temperature_gyro"));
   }

   public static void staticCopy(px4_msgs.msg.dds.VehicleImuStatus src, px4_msgs.msg.dds.VehicleImuStatus dest)
   {
      dest.set(src);
   }

   @Override
   public px4_msgs.msg.dds.VehicleImuStatus createData()
   {
      return new px4_msgs.msg.dds.VehicleImuStatus();
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
   
   public void serialize(px4_msgs.msg.dds.VehicleImuStatus data, us.ihmc.idl.CDR cdr)
   {
      write(data, cdr);
   }

   public void deserialize(px4_msgs.msg.dds.VehicleImuStatus data, us.ihmc.idl.CDR cdr)
   {
      read(data, cdr);
   }
   
   public void copy(px4_msgs.msg.dds.VehicleImuStatus src, px4_msgs.msg.dds.VehicleImuStatus dest)
   {
      staticCopy(src, dest);
   }

   @Override
   public VehicleImuStatusPubSubType newInstance()
   {
      return new VehicleImuStatusPubSubType();
   }
}
