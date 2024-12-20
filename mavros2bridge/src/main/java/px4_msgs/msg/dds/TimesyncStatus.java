package px4_msgs.msg.dds;

import us.ihmc.communication.packets.Packet;
import us.ihmc.euclid.interfaces.Settable;
import us.ihmc.euclid.interfaces.EpsilonComparable;
import java.util.function.Supplier;
import us.ihmc.pubsub.TopicDataType;

public class TimesyncStatus extends Packet<TimesyncStatus> implements Settable<TimesyncStatus>, EpsilonComparable<TimesyncStatus>
{
   public static final byte SOURCE_PROTOCOL_UNKNOWN = (byte) 0;
   public static final byte SOURCE_PROTOCOL_MAVLINK = (byte) 1;
   public static final byte SOURCE_PROTOCOL_DDS = (byte) 2;
   /**
            * time since system start (microseconds)
            */
   public long timestamp_;
   /**
            * timesync source
            */
   public byte source_protocol_;
   /**
            * remote system timestamp (microseconds)
            */
   public long remote_timestamp_;
   /**
            * raw time offset directly observed from this timesync packet (microseconds)
            */
   public long observed_offset_;
   /**
            * smoothed time offset between companion system and PX4 (microseconds)
            */
   public long estimated_offset_;
   /**
            * round trip time of this timesync packet (microseconds)
            */
   public long round_trip_time_;

   public TimesyncStatus()
   {
   }

   public TimesyncStatus(TimesyncStatus other)
   {
      this();
      set(other);
   }

   public void set(TimesyncStatus other)
   {
      timestamp_ = other.timestamp_;

      source_protocol_ = other.source_protocol_;

      remote_timestamp_ = other.remote_timestamp_;

      observed_offset_ = other.observed_offset_;

      estimated_offset_ = other.estimated_offset_;

      round_trip_time_ = other.round_trip_time_;

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
            * timesync source
            */
   public void setSourceProtocol(byte source_protocol)
   {
      source_protocol_ = source_protocol;
   }
   /**
            * timesync source
            */
   public byte getSourceProtocol()
   {
      return source_protocol_;
   }

   /**
            * remote system timestamp (microseconds)
            */
   public void setRemoteTimestamp(long remote_timestamp)
   {
      remote_timestamp_ = remote_timestamp;
   }
   /**
            * remote system timestamp (microseconds)
            */
   public long getRemoteTimestamp()
   {
      return remote_timestamp_;
   }

   /**
            * raw time offset directly observed from this timesync packet (microseconds)
            */
   public void setObservedOffset(long observed_offset)
   {
      observed_offset_ = observed_offset;
   }
   /**
            * raw time offset directly observed from this timesync packet (microseconds)
            */
   public long getObservedOffset()
   {
      return observed_offset_;
   }

   /**
            * smoothed time offset between companion system and PX4 (microseconds)
            */
   public void setEstimatedOffset(long estimated_offset)
   {
      estimated_offset_ = estimated_offset;
   }
   /**
            * smoothed time offset between companion system and PX4 (microseconds)
            */
   public long getEstimatedOffset()
   {
      return estimated_offset_;
   }

   /**
            * round trip time of this timesync packet (microseconds)
            */
   public void setRoundTripTime(long round_trip_time)
   {
      round_trip_time_ = round_trip_time;
   }
   /**
            * round trip time of this timesync packet (microseconds)
            */
   public long getRoundTripTime()
   {
      return round_trip_time_;
   }


   public static Supplier<TimesyncStatusPubSubType> getPubSubType()
   {
      return TimesyncStatusPubSubType::new;
   }

   @Override
   public Supplier<TopicDataType> getPubSubTypePacket()
   {
      return TimesyncStatusPubSubType::new;
   }

   @Override
   public boolean epsilonEquals(TimesyncStatus other, double epsilon)
   {
      if(other == null) return false;
      if(other == this) return true;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_, other.timestamp_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.source_protocol_, other.source_protocol_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.remote_timestamp_, other.remote_timestamp_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.observed_offset_, other.observed_offset_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.estimated_offset_, other.estimated_offset_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.round_trip_time_, other.round_trip_time_, epsilon)) return false;


      return true;
   }

   @Override
   public boolean equals(Object other)
   {
      if(other == null) return false;
      if(other == this) return true;
      if(!(other instanceof TimesyncStatus)) return false;

      TimesyncStatus otherMyClass = (TimesyncStatus) other;

      if(this.timestamp_ != otherMyClass.timestamp_) return false;

      if(this.source_protocol_ != otherMyClass.source_protocol_) return false;

      if(this.remote_timestamp_ != otherMyClass.remote_timestamp_) return false;

      if(this.observed_offset_ != otherMyClass.observed_offset_) return false;

      if(this.estimated_offset_ != otherMyClass.estimated_offset_) return false;

      if(this.round_trip_time_ != otherMyClass.round_trip_time_) return false;


      return true;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("TimesyncStatus {");
      builder.append("timestamp=");
      builder.append(this.timestamp_);      builder.append(", ");
      builder.append("source_protocol=");
      builder.append(this.source_protocol_);      builder.append(", ");
      builder.append("remote_timestamp=");
      builder.append(this.remote_timestamp_);      builder.append(", ");
      builder.append("observed_offset=");
      builder.append(this.observed_offset_);      builder.append(", ");
      builder.append("estimated_offset=");
      builder.append(this.estimated_offset_);      builder.append(", ");
      builder.append("round_trip_time=");
      builder.append(this.round_trip_time_);
      builder.append("}");
      return builder.toString();
   }
}
