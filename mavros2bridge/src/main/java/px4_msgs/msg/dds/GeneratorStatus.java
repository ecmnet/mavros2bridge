package px4_msgs.msg.dds;

import us.ihmc.communication.packets.Packet;
import us.ihmc.euclid.interfaces.Settable;
import us.ihmc.euclid.interfaces.EpsilonComparable;
import java.util.function.Supplier;
import us.ihmc.pubsub.TopicDataType;

public class GeneratorStatus extends Packet<GeneratorStatus> implements Settable<GeneratorStatus>, EpsilonComparable<GeneratorStatus>
{
   /**
          * Generator is off.
          */
   public static final long STATUS_FLAG_OFF = 1;
   /**
          * Generator is ready to start generating power.
          */
   public static final long STATUS_FLAG_READY = 2;
   /**
          * Generator is generating power.
          */
   public static final long STATUS_FLAG_GENERATING = 4;
   /**
          * Generator is charging the batteries (generating enough power to charge and provide the load).
          */
   public static final long STATUS_FLAG_CHARGING = 8;
   /**
          * Generator is operating at a reduced maximum power.
          */
   public static final long STATUS_FLAG_REDUCED_POWER = 16;
   /**
          * Generator is providing the maximum output.
          */
   public static final long STATUS_FLAG_MAXPOWER = 32;
   /**
          * Generator is near the maximum operating temperature, cooling is insufficient.
          */
   public static final long STATUS_FLAG_OVERTEMP_WARNING = 64;
   /**
          * Generator hit the maximum operating temperature and shutdown.
          */
   public static final long STATUS_FLAG_OVERTEMP_FAULT = 128;
   /**
          * Power electronics are near the maximum operating temperature, cooling is insufficient.
          */
   public static final long STATUS_FLAG_ELECTRONICS_OVERTEMP_WARNING = 256;
   /**
          * Power electronics hit the maximum operating temperature and shutdown.
          */
   public static final long STATUS_FLAG_ELECTRONICS_OVERTEMP_FAULT = 512;
   /**
          * Power electronics experienced a fault and shutdown.
          */
   public static final long STATUS_FLAG_ELECTRONICS_FAULT = 1024;
   /**
          * The power source supplying the generator failed e.g. mechanical generator stopped, tether is no longer providing power, solar cell is in shade, hydrogen reaction no longer happening.
          */
   public static final long STATUS_FLAG_POWERSOURCE_FAULT = 2048;
   /**
          * Generator controller having communication problems.
          */
   public static final long STATUS_FLAG_COMMUNICATION_WARNING = 4096;
   /**
          * Power electronic or generator cooling system error.
          */
   public static final long STATUS_FLAG_COOLING_WARNING = 8192;
   /**
          * Generator controller power rail experienced a fault.
          */
   public static final long STATUS_FLAG_POWER_RAIL_FAULT = 16384;
   /**
          * Generator controller exceeded the overcurrent threshold and shutdown to prevent damage.
          */
   public static final long STATUS_FLAG_OVERCURRENT_FAULT = 32768;
   /**
          * Generator controller detected a high current going into the batteries and shutdown to prevent battery damage. |
          */
   public static final long STATUS_FLAG_BATTERY_OVERCHARGE_CURRENT_FAULT = 65536;
   /**
          * Generator controller exceeded it's overvoltage threshold and shutdown to prevent it exceeding the voltage rating.
          */
   public static final long STATUS_FLAG_OVERVOLTAGE_FAULT = 131072;
   /**
          * Batteries are under voltage (generator will not start).
          */
   public static final long STATUS_FLAG_BATTERY_UNDERVOLT_FAULT = 262144;
   /**
          * Generator start is inhibited by e.g. a safety switch.
          */
   public static final long STATUS_FLAG_START_INHIBITED = 524288;
   /**
          * Generator requires maintenance.
          */
   public static final long STATUS_FLAG_MAINTENANCE_REQUIRED = 1048576;
   /**
          * Generator is not ready to generate yet.
          */
   public static final long STATUS_FLAG_WARMING_UP = 2097152;
   /**
          * Generator is idle.
          */
   public static final long STATUS_FLAG_IDLE = 4194304;
   /**
            * time since system start (microseconds)
            */
   public long timestamp_;
   /**
            * Status flags
            */
   public long status_;
   /**
            * [A] Current into/out of battery. Positive for out. Negative for in. NaN: field not provided.
            */
   public float battery_current_;
   /**
            * [A] Current going to the UAV. If battery current not available this is the DC current from the generator. Positive for out. Negative for in. NaN: field not provided
            */
   public float load_current_;
   /**
            * [W] The power being generated. NaN: field not provided
            */
   public float power_generated_;
   /**
            * [V] Voltage of the bus seen at the generator, or battery bus if battery bus is controlled by generator and at a different voltage to main bus.
            */
   public float bus_voltage_;
   /**
            * [A] The target battery current. Positive for out. Negative for in. NaN: field not provided
            */
   public float bat_current_setpoint_;
   /**
            * [s] Seconds this generator has run since it was rebooted. UINT32_MAX: field not provided.
            */
   public long runtime_;
   /**
            * [s] Seconds until this generator requires maintenance.  A negative value indicates maintenance is past-due. INT32_MAX: field not provided.
            */
   public int time_until_maintenance_;
   /**
            * [rpm] Speed of electrical generator or alternator. UINT16_MAX: field not provided.
            */
   public int generator_speed_;
   /**
            * [degC] The temperature of the rectifier or power converter. INT16_MAX: field not provided.
            */
   public short rectifier_temperature_;
   /**
            * [degC] The temperature of the mechanical motor, fuel cell core or generator. INT16_MAX: field not provided.
            */
   public short generator_temperature_;

