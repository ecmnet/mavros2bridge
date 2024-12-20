package px4_msgs.msg.dds;

/**
* 
* Topic data type of the struct "EstimatorSelectorStatus" defined in "EstimatorSelectorStatus_.idl". Use this class to provide the TopicDataType to a Participant. 
*
* This file was automatically generated from EstimatorSelectorStatus_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit EstimatorSelectorStatus_.idl instead.
*
*/
public class EstimatorSelectorStatusPubSubType implements us.ihmc.pubsub.TopicDataType<px4_msgs.msg.dds.EstimatorSelectorStatus>
{
   public static final java.lang.String name = "px4_msgs::msg::dds_::EstimatorSelectorStatus_";
   
   @Override
   public final java.lang.String getDefinitionChecksum()
   {
   		return "6f258cfa5ed7bc071f5fb82bf44dc8477b8517c0acfd830dd26412cfdac24af8";
   }
   
   @Override
   public final java.lang.String getDefinitionVersion()
   {
   		return "";
   }

   private final us.ihmc.idl.CDR serializeCDR = new us.ihmc.idl.CDR();
   private final us.ihmc.idl.CDR deserializeCDR = new us.ihmc.idl.CDR();

   @Override
   public void serialize(px4_msgs.msg.dds.EstimatorSelectorStatus data, us.ihmc.pubsub.common.SerializedPayload serializedPayload) throws java.io.IOException
   {
      serializeCDR.serialize(serializedPayload);
      write(data, serializeCDR);
      serializeCDR.finishSerialize();
   }

