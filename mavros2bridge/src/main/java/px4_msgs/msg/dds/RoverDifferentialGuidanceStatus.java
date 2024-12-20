package px4_msgs.msg.dds;

import us.ihmc.communication.packets.Packet;
import us.ihmc.euclid.interfaces.Settable;
import us.ihmc.euclid.interfaces.EpsilonComparable;
import java.util.function.Supplier;
import us.ihmc.pubsub.TopicDataType;

public class RoverDifferentialGuidanceStatus extends Packet<RoverDifferentialGuidanceStatus> implements Settable<RoverDifferentialGuidanceStatus>, EpsilonComparable<RoverDifferentialGuidanceStatus>
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
   public float heading_error_deg_;
   /**
            * Driving state of the rover [0: SPOT_TURNING, 1: DRIVING, 2: GOAL_REACHED]
            */
   public byte state_machine_;

   public RoverDifferentialGuidanceStatus()
   {
   }

   public RoverDifferentialGuidanceStatus(RoverDifferentialGuidanceStatus other)
   {
      this();
      set(other);
   }

   public void set(RoverDifferentialGuidanceStatus other)
   {
      timestamp_ = other.timestamp_;

      lookahead_distance_ = other.lookahead_distance_;

      heading_error_deg_ = other.heading_error_deg_;

      state_machine_ = other.state_machine_;

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
   public void setHeadingErrorDeg(float heading_error_deg)
   {
      heading_error_deg_ = heading_error_deg;
   }
   /**
            * [deg] Heading error of the pure pursuit controller
            */
   public float getHeadingErrorDeg()
   {
      return heading_error_deg_;
   }

   /**
            * Driving state of the rover [0: SPOT_TURNING, 1: DRIVING, 2: GOAL_REACHED]
            */
   public void setStateMachine(byte state_machine)
   {
      state_machine_ = state_machine;
   }
   /**
            * Driving state of the rover [0: SPOT_TURNING, 1: DRIVING, 2: GOAL_REACHED]
            */
   public byte getStateMachine()
   {
      return state_machine_;
   }


   public static Supplier<RoverDifferentialGuidanceStatusPubSubType> getPubSubType()
   {
      return RoverDifferentialGuidanceStatusPubSubType::new;
   }

   @Override
   public Supplier<TopicDataType> getPubSubTypePacket()
   {
      return RoverDifferentialGuidanceStatusPubSubType::new;
   }

   @Override
   public boolean epsilonEquals(RoverDifferentialGuidanceStatus other, double epsilon)
   {
      if(other == null) return false;
      if(other == this) return true;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_, other.timestamp_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.lookahead_distance_, other.lookahead_distance_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.heading_error_deg_, other.heading_error_deg_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.state_machine_, other.state_machine_, epsilon)) return false;


      return true;
   }

   @Override
   public boolean equals(Object other)
   {
      if(other == null) return false;
      if(other == this) return true;
      if(!(other instanceof RoverDifferentialGuidanceStatus)) return false;

      RoverDifferentialGuidanceStatus otherMyClass = (RoverDifferentialGuidanceStatus) other;

      if(this.timestamp_ != otherMyClass.timestamp_) return false;

      if(this.lookahead_distance_ != otherMyClass.lookahead_distance_) return false;

      if(this.heading_error_deg_ != otherMyClass.heading_error_deg_) return false;

      if(this.state_machine_ != otherMyClass.state_machine_) return false;


      return true;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("RoverDifferentialGuidanceStatus {");
      builder.append("timestamp=");
      builder.append(this.timestamp_);      builder.append(", ");
      builder.append("lookahead_distance=");
      builder.append(this.lookahead_distance_);      builder.append(", ");
      builder.append("heading_error_deg=");
      builder.append(this.heading_error_deg_);      builder.append(", ");
      builder.append("state_machine=");
      builder.append(this.state_machine_);
      builder.append("}");
      return builder.toString();
   }
}
