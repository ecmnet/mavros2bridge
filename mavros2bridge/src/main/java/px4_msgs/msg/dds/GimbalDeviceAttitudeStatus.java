package px4_msgs.msg.dds;

import us.ihmc.communication.packets.Packet;
import us.ihmc.euclid.interfaces.Settable;
import us.ihmc.euclid.interfaces.EpsilonComparable;
import java.util.function.Supplier;
import us.ihmc.pubsub.TopicDataType;

public class GimbalDeviceAttitudeStatus extends Packet<GimbalDeviceAttitudeStatus> implements Settable<GimbalDeviceAttitudeStatus>, EpsilonComparable<GimbalDeviceAttitudeStatus>
{
   public static final int DEVICE_FLAGS_RETRACT = 1;
   public static final int DEVICE_FLAGS_NEUTRAL = 2;
   public static final int DEVICE_FLAGS_ROLL_LOCK = 4;
   public static final int DEVICE_FLAGS_PITCH_LOCK = 8;
   public static final int DEVICE_FLAGS_YAW_LOCK = 16;
   /**
            * time since system start (microseconds)
            */
   public long timestamp_;
   public byte target_system_;
   public byte target_component_;
   public int device_flags_;
   public float[] q_;
   public float angular_velocity_x_;
   public float angular_velocity_y_;
   public float angular_velocity_z_;
   public long failure_flags_;
   public boolean received_from_mavlink_;

   public GimbalDeviceAttitudeStatus()
   {
      q_ = new float[4];

   }

   public GimbalDeviceAttitudeStatus(GimbalDeviceAttitudeStatus other)
   {
      this();
      set(other);
   }

   public void set(GimbalDeviceAttitudeStatus other)
   {
      timestamp_ = other.timestamp_;

      target_system_ = other.target_system_;

      target_component_ = other.target_component_;

      device_flags_ = other.device_flags_;

      for(int i1 = 0; i1 < q_.length; ++i1)
      {
            q_[i1] = other.q_[i1];

      }

      angular_velocity_x_ = other.angular_velocity_x_;

      angular_velocity_y_ = other.angular_velocity_y_;

      angular_velocity_z_ = other.angular_velocity_z_;

      failure_flags_ = other.failure_flags_;

      received_from_mavlink_ = other.received_from_mavlink_;

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

   public void setDeviceFlags(int device_flags)
   {
      device_flags_ = device_flags;
   }
   public int getDeviceFlags()
   {
      return device_flags_;
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

   public void setFailureFlags(long failure_flags)
   {
      failure_flags_ = failure_flags;
   }
   public long getFailureFlags()
   {
      return failure_flags_;
   }

   public void setReceivedFromMavlink(boolean received_from_mavlink)
   {
      received_from_mavlink_ = received_from_mavlink;
   }
   public boolean getReceivedFromMavlink()
   {
      return received_from_mavlink_;
   }


   public static Supplier<GimbalDeviceAttitudeStatusPubSubType> getPubSubType()
   {
      return GimbalDeviceAttitudeStatusPubSubType::new;
   }

   @Override
   public Supplier<TopicDataType> getPubSubTypePacket()
   {
      return GimbalDeviceAttitudeStatusPubSubType::new;
   }

   @Override
   public boolean epsilonEquals(GimbalDeviceAttitudeStatus other, double epsilon)
   {
      if(other == null) return false;
      if(other == this) return true;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_, other.timestamp_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.target_system_, other.target_system_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.target_component_, other.target_component_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.device_flags_, other.device_flags_, epsilon)) return false;

      for(int i3 = 0; i3 < q_.length; ++i3)
      {
                if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.q_[i3], other.q_[i3], epsilon)) return false;
      }

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.angular_velocity_x_, other.angular_velocity_x_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.angular_velocity_y_, other.angular_velocity_y_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.angular_velocity_z_, other.angular_velocity_z_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.failure_flags_, other.failure_flags_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.received_from_mavlink_, other.received_from_mavlink_, epsilon)) return false;


      return true;
   }

   @Override
   public boolean equals(Object other)
   {
      if(other == null) return false;
      if(other == this) return true;
      if(!(other instanceof GimbalDeviceAttitudeStatus)) return false;

      GimbalDeviceAttitudeStatus otherMyClass = (GimbalDeviceAttitudeStatus) other;

      if(this.timestamp_ != otherMyClass.timestamp_) return false;

      if(this.target_system_ != otherMyClass.target_system_) return false;

      if(this.target_component_ != otherMyClass.target_component_) return false;

      if(this.device_flags_ != otherMyClass.device_flags_) return false;

      for(int i5 = 0; i5 < q_.length; ++i5)
      {
                if(this.q_[i5] != otherMyClass.q_[i5]) return false;

      }
      if(this.angular_velocity_x_ != otherMyClass.angular_velocity_x_) return false;

      if(this.angular_velocity_y_ != otherMyClass.angular_velocity_y_) return false;

      if(this.angular_velocity_z_ != otherMyClass.angular_velocity_z_) return false;

      if(this.failure_flags_ != otherMyClass.failure_flags_) return false;

      if(this.received_from_mavlink_ != otherMyClass.received_from_mavlink_) return false;


      return true;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("GimbalDeviceAttitudeStatus {");
      builder.append("timestamp=");
      builder.append(this.timestamp_);      builder.append(", ");
      builder.append("target_system=");
      builder.append(this.target_system_);      builder.append(", ");
      builder.append("target_component=");
      builder.append(this.target_component_);      builder.append(", ");
      builder.append("device_flags=");
      builder.append(this.device_flags_);      builder.append(", ");
      builder.append("q=");
      builder.append(java.util.Arrays.toString(this.q_));      builder.append(", ");
      builder.append("angular_velocity_x=");
      builder.append(this.angular_velocity_x_);      builder.append(", ");
      builder.append("angular_velocity_y=");
      builder.append(this.angular_velocity_y_);      builder.append(", ");
      builder.append("angular_velocity_z=");
      builder.append(this.angular_velocity_z_);      builder.append(", ");
      builder.append("failure_flags=");
      builder.append(this.failure_flags_);      builder.append(", ");
      builder.append("received_from_mavlink=");
      builder.append(this.received_from_mavlink_);
      builder.append("}");
      return builder.toString();
   }
}
