package px4_msgs.msg.dds;

import us.ihmc.communication.packets.Packet;
import us.ihmc.euclid.interfaces.Settable;
import us.ihmc.euclid.interfaces.EpsilonComparable;
import java.util.function.Supplier;
import us.ihmc.pubsub.TopicDataType;

public class FlightPhaseEstimation extends Packet<FlightPhaseEstimation> implements Settable<FlightPhaseEstimation>, EpsilonComparable<FlightPhaseEstimation>
{
   /**
          * vehicle flight phase is unknown
          */
   public static final byte FLIGHT_PHASE_UNKNOWN = (byte) 0;
   /**
          * Vehicle is in level flight
          */
   public static final byte FLIGHT_PHASE_LEVEL = (byte) 1;
   /**
          * vehicle is in descend
          */
   public static final byte FLIGHT_PHASE_DESCEND = (byte) 2;
   /**
          * vehicle is climbing
          */
   public static final byte FLIGHT_PHASE_CLIMB = (byte) 3;
   /**
            * time since system start (microseconds)
            */
   public long timestamp_;
   /**
            * Estimate of current flight phase
            */
   public byte flight_phase_;

   public FlightPhaseEstimation()
   {
   }

   public FlightPhaseEstimation(FlightPhaseEstimation other)
   {
      this();
      set(other);
   }

   public void set(FlightPhaseEstimation other)
   {
      timestamp_ = other.timestamp_;

      flight_phase_ = other.flight_phase_;

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
            * Estimate of current flight phase
            */
   public void setFlightPhase(byte flight_phase)
   {
      flight_phase_ = flight_phase;
   }
   /**
            * Estimate of current flight phase
            */
   public byte getFlightPhase()
   {
      return flight_phase_;
   }


   public static Supplier<FlightPhaseEstimationPubSubType> getPubSubType()
   {
      return FlightPhaseEstimationPubSubType::new;
   }

   @Override
   public Supplier<TopicDataType> getPubSubTypePacket()
   {
      return FlightPhaseEstimationPubSubType::new;
   }

   @Override
   public boolean epsilonEquals(FlightPhaseEstimation other, double epsilon)
   {
      if(other == null) return false;
      if(other == this) return true;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_, other.timestamp_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.flight_phase_, other.flight_phase_, epsilon)) return false;


      return true;
   }

   @Override
   public boolean equals(Object other)
   {
      if(other == null) return false;
      if(other == this) return true;
      if(!(other instanceof FlightPhaseEstimation)) return false;

      FlightPhaseEstimation otherMyClass = (FlightPhaseEstimation) other;

      if(this.timestamp_ != otherMyClass.timestamp_) return false;

      if(this.flight_phase_ != otherMyClass.flight_phase_) return false;


      return true;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("FlightPhaseEstimation {");
      builder.append("timestamp=");
      builder.append(this.timestamp_);      builder.append(", ");
      builder.append("flight_phase=");
      builder.append(this.flight_phase_);
      builder.append("}");
      return builder.toString();
   }
}
