package px4_msgs.msg.dds;

import us.ihmc.communication.packets.Packet;
import us.ihmc.euclid.interfaces.Settable;
import us.ihmc.euclid.interfaces.EpsilonComparable;
import java.util.function.Supplier;
import us.ihmc.pubsub.TopicDataType;

/**
       * GPIO configuration
       */
public class GpioConfig extends Packet<GpioConfig> implements Settable<GpioConfig>, EpsilonComparable<GpioConfig>
{
   /**
          * Configuration Mask
          * Bit 0-3: Direction: 0=Input, 1=Output
          * Bit 4-7: Input Config: 0=Floating, 1=PullUp, 2=PullDown
          * Bit 8-12: Output Config: 0=PushPull, 1=OpenDrain
          * Bit 13-31: Reserved
          * 0x0000
          */
   public static final long INPUT = 0;
   /**
          * 0x0001
          */
   public static final long OUTPUT = 1;
   /**
          * 0x0010
          */
   public static final long PULLUP = 16;
   /**
          * 0x0020
          */
   public static final long PULLDOWN = 32;
   /**
          * 0x0100
          */
   public static final long OPENDRAIN = 256;
   /**
          * 0x0000
          */
   public static final long INPUT_FLOATING = 0;
   /**
          * 0x0010
          */
   public static final long INPUT_PULLUP = 16;
   /**
          * 0x0020
          */
   public static final long INPUT_PULLDOWN = 32;
   /**
          * 0x0000
          */
   public static final long OUTPUT_PUSHPULL = 0;
   /**
          * 0x0100
          */
   public static final long OUTPUT_OPENDRAIN = 256;
   /**
          * 0x0110
          */
   public static final long OUTPUT_OPENDRAIN_PULLUP = 272;
   /**
            * time since system start (microseconds)
            */
   public long timestamp_;
   /**
            * Device id
            */
   public long device_id_;
   /**
            * Pin mask
            */
   public long mask_;
   /**
            * Initial pin output state
            */
   public long state_;
   public long config_;

   public GpioConfig()
   {
   }

   public GpioConfig(GpioConfig other)
   {
      this();
      set(other);
   }

   public void set(GpioConfig other)
   {
      timestamp_ = other.timestamp_;

      device_id_ = other.device_id_;

      mask_ = other.mask_;

      state_ = other.state_;

      config_ = other.config_;

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
            * Pin mask
            */
   public void setMask(long mask)
   {
      mask_ = mask;
   }
   /**
            * Pin mask
            */
   public long getMask()
   {
      return mask_;
   }

   /**
            * Initial pin output state
            */
   public void setState(long state)
   {
      state_ = state;
   }
   /**
            * Initial pin output state
            */
   public long getState()
   {
      return state_;
   }

   public void setConfig(long config)
   {
      config_ = config;
   }
   public long getConfig()
   {
      return config_;
   }


   public static Supplier<GpioConfigPubSubType> getPubSubType()
   {
      return GpioConfigPubSubType::new;
   }

   @Override
   public Supplier<TopicDataType> getPubSubTypePacket()
   {
      return GpioConfigPubSubType::new;
   }

   @Override
   public boolean epsilonEquals(GpioConfig other, double epsilon)
   {
      if(other == null) return false;
      if(other == this) return true;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_, other.timestamp_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.device_id_, other.device_id_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.mask_, other.mask_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.state_, other.state_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.config_, other.config_, epsilon)) return false;


      return true;
   }

   @Override
   public boolean equals(Object other)
   {
      if(other == null) return false;
      if(other == this) return true;
      if(!(other instanceof GpioConfig)) return false;

      GpioConfig otherMyClass = (GpioConfig) other;

      if(this.timestamp_ != otherMyClass.timestamp_) return false;

      if(this.device_id_ != otherMyClass.device_id_) return false;

      if(this.mask_ != otherMyClass.mask_) return false;

      if(this.state_ != otherMyClass.state_) return false;

      if(this.config_ != otherMyClass.config_) return false;


      return true;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("GpioConfig {");
      builder.append("timestamp=");
      builder.append(this.timestamp_);      builder.append(", ");
      builder.append("device_id=");
      builder.append(this.device_id_);      builder.append(", ");
      builder.append("mask=");
      builder.append(this.mask_);      builder.append(", ");
      builder.append("state=");
      builder.append(this.state_);      builder.append(", ");
      builder.append("config=");
      builder.append(this.config_);
      builder.append("}");
      return builder.toString();
   }
}
