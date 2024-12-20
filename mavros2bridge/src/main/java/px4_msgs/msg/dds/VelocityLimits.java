package px4_msgs.msg.dds;

import us.ihmc.communication.packets.Packet;
import us.ihmc.euclid.interfaces.Settable;
import us.ihmc.euclid.interfaces.EpsilonComparable;
import java.util.function.Supplier;
import us.ihmc.pubsub.TopicDataType;

/**
       * Velocity and yaw rate limits for a multicopter position slow mode only
       */
public class VelocityLimits extends Packet<VelocityLimits> implements Settable<VelocityLimits>, EpsilonComparable<VelocityLimits>
{
   /**
            * time since system start (microseconds)
            */
   public long timestamp_;
   /**
            * absolute speeds, NAN means use default limit
            * [m/s]
            */
   public float horizontal_velocity_;
   /**
            * [m/s]
            */
   public float vertical_velocity_;
   /**
            * [rad/s]
            */
   public float yaw_rate_;

   public VelocityLimits()
   {
   }

   public VelocityLimits(VelocityLimits other)
   {
      this();
      set(other);
   }

   public void set(VelocityLimits other)
   {
      timestamp_ = other.timestamp_;

      horizontal_velocity_ = other.horizontal_velocity_;

      vertical_velocity_ = other.vertical_velocity_;

      yaw_rate_ = other.yaw_rate_;

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
            * absolute speeds, NAN means use default limit
            * [m/s]
            */
   public void setHorizontalVelocity(float horizontal_velocity)
   {
      horizontal_velocity_ = horizontal_velocity;
   }
   /**
            * absolute speeds, NAN means use default limit
            * [m/s]
            */
   public float getHorizontalVelocity()
   {
      return horizontal_velocity_;
   }

   /**
            * [m/s]
            */
   public void setVerticalVelocity(float vertical_velocity)
   {
      vertical_velocity_ = vertical_velocity;
   }
   /**
            * [m/s]
            */
   public float getVerticalVelocity()
   {
      return vertical_velocity_;
   }

   /**
            * [rad/s]
            */
   public void setYawRate(float yaw_rate)
   {
      yaw_rate_ = yaw_rate;
   }
   /**
            * [rad/s]
            */
   public float getYawRate()
   {
      return yaw_rate_;
   }


   public static Supplier<VelocityLimitsPubSubType> getPubSubType()
   {
      return VelocityLimitsPubSubType::new;
   }

   @Override
   public Supplier<TopicDataType> getPubSubTypePacket()
   {
      return VelocityLimitsPubSubType::new;
   }

   @Override
   public boolean epsilonEquals(VelocityLimits other, double epsilon)
   {
      if(other == null) return false;
      if(other == this) return true;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_, other.timestamp_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.horizontal_velocity_, other.horizontal_velocity_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.vertical_velocity_, other.vertical_velocity_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.yaw_rate_, other.yaw_rate_, epsilon)) return false;


      return true;
   }

   @Override
   public boolean equals(Object other)
   {
      if(other == null) return false;
      if(other == this) return true;
      if(!(other instanceof VelocityLimits)) return false;

      VelocityLimits otherMyClass = (VelocityLimits) other;

      if(this.timestamp_ != otherMyClass.timestamp_) return false;

      if(this.horizontal_velocity_ != otherMyClass.horizontal_velocity_) return false;

      if(this.vertical_velocity_ != otherMyClass.vertical_velocity_) return false;

      if(this.yaw_rate_ != otherMyClass.yaw_rate_) return false;


      return true;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("VelocityLimits {");
      builder.append("timestamp=");
      builder.append(this.timestamp_);      builder.append(", ");
      builder.append("horizontal_velocity=");
      builder.append(this.horizontal_velocity_);      builder.append(", ");
      builder.append("vertical_velocity=");
      builder.append(this.vertical_velocity_);      builder.append(", ");
      builder.append("yaw_rate=");
      builder.append(this.yaw_rate_);
      builder.append("}");
      return builder.toString();
   }
}
