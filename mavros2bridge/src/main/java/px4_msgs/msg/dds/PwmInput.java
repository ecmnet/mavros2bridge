package px4_msgs.msg.dds;

import us.ihmc.communication.packets.Packet;
import us.ihmc.euclid.interfaces.Settable;
import us.ihmc.euclid.interfaces.EpsilonComparable;
import java.util.function.Supplier;
import us.ihmc.pubsub.TopicDataType;

public class PwmInput extends Packet<PwmInput> implements Settable<PwmInput>, EpsilonComparable<PwmInput>
{
   /**
            * Time since system start (microseconds)
            */
   public long timestamp_;
   /**
            * Timer overcapture error flag (AUX5 or MAIN5)
            */
   public long error_count_;
   /**
            * Pulse width, timer counts
            */
   public long pulse_width_;
   /**
            * Period, timer counts
            */
   public long period_;

   public PwmInput()
   {
   }

   public PwmInput(PwmInput other)
   {
      this();
      set(other);
   }

   public void set(PwmInput other)
   {
      timestamp_ = other.timestamp_;

      error_count_ = other.error_count_;

      pulse_width_ = other.pulse_width_;

      period_ = other.period_;

   }

   /**
            * Time since system start (microseconds)
            */
   public void setTimestamp(long timestamp)
   {
      timestamp_ = timestamp;
   }
   /**
            * Time since system start (microseconds)
            */
   public long getTimestamp()
   {
      return timestamp_;
   }

   /**
            * Timer overcapture error flag (AUX5 or MAIN5)
            */
   public void setErrorCount(long error_count)
   {
      error_count_ = error_count;
   }
   /**
            * Timer overcapture error flag (AUX5 or MAIN5)
            */
   public long getErrorCount()
   {
      return error_count_;
   }

   /**
            * Pulse width, timer counts
            */
   public void setPulseWidth(long pulse_width)
   {
      pulse_width_ = pulse_width;
   }
   /**
            * Pulse width, timer counts
            */
   public long getPulseWidth()
   {
      return pulse_width_;
   }

   /**
            * Period, timer counts
            */
   public void setPeriod(long period)
   {
      period_ = period;
   }
   /**
            * Period, timer counts
            */
   public long getPeriod()
   {
      return period_;
   }


   public static Supplier<PwmInputPubSubType> getPubSubType()
   {
      return PwmInputPubSubType::new;
   }

   @Override
   public Supplier<TopicDataType> getPubSubTypePacket()
   {
      return PwmInputPubSubType::new;
   }

   @Override
   public boolean epsilonEquals(PwmInput other, double epsilon)
   {
      if(other == null) return false;
      if(other == this) return true;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_, other.timestamp_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.error_count_, other.error_count_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.pulse_width_, other.pulse_width_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.period_, other.period_, epsilon)) return false;


      return true;
   }

   @Override
   public boolean equals(Object other)
   {
      if(other == null) return false;
      if(other == this) return true;
      if(!(other instanceof PwmInput)) return false;

      PwmInput otherMyClass = (PwmInput) other;

      if(this.timestamp_ != otherMyClass.timestamp_) return false;

      if(this.error_count_ != otherMyClass.error_count_) return false;

      if(this.pulse_width_ != otherMyClass.pulse_width_) return false;

      if(this.period_ != otherMyClass.period_) return false;


      return true;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("PwmInput {");
      builder.append("timestamp=");
      builder.append(this.timestamp_);      builder.append(", ");
      builder.append("error_count=");
      builder.append(this.error_count_);      builder.append(", ");
      builder.append("pulse_width=");
      builder.append(this.pulse_width_);      builder.append(", ");
      builder.append("period=");
      builder.append(this.period_);
      builder.append("}");
      return builder.toString();
   }
}
