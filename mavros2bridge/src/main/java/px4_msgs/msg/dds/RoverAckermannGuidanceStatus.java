package px4_msgs.msg.dds;

import us.ihmc.communication.packets.Packet;
import us.ihmc.euclid.interfaces.Settable;
import us.ihmc.euclid.interfaces.EpsilonComparable;
import java.util.function.Supplier;
import us.ihmc.pubsub.TopicDataType;

public class RoverAckermannGuidanceStatus extends Packet<RoverAckermannGuidanceStatus> implements Settable<RoverAckermannGuidanceStatus>, EpsilonComparable<RoverAckermannGuidanceStatus>
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
            * [deg] Heading error of the pure pursuit controller
            */
   public float heading_error_;

   public RoverAckermannGuidanceStatus()
   {
   }

   public RoverAckermannGuidanceStatus(RoverAckermannGuidanceStatus other)
   {
      this();
      set(other);
   }

   public void set(RoverAckermannGuidanceStatus other)
   {
      timestamp_ = other.timestamp_;

      lookahead_distance_ = other.lookahead_distance_;

      heading_error_ = other.heading_error_;

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
            * [deg] Heading error of the pure pursuit controller
            */
   public void setHeadingError(float heading_error)
   {
      heading_error_ = heading_error;
   }
   /**
            * [deg] Heading error of the pure pursuit controller
            */
   public float getHeadingError()
   {
      return heading_error_;
   }


   public static Supplier<RoverAckermannGuidanceStatusPubSubType> getPubSubType()
   {
      return RoverAckermannGuidanceStatusPubSubType::new;
   }

   @Override
   public Supplier<TopicDataType> getPubSubTypePacket()
   {
      return RoverAckermannGuidanceStatusPubSubType::new;
   }

   @Override
   public boolean epsilonEquals(RoverAckermannGuidanceStatus other, double epsilon)
   {
      if(other == null) return false;
      if(other == this) return true;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_, other.timestamp_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.lookahead_distance_, other.lookahead_distance_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.heading_error_, other.heading_error_, epsilon)) return false;


      return true;
   }

   @Override
   public boolean equals(Object other)
   {
      if(other == null) return false;
      if(other == this) return true;
      if(!(other instanceof RoverAckermannGuidanceStatus)) return false;

      RoverAckermannGuidanceStatus otherMyClass = (RoverAckermannGuidanceStatus) other;

      if(this.timestamp_ != otherMyClass.timestamp_) return false;

      if(this.lookahead_distance_ != otherMyClass.lookahead_distance_) return false;

      if(this.heading_error_ != otherMyClass.heading_error_) return false;


      return true;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("RoverAckermannGuidanceStatus {");
      builder.append("timestamp=");
      builder.append(this.timestamp_);      builder.append(", ");
      builder.append("lookahead_distance=");
      builder.append(this.lookahead_distance_);      builder.append(", ");
      builder.append("heading_error=");
      builder.append(this.heading_error_);
      builder.append("}");
      return builder.toString();
   }
}
