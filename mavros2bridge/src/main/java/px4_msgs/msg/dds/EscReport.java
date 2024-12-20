package px4_msgs.msg.dds;

import us.ihmc.communication.packets.Packet;
import us.ihmc.euclid.interfaces.Settable;
import us.ihmc.euclid.interfaces.EpsilonComparable;
import java.util.function.Supplier;
import us.ihmc.pubsub.TopicDataType;

public class EscReport extends Packet<EscReport> implements Settable<EscReport>, EpsilonComparable<EscReport>
{
   /**
          * (1 << 0)
          */
   public static final byte FAILURE_OVER_CURRENT = (byte) 0;
   /**
          * (1 << 1)
          */
   public static final byte FAILURE_OVER_VOLTAGE = (byte) 1;
   /**
          * (1 << 2)
          */
   public static final byte FAILURE_MOTOR_OVER_TEMPERATURE = (byte) 2;
   /**
          * (1 << 3)
          */
   public static final byte FAILURE_OVER_RPM = (byte) 3;
   /**
          * (1 << 4)  Set if ESC received an inconsistent command (i.e out of boundaries)
          */
   public static final byte FAILURE_INCONSISTENT_CMD = (byte) 4;
   /**
          * (1 << 5)
          */
   public static final byte FAILURE_MOTOR_STUCK = (byte) 5;
   /**
          * (1 << 6)
          */
   public static final byte FAILURE_GENERIC = (byte) 6;
   /**
          * (1 << 7)
          */
   public static final byte FAILURE_MOTOR_WARN_TEMPERATURE = (byte) 7;
   /**
          * (1 << 8)
          */
   public static final byte FAILURE_WARN_ESC_TEMPERATURE = (byte) 8;
   /**
          * (1 << 9)
          */
   public static final byte FAILURE_OVER_ESC_TEMPERATURE = (byte) 9;
   /**
          * Counter - keep it as last element!
          */
   public static final byte ESC_FAILURE_COUNT = (byte) 10;
   /**
            * time since system start (microseconds)
            */
   public long timestamp_;
   /**
            * Number of reported errors by ESC - if supported
            */
   public long esc_errorcount_;
   /**
            * Motor RPM, negative for reverse rotation [RPM] - if supported
            */
   public int esc_rpm_;
   /**
            * Voltage measured from current ESC [V] - if supported
            */
   public float esc_voltage_;
   /**
            * Current measured from current ESC [A] - if supported
            */
   public float esc_current_;
   /**
            * Temperature measured from current ESC [degC] - if supported
            */
   public float esc_temperature_;
   /**
            * Address of current ESC (in most cases 1-8 / must be set by driver)
            */
   public byte esc_address_;
   /**
            * Counter of number of commands
            */
   public byte esc_cmdcount_;
   /**
            * State of ESC - depend on Vendor
            */
   public byte esc_state_;
   /**
            * actuator output function (one of Motor1...MotorN)
            */
   public byte actuator_function_;
   /**
            * Bitmask to indicate the internal ESC faults
            */
   public int failures_;
   /**
            * Applied power 0-100 in % (negative values reserved)
            */
   public byte esc_power_;

   public EscReport()
   {
   }

   public EscReport(EscReport other)
   {
      this();
      set(other);
   }

