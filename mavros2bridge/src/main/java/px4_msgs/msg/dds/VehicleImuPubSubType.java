package px4_msgs.msg.dds;

/**
* 
* Topic data type of the struct "VehicleImu" defined in "VehicleImu_.idl". Use this class to provide the TopicDataType to a Participant. 
*
* This file was automatically generated from VehicleImu_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit VehicleImu_.idl instead.
*
*/
public class VehicleImuPubSubType implements us.ihmc.pubsub.TopicDataType<px4_msgs.msg.dds.VehicleImu>
{
   public static final java.lang.String name = "px4_msgs::msg::dds_::VehicleImu_";
   
   @Override
   public final java.lang.String getDefinitionChecksum()
   {
   		return "8ec9795a528f914ba09354363e8f7174b3a539c75fc60e403e04252f143bbb4d";
   }
   
   @Override
   public final java.lang.String getDefinitionVersion()
   {
   		return "";
   }

   private final us.ihmc.idl.CDR serializeCDR = new us.ihmc.idl.CDR();
   private final us.ihmc.idl.CDR deserializeCDR = new us.ihmc.idl.CDR();

   @Override
   public void serialize(px4_msgs.msg.dds.VehicleImu data, us.ihmc.pubsub.common.SerializedPayload serializedPayload) throws java.io.IOException
   {
      serializeCDR.serialize(serializedPayload);
      write(data, serializeCDR);
      serializeCDR.finishSerialize();
   }

   @Override
   public void deserialize(us.ihmc.pubsub.common.SerializedPayload serializedPayload, px4_msgs.msg.dds.VehicleImu data) throws java.io.IOException
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

      current_alignment += ((3) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += ((3) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 2 + us.ihmc.idl.CDR.alignment(current_alignment, 2);

      current_alignment += 2 + us.ihmc.idl.CDR.alignment(current_alignment, 2);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      return current_alignment - initial_alignment;
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.VehicleImu data)
   {
      return getCdrSerializedSize(data, 0);
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.VehicleImu data, int current_alignment)
   {
      int initial_alignment = current_alignment;

      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += ((3) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);
      current_alignment += ((3) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);
      current_alignment += 2 + us.ihmc.idl.CDR.alignment(current_alignment, 2);


      current_alignment += 2 + us.ihmc.idl.CDR.alignment(current_alignment, 2);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);



      return current_alignment - initial_alignment;
   }

   public static void write(px4_msgs.msg.dds.VehicleImu data, us.ihmc.idl.CDR cdr)
   {
      cdr.write_type_12(data.getTimestamp());

      cdr.write_type_12(data.getTimestampSample());

      cdr.write_type_4(data.getAccelDeviceId());

      cdr.write_type_4(data.getGyroDeviceId());

      for(int i0 = 0; i0 < data.getDeltaAngle().length; ++i0)
      {
        	cdr.write_type_5(data.getDeltaAngle()[i0]);	
      }

      for(int i0 = 0; i0 < data.getDeltaVelocity().length; ++i0)
      {
        	cdr.write_type_5(data.getDeltaVelocity()[i0]);	
      }

      cdr.write_type_3(data.getDeltaAngleDt());

      cdr.write_type_3(data.getDeltaVelocityDt());

      cdr.write_type_9(data.getDeltaAngleClipping());

      cdr.write_type_9(data.getDeltaVelocityClipping());

      cdr.write_type_9(data.getAccelCalibrationCount());

      cdr.write_type_9(data.getGyroCalibrationCount());

   }

