package px4_msgs.msg.dds;

import us.ihmc.communication.packets.Packet;
import us.ihmc.euclid.interfaces.Settable;
import us.ihmc.euclid.interfaces.EpsilonComparable;
import java.util.function.Supplier;
import us.ihmc.pubsub.TopicDataType;

public class DatamanRequest extends Packet<DatamanRequest> implements Settable<DatamanRequest>, EpsilonComparable<DatamanRequest>
{
   /**
            * time since system start (microseconds)
            */
   public long timestamp_;
   public byte client_id_;
   /**
            * id/read/write/clear
            */
   public byte request_type_;
   /**
            * dm_item_t
            */
   public byte item_;
   public long index_;
   public byte[] data_;
   public long data_length_;

   public DatamanRequest()
   {
      data_ = new byte[56];

   }

   public DatamanRequest(DatamanRequest other)
   {
      this();
      set(other);
   }

   public void set(DatamanRequest other)
   {
      timestamp_ = other.timestamp_;

      client_id_ = other.client_id_;

      request_type_ = other.request_type_;

      item_ = other.item_;

      index_ = other.index_;

      for(int i1 = 0; i1 < data_.length; ++i1)
      {
            data_[i1] = other.data_[i1];

      }

      data_length_ = other.data_length_;

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

   public void setClientId(byte client_id)
   {
      client_id_ = client_id;
   }
   public byte getClientId()
   {
      return client_id_;
   }

   /**
            * id/read/write/clear
            */
   public void setRequestType(byte request_type)
   {
      request_type_ = request_type;
   }
   /**
            * id/read/write/clear
            */
   public byte getRequestType()
   {
      return request_type_;
   }

   /**
            * dm_item_t
            */
   public void setItem(byte item)
   {
      item_ = item;
   }
   /**
            * dm_item_t
            */
   public byte getItem()
   {
      return item_;
   }

   public void setIndex(long index)
   {
      index_ = index;
   }
   public long getIndex()
   {
      return index_;
   }


   public byte[] getData()
   {
      return data_;
   }

   public void setDataLength(long data_length)
   {
      data_length_ = data_length;
   }
   public long getDataLength()
   {
      return data_length_;
   }


   public static Supplier<DatamanRequestPubSubType> getPubSubType()
   {
      return DatamanRequestPubSubType::new;
   }

   @Override
   public Supplier<TopicDataType> getPubSubTypePacket()
   {
      return DatamanRequestPubSubType::new;
   }

   @Override
   public boolean epsilonEquals(DatamanRequest other, double epsilon)
   {
      if(other == null) return false;
      if(other == this) return true;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_, other.timestamp_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.client_id_, other.client_id_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.request_type_, other.request_type_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.item_, other.item_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.index_, other.index_, epsilon)) return false;

      for(int i3 = 0; i3 < data_.length; ++i3)
      {
                if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.data_[i3], other.data_[i3], epsilon)) return false;
      }

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.data_length_, other.data_length_, epsilon)) return false;


      return true;
   }

   @Override
   public boolean equals(Object other)
   {
      if(other == null) return false;
      if(other == this) return true;
      if(!(other instanceof DatamanRequest)) return false;

      DatamanRequest otherMyClass = (DatamanRequest) other;

      if(this.timestamp_ != otherMyClass.timestamp_) return false;

      if(this.client_id_ != otherMyClass.client_id_) return false;

      if(this.request_type_ != otherMyClass.request_type_) return false;

      if(this.item_ != otherMyClass.item_) return false;

      if(this.index_ != otherMyClass.index_) return false;

      for(int i5 = 0; i5 < data_.length; ++i5)
      {
                if(this.data_[i5] != otherMyClass.data_[i5]) return false;

      }
      if(this.data_length_ != otherMyClass.data_length_) return false;


      return true;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("DatamanRequest {");
      builder.append("timestamp=");
      builder.append(this.timestamp_);      builder.append(", ");
      builder.append("client_id=");
      builder.append(this.client_id_);      builder.append(", ");
      builder.append("request_type=");
      builder.append(this.request_type_);      builder.append(", ");
      builder.append("item=");
      builder.append(this.item_);      builder.append(", ");
      builder.append("index=");
      builder.append(this.index_);      builder.append(", ");
      builder.append("data=");
      builder.append(java.util.Arrays.toString(this.data_));      builder.append(", ");
      builder.append("data_length=");
      builder.append(this.data_length_);
      builder.append("}");
      return builder.toString();
   }
}
