package px4_msgs.msg.dds;

import us.ihmc.communication.packets.Packet;
import us.ihmc.euclid.interfaces.Settable;
import us.ihmc.euclid.interfaces.EpsilonComparable;
import java.util.function.Supplier;
import us.ihmc.pubsub.TopicDataType;

public class FollowTargetStatus extends Packet<FollowTargetStatus> implements Settable<FollowTargetStatus>, EpsilonComparable<FollowTargetStatus>
{
   /**
            * [microseconds] time since system start
            */
   public long timestamp_;
   /**
            * [rad] Tracked target course in NED local frame (North is course zero)
            */
   public float tracked_target_course_;
   /**
            * [rad] Current follow angle setting
            */
   public float follow_angle_;
   /**
            * [rad] Current orbit angle setpoint from the smooth trajectory generator
            */
   public float orbit_angle_setpoint_;
   /**
            * [rad/s] Angular rate commanded from Jerk-limited Orbit Angle trajectory for Orbit Angle
            */
   public float angular_rate_setpoint_;
   /**
            * [m] Raw 'idealistic' desired drone position if a drone could teleport from place to places
            */
   public float[] desired_position_raw_;
   /**
            * [bool] True when doing emergency ascent (when distance to ground is below safety altitude)
            */
   public boolean in_emergency_ascent_;
   /**
            * [rad] Gimbal pitch commanded to track target in the center of the frame
            */
   public float gimbal_pitch_;

   public FollowTargetStatus()
   {
      desired_position_raw_ = new float[3];

   }

   public FollowTargetStatus(FollowTargetStatus other)
   {
      this();
      set(other);
   }

   public void set(FollowTargetStatus other)
   {
      timestamp_ = other.timestamp_;

      tracked_target_course_ = other.tracked_target_course_;

      follow_angle_ = other.follow_angle_;

      orbit_angle_setpoint_ = other.orbit_angle_setpoint_;

      angular_rate_setpoint_ = other.angular_rate_setpoint_;

      for(int i1 = 0; i1 < desired_position_raw_.length; ++i1)
      {
            desired_position_raw_[i1] = other.desired_position_raw_[i1];

      }

      in_emergency_ascent_ = other.in_emergency_ascent_;

      gimbal_pitch_ = other.gimbal_pitch_;

   }

   /**
            * [microseconds] time since system start
            */
   public void setTimestamp(long timestamp)
   {
      timestamp_ = timestamp;
   }
   /**
            * [microseconds] time since system start
            */
   public long getTimestamp()
   {
      return timestamp_;
   }

   /**
            * [rad] Tracked target course in NED local frame (North is course zero)
            */
   public void setTrackedTargetCourse(float tracked_target_course)
   {
      tracked_target_course_ = tracked_target_course;
   }
   /**
            * [rad] Tracked target course in NED local frame (North is course zero)
            */
   public float getTrackedTargetCourse()
   {
      return tracked_target_course_;
   }

   /**
            * [rad] Current follow angle setting
            */
   public void setFollowAngle(float follow_angle)
   {
      follow_angle_ = follow_angle;
   }
   /**
            * [rad] Current follow angle setting
            */
   public float getFollowAngle()
   {
      return follow_angle_;
   }

   /**
            * [rad] Current orbit angle setpoint from the smooth trajectory generator
            */
   public void setOrbitAngleSetpoint(float orbit_angle_setpoint)
   {
      orbit_angle_setpoint_ = orbit_angle_setpoint;
   }
   /**
            * [rad] Current orbit angle setpoint from the smooth trajectory generator
            */
   public float getOrbitAngleSetpoint()
   {
      return orbit_angle_setpoint_;
   }

   /**
            * [rad/s] Angular rate commanded from Jerk-limited Orbit Angle trajectory for Orbit Angle
            */
   public void setAngularRateSetpoint(float angular_rate_setpoint)
   {
      angular_rate_setpoint_ = angular_rate_setpoint;
   }
   /**
            * [rad/s] Angular rate commanded from Jerk-limited Orbit Angle trajectory for Orbit Angle
            */
   public float getAngularRateSetpoint()
   {
      return angular_rate_setpoint_;
   }


