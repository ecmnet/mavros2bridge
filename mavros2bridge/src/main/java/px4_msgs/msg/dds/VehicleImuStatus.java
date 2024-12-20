package px4_msgs.msg.dds;

import us.ihmc.communication.packets.Packet;
import us.ihmc.euclid.interfaces.Settable;
import us.ihmc.euclid.interfaces.EpsilonComparable;
import java.util.function.Supplier;
import us.ihmc.pubsub.TopicDataType;

public class VehicleImuStatus extends Packet<VehicleImuStatus> implements Settable<VehicleImuStatus>, EpsilonComparable<VehicleImuStatus>
{
   /**
            * time since system start (microseconds)
            */
   public long timestamp_;
   /**
            * unique device ID for the sensor that does not change between power cycles
            */
   public long accel_device_id_;
   /**
            * unique device ID for the sensor that does not change between power cycles
            */
   public long gyro_device_id_;
   public long accel_error_count_;
   public long gyro_error_count_;
   public float accel_rate_hz_;
   public float gyro_rate_hz_;
   /**
            * full raw sensor sample rate (Hz)
            */
   public float accel_raw_rate_hz_;
   /**
            * full raw sensor sample rate (Hz)
            */
   public float gyro_raw_rate_hz_;
   /**
            * high frequency vibration level in the accelerometer data (m/s/s)
            */
   public float accel_vibration_metric_;
   /**
            * high frequency vibration level in the gyro data (rad/s)
            */
   public float gyro_vibration_metric_;
   /**
            * average IMU delta angle coning correction (rad^2)
            */
   public float delta_angle_coning_metric_;
   /**
            * average accelerometer readings since last publication
            */
   public float[] mean_accel_;
   /**
            * average gyroscope readings since last publication
            */
   public float[] mean_gyro_;
   /**
            * accelerometer variance since last publication
            */
   public float[] var_accel_;
   /**
            * gyroscope variance since last publication
            */
   public float[] var_gyro_;
   public float temperature_accel_;
   public float temperature_gyro_;

   public VehicleImuStatus()
   {
      mean_accel_ = new float[3];

      mean_gyro_ = new float[3];

      var_accel_ = new float[3];

      var_gyro_ = new float[3];

   }

   public VehicleImuStatus(VehicleImuStatus other)
   {
      this();
      set(other);
   }