   public GeneratorStatus()
   {
   }

   public GeneratorStatus(GeneratorStatus other)
   {
      this();
      set(other);
   }

   public void set(GeneratorStatus other)
   {
      timestamp_ = other.timestamp_;

      status_ = other.status_;

      battery_current_ = other.battery_current_;

      load_current_ = other.load_current_;

      power_generated_ = other.power_generated_;

      bus_voltage_ = other.bus_voltage_;

      bat_current_setpoint_ = other.bat_current_setpoint_;

      runtime_ = other.runtime_;

      time_until_maintenance_ = other.time_until_maintenance_;

      generator_speed_ = other.generator_speed_;

      rectifier_temperature_ = other.rectifier_temperature_;

      generator_temperature_ = other.generator_temperature_;

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

   /**
            * Status flags
            */
   public void setStatus(long status)
   {
      status_ = status;
   }
   /**
            * Status flags
            */
   public long getStatus()
   {
      return status_;
   }

   /**
            * [A] Current into/out of battery. Positive for out. Negative for in. NaN: field not provided.
            */
   public void setBatteryCurrent(float battery_current)
   {
      battery_current_ = battery_current;
   }
   /**
            * [A] Current into/out of battery. Positive for out. Negative for in. NaN: field not provided.
            */
   public float getBatteryCurrent()
   {
      return battery_current_;
   }

   /**
            * [A] Current going to the UAV. If battery current not available this is the DC current from the generator. Positive for out. Negative for in. NaN: field not provided
            */
   public void setLoadCurrent(float load_current)
   {
      load_current_ = load_current;
   }
   /**
            * [A] Current going to the UAV. If battery current not available this is the DC current from the generator. Positive for out. Negative for in. NaN: field not provided
            */
   public float getLoadCurrent()
   {
      return load_current_;
   }

   /**
            * [W] The power being generated. NaN: field not provided
            */
   public void setPowerGenerated(float power_generated)
   {
      power_generated_ = power_generated;
   }
   /**
            * [W] The power being generated. NaN: field not provided
            */
   public float getPowerGenerated()
   {
      return power_generated_;
   }

   /**
            * [V] Voltage of the bus seen at the generator, or battery bus if battery bus is controlled by generator and at a different voltage to main bus.
            */
   public void setBusVoltage(float bus_voltage)
   {
      bus_voltage_ = bus_voltage;
   }
   /**
            * [V] Voltage of the bus seen at the generator, or battery bus if battery bus is controlled by generator and at a different voltage to main bus.
            */
   public float getBusVoltage()
   {
      return bus_voltage_;
   }

   /**
            * [A] The target battery current. Positive for out. Negative for in. NaN: field not provided
            */
   public void setBatCurrentSetpoint(float bat_current_setpoint)
   {
      bat_current_setpoint_ = bat_current_setpoint;
   }
   /**
            * [A] The target battery current. Positive for out. Negative for in. NaN: field not provided
            */
   public float getBatCurrentSetpoint()
   {
      return bat_current_setpoint_;
   }

   /**
            * [s] Seconds this generator has run since it was rebooted. UINT32_MAX: field not provided.
            */
   public void setRuntime(long runtime)
   {
      runtime_ = runtime;
   }
   /**
            * [s] Seconds this generator has run since it was rebooted. UINT32_MAX: field not provided.
            */
   public long getRuntime()
   {
      return runtime_;
   }

   /**
            * [s] Seconds until this generator requires maintenance.  A negative value indicates maintenance is past-due. INT32_MAX: field not provided.
            */
   public void setTimeUntilMaintenance(int time_until_maintenance)
   {
      time_until_maintenance_ = time_until_maintenance;
   }
   /**
            * [s] Seconds until this generator requires maintenance.  A negative value indicates maintenance is past-due. INT32_MAX: field not provided.
            */
   public int getTimeUntilMaintenance()
   {
      return time_until_maintenance_;
   }

   /**
            * [rpm] Speed of electrical generator or alternator. UINT16_MAX: field not provided.
            */
   public void setGeneratorSpeed(int generator_speed)
   {
      generator_speed_ = generator_speed;
   }
   /**
            * [rpm] Speed of electrical generator or alternator. UINT16_MAX: field not provided.
            */
   public int getGeneratorSpeed()
   {
      return generator_speed_;
   }

   /**
            * [degC] The temperature of the rectifier or power converter. INT16_MAX: field not provided.
            */
   public void setRectifierTemperature(short rectifier_temperature)
   {
      rectifier_temperature_ = rectifier_temperature;
   }
   /**
            * [degC] The temperature of the rectifier or power converter. INT16_MAX: field not provided.
            */
   public short getRectifierTemperature()
   {
      return rectifier_temperature_;
   }

   /**
            * [degC] The temperature of the mechanical motor, fuel cell core or generator. INT16_MAX: field not provided.
            */
   public void setGeneratorTemperature(short generator_temperature)
   {
      generator_temperature_ = generator_temperature;
   }
   /**
            * [degC] The temperature of the mechanical motor, fuel cell core or generator. INT16_MAX: field not provided.
            */
   public short getGeneratorTemperature()
   {
      return generator_temperature_;
   }


   public static Supplier<GeneratorStatusPubSubType> getPubSubType()
   {
      return GeneratorStatusPubSubType::new;
   }

   @Override
   public Supplier<TopicDataType> getPubSubTypePacket()
   {
      return GeneratorStatusPubSubType::new;
   }

   @Override
   public boolean epsilonEquals(GeneratorStatus other, double epsilon)
   {
      if(other == null) return false;
      if(other == this) return true;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_, other.timestamp_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.status_, other.status_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.battery_current_, other.battery_current_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.load_current_, other.load_current_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.power_generated_, other.power_generated_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.bus_voltage_, other.bus_voltage_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.bat_current_setpoint_, other.bat_current_setpoint_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.runtime_, other.runtime_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.time_until_maintenance_, other.time_until_maintenance_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.generator_speed_, other.generator_speed_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.rectifier_temperature_, other.rectifier_temperature_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.generator_temperature_, other.generator_temperature_, epsilon)) return false;


