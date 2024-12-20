package px4_msgs.msg.dds;

import us.ihmc.communication.packets.Packet;
import us.ihmc.euclid.interfaces.Settable;
import us.ihmc.euclid.interfaces.EpsilonComparable;
import java.util.function.Supplier;
import us.ihmc.pubsub.TopicDataType;

public class GimbalDeviceInformation extends Packet<GimbalDeviceInformation> implements Settable<GimbalDeviceInformation>, EpsilonComparable<GimbalDeviceInformation>
{
   public static final long GIMBAL_DEVICE_CAP_FLAGS_HAS_RETRACT = 1;
   public static final long GIMBAL_DEVICE_CAP_FLAGS_HAS_NEUTRAL = 2;
   public static final long GIMBAL_DEVICE_CAP_FLAGS_HAS_ROLL_AXIS = 4;
   public static final long GIMBAL_DEVICE_CAP_FLAGS_HAS_ROLL_FOLLOW = 8;
   public static final long GIMBAL_DEVICE_CAP_FLAGS_HAS_ROLL_LOCK = 16;
   public static final long GIMBAL_DEVICE_CAP_FLAGS_HAS_PITCH_AXIS = 32;
   public static final long GIMBAL_DEVICE_CAP_FLAGS_HAS_PITCH_FOLLOW = 64;
   public static final long GIMBAL_DEVICE_CAP_FLAGS_HAS_PITCH_LOCK = 128;
   public static final long GIMBAL_DEVICE_CAP_FLAGS_HAS_YAW_AXIS = 256;
   public static final long GIMBAL_DEVICE_CAP_FLAGS_HAS_YAW_FOLLOW = 512;
   public static final long GIMBAL_DEVICE_CAP_FLAGS_HAS_YAW_LOCK = 1024;
   public static final long GIMBAL_DEVICE_CAP_FLAGS_SUPPORTS_INFINITE_YAW = 2048;
   /**
            * time since system start (microseconds)
            */
   public long timestamp_;
   public byte[] vendor_name_;
   public byte[] model_name_;
   public byte[] custom_name_;
   public long firmware_version_;
   public long hardware_version_;
   public long uid_;
   public int cap_flags_;
   public int custom_cap_flags_;
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
   public byte gimbal_device_compid_;

   public GimbalDeviceInformation()
   {
      vendor_name_ = new byte[32];

      model_name_ = new byte[32];

      custom_name_ = new byte[32];

   }

   public GimbalDeviceInformation(GimbalDeviceInformation other)
   {
      this();
      set(other);
   }

