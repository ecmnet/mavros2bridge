package px4_msgs.msg.dds;

/**
* 
* Topic data type of the struct "SensorCombined" defined in "SensorCombined_.idl". Use this class to provide the TopicDataType to a Participant. 
*
* This file was automatically generated from SensorCombined_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit SensorCombined_.idl instead.
*
*/
public class SensorCombinedPubSubType implements us.ihmc.pubsub.TopicDataType<px4_msgs.msg.dds.SensorCombined>
{
   public static final java.lang.String name = "px4_msgs::msg::dds_::SensorCombined_";
   
   @Override
   public final java.lang.String getDefinitionChecksum()
   {
   		return "540a5997b50e2433b146d58edf88de3b322b9161538494be0fa763b5c135d2f6";
   }
   
   @Override
   public final java.lang.String getDefinitionVersion()
   {
   		return "";
   }

   private final us.ihmc.idl.CDR serializeCDR = new us.ihmc.idl.CDR();
   private final us.ihmc.idl.CDR deserializeCDR = new us.ihmc.idl.CDR();

   @Override
   public void serialize(px4_msgs.msg.dds.SensorCombined data, us.ihmc.pubsub.common.SerializedPayload serializedPayload) throws java.io.IOException
   {
      serializeCDR.serialize(serializedPayload);
      write(data, serializeCDR);
      serializeCDR.finishSerialize();
   }

   @Override
   public void deserialize(us.ihmc.pubsub.common.SerializedPayload serializedPayload, px4_msgs.msg.dds.SensorCombined data) throws java.io.IOException
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

      current_alignment += ((3) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += ((3) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      return current_alignment - initial_alignment;
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.SensorCombined data)
   {
      return getCdrSerializedSize(data, 0);
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.SensorCombined data, int current_alignment)
   {
      int initial_alignment = current_alignment;

      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += ((3) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);
      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += ((3) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);
      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);



      return current_alignment - initial_alignment;
   }

   public static void write(px4_msgs.msg.dds.SensorCombined data, us.ihmc.idl.CDR cdr)
   {
      cdr.write_type_12(data.getTimestamp());

      for(int i0 = 0; i0 < data.getGyroRad().length; ++i0)
      {
        	cdr.write_type_5(data.getGyroRad()[i0]);	
      }

      cdr.write_type_4(data.getGyroIntegralDt());

      cdr.write_type_2(data.getAccelerometerTimestampRelative());

      for(int i0 = 0; i0 < data.getAccelerometerMS2().length; ++i0)
      {
        	cdr.write_type_5(data.getAccelerometerMS2()[i0]);	
      }

      cdr.write_type_4(data.getAccelerometerIntegralDt());

      cdr.write_type_9(data.getAccelerometerClipping());

      cdr.write_type_9(data.getGyroClipping());

      cdr.write_type_9(data.getAccelCalibrationCount());

      cdr.write_type_9(data.getGyroCalibrationCount());

   }

   public static void read(px4_msgs.msg.dds.SensorCombined data, us.ihmc.idl.CDR cdr)
   {
      data.setTimestamp(cdr.read_type_12());
      	
      for(int i0 = 0; i0 < data.getGyroRad().length; ++i0)
      {
        	data.getGyroRad()[i0] = cdr.read_type_5();
        	
      }
      	
      data.setGyroIntegralDt(cdr.read_type_4());
      	
      data.setAccelerometerTimestampRelative(cdr.read_type_2());
      	
      for(int i0 = 0; i0 < data.getAccelerometerMS2().length; ++i0)
      {
        	data.getAccelerometerMS2()[i0] = cdr.read_type_5();
        	
      }
      	
      data.setAccelerometerIntegralDt(cdr.read_type_4());
      	
      data.setAccelerometerClipping(cdr.read_type_9());
      	
      data.setGyroClipping(cdr.read_type_9());
      	
      data.setAccelCalibrationCount(cdr.read_type_9());
      	
      data.setGyroCalibrationCount(cdr.read_type_9());
      	

   }

   @Override
   public final void serialize(px4_msgs.msg.dds.SensorCombined data, us.ihmc.idl.InterchangeSerializer ser)
   {
      ser.write_type_12("timestamp", data.getTimestamp());
      ser.write_type_f("gyro_rad", data.getGyroRad());
      ser.write_type_4("gyro_integral_dt", data.getGyroIntegralDt());
      ser.write_type_2("accelerometer_timestamp_relative", data.getAccelerometerTimestampRelative());
      ser.write_type_f("accelerometer_m_s2", data.getAccelerometerMS2());
      ser.write_type_4("accelerometer_integral_dt", data.getAccelerometerIntegralDt());
      ser.write_type_9("accelerometer_clipping", data.getAccelerometerClipping());
      ser.write_type_9("gyro_clipping", data.getGyroClipping());
      ser.write_type_9("accel_calibration_count", data.getAccelCalibrationCount());
      ser.write_type_9("gyro_calibration_count", data.getGyroCalibrationCount());
   }

   @Override
   public final void deserialize(us.ihmc.idl.InterchangeSerializer ser, px4_msgs.msg.dds.SensorCombined data)
   {
      data.setTimestamp(ser.read_type_12("timestamp"));
      ser.read_type_f("gyro_rad", data.getGyroRad());
      data.setGyroIntegralDt(ser.read_type_4("gyro_integral_dt"));
      data.setAccelerometerTimestampRelative(ser.read_type_2("accelerometer_timestamp_relative"));
      ser.read_type_f("accelerometer_m_s2", data.getAccelerometerMS2());
      data.setAccelerometerIntegralDt(ser.read_type_4("accelerometer_integral_dt"));
      data.setAccelerometerClipping(ser.read_type_9("accelerometer_clipping"));
      data.setGyroClipping(ser.read_type_9("gyro_clipping"));
      data.setAccelCalibrationCount(ser.read_type_9("accel_calibration_count"));
      data.setGyroCalibrationCount(ser.read_type_9("gyro_calibration_count"));
   }

   public static void staticCopy(px4_msgs.msg.dds.SensorCombined src, px4_msgs.msg.dds.SensorCombined dest)
   {
      dest.set(src);
   }

   @Override
   public px4_msgs.msg.dds.SensorCombined createData()
   {
      return new px4_msgs.msg.dds.SensorCombined();
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
   
   public void serialize(px4_msgs.msg.dds.SensorCombined data, us.ihmc.idl.CDR cdr)
   {
      write(data, cdr);
   }

   public void deserialize(px4_msgs.msg.dds.SensorCombined data, us.ihmc.idl.CDR cdr)
   {
      read(data, cdr);
   }
   
   public void copy(px4_msgs.msg.dds.SensorCombined src, px4_msgs.msg.dds.SensorCombined dest)
   {
      staticCopy(src, dest);
   }

   @Override
   public SensorCombinedPubSubType newInstance()
   {
      return new SensorCombinedPubSubType();
   }
}
