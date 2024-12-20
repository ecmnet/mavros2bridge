package px4_msgs.msg.dds;

import us.ihmc.communication.packets.Packet;
import us.ihmc.euclid.interfaces.Settable;
import us.ihmc.euclid.interfaces.EpsilonComparable;
import java.util.function.Supplier;
import us.ihmc.pubsub.TopicDataType;

public class EstimatorSelectorStatus extends Packet<EstimatorSelectorStatus> implements Settable<EstimatorSelectorStatus>, EpsilonComparable<EstimatorSelectorStatus>
{
   /**
            * time since system start (microseconds)
            */
   public long timestamp_;
   public byte primary_instance_;
   public byte instances_available_;
   public long instance_changed_count_;
   public long last_instance_change_;
   public long accel_device_id_;
   public long baro_device_id_;
   public long gyro_device_id_;
   public long mag_device_id_;
   public float[] combined_test_ratio_;
   public float[] relative_test_ratio_;
   public boolean[] healthy_;
   public float[] accumulated_gyro_error_;
   public float[] accumulated_accel_error_;
   public boolean gyro_fault_detected_;
   public boolean accel_fault_detected_;

   public EstimatorSelectorStatus()
   {
      combined_test_ratio_ = new float[9];

      relative_test_ratio_ = new float[9];

      healthy_ = new boolean[9];

      accumulated_gyro_error_ = new float[4];

      accumulated_accel_error_ = new float[4];

   }

   public EstimatorSelectorStatus(EstimatorSelectorStatus other)
   {
      this();
      set(other);
   }

