package px4_msgs.msg.dds;

import us.ihmc.communication.packets.Packet;
import us.ihmc.euclid.interfaces.Settable;
import us.ihmc.euclid.interfaces.EpsilonComparable;
import java.util.function.Supplier;
import us.ihmc.pubsub.TopicDataType;

/**
       * LED control: control a single or multiple LED's.
       * These are the externally visible LED's, not the board LED's
       */
public class LedControl extends Packet<LedControl> implements Settable<LedControl>, EpsilonComparable<LedControl>
{
   /**
          * colors
          * this is only used in the drivers
          */
   public static final byte COLOR_OFF = (byte) 0;
   public static final byte COLOR_RED = (byte) 1;
   public static final byte COLOR_GREEN = (byte) 2;
   public static final byte COLOR_BLUE = (byte) 3;
   public static final byte COLOR_YELLOW = (byte) 4;
   public static final byte COLOR_PURPLE = (byte) 5;
   public static final byte COLOR_AMBER = (byte) 6;
   public static final byte COLOR_CYAN = (byte) 7;
   public static final byte COLOR_WHITE = (byte) 8;
   /**
          * LED modes definitions
          * turn LED off
          */
   public static final byte MODE_OFF = (byte) 0;
   /**
          * turn LED on
          */
   public static final byte MODE_ON = (byte) 1;
   /**
          * disable this priority (switch to lower priority setting)
          */
   public static final byte MODE_DISABLED = (byte) 2;
   public static final byte MODE_BLINK_SLOW = (byte) 3;
   public static final byte MODE_BLINK_NORMAL = (byte) 4;
   public static final byte MODE_BLINK_FAST = (byte) 5;
   /**
          * continuously increase & decrease brightness (solid color if driver does not support it)
          */
   public static final byte MODE_BREATHE = (byte) 6;
   /**
          * two fast blinks (on/off) with timing as in MODE_BLINK_FAST and then off for a while
          */
   public static final byte MODE_FLASH = (byte) 7;
   /**
          * maximum priority (minimum is 0)
          */
   public static final byte MAX_PRIORITY = (byte) 2;
   /**
          * needs to match BOARD_MAX_LEDS
          */
   public static final byte ORB_QUEUE_LENGTH = (byte) 8;
   /**
            * time since system start (microseconds)
            */
   public long timestamp_;
   /**
            * bitmask which LED(s) to control, set to 0xff for all
            */
   public byte led_mask_;
   /**
            * see COLOR_*
            */
   public byte color_;
   /**
            * see MODE_*
            */
   public byte mode_;
   /**
            * how many times to blink (number of on-off cycles if mode is one of MODE_BLINK_*) . Set to 0 for infinite
            */
   public byte num_blinks_;
   /**
            * in MODE_FLASH it is the number of cycles. Max number of blinks: 122 and max number of flash cycles: 20
            * priority: higher priority events will override current lower priority events (see MAX_PRIORITY)
            */
   public byte priority_;

   public LedControl()
   {
   }

   public LedControl(LedControl other)
   {
      this();
      set(other);
   }

   public void set(LedControl other)
   {
      timestamp_ = other.timestamp_;

      led_mask_ = other.led_mask_;

      color_ = other.color_;

      mode_ = other.mode_;

      num_blinks_ = other.num_blinks_;

      priority_ = other.priority_;

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
            * bitmask which LED(s) to control, set to 0xff for all
            */
   public void setLedMask(byte led_mask)
   {
      led_mask_ = led_mask;
   }
   /**
            * bitmask which LED(s) to control, set to 0xff for all
            */
   public byte getLedMask()
   {
      return led_mask_;
   }

   /**
            * see COLOR_*
            */
   public void setColor(byte color)
   {
      color_ = color;
   }
   /**
            * see COLOR_*
            */
   public byte getColor()
   {
      return color_;
   }

   /**
            * see MODE_*
            */
   public void setMode(byte mode)
   {
      mode_ = mode;
   }
   /**
            * see MODE_*
            */
   public byte getMode()
   {
      return mode_;
   }

   /**
            * how many times to blink (number of on-off cycles if mode is one of MODE_BLINK_*) . Set to 0 for infinite
            */
   public void setNumBlinks(byte num_blinks)
   {
      num_blinks_ = num_blinks;
   }
   /**
            * how many times to blink (number of on-off cycles if mode is one of MODE_BLINK_*) . Set to 0 for infinite
            */
   public byte getNumBlinks()
   {
      return num_blinks_;
   }

   /**
            * in MODE_FLASH it is the number of cycles. Max number of blinks: 122 and max number of flash cycles: 20
            * priority: higher priority events will override current lower priority events (see MAX_PRIORITY)
            */
   public void setPriority(byte priority)
   {
      priority_ = priority;
   }
   /**
            * in MODE_FLASH it is the number of cycles. Max number of blinks: 122 and max number of flash cycles: 20
            * priority: higher priority events will override current lower priority events (see MAX_PRIORITY)
            */
   public byte getPriority()
   {
      return priority_;
   }


   public static Supplier<LedControlPubSubType> getPubSubType()
   {
      return LedControlPubSubType::new;
   }

   @Override
   public Supplier<TopicDataType> getPubSubTypePacket()
   {
      return LedControlPubSubType::new;
   }

   @Override
   public boolean epsilonEquals(LedControl other, double epsilon)
   {
      if(other == null) return false;
      if(other == this) return true;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_, other.timestamp_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.led_mask_, other.led_mask_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.color_, other.color_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.mode_, other.mode_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.num_blinks_, other.num_blinks_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.priority_, other.priority_, epsilon)) return false;


      return true;
   }

   @Override
   public boolean equals(Object other)
   {
      if(other == null) return false;
      if(other == this) return true;
      if(!(other instanceof LedControl)) return false;

      LedControl otherMyClass = (LedControl) other;

      if(this.timestamp_ != otherMyClass.timestamp_) return false;

      if(this.led_mask_ != otherMyClass.led_mask_) return false;

      if(this.color_ != otherMyClass.color_) return false;

      if(this.mode_ != otherMyClass.mode_) return false;

      if(this.num_blinks_ != otherMyClass.num_blinks_) return false;

      if(this.priority_ != otherMyClass.priority_) return false;


      return true;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("LedControl {");
      builder.append("timestamp=");
      builder.append(this.timestamp_);      builder.append(", ");
      builder.append("led_mask=");
      builder.append(this.led_mask_);      builder.append(", ");
      builder.append("color=");
      builder.append(this.color_);      builder.append(", ");
      builder.append("mode=");
      builder.append(this.mode_);      builder.append(", ");
      builder.append("num_blinks=");
      builder.append(this.num_blinks_);      builder.append(", ");
      builder.append("priority=");
      builder.append(this.priority_);
      builder.append("}");
      return builder.toString();
   }
}
