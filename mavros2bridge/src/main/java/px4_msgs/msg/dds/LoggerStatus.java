package px4_msgs.msg.dds;

import us.ihmc.communication.packets.Packet;
import us.ihmc.euclid.interfaces.Settable;
import us.ihmc.euclid.interfaces.EpsilonComparable;
import java.util.function.Supplier;
import us.ihmc.pubsub.TopicDataType;

public class LoggerStatus extends Packet<LoggerStatus> implements Settable<LoggerStatus>, EpsilonComparable<LoggerStatus>
{
   /**
          * Normal, full size log
          */
   public static final byte LOGGER_TYPE_FULL = (byte) 0;
   /**
          * reduced mission log (e.g. for geotagging)
          */
   public static final byte LOGGER_TYPE_MISSION = (byte) 1;
   public static final byte BACKEND_FILE = (byte) 1;
   public static final byte BACKEND_MAVLINK = (byte) 2;
   public static final byte BACKEND_ALL = (byte) 3;
   /**
            * time since system start (microseconds)
            */
   public long timestamp_;
   public byte type_;
   public byte backend_;
   public boolean is_logging_;
   /**
            * total written to log in kiloBytes
            */
   public float total_written_kb_;
   /**
            * write rate in kiloBytes/s
            */
   public float write_rate_kb_s_;
   /**
            * number of failed buffer writes due to buffer overflow
            */
   public long dropouts_;
   /**
            * messages misssed
            */
   public long message_gaps_;
   /**
            * current buffer fill in Bytes
            */
   public long buffer_used_bytes_;
   /**
            * total buffer size in Bytes
            */
   public long buffer_size_bytes_;
   public byte num_messages_;

   public LoggerStatus()
   {
   }

   public LoggerStatus(LoggerStatus other)
   {
      this();
      set(other);
   }

   public void set(LoggerStatus other)
   {
      timestamp_ = other.timestamp_;

      type_ = other.type_;

      backend_ = other.backend_;

      is_logging_ = other.is_logging_;

      total_written_kb_ = other.total_written_kb_;

      write_rate_kb_s_ = other.write_rate_kb_s_;

      dropouts_ = other.dropouts_;

      message_gaps_ = other.message_gaps_;

      buffer_used_bytes_ = other.buffer_used_bytes_;

      buffer_size_bytes_ = other.buffer_size_bytes_;

      num_messages_ = other.num_messages_;

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

   public void setType(byte type)
   {
      type_ = type;
   }
   public byte getType()
   {
      return type_;
   }

   public void setBackend(byte backend)
   {
      backend_ = backend;
   }
   public byte getBackend()
   {
      return backend_;
   }

   public void setIsLogging(boolean is_logging)
   {
      is_logging_ = is_logging;
   }
   public boolean getIsLogging()
   {
      return is_logging_;
   }

   /**
            * total written to log in kiloBytes
            */
   public void setTotalWrittenKb(float total_written_kb)
   {
      total_written_kb_ = total_written_kb;
   }
   /**
            * total written to log in kiloBytes
            */
   public float getTotalWrittenKb()
   {
      return total_written_kb_;
   }

   /**
            * write rate in kiloBytes/s
            */
   public void setWriteRateKbS(float write_rate_kb_s)
   {
      write_rate_kb_s_ = write_rate_kb_s;
   }
   /**
            * write rate in kiloBytes/s
            */
   public float getWriteRateKbS()
   {
      return write_rate_kb_s_;
   }

   /**
            * number of failed buffer writes due to buffer overflow
            */
   public void setDropouts(long dropouts)
   {
      dropouts_ = dropouts;
   }
   /**
            * number of failed buffer writes due to buffer overflow
            */
   public long getDropouts()
   {
      return dropouts_;
   }

   /**
            * messages misssed
            */
   public void setMessageGaps(long message_gaps)
   {
      message_gaps_ = message_gaps;
   }
   /**
            * messages misssed
            */
   public long getMessageGaps()
   {
      return message_gaps_;
   }

   /**
            * current buffer fill in Bytes
            */
   public void setBufferUsedBytes(long buffer_used_bytes)
   {
      buffer_used_bytes_ = buffer_used_bytes;
   }
   /**
            * current buffer fill in Bytes
            */
   public long getBufferUsedBytes()
   {
      return buffer_used_bytes_;
   }

   /**
            * total buffer size in Bytes
            */
   public void setBufferSizeBytes(long buffer_size_bytes)
   {
      buffer_size_bytes_ = buffer_size_bytes;
   }
   /**
            * total buffer size in Bytes
            */
   public long getBufferSizeBytes()
   {
      return buffer_size_bytes_;
   }

   public void setNumMessages(byte num_messages)
   {
      num_messages_ = num_messages;
   }
   public byte getNumMessages()
   {
      return num_messages_;
   }


   public static Supplier<LoggerStatusPubSubType> getPubSubType()
   {
      return LoggerStatusPubSubType::new;
   }

   @Override
   public Supplier<TopicDataType> getPubSubTypePacket()
   {
      return LoggerStatusPubSubType::new;
   }

   @Override
   public boolean epsilonEquals(LoggerStatus other, double epsilon)
   {
      if(other == null) return false;
      if(other == this) return true;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_, other.timestamp_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.type_, other.type_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.backend_, other.backend_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.is_logging_, other.is_logging_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.total_written_kb_, other.total_written_kb_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.write_rate_kb_s_, other.write_rate_kb_s_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.dropouts_, other.dropouts_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.message_gaps_, other.message_gaps_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.buffer_used_bytes_, other.buffer_used_bytes_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.buffer_size_bytes_, other.buffer_size_bytes_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.num_messages_, other.num_messages_, epsilon)) return false;


