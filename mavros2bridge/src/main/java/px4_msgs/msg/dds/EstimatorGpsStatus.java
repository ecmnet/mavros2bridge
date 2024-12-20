package px4_msgs.msg.dds;

import us.ihmc.communication.packets.Packet;
import us.ihmc.euclid.interfaces.Settable;
import us.ihmc.euclid.interfaces.EpsilonComparable;
import java.util.function.Supplier;
import us.ihmc.pubsub.TopicDataType;

public class EstimatorGpsStatus extends Packet<EstimatorGpsStatus> implements Settable<EstimatorGpsStatus>, EpsilonComparable<EstimatorGpsStatus>
{
   /**
            * time since system start (microseconds)
            */
   public long timestamp_;
   /**
            * the timestamp of the raw data (microseconds)
            */
   public long timestamp_sample_;
   public boolean checks_passed_;
   /**
            * 0 : insufficient fix type (no 3D solution)
            */
   public boolean check_fail_gps_fix_;
   /**
            * 1 : minimum required sat count fail
            */
   public boolean check_fail_min_sat_count_;
   /**
            * 2 : maximum allowed PDOP fail
            */
   public boolean check_fail_max_pdop_;
   /**
            * 3 : maximum allowed horizontal position error fail
            */
   public boolean check_fail_max_horz_err_;
   /**
            * 4 : maximum allowed vertical position error fail
            */
   public boolean check_fail_max_vert_err_;
   /**
            * 5 : maximum allowed speed error fail
            */
   public boolean check_fail_max_spd_err_;
   /**
            * 6 : maximum allowed horizontal position drift fail - requires stationary vehicle
            */
   public boolean check_fail_max_horz_drift_;
   /**
            * 7 : maximum allowed vertical position drift fail - requires stationary vehicle
            */
   public boolean check_fail_max_vert_drift_;
   /**
            * 8 : maximum allowed horizontal speed fail - requires stationary vehicle
            */
   public boolean check_fail_max_horz_spd_err_;
   /**
            * 9 : maximum allowed vertical velocity discrepancy fail
            */
   public boolean check_fail_max_vert_spd_err_;
   /**
            * 10 : GPS signal is spoofed
            */
   public boolean check_fail_spoofed_gps_;
   /**
            * Horizontal position rate magnitude (m/s)
            */
   public float position_drift_rate_horizontal_m_s_;
   /**
            * Vertical position rate magnitude (m/s)
            */
   public float position_drift_rate_vertical_m_s_;
   /**
            * Filtered horizontal velocity magnitude (m/s)
            */
   public float filtered_horizontal_speed_m_s_;

   public EstimatorGpsStatus()
   {
   }

   public EstimatorGpsStatus(EstimatorGpsStatus other)
   {
      this();
      set(other);
   }