   public void set(VehicleImuStatus other)
   {
      timestamp_ = other.timestamp_;

      accel_device_id_ = other.accel_device_id_;

      gyro_device_id_ = other.gyro_device_id_;

      accel_error_count_ = other.accel_error_count_;

      gyro_error_count_ = other.gyro_error_count_;

      accel_rate_hz_ = other.accel_rate_hz_;

      gyro_rate_hz_ = other.gyro_rate_hz_;

      accel_raw_rate_hz_ = other.accel_raw_rate_hz_;

      gyro_raw_rate_hz_ = other.gyro_raw_rate_hz_;

      accel_vibration_metric_ = other.accel_vibration_metric_;

      gyro_vibration_metric_ = other.gyro_vibration_metric_;

      delta_angle_coning_metric_ = other.delta_angle_coning_metric_;

      for(int i1 = 0; i1 < mean_accel_.length; ++i1)
      {
            mean_accel_[i1] = other.mean_accel_[i1];

      }

      for(int i3 = 0; i3 < mean_gyro_.length; ++i3)
      {
            mean_gyro_[i3] = other.mean_gyro_[i3];

      }

      for(int i5 = 0; i5 < var_accel_.length; ++i5)
      {
            var_accel_[i5] = other.var_accel_[i5];

      }

      for(int i7 = 0; i7 < var_gyro_.length; ++i7)
      {
            var_gyro_[i7] = other.var_gyro_[i7];

      }

      temperature_accel_ = other.temperature_accel_;

      temperature_gyro_ = other.temperature_gyro_;

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

   public void setAccelErrorCount(long accel_error_count)
   {
      accel_error_count_ = accel_error_count;
   }
   public long getAccelErrorCount()
   {
      return accel_error_count_;
   }

   public void setGyroErrorCount(long gyro_error_count)
   {
      gyro_error_count_ = gyro_error_count;
   }
   public long getGyroErrorCount()
   {
      return gyro_error_count_;
   }

   public void setAccelRateHz(float accel_rate_hz)
   {
      accel_rate_hz_ = accel_rate_hz;
   }
   public float getAccelRateHz()
   {
      return accel_rate_hz_;
   }

   public void setGyroRateHz(float gyro_rate_hz)
   {
      gyro_rate_hz_ = gyro_rate_hz;
   }
   public float getGyroRateHz()
   {
      return gyro_rate_hz_;
   }

   /**
            * full raw sensor sample rate (Hz)
            */
   public void setAccelRawRateHz(float accel_raw_rate_hz)
   {
      accel_raw_rate_hz_ = accel_raw_rate_hz;
   }
   /**
            * full raw sensor sample rate (Hz)
            */
   public float getAccelRawRateHz()
   {
      return accel_raw_rate_hz_;
   }

   /**
            * full raw sensor sample rate (Hz)
            */
   public void setGyroRawRateHz(float gyro_raw_rate_hz)
   {
      gyro_raw_rate_hz_ = gyro_raw_rate_hz;
   }
   /**
            * full raw sensor sample rate (Hz)
            */
   public float getGyroRawRateHz()
   {
      return gyro_raw_rate_hz_;
   }

   /**
            * high frequency vibration level in the accelerometer data (m/s/s)
            */
   public void setAccelVibrationMetric(float accel_vibration_metric)
   {
      accel_vibration_metric_ = accel_vibration_metric;
   }
   /**
            * high frequency vibration level in the accelerometer data (m/s/s)
            */
   public float getAccelVibrationMetric()
   {
      return accel_vibration_metric_;
   }

   /**
            * high frequency vibration level in the gyro data (rad/s)
            */
   public void setGyroVibrationMetric(float gyro_vibration_metric)
   {
      gyro_vibration_metric_ = gyro_vibration_metric;
   }
   /**
            * high frequency vibration level in the gyro data (rad/s)
            */
   public float getGyroVibrationMetric()
   {
      return gyro_vibration_metric_;
   }

   /**
            * average IMU delta angle coning correction (rad^2)
            */
   public void setDeltaAngleConingMetric(float delta_angle_coning_metric)
   {
      delta_angle_coning_metric_ = delta_angle_coning_metric;
   }
   /**
            * average IMU delta angle coning correction (rad^2)
            */
   public float getDeltaAngleConingMetric()
   {
      return delta_angle_coning_metric_;
   }


   /**
            * average accelerometer readings since last publication
            */
   public float[] getMeanAccel()
   {
      return mean_accel_;
   }


   /**
            * average gyroscope readings since last publication
            */
   public float[] getMeanGyro()
   {
      return mean_gyro_;
   }


   /**
            * accelerometer variance since last publication
            */
   public float[] getVarAccel()
   {
      return var_accel_;
   }


   /**
            * gyroscope variance since last publication
            */
   public float[] getVarGyro()
   {
      return var_gyro_;
   }

   public void setTemperatureAccel(float temperature_accel)
   {
      temperature_accel_ = temperature_accel;
   }
   public float getTemperatureAccel()
   {
      return temperature_accel_;
   }

   public void setTemperatureGyro(float temperature_gyro)
   {
      temperature_gyro_ = temperature_gyro;
   }
   public float getTemperatureGyro()
   {
      return temperature_gyro_;
   }


   public static Supplier<VehicleImuStatusPubSubType> getPubSubType()
   {
      return VehicleImuStatusPubSubType::new;
   }

   @Override
   public Supplier<TopicDataType> getPubSubTypePacket()
   {
      return VehicleImuStatusPubSubType::new;
   }

   @Override
   public boolean epsilonEquals(VehicleImuStatus other, double epsilon)
   {
      if(other == null) return false;
      if(other == this) return true;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_, other.timestamp_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.accel_device_id_, other.accel_device_id_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.gyro_device_id_, other.gyro_device_id_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.accel_error_count_, other.accel_error_count_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.gyro_error_count_, other.gyro_error_count_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.accel_rate_hz_, other.accel_rate_hz_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.gyro_rate_hz_, other.gyro_rate_hz_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.accel_raw_rate_hz_, other.accel_raw_rate_hz_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.gyro_raw_rate_hz_, other.gyro_raw_rate_hz_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.accel_vibration_metric_, other.accel_vibration_metric_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.gyro_vibration_metric_, other.gyro_vibration_metric_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.delta_angle_coning_metric_, other.delta_angle_coning_metric_, epsilon)) return false;

