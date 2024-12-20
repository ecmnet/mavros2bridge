package px4_msgs.msg.dds;

import us.ihmc.communication.packets.Packet;
import us.ihmc.euclid.interfaces.Settable;
import us.ihmc.euclid.interfaces.EpsilonComparable;
import java.util.function.Supplier;
import us.ihmc.pubsub.TopicDataType;

public class TecsStatus extends Packet<TecsStatus> implements Settable<TecsStatus>, EpsilonComparable<TecsStatus>
{
   /**
            * time since system start (microseconds)
            */
   public long timestamp_;
   /**
            * Altitude setpoint AMSL [m]
            */
   public float altitude_sp_;
   /**
            * Altitude setpoint reference AMSL [m]
            */
   public float altitude_reference_;
   /**
            * Time constant of the altitude tracker [s]
            */
   public float altitude_time_constant_;
   /**
            * Height rate setpoint reference [m/s]
            */
   public float height_rate_reference_;
   /**
            * Direct height rate setpoint from velocity reference generator [m/s]
            */
   public float height_rate_direct_;
   /**
            * Height rate setpoint [m/s]
            */
   public float height_rate_setpoint_;
   /**
            * Height rate [m/s]
            */
   public float height_rate_;
   /**
            * Equivalent airspeed setpoint [m/s]
            */
   public float equivalent_airspeed_sp_;
   /**
            * True airspeed setpoint [m/s]
            */
   public float true_airspeed_sp_;
   /**
            * True airspeed filtered [m/s]
            */
   public float true_airspeed_filtered_;
   /**
            * True airspeed derivative setpoint [m/s^2]
            */
   public float true_airspeed_derivative_sp_;
   /**
            * True airspeed derivative [m/s^2]
            */
   public float true_airspeed_derivative_;
   /**
            * True airspeed derivative raw [m/s^2]
            */
   public float true_airspeed_derivative_raw_;
   /**
            * Total energy rate setpoint [m^2/s^3]
            */
   public float total_energy_rate_sp_;
   /**
            * Total energy rate estimate [m^2/s^3]
            */
   public float total_energy_rate_;
   /**
            * Energy balance rate setpoint [m^2/s^3]
            */
   public float total_energy_balance_rate_sp_;
   /**
            * Energy balance rate estimate [m^2/s^3]
            */
   public float total_energy_balance_rate_;
   /**
            * Throttle integrator value [-]
            */
   public float throttle_integ_;
   /**
            * Pitch integrator value [rad]
            */
   public float pitch_integ_;
   /**
            * Current throttle setpoint [-]
            */
   public float throttle_sp_;
   /**
            * Current pitch setpoint [rad]
            */
   public float pitch_sp_rad_;
   /**
            * estimated throttle value [0,1] required to fly level at equivalent_airspeed_sp in the current atmospheric conditions
            */
   public float throttle_trim_;
   /**
            * 0: no underspeed, 1: maximal underspeed. Controller takes measures to avoid stall proportional to ratio if >0.
            */
   public float underspeed_ratio_;
   /**
            * value indicating if fast descend mode is enabled with ramp up and ramp down [0-1]
            */
   public float fast_descend_ratio_;

   public TecsStatus()
   {
   }

   public TecsStatus(TecsStatus other)
   {
      this();
      set(other);
   }

