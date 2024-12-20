package px4_msgs.msg.dds;

import us.ihmc.communication.packets.Packet;
import us.ihmc.euclid.interfaces.Settable;
import us.ihmc.euclid.interfaces.EpsilonComparable;
import java.util.function.Supplier;
import us.ihmc.pubsub.TopicDataType;

public class RoverDifferentialSetpoint extends Packet<RoverDifferentialSetpoint> implements Settable<RoverDifferentialSetpoint>, EpsilonComparable<RoverDifferentialSetpoint>
{
   /**
            * time since system start (microseconds)
            */
   public long timestamp_;
   /**
            * [m/s] Desired forward speed for the rover
            */
   public float forward_speed_setpoint_;
   /**
            * [-1, 1] Normalized forward speed for the rover
            */
   public float forward_speed_setpoint_normalized_;
   /**
            * [rad/s] Desired yaw rate for the rover (Overriden by yaw controller if yaw_setpoint is used)
            */
   public float yaw_rate_setpoint_;
   /**
            * [-1, 1] Normalized speed difference between the left and right wheels
            */
   public float speed_diff_setpoint_normalized_;
   /**
            * [rad] Desired yaw (heading) for the rover
            */
   public float yaw_setpoint_;

   public RoverDifferentialSetpoint()
   {
   }

   public RoverDifferentialSetpoint(RoverDifferentialSetpoint other)
   {
      this();
      set(other);
   }

   public void set(RoverDifferentialSetpoint other)
   {
      timestamp_ = other.timestamp_;

      forward_speed_setpoint_ = other.forward_speed_setpoint_;

      forward_speed_setpoint_normalized_ = other.forward_speed_setpoint_normalized_;

      yaw_rate_setpoint_ = other.yaw_rate_setpoint_;

      speed_diff_setpoint_normalized_ = other.speed_diff_setpoint_normalized_;

      yaw_setpoint_ = other.yaw_setpoint_;

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
            * [m/s] Desired forward speed for the rover
            */
   public void setForwardSpeedSetpoint(float forward_speed_setpoint)
   {
      forward_speed_setpoint_ = forward_speed_setpoint;
   }
   /**
            * [m/s] Desired forward speed for the rover
            */
   public float getForwardSpeedSetpoint()
   {
      return forward_speed_setpoint_;
   }

   /**
            * [-1, 1] Normalized forward speed for the rover
            */
   public void setForwardSpeedSetpointNormalized(float forward_speed_setpoint_normalized)
   {
      forward_speed_setpoint_normalized_ = forward_speed_setpoint_normalized;
   }
   /**
            * [-1, 1] Normalized forward speed for the rover
            */
   public float getForwardSpeedSetpointNormalized()
   {
      return forward_speed_setpoint_normalized_;
   }

   /**
            * [rad/s] Desired yaw rate for the rover (Overriden by yaw controller if yaw_setpoint is used)
            */
   public void setYawRateSetpoint(float yaw_rate_setpoint)
   {
      yaw_rate_setpoint_ = yaw_rate_setpoint;
   }
   /**
            * [rad/s] Desired yaw rate for the rover (Overriden by yaw controller if yaw_setpoint is used)
            */
   public float getYawRateSetpoint()
   {
      return yaw_rate_setpoint_;
   }

   /**
            * [-1, 1] Normalized speed difference between the left and right wheels
            */
   public void setSpeedDiffSetpointNormalized(float speed_diff_setpoint_normalized)
   {
      speed_diff_setpoint_normalized_ = speed_diff_setpoint_normalized;
   }
   /**
            * [-1, 1] Normalized speed difference between the left and right wheels
            */
   public float getSpeedDiffSetpointNormalized()
   {
      return speed_diff_setpoint_normalized_;
   }

   /**
            * [rad] Desired yaw (heading) for the rover
            */
   public void setYawSetpoint(float yaw_setpoint)
   {
      yaw_setpoint_ = yaw_setpoint;
   }
   /**
            * [rad] Desired yaw (heading) for the rover
            */
   public float getYawSetpoint()
   {
      return yaw_setpoint_;
   }


   public static Supplier<RoverDifferentialSetpointPubSubType> getPubSubType()
   {
      return RoverDifferentialSetpointPubSubType::new;
   }

   @Override
   public Supplier<TopicDataType> getPubSubTypePacket()
   {
      return RoverDifferentialSetpointPubSubType::new;
   }

   @Override
   public boolean epsilonEquals(RoverDifferentialSetpoint other, double epsilon)
   {
      if(other == null) return false;
      if(other == this) return true;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_, other.timestamp_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.forward_speed_setpoint_, other.forward_speed_setpoint_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.forward_speed_setpoint_normalized_, other.forward_speed_setpoint_normalized_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.yaw_rate_setpoint_, other.yaw_rate_setpoint_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.speed_diff_setpoint_normalized_, other.speed_diff_setpoint_normalized_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.yaw_setpoint_, other.yaw_setpoint_, epsilon)) return false;


      return true;
   }

   @Override
   public boolean equals(Object other)
   {
      if(other == null) return false;
      if(other == this) return true;
      if(!(other instanceof RoverDifferentialSetpoint)) return false;

      RoverDifferentialSetpoint otherMyClass = (RoverDifferentialSetpoint) other;

      if(this.timestamp_ != otherMyClass.timestamp_) return false;

      if(this.forward_speed_setpoint_ != otherMyClass.forward_speed_setpoint_) return false;

      if(this.forward_speed_setpoint_normalized_ != otherMyClass.forward_speed_setpoint_normalized_) return false;

      if(this.yaw_rate_setpoint_ != otherMyClass.yaw_rate_setpoint_) return false;

      if(this.speed_diff_setpoint_normalized_ != otherMyClass.speed_diff_setpoint_normalized_) return false;

      if(this.yaw_setpoint_ != otherMyClass.yaw_setpoint_) return false;


      return true;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("RoverDifferentialSetpoint {");
      builder.append("timestamp=");
      builder.append(this.timestamp_);      builder.append(", ");
      builder.append("forward_speed_setpoint=");
      builder.append(this.forward_speed_setpoint_);      builder.append(", ");
      builder.append("forward_speed_setpoint_normalized=");
      builder.append(this.forward_speed_setpoint_normalized_);      builder.append(", ");
      builder.append("yaw_rate_setpoint=");
      builder.append(this.yaw_rate_setpoint_);      builder.append(", ");
      builder.append("speed_diff_setpoint_normalized=");
      builder.append(this.speed_diff_setpoint_normalized_);      builder.append(", ");
      builder.append("yaw_setpoint=");
      builder.append(this.yaw_setpoint_);
      builder.append("}");
      return builder.toString();
   }
}