   public void set(EstimatorSelectorStatus other)
   {
      timestamp_ = other.timestamp_;

      primary_instance_ = other.primary_instance_;

      instances_available_ = other.instances_available_;

      instance_changed_count_ = other.instance_changed_count_;

      last_instance_change_ = other.last_instance_change_;

      accel_device_id_ = other.accel_device_id_;

      baro_device_id_ = other.baro_device_id_;

      gyro_device_id_ = other.gyro_device_id_;

      mag_device_id_ = other.mag_device_id_;

      for(int i1 = 0; i1 < combined_test_ratio_.length; ++i1)
      {
            combined_test_ratio_[i1] = other.combined_test_ratio_[i1];

      }

      for(int i3 = 0; i3 < relative_test_ratio_.length; ++i3)
      {
            relative_test_ratio_[i3] = other.relative_test_ratio_[i3];

      }

      for(int i5 = 0; i5 < healthy_.length; ++i5)
      {
            healthy_[i5] = other.healthy_[i5];

      }

      for(int i7 = 0; i7 < accumulated_gyro_error_.length; ++i7)
      {
            accumulated_gyro_error_[i7] = other.accumulated_gyro_error_[i7];

      }

      for(int i9 = 0; i9 < accumulated_accel_error_.length; ++i9)
      {
            accumulated_accel_error_[i9] = other.accumulated_accel_error_[i9];

      }

      gyro_fault_detected_ = other.gyro_fault_detected_;

      accel_fault_detected_ = other.accel_fault_detected_;

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

   public void setPrimaryInstance(byte primary_instance)
   {
      primary_instance_ = primary_instance;
   }
   public byte getPrimaryInstance()
   {
      return primary_instance_;
   }

   public void setInstancesAvailable(byte instances_available)
   {
      instances_available_ = instances_available;
   }
   public byte getInstancesAvailable()
   {
      return instances_available_;
   }

   public void setInstanceChangedCount(long instance_changed_count)
   {
      instance_changed_count_ = instance_changed_count;
   }
   public long getInstanceChangedCount()
   {
      return instance_changed_count_;
   }

   public void setLastInstanceChange(long last_instance_change)
   {
      last_instance_change_ = last_instance_change;
   }
   public long getLastInstanceChange()
   {
      return last_instance_change_;
   }

   public void setAccelDeviceId(long accel_device_id)
   {
      accel_device_id_ = accel_device_id;
   }
   public long getAccelDeviceId()
   {
      return accel_device_id_;
   }

   public void setBaroDeviceId(long baro_device_id)
   {
      baro_device_id_ = baro_device_id;
   }
   public long getBaroDeviceId()
   {
      return baro_device_id_;
   }

   public void setGyroDeviceId(long gyro_device_id)
   {
      gyro_device_id_ = gyro_device_id;
   }
   public long getGyroDeviceId()
   {
      return gyro_device_id_;
   }

   public void setMagDeviceId(long mag_device_id)
   {
      mag_device_id_ = mag_device_id;
   }
   public long getMagDeviceId()
   {
      return mag_device_id_;
   }


   public float[] getCombinedTestRatio()
   {
      return combined_test_ratio_;
   }


   public float[] getRelativeTestRatio()
   {
      return relative_test_ratio_;
   }


   public boolean[] getHealthy()
   {
      return healthy_;
   }


   public float[] getAccumulatedGyroError()
   {
      return accumulated_gyro_error_;
   }


   public float[] getAccumulatedAccelError()
   {
      return accumulated_accel_error_;
   }

   public void setGyroFaultDetected(boolean gyro_fault_detected)
   {
      gyro_fault_detected_ = gyro_fault_detected;
   }
   public boolean getGyroFaultDetected()
   {
      return gyro_fault_detected_;
   }

   public void setAccelFaultDetected(boolean accel_fault_detected)
   {
      accel_fault_detected_ = accel_fault_detected;
   }
   public boolean getAccelFaultDetected()
   {
      return accel_fault_detected_;
   }


   public static Supplier<EstimatorSelectorStatusPubSubType> getPubSubType()
   {
      return EstimatorSelectorStatusPubSubType::new;
   }

   @Override
   public Supplier<TopicDataType> getPubSubTypePacket()
   {
      return EstimatorSelectorStatusPubSubType::new;
   }

   @Override
   public boolean epsilonEquals(EstimatorSelectorStatus other, double epsilon)
   {
      if(other == null) return false;
      if(other == this) return true;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_, other.timestamp_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.primary_instance_, other.primary_instance_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.instances_available_, other.instances_available_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.instance_changed_count_, other.instance_changed_count_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.last_instance_change_, other.last_instance_change_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.accel_device_id_, other.accel_device_id_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.baro_device_id_, other.baro_device_id_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.gyro_device_id_, other.gyro_device_id_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.mag_device_id_, other.mag_device_id_, epsilon)) return false;

