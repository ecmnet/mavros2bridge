package px4_msgs.msg.dds;

/**
* 
* Topic data type of the struct "SensorsStatusImu" defined in "SensorsStatusImu_.idl". Use this class to provide the TopicDataType to a Participant. 
*
* This file was automatically generated from SensorsStatusImu_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit SensorsStatusImu_.idl instead.
*
*/
public class SensorsStatusImuPubSubType implements us.ihmc.pubsub.TopicDataType<px4_msgs.msg.dds.SensorsStatusImu>
{
   public static final java.lang.String name = "px4_msgs::msg::dds_::SensorsStatusImu_";
   
   @Override
   public final java.lang.String getDefinitionChecksum()
   {
   		return "e4e9977ee9badd0eb5c46dec3dca576b32dcedfcdee4e176174f4ac59dfb6775";
   }
   
   @Override
   public final java.lang.String getDefinitionVersion()
   {
   		return "";
   }

   private final us.ihmc.idl.CDR serializeCDR = new us.ihmc.idl.CDR();
   private final us.ihmc.idl.CDR deserializeCDR = new us.ihmc.idl.CDR();

   @Override
   public void serialize(px4_msgs.msg.dds.SensorsStatusImu data, us.ihmc.pubsub.common.SerializedPayload serializedPayload) throws java.io.IOException
   {
      serializeCDR.serialize(serializedPayload);
      write(data, serializeCDR);
      serializeCDR.finishSerialize();
   }

   @Override
   public void deserialize(us.ihmc.pubsub.common.SerializedPayload serializedPayload, px4_msgs.msg.dds.SensorsStatusImu data) throws java.io.IOException
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

