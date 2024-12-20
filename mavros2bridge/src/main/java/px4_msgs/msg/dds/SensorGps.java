package px4_msgs.msg.dds;

import us.ihmc.communication.packets.Packet;
import us.ihmc.euclid.interfaces.Settable;
import us.ihmc.euclid.interfaces.EpsilonComparable;
import java.util.function.Supplier;
import us.ihmc.pubsub.TopicDataType;

public class SensorGps extends Packet<SensorGps> implements Settable<SensorGps>, EpsilonComparable<SensorGps>
{
   /**
          * Value 0 is also valid to represent no fix.
          */
   public static final byte FIX_TYPE_NONE = (byte) 1;
   public static final byte FIX_TYPE_2D = (byte) 2;
   public static final byte FIX_TYPE_3D = (byte) 3;
   public static final byte FIX_TYPE_RTCM_CODE_DIFFERENTIAL = (byte) 4;
   public static final byte FIX_TYPE_RTK_FLOAT = (byte) 5;
   public static final byte FIX_TYPE_RTK_FIXED = (byte) 6;
   public static final byte FIX_TYPE_EXTRAPOLATED = (byte) 8;
   public static final byte JAMMING_STATE_UNKNOWN = (byte) 0;
   public static final byte JAMMING_STATE_OK = (byte) 1;
   public static final byte JAMMING_STATE_WARNING = (byte) 2;
   public static final byte JAMMING_STATE_CRITICAL = (byte) 3;
   public static final byte SPOOFING_STATE_UNKNOWN = (byte) 0;
   public static final byte SPOOFING_STATE_NONE = (byte) 1;
   public static final byte SPOOFING_STATE_INDICATED = (byte) 2;
   public static final byte SPOOFING_STATE_MULTIPLE = (byte) 3;
   public static final byte RTCM_MSG_USED_UNKNOWN = (byte) 0;
   public static final byte RTCM_MSG_USED_NOT_USED = (byte) 1;
   public static final byte RTCM_MSG_USED_USED = (byte) 2;
   /**
            * GPS position in WGS84 coordinates.
            * the field 'timestamp' is for the position & velocity (microseconds)
            * time since system start (microseconds)
            */
   public long timestamp_;
   public long timestamp_sample_;
   /**
            * unique device ID for the sensor that does not change between power cycles
            */
   public long device_id_;
   /**
            * Latitude in degrees, allows centimeter level RTK precision
            */
   public double latitude_deg_;
   /**
            * Longitude in degrees, allows centimeter level RTK precision
            */
   public double longitude_deg_;
   /**
            * Altitude above MSL, meters
            */
   public double altitude_msl_m_;
   /**
            * Altitude above Ellipsoid, meters
            */
   public double altitude_ellipsoid_m_;
   /**
            * GPS speed accuracy estimate, (metres/sec)
            */
   public float s_variance_m_s_;
   /**
            * GPS course accuracy estimate, (radians)
            */
   public float c_variance_rad_;
   /**
            * Some applications will not use the value of this field unless it is at least two, so always correctly fill in the fix.
            */
   public byte fix_type_;
   /**
            * GPS horizontal position accuracy (metres)
            */
   public float eph_;
   /**
            * GPS vertical position accuracy (metres)
            */
   public float epv_;
   /**
            * Horizontal dilution of precision
            */
   public float hdop_;
   /**
            * Vertical dilution of precision
            */
   public float vdop_;
   /**
            * GPS noise per millisecond
            */
   public int noise_per_ms_;
   /**
            * Automatic gain control monitor
            */
   public int automatic_gain_control_;
   /**
            * indicates whether jamming has been detected or suspected by the receivers. O: Unknown, 1: OK, 2: Warning, 3: Critical
            */
   public byte jamming_state_;
   /**
            * indicates jamming is occurring
            */
   public int jamming_indicator_;
   /**
            * indicates whether spoofing has been detected or suspected by the receivers. O: Unknown, 1: OK, 2: Warning, 3: Critical
            */
   public byte spoofing_state_;
   /**
            * GPS ground speed, (metres/sec)
            */
   public float vel_m_s_;
   /**
            * GPS North velocity, (metres/sec)
            */
   public float vel_n_m_s_;
   /**
            * GPS East velocity, (metres/sec)
            */
   public float vel_e_m_s_;
   /**
            * GPS Down velocity, (metres/sec)
            */
   public float vel_d_m_s_;
   /**
            * Course over ground (NOT heading, but direction of movement), -PI..PI, (radians)
            */
   public float cog_rad_;
   /**
            * True if NED velocity is valid
            */
   public boolean vel_ned_valid_;
   /**
            * timestamp + timestamp_time_relative = Time of the UTC timestamp since system start, (microseconds)
            */
   public int timestamp_time_relative_;
   /**
            * Timestamp (microseconds, UTC), this is the timestamp which comes from the gps module. It might be unavailable right after cold start, indicated by a value of 0
            */
   public long time_utc_usec_;
   /**
            * Number of satellites used
            */
   public byte satellites_used_;
   /**
            * heading angle of XYZ body frame rel to NED. Set to NaN if not available and updated (used for dual antenna GPS), (rad, [-PI, PI])
            */
   public float heading_;
   /**
            * heading offset of dual antenna array in body frame. Set to NaN if not applicable. (rad, [-PI, PI])
            */
   public float heading_offset_;
   /**
            * heading accuracy (rad, [0, 2PI])
            */
   public float heading_accuracy_;
   /**
            * RTCM message injection rate Hz
            */
   public float rtcm_injection_rate_;
   /**
            * uorb instance that is being used for RTCM corrections
            */
   public byte selected_rtcm_instance_;
   /**
            * RTCM message CRC failure detected
            */
   public boolean rtcm_crc_failed_;
   /**
            * Indicates if the RTCM message was used successfully by the receiver
            */
   public byte rtcm_msg_used_;

