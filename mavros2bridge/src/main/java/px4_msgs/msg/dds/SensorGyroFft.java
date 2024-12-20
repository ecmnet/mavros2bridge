package px4_msgs.msg.dds;

import us.ihmc.communication.packets.Packet;
import us.ihmc.euclid.interfaces.Settable;
import us.ihmc.euclid.interfaces.EpsilonComparable;
import java.util.function.Supplier;
import us.ihmc.pubsub.TopicDataType;

public class SensorGyroFft extends Packet<SensorGyroFft> implements Settable<SensorGyroFft>, EpsilonComparable<SensorGyroFft>
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
   public float sensor_sample_rate_hz_;
   public float resolution_hz_;
   /**
            * x axis peak frequencies
            */
   public float[] peak_frequencies_x_;
   /**
            * y axis peak frequencies
            */
   public float[] peak_frequencies_y_;
   /**
            * z axis peak frequencies
            */
   public float[] peak_frequencies_z_;
   /**
            * x axis peak SNR
            */
   public float[] peak_snr_x_;
   /**
            * y axis peak SNR
            */
   public float[] peak_snr_y_;
   /**
            * z axis peak SNR
            */
   public float[] peak_snr_z_;

   public SensorGyroFft()
   {
      peak_frequencies_x_ = new float[3];

      peak_frequencies_y_ = new float[3];

      peak_frequencies_z_ = new float[3];

      peak_snr_x_ = new float[3];

      peak_snr_y_ = new float[3];

      peak_snr_z_ = new float[3];

   }

   public SensorGyroFft(SensorGyroFft other)
   {
      this();
      set(other);
   }

   public void set(SensorGyroFft other)
   {
      timestamp_ = other.timestamp_;

      timestamp_sample_ = other.timestamp_sample_;

      device_id_ = other.device_id_;

      sensor_sample_rate_hz_ = other.sensor_sample_rate_hz_;

      resolution_hz_ = other.resolution_hz_;

      for(int i1 = 0; i1 < peak_frequencies_x_.length; ++i1)
      {
            peak_frequencies_x_[i1] = other.peak_frequencies_x_[i1];

      }

      for(int i3 = 0; i3 < peak_frequencies_y_.length; ++i3)
      {
            peak_frequencies_y_[i3] = other.peak_frequencies_y_[i3];

      }

      for(int i5 = 0; i5 < peak_frequencies_z_.length; ++i5)
      {
            peak_frequencies_z_[i5] = other.peak_frequencies_z_[i5];

      }

      for(int i7 = 0; i7 < peak_snr_x_.length; ++i7)
      {
            peak_snr_x_[i7] = other.peak_snr_x_[i7];

      }

      for(int i9 = 0; i9 < peak_snr_y_.length; ++i9)
      {
            peak_snr_y_[i9] = other.peak_snr_y_[i9];

      }

      for(int i11 = 0; i11 < peak_snr_z_.length; ++i11)
      {
            peak_snr_z_[i11] = other.peak_snr_z_[i11];

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

   public void setSensorSampleRateHz(float sensor_sample_rate_hz)
   {
      sensor_sample_rate_hz_ = sensor_sample_rate_hz;
   }
   public float getSensorSampleRateHz()
   {
      return sensor_sample_rate_hz_;
   }

   public void setResolutionHz(float resolution_hz)
   {
      resolution_hz_ = resolution_hz;
   }
   public float getResolutionHz()
   {
      return resolution_hz_;
   }


   /**
            * x axis peak frequencies
            */
   public float[] getPeakFrequenciesX()
   {
      return peak_frequencies_x_;
   }


   /**
            * y axis peak frequencies
            */
   public float[] getPeakFrequenciesY()
   {
      return peak_frequencies_y_;
   }


   /**
            * z axis peak frequencies
            */
   public float[] getPeakFrequenciesZ()
   {
      return peak_frequencies_z_;
   }


   /**
            * x axis peak SNR
            */
   public float[] getPeakSnrX()
   {
      return peak_snr_x_;
   }


   /**
            * y axis peak SNR
            */
   public float[] getPeakSnrY()
   {
      return peak_snr_y_;
   }


   /**
            * z axis peak SNR
            */
   public float[] getPeakSnrZ()
   {
      return peak_snr_z_;
   }


   public static Supplier<SensorGyroFftPubSubType> getPubSubType()
   {
      return SensorGyroFftPubSubType::new;
   }

   @Override
   public Supplier<TopicDataType> getPubSubTypePacket()
   {
      return SensorGyroFftPubSubType::new;
   }

   @Override
   public boolean epsilonEquals(SensorGyroFft other, double epsilon)
   {
      if(other == null) return false;
      if(other == this) return true;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_, other.timestamp_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_sample_, other.timestamp_sample_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.device_id_, other.device_id_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.sensor_sample_rate_hz_, other.sensor_sample_rate_hz_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.resolution_hz_, other.resolution_hz_, epsilon)) return false;

      for(int i13 = 0; i13 < peak_frequencies_x_.length; ++i13)
      {
                if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.peak_frequencies_x_[i13], other.peak_frequencies_x_[i13], epsilon)) return false;
      }

      for(int i15 = 0; i15 < peak_frequencies_y_.length; ++i15)
      {
                if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.peak_frequencies_y_[i15], other.peak_frequencies_y_[i15], epsilon)) return false;
      }

      for(int i17 = 0; i17 < peak_frequencies_z_.length; ++i17)
      {
                if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.peak_frequencies_z_[i17], other.peak_frequencies_z_[i17], epsilon)) return false;
      }

      for(int i19 = 0; i19 < peak_snr_x_.length; ++i19)
      {
                if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.peak_snr_x_[i19], other.peak_snr_x_[i19], epsilon)) return false;
      }

      for(int i21 = 0; i21 < peak_snr_y_.length; ++i21)
      {
                if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.peak_snr_y_[i21], other.peak_snr_y_[i21], epsilon)) return false;
      }

      for(int i23 = 0; i23 < peak_snr_z_.length; ++i23)
      {
                if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.peak_snr_z_[i23], other.peak_snr_z_[i23], epsilon)) return false;
      }


      return true;
   }

   @Override
   public boolean equals(Object other)
   {
      if(other == null) return false;
      if(other == this) return true;
      if(!(other instanceof SensorGyroFft)) return false;

      SensorGyroFft otherMyClass = (SensorGyroFft) other;

      if(this.timestamp_ != otherMyClass.timestamp_) return false;

      if(this.timestamp_sample_ != otherMyClass.timestamp_sample_) return false;

      if(this.device_id_ != otherMyClass.device_id_) return false;

      if(this.sensor_sample_rate_hz_ != otherMyClass.sensor_sample_rate_hz_) return false;

      if(this.resolution_hz_ != otherMyClass.resolution_hz_) return false;

      for(int i25 = 0; i25 < peak_frequencies_x_.length; ++i25)
      {
                if(this.peak_frequencies_x_[i25] != otherMyClass.peak_frequencies_x_[i25]) return false;

      }
      for(int i27 = 0; i27 < peak_frequencies_y_.length; ++i27)
      {
                if(this.peak_frequencies_y_[i27] != otherMyClass.peak_frequencies_y_[i27]) return false;

      }
      for(int i29 = 0; i29 < peak_frequencies_z_.length; ++i29)
      {
                if(this.peak_frequencies_z_[i29] != otherMyClass.peak_frequencies_z_[i29]) return false;

      }
      for(int i31 = 0; i31 < peak_snr_x_.length; ++i31)
      {
                if(this.peak_snr_x_[i31] != otherMyClass.peak_snr_x_[i31]) return false;

      }
      for(int i33 = 0; i33 < peak_snr_y_.length; ++i33)
      {
                if(this.peak_snr_y_[i33] != otherMyClass.peak_snr_y_[i33]) return false;

      }
      for(int i35 = 0; i35 < peak_snr_z_.length; ++i35)
      {
                if(this.peak_snr_z_[i35] != otherMyClass.peak_snr_z_[i35]) return false;

      }

      return true;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("SensorGyroFft {");
      builder.append("timestamp=");
      builder.append(this.timestamp_);      builder.append(", ");
      builder.append("timestamp_sample=");
      builder.append(this.timestamp_sample_);      builder.append(", ");
      builder.append("device_id=");
      builder.append(this.device_id_);      builder.append(", ");
      builder.append("sensor_sample_rate_hz=");
      builder.append(this.sensor_sample_rate_hz_);      builder.append(", ");
      builder.append("resolution_hz=");
      builder.append(this.resolution_hz_);      builder.append(", ");
      builder.append("peak_frequencies_x=");
      builder.append(java.util.Arrays.toString(this.peak_frequencies_x_));      builder.append(", ");
      builder.append("peak_frequencies_y=");
      builder.append(java.util.Arrays.toString(this.peak_frequencies_y_));      builder.append(", ");
      builder.append("peak_frequencies_z=");
      builder.append(java.util.Arrays.toString(this.peak_frequencies_z_));      builder.append(", ");
      builder.append("peak_snr_x=");
      builder.append(java.util.Arrays.toString(this.peak_snr_x_));      builder.append(", ");
      builder.append("peak_snr_y=");
      builder.append(java.util.Arrays.toString(this.peak_snr_y_));      builder.append(", ");
      builder.append("peak_snr_z=");
      builder.append(java.util.Arrays.toString(this.peak_snr_z_));
      builder.append("}");
      return builder.toString();
   }
}
