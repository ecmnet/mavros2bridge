package px4_msgs.msg.dds;

import us.ihmc.communication.packets.Packet;
import us.ihmc.euclid.interfaces.Settable;
import us.ihmc.euclid.interfaces.EpsilonComparable;
import java.util.function.Supplier;
import us.ihmc.pubsub.TopicDataType;

public class AirspeedValidated extends Packet<AirspeedValidated> implements Settable<AirspeedValidated>, EpsilonComparable<AirspeedValidated>
{
   /**
            * time since system start (microseconds)
            */
   public long timestamp_;
   /**
            * indicated airspeed in m/s (IAS), set to NAN if invalid
            */
   public float indicated_airspeed_m_s_;
   /**
            * calibrated airspeed in m/s (CAS, accounts for instrumentation errors), set to NAN if invalid
            */
   public float calibrated_airspeed_m_s_;
   /**
            * true filtered airspeed in m/s (TAS), set to NAN if invalid
            */
   public float true_airspeed_m_s_;
   /**
            * CAS calculated from groundspeed - windspeed, where windspeed is estimated based on a zero-sideslip assumption, set to NAN if invalid
            */
   public float calibrated_ground_minus_wind_m_s_;
   /**
            * TAS calculated from groundspeed - windspeed, where windspeed is estimated based on a zero-sideslip assumption, set to NAN if invalid
            */
   public float true_ground_minus_wind_m_s_;
   /**
            * True if data from at least one airspeed sensor is declared valid.
            */
   public boolean airspeed_sensor_measurement_valid_;
   /**
            * 1-3: airspeed sensor index, 0: groundspeed-windspeed, -1: airspeed invalid
            */
   public byte selected_airspeed_index_;
   /**
            * filtered indicated airspeed derivative [m/s/s]
            */
   public float airspeed_derivative_filtered_;
   /**
            * filtered fixed-wing throttle [-]
            */
   public float throttle_filtered_;
   /**
            * filtered pitch [rad]
            */
   public float pitch_filtered_;

   public AirspeedValidated()
   {
   }

   public AirspeedValidated(AirspeedValidated other)
   {
      this();
      set(other);
   }

