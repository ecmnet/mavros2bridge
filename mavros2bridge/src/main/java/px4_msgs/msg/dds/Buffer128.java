package px4_msgs.msg.dds;

import us.ihmc.communication.packets.Packet;
import us.ihmc.euclid.interfaces.Settable;
import us.ihmc.euclid.interfaces.EpsilonComparable;
import java.util.function.Supplier;
import us.ihmc.pubsub.TopicDataType;

public class Buffer128 extends Packet<Buffer128> implements Settable<Buffer128>, EpsilonComparable<Buffer128>
{
   public static final long MAX_BUFLEN = 128;
   /**
            * time since system start (microseconds)
            */
   public long timestamp_;
   /**
            * length of data
            */
   public byte len_;
   /**
            * data
            */
   public byte[] data_;

   public Buffer128()
   {
      data_ = new byte[128];

   }

   public Buffer128(Buffer128 other)
   {
      this();
      set(other);
   }

   public void set(Buffer128 other)
   {
      timestamp_ = other.timestamp_;

      len_ = other.len_;

      for(int i1 = 0; i1 < data_.length; ++i1)
      {
            data_[i1] = other.data_[i1];

      }

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
            * length of data
            */
   public void setLen(byte len)
   {
      len_ = len;
   }
   /**
            * length of data
            */
   public byte getLen()
   {
      return len_;
   }


   /**
            * data
            */
   public byte[] getData()
   {
      return data_;
   }


   public static Supplier<Buffer128PubSubType> getPubSubType()
   {
      return Buffer128PubSubType::new;
   }

   @Override
   public Supplier<TopicDataType> getPubSubTypePacket()
   {
      return Buffer128PubSubType::new;
   }

   @Override
   public boolean epsilonEquals(Buffer128 other, double epsilon)
   {
      if(other == null) return false;
      if(other == this) return true;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_, other.timestamp_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.len_, other.len_, epsilon)) return false;

      for(int i3 = 0; i3 < data_.length; ++i3)
      {
                if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.data_[i3], other.data_[i3], epsilon)) return false;
      }


      return true;
   }

   @Override
   public boolean equals(Object other)
   {
      if(other == null) return false;
      if(other == this) return true;
      if(!(other instanceof Buffer128)) return false;

      Buffer128 otherMyClass = (Buffer128) other;

      if(this.timestamp_ != otherMyClass.timestamp_) return false;

      if(this.len_ != otherMyClass.len_) return false;

      for(int i5 = 0; i5 < data_.length; ++i5)
      {
                if(this.data_[i5] != otherMyClass.data_[i5]) return false;

      }

      return true;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("Buffer128 {");
      builder.append("timestamp=");
      builder.append(this.timestamp_);      builder.append(", ");
      builder.append("len=");
      builder.append(this.len_);      builder.append(", ");
      builder.append("data=");
      builder.append(java.util.Arrays.toString(this.data_));
      builder.append("}");
      return builder.toString();
   }
}
