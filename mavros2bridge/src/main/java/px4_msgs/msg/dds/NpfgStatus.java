package px4_msgs.msg.dds;

import us.ihmc.communication.packets.Packet;
import us.ihmc.euclid.interfaces.Settable;
import us.ihmc.euclid.interfaces.EpsilonComparable;
import java.util.function.Supplier;
import us.ihmc.pubsub.TopicDataType;

public class NpfgStatus extends Packet<NpfgStatus> implements Settable<NpfgStatus>, EpsilonComparable<NpfgStatus>
{
   /**
            * time since system start (microseconds)
            */
   public long timestamp_;
   /**
            * (boolean) true = wind estimate is valid and/or being used by controller (also indicates if wind est usage is disabled despite being valid)
            */
   public byte wind_est_valid_;
   /**
            * resultant lateral acceleration reference [m/s^2]
            */
   public float lat_accel_;
   /**
            * lateral acceleration demand only for maintaining curvature [m/s^2]
            */
   public float lat_accel_ff_;
   /**
            * bearing feasibility [0,1]
            */
   public float bearing_feas_;
   /**
            * on-track bearing feasibility [0,1]
            */
   public float bearing_feas_on_track_;
   /**
            * signed track error [m]
            */
   public float signed_track_error_;
   /**
            * track error bound [m]
            */
   public float track_error_bound_;
   /**
            * (true) airspeed reference [m/s]
            */
   public float airspeed_ref_;
   /**
            * bearing angle [rad]
            */
   public float bearing_;
   /**
            * heading angle reference [rad]
            */
   public float heading_ref_;
   /**
            * minimum forward ground speed reference [m/s]
            */
   public float min_ground_speed_ref_;
   /**
            * adapted period (if auto-tuning enabled) [s]
            */
   public float adapted_period_;
   /**
            * controller proportional gain [rad/s]
            */
   public float p_gain_;
   /**
            * controller time constant [s]
            */
   public float time_const_;
   /**
            * estimate of certainty of the correct functionality of the npfg roll setpoint in [0, 1]
            */
   public float can_run_factor_;

   public NpfgStatus()
   {
   }

   public NpfgStatus(NpfgStatus other)
   {
      this();
      set(other);
   }

