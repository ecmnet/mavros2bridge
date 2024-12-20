package px4_msgs.msg.dds;

import us.ihmc.communication.packets.Packet;
import us.ihmc.euclid.interfaces.Settable;
import us.ihmc.euclid.interfaces.EpsilonComparable;
import java.util.function.Supplier;
import us.ihmc.pubsub.TopicDataType;

public class EstimatorAidSource1d extends Packet<EstimatorAidSource1d> implements Settable<EstimatorAidSource1d>, EpsilonComparable<EstimatorAidSource1d>
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
   public float observation_;
   public float observation_variance_;
   public float innovation_;
   public float innovation_filtered_;
   public float innovation_variance_;
   /**
            * normalized innovation squared
            */
   public float test_ratio_;
   /**
            * signed filtered test ratio
            */
   public float test_ratio_filtered_;
   /**
            * true if the observation has been rejected
            */
   public boolean innovation_rejected_;
   /**
            * true if the sample was successfully fused
            */
   public boolean fused_;

   public EstimatorAidSource1d()
   {
   }

   public EstimatorAidSource1d(EstimatorAidSource1d other)
   {
      this();
      set(other);
   }

   public void set(EstimatorAidSource1d other)
   {
      timestamp_ = other.timestamp_;

      timestamp_sample_ = other.timestamp_sample_;

      estimator_instance_ = other.estimator_instance_;

      device_id_ = other.device_id_;

      time_last_fuse_ = other.time_last_fuse_;

      observation_ = other.observation_;

      observation_variance_ = other.observation_variance_;

      innovation_ = other.innovation_;

      innovation_filtered_ = other.innovation_filtered_;

      innovation_variance_ = other.innovation_variance_;

      test_ratio_ = other.test_ratio_;

      test_ratio_filtered_ = other.test_ratio_filtered_;

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

   public void setObservation(float observation)
   {
      observation_ = observation;
   }
   public float getObservation()
   {
      return observation_;
   }

   public void setObservationVariance(float observation_variance)
   {
      observation_variance_ = observation_variance;
   }
   public float getObservationVariance()
   {
      return observation_variance_;
   }

   public void setInnovation(float innovation)
   {
      innovation_ = innovation;
   }
   public float getInnovation()
   {
      return innovation_;
   }

   public void setInnovationFiltered(float innovation_filtered)
   {
      innovation_filtered_ = innovation_filtered;
   }
   public float getInnovationFiltered()
   {
      return innovation_filtered_;
   }

   public void setInnovationVariance(float innovation_variance)
   {
      innovation_variance_ = innovation_variance;
   }
   public float getInnovationVariance()
   {
      return innovation_variance_;
   }

   /**
            * normalized innovation squared
            */
   public void setTestRatio(float test_ratio)
   {
      test_ratio_ = test_ratio;
   }
   /**
            * normalized innovation squared
            */
   public float getTestRatio()
   {
      return test_ratio_;
   }

   /**
            * signed filtered test ratio
            */
   public void setTestRatioFiltered(float test_ratio_filtered)
   {
      test_ratio_filtered_ = test_ratio_filtered;
   }
   /**
            * signed filtered test ratio
            */
   public float getTestRatioFiltered()
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


   public static Supplier<EstimatorAidSource1dPubSubType> getPubSubType()
   {
      return EstimatorAidSource1dPubSubType::new;
   }

   @Override
   public Supplier<TopicDataType> getPubSubTypePacket()
   {
      return EstimatorAidSource1dPubSubType::new;
   }

   @Override
   public boolean epsilonEquals(EstimatorAidSource1d other, double epsilon)
   {
      if(other == null) return false;
      if(other == this) return true;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_, other.timestamp_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_sample_, other.timestamp_sample_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.estimator_instance_, other.estimator_instance_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.device_id_, other.device_id_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.time_last_fuse_, other.time_last_fuse_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.observation_, other.observation_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.observation_variance_, other.observation_variance_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.innovation_, other.innovation_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.innovation_filtered_, other.innovation_filtered_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.innovation_variance_, other.innovation_variance_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.test_ratio_, other.test_ratio_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.test_ratio_filtered_, other.test_ratio_filtered_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.innovation_rejected_, other.innovation_rejected_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.fused_, other.fused_, epsilon)) return false;


      return true;
   }

   @Override
   public boolean equals(Object other)
   {
      if(other == null) return false;
      if(other == this) return true;
      if(!(other instanceof EstimatorAidSource1d)) return false;

      EstimatorAidSource1d otherMyClass = (EstimatorAidSource1d) other;

      if(this.timestamp_ != otherMyClass.timestamp_) return false;

      if(this.timestamp_sample_ != otherMyClass.timestamp_sample_) return false;

      if(this.estimator_instance_ != otherMyClass.estimator_instance_) return false;

      if(this.device_id_ != otherMyClass.device_id_) return false;

      if(this.time_last_fuse_ != otherMyClass.time_last_fuse_) return false;

      if(this.observation_ != otherMyClass.observation_) return false;

      if(this.observation_variance_ != otherMyClass.observation_variance_) return false;

      if(this.innovation_ != otherMyClass.innovation_) return false;

      if(this.innovation_filtered_ != otherMyClass.innovation_filtered_) return false;

      if(this.innovation_variance_ != otherMyClass.innovation_variance_) return false;

      if(this.test_ratio_ != otherMyClass.test_ratio_) return false;

      if(this.test_ratio_filtered_ != otherMyClass.test_ratio_filtered_) return false;

      if(this.innovation_rejected_ != otherMyClass.innovation_rejected_) return false;

      if(this.fused_ != otherMyClass.fused_) return false;


      return true;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("EstimatorAidSource1d {");
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
      builder.append(this.observation_);      builder.append(", ");
      builder.append("observation_variance=");
      builder.append(this.observation_variance_);      builder.append(", ");
      builder.append("innovation=");
      builder.append(this.innovation_);      builder.append(", ");
      builder.append("innovation_filtered=");
      builder.append(this.innovation_filtered_);      builder.append(", ");
      builder.append("innovation_variance=");
      builder.append(this.innovation_variance_);      builder.append(", ");
      builder.append("test_ratio=");
      builder.append(this.test_ratio_);      builder.append(", ");
      builder.append("test_ratio_filtered=");
      builder.append(this.test_ratio_filtered_);      builder.append(", ");
      builder.append("innovation_rejected=");
      builder.append(this.innovation_rejected_);      builder.append(", ");
      builder.append("fused=");
      builder.append(this.fused_);
      builder.append("}");
      return builder.toString();
   }
}
