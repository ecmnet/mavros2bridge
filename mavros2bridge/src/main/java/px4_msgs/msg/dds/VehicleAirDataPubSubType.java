package px4_msgs.msg.dds;

/**
* 
* Topic data type of the struct "VehicleAirData" defined in "VehicleAirData_.idl". Use this class to provide the TopicDataType to a Participant. 
*
* This file was automatically generated from VehicleAirData_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit VehicleAirData_.idl instead.
*
*/
public class VehicleAirDataPubSubType implements us.ihmc.pubsub.TopicDataType<px4_msgs.msg.dds.VehicleAirData>
{
   public static final java.lang.String name = "px4_msgs::msg::dds_::VehicleAirData_";
   
   @Override
   public final java.lang.String getDefinitionChecksum()
   {
   		return "b6918e2d6e863a07e18e97077ae7ce772db5a4c52764501de5e4c62c5ae7bb03";
   }
   
   @Override
   public final java.lang.String getDefinitionVersion()
   {
   		return "";
   }

   private final us.ihmc.idl.CDR serializeCDR = new us.ihmc.idl.CDR();
   private final us.ihmc.idl.CDR deserializeCDR = new us.ihmc.idl.CDR();

   @Override
   public void serialize(px4_msgs.msg.dds.VehicleAirData data, us.ihmc.pubsub.common.SerializedPayload serializedPayload) throws java.io.IOException
   {
      serializeCDR.serialize(serializedPayload);
      write(data, serializeCDR);
      serializeCDR.finishSerialize();
   }

   @Override
   public void deserialize(us.ihmc.pubsub.common.SerializedPayload serializedPayload, px4_msgs.msg.dds.VehicleAirData data) throws java.io.IOException
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

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      return current_alignment - initial_alignment;
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.VehicleAirData data)
   {
      return getCdrSerializedSize(data, 0);
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.VehicleAirData data, int current_alignment)
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


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);



      return current_alignment - initial_alignment;
   }

   public static void write(px4_msgs.msg.dds.VehicleAirData data, us.ihmc.idl.CDR cdr)
   {
      cdr.write_type_12(data.getTimestamp());

      cdr.write_type_12(data.getTimestampSample());

      cdr.write_type_4(data.getBaroDeviceId());

      cdr.write_type_5(data.getBaroAltMeter());

      cdr.write_type_5(data.getBaroTempCelcius());

      cdr.write_type_5(data.getBaroPressurePa());

      cdr.write_type_5(data.getRho());

      cdr.write_type_5(data.getEas2tas());

      cdr.write_type_9(data.getCalibrationCount());

   }

   public static void read(px4_msgs.msg.dds.VehicleAirData data, us.ihmc.idl.CDR cdr)
   {
      data.setTimestamp(cdr.read_type_12());
      	
      data.setTimestampSample(cdr.read_type_12());
      	
      data.setBaroDeviceId(cdr.read_type_4());
      	
      data.setBaroAltMeter(cdr.read_type_5());
      	
      data.setBaroTempCelcius(cdr.read_type_5());
      	
      data.setBaroPressurePa(cdr.read_type_5());
      	
      data.setRho(cdr.read_type_5());
      	
      data.setEas2tas(cdr.read_type_5());
      	
      data.setCalibrationCount(cdr.read_type_9());
      	

   }

   @Override
   public final void serialize(px4_msgs.msg.dds.VehicleAirData data, us.ihmc.idl.InterchangeSerializer ser)
   {
      ser.write_type_12("timestamp", data.getTimestamp());
      ser.write_type_12("timestamp_sample", data.getTimestampSample());
      ser.write_type_4("baro_device_id", data.getBaroDeviceId());
      ser.write_type_5("baro_alt_meter", data.getBaroAltMeter());
      ser.write_type_5("baro_temp_celcius", data.getBaroTempCelcius());
      ser.write_type_5("baro_pressure_pa", data.getBaroPressurePa());
      ser.write_type_5("rho", data.getRho());
      ser.write_type_5("eas2tas", data.getEas2tas());
      ser.write_type_9("calibration_count", data.getCalibrationCount());
   }

   @Override
   public final void deserialize(us.ihmc.idl.InterchangeSerializer ser, px4_msgs.msg.dds.VehicleAirData data)
   {
      data.setTimestamp(ser.read_type_12("timestamp"));
      data.setTimestampSample(ser.read_type_12("timestamp_sample"));
      data.setBaroDeviceId(ser.read_type_4("baro_device_id"));
      data.setBaroAltMeter(ser.read_type_5("baro_alt_meter"));
      data.setBaroTempCelcius(ser.read_type_5("baro_temp_celcius"));
      data.setBaroPressurePa(ser.read_type_5("baro_pressure_pa"));
      data.setRho(ser.read_type_5("rho"));
      data.setEas2tas(ser.read_type_5("eas2tas"));
      data.setCalibrationCount(ser.read_type_9("calibration_count"));
   }

   public static void staticCopy(px4_msgs.msg.dds.VehicleAirData src, px4_msgs.msg.dds.VehicleAirData dest)
   {
      dest.set(src);
   }

   @Override
   public px4_msgs.msg.dds.VehicleAirData createData()
   {
      return new px4_msgs.msg.dds.VehicleAirData();
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
   
   public void serialize(px4_msgs.msg.dds.VehicleAirData data, us.ihmc.idl.CDR cdr)
   {
      write(data, cdr);
   }

   public void deserialize(px4_msgs.msg.dds.VehicleAirData data, us.ihmc.idl.CDR cdr)
   {
      read(data, cdr);
   }
   
   public void copy(px4_msgs.msg.dds.VehicleAirData src, px4_msgs.msg.dds.VehicleAirData dest)
   {
      staticCopy(src, dest);
   }

   @Override
   public VehicleAirDataPubSubType newInstance()
   {
      return new VehicleAirDataPubSubType();
   }
}
