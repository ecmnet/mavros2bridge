package px4_msgs.msg.dds;

import us.ihmc.communication.packets.Packet;
import us.ihmc.euclid.interfaces.Settable;
import us.ihmc.euclid.interfaces.EpsilonComparable;
import java.util.function.Supplier;
import us.ihmc.pubsub.TopicDataType;

public class InternalCombustionEngineStatus extends Packet<InternalCombustionEngineStatus> implements Settable<InternalCombustionEngineStatus>, EpsilonComparable<InternalCombustionEngineStatus>
{
   /**
          * The engine is not running. This is the default state.
          */
   public static final byte STATE_STOPPED = (byte) 0;
   /**
          * The engine is starting. This is a transient state.
          */
   public static final byte STATE_STARTING = (byte) 1;
   /**
          * The engine is running normally.
          */
   public static final byte STATE_RUNNING = (byte) 2;
   /**
          * The engine can no longer function.
          */
   public static final byte STATE_FAULT = (byte) 3;
   /**
          * General error.
          */
   public static final long FLAG_GENERAL_ERROR = 1;
   /**
          * Error of the crankshaft sensor. This flag is optional.
          */
   public static final long FLAG_CRANKSHAFT_SENSOR_ERROR_SUPPORTED = 2;
   public static final long FLAG_CRANKSHAFT_SENSOR_ERROR = 4;
   /**
          * Temperature levels. These flags are optional
          */
   public static final long FLAG_TEMPERATURE_SUPPORTED = 8;
   /**
          * Under-temperature warning
          */
   public static final long FLAG_TEMPERATURE_BELOW_NOMINAL = 16;
   /**
          * Over-temperature warning
          */
   public static final long FLAG_TEMPERATURE_ABOVE_NOMINAL = 32;
   /**
          * Critical overheating
          */
   public static final long FLAG_TEMPERATURE_OVERHEATING = 64;
   /**
          * Exhaust gas over-temperature warning
          */
   public static final long FLAG_TEMPERATURE_EGT_ABOVE_NOMINAL = 128;
   /**
          * Fuel pressure. These flags are optional
          */
   public static final long FLAG_FUEL_PRESSURE_SUPPORTED = 256;
   /**
          * Under-pressure warning
          */
   public static final long FLAG_FUEL_PRESSURE_BELOW_NOMINAL = 512;
   /**
          * Over-pressure warning
          */
   public static final long FLAG_FUEL_PRESSURE_ABOVE_NOMINAL = 1024;
   /**
          * Detonation warning. This flag is optional.
          */
   public static final long FLAG_DETONATION_SUPPORTED = 2048;
   /**
          * Detonation condition observed warning
          */
   public static final long FLAG_DETONATION_OBSERVED = 4096;
   /**
          * Misfire warning. This flag is optional.
          */
   public static final long FLAG_MISFIRE_SUPPORTED = 8192;
   /**
          * Misfire condition observed warning
          */
   public static final long FLAG_MISFIRE_OBSERVED = 16384;
   /**
          * Oil pressure. These flags are optional
          */
   public static final long FLAG_OIL_PRESSURE_SUPPORTED = 32768;
   /**
          * Under-pressure warning
          */
   public static final long FLAG_OIL_PRESSURE_BELOW_NOMINAL = 65536;
   /**
          * Over-pressure warning
          */
   public static final long FLAG_OIL_PRESSURE_ABOVE_NOMINAL = 131072;
   /**
          * Debris warning. This flag is optional
          */
   public static final long FLAG_DEBRIS_SUPPORTED = 262144;
   /**
          * Detection of debris warning
          */
   public static final long FLAG_DEBRIS_DETECTED = 524288;
   public static final byte SPARK_PLUG_SINGLE = (byte) 0;
   public static final byte SPARK_PLUG_FIRST_ACTIVE = (byte) 1;
   public static final byte SPARK_PLUG_SECOND_ACTIVE = (byte) 2;
   public static final byte SPARK_PLUG_BOTH_ACTIVE = (byte) 3;
   /**
            * time since system start (microseconds)
            */
   public long timestamp_;
   public byte state_;
   public long flags_;
   /**
            * Engine load estimate, percent, [0, 127]
            */
   public byte engine_load_percent_;
   /**
            * Engine speed, revolutions per minute
            */
   public long engine_speed_rpm_;
   /**
            * Spark dwell time, millisecond
            */
   public float spark_dwell_time_ms_;
   /**
            * Atmospheric (barometric) pressure, kilopascal
            */
   public float atmospheric_pressure_kpa_;
   /**
            * Engine intake manifold pressure, kilopascal
            */
   public float intake_manifold_pressure_kpa_;
   /**
            * Engine intake manifold temperature, kelvin
            */
   public float intake_manifold_temperature_;
   /**
            * Engine coolant temperature, kelvin
            */
   public float coolant_temperature_;
   /**
            * Oil pressure, kilopascal
            */
   public float oil_pressure_;
   /**
            * Oil temperature, kelvin
            */
   public float oil_temperature_;
   /**
            * Fuel pressure, kilopascal
            */
   public float fuel_pressure_;
   /**
            * Instant fuel consumption estimate, (centimeter^3)/minute
            */
   public float fuel_consumption_rate_cm3pm_;
   /**
            * Estimate of the consumed fuel since the start of the engine, centimeter^3
            */
   public float estimated_consumed_fuel_volume_cm3_;
   /**
            * Throttle position, percent
            */
   public byte throttle_position_percent_;
   /**
            * The index of the publishing ECU
            */
   public byte ecu_index_;
   /**
            * Spark plug activity report.
            */
   public byte spark_plug_usage_;
   /**
            * Cylinder ignition timing, angular degrees of the crankshaft
            */
   public float ignition_timing_deg_;
   /**
            * Fuel injection time, millisecond
            */
   public float injection_time_ms_;
   /**
            * Cylinder head temperature (CHT), kelvin
            */
   public float cylinder_head_temperature_;
   /**
            * Exhaust gas temperature (EGT), kelvin
            */
   public float exhaust_gas_temperature_;
   /**
            * Estimated lambda coefficient, dimensionless ratio
            */
   public float lambda_coefficient_;

