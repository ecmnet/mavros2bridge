package px4_msgs.msg.dds;

import us.ihmc.communication.packets.Packet;
import us.ihmc.euclid.interfaces.Settable;
import us.ihmc.euclid.interfaces.EpsilonComparable;
import java.util.function.Supplier;
import us.ihmc.pubsub.TopicDataType;

public class SensorsStatus extends Packet<SensorsStatus> implements Settable<SensorsStatus>, EpsilonComparable<SensorsStatus>
{
   /**
            * 
            * Sensor check metrics. This will be zero for a sensor that's primary or unpopulated.
            * 
            * time since system start (microseconds)
            */
   public long timestamp_;
   /**
            * current primary device id for reference
            */
   public long device_id_primary_;
   /**
            * magnitude of difference between sensor instance and mean
            */
   public float[] inconsistency_;
   /**
            * sensor healthy
            */
   public boolean[] healthy_;
   public byte[] priority_;
   public boolean[] enabled_;
   public boolean[] external_;

   public SensorsStatus()
   {
      inconsistency_ = new float[4];

      healthy_ = new boolean[4];

      priority_ = new byte[4];

      enabled_ = new boolean[4];

      external_ = new boolean[4];

   }

   public SensorsStatus(SensorsStatus other)
   {
      this();
      set(other);
   }

   public void set(SensorsStatus other)
   {
      timestamp_ = other.timestamp_;

      device_id_primary_ = other.device_id_primary_;

      for(int i1 = 0; i1 < inconsistency_.length; ++i1)
      {
            inconsistency_[i1] = other.inconsistency_[i1];

      }

      for(int i3 = 0; i3 < healthy_.length; ++i3)
      {
            healthy_[i3] = other.healthy_[i3];

      }

      for(int i5 = 0; i5 < priority_.length; ++i5)
      {
            priority_[i5] = other.priority_[i5];

      }

      for(int i7 = 0; i7 < enabled_.length; ++i7)
      {
            enabled_[i7] = other.enabled_[i7];

      }

      for(int i9 = 0; i9 < external_.length; ++i9)
      {
            external_[i9] = other.external_[i9];

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
            * current primary device id for reference
            */
   public void setDeviceIdPrimary(long device_id_primary)
   {
      device_id_primary_ = device_id_primary;
   }
   /**
            * current primary device id for reference
            */
   public long getDeviceIdPrimary()
   {
      return device_id_primary_;
   }


   /**
            * magnitude of difference between sensor instance and mean
            */
   public float[] getInconsistency()
   {
      return inconsistency_;
   }


   /**
            * sensor healthy
            */
   public boolean[] getHealthy()
   {
      return healthy_;
   }


   public byte[] getPriority()
   {
      return priority_;
   }


   public boolean[] getEnabled()
   {
      return enabled_;
   }


   public boolean[] getExternal()
   {
      return external_;
   }


   public static Supplier<SensorsStatusPubSubType> getPubSubType()
   {
      return SensorsStatusPubSubType::new;
   }

   @Override
   public Supplier<TopicDataType> getPubSubTypePacket()
   {
      return SensorsStatusPubSubType::new;
   }

   @Override
   public boolean epsilonEquals(SensorsStatus other, double epsilon)
   {
      if(other == null) return false;
      if(other == this) return true;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_, other.timestamp_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.device_id_primary_, other.device_id_primary_, epsilon)) return false;

      for(int i11 = 0; i11 < inconsistency_.length; ++i11)
      {
                if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.inconsistency_[i11], other.inconsistency_[i11], epsilon)) return false;
      }

      for(int i13 = 0; i13 < healthy_.length; ++i13)
      {
                if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.healthy_[i13], other.healthy_[i13], epsilon)) return false;

      }

      for(int i15 = 0; i15 < priority_.length; ++i15)
      {
                if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.priority_[i15], other.priority_[i15], epsilon)) return false;
      }

      for(int i17 = 0; i17 < enabled_.length; ++i17)
      {
                if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.enabled_[i17], other.enabled_[i17], epsilon)) return false;

      }

      for(int i19 = 0; i19 < external_.length; ++i19)
      {
                if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.external_[i19], other.external_[i19], epsilon)) return false;

      }


      return true;
   }

   @Override
   public boolean equals(Object other)
   {
      if(other == null) return false;
      if(other == this) return true;
      if(!(other instanceof SensorsStatus)) return false;

      SensorsStatus otherMyClass = (SensorsStatus) other;

      if(this.timestamp_ != otherMyClass.timestamp_) return false;

      if(this.device_id_primary_ != otherMyClass.device_id_primary_) return false;

      for(int i21 = 0; i21 < inconsistency_.length; ++i21)
      {
                if(this.inconsistency_[i21] != otherMyClass.inconsistency_[i21]) return false;

      }
      for(int i23 = 0; i23 < healthy_.length; ++i23)
      {
                if(this.healthy_[i23] != otherMyClass.healthy_[i23]) return false;

      }
      for(int i25 = 0; i25 < priority_.length; ++i25)
      {
                if(this.priority_[i25] != otherMyClass.priority_[i25]) return false;

      }
      for(int i27 = 0; i27 < enabled_.length; ++i27)
      {
                if(this.enabled_[i27] != otherMyClass.enabled_[i27]) return false;

      }
      for(int i29 = 0; i29 < external_.length; ++i29)
      {
                if(this.external_[i29] != otherMyClass.external_[i29]) return false;

      }

      return true;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("SensorsStatus {");
      builder.append("timestamp=");
      builder.append(this.timestamp_);      builder.append(", ");
      builder.append("device_id_primary=");
      builder.append(this.device_id_primary_);      builder.append(", ");
      builder.append("inconsistency=");
      builder.append(java.util.Arrays.toString(this.inconsistency_));      builder.append(", ");
      builder.append("healthy=");
      builder.append(java.util.Arrays.toString(this.healthy_));      builder.append(", ");
      builder.append("priority=");
      builder.append(java.util.Arrays.toString(this.priority_));      builder.append(", ");
      builder.append("enabled=");
      builder.append(java.util.Arrays.toString(this.enabled_));      builder.append(", ");
      builder.append("external=");
      builder.append(java.util.Arrays.toString(this.external_));
      builder.append("}");
      return builder.toString();
   }
}