   public static void read(px4_msgs.msg.dds.VehicleImu data, us.ihmc.idl.CDR cdr)
   {
      data.setTimestamp(cdr.read_type_12());
      	
      data.setTimestampSample(cdr.read_type_12());
      	
      data.setAccelDeviceId(cdr.read_type_4());
      	
      data.setGyroDeviceId(cdr.read_type_4());
      	
      for(int i0 = 0; i0 < data.getDeltaAngle().length; ++i0)
      {
        	data.getDeltaAngle()[i0] = cdr.read_type_5();
        	
      }
      	
      for(int i0 = 0; i0 < data.getDeltaVelocity().length; ++i0)
      {
        	data.getDeltaVelocity()[i0] = cdr.read_type_5();
        	
      }
      	
      data.setDeltaAngleDt(cdr.read_type_3());
      	
      data.setDeltaVelocityDt(cdr.read_type_3());
      	
      data.setDeltaAngleClipping(cdr.read_type_9());
      	
      data.setDeltaVelocityClipping(cdr.read_type_9());
      	
      data.setAccelCalibrationCount(cdr.read_type_9());
      	
      data.setGyroCalibrationCount(cdr.read_type_9());
      	

   }

   @Override
   public final void serialize(px4_msgs.msg.dds.VehicleImu data, us.ihmc.idl.InterchangeSerializer ser)
   {
      ser.write_type_12("timestamp", data.getTimestamp());
      ser.write_type_12("timestamp_sample", data.getTimestampSample());
      ser.write_type_4("accel_device_id", data.getAccelDeviceId());
      ser.write_type_4("gyro_device_id", data.getGyroDeviceId());
      ser.write_type_f("delta_angle", data.getDeltaAngle());
      ser.write_type_f("delta_velocity", data.getDeltaVelocity());
      ser.write_type_3("delta_angle_dt", data.getDeltaAngleDt());
      ser.write_type_3("delta_velocity_dt", data.getDeltaVelocityDt());
      ser.write_type_9("delta_angle_clipping", data.getDeltaAngleClipping());
      ser.write_type_9("delta_velocity_clipping", data.getDeltaVelocityClipping());
      ser.write_type_9("accel_calibration_count", data.getAccelCalibrationCount());
      ser.write_type_9("gyro_calibration_count", data.getGyroCalibrationCount());
   }

   @Override
   public final void deserialize(us.ihmc.idl.InterchangeSerializer ser, px4_msgs.msg.dds.VehicleImu data)
   {
      data.setTimestamp(ser.read_type_12("timestamp"));
      data.setTimestampSample(ser.read_type_12("timestamp_sample"));
      data.setAccelDeviceId(ser.read_type_4("accel_device_id"));
      data.setGyroDeviceId(ser.read_type_4("gyro_device_id"));
      ser.read_type_f("delta_angle", data.getDeltaAngle());
      ser.read_type_f("delta_velocity", data.getDeltaVelocity());
      data.setDeltaAngleDt(ser.read_type_3("delta_angle_dt"));
      data.setDeltaVelocityDt(ser.read_type_3("delta_velocity_dt"));
      data.setDeltaAngleClipping(ser.read_type_9("delta_angle_clipping"));
      data.setDeltaVelocityClipping(ser.read_type_9("delta_velocity_clipping"));
      data.setAccelCalibrationCount(ser.read_type_9("accel_calibration_count"));
      data.setGyroCalibrationCount(ser.read_type_9("gyro_calibration_count"));
   }

   public static void staticCopy(px4_msgs.msg.dds.VehicleImu src, px4_msgs.msg.dds.VehicleImu dest)
   {
      dest.set(src);
   }

   @Override
   public px4_msgs.msg.dds.VehicleImu createData()
   {
      return new px4_msgs.msg.dds.VehicleImu();
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
   
   public void serialize(px4_msgs.msg.dds.VehicleImu data, us.ihmc.idl.CDR cdr)
   {
      write(data, cdr);
   }

   public void deserialize(px4_msgs.msg.dds.VehicleImu data, us.ihmc.idl.CDR cdr)
   {
      read(data, cdr);
   }
   
   public void copy(px4_msgs.msg.dds.VehicleImu src, px4_msgs.msg.dds.VehicleImu dest)
   {
      staticCopy(src, dest);
   }

   @Override
   public VehicleImuPubSubType newInstance()
   {
      return new VehicleImuPubSubType();
   }
}
