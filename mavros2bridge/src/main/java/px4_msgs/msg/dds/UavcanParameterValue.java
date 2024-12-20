package px4_msgs.msg.dds;

import us.ihmc.communication.packets.Packet;
import us.ihmc.euclid.interfaces.Settable;
import us.ihmc.euclid.interfaces.EpsilonComparable;
import java.util.function.Supplier;
import us.ihmc.pubsub.TopicDataType;

public class UavcanParameterValue extends Packet<UavcanParameterValue> implements Settable<UavcanParameterValue>, EpsilonComparable<UavcanParameterValue>
{
   /**
            * UAVCAN-MAVLink parameter bridge response type
            * time since system start (microseconds)
            */
   public long timestamp_;
   /**
            * UAVCAN node ID mapped from MAVLink component ID
            */
   public byte node_id_;
   /**
            * MAVLink/UAVCAN parameter name
            */
   public char[] param_id_;
   /**
            * parameter index, if known
            */
   public short param_index_;
   /**
            * number of parameters exposed by the node
            */
   public int param_count_;
   /**
            * MAVLink parameter type
            */
   public byte param_type_;
   /**
            * current value if param_type is int-like
            */
   public long int_value_;
   /**
            * current value if param_type is float-like
            */
   public float real_value_;

   public UavcanParameterValue()
   {
      param_id_ = new char[17];

   }

   public UavcanParameterValue(UavcanParameterValue other)
   {
      this();
      set(other);
   }

   public void set(UavcanParameterValue other)
   {
      timestamp_ = other.timestamp_;

      node_id_ = other.node_id_;

      for(int i1 = 0; i1 < param_id_.length; ++i1)
      {
            param_id_[i1] = other.param_id_[i1];

      }

      param_index_ = other.param_index_;

      param_count_ = other.param_count_;

      param_type_ = other.param_type_;

      int_value_ = other.int_value_;

      real_value_ = other.real_value_;

   }

   /**
            * UAVCAN-MAVLink parameter bridge response type
            * time since system start (microseconds)
            */
   public void setTimestamp(long timestamp)
   {
      timestamp_ = timestamp;
   }
   /**
            * UAVCAN-MAVLink parameter bridge response type
            * time since system start (microseconds)
            */
   public long getTimestamp()
   {
      return timestamp_;
   }

   /**
            * UAVCAN node ID mapped from MAVLink component ID
            */
   public void setNodeId(byte node_id)
   {
      node_id_ = node_id;
   }
   /**
            * UAVCAN node ID mapped from MAVLink component ID
            */
   public byte getNodeId()
   {
      return node_id_;
   }


   /**
            * MAVLink/UAVCAN parameter name
            */
   public char[] getParamId()
   {
      return param_id_;
   }

   /**
            * parameter index, if known
            */
   public void setParamIndex(short param_index)
   {
      param_index_ = param_index;
   }
   /**
            * parameter index, if known
            */
   public short getParamIndex()
   {
      return param_index_;
   }

   /**
            * number of parameters exposed by the node
            */
   public void setParamCount(int param_count)
   {
      param_count_ = param_count;
   }
   /**
            * number of parameters exposed by the node
            */
   public int getParamCount()
   {
      return param_count_;
   }

   /**
            * MAVLink parameter type
            */
   public void setParamType(byte param_type)
   {
      param_type_ = param_type;
   }
   /**
            * MAVLink parameter type
            */
   public byte getParamType()
   {
      return param_type_;
   }

   /**
            * current value if param_type is int-like
            */
   public void setIntValue(long int_value)
   {
      int_value_ = int_value;
   }
   /**
            * current value if param_type is int-like
            */
   public long getIntValue()
   {
      return int_value_;
   }

   /**
            * current value if param_type is float-like
            */
   public void setRealValue(float real_value)
   {
      real_value_ = real_value;
   }
   /**
            * current value if param_type is float-like
            */
   public float getRealValue()
   {
      return real_value_;
   }


   public static Supplier<UavcanParameterValuePubSubType> getPubSubType()
   {
      return UavcanParameterValuePubSubType::new;
   }

   @Override
   public Supplier<TopicDataType> getPubSubTypePacket()
   {
      return UavcanParameterValuePubSubType::new;
   }

   @Override
   public boolean epsilonEquals(UavcanParameterValue other, double epsilon)
   {
      if(other == null) return false;
      if(other == this) return true;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_, other.timestamp_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.node_id_, other.node_id_, epsilon)) return false;

      for(int i3 = 0; i3 < param_id_.length; ++i3)
      {
                if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.param_id_[i3], other.param_id_[i3], epsilon)) return false;
      }

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.param_index_, other.param_index_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.param_count_, other.param_count_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.param_type_, other.param_type_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.int_value_, other.int_value_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.real_value_, other.real_value_, epsilon)) return false;


      return true;
   }

   @Override
   public boolean equals(Object other)
   {
      if(other == null) return false;
      if(other == this) return true;
      if(!(other instanceof UavcanParameterValue)) return false;

      UavcanParameterValue otherMyClass = (UavcanParameterValue) other;

      if(this.timestamp_ != otherMyClass.timestamp_) return false;

      if(this.node_id_ != otherMyClass.node_id_) return false;

      for(int i5 = 0; i5 < param_id_.length; ++i5)
      {
                if(this.param_id_[i5] != otherMyClass.param_id_[i5]) return false;

      }
      if(this.param_index_ != otherMyClass.param_index_) return false;

      if(this.param_count_ != otherMyClass.param_count_) return false;

      if(this.param_type_ != otherMyClass.param_type_) return false;

      if(this.int_value_ != otherMyClass.int_value_) return false;

      if(this.real_value_ != otherMyClass.real_value_) return false;


      return true;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("UavcanParameterValue {");
      builder.append("timestamp=");
      builder.append(this.timestamp_);      builder.append(", ");
      builder.append("node_id=");
      builder.append(this.node_id_);      builder.append(", ");
      builder.append("param_id=");
      builder.append(java.util.Arrays.toString(this.param_id_));      builder.append(", ");
      builder.append("param_index=");
      builder.append(this.param_index_);      builder.append(", ");
      builder.append("param_count=");
      builder.append(this.param_count_);      builder.append(", ");
      builder.append("param_type=");
      builder.append(this.param_type_);      builder.append(", ");
      builder.append("int_value=");
      builder.append(this.int_value_);      builder.append(", ");
      builder.append("real_value=");
      builder.append(this.real_value_);
      builder.append("}");
      return builder.toString();
   }
}
