package px4_msgs.msg.dds;

import us.ihmc.communication.packets.Packet;
import us.ihmc.euclid.interfaces.Settable;
import us.ihmc.euclid.interfaces.EpsilonComparable;
import java.util.function.Supplier;
import us.ihmc.pubsub.TopicDataType;

public class TransponderReport extends Packet<TransponderReport> implements Settable<TransponderReport>, EpsilonComparable<TransponderReport>
{
   /**
          * ADSB flags
          */
   public static final int PX4_ADSB_FLAGS_VALID_COORDS = 1;
   public static final int PX4_ADSB_FLAGS_VALID_ALTITUDE = 2;
   public static final int PX4_ADSB_FLAGS_VALID_HEADING = 4;
   public static final int PX4_ADSB_FLAGS_VALID_VELOCITY = 8;
   public static final int PX4_ADSB_FLAGS_VALID_CALLSIGN = 16;
   public static final int PX4_ADSB_FLAGS_VALID_SQUAWK = 32;
   public static final int PX4_ADSB_FLAGS_RETRANSLATE = 256;
   /**
          * ADSB Emitter Data:
          * from mavlink/v2.0/common/common.h
          */
   public static final int ADSB_EMITTER_TYPE_NO_INFO = 0;
   public static final int ADSB_EMITTER_TYPE_LIGHT = 1;
   public static final int ADSB_EMITTER_TYPE_SMALL = 2;
   public static final int ADSB_EMITTER_TYPE_LARGE = 3;
   public static final int ADSB_EMITTER_TYPE_HIGH_VORTEX_LARGE = 4;
   public static final int ADSB_EMITTER_TYPE_HEAVY = 5;
   public static final int ADSB_EMITTER_TYPE_HIGHLY_MANUV = 6;
   public static final int ADSB_EMITTER_TYPE_ROTOCRAFT = 7;
   public static final int ADSB_EMITTER_TYPE_UNASSIGNED = 8;
   public static final int ADSB_EMITTER_TYPE_GLIDER = 9;
   public static final int ADSB_EMITTER_TYPE_LIGHTER_AIR = 10;
   public static final int ADSB_EMITTER_TYPE_PARACHUTE = 11;
   public static final int ADSB_EMITTER_TYPE_ULTRA_LIGHT = 12;
   public static final int ADSB_EMITTER_TYPE_UNASSIGNED2 = 13;
   public static final int ADSB_EMITTER_TYPE_UAV = 14;
   public static final int ADSB_EMITTER_TYPE_SPACE = 15;
   public static final int ADSB_EMITTER_TYPE_UNASSGINED3 = 16;
   public static final int ADSB_EMITTER_TYPE_EMERGENCY_SURFACE = 17;
   public static final int ADSB_EMITTER_TYPE_SERVICE_SURFACE = 18;
   public static final int ADSB_EMITTER_TYPE_POINT_OBSTACLE = 19;
   public static final int ADSB_EMITTER_TYPE_ENUM_END = 20;
   public static final byte ORB_QUEUE_LENGTH = (byte) 16;
   /**
            * time since system start (microseconds)
            */
   public long timestamp_;
   /**
            * ICAO address
            */
   public long icao_address_;
   /**
            * Latitude, expressed as degrees
            */
   public double lat_;
   /**
            * Longitude, expressed as degrees
            */
   public double lon_;
   /**
            * Type from ADSB_ALTITUDE_TYPE enum
            */
   public byte altitude_type_;
   /**
            * Altitude(ASL) in meters
            */
   public float altitude_;
   /**
            * Course over ground in radians, -pi to +pi, 0 is north
            */
   public float heading_;
   /**
            * The horizontal velocity in m/s
            */
   public float hor_velocity_;
   /**
            * The vertical velocity in m/s, positive is up
            */
   public float ver_velocity_;
   /**
            * The callsign, 8+null
            */
   public char[] callsign_;
   /**
            * Type from ADSB_EMITTER_TYPE enum
            */
   public byte emitter_type_;
   /**
            * Time since last communication in seconds
            */
   public byte tslc_;
   /**
            * Flags to indicate various statuses including valid data fields
            */
   public int flags_;
   /**
            * Squawk code
            */
   public int squawk_;
   /**
            * Unique UAS ID
            */
   public byte[] uas_id_;

   public TransponderReport()
   {
      callsign_ = new char[9];

      uas_id_ = new byte[18];

   }