   @Override
   public void deserialize(us.ihmc.pubsub.common.SerializedPayload serializedPayload, px4_msgs.msg.dds.EstimatorSelectorStatus data) throws java.io.IOException
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

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += ((9) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += ((9) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += ((9) * 1) + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += ((4) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += ((4) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      return current_alignment - initial_alignment;
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.EstimatorSelectorStatus data)
   {
      return getCdrSerializedSize(data, 0);
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.EstimatorSelectorStatus data, int current_alignment)
   {
      int initial_alignment = current_alignment;

      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += ((9) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);
      current_alignment += ((9) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);
      current_alignment += ((9) * 1) + us.ihmc.idl.CDR.alignment(current_alignment, 1);
      current_alignment += ((4) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);
      current_alignment += ((4) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);
      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);



      return current_alignment - initial_alignment;
   }

   public static void write(px4_msgs.msg.dds.EstimatorSelectorStatus data, us.ihmc.idl.CDR cdr)
   {
      cdr.write_type_12(data.getTimestamp());

      cdr.write_type_9(data.getPrimaryInstance());

      cdr.write_type_9(data.getInstancesAvailable());

      cdr.write_type_4(data.getInstanceChangedCount());

      cdr.write_type_12(data.getLastInstanceChange());

      cdr.write_type_4(data.getAccelDeviceId());

      cdr.write_type_4(data.getBaroDeviceId());

      cdr.write_type_4(data.getGyroDeviceId());

      cdr.write_type_4(data.getMagDeviceId());

      for(int i0 = 0; i0 < data.getCombinedTestRatio().length; ++i0)
      {
        	cdr.write_type_5(data.getCombinedTestRatio()[i0]);	
      }

      for(int i0 = 0; i0 < data.getRelativeTestRatio().length; ++i0)
      {
        	cdr.write_type_5(data.getRelativeTestRatio()[i0]);	
      }

      for(int i0 = 0; i0 < data.getHealthy().length; ++i0)
      {
        	cdr.write_type_7(data.getHealthy()[i0]);	
      }

      for(int i0 = 0; i0 < data.getAccumulatedGyroError().length; ++i0)
      {
        	cdr.write_type_5(data.getAccumulatedGyroError()[i0]);	
      }

      for(int i0 = 0; i0 < data.getAccumulatedAccelError().length; ++i0)
      {
        	cdr.write_type_5(data.getAccumulatedAccelError()[i0]);	
      }

      cdr.write_type_7(data.getGyroFaultDetected());

      cdr.write_type_7(data.getAccelFaultDetected());

   }

   public static void read(px4_msgs.msg.dds.EstimatorSelectorStatus data, us.ihmc.idl.CDR cdr)
   {
      data.setTimestamp(cdr.read_type_12());
      	
      data.setPrimaryInstance(cdr.read_type_9());
      	
      data.setInstancesAvailable(cdr.read_type_9());
      	
      data.setInstanceChangedCount(cdr.read_type_4());
      	
      data.setLastInstanceChange(cdr.read_type_12());
      	
      data.setAccelDeviceId(cdr.read_type_4());
      	
      data.setBaroDeviceId(cdr.read_type_4());
      	
      data.setGyroDeviceId(cdr.read_type_4());
      	
      data.setMagDeviceId(cdr.read_type_4());
      	
      for(int i0 = 0; i0 < data.getCombinedTestRatio().length; ++i0)
      {
        	data.getCombinedTestRatio()[i0] = cdr.read_type_5();
        	
      }
      	
      for(int i0 = 0; i0 < data.getRelativeTestRatio().length; ++i0)
      {
        	data.getRelativeTestRatio()[i0] = cdr.read_type_5();
        	
      }
      	
      for(int i0 = 0; i0 < data.getHealthy().length; ++i0)
      {
        	data.getHealthy()[i0] = cdr.read_type_7();
        	
      }
      	
      for(int i0 = 0; i0 < data.getAccumulatedGyroError().length; ++i0)
      {
        	data.getAccumulatedGyroError()[i0] = cdr.read_type_5();
        	
      }
      	
      for(int i0 = 0; i0 < data.getAccumulatedAccelError().length; ++i0)
      {
        	data.getAccumulatedAccelError()[i0] = cdr.read_type_5();
        	
      }
      	
      data.setGyroFaultDetected(cdr.read_type_7());
      	
      data.setAccelFaultDetected(cdr.read_type_7());
      	

   }

   @Override
   public final void serialize(px4_msgs.msg.dds.EstimatorSelectorStatus data, us.ihmc.idl.InterchangeSerializer ser)
   {
      ser.write_type_12("timestamp", data.getTimestamp());
      ser.write_type_9("primary_instance", data.getPrimaryInstance());
      ser.write_type_9("instances_available", data.getInstancesAvailable());
      ser.write_type_4("instance_changed_count", data.getInstanceChangedCount());
      ser.write_type_12("last_instance_change", data.getLastInstanceChange());
      ser.write_type_4("accel_device_id", data.getAccelDeviceId());
      ser.write_type_4("baro_device_id", data.getBaroDeviceId());
      ser.write_type_4("gyro_device_id", data.getGyroDeviceId());
      ser.write_type_4("mag_device_id", data.getMagDeviceId());
      ser.write_type_f("combined_test_ratio", data.getCombinedTestRatio());
      ser.write_type_f("relative_test_ratio", data.getRelativeTestRatio());
      ser.write_type_f("healthy", data.getHealthy());
      ser.write_type_f("accumulated_gyro_error", data.getAccumulatedGyroError());
      ser.write_type_f("accumulated_accel_error", data.getAccumulatedAccelError());
      ser.write_type_7("gyro_fault_detected", data.getGyroFaultDetected());
      ser.write_type_7("accel_fault_detected", data.getAccelFaultDetected());
   }

   @Override
   public final void deserialize(us.ihmc.idl.InterchangeSerializer ser, px4_msgs.msg.dds.EstimatorSelectorStatus data)
   {
      data.setTimestamp(ser.read_type_12("timestamp"));
      data.setPrimaryInstance(ser.read_type_9("primary_instance"));
      data.setInstancesAvailable(ser.read_type_9("instances_available"));
      data.setInstanceChangedCount(ser.read_type_4("instance_changed_count"));
      data.setLastInstanceChange(ser.read_type_12("last_instance_change"));
      data.setAccelDeviceId(ser.read_type_4("accel_device_id"));
      data.setBaroDeviceId(ser.read_type_4("baro_device_id"));
      data.setGyroDeviceId(ser.read_type_4("gyro_device_id"));
      data.setMagDeviceId(ser.read_type_4("mag_device_id"));
      ser.read_type_f("combined_test_ratio", data.getCombinedTestRatio());
      ser.read_type_f("relative_test_ratio", data.getRelativeTestRatio());
      ser.read_type_f("healthy", data.getHealthy());
      ser.read_type_f("accumulated_gyro_error", data.getAccumulatedGyroError());
      ser.read_type_f("accumulated_accel_error", data.getAccumulatedAccelError());
      data.setGyroFaultDetected(ser.read_type_7("gyro_fault_detected"));
      data.setAccelFaultDetected(ser.read_type_7("accel_fault_detected"));
   }

   public static void staticCopy(px4_msgs.msg.dds.EstimatorSelectorStatus src, px4_msgs.msg.dds.EstimatorSelectorStatus dest)
   {
      dest.set(src);
   }

   @Override
   public px4_msgs.msg.dds.EstimatorSelectorStatus createData()
   {
      return new px4_msgs.msg.dds.EstimatorSelectorStatus();
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
   
   public void serialize(px4_msgs.msg.dds.EstimatorSelectorStatus data, us.ihmc.idl.CDR cdr)
   {
      write(data, cdr);
   }

   public void deserialize(px4_msgs.msg.dds.EstimatorSelectorStatus data, us.ihmc.idl.CDR cdr)
   {
      read(data, cdr);
   }
   
   public void copy(px4_msgs.msg.dds.EstimatorSelectorStatus src, px4_msgs.msg.dds.EstimatorSelectorStatus dest)
   {
      staticCopy(src, dest);
   }

   @Override
   public EstimatorSelectorStatusPubSubType newInstance()
   {
      return new EstimatorSelectorStatusPubSubType();
   }
}
