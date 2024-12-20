package px4_msgs.msg.dds;

import us.ihmc.communication.packets.Packet;
import us.ihmc.euclid.interfaces.Settable;
import us.ihmc.euclid.interfaces.EpsilonComparable;
import java.util.function.Supplier;
import us.ihmc.pubsub.TopicDataType;

/**
       * GPS home position in WGS84 coordinates.
       */
public class HomePosition extends Packet<HomePosition> implements Settable<HomePosition>, EpsilonComparable<HomePosition>
{
   /**
            * time since system start (microseconds)
            */
   public long timestamp_;
   /**
            * Latitude in degrees
            */
   public double lat_;
   /**
            * Longitude in degrees
            */
   public double lon_;
   /**
            * Altitude in meters (AMSL)
            */
   public float alt_;
   /**
            * X coordinate in meters
            */
   public float x_;
   /**
            * Y coordinate in meters
            */
   public float y_;
   /**
            * Z coordinate in meters
            */
   public float z_;
   /**
            * Yaw angle in radians
            */
   public float yaw_;
   /**
            * true when the altitude has been set
            */
   public boolean valid_alt_;
   /**
            * true when the latitude and longitude have been set
            */
   public boolean valid_hpos_;
   /**
            * true when the local position (xyz) has been set
            */
   public boolean valid_lpos_;
   /**
            * true when home position was set manually
            */
   public boolean manual_home_;
   /**
            * update counter of the home position
            */
   public long update_count_;

   public HomePosition()
   {
   }

   public HomePosition(HomePosition other)
   {
      this();
      set(other);
   }

   public void set(HomePosition other)
   {
      timestamp_ = other.timestamp_;

      lat_ = other.lat_;

      lon_ = other.lon_;

      alt_ = other.alt_;

      x_ = other.x_;

      y_ = other.y_;

      z_ = other.z_;

      yaw_ = other.yaw_;

      valid_alt_ = other.valid_alt_;

      valid_hpos_ = other.valid_hpos_;

      valid_lpos_ = other.valid_lpos_;

      manual_home_ = other.manual_home_;

      update_count_ = other.update_count_;

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
            * Latitude in degrees
            */
   public void setLat(double lat)
   {
      lat_ = lat;
   }
   /**
            * Latitude in degrees
            */
   public double getLat()
   {
      return lat_;
   }

   /**
            * Longitude in degrees
            */
   public void setLon(double lon)
   {
      lon_ = lon;
   }
   /**
            * Longitude in degrees
            */
   public double getLon()
   {
      return lon_;
   }

   /**
            * Altitude in meters (AMSL)
            */
   public void setAlt(float alt)
   {
      alt_ = alt;
   }
   /**
            * Altitude in meters (AMSL)
            */
   public float getAlt()
   {
      return alt_;
   }

   /**
            * X coordinate in meters
            */
   public void setX(float x)
   {
      x_ = x;
   }
   /**
            * X coordinate in meters
            */
   public float getX()
   {
      return x_;
   }

   /**
            * Y coordinate in meters
            */
   public void setY(float y)
   {
      y_ = y;
   }
   /**
            * Y coordinate in meters
            */
   public float getY()
   {
      return y_;
   }

   /**
            * Z coordinate in meters
            */
   public void setZ(float z)
   {
      z_ = z;
   }
   /**
            * Z coordinate in meters
            */
   public float getZ()
   {
      return z_;
   }

   /**
            * Yaw angle in radians
            */
   public void setYaw(float yaw)
   {
      yaw_ = yaw;
   }
   /**
            * Yaw angle in radians
            */
   public float getYaw()
   {
      return yaw_;
   }

   /**
            * true when the altitude has been set
            */
   public void setValidAlt(boolean valid_alt)
   {
      valid_alt_ = valid_alt;
   }
   /**
            * true when the altitude has been set
            */
   public boolean getValidAlt()
   {
      return valid_alt_;
   }

   /**
            * true when the latitude and longitude have been set
            */
   public void setValidHpos(boolean valid_hpos)
   {
      valid_hpos_ = valid_hpos;
   }
   /**
            * true when the latitude and longitude have been set
            */
   public boolean getValidHpos()
   {
      return valid_hpos_;
   }

   /**
            * true when the local position (xyz) has been set
            */
   public void setValidLpos(boolean valid_lpos)
   {
      valid_lpos_ = valid_lpos;
   }
   /**
            * true when the local position (xyz) has been set
            */
   public boolean getValidLpos()
   {
      return valid_lpos_;
   }

   /**
            * true when home position was set manually
            */
   public void setManualHome(boolean manual_home)
   {
      manual_home_ = manual_home;
   }
   /**
            * true when home position was set manually
            */
   public boolean getManualHome()
   {
      return manual_home_;
   }

   /**
            * update counter of the home position
            */
   public void setUpdateCount(long update_count)
   {
      update_count_ = update_count;
   }
   /**
            * update counter of the home position
            */
   public long getUpdateCount()
   {
      return update_count_;
   }


   public static Supplier<HomePositionPubSubType> getPubSubType()
   {
      return HomePositionPubSubType::new;
   }

   @Override
   public Supplier<TopicDataType> getPubSubTypePacket()
   {
      return HomePositionPubSubType::new;
   }

   @Override
   public boolean epsilonEquals(HomePosition other, double epsilon)
   {
      if(other == null) return false;
      if(other == this) return true;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_, other.timestamp_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.lat_, other.lat_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.lon_, other.lon_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.alt_, other.alt_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.x_, other.x_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.y_, other.y_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.z_, other.z_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.yaw_, other.yaw_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.valid_alt_, other.valid_alt_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.valid_hpos_, other.valid_hpos_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.valid_lpos_, other.valid_lpos_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.manual_home_, other.manual_home_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.update_count_, other.update_count_, epsilon)) return false;


