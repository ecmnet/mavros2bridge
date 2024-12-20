package px4_msgs.msg.dds;

import us.ihmc.communication.packets.Packet;
import us.ihmc.euclid.interfaces.Settable;
import us.ihmc.euclid.interfaces.EpsilonComparable;
import java.util.function.Supplier;
import us.ihmc.pubsub.TopicDataType;

public class Px4ioStatus extends Packet<Px4ioStatus> implements Settable<Px4ioStatus>, EpsilonComparable<Px4ioStatus>
{
   /**
            * time since system start (microseconds)
            */
   public long timestamp_;
   public int free_memory_bytes_;
   /**
            * Servo rail voltage in volts
            */
   public float voltage_v_;
   /**
            * RSSI pin voltage in volts
            */
   public float rssi_v_;
   /**
            * PX4IO status flags (PX4IO_P_STATUS_FLAGS)
            */
   public boolean status_arm_sync_;
   public boolean status_failsafe_;
   public boolean status_fmu_initialized_;
   public boolean status_fmu_ok_;
   public boolean status_init_ok_;
   public boolean status_outputs_armed_;
   public boolean status_raw_pwm_;
   public boolean status_rc_ok_;
   public boolean status_rc_dsm_;
   public boolean status_rc_ppm_;
   public boolean status_rc_sbus_;
   public boolean status_rc_st24_;
   public boolean status_rc_sumd_;
   /**
            * px4io safety button was pressed for longer than 1 second
            */
   public boolean status_safety_button_event_;
   /**
            * PX4IO alarms (PX4IO_P_STATUS_ALARMS)
            */
   public boolean alarm_pwm_error_;
   public boolean alarm_rc_lost_;
   /**
            * PX4IO arming (PX4IO_P_SETUP_ARMING)
            */
   public boolean arming_failsafe_custom_;
   public boolean arming_fmu_armed_;
   public boolean arming_fmu_prearmed_;
   public boolean arming_force_failsafe_;
   public boolean arming_io_arm_ok_;
   public boolean arming_lockdown_;
   public boolean arming_termination_failsafe_;

   public Px4ioStatus()
   {
   }

   public Px4ioStatus(Px4ioStatus other)
   {
      this();
      set(other);
   }