   public InternalCombustionEngineStatus()
   {
   }

   public InternalCombustionEngineStatus(InternalCombustionEngineStatus other)
   {
      this();
      set(other);
   }

   public void set(InternalCombustionEngineStatus other)
   {
      timestamp_ = other.timestamp_;

      state_ = other.state_;

      flags_ = other.flags_;

      engine_load_percent_ = other.engine_load_percent_;

      engine_speed_rpm_ = other.engine_speed_rpm_;

      spark_dwell_time_ms_ = other.spark_dwell_time_ms_;

      atmospheric_pressure_kpa_ = other.atmospheric_pressure_kpa_;

      intake_manifold_pressure_kpa_ = other.intake_manifold_pressure_kpa_;

      intake_manifold_temperature_ = other.intake_manifold_temperature_;

      coolant_temperature_ = other.coolant_temperature_;

      oil_pressure_ = other.oil_pressure_;

      oil_temperature_ = other.oil_temperature_;

      fuel_pressure_ = other.fuel_pressure_;

      fuel_consumption_rate_cm3pm_ = other.fuel_consumption_rate_cm3pm_;

      estimated_consumed_fuel_volume_cm3_ = other.estimated_consumed_fuel_volume_cm3_;

      throttle_position_percent_ = other.throttle_position_percent_;

      ecu_index_ = other.ecu_index_;

      spark_plug_usage_ = other.spark_plug_usage_;

      ignition_timing_deg_ = other.ignition_timing_deg_;

      injection_time_ms_ = other.injection_time_ms_;

      cylinder_head_temperature_ = other.cylinder_head_temperature_;

      exhaust_gas_temperature_ = other.exhaust_gas_temperature_;

      lambda_coefficient_ = other.lambda_coefficient_;

   }

   /**
            * time since system start (microseconds)
            */
   public void setTimestamp(long timestamp)
   {
      timestamp_ = timestamp;
   }
   /**
            * time since system start (microseconds)
            */
   public long getTimestamp()
   {
      return timestamp_;
   }

   public void setState(byte state)
   {
      state_ = state;
   }
   public byte getState()
   {
      return state_;
   }

   public void setFlags(long flags)
   {
      flags_ = flags;
   }
   public long getFlags()
   {
      return flags_;
   }

   /**
            * Engine load estimate, percent, [0, 127]
            */
   public void setEngineLoadPercent(byte engine_load_percent)
   {
      engine_load_percent_ = engine_load_percent;
   }
   /**
            * Engine load estimate, percent, [0, 127]
            */
   public byte getEngineLoadPercent()
   {
      return engine_load_percent_;
   }

   /**
            * Engine speed, revolutions per minute
            */
   public void setEngineSpeedRpm(long engine_speed_rpm)
   {
      engine_speed_rpm_ = engine_speed_rpm;
   }
   /**
            * Engine speed, revolutions per minute
            */
   public long getEngineSpeedRpm()
   {
      return engine_speed_rpm_;
   }

