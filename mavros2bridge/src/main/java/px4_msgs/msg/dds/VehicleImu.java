package px4_msgs.msg.dds;

import us.ihmc.communication.packets.Packet;
import us.ihmc.euclid.interfaces.Settable;
import us.ihmc.euclid.interfaces.EpsilonComparable;
import java.util.function.Supplier;
import us.ihmc.pubsub.TopicDataType;

/**
       * IMU readings in SI-unit form.
       */
public class VehicleImu extends Packet<VehicleImu> implements Settable<VehicleImu>, EpsilonComparable<VehicleImu>
{
   public static final byte CLIPPING_X = (byte) 1;
   public static final byte CLIPPING_Y = (byte) 2;
   public static final byte CLIPPING_Z = (byte) 4;
   /**
            * time since system start (microseconds)
            */
   public long timestamp_;
   public long timestamp_sample_;
   /**
            * Accelerometer unique device ID for the sensor that does not change between power cycles
            */
   public long accel_device_id_;
   /**
            * Gyroscope unique device ID for the sensor that does not change between power cycles
            */
   public long gyro_device_id_;
   /**
            * delta angle about the FRD body frame XYZ-axis in rad over the integration time frame (delta_angle_dt)
            */
   public float[] delta_angle_;
   /**
            * delta velocity in the FRD body frame XYZ-axis in m/s over the integration time frame (delta_velocity_dt)
            */
   public float[] delta_velocity_;
   /**
            * integration period in microseconds
            */
   public int delta_angle_dt_;
   /**
            * integration period in microseconds
            */
   public int delta_velocity_dt_;
   /**
            * bitfield indicating if there was any gyro clipping (per axis) during the integration time frame
            */
   public byte delta_angle_clipping_;
   /**
            * bitfield indicating if there was any accelerometer clipping (per axis) during the integration time frame
            */
   public byte delta_velocity_clipping_;
   /**
            * Calibration changed counter. Monotonically increases whenever accelermeter calibration changes.
            */
   public byte accel_calibration_count_;
   /**
            * Calibration changed counter. Monotonically increases whenever rate gyro calibration changes.
            */
   public byte gyro_calibration_count_;

   public VehicleImu()
   {
      delta_angle_ = new float[3];

      delta_velocity_ = new float[3];

   }

   public VehicleImu(VehicleImu other)
   {
      this();
      set(other);
   }

   public void set(VehicleImu other)
   {
      timestamp_ = other.timestamp_;

      timestamp_sample_ = other.timestamp_sample_;

      accel_device_id_ = other.accel_device_id_;

      gyro_device_id_ = other.gyro_device_id_;

      for(int i1 = 0; i1 < delta_angle_.length; ++i1)
      {
            delta_angle_[i1] = other.delta_angle_[i1];

      }

      for(int i3 = 0; i3 < delta_velocity_.length; ++i3)
      {
            delta_velocity_[i3] = other.delta_velocity_[i3];

      }

      delta_angle_dt_ = other.delta_angle_dt_;

      delta_velocity_dt_ = other.delta_velocity_dt_;

      delta_angle_clipping_ = other.delta_angle_clipping_;

      delta_velocity_clipping_ = other.delta_velocity_clipping_;

      accel_calibration_count_ = other.accel_calibration_count_;

      gyro_calibration_count_ = other.gyro_calibration_count_;

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
            * Accelerometer unique device ID for the sensor that does not change between power cycles
            */
   public void setAccelDeviceId(long accel_device_id)
   {
      accel_device_id_ = accel_device_id;
   }
   /**
            * Accelerometer unique device ID for the sensor that does not change between power cycles
            */
   public long getAccelDeviceId()
   {
      return accel_device_id_;
   }

   /**
            * Gyroscope unique device ID for the sensor that does not change between power cycles
            */
   public void setGyroDeviceId(long gyro_device_id)
   {
      gyro_device_id_ = gyro_device_id;
   }
   /**
            * Gyroscope unique device ID for the sensor that does not change between power cycles
            */
   public long getGyroDeviceId()
   {
      return gyro_device_id_;
   }


   /**
            * delta angle about the FRD body frame XYZ-axis in rad over the integration time frame (delta_angle_dt)
            */
   public float[] getDeltaAngle()
   {
      return delta_angle_;
   }


   /**
            * delta velocity in the FRD body frame XYZ-axis in m/s over the integration time frame (delta_velocity_dt)
            */
   public float[] getDeltaVelocity()
   {
      return delta_velocity_;
   }

   /**
            * integration period in microseconds
            */
   public void setDeltaAngleDt(int delta_angle_dt)
   {
      delta_angle_dt_ = delta_angle_dt;
   }
   /**
            * integration period in microseconds
            */
   public int getDeltaAngleDt()
   {
      return delta_angle_dt_;
   }

   /**
            * integration period in microseconds
            */
   public void setDeltaVelocityDt(int delta_velocity_dt)
   {
      delta_velocity_dt_ = delta_velocity_dt;
   }
   /**
            * integration period in microseconds
            */
   public int getDeltaVelocityDt()
   {
      return delta_velocity_dt_;
   }

   /**
            * bitfield indicating if there was any gyro clipping (per axis) during the integration time frame
            */
   public void setDeltaAngleClipping(byte delta_angle_clipping)
   {
      delta_angle_clipping_ = delta_angle_clipping;
   }
   /**
            * bitfield indicating if there was any gyro clipping (per axis) during the integration time frame
            */
   public byte getDeltaAngleClipping()
   {
      return delta_angle_clipping_;
   }

   /**
            * bitfield indicating if there was any accelerometer clipping (per axis) during the integration time frame
            */
   public void setDeltaVelocityClipping(byte delta_velocity_clipping)
   {
      delta_velocity_clipping_ = delta_velocity_clipping;
   }
   /**
            * bitfield indicating if there was any accelerometer clipping (per axis) during the integration time frame
            */
   public byte getDeltaVelocityClipping()
   {
      return delta_velocity_clipping_;
   }

   /**
            * Calibration changed counter. Monotonically increases whenever accelermeter calibration changes.
            */
   public void setAccelCalibrationCount(byte accel_calibration_count)
   {
      accel_calibration_count_ = accel_calibration_count;
   }
   /**
            * Calibration changed counter. Monotonically increases whenever accelermeter calibration changes.
            */
   public byte getAccelCalibrationCount()
   {
      return accel_calibration_count_;
   }

   /**
            * Calibration changed counter. Monotonically increases whenever rate gyro calibration changes.
            */
   public void setGyroCalibrationCount(byte gyro_calibration_count)
   {
      gyro_calibration_count_ = gyro_calibration_count;
   }
   /**
            * Calibration changed counter. Monotonically increases whenever rate gyro calibration changes.
            */
   public byte getGyroCalibrationCount()
   {
      return gyro_calibration_count_;
   }


   public static Supplier<VehicleImuPubSubType> getPubSubType()
   {
      return VehicleImuPubSubType::new;
   }

   @Override
   public Supplier<TopicDataType> getPubSubTypePacket()
   {
      return VehicleImuPubSubType::new;
   }

   @Override
   public boolean epsilonEquals(VehicleImu other, double epsilon)
   {
      if(other == null) return false;
      if(other == this) return true;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_, other.timestamp_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_sample_, other.timestamp_sample_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.accel_device_id_, other.accel_device_id_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.gyro_device_id_, other.gyro_device_id_, epsilon)) return false;

