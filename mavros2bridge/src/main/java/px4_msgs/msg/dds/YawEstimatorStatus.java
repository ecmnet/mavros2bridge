package px4_msgs.msg.dds;

import us.ihmc.communication.packets.Packet;
import us.ihmc.euclid.interfaces.Settable;
import us.ihmc.euclid.interfaces.EpsilonComparable;
import java.util.function.Supplier;
import us.ihmc.pubsub.TopicDataType;

public class YawEstimatorStatus extends Packet<YawEstimatorStatus> implements Settable<YawEstimatorStatus>, EpsilonComparable<YawEstimatorStatus>
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
            * composite yaw from GSF (rad)
            */
   public float yaw_composite_;
   /**
            * composite yaw variance from GSF (rad^2)
            */
   public float yaw_variance_;
   public boolean yaw_composite_valid_;
   /**
            * yaw estimate for each model in the filter bank (rad)
            */
   public float[] yaw_;
   /**
            * North velocity innovation for each model in the filter bank (m/s)
            */
   public float[] innov_vn_;
   /**
            * East velocity innovation for each model in the filter bank (m/s)
            */
   public float[] innov_ve_;
   /**
            * weighting for each model in the filter bank
            */
   public float[] weight_;

   public YawEstimatorStatus()
   {
      yaw_ = new float[5];

      innov_vn_ = new float[5];

      innov_ve_ = new float[5];

      weight_ = new float[5];

   }

   public YawEstimatorStatus(YawEstimatorStatus other)
   {
      this();
      set(other);
   }

   public void set(YawEstimatorStatus other)
   {
      timestamp_ = other.timestamp_;

      timestamp_sample_ = other.timestamp_sample_;

      yaw_composite_ = other.yaw_composite_;

      yaw_variance_ = other.yaw_variance_;

      yaw_composite_valid_ = other.yaw_composite_valid_;

      for(int i1 = 0; i1 < yaw_.length; ++i1)
      {
            yaw_[i1] = other.yaw_[i1];

      }

      for(int i3 = 0; i3 < innov_vn_.length; ++i3)
      {
            innov_vn_[i3] = other.innov_vn_[i3];

      }

      for(int i5 = 0; i5 < innov_ve_.length; ++i5)
      {
            innov_ve_[i5] = other.innov_ve_[i5];

      }

      for(int i7 = 0; i7 < weight_.length; ++i7)
      {
            weight_[i7] = other.weight_[i7];

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
            * composite yaw from GSF (rad)
            */
   public void setYawComposite(float yaw_composite)
   {
      yaw_composite_ = yaw_composite;
   }
   /**
            * composite yaw from GSF (rad)
            */
   public float getYawComposite()
   {
      return yaw_composite_;
   }

   /**
            * composite yaw variance from GSF (rad^2)
            */
   public void setYawVariance(float yaw_variance)
   {
      yaw_variance_ = yaw_variance;
   }
   /**
            * composite yaw variance from GSF (rad^2)
            */
   public float getYawVariance()
   {
      return yaw_variance_;
   }

   public void setYawCompositeValid(boolean yaw_composite_valid)
   {
      yaw_composite_valid_ = yaw_composite_valid;
   }
   public boolean getYawCompositeValid()
   {
      return yaw_composite_valid_;
   }


   /**
            * yaw estimate for each model in the filter bank (rad)
            */
   public float[] getYaw()
   {
      return yaw_;
   }


   /**
            * North velocity innovation for each model in the filter bank (m/s)
            */
   public float[] getInnovVn()
   {
      return innov_vn_;
   }


   /**
            * East velocity innovation for each model in the filter bank (m/s)
            */
   public float[] getInnovVe()
   {
      return innov_ve_;
   }


   /**
            * weighting for each model in the filter bank
            */
   public float[] getWeight()
   {
      return weight_;
   }


   public static Supplier<YawEstimatorStatusPubSubType> getPubSubType()
   {
      return YawEstimatorStatusPubSubType::new;
   }

   @Override
   public Supplier<TopicDataType> getPubSubTypePacket()
   {
      return YawEstimatorStatusPubSubType::new;
   }

   @Override
   public boolean epsilonEquals(YawEstimatorStatus other, double epsilon)
   {
      if(other == null) return false;
      if(other == this) return true;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_, other.timestamp_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_sample_, other.timestamp_sample_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.yaw_composite_, other.yaw_composite_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.yaw_variance_, other.yaw_variance_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.yaw_composite_valid_, other.yaw_composite_valid_, epsilon)) return false;

      for(int i9 = 0; i9 < yaw_.length; ++i9)
      {
                if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.yaw_[i9], other.yaw_[i9], epsilon)) return false;
      }

      for(int i11 = 0; i11 < innov_vn_.length; ++i11)
      {
                if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.innov_vn_[i11], other.innov_vn_[i11], epsilon)) return false;
      }

      for(int i13 = 0; i13 < innov_ve_.length; ++i13)
      {
                if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.innov_ve_[i13], other.innov_ve_[i13], epsilon)) return false;
      }

      for(int i15 = 0; i15 < weight_.length; ++i15)
      {
                if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.weight_[i15], other.weight_[i15], epsilon)) return false;
      }


      return true;
   }

   @Override
   public boolean equals(Object other)
   {
      if(other == null) return false;
      if(other == this) return true;
      if(!(other instanceof YawEstimatorStatus)) return false;

      YawEstimatorStatus otherMyClass = (YawEstimatorStatus) other;

      if(this.timestamp_ != otherMyClass.timestamp_) return false;

      if(this.timestamp_sample_ != otherMyClass.timestamp_sample_) return false;

      if(this.yaw_composite_ != otherMyClass.yaw_composite_) return false;

      if(this.yaw_variance_ != otherMyClass.yaw_variance_) return false;

      if(this.yaw_composite_valid_ != otherMyClass.yaw_composite_valid_) return false;

      for(int i17 = 0; i17 < yaw_.length; ++i17)
      {
                if(this.yaw_[i17] != otherMyClass.yaw_[i17]) return false;

      }
      for(int i19 = 0; i19 < innov_vn_.length; ++i19)
      {
                if(this.innov_vn_[i19] != otherMyClass.innov_vn_[i19]) return false;

      }
      for(int i21 = 0; i21 < innov_ve_.length; ++i21)
      {
                if(this.innov_ve_[i21] != otherMyClass.innov_ve_[i21]) return false;

      }
      for(int i23 = 0; i23 < weight_.length; ++i23)
      {
                if(this.weight_[i23] != otherMyClass.weight_[i23]) return false;

      }

      return true;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("YawEstimatorStatus {");
      builder.append("timestamp=");
      builder.append(this.timestamp_);      builder.append(", ");
      builder.append("timestamp_sample=");
      builder.append(this.timestamp_sample_);      builder.append(", ");
      builder.append("yaw_composite=");
      builder.append(this.yaw_composite_);      builder.append(", ");
      builder.append("yaw_variance=");
      builder.append(this.yaw_variance_);      builder.append(", ");
      builder.append("yaw_composite_valid=");
      builder.append(this.yaw_composite_valid_);      builder.append(", ");
      builder.append("yaw=");
      builder.append(java.util.Arrays.toString(this.yaw_));      builder.append(", ");
      builder.append("innov_vn=");
      builder.append(java.util.Arrays.toString(this.innov_vn_));      builder.append(", ");
      builder.append("innov_ve=");
      builder.append(java.util.Arrays.toString(this.innov_ve_));      builder.append(", ");
      builder.append("weight=");
      builder.append(java.util.Arrays.toString(this.weight_));
      builder.append("}");
      return builder.toString();
   }
}
