package px4_msgs.msg.dds;

import us.ihmc.communication.packets.Packet;
import us.ihmc.euclid.interfaces.Settable;
import us.ihmc.euclid.interfaces.EpsilonComparable;
import java.util.function.Supplier;
import us.ihmc.pubsub.TopicDataType;

public class SensorBaro extends Packet<SensorBaro> implements Settable<SensorBaro>, EpsilonComparable<SensorBaro>
{
   public static final byte ORB_QUEUE_LENGTH = (byte) 4;/**
            * time since system start (microseconds)
            */
   public long timestamp_;
   public long timestamp_sample_;
   /**
            * unique device ID for the sensor that does not change between power cycles
            */
   public long device_id_;
   /**
            * static pressure measurement in Pascals
            */
   public float pressure_;
   /**
            * temperature in degrees Celsius
            */
   public float temperature_;
   public long error_count_;

   public SensorBaro()
   {
   }

   public SensorBaro(SensorBaro other)
   {
      this();
      set(other);
   }

   public void set(SensorBaro other)
   {
      timestamp_ = other.timestamp_;

      timestamp_sample_ = other.timestamp_sample_;

      device_id_ = other.device_id_;

      pressure_ = other.pressure_;

      temperature_ = other.temperature_;

      error_count_ = other.error_count_;

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
            * static pressure measurement in Pascals
            */
   public void setPressure(float pressure)
   {
      pressure_ = pressure;
   }
   /**
            * static pressure measurement in Pascals
            */
   public float getPressure()
   {
      return pressure_;
   }

   /**
            * temperature in degrees Celsius
            */
   public void setTemperature(float temperature)
   {
      temperature_ = temperature;
   }
   /**
            * temperature in degrees Celsius
            */
   public float getTemperature()
   {
      return temperature_;
   }

   public void setErrorCount(long error_count)
   {
      error_count_ = error_count;
   }
   public long getErrorCount()
   {
      return error_count_;
   }


   public static Supplier<SensorBaroPubSubType> getPubSubType()
   {
      return SensorBaroPubSubType::new;
   }

   @Override
   public Supplier<TopicDataType> getPubSubTypePacket()
   {
      return SensorBaroPubSubType::new;
   }

   @Override
   public boolean epsilonEquals(SensorBaro other, double epsilon)
   {
      if(other == null) return false;
      if(other == this) return true;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_, other.timestamp_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_sample_, other.timestamp_sample_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.device_id_, other.device_id_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.pressure_, other.pressure_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.temperature_, other.temperature_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.error_count_, other.error_count_, epsilon)) return false;


      return true;
   }

   @Override
   public boolean equals(Object other)
   {
      if(other == null) return false;
      if(other == this) return true;
      if(!(other instanceof SensorBaro)) return false;

      SensorBaro otherMyClass = (SensorBaro) other;

      if(this.timestamp_ != otherMyClass.timestamp_) return false;

      if(this.timestamp_sample_ != otherMyClass.timestamp_sample_) return false;

      if(this.device_id_ != otherMyClass.device_id_) return false;

      if(this.pressure_ != otherMyClass.pressure_) return false;

      if(this.temperature_ != otherMyClass.temperature_) return false;

      if(this.error_count_ != otherMyClass.error_count_) return false;


      return true;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("SensorBaro {");
      builder.append("timestamp=");
      builder.append(this.timestamp_);      builder.append(", ");
      builder.append("timestamp_sample=");
      builder.append(this.timestamp_sample_);      builder.append(", ");
      builder.append("device_id=");
      builder.append(this.device_id_);      builder.append(", ");
      builder.append("pressure=");
      builder.append(this.pressure_);      builder.append(", ");
      builder.append("temperature=");
      builder.append(this.temperature_);      builder.append(", ");
      builder.append("error_count=");
      builder.append(this.error_count_);
      builder.append("}");
      return builder.toString();
   }
}
