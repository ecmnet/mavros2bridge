package px4_msgs.msg.dds;

import us.ihmc.communication.packets.Packet;
import us.ihmc.euclid.interfaces.Settable;
import us.ihmc.euclid.interfaces.EpsilonComparable;
import java.util.function.Supplier;
import us.ihmc.pubsub.TopicDataType;

/**
       * Sensor readings in SI-unit form.
       * These fields are scaled and offset-compensated where possible and do not
       * change with board revisions and sensor updates.
       */
public class SensorCombined extends Packet<SensorCombined> implements Settable<SensorCombined>, EpsilonComparable<SensorCombined>
{
   /**
          * (0x7fffffff) If one of the relative timestamps is set to this value, it means the associated sensor values are invalid
          */
   public static final int RELATIVE_TIMESTAMP_INVALID = 2147483647;
   public static final byte CLIPPING_X = (byte) 1;
   public static final byte CLIPPING_Y = (byte) 2;
   public static final byte CLIPPING_Z = (byte) 4;
   /**
            * time since system start (microseconds)
            */
   public long timestamp_;
   /**
            * gyro timstamp is equal to the timestamp of the message
            * average angular rate measured in the FRD body frame XYZ-axis in rad/s over the last gyro sampling period
            */
   public float[] gyro_rad_;
   /**
            * gyro measurement sampling period in microseconds
            */
   public long gyro_integral_dt_;
   /**
            * timestamp + accelerometer_timestamp_relative = Accelerometer timestamp
            */
   public int accelerometer_timestamp_relative_;
   /**
            * average value acceleration measured in the FRD body frame XYZ-axis in m/s^2 over the last accelerometer sampling period
            */
   public float[] accelerometer_m_s2_;
   /**
            * accelerometer measurement sampling period in microseconds
            */
   public long accelerometer_integral_dt_;
   /**
            * bitfield indicating if there was any accelerometer clipping (per axis) during the integration time frame
            */
   public byte accelerometer_clipping_;
   /**
            * bitfield indicating if there was any gyro clipping (per axis) during the integration time frame
            */
   public byte gyro_clipping_;
   /**
            * Calibration changed counter. Monotonically increases whenever accelermeter calibration changes.
            */
   public byte accel_calibration_count_;
   /**
            * Calibration changed counter. Monotonically increases whenever rate gyro calibration changes.
            */
   public byte gyro_calibration_count_;

   public SensorCombined()
   {
      gyro_rad_ = new float[3];

      accelerometer_m_s2_ = new float[3];

   }

   public SensorCombined(SensorCombined other)
   {
      this();
      set(other);
   }

