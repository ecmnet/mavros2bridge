package px4_msgs.msg.dds;

import us.ihmc.communication.packets.Packet;
import us.ihmc.euclid.interfaces.Settable;
import us.ihmc.euclid.interfaces.EpsilonComparable;
import java.util.function.Supplier;
import us.ihmc.pubsub.TopicDataType;

/**
       * 
       * Sensor readings and in-run biases in SI-unit form. Sensor readings are compensated for static offsets,
       * scale errors, in-run bias and thermal drift (if thermal compensation is enabled and available).
       * 
       * In-run bias estimates (subtract from uncorrected data)
       */
public class EstimatorSensorBias extends Packet<EstimatorSensorBias> implements Settable<EstimatorSensorBias>, EpsilonComparable<EstimatorSensorBias>
{
   /**
            * time since system start (microseconds)
            */
   public long timestamp_;
   /**
            * the timestamp of the raw data (microseconds)
            */
   public long timestamp_sample_;
   /**
            * unique device ID for the sensor that does not change between power cycles
            */
   public long gyro_device_id_;
   /**
            * gyroscope in-run bias in body frame (rad/s)
            */
   public float[] gyro_bias_;
   /**
            * magnitude of maximum gyroscope in-run bias in body frame (rad/s)
            */
   public float gyro_bias_limit_;
   public float[] gyro_bias_variance_;
   public boolean gyro_bias_valid_;
   /**
            * true when the gyro bias estimate is stable enough to use for calibration
            */
   public boolean gyro_bias_stable_;
   /**
            * unique device ID for the sensor that does not change between power cycles
            */
   public long accel_device_id_;
   /**
            * accelerometer in-run bias in body frame (m/s^2)
            */
   public float[] accel_bias_;
   /**
            * magnitude of maximum accelerometer in-run bias in body frame (m/s^2)
            */
   public float accel_bias_limit_;
   public float[] accel_bias_variance_;
   public boolean accel_bias_valid_;
   /**
            * true when the accel bias estimate is stable enough to use for calibration
            */
   public boolean accel_bias_stable_;
   /**
            * unique device ID for the sensor that does not change between power cycles
            */
   public long mag_device_id_;
   /**
            * magnetometer in-run bias in body frame (Gauss)
            */
   public float[] mag_bias_;
   /**
            * magnitude of maximum magnetometer in-run bias in body frame (Gauss)
            */
   public float mag_bias_limit_;
   public float[] mag_bias_variance_;
   public boolean mag_bias_valid_;
   /**
            * true when the mag bias estimate is stable enough to use for calibration
            */
   public boolean mag_bias_stable_;

   public EstimatorSensorBias()
   {
      gyro_bias_ = new float[3];

      gyro_bias_variance_ = new float[3];

      accel_bias_ = new float[3];

      accel_bias_variance_ = new float[3];

      mag_bias_ = new float[3];

      mag_bias_variance_ = new float[3];

   }

   public EstimatorSensorBias(EstimatorSensorBias other)
   {
      this();
      set(other);
   }

