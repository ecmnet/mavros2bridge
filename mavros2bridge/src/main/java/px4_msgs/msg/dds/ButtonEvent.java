package px4_msgs.msg.dds;

import us.ihmc.communication.packets.Packet;
import us.ihmc.euclid.interfaces.Settable;
import us.ihmc.euclid.interfaces.EpsilonComparable;
import java.util.function.Supplier;
import us.ihmc.pubsub.TopicDataType;

/**
       * TOPICS button_event safety_button
       */
public class ButtonEvent extends Packet<ButtonEvent> implements Settable<ButtonEvent>, EpsilonComparable<ButtonEvent>
{
   public static final byte ORB_QUEUE_LENGTH = (byte) 2;/**
            * time since system start (microseconds)
            */
   public long timestamp_;
   /**
            * Set to true if the event is triggered
            */
   public boolean triggered_;

   public ButtonEvent()
   {
   }

   public ButtonEvent(ButtonEvent other)
   {
      this();
      set(other);
   }

   public void set(ButtonEvent other)
   {
      timestamp_ = other.timestamp_;

      triggered_ = other.triggered_;

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
            * Set to true if the event is triggered
            */
   public void setTriggered(boolean triggered)
   {
      triggered_ = triggered;
   }
   /**
            * Set to true if the event is triggered
            */
   public boolean getTriggered()
   {
      return triggered_;
   }


   public static Supplier<ButtonEventPubSubType> getPubSubType()
   {
      return ButtonEventPubSubType::new;
   }

   @Override
   public Supplier<TopicDataType> getPubSubTypePacket()
   {
      return ButtonEventPubSubType::new;
   }

   @Override
   public boolean epsilonEquals(ButtonEvent other, double epsilon)
   {
      if(other == null) return false;
      if(other == this) return true;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_, other.timestamp_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.triggered_, other.triggered_, epsilon)) return false;


      return true;
   }

   @Override
   public boolean equals(Object other)
   {
      if(other == null) return false;
      if(other == this) return true;
      if(!(other instanceof ButtonEvent)) return false;

      ButtonEvent otherMyClass = (ButtonEvent) other;

      if(this.timestamp_ != otherMyClass.timestamp_) return false;

      if(this.triggered_ != otherMyClass.triggered_) return false;


      return true;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("ButtonEvent {");
      builder.append("timestamp=");
      builder.append(this.timestamp_);      builder.append(", ");
      builder.append("triggered=");
      builder.append(this.triggered_);
      builder.append("}");
      return builder.toString();
   }
}
