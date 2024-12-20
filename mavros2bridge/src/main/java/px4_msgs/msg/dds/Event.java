package px4_msgs.msg.dds;

import us.ihmc.communication.packets.Packet;
import us.ihmc.euclid.interfaces.Settable;
import us.ihmc.euclid.interfaces.EpsilonComparable;
import java.util.function.Supplier;
import us.ihmc.pubsub.TopicDataType;

public class Event extends Packet<Event> implements Settable<Event>, EpsilonComparable<Event>
{
   public static final byte ORB_QUEUE_LENGTH = (byte) 16;/**
            * Events interface
            * time since system start (microseconds)
            */
   public long timestamp_;
   /**
            * Event ID
            */
   public long id_;
   /**
            * Event sequence number
            */
   public int event_sequence_;
   /**
            * (optional) arguments, depend on event id
            */
   public byte[] arguments_;
   /**
            * Log levels: 4 bits MSB: internal, 4 bits LSB: external
            */
   public byte log_levels_;

   public Event()
   {
      arguments_ = new byte[25];

   }

   public Event(Event other)
   {
      this();
      set(other);
   }

   public void set(Event other)
   {
      timestamp_ = other.timestamp_;

      id_ = other.id_;

      event_sequence_ = other.event_sequence_;

      for(int i1 = 0; i1 < arguments_.length; ++i1)
      {
            arguments_[i1] = other.arguments_[i1];

      }

      log_levels_ = other.log_levels_;

   }

   /**
            * Events interface
            * time since system start (microseconds)
            */
   public void setTimestamp(long timestamp)
   {
      timestamp_ = timestamp;
   }
   /**
            * Events interface
            * time since system start (microseconds)
            */
   public long getTimestamp()
   {
      return timestamp_;
   }

   /**
            * Event ID
            */
   public void setId(long id)
   {
      id_ = id;
   }
   /**
            * Event ID
            */
   public long getId()
   {
      return id_;
   }

   /**
            * Event sequence number
            */
   public void setEventSequence(int event_sequence)
   {
      event_sequence_ = event_sequence;
   }
   /**
            * Event sequence number
            */
   public int getEventSequence()
   {
      return event_sequence_;
   }


   /**
            * (optional) arguments, depend on event id
            */
   public byte[] getArguments()
   {
      return arguments_;
   }

   /**
            * Log levels: 4 bits MSB: internal, 4 bits LSB: external
            */
   public void setLogLevels(byte log_levels)
   {
      log_levels_ = log_levels;
   }
   /**
            * Log levels: 4 bits MSB: internal, 4 bits LSB: external
            */
   public byte getLogLevels()
   {
      return log_levels_;
   }


   public static Supplier<EventPubSubType> getPubSubType()
   {
      return EventPubSubType::new;
   }

   @Override
   public Supplier<TopicDataType> getPubSubTypePacket()
   {
      return EventPubSubType::new;
   }

   @Override
   public boolean epsilonEquals(Event other, double epsilon)
   {
      if(other == null) return false;
      if(other == this) return true;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_, other.timestamp_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.id_, other.id_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.event_sequence_, other.event_sequence_, epsilon)) return false;

      for(int i3 = 0; i3 < arguments_.length; ++i3)
      {
                if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.arguments_[i3], other.arguments_[i3], epsilon)) return false;
      }

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.log_levels_, other.log_levels_, epsilon)) return false;


      return true;
   }

   @Override
   public boolean equals(Object other)
   {
      if(other == null) return false;
      if(other == this) return true;
      if(!(other instanceof Event)) return false;

      Event otherMyClass = (Event) other;

      if(this.timestamp_ != otherMyClass.timestamp_) return false;

      if(this.id_ != otherMyClass.id_) return false;

      if(this.event_sequence_ != otherMyClass.event_sequence_) return false;

      for(int i5 = 0; i5 < arguments_.length; ++i5)
      {
                if(this.arguments_[i5] != otherMyClass.arguments_[i5]) return false;

      }
      if(this.log_levels_ != otherMyClass.log_levels_) return false;


      return true;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("Event {");
      builder.append("timestamp=");
      builder.append(this.timestamp_);      builder.append(", ");
      builder.append("id=");
      builder.append(this.id_);      builder.append(", ");
      builder.append("event_sequence=");
      builder.append(this.event_sequence_);      builder.append(", ");
      builder.append("arguments=");
      builder.append(java.util.Arrays.toString(this.arguments_));      builder.append(", ");
      builder.append("log_levels=");
      builder.append(this.log_levels_);
      builder.append("}");
      return builder.toString();
   }
}
