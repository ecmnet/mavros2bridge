package px4_msgs.msg.dds;

import us.ihmc.communication.packets.Packet;
import us.ihmc.euclid.interfaces.Settable;
import us.ihmc.euclid.interfaces.EpsilonComparable;
import java.util.function.Supplier;
import us.ihmc.pubsub.TopicDataType;

public class GimbalDeviceSetAttitude extends Packet<GimbalDeviceSetAttitude> implements Settable<GimbalDeviceSetAttitude>, EpsilonComparable<GimbalDeviceSetAttitude>
{
   public static final long GIMBAL_DEVICE_FLAGS_RETRACT = 1;
   public static final long GIMBAL_DEVICE_FLAGS_NEUTRAL = 2;
   public static final long GIMBAL_DEVICE_FLAGS_ROLL_LOCK = 4;
   public static final long GIMBAL_DEVICE_FLAGS_PITCH_LOCK = 8;
   public static final long GIMBAL_DEVICE_FLAGS_YAW_LOCK = 16;
   /**
            * time since system start (microseconds)
            */
   public long timestamp_;
   public byte target_system_;
   public byte target_component_;
   public int flags_;
   public float[] q_;
   public float angular_velocity_x_;
   public float angular_velocity_y_;
   public float angular_velocity_z_;

   public GimbalDeviceSetAttitude()
   {
      q_ = new float[4];

   }

   public GimbalDeviceSetAttitude(GimbalDeviceSetAttitude other)
   {
      this();
      set(other);
   }

   public void set(GimbalDeviceSetAttitude other)
   {
      timestamp_ = other.timestamp_;

      target_system_ = other.target_system_;

      target_component_ = other.target_component_;

      flags_ = other.flags_;

      for(int i1 = 0; i1 < q_.length; ++i1)
      {
            q_[i1] = other.q_[i1];

      }

      angular_velocity_x_ = other.angular_velocity_x_;

      angular_velocity_y_ = other.angular_velocity_y_;

      angular_velocity_z_ = other.angular_velocity_z_;

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

   public void setFlags(int flags)
   {
      flags_ = flags;
   }
   public int getFlags()
   {
      return flags_;
   }


   public float[] getQ()
   {
      return q_;
   }

   public void setAngularVelocityX(float angular_velocity_x)
   {
      angular_velocity_x_ = angular_velocity_x;
   }
   public float getAngularVelocityX()
   {
      return angular_velocity_x_;
   }

   public void setAngularVelocityY(float angular_velocity_y)
   {
      angular_velocity_y_ = angular_velocity_y;
   }
   public float getAngularVelocityY()
   {
      return angular_velocity_y_;
   }

   public void setAngularVelocityZ(float angular_velocity_z)
   {
      angular_velocity_z_ = angular_velocity_z;
   }
   public float getAngularVelocityZ()
   {
      return angular_velocity_z_;
   }


   public static Supplier<GimbalDeviceSetAttitudePubSubType> getPubSubType()
   {
      return GimbalDeviceSetAttitudePubSubType::new;
   }

   @Override
   public Supplier<TopicDataType> getPubSubTypePacket()
   {
      return GimbalDeviceSetAttitudePubSubType::new;
   }

   @Override
   public boolean epsilonEquals(GimbalDeviceSetAttitude other, double epsilon)
   {
      if(other == null) return false;
      if(other == this) return true;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_, other.timestamp_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.target_system_, other.target_system_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.target_component_, other.target_component_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.flags_, other.flags_, epsilon)) return false;

      for(int i3 = 0; i3 < q_.length; ++i3)
      {
                if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.q_[i3], other.q_[i3], epsilon)) return false;
      }

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.angular_velocity_x_, other.angular_velocity_x_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.angular_velocity_y_, other.angular_velocity_y_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.angular_velocity_z_, other.angular_velocity_z_, epsilon)) return false;


      return true;
   }

   @Override
   public boolean equals(Object other)
   {
      if(other == null) return false;
      if(other == this) return true;
      if(!(other instanceof GimbalDeviceSetAttitude)) return false;

      GimbalDeviceSetAttitude otherMyClass = (GimbalDeviceSetAttitude) other;

      if(this.timestamp_ != otherMyClass.timestamp_) return false;

      if(this.target_system_ != otherMyClass.target_system_) return false;

      if(this.target_component_ != otherMyClass.target_component_) return false;

      if(this.flags_ != otherMyClass.flags_) return false;

      for(int i5 = 0; i5 < q_.length; ++i5)
      {
                if(this.q_[i5] != otherMyClass.q_[i5]) return false;

      }
      if(this.angular_velocity_x_ != otherMyClass.angular_velocity_x_) return false;

      if(this.angular_velocity_y_ != otherMyClass.angular_velocity_y_) return false;

      if(this.angular_velocity_z_ != otherMyClass.angular_velocity_z_) return false;


      return true;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("GimbalDeviceSetAttitude {");
      builder.append("timestamp=");
      builder.append(this.timestamp_);      builder.append(", ");
      builder.append("target_system=");
      builder.append(this.target_system_);      builder.append(", ");
      builder.append("target_component=");
      builder.append(this.target_component_);      builder.append(", ");
      builder.append("flags=");
      builder.append(this.flags_);      builder.append(", ");
      builder.append("q=");
      builder.append(java.util.Arrays.toString(this.q_));      builder.append(", ");
      builder.append("angular_velocity_x=");
      builder.append(this.angular_velocity_x_);      builder.append(", ");
      builder.append("angular_velocity_y=");
      builder.append(this.angular_velocity_y_);      builder.append(", ");
      builder.append("angular_velocity_z=");
      builder.append(this.angular_velocity_z_);
      builder.append("}");
      return builder.toString();
   }
}
