package px4_msgs.msg.dds;

import us.ihmc.communication.packets.Packet;
import us.ihmc.euclid.interfaces.Settable;
import us.ihmc.euclid.interfaces.EpsilonComparable;
import java.util.function.Supplier;
import us.ihmc.pubsub.TopicDataType;

/**
       * this file is only used in the position_setpoint triple as a dependency
       */
public class PositionSetpoint extends Packet<PositionSetpoint> implements Settable<PositionSetpoint>, EpsilonComparable<PositionSetpoint>
{
   /**
          * position setpoint
          */
   public static final byte SETPOINT_TYPE_POSITION = (byte) 0;
   /**
          * velocity setpoint
          */
   public static final byte SETPOINT_TYPE_VELOCITY = (byte) 1;
   /**
          * loiter setpoint
          */
   public static final byte SETPOINT_TYPE_LOITER = (byte) 2;
   /**
          * takeoff setpoint
          */
   public static final byte SETPOINT_TYPE_TAKEOFF = (byte) 3;
   /**
          * land setpoint, altitude must be ignored, descend until landing
          */
   public static final byte SETPOINT_TYPE_LAND = (byte) 4;
   /**
          * do nothing, switch off motors or keep at idle speed (MC)
          */
   public static final byte SETPOINT_TYPE_IDLE = (byte) 5;
   /**
          * Circular pattern
          */
   public static final byte LOITER_TYPE_ORBIT = (byte) 0;
   /**
          * Pattern resembling an 8
          */
   public static final byte LOITER_TYPE_FIGUREEIGHT = (byte) 1;
   /**
            * time since system start (microseconds)
            */
   public long timestamp_;
   /**
            * true if setpoint is valid
            */
   public boolean valid_;
   /**
            * setpoint type to adjust behavior of position controller
            */
   public byte type_;
   /**
            * local velocity setpoint in m/s in NED
            */
   public float vx_;
   /**
            * local velocity setpoint in m/s in NED
            */
   public float vy_;
   /**
            * local velocity setpoint in m/s in NED
            */
   public float vz_;
   /**
            * latitude, in deg
            */
   public double lat_;
   /**
            * longitude, in deg
            */
   public double lon_;
   /**
            * altitude AMSL, in m
            */
   public float alt_;
   /**
            * yaw (only in hover), in rad [-PI..PI), NaN = leave to flight task
            */
   public float yaw_;
   /**
            * loiter major axis radius in m
            */
   public float loiter_radius_;
   /**
            * loiter minor axis radius (used for non-circular loiter shapes) in m
            */
   public float loiter_minor_radius_;
   /**
            * loiter direction is clockwise by default and can be changed using this field
            */
   public boolean loiter_direction_counter_clockwise_;
   /**
            * Orientation of the major axis with respect to true north in rad [-pi,pi)
            */
   public float loiter_orientation_;
   /**
            * loitern pattern to follow
            */
   public byte loiter_pattern_;
   /**
            * horizontal acceptance_radius (meters)
            */
   public float acceptance_radius_;
   /**
            * vertical acceptance radius, only used for fixed wing guidance, NAN = let guidance choose (meters)
            */
   public float alt_acceptance_radius_;
   /**
            * the generally desired cruising speed (not a hard constraint)
            */
   public float cruising_speed_;
   /**
            * commands the vehicle to glide if the capability is available (fixed wing only)
            */
   public boolean gliding_enabled_;
   /**
            * the generally desired cruising throttle (not a hard constraint), only has an effect for rover
            */
   public float cruising_throttle_;

   public PositionSetpoint()
   {
   }

   public PositionSetpoint(PositionSetpoint other)
   {
      this();
      set(other);
   }

