package px4_msgs.msg.dds;

import us.ihmc.communication.packets.Packet;
import us.ihmc.euclid.interfaces.Settable;
import us.ihmc.euclid.interfaces.EpsilonComparable;
import java.util.function.Supplier;
import us.ihmc.pubsub.TopicDataType;

public class RoverAckermannStatus extends Packet<RoverAckermannStatus> implements Settable<RoverAckermannStatus>, EpsilonComparable<RoverAckermannStatus>
{
   /**
            * time since system start (microseconds)
            */
   public long timestamp_;
   /**
            * [m/s] Measured speed in body x direction. Forwards: positiv, Backwards: negativ
            */
   public float measured_forward_speed_;
   /**
            * [m/s] Speed setpoint after applying slew rate
            */
   public float adjusted_forward_speed_setpoint_;
   /**
            * [-1, 1] Normalized steering setpoint
            */
   public float steering_setpoint_normalized_;
   /**
            * [-1, 1] Normalized steering setpoint after applying slew rate
            */
   public float adjusted_steering_setpoint_normalized_;
   /**
            * [m/s^2] Measured acceleration in body y direction. Positiv: right, Negativ: left.
            */
   public float measured_lateral_acceleration_;
   /**
            * Integral of the PID for the closed loop speed controller
            */
   public float pid_throttle_integral_;
   /**
            * Integral of the PID for the closed loop lateral acceleration controller
            */
   public float pid_lat_accel_integral_;

   public RoverAckermannStatus()
   {
   }

   public RoverAckermannStatus(RoverAckermannStatus other)
   {
      this();
      set(other);
   }

   public void set(RoverAckermannStatus other)
   {
      timestamp_ = other.timestamp_;

      measured_forward_speed_ = other.measured_forward_speed_;

      adjusted_forward_speed_setpoint_ = other.adjusted_forward_speed_setpoint_;

      steering_setpoint_normalized_ = other.steering_setpoint_normalized_;

      adjusted_steering_setpoint_normalized_ = other.adjusted_steering_setpoint_normalized_;

      measured_lateral_acceleration_ = other.measured_lateral_acceleration_;

      pid_throttle_integral_ = other.pid_throttle_integral_;

      pid_lat_accel_integral_ = other.pid_lat_accel_integral_;

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
            * [m/s] Measured speed in body x direction. Forwards: positiv, Backwards: negativ
            */
   public void setMeasuredForwardSpeed(float measured_forward_speed)
   {
      measured_forward_speed_ = measured_forward_speed;
   }
   /**
            * [m/s] Measured speed in body x direction. Forwards: positiv, Backwards: negativ
            */
   public float getMeasuredForwardSpeed()
   {
      return measured_forward_speed_;
   }

   /**
            * [m/s] Speed setpoint after applying slew rate
            */
   public void setAdjustedForwardSpeedSetpoint(float adjusted_forward_speed_setpoint)
   {
      adjusted_forward_speed_setpoint_ = adjusted_forward_speed_setpoint;
   }
   /**
            * [m/s] Speed setpoint after applying slew rate
            */
   public float getAdjustedForwardSpeedSetpoint()
   {
      return adjusted_forward_speed_setpoint_;
   }

   /**
            * [-1, 1] Normalized steering setpoint
            */
   public void setSteeringSetpointNormalized(float steering_setpoint_normalized)
   {
      steering_setpoint_normalized_ = steering_setpoint_normalized;
   }
   /**
            * [-1, 1] Normalized steering setpoint
            */
   public float getSteeringSetpointNormalized()
   {
      return steering_setpoint_normalized_;
   }

   /**
            * [-1, 1] Normalized steering setpoint after applying slew rate
            */
   public void setAdjustedSteeringSetpointNormalized(float adjusted_steering_setpoint_normalized)
   {
      adjusted_steering_setpoint_normalized_ = adjusted_steering_setpoint_normalized;
   }
   /**
            * [-1, 1] Normalized steering setpoint after applying slew rate
            */
   public float getAdjustedSteeringSetpointNormalized()
   {
      return adjusted_steering_setpoint_normalized_;
   }

   /**
            * [m/s^2] Measured acceleration in body y direction. Positiv: right, Negativ: left.
            */
   public void setMeasuredLateralAcceleration(float measured_lateral_acceleration)
   {
      measured_lateral_acceleration_ = measured_lateral_acceleration;
   }
   /**
            * [m/s^2] Measured acceleration in body y direction. Positiv: right, Negativ: left.
            */
   public float getMeasuredLateralAcceleration()
   {
      return measured_lateral_acceleration_;
   }

   /**
            * Integral of the PID for the closed loop speed controller
            */
   public void setPidThrottleIntegral(float pid_throttle_integral)
   {
      pid_throttle_integral_ = pid_throttle_integral;
   }
   /**
            * Integral of the PID for the closed loop speed controller
            */
   public float getPidThrottleIntegral()
   {
      return pid_throttle_integral_;
   }

   /**
            * Integral of the PID for the closed loop lateral acceleration controller
            */
   public void setPidLatAccelIntegral(float pid_lat_accel_integral)
   {
      pid_lat_accel_integral_ = pid_lat_accel_integral;
   }
   /**
            * Integral of the PID for the closed loop lateral acceleration controller
            */
   public float getPidLatAccelIntegral()
   {
      return pid_lat_accel_integral_;
   }


   public static Supplier<RoverAckermannStatusPubSubType> getPubSubType()
   {
      return RoverAckermannStatusPubSubType::new;
   }

   @Override
   public Supplier<TopicDataType> getPubSubTypePacket()
   {
      return RoverAckermannStatusPubSubType::new;
   }

   @Override
   public boolean epsilonEquals(RoverAckermannStatus other, double epsilon)
   {
      if(other == null) return false;
      if(other == this) return true;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_, other.timestamp_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.measured_forward_speed_, other.measured_forward_speed_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.adjusted_forward_speed_setpoint_, other.adjusted_forward_speed_setpoint_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.steering_setpoint_normalized_, other.steering_setpoint_normalized_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.adjusted_steering_setpoint_normalized_, other.adjusted_steering_setpoint_normalized_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.measured_lateral_acceleration_, other.measured_lateral_acceleration_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.pid_throttle_integral_, other.pid_throttle_integral_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.pid_lat_accel_integral_, other.pid_lat_accel_integral_, epsilon)) return false;


