package px4_msgs.msg.dds;

import us.ihmc.communication.packets.Packet;
import us.ihmc.euclid.interfaces.Settable;
import us.ihmc.euclid.interfaces.EpsilonComparable;
import java.util.function.Supplier;
import us.ihmc.pubsub.TopicDataType;

public class AirspeedWind extends Packet<AirspeedWind> implements Settable<AirspeedWind>, EpsilonComparable<AirspeedWind>
{
   /**
          * wind estimate only based on synthetic sideslip fusion
          */
   public static final byte SOURCE_AS_BETA_ONLY = (byte) 0;
   /**
          * combined synthetic sideslip and airspeed fusion (data from first airspeed sensor)
          */
   public static final byte SOURCE_AS_SENSOR_1 = (byte) 1;
   /**
          * combined synthetic sideslip and airspeed fusion (data from second airspeed sensor)
          */
   public static final byte SOURCE_AS_SENSOR_2 = (byte) 2;
   /**
          * combined synthetic sideslip and airspeed fusion (data from third airspeed sensor)
          */
   public static final byte SOURCE_AS_SENSOR_3 = (byte) 3;
   /**
            * time since system start (microseconds)
            */
   public long timestamp_;
   /**
            * the timestamp of the raw data (microseconds)
            */
   public long timestamp_sample_;
   /**
            * Wind component in north / X direction (m/sec)
            */
   public float windspeed_north_;
   /**
            * Wind component in east / Y direction (m/sec)
            */
   public float windspeed_east_;
   /**
            * Wind estimate error variance in north / X direction (m/sec)**2 - set to zero (no uncertainty) if not estimated
            */
   public float variance_north_;
   /**
            * Wind estimate error variance in east / Y direction (m/sec)**2 - set to zero (no uncertainty) if not estimated
            */
   public float variance_east_;
   /**
            * True airspeed innovation
            */
   public float tas_innov_;
   /**
            * True airspeed innovation variance
            */
   public float tas_innov_var_;
   /**
            * Estimated true airspeed scale factor (not validated)
            */
   public float tas_scale_raw_;
   /**
            * True airspeed scale factor variance
            */
   public float tas_scale_raw_var_;
   /**
            * Estimated true airspeed scale factor after validation
            */
   public float tas_scale_validated_;
   /**
            * Sideslip measurement innovation
            */
   public float beta_innov_;
   /**
            * Sideslip measurement innovation variance
            */
   public float beta_innov_var_;
   /**
            * source of wind estimate
            */
   public byte source_;

   public AirspeedWind()
   {
   }

   public AirspeedWind(AirspeedWind other)
   {
      this();
      set(other);
   }

   public void set(AirspeedWind other)
   {
      timestamp_ = other.timestamp_;

      timestamp_sample_ = other.timestamp_sample_;

      windspeed_north_ = other.windspeed_north_;

      windspeed_east_ = other.windspeed_east_;

      variance_north_ = other.variance_north_;

      variance_east_ = other.variance_east_;

      tas_innov_ = other.tas_innov_;

      tas_innov_var_ = other.tas_innov_var_;

      tas_scale_raw_ = other.tas_scale_raw_;

      tas_scale_raw_var_ = other.tas_scale_raw_var_;

      tas_scale_validated_ = other.tas_scale_validated_;

      beta_innov_ = other.beta_innov_;

      beta_innov_var_ = other.beta_innov_var_;

      source_ = other.source_;

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
            * Wind component in north / X direction (m/sec)
            */
   public void setWindspeedNorth(float windspeed_north)
   {
      windspeed_north_ = windspeed_north;
   }
   /**
            * Wind component in north / X direction (m/sec)
            */
   public float getWindspeedNorth()
   {
      return windspeed_north_;
   }

   /**
            * Wind component in east / Y direction (m/sec)
            */
   public void setWindspeedEast(float windspeed_east)
   {
      windspeed_east_ = windspeed_east;
   }
   /**
            * Wind component in east / Y direction (m/sec)
            */
   public float getWindspeedEast()
   {
      return windspeed_east_;
   }

   /**
            * Wind estimate error variance in north / X direction (m/sec)**2 - set to zero (no uncertainty) if not estimated
            */
   public void setVarianceNorth(float variance_north)
   {
      variance_north_ = variance_north;
   }
   /**
            * Wind estimate error variance in north / X direction (m/sec)**2 - set to zero (no uncertainty) if not estimated
            */
   public float getVarianceNorth()
   {
      return variance_north_;
   }

   /**
            * Wind estimate error variance in east / Y direction (m/sec)**2 - set to zero (no uncertainty) if not estimated
            */
   public void setVarianceEast(float variance_east)
   {
      variance_east_ = variance_east;
   }
   /**
            * Wind estimate error variance in east / Y direction (m/sec)**2 - set to zero (no uncertainty) if not estimated
            */
   public float getVarianceEast()
   {
      return variance_east_;
   }

   /**
            * True airspeed innovation
            */
   public void setTasInnov(float tas_innov)
   {
      tas_innov_ = tas_innov;
   }
   /**
            * True airspeed innovation
            */
   public float getTasInnov()
   {
      return tas_innov_;
   }

   /**
            * True airspeed innovation variance
            */
   public void setTasInnovVar(float tas_innov_var)
   {
      tas_innov_var_ = tas_innov_var;
   }
   /**
            * True airspeed innovation variance
            */
   public float getTasInnovVar()
   {
      return tas_innov_var_;
   }

   /**
            * Estimated true airspeed scale factor (not validated)
            */
   public void setTasScaleRaw(float tas_scale_raw)
   {
      tas_scale_raw_ = tas_scale_raw;
   }
   /**
            * Estimated true airspeed scale factor (not validated)
            */
   public float getTasScaleRaw()
   {
      return tas_scale_raw_;
   }

   /**
            * True airspeed scale factor variance
            */
   public void setTasScaleRawVar(float tas_scale_raw_var)
   {
      tas_scale_raw_var_ = tas_scale_raw_var;
   }
   /**
            * True airspeed scale factor variance
            */
   public float getTasScaleRawVar()
   {
      return tas_scale_raw_var_;
   }

   /**
            * Estimated true airspeed scale factor after validation
            */
   public void setTasScaleValidated(float tas_scale_validated)
   {
      tas_scale_validated_ = tas_scale_validated;
   }
   /**
            * Estimated true airspeed scale factor after validation
            */
   public float getTasScaleValidated()
   {
      return tas_scale_validated_;
   }

   /**
            * Sideslip measurement innovation
            */
   public void setBetaInnov(float beta_innov)
   {
      beta_innov_ = beta_innov;
   }
   /**
            * Sideslip measurement innovation
            */
   public float getBetaInnov()
   {
      return beta_innov_;
   }

   /**
            * Sideslip measurement innovation variance
            */
   public void setBetaInnovVar(float beta_innov_var)
   {
      beta_innov_var_ = beta_innov_var;
   }
   /**
            * Sideslip measurement innovation variance
            */
   public float getBetaInnovVar()
   {
      return beta_innov_var_;
   }

   /**
            * source of wind estimate
            */
   public void setSource(byte source)
   {
      source_ = source;
   }
   /**
            * source of wind estimate
            */
   public int getSource()
   {
      return source_;
   }


   public static Supplier<AirspeedWindPubSubType> getPubSubType()
   {
      return AirspeedWindPubSubType::new;
   }

   @Override
   public Supplier<TopicDataType> getPubSubTypePacket()
   {
      return AirspeedWindPubSubType::new;
   }

   @Override
   public boolean epsilonEquals(AirspeedWind other, double epsilon)
   {
      if(other == null) return false;
      if(other == this) return true;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_, other.timestamp_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_sample_, other.timestamp_sample_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.windspeed_north_, other.windspeed_north_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.windspeed_east_, other.windspeed_east_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.variance_north_, other.variance_north_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.variance_east_, other.variance_east_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.tas_innov_, other.tas_innov_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.tas_innov_var_, other.tas_innov_var_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.tas_scale_raw_, other.tas_scale_raw_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.tas_scale_raw_var_, other.tas_scale_raw_var_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.tas_scale_validated_, other.tas_scale_validated_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.beta_innov_, other.beta_innov_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.beta_innov_var_, other.beta_innov_var_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.source_, other.source_, epsilon)) return false;