      for(int i5 = 0; i5 < delta_angle_.length; ++i5)
      {
                if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.delta_angle_[i5], other.delta_angle_[i5], epsilon)) return false;
      }

      for(int i7 = 0; i7 < delta_velocity_.length; ++i7)
      {
                if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.delta_velocity_[i7], other.delta_velocity_[i7], epsilon)) return false;
      }

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.delta_angle_dt_, other.delta_angle_dt_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.delta_velocity_dt_, other.delta_velocity_dt_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.delta_angle_clipping_, other.delta_angle_clipping_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.delta_velocity_clipping_, other.delta_velocity_clipping_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.accel_calibration_count_, other.accel_calibration_count_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.gyro_calibration_count_, other.gyro_calibration_count_, epsilon)) return false;


      return true;
   }

   @Override
   public boolean equals(Object other)
   {
      if(other == null) return false;
      if(other == this) return true;
      if(!(other instanceof VehicleImu)) return false;

      VehicleImu otherMyClass = (VehicleImu) other;

      if(this.timestamp_ != otherMyClass.timestamp_) return false;

      if(this.timestamp_sample_ != otherMyClass.timestamp_sample_) return false;

      if(this.accel_device_id_ != otherMyClass.accel_device_id_) return false;

      if(this.gyro_device_id_ != otherMyClass.gyro_device_id_) return false;

      for(int i9 = 0; i9 < delta_angle_.length; ++i9)
      {
                if(this.delta_angle_[i9] != otherMyClass.delta_angle_[i9]) return false;

      }
      for(int i11 = 0; i11 < delta_velocity_.length; ++i11)
      {
                if(this.delta_velocity_[i11] != otherMyClass.delta_velocity_[i11]) return false;

      }
      if(this.delta_angle_dt_ != otherMyClass.delta_angle_dt_) return false;

      if(this.delta_velocity_dt_ != otherMyClass.delta_velocity_dt_) return false;

      if(this.delta_angle_clipping_ != otherMyClass.delta_angle_clipping_) return false;

      if(this.delta_velocity_clipping_ != otherMyClass.delta_velocity_clipping_) return false;

      if(this.accel_calibration_count_ != otherMyClass.accel_calibration_count_) return false;

      if(this.gyro_calibration_count_ != otherMyClass.gyro_calibration_count_) return false;


      return true;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("VehicleImu {");
      builder.append("timestamp=");
      builder.append(this.timestamp_);      builder.append(", ");
      builder.append("timestamp_sample=");
      builder.append(this.timestamp_sample_);      builder.append(", ");
      builder.append("accel_device_id=");
      builder.append(this.accel_device_id_);      builder.append(", ");
      builder.append("gyro_device_id=");
      builder.append(this.gyro_device_id_);      builder.append(", ");
      builder.append("delta_angle=");
      builder.append(java.util.Arrays.toString(this.delta_angle_));      builder.append(", ");
      builder.append("delta_velocity=");
      builder.append(java.util.Arrays.toString(this.delta_velocity_));      builder.append(", ");
      builder.append("delta_angle_dt=");
      builder.append(this.delta_angle_dt_);      builder.append(", ");
      builder.append("delta_velocity_dt=");
      builder.append(this.delta_velocity_dt_);      builder.append(", ");
      builder.append("delta_angle_clipping=");
      builder.append(this.delta_angle_clipping_);      builder.append(", ");
      builder.append("delta_velocity_clipping=");
      builder.append(this.delta_velocity_clipping_);      builder.append(", ");
      builder.append("accel_calibration_count=");
      builder.append(this.accel_calibration_count_);      builder.append(", ");
      builder.append("gyro_calibration_count=");
      builder.append(this.gyro_calibration_count_);
      builder.append("}");
      return builder.toString();
   }
}