      return true;
   }

   @Override
   public boolean equals(Object other)
   {
      if(other == null) return false;
      if(other == this) return true;
      if(!(other instanceof HomePosition)) return false;

      HomePosition otherMyClass = (HomePosition) other;

      if(this.timestamp_ != otherMyClass.timestamp_) return false;

      if(this.lat_ != otherMyClass.lat_) return false;

      if(this.lon_ != otherMyClass.lon_) return false;

      if(this.alt_ != otherMyClass.alt_) return false;

      if(this.x_ != otherMyClass.x_) return false;

      if(this.y_ != otherMyClass.y_) return false;

      if(this.z_ != otherMyClass.z_) return false;

      if(this.yaw_ != otherMyClass.yaw_) return false;

      if(this.valid_alt_ != otherMyClass.valid_alt_) return false;

      if(this.valid_hpos_ != otherMyClass.valid_hpos_) return false;

      if(this.valid_lpos_ != otherMyClass.valid_lpos_) return false;

      if(this.manual_home_ != otherMyClass.manual_home_) return false;

      if(this.update_count_ != otherMyClass.update_count_) return false;


      return true;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("HomePosition {");
      builder.append("timestamp=");
      builder.append(this.timestamp_);      builder.append(", ");
      builder.append("lat=");
      builder.append(this.lat_);      builder.append(", ");
      builder.append("lon=");
      builder.append(this.lon_);      builder.append(", ");
      builder.append("alt=");
      builder.append(this.alt_);      builder.append(", ");
      builder.append("x=");
      builder.append(this.x_);      builder.append(", ");
      builder.append("y=");
      builder.append(this.y_);      builder.append(", ");
      builder.append("z=");
      builder.append(this.z_);      builder.append(", ");
      builder.append("yaw=");
      builder.append(this.yaw_);      builder.append(", ");
      builder.append("valid_alt=");
      builder.append(this.valid_alt_);      builder.append(", ");
      builder.append("valid_hpos=");
      builder.append(this.valid_hpos_);      builder.append(", ");
      builder.append("valid_lpos=");
      builder.append(this.valid_lpos_);      builder.append(", ");
      builder.append("manual_home=");
      builder.append(this.manual_home_);      builder.append(", ");
      builder.append("update_count=");
      builder.append(this.update_count_);
      builder.append("}");
      return builder.toString();
   }
}