   public void set(Px4ioStatus other)
   {
      timestamp_ = other.timestamp_;

      free_memory_bytes_ = other.free_memory_bytes_;

      voltage_v_ = other.voltage_v_;

      rssi_v_ = other.rssi_v_;

      status_arm_sync_ = other.status_arm_sync_;

      status_failsafe_ = other.status_failsafe_;

      status_fmu_initialized_ = other.status_fmu_initialized_;

      status_fmu_ok_ = other.status_fmu_ok_;

      status_init_ok_ = other.status_init_ok_;

      status_outputs_armed_ = other.status_outputs_armed_;

      status_raw_pwm_ = other.status_raw_pwm_;

      status_rc_ok_ = other.status_rc_ok_;

      status_rc_dsm_ = other.status_rc_dsm_;

      status_rc_ppm_ = other.status_rc_ppm_;

      status_rc_sbus_ = other.status_rc_sbus_;

      status_rc_st24_ = other.status_rc_st24_;

      status_rc_sumd_ = other.status_rc_sumd_;

      status_safety_button_event_ = other.status_safety_button_event_;

      alarm_pwm_error_ = other.alarm_pwm_error_;

      alarm_rc_lost_ = other.alarm_rc_lost_;

      arming_failsafe_custom_ = other.arming_failsafe_custom_;

      arming_fmu_armed_ = other.arming_fmu_armed_;

      arming_fmu_prearmed_ = other.arming_fmu_prearmed_;

      arming_force_failsafe_ = other.arming_force_failsafe_;

      arming_io_arm_ok_ = other.arming_io_arm_ok_;

      arming_lockdown_ = other.arming_lockdown_;

      arming_termination_failsafe_ = other.arming_termination_failsafe_;

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

   public void setFreeMemoryBytes(int free_memory_bytes)
   {
      free_memory_bytes_ = free_memory_bytes;
   }
   public int getFreeMemoryBytes()
   {
      return free_memory_bytes_;
   }

   /**
            * Servo rail voltage in volts
            */
   public void setVoltageV(float voltage_v)
   {
      voltage_v_ = voltage_v;
   }
   /**
            * Servo rail voltage in volts
            */
   public float getVoltageV()
   {
      return voltage_v_;
   }

   /**
            * RSSI pin voltage in volts
            */
   public void setRssiV(float rssi_v)
   {
      rssi_v_ = rssi_v;
   }
   /**
            * RSSI pin voltage in volts
            */
   public float getRssiV()
   {
      return rssi_v_;
   }

   /**
            * PX4IO status flags (PX4IO_P_STATUS_FLAGS)
            */
   public void setStatusArmSync(boolean status_arm_sync)
   {
      status_arm_sync_ = status_arm_sync;
   }
   /**
            * PX4IO status flags (PX4IO_P_STATUS_FLAGS)
            */
   public boolean getStatusArmSync()
   {
      return status_arm_sync_;
   }

   public void setStatusFailsafe(boolean status_failsafe)
   {
      status_failsafe_ = status_failsafe;
   }
   public boolean getStatusFailsafe()
   {
      return status_failsafe_;
   }

   public void setStatusFmuInitialized(boolean status_fmu_initialized)
   {
      status_fmu_initialized_ = status_fmu_initialized;
   }
   public boolean getStatusFmuInitialized()
   {
      return status_fmu_initialized_;
   }

   public void setStatusFmuOk(boolean status_fmu_ok)
   {
      status_fmu_ok_ = status_fmu_ok;
   }
   public boolean getStatusFmuOk()
   {
      return status_fmu_ok_;
   }

   public void setStatusInitOk(boolean status_init_ok)
   {
      status_init_ok_ = status_init_ok;
   }
   public boolean getStatusInitOk()
   {
      return status_init_ok_;
   }

   public void setStatusOutputsArmed(boolean status_outputs_armed)
   {
      status_outputs_armed_ = status_outputs_armed;
   }
   public boolean getStatusOutputsArmed()
   {
      return status_outputs_armed_;
   }

   public void setStatusRawPwm(boolean status_raw_pwm)
   {
      status_raw_pwm_ = status_raw_pwm;
   }
   public boolean getStatusRawPwm()
   {
      return status_raw_pwm_;
   }

   public void setStatusRcOk(boolean status_rc_ok)
   {
      status_rc_ok_ = status_rc_ok;
   }
   public boolean getStatusRcOk()
   {
      return status_rc_ok_;
   }

   public void setStatusRcDsm(boolean status_rc_dsm)
   {
      status_rc_dsm_ = status_rc_dsm;
   }
   public boolean getStatusRcDsm()
   {
      return status_rc_dsm_;
   }

   public void setStatusRcPpm(boolean status_rc_ppm)
   {
      status_rc_ppm_ = status_rc_ppm;
   }
   public boolean getStatusRcPpm()
   {
      return status_rc_ppm_;
   }

   public void setStatusRcSbus(boolean status_rc_sbus)
   {
      status_rc_sbus_ = status_rc_sbus;
   }
   public boolean getStatusRcSbus()
   {
      return status_rc_sbus_;
   }

   public void setStatusRcSt24(boolean status_rc_st24)
   {
      status_rc_st24_ = status_rc_st24;
   }
   public boolean getStatusRcSt24()
   {
      return status_rc_st24_;
   }

   public void setStatusRcSumd(boolean status_rc_sumd)
   {
      status_rc_sumd_ = status_rc_sumd;
   }
   public boolean getStatusRcSumd()
   {
      return status_rc_sumd_;
   }

   /**
            * px4io safety button was pressed for longer than 1 second
            */
   public void setStatusSafetyButtonEvent(boolean status_safety_button_event)
   {
      status_safety_button_event_ = status_safety_button_event;
   }
   /**
            * px4io safety button was pressed for longer than 1 second
            */
   public boolean getStatusSafetyButtonEvent()
   {
      return status_safety_button_event_;
   }

   /**
            * PX4IO alarms (PX4IO_P_STATUS_ALARMS)
            */
   public void setAlarmPwmError(boolean alarm_pwm_error)
   {
      alarm_pwm_error_ = alarm_pwm_error;
   }
   /**
            * PX4IO alarms (PX4IO_P_STATUS_ALARMS)
            */
   public boolean getAlarmPwmError()
   {
      return alarm_pwm_error_;
   }

   public void setAlarmRcLost(boolean alarm_rc_lost)
   {
      alarm_rc_lost_ = alarm_rc_lost;
   }
   public boolean getAlarmRcLost()
   {
      return alarm_rc_lost_;
   }

   /**
            * PX4IO arming (PX4IO_P_SETUP_ARMING)
            */
   public void setArmingFailsafeCustom(boolean arming_failsafe_custom)
   {
      arming_failsafe_custom_ = arming_failsafe_custom;
   }
   /**
            * PX4IO arming (PX4IO_P_SETUP_ARMING)
            */
   public boolean getArmingFailsafeCustom()
   {
      return arming_failsafe_custom_;
   }

   public void setArmingFmuArmed(boolean arming_fmu_armed)
   {
      arming_fmu_armed_ = arming_fmu_armed;
   }
   public boolean getArmingFmuArmed()
   {
      return arming_fmu_armed_;
   }

   public void setArmingFmuPrearmed(boolean arming_fmu_prearmed)
   {
      arming_fmu_prearmed_ = arming_fmu_prearmed;
   }
   public boolean getArmingFmuPrearmed()
   {
      return arming_fmu_prearmed_;
   }

   public void setArmingForceFailsafe(boolean arming_force_failsafe)
   {
      arming_force_failsafe_ = arming_force_failsafe;
   }
   public boolean getArmingForceFailsafe()
   {
      return arming_force_failsafe_;
   }

   public void setArmingIoArmOk(boolean arming_io_arm_ok)
   {
      arming_io_arm_ok_ = arming_io_arm_ok;
   }
   public boolean getArmingIoArmOk()
   {
      return arming_io_arm_ok_;
   }

   public void setArmingLockdown(boolean arming_lockdown)
   {
      arming_lockdown_ = arming_lockdown;
   }
   public boolean getArmingLockdown()
   {
      return arming_lockdown_;
   }

   public void setArmingTerminationFailsafe(boolean arming_termination_failsafe)
   {
      arming_termination_failsafe_ = arming_termination_failsafe;
   }
   public boolean getArmingTerminationFailsafe()
   {
      return arming_termination_failsafe_;
   }


   public static Supplier<Px4ioStatusPubSubType> getPubSubType()
   {
      return Px4ioStatusPubSubType::new;
   }

   @Override
   public Supplier<TopicDataType> getPubSubTypePacket()
   {
      return Px4ioStatusPubSubType::new;
   }

   @Override
   public boolean epsilonEquals(Px4ioStatus other, double epsilon)
   {
      if(other == null) return false;
      if(other == this) return true;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_, other.timestamp_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.free_memory_bytes_, other.free_memory_bytes_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.voltage_v_, other.voltage_v_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.rssi_v_, other.rssi_v_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.status_arm_sync_, other.status_arm_sync_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.status_failsafe_, other.status_failsafe_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.status_fmu_initialized_, other.status_fmu_initialized_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.status_fmu_ok_, other.status_fmu_ok_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.status_init_ok_, other.status_init_ok_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.status_outputs_armed_, other.status_outputs_armed_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.status_raw_pwm_, other.status_raw_pwm_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.status_rc_ok_, other.status_rc_ok_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.status_rc_dsm_, other.status_rc_dsm_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.status_rc_ppm_, other.status_rc_ppm_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.status_rc_sbus_, other.status_rc_sbus_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.status_rc_st24_, other.status_rc_st24_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.status_rc_sumd_, other.status_rc_sumd_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.status_safety_button_event_, other.status_safety_button_event_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.alarm_pwm_error_, other.alarm_pwm_error_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.alarm_rc_lost_, other.alarm_rc_lost_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.arming_failsafe_custom_, other.arming_failsafe_custom_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.arming_fmu_armed_, other.arming_fmu_armed_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.arming_fmu_prearmed_, other.arming_fmu_prearmed_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.arming_force_failsafe_, other.arming_force_failsafe_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.arming_io_arm_ok_, other.arming_io_arm_ok_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.arming_lockdown_, other.arming_lockdown_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.arming_termination_failsafe_, other.arming_termination_failsafe_, epsilon)) return false;