   public void set(NpfgStatus other)
   {
      timestamp_ = other.timestamp_;

      wind_est_valid_ = other.wind_est_valid_;

      lat_accel_ = other.lat_accel_;

      lat_accel_ff_ = other.lat_accel_ff_;

      bearing_feas_ = other.bearing_feas_;

      bearing_feas_on_track_ = other.bearing_feas_on_track_;

      signed_track_error_ = other.signed_track_error_;

      track_error_bound_ = other.track_error_bound_;

      airspeed_ref_ = other.airspeed_ref_;

      bearing_ = other.bearing_;

      heading_ref_ = other.heading_ref_;

      min_ground_speed_ref_ = other.min_ground_speed_ref_;

      adapted_period_ = other.adapted_period_;

      p_gain_ = other.p_gain_;

      time_const_ = other.time_const_;

      can_run_factor_ = other.can_run_factor_;

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
            * (boolean) true = wind estimate is valid and/or being used by controller (also indicates if wind est usage is disabled despite being valid)
            */
   public void setWindEstValid(byte wind_est_valid)
   {
      wind_est_valid_ = wind_est_valid;
   }
   /**
            * (boolean) true = wind estimate is valid and/or being used by controller (also indicates if wind est usage is disabled despite being valid)
            */
   public byte getWindEstValid()
   {
      return wind_est_valid_;
   }

   /**
            * resultant lateral acceleration reference [m/s^2]
            */
   public void setLatAccel(float lat_accel)
   {
      lat_accel_ = lat_accel;
   }
   /**
            * resultant lateral acceleration reference [m/s^2]
            */
   public float getLatAccel()
   {
      return lat_accel_;
   }

   /**
            * lateral acceleration demand only for maintaining curvature [m/s^2]
            */
   public void setLatAccelFf(float lat_accel_ff)
   {
      lat_accel_ff_ = lat_accel_ff;
   }
   /**
            * lateral acceleration demand only for maintaining curvature [m/s^2]
            */
   public float getLatAccelFf()
   {
      return lat_accel_ff_;
   }

   /**
            * bearing feasibility [0,1]
            */
   public void setBearingFeas(float bearing_feas)
   {
      bearing_feas_ = bearing_feas;
   }
   /**
            * bearing feasibility [0,1]
            */
   public float getBearingFeas()
   {
      return bearing_feas_;
   }

   /**
            * on-track bearing feasibility [0,1]
            */
   public void setBearingFeasOnTrack(float bearing_feas_on_track)
   {
      bearing_feas_on_track_ = bearing_feas_on_track;
   }
   /**
            * on-track bearing feasibility [0,1]
            */
   public float getBearingFeasOnTrack()
   {
      return bearing_feas_on_track_;
   }

   /**
            * signed track error [m]
            */
   public void setSignedTrackError(float signed_track_error)
   {
      signed_track_error_ = signed_track_error;
   }
   /**
            * signed track error [m]
            */
   public float getSignedTrackError()
   {
      return signed_track_error_;
   }

   /**
            * track error bound [m]
            */
   public void setTrackErrorBound(float track_error_bound)
   {
      track_error_bound_ = track_error_bound;
   }
   /**
            * track error bound [m]
            */
   public float getTrackErrorBound()
   {
      return track_error_bound_;
   }

   /**
            * (true) airspeed reference [m/s]
            */
   public void setAirspeedRef(float airspeed_ref)
   {
      airspeed_ref_ = airspeed_ref;
   }
   /**
            * (true) airspeed reference [m/s]
            */
   public float getAirspeedRef()
   {
      return airspeed_ref_;
   }

   /**
            * bearing angle [rad]
            */
   public void setBearing(float bearing)
   {
      bearing_ = bearing;
   }
   /**
            * bearing angle [rad]
            */
   public float getBearing()
   {
      return bearing_;
   }

   /**
            * heading angle reference [rad]
            */
   public void setHeadingRef(float heading_ref)
   {
      heading_ref_ = heading_ref;
   }
   /**
            * heading angle reference [rad]
            */
   public float getHeadingRef()
   {
      return heading_ref_;
   }

   /**
            * minimum forward ground speed reference [m/s]
            */
   public void setMinGroundSpeedRef(float min_ground_speed_ref)
   {
      min_ground_speed_ref_ = min_ground_speed_ref;
   }
   /**
            * minimum forward ground speed reference [m/s]
            */
   public float getMinGroundSpeedRef()
   {
      return min_ground_speed_ref_;
   }

   /**
            * adapted period (if auto-tuning enabled) [s]
            */
   public void setAdaptedPeriod(float adapted_period)
   {
      adapted_period_ = adapted_period;
   }
   /**
            * adapted period (if auto-tuning enabled) [s]
            */
   public float getAdaptedPeriod()
   {
      return adapted_period_;
   }

   /**
            * controller proportional gain [rad/s]
            */
   public void setPGain(float p_gain)
   {
      p_gain_ = p_gain;
   }
   /**
            * controller proportional gain [rad/s]
            */
   public float getPGain()
   {
      return p_gain_;
   }

   /**
            * controller time constant [s]
            */
   public void setTimeConst(float time_const)
   {
      time_const_ = time_const;
   }
   /**
            * controller time constant [s]
            */
   public float getTimeConst()
   {
      return time_const_;
   }

   /**
            * estimate of certainty of the correct functionality of the npfg roll setpoint in [0, 1]
            */
   public void setCanRunFactor(float can_run_factor)
   {
      can_run_factor_ = can_run_factor;
   }
   /**
            * estimate of certainty of the correct functionality of the npfg roll setpoint in [0, 1]
            */
   public float getCanRunFactor()
   {
      return can_run_factor_;
   }


   public static Supplier<NpfgStatusPubSubType> getPubSubType()
   {
      return NpfgStatusPubSubType::new;
   }

   @Override
   public Supplier<TopicDataType> getPubSubTypePacket()
   {
      return NpfgStatusPubSubType::new;
   }

   @Override
   public boolean epsilonEquals(NpfgStatus other, double epsilon)
   {
      if(other == null) return false;
      if(other == this) return true;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_, other.timestamp_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.wind_est_valid_, other.wind_est_valid_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.lat_accel_, other.lat_accel_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.lat_accel_ff_, other.lat_accel_ff_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.bearing_feas_, other.bearing_feas_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.bearing_feas_on_track_, other.bearing_feas_on_track_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.signed_track_error_, other.signed_track_error_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.track_error_bound_, other.track_error_bound_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.airspeed_ref_, other.airspeed_ref_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.bearing_, other.bearing_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.heading_ref_, other.heading_ref_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.min_ground_speed_ref_, other.min_ground_speed_ref_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.adapted_period_, other.adapted_period_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.p_gain_, other.p_gain_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.time_const_, other.time_const_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.can_run_factor_, other.can_run_factor_, epsilon)) return false;


