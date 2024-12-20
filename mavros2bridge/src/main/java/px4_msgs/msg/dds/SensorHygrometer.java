package px4_msgs.msg.dds;

import us.ihmc.communication.packets.Packet;
import us.ihmc.euclid.interfaces.Settable;
import us.ihmc.euclid.interfaces.EpsilonComparable;
import java.util.function.Supplier;
import us.ihmc.pubsub.TopicDataType;

public class SensorHygrometer extends Packet<SensorHygrometer> implements Settable<SensorHygrometer>, EpsilonComparable<SensorHygrometer>
{
   /**
            * time since system start (microseconds)
            */
   public long timestamp_;
   public long timestamp_sample_;
   /**
            * unique device ID for the sensor that does not change between power cycles
            */
   public long device_id_;
   /**
            * Temperature provided by sensor (Celsius)
            */
   public float temperature_;
   /**
            * Humidity provided by sensor
            */
   public float humidity_;

   public SensorHygrometer()
   {
   }

   public SensorHygrometer(SensorHygrometer other)
   {
      this();
      set(other);
   }

   public void set(SensorHygrometer other)
   {
      timestamp_ = other.timestamp_;

      timestamp_sample_ = other.timestamp_sample_;

      device_id_ = other.device_id_;

      temperature_ = other.temperature_;

      humidity_ = other.humidity_;

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
            * Temperature provided by sensor (Celsius)
            */
   public void setTemperature(float temperature)
   {
      temperature_ = temperature;
   }
   /**
            * Temperature provided by sensor (Celsius)
            */
   public float getTemperature()
   {
      return temperature_;
   }

   /**
            * Humidity provided by sensor
            */
   public void setHumidity(float humidity)
   {
      humidity_ = humidity;
   }
   /**
            * Humidity provided by sensor
            */
   public float getHumidity()
   {
      return humidity_;
   }


   public static Supplier<SensorHygrometerPubSubType> getPubSubType()
   {
      return SensorHygrometerPubSubType::new;
   }

   @Override
   public Supplier<TopicDataType> getPubSubTypePacket()
   {
      return SensorHygrometerPubSubType::new;
   }

   @Override
   public boolean epsilonEquals(SensorHygrometer other, double epsilon)
   {
      if(other == null) return false;
      if(other == this) return true;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_, other.timestamp_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_sample_, other.timestamp_sample_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.device_id_, other.device_id_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.temperature_, other.temperature_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.humidity_, other.humidity_, epsilon)) return false;


      return true;
   }

   @Override
   public boolean equals(Object other)
   {
      if(other == null) return false;
      if(other == this) return true;
      if(!(other instanceof SensorHygrometer)) return false;

      SensorHygrometer otherMyClass = (SensorHygrometer) other;

      if(this.timestamp_ != otherMyClass.timestamp_) return false;

      if(this.timestamp_sample_ != otherMyClass.timestamp_sample_) return false;

      if(this.device_id_ != otherMyClass.device_id_) return false;

      if(this.temperature_ != otherMyClass.temperature_) return false;

      if(this.humidity_ != otherMyClass.humidity_) return false;


      return true;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("SensorHygrometer {");
      builder.append("timestamp=");
      builder.append(this.timestamp_);      builder.append(", ");
      builder.append("timestamp_sample=");
      builder.append(this.timestamp_sample_);      builder.append(", ");
      builder.append("device_id=");
      builder.append(this.device_id_);      builder.append(", ");
      builder.append("temperature=");
      builder.append(this.temperature_);      builder.append(", ");
      builder.append("humidity=");
      builder.append(this.humidity_);
      builder.append("}");
      return builder.toString();
   }
}