      return true;
   }

   @Override
   public boolean equals(Object other)
   {
      if(other == null) return false;
      if(other == this) return true;
      if(!(other instanceof GeneratorStatus)) return false;

      GeneratorStatus otherMyClass = (GeneratorStatus) other;

      if(this.timestamp_ != otherMyClass.timestamp_) return false;

      if(this.status_ != otherMyClass.status_) return false;

      if(this.battery_current_ != otherMyClass.battery_current_) return false;

      if(this.load_current_ != otherMyClass.load_current_) return false;

      if(this.power_generated_ != otherMyClass.power_generated_) return false;

      if(this.bus_voltage_ != otherMyClass.bus_voltage_) return false;

      if(this.bat_current_setpoint_ != otherMyClass.bat_current_setpoint_) return false;

      if(this.runtime_ != otherMyClass.runtime_) return false;

      if(this.time_until_maintenance_ != otherMyClass.time_until_maintenance_) return false;

      if(this.generator_speed_ != otherMyClass.generator_speed_) return false;

      if(this.rectifier_temperature_ != otherMyClass.rectifier_temperature_) return false;

      if(this.generator_temperature_ != otherMyClass.generator_temperature_) return false;


      return true;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("GeneratorStatus {");
      builder.append("timestamp=");
      builder.append(this.timestamp_);      builder.append(", ");
      builder.append("status=");
      builder.append(this.status_);      builder.append(", ");
      builder.append("battery_current=");
      builder.append(this.battery_current_);      builder.append(", ");
      builder.append("load_current=");
      builder.append(this.load_current_);      builder.append(", ");
      builder.append("power_generated=");
      builder.append(this.power_generated_);      builder.append(", ");
      builder.append("bus_voltage=");
      builder.append(this.bus_voltage_);      builder.append(", ");
      builder.append("bat_current_setpoint=");
      builder.append(this.bat_current_setpoint_);      builder.append(", ");
      builder.append("runtime=");
      builder.append(this.runtime_);      builder.append(", ");
      builder.append("time_until_maintenance=");
      builder.append(this.time_until_maintenance_);      builder.append(", ");
      builder.append("generator_speed=");
      builder.append(this.generator_speed_);      builder.append(", ");
      builder.append("rectifier_temperature=");
      builder.append(this.rectifier_temperature_);      builder.append(", ");
      builder.append("generator_temperature=");
      builder.append(this.generator_temperature_);
      builder.append("}");
      return builder.toString();
   }
}
