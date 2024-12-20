package px4_msgs.msg.dds;

import us.ihmc.communication.packets.Packet;
import us.ihmc.euclid.interfaces.Settable;
import us.ihmc.euclid.interfaces.EpsilonComparable;
import java.util.function.Supplier;
import us.ihmc.pubsub.TopicDataType;

public class EstimatorStates extends Packet<EstimatorStates> implements Settable<EstimatorStates>, EpsilonComparable<EstimatorStates>
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
            * Internal filter states
            */
   public float[] states_;
   /**
            * Number of states effectively used
            */
   public byte n_states_;
   /**
            * Diagonal Elements of Covariance Matrix
            */
   public float[] covariances_;

   public EstimatorStates()
   {
      states_ = new float[25];

      covariances_ = new float[24];

   }

   public EstimatorStates(EstimatorStates other)
   {
      this();
      set(other);
   }

   public void set(EstimatorStates other)
   {
      timestamp_ = other.timestamp_;

      timestamp_sample_ = other.timestamp_sample_;

      for(int i1 = 0; i1 < states_.length; ++i1)
      {
            states_[i1] = other.states_[i1];

      }

      n_states_ = other.n_states_;

      for(int i3 = 0; i3 < covariances_.length; ++i3)
      {
            covariances_[i3] = other.covariances_[i3];

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
            * Internal filter states
            */
   public float[] getStates()
   {
      return states_;
   }

   /**
            * Number of states effectively used
            */
   public void setNStates(byte n_states)
   {
      n_states_ = n_states;
   }
   /**
            * Number of states effectively used
            */
   public byte getNStates()
   {
      return n_states_;
   }


   /**
            * Diagonal Elements of Covariance Matrix
            */
   public float[] getCovariances()
   {
      return covariances_;
   }


   public static Supplier<EstimatorStatesPubSubType> getPubSubType()
   {
      return EstimatorStatesPubSubType::new;
   }

   @Override
   public Supplier<TopicDataType> getPubSubTypePacket()
   {
      return EstimatorStatesPubSubType::new;
   }

   @Override
   public boolean epsilonEquals(EstimatorStates other, double epsilon)
   {
      if(other == null) return false;
      if(other == this) return true;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_, other.timestamp_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_sample_, other.timestamp_sample_, epsilon)) return false;

      for(int i5 = 0; i5 < states_.length; ++i5)
      {
                if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.states_[i5], other.states_[i5], epsilon)) return false;
      }

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.n_states_, other.n_states_, epsilon)) return false;

      for(int i7 = 0; i7 < covariances_.length; ++i7)
      {
                if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.covariances_[i7], other.covariances_[i7], epsilon)) return false;
      }


      return true;
   }

   @Override
   public boolean equals(Object other)
   {
      if(other == null) return false;
      if(other == this) return true;
      if(!(other instanceof EstimatorStates)) return false;

      EstimatorStates otherMyClass = (EstimatorStates) other;

      if(this.timestamp_ != otherMyClass.timestamp_) return false;

      if(this.timestamp_sample_ != otherMyClass.timestamp_sample_) return false;

      for(int i9 = 0; i9 < states_.length; ++i9)
      {
                if(this.states_[i9] != otherMyClass.states_[i9]) return false;

      }
      if(this.n_states_ != otherMyClass.n_states_) return false;

      for(int i11 = 0; i11 < covariances_.length; ++i11)
      {
                if(this.covariances_[i11] != otherMyClass.covariances_[i11]) return false;

      }

      return true;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("EstimatorStates {");
      builder.append("timestamp=");
      builder.append(this.timestamp_);      builder.append(", ");
      builder.append("timestamp_sample=");
      builder.append(this.timestamp_sample_);      builder.append(", ");
      builder.append("states=");
      builder.append(java.util.Arrays.toString(this.states_));      builder.append(", ");
      builder.append("n_states=");
      builder.append(this.n_states_);      builder.append(", ");
      builder.append("covariances=");
      builder.append(java.util.Arrays.toString(this.covariances_));
      builder.append("}");
      return builder.toString();
   }
}