   /**
            * Spark dwell time, millisecond
            */
   public void setSparkDwellTimeMs(float spark_dwell_time_ms)
   {
      spark_dwell_time_ms_ = spark_dwell_time_ms;
   }
   /**
            * Spark dwell time, millisecond
            */
   public float getSparkDwellTimeMs()
   {
      return spark_dwell_time_ms_;
   }

   /**
            * Atmospheric (barometric) pressure, kilopascal
            */
   public void setAtmosphericPressureKpa(float atmospheric_pressure_kpa)
   {
      atmospheric_pressure_kpa_ = atmospheric_pressure_kpa;
   }
   /**
            * Atmospheric (barometric) pressure, kilopascal
            */
   public float getAtmosphericPressureKpa()
   {
      return atmospheric_pressure_kpa_;
   }

   /**
            * Engine intake manifold pressure, kilopascal
            */
   public void setIntakeManifoldPressureKpa(float intake_manifold_pressure_kpa)
   {
      intake_manifold_pressure_kpa_ = intake_manifold_pressure_kpa;
   }
   /**
            * Engine intake manifold pressure, kilopascal
            */
   public float getIntakeManifoldPressureKpa()
   {
      return intake_manifold_pressure_kpa_;
   }

   /**
            * Engine intake manifold temperature, kelvin
            */
   public void setIntakeManifoldTemperature(float intake_manifold_temperature)
   {
      intake_manifold_temperature_ = intake_manifold_temperature;
   }
   /**
            * Engine intake manifold temperature, kelvin
            */
   public float getIntakeManifoldTemperature()
   {
      return intake_manifold_temperature_;
   }

   /**
            * Engine coolant temperature, kelvin
            */
   public void setCoolantTemperature(float coolant_temperature)
   {
      coolant_temperature_ = coolant_temperature;
   }
   /**
            * Engine coolant temperature, kelvin
            */
   public float getCoolantTemperature()
   {
      return coolant_temperature_;
   }

   /**
            * Oil pressure, kilopascal
            */
   public void setOilPressure(float oil_pressure)
   {
      oil_pressure_ = oil_pressure;
   }
   /**
            * Oil pressure, kilopascal
            */
   public float getOilPressure()
   {
      return oil_pressure_;
   }

   /**
            * Oil temperature, kelvin
            */
   public void setOilTemperature(float oil_temperature)
   {
      oil_temperature_ = oil_temperature;
   }
   /**
            * Oil temperature, kelvin
            */
   public float getOilTemperature()
   {
      return oil_temperature_;
   }

   /**
            * Fuel pressure, kilopascal
            */
   public void setFuelPressure(float fuel_pressure)
   {
      fuel_pressure_ = fuel_pressure;
   }
   /**
            * Fuel pressure, kilopascal
            */
   public float getFuelPressure()
   {
      return fuel_pressure_;
   }

   /**
            * Instant fuel consumption estimate, (centimeter^3)/minute
            */
   public void setFuelConsumptionRateCm3pm(float fuel_consumption_rate_cm3pm)
   {
      fuel_consumption_rate_cm3pm_ = fuel_consumption_rate_cm3pm;
   }
   /**
            * Instant fuel consumption estimate, (centimeter^3)/minute
            */
   public float getFuelConsumptionRateCm3pm()
   {
      return fuel_consumption_rate_cm3pm_;
   }

   /**
            * Estimate of the consumed fuel since the start of the engine, centimeter^3
            */
   public void setEstimatedConsumedFuelVolumeCm3(float estimated_consumed_fuel_volume_cm3)
   {
      estimated_consumed_fuel_volume_cm3_ = estimated_consumed_fuel_volume_cm3;
   }
   /**
            * Estimate of the consumed fuel since the start of the engine, centimeter^3
            */
   public float getEstimatedConsumedFuelVolumeCm3()
   {
      return estimated_consumed_fuel_volume_cm3_;
   }

   /**
            * Throttle position, percent
            */
   public void setThrottlePositionPercent(byte throttle_position_percent)
   {
      throttle_position_percent_ = throttle_position_percent;
   }
   /**
            * Throttle position, percent
            */
   public byte getThrottlePositionPercent()
   {
      return throttle_position_percent_;
   }

   /**
            * The index of the publishing ECU
            */
   public void setEcuIndex(byte ecu_index)
   {
      ecu_index_ = ecu_index;
   }
   /**
            * The index of the publishing ECU
            */
   public byte getEcuIndex()
   {
      return ecu_index_;
   }

