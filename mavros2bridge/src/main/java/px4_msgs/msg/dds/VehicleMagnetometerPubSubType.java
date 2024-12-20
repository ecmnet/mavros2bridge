package px4_msgs.msg.dds;

/**
* 
* Topic data type of the struct "VehicleMagnetometer" defined in "VehicleMagnetometer_.idl". Use this class to provide the TopicDataType to a Participant. 
*
* This file was automatically generated from VehicleMagnetometer_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit VehicleMagnetometer_.idl instead.
*
*/
public class VehicleMagnetometerPubSubType implements us.ihmc.pubsub.TopicDataType<px4_msgs.msg.dds.VehicleMagnetometer>
{
   public static final java.lang.String name = "px4_msgs::msg::dds_::VehicleMagnetometer_";
   
   @Override
   public final java.lang.String getDefinitionChecksum()
   {
   		return "22f482ab3eb9b7509b9aac472cc1eeb7fc8c50cfe5ff7e3079013a300a035368";
   }
   
   @Override
   public final java.lang.String getDefinitionVersion()
   {
   		return "";
   }

   private final us.ihmc.idl.CDR serializeCDR = new us.ihmc.idl.CDR();
   private final us.ihmc.idl.CDR deserializeCDR = new us.ihmc.idl.CDR();

   @Override
   public void serialize(px4_msgs.msg.dds.VehicleMagnetometer data, us.ihmc.pubsub.common.SerializedPayload serializedPayload) throws java.io.IOException
   {
      serializeCDR.serialize(serializedPayload);
      write(data, serializeCDR);
      serializeCDR.finishSerialize();
   }

   @Override
   public void deserialize(us.ihmc.pubsub.common.SerializedPayload serializedPayload, px4_msgs.msg.dds.VehicleMagnetometer data) throws java.io.IOException
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

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      return current_alignment - initial_alignment;
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.VehicleMagnetometer data)
   {
      return getCdrSerializedSize(data, 0);
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.VehicleMagnetometer data, int current_alignment)
   {
      int initial_alignment = current_alignment;

      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += ((3) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);
      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);



      return current_alignment - initial_alignment;
   }

   public static void write(px4_msgs.msg.dds.VehicleMagnetometer data, us.ihmc.idl.CDR cdr)
   {
      cdr.write_type_12(data.getTimestamp());

      cdr.write_type_12(data.getTimestampSample());

      cdr.write_type_4(data.getDeviceId());

      for(int i0 = 0; i0 < data.getMagnetometerGa().length; ++i0)
      {
        	cdr.write_type_5(data.getMagnetometerGa()[i0]);	
      }

      cdr.write_type_9(data.getCalibrationCount());

   }

   public static void read(px4_msgs.msg.dds.VehicleMagnetometer data, us.ihmc.idl.CDR cdr)
   {
      data.setTimestamp(cdr.read_type_12());
      	
      data.setTimestampSample(cdr.read_type_12());
      	
      data.setDeviceId(cdr.read_type_4());
      	
      for(int i0 = 0; i0 < data.getMagnetometerGa().length; ++i0)
      {
        	data.getMagnetometerGa()[i0] = cdr.read_type_5();
        	
      }
      	
      data.setCalibrationCount(cdr.read_type_9());
      	

   }

   @Override
   public final void serialize(px4_msgs.msg.dds.VehicleMagnetometer data, us.ihmc.idl.InterchangeSerializer ser)
   {
      ser.write_type_12("timestamp", data.getTimestamp());
      ser.write_type_12("timestamp_sample", data.getTimestampSample());
      ser.write_type_4("device_id", data.getDeviceId());
      ser.write_type_f("magnetometer_ga", data.getMagnetometerGa());
      ser.write_type_9("calibration_count", data.getCalibrationCount());
   }

   @Override
   public final void deserialize(us.ihmc.idl.InterchangeSerializer ser, px4_msgs.msg.dds.VehicleMagnetometer data)
   {
      data.setTimestamp(ser.read_type_12("timestamp"));
      data.setTimestampSample(ser.read_type_12("timestamp_sample"));
      data.setDeviceId(ser.read_type_4("device_id"));
      ser.read_type_f("magnetometer_ga", data.getMagnetometerGa());
      data.setCalibrationCount(ser.read_type_9("calibration_count"));
   }

   public static void staticCopy(px4_msgs.msg.dds.VehicleMagnetometer src, px4_msgs.msg.dds.VehicleMagnetometer dest)
   {
      dest.set(src);
   }

   @Override
   public px4_msgs.msg.dds.VehicleMagnetometer createData()
   {
      return new px4_msgs.msg.dds.VehicleMagnetometer();
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
   
   public void serialize(px4_msgs.msg.dds.VehicleMagnetometer data, us.ihmc.idl.CDR cdr)
   {
      write(data, cdr);
   }

   public void deserialize(px4_msgs.msg.dds.VehicleMagnetometer data, us.ihmc.idl.CDR cdr)
   {
      read(data, cdr);
   }
   
   public void copy(px4_msgs.msg.dds.VehicleMagnetometer src, px4_msgs.msg.dds.VehicleMagnetometer dest)
   {
      staticCopy(src, dest);
   }

   @Override
   public VehicleMagnetometerPubSubType newInstance()
   {
      return new VehicleMagnetometerPubSubType();
   }
}
