package px4_msgs.msg.dds;

import us.ihmc.communication.packets.Packet;
import us.ihmc.euclid.interfaces.Settable;
import us.ihmc.euclid.interfaces.EpsilonComparable;
import java.util.function.Supplier;
import us.ihmc.pubsub.TopicDataType;

public class EstimatorBias3d extends Packet<EstimatorBias3d> implements Settable<EstimatorBias3d>, EpsilonComparable<EstimatorBias3d>
{
   /**
            * time since system start (microseconds)
            */
   public long timestamp_;
   /**
            * the timestamp of the raw data (microseconds)
            */
   public long timestamp_sample_;
   /**
            * unique device ID for the sensor that does not change between power cycles
            */
   public long device_id_;
   /**
            * estimated barometric altitude bias (m)
            */
   public float[] bias_;
   /**
            * estimated barometric altitude bias variance (m^2)
            */
   public float[] bias_var_;
   /**
            * innovation of the last measurement fusion (m)
            */
   public float[] innov_;
   /**
            * innovation variance of the last measurement fusion (m^2)
            */
   public float[] innov_var_;
   /**
            * normalized innovation squared test ratio
            */
   public float[] innov_test_ratio_;

   public EstimatorBias3d()
   {
      bias_ = new float[3];

      bias_var_ = new float[3];

      innov_ = new float[3];

      innov_var_ = new float[3];

      innov_test_ratio_ = new float[3];

   }

   public EstimatorBias3d(EstimatorBias3d other)
   {
      this();
      set(other);
   }

   public void set(EstimatorBias3d other)
   {
      timestamp_ = other.timestamp_;

      timestamp_sample_ = other.timestamp_sample_;

      device_id_ = other.device_id_;

      for(int i1 = 0; i1 < bias_.length; ++i1)
      {
            bias_[i1] = other.bias_[i1];

      }

      for(int i3 = 0; i3 < bias_var_.length; ++i3)
      {
            bias_var_[i3] = other.bias_var_[i3];

      }

      for(int i5 = 0; i5 < innov_.length; ++i5)
      {
            innov_[i5] = other.innov_[i5];

      }

      for(int i7 = 0; i7 < innov_var_.length; ++i7)
      {
            innov_var_[i7] = other.innov_var_[i7];

      }

      for(int i9 = 0; i9 < innov_test_ratio_.length; ++i9)
      {
            innov_test_ratio_[i9] = other.innov_test_ratio_[i9];

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
            * the timestamp of the raw data (microseconds)
            */
   public void setTimestampSample(long timestamp_sample)
   {
      timestamp_sample_ = timestamp_sample;
   }
   /**
            * the timestamp of the raw data (microseconds)
            */
   public long getTimestampSample()
   {
      return timestamp_sample_;
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
            * estimated barometric altitude bias (m)
            */
   public float[] getBias()
   {
      return bias_;
   }


   /**
            * estimated barometric altitude bias variance (m^2)
            */
   public float[] getBiasVar()
   {
      return bias_var_;
   }


   /**
            * innovation of the last measurement fusion (m)
            */
   public float[] getInnov()
   {
      return innov_;
   }


   /**
            * innovation variance of the last measurement fusion (m^2)
            */
   public float[] getInnovVar()
   {
      return innov_var_;
   }


   /**
            * normalized innovation squared test ratio
            */
   public float[] getInnovTestRatio()
   {
      return innov_test_ratio_;
   }


   public static Supplier<EstimatorBias3dPubSubType> getPubSubType()
   {
      return EstimatorBias3dPubSubType::new;
   }

   @Override
   public Supplier<TopicDataType> getPubSubTypePacket()
   {
      return EstimatorBias3dPubSubType::new;
   }

   @Override
   public boolean epsilonEquals(EstimatorBias3d other, double epsilon)
   {
      if(other == null) return false;
      if(other == this) return true;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_, other.timestamp_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_sample_, other.timestamp_sample_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.device_id_, other.device_id_, epsilon)) return false;

      for(int i11 = 0; i11 < bias_.length; ++i11)
      {
                if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.bias_[i11], other.bias_[i11], epsilon)) return false;
      }

      for(int i13 = 0; i13 < bias_var_.length; ++i13)
      {
                if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.bias_var_[i13], other.bias_var_[i13], epsilon)) return false;
      }

      for(int i15 = 0; i15 < innov_.length; ++i15)
      {
                if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.innov_[i15], other.innov_[i15], epsilon)) return false;
      }

      for(int i17 = 0; i17 < innov_var_.length; ++i17)
      {
                if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.innov_var_[i17], other.innov_var_[i17], epsilon)) return false;
      }

      for(int i19 = 0; i19 < innov_test_ratio_.length; ++i19)
      {
                if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.innov_test_ratio_[i19], other.innov_test_ratio_[i19], epsilon)) return false;
      }


      return true;
   }

   @Override
   public boolean equals(Object other)
   {
      if(other == null) return false;
      if(other == this) return true;
      if(!(other instanceof EstimatorBias3d)) return false;

      EstimatorBias3d otherMyClass = (EstimatorBias3d) other;

      if(this.timestamp_ != otherMyClass.timestamp_) return false;

      if(this.timestamp_sample_ != otherMyClass.timestamp_sample_) return false;

      if(this.device_id_ != otherMyClass.device_id_) return false;

      for(int i21 = 0; i21 < bias_.length; ++i21)
      {
                if(this.bias_[i21] != otherMyClass.bias_[i21]) return false;

      }
      for(int i23 = 0; i23 < bias_var_.length; ++i23)
      {
                if(this.bias_var_[i23] != otherMyClass.bias_var_[i23]) return false;

      }
      for(int i25 = 0; i25 < innov_.length; ++i25)
      {
                if(this.innov_[i25] != otherMyClass.innov_[i25]) return false;

      }
      for(int i27 = 0; i27 < innov_var_.length; ++i27)
      {
                if(this.innov_var_[i27] != otherMyClass.innov_var_[i27]) return false;

      }
      for(int i29 = 0; i29 < innov_test_ratio_.length; ++i29)
      {
                if(this.innov_test_ratio_[i29] != otherMyClass.innov_test_ratio_[i29]) return false;

      }

      return true;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("EstimatorBias3d {");
      builder.append("timestamp=");
      builder.append(this.timestamp_);      builder.append(", ");
      builder.append("timestamp_sample=");
      builder.append(this.timestamp_sample_);      builder.append(", ");
      builder.append("device_id=");
      builder.append(this.device_id_);      builder.append(", ");
      builder.append("bias=");
      builder.append(java.util.Arrays.toString(this.bias_));      builder.append(", ");
      builder.append("bias_var=");
      builder.append(java.util.Arrays.toString(this.bias_var_));      builder.append(", ");
      builder.append("innov=");
      builder.append(java.util.Arrays.toString(this.innov_));      builder.append(", ");
      builder.append("innov_var=");
      builder.append(java.util.Arrays.toString(this.innov_var_));      builder.append(", ");
      builder.append("innov_test_ratio=");
      builder.append(java.util.Arrays.toString(this.innov_test_ratio_));
      builder.append("}");
      return builder.toString();
   }
}
