package px4_msgs.msg.dds;

import us.ihmc.communication.packets.Packet;
import us.ihmc.euclid.interfaces.Settable;
import us.ihmc.euclid.interfaces.EpsilonComparable;
import java.util.function.Supplier;
import us.ihmc.pubsub.TopicDataType;

public class ActuatorArmed extends Packet<ActuatorArmed> implements Settable<ActuatorArmed>, EpsilonComparable<ActuatorArmed>
{
   /**
            * time since system start (microseconds)
            */
   public long timestamp_;
   /**
            * Set to true if system is armed
            */
   public boolean armed_;
   /**
            * Set to true if the actuator safety is disabled but motors are not armed
            */
   public boolean prearmed_;
   /**
            * Set to true if system is ready to be armed
            */
   public boolean ready_to_arm_;
   /**
            * Set to true if actuators are forced to being disabled (due to emergency or HIL)
            */
   public boolean lockdown_;
   /**
            * Set to true if manual throttle kill switch is engaged
            */
   public boolean manual_lockdown_;
   /**
            * Set to true if the actuators are forced to the failsafe position
            */
   public boolean force_failsafe_;
   /**
            * IO/FMU should ignore messages from the actuator controls topics
            */
   public boolean in_esc_calibration_mode_;

   public ActuatorArmed()
   {
   }

   public ActuatorArmed(ActuatorArmed other)
   {
      this();
      set(other);
   }

   public void set(ActuatorArmed other)
   {
      timestamp_ = other.timestamp_;

      armed_ = other.armed_;

      prearmed_ = other.prearmed_;

      ready_to_arm_ = other.ready_to_arm_;

      lockdown_ = other.lockdown_;

      manual_lockdown_ = other.manual_lockdown_;

      force_failsafe_ = other.force_failsafe_;

      in_esc_calibration_mode_ = other.in_esc_calibration_mode_;

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
            * Set to true if system is armed
            */
   public void setArmed(boolean armed)
   {
      armed_ = armed;
   }
   /**
            * Set to true if system is armed
            */
   public boolean getArmed()
   {
      return armed_;
   }

   /**
            * Set to true if the actuator safety is disabled but motors are not armed
            */
   public void setPrearmed(boolean prearmed)
   {
      prearmed_ = prearmed;
   }
   /**
            * Set to true if the actuator safety is disabled but motors are not armed
            */
   public boolean getPrearmed()
   {
      return prearmed_;
   }

   /**
            * Set to true if system is ready to be armed
            */
   public void setReadyToArm(boolean ready_to_arm)
   {
      ready_to_arm_ = ready_to_arm;
   }
   /**
            * Set to true if system is ready to be armed
            */
   public boolean getReadyToArm()
   {
      return ready_to_arm_;
   }

   /**
            * Set to true if actuators are forced to being disabled (due to emergency or HIL)
            */
   public void setLockdown(boolean lockdown)
   {
      lockdown_ = lockdown;
   }
   /**
            * Set to true if actuators are forced to being disabled (due to emergency or HIL)
            */
   public boolean getLockdown()
   {
      return lockdown_;
   }

   /**
            * Set to true if manual throttle kill switch is engaged
            */
   public void setManualLockdown(boolean manual_lockdown)
   {
      manual_lockdown_ = manual_lockdown;
   }
   /**
            * Set to true if manual throttle kill switch is engaged
            */
   public boolean getManualLockdown()
   {
      return manual_lockdown_;
   }

   /**
            * Set to true if the actuators are forced to the failsafe position
            */
   public void setForceFailsafe(boolean force_failsafe)
   {
      force_failsafe_ = force_failsafe;
   }
   /**
            * Set to true if the actuators are forced to the failsafe position
            */
   public boolean getForceFailsafe()
   {
      return force_failsafe_;
   }

   /**
            * IO/FMU should ignore messages from the actuator controls topics
            */
   public void setInEscCalibrationMode(boolean in_esc_calibration_mode)
   {
      in_esc_calibration_mode_ = in_esc_calibration_mode;
   }
   /**
            * IO/FMU should ignore messages from the actuator controls topics
            */
   public boolean getInEscCalibrationMode()
   {
      return in_esc_calibration_mode_;
   }


   public static Supplier<ActuatorArmedPubSubType> getPubSubType()
   {
      return ActuatorArmedPubSubType::new;
   }

   @Override
   public Supplier<TopicDataType> getPubSubTypePacket()
   {
      return ActuatorArmedPubSubType::new;
   }

   @Override
   public boolean epsilonEquals(ActuatorArmed other, double epsilon)
   {
      if(other == null) return false;
      if(other == this) return true;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_, other.timestamp_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.armed_, other.armed_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.prearmed_, other.prearmed_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.ready_to_arm_, other.ready_to_arm_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.lockdown_, other.lockdown_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.manual_lockdown_, other.manual_lockdown_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.force_failsafe_, other.force_failsafe_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.in_esc_calibration_mode_, other.in_esc_calibration_mode_, epsilon)) return false;


      return true;
   }

   @Override
   public boolean equals(Object other)
   {
      if(other == null) return false;
      if(other == this) return true;
      if(!(other instanceof ActuatorArmed)) return false;

      ActuatorArmed otherMyClass = (ActuatorArmed) other;

      if(this.timestamp_ != otherMyClass.timestamp_) return false;

      if(this.armed_ != otherMyClass.armed_) return false;

      if(this.prearmed_ != otherMyClass.prearmed_) return false;

      if(this.ready_to_arm_ != otherMyClass.ready_to_arm_) return false;

      if(this.lockdown_ != otherMyClass.lockdown_) return false;

      if(this.manual_lockdown_ != otherMyClass.manual_lockdown_) return false;

      if(this.force_failsafe_ != otherMyClass.force_failsafe_) return false;

      if(this.in_esc_calibration_mode_ != otherMyClass.in_esc_calibration_mode_) return false;


      return true;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("ActuatorArmed {");
      builder.append("timestamp=");
      builder.append(this.timestamp_);      builder.append(", ");
      builder.append("armed=");
      builder.append(this.armed_);      builder.append(", ");
      builder.append("prearmed=");
      builder.append(this.prearmed_);      builder.append(", ");
      builder.append("ready_to_arm=");
      builder.append(this.ready_to_arm_);      builder.append(", ");
      builder.append("lockdown=");
      builder.append(this.lockdown_);      builder.append(", ");
      builder.append("manual_lockdown=");
      builder.append(this.manual_lockdown_);      builder.append(", ");
      builder.append("force_failsafe=");
      builder.append(this.force_failsafe_);      builder.append(", ");
      builder.append("in_esc_calibration_mode=");
      builder.append(this.in_esc_calibration_mode_);
      builder.append("}");
      return builder.toString();
   }
}
