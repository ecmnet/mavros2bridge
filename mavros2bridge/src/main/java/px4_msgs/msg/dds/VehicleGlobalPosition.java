package px4_msgs.msg.dds;

import us.ihmc.communication.packets.Packet;
import us.ihmc.euclid.interfaces.Settable;
import us.ihmc.euclid.interfaces.EpsilonComparable;
import java.util.function.Supplier;
import us.ihmc.pubsub.TopicDataType;

/**
       * Fused global position in WGS84.
       * This struct contains global position estimation. It is not the raw GPS
       * measurement (@see vehicle_gps_position). This topic is usually published by the position
       * estimator, which will take more sources of information into account than just GPS,
       * e.g. control inputs of the vehicle in a Kalman-filter implementation.
       * 
       */
public class VehicleGlobalPosition extends Packet<VehicleGlobalPosition> implements Settable<VehicleGlobalPosition>, EpsilonComparable<VehicleGlobalPosition>
{
   /**
            * time since system start (microseconds)
            */
   public long timestamp_;
   /**
            * the timestamp of the raw data (microseconds)
            */
   public long timestamp_sample_;
   /**
            * Latitude, (degrees)
            */
   public double lat_;
   /**
            * Longitude, (degrees)
            */
   public double lon_;
   /**
            * Altitude AMSL, (meters)
            */
   public float alt_;
   /**
            * Altitude above ellipsoid, (meters)
            */
   public float alt_ellipsoid_;
   public boolean lat_lon_valid_;
   public boolean alt_valid_;
   /**
            * Reset delta for altitude
            */
   public float delta_alt_;
   /**
            * Reset delta for terrain
            */
   public float delta_terrain_;
   /**
            * Counter for reset events on horizontal position coordinates
            */
   public byte lat_lon_reset_counter_;
   /**
            * Counter for reset events on altitude
            */
   public byte alt_reset_counter_;
   /**
            * Counter for reset events on terrain
            */
   public byte terrain_reset_counter_;
   /**
            * Standard deviation of horizontal position error, (metres)
            */
   public float eph_;
   /**
            * Standard deviation of vertical position error, (metres)
            */
   public float epv_;
   /**
            * Terrain altitude WGS84, (metres)
            */
   public float terrain_alt_;
   /**
            * Terrain altitude estimate is valid
            */
   public boolean terrain_alt_valid_;
   /**
            * True if this position is estimated through dead-reckoning
            */
   public boolean dead_reckoning_;

   public VehicleGlobalPosition()
   {
   }

   public VehicleGlobalPosition(VehicleGlobalPosition other)
   {
      this();
      set(other);
   }

