package px4_msgs.msg.dds;

import us.ihmc.communication.packets.Packet;
import us.ihmc.euclid.interfaces.Settable;
import us.ihmc.euclid.interfaces.EpsilonComparable;
import java.util.function.Supplier;
import us.ihmc.pubsub.TopicDataType;

public class EstimatorBias extends Packet<EstimatorBias> implements Settable<EstimatorBias>, EpsilonComparable<EstimatorBias>
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
   public float bias_;
   /**
            * estimated barometric altitude bias variance (m^2)
            */
   public float bias_var_;
   /**
            * innovation of the last measurement fusion (m)
            */
   public float innov_;
   /**
            * innovation variance of the last measurement fusion (m^2)
            */
   public float innov_var_;
   /**
            * normalized innovation squared test ratio
            */
   public float innov_test_ratio_;

   public EstimatorBias()
   {
   }

   public EstimatorBias(EstimatorBias other)
   {
      this();
      set(other);
   }

   public void set(EstimatorBias other)
   {
      timestamp_ = other.timestamp_;

      timestamp_sample_ = other.timestamp_sample_;

      device_id_ = other.device_id_;

      bias_ = other.bias_;

      bias_var_ = other.bias_var_;

      innov_ = other.innov_;

      innov_var_ = other.innov_var_;

      innov_test_ratio_ = other.innov_test_ratio_;

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
   public void setBias(float bias)
   {
      bias_ = bias;
   }
   /**
            * estimated barometric altitude bias (m)
            */
   public float getBias()
   {
      return bias_;
   }

   /**
            * estimated barometric altitude bias variance (m^2)
            */
   public void setBiasVar(float bias_var)
   {
      bias_var_ = bias_var;
   }
   /**
            * estimated barometric altitude bias variance (m^2)
            */
   public float getBiasVar()
   {
      return bias_var_;
   }

   /**
            * innovation of the last measurement fusion (m)
            */
   public void setInnov(float innov)
   {
      innov_ = innov;
   }
   /**
            * innovation of the last measurement fusion (m)
            */
   public float getInnov()
   {
      return innov_;
   }

   /**
            * innovation variance of the last measurement fusion (m^2)
            */
   public void setInnovVar(float innov_var)
   {
      innov_var_ = innov_var;
   }
   /**
            * innovation variance of the last measurement fusion (m^2)
            */
   public float getInnovVar()
   {
      return innov_var_;
   }

   /**
            * normalized innovation squared test ratio
            */
   public void setInnovTestRatio(float innov_test_ratio)
   {
      innov_test_ratio_ = innov_test_ratio;
   }
   /**
            * normalized innovation squared test ratio
            */
   public float getInnovTestRatio()
   {
      return innov_test_ratio_;
   }


   public static Supplier<EstimatorBiasPubSubType> getPubSubType()
   {
      return EstimatorBiasPubSubType::new;
   }

   @Override
   public Supplier<TopicDataType> getPubSubTypePacket()
   {
      return EstimatorBiasPubSubType::new;
   }

   @Override
   public boolean epsilonEquals(EstimatorBias other, double epsilon)
   {
      if(other == null) return false;
      if(other == this) return true;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_, other.timestamp_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_sample_, other.timestamp_sample_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.device_id_, other.device_id_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.bias_, other.bias_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.bias_var_, other.bias_var_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.innov_, other.innov_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.innov_var_, other.innov_var_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.innov_test_ratio_, other.innov_test_ratio_, epsilon)) return false;


      return true;
   }

   @Override
   public boolean equals(Object other)
   {
      if(other == null) return false;
      if(other == this) return true;
      if(!(other instanceof EstimatorBias)) return false;

      EstimatorBias otherMyClass = (EstimatorBias) other;

      if(this.timestamp_ != otherMyClass.timestamp_) return false;

      if(this.timestamp_sample_ != otherMyClass.timestamp_sample_) return false;

      if(this.device_id_ != otherMyClass.device_id_) return false;

      if(this.bias_ != otherMyClass.bias_) return false;

      if(this.bias_var_ != otherMyClass.bias_var_) return false;

      if(this.innov_ != otherMyClass.innov_) return false;

      if(this.innov_var_ != otherMyClass.innov_var_) return false;

      if(this.innov_test_ratio_ != otherMyClass.innov_test_ratio_) return false;


      return true;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("EstimatorBias {");
      builder.append("timestamp=");
      builder.append(this.timestamp_);      builder.append(", ");
      builder.append("timestamp_sample=");
      builder.append(this.timestamp_sample_);      builder.append(", ");
      builder.append("device_id=");
      builder.append(this.device_id_);      builder.append(", ");
      builder.append("bias=");
      builder.append(this.bias_);      builder.append(", ");
      builder.append("bias_var=");
      builder.append(this.bias_var_);      builder.append(", ");
      builder.append("innov=");
      builder.append(this.innov_);      builder.append(", ");
      builder.append("innov_var=");
      builder.append(this.innov_var_);      builder.append(", ");
      builder.append("innov_test_ratio=");
      builder.append(this.innov_test_ratio_);
      builder.append("}");
      return builder.toString();
   }
}
