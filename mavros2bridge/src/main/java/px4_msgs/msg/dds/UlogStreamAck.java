package px4_msgs.msg.dds;

import us.ihmc.communication.packets.Packet;
import us.ihmc.euclid.interfaces.Settable;
import us.ihmc.euclid.interfaces.EpsilonComparable;
import java.util.function.Supplier;
import us.ihmc.pubsub.TopicDataType;

/**
       * Ack a previously sent ulog_stream message that had
       * the NEED_ACK flag set
       */
public class UlogStreamAck extends Packet<UlogStreamAck> implements Settable<UlogStreamAck>, EpsilonComparable<UlogStreamAck>
{
   /**
          * timeout waiting for an ack until we retry to send the message [ms]
          */
   public static final int ACK_TIMEOUT = 50;
   /**
          * maximum amount of tries to (re-)send a message, each time waiting ACK_TIMEOUT ms
          */
   public static final int ACK_MAX_TRIES = 50;
   /**
            * time since system start (microseconds)
            */
   public long timestamp_;
   public int msg_sequence_;

   public UlogStreamAck()
   {
   }

   public UlogStreamAck(UlogStreamAck other)
   {
      this();
      set(other);
   }

   public void set(UlogStreamAck other)
   {
      timestamp_ = other.timestamp_;

      msg_sequence_ = other.msg_sequence_;

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

   public void setMsgSequence(int msg_sequence)
   {
      msg_sequence_ = msg_sequence;
   }
   public int getMsgSequence()
   {
      return msg_sequence_;
   }


   public static Supplier<UlogStreamAckPubSubType> getPubSubType()
   {
      return UlogStreamAckPubSubType::new;
   }

   @Override
   public Supplier<TopicDataType> getPubSubTypePacket()
   {
      return UlogStreamAckPubSubType::new;
   }

   @Override
   public boolean epsilonEquals(UlogStreamAck other, double epsilon)
   {
      if(other == null) return false;
      if(other == this) return true;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_, other.timestamp_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.msg_sequence_, other.msg_sequence_, epsilon)) return false;


      return true;
   }

   @Override
   public boolean equals(Object other)
   {
      if(other == null) return false;
      if(other == this) return true;
      if(!(other instanceof UlogStreamAck)) return false;

      UlogStreamAck otherMyClass = (UlogStreamAck) other;

      if(this.timestamp_ != otherMyClass.timestamp_) return false;

      if(this.msg_sequence_ != otherMyClass.msg_sequence_) return false;


      return true;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("UlogStreamAck {");
      builder.append("timestamp=");
      builder.append(this.timestamp_);      builder.append(", ");
      builder.append("msg_sequence=");
      builder.append(this.msg_sequence_);
      builder.append("}");
      return builder.toString();
   }
}