   public void set(EstimatorSensorBias other)
   {
      timestamp_ = other.timestamp_;

      timestamp_sample_ = other.timestamp_sample_;

      gyro_device_id_ = other.gyro_device_id_;

      for(int i1 = 0; i1 < gyro_bias_.length; ++i1)
      {
            gyro_bias_[i1] = other.gyro_bias_[i1];

      }

      gyro_bias_limit_ = other.gyro_bias_limit_;

      for(int i3 = 0; i3 < gyro_bias_variance_.length; ++i3)
      {
            gyro_bias_variance_[i3] = other.gyro_bias_variance_[i3];

      }

      gyro_bias_valid_ = other.gyro_bias_valid_;

      gyro_bias_stable_ = other.gyro_bias_stable_;

      accel_device_id_ = other.accel_device_id_;

      for(int i5 = 0; i5 < accel_bias_.length; ++i5)
      {
            accel_bias_[i5] = other.accel_bias_[i5];

      }

      accel_bias_limit_ = other.accel_bias_limit_;

      for(int i7 = 0; i7 < accel_bias_variance_.length; ++i7)
      {
            accel_bias_variance_[i7] = other.accel_bias_variance_[i7];

      }

      accel_bias_valid_ = other.accel_bias_valid_;

      accel_bias_stable_ = other.accel_bias_stable_;

      mag_device_id_ = other.mag_device_id_;

      for(int i9 = 0; i9 < mag_bias_.length; ++i9)
      {
            mag_bias_[i9] = other.mag_bias_[i9];

      }

      mag_bias_limit_ = other.mag_bias_limit_;

      for(int i11 = 0; i11 < mag_bias_variance_.length; ++i11)
      {
            mag_bias_variance_[i11] = other.mag_bias_variance_[i11];

      }

      mag_bias_valid_ = other.mag_bias_valid_;

      mag_bias_stable_ = other.mag_bias_stable_;

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
            * unique device ID for the sensor that does not change between power cycles
            */
   public void setGyroDeviceId(long gyro_device_id)
   {
      gyro_device_id_ = gyro_device_id;
   }
   /**
            * unique device ID for the sensor that does not change between power cycles
            */
   public long getGyroDeviceId()
   {
      return gyro_device_id_;
   }


   /**
            * gyroscope in-run bias in body frame (rad/s)
            */
   public float[] getGyroBias()
   {
      return gyro_bias_;
   }

   /**
            * magnitude of maximum gyroscope in-run bias in body frame (rad/s)
            */
   public void setGyroBiasLimit(float gyro_bias_limit)
   {
      gyro_bias_limit_ = gyro_bias_limit;
   }
   /**
            * magnitude of maximum gyroscope in-run bias in body frame (rad/s)
            */
   public float getGyroBiasLimit()
   {
      return gyro_bias_limit_;
   }


   public float[] getGyroBiasVariance()
   {
      return gyro_bias_variance_;
   }

   public void setGyroBiasValid(boolean gyro_bias_valid)
   {
      gyro_bias_valid_ = gyro_bias_valid;
   }
   public boolean getGyroBiasValid()
   {
      return gyro_bias_valid_;
   }

   /**
            * true when the gyro bias estimate is stable enough to use for calibration
            */
   public void setGyroBiasStable(boolean gyro_bias_stable)
   {
      gyro_bias_stable_ = gyro_bias_stable;
   }
   /**
            * true when the gyro bias estimate is stable enough to use for calibration
            */
   public boolean getGyroBiasStable()
   {
      return gyro_bias_stable_;
   }

   /**
            * unique device ID for the sensor that does not change between power cycles
            */
   public void setAccelDeviceId(long accel_device_id)
   {
      accel_device_id_ = accel_device_id;
   }
   /**
            * unique device ID for the sensor that does not change between power cycles
            */
   public long getAccelDeviceId()
   {
      return accel_device_id_;
   }


   /**
            * accelerometer in-run bias in body frame (m/s^2)
            */
   public float[] getAccelBias()
   {
      return accel_bias_;
   }

   /**
            * magnitude of maximum accelerometer in-run bias in body frame (m/s^2)
            */
   public void setAccelBiasLimit(float accel_bias_limit)
   {
      accel_bias_limit_ = accel_bias_limit;
   }
   /**
            * magnitude of maximum accelerometer in-run bias in body frame (m/s^2)
            */
   public float getAccelBiasLimit()
   {
      return accel_bias_limit_;
   }


   public float[] getAccelBiasVariance()
   {
      return accel_bias_variance_;
   }

   public void setAccelBiasValid(boolean accel_bias_valid)
   {
      accel_bias_valid_ = accel_bias_valid;
   }
   public boolean getAccelBiasValid()
   {
      return accel_bias_valid_;
   }

   /**
            * true when the accel bias estimate is stable enough to use for calibration
            */
   public void setAccelBiasStable(boolean accel_bias_stable)
   {
      accel_bias_stable_ = accel_bias_stable;
   }
   /**
            * true when the accel bias estimate is stable enough to use for calibration
            */
   public boolean getAccelBiasStable()
   {
      return accel_bias_stable_;
   }

   /**
            * unique device ID for the sensor that does not change between power cycles
            */
   public void setMagDeviceId(long mag_device_id)
   {
      mag_device_id_ = mag_device_id;
   }
   /**
            * unique device ID for the sensor that does not change between power cycles
            */
   public long getMagDeviceId()
   {
      return mag_device_id_;
   }


   /**
            * magnetometer in-run bias in body frame (Gauss)
            */
   public float[] getMagBias()
   {
      return mag_bias_;
   }

   /**
            * magnitude of maximum magnetometer in-run bias in body frame (Gauss)
            */
   public void setMagBiasLimit(float mag_bias_limit)
   {
      mag_bias_limit_ = mag_bias_limit;
   }
   /**
            * magnitude of maximum magnetometer in-run bias in body frame (Gauss)
            */
   public float getMagBiasLimit()
   {
      return mag_bias_limit_;
   }


   public float[] getMagBiasVariance()
   {
      return mag_bias_variance_;
   }

   public void setMagBiasValid(boolean mag_bias_valid)
   {
      mag_bias_valid_ = mag_bias_valid;
   }
   public boolean getMagBiasValid()
   {
      return mag_bias_valid_;
   }

   /**
            * true when the mag bias estimate is stable enough to use for calibration
            */
   public void setMagBiasStable(boolean mag_bias_stable)
   {
      mag_bias_stable_ = mag_bias_stable;
   }
   /**
            * true when the mag bias estimate is stable enough to use for calibration
            */
   public boolean getMagBiasStable()
   {
      return mag_bias_stable_;
   }


   public static Supplier<EstimatorSensorBiasPubSubType> getPubSubType()
   {
      return EstimatorSensorBiasPubSubType::new;
   }

   @Override
   public Supplier<TopicDataType> getPubSubTypePacket()
   {
      return EstimatorSensorBiasPubSubType::new;
   }

   @Override
   public boolean epsilonEquals(EstimatorSensorBias other, double epsilon)
   {
      if(other == null) return false;
      if(other == this) return true;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_, other.timestamp_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_sample_, other.timestamp_sample_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.gyro_device_id_, other.gyro_device_id_, epsilon)) return false;

