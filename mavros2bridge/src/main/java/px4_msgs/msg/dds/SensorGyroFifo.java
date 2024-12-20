package px4_msgs.msg.dds;

import us.ihmc.communication.packets.Packet;
import us.ihmc.euclid.interfaces.Settable;
import us.ihmc.euclid.interfaces.EpsilonComparable;
import java.util.function.Supplier;
import us.ihmc.pubsub.TopicDataType;

public class SensorGyroFifo extends Packet<SensorGyroFifo> implements Settable<SensorGyroFifo>, EpsilonComparable<SensorGyroFifo>
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
            * delta time between samples (microseconds)
            */
   public float dt_;
   public float scale_;
   /**
            * number of valid samples
            */
   public byte samples_;
   /**
            * angular velocity in the FRD board frame X-axis in rad/s
            */
   public short[] x_;
   /**
            * angular velocity in the FRD board frame Y-axis in rad/s
            */
   public short[] y_;
   /**
            * angular velocity in the FRD board frame Z-axis in rad/s
            */
   public short[] z_;

   public SensorGyroFifo()
   {
      x_ = new short[32];

      y_ = new short[32];

      z_ = new short[32];

   }

   public SensorGyroFifo(SensorGyroFifo other)
   {
      this();
      set(other);
   }

   public void set(SensorGyroFifo other)
   {
      timestamp_ = other.timestamp_;

      timestamp_sample_ = other.timestamp_sample_;

      device_id_ = other.device_id_;

      dt_ = other.dt_;

      scale_ = other.scale_;

      samples_ = other.samples_;

      for(int i1 = 0; i1 < x_.length; ++i1)
      {
            x_[i1] = other.x_[i1];

      }

      for(int i3 = 0; i3 < y_.length; ++i3)
      {
            y_[i3] = other.y_[i3];

      }

      for(int i5 = 0; i5 < z_.length; ++i5)
      {
            z_[i5] = other.z_[i5];

      }

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
            * delta time between samples (microseconds)
            */
   public void setDt(float dt)
   {
      dt_ = dt;
   }
   /**
            * delta time between samples (microseconds)
            */
   public float getDt()
   {
      return dt_;
   }

   public void setScale(float scale)
   {
      scale_ = scale;
   }
   public float getScale()
   {
      return scale_;
   }

   /**
            * number of valid samples
            */
   public void setSamples(byte samples)
   {
      samples_ = samples;
   }
   /**
            * number of valid samples
            */
   public byte getSamples()
   {
      return samples_;
   }


   /**
            * angular velocity in the FRD board frame X-axis in rad/s
            */
   public short[] getX()
   {
      return x_;
   }


   /**
            * angular velocity in the FRD board frame Y-axis in rad/s
            */
   public short[] getY()
   {
      return y_;
   }


   /**
            * angular velocity in the FRD board frame Z-axis in rad/s
            */
   public short[] getZ()
   {
      return z_;
   }


   public static Supplier<SensorGyroFifoPubSubType> getPubSubType()
   {
      return SensorGyroFifoPubSubType::new;
   }

   @Override
   public Supplier<TopicDataType> getPubSubTypePacket()
   {
      return SensorGyroFifoPubSubType::new;
   }

   @Override
   public boolean epsilonEquals(SensorGyroFifo other, double epsilon)
   {
      if(other == null) return false;
      if(other == this) return true;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_, other.timestamp_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_sample_, other.timestamp_sample_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.device_id_, other.device_id_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.dt_, other.dt_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.scale_, other.scale_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.samples_, other.samples_, epsilon)) return false;

      for(int i7 = 0; i7 < x_.length; ++i7)
      {
                if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.x_[i7], other.x_[i7], epsilon)) return false;
      }

      for(int i9 = 0; i9 < y_.length; ++i9)
      {
                if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.y_[i9], other.y_[i9], epsilon)) return false;
      }

      for(int i11 = 0; i11 < z_.length; ++i11)
      {
                if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.z_[i11], other.z_[i11], epsilon)) return false;
      }


      return true;
   }

   @Override
   public boolean equals(Object other)
   {
      if(other == null) return false;
      if(other == this) return true;
      if(!(other instanceof SensorGyroFifo)) return false;

      SensorGyroFifo otherMyClass = (SensorGyroFifo) other;

      if(this.timestamp_ != otherMyClass.timestamp_) return false;

      if(this.timestamp_sample_ != otherMyClass.timestamp_sample_) return false;

      if(this.device_id_ != otherMyClass.device_id_) return false;

      if(this.dt_ != otherMyClass.dt_) return false;

      if(this.scale_ != otherMyClass.scale_) return false;

      if(this.samples_ != otherMyClass.samples_) return false;

      for(int i13 = 0; i13 < x_.length; ++i13)
      {
                if(this.x_[i13] != otherMyClass.x_[i13]) return false;

      }
      for(int i15 = 0; i15 < y_.length; ++i15)
      {
                if(this.y_[i15] != otherMyClass.y_[i15]) return false;

      }
      for(int i17 = 0; i17 < z_.length; ++i17)
      {
                if(this.z_[i17] != otherMyClass.z_[i17]) return false;

      }

      return true;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("SensorGyroFifo {");
      builder.append("timestamp=");
      builder.append(this.timestamp_);      builder.append(", ");
      builder.append("timestamp_sample=");
      builder.append(this.timestamp_sample_);      builder.append(", ");
      builder.append("device_id=");
      builder.append(this.device_id_);      builder.append(", ");
      builder.append("dt=");
      builder.append(this.dt_);      builder.append(", ");
      builder.append("scale=");
      builder.append(this.scale_);      builder.append(", ");
      builder.append("samples=");
      builder.append(this.samples_);      builder.append(", ");
      builder.append("x=");
      builder.append(java.util.Arrays.toString(this.x_));      builder.append(", ");
      builder.append("y=");
      builder.append(java.util.Arrays.toString(this.y_));      builder.append(", ");
      builder.append("z=");
      builder.append(java.util.Arrays.toString(this.z_));
      builder.append("}");
      return builder.toString();
   }
}
