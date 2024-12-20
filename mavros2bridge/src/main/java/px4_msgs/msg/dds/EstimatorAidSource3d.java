package px4_msgs.msg.dds;

import us.ihmc.communication.packets.Packet;
import us.ihmc.euclid.interfaces.Settable;
import us.ihmc.euclid.interfaces.EpsilonComparable;
import java.util.function.Supplier;
import us.ihmc.pubsub.TopicDataType;

public class EstimatorAidSource3d extends Packet<EstimatorAidSource3d> implements Settable<EstimatorAidSource3d>, EpsilonComparable<EstimatorAidSource3d>
{
   /**
            * time since system start (microseconds)
            */
   public long timestamp_;
   /**
            * the timestamp of the raw data (microseconds)
            */
   public long timestamp_sample_;
   public byte estimator_instance_;
   public long device_id_;
   public long time_last_fuse_;
   public float[] observation_;
   public float[] observation_variance_;
   public float[] innovation_;
   public float[] innovation_filtered_;
   public float[] innovation_variance_;
   /**
            * normalized innovation squared
            */
   public float[] test_ratio_;
   /**
            * signed filtered test ratio
            */
   public float[] test_ratio_filtered_;
   /**
            * true if the observation has been rejected
            */
   public boolean innovation_rejected_;
   /**
            * true if the sample was successfully fused
            */
   public boolean fused_;

   public EstimatorAidSource3d()
   {
      observation_ = new float[3];

      observation_variance_ = new float[3];

      innovation_ = new float[3];

      innovation_filtered_ = new float[3];

      innovation_variance_ = new float[3];

      test_ratio_ = new float[3];

      test_ratio_filtered_ = new float[3];

   }

   public EstimatorAidSource3d(EstimatorAidSource3d other)
   {
      this();
      set(other);
   }

   public void set(EstimatorAidSource3d other)
   {
      timestamp_ = other.timestamp_;

      timestamp_sample_ = other.timestamp_sample_;

      estimator_instance_ = other.estimator_instance_;

      device_id_ = other.device_id_;

      time_last_fuse_ = other.time_last_fuse_;

      for(int i1 = 0; i1 < observation_.length; ++i1)
      {
            observation_[i1] = other.observation_[i1];

      }

      for(int i3 = 0; i3 < observation_variance_.length; ++i3)
      {
            observation_variance_[i3] = other.observation_variance_[i3];

      }

      for(int i5 = 0; i5 < innovation_.length; ++i5)
      {
            innovation_[i5] = other.innovation_[i5];

      }

      for(int i7 = 0; i7 < innovation_filtered_.length; ++i7)
      {
            innovation_filtered_[i7] = other.innovation_filtered_[i7];

      }

      for(int i9 = 0; i9 < innovation_variance_.length; ++i9)
      {
            innovation_variance_[i9] = other.innovation_variance_[i9];

      }

      for(int i11 = 0; i11 < test_ratio_.length; ++i11)
      {
            test_ratio_[i11] = other.test_ratio_[i11];

      }

      for(int i13 = 0; i13 < test_ratio_filtered_.length; ++i13)
      {
            test_ratio_filtered_[i13] = other.test_ratio_filtered_[i13];

      }

      innovation_rejected_ = other.innovation_rejected_;

      fused_ = other.fused_;

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

   public void setEstimatorInstance(byte estimator_instance)
   {
      estimator_instance_ = estimator_instance;
   }
   public byte getEstimatorInstance()
   {
      return estimator_instance_;
   }

   public void setDeviceId(long device_id)
   {
      device_id_ = device_id;
   }
   public long getDeviceId()
   {
      return device_id_;
   }

   public void setTimeLastFuse(long time_last_fuse)
   {
      time_last_fuse_ = time_last_fuse;
   }
   public long getTimeLastFuse()
   {
      return time_last_fuse_;
   }


   public float[] getObservation()
   {
      return observation_;
   }


   public float[] getObservationVariance()
   {
      return observation_variance_;
   }


   public float[] getInnovation()
   {
      return innovation_;
   }


   public float[] getInnovationFiltered()
   {
      return innovation_filtered_;
   }


   public float[] getInnovationVariance()
   {
      return innovation_variance_;
   }


   /**
            * normalized innovation squared
            */
   public float[] getTestRatio()
   {
      return test_ratio_;
   }


   /**
            * signed filtered test ratio
            */
   public float[] getTestRatioFiltered()
   {
      return test_ratio_filtered_;
   }

   /**
            * true if the observation has been rejected
            */
   public void setInnovationRejected(boolean innovation_rejected)
   {
      innovation_rejected_ = innovation_rejected;
   }
   /**
            * true if the observation has been rejected
            */
   public boolean getInnovationRejected()
   {
      return innovation_rejected_;
   }

   /**
            * true if the sample was successfully fused
            */
   public void setFused(boolean fused)
   {
      fused_ = fused;
   }
   /**
            * true if the sample was successfully fused
            */
   public boolean getFused()
   {
      return fused_;
   }


   public static Supplier<EstimatorAidSource3dPubSubType> getPubSubType()
   {
      return EstimatorAidSource3dPubSubType::new;
   }

   @Override
   public Supplier<TopicDataType> getPubSubTypePacket()
   {
      return EstimatorAidSource3dPubSubType::new;
   }

   @Override
   public boolean epsilonEquals(EstimatorAidSource3d other, double epsilon)
   {
      if(other == null) return false;
      if(other == this) return true;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_, other.timestamp_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_sample_, other.timestamp_sample_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.estimator_instance_, other.estimator_instance_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.device_id_, other.device_id_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.time_last_fuse_, other.time_last_fuse_, epsilon)) return false;