      for(int i13 = 0; i13 < gyro_bias_.length; ++i13)
      {
                if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.gyro_bias_[i13], other.gyro_bias_[i13], epsilon)) return false;
      }

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.gyro_bias_limit_, other.gyro_bias_limit_, epsilon)) return false;

      for(int i15 = 0; i15 < gyro_bias_variance_.length; ++i15)
      {
                if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.gyro_bias_variance_[i15], other.gyro_bias_variance_[i15], epsilon)) return false;
      }

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.gyro_bias_valid_, other.gyro_bias_valid_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.gyro_bias_stable_, other.gyro_bias_stable_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.accel_device_id_, other.accel_device_id_, epsilon)) return false;

      for(int i17 = 0; i17 < accel_bias_.length; ++i17)
      {
                if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.accel_bias_[i17], other.accel_bias_[i17], epsilon)) return false;
      }

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.accel_bias_limit_, other.accel_bias_limit_, epsilon)) return false;

      for(int i19 = 0; i19 < accel_bias_variance_.length; ++i19)
      {
                if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.accel_bias_variance_[i19], other.accel_bias_variance_[i19], epsilon)) return false;
      }

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.accel_bias_valid_, other.accel_bias_valid_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.accel_bias_stable_, other.accel_bias_stable_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.mag_device_id_, other.mag_device_id_, epsilon)) return false;

      for(int i21 = 0; i21 < mag_bias_.length; ++i21)
      {
                if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.mag_bias_[i21], other.mag_bias_[i21], epsilon)) return false;
      }

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.mag_bias_limit_, other.mag_bias_limit_, epsilon)) return false;

      for(int i23 = 0; i23 < mag_bias_variance_.length; ++i23)
      {
                if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.mag_bias_variance_[i23], other.mag_bias_variance_[i23], epsilon)) return false;
      }

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.mag_bias_valid_, other.mag_bias_valid_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.mag_bias_stable_, other.mag_bias_stable_, epsilon)) return false;


      return true;
   }

   @Override
   public boolean equals(Object other)
   {
      if(other == null) return false;
      if(other == this) return true;
      if(!(other instanceof EstimatorSensorBias)) return false;

      EstimatorSensorBias otherMyClass = (EstimatorSensorBias) other;

      if(this.timestamp_ != otherMyClass.timestamp_) return false;

      if(this.timestamp_sample_ != otherMyClass.timestamp_sample_) return false;

      if(this.gyro_device_id_ != otherMyClass.gyro_device_id_) return false;

      for(int i25 = 0; i25 < gyro_bias_.length; ++i25)
      {
                if(this.gyro_bias_[i25] != otherMyClass.gyro_bias_[i25]) return false;

      }
      if(this.gyro_bias_limit_ != otherMyClass.gyro_bias_limit_) return false;

      for(int i27 = 0; i27 < gyro_bias_variance_.length; ++i27)
      {
                if(this.gyro_bias_variance_[i27] != otherMyClass.gyro_bias_variance_[i27]) return false;

      }
      if(this.gyro_bias_valid_ != otherMyClass.gyro_bias_valid_) return false;

      if(this.gyro_bias_stable_ != otherMyClass.gyro_bias_stable_) return false;

      if(this.accel_device_id_ != otherMyClass.accel_device_id_) return false;

      for(int i29 = 0; i29 < accel_bias_.length; ++i29)
      {
                if(this.accel_bias_[i29] != otherMyClass.accel_bias_[i29]) return false;

      }
      if(this.accel_bias_limit_ != otherMyClass.accel_bias_limit_) return false;

      for(int i31 = 0; i31 < accel_bias_variance_.length; ++i31)
      {
                if(this.accel_bias_variance_[i31] != otherMyClass.accel_bias_variance_[i31]) return false;

      }
      if(this.accel_bias_valid_ != otherMyClass.accel_bias_valid_) return false;

      if(this.accel_bias_stable_ != otherMyClass.accel_bias_stable_) return false;

      if(this.mag_device_id_ != otherMyClass.mag_device_id_) return false;

      for(int i33 = 0; i33 < mag_bias_.length; ++i33)
      {
                if(this.mag_bias_[i33] != otherMyClass.mag_bias_[i33]) return false;

      }
      if(this.mag_bias_limit_ != otherMyClass.mag_bias_limit_) return false;

      for(int i35 = 0; i35 < mag_bias_variance_.length; ++i35)
      {
                if(this.mag_bias_variance_[i35] != otherMyClass.mag_bias_variance_[i35]) return false;

      }
      if(this.mag_bias_valid_ != otherMyClass.mag_bias_valid_) return false;

      if(this.mag_bias_stable_ != otherMyClass.mag_bias_stable_) return false;


      return true;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("EstimatorSensorBias {");
      builder.append("timestamp=");
      builder.append(this.timestamp_);      builder.append(", ");
      builder.append("timestamp_sample=");
      builder.append(this.timestamp_sample_);      builder.append(", ");
      builder.append("gyro_device_id=");
      builder.append(this.gyro_device_id_);      builder.append(", ");
      builder.append("gyro_bias=");
      builder.append(java.util.Arrays.toString(this.gyro_bias_));      builder.append(", ");
      builder.append("gyro_bias_limit=");
      builder.append(this.gyro_bias_limit_);      builder.append(", ");
      builder.append("gyro_bias_variance=");
      builder.append(java.util.Arrays.toString(this.gyro_bias_variance_));      builder.append(", ");
      builder.append("gyro_bias_valid=");
      builder.append(this.gyro_bias_valid_);      builder.append(", ");
      builder.append("gyro_bias_stable=");
      builder.append(this.gyro_bias_stable_);      builder.append(", ");
      builder.append("accel_device_id=");
      builder.append(this.accel_device_id_);      builder.append(", ");
      builder.append("accel_bias=");
      builder.append(java.util.Arrays.toString(this.accel_bias_));      builder.append(", ");
      builder.append("accel_bias_limit=");
      builder.append(this.accel_bias_limit_);      builder.append(", ");
      builder.append("accel_bias_variance=");
      builder.append(java.util.Arrays.toString(this.accel_bias_variance_));      builder.append(", ");
      builder.append("accel_bias_valid=");
      builder.append(this.accel_bias_valid_);      builder.append(", ");
      builder.append("accel_bias_stable=");
      builder.append(this.accel_bias_stable_);      builder.append(", ");
      builder.append("mag_device_id=");
      builder.append(this.mag_device_id_);      builder.append(", ");
      builder.append("mag_bias=");
      builder.append(java.util.Arrays.toString(this.mag_bias_));      builder.append(", ");
      builder.append("mag_bias_limit=");
      builder.append(this.mag_bias_limit_);      builder.append(", ");
      builder.append("mag_bias_variance=");
      builder.append(java.util.Arrays.toString(this.mag_bias_variance_));      builder.append(", ");
      builder.append("mag_bias_valid=");
      builder.append(this.mag_bias_valid_);      builder.append(", ");
      builder.append("mag_bias_stable=");
      builder.append(this.mag_bias_stable_);
      builder.append("}");
      return builder.toString();
   }
}