   public SensorGps()
   {
   }

   public SensorGps(SensorGps other)
   {
      this();
      set(other);
   }

   public void set(SensorGps other)
   {
      timestamp_ = other.timestamp_;

      timestamp_sample_ = other.timestamp_sample_;

      device_id_ = other.device_id_;

      latitude_deg_ = other.latitude_deg_;

      longitude_deg_ = other.longitude_deg_;

      altitude_msl_m_ = other.altitude_msl_m_;

      altitude_ellipsoid_m_ = other.altitude_ellipsoid_m_;

      s_variance_m_s_ = other.s_variance_m_s_;

      c_variance_rad_ = other.c_variance_rad_;

      fix_type_ = other.fix_type_;

      eph_ = other.eph_;

      epv_ = other.epv_;

      hdop_ = other.hdop_;

      vdop_ = other.vdop_;

      noise_per_ms_ = other.noise_per_ms_;

      automatic_gain_control_ = other.automatic_gain_control_;

      jamming_state_ = other.jamming_state_;

      jamming_indicator_ = other.jamming_indicator_;

      spoofing_state_ = other.spoofing_state_;

      vel_m_s_ = other.vel_m_s_;

      vel_n_m_s_ = other.vel_n_m_s_;

      vel_e_m_s_ = other.vel_e_m_s_;

      vel_d_m_s_ = other.vel_d_m_s_;

      cog_rad_ = other.cog_rad_;

      vel_ned_valid_ = other.vel_ned_valid_;

      timestamp_time_relative_ = other.timestamp_time_relative_;

      time_utc_usec_ = other.time_utc_usec_;

      satellites_used_ = other.satellites_used_;

      heading_ = other.heading_;

      heading_offset_ = other.heading_offset_;

      heading_accuracy_ = other.heading_accuracy_;

      rtcm_injection_rate_ = other.rtcm_injection_rate_;

      selected_rtcm_instance_ = other.selected_rtcm_instance_;

      rtcm_crc_failed_ = other.rtcm_crc_failed_;

      rtcm_msg_used_ = other.rtcm_msg_used_;

   }

   /**
            * GPS position in WGS84 coordinates.
            * the field 'timestamp' is for the position & velocity (microseconds)
            * time since system start (microseconds)
            */
   public void setTimestamp(long timestamp)
   {
      timestamp_ = timestamp;
   }
   /**
            * GPS position in WGS84 coordinates.
            * the field 'timestamp' is for the position & velocity (microseconds)
            * time since system start (microseconds)
            */
   public long getTimestamp()
   {
      return timestamp_;
   }

