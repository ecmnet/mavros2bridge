package px4_msgs.msg.dds;

import us.ihmc.communication.packets.Packet;
import us.ihmc.euclid.interfaces.Settable;
import us.ihmc.euclid.interfaces.EpsilonComparable;
import java.util.function.Supplier;
import us.ihmc.pubsub.TopicDataType;

/**
       * Message to stream ULog data from the logger. Corresponds to the LOGGING_DATA
       * mavlink message
       * Acked messages are published synchronous: a
       * publisher waits for an ack before sending the
       * next message
       */
public class UlogStream extends Packet<UlogStream> implements Settable<UlogStream>, EpsilonComparable<UlogStream>
{
   /**
          * flags bitmasks
          * if set, this message requires to be acked.
          */
   public static final byte FLAGS_NEED_ACK = (byte) 1;
   /**
          * TODO: we might be able to reduce this if mavlink polled on the topic
          */
   public static final byte ORB_QUEUE_LENGTH = (byte) 16;
   /**
            * time since system start (microseconds)
            */
   public long timestamp_;
   /**
            * length of data
            */
   public byte length_;
   /**
            * offset into data where first message starts. This
            */
   public byte first_message_offset_;
   /**
            * can be used for recovery, when a previous message got lost
            * allows determine drops
            */
   public int msg_sequence_;
   /**
            * see FLAGS_*
            */
   public byte flags_;
   /**
            * ulog data
            */
   public byte[] data_;

   public UlogStream()
   {
      data_ = new byte[249];

   }

   public UlogStream(UlogStream other)
   {
      this();
      set(other);
   }

   public void set(UlogStream other)
   {
      timestamp_ = other.timestamp_;

      length_ = other.length_;

      first_message_offset_ = other.first_message_offset_;

      msg_sequence_ = other.msg_sequence_;

      flags_ = other.flags_;

      for(int i1 = 0; i1 < data_.length; ++i1)
      {
            data_[i1] = other.data_[i1];

      }

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
            * length of data
            */
   public void setLength(byte length)
   {
      length_ = length;
   }
   /**
            * length of data
            */
   public byte getLength()
   {
      return length_;
   }

   /**
            * offset into data where first message starts. This
            */
   public void setFirstMessageOffset(byte first_message_offset)
   {
      first_message_offset_ = first_message_offset;
   }
   /**
            * offset into data where first message starts. This
            */
   public byte getFirstMessageOffset()
   {
      return first_message_offset_;
   }

   /**
            * can be used for recovery, when a previous message got lost
            * allows determine drops
            */
   public void setMsgSequence(int msg_sequence)
   {
      msg_sequence_ = msg_sequence;
   }
   /**
            * can be used for recovery, when a previous message got lost
            * allows determine drops
            */
   public int getMsgSequence()
   {
      return msg_sequence_;
   }

   /**
            * see FLAGS_*
            */
   public void setFlags(byte flags)
   {
      flags_ = flags;
   }
   /**
            * see FLAGS_*
            */
   public byte getFlags()
   {
      return flags_;
   }


   /**
            * ulog data
            */
   public byte[] getData()
   {
      return data_;
   }


   public static Supplier<UlogStreamPubSubType> getPubSubType()
   {
      return UlogStreamPubSubType::new;
   }

   @Override
   public Supplier<TopicDataType> getPubSubTypePacket()
   {
      return UlogStreamPubSubType::new;
   }

   @Override
   public boolean epsilonEquals(UlogStream other, double epsilon)
   {
      if(other == null) return false;
      if(other == this) return true;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_, other.timestamp_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.length_, other.length_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.first_message_offset_, other.first_message_offset_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.msg_sequence_, other.msg_sequence_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.flags_, other.flags_, epsilon)) return false;

      for(int i3 = 0; i3 < data_.length; ++i3)
      {
                if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.data_[i3], other.data_[i3], epsilon)) return false;
      }


      return true;
   }

   @Override
   public boolean equals(Object other)
   {
      if(other == null) return false;
      if(other == this) return true;
      if(!(other instanceof UlogStream)) return false;

      UlogStream otherMyClass = (UlogStream) other;

      if(this.timestamp_ != otherMyClass.timestamp_) return false;

      if(this.length_ != otherMyClass.length_) return false;

      if(this.first_message_offset_ != otherMyClass.first_message_offset_) return false;

      if(this.msg_sequence_ != otherMyClass.msg_sequence_) return false;

      if(this.flags_ != otherMyClass.flags_) return false;

      for(int i5 = 0; i5 < data_.length; ++i5)
      {
                if(this.data_[i5] != otherMyClass.data_[i5]) return false;

      }

      return true;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("UlogStream {");
      builder.append("timestamp=");
      builder.append(this.timestamp_);      builder.append(", ");
      builder.append("length=");
      builder.append(this.length_);      builder.append(", ");
      builder.append("first_message_offset=");
      builder.append(this.first_message_offset_);      builder.append(", ");
      builder.append("msg_sequence=");
      builder.append(this.msg_sequence_);      builder.append(", ");
      builder.append("flags=");
      builder.append(this.flags_);      builder.append(", ");
      builder.append("data=");
      builder.append(java.util.Arrays.toString(this.data_));
      builder.append("}");
      return builder.toString();
   }
}