   public void set(VehicleGlobalPosition other)
   {
      timestamp_ = other.timestamp_;

      timestamp_sample_ = other.timestamp_sample_;

      lat_ = other.lat_;

      lon_ = other.lon_;

      alt_ = other.alt_;

      alt_ellipsoid_ = other.alt_ellipsoid_;

      lat_lon_valid_ = other.lat_lon_valid_;

      alt_valid_ = other.alt_valid_;

      delta_alt_ = other.delta_alt_;

      delta_terrain_ = other.delta_terrain_;

      lat_lon_reset_counter_ = other.lat_lon_reset_counter_;

      alt_reset_counter_ = other.alt_reset_counter_;

      terrain_reset_counter_ = other.terrain_reset_counter_;

      eph_ = other.eph_;

      epv_ = other.epv_;

      terrain_alt_ = other.terrain_alt_;

      terrain_alt_valid_ = other.terrain_alt_valid_;

      dead_reckoning_ = other.dead_reckoning_;

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
            * the timestamp of the raw data (microseconds)
            */
   public void setTimestampSample(long timestamp_sample)
   {
      timestamp_sample_ = timestamp_sample;
   }
   /**
            * the timestamp of the raw data (microseconds)
            */
   public long getTimestampSample()
   {
      return timestamp_sample_;
   }

   /**
            * Latitude, (degrees)
            */
   public void setLat(double lat)
   {
      lat_ = lat;
   }
   /**
            * Latitude, (degrees)
            */
   public double getLat()
   {
      return lat_;
   }

   /**
            * Longitude, (degrees)
            */
   public void setLon(double lon)
   {
      lon_ = lon;
   }
   /**
            * Longitude, (degrees)
            */
   public double getLon()
   {
      return lon_;
   }

   /**
            * Altitude AMSL, (meters)
            */
   public void setAlt(float alt)
   {
      alt_ = alt;
   }
   /**
            * Altitude AMSL, (meters)
            */
   public float getAlt()
   {
      return alt_;
   }

   /**
            * Altitude above ellipsoid, (meters)
            */
   public void setAltEllipsoid(float alt_ellipsoid)
   {
      alt_ellipsoid_ = alt_ellipsoid;
   }
   /**
            * Altitude above ellipsoid, (meters)
            */
   public float getAltEllipsoid()
   {
      return alt_ellipsoid_;
   }

   public void setLatLonValid(boolean lat_lon_valid)
   {
      lat_lon_valid_ = lat_lon_valid;
   }
   public boolean getLatLonValid()
   {
      return lat_lon_valid_;
   }

   public void setAltValid(boolean alt_valid)
   {
      alt_valid_ = alt_valid;
   }
   public boolean getAltValid()
   {
      return alt_valid_;
   }

   /**
            * Reset delta for altitude
            */
   public void setDeltaAlt(float delta_alt)
   {
      delta_alt_ = delta_alt;
   }
   /**
            * Reset delta for altitude
            */
   public float getDeltaAlt()
   {
      return delta_alt_;
   }

   /**
            * Reset delta for terrain
            */
   public void setDeltaTerrain(float delta_terrain)
   {
      delta_terrain_ = delta_terrain;
   }
   /**
            * Reset delta for terrain
            */
   public float getDeltaTerrain()
   {
      return delta_terrain_;
   }

   /**
            * Counter for reset events on horizontal position coordinates
            */
   public void setLatLonResetCounter(byte lat_lon_reset_counter)
   {
      lat_lon_reset_counter_ = lat_lon_reset_counter;
   }
   /**
            * Counter for reset events on horizontal position coordinates
            */
   public byte getLatLonResetCounter()
   {
      return lat_lon_reset_counter_;
   }

   /**
            * Counter for reset events on altitude
            */
   public void setAltResetCounter(byte alt_reset_counter)
   {
      alt_reset_counter_ = alt_reset_counter;
   }
   /**
            * Counter for reset events on altitude
            */
   public byte getAltResetCounter()
   {
      return alt_reset_counter_;
   }

   /**
            * Counter for reset events on terrain
            */
   public void setTerrainResetCounter(byte terrain_reset_counter)
   {
      terrain_reset_counter_ = terrain_reset_counter;
   }
   /**
            * Counter for reset events on terrain
            */
   public byte getTerrainResetCounter()
   {
      return terrain_reset_counter_;
   }

   /**
            * Standard deviation of horizontal position error, (metres)
            */
   public void setEph(float eph)
   {
      eph_ = eph;
   }
   /**
            * Standard deviation of horizontal position error, (metres)
            */
   public float getEph()
   {
      return eph_;
   }

   /**
            * Standard deviation of vertical position error, (metres)
            */
   public void setEpv(float epv)
   {
      epv_ = epv;
   }
   /**
            * Standard deviation of vertical position error, (metres)
            */
   public float getEpv()
   {
      return epv_;
   }

   /**
            * Terrain altitude WGS84, (metres)
            */
   public void setTerrainAlt(float terrain_alt)
   {
      terrain_alt_ = terrain_alt;
   }
   /**
            * Terrain altitude WGS84, (metres)
            */
   public float getTerrainAlt()
   {
      return terrain_alt_;
   }

   /**
            * Terrain altitude estimate is valid
            */
   public void setTerrainAltValid(boolean terrain_alt_valid)
   {
      terrain_alt_valid_ = terrain_alt_valid;
   }
   /**
            * Terrain altitude estimate is valid
            */
   public boolean getTerrainAltValid()
   {
      return terrain_alt_valid_;
   }

   /**
            * True if this position is estimated through dead-reckoning
            */
   public void setDeadReckoning(boolean dead_reckoning)
   {
      dead_reckoning_ = dead_reckoning;
   }
   /**
            * True if this position is estimated through dead-reckoning
            */
   public boolean getDeadReckoning()
   {
      return dead_reckoning_;
   }


   public static Supplier<VehicleGlobalPositionPubSubType> getPubSubType()
   {
      return VehicleGlobalPositionPubSubType::new;
   }

   @Override
   public Supplier<TopicDataType> getPubSubTypePacket()
   {
      return VehicleGlobalPositionPubSubType::new;
   }

   @Override
   public boolean epsilonEquals(VehicleGlobalPosition other, double epsilon)
   {
      if(other == null) return false;
      if(other == this) return true;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_, other.timestamp_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_sample_, other.timestamp_sample_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.lat_, other.lat_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.lon_, other.lon_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.alt_, other.alt_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.alt_ellipsoid_, other.alt_ellipsoid_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.lat_lon_valid_, other.lat_lon_valid_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.alt_valid_, other.alt_valid_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.delta_alt_, other.delta_alt_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.delta_terrain_, other.delta_terrain_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.lat_lon_reset_counter_, other.lat_lon_reset_counter_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.alt_reset_counter_, other.alt_reset_counter_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.terrain_reset_counter_, other.terrain_reset_counter_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.eph_, other.eph_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.epv_, other.epv_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.terrain_alt_, other.terrain_alt_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.terrain_alt_valid_, other.terrain_alt_valid_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.dead_reckoning_, other.dead_reckoning_, epsilon)) return false;


