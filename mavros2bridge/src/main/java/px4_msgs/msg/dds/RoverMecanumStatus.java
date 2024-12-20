package px4_msgs.msg.dds;

import us.ihmc.communication.packets.Packet;
import us.ihmc.euclid.interfaces.Settable;
import us.ihmc.euclid.interfaces.EpsilonComparable;
import java.util.function.Supplier;
import us.ihmc.pubsub.TopicDataType;

public class RoverMecanumStatus extends Packet<RoverMecanumStatus> implements Settable<RoverMecanumStatus>, EpsilonComparable<RoverMecanumStatus>
{
   /**
            * time since system start (microseconds)
            */
   public long timestamp_;
   /**
            * [m/s] Measured speed in body x direction. Positiv: forwards, Negativ: backwards
            */
   public float measured_forward_speed_;
   /**
            * [m/s] Speed setpoint after applying slew rate
            */
   public float adjusted_forward_speed_setpoint_;
   /**
            * [m/s] Measured speed in body y direction. Positiv: right, Negativ: left
            */
   public float measured_lateral_speed_;
   /**
            * [m/s] Speed setpoint after applying slew rate
            */
   public float adjusted_lateral_speed_setpoint_;
   /**
            * [rad/s] Measured yaw rate
            */
   public float measured_yaw_rate_;
   /**
            * [rad/s] Yaw rate setpoint output by the closed loop yaw controller
            */
   public float clyaw_yaw_rate_setpoint_;
   /**
            * [rad/s] Yaw rate setpoint from the closed loop yaw controller
            */
   public float adjusted_yaw_rate_setpoint_;
   /**
            * [rad] Measured yaw
            */
   public float measured_yaw_;
   /**
            * [rad] Yaw setpoint after applying slew rate
            */
   public float adjusted_yaw_setpoint_;
   /**
            * Integral of the PID for the closed loop yaw rate controller
            */
   public float pid_yaw_rate_integral_;
   /**
            * Integral of the PID for the closed loop yaw controller
            */
   public float pid_yaw_integral_;
   /**
            * Integral of the PID for the closed loop forward speed controller
            */
   public float pid_forward_throttle_integral_;
   /**
            * Integral of the PID for the closed loop lateral speed controller
            */
   public float pid_lateral_throttle_integral_;

   public RoverMecanumStatus()
   {
   }

   public RoverMecanumStatus(RoverMecanumStatus other)
   {
      this();
      set(other);
   }

