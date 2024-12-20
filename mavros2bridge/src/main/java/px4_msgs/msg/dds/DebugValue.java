package px4_msgs.msg.dds;

import us.ihmc.communication.packets.Packet;
import us.ihmc.euclid.interfaces.Settable;
import us.ihmc.euclid.interfaces.EpsilonComparable;
import java.util.function.Supplier;
import us.ihmc.pubsub.TopicDataType;

public class DebugValue extends Packet<DebugValue> implements Settable<DebugValue>, EpsilonComparable<DebugValue>
{
   /**
            * time since system start (microseconds)
            */
   public long timestamp_;
   /**
            * index of debug variable
            */
   public byte ind_;
   /**
            * the value to send as debug output
            */
   public float value_;

   public DebugValue()
   {
   }

   public DebugValue(DebugValue other)
   {
      this();
      set(other);
   }

   public void set(DebugValue other)
   {
      timestamp_ = other.timestamp_;

      ind_ = other.ind_;

      value_ = other.value_;

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
            * index of debug variable
            */
   public void setInd(byte ind)
   {
      ind_ = ind;
   }
   /**
            * index of debug variable
            */
   public byte getInd()
   {
      return ind_;
   }

   /**
            * the value to send as debug output
            */
   public void setValue(float value)
   {
      value_ = value;
   }
   /**
            * the value to send as debug output
            */
   public float getValue()
   {
      return value_;
   }


   public static Supplier<DebugValuePubSubType> getPubSubType()
   {
      return DebugValuePubSubType::new;
   }

   @Override
   public Supplier<TopicDataType> getPubSubTypePacket()
   {
      return DebugValuePubSubType::new;
   }

   @Override
   public boolean epsilonEquals(DebugValue other, double epsilon)
   {
      if(other == null) return false;
      if(other == this) return true;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_, other.timestamp_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.ind_, other.ind_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.value_, other.value_, epsilon)) return false;


      return true;
   }

   @Override
   public boolean equals(Object other)
   {
      if(other == null) return false;
      if(other == this) return true;
      if(!(other instanceof DebugValue)) return false;

      DebugValue otherMyClass = (DebugValue) other;

      if(this.timestamp_ != otherMyClass.timestamp_) return false;

      if(this.ind_ != otherMyClass.ind_) return false;

      if(this.value_ != otherMyClass.value_) return false;


      return true;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("DebugValue {");
      builder.append("timestamp=");
      builder.append(this.timestamp_);      builder.append(", ");
      builder.append("ind=");
      builder.append(this.ind_);      builder.append(", ");
      builder.append("value=");
      builder.append(this.value_);
      builder.append("}");
      return builder.toString();
   }
}
