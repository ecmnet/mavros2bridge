package px4_msgs.msg.dds;

import us.ihmc.communication.packets.Packet;
import us.ihmc.euclid.interfaces.Settable;
import us.ihmc.euclid.interfaces.EpsilonComparable;
import java.util.function.Supplier;
import us.ihmc.pubsub.TopicDataType;

public class RcParameterMap extends Packet<RcParameterMap> implements Settable<RcParameterMap>, EpsilonComparable<RcParameterMap>
{
   /**
          * This limit is also hardcoded in the enum RC_CHANNELS_FUNCTION in rc_channels.h
          */
   public static final byte RC_PARAM_MAP_NCHAN = (byte) 3;
   /**
          * corresponds to MAVLINK_MSG_PARAM_VALUE_FIELD_PARAM_ID_LEN
          */
   public static final byte PARAM_ID_LEN = (byte) 16;
   /**
            * time since system start (microseconds)
            */
   public long timestamp_;
   /**
            * true for RC-Param channels which are mapped to a param
            */
   public boolean[] valid_;
   /**
            * corresponding param index, this field is ignored if set to -1, in this case param_id will be used
            */
   public int[] param_index_;
   /**
            * MAP_NCHAN * (ID_LEN + 1) chars, corresponding param id, null terminated
            */
   public char[] param_id_;
   /**
            * scale to map the RC input [-1, 1] to a parameter value
            */
   public float[] scale_;
   /**
            * initial value around which the parameter value is changed
            */
   public float[] value0_;
   /**
            * minimal parameter value
            */
   public float[] value_min_;
   /**
            * minimal parameter value
            */
   public float[] value_max_;

   public RcParameterMap()
   {
      valid_ = new boolean[3];

      param_index_ = new int[3];

      param_id_ = new char[51];

      scale_ = new float[3];

      value0_ = new float[3];

      value_min_ = new float[3];

      value_max_ = new float[3];

   }

   public RcParameterMap(RcParameterMap other)
   {
      this();
      set(other);
   }

