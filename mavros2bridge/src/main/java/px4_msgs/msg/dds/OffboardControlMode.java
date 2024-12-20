package px4_msgs.msg.dds;

import us.ihmc.communication.packets.Packet;
import us.ihmc.euclid.interfaces.Settable;
import us.ihmc.euclid.interfaces.EpsilonComparable;
import java.util.function.Supplier;
import us.ihmc.pubsub.TopicDataType;

/**
       * Off-board control mode
       */
public class OffboardControlMode extends Packet<OffboardControlMode> implements Settable<OffboardControlMode>, EpsilonComparable<OffboardControlMode>
{
   /**
            * time since system start (microseconds)
            */
   public long timestamp_;
   public boolean position_;
   public boolean velocity_;
   public boolean acceleration_;
   public boolean attitude_;
   public boolean body_rate_;
   public boolean thrust_and_torque_;
   public boolean direct_actuator_;

   public OffboardControlMode()
   {
   }

   public OffboardControlMode(OffboardControlMode other)
   {
      this();
      set(other);
   }

   public void set(OffboardControlMode other)
   {
      timestamp_ = other.timestamp_;

      position_ = other.position_;

      velocity_ = other.velocity_;

      acceleration_ = other.acceleration_;

      attitude_ = other.attitude_;

      body_rate_ = other.body_rate_;

      thrust_and_torque_ = other.thrust_and_torque_;

      direct_actuator_ = other.direct_actuator_;

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

   public void setPosition(boolean position)
   {
      position_ = position;
   }
   public boolean getPosition()
   {
      return position_;
   }

   public void setVelocity(boolean velocity)
   {
      velocity_ = velocity;
   }
   public boolean getVelocity()
   {
      return velocity_;
   }

   public void setAcceleration(boolean acceleration)
   {
      acceleration_ = acceleration;
   }
   public boolean getAcceleration()
   {
      return acceleration_;
   }

   public void setAttitude(boolean attitude)
   {
      attitude_ = attitude;
   }
   public boolean getAttitude()
   {
      return attitude_;
   }

   public void setBodyRate(boolean body_rate)
   {
      body_rate_ = body_rate;
   }
   public boolean getBodyRate()
   {
      return body_rate_;
   }

   public void setThrustAndTorque(boolean thrust_and_torque)
   {
      thrust_and_torque_ = thrust_and_torque;
   }
   public boolean getThrustAndTorque()
   {
      return thrust_and_torque_;
   }

   public void setDirectActuator(boolean direct_actuator)
   {
      direct_actuator_ = direct_actuator;
   }
   public boolean getDirectActuator()
   {
      return direct_actuator_;
   }


   public static Supplier<OffboardControlModePubSubType> getPubSubType()
   {
      return OffboardControlModePubSubType::new;
   }

   @Override
   public Supplier<TopicDataType> getPubSubTypePacket()
   {
      return OffboardControlModePubSubType::new;
   }

   @Override
   public boolean epsilonEquals(OffboardControlMode other, double epsilon)
   {
      if(other == null) return false;
      if(other == this) return true;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_, other.timestamp_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.position_, other.position_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.velocity_, other.velocity_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.acceleration_, other.acceleration_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.attitude_, other.attitude_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.body_rate_, other.body_rate_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.thrust_and_torque_, other.thrust_and_torque_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.direct_actuator_, other.direct_actuator_, epsilon)) return false;


      return true;
   }

   @Override
   public boolean equals(Object other)
   {
      if(other == null) return false;
      if(other == this) return true;
      if(!(other instanceof OffboardControlMode)) return false;

      OffboardControlMode otherMyClass = (OffboardControlMode) other;

      if(this.timestamp_ != otherMyClass.timestamp_) return false;

      if(this.position_ != otherMyClass.position_) return false;

      if(this.velocity_ != otherMyClass.velocity_) return false;

      if(this.acceleration_ != otherMyClass.acceleration_) return false;

      if(this.attitude_ != otherMyClass.attitude_) return false;

      if(this.body_rate_ != otherMyClass.body_rate_) return false;

      if(this.thrust_and_torque_ != otherMyClass.thrust_and_torque_) return false;

      if(this.direct_actuator_ != otherMyClass.direct_actuator_) return false;


      return true;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("OffboardControlMode {");
      builder.append("timestamp=");
      builder.append(this.timestamp_);      builder.append(", ");
      builder.append("position=");
      builder.append(this.position_);      builder.append(", ");
      builder.append("velocity=");
      builder.append(this.velocity_);      builder.append(", ");
      builder.append("acceleration=");
      builder.append(this.acceleration_);      builder.append(", ");
      builder.append("attitude=");
      builder.append(this.attitude_);      builder.append(", ");
      builder.append("body_rate=");
      builder.append(this.body_rate_);      builder.append(", ");
      builder.append("thrust_and_torque=");
      builder.append(this.thrust_and_torque_);      builder.append(", ");
      builder.append("direct_actuator=");
      builder.append(this.direct_actuator_);
      builder.append("}");
      return builder.toString();
   }
}
