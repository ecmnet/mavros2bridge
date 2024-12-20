package px4_msgs.msg.dds;

import us.ihmc.communication.packets.Packet;
import us.ihmc.euclid.interfaces.Settable;
import us.ihmc.euclid.interfaces.EpsilonComparable;
import java.util.function.Supplier;
import us.ihmc.pubsub.TopicDataType;

public class GimbalManagerStatus extends Packet<GimbalManagerStatus> implements Settable<GimbalManagerStatus>, EpsilonComparable<GimbalManagerStatus>
{
   /**
            * time since system start (microseconds)
            */
   public long timestamp_;
   public long flags_;
   public byte gimbal_device_id_;
   public byte primary_control_sysid_;
   public byte primary_control_compid_;
   public byte secondary_control_sysid_;
   public byte secondary_control_compid_;

   public GimbalManagerStatus()
   {
   }

   public GimbalManagerStatus(GimbalManagerStatus other)
   {
      this();
      set(other);
   }

   public void set(GimbalManagerStatus other)
   {
      timestamp_ = other.timestamp_;

      flags_ = other.flags_;

      gimbal_device_id_ = other.gimbal_device_id_;

      primary_control_sysid_ = other.primary_control_sysid_;

      primary_control_compid_ = other.primary_control_compid_;

      secondary_control_sysid_ = other.secondary_control_sysid_;

      secondary_control_compid_ = other.secondary_control_compid_;

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

   public void setFlags(long flags)
   {
      flags_ = flags;
   }
   public long getFlags()
   {
      return flags_;
   }

   public void setGimbalDeviceId(byte gimbal_device_id)
   {
      gimbal_device_id_ = gimbal_device_id;
   }
   public byte getGimbalDeviceId()
   {
      return gimbal_device_id_;
   }

   public void setPrimaryControlSysid(byte primary_control_sysid)
   {
      primary_control_sysid_ = primary_control_sysid;
   }
   public byte getPrimaryControlSysid()
   {
      return primary_control_sysid_;
   }

   public void setPrimaryControlCompid(byte primary_control_compid)
   {
      primary_control_compid_ = primary_control_compid;
   }
   public byte getPrimaryControlCompid()
   {
      return primary_control_compid_;
   }

   public void setSecondaryControlSysid(byte secondary_control_sysid)
   {
      secondary_control_sysid_ = secondary_control_sysid;
   }
   public byte getSecondaryControlSysid()
   {
      return secondary_control_sysid_;
   }

   public void setSecondaryControlCompid(byte secondary_control_compid)
   {
      secondary_control_compid_ = secondary_control_compid;
   }
   public byte getSecondaryControlCompid()
   {
      return secondary_control_compid_;
   }


   public static Supplier<GimbalManagerStatusPubSubType> getPubSubType()
   {
      return GimbalManagerStatusPubSubType::new;
   }

   @Override
   public Supplier<TopicDataType> getPubSubTypePacket()
   {
      return GimbalManagerStatusPubSubType::new;
   }

   @Override
   public boolean epsilonEquals(GimbalManagerStatus other, double epsilon)
   {
      if(other == null) return false;
      if(other == this) return true;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_, other.timestamp_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.flags_, other.flags_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.gimbal_device_id_, other.gimbal_device_id_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.primary_control_sysid_, other.primary_control_sysid_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.primary_control_compid_, other.primary_control_compid_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.secondary_control_sysid_, other.secondary_control_sysid_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.secondary_control_compid_, other.secondary_control_compid_, epsilon)) return false;


      return true;
   }

   @Override
   public boolean equals(Object other)
   {
      if(other == null) return false;
      if(other == this) return true;
      if(!(other instanceof GimbalManagerStatus)) return false;

      GimbalManagerStatus otherMyClass = (GimbalManagerStatus) other;

      if(this.timestamp_ != otherMyClass.timestamp_) return false;

      if(this.flags_ != otherMyClass.flags_) return false;

      if(this.gimbal_device_id_ != otherMyClass.gimbal_device_id_) return false;

      if(this.primary_control_sysid_ != otherMyClass.primary_control_sysid_) return false;

      if(this.primary_control_compid_ != otherMyClass.primary_control_compid_) return false;

      if(this.secondary_control_sysid_ != otherMyClass.secondary_control_sysid_) return false;

      if(this.secondary_control_compid_ != otherMyClass.secondary_control_compid_) return false;


      return true;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("GimbalManagerStatus {");
      builder.append("timestamp=");
      builder.append(this.timestamp_);      builder.append(", ");
      builder.append("flags=");
      builder.append(this.flags_);      builder.append(", ");
      builder.append("gimbal_device_id=");
      builder.append(this.gimbal_device_id_);      builder.append(", ");
      builder.append("primary_control_sysid=");
      builder.append(this.primary_control_sysid_);      builder.append(", ");
      builder.append("primary_control_compid=");
      builder.append(this.primary_control_compid_);      builder.append(", ");
      builder.append("secondary_control_sysid=");
      builder.append(this.secondary_control_sysid_);      builder.append(", ");
      builder.append("secondary_control_compid=");
      builder.append(this.secondary_control_compid_);
      builder.append("}");
      return builder.toString();
   }
}