      return true;
   }

   @Override
   public boolean equals(Object other)
   {
      if(other == null) return false;
      if(other == this) return true;
      if(!(other instanceof Px4ioStatus)) return false;

      Px4ioStatus otherMyClass = (Px4ioStatus) other;

      if(this.timestamp_ != otherMyClass.timestamp_) return false;

      if(this.free_memory_bytes_ != otherMyClass.free_memory_bytes_) return false;

      if(this.voltage_v_ != otherMyClass.voltage_v_) return false;

      if(this.rssi_v_ != otherMyClass.rssi_v_) return false;

      if(this.status_arm_sync_ != otherMyClass.status_arm_sync_) return false;

      if(this.status_failsafe_ != otherMyClass.status_failsafe_) return false;

      if(this.status_fmu_initialized_ != otherMyClass.status_fmu_initialized_) return false;

      if(this.status_fmu_ok_ != otherMyClass.status_fmu_ok_) return false;

      if(this.status_init_ok_ != otherMyClass.status_init_ok_) return false;

      if(this.status_outputs_armed_ != otherMyClass.status_outputs_armed_) return false;

      if(this.status_raw_pwm_ != otherMyClass.status_raw_pwm_) return false;

      if(this.status_rc_ok_ != otherMyClass.status_rc_ok_) return false;

      if(this.status_rc_dsm_ != otherMyClass.status_rc_dsm_) return false;

      if(this.status_rc_ppm_ != otherMyClass.status_rc_ppm_) return false;

      if(this.status_rc_sbus_ != otherMyClass.status_rc_sbus_) return false;

      if(this.status_rc_st24_ != otherMyClass.status_rc_st24_) return false;

      if(this.status_rc_sumd_ != otherMyClass.status_rc_sumd_) return false;

      if(this.status_safety_button_event_ != otherMyClass.status_safety_button_event_) return false;

      if(this.alarm_pwm_error_ != otherMyClass.alarm_pwm_error_) return false;

      if(this.alarm_rc_lost_ != otherMyClass.alarm_rc_lost_) return false;

      if(this.arming_failsafe_custom_ != otherMyClass.arming_failsafe_custom_) return false;

      if(this.arming_fmu_armed_ != otherMyClass.arming_fmu_armed_) return false;

      if(this.arming_fmu_prearmed_ != otherMyClass.arming_fmu_prearmed_) return false;

      if(this.arming_force_failsafe_ != otherMyClass.arming_force_failsafe_) return false;

      if(this.arming_io_arm_ok_ != otherMyClass.arming_io_arm_ok_) return false;

      if(this.arming_lockdown_ != otherMyClass.arming_lockdown_) return false;

      if(this.arming_termination_failsafe_ != otherMyClass.arming_termination_failsafe_) return false;


      return true;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("Px4ioStatus {");
      builder.append("timestamp=");
      builder.append(this.timestamp_);      builder.append(", ");
      builder.append("free_memory_bytes=");
      builder.append(this.free_memory_bytes_);      builder.append(", ");
      builder.append("voltage_v=");
      builder.append(this.voltage_v_);      builder.append(", ");
      builder.append("rssi_v=");
      builder.append(this.rssi_v_);      builder.append(", ");
      builder.append("status_arm_sync=");
      builder.append(this.status_arm_sync_);      builder.append(", ");
      builder.append("status_failsafe=");
      builder.append(this.status_failsafe_);      builder.append(", ");
      builder.append("status_fmu_initialized=");
      builder.append(this.status_fmu_initialized_);      builder.append(", ");
      builder.append("status_fmu_ok=");
      builder.append(this.status_fmu_ok_);      builder.append(", ");
      builder.append("status_init_ok=");
      builder.append(this.status_init_ok_);      builder.append(", ");
      builder.append("status_outputs_armed=");
      builder.append(this.status_outputs_armed_);      builder.append(", ");
      builder.append("status_raw_pwm=");
      builder.append(this.status_raw_pwm_);      builder.append(", ");
      builder.append("status_rc_ok=");
      builder.append(this.status_rc_ok_);      builder.append(", ");
      builder.append("status_rc_dsm=");
      builder.append(this.status_rc_dsm_);      builder.append(", ");
      builder.append("status_rc_ppm=");
      builder.append(this.status_rc_ppm_);      builder.append(", ");
      builder.append("status_rc_sbus=");
      builder.append(this.status_rc_sbus_);      builder.append(", ");
      builder.append("status_rc_st24=");
      builder.append(this.status_rc_st24_);      builder.append(", ");
      builder.append("status_rc_sumd=");
      builder.append(this.status_rc_sumd_);      builder.append(", ");
      builder.append("status_safety_button_event=");
      builder.append(this.status_safety_button_event_);      builder.append(", ");
      builder.append("alarm_pwm_error=");
      builder.append(this.alarm_pwm_error_);      builder.append(", ");
      builder.append("alarm_rc_lost=");
      builder.append(this.alarm_rc_lost_);      builder.append(", ");
      builder.append("arming_failsafe_custom=");
      builder.append(this.arming_failsafe_custom_);      builder.append(", ");
      builder.append("arming_fmu_armed=");
      builder.append(this.arming_fmu_armed_);      builder.append(", ");
      builder.append("arming_fmu_prearmed=");
      builder.append(this.arming_fmu_prearmed_);      builder.append(", ");
      builder.append("arming_force_failsafe=");
      builder.append(this.arming_force_failsafe_);      builder.append(", ");
      builder.append("arming_io_arm_ok=");
      builder.append(this.arming_io_arm_ok_);      builder.append(", ");
      builder.append("arming_lockdown=");
      builder.append(this.arming_lockdown_);      builder.append(", ");
      builder.append("arming_termination_failsafe=");
      builder.append(this.arming_termination_failsafe_);
      builder.append("}");
      return builder.toString();
   }
}