   public void setTimestampSample(long timestamp_sample)
   {
      timestamp_sample_ = timestamp_sample;
   }
   public long getTimestampSample()
   {
      return timestamp_sample_;
   }

   /**
            * unique device ID for the sensor that does not change between power cycles
            */
   public void setDeviceId(long device_id)
   {
      device_id_ = device_id;
   }
   /**
            * unique device ID for the sensor that does not change between power cycles
            */
   public long getDeviceId()
   {
      return device_id_;
   }

   /**
            * Latitude in degrees, allows centimeter level RTK precision
            */
   public void setLatitudeDeg(double latitude_deg)
   {
      latitude_deg_ = latitude_deg;
   }
   /**
            * Latitude in degrees, allows centimeter level RTK precision
            */
   public double getLatitudeDeg()
   {
      return latitude_deg_;
   }

   /**
            * Longitude in degrees, allows centimeter level RTK precision
            */
   public void setLongitudeDeg(double longitude_deg)
   {
      longitude_deg_ = longitude_deg;
   }
   /**
            * Longitude in degrees, allows centimeter level RTK precision
            */
   public double getLongitudeDeg()
   {
      return longitude_deg_;
   }

   /**
            * Altitude above MSL, meters
            */
   public void setAltitudeMslM(double altitude_msl_m)
   {
      altitude_msl_m_ = altitude_msl_m;
   }
   /**
            * Altitude above MSL, meters
            */
   public double getAltitudeMslM()
   {
      return altitude_msl_m_;
   }

   /**
            * Altitude above Ellipsoid, meters
            */
   public void setAltitudeEllipsoidM(double altitude_ellipsoid_m)
   {
      altitude_ellipsoid_m_ = altitude_ellipsoid_m;
   }
   /**
            * Altitude above Ellipsoid, meters
            */
   public double getAltitudeEllipsoidM()
   {
      return altitude_ellipsoid_m_;
   }

   /**
            * GPS speed accuracy estimate, (metres/sec)
            */
   public void setSVarianceMS(float s_variance_m_s)
   {
      s_variance_m_s_ = s_variance_m_s;
   }
   /**
            * GPS speed accuracy estimate, (metres/sec)
            */
   public float getSVarianceMS()
   {
      return s_variance_m_s_;
   }

   /**
            * GPS course accuracy estimate, (radians)
            */
   public void setCVarianceRad(float c_variance_rad)
   {
      c_variance_rad_ = c_variance_rad;
   }
   /**
            * GPS course accuracy estimate, (radians)
            */
   public float getCVarianceRad()
   {
      return c_variance_rad_;
   }

   /**
            * Some applications will not use the value of this field unless it is at least two, so always correctly fill in the fix.
            */
   public void setFixType(byte fix_type)
   {
      fix_type_ = fix_type;
   }
   /**
            * Some applications will not use the value of this field unless it is at least two, so always correctly fill in the fix.
            */
   public byte getFixType()
   {
      return fix_type_;
   }

   /**
            * GPS horizontal position accuracy (metres)
            */
   public void setEph(float eph)
   {
      eph_ = eph;
   }
   /**
            * GPS horizontal position accuracy (metres)
            */
   public float getEph()
   {
      return eph_;
   }

   /**
            * GPS vertical position accuracy (metres)
            */
   public void setEpv(float epv)
   {
      epv_ = epv;
   }
   /**
            * GPS vertical position accuracy (metres)
            */
   public float getEpv()
   {
      return epv_;
   }

   /**
            * Horizontal dilution of precision
            */
   public void setHdop(float hdop)
   {
      hdop_ = hdop;
   }
   /**
            * Horizontal dilution of precision
            */
   public float getHdop()
   {
      return hdop_;
   }

   /**
            * Vertical dilution of precision
            */
   public void setVdop(float vdop)
   {
      vdop_ = vdop;
   }
   /**
            * Vertical dilution of precision
            */
   public float getVdop()
   {
      return vdop_;
   }

   /**
            * GPS noise per millisecond
            */
   public void setNoisePerMs(int noise_per_ms)
   {
      noise_per_ms_ = noise_per_ms;
   }
   /**
            * GPS noise per millisecond
            */
   public int getNoisePerMs()
   {
      return noise_per_ms_;
   }