   public void set(GimbalDeviceInformation other)
   {
      timestamp_ = other.timestamp_;

      for(int i1 = 0; i1 < vendor_name_.length; ++i1)
      {
            vendor_name_[i1] = other.vendor_name_[i1];

      }

      for(int i3 = 0; i3 < model_name_.length; ++i3)
      {
            model_name_[i3] = other.model_name_[i3];

      }

      for(int i5 = 0; i5 < custom_name_.length; ++i5)
      {
            custom_name_[i5] = other.custom_name_[i5];

      }

      firmware_version_ = other.firmware_version_;

      hardware_version_ = other.hardware_version_;

      uid_ = other.uid_;

      cap_flags_ = other.cap_flags_;

      custom_cap_flags_ = other.custom_cap_flags_;

      roll_min_ = other.roll_min_;

      roll_max_ = other.roll_max_;

      pitch_min_ = other.pitch_min_;

      pitch_max_ = other.pitch_max_;

      yaw_min_ = other.yaw_min_;

      yaw_max_ = other.yaw_max_;

      gimbal_device_compid_ = other.gimbal_device_compid_;

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


   public byte[] getVendorName()
   {
      return vendor_name_;
   }


   public byte[] getModelName()
   {
      return model_name_;
   }


   public byte[] getCustomName()
   {
      return custom_name_;
   }

   public void setFirmwareVersion(long firmware_version)
   {
      firmware_version_ = firmware_version;
   }
   public long getFirmwareVersion()
   {
      return firmware_version_;
   }

   public void setHardwareVersion(long hardware_version)
   {
      hardware_version_ = hardware_version;
   }
   public long getHardwareVersion()
   {
      return hardware_version_;
   }

   public void setUid(long uid)
   {
      uid_ = uid;
   }
   public long getUid()
   {
      return uid_;
   }

   public void setCapFlags(int cap_flags)
   {
      cap_flags_ = cap_flags;
   }
   public int getCapFlags()
   {
      return cap_flags_;
   }

   public void setCustomCapFlags(int custom_cap_flags)
   {
      custom_cap_flags_ = custom_cap_flags;
   }
   public int getCustomCapFlags()
   {
      return custom_cap_flags_;
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

   public void setGimbalDeviceCompid(byte gimbal_device_compid)
   {
      gimbal_device_compid_ = gimbal_device_compid;
   }
   public byte getGimbalDeviceCompid()
   {
      return gimbal_device_compid_;
   }


   public static Supplier<GimbalDeviceInformationPubSubType> getPubSubType()
   {
      return GimbalDeviceInformationPubSubType::new;
   }

   @Override
   public Supplier<TopicDataType> getPubSubTypePacket()
   {
      return GimbalDeviceInformationPubSubType::new;
   }

   @Override
   public boolean epsilonEquals(GimbalDeviceInformation other, double epsilon)
   {
      if(other == null) return false;
      if(other == this) return true;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_, other.timestamp_, epsilon)) return false;

      for(int i7 = 0; i7 < vendor_name_.length; ++i7)
      {
                if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.vendor_name_[i7], other.vendor_name_[i7], epsilon)) return false;
      }

      for(int i9 = 0; i9 < model_name_.length; ++i9)
      {
                if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.model_name_[i9], other.model_name_[i9], epsilon)) return false;
      }

      for(int i11 = 0; i11 < custom_name_.length; ++i11)
      {
                if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.custom_name_[i11], other.custom_name_[i11], epsilon)) return false;
      }

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.firmware_version_, other.firmware_version_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.hardware_version_, other.hardware_version_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.uid_, other.uid_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.cap_flags_, other.cap_flags_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.custom_cap_flags_, other.custom_cap_flags_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.roll_min_, other.roll_min_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.roll_max_, other.roll_max_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.pitch_min_, other.pitch_min_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.pitch_max_, other.pitch_max_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.yaw_min_, other.yaw_min_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.yaw_max_, other.yaw_max_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.gimbal_device_compid_, other.gimbal_device_compid_, epsilon)) return false;


      return true;
   }

   @Override
   public boolean equals(Object other)
   {
      if(other == null) return false;
      if(other == this) return true;
      if(!(other instanceof GimbalDeviceInformation)) return false;

      GimbalDeviceInformation otherMyClass = (GimbalDeviceInformation) other;

      if(this.timestamp_ != otherMyClass.timestamp_) return false;

      for(int i13 = 0; i13 < vendor_name_.length; ++i13)
      {
                if(this.vendor_name_[i13] != otherMyClass.vendor_name_[i13]) return false;

      }
      for(int i15 = 0; i15 < model_name_.length; ++i15)
      {
                if(this.model_name_[i15] != otherMyClass.model_name_[i15]) return false;

      }
      for(int i17 = 0; i17 < custom_name_.length; ++i17)
      {
                if(this.custom_name_[i17] != otherMyClass.custom_name_[i17]) return false;

      }
      if(this.firmware_version_ != otherMyClass.firmware_version_) return false;

      if(this.hardware_version_ != otherMyClass.hardware_version_) return false;

      if(this.uid_ != otherMyClass.uid_) return false;

      if(this.cap_flags_ != otherMyClass.cap_flags_) return false;

      if(this.custom_cap_flags_ != otherMyClass.custom_cap_flags_) return false;

      if(this.roll_min_ != otherMyClass.roll_min_) return false;

      if(this.roll_max_ != otherMyClass.roll_max_) return false;

      if(this.pitch_min_ != otherMyClass.pitch_min_) return false;

      if(this.pitch_max_ != otherMyClass.pitch_max_) return false;

      if(this.yaw_min_ != otherMyClass.yaw_min_) return false;

      if(this.yaw_max_ != otherMyClass.yaw_max_) return false;

      if(this.gimbal_device_compid_ != otherMyClass.gimbal_device_compid_) return false;


      return true;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("GimbalDeviceInformation {");
      builder.append("timestamp=");
      builder.append(this.timestamp_);      builder.append(", ");
      builder.append("vendor_name=");
      builder.append(java.util.Arrays.toString(this.vendor_name_));      builder.append(", ");
      builder.append("model_name=");
      builder.append(java.util.Arrays.toString(this.model_name_));      builder.append(", ");
      builder.append("custom_name=");
      builder.append(java.util.Arrays.toString(this.custom_name_));      builder.append(", ");
      builder.append("firmware_version=");
      builder.append(this.firmware_version_);      builder.append(", ");
      builder.append("hardware_version=");
      builder.append(this.hardware_version_);      builder.append(", ");
      builder.append("uid=");
      builder.append(this.uid_);      builder.append(", ");
      builder.append("cap_flags=");
      builder.append(this.cap_flags_);      builder.append(", ");
      builder.append("custom_cap_flags=");
      builder.append(this.custom_cap_flags_);      builder.append(", ");
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
      builder.append(this.yaw_max_);      builder.append(", ");
      builder.append("gimbal_device_compid=");
      builder.append(this.gimbal_device_compid_);
      builder.append("}");
      return builder.toString();
   }
}
