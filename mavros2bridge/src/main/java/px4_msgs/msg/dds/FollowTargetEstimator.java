package px4_msgs.msg.dds;

import us.ihmc.communication.packets.Packet;
import us.ihmc.euclid.interfaces.Settable;
import us.ihmc.euclid.interfaces.EpsilonComparable;
import java.util.function.Supplier;
import us.ihmc.pubsub.TopicDataType;

public class FollowTargetEstimator extends Packet<FollowTargetEstimator> implements Settable<FollowTargetEstimator>, EpsilonComparable<FollowTargetEstimator>
{
   /**
            * time since system start (microseconds)
            */
   public long timestamp_;
   /**
            * time of last filter reset (microseconds)
            */
   public long last_filter_reset_timestamp_;
   /**
            * True if estimator states are okay to be used
            */
   public boolean valid_;
   /**
            * True if estimator stopped receiving follow_target messages for some time. The estimate can still be valid, though it might be inaccurate.
            */
   public boolean stale_;
   /**
            * Estimated target latitude
            */
   public double lat_est_;
   /**
            * Estimated target longitude
            */
   public double lon_est_;
   /**
            * Estimated target altitude
            */
   public float alt_est_;
   /**
            * Estimated target NED position (m)
            */
   public float[] pos_est_;
   /**
            * Estimated target NED velocity (m/s)
            */
   public float[] vel_est_;
   /**
            * Estimated target NED acceleration (m^2/s)
            */
   public float[] acc_est_;
   public long prediction_count_;
   public long fusion_count_;

   public FollowTargetEstimator()
   {
      pos_est_ = new float[3];

      vel_est_ = new float[3];

      acc_est_ = new float[3];

   }

   public FollowTargetEstimator(FollowTargetEstimator other)
   {
      this();
      set(other);
   }

   public void set(FollowTargetEstimator other)
   {
      timestamp_ = other.timestamp_;

      last_filter_reset_timestamp_ = other.last_filter_reset_timestamp_;

      valid_ = other.valid_;

      stale_ = other.stale_;

      lat_est_ = other.lat_est_;

      lon_est_ = other.lon_est_;

      alt_est_ = other.alt_est_;

      for(int i1 = 0; i1 < pos_est_.length; ++i1)
      {
            pos_est_[i1] = other.pos_est_[i1];

      }

      for(int i3 = 0; i3 < vel_est_.length; ++i3)
      {
            vel_est_[i3] = other.vel_est_[i3];

      }

      for(int i5 = 0; i5 < acc_est_.length; ++i5)
      {
            acc_est_[i5] = other.acc_est_[i5];

      }

      prediction_count_ = other.prediction_count_;

      fusion_count_ = other.fusion_count_;

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
            * time of last filter reset (microseconds)
            */
   public void setLastFilterResetTimestamp(long last_filter_reset_timestamp)
   {
      last_filter_reset_timestamp_ = last_filter_reset_timestamp;
   }
   /**
            * time of last filter reset (microseconds)
            */
   public long getLastFilterResetTimestamp()
   {
      return last_filter_reset_timestamp_;
   }

   /**
            * True if estimator states are okay to be used
            */
   public void setValid(boolean valid)
   {
      valid_ = valid;
   }
   /**
            * True if estimator states are okay to be used
            */
   public boolean getValid()
   {
      return valid_;
   }

   /**
            * True if estimator stopped receiving follow_target messages for some time. The estimate can still be valid, though it might be inaccurate.
            */
   public void setStale(boolean stale)
   {
      stale_ = stale;
   }
   /**
            * True if estimator stopped receiving follow_target messages for some time. The estimate can still be valid, though it might be inaccurate.
            */
   public boolean getStale()
   {
      return stale_;
   }

   /**
            * Estimated target latitude
            */
   public void setLatEst(double lat_est)
   {
      lat_est_ = lat_est;
   }
   /**
            * Estimated target latitude
            */
   public double getLatEst()
   {
      return lat_est_;
   }

   /**
            * Estimated target longitude
            */
   public void setLonEst(double lon_est)
   {
      lon_est_ = lon_est;
   }
   /**
            * Estimated target longitude
            */
   public double getLonEst()
   {
      return lon_est_;
   }

   /**
            * Estimated target altitude
            */
   public void setAltEst(float alt_est)
   {
      alt_est_ = alt_est;
   }
   /**
            * Estimated target altitude
            */
   public float getAltEst()
   {
      return alt_est_;
   }


   /**
            * Estimated target NED position (m)
            */
   public float[] getPosEst()
   {
      return pos_est_;
   }


   /**
            * Estimated target NED velocity (m/s)
            */
   public float[] getVelEst()
   {
      return vel_est_;
   }


   /**
            * Estimated target NED acceleration (m^2/s)
            */
   public float[] getAccEst()
   {
      return acc_est_;
   }

   public void setPredictionCount(long prediction_count)
   {
      prediction_count_ = prediction_count;
   }
   public long getPredictionCount()
   {
      return prediction_count_;
   }

   public void setFusionCount(long fusion_count)
   {
      fusion_count_ = fusion_count;
   }
   public long getFusionCount()
   {
      return fusion_count_;
   }


   public static Supplier<FollowTargetEstimatorPubSubType> getPubSubType()
   {
      return FollowTargetEstimatorPubSubType::new;
   }

   @Override
   public Supplier<TopicDataType> getPubSubTypePacket()
   {
      return FollowTargetEstimatorPubSubType::new;
   }

   @Override
   public boolean epsilonEquals(FollowTargetEstimator other, double epsilon)
   {
      if(other == null) return false;
      if(other == this) return true;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_, other.timestamp_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.last_filter_reset_timestamp_, other.last_filter_reset_timestamp_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.valid_, other.valid_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.stale_, other.stale_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.lat_est_, other.lat_est_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.lon_est_, other.lon_est_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.alt_est_, other.alt_est_, epsilon)) return false;

