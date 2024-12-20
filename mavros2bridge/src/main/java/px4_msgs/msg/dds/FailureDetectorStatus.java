package px4_msgs.msg.dds;

import us.ihmc.communication.packets.Packet;
import us.ihmc.euclid.interfaces.Settable;
import us.ihmc.euclid.interfaces.EpsilonComparable;
import java.util.function.Supplier;
import us.ihmc.pubsub.TopicDataType;

public class FailureDetectorStatus extends Packet<FailureDetectorStatus> implements Settable<FailureDetectorStatus>, EpsilonComparable<FailureDetectorStatus>
{
   /**
            * time since system start (microseconds)
            */
   public long timestamp_;
   /**
            * FailureDetector status
            */
   public boolean fd_roll_;
   public boolean fd_pitch_;
   public boolean fd_alt_;
   public boolean fd_ext_;
   public boolean fd_arm_escs_;
   public boolean fd_battery_;
   public boolean fd_imbalanced_prop_;
   public boolean fd_motor_;
   /**
            * Metric of the imbalanced propeller check (low-passed)
            */
   public float imbalanced_prop_metric_;
   /**
            * Bit-mask with motor indices, indicating critical motor failures
            */
   public int motor_failure_mask_;

   public FailureDetectorStatus()
   {
   }

   public FailureDetectorStatus(FailureDetectorStatus other)
   {
      this();
      set(other);
   }

   public void set(FailureDetectorStatus other)
   {
      timestamp_ = other.timestamp_;

      fd_roll_ = other.fd_roll_;

      fd_pitch_ = other.fd_pitch_;

      fd_alt_ = other.fd_alt_;

      fd_ext_ = other.fd_ext_;

      fd_arm_escs_ = other.fd_arm_escs_;

      fd_battery_ = other.fd_battery_;

      fd_imbalanced_prop_ = other.fd_imbalanced_prop_;

      fd_motor_ = other.fd_motor_;

      imbalanced_prop_metric_ = other.imbalanced_prop_metric_;

      motor_failure_mask_ = other.motor_failure_mask_;

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
            * FailureDetector status
            */
   public void setFdRoll(boolean fd_roll)
   {
      fd_roll_ = fd_roll;
   }
   /**
            * FailureDetector status
            */
   public boolean getFdRoll()
   {
      return fd_roll_;
   }

   public void setFdPitch(boolean fd_pitch)
   {
      fd_pitch_ = fd_pitch;
   }
   public boolean getFdPitch()
   {
      return fd_pitch_;
   }

   public void setFdAlt(boolean fd_alt)
   {
      fd_alt_ = fd_alt;
   }
   public boolean getFdAlt()
   {
      return fd_alt_;
   }

   public void setFdExt(boolean fd_ext)
   {
      fd_ext_ = fd_ext;
   }
   public boolean getFdExt()
   {
      return fd_ext_;
   }

   public void setFdArmEscs(boolean fd_arm_escs)
   {
      fd_arm_escs_ = fd_arm_escs;
   }
   public boolean getFdArmEscs()
   {
      return fd_arm_escs_;
   }

   public void setFdBattery(boolean fd_battery)
   {
      fd_battery_ = fd_battery;
   }
   public boolean getFdBattery()
   {
      return fd_battery_;
   }

   public void setFdImbalancedProp(boolean fd_imbalanced_prop)
   {
      fd_imbalanced_prop_ = fd_imbalanced_prop;
   }
   public boolean getFdImbalancedProp()
   {
      return fd_imbalanced_prop_;
   }

   public void setFdMotor(boolean fd_motor)
   {
      fd_motor_ = fd_motor;
   }
   public boolean getFdMotor()
   {
      return fd_motor_;
   }

   /**
            * Metric of the imbalanced propeller check (low-passed)
            */
   public void setImbalancedPropMetric(float imbalanced_prop_metric)
   {
      imbalanced_prop_metric_ = imbalanced_prop_metric;
   }
   /**
            * Metric of the imbalanced propeller check (low-passed)
            */
   public float getImbalancedPropMetric()
   {
      return imbalanced_prop_metric_;
   }

   /**
            * Bit-mask with motor indices, indicating critical motor failures
            */
   public void setMotorFailureMask(int motor_failure_mask)
   {
      motor_failure_mask_ = motor_failure_mask;
   }
   /**
            * Bit-mask with motor indices, indicating critical motor failures
            */
   public int getMotorFailureMask()
   {
      return motor_failure_mask_;
   }


   public static Supplier<FailureDetectorStatusPubSubType> getPubSubType()
   {
      return FailureDetectorStatusPubSubType::new;
   }

   @Override
   public Supplier<TopicDataType> getPubSubTypePacket()
   {
      return FailureDetectorStatusPubSubType::new;
   }

   @Override
   public boolean epsilonEquals(FailureDetectorStatus other, double epsilon)
   {
      if(other == null) return false;
      if(other == this) return true;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_, other.timestamp_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.fd_roll_, other.fd_roll_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.fd_pitch_, other.fd_pitch_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.fd_alt_, other.fd_alt_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.fd_ext_, other.fd_ext_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.fd_arm_escs_, other.fd_arm_escs_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.fd_battery_, other.fd_battery_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.fd_imbalanced_prop_, other.fd_imbalanced_prop_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.fd_motor_, other.fd_motor_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.imbalanced_prop_metric_, other.imbalanced_prop_metric_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.motor_failure_mask_, other.motor_failure_mask_, epsilon)) return false;


