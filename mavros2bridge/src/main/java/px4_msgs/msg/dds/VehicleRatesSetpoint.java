package px4_msgs.msg.dds;

import us.ihmc.communication.packets.Packet;
import us.ihmc.euclid.interfaces.Settable;
import us.ihmc.euclid.interfaces.EpsilonComparable;
import java.util.function.Supplier;
import us.ihmc.pubsub.TopicDataType;

public class VehicleRatesSetpoint extends Packet<VehicleRatesSetpoint> implements Settable<VehicleRatesSetpoint>, EpsilonComparable<VehicleRatesSetpoint>
{
   /**
            * time since system start (microseconds)
            */
   public long timestamp_;
   /**
            * body angular rates in FRD frame
            * [rad/s] roll rate setpoint
            */
   public float roll_;
   /**
            * [rad/s] pitch rate setpoint
            */
   public float pitch_;
   /**
            * [rad/s] yaw rate setpoint
            */
   public float yaw_;
   /**
            * For clarification: For multicopters thrust_body[0] and thrust[1] are usually 0 and thrust[2] is the negative throttle demand.
            * For fixed wings thrust_x is the throttle demand and thrust_y, thrust_z will usually be zero.
            * Normalized thrust command in body NED frame [-1,1]
            */
   public float[] thrust_body_;
   /**
            * Reset roll/pitch/yaw integrals (navigation logic change)
            */
   public boolean reset_integral_;

   public VehicleRatesSetpoint()
   {
      thrust_body_ = new float[3];

   }

   public VehicleRatesSetpoint(VehicleRatesSetpoint other)
   {
      this();
      set(other);
   }

   public void set(VehicleRatesSetpoint other)
   {
      timestamp_ = other.timestamp_;

      roll_ = other.roll_;

      pitch_ = other.pitch_;

      yaw_ = other.yaw_;

      for(int i1 = 0; i1 < thrust_body_.length; ++i1)
      {
            thrust_body_[i1] = other.thrust_body_[i1];

      }

      reset_integral_ = other.reset_integral_;

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
            * body angular rates in FRD frame
            * [rad/s] roll rate setpoint
            */
   public void setRoll(float roll)
   {
      roll_ = roll;
   }
   /**
            * body angular rates in FRD frame
            * [rad/s] roll rate setpoint
            */
   public float getRoll()
   {
      return roll_;
   }

   /**
            * [rad/s] pitch rate setpoint
            */
   public void setPitch(float pitch)
   {
      pitch_ = pitch;
   }
   /**
            * [rad/s] pitch rate setpoint
            */
   public float getPitch()
   {
      return pitch_;
   }

   /**
            * [rad/s] yaw rate setpoint
            */
   public void setYaw(float yaw)
   {
      yaw_ = yaw;
   }
   /**
            * [rad/s] yaw rate setpoint
            */
   public float getYaw()
   {
      return yaw_;
   }


   /**
            * For clarification: For multicopters thrust_body[0] and thrust[1] are usually 0 and thrust[2] is the negative throttle demand.
            * For fixed wings thrust_x is the throttle demand and thrust_y, thrust_z will usually be zero.
            * Normalized thrust command in body NED frame [-1,1]
            */
   public float[] getThrustBody()
   {
      return thrust_body_;
   }

   /**
            * Reset roll/pitch/yaw integrals (navigation logic change)
            */
   public void setResetIntegral(boolean reset_integral)
   {
      reset_integral_ = reset_integral;
   }
   /**
            * Reset roll/pitch/yaw integrals (navigation logic change)
            */
   public boolean getResetIntegral()
   {
      return reset_integral_;
   }


   public static Supplier<VehicleRatesSetpointPubSubType> getPubSubType()
   {
      return VehicleRatesSetpointPubSubType::new;
   }

   @Override
   public Supplier<TopicDataType> getPubSubTypePacket()
   {
      return VehicleRatesSetpointPubSubType::new;
   }

   @Override
   public boolean epsilonEquals(VehicleRatesSetpoint other, double epsilon)
   {
      if(other == null) return false;
      if(other == this) return true;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_, other.timestamp_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.roll_, other.roll_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.pitch_, other.pitch_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.yaw_, other.yaw_, epsilon)) return false;

      for(int i3 = 0; i3 < thrust_body_.length; ++i3)
      {
                if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.thrust_body_[i3], other.thrust_body_[i3], epsilon)) return false;
      }

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.reset_integral_, other.reset_integral_, epsilon)) return false;


      return true;
   }

   @Override
   public boolean equals(Object other)
   {
      if(other == null) return false;
      if(other == this) return true;
      if(!(other instanceof VehicleRatesSetpoint)) return false;

      VehicleRatesSetpoint otherMyClass = (VehicleRatesSetpoint) other;

      if(this.timestamp_ != otherMyClass.timestamp_) return false;

      if(this.roll_ != otherMyClass.roll_) return false;

      if(this.pitch_ != otherMyClass.pitch_) return false;

      if(this.yaw_ != otherMyClass.yaw_) return false;

      for(int i5 = 0; i5 < thrust_body_.length; ++i5)
      {
                if(this.thrust_body_[i5] != otherMyClass.thrust_body_[i5]) return false;

      }
      if(this.reset_integral_ != otherMyClass.reset_integral_) return false;


      return true;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("VehicleRatesSetpoint {");
      builder.append("timestamp=");
      builder.append(this.timestamp_);      builder.append(", ");
      builder.append("roll=");
      builder.append(this.roll_);      builder.append(", ");
      builder.append("pitch=");
      builder.append(this.pitch_);      builder.append(", ");
      builder.append("yaw=");
      builder.append(this.yaw_);      builder.append(", ");
      builder.append("thrust_body=");
      builder.append(java.util.Arrays.toString(this.thrust_body_));      builder.append(", ");
      builder.append("reset_integral=");
      builder.append(this.reset_integral_);
      builder.append("}");
      return builder.toString();
   }
}
