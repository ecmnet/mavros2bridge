package px4_msgs.msg.dds;

import us.ihmc.communication.packets.Packet;
import us.ihmc.euclid.interfaces.Settable;
import us.ihmc.euclid.interfaces.EpsilonComparable;
import java.util.function.Supplier;
import us.ihmc.pubsub.TopicDataType;

public class PpsCapture extends Packet<PpsCapture> implements Settable<PpsCapture>, EpsilonComparable<PpsCapture>
{
   /**
            * time since system start (microseconds) at PPS capture event
            */
   public long timestamp_;
   /**
            * Corrected GPS UTC timestamp at PPS capture event
            */
   public long rtc_timestamp_;
   /**
            * Increments when PPS dt < 50ms
            */
   public byte pps_rate_exceeded_counter_;

   public PpsCapture()
   {
   }

   public PpsCapture(PpsCapture other)
   {
      this();
      set(other);
   }

   public void set(PpsCapture other)
   {
      timestamp_ = other.timestamp_;

      rtc_timestamp_ = other.rtc_timestamp_;

      pps_rate_exceeded_counter_ = other.pps_rate_exceeded_counter_;

   }

   /**
            * time since system start (microseconds) at PPS capture event
            */
   public void setTimestamp(long timestamp)
   {
      timestamp_ = timestamp;
   }
   /**
            * time since system start (microseconds) at PPS capture event
            */
   public long getTimestamp()
   {
      return timestamp_;
   }

   /**
            * Corrected GPS UTC timestamp at PPS capture event
            */
   public void setRtcTimestamp(long rtc_timestamp)
   {
      rtc_timestamp_ = rtc_timestamp;
   }
   /**
            * Corrected GPS UTC timestamp at PPS capture event
            */
   public long getRtcTimestamp()
   {
      return rtc_timestamp_;
   }

   /**
            * Increments when PPS dt < 50ms
            */
   public void setPpsRateExceededCounter(byte pps_rate_exceeded_counter)
   {
      pps_rate_exceeded_counter_ = pps_rate_exceeded_counter;
   }
   /**
            * Increments when PPS dt < 50ms
            */
   public byte getPpsRateExceededCounter()
   {
      return pps_rate_exceeded_counter_;
   }


   public static Supplier<PpsCapturePubSubType> getPubSubType()
   {
      return PpsCapturePubSubType::new;
   }

   @Override
   public Supplier<TopicDataType> getPubSubTypePacket()
   {
      return PpsCapturePubSubType::new;
   }

   @Override
   public boolean epsilonEquals(PpsCapture other, double epsilon)
   {
      if(other == null) return false;
      if(other == this) return true;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_, other.timestamp_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.rtc_timestamp_, other.rtc_timestamp_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.pps_rate_exceeded_counter_, other.pps_rate_exceeded_counter_, epsilon)) return false;


      return true;
   }

   @Override
   public boolean equals(Object other)
   {
      if(other == null) return false;
      if(other == this) return true;
      if(!(other instanceof PpsCapture)) return false;

      PpsCapture otherMyClass = (PpsCapture) other;

      if(this.timestamp_ != otherMyClass.timestamp_) return false;

      if(this.rtc_timestamp_ != otherMyClass.rtc_timestamp_) return false;

      if(this.pps_rate_exceeded_counter_ != otherMyClass.pps_rate_exceeded_counter_) return false;


      return true;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("PpsCapture {");
      builder.append("timestamp=");
      builder.append(this.timestamp_);      builder.append(", ");
      builder.append("rtc_timestamp=");
      builder.append(this.rtc_timestamp_);      builder.append(", ");
      builder.append("pps_rate_exceeded_counter=");
      builder.append(this.pps_rate_exceeded_counter_);
      builder.append("}");
      return builder.toString();
   }
}