      return true;
   }

   @Override
   public boolean equals(Object other)
   {
      if(other == null) return false;
      if(other == this) return true;
      if(!(other instanceof NpfgStatus)) return false;

      NpfgStatus otherMyClass = (NpfgStatus) other;

      if(this.timestamp_ != otherMyClass.timestamp_) return false;

      if(this.wind_est_valid_ != otherMyClass.wind_est_valid_) return false;

      if(this.lat_accel_ != otherMyClass.lat_accel_) return false;

      if(this.lat_accel_ff_ != otherMyClass.lat_accel_ff_) return false;

      if(this.bearing_feas_ != otherMyClass.bearing_feas_) return false;

      if(this.bearing_feas_on_track_ != otherMyClass.bearing_feas_on_track_) return false;

      if(this.signed_track_error_ != otherMyClass.signed_track_error_) return false;

      if(this.track_error_bound_ != otherMyClass.track_error_bound_) return false;

      if(this.airspeed_ref_ != otherMyClass.airspeed_ref_) return false;

      if(this.bearing_ != otherMyClass.bearing_) return false;

      if(this.heading_ref_ != otherMyClass.heading_ref_) return false;

      if(this.min_ground_speed_ref_ != otherMyClass.min_ground_speed_ref_) return false;

      if(this.adapted_period_ != otherMyClass.adapted_period_) return false;

      if(this.p_gain_ != otherMyClass.p_gain_) return false;

      if(this.time_const_ != otherMyClass.time_const_) return false;

      if(this.can_run_factor_ != otherMyClass.can_run_factor_) return false;


      return true;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("NpfgStatus {");
      builder.append("timestamp=");
      builder.append(this.timestamp_);      builder.append(", ");
      builder.append("wind_est_valid=");
      builder.append(this.wind_est_valid_);      builder.append(", ");
      builder.append("lat_accel=");
      builder.append(this.lat_accel_);      builder.append(", ");
      builder.append("lat_accel_ff=");
      builder.append(this.lat_accel_ff_);      builder.append(", ");
      builder.append("bearing_feas=");
      builder.append(this.bearing_feas_);      builder.append(", ");
      builder.append("bearing_feas_on_track=");
      builder.append(this.bearing_feas_on_track_);      builder.append(", ");
      builder.append("signed_track_error=");
      builder.append(this.signed_track_error_);      builder.append(", ");
      builder.append("track_error_bound=");
      builder.append(this.track_error_bound_);      builder.append(", ");
      builder.append("airspeed_ref=");
      builder.append(this.airspeed_ref_);      builder.append(", ");
      builder.append("bearing=");
      builder.append(this.bearing_);      builder.append(", ");
      builder.append("heading_ref=");
      builder.append(this.heading_ref_);      builder.append(", ");
      builder.append("min_ground_speed_ref=");
      builder.append(this.min_ground_speed_ref_);      builder.append(", ");
      builder.append("adapted_period=");
      builder.append(this.adapted_period_);      builder.append(", ");
      builder.append("p_gain=");
      builder.append(this.p_gain_);      builder.append(", ");
      builder.append("time_const=");
      builder.append(this.time_const_);      builder.append(", ");
      builder.append("can_run_factor=");
      builder.append(this.can_run_factor_);
      builder.append("}");
      return builder.toString();
   }
}
