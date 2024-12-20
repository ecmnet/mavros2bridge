package px4_msgs.msg.dds;

import us.ihmc.communication.packets.Packet;
import us.ihmc.euclid.interfaces.Settable;
import us.ihmc.euclid.interfaces.EpsilonComparable;
import java.util.function.Supplier;
import us.ihmc.pubsub.TopicDataType;

/**
       * Vehicle Region Of Interest (ROI)
       */
public class VehicleRoi extends Packet<VehicleRoi> implements Settable<VehicleRoi>, EpsilonComparable<VehicleRoi>
{
   /**
          * No region of interest
          */
   public static final byte ROI_NONE = (byte) 0;
   /**
          * Point toward next MISSION with optional offset
          */
   public static final byte ROI_WPNEXT = (byte) 1;
   /**
          * Point toward given MISSION
          */
   public static final byte ROI_WPINDEX = (byte) 2;
   /**
          * Point toward fixed location
          */
   public static final byte ROI_LOCATION = (byte) 3;
   /**
          * Point toward target
          */
   public static final byte ROI_TARGET = (byte) 4;
   public static final byte ROI_ENUM_END = (byte) 5;
   /**
            * time since system start (microseconds)
            */
   public long timestamp_;
   /**
            * ROI mode (see above)
            */
   public byte mode_;
   /**
            * Latitude to point to
            */
   public double lat_;
   /**
            * Longitude to point to
            */
   public double lon_;
   /**
            * Altitude to point to
            */
   public float alt_;
   /**
            * additional angle offsets to next waypoint (only used with ROI_WPNEXT)
            * angle offset in rad
            */
   public float roll_offset_;
   /**
            * angle offset in rad
            */
   public float pitch_offset_;
   /**
            * angle offset in rad
            */
   public float yaw_offset_;

   public VehicleRoi()
   {
   }

   public VehicleRoi(VehicleRoi other)
   {
      this();
      set(other);
   }

   public void set(VehicleRoi other)
   {
      timestamp_ = other.timestamp_;

      mode_ = other.mode_;

      lat_ = other.lat_;

      lon_ = other.lon_;

      alt_ = other.alt_;

      roll_offset_ = other.roll_offset_;

      pitch_offset_ = other.pitch_offset_;

      yaw_offset_ = other.yaw_offset_;

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
            * ROI mode (see above)
            */
   public void setMode(byte mode)
   {
      mode_ = mode;
   }
   /**
            * ROI mode (see above)
            */
   public byte getMode()
   {
      return mode_;
   }

   /**
            * Latitude to point to
            */
   public void setLat(double lat)
   {
      lat_ = lat;
   }
   /**
            * Latitude to point to
            */
   public double getLat()
   {
      return lat_;
   }

   /**
            * Longitude to point to
            */
   public void setLon(double lon)
   {
      lon_ = lon;
   }
   /**
            * Longitude to point to
            */
   public double getLon()
   {
      return lon_;
   }

   /**
            * Altitude to point to
            */
   public void setAlt(float alt)
   {
      alt_ = alt;
   }
   /**
            * Altitude to point to
            */
   public float getAlt()
   {
      return alt_;
   }

   /**
            * additional angle offsets to next waypoint (only used with ROI_WPNEXT)
            * angle offset in rad
            */
   public void setRollOffset(float roll_offset)
   {
      roll_offset_ = roll_offset;
   }
   /**
            * additional angle offsets to next waypoint (only used with ROI_WPNEXT)
            * angle offset in rad
            */
   public float getRollOffset()
   {
      return roll_offset_;
   }

   /**
            * angle offset in rad
            */
   public void setPitchOffset(float pitch_offset)
   {
      pitch_offset_ = pitch_offset;
   }
   /**
            * angle offset in rad
            */
   public float getPitchOffset()
   {
      return pitch_offset_;
   }

   /**
            * angle offset in rad
            */
   public void setYawOffset(float yaw_offset)
   {
      yaw_offset_ = yaw_offset;
   }
   /**
            * angle offset in rad
            */
   public float getYawOffset()
   {
      return yaw_offset_;
   }


   public static Supplier<VehicleRoiPubSubType> getPubSubType()
   {
      return VehicleRoiPubSubType::new;
   }

   @Override
   public Supplier<TopicDataType> getPubSubTypePacket()
   {
      return VehicleRoiPubSubType::new;
   }

   @Override
   public boolean epsilonEquals(VehicleRoi other, double epsilon)
   {
      if(other == null) return false;
      if(other == this) return true;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_, other.timestamp_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.mode_, other.mode_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.lat_, other.lat_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.lon_, other.lon_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.alt_, other.alt_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.roll_offset_, other.roll_offset_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.pitch_offset_, other.pitch_offset_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.yaw_offset_, other.yaw_offset_, epsilon)) return false;


      return true;
   }

   @Override
   public boolean equals(Object other)
   {
      if(other == null) return false;
      if(other == this) return true;
      if(!(other instanceof VehicleRoi)) return false;

      VehicleRoi otherMyClass = (VehicleRoi) other;

      if(this.timestamp_ != otherMyClass.timestamp_) return false;

      if(this.mode_ != otherMyClass.mode_) return false;

      if(this.lat_ != otherMyClass.lat_) return false;

      if(this.lon_ != otherMyClass.lon_) return false;

      if(this.alt_ != otherMyClass.alt_) return false;

      if(this.roll_offset_ != otherMyClass.roll_offset_) return false;

      if(this.pitch_offset_ != otherMyClass.pitch_offset_) return false;

      if(this.yaw_offset_ != otherMyClass.yaw_offset_) return false;


      return true;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("VehicleRoi {");
      builder.append("timestamp=");
      builder.append(this.timestamp_);      builder.append(", ");
      builder.append("mode=");
      builder.append(this.mode_);      builder.append(", ");
      builder.append("lat=");
      builder.append(this.lat_);      builder.append(", ");
      builder.append("lon=");
      builder.append(this.lon_);      builder.append(", ");
      builder.append("alt=");
      builder.append(this.alt_);      builder.append(", ");
      builder.append("roll_offset=");
      builder.append(this.roll_offset_);      builder.append(", ");
      builder.append("pitch_offset=");
      builder.append(this.pitch_offset_);      builder.append(", ");
      builder.append("yaw_offset=");
      builder.append(this.yaw_offset_);
      builder.append("}");
      return builder.toString();
   }
}
