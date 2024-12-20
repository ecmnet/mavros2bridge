package px4_msgs.msg.dds;

import us.ihmc.communication.packets.Packet;
import us.ihmc.euclid.interfaces.Settable;
import us.ihmc.euclid.interfaces.EpsilonComparable;
import java.util.function.Supplier;
import us.ihmc.pubsub.TopicDataType;

public class RoverMecanumGuidanceStatus extends Packet<RoverMecanumGuidanceStatus> implements Settable<RoverMecanumGuidanceStatus>, EpsilonComparable<RoverMecanumGuidanceStatus>
{
   /**
            * time since system start (microseconds)
            */
   public long timestamp_;
   /**
            * [m] Lookahead distance of pure the pursuit controller
            */
   public float lookahead_distance_;
   /**
            * [rad] Heading error of the pure pursuit controller
            */
   public float heading_error_;
   /**
            * [m/s] Desired velocity magnitude (speed)
            */
   public float desired_speed_;

   public RoverMecanumGuidanceStatus()
   {
   }

   public RoverMecanumGuidanceStatus(RoverMecanumGuidanceStatus other)
   {
      this();
      set(other);
   }

   public void set(RoverMecanumGuidanceStatus other)
   {
      timestamp_ = other.timestamp_;

      lookahead_distance_ = other.lookahead_distance_;

      heading_error_ = other.heading_error_;

      desired_speed_ = other.desired_speed_;

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
            * [m] Lookahead distance of pure the pursuit controller
            */
   public void setLookaheadDistance(float lookahead_distance)
   {
      lookahead_distance_ = lookahead_distance;
   }
   /**
            * [m] Lookahead distance of pure the pursuit controller
            */
   public float getLookaheadDistance()
   {
      return lookahead_distance_;
   }

   /**
            * [rad] Heading error of the pure pursuit controller
            */
   public void setHeadingError(float heading_error)
   {
      heading_error_ = heading_error;
   }
   /**
            * [rad] Heading error of the pure pursuit controller
            */
   public float getHeadingError()
   {
      return heading_error_;
   }

   /**
            * [m/s] Desired velocity magnitude (speed)
            */
   public void setDesiredSpeed(float desired_speed)
   {
      desired_speed_ = desired_speed;
   }
   /**
            * [m/s] Desired velocity magnitude (speed)
            */
   public float getDesiredSpeed()
   {
      return desired_speed_;
   }


   public static Supplier<RoverMecanumGuidanceStatusPubSubType> getPubSubType()
   {
      return RoverMecanumGuidanceStatusPubSubType::new;
   }

   @Override
   public Supplier<TopicDataType> getPubSubTypePacket()
   {
      return RoverMecanumGuidanceStatusPubSubType::new;
   }

   @Override
   public boolean epsilonEquals(RoverMecanumGuidanceStatus other, double epsilon)
   {
      if(other == null) return false;
      if(other == this) return true;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_, other.timestamp_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.lookahead_distance_, other.lookahead_distance_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.heading_error_, other.heading_error_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.desired_speed_, other.desired_speed_, epsilon)) return false;


      return true;
   }

   @Override
   public boolean equals(Object other)
   {
      if(other == null) return false;
      if(other == this) return true;
      if(!(other instanceof RoverMecanumGuidanceStatus)) return false;

      RoverMecanumGuidanceStatus otherMyClass = (RoverMecanumGuidanceStatus) other;

      if(this.timestamp_ != otherMyClass.timestamp_) return false;

      if(this.lookahead_distance_ != otherMyClass.lookahead_distance_) return false;

      if(this.heading_error_ != otherMyClass.heading_error_) return false;

      if(this.desired_speed_ != otherMyClass.desired_speed_) return false;


      return true;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("RoverMecanumGuidanceStatus {");
      builder.append("timestamp=");
      builder.append(this.timestamp_);      builder.append(", ");
      builder.append("lookahead_distance=");
      builder.append(this.lookahead_distance_);      builder.append(", ");
      builder.append("heading_error=");
      builder.append(this.heading_error_);      builder.append(", ");
      builder.append("desired_speed=");
      builder.append(this.desired_speed_);
      builder.append("}");
      return builder.toString();
   }
}
