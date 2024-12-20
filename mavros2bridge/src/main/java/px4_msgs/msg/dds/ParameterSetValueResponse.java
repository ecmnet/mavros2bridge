package px4_msgs.msg.dds;

import us.ihmc.communication.packets.Packet;
import us.ihmc.euclid.interfaces.Settable;
import us.ihmc.euclid.interfaces.EpsilonComparable;
import java.util.function.Supplier;
import us.ihmc.pubsub.TopicDataType;

/**
       * ParameterSetValueResponse : Response to a set value request by either primary or secondary
       */
public class ParameterSetValueResponse extends Packet<ParameterSetValueResponse> implements Settable<ParameterSetValueResponse>, EpsilonComparable<ParameterSetValueResponse>
{
   public static final byte ORB_QUEUE_LENGTH = (byte) 4;   public long timestamp_;
   public long request_timestamp_;
   public int parameter_index_;

   public ParameterSetValueResponse()
   {
   }

   public ParameterSetValueResponse(ParameterSetValueResponse other)
   {
      this();
      set(other);
   }

   public void set(ParameterSetValueResponse other)
   {
      timestamp_ = other.timestamp_;

      request_timestamp_ = other.request_timestamp_;

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

   public void setRequestTimestamp(long request_timestamp)
   {
      request_timestamp_ = request_timestamp;
   }
   public long getRequestTimestamp()
   {
      return request_timestamp_;
   }

   public void setParameterIndex(int parameter_index)
   {
      parameter_index_ = parameter_index;
   }
   public int getParameterIndex()
   {
      return parameter_index_;
   }


   public static Supplier<ParameterSetValueResponsePubSubType> getPubSubType()
   {
      return ParameterSetValueResponsePubSubType::new;
   }

   @Override
   public Supplier<TopicDataType> getPubSubTypePacket()
   {
      return ParameterSetValueResponsePubSubType::new;
   }

   @Override
   public boolean epsilonEquals(ParameterSetValueResponse other, double epsilon)
   {
      if(other == null) return false;
      if(other == this) return true;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_, other.timestamp_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.request_timestamp_, other.request_timestamp_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.parameter_index_, other.parameter_index_, epsilon)) return false;


      return true;
   }

   @Override
   public boolean equals(Object other)
   {
      if(other == null) return false;
      if(other == this) return true;
      if(!(other instanceof ParameterSetValueResponse)) return false;

      ParameterSetValueResponse otherMyClass = (ParameterSetValueResponse) other;

      if(this.timestamp_ != otherMyClass.timestamp_) return false;

      if(this.request_timestamp_ != otherMyClass.request_timestamp_) return false;

      if(this.parameter_index_ != otherMyClass.parameter_index_) return false;


      return true;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("ParameterSetValueResponse {");
      builder.append("timestamp=");
      builder.append(this.timestamp_);      builder.append(", ");
      builder.append("request_timestamp=");
      builder.append(this.request_timestamp_);      builder.append(", ");
      builder.append("parameter_index=");
      builder.append(this.parameter_index_);
      builder.append("}");
      return builder.toString();
   }
}
