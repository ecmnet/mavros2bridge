package px4_msgs.msg.dds;

import us.ihmc.communication.packets.Packet;
import us.ihmc.euclid.interfaces.Settable;
import us.ihmc.euclid.interfaces.EpsilonComparable;
import java.util.function.Supplier;
import us.ihmc.pubsub.TopicDataType;

/**
       * Request GPIO mask to be read
       */
public class GpioRequest extends Packet<GpioRequest> implements Settable<GpioRequest>, EpsilonComparable<GpioRequest>
{
   /**
            * time since system start (microseconds)
            */
   public long timestamp_;
   /**
            * Device id
            */
   public long device_id_;

   public GpioRequest()
   {
   }

   public GpioRequest(GpioRequest other)
   {
      this();
      set(other);
   }

   public void set(GpioRequest other)
   {
      timestamp_ = other.timestamp_;

      device_id_ = other.device_id_;

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
            * Device id
            */
   public void setDeviceId(long device_id)
   {
      device_id_ = device_id;
   }
   /**
            * Device id
            */
   public long getDeviceId()
   {
      return device_id_;
   }


   public static Supplier<GpioRequestPubSubType> getPubSubType()
   {
      return GpioRequestPubSubType::new;
   }

   @Override
   public Supplier<TopicDataType> getPubSubTypePacket()
   {
      return GpioRequestPubSubType::new;
   }

   @Override
   public boolean epsilonEquals(GpioRequest other, double epsilon)
   {
      if(other == null) return false;
      if(other == this) return true;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_, other.timestamp_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.device_id_, other.device_id_, epsilon)) return false;


      return true;
   }

   @Override
   public boolean equals(Object other)
   {
      if(other == null) return false;
      if(other == this) return true;
      if(!(other instanceof GpioRequest)) return false;

      GpioRequest otherMyClass = (GpioRequest) other;

      if(this.timestamp_ != otherMyClass.timestamp_) return false;

      if(this.device_id_ != otherMyClass.device_id_) return false;


      return true;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("GpioRequest {");
      builder.append("timestamp=");
      builder.append(this.timestamp_);      builder.append(", ");
      builder.append("device_id=");
      builder.append(this.device_id_);
      builder.append("}");
      return builder.toString();
   }
}