   /**
            * Spark plug activity report.
            */
   public void setSparkPlugUsage(byte spark_plug_usage)
   {
      spark_plug_usage_ = spark_plug_usage;
   }
   /**
            * Spark plug activity report.
            */
   public byte getSparkPlugUsage()
   {
      return spark_plug_usage_;
   }

   /**
            * Cylinder ignition timing, angular degrees of the crankshaft
            */
   public void setIgnitionTimingDeg(float ignition_timing_deg)
   {
      ignition_timing_deg_ = ignition_timing_deg;
   }
   /**
            * Cylinder ignition timing, angular degrees of the crankshaft
            */
   public float getIgnitionTimingDeg()
   {
      return ignition_timing_deg_;
   }

   /**
            * Fuel injection time, millisecond
            */
   public void setInjectionTimeMs(float injection_time_ms)
   {
      injection_time_ms_ = injection_time_ms;
   }
   /**
            * Fuel injection time, millisecond
            */
   public float getInjectionTimeMs()
   {
      return injection_time_ms_;
   }

   /**
            * Cylinder head temperature (CHT), kelvin
            */
   public void setCylinderHeadTemperature(float cylinder_head_temperature)
   {
      cylinder_head_temperature_ = cylinder_head_temperature;
   }
   /**
            * Cylinder head temperature (CHT), kelvin
            */
   public float getCylinderHeadTemperature()
   {
      return cylinder_head_temperature_;
   }

   /**
            * Exhaust gas temperature (EGT), kelvin
            */
   public void setExhaustGasTemperature(float exhaust_gas_temperature)
   {
      exhaust_gas_temperature_ = exhaust_gas_temperature;
   }
   /**
            * Exhaust gas temperature (EGT), kelvin
            */
   public float getExhaustGasTemperature()
   {
      return exhaust_gas_temperature_;
   }

   /**
            * Estimated lambda coefficient, dimensionless ratio
            */
   public void setLambdaCoefficient(float lambda_coefficient)
   {
      lambda_coefficient_ = lambda_coefficient;
   }
   /**
            * Estimated lambda coefficient, dimensionless ratio
            */
   public float getLambdaCoefficient()
   {
      return lambda_coefficient_;
   }


   public static Supplier<InternalCombustionEngineStatusPubSubType> getPubSubType()
   {
      return InternalCombustionEngineStatusPubSubType::new;
   }

   @Override
   public Supplier<TopicDataType> getPubSubTypePacket()
   {
      return InternalCombustionEngineStatusPubSubType::new;
   }