   public void set(PositionSetpoint other)
   {
      timestamp_ = other.timestamp_;

      valid_ = other.valid_;

      type_ = other.type_;

      vx_ = other.vx_;

      vy_ = other.vy_;

      vz_ = other.vz_;

      lat_ = other.lat_;

      lon_ = other.lon_;

      alt_ = other.alt_;

      yaw_ = other.yaw_;

      loiter_radius_ = other.loiter_radius_;

      loiter_minor_radius_ = other.loiter_minor_radius_;

      loiter_direction_counter_clockwise_ = other.loiter_direction_counter_clockwise_;

      loiter_orientation_ = other.loiter_orientation_;

      loiter_pattern_ = other.loiter_pattern_;

      acceptance_radius_ = other.acceptance_radius_;

      alt_acceptance_radius_ = other.alt_acceptance_radius_;

      cruising_speed_ = other.cruising_speed_;

      gliding_enabled_ = other.gliding_enabled_;

      cruising_throttle_ = other.cruising_throttle_;

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
            * true if setpoint is valid
            */
   public void setValid(boolean valid)
   {
      valid_ = valid;
   }
   /**
            * true if setpoint is valid
            */
   public boolean getValid()
   {
      return valid_;
   }

   /**
            * setpoint type to adjust behavior of position controller
            */
   public void setType(byte type)
   {
      type_ = type;
   }
   /**
            * setpoint type to adjust behavior of position controller
            */
   public byte getType()
   {
      return type_;
   }

   /**
            * local velocity setpoint in m/s in NED
            */
   public void setVx(float vx)
   {
      vx_ = vx;
   }
   /**
            * local velocity setpoint in m/s in NED
            */
   public float getVx()
   {
      return vx_;
   }

   /**
            * local velocity setpoint in m/s in NED
            */
   public void setVy(float vy)
   {
      vy_ = vy;
   }
   /**
            * local velocity setpoint in m/s in NED
            */
   public float getVy()
   {
      return vy_;
   }

   /**
            * local velocity setpoint in m/s in NED
            */
   public void setVz(float vz)
   {
      vz_ = vz;
   }
   /**
            * local velocity setpoint in m/s in NED
            */
   public float getVz()
   {
      return vz_;
   }

   /**
            * latitude, in deg
            */
   public void setLat(double lat)
   {
      lat_ = lat;
   }
   /**
            * latitude, in deg
            */
   public double getLat()
   {
      return lat_;
   }

   /**
            * longitude, in deg
            */
   public void setLon(double lon)
   {
      lon_ = lon;
   }
   /**
            * longitude, in deg
            */
   public double getLon()
   {
      return lon_;
   }

   /**
            * altitude AMSL, in m
            */
   public void setAlt(float alt)
   {
      alt_ = alt;
   }
   /**
            * altitude AMSL, in m
            */
   public float getAlt()
   {
      return alt_;
   }

   /**
            * yaw (only in hover), in rad [-PI..PI), NaN = leave to flight task
            */
   public void setYaw(float yaw)
   {
      yaw_ = yaw;
   }
   /**
            * yaw (only in hover), in rad [-PI..PI), NaN = leave to flight task
            */
   public float getYaw()
   {
      return yaw_;
   }

   /**
            * loiter major axis radius in m
            */
   public void setLoiterRadius(float loiter_radius)
   {
      loiter_radius_ = loiter_radius;
   }
   /**
            * loiter major axis radius in m
            */
   public float getLoiterRadius()
   {
      return loiter_radius_;
   }

   /**
            * loiter minor axis radius (used for non-circular loiter shapes) in m
            */
   public void setLoiterMinorRadius(float loiter_minor_radius)
   {
      loiter_minor_radius_ = loiter_minor_radius;
   }
   /**
            * loiter minor axis radius (used for non-circular loiter shapes) in m
            */
   public float getLoiterMinorRadius()
   {
      return loiter_minor_radius_;
   }

   /**
            * loiter direction is clockwise by default and can be changed using this field
            */
   public void setLoiterDirectionCounterClockwise(boolean loiter_direction_counter_clockwise)
   {
      loiter_direction_counter_clockwise_ = loiter_direction_counter_clockwise;
   }
   /**
            * loiter direction is clockwise by default and can be changed using this field
            */
   public boolean getLoiterDirectionCounterClockwise()
   {
      return loiter_direction_counter_clockwise_;
   }

   /**
            * Orientation of the major axis with respect to true north in rad [-pi,pi)
            */
   public void setLoiterOrientation(float loiter_orientation)
   {
      loiter_orientation_ = loiter_orientation;
   }
   /**
            * Orientation of the major axis with respect to true north in rad [-pi,pi)
            */
   public float getLoiterOrientation()
   {
      return loiter_orientation_;
   }

   /**
            * loitern pattern to follow
            */
   public void setLoiterPattern(byte loiter_pattern)
   {
      loiter_pattern_ = loiter_pattern;
   }
   /**
            * loitern pattern to follow
            */
   public byte getLoiterPattern()
   {
      return loiter_pattern_;
   }

   /**
            * horizontal acceptance_radius (meters)
            */
   public void setAcceptanceRadius(float acceptance_radius)
   {
      acceptance_radius_ = acceptance_radius;
   }
   /**
            * horizontal acceptance_radius (meters)
            */
   public float getAcceptanceRadius()
   {
      return acceptance_radius_;
   }

   /**
            * vertical acceptance radius, only used for fixed wing guidance, NAN = let guidance choose (meters)
            */
   public void setAltAcceptanceRadius(float alt_acceptance_radius)
   {
      alt_acceptance_radius_ = alt_acceptance_radius;
   }
   /**
            * vertical acceptance radius, only used for fixed wing guidance, NAN = let guidance choose (meters)
            */
   public float getAltAcceptanceRadius()
   {
      return alt_acceptance_radius_;
   }

   /**
            * the generally desired cruising speed (not a hard constraint)
            */
   public void setCruisingSpeed(float cruising_speed)
   {
      cruising_speed_ = cruising_speed;
   }
   /**
            * the generally desired cruising speed (not a hard constraint)
            */
   public float getCruisingSpeed()
   {
      return cruising_speed_;
   }

   /**
            * commands the vehicle to glide if the capability is available (fixed wing only)
            */
   public void setGlidingEnabled(boolean gliding_enabled)
   {
      gliding_enabled_ = gliding_enabled;
   }
   /**
            * commands the vehicle to glide if the capability is available (fixed wing only)
            */
   public boolean getGlidingEnabled()
   {
      return gliding_enabled_;
   }

   /**
            * the generally desired cruising throttle (not a hard constraint), only has an effect for rover
            */
   public void setCruisingThrottle(float cruising_throttle)
   {
      cruising_throttle_ = cruising_throttle;
   }
   /**
            * the generally desired cruising throttle (not a hard constraint), only has an effect for rover
            */
   public float getCruisingThrottle()
   {
      return cruising_throttle_;
   }


   public static Supplier<PositionSetpointPubSubType> getPubSubType()
   {
      return PositionSetpointPubSubType::new;
   }

   @Override
   public Supplier<TopicDataType> getPubSubTypePacket()
   {
      return PositionSetpointPubSubType::new;
   }

   @Override
   public boolean epsilonEquals(PositionSetpoint other, double epsilon)
   {
      if(other == null) return false;
      if(other == this) return true;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_, other.timestamp_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.valid_, other.valid_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.type_, other.type_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.vx_, other.vx_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.vy_, other.vy_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.vz_, other.vz_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.lat_, other.lat_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.lon_, other.lon_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.alt_, other.alt_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.yaw_, other.yaw_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.loiter_radius_, other.loiter_radius_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.loiter_minor_radius_, other.loiter_minor_radius_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.loiter_direction_counter_clockwise_, other.loiter_direction_counter_clockwise_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.loiter_orientation_, other.loiter_orientation_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.loiter_pattern_, other.loiter_pattern_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.acceptance_radius_, other.acceptance_radius_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.alt_acceptance_radius_, other.alt_acceptance_radius_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.cruising_speed_, other.cruising_speed_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.gliding_enabled_, other.gliding_enabled_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.cruising_throttle_, other.cruising_throttle_, epsilon)) return false;