   /**
            * Automatic gain control monitor
            */
   public void setAutomaticGainControl(int automatic_gain_control)
   {
      automatic_gain_control_ = automatic_gain_control;
   }
   /**
            * Automatic gain control monitor
            */
   public int getAutomaticGainControl()
   {
      return automatic_gain_control_;
   }

   /**
            * indicates whether jamming has been detected or suspected by the receivers. O: Unknown, 1: OK, 2: Warning, 3: Critical
            */
   public void setJammingState(byte jamming_state)
   {
      jamming_state_ = jamming_state;
   }
   /**
            * indicates whether jamming has been detected or suspected by the receivers. O: Unknown, 1: OK, 2: Warning, 3: Critical
            */
   public byte getJammingState()
   {
      return jamming_state_;
   }

   /**
            * indicates jamming is occurring
            */
   public void setJammingIndicator(int jamming_indicator)
   {
      jamming_indicator_ = jamming_indicator;
   }
   /**
            * indicates jamming is occurring
            */
   public int getJammingIndicator()
   {
      return jamming_indicator_;
   }

   /**
            * indicates whether spoofing has been detected or suspected by the receivers. O: Unknown, 1: OK, 2: Warning, 3: Critical
            */
   public void setSpoofingState(byte spoofing_state)
   {
      spoofing_state_ = spoofing_state;
   }
   /**
            * indicates whether spoofing has been detected or suspected by the receivers. O: Unknown, 1: OK, 2: Warning, 3: Critical
            */
   public byte getSpoofingState()
   {
      return spoofing_state_;
   }

   /**
            * GPS ground speed, (metres/sec)
            */
   public void setVelMS(float vel_m_s)
   {
      vel_m_s_ = vel_m_s;
   }
   /**
            * GPS ground speed, (metres/sec)
            */
   public float getVelMS()
   {
      return vel_m_s_;
   }

   /**
            * GPS North velocity, (metres/sec)
            */
   public void setVelNMS(float vel_n_m_s)
   {
      vel_n_m_s_ = vel_n_m_s;
   }
   /**
            * GPS North velocity, (metres/sec)
            */
   public float getVelNMS()
   {
      return vel_n_m_s_;
   }

   /**
            * GPS East velocity, (metres/sec)
            */
   public void setVelEMS(float vel_e_m_s)
   {
      vel_e_m_s_ = vel_e_m_s;
   }
   /**
            * GPS East velocity, (metres/sec)
            */
   public float getVelEMS()
   {
      return vel_e_m_s_;
   }

   /**
            * GPS Down velocity, (metres/sec)
            */
   public void setVelDMS(float vel_d_m_s)
   {
      vel_d_m_s_ = vel_d_m_s;
   }
   /**
            * GPS Down velocity, (metres/sec)
            */
   public float getVelDMS()
   {
      return vel_d_m_s_;
   }

   /**
            * Course over ground (NOT heading, but direction of movement), -PI..PI, (radians)
            */
   public void setCogRad(float cog_rad)
   {
      cog_rad_ = cog_rad;
   }
   /**
            * Course over ground (NOT heading, but direction of movement), -PI..PI, (radians)
            */
   public float getCogRad()
   {
      return cog_rad_;
   }

   /**
            * True if NED velocity is valid
            */
   public void setVelNedValid(boolean vel_ned_valid)
   {
      vel_ned_valid_ = vel_ned_valid;
   }
   /**
            * True if NED velocity is valid
            */
   public boolean getVelNedValid()
   {
      return vel_ned_valid_;
   }

   /**
            * timestamp + timestamp_time_relative = Time of the UTC timestamp since system start, (microseconds)
            */
   public void setTimestampTimeRelative(int timestamp_time_relative)
   {
      timestamp_time_relative_ = timestamp_time_relative;
   }
   /**
            * timestamp + timestamp_time_relative = Time of the UTC timestamp since system start, (microseconds)
            */
   public int getTimestampTimeRelative()
   {
      return timestamp_time_relative_;
   }

