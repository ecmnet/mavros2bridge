package px4_msgs.msg.dds;

import us.ihmc.communication.packets.Packet;
import us.ihmc.euclid.interfaces.Settable;
import us.ihmc.euclid.interfaces.EpsilonComparable;
import java.util.function.Supplier;
import us.ihmc.pubsub.TopicDataType;

/**
       * GPIO mask and state
       */
public class GpioOut extends Packet<GpioOut> implements Settable<GpioOut>, EpsilonComparable<GpioOut>
{
   /**
            * time since system start (microseconds)
            */
   public long timestamp_;
   /**
            * Device id
            */
   public long device_id_;
   /**
            * pin mask
            */
   public long mask_;
   /**
            * pin state mask
            */
   public long state_;

   public GpioOut()
   {
   }

   public GpioOut(GpioOut other)
   {
      this();
      set(other);
   }

   public void set(GpioOut other)
   {
      timestamp_ = other.timestamp_;

      device_id_ = other.device_id_;

      mask_ = other.mask_;

      state_ = other.state_;

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

   /**
            * pin mask
            */
   public void setMask(long mask)
   {
      mask_ = mask;
   }
   /**
            * pin mask
            */
   public long getMask()
   {
      return mask_;
   }

   /**
            * pin state mask
            */
   public void setState(long state)
   {
      state_ = state;
   }
   /**
            * pin state mask
            */
   public long getState()
   {
      return state_;
   }


   public static Supplier<GpioOutPubSubType> getPubSubType()
   {
      return GpioOutPubSubType::new;
   }

   @Override
   public Supplier<TopicDataType> getPubSubTypePacket()
   {
      return GpioOutPubSubType::new;
   }

   @Override
   public boolean epsilonEquals(GpioOut other, double epsilon)
   {
      if(other == null) return false;
      if(other == this) return true;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_, other.timestamp_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.device_id_, other.device_id_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.mask_, other.mask_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.state_, other.state_, epsilon)) return false;


      return true;
   }

   @Override
   public boolean equals(Object other)
   {
      if(other == null) return false;
      if(other == this) return true;
      if(!(other instanceof GpioOut)) return false;

      GpioOut otherMyClass = (GpioOut) other;

      if(this.timestamp_ != otherMyClass.timestamp_) return false;

      if(this.device_id_ != otherMyClass.device_id_) return false;

      if(this.mask_ != otherMyClass.mask_) return false;

      if(this.state_ != otherMyClass.state_) return false;


      return true;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("GpioOut {");
      builder.append("timestamp=");
      builder.append(this.timestamp_);      builder.append(", ");
      builder.append("device_id=");
      builder.append(this.device_id_);      builder.append(", ");
      builder.append("mask=");
      builder.append(this.mask_);      builder.append(", ");
      builder.append("state=");
      builder.append(this.state_);
      builder.append("}");
      return builder.toString();
   }
}
