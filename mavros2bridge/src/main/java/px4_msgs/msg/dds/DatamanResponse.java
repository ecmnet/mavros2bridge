package px4_msgs.msg.dds;

import us.ihmc.communication.packets.Packet;
import us.ihmc.euclid.interfaces.Settable;
import us.ihmc.euclid.interfaces.EpsilonComparable;
import java.util.function.Supplier;
import us.ihmc.pubsub.TopicDataType;

public class DatamanResponse extends Packet<DatamanResponse> implements Settable<DatamanResponse>, EpsilonComparable<DatamanResponse>
{
   public static final byte STATUS_SUCCESS = (byte) 0;
   public static final byte STATUS_FAILURE_ID_ERR = (byte) 1;
   public static final byte STATUS_FAILURE_NO_DATA = (byte) 2;
   public static final byte STATUS_FAILURE_READ_FAILED = (byte) 3;
   public static final byte STATUS_FAILURE_WRITE_FAILED = (byte) 4;
   public static final byte STATUS_FAILURE_CLEAR_FAILED = (byte) 5;
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
   public byte status_;

   public DatamanResponse()
   {
      data_ = new byte[56];

   }

   public DatamanResponse(DatamanResponse other)
   {
      this();
      set(other);
   }

   public void set(DatamanResponse other)
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

      status_ = other.status_;

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

   public void setStatus(byte status)
   {
      status_ = status;
   }
   public byte getStatus()
   {
      return status_;
   }


   public static Supplier<DatamanResponsePubSubType> getPubSubType()
   {
      return DatamanResponsePubSubType::new;
   }

   @Override
   public Supplier<TopicDataType> getPubSubTypePacket()
   {
      return DatamanResponsePubSubType::new;
   }

   @Override
   public boolean epsilonEquals(DatamanResponse other, double epsilon)
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

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.status_, other.status_, epsilon)) return false;


      return true;
   }

   @Override
   public boolean equals(Object other)
   {
      if(other == null) return false;
      if(other == this) return true;
      if(!(other instanceof DatamanResponse)) return false;

      DatamanResponse otherMyClass = (DatamanResponse) other;

      if(this.timestamp_ != otherMyClass.timestamp_) return false;

      if(this.client_id_ != otherMyClass.client_id_) return false;

      if(this.request_type_ != otherMyClass.request_type_) return false;

      if(this.item_ != otherMyClass.item_) return false;

      if(this.index_ != otherMyClass.index_) return false;

      for(int i5 = 0; i5 < data_.length; ++i5)
      {
                if(this.data_[i5] != otherMyClass.data_[i5]) return false;

      }
      if(this.status_ != otherMyClass.status_) return false;


      return true;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("DatamanResponse {");
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
      builder.append("status=");
      builder.append(this.status_);
      builder.append("}");
      return builder.toString();
   }
}
