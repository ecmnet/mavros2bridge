package px4_msgs.msg.dds;

import us.ihmc.communication.packets.Packet;
import us.ihmc.euclid.interfaces.Settable;
import us.ihmc.euclid.interfaces.EpsilonComparable;
import java.util.function.Supplier;
import us.ihmc.pubsub.TopicDataType;

public class SensorsStatusImu extends Packet<SensorsStatusImu> implements Settable<SensorsStatusImu>, EpsilonComparable<SensorsStatusImu>
{
   /**
            * 
            * Sensor check metrics. This will be zero for a sensor that's primary or unpopulated.
            * 
            * time since system start (microseconds)
            */
   public long timestamp_;
   /**
            * current primary accel device id for reference
            */
   public long accel_device_id_primary_;
   /**
            * magnitude of acceleration difference between IMU instance and mean in m/s^2.
            */
   public float[] accel_inconsistency_m_s_s_;
   public boolean[] accel_healthy_;
   public byte[] accel_priority_;
   /**
            * current primary gyro device id for reference
            */
   public long gyro_device_id_primary_;
   /**
            * magnitude of angular rate difference between IMU instance and mean in (rad/s).
            */
   public float[] gyro_inconsistency_rad_s_;
   public boolean[] gyro_healthy_;
   public byte[] gyro_priority_;

   public SensorsStatusImu()
   {
      accel_inconsistency_m_s_s_ = new float[4];

      accel_healthy_ = new boolean[4];

      accel_priority_ = new byte[4];

      gyro_inconsistency_rad_s_ = new float[4];

      gyro_healthy_ = new boolean[4];

      gyro_priority_ = new byte[4];

   }

   public SensorsStatusImu(SensorsStatusImu other)
   {
      this();
      set(other);
   }

   public void set(SensorsStatusImu other)
   {
      timestamp_ = other.timestamp_;

      accel_device_id_primary_ = other.accel_device_id_primary_;

      for(int i1 = 0; i1 < accel_inconsistency_m_s_s_.length; ++i1)
      {
            accel_inconsistency_m_s_s_[i1] = other.accel_inconsistency_m_s_s_[i1];

      }

      for(int i3 = 0; i3 < accel_healthy_.length; ++i3)
      {
            accel_healthy_[i3] = other.accel_healthy_[i3];

      }

      for(int i5 = 0; i5 < accel_priority_.length; ++i5)
      {
            accel_priority_[i5] = other.accel_priority_[i5];

      }

      gyro_device_id_primary_ = other.gyro_device_id_primary_;

      for(int i7 = 0; i7 < gyro_inconsistency_rad_s_.length; ++i7)
      {
            gyro_inconsistency_rad_s_[i7] = other.gyro_inconsistency_rad_s_[i7];

      }

      for(int i9 = 0; i9 < gyro_healthy_.length; ++i9)
      {
            gyro_healthy_[i9] = other.gyro_healthy_[i9];

      }

      for(int i11 = 0; i11 < gyro_priority_.length; ++i11)
      {
            gyro_priority_[i11] = other.gyro_priority_[i11];

      }

   }

   /**
            * 
            * Sensor check metrics. This will be zero for a sensor that's primary or unpopulated.
            * 
            * time since system start (microseconds)
            */
   public void setTimestamp(long timestamp)
   {
      timestamp_ = timestamp;
   }
   /**
            * 
            * Sensor check metrics. This will be zero for a sensor that's primary or unpopulated.
            * 
            * time since system start (microseconds)
            */
   public long getTimestamp()
   {
      return timestamp_;
   }

   /**
            * current primary accel device id for reference
            */
   public void setAccelDeviceIdPrimary(long accel_device_id_primary)
   {
      accel_device_id_primary_ = accel_device_id_primary;
   }
   /**
            * current primary accel device id for reference
            */
   public long getAccelDeviceIdPrimary()
   {
      return accel_device_id_primary_;
   }


   /**
            * magnitude of acceleration difference between IMU instance and mean in m/s^2.
            */
   public float[] getAccelInconsistencyMSS()
   {
      return accel_inconsistency_m_s_s_;
   }


   public boolean[] getAccelHealthy()
   {
      return accel_healthy_;
   }


   public byte[] getAccelPriority()
   {
      return accel_priority_;
   }

   /**
            * current primary gyro device id for reference
            */
   public void setGyroDeviceIdPrimary(long gyro_device_id_primary)
   {
      gyro_device_id_primary_ = gyro_device_id_primary;
   }
   /**
            * current primary gyro device id for reference
            */
   public long getGyroDeviceIdPrimary()
   {
      return gyro_device_id_primary_;
   }


   /**
            * magnitude of angular rate difference between IMU instance and mean in (rad/s).
            */
   public float[] getGyroInconsistencyRadS()
   {
      return gyro_inconsistency_rad_s_;
   }


   public boolean[] getGyroHealthy()
   {
      return gyro_healthy_;
   }


   public byte[] getGyroPriority()
   {
      return gyro_priority_;
   }


