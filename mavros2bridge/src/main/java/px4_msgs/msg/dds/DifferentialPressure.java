package px4_msgs.msg.dds;

import us.ihmc.communication.packets.Packet;
import us.ihmc.euclid.interfaces.Settable;
import us.ihmc.euclid.interfaces.EpsilonComparable;
import java.util.function.Supplier;
import us.ihmc.pubsub.TopicDataType;

public class DifferentialPressure extends Packet<DifferentialPressure> implements Settable<DifferentialPressure>, EpsilonComparable<DifferentialPressure>
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
            * differential pressure reading in Pascals (may be negative)
            */
   public float differential_pressure_pa_;
   /**
            * Temperature provided by sensor in degrees Celsius, NAN if unknown
            */
   public float temperature_;
   /**
            * Number of errors detected by driver
            */
   public long error_count_;

   public DifferentialPressure()
   {
   }

   public DifferentialPressure(DifferentialPressure other)
   {
      this();
      set(other);
   }

   public void set(DifferentialPressure other)
   {
      timestamp_ = other.timestamp_;

      timestamp_sample_ = other.timestamp_sample_;

      device_id_ = other.device_id_;

      differential_pressure_pa_ = other.differential_pressure_pa_;

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
            * differential pressure reading in Pascals (may be negative)
            */
   public void setDifferentialPressurePa(float differential_pressure_pa)
   {
      differential_pressure_pa_ = differential_pressure_pa;
   }
   /**
            * differential pressure reading in Pascals (may be negative)
            */
   public float getDifferentialPressurePa()
   {
      return differential_pressure_pa_;
   }

   /**
            * Temperature provided by sensor in degrees Celsius, NAN if unknown
            */
   public void setTemperature(float temperature)
   {
      temperature_ = temperature;
   }
   /**
            * Temperature provided by sensor in degrees Celsius, NAN if unknown
            */
   public float getTemperature()
   {
      return temperature_;
   }

   /**
            * Number of errors detected by driver
            */
   public void setErrorCount(long error_count)
   {
      error_count_ = error_count;
   }
   /**
            * Number of errors detected by driver
            */
   public long getErrorCount()
   {
      return error_count_;
   }


   public static Supplier<DifferentialPressurePubSubType> getPubSubType()
   {
      return DifferentialPressurePubSubType::new;
   }

   @Override
   public Supplier<TopicDataType> getPubSubTypePacket()
   {
      return DifferentialPressurePubSubType::new;
   }

   @Override
   public boolean epsilonEquals(DifferentialPressure other, double epsilon)
   {
      if(other == null) return false;
      if(other == this) return true;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_, other.timestamp_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_sample_, other.timestamp_sample_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.device_id_, other.device_id_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.differential_pressure_pa_, other.differential_pressure_pa_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.temperature_, other.temperature_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.error_count_, other.error_count_, epsilon)) return false;


      return true;
   }

   @Override
   public boolean equals(Object other)
   {
      if(other == null) return false;
      if(other == this) return true;
      if(!(other instanceof DifferentialPressure)) return false;

      DifferentialPressure otherMyClass = (DifferentialPressure) other;

      if(this.timestamp_ != otherMyClass.timestamp_) return false;

      if(this.timestamp_sample_ != otherMyClass.timestamp_sample_) return false;

      if(this.device_id_ != otherMyClass.device_id_) return false;

      if(this.differential_pressure_pa_ != otherMyClass.differential_pressure_pa_) return false;

      if(this.temperature_ != otherMyClass.temperature_) return false;

      if(this.error_count_ != otherMyClass.error_count_) return false;


      return true;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("DifferentialPressure {");
      builder.append("timestamp=");
      builder.append(this.timestamp_);      builder.append(", ");
      builder.append("timestamp_sample=");
      builder.append(this.timestamp_sample_);      builder.append(", ");
      builder.append("device_id=");
      builder.append(this.device_id_);      builder.append(", ");
      builder.append("differential_pressure_pa=");
      builder.append(this.differential_pressure_pa_);      builder.append(", ");
      builder.append("temperature=");
      builder.append(this.temperature_);      builder.append(", ");
      builder.append("error_count=");
      builder.append(this.error_count_);
      builder.append("}");
      return builder.toString();
   }
}
