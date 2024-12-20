package px4_msgs.msg.dds;

import us.ihmc.communication.packets.Packet;
import us.ihmc.euclid.interfaces.Settable;
import us.ihmc.euclid.interfaces.EpsilonComparable;
import java.util.function.Supplier;
import us.ihmc.pubsub.TopicDataType;

/**
       * Local position setpoint in NED frame
       * Telemetry of PID position controller to monitor tracking.
       * NaN means the state was not controlled
       */
public class VehicleLocalPositionSetpoint extends Packet<VehicleLocalPositionSetpoint> implements Settable<VehicleLocalPositionSetpoint>, EpsilonComparable<VehicleLocalPositionSetpoint>
{
   /**
            * time since system start (microseconds)
            */
   public long timestamp_;
   /**
            * in meters NED
            */
   public float x_;
   /**
            * in meters NED
            */
   public float y_;
   /**
            * in meters NED
            */
   public float z_;
   /**
            * in meters/sec
            */
   public float vx_;
   /**
            * in meters/sec
            */
   public float vy_;
   /**
            * in meters/sec
            */
   public float vz_;
   /**
            * in meters/sec^2
            */
   public float[] acceleration_;
   /**
            * normalized thrust vector in NED
            */
   public float[] thrust_;
   /**
            * in radians NED -PI..+PI
            */
   public float yaw_;
   /**
            * in radians/sec
            */
   public float yawspeed_;

   public VehicleLocalPositionSetpoint()
   {
      acceleration_ = new float[3];

      thrust_ = new float[3];

   }

   public VehicleLocalPositionSetpoint(VehicleLocalPositionSetpoint other)
   {
      this();
      set(other);
   }

   public void set(VehicleLocalPositionSetpoint other)
   {
      timestamp_ = other.timestamp_;

      x_ = other.x_;

      y_ = other.y_;

      z_ = other.z_;

      vx_ = other.vx_;

      vy_ = other.vy_;

      vz_ = other.vz_;

      for(int i1 = 0; i1 < acceleration_.length; ++i1)
      {
            acceleration_[i1] = other.acceleration_[i1];

      }

      for(int i3 = 0; i3 < thrust_.length; ++i3)
      {
            thrust_[i3] = other.thrust_[i3];

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
            * in meters NED
            */
   public void setX(float x)
   {
      x_ = x;
   }
   /**
            * in meters NED
            */
   public float getX()
   {
      return x_;
   }

   /**
            * in meters NED
            */
   public void setY(float y)
   {
      y_ = y;
   }
   /**
            * in meters NED
            */
   public float getY()
   {
      return y_;
   }

   /**
            * in meters NED
            */
   public void setZ(float z)
   {
      z_ = z;
   }
   /**
            * in meters NED
            */
   public float getZ()
   {
      return z_;
   }

   /**
            * in meters/sec
            */
   public void setVx(float vx)
   {
      vx_ = vx;
   }
   /**
            * in meters/sec
            */
   public float getVx()
   {
      return vx_;
   }

   /**
            * in meters/sec
            */
   public void setVy(float vy)
   {
      vy_ = vy;
   }
   /**
            * in meters/sec
            */
   public float getVy()
   {
      return vy_;
   }

   /**
            * in meters/sec
            */
   public void setVz(float vz)
   {
      vz_ = vz;
   }
   /**
            * in meters/sec
            */
   public float getVz()
   {
      return vz_;
   }


   /**
            * in meters/sec^2
            */
   public float[] getAcceleration()
   {
      return acceleration_;
   }


   /**
            * normalized thrust vector in NED
            */
   public float[] getThrust()
   {
      return thrust_;
   }

   /**
            * in radians NED -PI..+PI
            */
   public void setYaw(float yaw)
   {
      yaw_ = yaw;
   }
   /**
            * in radians NED -PI..+PI
            */
   public float getYaw()
   {
      return yaw_;
   }

   /**
            * in radians/sec
            */
   public void setYawspeed(float yawspeed)
   {
      yawspeed_ = yawspeed;
   }
   /**
            * in radians/sec
            */
   public float getYawspeed()
   {
      return yawspeed_;
   }


   public static Supplier<VehicleLocalPositionSetpointPubSubType> getPubSubType()
   {
      return VehicleLocalPositionSetpointPubSubType::new;
   }

   @Override
   public Supplier<TopicDataType> getPubSubTypePacket()
   {
      return VehicleLocalPositionSetpointPubSubType::new;
   }

   @Override
   public boolean epsilonEquals(VehicleLocalPositionSetpoint other, double epsilon)
   {
      if(other == null) return false;
      if(other == this) return true;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_, other.timestamp_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.x_, other.x_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.y_, other.y_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.z_, other.z_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.vx_, other.vx_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.vy_, other.vy_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.vz_, other.vz_, epsilon)) return false;

      for(int i5 = 0; i5 < acceleration_.length; ++i5)
      {
                if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.acceleration_[i5], other.acceleration_[i5], epsilon)) return false;
      }

      for(int i7 = 0; i7 < thrust_.length; ++i7)
      {
                if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.thrust_[i7], other.thrust_[i7], epsilon)) return false;
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
      if(!(other instanceof VehicleLocalPositionSetpoint)) return false;

      VehicleLocalPositionSetpoint otherMyClass = (VehicleLocalPositionSetpoint) other;

      if(this.timestamp_ != otherMyClass.timestamp_) return false;

      if(this.x_ != otherMyClass.x_) return false;

      if(this.y_ != otherMyClass.y_) return false;

      if(this.z_ != otherMyClass.z_) return false;

      if(this.vx_ != otherMyClass.vx_) return false;

      if(this.vy_ != otherMyClass.vy_) return false;

      if(this.vz_ != otherMyClass.vz_) return false;

      for(int i9 = 0; i9 < acceleration_.length; ++i9)
      {
                if(this.acceleration_[i9] != otherMyClass.acceleration_[i9]) return false;

      }
      for(int i11 = 0; i11 < thrust_.length; ++i11)
      {
                if(this.thrust_[i11] != otherMyClass.thrust_[i11]) return false;

      }
      if(this.yaw_ != otherMyClass.yaw_) return false;

      if(this.yawspeed_ != otherMyClass.yawspeed_) return false;


      return true;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("VehicleLocalPositionSetpoint {");
      builder.append("timestamp=");
      builder.append(this.timestamp_);      builder.append(", ");
      builder.append("x=");
      builder.append(this.x_);      builder.append(", ");
      builder.append("y=");
      builder.append(this.y_);      builder.append(", ");
      builder.append("z=");
      builder.append(this.z_);      builder.append(", ");
      builder.append("vx=");
      builder.append(this.vx_);      builder.append(", ");
      builder.append("vy=");
      builder.append(this.vy_);      builder.append(", ");
      builder.append("vz=");
      builder.append(this.vz_);      builder.append(", ");
      builder.append("acceleration=");
      builder.append(java.util.Arrays.toString(this.acceleration_));      builder.append(", ");
      builder.append("thrust=");
      builder.append(java.util.Arrays.toString(this.thrust_));      builder.append(", ");
      builder.append("yaw=");
      builder.append(this.yaw_);      builder.append(", ");
      builder.append("yawspeed=");
      builder.append(this.yawspeed_);
      builder.append("}");
      return builder.toString();
   }
}
