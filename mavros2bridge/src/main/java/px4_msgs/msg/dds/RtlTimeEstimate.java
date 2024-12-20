package px4_msgs.msg.dds;

import us.ihmc.communication.packets.Packet;
import us.ihmc.euclid.interfaces.Settable;
import us.ihmc.euclid.interfaces.EpsilonComparable;
import java.util.function.Supplier;
import us.ihmc.pubsub.TopicDataType;

public class RtlTimeEstimate extends Packet<RtlTimeEstimate> implements Settable<RtlTimeEstimate>, EpsilonComparable<RtlTimeEstimate>
{
   /**
            * time since system start (microseconds)
            */
   public long timestamp_;
   /**
            * Flag indicating whether the time estiamtes are valid
            */
   public boolean valid_;
   /**
            * [s] Estimated time for RTL
            */
   public float time_estimate_;
   /**
            * [s] Same as time_estimate, but with safety factor and safety margin included (factor*t + margin)
            */
   public float safe_time_estimate_;

   public RtlTimeEstimate()
   {
   }

   public RtlTimeEstimate(RtlTimeEstimate other)
   {
      this();
      set(other);
   }

   public void set(RtlTimeEstimate other)
   {
      timestamp_ = other.timestamp_;

      valid_ = other.valid_;

      time_estimate_ = other.time_estimate_;

      safe_time_estimate_ = other.safe_time_estimate_;

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
            * Flag indicating whether the time estiamtes are valid
            */
   public void setValid(boolean valid)
   {
      valid_ = valid;
   }
   /**
            * Flag indicating whether the time estiamtes are valid
            */
   public boolean getValid()
   {
      return valid_;
   }

   /**
            * [s] Estimated time for RTL
            */
   public void setTimeEstimate(float time_estimate)
   {
      time_estimate_ = time_estimate;
   }
   /**
            * [s] Estimated time for RTL
            */
   public float getTimeEstimate()
   {
      return time_estimate_;
   }

   /**
            * [s] Same as time_estimate, but with safety factor and safety margin included (factor*t + margin)
            */
   public void setSafeTimeEstimate(float safe_time_estimate)
   {
      safe_time_estimate_ = safe_time_estimate;
   }
   /**
            * [s] Same as time_estimate, but with safety factor and safety margin included (factor*t + margin)
            */
   public float getSafeTimeEstimate()
   {
      return safe_time_estimate_;
   }


   public static Supplier<RtlTimeEstimatePubSubType> getPubSubType()
   {
      return RtlTimeEstimatePubSubType::new;
   }

   @Override
   public Supplier<TopicDataType> getPubSubTypePacket()
   {
      return RtlTimeEstimatePubSubType::new;
   }

   @Override
   public boolean epsilonEquals(RtlTimeEstimate other, double epsilon)
   {
      if(other == null) return false;
      if(other == this) return true;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_, other.timestamp_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.valid_, other.valid_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.time_estimate_, other.time_estimate_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.safe_time_estimate_, other.safe_time_estimate_, epsilon)) return false;


      return true;
   }

   @Override
   public boolean equals(Object other)
   {
      if(other == null) return false;
      if(other == this) return true;
      if(!(other instanceof RtlTimeEstimate)) return false;

      RtlTimeEstimate otherMyClass = (RtlTimeEstimate) other;

      if(this.timestamp_ != otherMyClass.timestamp_) return false;

      if(this.valid_ != otherMyClass.valid_) return false;

      if(this.time_estimate_ != otherMyClass.time_estimate_) return false;

      if(this.safe_time_estimate_ != otherMyClass.safe_time_estimate_) return false;


      return true;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("RtlTimeEstimate {");
      builder.append("timestamp=");
      builder.append(this.timestamp_);      builder.append(", ");
      builder.append("valid=");
      builder.append(this.valid_);      builder.append(", ");
      builder.append("time_estimate=");
      builder.append(this.time_estimate_);      builder.append(", ");
      builder.append("safe_time_estimate=");
      builder.append(this.safe_time_estimate_);
      builder.append("}");
      return builder.toString();
   }
}
