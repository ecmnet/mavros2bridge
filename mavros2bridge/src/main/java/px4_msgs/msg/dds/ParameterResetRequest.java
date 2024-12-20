package px4_msgs.msg.dds;

import us.ihmc.communication.packets.Packet;
import us.ihmc.euclid.interfaces.Settable;
import us.ihmc.euclid.interfaces.EpsilonComparable;
import java.util.function.Supplier;
import us.ihmc.pubsub.TopicDataType;

/**
       * ParameterResetRequest : Used by the primary to reset one or all parameter value(s) on the remote
       */
public class ParameterResetRequest extends Packet<ParameterResetRequest> implements Settable<ParameterResetRequest>, EpsilonComparable<ParameterResetRequest>
{
   public static final byte ORB_QUEUE_LENGTH = (byte) 4;   public long timestamp_;
   public int parameter_index_;
   /**
            * If this is true then ignore parameter_index
            */
   public boolean reset_all_;

   public ParameterResetRequest()
   {
   }

   public ParameterResetRequest(ParameterResetRequest other)
   {
      this();
      set(other);
   }

   public void set(ParameterResetRequest other)
   {
      timestamp_ = other.timestamp_;

      parameter_index_ = other.parameter_index_;

      reset_all_ = other.reset_all_;

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

   /**
            * If this is true then ignore parameter_index
            */
   public void setResetAll(boolean reset_all)
   {
      reset_all_ = reset_all;
   }
   /**
            * If this is true then ignore parameter_index
            */
   public boolean getResetAll()
   {
      return reset_all_;
   }


   public static Supplier<ParameterResetRequestPubSubType> getPubSubType()
   {
      return ParameterResetRequestPubSubType::new;
   }

   @Override
   public Supplier<TopicDataType> getPubSubTypePacket()
   {
      return ParameterResetRequestPubSubType::new;
   }

   @Override
   public boolean epsilonEquals(ParameterResetRequest other, double epsilon)
   {
      if(other == null) return false;
      if(other == this) return true;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_, other.timestamp_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.parameter_index_, other.parameter_index_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.reset_all_, other.reset_all_, epsilon)) return false;


      return true;
   }

   @Override
   public boolean equals(Object other)
   {
      if(other == null) return false;
      if(other == this) return true;
      if(!(other instanceof ParameterResetRequest)) return false;

      ParameterResetRequest otherMyClass = (ParameterResetRequest) other;

      if(this.timestamp_ != otherMyClass.timestamp_) return false;

      if(this.parameter_index_ != otherMyClass.parameter_index_) return false;

      if(this.reset_all_ != otherMyClass.reset_all_) return false;


      return true;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("ParameterResetRequest {");
      builder.append("timestamp=");
      builder.append(this.timestamp_);      builder.append(", ");
      builder.append("parameter_index=");
      builder.append(this.parameter_index_);      builder.append(", ");
      builder.append("reset_all=");
      builder.append(this.reset_all_);
      builder.append("}");
      return builder.toString();
   }
}
