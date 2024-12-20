package px4_msgs.msg.dds;

import us.ihmc.communication.packets.Packet;
import us.ihmc.euclid.interfaces.Settable;
import us.ihmc.euclid.interfaces.EpsilonComparable;
import java.util.function.Supplier;
import us.ihmc.pubsub.TopicDataType;

public class QshellReq extends Packet<QshellReq> implements Settable<QshellReq>, EpsilonComparable<QshellReq>
{
   public static final long MAX_STRLEN = 100;
   /**
            * time since system start (microseconds)
            */
   public long timestamp_;
   public char[] cmd_;
   public long strlen_;
   public long request_sequence_;

   public QshellReq()
   {
      cmd_ = new char[100];

   }

   public QshellReq(QshellReq other)
   {
      this();
      set(other);
   }

   public void set(QshellReq other)
   {
      timestamp_ = other.timestamp_;

      for(int i1 = 0; i1 < cmd_.length; ++i1)
      {
            cmd_[i1] = other.cmd_[i1];

      }

      strlen_ = other.strlen_;

      request_sequence_ = other.request_sequence_;

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


   public char[] getCmd()
   {
      return cmd_;
   }

   public void setStrlen(long strlen)
   {
      strlen_ = strlen;
   }
   public long getStrlen()
   {
      return strlen_;
   }

   public void setRequestSequence(long request_sequence)
   {
      request_sequence_ = request_sequence;
   }
   public long getRequestSequence()
   {
      return request_sequence_;
   }


   public static Supplier<QshellReqPubSubType> getPubSubType()
   {
      return QshellReqPubSubType::new;
   }

   @Override
   public Supplier<TopicDataType> getPubSubTypePacket()
   {
      return QshellReqPubSubType::new;
   }

   @Override
   public boolean epsilonEquals(QshellReq other, double epsilon)
   {
      if(other == null) return false;
      if(other == this) return true;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_, other.timestamp_, epsilon)) return false;

      for(int i3 = 0; i3 < cmd_.length; ++i3)
      {
                if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.cmd_[i3], other.cmd_[i3], epsilon)) return false;
      }

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.strlen_, other.strlen_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.request_sequence_, other.request_sequence_, epsilon)) return false;


      return true;
   }

   @Override
   public boolean equals(Object other)
   {
      if(other == null) return false;
      if(other == this) return true;
      if(!(other instanceof QshellReq)) return false;

      QshellReq otherMyClass = (QshellReq) other;

      if(this.timestamp_ != otherMyClass.timestamp_) return false;

      for(int i5 = 0; i5 < cmd_.length; ++i5)
      {
                if(this.cmd_[i5] != otherMyClass.cmd_[i5]) return false;

      }
      if(this.strlen_ != otherMyClass.strlen_) return false;

      if(this.request_sequence_ != otherMyClass.request_sequence_) return false;


      return true;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("QshellReq {");
      builder.append("timestamp=");
      builder.append(this.timestamp_);      builder.append(", ");
      builder.append("cmd=");
      builder.append(java.util.Arrays.toString(this.cmd_));      builder.append(", ");
      builder.append("strlen=");
      builder.append(this.strlen_);      builder.append(", ");
      builder.append("request_sequence=");
      builder.append(this.request_sequence_);
      builder.append("}");
      return builder.toString();
   }
}