      current_alignment += ((4) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += ((4) * 1) + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += ((4) * 1) + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += ((4) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += ((4) * 1) + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += ((4) * 1) + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      return current_alignment - initial_alignment;
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.SensorsStatusImu data)
   {
      return getCdrSerializedSize(data, 0);
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.SensorsStatusImu data, int current_alignment)
   {
      int initial_alignment = current_alignment;

      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += ((4) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);
      current_alignment += ((4) * 1) + us.ihmc.idl.CDR.alignment(current_alignment, 1);
      current_alignment += ((4) * 1) + us.ihmc.idl.CDR.alignment(current_alignment, 1);
      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += ((4) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);
      current_alignment += ((4) * 1) + us.ihmc.idl.CDR.alignment(current_alignment, 1);
      current_alignment += ((4) * 1) + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      return current_alignment - initial_alignment;
   }

   public static void write(px4_msgs.msg.dds.SensorsStatusImu data, us.ihmc.idl.CDR cdr)
   {
      cdr.write_type_12(data.getTimestamp());

      cdr.write_type_4(data.getAccelDeviceIdPrimary());

      for(int i0 = 0; i0 < data.getAccelInconsistencyMSS().length; ++i0)
      {
        	cdr.write_type_5(data.getAccelInconsistencyMSS()[i0]);	
      }

      for(int i0 = 0; i0 < data.getAccelHealthy().length; ++i0)
      {
        	cdr.write_type_7(data.getAccelHealthy()[i0]);	
      }

      for(int i0 = 0; i0 < data.getAccelPriority().length; ++i0)
      {
        	cdr.write_type_9(data.getAccelPriority()[i0]);	
      }

      cdr.write_type_4(data.getGyroDeviceIdPrimary());

      for(int i0 = 0; i0 < data.getGyroInconsistencyRadS().length; ++i0)
      {
        	cdr.write_type_5(data.getGyroInconsistencyRadS()[i0]);	
      }

      for(int i0 = 0; i0 < data.getGyroHealthy().length; ++i0)
      {
        	cdr.write_type_7(data.getGyroHealthy()[i0]);	
      }

      for(int i0 = 0; i0 < data.getGyroPriority().length; ++i0)
      {
        	cdr.write_type_9(data.getGyroPriority()[i0]);	
      }

   }

   public static void read(px4_msgs.msg.dds.SensorsStatusImu data, us.ihmc.idl.CDR cdr)
   {
      data.setTimestamp(cdr.read_type_12());
      	
      data.setAccelDeviceIdPrimary(cdr.read_type_4());
      	
      for(int i0 = 0; i0 < data.getAccelInconsistencyMSS().length; ++i0)
      {
        	data.getAccelInconsistencyMSS()[i0] = cdr.read_type_5();
        	
      }
      	
      for(int i0 = 0; i0 < data.getAccelHealthy().length; ++i0)
      {
        	data.getAccelHealthy()[i0] = cdr.read_type_7();
        	
      }
      	
      for(int i0 = 0; i0 < data.getAccelPriority().length; ++i0)
      {
        	data.getAccelPriority()[i0] = cdr.read_type_9();
        	
      }
      	
      data.setGyroDeviceIdPrimary(cdr.read_type_4());
      	
      for(int i0 = 0; i0 < data.getGyroInconsistencyRadS().length; ++i0)
      {
        	data.getGyroInconsistencyRadS()[i0] = cdr.read_type_5();
        	
      }
      	
      for(int i0 = 0; i0 < data.getGyroHealthy().length; ++i0)
      {
        	data.getGyroHealthy()[i0] = cdr.read_type_7();
        	
      }
      	
      for(int i0 = 0; i0 < data.getGyroPriority().length; ++i0)
      {
        	data.getGyroPriority()[i0] = cdr.read_type_9();
        	
      }
      	

   }

   @Override
   public final void serialize(px4_msgs.msg.dds.SensorsStatusImu data, us.ihmc.idl.InterchangeSerializer ser)
   {
      ser.write_type_12("timestamp", data.getTimestamp());
      ser.write_type_4("accel_device_id_primary", data.getAccelDeviceIdPrimary());
      ser.write_type_f("accel_inconsistency_m_s_s", data.getAccelInconsistencyMSS());
      ser.write_type_f("accel_healthy", data.getAccelHealthy());
      ser.write_type_f("accel_priority", data.getAccelPriority());
      ser.write_type_4("gyro_device_id_primary", data.getGyroDeviceIdPrimary());
      ser.write_type_f("gyro_inconsistency_rad_s", data.getGyroInconsistencyRadS());
      ser.write_type_f("gyro_healthy", data.getGyroHealthy());
      ser.write_type_f("gyro_priority", data.getGyroPriority());
   }

   @Override
   public final void deserialize(us.ihmc.idl.InterchangeSerializer ser, px4_msgs.msg.dds.SensorsStatusImu data)
   {
      data.setTimestamp(ser.read_type_12("timestamp"));
      data.setAccelDeviceIdPrimary(ser.read_type_4("accel_device_id_primary"));
      ser.read_type_f("accel_inconsistency_m_s_s", data.getAccelInconsistencyMSS());
      ser.read_type_f("accel_healthy", data.getAccelHealthy());
      ser.read_type_f("accel_priority", data.getAccelPriority());
      data.setGyroDeviceIdPrimary(ser.read_type_4("gyro_device_id_primary"));
      ser.read_type_f("gyro_inconsistency_rad_s", data.getGyroInconsistencyRadS());
      ser.read_type_f("gyro_healthy", data.getGyroHealthy());
      ser.read_type_f("gyro_priority", data.getGyroPriority());
   }

   public static void staticCopy(px4_msgs.msg.dds.SensorsStatusImu src, px4_msgs.msg.dds.SensorsStatusImu dest)
   {
      dest.set(src);
   }

   @Override
   public px4_msgs.msg.dds.SensorsStatusImu createData()
   {
      return new px4_msgs.msg.dds.SensorsStatusImu();
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
   
   public void serialize(px4_msgs.msg.dds.SensorsStatusImu data, us.ihmc.idl.CDR cdr)
   {
      write(data, cdr);
   }

   public void deserialize(px4_msgs.msg.dds.SensorsStatusImu data, us.ihmc.idl.CDR cdr)
   {
      read(data, cdr);
   }
   
   public void copy(px4_msgs.msg.dds.SensorsStatusImu src, px4_msgs.msg.dds.SensorsStatusImu dest)
   {
      staticCopy(src, dest);
   }

   @Override
   public SensorsStatusImuPubSubType newInstance()
   {
      return new SensorsStatusImuPubSubType();
   }
}