   public TransponderReport(TransponderReport other)
   {
      this();
      set(other);
   }

   public void set(TransponderReport other)
   {
      timestamp_ = other.timestamp_;

      icao_address_ = other.icao_address_;

      lat_ = other.lat_;

      lon_ = other.lon_;

      altitude_type_ = other.altitude_type_;

      altitude_ = other.altitude_;

      heading_ = other.heading_;

      hor_velocity_ = other.hor_velocity_;

      ver_velocity_ = other.ver_velocity_;

      for(int i1 = 0; i1 < callsign_.length; ++i1)
      {
            callsign_[i1] = other.callsign_[i1];

      }

      emitter_type_ = other.emitter_type_;

      tslc_ = other.tslc_;

      flags_ = other.flags_;

      squawk_ = other.squawk_;

      for(int i3 = 0; i3 < uas_id_.length; ++i3)
      {
            uas_id_[i3] = other.uas_id_[i3];

      }

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
            * ICAO address
            */
   public void setIcaoAddress(long icao_address)
   {
      icao_address_ = icao_address;
   }
   /**
            * ICAO address
            */
   public long getIcaoAddress()
   {
      return icao_address_;
   }

   /**
            * Latitude, expressed as degrees
            */
   public void setLat(double lat)
   {
      lat_ = lat;
   }
   /**
            * Latitude, expressed as degrees
            */
   public double getLat()
   {
      return lat_;
   }

   /**
            * Longitude, expressed as degrees
            */
   public void setLon(double lon)
   {
      lon_ = lon;
   }
   /**
            * Longitude, expressed as degrees
            */
   public double getLon()
   {
      return lon_;
   }

   /**
            * Type from ADSB_ALTITUDE_TYPE enum
            */
   public void setAltitudeType(byte altitude_type)
   {
      altitude_type_ = altitude_type;
   }
   /**
            * Type from ADSB_ALTITUDE_TYPE enum
            */
   public byte getAltitudeType()
   {
      return altitude_type_;
   }

   /**
            * Altitude(ASL) in meters
            */
   public void setAltitude(float altitude)
   {
      altitude_ = altitude;
   }
   /**
            * Altitude(ASL) in meters
            */
   public float getAltitude()
   {
      return altitude_;
   }

   /**
            * Course over ground in radians, -pi to +pi, 0 is north
            */
   public void setHeading(float heading)
   {
      heading_ = heading;
   }
   /**
            * Course over ground in radians, -pi to +pi, 0 is north
            */
   public float getHeading()
   {
      return heading_;
   }

   /**
            * The horizontal velocity in m/s
            */
   public void setHorVelocity(float hor_velocity)
   {
      hor_velocity_ = hor_velocity;
   }
   /**
            * The horizontal velocity in m/s
            */
   public float getHorVelocity()
   {
      return hor_velocity_;
   }

   /**
            * The vertical velocity in m/s, positive is up
            */
   public void setVerVelocity(float ver_velocity)
   {
      ver_velocity_ = ver_velocity;
   }
   /**
            * The vertical velocity in m/s, positive is up
            */
   public float getVerVelocity()
   {
      return ver_velocity_;
   }


   /**
            * The callsign, 8+null
            */
   public char[] getCallsign()
   {
      return callsign_;
   }

   /**
            * Type from ADSB_EMITTER_TYPE enum
            */
   public void setEmitterType(byte emitter_type)
   {
      emitter_type_ = emitter_type;
   }
   /**
            * Type from ADSB_EMITTER_TYPE enum
            */
   public byte getEmitterType()
   {
      return emitter_type_;
   }

   /**
            * Time since last communication in seconds
            */
   public void setTslc(byte tslc)
   {
      tslc_ = tslc;
   }
   /**
            * Time since last communication in seconds
            */
   public byte getTslc()
   {
      return tslc_;
   }

   /**
            * Flags to indicate various statuses including valid data fields
            */
   public void setFlags(int flags)
   {
      flags_ = flags;
   }
   /**
            * Flags to indicate various statuses including valid data fields
            */
   public int getFlags()
   {
      return flags_;
   }

   /**
            * Squawk code
            */
   public void setSquawk(int squawk)
   {
      squawk_ = squawk;
   }
   /**
            * Squawk code
            */
   public int getSquawk()
   {
      return squawk_;
   }


   /**
            * Unique UAS ID
            */
   public byte[] getUasId()
   {
      return uas_id_;
   }


   public static Supplier<TransponderReportPubSubType> getPubSubType()
   {
      return TransponderReportPubSubType::new;
   }

   @Override
   public Supplier<TopicDataType> getPubSubTypePacket()
   {
      return TransponderReportPubSubType::new;
   }

   @Override
   public boolean epsilonEquals(TransponderReport other, double epsilon)
   {
      if(other == null) return false;
      if(other == this) return true;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_, other.timestamp_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.icao_address_, other.icao_address_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.lat_, other.lat_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.lon_, other.lon_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.altitude_type_, other.altitude_type_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.altitude_, other.altitude_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.heading_, other.heading_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.hor_velocity_, other.hor_velocity_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.ver_velocity_, other.ver_velocity_, epsilon)) return false;