   public void set(TecsStatus other)
   {
      timestamp_ = other.timestamp_;

      altitude_sp_ = other.altitude_sp_;

      altitude_reference_ = other.altitude_reference_;

      altitude_time_constant_ = other.altitude_time_constant_;

      height_rate_reference_ = other.height_rate_reference_;

      height_rate_direct_ = other.height_rate_direct_;

      height_rate_setpoint_ = other.height_rate_setpoint_;

      height_rate_ = other.height_rate_;

      equivalent_airspeed_sp_ = other.equivalent_airspeed_sp_;

      true_airspeed_sp_ = other.true_airspeed_sp_;

      true_airspeed_filtered_ = other.true_airspeed_filtered_;

      true_airspeed_derivative_sp_ = other.true_airspeed_derivative_sp_;

      true_airspeed_derivative_ = other.true_airspeed_derivative_;

      true_airspeed_derivative_raw_ = other.true_airspeed_derivative_raw_;

      total_energy_rate_sp_ = other.total_energy_rate_sp_;

      total_energy_rate_ = other.total_energy_rate_;

      total_energy_balance_rate_sp_ = other.total_energy_balance_rate_sp_;

      total_energy_balance_rate_ = other.total_energy_balance_rate_;

      throttle_integ_ = other.throttle_integ_;

      pitch_integ_ = other.pitch_integ_;

      throttle_sp_ = other.throttle_sp_;

      pitch_sp_rad_ = other.pitch_sp_rad_;

      throttle_trim_ = other.throttle_trim_;

      underspeed_ratio_ = other.underspeed_ratio_;

      fast_descend_ratio_ = other.fast_descend_ratio_;

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
            * Altitude setpoint AMSL [m]
            */
   public void setAltitudeSp(float altitude_sp)
   {
      altitude_sp_ = altitude_sp;
   }
   /**
            * Altitude setpoint AMSL [m]
            */
   public float getAltitudeSp()
   {
      return altitude_sp_;
   }

   /**
            * Altitude setpoint reference AMSL [m]
            */
   public void setAltitudeReference(float altitude_reference)
   {
      altitude_reference_ = altitude_reference;
   }
   /**
            * Altitude setpoint reference AMSL [m]
            */
   public float getAltitudeReference()
   {
      return altitude_reference_;
   }

   /**
            * Time constant of the altitude tracker [s]
            */
   public void setAltitudeTimeConstant(float altitude_time_constant)
   {
      altitude_time_constant_ = altitude_time_constant;
   }
   /**
            * Time constant of the altitude tracker [s]
            */
   public float getAltitudeTimeConstant()
   {
      return altitude_time_constant_;
   }

   /**
            * Height rate setpoint reference [m/s]
            */
   public void setHeightRateReference(float height_rate_reference)
   {
      height_rate_reference_ = height_rate_reference;
   }
   /**
            * Height rate setpoint reference [m/s]
            */
   public float getHeightRateReference()
   {
      return height_rate_reference_;
   }

   /**
            * Direct height rate setpoint from velocity reference generator [m/s]
            */
   public void setHeightRateDirect(float height_rate_direct)
   {
      height_rate_direct_ = height_rate_direct;
   }
   /**
            * Direct height rate setpoint from velocity reference generator [m/s]
            */
   public float getHeightRateDirect()
   {
      return height_rate_direct_;
   }

   /**
            * Height rate setpoint [m/s]
            */
   public void setHeightRateSetpoint(float height_rate_setpoint)
   {
      height_rate_setpoint_ = height_rate_setpoint;
   }
   /**
            * Height rate setpoint [m/s]
            */
   public float getHeightRateSetpoint()
   {
      return height_rate_setpoint_;
   }

   /**
            * Height rate [m/s]
            */
   public void setHeightRate(float height_rate)
   {
      height_rate_ = height_rate;
   }
   /**
            * Height rate [m/s]
            */
   public float getHeightRate()
   {
      return height_rate_;
   }

   /**
            * Equivalent airspeed setpoint [m/s]
            */
   public void setEquivalentAirspeedSp(float equivalent_airspeed_sp)
   {
      equivalent_airspeed_sp_ = equivalent_airspeed_sp;
   }
   /**
            * Equivalent airspeed setpoint [m/s]
            */
   public float getEquivalentAirspeedSp()
   {
      return equivalent_airspeed_sp_;
   }

   /**
            * True airspeed setpoint [m/s]
            */
   public void setTrueAirspeedSp(float true_airspeed_sp)
   {
      true_airspeed_sp_ = true_airspeed_sp;
   }
   /**
            * True airspeed setpoint [m/s]
            */
   public float getTrueAirspeedSp()
   {
      return true_airspeed_sp_;
   }

   /**
            * True airspeed filtered [m/s]
            */
   public void setTrueAirspeedFiltered(float true_airspeed_filtered)
   {
      true_airspeed_filtered_ = true_airspeed_filtered;
   }
   /**
            * True airspeed filtered [m/s]
            */
   public float getTrueAirspeedFiltered()
   {
      return true_airspeed_filtered_;
   }

   /**
            * True airspeed derivative setpoint [m/s^2]
            */
   public void setTrueAirspeedDerivativeSp(float true_airspeed_derivative_sp)
   {
      true_airspeed_derivative_sp_ = true_airspeed_derivative_sp;
   }
   /**
            * True airspeed derivative setpoint [m/s^2]
            */
   public float getTrueAirspeedDerivativeSp()
   {
      return true_airspeed_derivative_sp_;
   }

   /**
            * True airspeed derivative [m/s^2]
            */
   public void setTrueAirspeedDerivative(float true_airspeed_derivative)
   {
      true_airspeed_derivative_ = true_airspeed_derivative;
   }
   /**
            * True airspeed derivative [m/s^2]
            */
   public float getTrueAirspeedDerivative()
   {
      return true_airspeed_derivative_;
   }

   /**
            * True airspeed derivative raw [m/s^2]
            */
   public void setTrueAirspeedDerivativeRaw(float true_airspeed_derivative_raw)
   {
      true_airspeed_derivative_raw_ = true_airspeed_derivative_raw;
   }
   /**
            * True airspeed derivative raw [m/s^2]
            */
   public float getTrueAirspeedDerivativeRaw()
   {
      return true_airspeed_derivative_raw_;
   }

   /**
            * Total energy rate setpoint [m^2/s^3]
            */
   public void setTotalEnergyRateSp(float total_energy_rate_sp)
   {
      total_energy_rate_sp_ = total_energy_rate_sp;
   }
   /**
            * Total energy rate setpoint [m^2/s^3]
            */
   public float getTotalEnergyRateSp()
   {
      return total_energy_rate_sp_;
   }

   /**
            * Total energy rate estimate [m^2/s^3]
            */
   public void setTotalEnergyRate(float total_energy_rate)
   {
      total_energy_rate_ = total_energy_rate;
   }
   /**
            * Total energy rate estimate [m^2/s^3]
            */
   public float getTotalEnergyRate()
   {
      return total_energy_rate_;
   }

   /**
            * Energy balance rate setpoint [m^2/s^3]
            */
   public void setTotalEnergyBalanceRateSp(float total_energy_balance_rate_sp)
   {
      total_energy_balance_rate_sp_ = total_energy_balance_rate_sp;
   }
   /**
            * Energy balance rate setpoint [m^2/s^3]
            */
   public float getTotalEnergyBalanceRateSp()
   {
      return total_energy_balance_rate_sp_;
   }

   /**
            * Energy balance rate estimate [m^2/s^3]
            */
   public void setTotalEnergyBalanceRate(float total_energy_balance_rate)
   {
      total_energy_balance_rate_ = total_energy_balance_rate;
   }
   /**
            * Energy balance rate estimate [m^2/s^3]
            */
   public float getTotalEnergyBalanceRate()
   {
      return total_energy_balance_rate_;
   }

   /**
            * Throttle integrator value [-]
            */
   public void setThrottleInteg(float throttle_integ)
   {
      throttle_integ_ = throttle_integ;
   }
   /**
            * Throttle integrator value [-]
            */
   public float getThrottleInteg()
   {
      return throttle_integ_;
   }

   /**
            * Pitch integrator value [rad]
            */
   public void setPitchInteg(float pitch_integ)
   {
      pitch_integ_ = pitch_integ;
   }
   /**
            * Pitch integrator value [rad]
            */
   public float getPitchInteg()
   {
      return pitch_integ_;
   }

   /**
            * Current throttle setpoint [-]
            */
   public void setThrottleSp(float throttle_sp)
   {
      throttle_sp_ = throttle_sp;
   }
   /**
            * Current throttle setpoint [-]
            */
   public float getThrottleSp()
   {
      return throttle_sp_;
   }

   /**
            * Current pitch setpoint [rad]
            */
   public void setPitchSpRad(float pitch_sp_rad)
   {
      pitch_sp_rad_ = pitch_sp_rad;
   }
   /**
            * Current pitch setpoint [rad]
            */
   public float getPitchSpRad()
   {
      return pitch_sp_rad_;
   }

   /**
            * estimated throttle value [0,1] required to fly level at equivalent_airspeed_sp in the current atmospheric conditions
            */
   public void setThrottleTrim(float throttle_trim)
   {
      throttle_trim_ = throttle_trim;
   }
   /**
            * estimated throttle value [0,1] required to fly level at equivalent_airspeed_sp in the current atmospheric conditions
            */
   public float getThrottleTrim()
   {
      return throttle_trim_;
   }

   /**
            * 0: no underspeed, 1: maximal underspeed. Controller takes measures to avoid stall proportional to ratio if >0.
            */
   public void setUnderspeedRatio(float underspeed_ratio)
   {
      underspeed_ratio_ = underspeed_ratio;
   }
   /**
            * 0: no underspeed, 1: maximal underspeed. Controller takes measures to avoid stall proportional to ratio if >0.
            */
   public float getUnderspeedRatio()
   {
      return underspeed_ratio_;
   }

   /**
            * value indicating if fast descend mode is enabled with ramp up and ramp down [0-1]
            */
   public void setFastDescendRatio(float fast_descend_ratio)
   {
      fast_descend_ratio_ = fast_descend_ratio;
   }
   /**
            * value indicating if fast descend mode is enabled with ramp up and ramp down [0-1]
            */
   public float getFastDescendRatio()
   {
      return fast_descend_ratio_;
   }


   public static Supplier<TecsStatusPubSubType> getPubSubType()
   {
      return TecsStatusPubSubType::new;
   }

   @Override
   public Supplier<TopicDataType> getPubSubTypePacket()
   {
      return TecsStatusPubSubType::new;
   }

   @Override
   public boolean epsilonEquals(TecsStatus other, double epsilon)
   {
      if(other == null) return false;
      if(other == this) return true;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_, other.timestamp_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.altitude_sp_, other.altitude_sp_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.altitude_reference_, other.altitude_reference_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.altitude_time_constant_, other.altitude_time_constant_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.height_rate_reference_, other.height_rate_reference_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.height_rate_direct_, other.height_rate_direct_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.height_rate_setpoint_, other.height_rate_setpoint_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.height_rate_, other.height_rate_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.equivalent_airspeed_sp_, other.equivalent_airspeed_sp_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.true_airspeed_sp_, other.true_airspeed_sp_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.true_airspeed_filtered_, other.true_airspeed_filtered_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.true_airspeed_derivative_sp_, other.true_airspeed_derivative_sp_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.true_airspeed_derivative_, other.true_airspeed_derivative_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.true_airspeed_derivative_raw_, other.true_airspeed_derivative_raw_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.total_energy_rate_sp_, other.total_energy_rate_sp_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.total_energy_rate_, other.total_energy_rate_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.total_energy_balance_rate_sp_, other.total_energy_balance_rate_sp_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.total_energy_balance_rate_, other.total_energy_balance_rate_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.throttle_integ_, other.throttle_integ_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.pitch_integ_, other.pitch_integ_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.throttle_sp_, other.throttle_sp_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.pitch_sp_rad_, other.pitch_sp_rad_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.throttle_trim_, other.throttle_trim_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.underspeed_ratio_, other.underspeed_ratio_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.fast_descend_ratio_, other.fast_descend_ratio_, epsilon)) return false;