   public void set(EstimatorGpsStatus other)
   {
      timestamp_ = other.timestamp_;

      timestamp_sample_ = other.timestamp_sample_;

      checks_passed_ = other.checks_passed_;

      check_fail_gps_fix_ = other.check_fail_gps_fix_;

      check_fail_min_sat_count_ = other.check_fail_min_sat_count_;

      check_fail_max_pdop_ = other.check_fail_max_pdop_;

      check_fail_max_horz_err_ = other.check_fail_max_horz_err_;

      check_fail_max_vert_err_ = other.check_fail_max_vert_err_;

      check_fail_max_spd_err_ = other.check_fail_max_spd_err_;

      check_fail_max_horz_drift_ = other.check_fail_max_horz_drift_;

      check_fail_max_vert_drift_ = other.check_fail_max_vert_drift_;

      check_fail_max_horz_spd_err_ = other.check_fail_max_horz_spd_err_;

      check_fail_max_vert_spd_err_ = other.check_fail_max_vert_spd_err_;

      check_fail_spoofed_gps_ = other.check_fail_spoofed_gps_;

      position_drift_rate_horizontal_m_s_ = other.position_drift_rate_horizontal_m_s_;

      position_drift_rate_vertical_m_s_ = other.position_drift_rate_vertical_m_s_;

      filtered_horizontal_speed_m_s_ = other.filtered_horizontal_speed_m_s_;

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

   public void setChecksPassed(boolean checks_passed)
   {
      checks_passed_ = checks_passed;
   }
   public boolean getChecksPassed()
   {
      return checks_passed_;
   }

   /**
            * 0 : insufficient fix type (no 3D solution)
            */
   public void setCheckFailGpsFix(boolean check_fail_gps_fix)
   {
      check_fail_gps_fix_ = check_fail_gps_fix;
   }
   /**
            * 0 : insufficient fix type (no 3D solution)
            */
   public boolean getCheckFailGpsFix()
   {
      return check_fail_gps_fix_;
   }

   /**
            * 1 : minimum required sat count fail
            */
   public void setCheckFailMinSatCount(boolean check_fail_min_sat_count)
   {
      check_fail_min_sat_count_ = check_fail_min_sat_count;
   }
   /**
            * 1 : minimum required sat count fail
            */
   public boolean getCheckFailMinSatCount()
   {
      return check_fail_min_sat_count_;
   }

   /**
            * 2 : maximum allowed PDOP fail
            */
   public void setCheckFailMaxPdop(boolean check_fail_max_pdop)
   {
      check_fail_max_pdop_ = check_fail_max_pdop;
   }
   /**
            * 2 : maximum allowed PDOP fail
            */
   public boolean getCheckFailMaxPdop()
   {
      return check_fail_max_pdop_;
   }

   /**
            * 3 : maximum allowed horizontal position error fail
            */
   public void setCheckFailMaxHorzErr(boolean check_fail_max_horz_err)
   {
      check_fail_max_horz_err_ = check_fail_max_horz_err;
   }
   /**
            * 3 : maximum allowed horizontal position error fail
            */
   public boolean getCheckFailMaxHorzErr()
   {
      return check_fail_max_horz_err_;
   }

   /**
            * 4 : maximum allowed vertical position error fail
            */
   public void setCheckFailMaxVertErr(boolean check_fail_max_vert_err)
   {
      check_fail_max_vert_err_ = check_fail_max_vert_err;
   }
   /**
            * 4 : maximum allowed vertical position error fail
            */
   public boolean getCheckFailMaxVertErr()
   {
      return check_fail_max_vert_err_;
   }

   /**
            * 5 : maximum allowed speed error fail
            */
   public void setCheckFailMaxSpdErr(boolean check_fail_max_spd_err)
   {
      check_fail_max_spd_err_ = check_fail_max_spd_err;
   }
   /**
            * 5 : maximum allowed speed error fail
            */
   public boolean getCheckFailMaxSpdErr()
   {
      return check_fail_max_spd_err_;
   }

   /**
            * 6 : maximum allowed horizontal position drift fail - requires stationary vehicle
            */
   public void setCheckFailMaxHorzDrift(boolean check_fail_max_horz_drift)
   {
      check_fail_max_horz_drift_ = check_fail_max_horz_drift;
   }
   /**
            * 6 : maximum allowed horizontal position drift fail - requires stationary vehicle
            */
   public boolean getCheckFailMaxHorzDrift()
   {
      return check_fail_max_horz_drift_;
   }

   /**
            * 7 : maximum allowed vertical position drift fail - requires stationary vehicle
            */
   public void setCheckFailMaxVertDrift(boolean check_fail_max_vert_drift)
   {
      check_fail_max_vert_drift_ = check_fail_max_vert_drift;
   }
   /**
            * 7 : maximum allowed vertical position drift fail - requires stationary vehicle
            */
   public boolean getCheckFailMaxVertDrift()
   {
      return check_fail_max_vert_drift_;
   }

   /**
            * 8 : maximum allowed horizontal speed fail - requires stationary vehicle
            */
   public void setCheckFailMaxHorzSpdErr(boolean check_fail_max_horz_spd_err)
   {
      check_fail_max_horz_spd_err_ = check_fail_max_horz_spd_err;
   }
   /**
            * 8 : maximum allowed horizontal speed fail - requires stationary vehicle
            */
   public boolean getCheckFailMaxHorzSpdErr()
   {
      return check_fail_max_horz_spd_err_;
   }

   /**
            * 9 : maximum allowed vertical velocity discrepancy fail
            */
   public void setCheckFailMaxVertSpdErr(boolean check_fail_max_vert_spd_err)
   {
      check_fail_max_vert_spd_err_ = check_fail_max_vert_spd_err;
   }
   /**
            * 9 : maximum allowed vertical velocity discrepancy fail
            */
   public boolean getCheckFailMaxVertSpdErr()
   {
      return check_fail_max_vert_spd_err_;
   }

   /**
            * 10 : GPS signal is spoofed
            */
   public void setCheckFailSpoofedGps(boolean check_fail_spoofed_gps)
   {
      check_fail_spoofed_gps_ = check_fail_spoofed_gps;
   }
   /**
            * 10 : GPS signal is spoofed
            */
   public boolean getCheckFailSpoofedGps()
   {
      return check_fail_spoofed_gps_;
   }

   /**
            * Horizontal position rate magnitude (m/s)
            */
   public void setPositionDriftRateHorizontalMS(float position_drift_rate_horizontal_m_s)
   {
      position_drift_rate_horizontal_m_s_ = position_drift_rate_horizontal_m_s;
   }
   /**
            * Horizontal position rate magnitude (m/s)
            */
   public float getPositionDriftRateHorizontalMS()
   {
      return position_drift_rate_horizontal_m_s_;
   }

   /**
            * Vertical position rate magnitude (m/s)
            */
   public void setPositionDriftRateVerticalMS(float position_drift_rate_vertical_m_s)
   {
      position_drift_rate_vertical_m_s_ = position_drift_rate_vertical_m_s;
   }
   /**
            * Vertical position rate magnitude (m/s)
            */
   public float getPositionDriftRateVerticalMS()
   {
      return position_drift_rate_vertical_m_s_;
   }

   /**
            * Filtered horizontal velocity magnitude (m/s)
            */
   public void setFilteredHorizontalSpeedMS(float filtered_horizontal_speed_m_s)
   {
      filtered_horizontal_speed_m_s_ = filtered_horizontal_speed_m_s;
   }
   /**
            * Filtered horizontal velocity magnitude (m/s)
            */
   public float getFilteredHorizontalSpeedMS()
   {
      return filtered_horizontal_speed_m_s_;
   }


   public static Supplier<EstimatorGpsStatusPubSubType> getPubSubType()
   {
      return EstimatorGpsStatusPubSubType::new;
   }

   @Override
   public Supplier<TopicDataType> getPubSubTypePacket()
   {
      return EstimatorGpsStatusPubSubType::new;
   }

   @Override
   public boolean epsilonEquals(EstimatorGpsStatus other, double epsilon)
   {
      if(other == null) return false;
      if(other == this) return true;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_, other.timestamp_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_sample_, other.timestamp_sample_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.checks_passed_, other.checks_passed_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.check_fail_gps_fix_, other.check_fail_gps_fix_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.check_fail_min_sat_count_, other.check_fail_min_sat_count_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.check_fail_max_pdop_, other.check_fail_max_pdop_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.check_fail_max_horz_err_, other.check_fail_max_horz_err_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.check_fail_max_vert_err_, other.check_fail_max_vert_err_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.check_fail_max_spd_err_, other.check_fail_max_spd_err_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.check_fail_max_horz_drift_, other.check_fail_max_horz_drift_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.check_fail_max_vert_drift_, other.check_fail_max_vert_drift_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.check_fail_max_horz_spd_err_, other.check_fail_max_horz_spd_err_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.check_fail_max_vert_spd_err_, other.check_fail_max_vert_spd_err_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.check_fail_spoofed_gps_, other.check_fail_spoofed_gps_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.position_drift_rate_horizontal_m_s_, other.position_drift_rate_horizontal_m_s_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.position_drift_rate_vertical_m_s_, other.position_drift_rate_vertical_m_s_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.filtered_horizontal_speed_m_s_, other.filtered_horizontal_speed_m_s_, epsilon)) return false;


