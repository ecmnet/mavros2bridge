package px4_msgs.msg.dds;

import us.ihmc.communication.packets.Packet;
import us.ihmc.euclid.interfaces.Settable;
import us.ihmc.euclid.interfaces.EpsilonComparable;
import java.util.function.Supplier;
import us.ihmc.pubsub.TopicDataType;

/**
       * power button state notification message
       */
public class PowerButtonState extends Packet<PowerButtonState> implements Settable<PowerButtonState>, EpsilonComparable<PowerButtonState>
{
   /**
          * Button went up without meeting shutdown button down time (delete event)
          */
   public static final byte PWR_BUTTON_STATE_IDEL = (byte) 0;
   /**
          * Button went Down
          */
   public static final byte PWR_BUTTON_STATE_DOWN = (byte) 1;
   /**
          * Button went Up
          */
   public static final byte PWR_BUTTON_STATE_UP = (byte) 2;
   /**
          * Button went Up after meeting shutdown button down time
          */
   public static final byte PWR_BUTTON_STATE_REQUEST_SHUTDOWN = (byte) 3;
   /**
            * time since system start (microseconds)
            */
   public long timestamp_;
   /**
            * one of PWR_BUTTON_STATE_*
            */
   public byte event_;

   public PowerButtonState()
   {
   }

   public PowerButtonState(PowerButtonState other)
   {
      this();
      set(other);
   }

   public void set(PowerButtonState other)
   {
      timestamp_ = other.timestamp_;

      event_ = other.event_;

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
            * one of PWR_BUTTON_STATE_*
            */
   public void setEvent(byte event)
   {
      event_ = event;
   }
   /**
            * one of PWR_BUTTON_STATE_*
            */
   public byte getEvent()
   {
      return event_;
   }


   public static Supplier<PowerButtonStatePubSubType> getPubSubType()
   {
      return PowerButtonStatePubSubType::new;
   }

   @Override
   public Supplier<TopicDataType> getPubSubTypePacket()
   {
      return PowerButtonStatePubSubType::new;
   }

   @Override
   public boolean epsilonEquals(PowerButtonState other, double epsilon)
   {
      if(other == null) return false;
      if(other == this) return true;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_, other.timestamp_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.event_, other.event_, epsilon)) return false;


      return true;
   }

   @Override
   public boolean equals(Object other)
   {
      if(other == null) return false;
      if(other == this) return true;
      if(!(other instanceof PowerButtonState)) return false;

      PowerButtonState otherMyClass = (PowerButtonState) other;

      if(this.timestamp_ != otherMyClass.timestamp_) return false;

      if(this.event_ != otherMyClass.event_) return false;


      return true;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("PowerButtonState {");
      builder.append("timestamp=");
      builder.append(this.timestamp_);      builder.append(", ");
      builder.append("event=");
      builder.append(this.event_);
      builder.append("}");
      return builder.toString();
   }
}