      return true;
   }

   @Override
   public boolean equals(Object other)
   {
      if(other == null) return false;
      if(other == this) return true;
      if(!(other instanceof VehicleGlobalPosition)) return false;

      VehicleGlobalPosition otherMyClass = (VehicleGlobalPosition) other;

      if(this.timestamp_ != otherMyClass.timestamp_) return false;

      if(this.timestamp_sample_ != otherMyClass.timestamp_sample_) return false;

      if(this.lat_ != otherMyClass.lat_) return false;

      if(this.lon_ != otherMyClass.lon_) return false;

      if(this.alt_ != otherMyClass.alt_) return false;

      if(this.alt_ellipsoid_ != otherMyClass.alt_ellipsoid_) return false;

      if(this.lat_lon_valid_ != otherMyClass.lat_lon_valid_) return false;

      if(this.alt_valid_ != otherMyClass.alt_valid_) return false;

      if(this.delta_alt_ != otherMyClass.delta_alt_) return false;

      if(this.delta_terrain_ != otherMyClass.delta_terrain_) return false;

      if(this.lat_lon_reset_counter_ != otherMyClass.lat_lon_reset_counter_) return false;

      if(this.alt_reset_counter_ != otherMyClass.alt_reset_counter_) return false;

      if(this.terrain_reset_counter_ != otherMyClass.terrain_reset_counter_) return false;

      if(this.eph_ != otherMyClass.eph_) return false;

      if(this.epv_ != otherMyClass.epv_) return false;

      if(this.terrain_alt_ != otherMyClass.terrain_alt_) return false;

      if(this.terrain_alt_valid_ != otherMyClass.terrain_alt_valid_) return false;

      if(this.dead_reckoning_ != otherMyClass.dead_reckoning_) return false;


      return true;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("VehicleGlobalPosition {");
      builder.append("timestamp=");
      builder.append(this.timestamp_);      builder.append(", ");
      builder.append("timestamp_sample=");
      builder.append(this.timestamp_sample_);      builder.append(", ");
      builder.append("lat=");
      builder.append(this.lat_);      builder.append(", ");
      builder.append("lon=");
      builder.append(this.lon_);      builder.append(", ");
      builder.append("alt=");
      builder.append(this.alt_);      builder.append(", ");
      builder.append("alt_ellipsoid=");
      builder.append(this.alt_ellipsoid_);      builder.append(", ");
      builder.append("lat_lon_valid=");
      builder.append(this.lat_lon_valid_);      builder.append(", ");
      builder.append("alt_valid=");
      builder.append(this.alt_valid_);      builder.append(", ");
      builder.append("delta_alt=");
      builder.append(this.delta_alt_);      builder.append(", ");
      builder.append("delta_terrain=");
      builder.append(this.delta_terrain_);      builder.append(", ");
      builder.append("lat_lon_reset_counter=");
      builder.append(this.lat_lon_reset_counter_);      builder.append(", ");
      builder.append("alt_reset_counter=");
      builder.append(this.alt_reset_counter_);      builder.append(", ");
      builder.append("terrain_reset_counter=");
      builder.append(this.terrain_reset_counter_);      builder.append(", ");
      builder.append("eph=");
      builder.append(this.eph_);      builder.append(", ");
      builder.append("epv=");
      builder.append(this.epv_);      builder.append(", ");
      builder.append("terrain_alt=");
      builder.append(this.terrain_alt_);      builder.append(", ");
      builder.append("terrain_alt_valid=");
      builder.append(this.terrain_alt_valid_);      builder.append(", ");
      builder.append("dead_reckoning=");
      builder.append(this.dead_reckoning_);
      builder.append("}");
      return builder.toString();
   }
}