   public void set(RcParameterMap other)
   {
      timestamp_ = other.timestamp_;

      for(int i1 = 0; i1 < valid_.length; ++i1)
      {
            valid_[i1] = other.valid_[i1];

      }

      for(int i3 = 0; i3 < param_index_.length; ++i3)
      {
            param_index_[i3] = other.param_index_[i3];

      }

      for(int i5 = 0; i5 < param_id_.length; ++i5)
      {
            param_id_[i5] = other.param_id_[i5];

      }

      for(int i7 = 0; i7 < scale_.length; ++i7)
      {
            scale_[i7] = other.scale_[i7];

      }

      for(int i9 = 0; i9 < value0_.length; ++i9)
      {
            value0_[i9] = other.value0_[i9];

      }

      for(int i11 = 0; i11 < value_min_.length; ++i11)
      {
            value_min_[i11] = other.value_min_[i11];

      }

      for(int i13 = 0; i13 < value_max_.length; ++i13)
      {
            value_max_[i13] = other.value_max_[i13];

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
            * true for RC-Param channels which are mapped to a param
            */
   public boolean[] getValid()
   {
      return valid_;
   }


   /**
            * corresponding param index, this field is ignored if set to -1, in this case param_id will be used
            */
   public int[] getParamIndex()
   {
      return param_index_;
   }


   /**
            * MAP_NCHAN * (ID_LEN + 1) chars, corresponding param id, null terminated
            */
   public char[] getParamId()
   {
      return param_id_;
   }


   /**
            * scale to map the RC input [-1, 1] to a parameter value
            */
   public float[] getScale()
   {
      return scale_;
   }


   /**
            * initial value around which the parameter value is changed
            */
   public float[] getValue0()
   {
      return value0_;
   }


   /**
            * minimal parameter value
            */
   public float[] getValueMin()
   {
      return value_min_;
   }


   /**
            * minimal parameter value
            */
   public float[] getValueMax()
   {
      return value_max_;
   }


   public static Supplier<RcParameterMapPubSubType> getPubSubType()
   {
      return RcParameterMapPubSubType::new;
   }

   @Override
   public Supplier<TopicDataType> getPubSubTypePacket()
   {
      return RcParameterMapPubSubType::new;
   }

   @Override
   public boolean epsilonEquals(RcParameterMap other, double epsilon)
   {
      if(other == null) return false;
      if(other == this) return true;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_, other.timestamp_, epsilon)) return false;

      for(int i15 = 0; i15 < valid_.length; ++i15)
      {
                if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.valid_[i15], other.valid_[i15], epsilon)) return false;

      }

      for(int i17 = 0; i17 < param_index_.length; ++i17)
      {
                if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.param_index_[i17], other.param_index_[i17], epsilon)) return false;
      }

      for(int i19 = 0; i19 < param_id_.length; ++i19)
      {
                if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.param_id_[i19], other.param_id_[i19], epsilon)) return false;
      }

      for(int i21 = 0; i21 < scale_.length; ++i21)
      {
                if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.scale_[i21], other.scale_[i21], epsilon)) return false;
      }

      for(int i23 = 0; i23 < value0_.length; ++i23)
      {
                if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.value0_[i23], other.value0_[i23], epsilon)) return false;
      }

      for(int i25 = 0; i25 < value_min_.length; ++i25)
      {
                if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.value_min_[i25], other.value_min_[i25], epsilon)) return false;
      }

      for(int i27 = 0; i27 < value_max_.length; ++i27)
      {
                if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.value_max_[i27], other.value_max_[i27], epsilon)) return false;
      }


      return true;
   }

   @Override
   public boolean equals(Object other)
   {
      if(other == null) return false;
      if(other == this) return true;
      if(!(other instanceof RcParameterMap)) return false;

      RcParameterMap otherMyClass = (RcParameterMap) other;

      if(this.timestamp_ != otherMyClass.timestamp_) return false;

      for(int i29 = 0; i29 < valid_.length; ++i29)
      {
                if(this.valid_[i29] != otherMyClass.valid_[i29]) return false;

      }
      for(int i31 = 0; i31 < param_index_.length; ++i31)
      {
                if(this.param_index_[i31] != otherMyClass.param_index_[i31]) return false;

      }
      for(int i33 = 0; i33 < param_id_.length; ++i33)
      {
                if(this.param_id_[i33] != otherMyClass.param_id_[i33]) return false;

      }
      for(int i35 = 0; i35 < scale_.length; ++i35)
      {
                if(this.scale_[i35] != otherMyClass.scale_[i35]) return false;

      }
      for(int i37 = 0; i37 < value0_.length; ++i37)
      {
                if(this.value0_[i37] != otherMyClass.value0_[i37]) return false;

      }
      for(int i39 = 0; i39 < value_min_.length; ++i39)
      {
                if(this.value_min_[i39] != otherMyClass.value_min_[i39]) return false;

      }
      for(int i41 = 0; i41 < value_max_.length; ++i41)
      {
                if(this.value_max_[i41] != otherMyClass.value_max_[i41]) return false;

      }

      return true;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("RcParameterMap {");
      builder.append("timestamp=");
      builder.append(this.timestamp_);      builder.append(", ");
      builder.append("valid=");
      builder.append(java.util.Arrays.toString(this.valid_));      builder.append(", ");
      builder.append("param_index=");
      builder.append(java.util.Arrays.toString(this.param_index_));      builder.append(", ");
      builder.append("param_id=");
      builder.append(java.util.Arrays.toString(this.param_id_));      builder.append(", ");
      builder.append("scale=");
      builder.append(java.util.Arrays.toString(this.scale_));      builder.append(", ");
      builder.append("value0=");
      builder.append(java.util.Arrays.toString(this.value0_));      builder.append(", ");
      builder.append("value_min=");
      builder.append(java.util.Arrays.toString(this.value_min_));      builder.append(", ");
      builder.append("value_max=");
      builder.append(java.util.Arrays.toString(this.value_max_));
      builder.append("}");
      return builder.toString();
   }
}