   /**
            * [m] Raw 'idealistic' desired drone position if a drone could teleport from place to places
            */
   public float[] getDesiredPositionRaw()
   {
      return desired_position_raw_;
   }

   /**
            * [bool] True when doing emergency ascent (when distance to ground is below safety altitude)
            */
   public void setInEmergencyAscent(boolean in_emergency_ascent)
   {
      in_emergency_ascent_ = in_emergency_ascent;
   }
   /**
            * [bool] True when doing emergency ascent (when distance to ground is below safety altitude)
            */
   public boolean getInEmergencyAscent()
   {
      return in_emergency_ascent_;
   }

   /**
            * [rad] Gimbal pitch commanded to track target in the center of the frame
            */
   public void setGimbalPitch(float gimbal_pitch)
   {
      gimbal_pitch_ = gimbal_pitch;
   }
   /**
            * [rad] Gimbal pitch commanded to track target in the center of the frame
            */
   public float getGimbalPitch()
   {
      return gimbal_pitch_;
   }


   public static Supplier<FollowTargetStatusPubSubType> getPubSubType()
   {
      return FollowTargetStatusPubSubType::new;
   }

   @Override
   public Supplier<TopicDataType> getPubSubTypePacket()
   {
      return FollowTargetStatusPubSubType::new;
   }

   @Override
   public boolean epsilonEquals(FollowTargetStatus other, double epsilon)
   {
      if(other == null) return false;
      if(other == this) return true;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_, other.timestamp_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.tracked_target_course_, other.tracked_target_course_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.follow_angle_, other.follow_angle_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.orbit_angle_setpoint_, other.orbit_angle_setpoint_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.angular_rate_setpoint_, other.angular_rate_setpoint_, epsilon)) return false;

      for(int i3 = 0; i3 < desired_position_raw_.length; ++i3)
      {
                if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.desired_position_raw_[i3], other.desired_position_raw_[i3], epsilon)) return false;
      }

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.in_emergency_ascent_, other.in_emergency_ascent_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.gimbal_pitch_, other.gimbal_pitch_, epsilon)) return false;


      return true;
   }

   @Override
   public boolean equals(Object other)
   {
      if(other == null) return false;
      if(other == this) return true;
      if(!(other instanceof FollowTargetStatus)) return false;

      FollowTargetStatus otherMyClass = (FollowTargetStatus) other;

      if(this.timestamp_ != otherMyClass.timestamp_) return false;

      if(this.tracked_target_course_ != otherMyClass.tracked_target_course_) return false;

      if(this.follow_angle_ != otherMyClass.follow_angle_) return false;

      if(this.orbit_angle_setpoint_ != otherMyClass.orbit_angle_setpoint_) return false;

      if(this.angular_rate_setpoint_ != otherMyClass.angular_rate_setpoint_) return false;

      for(int i5 = 0; i5 < desired_position_raw_.length; ++i5)
      {
                if(this.desired_position_raw_[i5] != otherMyClass.desired_position_raw_[i5]) return false;

      }
      if(this.in_emergency_ascent_ != otherMyClass.in_emergency_ascent_) return false;

      if(this.gimbal_pitch_ != otherMyClass.gimbal_pitch_) return false;


      return true;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("FollowTargetStatus {");
      builder.append("timestamp=");
      builder.append(this.timestamp_);      builder.append(", ");
      builder.append("tracked_target_course=");
      builder.append(this.tracked_target_course_);      builder.append(", ");
      builder.append("follow_angle=");
      builder.append(this.follow_angle_);      builder.append(", ");
      builder.append("orbit_angle_setpoint=");
      builder.append(this.orbit_angle_setpoint_);      builder.append(", ");
      builder.append("angular_rate_setpoint=");
      builder.append(this.angular_rate_setpoint_);      builder.append(", ");
      builder.append("desired_position_raw=");
      builder.append(java.util.Arrays.toString(this.desired_position_raw_));      builder.append(", ");
      builder.append("in_emergency_ascent=");
      builder.append(this.in_emergency_ascent_);      builder.append(", ");
      builder.append("gimbal_pitch=");
      builder.append(this.gimbal_pitch_);
      builder.append("}");
      return builder.toString();
   }
}
