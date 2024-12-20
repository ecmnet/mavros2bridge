package px4_msgs.msg.dds;

import us.ihmc.communication.packets.Packet;
import us.ihmc.euclid.interfaces.Settable;
import us.ihmc.euclid.interfaces.EpsilonComparable;
import java.util.function.Supplier;
import us.ihmc.pubsub.TopicDataType;

/**
       * ParameterSetValueRequest : Used by a remote or primary to update the value for a parameter at the other end
       */
public class ParameterSetValueRequest extends Packet<ParameterSetValueRequest> implements Settable<ParameterSetValueRequest>, EpsilonComparable<ParameterSetValueRequest>
{
   public static final byte ORB_QUEUE_LENGTH = (byte) 32;   public long timestamp_;
   public int parameter_index_;
   /**
            * Optional value for an integer parameter
            */
   public int int_value_;
   /**
            * Optional value for a float parameter
            */
   public float float_value_;

   public ParameterSetValueRequest()
   {
   }

   public ParameterSetValueRequest(ParameterSetValueRequest other)
   {
      this();
      set(other);
   }

   public void set(ParameterSetValueRequest other)
   {
      timestamp_ = other.timestamp_;

      parameter_index_ = other.parameter_index_;

      int_value_ = other.int_value_;

      float_value_ = other.float_value_;

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
            * Optional value for an integer parameter
            */
   public void setIntValue(int int_value)
   {
      int_value_ = int_value;
   }
   /**
            * Optional value for an integer parameter
            */
   public int getIntValue()
   {
      return int_value_;
   }

   /**
            * Optional value for a float parameter
            */
   public void setFloatValue(float float_value)
   {
      float_value_ = float_value;
   }
   /**
            * Optional value for a float parameter
            */
   public float getFloatValue()
   {
      return float_value_;
   }


   public static Supplier<ParameterSetValueRequestPubSubType> getPubSubType()
   {
      return ParameterSetValueRequestPubSubType::new;
   }

   @Override
   public Supplier<TopicDataType> getPubSubTypePacket()
   {
      return ParameterSetValueRequestPubSubType::new;
   }

   @Override
   public boolean epsilonEquals(ParameterSetValueRequest other, double epsilon)
   {
      if(other == null) return false;
      if(other == this) return true;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_, other.timestamp_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.parameter_index_, other.parameter_index_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.int_value_, other.int_value_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.float_value_, other.float_value_, epsilon)) return false;


      return true;
   }

   @Override
   public boolean equals(Object other)
   {
      if(other == null) return false;
      if(other == this) return true;
      if(!(other instanceof ParameterSetValueRequest)) return false;

      ParameterSetValueRequest otherMyClass = (ParameterSetValueRequest) other;

      if(this.timestamp_ != otherMyClass.timestamp_) return false;

      if(this.parameter_index_ != otherMyClass.parameter_index_) return false;

      if(this.int_value_ != otherMyClass.int_value_) return false;

      if(this.float_value_ != otherMyClass.float_value_) return false;


      return true;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("ParameterSetValueRequest {");
      builder.append("timestamp=");
      builder.append(this.timestamp_);      builder.append(", ");
      builder.append("parameter_index=");
      builder.append(this.parameter_index_);      builder.append(", ");
      builder.append("int_value=");
      builder.append(this.int_value_);      builder.append(", ");
      builder.append("float_value=");
      builder.append(this.float_value_);
      builder.append("}");
      return builder.toString();
   }
}
