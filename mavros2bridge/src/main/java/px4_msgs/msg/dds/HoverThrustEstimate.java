package px4_msgs.msg.dds;

import us.ihmc.communication.packets.Packet;
import us.ihmc.euclid.interfaces.Settable;
import us.ihmc.euclid.interfaces.EpsilonComparable;
import java.util.function.Supplier;
import us.ihmc.pubsub.TopicDataType;

public class HoverThrustEstimate extends Packet<HoverThrustEstimate> implements Settable<HoverThrustEstimate>, EpsilonComparable<HoverThrustEstimate>
{
   /**
            * time since system start (microseconds)
            */
   public long timestamp_;
   /**
            * time of corresponding sensor data last used for this estimate
            */
   public long timestamp_sample_;
   /**
            * estimated hover thrust [0.1, 0.9]
            */
   public float hover_thrust_;
   /**
            * estimated hover thrust variance
            */
   public float hover_thrust_var_;
   /**
            * innovation of the last acceleration fusion
            */
   public float accel_innov_;
   /**
            * innovation variance of the last acceleration fusion
            */
   public float accel_innov_var_;
   /**
            * normalized innovation squared test ratio
            */
   public float accel_innov_test_ratio_;
   /**
            * vertical acceleration noise variance estimated form innovation residual
            */
   public float accel_noise_var_;
   public boolean valid_;

   public HoverThrustEstimate()
   {
   }

   public HoverThrustEstimate(HoverThrustEstimate other)
   {
      this();
      set(other);
   }

   public void set(HoverThrustEstimate other)
   {
      timestamp_ = other.timestamp_;

      timestamp_sample_ = other.timestamp_sample_;

      hover_thrust_ = other.hover_thrust_;

      hover_thrust_var_ = other.hover_thrust_var_;

      accel_innov_ = other.accel_innov_;

      accel_innov_var_ = other.accel_innov_var_;

      accel_innov_test_ratio_ = other.accel_innov_test_ratio_;

      accel_noise_var_ = other.accel_noise_var_;

      valid_ = other.valid_;

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
            * time of corresponding sensor data last used for this estimate
            */
   public void setTimestampSample(long timestamp_sample)
   {
      timestamp_sample_ = timestamp_sample;
   }
   /**
            * time of corresponding sensor data last used for this estimate
            */
   public long getTimestampSample()
   {
      return timestamp_sample_;
   }

   /**
            * estimated hover thrust [0.1, 0.9]
            */
   public void setHoverThrust(float hover_thrust)
   {
      hover_thrust_ = hover_thrust;
   }
   /**
            * estimated hover thrust [0.1, 0.9]
            */
   public float getHoverThrust()
   {
      return hover_thrust_;
   }

   /**
            * estimated hover thrust variance
            */
   public void setHoverThrustVar(float hover_thrust_var)
   {
      hover_thrust_var_ = hover_thrust_var;
   }
   /**
            * estimated hover thrust variance
            */
   public float getHoverThrustVar()
   {
      return hover_thrust_var_;
   }

   /**
            * innovation of the last acceleration fusion
            */
   public void setAccelInnov(float accel_innov)
   {
      accel_innov_ = accel_innov;
   }
   /**
            * innovation of the last acceleration fusion
            */
   public float getAccelInnov()
   {
      return accel_innov_;
   }

   /**
            * innovation variance of the last acceleration fusion
            */
   public void setAccelInnovVar(float accel_innov_var)
   {
      accel_innov_var_ = accel_innov_var;
   }
   /**
            * innovation variance of the last acceleration fusion
            */
   public float getAccelInnovVar()
   {
      return accel_innov_var_;
   }

   /**
            * normalized innovation squared test ratio
            */
   public void setAccelInnovTestRatio(float accel_innov_test_ratio)
   {
      accel_innov_test_ratio_ = accel_innov_test_ratio;
   }
   /**
            * normalized innovation squared test ratio
            */
   public float getAccelInnovTestRatio()
   {
      return accel_innov_test_ratio_;
   }

   /**
            * vertical acceleration noise variance estimated form innovation residual
            */
   public void setAccelNoiseVar(float accel_noise_var)
   {
      accel_noise_var_ = accel_noise_var;
   }
   /**
            * vertical acceleration noise variance estimated form innovation residual
            */
   public float getAccelNoiseVar()
   {
      return accel_noise_var_;
   }

   public void setValid(boolean valid)
   {
      valid_ = valid;
   }
   public boolean getValid()
   {
      return valid_;
   }


   public static Supplier<HoverThrustEstimatePubSubType> getPubSubType()
   {
      return HoverThrustEstimatePubSubType::new;
   }

   @Override
   public Supplier<TopicDataType> getPubSubTypePacket()
   {
      return HoverThrustEstimatePubSubType::new;
   }

   @Override
   public boolean epsilonEquals(HoverThrustEstimate other, double epsilon)
   {
      if(other == null) return false;
      if(other == this) return true;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_, other.timestamp_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_sample_, other.timestamp_sample_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.hover_thrust_, other.hover_thrust_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.hover_thrust_var_, other.hover_thrust_var_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.accel_innov_, other.accel_innov_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.accel_innov_var_, other.accel_innov_var_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.accel_innov_test_ratio_, other.accel_innov_test_ratio_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.accel_noise_var_, other.accel_noise_var_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.valid_, other.valid_, epsilon)) return false;


      return true;
   }

   @Override
   public boolean equals(Object other)
   {
      if(other == null) return false;
      if(other == this) return true;
      if(!(other instanceof HoverThrustEstimate)) return false;

      HoverThrustEstimate otherMyClass = (HoverThrustEstimate) other;

      if(this.timestamp_ != otherMyClass.timestamp_) return false;

      if(this.timestamp_sample_ != otherMyClass.timestamp_sample_) return false;

      if(this.hover_thrust_ != otherMyClass.hover_thrust_) return false;

      if(this.hover_thrust_var_ != otherMyClass.hover_thrust_var_) return false;

      if(this.accel_innov_ != otherMyClass.accel_innov_) return false;

      if(this.accel_innov_var_ != otherMyClass.accel_innov_var_) return false;

      if(this.accel_innov_test_ratio_ != otherMyClass.accel_innov_test_ratio_) return false;

      if(this.accel_noise_var_ != otherMyClass.accel_noise_var_) return false;

      if(this.valid_ != otherMyClass.valid_) return false;


      return true;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("HoverThrustEstimate {");
      builder.append("timestamp=");
      builder.append(this.timestamp_);      builder.append(", ");
      builder.append("timestamp_sample=");
      builder.append(this.timestamp_sample_);      builder.append(", ");
      builder.append("hover_thrust=");
      builder.append(this.hover_thrust_);      builder.append(", ");
      builder.append("hover_thrust_var=");
      builder.append(this.hover_thrust_var_);      builder.append(", ");
      builder.append("accel_innov=");
      builder.append(this.accel_innov_);      builder.append(", ");
      builder.append("accel_innov_var=");
      builder.append(this.accel_innov_var_);      builder.append(", ");
      builder.append("accel_innov_test_ratio=");
      builder.append(this.accel_innov_test_ratio_);      builder.append(", ");
      builder.append("accel_noise_var=");
      builder.append(this.accel_noise_var_);      builder.append(", ");
      builder.append("valid=");
      builder.append(this.valid_);
      builder.append("}");
      return builder.toString();
   }
}
