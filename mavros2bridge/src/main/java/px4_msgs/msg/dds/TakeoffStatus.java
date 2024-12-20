package px4_msgs.msg.dds;

import us.ihmc.communication.packets.Packet;
import us.ihmc.euclid.interfaces.Settable;
import us.ihmc.euclid.interfaces.EpsilonComparable;
import java.util.function.Supplier;
import us.ihmc.pubsub.TopicDataType;

/**
       * Status of the takeoff state machine currently just available for multicopters
       */
public class TakeoffStatus extends Packet<TakeoffStatus> implements Settable<TakeoffStatus>, EpsilonComparable<TakeoffStatus>
{
   public static final byte TAKEOFF_STATE_UNINITIALIZED = (byte) 0;
   public static final byte TAKEOFF_STATE_DISARMED = (byte) 1;
   public static final byte TAKEOFF_STATE_SPOOLUP = (byte) 2;
   public static final byte TAKEOFF_STATE_READY_FOR_TAKEOFF = (byte) 3;
   public static final byte TAKEOFF_STATE_RAMPUP = (byte) 4;
   public static final byte TAKEOFF_STATE_FLIGHT = (byte) 5;
   /**
            * time since system start (microseconds)
            */
   public long timestamp_;
   public byte takeoff_state_;
   /**
            * limited tilt feasibility during takeoff, contains maximum tilt otherwise
            */
   public float tilt_limit_;

   public TakeoffStatus()
   {
   }

   public TakeoffStatus(TakeoffStatus other)
   {
      this();
      set(other);
   }

   public void set(TakeoffStatus other)
   {
      timestamp_ = other.timestamp_;

      takeoff_state_ = other.takeoff_state_;

      tilt_limit_ = other.tilt_limit_;

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

   public void setTakeoffState(byte takeoff_state)
   {
      takeoff_state_ = takeoff_state;
   }
   public byte getTakeoffState()
   {
      return takeoff_state_;
   }

   /**
            * limited tilt feasibility during takeoff, contains maximum tilt otherwise
            */
   public void setTiltLimit(float tilt_limit)
   {
      tilt_limit_ = tilt_limit;
   }
   /**
            * limited tilt feasibility during takeoff, contains maximum tilt otherwise
            */
   public float getTiltLimit()
   {
      return tilt_limit_;
   }


   public static Supplier<TakeoffStatusPubSubType> getPubSubType()
   {
      return TakeoffStatusPubSubType::new;
   }

   @Override
   public Supplier<TopicDataType> getPubSubTypePacket()
   {
      return TakeoffStatusPubSubType::new;
   }

   @Override
   public boolean epsilonEquals(TakeoffStatus other, double epsilon)
   {
      if(other == null) return false;
      if(other == this) return true;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_, other.timestamp_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.takeoff_state_, other.takeoff_state_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.tilt_limit_, other.tilt_limit_, epsilon)) return false;


      return true;
   }

   @Override
   public boolean equals(Object other)
   {
      if(other == null) return false;
      if(other == this) return true;
      if(!(other instanceof TakeoffStatus)) return false;

      TakeoffStatus otherMyClass = (TakeoffStatus) other;

      if(this.timestamp_ != otherMyClass.timestamp_) return false;

      if(this.takeoff_state_ != otherMyClass.takeoff_state_) return false;

      if(this.tilt_limit_ != otherMyClass.tilt_limit_) return false;


      return true;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("TakeoffStatus {");
      builder.append("timestamp=");
      builder.append(this.timestamp_);      builder.append(", ");
      builder.append("takeoff_state=");
      builder.append(this.takeoff_state_);      builder.append(", ");
      builder.append("tilt_limit=");
      builder.append(this.tilt_limit_);
      builder.append("}");
      return builder.toString();
   }
}
