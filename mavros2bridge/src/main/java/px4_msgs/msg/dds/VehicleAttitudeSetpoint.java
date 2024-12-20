package px4_msgs.msg.dds;

import us.ihmc.communication.packets.Packet;
import us.ihmc.euclid.interfaces.Settable;
import us.ihmc.euclid.interfaces.EpsilonComparable;
import java.util.function.Supplier;
import us.ihmc.pubsub.TopicDataType;

public class VehicleAttitudeSetpoint extends Packet<VehicleAttitudeSetpoint> implements Settable<VehicleAttitudeSetpoint>, EpsilonComparable<VehicleAttitudeSetpoint>
{
   /**
            * time since system start (microseconds)
            */
   public long timestamp_;
   /**
            * rad/s (commanded by user)
            */
   public float yaw_sp_move_rate_;
   /**
            * For quaternion-based attitude control
            * Desired quaternion for quaternion control
            */
   public float[] q_d_;
   /**
            * For clarification: For multicopters thrust_body[0] and thrust[1] are usually 0 and thrust[2] is the negative throttle demand.
            * For fixed wings thrust_x is the throttle demand and thrust_y, thrust_z will usually be zero.
            * Normalized thrust command in body FRD frame [-1,1]
            */
   public float[] thrust_body_;
   /**
            * Reset roll/pitch/yaw integrals (navigation logic change)
            */
   public boolean reset_integral_;
   /**
            * control heading with steering wheel (used for auto takeoff on runway)
            */
   public boolean fw_control_yaw_wheel_;

   public VehicleAttitudeSetpoint()
   {
      q_d_ = new float[4];

      thrust_body_ = new float[3];

   }

   public VehicleAttitudeSetpoint(VehicleAttitudeSetpoint other)
   {
      this();
      set(other);
   }

   public void set(VehicleAttitudeSetpoint other)
   {
      timestamp_ = other.timestamp_;

      yaw_sp_move_rate_ = other.yaw_sp_move_rate_;

      for(int i1 = 0; i1 < q_d_.length; ++i1)
      {
            q_d_[i1] = other.q_d_[i1];

      }

      for(int i3 = 0; i3 < thrust_body_.length; ++i3)
      {
            thrust_body_[i3] = other.thrust_body_[i3];

      }

      reset_integral_ = other.reset_integral_;

      fw_control_yaw_wheel_ = other.fw_control_yaw_wheel_;

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
            * rad/s (commanded by user)
            */
   public void setYawSpMoveRate(float yaw_sp_move_rate)
   {
      yaw_sp_move_rate_ = yaw_sp_move_rate;
   }
   /**
            * rad/s (commanded by user)
            */
   public float getYawSpMoveRate()
   {
      return yaw_sp_move_rate_;
   }


   /**
            * For quaternion-based attitude control
            * Desired quaternion for quaternion control
            */
   public float[] getQD()
   {
      return q_d_;
   }


   /**
            * For clarification: For multicopters thrust_body[0] and thrust[1] are usually 0 and thrust[2] is the negative throttle demand.
            * For fixed wings thrust_x is the throttle demand and thrust_y, thrust_z will usually be zero.
            * Normalized thrust command in body FRD frame [-1,1]
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

   /**
            * control heading with steering wheel (used for auto takeoff on runway)
            */
   public void setFwControlYawWheel(boolean fw_control_yaw_wheel)
   {
      fw_control_yaw_wheel_ = fw_control_yaw_wheel;
   }
   /**
            * control heading with steering wheel (used for auto takeoff on runway)
            */
   public boolean getFwControlYawWheel()
   {
      return fw_control_yaw_wheel_;
   }


   public static Supplier<VehicleAttitudeSetpointPubSubType> getPubSubType()
   {
      return VehicleAttitudeSetpointPubSubType::new;
   }

   @Override
   public Supplier<TopicDataType> getPubSubTypePacket()
   {
      return VehicleAttitudeSetpointPubSubType::new;
   }

   @Override
   public boolean epsilonEquals(VehicleAttitudeSetpoint other, double epsilon)
   {
      if(other == null) return false;
      if(other == this) return true;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_, other.timestamp_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.yaw_sp_move_rate_, other.yaw_sp_move_rate_, epsilon)) return false;

      for(int i5 = 0; i5 < q_d_.length; ++i5)
      {
                if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.q_d_[i5], other.q_d_[i5], epsilon)) return false;
      }

      for(int i7 = 0; i7 < thrust_body_.length; ++i7)
      {
                if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.thrust_body_[i7], other.thrust_body_[i7], epsilon)) return false;
      }

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.reset_integral_, other.reset_integral_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.fw_control_yaw_wheel_, other.fw_control_yaw_wheel_, epsilon)) return false;


      return true;
   }

   @Override
   public boolean equals(Object other)
   {
      if(other == null) return false;
      if(other == this) return true;
      if(!(other instanceof VehicleAttitudeSetpoint)) return false;

      VehicleAttitudeSetpoint otherMyClass = (VehicleAttitudeSetpoint) other;

      if(this.timestamp_ != otherMyClass.timestamp_) return false;

      if(this.yaw_sp_move_rate_ != otherMyClass.yaw_sp_move_rate_) return false;

      for(int i9 = 0; i9 < q_d_.length; ++i9)
      {
                if(this.q_d_[i9] != otherMyClass.q_d_[i9]) return false;

      }
      for(int i11 = 0; i11 < thrust_body_.length; ++i11)
      {
                if(this.thrust_body_[i11] != otherMyClass.thrust_body_[i11]) return false;

      }
      if(this.reset_integral_ != otherMyClass.reset_integral_) return false;

      if(this.fw_control_yaw_wheel_ != otherMyClass.fw_control_yaw_wheel_) return false;


      return true;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("VehicleAttitudeSetpoint {");
      builder.append("timestamp=");
      builder.append(this.timestamp_);      builder.append(", ");
      builder.append("yaw_sp_move_rate=");
      builder.append(this.yaw_sp_move_rate_);      builder.append(", ");
      builder.append("q_d=");
      builder.append(java.util.Arrays.toString(this.q_d_));      builder.append(", ");
      builder.append("thrust_body=");
      builder.append(java.util.Arrays.toString(this.thrust_body_));      builder.append(", ");
      builder.append("reset_integral=");
      builder.append(this.reset_integral_);      builder.append(", ");
      builder.append("fw_control_yaw_wheel=");
      builder.append(this.fw_control_yaw_wheel_);
      builder.append("}");
      return builder.toString();
   }
}
