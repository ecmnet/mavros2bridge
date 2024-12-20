package px4_msgs.msg.dds;

import us.ihmc.communication.packets.Packet;
import us.ihmc.euclid.interfaces.Settable;
import us.ihmc.euclid.interfaces.EpsilonComparable;
import java.util.function.Supplier;
import us.ihmc.pubsub.TopicDataType;

/**
       * Response from PX4 with the format of a message
       */
public class MessageFormatResponse extends Packet<MessageFormatResponse> implements Settable<MessageFormatResponse>, EpsilonComparable<MessageFormatResponse>
{
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
   public boolean success_;
   /**
            * hash over all message fields
            */
   public long message_hash_;

   public MessageFormatResponse()
   {
      topic_name_ = new char[50];

   }

   public MessageFormatResponse(MessageFormatResponse other)
   {
      this();
      set(other);
   }

   public void set(MessageFormatResponse other)
   {
      timestamp_ = other.timestamp_;

      protocol_version_ = other.protocol_version_;

      for(int i1 = 0; i1 < topic_name_.length; ++i1)
      {
            topic_name_[i1] = other.topic_name_[i1];

      }

      success_ = other.success_;

      message_hash_ = other.message_hash_;

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

   public void setSuccess(boolean success)
   {
      success_ = success;
   }
   public boolean getSuccess()
   {
      return success_;
   }

   /**
            * hash over all message fields
            */
   public void setMessageHash(long message_hash)
   {
      message_hash_ = message_hash;
   }
   /**
            * hash over all message fields
            */
   public long getMessageHash()
   {
      return message_hash_;
   }


   public static Supplier<MessageFormatResponsePubSubType> getPubSubType()
   {
      return MessageFormatResponsePubSubType::new;
   }

   @Override
   public Supplier<TopicDataType> getPubSubTypePacket()
   {
      return MessageFormatResponsePubSubType::new;
   }

   @Override
   public boolean epsilonEquals(MessageFormatResponse other, double epsilon)
   {
      if(other == null) return false;
      if(other == this) return true;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_, other.timestamp_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.protocol_version_, other.protocol_version_, epsilon)) return false;

      for(int i3 = 0; i3 < topic_name_.length; ++i3)
      {
                if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.topic_name_[i3], other.topic_name_[i3], epsilon)) return false;
      }

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.success_, other.success_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.message_hash_, other.message_hash_, epsilon)) return false;


      return true;
   }

   @Override
   public boolean equals(Object other)
   {
      if(other == null) return false;
      if(other == this) return true;
      if(!(other instanceof MessageFormatResponse)) return false;

      MessageFormatResponse otherMyClass = (MessageFormatResponse) other;

      if(this.timestamp_ != otherMyClass.timestamp_) return false;

      if(this.protocol_version_ != otherMyClass.protocol_version_) return false;

      for(int i5 = 0; i5 < topic_name_.length; ++i5)
      {
                if(this.topic_name_[i5] != otherMyClass.topic_name_[i5]) return false;

      }
      if(this.success_ != otherMyClass.success_) return false;

      if(this.message_hash_ != otherMyClass.message_hash_) return false;


      return true;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("MessageFormatResponse {");
      builder.append("timestamp=");
      builder.append(this.timestamp_);      builder.append(", ");
      builder.append("protocol_version=");
      builder.append(this.protocol_version_);      builder.append(", ");
      builder.append("topic_name=");
      builder.append(java.util.Arrays.toString(this.topic_name_));      builder.append(", ");
      builder.append("success=");
      builder.append(this.success_);      builder.append(", ");
      builder.append("message_hash=");
      builder.append(this.message_hash_);
      builder.append("}");
      return builder.toString();
   }
}
