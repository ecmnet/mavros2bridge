package px4_msgs.msg.dds;

import us.ihmc.communication.packets.Packet;
import us.ihmc.euclid.interfaces.Settable;
import us.ihmc.euclid.interfaces.EpsilonComparable;
import java.util.function.Supplier;
import us.ihmc.pubsub.TopicDataType;

/**
       * This message is used to dump the raw gps communication to the log.
       */
public class GpsDump extends Packet<GpsDump> implements Settable<GpsDump>, EpsilonComparable<GpsDump>
{
   public static final byte ORB_QUEUE_LENGTH = (byte) 8;/**
            * time since system start (microseconds)
            */
   public long timestamp_;
   /**
            * Instance of GNSS receiver
            */
   public byte instance_;
   /**
            * length of data, MSB bit set = message to the gps device,
            */
   public byte len_;
   /**
            * clear = message from the device
            * data to write to the log
            */
   public byte[] data_;

   public GpsDump()
   {
      data_ = new byte[79];

   }

   public GpsDump(GpsDump other)
   {
      this();
      set(other);
   }

   public void set(GpsDump other)
   {
      timestamp_ = other.timestamp_;

      instance_ = other.instance_;

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
            * Instance of GNSS receiver
            */
   public void setInstance(byte instance)
   {
      instance_ = instance;
   }
   /**
            * Instance of GNSS receiver
            */
   public byte getInstance()
   {
      return instance_;
   }

   /**
            * length of data, MSB bit set = message to the gps device,
            */
   public void setLen(byte len)
   {
      len_ = len;
   }
   /**
            * length of data, MSB bit set = message to the gps device,
            */
   public byte getLen()
   {
      return len_;
   }


   /**
            * clear = message from the device
            * data to write to the log
            */
   public byte[] getData()
   {
      return data_;
   }


   public static Supplier<GpsDumpPubSubType> getPubSubType()
   {
      return GpsDumpPubSubType::new;
   }

   @Override
   public Supplier<TopicDataType> getPubSubTypePacket()
   {
      return GpsDumpPubSubType::new;
   }

   @Override
   public boolean epsilonEquals(GpsDump other, double epsilon)
   {
      if(other == null) return false;
      if(other == this) return true;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_, other.timestamp_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.instance_, other.instance_, epsilon)) return false;

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
      if(!(other instanceof GpsDump)) return false;

      GpsDump otherMyClass = (GpsDump) other;

      if(this.timestamp_ != otherMyClass.timestamp_) return false;

      if(this.instance_ != otherMyClass.instance_) return false;

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

      builder.append("GpsDump {");
      builder.append("timestamp=");
      builder.append(this.timestamp_);      builder.append(", ");
      builder.append("instance=");
      builder.append(this.instance_);      builder.append(", ");
      builder.append("len=");
      builder.append(this.len_);      builder.append(", ");
      builder.append("data=");
      builder.append(java.util.Arrays.toString(this.data_));
      builder.append("}");
      return builder.toString();
   }
}