   public void set(RoverMecanumStatus other)
   {
      timestamp_ = other.timestamp_;

      measured_forward_speed_ = other.measured_forward_speed_;

      adjusted_forward_speed_setpoint_ = other.adjusted_forward_speed_setpoint_;

      measured_lateral_speed_ = other.measured_lateral_speed_;

      adjusted_lateral_speed_setpoint_ = other.adjusted_lateral_speed_setpoint_;

      measured_yaw_rate_ = other.measured_yaw_rate_;

      clyaw_yaw_rate_setpoint_ = other.clyaw_yaw_rate_setpoint_;

      adjusted_yaw_rate_setpoint_ = other.adjusted_yaw_rate_setpoint_;

      measured_yaw_ = other.measured_yaw_;

      adjusted_yaw_setpoint_ = other.adjusted_yaw_setpoint_;

      pid_yaw_rate_integral_ = other.pid_yaw_rate_integral_;

      pid_yaw_integral_ = other.pid_yaw_integral_;

      pid_forward_throttle_integral_ = other.pid_forward_throttle_integral_;

      pid_lateral_throttle_integral_ = other.pid_lateral_throttle_integral_;

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
            * [m/s] Measured speed in body x direction. Positiv: forwards, Negativ: backwards
            */
   public void setMeasuredForwardSpeed(float measured_forward_speed)
   {
      measured_forward_speed_ = measured_forward_speed;
   }
   /**
            * [m/s] Measured speed in body x direction. Positiv: forwards, Negativ: backwards
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
            * [m/s] Measured speed in body y direction. Positiv: right, Negativ: left
            */
   public void setMeasuredLateralSpeed(float measured_lateral_speed)
   {
      measured_lateral_speed_ = measured_lateral_speed;
   }
   /**
            * [m/s] Measured speed in body y direction. Positiv: right, Negativ: left
            */
   public float getMeasuredLateralSpeed()
   {
      return measured_lateral_speed_;
   }

   /**
            * [m/s] Speed setpoint after applying slew rate
            */
   public void setAdjustedLateralSpeedSetpoint(float adjusted_lateral_speed_setpoint)
   {
      adjusted_lateral_speed_setpoint_ = adjusted_lateral_speed_setpoint;
   }
   /**
            * [m/s] Speed setpoint after applying slew rate
            */
   public float getAdjustedLateralSpeedSetpoint()
   {
      return adjusted_lateral_speed_setpoint_;
   }

   /**
            * [rad/s] Measured yaw rate
            */
   public void setMeasuredYawRate(float measured_yaw_rate)
   {
      measured_yaw_rate_ = measured_yaw_rate;
   }
   /**
            * [rad/s] Measured yaw rate
            */
   public float getMeasuredYawRate()
   {
      return measured_yaw_rate_;
   }

   /**
            * [rad/s] Yaw rate setpoint output by the closed loop yaw controller
            */
   public void setClyawYawRateSetpoint(float clyaw_yaw_rate_setpoint)
   {
      clyaw_yaw_rate_setpoint_ = clyaw_yaw_rate_setpoint;
   }
   /**
            * [rad/s] Yaw rate setpoint output by the closed loop yaw controller
            */
   public float getClyawYawRateSetpoint()
   {
      return clyaw_yaw_rate_setpoint_;
   }

   /**
            * [rad/s] Yaw rate setpoint from the closed loop yaw controller
            */
   public void setAdjustedYawRateSetpoint(float adjusted_yaw_rate_setpoint)
   {
      adjusted_yaw_rate_setpoint_ = adjusted_yaw_rate_setpoint;
   }
   /**
            * [rad/s] Yaw rate setpoint from the closed loop yaw controller
            */
   public float getAdjustedYawRateSetpoint()
   {
      return adjusted_yaw_rate_setpoint_;
   }

   /**
            * [rad] Measured yaw
            */
   public void setMeasuredYaw(float measured_yaw)
   {
      measured_yaw_ = measured_yaw;
   }
   /**
            * [rad] Measured yaw
            */
   public float getMeasuredYaw()
   {
      return measured_yaw_;
   }

   /**
            * [rad] Yaw setpoint after applying slew rate
            */
   public void setAdjustedYawSetpoint(float adjusted_yaw_setpoint)
   {
      adjusted_yaw_setpoint_ = adjusted_yaw_setpoint;
   }
   /**
            * [rad] Yaw setpoint after applying slew rate
            */
   public float getAdjustedYawSetpoint()
   {
      return adjusted_yaw_setpoint_;
   }

   /**
            * Integral of the PID for the closed loop yaw rate controller
            */
   public void setPidYawRateIntegral(float pid_yaw_rate_integral)
   {
      pid_yaw_rate_integral_ = pid_yaw_rate_integral;
   }
   /**
            * Integral of the PID for the closed loop yaw rate controller
            */
   public float getPidYawRateIntegral()
   {
      return pid_yaw_rate_integral_;
   }

   /**
            * Integral of the PID for the closed loop yaw controller
            */
   public void setPidYawIntegral(float pid_yaw_integral)
   {
      pid_yaw_integral_ = pid_yaw_integral;
   }
   /**
            * Integral of the PID for the closed loop yaw controller
            */
   public float getPidYawIntegral()
   {
      return pid_yaw_integral_;
   }

   /**
            * Integral of the PID for the closed loop forward speed controller
            */
   public void setPidForwardThrottleIntegral(float pid_forward_throttle_integral)
   {
      pid_forward_throttle_integral_ = pid_forward_throttle_integral;
   }
   /**
            * Integral of the PID for the closed loop forward speed controller
            */
   public float getPidForwardThrottleIntegral()
   {
      return pid_forward_throttle_integral_;
   }

   /**
            * Integral of the PID for the closed loop lateral speed controller
            */
   public void setPidLateralThrottleIntegral(float pid_lateral_throttle_integral)
   {
      pid_lateral_throttle_integral_ = pid_lateral_throttle_integral;
   }
   /**
            * Integral of the PID for the closed loop lateral speed controller
            */
   public float getPidLateralThrottleIntegral()
   {
      return pid_lateral_throttle_integral_;
   }


   public static Supplier<RoverMecanumStatusPubSubType> getPubSubType()
   {
      return RoverMecanumStatusPubSubType::new;
   }

   @Override
   public Supplier<TopicDataType> getPubSubTypePacket()
   {
      return RoverMecanumStatusPubSubType::new;
   }

   @Override
   public boolean epsilonEquals(RoverMecanumStatus other, double epsilon)
   {
      if(other == null) return false;
      if(other == this) return true;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_, other.timestamp_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.measured_forward_speed_, other.measured_forward_speed_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.adjusted_forward_speed_setpoint_, other.adjusted_forward_speed_setpoint_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.measured_lateral_speed_, other.measured_lateral_speed_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.adjusted_lateral_speed_setpoint_, other.adjusted_lateral_speed_setpoint_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.measured_yaw_rate_, other.measured_yaw_rate_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.clyaw_yaw_rate_setpoint_, other.clyaw_yaw_rate_setpoint_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.adjusted_yaw_rate_setpoint_, other.adjusted_yaw_rate_setpoint_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.measured_yaw_, other.measured_yaw_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.adjusted_yaw_setpoint_, other.adjusted_yaw_setpoint_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.pid_yaw_rate_integral_, other.pid_yaw_rate_integral_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.pid_yaw_integral_, other.pid_yaw_integral_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.pid_forward_throttle_integral_, other.pid_forward_throttle_integral_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.pid_lateral_throttle_integral_, other.pid_lateral_throttle_integral_, epsilon)) return false;