      for(int i9 = 0; i9 < mean_accel_.length; ++i9)
      {
                if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.mean_accel_[i9], other.mean_accel_[i9], epsilon)) return false;
      }

      for(int i11 = 0; i11 < mean_gyro_.length; ++i11)
      {
                if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.mean_gyro_[i11], other.mean_gyro_[i11], epsilon)) return false;
      }

      for(int i13 = 0; i13 < var_accel_.length; ++i13)
      {
                if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.var_accel_[i13], other.var_accel_[i13], epsilon)) return false;
      }

      for(int i15 = 0; i15 < var_gyro_.length; ++i15)
      {
                if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.var_gyro_[i15], other.var_gyro_[i15], epsilon)) return false;
      }

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.temperature_accel_, other.temperature_accel_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.temperature_gyro_, other.temperature_gyro_, epsilon)) return false;


      return true;
   }

   @Override
   public boolean equals(Object other)
   {
      if(other == null) return false;
      if(other == this) return true;
      if(!(other instanceof VehicleImuStatus)) return false;

      VehicleImuStatus otherMyClass = (VehicleImuStatus) other;

      if(this.timestamp_ != otherMyClass.timestamp_) return false;

      if(this.accel_device_id_ != otherMyClass.accel_device_id_) return false;

      if(this.gyro_device_id_ != otherMyClass.gyro_device_id_) return false;

      if(this.accel_error_count_ != otherMyClass.accel_error_count_) return false;

      if(this.gyro_error_count_ != otherMyClass.gyro_error_count_) return false;

      if(this.accel_rate_hz_ != otherMyClass.accel_rate_hz_) return false;

      if(this.gyro_rate_hz_ != otherMyClass.gyro_rate_hz_) return false;

      if(this.accel_raw_rate_hz_ != otherMyClass.accel_raw_rate_hz_) return false;

      if(this.gyro_raw_rate_hz_ != otherMyClass.gyro_raw_rate_hz_) return false;

      if(this.accel_vibration_metric_ != otherMyClass.accel_vibration_metric_) return false;

      if(this.gyro_vibration_metric_ != otherMyClass.gyro_vibration_metric_) return false;

      if(this.delta_angle_coning_metric_ != otherMyClass.delta_angle_coning_metric_) return false;

      for(int i17 = 0; i17 < mean_accel_.length; ++i17)
      {
                if(this.mean_accel_[i17] != otherMyClass.mean_accel_[i17]) return false;

      }
      for(int i19 = 0; i19 < mean_gyro_.length; ++i19)
      {
                if(this.mean_gyro_[i19] != otherMyClass.mean_gyro_[i19]) return false;

      }
      for(int i21 = 0; i21 < var_accel_.length; ++i21)
      {
                if(this.var_accel_[i21] != otherMyClass.var_accel_[i21]) return false;

      }
      for(int i23 = 0; i23 < var_gyro_.length; ++i23)
      {
                if(this.var_gyro_[i23] != otherMyClass.var_gyro_[i23]) return false;

      }
      if(this.temperature_accel_ != otherMyClass.temperature_accel_) return false;

      if(this.temperature_gyro_ != otherMyClass.temperature_gyro_) return false;


      return true;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("VehicleImuStatus {");
      builder.append("timestamp=");
      builder.append(this.timestamp_);      builder.append(", ");
      builder.append("accel_device_id=");
      builder.append(this.accel_device_id_);      builder.append(", ");
      builder.append("gyro_device_id=");
      builder.append(this.gyro_device_id_);      builder.append(", ");
      builder.append("accel_error_count=");
      builder.append(this.accel_error_count_);      builder.append(", ");
      builder.append("gyro_error_count=");
      builder.append(this.gyro_error_count_);      builder.append(", ");
      builder.append("accel_rate_hz=");
      builder.append(this.accel_rate_hz_);      builder.append(", ");
      builder.append("gyro_rate_hz=");
      builder.append(this.gyro_rate_hz_);      builder.append(", ");
      builder.append("accel_raw_rate_hz=");
      builder.append(this.accel_raw_rate_hz_);      builder.append(", ");
      builder.append("gyro_raw_rate_hz=");
      builder.append(this.gyro_raw_rate_hz_);      builder.append(", ");
      builder.append("accel_vibration_metric=");
      builder.append(this.accel_vibration_metric_);      builder.append(", ");
      builder.append("gyro_vibration_metric=");
      builder.append(this.gyro_vibration_metric_);      builder.append(", ");
      builder.append("delta_angle_coning_metric=");
      builder.append(this.delta_angle_coning_metric_);      builder.append(", ");
      builder.append("mean_accel=");
      builder.append(java.util.Arrays.toString(this.mean_accel_));      builder.append(", ");
      builder.append("mean_gyro=");
      builder.append(java.util.Arrays.toString(this.mean_gyro_));      builder.append(", ");
      builder.append("var_accel=");
      builder.append(java.util.Arrays.toString(this.var_accel_));      builder.append(", ");
      builder.append("var_gyro=");
      builder.append(java.util.Arrays.toString(this.var_gyro_));      builder.append(", ");
      builder.append("temperature_accel=");
      builder.append(this.temperature_accel_);      builder.append(", ");
      builder.append("temperature_gyro=");
      builder.append(this.temperature_gyro_);
      builder.append("}");
      return builder.toString();
   }
}
