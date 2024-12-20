package px4_msgs.msg.dds;

import us.ihmc.communication.packets.Packet;
import us.ihmc.euclid.interfaces.Settable;
import us.ihmc.euclid.interfaces.EpsilonComparable;
import java.util.function.Supplier;
import us.ihmc.pubsub.TopicDataType;

public class DebugKeyValue extends Packet<DebugKeyValue> implements Settable<DebugKeyValue>, EpsilonComparable<DebugKeyValue>
{
   /**
            * time since system start (microseconds)
            */
   public long timestamp_;
   /**
            * max. 10 characters as key / name
            */
   public char[] key_;
   /**
            * the value to send as debug output
            */
   public float value_;

   public DebugKeyValue()
   {
      key_ = new char[10];

   }

   public DebugKeyValue(DebugKeyValue other)
   {
      this();
      set(other);
   }

   public void set(DebugKeyValue other)
   {
      timestamp_ = other.timestamp_;

      for(int i1 = 0; i1 < key_.length; ++i1)
      {
            key_[i1] = other.key_[i1];

      }

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
            * max. 10 characters as key / name
            */
   public char[] getKey()
   {
      return key_;
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


   public static Supplier<DebugKeyValuePubSubType> getPubSubType()
   {
      return DebugKeyValuePubSubType::new;
   }

   @Override
   public Supplier<TopicDataType> getPubSubTypePacket()
   {
      return DebugKeyValuePubSubType::new;
   }

   @Override
   public boolean epsilonEquals(DebugKeyValue other, double epsilon)
   {
      if(other == null) return false;
      if(other == this) return true;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_, other.timestamp_, epsilon)) return false;

      for(int i3 = 0; i3 < key_.length; ++i3)
      {
                if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.key_[i3], other.key_[i3], epsilon)) return false;
      }

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.value_, other.value_, epsilon)) return false;


      return true;
   }

   @Override
   public boolean equals(Object other)
   {
      if(other == null) return false;
      if(other == this) return true;
      if(!(other instanceof DebugKeyValue)) return false;

      DebugKeyValue otherMyClass = (DebugKeyValue) other;

      if(this.timestamp_ != otherMyClass.timestamp_) return false;

      for(int i5 = 0; i5 < key_.length; ++i5)
      {
                if(this.key_[i5] != otherMyClass.key_[i5]) return false;

      }
      if(this.value_ != otherMyClass.value_) return false;


      return true;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("DebugKeyValue {");
      builder.append("timestamp=");
      builder.append(this.timestamp_);      builder.append(", ");
      builder.append("key=");
      builder.append(java.util.Arrays.toString(this.key_));      builder.append(", ");
      builder.append("value=");
      builder.append(this.value_);
      builder.append("}");
      return builder.toString();
   }
}