      for(int i7 = 0; i7 < pos_est_.length; ++i7)
      {
                if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.pos_est_[i7], other.pos_est_[i7], epsilon)) return false;
      }

      for(int i9 = 0; i9 < vel_est_.length; ++i9)
      {
                if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.vel_est_[i9], other.vel_est_[i9], epsilon)) return false;
      }

      for(int i11 = 0; i11 < acc_est_.length; ++i11)
      {
                if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.acc_est_[i11], other.acc_est_[i11], epsilon)) return false;
      }

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.prediction_count_, other.prediction_count_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.fusion_count_, other.fusion_count_, epsilon)) return false;


      return true;
   }

   @Override
   public boolean equals(Object other)
   {
      if(other == null) return false;
      if(other == this) return true;
      if(!(other instanceof FollowTargetEstimator)) return false;

      FollowTargetEstimator otherMyClass = (FollowTargetEstimator) other;

      if(this.timestamp_ != otherMyClass.timestamp_) return false;

      if(this.last_filter_reset_timestamp_ != otherMyClass.last_filter_reset_timestamp_) return false;

      if(this.valid_ != otherMyClass.valid_) return false;

      if(this.stale_ != otherMyClass.stale_) return false;

      if(this.lat_est_ != otherMyClass.lat_est_) return false;

      if(this.lon_est_ != otherMyClass.lon_est_) return false;

      if(this.alt_est_ != otherMyClass.alt_est_) return false;

      for(int i13 = 0; i13 < pos_est_.length; ++i13)
      {
                if(this.pos_est_[i13] != otherMyClass.pos_est_[i13]) return false;

      }
      for(int i15 = 0; i15 < vel_est_.length; ++i15)
      {
                if(this.vel_est_[i15] != otherMyClass.vel_est_[i15]) return false;

      }
      for(int i17 = 0; i17 < acc_est_.length; ++i17)
      {
                if(this.acc_est_[i17] != otherMyClass.acc_est_[i17]) return false;

      }
      if(this.prediction_count_ != otherMyClass.prediction_count_) return false;

      if(this.fusion_count_ != otherMyClass.fusion_count_) return false;


      return true;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("FollowTargetEstimator {");
      builder.append("timestamp=");
      builder.append(this.timestamp_);      builder.append(", ");
      builder.append("last_filter_reset_timestamp=");
      builder.append(this.last_filter_reset_timestamp_);      builder.append(", ");
      builder.append("valid=");
      builder.append(this.valid_);      builder.append(", ");
      builder.append("stale=");
      builder.append(this.stale_);      builder.append(", ");
      builder.append("lat_est=");
      builder.append(this.lat_est_);      builder.append(", ");
      builder.append("lon_est=");
      builder.append(this.lon_est_);      builder.append(", ");
      builder.append("alt_est=");
      builder.append(this.alt_est_);      builder.append(", ");
      builder.append("pos_est=");
      builder.append(java.util.Arrays.toString(this.pos_est_));      builder.append(", ");
      builder.append("vel_est=");
      builder.append(java.util.Arrays.toString(this.vel_est_));      builder.append(", ");
      builder.append("acc_est=");
      builder.append(java.util.Arrays.toString(this.acc_est_));      builder.append(", ");
      builder.append("prediction_count=");
      builder.append(this.prediction_count_);      builder.append(", ");
      builder.append("fusion_count=");
      builder.append(this.fusion_count_);
      builder.append("}");
      return builder.toString();
   }
}