   public static Supplier<SensorsStatusImuPubSubType> getPubSubType()
   {
      return SensorsStatusImuPubSubType::new;
   }

   @Override
   public Supplier<TopicDataType> getPubSubTypePacket()
   {
      return SensorsStatusImuPubSubType::new;
   }

   @Override
   public boolean epsilonEquals(SensorsStatusImu other, double epsilon)
   {
      if(other == null) return false;
      if(other == this) return true;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_, other.timestamp_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.accel_device_id_primary_, other.accel_device_id_primary_, epsilon)) return false;

      for(int i13 = 0; i13 < accel_inconsistency_m_s_s_.length; ++i13)
      {
                if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.accel_inconsistency_m_s_s_[i13], other.accel_inconsistency_m_s_s_[i13], epsilon)) return false;
      }

      for(int i15 = 0; i15 < accel_healthy_.length; ++i15)
      {
                if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.accel_healthy_[i15], other.accel_healthy_[i15], epsilon)) return false;

      }

      for(int i17 = 0; i17 < accel_priority_.length; ++i17)
      {
                if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.accel_priority_[i17], other.accel_priority_[i17], epsilon)) return false;
      }

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.gyro_device_id_primary_, other.gyro_device_id_primary_, epsilon)) return false;

      for(int i19 = 0; i19 < gyro_inconsistency_rad_s_.length; ++i19)
      {
                if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.gyro_inconsistency_rad_s_[i19], other.gyro_inconsistency_rad_s_[i19], epsilon)) return false;
      }

      for(int i21 = 0; i21 < gyro_healthy_.length; ++i21)
      {
                if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.gyro_healthy_[i21], other.gyro_healthy_[i21], epsilon)) return false;

      }

      for(int i23 = 0; i23 < gyro_priority_.length; ++i23)
      {
                if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.gyro_priority_[i23], other.gyro_priority_[i23], epsilon)) return false;
      }


      return true;
   }

   @Override
   public boolean equals(Object other)
   {
      if(other == null) return false;
      if(other == this) return true;
      if(!(other instanceof SensorsStatusImu)) return false;

      SensorsStatusImu otherMyClass = (SensorsStatusImu) other;

      if(this.timestamp_ != otherMyClass.timestamp_) return false;

      if(this.accel_device_id_primary_ != otherMyClass.accel_device_id_primary_) return false;

      for(int i25 = 0; i25 < accel_inconsistency_m_s_s_.length; ++i25)
      {
                if(this.accel_inconsistency_m_s_s_[i25] != otherMyClass.accel_inconsistency_m_s_s_[i25]) return false;

      }
      for(int i27 = 0; i27 < accel_healthy_.length; ++i27)
      {
                if(this.accel_healthy_[i27] != otherMyClass.accel_healthy_[i27]) return false;

      }
      for(int i29 = 0; i29 < accel_priority_.length; ++i29)
      {
                if(this.accel_priority_[i29] != otherMyClass.accel_priority_[i29]) return false;

      }
      if(this.gyro_device_id_primary_ != otherMyClass.gyro_device_id_primary_) return false;

      for(int i31 = 0; i31 < gyro_inconsistency_rad_s_.length; ++i31)
      {
                if(this.gyro_inconsistency_rad_s_[i31] != otherMyClass.gyro_inconsistency_rad_s_[i31]) return false;

      }
      for(int i33 = 0; i33 < gyro_healthy_.length; ++i33)
      {
                if(this.gyro_healthy_[i33] != otherMyClass.gyro_healthy_[i33]) return false;

      }
      for(int i35 = 0; i35 < gyro_priority_.length; ++i35)
      {
                if(this.gyro_priority_[i35] != otherMyClass.gyro_priority_[i35]) return false;

      }

      return true;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("SensorsStatusImu {");
      builder.append("timestamp=");
      builder.append(this.timestamp_);      builder.append(", ");
      builder.append("accel_device_id_primary=");
      builder.append(this.accel_device_id_primary_);      builder.append(", ");
      builder.append("accel_inconsistency_m_s_s=");
      builder.append(java.util.Arrays.toString(this.accel_inconsistency_m_s_s_));      builder.append(", ");
      builder.append("accel_healthy=");
      builder.append(java.util.Arrays.toString(this.accel_healthy_));      builder.append(", ");
      builder.append("accel_priority=");
      builder.append(java.util.Arrays.toString(this.accel_priority_));      builder.append(", ");
      builder.append("gyro_device_id_primary=");
      builder.append(this.gyro_device_id_primary_);      builder.append(", ");
      builder.append("gyro_inconsistency_rad_s=");
      builder.append(java.util.Arrays.toString(this.gyro_inconsistency_rad_s_));      builder.append(", ");
      builder.append("gyro_healthy=");
      builder.append(java.util.Arrays.toString(this.gyro_healthy_));      builder.append(", ");
      builder.append("gyro_priority=");
      builder.append(java.util.Arrays.toString(this.gyro_priority_));
      builder.append("}");
      return builder.toString();
   }
}