   public void set(AirspeedValidated other)
   {
      timestamp_ = other.timestamp_;

      indicated_airspeed_m_s_ = other.indicated_airspeed_m_s_;

      calibrated_airspeed_m_s_ = other.calibrated_airspeed_m_s_;

      true_airspeed_m_s_ = other.true_airspeed_m_s_;

      calibrated_ground_minus_wind_m_s_ = other.calibrated_ground_minus_wind_m_s_;

      true_ground_minus_wind_m_s_ = other.true_ground_minus_wind_m_s_;

      airspeed_sensor_measurement_valid_ = other.airspeed_sensor_measurement_valid_;

      selected_airspeed_index_ = other.selected_airspeed_index_;

      airspeed_derivative_filtered_ = other.airspeed_derivative_filtered_;

      throttle_filtered_ = other.throttle_filtered_;

      pitch_filtered_ = other.pitch_filtered_;

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
            * indicated airspeed in m/s (IAS), set to NAN if invalid
            */
   public void setIndicatedAirspeedMS(float indicated_airspeed_m_s)
   {
      indicated_airspeed_m_s_ = indicated_airspeed_m_s;
   }
   /**
            * indicated airspeed in m/s (IAS), set to NAN if invalid
            */
   public float getIndicatedAirspeedMS()
   {
      return indicated_airspeed_m_s_;
   }

   /**
            * calibrated airspeed in m/s (CAS, accounts for instrumentation errors), set to NAN if invalid
            */
   public void setCalibratedAirspeedMS(float calibrated_airspeed_m_s)
   {
      calibrated_airspeed_m_s_ = calibrated_airspeed_m_s;
   }
   /**
            * calibrated airspeed in m/s (CAS, accounts for instrumentation errors), set to NAN if invalid
            */
   public float getCalibratedAirspeedMS()
   {
      return calibrated_airspeed_m_s_;
   }

   /**
            * true filtered airspeed in m/s (TAS), set to NAN if invalid
            */
   public void setTrueAirspeedMS(float true_airspeed_m_s)
   {
      true_airspeed_m_s_ = true_airspeed_m_s;
   }
   /**
            * true filtered airspeed in m/s (TAS), set to NAN if invalid
            */
   public float getTrueAirspeedMS()
   {
      return true_airspeed_m_s_;
   }

   /**
            * CAS calculated from groundspeed - windspeed, where windspeed is estimated based on a zero-sideslip assumption, set to NAN if invalid
            */
   public void setCalibratedGroundMinusWindMS(float calibrated_ground_minus_wind_m_s)
   {
      calibrated_ground_minus_wind_m_s_ = calibrated_ground_minus_wind_m_s;
   }
   /**
            * CAS calculated from groundspeed - windspeed, where windspeed is estimated based on a zero-sideslip assumption, set to NAN if invalid
            */
   public float getCalibratedGroundMinusWindMS()
   {
      return calibrated_ground_minus_wind_m_s_;
   }

   /**
            * TAS calculated from groundspeed - windspeed, where windspeed is estimated based on a zero-sideslip assumption, set to NAN if invalid
            */
   public void setTrueGroundMinusWindMS(float true_ground_minus_wind_m_s)
   {
      true_ground_minus_wind_m_s_ = true_ground_minus_wind_m_s;
   }
   /**
            * TAS calculated from groundspeed - windspeed, where windspeed is estimated based on a zero-sideslip assumption, set to NAN if invalid
            */
   public float getTrueGroundMinusWindMS()
   {
      return true_ground_minus_wind_m_s_;
   }

   /**
            * True if data from at least one airspeed sensor is declared valid.
            */
   public void setAirspeedSensorMeasurementValid(boolean airspeed_sensor_measurement_valid)
   {
      airspeed_sensor_measurement_valid_ = airspeed_sensor_measurement_valid;
   }
   /**
            * True if data from at least one airspeed sensor is declared valid.
            */
   public boolean getAirspeedSensorMeasurementValid()
   {
      return airspeed_sensor_measurement_valid_;
   }

   /**
            * 1-3: airspeed sensor index, 0: groundspeed-windspeed, -1: airspeed invalid
            */
   public void setSelectedAirspeedIndex(byte selected_airspeed_index)
   {
      selected_airspeed_index_ = selected_airspeed_index;
   }
   /**
            * 1-3: airspeed sensor index, 0: groundspeed-windspeed, -1: airspeed invalid
            */
   public byte getSelectedAirspeedIndex()
   {
      return selected_airspeed_index_;
   }

   /**
            * filtered indicated airspeed derivative [m/s/s]
            */
   public void setAirspeedDerivativeFiltered(float airspeed_derivative_filtered)
   {
      airspeed_derivative_filtered_ = airspeed_derivative_filtered;
   }
   /**
            * filtered indicated airspeed derivative [m/s/s]
            */
   public float getAirspeedDerivativeFiltered()
   {
      return airspeed_derivative_filtered_;
   }

   /**
            * filtered fixed-wing throttle [-]
            */
   public void setThrottleFiltered(float throttle_filtered)
   {
      throttle_filtered_ = throttle_filtered;
   }
   /**
            * filtered fixed-wing throttle [-]
            */
   public float getThrottleFiltered()
   {
      return throttle_filtered_;
   }

   /**
            * filtered pitch [rad]
            */
   public void setPitchFiltered(float pitch_filtered)
   {
      pitch_filtered_ = pitch_filtered;
   }
   /**
            * filtered pitch [rad]
            */
   public float getPitchFiltered()
   {
      return pitch_filtered_;
   }


   public static Supplier<AirspeedValidatedPubSubType> getPubSubType()
   {
      return AirspeedValidatedPubSubType::new;
   }

   @Override
   public Supplier<TopicDataType> getPubSubTypePacket()
   {
      return AirspeedValidatedPubSubType::new;
   }

   @Override
   public boolean epsilonEquals(AirspeedValidated other, double epsilon)
   {
      if(other == null) return false;
      if(other == this) return true;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_, other.timestamp_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.indicated_airspeed_m_s_, other.indicated_airspeed_m_s_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.calibrated_airspeed_m_s_, other.calibrated_airspeed_m_s_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.true_airspeed_m_s_, other.true_airspeed_m_s_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.calibrated_ground_minus_wind_m_s_, other.calibrated_ground_minus_wind_m_s_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.true_ground_minus_wind_m_s_, other.true_ground_minus_wind_m_s_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.airspeed_sensor_measurement_valid_, other.airspeed_sensor_measurement_valid_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.selected_airspeed_index_, other.selected_airspeed_index_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.airspeed_derivative_filtered_, other.airspeed_derivative_filtered_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.throttle_filtered_, other.throttle_filtered_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.pitch_filtered_, other.pitch_filtered_, epsilon)) return false;


