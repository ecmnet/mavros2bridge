package px4_msgs.msg.dds;

import us.ihmc.communication.packets.Packet;
import us.ihmc.euclid.interfaces.Settable;
import us.ihmc.euclid.interfaces.EpsilonComparable;
import java.util.function.Supplier;
import us.ihmc.pubsub.TopicDataType;

public class DistanceSensorModeChangeRequest extends Packet<DistanceSensorModeChangeRequest> implements Settable<DistanceSensorModeChangeRequest>, EpsilonComparable<DistanceSensorModeChangeRequest>
{
   public static final byte REQUEST_OFF = (byte) 0;
   public static final byte REQUEST_ON = (byte) 1;
   /**
            * time since system start (microseconds)
            */
   public long timestamp_;
   /**
            * request to disable/enable the distance sensor
            */
   public byte request_on_off_;

   public DistanceSensorModeChangeRequest()
   {
   }

   public DistanceSensorModeChangeRequest(DistanceSensorModeChangeRequest other)
   {
      this();
      set(other);
   }

   public void set(DistanceSensorModeChangeRequest other)
   {
      timestamp_ = other.timestamp_;

      request_on_off_ = other.request_on_off_;

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
            * request to disable/enable the distance sensor
            */
   public void setRequestOnOff(byte request_on_off)
   {
      request_on_off_ = request_on_off;
   }
   /**
            * request to disable/enable the distance sensor
            */
   public byte getRequestOnOff()
   {
      return request_on_off_;
   }


   public static Supplier<DistanceSensorModeChangeRequestPubSubType> getPubSubType()
   {
      return DistanceSensorModeChangeRequestPubSubType::new;
   }

   @Override
   public Supplier<TopicDataType> getPubSubTypePacket()
   {
      return DistanceSensorModeChangeRequestPubSubType::new;
   }

   @Override
   public boolean epsilonEquals(DistanceSensorModeChangeRequest other, double epsilon)
   {
      if(other == null) return false;
      if(other == this) return true;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_, other.timestamp_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.request_on_off_, other.request_on_off_, epsilon)) return false;


      return true;
   }

   @Override
   public boolean equals(Object other)
   {
      if(other == null) return false;
      if(other == this) return true;
      if(!(other instanceof DistanceSensorModeChangeRequest)) return false;

      DistanceSensorModeChangeRequest otherMyClass = (DistanceSensorModeChangeRequest) other;

      if(this.timestamp_ != otherMyClass.timestamp_) return false;

      if(this.request_on_off_ != otherMyClass.request_on_off_) return false;


      return true;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("DistanceSensorModeChangeRequest {");
      builder.append("timestamp=");
      builder.append(this.timestamp_);      builder.append(", ");
      builder.append("request_on_off=");
      builder.append(this.request_on_off_);
      builder.append("}");
      return builder.toString();
   }
}