   public void set(EscReport other)
   {
      timestamp_ = other.timestamp_;

      esc_errorcount_ = other.esc_errorcount_;

      esc_rpm_ = other.esc_rpm_;

      esc_voltage_ = other.esc_voltage_;

      esc_current_ = other.esc_current_;

      esc_temperature_ = other.esc_temperature_;

      esc_address_ = other.esc_address_;

      esc_cmdcount_ = other.esc_cmdcount_;

      esc_state_ = other.esc_state_;

      actuator_function_ = other.actuator_function_;

      failures_ = other.failures_;

      esc_power_ = other.esc_power_;

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
            * Number of reported errors by ESC - if supported
            */
   public void setEscErrorcount(long esc_errorcount)
   {
      esc_errorcount_ = esc_errorcount;
   }
   /**
            * Number of reported errors by ESC - if supported
            */
   public long getEscErrorcount()
   {
      return esc_errorcount_;
   }

   /**
            * Motor RPM, negative for reverse rotation [RPM] - if supported
            */
   public void setEscRpm(int esc_rpm)
   {
      esc_rpm_ = esc_rpm;
   }
   /**
            * Motor RPM, negative for reverse rotation [RPM] - if supported
            */
   public int getEscRpm()
   {
      return esc_rpm_;
   }

   /**
            * Voltage measured from current ESC [V] - if supported
            */
   public void setEscVoltage(float esc_voltage)
   {
      esc_voltage_ = esc_voltage;
   }
   /**
            * Voltage measured from current ESC [V] - if supported
            */
   public float getEscVoltage()
   {
      return esc_voltage_;
   }

   /**
            * Current measured from current ESC [A] - if supported
            */
   public void setEscCurrent(float esc_current)
   {
      esc_current_ = esc_current;
   }
   /**
            * Current measured from current ESC [A] - if supported
            */
   public float getEscCurrent()
   {
      return esc_current_;
   }

   /**
            * Temperature measured from current ESC [degC] - if supported
            */
   public void setEscTemperature(float esc_temperature)
   {
      esc_temperature_ = esc_temperature;
   }
   /**
            * Temperature measured from current ESC [degC] - if supported
            */
   public float getEscTemperature()
   {
      return esc_temperature_;
   }

   /**
            * Address of current ESC (in most cases 1-8 / must be set by driver)
            */
   public void setEscAddress(byte esc_address)
   {
      esc_address_ = esc_address;
   }
   /**
            * Address of current ESC (in most cases 1-8 / must be set by driver)
            */
   public byte getEscAddress()
   {
      return esc_address_;
   }

   /**
            * Counter of number of commands
            */
   public void setEscCmdcount(byte esc_cmdcount)
   {
      esc_cmdcount_ = esc_cmdcount;
   }
   /**
            * Counter of number of commands
            */
   public byte getEscCmdcount()
   {
      return esc_cmdcount_;
   }

   /**
            * State of ESC - depend on Vendor
            */
   public void setEscState(byte esc_state)
   {
      esc_state_ = esc_state;
   }
   /**
            * State of ESC - depend on Vendor
            */
   public byte getEscState()
   {
      return esc_state_;
   }

   /**
            * actuator output function (one of Motor1...MotorN)
            */
   public void setActuatorFunction(byte actuator_function)
   {
      actuator_function_ = actuator_function;
   }
   /**
            * actuator output function (one of Motor1...MotorN)
            */
   public byte getActuatorFunction()
   {
      return actuator_function_;
   }

   /**
            * Bitmask to indicate the internal ESC faults
            */
   public void setFailures(int failures)
   {
      failures_ = failures;
   }
   /**
            * Bitmask to indicate the internal ESC faults
            */
   public int getFailures()
   {
      return failures_;
   }

   /**
            * Applied power 0-100 in % (negative values reserved)
            */
   public void setEscPower(byte esc_power)
   {
      esc_power_ = esc_power;
   }
   /**
            * Applied power 0-100 in % (negative values reserved)
            */
   public byte getEscPower()
   {
      return esc_power_;
   }


   public static Supplier<EscReportPubSubType> getPubSubType()
   {
      return EscReportPubSubType::new;
   }

   @Override
   public Supplier<TopicDataType> getPubSubTypePacket()
   {
      return EscReportPubSubType::new;
   }

   @Override
   public boolean epsilonEquals(EscReport other, double epsilon)
   {
      if(other == null) return false;
      if(other == this) return true;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_, other.timestamp_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.esc_errorcount_, other.esc_errorcount_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.esc_rpm_, other.esc_rpm_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.esc_voltage_, other.esc_voltage_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.esc_current_, other.esc_current_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.esc_temperature_, other.esc_temperature_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.esc_address_, other.esc_address_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.esc_cmdcount_, other.esc_cmdcount_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.esc_state_, other.esc_state_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.actuator_function_, other.actuator_function_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.failures_, other.failures_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.esc_power_, other.esc_power_, epsilon)) return false;


      return true;
   }

   @Override
   public boolean equals(Object other)
   {
      if(other == null) return false;
      if(other == this) return true;
      if(!(other instanceof EscReport)) return false;

      EscReport otherMyClass = (EscReport) other;

      if(this.timestamp_ != otherMyClass.timestamp_) return false;

      if(this.esc_errorcount_ != otherMyClass.esc_errorcount_) return false;

      if(this.esc_rpm_ != otherMyClass.esc_rpm_) return false;

      if(this.esc_voltage_ != otherMyClass.esc_voltage_) return false;

      if(this.esc_current_ != otherMyClass.esc_current_) return false;

      if(this.esc_temperature_ != otherMyClass.esc_temperature_) return false;

      if(this.esc_address_ != otherMyClass.esc_address_) return false;

      if(this.esc_cmdcount_ != otherMyClass.esc_cmdcount_) return false;

      if(this.esc_state_ != otherMyClass.esc_state_) return false;

      if(this.actuator_function_ != otherMyClass.actuator_function_) return false;

      if(this.failures_ != otherMyClass.failures_) return false;

      if(this.esc_power_ != otherMyClass.esc_power_) return false;


      return true;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("EscReport {");
      builder.append("timestamp=");
      builder.append(this.timestamp_);      builder.append(", ");
      builder.append("esc_errorcount=");
      builder.append(this.esc_errorcount_);      builder.append(", ");
      builder.append("esc_rpm=");
      builder.append(this.esc_rpm_);      builder.append(", ");
      builder.append("esc_voltage=");
      builder.append(this.esc_voltage_);      builder.append(", ");
      builder.append("esc_current=");
      builder.append(this.esc_current_);      builder.append(", ");
      builder.append("esc_temperature=");
      builder.append(this.esc_temperature_);      builder.append(", ");
      builder.append("esc_address=");
      builder.append(this.esc_address_);      builder.append(", ");
      builder.append("esc_cmdcount=");
      builder.append(this.esc_cmdcount_);      builder.append(", ");
      builder.append("esc_state=");
      builder.append(this.esc_state_);      builder.append(", ");
      builder.append("actuator_function=");
      builder.append(this.actuator_function_);      builder.append(", ");
      builder.append("failures=");
      builder.append(this.failures_);      builder.append(", ");
      builder.append("esc_power=");
      builder.append(this.esc_power_);
      builder.append("}");
      return builder.toString();
   }
}