      return true;
   }

   @Override
   public boolean equals(Object other)
   {
      if(other == null) return false;
      if(other == this) return true;
      if(!(other instanceof AirspeedWind)) return false;

      AirspeedWind otherMyClass = (AirspeedWind) other;

      if(this.timestamp_ != otherMyClass.timestamp_) return false;

      if(this.timestamp_sample_ != otherMyClass.timestamp_sample_) return false;

      if(this.windspeed_north_ != otherMyClass.windspeed_north_) return false;

      if(this.windspeed_east_ != otherMyClass.windspeed_east_) return false;

      if(this.variance_north_ != otherMyClass.variance_north_) return false;

      if(this.variance_east_ != otherMyClass.variance_east_) return false;

      if(this.tas_innov_ != otherMyClass.tas_innov_) return false;

      if(this.tas_innov_var_ != otherMyClass.tas_innov_var_) return false;

      if(this.tas_scale_raw_ != otherMyClass.tas_scale_raw_) return false;

      if(this.tas_scale_raw_var_ != otherMyClass.tas_scale_raw_var_) return false;

      if(this.tas_scale_validated_ != otherMyClass.tas_scale_validated_) return false;

      if(this.beta_innov_ != otherMyClass.beta_innov_) return false;

      if(this.beta_innov_var_ != otherMyClass.beta_innov_var_) return false;

      if(this.source_ != otherMyClass.source_) return false;


      return true;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("AirspeedWind {");
      builder.append("timestamp=");
      builder.append(this.timestamp_);      builder.append(", ");
      builder.append("timestamp_sample=");
      builder.append(this.timestamp_sample_);      builder.append(", ");
      builder.append("windspeed_north=");
      builder.append(this.windspeed_north_);      builder.append(", ");
      builder.append("windspeed_east=");
      builder.append(this.windspeed_east_);      builder.append(", ");
      builder.append("variance_north=");
      builder.append(this.variance_north_);      builder.append(", ");
      builder.append("variance_east=");
      builder.append(this.variance_east_);      builder.append(", ");
      builder.append("tas_innov=");
      builder.append(this.tas_innov_);      builder.append(", ");
      builder.append("tas_innov_var=");
      builder.append(this.tas_innov_var_);      builder.append(", ");
      builder.append("tas_scale_raw=");
      builder.append(this.tas_scale_raw_);      builder.append(", ");
      builder.append("tas_scale_raw_var=");
      builder.append(this.tas_scale_raw_var_);      builder.append(", ");
      builder.append("tas_scale_validated=");
      builder.append(this.tas_scale_validated_);      builder.append(", ");
      builder.append("beta_innov=");
      builder.append(this.beta_innov_);      builder.append(", ");
      builder.append("beta_innov_var=");
      builder.append(this.beta_innov_var_);      builder.append(", ");
      builder.append("source=");
      builder.append(this.source_);
      builder.append("}");
      return builder.toString();
   }
}
