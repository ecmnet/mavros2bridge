package px4_msgs.msg.dds;

import us.ihmc.communication.packets.Packet;
import us.ihmc.euclid.interfaces.Settable;
import us.ihmc.euclid.interfaces.EpsilonComparable;
import java.util.function.Supplier;
import us.ihmc.pubsub.TopicDataType;

public class Ping extends Packet<Ping> implements Settable<Ping>, EpsilonComparable<Ping>
{
   /**
            * time since system start (microseconds)
            */
   public long timestamp_;
   /**
            * Timestamp of the ping packet
            */
   public long ping_time_;
   /**
            * Sequence number of the ping packet
            */
   public long ping_sequence_;
   /**
            * Number of dropped ping packets
            */
   public long dropped_packets_;
   /**
            * Round trip time (in ms)
            */
   public float rtt_ms_;
   /**
            * System ID of the remote system
            */
   public byte system_id_;
   /**
            * Component ID of the remote system
            */
   public byte component_id_;

   public Ping()
   {
   }

   public Ping(Ping other)
   {
      this();
      set(other);
   }

   public void set(Ping other)
   {
      timestamp_ = other.timestamp_;

      ping_time_ = other.ping_time_;

      ping_sequence_ = other.ping_sequence_;

      dropped_packets_ = other.dropped_packets_;

      rtt_ms_ = other.rtt_ms_;

      system_id_ = other.system_id_;

      component_id_ = other.component_id_;

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
            * Timestamp of the ping packet
            */
   public void setPingTime(long ping_time)
   {
      ping_time_ = ping_time;
   }
   /**
            * Timestamp of the ping packet
            */
   public long getPingTime()
   {
      return ping_time_;
   }

   /**
            * Sequence number of the ping packet
            */
   public void setPingSequence(long ping_sequence)
   {
      ping_sequence_ = ping_sequence;
   }
   /**
            * Sequence number of the ping packet
            */
   public long getPingSequence()
   {
      return ping_sequence_;
   }

   /**
            * Number of dropped ping packets
            */
   public void setDroppedPackets(long dropped_packets)
   {
      dropped_packets_ = dropped_packets;
   }
   /**
            * Number of dropped ping packets
            */
   public long getDroppedPackets()
   {
      return dropped_packets_;
   }

   /**
            * Round trip time (in ms)
            */
   public void setRttMs(float rtt_ms)
   {
      rtt_ms_ = rtt_ms;
   }
   /**
            * Round trip time (in ms)
            */
   public float getRttMs()
   {
      return rtt_ms_;
   }

   /**
            * System ID of the remote system
            */
   public void setSystemId(byte system_id)
   {
      system_id_ = system_id;
   }
   /**
            * System ID of the remote system
            */
   public byte getSystemId()
   {
      return system_id_;
   }

   /**
            * Component ID of the remote system
            */
   public void setComponentId(byte component_id)
   {
      component_id_ = component_id;
   }
   /**
            * Component ID of the remote system
            */
   public byte getComponentId()
   {
      return component_id_;
   }


   public static Supplier<PingPubSubType> getPubSubType()
   {
      return PingPubSubType::new;
   }

   @Override
   public Supplier<TopicDataType> getPubSubTypePacket()
   {
      return PingPubSubType::new;
   }

   @Override
   public boolean epsilonEquals(Ping other, double epsilon)
   {
      if(other == null) return false;
      if(other == this) return true;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_, other.timestamp_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.ping_time_, other.ping_time_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.ping_sequence_, other.ping_sequence_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.dropped_packets_, other.dropped_packets_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.rtt_ms_, other.rtt_ms_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.system_id_, other.system_id_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.component_id_, other.component_id_, epsilon)) return false;


      return true;
   }

   @Override
   public boolean equals(Object other)
   {
      if(other == null) return false;
      if(other == this) return true;
      if(!(other instanceof Ping)) return false;

      Ping otherMyClass = (Ping) other;

      if(this.timestamp_ != otherMyClass.timestamp_) return false;

      if(this.ping_time_ != otherMyClass.ping_time_) return false;

      if(this.ping_sequence_ != otherMyClass.ping_sequence_) return false;

      if(this.dropped_packets_ != otherMyClass.dropped_packets_) return false;

      if(this.rtt_ms_ != otherMyClass.rtt_ms_) return false;

      if(this.system_id_ != otherMyClass.system_id_) return false;

      if(this.component_id_ != otherMyClass.component_id_) return false;


      return true;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("Ping {");
      builder.append("timestamp=");
      builder.append(this.timestamp_);      builder.append(", ");
      builder.append("ping_time=");
      builder.append(this.ping_time_);      builder.append(", ");
      builder.append("ping_sequence=");
      builder.append(this.ping_sequence_);      builder.append(", ");
      builder.append("dropped_packets=");
      builder.append(this.dropped_packets_);      builder.append(", ");
      builder.append("rtt_ms=");
      builder.append(this.rtt_ms_);      builder.append(", ");
      builder.append("system_id=");
      builder.append(this.system_id_);      builder.append(", ");
      builder.append("component_id=");
      builder.append(this.component_id_);
      builder.append("}");
      return builder.toString();
   }
}
