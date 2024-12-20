package px4_msgs.msg.dds;

import us.ihmc.communication.packets.Packet;
import us.ihmc.euclid.interfaces.Settable;
import us.ihmc.euclid.interfaces.EpsilonComparable;
import java.util.function.Supplier;
import us.ihmc.pubsub.TopicDataType;

public class PositionControllerStatus extends Packet<PositionControllerStatus> implements Settable<PositionControllerStatus>, EpsilonComparable<PositionControllerStatus>
{
   /**
            * time since system start (microseconds)
            */
   public long timestamp_;
   /**
            * Roll setpoint [rad]
            */
   public float nav_roll_;
   /**
            * Pitch setpoint [rad]
            */
   public float nav_pitch_;
   /**
            * Bearing angle[rad]
            */
   public float nav_bearing_;
   /**
            * Bearing angle from aircraft to current target [rad]
            */
   public float target_bearing_;
   /**
            * Signed track error [m]
            */
   public float xtrack_error_;
   /**
            * Distance to active (next) waypoint [m]
            */
   public float wp_dist_;
   /**
            * Current horizontal acceptance radius [m]
            */
   public float acceptance_radius_;
   /**
            * Yaw acceptance error[rad]
            */
   public float yaw_acceptance_;
   /**
            * Current vertical acceptance error [m]
            */
   public float altitude_acceptance_;
   /**
            * Current (applied) position setpoint type (see PositionSetpoint.msg)
            */
   public byte type_;

   public PositionControllerStatus()
   {
   }

   public PositionControllerStatus(PositionControllerStatus other)
   {
      this();
      set(other);
   }

   public void set(PositionControllerStatus other)
   {
      timestamp_ = other.timestamp_;

      nav_roll_ = other.nav_roll_;

      nav_pitch_ = other.nav_pitch_;

      nav_bearing_ = other.nav_bearing_;

      target_bearing_ = other.target_bearing_;

      xtrack_error_ = other.xtrack_error_;

      wp_dist_ = other.wp_dist_;

      acceptance_radius_ = other.acceptance_radius_;

      yaw_acceptance_ = other.yaw_acceptance_;

      altitude_acceptance_ = other.altitude_acceptance_;

      type_ = other.type_;

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
            * Roll setpoint [rad]
            */
   public void setNavRoll(float nav_roll)
   {
      nav_roll_ = nav_roll;
   }
   /**
            * Roll setpoint [rad]
            */
   public float getNavRoll()
   {
      return nav_roll_;
   }

   /**
            * Pitch setpoint [rad]
            */
   public void setNavPitch(float nav_pitch)
   {
      nav_pitch_ = nav_pitch;
   }
   /**
            * Pitch setpoint [rad]
            */
   public float getNavPitch()
   {
      return nav_pitch_;
   }

   /**
            * Bearing angle[rad]
            */
   public void setNavBearing(float nav_bearing)
   {
      nav_bearing_ = nav_bearing;
   }
   /**
            * Bearing angle[rad]
            */
   public float getNavBearing()
   {
      return nav_bearing_;
   }

   /**
            * Bearing angle from aircraft to current target [rad]
            */
   public void setTargetBearing(float target_bearing)
   {
      target_bearing_ = target_bearing;
   }
   /**
            * Bearing angle from aircraft to current target [rad]
            */
   public float getTargetBearing()
   {
      return target_bearing_;
   }

   /**
            * Signed track error [m]
            */
   public void setXtrackError(float xtrack_error)
   {
      xtrack_error_ = xtrack_error;
   }
   /**
            * Signed track error [m]
            */
   public float getXtrackError()
   {
      return xtrack_error_;
   }

   /**
            * Distance to active (next) waypoint [m]
            */
   public void setWpDist(float wp_dist)
   {
      wp_dist_ = wp_dist;
   }
   /**
            * Distance to active (next) waypoint [m]
            */
   public float getWpDist()
   {
      return wp_dist_;
   }

   /**
            * Current horizontal acceptance radius [m]
            */
   public void setAcceptanceRadius(float acceptance_radius)
   {
      acceptance_radius_ = acceptance_radius;
   }
   /**
            * Current horizontal acceptance radius [m]
            */
   public float getAcceptanceRadius()
   {
      return acceptance_radius_;
   }

   /**
            * Yaw acceptance error[rad]
            */
   public void setYawAcceptance(float yaw_acceptance)
   {
      yaw_acceptance_ = yaw_acceptance;
   }
   /**
            * Yaw acceptance error[rad]
            */
   public float getYawAcceptance()
   {
      return yaw_acceptance_;
   }

   /**
            * Current vertical acceptance error [m]
            */
   public void setAltitudeAcceptance(float altitude_acceptance)
   {
      altitude_acceptance_ = altitude_acceptance;
   }
   /**
            * Current vertical acceptance error [m]
            */
   public float getAltitudeAcceptance()
   {
      return altitude_acceptance_;
   }

   /**
            * Current (applied) position setpoint type (see PositionSetpoint.msg)
            */
   public void setType(byte type)
   {
      type_ = type;
   }
   /**
            * Current (applied) position setpoint type (see PositionSetpoint.msg)
            */
   public byte getType()
   {
      return type_;
   }


   public static Supplier<PositionControllerStatusPubSubType> getPubSubType()
   {
      return PositionControllerStatusPubSubType::new;
   }

   @Override
   public Supplier<TopicDataType> getPubSubTypePacket()
   {
      return PositionControllerStatusPubSubType::new;
   }

   @Override
   public boolean epsilonEquals(PositionControllerStatus other, double epsilon)
   {
      if(other == null) return false;
      if(other == this) return true;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_, other.timestamp_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.nav_roll_, other.nav_roll_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.nav_pitch_, other.nav_pitch_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.nav_bearing_, other.nav_bearing_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.target_bearing_, other.target_bearing_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.xtrack_error_, other.xtrack_error_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.wp_dist_, other.wp_dist_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.acceptance_radius_, other.acceptance_radius_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.yaw_acceptance_, other.yaw_acceptance_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.altitude_acceptance_, other.altitude_acceptance_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.type_, other.type_, epsilon)) return false;