      return true;
   }

   @Override
   public boolean equals(Object other)
   {
      if(other == null) return false;
      if(other == this) return true;
      if(!(other instanceof RoverMecanumStatus)) return false;

      RoverMecanumStatus otherMyClass = (RoverMecanumStatus) other;

      if(this.timestamp_ != otherMyClass.timestamp_) return false;

      if(this.measured_forward_speed_ != otherMyClass.measured_forward_speed_) return false;

      if(this.adjusted_forward_speed_setpoint_ != otherMyClass.adjusted_forward_speed_setpoint_) return false;

      if(this.measured_lateral_speed_ != otherMyClass.measured_lateral_speed_) return false;

      if(this.adjusted_lateral_speed_setpoint_ != otherMyClass.adjusted_lateral_speed_setpoint_) return false;

      if(this.measured_yaw_rate_ != otherMyClass.measured_yaw_rate_) return false;

      if(this.clyaw_yaw_rate_setpoint_ != otherMyClass.clyaw_yaw_rate_setpoint_) return false;

      if(this.adjusted_yaw_rate_setpoint_ != otherMyClass.adjusted_yaw_rate_setpoint_) return false;

      if(this.measured_yaw_ != otherMyClass.measured_yaw_) return false;

      if(this.adjusted_yaw_setpoint_ != otherMyClass.adjusted_yaw_setpoint_) return false;

      if(this.pid_yaw_rate_integral_ != otherMyClass.pid_yaw_rate_integral_) return false;

      if(this.pid_yaw_integral_ != otherMyClass.pid_yaw_integral_) return false;

      if(this.pid_forward_throttle_integral_ != otherMyClass.pid_forward_throttle_integral_) return false;

      if(this.pid_lateral_throttle_integral_ != otherMyClass.pid_lateral_throttle_integral_) return false;


      return true;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("RoverMecanumStatus {");
      builder.append("timestamp=");
      builder.append(this.timestamp_);      builder.append(", ");
      builder.append("measured_forward_speed=");
      builder.append(this.measured_forward_speed_);      builder.append(", ");
      builder.append("adjusted_forward_speed_setpoint=");
      builder.append(this.adjusted_forward_speed_setpoint_);      builder.append(", ");
      builder.append("measured_lateral_speed=");
      builder.append(this.measured_lateral_speed_);      builder.append(", ");
      builder.append("adjusted_lateral_speed_setpoint=");
      builder.append(this.adjusted_lateral_speed_setpoint_);      builder.append(", ");
      builder.append("measured_yaw_rate=");
      builder.append(this.measured_yaw_rate_);      builder.append(", ");
      builder.append("clyaw_yaw_rate_setpoint=");
      builder.append(this.clyaw_yaw_rate_setpoint_);      builder.append(", ");
      builder.append("adjusted_yaw_rate_setpoint=");
      builder.append(this.adjusted_yaw_rate_setpoint_);      builder.append(", ");
      builder.append("measured_yaw=");
      builder.append(this.measured_yaw_);      builder.append(", ");
      builder.append("adjusted_yaw_setpoint=");
      builder.append(this.adjusted_yaw_setpoint_);      builder.append(", ");
      builder.append("pid_yaw_rate_integral=");
      builder.append(this.pid_yaw_rate_integral_);      builder.append(", ");
      builder.append("pid_yaw_integral=");
      builder.append(this.pid_yaw_integral_);      builder.append(", ");
      builder.append("pid_forward_throttle_integral=");
      builder.append(this.pid_forward_throttle_integral_);      builder.append(", ");
      builder.append("pid_lateral_throttle_integral=");
      builder.append(this.pid_lateral_throttle_integral_);
      builder.append("}");
      return builder.toString();
   }
}