   /**
            * Timestamp (microseconds, UTC), this is the timestamp which comes from the gps module. It might be unavailable right after cold start, indicated by a value of 0
            */
   public void setTimeUtcUsec(long time_utc_usec)
   {
      time_utc_usec_ = time_utc_usec;
   }
   /**
            * Timestamp (microseconds, UTC), this is the timestamp which comes from the gps module. It might be unavailable right after cold start, indicated by a value of 0
            */
   public long getTimeUtcUsec()
   {
      return time_utc_usec_;
   }

   /**
            * Number of satellites used
            */
   public void setSatellitesUsed(byte satellites_used)
   {
      satellites_used_ = satellites_used;
   }
   /**
            * Number of satellites used
            */
   public byte getSatellitesUsed()
   {
      return satellites_used_;
   }

   /**
            * heading angle of XYZ body frame rel to NED. Set to NaN if not available and updated (used for dual antenna GPS), (rad, [-PI, PI])
            */
   public void setHeading(float heading)
   {
      heading_ = heading;
   }
   /**
            * heading angle of XYZ body frame rel to NED. Set to NaN if not available and updated (used for dual antenna GPS), (rad, [-PI, PI])
            */
   public float getHeading()
   {
      return heading_;
   }

   /**
            * heading offset of dual antenna array in body frame. Set to NaN if not applicable. (rad, [-PI, PI])
            */
   public void setHeadingOffset(float heading_offset)
   {
      heading_offset_ = heading_offset;
   }
   /**
            * heading offset of dual antenna array in body frame. Set to NaN if not applicable. (rad, [-PI, PI])
            */
   public float getHeadingOffset()
   {
      return heading_offset_;
   }

   /**
            * heading accuracy (rad, [0, 2PI])
            */
   public void setHeadingAccuracy(float heading_accuracy)
   {
      heading_accuracy_ = heading_accuracy;
   }
   /**
            * heading accuracy (rad, [0, 2PI])
            */
   public float getHeadingAccuracy()
   {
      return heading_accuracy_;
   }

   /**
            * RTCM message injection rate Hz
            */
   public void setRtcmInjectionRate(float rtcm_injection_rate)
   {
      rtcm_injection_rate_ = rtcm_injection_rate;
   }
   /**
            * RTCM message injection rate Hz
            */
   public float getRtcmInjectionRate()
   {
      return rtcm_injection_rate_;
   }

   /**
            * uorb instance that is being used for RTCM corrections
            */
   public void setSelectedRtcmInstance(byte selected_rtcm_instance)
   {
      selected_rtcm_instance_ = selected_rtcm_instance;
   }
   /**
            * uorb instance that is being used for RTCM corrections
            */
   public byte getSelectedRtcmInstance()
   {
      return selected_rtcm_instance_;
   }

   /**
            * RTCM message CRC failure detected
            */
   public void setRtcmCrcFailed(boolean rtcm_crc_failed)
   {
      rtcm_crc_failed_ = rtcm_crc_failed;
   }
   /**
            * RTCM message CRC failure detected
            */
   public boolean getRtcmCrcFailed()
   {
      return rtcm_crc_failed_;
   }

   /**
            * Indicates if the RTCM message was used successfully by the receiver
            */
   public void setRtcmMsgUsed(byte rtcm_msg_used)
   {
      rtcm_msg_used_ = rtcm_msg_used;
   }
   /**
            * Indicates if the RTCM message was used successfully by the receiver
            */
   public byte getRtcmMsgUsed()
   {
      return rtcm_msg_used_;
   }


   public static Supplier<SensorGpsPubSubType> getPubSubType()
   {
      return SensorGpsPubSubType::new;
   }

   @Override
   public Supplier<TopicDataType> getPubSubTypePacket()
   {
      return SensorGpsPubSubType::new;
   }