      return true;
   }

   @Override
   public boolean equals(Object other)
   {
      if(other == null) return false;
      if(other == this) return true;
      if(!(other instanceof FailureDetectorStatus)) return false;

      FailureDetectorStatus otherMyClass = (FailureDetectorStatus) other;

      if(this.timestamp_ != otherMyClass.timestamp_) return false;

      if(this.fd_roll_ != otherMyClass.fd_roll_) return false;

      if(this.fd_pitch_ != otherMyClass.fd_pitch_) return false;

      if(this.fd_alt_ != otherMyClass.fd_alt_) return false;

      if(this.fd_ext_ != otherMyClass.fd_ext_) return false;

      if(this.fd_arm_escs_ != otherMyClass.fd_arm_escs_) return false;

      if(this.fd_battery_ != otherMyClass.fd_battery_) return false;

      if(this.fd_imbalanced_prop_ != otherMyClass.fd_imbalanced_prop_) return false;

      if(this.fd_motor_ != otherMyClass.fd_motor_) return false;

      if(this.imbalanced_prop_metric_ != otherMyClass.imbalanced_prop_metric_) return false;

      if(this.motor_failure_mask_ != otherMyClass.motor_failure_mask_) return false;


      return true;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("FailureDetectorStatus {");
      builder.append("timestamp=");
      builder.append(this.timestamp_);      builder.append(", ");
      builder.append("fd_roll=");
      builder.append(this.fd_roll_);      builder.append(", ");
      builder.append("fd_pitch=");
      builder.append(this.fd_pitch_);      builder.append(", ");
      builder.append("fd_alt=");
      builder.append(this.fd_alt_);      builder.append(", ");
      builder.append("fd_ext=");
      builder.append(this.fd_ext_);      builder.append(", ");
      builder.append("fd_arm_escs=");
      builder.append(this.fd_arm_escs_);      builder.append(", ");
      builder.append("fd_battery=");
      builder.append(this.fd_battery_);      builder.append(", ");
      builder.append("fd_imbalanced_prop=");
      builder.append(this.fd_imbalanced_prop_);      builder.append(", ");
      builder.append("fd_motor=");
      builder.append(this.fd_motor_);      builder.append(", ");
      builder.append("imbalanced_prop_metric=");
      builder.append(this.imbalanced_prop_metric_);      builder.append(", ");
      builder.append("motor_failure_mask=");
      builder.append(this.motor_failure_mask_);
      builder.append("}");
      return builder.toString();
   }
}
