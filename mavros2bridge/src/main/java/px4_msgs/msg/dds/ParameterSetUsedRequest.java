package px4_msgs.msg.dds;

import us.ihmc.communication.packets.Packet;
import us.ihmc.euclid.interfaces.Settable;
import us.ihmc.euclid.interfaces.EpsilonComparable;
import java.util.function.Supplier;
import us.ihmc.pubsub.TopicDataType;

/**
       * ParameterSetUsedRequest : Used by a remote to update the used flag for a parameter on the primary
       */
public class ParameterSetUsedRequest extends Packet<ParameterSetUsedRequest> implements Settable<ParameterSetUsedRequest>, EpsilonComparable<ParameterSetUsedRequest>
{
   public static final byte ORB_QUEUE_LENGTH = (byte) 64;   public long timestamp_;
   public int parameter_index_;

   public ParameterSetUsedRequest()
   {
   }

   public ParameterSetUsedRequest(ParameterSetUsedRequest other)
   {
      this();
      set(other);
   }

   public void set(ParameterSetUsedRequest other)
   {
      timestamp_ = other.timestamp_;

      parameter_index_ = other.parameter_index_;

   }

   public void setTimestamp(long timestamp)
   {
      timestamp_ = timestamp;
   }
   public long getTimestamp()
   {
      return timestamp_;
   }

   public void setParameterIndex(int parameter_index)
   {
      parameter_index_ = parameter_index;
   }
   public int getParameterIndex()
   {
      return parameter_index_;
   }


   public static Supplier<ParameterSetUsedRequestPubSubType> getPubSubType()
   {
      return ParameterSetUsedRequestPubSubType::new;
   }

   @Override
   public Supplier<TopicDataType> getPubSubTypePacket()
   {
      return ParameterSetUsedRequestPubSubType::new;
   }

   @Override
   public boolean epsilonEquals(ParameterSetUsedRequest other, double epsilon)
   {
      if(other == null) return false;
      if(other == this) return true;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_, other.timestamp_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.parameter_index_, other.parameter_index_, epsilon)) return false;


      return true;
   }

   @Override
   public boolean equals(Object other)
   {
      if(other == null) return false;
      if(other == this) return true;
      if(!(other instanceof ParameterSetUsedRequest)) return false;

      ParameterSetUsedRequest otherMyClass = (ParameterSetUsedRequest) other;

      if(this.timestamp_ != otherMyClass.timestamp_) return false;

      if(this.parameter_index_ != otherMyClass.parameter_index_) return false;


      return true;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("ParameterSetUsedRequest {");
      builder.append("timestamp=");
      builder.append(this.timestamp_);      builder.append(", ");
      builder.append("parameter_index=");
      builder.append(this.parameter_index_);
      builder.append("}");
      return builder.toString();
   }
}