      for(int i15 = 0; i15 < observation_.length; ++i15)
      {
                if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.observation_[i15], other.observation_[i15], epsilon)) return false;
      }

      for(int i17 = 0; i17 < observation_variance_.length; ++i17)
      {
                if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.observation_variance_[i17], other.observation_variance_[i17], epsilon)) return false;
      }

      for(int i19 = 0; i19 < innovation_.length; ++i19)
      {
                if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.innovation_[i19], other.innovation_[i19], epsilon)) return false;
      }

      for(int i21 = 0; i21 < innovation_filtered_.length; ++i21)
      {
                if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.innovation_filtered_[i21], other.innovation_filtered_[i21], epsilon)) return false;
      }

      for(int i23 = 0; i23 < innovation_variance_.length; ++i23)
      {
                if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.innovation_variance_[i23], other.innovation_variance_[i23], epsilon)) return false;
      }

      for(int i25 = 0; i25 < test_ratio_.length; ++i25)
      {
                if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.test_ratio_[i25], other.test_ratio_[i25], epsilon)) return false;
      }

      for(int i27 = 0; i27 < test_ratio_filtered_.length; ++i27)
      {
                if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.test_ratio_filtered_[i27], other.test_ratio_filtered_[i27], epsilon)) return false;
      }

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.innovation_rejected_, other.innovation_rejected_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.fused_, other.fused_, epsilon)) return false;


      return true;
   }

   @Override
   public boolean equals(Object other)
   {
      if(other == null) return false;
      if(other == this) return true;
      if(!(other instanceof EstimatorAidSource3d)) return false;

      EstimatorAidSource3d otherMyClass = (EstimatorAidSource3d) other;

      if(this.timestamp_ != otherMyClass.timestamp_) return false;

      if(this.timestamp_sample_ != otherMyClass.timestamp_sample_) return false;

      if(this.estimator_instance_ != otherMyClass.estimator_instance_) return false;

      if(this.device_id_ != otherMyClass.device_id_) return false;

      if(this.time_last_fuse_ != otherMyClass.time_last_fuse_) return false;

      for(int i29 = 0; i29 < observation_.length; ++i29)
      {
                if(this.observation_[i29] != otherMyClass.observation_[i29]) return false;

      }
      for(int i31 = 0; i31 < observation_variance_.length; ++i31)
      {
                if(this.observation_variance_[i31] != otherMyClass.observation_variance_[i31]) return false;

      }
      for(int i33 = 0; i33 < innovation_.length; ++i33)
      {
                if(this.innovation_[i33] != otherMyClass.innovation_[i33]) return false;

      }
      for(int i35 = 0; i35 < innovation_filtered_.length; ++i35)
      {
                if(this.innovation_filtered_[i35] != otherMyClass.innovation_filtered_[i35]) return false;

      }
      for(int i37 = 0; i37 < innovation_variance_.length; ++i37)
      {
                if(this.innovation_variance_[i37] != otherMyClass.innovation_variance_[i37]) return false;

      }
      for(int i39 = 0; i39 < test_ratio_.length; ++i39)
      {
                if(this.test_ratio_[i39] != otherMyClass.test_ratio_[i39]) return false;

      }
      for(int i41 = 0; i41 < test_ratio_filtered_.length; ++i41)
      {
                if(this.test_ratio_filtered_[i41] != otherMyClass.test_ratio_filtered_[i41]) return false;

      }
      if(this.innovation_rejected_ != otherMyClass.innovation_rejected_) return false;

      if(this.fused_ != otherMyClass.fused_) return false;


      return true;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("EstimatorAidSource3d {");
      builder.append("timestamp=");
      builder.append(this.timestamp_);      builder.append(", ");
      builder.append("timestamp_sample=");
      builder.append(this.timestamp_sample_);      builder.append(", ");
      builder.append("estimator_instance=");
      builder.append(this.estimator_instance_);      builder.append(", ");
      builder.append("device_id=");
      builder.append(this.device_id_);      builder.append(", ");
      builder.append("time_last_fuse=");
      builder.append(this.time_last_fuse_);      builder.append(", ");
      builder.append("observation=");
      builder.append(java.util.Arrays.toString(this.observation_));      builder.append(", ");
      builder.append("observation_variance=");
      builder.append(java.util.Arrays.toString(this.observation_variance_));      builder.append(", ");
      builder.append("innovation=");
      builder.append(java.util.Arrays.toString(this.innovation_));      builder.append(", ");
      builder.append("innovation_filtered=");
      builder.append(java.util.Arrays.toString(this.innovation_filtered_));      builder.append(", ");
      builder.append("innovation_variance=");
      builder.append(java.util.Arrays.toString(this.innovation_variance_));      builder.append(", ");
      builder.append("test_ratio=");
      builder.append(java.util.Arrays.toString(this.test_ratio_));      builder.append(", ");
      builder.append("test_ratio_filtered=");
      builder.append(java.util.Arrays.toString(this.test_ratio_filtered_));      builder.append(", ");
      builder.append("innovation_rejected=");
      builder.append(this.innovation_rejected_);      builder.append(", ");
      builder.append("fused=");
      builder.append(this.fused_);
      builder.append("}");
      return builder.toString();
   }
}
