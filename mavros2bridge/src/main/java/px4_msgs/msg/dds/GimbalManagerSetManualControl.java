package px4_msgs.msg.dds;

import us.ihmc.communication.packets.Packet;
import us.ihmc.euclid.interfaces.Settable;
import us.ihmc.euclid.interfaces.EpsilonComparable;
import java.util.function.Supplier;
import us.ihmc.pubsub.TopicDataType;

public class GimbalManagerSetManualControl extends Packet<GimbalManagerSetManualControl> implements Settable<GimbalManagerSetManualControl>, EpsilonComparable<GimbalManagerSetManualControl>
{
   public static final long GIMBAL_MANAGER_FLAGS_RETRACT = 1;
   public static final long GIMBAL_MANAGER_FLAGS_NEUTRAL = 2;
   public static final long GIMBAL_MANAGER_FLAGS_ROLL_LOCK = 4;
   public static final long GIMBAL_MANAGER_FLAGS_PITCH_LOCK = 8;
   public static final long GIMBAL_MANAGER_FLAGS_YAW_LOCK = 16;
   /**
            * time since system start (microseconds)
            */
   public long timestamp_;
   public byte origin_sysid_;
   public byte origin_compid_;
   public byte target_system_;
   public byte target_component_;
   public long flags_;
   public byte gimbal_device_id_;
   /**
            * unitless -1..1, can be NAN
            */
   public float pitch_;
   /**
            * unitless -1..1, can be NAN
            */
   public float yaw_;
   /**
            * unitless -1..1, can be NAN
            */
   public float pitch_rate_;
   /**
            * unitless -1..1, can be NAN
            */
   public float yaw_rate_;

   public GimbalManagerSetManualControl()
   {
   }

   public GimbalManagerSetManualControl(GimbalManagerSetManualControl other)
   {
      this();
      set(other);
   }

   public void set(GimbalManagerSetManualControl other)
   {
      timestamp_ = other.timestamp_;

      origin_sysid_ = other.origin_sysid_;

      origin_compid_ = other.origin_compid_;

      target_system_ = other.target_system_;

      target_component_ = other.target_component_;

      flags_ = other.flags_;

      gimbal_device_id_ = other.gimbal_device_id_;

      pitch_ = other.pitch_;

      yaw_ = other.yaw_;

      pitch_rate_ = other.pitch_rate_;

      yaw_rate_ = other.yaw_rate_;

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

   public void setOriginSysid(byte origin_sysid)
   {
      origin_sysid_ = origin_sysid;
   }
   public byte getOriginSysid()
   {
      return origin_sysid_;
   }

   public void setOriginCompid(byte origin_compid)
   {
      origin_compid_ = origin_compid;
   }
   public byte getOriginCompid()
   {
      return origin_compid_;
   }

   public void setTargetSystem(byte target_system)
   {
      target_system_ = target_system;
   }
   public byte getTargetSystem()
   {
      return target_system_;
   }

   public void setTargetComponent(byte target_component)
   {
      target_component_ = target_component;
   }
   public byte getTargetComponent()
   {
      return target_component_;
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

   /**
            * unitless -1..1, can be NAN
            */
   public void setPitch(float pitch)
   {
      pitch_ = pitch;
   }
   /**
            * unitless -1..1, can be NAN
            */
   public float getPitch()
   {
      return pitch_;
   }

   /**
            * unitless -1..1, can be NAN
            */
   public void setYaw(float yaw)
   {
      yaw_ = yaw;
   }
   /**
            * unitless -1..1, can be NAN
            */
   public float getYaw()
   {
      return yaw_;
   }

   /**
            * unitless -1..1, can be NAN
            */
   public void setPitchRate(float pitch_rate)
   {
      pitch_rate_ = pitch_rate;
   }
   /**
            * unitless -1..1, can be NAN
            */
   public float getPitchRate()
   {
      return pitch_rate_;
   }

   /**
            * unitless -1..1, can be NAN
            */
   public void setYawRate(float yaw_rate)
   {
      yaw_rate_ = yaw_rate;
   }
   /**
            * unitless -1..1, can be NAN
            */
   public float getYawRate()
   {
      return yaw_rate_;
   }


   public static Supplier<GimbalManagerSetManualControlPubSubType> getPubSubType()
   {
      return GimbalManagerSetManualControlPubSubType::new;
   }

   @Override
   public Supplier<TopicDataType> getPubSubTypePacket()
   {
      return GimbalManagerSetManualControlPubSubType::new;
   }

   @Override
   public boolean epsilonEquals(GimbalManagerSetManualControl other, double epsilon)
   {
      if(other == null) return false;
      if(other == this) return true;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_, other.timestamp_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.origin_sysid_, other.origin_sysid_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.origin_compid_, other.origin_compid_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.target_system_, other.target_system_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.target_component_, other.target_component_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.flags_, other.flags_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.gimbal_device_id_, other.gimbal_device_id_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.pitch_, other.pitch_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.yaw_, other.yaw_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.pitch_rate_, other.pitch_rate_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.yaw_rate_, other.yaw_rate_, epsilon)) return false;


      return true;
   }

   @Override
   public boolean equals(Object other)
   {
      if(other == null) return false;
      if(other == this) return true;
      if(!(other instanceof GimbalManagerSetManualControl)) return false;

      GimbalManagerSetManualControl otherMyClass = (GimbalManagerSetManualControl) other;

      if(this.timestamp_ != otherMyClass.timestamp_) return false;

      if(this.origin_sysid_ != otherMyClass.origin_sysid_) return false;

      if(this.origin_compid_ != otherMyClass.origin_compid_) return false;

      if(this.target_system_ != otherMyClass.target_system_) return false;

      if(this.target_component_ != otherMyClass.target_component_) return false;

      if(this.flags_ != otherMyClass.flags_) return false;

      if(this.gimbal_device_id_ != otherMyClass.gimbal_device_id_) return false;

      if(this.pitch_ != otherMyClass.pitch_) return false;

      if(this.yaw_ != otherMyClass.yaw_) return false;

      if(this.pitch_rate_ != otherMyClass.pitch_rate_) return false;

      if(this.yaw_rate_ != otherMyClass.yaw_rate_) return false;


      return true;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("GimbalManagerSetManualControl {");
      builder.append("timestamp=");
      builder.append(this.timestamp_);      builder.append(", ");
      builder.append("origin_sysid=");
      builder.append(this.origin_sysid_);      builder.append(", ");
      builder.append("origin_compid=");
      builder.append(this.origin_compid_);      builder.append(", ");
      builder.append("target_system=");
      builder.append(this.target_system_);      builder.append(", ");
      builder.append("target_component=");
      builder.append(this.target_component_);      builder.append(", ");
      builder.append("flags=");
      builder.append(this.flags_);      builder.append(", ");
      builder.append("gimbal_device_id=");
      builder.append(this.gimbal_device_id_);      builder.append(", ");
      builder.append("pitch=");
      builder.append(this.pitch_);      builder.append(", ");
      builder.append("yaw=");
      builder.append(this.yaw_);      builder.append(", ");
      builder.append("pitch_rate=");
      builder.append(this.pitch_rate_);      builder.append(", ");
      builder.append("yaw_rate=");
      builder.append(this.yaw_rate_);
      builder.append("}");
      return builder.toString();
   }
}
