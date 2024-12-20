package px4_msgs.msg.dds;

import us.ihmc.communication.packets.Packet;
import us.ihmc.euclid.interfaces.Settable;
import us.ihmc.euclid.interfaces.EpsilonComparable;
import java.util.function.Supplier;
import us.ihmc.pubsub.TopicDataType;

public class GimbalManagerInformation extends Packet<GimbalManagerInformation> implements Settable<GimbalManagerInformation>, EpsilonComparable<GimbalManagerInformation>
{
   public static final long GIMBAL_MANAGER_CAP_FLAGS_HAS_RETRACT = 1;
   public static final long GIMBAL_MANAGER_CAP_FLAGS_HAS_NEUTRAL = 2;
   public static final long GIMBAL_MANAGER_CAP_FLAGS_HAS_ROLL_AXIS = 4;
   public static final long GIMBAL_MANAGER_CAP_FLAGS_HAS_ROLL_FOLLOW = 8;
   public static final long GIMBAL_MANAGER_CAP_FLAGS_HAS_ROLL_LOCK = 16;
   public static final long GIMBAL_MANAGER_CAP_FLAGS_HAS_PITCH_AXIS = 32;
   public static final long GIMBAL_MANAGER_CAP_FLAGS_HAS_PITCH_FOLLOW = 64;
   public static final long GIMBAL_MANAGER_CAP_FLAGS_HAS_PITCH_LOCK = 128;
   public static final long GIMBAL_MANAGER_CAP_FLAGS_HAS_YAW_AXIS = 256;
   public static final long GIMBAL_MANAGER_CAP_FLAGS_HAS_YAW_FOLLOW = 512;
   public static final long GIMBAL_MANAGER_CAP_FLAGS_HAS_YAW_LOCK = 1024;
   public static final long GIMBAL_MANAGER_CAP_FLAGS_SUPPORTS_INFINITE_YAW = 2048;
   public static final long GIMBAL_MANAGER_CAP_FLAGS_CAN_POINT_LOCATION_LOCAL = 65536;
   public static final long GIMBAL_MANAGER_CAP_FLAGS_CAN_POINT_LOCATION_GLOBAL = 131072;
   /**
            * time since system start (microseconds)
            */
   public long timestamp_;
   public long cap_flags_;
   public byte gimbal_device_id_;
   /**
            * [rad]
            */
   public float roll_min_;
   /**
            * [rad]
            */
   public float roll_max_;
   /**
            * [rad]
            */
   public float pitch_min_;
   /**
            * [rad]
            */
   public float pitch_max_;
   /**
            * [rad]
            */
   public float yaw_min_;
   /**
            * [rad]
            */
   public float yaw_max_;

   public GimbalManagerInformation()
   {
   }

   public GimbalManagerInformation(GimbalManagerInformation other)
   {
      this();
      set(other);
   }

   public void set(GimbalManagerInformation other)
   {
      timestamp_ = other.timestamp_;

      cap_flags_ = other.cap_flags_;

      gimbal_device_id_ = other.gimbal_device_id_;

      roll_min_ = other.roll_min_;

      roll_max_ = other.roll_max_;

      pitch_min_ = other.pitch_min_;

      pitch_max_ = other.pitch_max_;

      yaw_min_ = other.yaw_min_;

      yaw_max_ = other.yaw_max_;

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

   public void setCapFlags(long cap_flags)
   {
      cap_flags_ = cap_flags;
   }
   public long getCapFlags()
   {
      return cap_flags_;
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
            * [rad]
            */
   public void setRollMin(float roll_min)
   {
      roll_min_ = roll_min;
   }
   /**
            * [rad]
            */
   public float getRollMin()
   {
      return roll_min_;
   }

   /**
            * [rad]
            */
   public void setRollMax(float roll_max)
   {
      roll_max_ = roll_max;
   }
   /**
            * [rad]
            */
   public float getRollMax()
   {
      return roll_max_;
   }

   /**
            * [rad]
            */
   public void setPitchMin(float pitch_min)
   {
      pitch_min_ = pitch_min;
   }
   /**
            * [rad]
            */
   public float getPitchMin()
   {
      return pitch_min_;
   }

   /**
            * [rad]
            */
   public void setPitchMax(float pitch_max)
   {
      pitch_max_ = pitch_max;
   }
   /**
            * [rad]
            */
   public float getPitchMax()
   {
      return pitch_max_;
   }

   /**
            * [rad]
            */
   public void setYawMin(float yaw_min)
   {
      yaw_min_ = yaw_min;
   }
   /**
            * [rad]
            */
   public float getYawMin()
   {
      return yaw_min_;
   }

   /**
            * [rad]
            */
   public void setYawMax(float yaw_max)
   {
      yaw_max_ = yaw_max;
   }
   /**
            * [rad]
            */
   public float getYawMax()
   {
      return yaw_max_;
   }


   public static Supplier<GimbalManagerInformationPubSubType> getPubSubType()
   {
      return GimbalManagerInformationPubSubType::new;
   }

   @Override
   public Supplier<TopicDataType> getPubSubTypePacket()
   {
      return GimbalManagerInformationPubSubType::new;
   }

   @Override
   public boolean epsilonEquals(GimbalManagerInformation other, double epsilon)
   {
      if(other == null) return false;
      if(other == this) return true;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_, other.timestamp_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.cap_flags_, other.cap_flags_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.gimbal_device_id_, other.gimbal_device_id_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.roll_min_, other.roll_min_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.roll_max_, other.roll_max_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.pitch_min_, other.pitch_min_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.pitch_max_, other.pitch_max_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.yaw_min_, other.yaw_min_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.yaw_max_, other.yaw_max_, epsilon)) return false;


      return true;
   }

   @Override
   public boolean equals(Object other)
   {
      if(other == null) return false;
      if(other == this) return true;
      if(!(other instanceof GimbalManagerInformation)) return false;

      GimbalManagerInformation otherMyClass = (GimbalManagerInformation) other;

      if(this.timestamp_ != otherMyClass.timestamp_) return false;

      if(this.cap_flags_ != otherMyClass.cap_flags_) return false;

      if(this.gimbal_device_id_ != otherMyClass.gimbal_device_id_) return false;

      if(this.roll_min_ != otherMyClass.roll_min_) return false;

      if(this.roll_max_ != otherMyClass.roll_max_) return false;

      if(this.pitch_min_ != otherMyClass.pitch_min_) return false;

      if(this.pitch_max_ != otherMyClass.pitch_max_) return false;

      if(this.yaw_min_ != otherMyClass.yaw_min_) return false;

      if(this.yaw_max_ != otherMyClass.yaw_max_) return false;


      return true;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("GimbalManagerInformation {");
      builder.append("timestamp=");
      builder.append(this.timestamp_);      builder.append(", ");
      builder.append("cap_flags=");
      builder.append(this.cap_flags_);      builder.append(", ");
      builder.append("gimbal_device_id=");
      builder.append(this.gimbal_device_id_);      builder.append(", ");
      builder.append("roll_min=");
      builder.append(this.roll_min_);      builder.append(", ");
      builder.append("roll_max=");
      builder.append(this.roll_max_);      builder.append(", ");
      builder.append("pitch_min=");
      builder.append(this.pitch_min_);      builder.append(", ");
      builder.append("pitch_max=");
      builder.append(this.pitch_max_);      builder.append(", ");
      builder.append("yaw_min=");
      builder.append(this.yaw_min_);      builder.append(", ");
      builder.append("yaw_max=");
      builder.append(this.yaw_max_);
      builder.append("}");
      return builder.toString();
   }
}