      return true;
   }

   @Override
   public boolean equals(Object other)
   {
      if(other == null) return false;
      if(other == this) return true;
      if(!(other instanceof RoverAckermannStatus)) return false;

      RoverAckermannStatus otherMyClass = (RoverAckermannStatus) other;

      if(this.timestamp_ != otherMyClass.timestamp_) return false;

      if(this.measured_forward_speed_ != otherMyClass.measured_forward_speed_) return false;

      if(this.adjusted_forward_speed_setpoint_ != otherMyClass.adjusted_forward_speed_setpoint_) return false;

      if(this.steering_setpoint_normalized_ != otherMyClass.steering_setpoint_normalized_) return false;

      if(this.adjusted_steering_setpoint_normalized_ != otherMyClass.adjusted_steering_setpoint_normalized_) return false;

      if(this.measured_lateral_acceleration_ != otherMyClass.measured_lateral_acceleration_) return false;

      if(this.pid_throttle_integral_ != otherMyClass.pid_throttle_integral_) return false;

      if(this.pid_lat_accel_integral_ != otherMyClass.pid_lat_accel_integral_) return false;


      return true;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("RoverAckermannStatus {");
      builder.append("timestamp=");
      builder.append(this.timestamp_);      builder.append(", ");
      builder.append("measured_forward_speed=");
      builder.append(this.measured_forward_speed_);      builder.append(", ");
      builder.append("adjusted_forward_speed_setpoint=");
      builder.append(this.adjusted_forward_speed_setpoint_);      builder.append(", ");
      builder.append("steering_setpoint_normalized=");
      builder.append(this.steering_setpoint_normalized_);      builder.append(", ");
      builder.append("adjusted_steering_setpoint_normalized=");
      builder.append(this.adjusted_steering_setpoint_normalized_);      builder.append(", ");
      builder.append("measured_lateral_acceleration=");
      builder.append(this.measured_lateral_acceleration_);      builder.append(", ");
      builder.append("pid_throttle_integral=");
      builder.append(this.pid_throttle_integral_);      builder.append(", ");
      builder.append("pid_lat_accel_integral=");
      builder.append(this.pid_lat_accel_integral_);
      builder.append("}");
      return builder.toString();
   }
}
