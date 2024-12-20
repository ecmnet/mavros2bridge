package px4_msgs.msg.dds;

import us.ihmc.communication.packets.Packet;
import us.ihmc.euclid.interfaces.Settable;
import us.ihmc.euclid.interfaces.EpsilonComparable;
import java.util.function.Supplier;
import us.ihmc.pubsub.TopicDataType;

/**
       * A component is required but missing, if present==0 and error==1
       */
public class HealthReport extends Packet<HealthReport> implements Settable<HealthReport>, EpsilonComparable<HealthReport>
{
   /**
            * time since system start (microseconds)
            */
   public long timestamp_;
   /**
            * bitfield for each flight mode (NAVIGATION_STATE_*) if arming is possible
            */
   public long can_arm_mode_flags_;
   /**
            * bitfield for each flight mode if it can run
            */
   public long can_run_mode_flags_;
   /**
            * flags for each health_component_t
            */
   public long health_is_present_flags_;
   public long health_warning_flags_;
   public long health_error_flags_;
   public long arming_check_warning_flags_;
   public long arming_check_error_flags_;

   public HealthReport()
   {
   }

   public HealthReport(HealthReport other)
   {
      this();
      set(other);
   }

   public void set(HealthReport other)
   {
      timestamp_ = other.timestamp_;

      can_arm_mode_flags_ = other.can_arm_mode_flags_;

      can_run_mode_flags_ = other.can_run_mode_flags_;

      health_is_present_flags_ = other.health_is_present_flags_;

      health_warning_flags_ = other.health_warning_flags_;

      health_error_flags_ = other.health_error_flags_;

      arming_check_warning_flags_ = other.arming_check_warning_flags_;

      arming_check_error_flags_ = other.arming_check_error_flags_;

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
            * bitfield for each flight mode (NAVIGATION_STATE_*) if arming is possible
            */
   public void setCanArmModeFlags(long can_arm_mode_flags)
   {
      can_arm_mode_flags_ = can_arm_mode_flags;
   }
   /**
            * bitfield for each flight mode (NAVIGATION_STATE_*) if arming is possible
            */
   public long getCanArmModeFlags()
   {
      return can_arm_mode_flags_;
   }

   /**
            * bitfield for each flight mode if it can run
            */
   public void setCanRunModeFlags(long can_run_mode_flags)
   {
      can_run_mode_flags_ = can_run_mode_flags;
   }
   /**
            * bitfield for each flight mode if it can run
            */
   public long getCanRunModeFlags()
   {
      return can_run_mode_flags_;
   }

   /**
            * flags for each health_component_t
            */
   public void setHealthIsPresentFlags(long health_is_present_flags)
   {
      health_is_present_flags_ = health_is_present_flags;
   }
   /**
            * flags for each health_component_t
            */
   public long getHealthIsPresentFlags()
   {
      return health_is_present_flags_;
   }

   public void setHealthWarningFlags(long health_warning_flags)
   {
      health_warning_flags_ = health_warning_flags;
   }
   public long getHealthWarningFlags()
   {
      return health_warning_flags_;
   }

   public void setHealthErrorFlags(long health_error_flags)
   {
      health_error_flags_ = health_error_flags;
   }
   public long getHealthErrorFlags()
   {
      return health_error_flags_;
   }

   public void setArmingCheckWarningFlags(long arming_check_warning_flags)
   {
      arming_check_warning_flags_ = arming_check_warning_flags;
   }
   public long getArmingCheckWarningFlags()
   {
      return arming_check_warning_flags_;
   }

   public void setArmingCheckErrorFlags(long arming_check_error_flags)
   {
      arming_check_error_flags_ = arming_check_error_flags;
   }
   public long getArmingCheckErrorFlags()
   {
      return arming_check_error_flags_;
   }


   public static Supplier<HealthReportPubSubType> getPubSubType()
   {
      return HealthReportPubSubType::new;
   }

   @Override
   public Supplier<TopicDataType> getPubSubTypePacket()
   {
      return HealthReportPubSubType::new;
   }

   @Override
   public boolean epsilonEquals(HealthReport other, double epsilon)
   {
      if(other == null) return false;
      if(other == this) return true;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_, other.timestamp_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.can_arm_mode_flags_, other.can_arm_mode_flags_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.can_run_mode_flags_, other.can_run_mode_flags_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.health_is_present_flags_, other.health_is_present_flags_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.health_warning_flags_, other.health_warning_flags_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.health_error_flags_, other.health_error_flags_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.arming_check_warning_flags_, other.arming_check_warning_flags_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.arming_check_error_flags_, other.arming_check_error_flags_, epsilon)) return false;


      return true;
   }

   @Override
   public boolean equals(Object other)
   {
      if(other == null) return false;
      if(other == this) return true;
      if(!(other instanceof HealthReport)) return false;

      HealthReport otherMyClass = (HealthReport) other;

      if(this.timestamp_ != otherMyClass.timestamp_) return false;

      if(this.can_arm_mode_flags_ != otherMyClass.can_arm_mode_flags_) return false;

      if(this.can_run_mode_flags_ != otherMyClass.can_run_mode_flags_) return false;

      if(this.health_is_present_flags_ != otherMyClass.health_is_present_flags_) return false;

      if(this.health_warning_flags_ != otherMyClass.health_warning_flags_) return false;

      if(this.health_error_flags_ != otherMyClass.health_error_flags_) return false;

      if(this.arming_check_warning_flags_ != otherMyClass.arming_check_warning_flags_) return false;

      if(this.arming_check_error_flags_ != otherMyClass.arming_check_error_flags_) return false;


      return true;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("HealthReport {");
      builder.append("timestamp=");
      builder.append(this.timestamp_);      builder.append(", ");
      builder.append("can_arm_mode_flags=");
      builder.append(this.can_arm_mode_flags_);      builder.append(", ");
      builder.append("can_run_mode_flags=");
      builder.append(this.can_run_mode_flags_);      builder.append(", ");
      builder.append("health_is_present_flags=");
      builder.append(this.health_is_present_flags_);      builder.append(", ");
      builder.append("health_warning_flags=");
      builder.append(this.health_warning_flags_);      builder.append(", ");
      builder.append("health_error_flags=");
      builder.append(this.health_error_flags_);      builder.append(", ");
      builder.append("arming_check_warning_flags=");
      builder.append(this.arming_check_warning_flags_);      builder.append(", ");
      builder.append("arming_check_error_flags=");
      builder.append(this.arming_check_error_flags_);
      builder.append("}");
      return builder.toString();
   }
}