   @Override
   public boolean epsilonEquals(InternalCombustionEngineStatus other, double epsilon)
   {
      if(other == null) return false;
      if(other == this) return true;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_, other.timestamp_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.state_, other.state_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.flags_, other.flags_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.engine_load_percent_, other.engine_load_percent_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.engine_speed_rpm_, other.engine_speed_rpm_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.spark_dwell_time_ms_, other.spark_dwell_time_ms_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.atmospheric_pressure_kpa_, other.atmospheric_pressure_kpa_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.intake_manifold_pressure_kpa_, other.intake_manifold_pressure_kpa_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.intake_manifold_temperature_, other.intake_manifold_temperature_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.coolant_temperature_, other.coolant_temperature_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.oil_pressure_, other.oil_pressure_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.oil_temperature_, other.oil_temperature_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.fuel_pressure_, other.fuel_pressure_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.fuel_consumption_rate_cm3pm_, other.fuel_consumption_rate_cm3pm_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.estimated_consumed_fuel_volume_cm3_, other.estimated_consumed_fuel_volume_cm3_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.throttle_position_percent_, other.throttle_position_percent_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.ecu_index_, other.ecu_index_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.spark_plug_usage_, other.spark_plug_usage_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.ignition_timing_deg_, other.ignition_timing_deg_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.injection_time_ms_, other.injection_time_ms_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.cylinder_head_temperature_, other.cylinder_head_temperature_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.exhaust_gas_temperature_, other.exhaust_gas_temperature_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.lambda_coefficient_, other.lambda_coefficient_, epsilon)) return false;


      return true;
   }

   @Override
   public boolean equals(Object other)
   {
      if(other == null) return false;
      if(other == this) return true;
      if(!(other instanceof InternalCombustionEngineStatus)) return false;

      InternalCombustionEngineStatus otherMyClass = (InternalCombustionEngineStatus) other;

      if(this.timestamp_ != otherMyClass.timestamp_) return false;

      if(this.state_ != otherMyClass.state_) return false;

      if(this.flags_ != otherMyClass.flags_) return false;

      if(this.engine_load_percent_ != otherMyClass.engine_load_percent_) return false;

      if(this.engine_speed_rpm_ != otherMyClass.engine_speed_rpm_) return false;

      if(this.spark_dwell_time_ms_ != otherMyClass.spark_dwell_time_ms_) return false;

      if(this.atmospheric_pressure_kpa_ != otherMyClass.atmospheric_pressure_kpa_) return false;

      if(this.intake_manifold_pressure_kpa_ != otherMyClass.intake_manifold_pressure_kpa_) return false;

      if(this.intake_manifold_temperature_ != otherMyClass.intake_manifold_temperature_) return false;

      if(this.coolant_temperature_ != otherMyClass.coolant_temperature_) return false;

      if(this.oil_pressure_ != otherMyClass.oil_pressure_) return false;

      if(this.oil_temperature_ != otherMyClass.oil_temperature_) return false;

      if(this.fuel_pressure_ != otherMyClass.fuel_pressure_) return false;

      if(this.fuel_consumption_rate_cm3pm_ != otherMyClass.fuel_consumption_rate_cm3pm_) return false;

      if(this.estimated_consumed_fuel_volume_cm3_ != otherMyClass.estimated_consumed_fuel_volume_cm3_) return false;

      if(this.throttle_position_percent_ != otherMyClass.throttle_position_percent_) return false;

      if(this.ecu_index_ != otherMyClass.ecu_index_) return false;

      if(this.spark_plug_usage_ != otherMyClass.spark_plug_usage_) return false;

      if(this.ignition_timing_deg_ != otherMyClass.ignition_timing_deg_) return false;

      if(this.injection_time_ms_ != otherMyClass.injection_time_ms_) return false;

      if(this.cylinder_head_temperature_ != otherMyClass.cylinder_head_temperature_) return false;

      if(this.exhaust_gas_temperature_ != otherMyClass.exhaust_gas_temperature_) return false;

      if(this.lambda_coefficient_ != otherMyClass.lambda_coefficient_) return false;


      return true;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("InternalCombustionEngineStatus {");
      builder.append("timestamp=");
      builder.append(this.timestamp_);      builder.append(", ");
      builder.append("state=");
      builder.append(this.state_);      builder.append(", ");
      builder.append("flags=");
      builder.append(this.flags_);      builder.append(", ");
      builder.append("engine_load_percent=");
      builder.append(this.engine_load_percent_);      builder.append(", ");
      builder.append("engine_speed_rpm=");
      builder.append(this.engine_speed_rpm_);      builder.append(", ");
      builder.append("spark_dwell_time_ms=");
      builder.append(this.spark_dwell_time_ms_);      builder.append(", ");
      builder.append("atmospheric_pressure_kpa=");
      builder.append(this.atmospheric_pressure_kpa_);      builder.append(", ");
      builder.append("intake_manifold_pressure_kpa=");
      builder.append(this.intake_manifold_pressure_kpa_);      builder.append(", ");
      builder.append("intake_manifold_temperature=");
      builder.append(this.intake_manifold_temperature_);      builder.append(", ");
      builder.append("coolant_temperature=");
      builder.append(this.coolant_temperature_);      builder.append(", ");
      builder.append("oil_pressure=");
      builder.append(this.oil_pressure_);      builder.append(", ");
      builder.append("oil_temperature=");
      builder.append(this.oil_temperature_);      builder.append(", ");
      builder.append("fuel_pressure=");
      builder.append(this.fuel_pressure_);      builder.append(", ");
      builder.append("fuel_consumption_rate_cm3pm=");
      builder.append(this.fuel_consumption_rate_cm3pm_);      builder.append(", ");
      builder.append("estimated_consumed_fuel_volume_cm3=");
      builder.append(this.estimated_consumed_fuel_volume_cm3_);      builder.append(", ");
      builder.append("throttle_position_percent=");
      builder.append(this.throttle_position_percent_);      builder.append(", ");
      builder.append("ecu_index=");
      builder.append(this.ecu_index_);      builder.append(", ");
      builder.append("spark_plug_usage=");
      builder.append(this.spark_plug_usage_);      builder.append(", ");
      builder.append("ignition_timing_deg=");
      builder.append(this.ignition_timing_deg_);      builder.append(", ");
      builder.append("injection_time_ms=");
      builder.append(this.injection_time_ms_);      builder.append(", ");
      builder.append("cylinder_head_temperature=");
      builder.append(this.cylinder_head_temperature_);      builder.append(", ");
      builder.append("exhaust_gas_temperature=");
      builder.append(this.exhaust_gas_temperature_);      builder.append(", ");
      builder.append("lambda_coefficient=");
      builder.append(this.lambda_coefficient_);
      builder.append("}");
      return builder.toString();
   }
}