      for(int i11 = 0; i11 < combined_test_ratio_.length; ++i11)
      {
                if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.combined_test_ratio_[i11], other.combined_test_ratio_[i11], epsilon)) return false;
      }

      for(int i13 = 0; i13 < relative_test_ratio_.length; ++i13)
      {
                if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.relative_test_ratio_[i13], other.relative_test_ratio_[i13], epsilon)) return false;
      }

      for(int i15 = 0; i15 < healthy_.length; ++i15)
      {
                if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.healthy_[i15], other.healthy_[i15], epsilon)) return false;

      }

      for(int i17 = 0; i17 < accumulated_gyro_error_.length; ++i17)
      {
                if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.accumulated_gyro_error_[i17], other.accumulated_gyro_error_[i17], epsilon)) return false;
      }

      for(int i19 = 0; i19 < accumulated_accel_error_.length; ++i19)
      {
                if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.accumulated_accel_error_[i19], other.accumulated_accel_error_[i19], epsilon)) return false;
      }

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.gyro_fault_detected_, other.gyro_fault_detected_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.accel_fault_detected_, other.accel_fault_detected_, epsilon)) return false;


      return true;
   }

   @Override
   public boolean equals(Object other)
   {
      if(other == null) return false;
      if(other == this) return true;
      if(!(other instanceof EstimatorSelectorStatus)) return false;

      EstimatorSelectorStatus otherMyClass = (EstimatorSelectorStatus) other;

      if(this.timestamp_ != otherMyClass.timestamp_) return false;

      if(this.primary_instance_ != otherMyClass.primary_instance_) return false;

      if(this.instances_available_ != otherMyClass.instances_available_) return false;

      if(this.instance_changed_count_ != otherMyClass.instance_changed_count_) return false;

      if(this.last_instance_change_ != otherMyClass.last_instance_change_) return false;

      if(this.accel_device_id_ != otherMyClass.accel_device_id_) return false;

      if(this.baro_device_id_ != otherMyClass.baro_device_id_) return false;

      if(this.gyro_device_id_ != otherMyClass.gyro_device_id_) return false;

      if(this.mag_device_id_ != otherMyClass.mag_device_id_) return false;

      for(int i21 = 0; i21 < combined_test_ratio_.length; ++i21)
      {
                if(this.combined_test_ratio_[i21] != otherMyClass.combined_test_ratio_[i21]) return false;

      }
      for(int i23 = 0; i23 < relative_test_ratio_.length; ++i23)
      {
                if(this.relative_test_ratio_[i23] != otherMyClass.relative_test_ratio_[i23]) return false;

      }
      for(int i25 = 0; i25 < healthy_.length; ++i25)
      {
                if(this.healthy_[i25] != otherMyClass.healthy_[i25]) return false;

      }
      for(int i27 = 0; i27 < accumulated_gyro_error_.length; ++i27)
      {
                if(this.accumulated_gyro_error_[i27] != otherMyClass.accumulated_gyro_error_[i27]) return false;

      }
      for(int i29 = 0; i29 < accumulated_accel_error_.length; ++i29)
      {
                if(this.accumulated_accel_error_[i29] != otherMyClass.accumulated_accel_error_[i29]) return false;

      }
      if(this.gyro_fault_detected_ != otherMyClass.gyro_fault_detected_) return false;

      if(this.accel_fault_detected_ != otherMyClass.accel_fault_detected_) return false;


      return true;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("EstimatorSelectorStatus {");
      builder.append("timestamp=");
      builder.append(this.timestamp_);      builder.append(", ");
      builder.append("primary_instance=");
      builder.append(this.primary_instance_);      builder.append(", ");
      builder.append("instances_available=");
      builder.append(this.instances_available_);      builder.append(", ");
      builder.append("instance_changed_count=");
      builder.append(this.instance_changed_count_);      builder.append(", ");
      builder.append("last_instance_change=");
      builder.append(this.last_instance_change_);      builder.append(", ");
      builder.append("accel_device_id=");
      builder.append(this.accel_device_id_);      builder.append(", ");
      builder.append("baro_device_id=");
      builder.append(this.baro_device_id_);      builder.append(", ");
      builder.append("gyro_device_id=");
      builder.append(this.gyro_device_id_);      builder.append(", ");
      builder.append("mag_device_id=");
      builder.append(this.mag_device_id_);      builder.append(", ");
      builder.append("combined_test_ratio=");
      builder.append(java.util.Arrays.toString(this.combined_test_ratio_));      builder.append(", ");
      builder.append("relative_test_ratio=");
      builder.append(java.util.Arrays.toString(this.relative_test_ratio_));      builder.append(", ");
      builder.append("healthy=");
      builder.append(java.util.Arrays.toString(this.healthy_));      builder.append(", ");
      builder.append("accumulated_gyro_error=");
      builder.append(java.util.Arrays.toString(this.accumulated_gyro_error_));      builder.append(", ");
      builder.append("accumulated_accel_error=");
      builder.append(java.util.Arrays.toString(this.accumulated_accel_error_));      builder.append(", ");
      builder.append("gyro_fault_detected=");
      builder.append(this.gyro_fault_detected_);      builder.append(", ");
      builder.append("accel_fault_detected=");
      builder.append(this.accel_fault_detected_);
      builder.append("}");
      return builder.toString();
   }
}
