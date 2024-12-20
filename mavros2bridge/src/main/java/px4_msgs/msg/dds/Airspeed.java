package px4_msgs.msg.dds;

import us.ihmc.communication.packets.Packet;
import us.ihmc.euclid.interfaces.Settable;
import us.ihmc.euclid.interfaces.EpsilonComparable;
import java.util.function.Supplier;
import us.ihmc.pubsub.TopicDataType;

public class Airspeed extends Packet<Airspeed> implements Settable<Airspeed>, EpsilonComparable<Airspeed>
{
   /**
            * time since system start (microseconds)
            */
   public long timestamp_;
   public long timestamp_sample_;
   /**
            * indicated airspeed in m/s
            */
   public float indicated_airspeed_m_s_;
   /**
            * true filtered airspeed in m/s
            */
   public float true_airspeed_m_s_;
   /**
            * air temperature in degrees Celsius, -1000 if unknown
            */
   public float air_temperature_celsius_;
   /**
            * confidence value from 0 to 1 for this sensor
            */
   public float confidence_;

   public Airspeed()
   {
   }

   public Airspeed(Airspeed other)
   {
      this();
      set(other);
   }

   public void set(Airspeed other)
   {
      timestamp_ = other.timestamp_;

      timestamp_sample_ = other.timestamp_sample_;

      indicated_airspeed_m_s_ = other.indicated_airspeed_m_s_;

      true_airspeed_m_s_ = other.true_airspeed_m_s_;

      air_temperature_celsius_ = other.air_temperature_celsius_;

      confidence_ = other.confidence_;

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

   public void setTimestampSample(long timestamp_sample)
   {
      timestamp_sample_ = timestamp_sample;
   }
   public long getTimestampSample()
   {
      return timestamp_sample_;
   }

   /**
            * indicated airspeed in m/s
            */
   public void setIndicatedAirspeedMS(float indicated_airspeed_m_s)
   {
      indicated_airspeed_m_s_ = indicated_airspeed_m_s;
   }
   /**
            * indicated airspeed in m/s
            */
   public float getIndicatedAirspeedMS()
   {
      return indicated_airspeed_m_s_;
   }

   /**
            * true filtered airspeed in m/s
            */
   public void setTrueAirspeedMS(float true_airspeed_m_s)
   {
      true_airspeed_m_s_ = true_airspeed_m_s;
   }
   /**
            * true filtered airspeed in m/s
            */
   public float getTrueAirspeedMS()
   {
      return true_airspeed_m_s_;
   }

   /**
            * air temperature in degrees Celsius, -1000 if unknown
            */
   public void setAirTemperatureCelsius(float air_temperature_celsius)
   {
      air_temperature_celsius_ = air_temperature_celsius;
   }
   /**
            * air temperature in degrees Celsius, -1000 if unknown
            */
   public float getAirTemperatureCelsius()
   {
      return air_temperature_celsius_;
   }

   /**
            * confidence value from 0 to 1 for this sensor
            */
   public void setConfidence(float confidence)
   {
      confidence_ = confidence;
   }
   /**
            * confidence value from 0 to 1 for this sensor
            */
   public float getConfidence()
   {
      return confidence_;
   }


   public static Supplier<AirspeedPubSubType> getPubSubType()
   {
      return AirspeedPubSubType::new;
   }

   @Override
   public Supplier<TopicDataType> getPubSubTypePacket()
   {
      return AirspeedPubSubType::new;
   }

   @Override
   public boolean epsilonEquals(Airspeed other, double epsilon)
   {
      if(other == null) return false;
      if(other == this) return true;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_, other.timestamp_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_sample_, other.timestamp_sample_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.indicated_airspeed_m_s_, other.indicated_airspeed_m_s_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.true_airspeed_m_s_, other.true_airspeed_m_s_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.air_temperature_celsius_, other.air_temperature_celsius_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.confidence_, other.confidence_, epsilon)) return false;


      return true;
   }

   @Override
   public boolean equals(Object other)
   {
      if(other == null) return false;
      if(other == this) return true;
      if(!(other instanceof Airspeed)) return false;

      Airspeed otherMyClass = (Airspeed) other;

      if(this.timestamp_ != otherMyClass.timestamp_) return false;

      if(this.timestamp_sample_ != otherMyClass.timestamp_sample_) return false;

      if(this.indicated_airspeed_m_s_ != otherMyClass.indicated_airspeed_m_s_) return false;

      if(this.true_airspeed_m_s_ != otherMyClass.true_airspeed_m_s_) return false;

      if(this.air_temperature_celsius_ != otherMyClass.air_temperature_celsius_) return false;

      if(this.confidence_ != otherMyClass.confidence_) return false;


      return true;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("Airspeed {");
      builder.append("timestamp=");
      builder.append(this.timestamp_);      builder.append(", ");
      builder.append("timestamp_sample=");
      builder.append(this.timestamp_sample_);      builder.append(", ");
      builder.append("indicated_airspeed_m_s=");
      builder.append(this.indicated_airspeed_m_s_);      builder.append(", ");
      builder.append("true_airspeed_m_s=");
      builder.append(this.true_airspeed_m_s_);      builder.append(", ");
      builder.append("air_temperature_celsius=");
      builder.append(this.air_temperature_celsius_);      builder.append(", ");
      builder.append("confidence=");
      builder.append(this.confidence_);
      builder.append("}");
      return builder.toString();
   }
}
