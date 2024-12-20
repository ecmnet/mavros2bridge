package px4_msgs.msg.dds;

/**
* 
* Topic data type of the struct "InternalCombustionEngineStatus" defined in "InternalCombustionEngineStatus_.idl". Use this class to provide the TopicDataType to a Participant. 
*
* This file was automatically generated from InternalCombustionEngineStatus_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit InternalCombustionEngineStatus_.idl instead.
*
*/
public class InternalCombustionEngineStatusPubSubType implements us.ihmc.pubsub.TopicDataType<px4_msgs.msg.dds.InternalCombustionEngineStatus>
{
   public static final java.lang.String name = "px4_msgs::msg::dds_::InternalCombustionEngineStatus_";
   
   @Override
   public final java.lang.String getDefinitionChecksum()
   {
   		return "efe2a69d44a865f6d5a3d21f2f14dfca25119bb52fd9801adda8c00d8f38ba8f";
   }
   
   @Override
   public final java.lang.String getDefinitionVersion()
   {
   		return "";
   }

   private final us.ihmc.idl.CDR serializeCDR = new us.ihmc.idl.CDR();
   private final us.ihmc.idl.CDR deserializeCDR = new us.ihmc.idl.CDR();

   @Override
   public void serialize(px4_msgs.msg.dds.InternalCombustionEngineStatus data, us.ihmc.pubsub.common.SerializedPayload serializedPayload) throws java.io.IOException
   {
      serializeCDR.serialize(serializedPayload);
      write(data, serializeCDR);
      serializeCDR.finishSerialize();
   }

