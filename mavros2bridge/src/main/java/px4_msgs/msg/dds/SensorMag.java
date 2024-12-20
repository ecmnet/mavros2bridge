package px4_msgs.msg.dds;

import us.ihmc.communication.packets.Packet;
import us.ihmc.euclid.interfaces.Settable;
import us.ihmc.euclid.interfaces.EpsilonComparable;
import java.util.function.Supplier;
import us.ihmc.pubsub.TopicDataType;

public class SensorMag extends Packet<SensorMag> implements Settable<SensorMag>, EpsilonComparable<SensorMag>
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
            * magnetic field in the FRD board frame X-axis in Gauss
            */
   public float x_;
   /**
            * magnetic field in the FRD board frame Y-axis in Gauss
            */
   public float y_;
   /**
            * magnetic field in the FRD board frame Z-axis in Gauss
            */
   public float z_;
   /**
            * temperature in degrees Celsius
            */
   public float temperature_;
   public long error_count_;

   public SensorMag()
   {
   }

   public SensorMag(SensorMag other)
   {
      this();
      set(other);
   }

   public void set(SensorMag other)
   {
      timestamp_ = other.timestamp_;

      timestamp_sample_ = other.timestamp_sample_;

      device_id_ = other.device_id_;

      x_ = other.x_;

      y_ = other.y_;

      z_ = other.z_;

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
            * magnetic field in the FRD board frame X-axis in Gauss
            */
   public void setX(float x)
   {
      x_ = x;
   }
   /**
            * magnetic field in the FRD board frame X-axis in Gauss
            */
   public float getX()
   {
      return x_;
   }

   /**
            * magnetic field in the FRD board frame Y-axis in Gauss
            */
   public void setY(float y)
   {
      y_ = y;
   }
   /**
            * magnetic field in the FRD board frame Y-axis in Gauss
            */
   public float getY()
   {
      return y_;
   }

   /**
            * magnetic field in the FRD board frame Z-axis in Gauss
            */
   public void setZ(float z)
   {
      z_ = z;
   }
   /**
            * magnetic field in the FRD board frame Z-axis in Gauss
            */
   public float getZ()
   {
      return z_;
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


   public static Supplier<SensorMagPubSubType> getPubSubType()
   {
      return SensorMagPubSubType::new;
   }

   @Override
   public Supplier<TopicDataType> getPubSubTypePacket()
   {
      return SensorMagPubSubType::new;
   }

   @Override
   public boolean epsilonEquals(SensorMag other, double epsilon)
   {
      if(other == null) return false;
      if(other == this) return true;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_, other.timestamp_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_sample_, other.timestamp_sample_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.device_id_, other.device_id_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.x_, other.x_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.y_, other.y_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.z_, other.z_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.temperature_, other.temperature_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.error_count_, other.error_count_, epsilon)) return false;


      return true;
   }

   @Override
   public boolean equals(Object other)
   {
      if(other == null) return false;
      if(other == this) return true;
      if(!(other instanceof SensorMag)) return false;

      SensorMag otherMyClass = (SensorMag) other;

      if(this.timestamp_ != otherMyClass.timestamp_) return false;

      if(this.timestamp_sample_ != otherMyClass.timestamp_sample_) return false;

      if(this.device_id_ != otherMyClass.device_id_) return false;

      if(this.x_ != otherMyClass.x_) return false;

      if(this.y_ != otherMyClass.y_) return false;

      if(this.z_ != otherMyClass.z_) return false;

      if(this.temperature_ != otherMyClass.temperature_) return false;

      if(this.error_count_ != otherMyClass.error_count_) return false;


      return true;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("SensorMag {");
      builder.append("timestamp=");
      builder.append(this.timestamp_);      builder.append(", ");
      builder.append("timestamp_sample=");
      builder.append(this.timestamp_sample_);      builder.append(", ");
      builder.append("device_id=");
      builder.append(this.device_id_);      builder.append(", ");
      builder.append("x=");
      builder.append(this.x_);      builder.append(", ");
      builder.append("y=");
      builder.append(this.y_);      builder.append(", ");
      builder.append("z=");
      builder.append(this.z_);      builder.append(", ");
      builder.append("temperature=");
      builder.append(this.temperature_);      builder.append(", ");
      builder.append("error_count=");
      builder.append(this.error_count_);
      builder.append("}");
      return builder.toString();
   }
}