      return true;
   }

   @Override
   public boolean equals(Object other)
   {
      if(other == null) return false;
      if(other == this) return true;
      if(!(other instanceof PositionSetpoint)) return false;

      PositionSetpoint otherMyClass = (PositionSetpoint) other;

      if(this.timestamp_ != otherMyClass.timestamp_) return false;

      if(this.valid_ != otherMyClass.valid_) return false;

      if(this.type_ != otherMyClass.type_) return false;

      if(this.vx_ != otherMyClass.vx_) return false;

      if(this.vy_ != otherMyClass.vy_) return false;

      if(this.vz_ != otherMyClass.vz_) return false;

      if(this.lat_ != otherMyClass.lat_) return false;

      if(this.lon_ != otherMyClass.lon_) return false;

      if(this.alt_ != otherMyClass.alt_) return false;

      if(this.yaw_ != otherMyClass.yaw_) return false;

      if(this.loiter_radius_ != otherMyClass.loiter_radius_) return false;

      if(this.loiter_minor_radius_ != otherMyClass.loiter_minor_radius_) return false;

      if(this.loiter_direction_counter_clockwise_ != otherMyClass.loiter_direction_counter_clockwise_) return false;

      if(this.loiter_orientation_ != otherMyClass.loiter_orientation_) return false;

      if(this.loiter_pattern_ != otherMyClass.loiter_pattern_) return false;

      if(this.acceptance_radius_ != otherMyClass.acceptance_radius_) return false;

      if(this.alt_acceptance_radius_ != otherMyClass.alt_acceptance_radius_) return false;

      if(this.cruising_speed_ != otherMyClass.cruising_speed_) return false;

      if(this.gliding_enabled_ != otherMyClass.gliding_enabled_) return false;

      if(this.cruising_throttle_ != otherMyClass.cruising_throttle_) return false;


      return true;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("PositionSetpoint {");
      builder.append("timestamp=");
      builder.append(this.timestamp_);      builder.append(", ");
      builder.append("valid=");
      builder.append(this.valid_);      builder.append(", ");
      builder.append("type=");
      builder.append(this.type_);      builder.append(", ");
      builder.append("vx=");
      builder.append(this.vx_);      builder.append(", ");
      builder.append("vy=");
      builder.append(this.vy_);      builder.append(", ");
      builder.append("vz=");
      builder.append(this.vz_);      builder.append(", ");
      builder.append("lat=");
      builder.append(this.lat_);      builder.append(", ");
      builder.append("lon=");
      builder.append(this.lon_);      builder.append(", ");
      builder.append("alt=");
      builder.append(this.alt_);      builder.append(", ");
      builder.append("yaw=");
      builder.append(this.yaw_);      builder.append(", ");
      builder.append("loiter_radius=");
      builder.append(this.loiter_radius_);      builder.append(", ");
      builder.append("loiter_minor_radius=");
      builder.append(this.loiter_minor_radius_);      builder.append(", ");
      builder.append("loiter_direction_counter_clockwise=");
      builder.append(this.loiter_direction_counter_clockwise_);      builder.append(", ");
      builder.append("loiter_orientation=");
      builder.append(this.loiter_orientation_);      builder.append(", ");
      builder.append("loiter_pattern=");
      builder.append(this.loiter_pattern_);      builder.append(", ");
      builder.append("acceptance_radius=");
      builder.append(this.acceptance_radius_);      builder.append(", ");
      builder.append("alt_acceptance_radius=");
      builder.append(this.alt_acceptance_radius_);      builder.append(", ");
      builder.append("cruising_speed=");
      builder.append(this.cruising_speed_);      builder.append(", ");
      builder.append("gliding_enabled=");
      builder.append(this.gliding_enabled_);      builder.append(", ");
      builder.append("cruising_throttle=");
      builder.append(this.cruising_throttle_);
      builder.append("}");
      return builder.toString();
   }
}
