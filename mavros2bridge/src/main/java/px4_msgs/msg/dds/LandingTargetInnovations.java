package px4_msgs.msg.dds;

import us.ihmc.communication.packets.Packet;
import us.ihmc.euclid.interfaces.Settable;
import us.ihmc.euclid.interfaces.EpsilonComparable;
import java.util.function.Supplier;
import us.ihmc.pubsub.TopicDataType;

public class LandingTargetInnovations extends Packet<LandingTargetInnovations> implements Settable<LandingTargetInnovations>, EpsilonComparable<LandingTargetInnovations>
{
   /**
            * time since system start (microseconds)
            */
   public long timestamp_;
   /**
            * Innovation of landing target position estimator
            */
   public float innov_x_;
   public float innov_y_;
   /**
            * Innovation covariance of landing target position estimator
            */
   public float innov_cov_x_;
   public float innov_cov_y_;

   public LandingTargetInnovations()
   {
   }

   public LandingTargetInnovations(LandingTargetInnovations other)
   {
      this();
      set(other);
   }

   public void set(LandingTargetInnovations other)
   {
      timestamp_ = other.timestamp_;

      innov_x_ = other.innov_x_;

      innov_y_ = other.innov_y_;

      innov_cov_x_ = other.innov_cov_x_;

      innov_cov_y_ = other.innov_cov_y_;

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
            * Innovation of landing target position estimator
            */
   public void setInnovX(float innov_x)
   {
      innov_x_ = innov_x;
   }
   /**
            * Innovation of landing target position estimator
            */
   public float getInnovX()
   {
      return innov_x_;
   }

   public void setInnovY(float innov_y)
   {
      innov_y_ = innov_y;
   }
   public float getInnovY()
   {
      return innov_y_;
   }

   /**
            * Innovation covariance of landing target position estimator
            */
   public void setInnovCovX(float innov_cov_x)
   {
      innov_cov_x_ = innov_cov_x;
   }
   /**
            * Innovation covariance of landing target position estimator
            */
   public float getInnovCovX()
   {
      return innov_cov_x_;
   }

   public void setInnovCovY(float innov_cov_y)
   {
      innov_cov_y_ = innov_cov_y;
   }
   public float getInnovCovY()
   {
      return innov_cov_y_;
   }


   public static Supplier<LandingTargetInnovationsPubSubType> getPubSubType()
   {
      return LandingTargetInnovationsPubSubType::new;
   }

   @Override
   public Supplier<TopicDataType> getPubSubTypePacket()
   {
      return LandingTargetInnovationsPubSubType::new;
   }

   @Override
   public boolean epsilonEquals(LandingTargetInnovations other, double epsilon)
   {
      if(other == null) return false;
      if(other == this) return true;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_, other.timestamp_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.innov_x_, other.innov_x_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.innov_y_, other.innov_y_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.innov_cov_x_, other.innov_cov_x_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.innov_cov_y_, other.innov_cov_y_, epsilon)) return false;


      return true;
   }

   @Override
   public boolean equals(Object other)
   {
      if(other == null) return false;
      if(other == this) return true;
      if(!(other instanceof LandingTargetInnovations)) return false;

      LandingTargetInnovations otherMyClass = (LandingTargetInnovations) other;

      if(this.timestamp_ != otherMyClass.timestamp_) return false;

      if(this.innov_x_ != otherMyClass.innov_x_) return false;

      if(this.innov_y_ != otherMyClass.innov_y_) return false;

      if(this.innov_cov_x_ != otherMyClass.innov_cov_x_) return false;

      if(this.innov_cov_y_ != otherMyClass.innov_cov_y_) return false;


      return true;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("LandingTargetInnovations {");
      builder.append("timestamp=");
      builder.append(this.timestamp_);      builder.append(", ");
      builder.append("innov_x=");
      builder.append(this.innov_x_);      builder.append(", ");
      builder.append("innov_y=");
      builder.append(this.innov_y_);      builder.append(", ");
      builder.append("innov_cov_x=");
      builder.append(this.innov_cov_x_);      builder.append(", ");
      builder.append("innov_cov_y=");
      builder.append(this.innov_cov_y_);
      builder.append("}");
      return builder.toString();
   }
}
