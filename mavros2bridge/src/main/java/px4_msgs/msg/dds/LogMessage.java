package px4_msgs.msg.dds;

import us.ihmc.communication.packets.Packet;
import us.ihmc.euclid.interfaces.Settable;
import us.ihmc.euclid.interfaces.EpsilonComparable;
import java.util.function.Supplier;
import us.ihmc.pubsub.TopicDataType;

/**
       * A logging message, output with PX4_WARN, PX4_ERR, PX4_INFO
       */
public class LogMessage extends Packet<LogMessage> implements Settable<LogMessage>, EpsilonComparable<LogMessage>
{
   public static final byte ORB_QUEUE_LENGTH = (byte) 4;/**
            * time since system start (microseconds)
            */
   public long timestamp_;
   /**
            * log level (same as in the linux kernel, starting with 0)
            */
   public byte severity_;
   public char[] text_;

   public LogMessage()
   {
      text_ = new char[127];

   }

   public LogMessage(LogMessage other)
   {
      this();
      set(other);
   }

   public void set(LogMessage other)
   {
      timestamp_ = other.timestamp_;

      severity_ = other.severity_;

      for(int i1 = 0; i1 < text_.length; ++i1)
      {
            text_[i1] = other.text_[i1];

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
            * log level (same as in the linux kernel, starting with 0)
            */
   public void setSeverity(byte severity)
   {
      severity_ = severity;
   }
   /**
            * log level (same as in the linux kernel, starting with 0)
            */
   public byte getSeverity()
   {
      return severity_;
   }


   public char[] getText()
   {
      return text_;
   }


   public static Supplier<LogMessagePubSubType> getPubSubType()
   {
      return LogMessagePubSubType::new;
   }

   @Override
   public Supplier<TopicDataType> getPubSubTypePacket()
   {
      return LogMessagePubSubType::new;
   }

   @Override
   public boolean epsilonEquals(LogMessage other, double epsilon)
   {
      if(other == null) return false;
      if(other == this) return true;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_, other.timestamp_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.severity_, other.severity_, epsilon)) return false;

      for(int i3 = 0; i3 < text_.length; ++i3)
      {
                if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.text_[i3], other.text_[i3], epsilon)) return false;
      }


      return true;
   }

   @Override
   public boolean equals(Object other)
   {
      if(other == null) return false;
      if(other == this) return true;
      if(!(other instanceof LogMessage)) return false;

      LogMessage otherMyClass = (LogMessage) other;

      if(this.timestamp_ != otherMyClass.timestamp_) return false;

      if(this.severity_ != otherMyClass.severity_) return false;

      for(int i5 = 0; i5 < text_.length; ++i5)
      {
                if(this.text_[i5] != otherMyClass.text_[i5]) return false;

      }

      return true;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("LogMessage {");
      builder.append("timestamp=");
      builder.append(this.timestamp_);      builder.append(", ");
      builder.append("severity=");
      builder.append(this.severity_);      builder.append(", ");
      builder.append("text=");
      builder.append(java.util.Arrays.toString(this.text_));
      builder.append("}");
      return builder.toString();
   }
}
