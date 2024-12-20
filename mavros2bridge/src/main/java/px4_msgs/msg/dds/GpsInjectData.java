package px4_msgs.msg.dds;

import us.ihmc.communication.packets.Packet;
import us.ihmc.euclid.interfaces.Settable;
import us.ihmc.euclid.interfaces.EpsilonComparable;
import java.util.function.Supplier;
import us.ihmc.pubsub.TopicDataType;

public class GpsInjectData extends Packet<GpsInjectData> implements Settable<GpsInjectData>, EpsilonComparable<GpsInjectData>
{
   public static final byte ORB_QUEUE_LENGTH = (byte) 8;
   public static final byte MAX_INSTANCES = (byte) 2;
   /**
            * time since system start (microseconds)
            */
   public long timestamp_;
   /**
            * unique device ID for the sensor that does not change between power cycles
            */
   public long device_id_;
   /**
            * length of data
            */
   public int len_;
   /**
            * LSB: 1=fragmented
            */
   public byte flags_;
   /**
            * data to write to GPS device (RTCM message)
            */
   public byte[] data_;

   public GpsInjectData()
   {
      data_ = new byte[300];

   }

   public GpsInjectData(GpsInjectData other)
   {
      this();
      set(other);
   }

   public void set(GpsInjectData other)
   {
      timestamp_ = other.timestamp_;

      device_id_ = other.device_id_;

      len_ = other.len_;

      flags_ = other.flags_;

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
            * unique device ID for the sensor that does not change between power cycles
            */
   public void setDeviceId(long device_id)
   {
      device_id_ = device_id;
   }
   /**
            * unique device ID for the sensor that does not change between power cycles
            */
   public long getDeviceId()
   {
      return device_id_;
   }

   /**
            * length of data
            */
   public void setLen(int len)
   {
      len_ = len;
   }
   /**
            * length of data
            */
   public int getLen()
   {
      return len_;
   }

   /**
            * LSB: 1=fragmented
            */
   public void setFlags(byte flags)
   {
      flags_ = flags;
   }
   /**
            * LSB: 1=fragmented
            */
   public byte getFlags()
   {
      return flags_;
   }


   /**
            * data to write to GPS device (RTCM message)
            */
   public byte[] getData()
   {
      return data_;
   }


   public static Supplier<GpsInjectDataPubSubType> getPubSubType()
   {
      return GpsInjectDataPubSubType::new;
   }

   @Override
   public Supplier<TopicDataType> getPubSubTypePacket()
   {
      return GpsInjectDataPubSubType::new;
   }

   @Override
   public boolean epsilonEquals(GpsInjectData other, double epsilon)
   {
      if(other == null) return false;
      if(other == this) return true;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_, other.timestamp_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.device_id_, other.device_id_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.len_, other.len_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.flags_, other.flags_, epsilon)) return false;

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
      if(!(other instanceof GpsInjectData)) return false;

      GpsInjectData otherMyClass = (GpsInjectData) other;

      if(this.timestamp_ != otherMyClass.timestamp_) return false;

      if(this.device_id_ != otherMyClass.device_id_) return false;

      if(this.len_ != otherMyClass.len_) return false;

      if(this.flags_ != otherMyClass.flags_) return false;

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

      builder.append("GpsInjectData {");
      builder.append("timestamp=");
      builder.append(this.timestamp_);      builder.append(", ");
      builder.append("device_id=");
      builder.append(this.device_id_);      builder.append(", ");
      builder.append("len=");
      builder.append(this.len_);      builder.append(", ");
      builder.append("flags=");
      builder.append(this.flags_);      builder.append(", ");
      builder.append("data=");
      builder.append(java.util.Arrays.toString(this.data_));
      builder.append("}");
      return builder.toString();
   }
}