      for(int i5 = 0; i5 < callsign_.length; ++i5)
      {
                if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.callsign_[i5], other.callsign_[i5], epsilon)) return false;
      }

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.emitter_type_, other.emitter_type_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.tslc_, other.tslc_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.flags_, other.flags_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.squawk_, other.squawk_, epsilon)) return false;

      for(int i7 = 0; i7 < uas_id_.length; ++i7)
      {
                if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.uas_id_[i7], other.uas_id_[i7], epsilon)) return false;
      }


      return true;
   }

   @Override
   public boolean equals(Object other)
   {
      if(other == null) return false;
      if(other == this) return true;
      if(!(other instanceof TransponderReport)) return false;

      TransponderReport otherMyClass = (TransponderReport) other;

      if(this.timestamp_ != otherMyClass.timestamp_) return false;

      if(this.icao_address_ != otherMyClass.icao_address_) return false;

      if(this.lat_ != otherMyClass.lat_) return false;

      if(this.lon_ != otherMyClass.lon_) return false;

      if(this.altitude_type_ != otherMyClass.altitude_type_) return false;

      if(this.altitude_ != otherMyClass.altitude_) return false;

      if(this.heading_ != otherMyClass.heading_) return false;

      if(this.hor_velocity_ != otherMyClass.hor_velocity_) return false;

      if(this.ver_velocity_ != otherMyClass.ver_velocity_) return false;

      for(int i9 = 0; i9 < callsign_.length; ++i9)
      {
                if(this.callsign_[i9] != otherMyClass.callsign_[i9]) return false;

      }
      if(this.emitter_type_ != otherMyClass.emitter_type_) return false;

      if(this.tslc_ != otherMyClass.tslc_) return false;

      if(this.flags_ != otherMyClass.flags_) return false;

      if(this.squawk_ != otherMyClass.squawk_) return false;

      for(int i11 = 0; i11 < uas_id_.length; ++i11)
      {
                if(this.uas_id_[i11] != otherMyClass.uas_id_[i11]) return false;

      }

      return true;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("TransponderReport {");
      builder.append("timestamp=");
      builder.append(this.timestamp_);      builder.append(", ");
      builder.append("icao_address=");
      builder.append(this.icao_address_);      builder.append(", ");
      builder.append("lat=");
      builder.append(this.lat_);      builder.append(", ");
      builder.append("lon=");
      builder.append(this.lon_);      builder.append(", ");
      builder.append("altitude_type=");
      builder.append(this.altitude_type_);      builder.append(", ");
      builder.append("altitude=");
      builder.append(this.altitude_);      builder.append(", ");
      builder.append("heading=");
      builder.append(this.heading_);      builder.append(", ");
      builder.append("hor_velocity=");
      builder.append(this.hor_velocity_);      builder.append(", ");
      builder.append("ver_velocity=");
      builder.append(this.ver_velocity_);      builder.append(", ");
      builder.append("callsign=");
      builder.append(java.util.Arrays.toString(this.callsign_));      builder.append(", ");
      builder.append("emitter_type=");
      builder.append(this.emitter_type_);      builder.append(", ");
      builder.append("tslc=");
      builder.append(this.tslc_);      builder.append(", ");
      builder.append("flags=");
      builder.append(this.flags_);      builder.append(", ");
      builder.append("squawk=");
      builder.append(this.squawk_);      builder.append(", ");
      builder.append("uas_id=");
      builder.append(java.util.Arrays.toString(this.uas_id_));
      builder.append("}");
      return builder.toString();
   }
}