      return true;
   }

   @Override
   public boolean equals(Object other)
   {
      if(other == null) return false;
      if(other == this) return true;
      if(!(other instanceof TecsStatus)) return false;

      TecsStatus otherMyClass = (TecsStatus) other;

      if(this.timestamp_ != otherMyClass.timestamp_) return false;

      if(this.altitude_sp_ != otherMyClass.altitude_sp_) return false;

      if(this.altitude_reference_ != otherMyClass.altitude_reference_) return false;

      if(this.altitude_time_constant_ != otherMyClass.altitude_time_constant_) return false;

      if(this.height_rate_reference_ != otherMyClass.height_rate_reference_) return false;

      if(this.height_rate_direct_ != otherMyClass.height_rate_direct_) return false;

      if(this.height_rate_setpoint_ != otherMyClass.height_rate_setpoint_) return false;

      if(this.height_rate_ != otherMyClass.height_rate_) return false;

      if(this.equivalent_airspeed_sp_ != otherMyClass.equivalent_airspeed_sp_) return false;

      if(this.true_airspeed_sp_ != otherMyClass.true_airspeed_sp_) return false;

      if(this.true_airspeed_filtered_ != otherMyClass.true_airspeed_filtered_) return false;

      if(this.true_airspeed_derivative_sp_ != otherMyClass.true_airspeed_derivative_sp_) return false;

      if(this.true_airspeed_derivative_ != otherMyClass.true_airspeed_derivative_) return false;

      if(this.true_airspeed_derivative_raw_ != otherMyClass.true_airspeed_derivative_raw_) return false;

      if(this.total_energy_rate_sp_ != otherMyClass.total_energy_rate_sp_) return false;

      if(this.total_energy_rate_ != otherMyClass.total_energy_rate_) return false;

      if(this.total_energy_balance_rate_sp_ != otherMyClass.total_energy_balance_rate_sp_) return false;

      if(this.total_energy_balance_rate_ != otherMyClass.total_energy_balance_rate_) return false;

      if(this.throttle_integ_ != otherMyClass.throttle_integ_) return false;

      if(this.pitch_integ_ != otherMyClass.pitch_integ_) return false;

      if(this.throttle_sp_ != otherMyClass.throttle_sp_) return false;

      if(this.pitch_sp_rad_ != otherMyClass.pitch_sp_rad_) return false;

      if(this.throttle_trim_ != otherMyClass.throttle_trim_) return false;

      if(this.underspeed_ratio_ != otherMyClass.underspeed_ratio_) return false;

      if(this.fast_descend_ratio_ != otherMyClass.fast_descend_ratio_) return false;


      return true;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("TecsStatus {");
      builder.append("timestamp=");
      builder.append(this.timestamp_);      builder.append(", ");
      builder.append("altitude_sp=");
      builder.append(this.altitude_sp_);      builder.append(", ");
      builder.append("altitude_reference=");
      builder.append(this.altitude_reference_);      builder.append(", ");
      builder.append("altitude_time_constant=");
      builder.append(this.altitude_time_constant_);      builder.append(", ");
      builder.append("height_rate_reference=");
      builder.append(this.height_rate_reference_);      builder.append(", ");
      builder.append("height_rate_direct=");
      builder.append(this.height_rate_direct_);      builder.append(", ");
      builder.append("height_rate_setpoint=");
      builder.append(this.height_rate_setpoint_);      builder.append(", ");
      builder.append("height_rate=");
      builder.append(this.height_rate_);      builder.append(", ");
      builder.append("equivalent_airspeed_sp=");
      builder.append(this.equivalent_airspeed_sp_);      builder.append(", ");
      builder.append("true_airspeed_sp=");
      builder.append(this.true_airspeed_sp_);      builder.append(", ");
      builder.append("true_airspeed_filtered=");
      builder.append(this.true_airspeed_filtered_);      builder.append(", ");
      builder.append("true_airspeed_derivative_sp=");
      builder.append(this.true_airspeed_derivative_sp_);      builder.append(", ");
      builder.append("true_airspeed_derivative=");
      builder.append(this.true_airspeed_derivative_);      builder.append(", ");
      builder.append("true_airspeed_derivative_raw=");
      builder.append(this.true_airspeed_derivative_raw_);      builder.append(", ");
      builder.append("total_energy_rate_sp=");
      builder.append(this.total_energy_rate_sp_);      builder.append(", ");
      builder.append("total_energy_rate=");
      builder.append(this.total_energy_rate_);      builder.append(", ");
      builder.append("total_energy_balance_rate_sp=");
      builder.append(this.total_energy_balance_rate_sp_);      builder.append(", ");
      builder.append("total_energy_balance_rate=");
      builder.append(this.total_energy_balance_rate_);      builder.append(", ");
      builder.append("throttle_integ=");
      builder.append(this.throttle_integ_);      builder.append(", ");
      builder.append("pitch_integ=");
      builder.append(this.pitch_integ_);      builder.append(", ");
      builder.append("throttle_sp=");
      builder.append(this.throttle_sp_);      builder.append(", ");
      builder.append("pitch_sp_rad=");
      builder.append(this.pitch_sp_rad_);      builder.append(", ");
      builder.append("throttle_trim=");
      builder.append(this.throttle_trim_);      builder.append(", ");
      builder.append("underspeed_ratio=");
      builder.append(this.underspeed_ratio_);      builder.append(", ");
      builder.append("fast_descend_ratio=");
      builder.append(this.fast_descend_ratio_);
      builder.append("}");
      return builder.toString();
   }
}
