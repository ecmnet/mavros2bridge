package px4_msgs.msg.dds;

import us.ihmc.communication.packets.Packet;
import us.ihmc.euclid.interfaces.Settable;
import us.ihmc.euclid.interfaces.EpsilonComparable;
import java.util.function.Supplier;
import us.ihmc.pubsub.TopicDataType;

public class QshellRetval extends Packet<QshellRetval> implements Settable<QshellRetval>, EpsilonComparable<QshellRetval>
{
   /**
            * time since system start (microseconds)
            */
   public long timestamp_;
   public int return_value_;
   public long return_sequence_;

   public QshellRetval()
   {
   }

   public QshellRetval(QshellRetval other)
   {
      this();
      set(other);
   }

   public void set(QshellRetval other)
   {
      timestamp_ = other.timestamp_;

      return_value_ = other.return_value_;

      return_sequence_ = other.return_sequence_;

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

   public void setReturnValue(int return_value)
   {
      return_value_ = return_value;
   }
   public int getReturnValue()
   {
      return return_value_;
   }

   public void setReturnSequence(long return_sequence)
   {
      return_sequence_ = return_sequence;
   }
   public long getReturnSequence()
   {
      return return_sequence_;
   }


   public static Supplier<QshellRetvalPubSubType> getPubSubType()
   {
      return QshellRetvalPubSubType::new;
   }

   @Override
   public Supplier<TopicDataType> getPubSubTypePacket()
   {
      return QshellRetvalPubSubType::new;
   }

   @Override
   public boolean epsilonEquals(QshellRetval other, double epsilon)
   {
      if(other == null) return false;
      if(other == this) return true;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_, other.timestamp_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.return_value_, other.return_value_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.return_sequence_, other.return_sequence_, epsilon)) return false;


      return true;
   }

   @Override
   public boolean equals(Object other)
   {
      if(other == null) return false;
      if(other == this) return true;
      if(!(other instanceof QshellRetval)) return false;

      QshellRetval otherMyClass = (QshellRetval) other;

      if(this.timestamp_ != otherMyClass.timestamp_) return false;

      if(this.return_value_ != otherMyClass.return_value_) return false;

      if(this.return_sequence_ != otherMyClass.return_sequence_) return false;


      return true;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("QshellRetval {");
      builder.append("timestamp=");
      builder.append(this.timestamp_);      builder.append(", ");
      builder.append("return_value=");
      builder.append(this.return_value_);      builder.append(", ");
      builder.append("return_sequence=");
      builder.append(this.return_sequence_);
      builder.append("}");
      return builder.toString();
   }
}