      return true;
   }

   @Override
   public boolean equals(Object other)
   {
      if(other == null) return false;
      if(other == this) return true;
      if(!(other instanceof EstimatorGpsStatus)) return false;

      EstimatorGpsStatus otherMyClass = (EstimatorGpsStatus) other;

      if(this.timestamp_ != otherMyClass.timestamp_) return false;

      if(this.timestamp_sample_ != otherMyClass.timestamp_sample_) return false;

      if(this.checks_passed_ != otherMyClass.checks_passed_) return false;

      if(this.check_fail_gps_fix_ != otherMyClass.check_fail_gps_fix_) return false;

      if(this.check_fail_min_sat_count_ != otherMyClass.check_fail_min_sat_count_) return false;

      if(this.check_fail_max_pdop_ != otherMyClass.check_fail_max_pdop_) return false;

      if(this.check_fail_max_horz_err_ != otherMyClass.check_fail_max_horz_err_) return false;

      if(this.check_fail_max_vert_err_ != otherMyClass.check_fail_max_vert_err_) return false;

      if(this.check_fail_max_spd_err_ != otherMyClass.check_fail_max_spd_err_) return false;

      if(this.check_fail_max_horz_drift_ != otherMyClass.check_fail_max_horz_drift_) return false;

      if(this.check_fail_max_vert_drift_ != otherMyClass.check_fail_max_vert_drift_) return false;

      if(this.check_fail_max_horz_spd_err_ != otherMyClass.check_fail_max_horz_spd_err_) return false;

      if(this.check_fail_max_vert_spd_err_ != otherMyClass.check_fail_max_vert_spd_err_) return false;

      if(this.check_fail_spoofed_gps_ != otherMyClass.check_fail_spoofed_gps_) return false;

      if(this.position_drift_rate_horizontal_m_s_ != otherMyClass.position_drift_rate_horizontal_m_s_) return false;

      if(this.position_drift_rate_vertical_m_s_ != otherMyClass.position_drift_rate_vertical_m_s_) return false;

      if(this.filtered_horizontal_speed_m_s_ != otherMyClass.filtered_horizontal_speed_m_s_) return false;


      return true;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("EstimatorGpsStatus {");
      builder.append("timestamp=");
      builder.append(this.timestamp_);      builder.append(", ");
      builder.append("timestamp_sample=");
      builder.append(this.timestamp_sample_);      builder.append(", ");
      builder.append("checks_passed=");
      builder.append(this.checks_passed_);      builder.append(", ");
      builder.append("check_fail_gps_fix=");
      builder.append(this.check_fail_gps_fix_);      builder.append(", ");
      builder.append("check_fail_min_sat_count=");
      builder.append(this.check_fail_min_sat_count_);      builder.append(", ");
      builder.append("check_fail_max_pdop=");
      builder.append(this.check_fail_max_pdop_);      builder.append(", ");
      builder.append("check_fail_max_horz_err=");
      builder.append(this.check_fail_max_horz_err_);      builder.append(", ");
      builder.append("check_fail_max_vert_err=");
      builder.append(this.check_fail_max_vert_err_);      builder.append(", ");
      builder.append("check_fail_max_spd_err=");
      builder.append(this.check_fail_max_spd_err_);      builder.append(", ");
      builder.append("check_fail_max_horz_drift=");
      builder.append(this.check_fail_max_horz_drift_);      builder.append(", ");
      builder.append("check_fail_max_vert_drift=");
      builder.append(this.check_fail_max_vert_drift_);      builder.append(", ");
      builder.append("check_fail_max_horz_spd_err=");
      builder.append(this.check_fail_max_horz_spd_err_);      builder.append(", ");
      builder.append("check_fail_max_vert_spd_err=");
      builder.append(this.check_fail_max_vert_spd_err_);      builder.append(", ");
      builder.append("check_fail_spoofed_gps=");
      builder.append(this.check_fail_spoofed_gps_);      builder.append(", ");
      builder.append("position_drift_rate_horizontal_m_s=");
      builder.append(this.position_drift_rate_horizontal_m_s_);      builder.append(", ");
      builder.append("position_drift_rate_vertical_m_s=");
      builder.append(this.position_drift_rate_vertical_m_s_);      builder.append(", ");
      builder.append("filtered_horizontal_speed_m_s=");
      builder.append(this.filtered_horizontal_speed_m_s_);
      builder.append("}");
      return builder.toString();
   }
}
