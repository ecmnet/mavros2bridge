package px4_msgs.msg.dds;

import us.ihmc.communication.packets.Packet;
import us.ihmc.euclid.interfaces.Settable;
import us.ihmc.euclid.interfaces.EpsilonComparable;
import java.util.function.Supplier;
import us.ihmc.pubsub.TopicDataType;

public class Rpm extends Packet<Rpm> implements Settable<Rpm>, EpsilonComparable<Rpm>
{
   /**
            * time since system start (microseconds)
            */
   public long timestamp_;
   /**
            * indicated rotor Frequency in Revolution per minute
            */
   public float indicated_frequency_rpm_;
   /**
            * estimated accuracy in Revolution per minute
            */
   public float estimated_accurancy_rpm_;

   public Rpm()
   {
   }

   public Rpm(Rpm other)
   {
      this();
      set(other);
   }

   public void set(Rpm other)
   {
      timestamp_ = other.timestamp_;

      indicated_frequency_rpm_ = other.indicated_frequency_rpm_;

      estimated_accurancy_rpm_ = other.estimated_accurancy_rpm_;

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
            * indicated rotor Frequency in Revolution per minute
            */
   public void setIndicatedFrequencyRpm(float indicated_frequency_rpm)
   {
      indicated_frequency_rpm_ = indicated_frequency_rpm;
   }
   /**
            * indicated rotor Frequency in Revolution per minute
            */
   public float getIndicatedFrequencyRpm()
   {
      return indicated_frequency_rpm_;
   }

   /**
            * estimated accuracy in Revolution per minute
            */
   public void setEstimatedAccurancyRpm(float estimated_accurancy_rpm)
   {
      estimated_accurancy_rpm_ = estimated_accurancy_rpm;
   }
   /**
            * estimated accuracy in Revolution per minute
            */
   public float getEstimatedAccurancyRpm()
   {
      return estimated_accurancy_rpm_;
   }


   public static Supplier<RpmPubSubType> getPubSubType()
   {
      return RpmPubSubType::new;
   }

   @Override
   public Supplier<TopicDataType> getPubSubTypePacket()
   {
      return RpmPubSubType::new;
   }

   @Override
   public boolean epsilonEquals(Rpm other, double epsilon)
   {
      if(other == null) return false;
      if(other == this) return true;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_, other.timestamp_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.indicated_frequency_rpm_, other.indicated_frequency_rpm_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.estimated_accurancy_rpm_, other.estimated_accurancy_rpm_, epsilon)) return false;


      return true;
   }

   @Override
   public boolean equals(Object other)
   {
      if(other == null) return false;
      if(other == this) return true;
      if(!(other instanceof Rpm)) return false;

      Rpm otherMyClass = (Rpm) other;

      if(this.timestamp_ != otherMyClass.timestamp_) return false;

      if(this.indicated_frequency_rpm_ != otherMyClass.indicated_frequency_rpm_) return false;

      if(this.estimated_accurancy_rpm_ != otherMyClass.estimated_accurancy_rpm_) return false;


      return true;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("Rpm {");
      builder.append("timestamp=");
      builder.append(this.timestamp_);      builder.append(", ");
      builder.append("indicated_frequency_rpm=");
      builder.append(this.indicated_frequency_rpm_);      builder.append(", ");
      builder.append("estimated_accurancy_rpm=");
      builder.append(this.estimated_accurancy_rpm_);
      builder.append("}");
      return builder.toString();
   }
}