   @Override
   public void deserialize(us.ihmc.pubsub.common.SerializedPayload serializedPayload, px4_msgs.msg.dds.InternalCombustionEngineStatus data) throws java.io.IOException
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

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

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

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      return current_alignment - initial_alignment;
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.InternalCombustionEngineStatus data)
   {
      return getCdrSerializedSize(data, 0);
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.InternalCombustionEngineStatus data, int current_alignment)
   {
      int initial_alignment = current_alignment;

      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


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


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);



      return current_alignment - initial_alignment;
   }

   public static void write(px4_msgs.msg.dds.InternalCombustionEngineStatus data, us.ihmc.idl.CDR cdr)
   {
      cdr.write_type_12(data.getTimestamp());

      cdr.write_type_9(data.getState());

      cdr.write_type_4(data.getFlags());

      cdr.write_type_9(data.getEngineLoadPercent());

      cdr.write_type_4(data.getEngineSpeedRpm());

      cdr.write_type_5(data.getSparkDwellTimeMs());

      cdr.write_type_5(data.getAtmosphericPressureKpa());

      cdr.write_type_5(data.getIntakeManifoldPressureKpa());

      cdr.write_type_5(data.getIntakeManifoldTemperature());

      cdr.write_type_5(data.getCoolantTemperature());

      cdr.write_type_5(data.getOilPressure());

      cdr.write_type_5(data.getOilTemperature());

      cdr.write_type_5(data.getFuelPressure());

      cdr.write_type_5(data.getFuelConsumptionRateCm3pm());

      cdr.write_type_5(data.getEstimatedConsumedFuelVolumeCm3());

      cdr.write_type_9(data.getThrottlePositionPercent());

      cdr.write_type_9(data.getEcuIndex());

      cdr.write_type_9(data.getSparkPlugUsage());

      cdr.write_type_5(data.getIgnitionTimingDeg());

      cdr.write_type_5(data.getInjectionTimeMs());

      cdr.write_type_5(data.getCylinderHeadTemperature());

      cdr.write_type_5(data.getExhaustGasTemperature());

      cdr.write_type_5(data.getLambdaCoefficient());

   }

   public static void read(px4_msgs.msg.dds.InternalCombustionEngineStatus data, us.ihmc.idl.CDR cdr)
   {
      data.setTimestamp(cdr.read_type_12());
      	
      data.setState(cdr.read_type_9());
      	
      data.setFlags(cdr.read_type_4());
      	
      data.setEngineLoadPercent(cdr.read_type_9());
      	
      data.setEngineSpeedRpm(cdr.read_type_4());
      	
      data.setSparkDwellTimeMs(cdr.read_type_5());
      	
      data.setAtmosphericPressureKpa(cdr.read_type_5());
      	
      data.setIntakeManifoldPressureKpa(cdr.read_type_5());
      	
      data.setIntakeManifoldTemperature(cdr.read_type_5());
      	
      data.setCoolantTemperature(cdr.read_type_5());
      	
      data.setOilPressure(cdr.read_type_5());
      	
      data.setOilTemperature(cdr.read_type_5());
      	
      data.setFuelPressure(cdr.read_type_5());
      	
      data.setFuelConsumptionRateCm3pm(cdr.read_type_5());
      	
      data.setEstimatedConsumedFuelVolumeCm3(cdr.read_type_5());
      	
      data.setThrottlePositionPercent(cdr.read_type_9());
      	
      data.setEcuIndex(cdr.read_type_9());
      	
      data.setSparkPlugUsage(cdr.read_type_9());
      	
      data.setIgnitionTimingDeg(cdr.read_type_5());
      	
      data.setInjectionTimeMs(cdr.read_type_5());
      	
      data.setCylinderHeadTemperature(cdr.read_type_5());
      	
      data.setExhaustGasTemperature(cdr.read_type_5());
      	
      data.setLambdaCoefficient(cdr.read_type_5());
      	

   }

   @Override
   public final void serialize(px4_msgs.msg.dds.InternalCombustionEngineStatus data, us.ihmc.idl.InterchangeSerializer ser)
   {
      ser.write_type_12("timestamp", data.getTimestamp());
      ser.write_type_9("state", data.getState());
      ser.write_type_4("flags", data.getFlags());
      ser.write_type_9("engine_load_percent", data.getEngineLoadPercent());
      ser.write_type_4("engine_speed_rpm", data.getEngineSpeedRpm());
      ser.write_type_5("spark_dwell_time_ms", data.getSparkDwellTimeMs());
      ser.write_type_5("atmospheric_pressure_kpa", data.getAtmosphericPressureKpa());
      ser.write_type_5("intake_manifold_pressure_kpa", data.getIntakeManifoldPressureKpa());
      ser.write_type_5("intake_manifold_temperature", data.getIntakeManifoldTemperature());
      ser.write_type_5("coolant_temperature", data.getCoolantTemperature());
      ser.write_type_5("oil_pressure", data.getOilPressure());
      ser.write_type_5("oil_temperature", data.getOilTemperature());
      ser.write_type_5("fuel_pressure", data.getFuelPressure());
      ser.write_type_5("fuel_consumption_rate_cm3pm", data.getFuelConsumptionRateCm3pm());
      ser.write_type_5("estimated_consumed_fuel_volume_cm3", data.getEstimatedConsumedFuelVolumeCm3());
      ser.write_type_9("throttle_position_percent", data.getThrottlePositionPercent());
      ser.write_type_9("ecu_index", data.getEcuIndex());
      ser.write_type_9("spark_plug_usage", data.getSparkPlugUsage());
      ser.write_type_5("ignition_timing_deg", data.getIgnitionTimingDeg());
      ser.write_type_5("injection_time_ms", data.getInjectionTimeMs());
      ser.write_type_5("cylinder_head_temperature", data.getCylinderHeadTemperature());
      ser.write_type_5("exhaust_gas_temperature", data.getExhaustGasTemperature());
      ser.write_type_5("lambda_coefficient", data.getLambdaCoefficient());
   }

   @Override
   public final void deserialize(us.ihmc.idl.InterchangeSerializer ser, px4_msgs.msg.dds.InternalCombustionEngineStatus data)
   {
      data.setTimestamp(ser.read_type_12("timestamp"));
      data.setState(ser.read_type_9("state"));
      data.setFlags(ser.read_type_4("flags"));
      data.setEngineLoadPercent(ser.read_type_9("engine_load_percent"));
      data.setEngineSpeedRpm(ser.read_type_4("engine_speed_rpm"));
      data.setSparkDwellTimeMs(ser.read_type_5("spark_dwell_time_ms"));
      data.setAtmosphericPressureKpa(ser.read_type_5("atmospheric_pressure_kpa"));
      data.setIntakeManifoldPressureKpa(ser.read_type_5("intake_manifold_pressure_kpa"));
      data.setIntakeManifoldTemperature(ser.read_type_5("intake_manifold_temperature"));
      data.setCoolantTemperature(ser.read_type_5("coolant_temperature"));
      data.setOilPressure(ser.read_type_5("oil_pressure"));
      data.setOilTemperature(ser.read_type_5("oil_temperature"));
      data.setFuelPressure(ser.read_type_5("fuel_pressure"));
      data.setFuelConsumptionRateCm3pm(ser.read_type_5("fuel_consumption_rate_cm3pm"));
      data.setEstimatedConsumedFuelVolumeCm3(ser.read_type_5("estimated_consumed_fuel_volume_cm3"));
      data.setThrottlePositionPercent(ser.read_type_9("throttle_position_percent"));
      data.setEcuIndex(ser.read_type_9("ecu_index"));
      data.setSparkPlugUsage(ser.read_type_9("spark_plug_usage"));
      data.setIgnitionTimingDeg(ser.read_type_5("ignition_timing_deg"));
      data.setInjectionTimeMs(ser.read_type_5("injection_time_ms"));
      data.setCylinderHeadTemperature(ser.read_type_5("cylinder_head_temperature"));
      data.setExhaustGasTemperature(ser.read_type_5("exhaust_gas_temperature"));
      data.setLambdaCoefficient(ser.read_type_5("lambda_coefficient"));
   }

   public static void staticCopy(px4_msgs.msg.dds.InternalCombustionEngineStatus src, px4_msgs.msg.dds.InternalCombustionEngineStatus dest)
   {
      dest.set(src);
   }

   @Override
   public px4_msgs.msg.dds.InternalCombustionEngineStatus createData()
   {
      return new px4_msgs.msg.dds.InternalCombustionEngineStatus();
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
   
   public void serialize(px4_msgs.msg.dds.InternalCombustionEngineStatus data, us.ihmc.idl.CDR cdr)
   {
      write(data, cdr);
   }

   public void deserialize(px4_msgs.msg.dds.InternalCombustionEngineStatus data, us.ihmc.idl.CDR cdr)
   {
      read(data, cdr);
   }
   
   public void copy(px4_msgs.msg.dds.InternalCombustionEngineStatus src, px4_msgs.msg.dds.InternalCombustionEngineStatus dest)
   {
      staticCopy(src, dest);
   }

   @Override
   public InternalCombustionEngineStatusPubSubType newInstance()
   {
      return new InternalCombustionEngineStatusPubSubType();
   }
}