      return true;
   }

   @Override
   public boolean equals(Object other)
   {
      if(other == null) return false;
      if(other == this) return true;
      if(!(other instanceof PositionControllerStatus)) return false;

      PositionControllerStatus otherMyClass = (PositionControllerStatus) other;

      if(this.timestamp_ != otherMyClass.timestamp_) return false;

      if(this.nav_roll_ != otherMyClass.nav_roll_) return false;

      if(this.nav_pitch_ != otherMyClass.nav_pitch_) return false;

      if(this.nav_bearing_ != otherMyClass.nav_bearing_) return false;

      if(this.target_bearing_ != otherMyClass.target_bearing_) return false;

      if(this.xtrack_error_ != otherMyClass.xtrack_error_) return false;

      if(this.wp_dist_ != otherMyClass.wp_dist_) return false;

      if(this.acceptance_radius_ != otherMyClass.acceptance_radius_) return false;

      if(this.yaw_acceptance_ != otherMyClass.yaw_acceptance_) return false;

      if(this.altitude_acceptance_ != otherMyClass.altitude_acceptance_) return false;

      if(this.type_ != otherMyClass.type_) return false;


      return true;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("PositionControllerStatus {");
      builder.append("timestamp=");
      builder.append(this.timestamp_);      builder.append(", ");
      builder.append("nav_roll=");
      builder.append(this.nav_roll_);      builder.append(", ");
      builder.append("nav_pitch=");
      builder.append(this.nav_pitch_);      builder.append(", ");
      builder.append("nav_bearing=");
      builder.append(this.nav_bearing_);      builder.append(", ");
      builder.append("target_bearing=");
      builder.append(this.target_bearing_);      builder.append(", ");
      builder.append("xtrack_error=");
      builder.append(this.xtrack_error_);      builder.append(", ");
      builder.append("wp_dist=");
      builder.append(this.wp_dist_);      builder.append(", ");
      builder.append("acceptance_radius=");
      builder.append(this.acceptance_radius_);      builder.append(", ");
      builder.append("yaw_acceptance=");
      builder.append(this.yaw_acceptance_);      builder.append(", ");
      builder.append("altitude_acceptance=");
      builder.append(this.altitude_acceptance_);      builder.append(", ");
      builder.append("type=");
      builder.append(this.type_);
      builder.append("}");
      return builder.toString();
   }
}