   @Override
   public boolean epsilonEquals(SensorGps other, double epsilon)
   {
      if(other == null) return false;
      if(other == this) return true;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_, other.timestamp_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_sample_, other.timestamp_sample_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.device_id_, other.device_id_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.latitude_deg_, other.latitude_deg_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.longitude_deg_, other.longitude_deg_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.altitude_msl_m_, other.altitude_msl_m_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.altitude_ellipsoid_m_, other.altitude_ellipsoid_m_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.s_variance_m_s_, other.s_variance_m_s_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.c_variance_rad_, other.c_variance_rad_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.fix_type_, other.fix_type_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.eph_, other.eph_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.epv_, other.epv_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.hdop_, other.hdop_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.vdop_, other.vdop_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.noise_per_ms_, other.noise_per_ms_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.automatic_gain_control_, other.automatic_gain_control_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.jamming_state_, other.jamming_state_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.jamming_indicator_, other.jamming_indicator_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.spoofing_state_, other.spoofing_state_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.vel_m_s_, other.vel_m_s_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.vel_n_m_s_, other.vel_n_m_s_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.vel_e_m_s_, other.vel_e_m_s_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.vel_d_m_s_, other.vel_d_m_s_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.cog_rad_, other.cog_rad_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.vel_ned_valid_, other.vel_ned_valid_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_time_relative_, other.timestamp_time_relative_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.time_utc_usec_, other.time_utc_usec_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.satellites_used_, other.satellites_used_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.heading_, other.heading_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.heading_offset_, other.heading_offset_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.heading_accuracy_, other.heading_accuracy_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.rtcm_injection_rate_, other.rtcm_injection_rate_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.selected_rtcm_instance_, other.selected_rtcm_instance_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.rtcm_crc_failed_, other.rtcm_crc_failed_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.rtcm_msg_used_, other.rtcm_msg_used_, epsilon)) return false;


      return true;
   }

   @Override
   public boolean equals(Object other)
   {
      if(other == null) return false;
      if(other == this) return true;
      if(!(other instanceof SensorGps)) return false;

      SensorGps otherMyClass = (SensorGps) other;

      if(this.timestamp_ != otherMyClass.timestamp_) return false;

      if(this.timestamp_sample_ != otherMyClass.timestamp_sample_) return false;

      if(this.device_id_ != otherMyClass.device_id_) return false;

      if(this.latitude_deg_ != otherMyClass.latitude_deg_) return false;

      if(this.longitude_deg_ != otherMyClass.longitude_deg_) return false;

      if(this.altitude_msl_m_ != otherMyClass.altitude_msl_m_) return false;

      if(this.altitude_ellipsoid_m_ != otherMyClass.altitude_ellipsoid_m_) return false;

      if(this.s_variance_m_s_ != otherMyClass.s_variance_m_s_) return false;

      if(this.c_variance_rad_ != otherMyClass.c_variance_rad_) return false;

      if(this.fix_type_ != otherMyClass.fix_type_) return false;

      if(this.eph_ != otherMyClass.eph_) return false;

      if(this.epv_ != otherMyClass.epv_) return false;

      if(this.hdop_ != otherMyClass.hdop_) return false;

      if(this.vdop_ != otherMyClass.vdop_) return false;

      if(this.noise_per_ms_ != otherMyClass.noise_per_ms_) return false;

      if(this.automatic_gain_control_ != otherMyClass.automatic_gain_control_) return false;

      if(this.jamming_state_ != otherMyClass.jamming_state_) return false;

      if(this.jamming_indicator_ != otherMyClass.jamming_indicator_) return false;

      if(this.spoofing_state_ != otherMyClass.spoofing_state_) return false;

      if(this.vel_m_s_ != otherMyClass.vel_m_s_) return false;

      if(this.vel_n_m_s_ != otherMyClass.vel_n_m_s_) return false;

      if(this.vel_e_m_s_ != otherMyClass.vel_e_m_s_) return false;

      if(this.vel_d_m_s_ != otherMyClass.vel_d_m_s_) return false;

      if(this.cog_rad_ != otherMyClass.cog_rad_) return false;

      if(this.vel_ned_valid_ != otherMyClass.vel_ned_valid_) return false;

      if(this.timestamp_time_relative_ != otherMyClass.timestamp_time_relative_) return false;

      if(this.time_utc_usec_ != otherMyClass.time_utc_usec_) return false;

      if(this.satellites_used_ != otherMyClass.satellites_used_) return false;

      if(this.heading_ != otherMyClass.heading_) return false;

      if(this.heading_offset_ != otherMyClass.heading_offset_) return false;

      if(this.heading_accuracy_ != otherMyClass.heading_accuracy_) return false;

      if(this.rtcm_injection_rate_ != otherMyClass.rtcm_injection_rate_) return false;

      if(this.selected_rtcm_instance_ != otherMyClass.selected_rtcm_instance_) return false;

      if(this.rtcm_crc_failed_ != otherMyClass.rtcm_crc_failed_) return false;

      if(this.rtcm_msg_used_ != otherMyClass.rtcm_msg_used_) return false;


      return true;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("SensorGps {");
      builder.append("timestamp=");
      builder.append(this.timestamp_);      builder.append(", ");
      builder.append("timestamp_sample=");
      builder.append(this.timestamp_sample_);      builder.append(", ");
      builder.append("device_id=");
      builder.append(this.device_id_);      builder.append(", ");
      builder.append("latitude_deg=");
      builder.append(this.latitude_deg_);      builder.append(", ");
      builder.append("longitude_deg=");
      builder.append(this.longitude_deg_);      builder.append(", ");
      builder.append("altitude_msl_m=");
      builder.append(this.altitude_msl_m_);      builder.append(", ");
      builder.append("altitude_ellipsoid_m=");
      builder.append(this.altitude_ellipsoid_m_);      builder.append(", ");
      builder.append("s_variance_m_s=");
      builder.append(this.s_variance_m_s_);      builder.append(", ");
      builder.append("c_variance_rad=");
      builder.append(this.c_variance_rad_);      builder.append(", ");
      builder.append("fix_type=");
      builder.append(this.fix_type_);      builder.append(", ");
      builder.append("eph=");
      builder.append(this.eph_);      builder.append(", ");
      builder.append("epv=");
      builder.append(this.epv_);      builder.append(", ");
      builder.append("hdop=");
      builder.append(this.hdop_);      builder.append(", ");
      builder.append("vdop=");
      builder.append(this.vdop_);      builder.append(", ");
      builder.append("noise_per_ms=");
      builder.append(this.noise_per_ms_);      builder.append(", ");
      builder.append("automatic_gain_control=");
      builder.append(this.automatic_gain_control_);      builder.append(", ");
      builder.append("jamming_state=");
      builder.append(this.jamming_state_);      builder.append(", ");
      builder.append("jamming_indicator=");
      builder.append(this.jamming_indicator_);      builder.append(", ");
      builder.append("spoofing_state=");
      builder.append(this.spoofing_state_);      builder.append(", ");
      builder.append("vel_m_s=");
      builder.append(this.vel_m_s_);      builder.append(", ");
      builder.append("vel_n_m_s=");
      builder.append(this.vel_n_m_s_);      builder.append(", ");
      builder.append("vel_e_m_s=");
      builder.append(this.vel_e_m_s_);      builder.append(", ");
      builder.append("vel_d_m_s=");
      builder.append(this.vel_d_m_s_);      builder.append(", ");
      builder.append("cog_rad=");
      builder.append(this.cog_rad_);      builder.append(", ");
      builder.append("vel_ned_valid=");
      builder.append(this.vel_ned_valid_);      builder.append(", ");
      builder.append("timestamp_time_relative=");
      builder.append(this.timestamp_time_relative_);      builder.append(", ");
      builder.append("time_utc_usec=");
      builder.append(this.time_utc_usec_);      builder.append(", ");
      builder.append("satellites_used=");
      builder.append(this.satellites_used_);      builder.append(", ");
      builder.append("heading=");
      builder.append(this.heading_);      builder.append(", ");
      builder.append("heading_offset=");
      builder.append(this.heading_offset_);      builder.append(", ");
      builder.append("heading_accuracy=");
      builder.append(this.heading_accuracy_);      builder.append(", ");
      builder.append("rtcm_injection_rate=");
      builder.append(this.rtcm_injection_rate_);      builder.append(", ");
      builder.append("selected_rtcm_instance=");
      builder.append(this.selected_rtcm_instance_);      builder.append(", ");
      builder.append("rtcm_crc_failed=");
      builder.append(this.rtcm_crc_failed_);      builder.append(", ");
      builder.append("rtcm_msg_used=");
      builder.append(this.rtcm_msg_used_);
      builder.append("}");
      return builder.toString();
   }
}
