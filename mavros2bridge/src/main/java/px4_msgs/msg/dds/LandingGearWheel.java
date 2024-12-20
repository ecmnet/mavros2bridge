package px4_msgs.msg.dds;

import us.ihmc.communication.packets.Packet;
import us.ihmc.euclid.interfaces.Settable;
import us.ihmc.euclid.interfaces.EpsilonComparable;
import java.util.function.Supplier;
import us.ihmc.pubsub.TopicDataType;

public class LandingGearWheel extends Packet<LandingGearWheel> implements Settable<LandingGearWheel>, EpsilonComparable<LandingGearWheel>
{
   /**
            * time since system start (microseconds)
            */
   public long timestamp_;
   /**
            * negative is turning left, positive turning right [-1, 1]
            */
   public float normalized_wheel_setpoint_;

   public LandingGearWheel()
   {
   }

   public LandingGearWheel(LandingGearWheel other)
   {
      this();
      set(other);
   }

   public void set(LandingGearWheel other)
   {
      timestamp_ = other.timestamp_;

      normalized_wheel_setpoint_ = other.normalized_wheel_setpoint_;

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
            * negative is turning left, positive turning right [-1, 1]
            */
   public void setNormalizedWheelSetpoint(float normalized_wheel_setpoint)
   {
      normalized_wheel_setpoint_ = normalized_wheel_setpoint;
   }
   /**
            * negative is turning left, positive turning right [-1, 1]
            */
   public float getNormalizedWheelSetpoint()
   {
      return normalized_wheel_setpoint_;
   }


   public static Supplier<LandingGearWheelPubSubType> getPubSubType()
   {
      return LandingGearWheelPubSubType::new;
   }

   @Override
   public Supplier<TopicDataType> getPubSubTypePacket()
   {
      return LandingGearWheelPubSubType::new;
   }

   @Override
   public boolean epsilonEquals(LandingGearWheel other, double epsilon)
   {
      if(other == null) return false;
      if(other == this) return true;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_, other.timestamp_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.normalized_wheel_setpoint_, other.normalized_wheel_setpoint_, epsilon)) return false;


      return true;
   }

   @Override
   public boolean equals(Object other)
   {
      if(other == null) return false;
      if(other == this) return true;
      if(!(other instanceof LandingGearWheel)) return false;

      LandingGearWheel otherMyClass = (LandingGearWheel) other;

      if(this.timestamp_ != otherMyClass.timestamp_) return false;

      if(this.normalized_wheel_setpoint_ != otherMyClass.normalized_wheel_setpoint_) return false;


      return true;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("LandingGearWheel {");
      builder.append("timestamp=");
      builder.append(this.timestamp_);      builder.append(", ");
      builder.append("normalized_wheel_setpoint=");
      builder.append(this.normalized_wheel_setpoint_);
      builder.append("}");
      return builder.toString();
   }
}