      return true;
   }

   @Override
   public boolean equals(Object other)
   {
      if(other == null) return false;
      if(other == this) return true;
      if(!(other instanceof LoggerStatus)) return false;

      LoggerStatus otherMyClass = (LoggerStatus) other;

      if(this.timestamp_ != otherMyClass.timestamp_) return false;

      if(this.type_ != otherMyClass.type_) return false;

      if(this.backend_ != otherMyClass.backend_) return false;

      if(this.is_logging_ != otherMyClass.is_logging_) return false;

      if(this.total_written_kb_ != otherMyClass.total_written_kb_) return false;

      if(this.write_rate_kb_s_ != otherMyClass.write_rate_kb_s_) return false;

      if(this.dropouts_ != otherMyClass.dropouts_) return false;

      if(this.message_gaps_ != otherMyClass.message_gaps_) return false;

      if(this.buffer_used_bytes_ != otherMyClass.buffer_used_bytes_) return false;

      if(this.buffer_size_bytes_ != otherMyClass.buffer_size_bytes_) return false;

      if(this.num_messages_ != otherMyClass.num_messages_) return false;


      return true;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("LoggerStatus {");
      builder.append("timestamp=");
      builder.append(this.timestamp_);      builder.append(", ");
      builder.append("type=");
      builder.append(this.type_);      builder.append(", ");
      builder.append("backend=");
      builder.append(this.backend_);      builder.append(", ");
      builder.append("is_logging=");
      builder.append(this.is_logging_);      builder.append(", ");
      builder.append("total_written_kb=");
      builder.append(this.total_written_kb_);      builder.append(", ");
      builder.append("write_rate_kb_s=");
      builder.append(this.write_rate_kb_s_);      builder.append(", ");
      builder.append("dropouts=");
      builder.append(this.dropouts_);      builder.append(", ");
      builder.append("message_gaps=");
      builder.append(this.message_gaps_);      builder.append(", ");
      builder.append("buffer_used_bytes=");
      builder.append(this.buffer_used_bytes_);      builder.append(", ");
      builder.append("buffer_size_bytes=");
      builder.append(this.buffer_size_bytes_);      builder.append(", ");
      builder.append("num_messages=");
      builder.append(this.num_messages_);
      builder.append("}");
      return builder.toString();
   }
}
