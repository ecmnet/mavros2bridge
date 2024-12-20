package px4_msgs.msg.dds;

import us.ihmc.communication.packets.Packet;
import us.ihmc.euclid.interfaces.Settable;
import us.ihmc.euclid.interfaces.EpsilonComparable;
import java.util.function.Supplier;
import us.ihmc.pubsub.TopicDataType;

/**
       * Trajectory setpoint in NED frame
       * Input to PID position controller.
       * Needs to be kinematically consistent and feasible for smooth flight.
       * setting a value to NaN means the state should not be controlled
       */
public class TrajectorySetpoint extends Packet<TrajectorySetpoint> implements Settable<TrajectorySetpoint>, EpsilonComparable<TrajectorySetpoint>
{
   /**
            * time since system start (microseconds)
            */
   public long timestamp_;
   /**
            * NED local world frame
            * in meters
            */
   public float[] position_;
   /**
            * in meters/second
            */
   public float[] velocity_;
   /**
            * in meters/second^2
            */
   public float[] acceleration_;
   /**
            * in meters/second^3 (for logging only)
            */
   public float[] jerk_;
   /**
            * euler angle of desired attitude in radians -PI..+PI
            */
   public float yaw_;
   /**
            * angular velocity around NED frame z-axis in radians/second
            */
   public float yawspeed_;

   public TrajectorySetpoint()
   {
      position_ = new float[3];

      velocity_ = new float[3];

      acceleration_ = new float[3];

      jerk_ = new float[3];

   }

   public TrajectorySetpoint(TrajectorySetpoint other)
   {
      this();
      set(other);
   }

   public void set(TrajectorySetpoint other)
   {
      timestamp_ = other.timestamp_;

      for(int i1 = 0; i1 < position_.length; ++i1)
      {
            position_[i1] = other.position_[i1];

      }

      for(int i3 = 0; i3 < velocity_.length; ++i3)
      {
            velocity_[i3] = other.velocity_[i3];

      }

      for(int i5 = 0; i5 < acceleration_.length; ++i5)
      {
            acceleration_[i5] = other.acceleration_[i5];

      }

      for(int i7 = 0; i7 < jerk_.length; ++i7)
      {
            jerk_[i7] = other.jerk_[i7];

      }

      yaw_ = other.yaw_;

      yawspeed_ = other.yawspeed_;

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
            * NED local world frame
            * in meters
            */
   public float[] getPosition()
   {
      return position_;
   }


   /**
            * in meters/second
            */
   public float[] getVelocity()
   {
      return velocity_;
   }


   /**
            * in meters/second^2
            */
   public float[] getAcceleration()
   {
      return acceleration_;
   }


   /**
            * in meters/second^3 (for logging only)
            */
   public float[] getJerk()
   {
      return jerk_;
   }

   /**
            * euler angle of desired attitude in radians -PI..+PI
            */
   public void setYaw(float yaw)
   {
      yaw_ = yaw;
   }
   /**
            * euler angle of desired attitude in radians -PI..+PI
            */
   public float getYaw()
   {
      return yaw_;
   }

   /**
            * angular velocity around NED frame z-axis in radians/second
            */
   public void setYawspeed(float yawspeed)
   {
      yawspeed_ = yawspeed;
   }
   /**
            * angular velocity around NED frame z-axis in radians/second
            */
   public float getYawspeed()
   {
      return yawspeed_;
   }


   public static Supplier<TrajectorySetpointPubSubType> getPubSubType()
   {
      return TrajectorySetpointPubSubType::new;
   }

   @Override
   public Supplier<TopicDataType> getPubSubTypePacket()
   {
      return TrajectorySetpointPubSubType::new;
   }

   @Override
   public boolean epsilonEquals(TrajectorySetpoint other, double epsilon)
   {
      if(other == null) return false;
      if(other == this) return true;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_, other.timestamp_, epsilon)) return false;

      for(int i9 = 0; i9 < position_.length; ++i9)
      {
                if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.position_[i9], other.position_[i9], epsilon)) return false;
      }

      for(int i11 = 0; i11 < velocity_.length; ++i11)
      {
                if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.velocity_[i11], other.velocity_[i11], epsilon)) return false;
      }

      for(int i13 = 0; i13 < acceleration_.length; ++i13)
      {
                if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.acceleration_[i13], other.acceleration_[i13], epsilon)) return false;
      }

      for(int i15 = 0; i15 < jerk_.length; ++i15)
      {
                if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.jerk_[i15], other.jerk_[i15], epsilon)) return false;
      }

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.yaw_, other.yaw_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.yawspeed_, other.yawspeed_, epsilon)) return false;


      return true;
   }

   @Override
   public boolean equals(Object other)
   {
      if(other == null) return false;
      if(other == this) return true;
      if(!(other instanceof TrajectorySetpoint)) return false;

      TrajectorySetpoint otherMyClass = (TrajectorySetpoint) other;

      if(this.timestamp_ != otherMyClass.timestamp_) return false;

      for(int i17 = 0; i17 < position_.length; ++i17)
      {
                if(this.position_[i17] != otherMyClass.position_[i17]) return false;

      }
      for(int i19 = 0; i19 < velocity_.length; ++i19)
      {
                if(this.velocity_[i19] != otherMyClass.velocity_[i19]) return false;

      }
      for(int i21 = 0; i21 < acceleration_.length; ++i21)
      {
                if(this.acceleration_[i21] != otherMyClass.acceleration_[i21]) return false;

      }
      for(int i23 = 0; i23 < jerk_.length; ++i23)
      {
                if(this.jerk_[i23] != otherMyClass.jerk_[i23]) return false;

      }
      if(this.yaw_ != otherMyClass.yaw_) return false;

      if(this.yawspeed_ != otherMyClass.yawspeed_) return false;


      return true;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("TrajectorySetpoint {");
      builder.append("timestamp=");
      builder.append(this.timestamp_);      builder.append(", ");
      builder.append("position=");
      builder.append(java.util.Arrays.toString(this.position_));      builder.append(", ");
      builder.append("velocity=");
      builder.append(java.util.Arrays.toString(this.velocity_));      builder.append(", ");
      builder.append("acceleration=");
      builder.append(java.util.Arrays.toString(this.acceleration_));      builder.append(", ");
      builder.append("jerk=");
      builder.append(java.util.Arrays.toString(this.jerk_));      builder.append(", ");
      builder.append("yaw=");
      builder.append(this.yaw_);      builder.append(", ");
      builder.append("yawspeed=");
      builder.append(this.yawspeed_);
      builder.append("}");
      return builder.toString();
   }
}