      return true;
   }

   @Override
   public boolean equals(Object other)
   {
      if(other == null) return false;
      if(other == this) return true;
      if(!(other instanceof AirspeedValidated)) return false;

      AirspeedValidated otherMyClass = (AirspeedValidated) other;

      if(this.timestamp_ != otherMyClass.timestamp_) return false;

      if(this.indicated_airspeed_m_s_ != otherMyClass.indicated_airspeed_m_s_) return false;

      if(this.calibrated_airspeed_m_s_ != otherMyClass.calibrated_airspeed_m_s_) return false;

      if(this.true_airspeed_m_s_ != otherMyClass.true_airspeed_m_s_) return false;

      if(this.calibrated_ground_minus_wind_m_s_ != otherMyClass.calibrated_ground_minus_wind_m_s_) return false;

      if(this.true_ground_minus_wind_m_s_ != otherMyClass.true_ground_minus_wind_m_s_) return false;

      if(this.airspeed_sensor_measurement_valid_ != otherMyClass.airspeed_sensor_measurement_valid_) return false;

      if(this.selected_airspeed_index_ != otherMyClass.selected_airspeed_index_) return false;

      if(this.airspeed_derivative_filtered_ != otherMyClass.airspeed_derivative_filtered_) return false;

      if(this.throttle_filtered_ != otherMyClass.throttle_filtered_) return false;

      if(this.pitch_filtered_ != otherMyClass.pitch_filtered_) return false;


      return true;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("AirspeedValidated {");
      builder.append("timestamp=");
      builder.append(this.timestamp_);      builder.append(", ");
      builder.append("indicated_airspeed_m_s=");
      builder.append(this.indicated_airspeed_m_s_);      builder.append(", ");
      builder.append("calibrated_airspeed_m_s=");
      builder.append(this.calibrated_airspeed_m_s_);      builder.append(", ");
      builder.append("true_airspeed_m_s=");
      builder.append(this.true_airspeed_m_s_);      builder.append(", ");
      builder.append("calibrated_ground_minus_wind_m_s=");
      builder.append(this.calibrated_ground_minus_wind_m_s_);      builder.append(", ");
      builder.append("true_ground_minus_wind_m_s=");
      builder.append(this.true_ground_minus_wind_m_s_);      builder.append(", ");
      builder.append("airspeed_sensor_measurement_valid=");
      builder.append(this.airspeed_sensor_measurement_valid_);      builder.append(", ");
      builder.append("selected_airspeed_index=");
      builder.append(this.selected_airspeed_index_);      builder.append(", ");
      builder.append("airspeed_derivative_filtered=");
      builder.append(this.airspeed_derivative_filtered_);      builder.append(", ");
      builder.append("throttle_filtered=");
      builder.append(this.throttle_filtered_);      builder.append(", ");
      builder.append("pitch_filtered=");
      builder.append(this.pitch_filtered_);
      builder.append("}");
      return builder.toString();
   }
}