   public void set(SensorCombined other)
   {
      timestamp_ = other.timestamp_;

      for(int i1 = 0; i1 < gyro_rad_.length; ++i1)
      {
            gyro_rad_[i1] = other.gyro_rad_[i1];

      }

      gyro_integral_dt_ = other.gyro_integral_dt_;

      accelerometer_timestamp_relative_ = other.accelerometer_timestamp_relative_;

      for(int i3 = 0; i3 < accelerometer_m_s2_.length; ++i3)
      {
            accelerometer_m_s2_[i3] = other.accelerometer_m_s2_[i3];

      }

      accelerometer_integral_dt_ = other.accelerometer_integral_dt_;

      accelerometer_clipping_ = other.accelerometer_clipping_;

      gyro_clipping_ = other.gyro_clipping_;

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


   /**
            * gyro timstamp is equal to the timestamp of the message
            * average angular rate measured in the FRD body frame XYZ-axis in rad/s over the last gyro sampling period
            */
   public float[] getGyroRad()
   {
      return gyro_rad_;
   }

   /**
            * gyro measurement sampling period in microseconds
            */
   public void setGyroIntegralDt(long gyro_integral_dt)
   {
      gyro_integral_dt_ = gyro_integral_dt;
   }
   /**
            * gyro measurement sampling period in microseconds
            */
   public long getGyroIntegralDt()
   {
      return gyro_integral_dt_;
   }

   /**
            * timestamp + accelerometer_timestamp_relative = Accelerometer timestamp
            */
   public void setAccelerometerTimestampRelative(int accelerometer_timestamp_relative)
   {
      accelerometer_timestamp_relative_ = accelerometer_timestamp_relative;
   }
   /**
            * timestamp + accelerometer_timestamp_relative = Accelerometer timestamp
            */
   public int getAccelerometerTimestampRelative()
   {
      return accelerometer_timestamp_relative_;
   }


   /**
            * average value acceleration measured in the FRD body frame XYZ-axis in m/s^2 over the last accelerometer sampling period
            */
   public float[] getAccelerometerMS2()
   {
      return accelerometer_m_s2_;
   }

   /**
            * accelerometer measurement sampling period in microseconds
            */
   public void setAccelerometerIntegralDt(long accelerometer_integral_dt)
   {
      accelerometer_integral_dt_ = accelerometer_integral_dt;
   }
   /**
            * accelerometer measurement sampling period in microseconds
            */
   public long getAccelerometerIntegralDt()
   {
      return accelerometer_integral_dt_;
   }

   /**
            * bitfield indicating if there was any accelerometer clipping (per axis) during the integration time frame
            */
   public void setAccelerometerClipping(byte accelerometer_clipping)
   {
      accelerometer_clipping_ = accelerometer_clipping;
   }
   /**
            * bitfield indicating if there was any accelerometer clipping (per axis) during the integration time frame
            */
   public byte getAccelerometerClipping()
   {
      return accelerometer_clipping_;
   }

   /**
            * bitfield indicating if there was any gyro clipping (per axis) during the integration time frame
            */
   public void setGyroClipping(byte gyro_clipping)
   {
      gyro_clipping_ = gyro_clipping;
   }
   /**
            * bitfield indicating if there was any gyro clipping (per axis) during the integration time frame
            */
   public byte getGyroClipping()
   {
      return gyro_clipping_;
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


   public static Supplier<SensorCombinedPubSubType> getPubSubType()
   {
      return SensorCombinedPubSubType::new;
   }

   @Override
   public Supplier<TopicDataType> getPubSubTypePacket()
   {
      return SensorCombinedPubSubType::new;
   }

   @Override
   public boolean epsilonEquals(SensorCombined other, double epsilon)
   {
      if(other == null) return false;
      if(other == this) return true;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_, other.timestamp_, epsilon)) return false;

      for(int i5 = 0; i5 < gyro_rad_.length; ++i5)
      {
                if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.gyro_rad_[i5], other.gyro_rad_[i5], epsilon)) return false;
      }

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.gyro_integral_dt_, other.gyro_integral_dt_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.accelerometer_timestamp_relative_, other.accelerometer_timestamp_relative_, epsilon)) return false;

      for(int i7 = 0; i7 < accelerometer_m_s2_.length; ++i7)
      {
                if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.accelerometer_m_s2_[i7], other.accelerometer_m_s2_[i7], epsilon)) return false;
      }

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.accelerometer_integral_dt_, other.accelerometer_integral_dt_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.accelerometer_clipping_, other.accelerometer_clipping_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.gyro_clipping_, other.gyro_clipping_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.accel_calibration_count_, other.accel_calibration_count_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.gyro_calibration_count_, other.gyro_calibration_count_, epsilon)) return false;


      return true;
   }

   @Override
   public boolean equals(Object other)
   {
      if(other == null) return false;
      if(other == this) return true;
      if(!(other instanceof SensorCombined)) return false;

      SensorCombined otherMyClass = (SensorCombined) other;

      if(this.timestamp_ != otherMyClass.timestamp_) return false;

      for(int i9 = 0; i9 < gyro_rad_.length; ++i9)
      {
                if(this.gyro_rad_[i9] != otherMyClass.gyro_rad_[i9]) return false;

      }
      if(this.gyro_integral_dt_ != otherMyClass.gyro_integral_dt_) return false;

      if(this.accelerometer_timestamp_relative_ != otherMyClass.accelerometer_timestamp_relative_) return false;

      for(int i11 = 0; i11 < accelerometer_m_s2_.length; ++i11)
      {
                if(this.accelerometer_m_s2_[i11] != otherMyClass.accelerometer_m_s2_[i11]) return false;

      }
      if(this.accelerometer_integral_dt_ != otherMyClass.accelerometer_integral_dt_) return false;

      if(this.accelerometer_clipping_ != otherMyClass.accelerometer_clipping_) return false;

      if(this.gyro_clipping_ != otherMyClass.gyro_clipping_) return false;

      if(this.accel_calibration_count_ != otherMyClass.accel_calibration_count_) return false;

      if(this.gyro_calibration_count_ != otherMyClass.gyro_calibration_count_) return false;


      return true;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("SensorCombined {");
      builder.append("timestamp=");
      builder.append(this.timestamp_);      builder.append(", ");
      builder.append("gyro_rad=");
      builder.append(java.util.Arrays.toString(this.gyro_rad_));      builder.append(", ");
      builder.append("gyro_integral_dt=");
      builder.append(this.gyro_integral_dt_);      builder.append(", ");
      builder.append("accelerometer_timestamp_relative=");
      builder.append(this.accelerometer_timestamp_relative_);      builder.append(", ");
      builder.append("accelerometer_m_s2=");
      builder.append(java.util.Arrays.toString(this.accelerometer_m_s2_));      builder.append(", ");
      builder.append("accelerometer_integral_dt=");
      builder.append(this.accelerometer_integral_dt_);      builder.append(", ");
      builder.append("accelerometer_clipping=");
      builder.append(this.accelerometer_clipping_);      builder.append(", ");
      builder.append("gyro_clipping=");
      builder.append(this.gyro_clipping_);      builder.append(", ");
      builder.append("accel_calibration_count=");
      builder.append(this.accel_calibration_count_);      builder.append(", ");
      builder.append("gyro_calibration_count=");
      builder.append(this.gyro_calibration_count_);
      builder.append("}");
      return builder.toString();
   }
}
