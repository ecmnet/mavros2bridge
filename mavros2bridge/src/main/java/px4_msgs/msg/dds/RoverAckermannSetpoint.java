package px4_msgs.msg.dds;

import us.ihmc.communication.packets.Packet;
import us.ihmc.euclid.interfaces.Settable;
import us.ihmc.euclid.interfaces.EpsilonComparable;
import java.util.function.Supplier;
import us.ihmc.pubsub.TopicDataType;

public class RoverAckermannSetpoint extends Packet<RoverAckermannSetpoint> implements Settable<RoverAckermannSetpoint>, EpsilonComparable<RoverAckermannSetpoint>
{
   /**
            * time since system start (microseconds)
            */
   public long timestamp_;
   /**
            * [m/s] Desired speed in body x direction. Positiv: forwards, Negativ: backwards
            */
   public float forward_speed_setpoint_;
   /**
            * [-1, 1] Desired normalized speed in body x direction. Positiv: forwards, Negativ: backwards
            */
   public float forward_speed_setpoint_normalized_;
   /**
            * [rad] Desired steering angle
            */
   public float steering_setpoint_;
   /**
            * [-1, 1] Desired normalized steering angle
            */
   public float steering_setpoint_normalized_;
   /**
            * [m/s^2] Desired acceleration in body y direction. Positiv: right, Negativ: left.
            */
   public float lateral_acceleration_setpoint_;

   public RoverAckermannSetpoint()
   {
   }

   public RoverAckermannSetpoint(RoverAckermannSetpoint other)
   {
      this();
      set(other);
   }

   public void set(RoverAckermannSetpoint other)
   {
      timestamp_ = other.timestamp_;

      forward_speed_setpoint_ = other.forward_speed_setpoint_;

      forward_speed_setpoint_normalized_ = other.forward_speed_setpoint_normalized_;

      steering_setpoint_ = other.steering_setpoint_;

      steering_setpoint_normalized_ = other.steering_setpoint_normalized_;

      lateral_acceleration_setpoint_ = other.lateral_acceleration_setpoint_;

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
            * [m/s] Desired speed in body x direction. Positiv: forwards, Negativ: backwards
            */
   public void setForwardSpeedSetpoint(float forward_speed_setpoint)
   {
      forward_speed_setpoint_ = forward_speed_setpoint;
   }
   /**
            * [m/s] Desired speed in body x direction. Positiv: forwards, Negativ: backwards
            */
   public float getForwardSpeedSetpoint()
   {
      return forward_speed_setpoint_;
   }

   /**
            * [-1, 1] Desired normalized speed in body x direction. Positiv: forwards, Negativ: backwards
            */
   public void setForwardSpeedSetpointNormalized(float forward_speed_setpoint_normalized)
   {
      forward_speed_setpoint_normalized_ = forward_speed_setpoint_normalized;
   }
   /**
            * [-1, 1] Desired normalized speed in body x direction. Positiv: forwards, Negativ: backwards
            */
   public float getForwardSpeedSetpointNormalized()
   {
      return forward_speed_setpoint_normalized_;
   }

   /**
            * [rad] Desired steering angle
            */
   public void setSteeringSetpoint(float steering_setpoint)
   {
      steering_setpoint_ = steering_setpoint;
   }
   /**
            * [rad] Desired steering angle
            */
   public float getSteeringSetpoint()
   {
      return steering_setpoint_;
   }

   /**
            * [-1, 1] Desired normalized steering angle
            */
   public void setSteeringSetpointNormalized(float steering_setpoint_normalized)
   {
      steering_setpoint_normalized_ = steering_setpoint_normalized;
   }
   /**
            * [-1, 1] Desired normalized steering angle
            */
   public float getSteeringSetpointNormalized()
   {
      return steering_setpoint_normalized_;
   }

   /**
            * [m/s^2] Desired acceleration in body y direction. Positiv: right, Negativ: left.
            */
   public void setLateralAccelerationSetpoint(float lateral_acceleration_setpoint)
   {
      lateral_acceleration_setpoint_ = lateral_acceleration_setpoint;
   }
   /**
            * [m/s^2] Desired acceleration in body y direction. Positiv: right, Negativ: left.
            */
   public float getLateralAccelerationSetpoint()
   {
      return lateral_acceleration_setpoint_;
   }


   public static Supplier<RoverAckermannSetpointPubSubType> getPubSubType()
   {
      return RoverAckermannSetpointPubSubType::new;
   }

   @Override
   public Supplier<TopicDataType> getPubSubTypePacket()
   {
      return RoverAckermannSetpointPubSubType::new;
   }

   @Override
   public boolean epsilonEquals(RoverAckermannSetpoint other, double epsilon)
   {
      if(other == null) return false;
      if(other == this) return true;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_, other.timestamp_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.forward_speed_setpoint_, other.forward_speed_setpoint_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.forward_speed_setpoint_normalized_, other.forward_speed_setpoint_normalized_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.steering_setpoint_, other.steering_setpoint_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.steering_setpoint_normalized_, other.steering_setpoint_normalized_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.lateral_acceleration_setpoint_, other.lateral_acceleration_setpoint_, epsilon)) return false;


      return true;
   }

   @Override
   public boolean equals(Object other)
   {
      if(other == null) return false;
      if(other == this) return true;
      if(!(other instanceof RoverAckermannSetpoint)) return false;

      RoverAckermannSetpoint otherMyClass = (RoverAckermannSetpoint) other;

      if(this.timestamp_ != otherMyClass.timestamp_) return false;

      if(this.forward_speed_setpoint_ != otherMyClass.forward_speed_setpoint_) return false;

      if(this.forward_speed_setpoint_normalized_ != otherMyClass.forward_speed_setpoint_normalized_) return false;

      if(this.steering_setpoint_ != otherMyClass.steering_setpoint_) return false;

      if(this.steering_setpoint_normalized_ != otherMyClass.steering_setpoint_normalized_) return false;

      if(this.lateral_acceleration_setpoint_ != otherMyClass.lateral_acceleration_setpoint_) return false;


      return true;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("RoverAckermannSetpoint {");
      builder.append("timestamp=");
      builder.append(this.timestamp_);      builder.append(", ");
      builder.append("forward_speed_setpoint=");
      builder.append(this.forward_speed_setpoint_);      builder.append(", ");
      builder.append("forward_speed_setpoint_normalized=");
      builder.append(this.forward_speed_setpoint_normalized_);      builder.append(", ");
      builder.append("steering_setpoint=");
      builder.append(this.steering_setpoint_);      builder.append(", ");
      builder.append("steering_setpoint_normalized=");
      builder.append(this.steering_setpoint_normalized_);      builder.append(", ");
      builder.append("lateral_acceleration_setpoint=");
      builder.append(this.lateral_acceleration_setpoint_);
      builder.append("}");
      return builder.toString();
   }
}
