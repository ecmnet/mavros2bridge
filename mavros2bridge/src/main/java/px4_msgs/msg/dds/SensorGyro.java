package px4_msgs.msg.dds;

import us.ihmc.communication.packets.Packet;
import us.ihmc.euclid.interfaces.Settable;
import us.ihmc.euclid.interfaces.EpsilonComparable;
import java.util.function.Supplier;
import us.ihmc.pubsub.TopicDataType;

public class SensorGyro extends Packet<SensorGyro> implements Settable<SensorGyro>, EpsilonComparable<SensorGyro>
{
   public static final byte ORB_QUEUE_LENGTH = (byte) 8;/**
            * time since system start (microseconds)
            */
   public long timestamp_;
   public long timestamp_sample_;
   /**
            * unique device ID for the sensor that does not change between power cycles
            */
   public long device_id_;
   /**
            * angular velocity in the FRD board frame X-axis in rad/s
            */
   public float x_;
   /**
            * angular velocity in the FRD board frame Y-axis in rad/s
            */
   public float y_;
   /**
            * angular velocity in the FRD board frame Z-axis in rad/s
            */
   public float z_;
   /**
            * temperature in degrees Celsius
            */
   public float temperature_;
   public long error_count_;
   /**
            * clip count per axis in the sample period
            */
   public byte[] clip_counter_;
   /**
            * number of raw samples that went into this message
            */
   public byte samples_;

   public SensorGyro()
   {
      clip_counter_ = new byte[3];

   }

   public SensorGyro(SensorGyro other)
   {
      this();
      set(other);
   }

   public void set(SensorGyro other)
   {
      timestamp_ = other.timestamp_;

      timestamp_sample_ = other.timestamp_sample_;

      device_id_ = other.device_id_;

      x_ = other.x_;

      y_ = other.y_;

      z_ = other.z_;

      temperature_ = other.temperature_;

      error_count_ = other.error_count_;

      for(int i1 = 0; i1 < clip_counter_.length; ++i1)
      {
            clip_counter_[i1] = other.clip_counter_[i1];

      }

      samples_ = other.samples_;

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
            * angular velocity in the FRD board frame X-axis in rad/s
            */
   public void setX(float x)
   {
      x_ = x;
   }
   /**
            * angular velocity in the FRD board frame X-axis in rad/s
            */
   public float getX()
   {
      return x_;
   }

   /**
            * angular velocity in the FRD board frame Y-axis in rad/s
            */
   public void setY(float y)
   {
      y_ = y;
   }
   /**
            * angular velocity in the FRD board frame Y-axis in rad/s
            */
   public float getY()
   {
      return y_;
   }

   /**
            * angular velocity in the FRD board frame Z-axis in rad/s
            */
   public void setZ(float z)
   {
      z_ = z;
   }
   /**
            * angular velocity in the FRD board frame Z-axis in rad/s
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


   /**
            * clip count per axis in the sample period
            */
   public byte[] getClipCounter()
   {
      return clip_counter_;
   }

   /**
            * number of raw samples that went into this message
            */
   public void setSamples(byte samples)
   {
      samples_ = samples;
   }
   /**
            * number of raw samples that went into this message
            */
   public byte getSamples()
   {
      return samples_;
   }


   public static Supplier<SensorGyroPubSubType> getPubSubType()
   {
      return SensorGyroPubSubType::new;
   }

   @Override
   public Supplier<TopicDataType> getPubSubTypePacket()
   {
      return SensorGyroPubSubType::new;
   }

   @Override
   public boolean epsilonEquals(SensorGyro other, double epsilon)
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

      for(int i3 = 0; i3 < clip_counter_.length; ++i3)
      {
                if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.clip_counter_[i3], other.clip_counter_[i3], epsilon)) return false;
      }

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.samples_, other.samples_, epsilon)) return false;


      return true;
   }

   @Override
   public boolean equals(Object other)
   {
      if(other == null) return false;
      if(other == this) return true;
      if(!(other instanceof SensorGyro)) return false;

      SensorGyro otherMyClass = (SensorGyro) other;

      if(this.timestamp_ != otherMyClass.timestamp_) return false;

      if(this.timestamp_sample_ != otherMyClass.timestamp_sample_) return false;

      if(this.device_id_ != otherMyClass.device_id_) return false;

      if(this.x_ != otherMyClass.x_) return false;

      if(this.y_ != otherMyClass.y_) return false;

      if(this.z_ != otherMyClass.z_) return false;

      if(this.temperature_ != otherMyClass.temperature_) return false;

      if(this.error_count_ != otherMyClass.error_count_) return false;

      for(int i5 = 0; i5 < clip_counter_.length; ++i5)
      {
                if(this.clip_counter_[i5] != otherMyClass.clip_counter_[i5]) return false;

      }
      if(this.samples_ != otherMyClass.samples_) return false;


      return true;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("SensorGyro {");
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
      builder.append(this.error_count_);      builder.append(", ");
      builder.append("clip_counter=");
      builder.append(java.util.Arrays.toString(this.clip_counter_));      builder.append(", ");
      builder.append("samples=");
      builder.append(this.samples_);
      builder.append("}");
      return builder.toString();
   }
}
