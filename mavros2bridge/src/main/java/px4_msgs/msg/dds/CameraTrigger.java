package px4_msgs.msg.dds;

import us.ihmc.communication.packets.Packet;
import us.ihmc.euclid.interfaces.Settable;
import us.ihmc.euclid.interfaces.EpsilonComparable;
import java.util.function.Supplier;
import us.ihmc.pubsub.TopicDataType;

public class CameraTrigger extends Packet<CameraTrigger> implements Settable<CameraTrigger>, EpsilonComparable<CameraTrigger>
{
   public static final long ORB_QUEUE_LENGTH = 2;
   /**
            * time since system start (microseconds)
            */
   public long timestamp_;
   /**
            * UTC timestamp
            */
   public long timestamp_utc_;
   /**
            * Image sequence number
            */
   public long seq_;
   /**
            * Trigger feedback from camera
            */
   public boolean feedback_;

   public CameraTrigger()
   {
   }

   public CameraTrigger(CameraTrigger other)
   {
      this();
      set(other);
   }

   public void set(CameraTrigger other)
   {
      timestamp_ = other.timestamp_;

      timestamp_utc_ = other.timestamp_utc_;

      seq_ = other.seq_;

      feedback_ = other.feedback_;

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
            * UTC timestamp
            */
   public void setTimestampUtc(long timestamp_utc)
   {
      timestamp_utc_ = timestamp_utc;
   }
   /**
            * UTC timestamp
            */
   public long getTimestampUtc()
   {
      return timestamp_utc_;
   }

   /**
            * Image sequence number
            */
   public void setSeq(long seq)
   {
      seq_ = seq;
   }
   /**
            * Image sequence number
            */
   public long getSeq()
   {
      return seq_;
   }

   /**
            * Trigger feedback from camera
            */
   public void setFeedback(boolean feedback)
   {
      feedback_ = feedback;
   }
   /**
            * Trigger feedback from camera
            */
   public boolean getFeedback()
   {
      return feedback_;
   }


   public static Supplier<CameraTriggerPubSubType> getPubSubType()
   {
      return CameraTriggerPubSubType::new;
   }

   @Override
   public Supplier<TopicDataType> getPubSubTypePacket()
   {
      return CameraTriggerPubSubType::new;
   }

   @Override
   public boolean epsilonEquals(CameraTrigger other, double epsilon)
   {
      if(other == null) return false;
      if(other == this) return true;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_, other.timestamp_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_utc_, other.timestamp_utc_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.seq_, other.seq_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.feedback_, other.feedback_, epsilon)) return false;


      return true;
   }

   @Override
   public boolean equals(Object other)
   {
      if(other == null) return false;
      if(other == this) return true;
      if(!(other instanceof CameraTrigger)) return false;

      CameraTrigger otherMyClass = (CameraTrigger) other;

      if(this.timestamp_ != otherMyClass.timestamp_) return false;

      if(this.timestamp_utc_ != otherMyClass.timestamp_utc_) return false;

      if(this.seq_ != otherMyClass.seq_) return false;

      if(this.feedback_ != otherMyClass.feedback_) return false;


      return true;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("CameraTrigger {");
      builder.append("timestamp=");
      builder.append(this.timestamp_);      builder.append(", ");
      builder.append("timestamp_utc=");
      builder.append(this.timestamp_utc_);      builder.append(", ");
      builder.append("seq=");
      builder.append(this.seq_);      builder.append(", ");
      builder.append("feedback=");
      builder.append(this.feedback_);
      builder.append("}");
      return builder.toString();
   }
}
