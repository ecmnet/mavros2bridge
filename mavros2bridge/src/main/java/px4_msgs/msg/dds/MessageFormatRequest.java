package px4_msgs.msg.dds;

import us.ihmc.communication.packets.Packet;
import us.ihmc.euclid.interfaces.Settable;
import us.ihmc.euclid.interfaces.EpsilonComparable;
import java.util.function.Supplier;
import us.ihmc.pubsub.TopicDataType;

/**
       * Request to PX4 to get the hash of a message, to check for message compatibility
       */
public class MessageFormatRequest extends Packet<MessageFormatRequest> implements Settable<MessageFormatRequest>, EpsilonComparable<MessageFormatRequest>
{
   /**
          * Current version of this protocol. Increase this whenever the MessageFormatRequest or MessageFormatResponse changes.
          */
   public static final int LATEST_PROTOCOL_VERSION = 1;
   /**
            * time since system start (microseconds)
            */
   public long timestamp_;
   /**
            * Must be set to LATEST_PROTOCOL_VERSION. Do not change this field, it must be the first field after the timestamp
            */
   public int protocol_version_;
   /**
            * E.g. /fmu/in/vehicle_command
            */
   public char[] topic_name_;

   public MessageFormatRequest()
   {
      topic_name_ = new char[50];

   }

   public MessageFormatRequest(MessageFormatRequest other)
   {
      this();
      set(other);
   }

   public void set(MessageFormatRequest other)
   {
      timestamp_ = other.timestamp_;

      protocol_version_ = other.protocol_version_;

      for(int i1 = 0; i1 < topic_name_.length; ++i1)
      {
            topic_name_[i1] = other.topic_name_[i1];

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
            * Must be set to LATEST_PROTOCOL_VERSION. Do not change this field, it must be the first field after the timestamp
            */
   public void setProtocolVersion(int protocol_version)
   {
      protocol_version_ = protocol_version;
   }
   /**
            * Must be set to LATEST_PROTOCOL_VERSION. Do not change this field, it must be the first field after the timestamp
            */
   public int getProtocolVersion()
   {
      return protocol_version_;
   }


   /**
            * E.g. /fmu/in/vehicle_command
            */
   public char[] getTopicName()
   {
      return topic_name_;
   }


   public static Supplier<MessageFormatRequestPubSubType> getPubSubType()
   {
      return MessageFormatRequestPubSubType::new;
   }

   @Override
   public Supplier<TopicDataType> getPubSubTypePacket()
   {
      return MessageFormatRequestPubSubType::new;
   }

   @Override
   public boolean epsilonEquals(MessageFormatRequest other, double epsilon)
   {
      if(other == null) return false;
      if(other == this) return true;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_, other.timestamp_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.protocol_version_, other.protocol_version_, epsilon)) return false;

      for(int i3 = 0; i3 < topic_name_.length; ++i3)
      {
                if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.topic_name_[i3], other.topic_name_[i3], epsilon)) return false;
      }


      return true;
   }

   @Override
   public boolean equals(Object other)
   {
      if(other == null) return false;
      if(other == this) return true;
      if(!(other instanceof MessageFormatRequest)) return false;

      MessageFormatRequest otherMyClass = (MessageFormatRequest) other;

      if(this.timestamp_ != otherMyClass.timestamp_) return false;

      if(this.protocol_version_ != otherMyClass.protocol_version_) return false;

      for(int i5 = 0; i5 < topic_name_.length; ++i5)
      {
                if(this.topic_name_[i5] != otherMyClass.topic_name_[i5]) return false;

      }

      return true;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("MessageFormatRequest {");
      builder.append("timestamp=");
      builder.append(this.timestamp_);      builder.append(", ");
      builder.append("protocol_version=");
      builder.append(this.protocol_version_);      builder.append(", ");
      builder.append("topic_name=");
      builder.append(java.util.Arrays.toString(this.topic_name_));
      builder.append("}");
      return builder.toString();
   }
}
