package px4_msgs.msg.dds;

import us.ihmc.communication.packets.Packet;
import us.ihmc.euclid.interfaces.Settable;
import us.ihmc.euclid.interfaces.EpsilonComparable;
import java.util.function.Supplier;
import us.ihmc.pubsub.TopicDataType;

/**
       * This message is used to control the tunes, when the tune_id is set to CUSTOM
       * then the frequency, duration are used otherwise those values are ignored.
       */
public class TuneControl extends Packet<TuneControl> implements Settable<TuneControl>, EpsilonComparable<TuneControl>
{
   public static final byte TUNE_ID_STOP = (byte) 0;
   public static final byte TUNE_ID_STARTUP = (byte) 1;
   public static final byte TUNE_ID_ERROR = (byte) 2;
   public static final byte TUNE_ID_NOTIFY_POSITIVE = (byte) 3;
   public static final byte TUNE_ID_NOTIFY_NEUTRAL = (byte) 4;
   public static final byte TUNE_ID_NOTIFY_NEGATIVE = (byte) 5;
   public static final byte TUNE_ID_ARMING_WARNING = (byte) 6;
   public static final byte TUNE_ID_BATTERY_WARNING_SLOW = (byte) 7;
   public static final byte TUNE_ID_BATTERY_WARNING_FAST = (byte) 8;
   public static final byte TUNE_ID_GPS_WARNING = (byte) 9;
   public static final byte TUNE_ID_ARMING_FAILURE = (byte) 10;
   public static final byte TUNE_ID_PARACHUTE_RELEASE = (byte) 11;
   public static final byte TUNE_ID_SINGLE_BEEP = (byte) 12;
   public static final byte TUNE_ID_HOME_SET = (byte) 13;
   public static final byte TUNE_ID_SD_INIT = (byte) 14;
   public static final byte TUNE_ID_SD_ERROR = (byte) 15;
   public static final byte TUNE_ID_PROG_PX4IO = (byte) 16;
   public static final byte TUNE_ID_PROG_PX4IO_OK = (byte) 17;
   public static final byte TUNE_ID_PROG_PX4IO_ERR = (byte) 18;
   public static final byte TUNE_ID_POWER_OFF = (byte) 19;
   public static final byte NUMBER_OF_TUNES = (byte) 20;
   public static final byte VOLUME_LEVEL_MIN = (byte) 0;
   public static final byte VOLUME_LEVEL_DEFAULT = (byte) 20;
   public static final byte VOLUME_LEVEL_MAX = (byte) 100;
   public static final byte ORB_QUEUE_LENGTH = (byte) 4;
   /**
            * time since system start (microseconds)
            */
   public long timestamp_;
   /**
            * tune_id corresponding to TuneID::* from the tune_defaults.h in the tunes library
            */
   public byte tune_id_;
   /**
            * if true the tune which is playing will be stopped and the new started
            */
   public boolean tune_override_;
   /**
            * in Hz
            */
   public int frequency_;
   /**
            * in us
            */
   public long duration_;
   /**
            * in us
            */
   public long silence_;
   /**
            * value between 0-100 if supported by backend
            */
   public byte volume_;

   public TuneControl()
   {
   }

   public TuneControl(TuneControl other)
   {
      this();
      set(other);
   }

   public void set(TuneControl other)
   {
      timestamp_ = other.timestamp_;

      tune_id_ = other.tune_id_;

      tune_override_ = other.tune_override_;

      frequency_ = other.frequency_;

      duration_ = other.duration_;

      silence_ = other.silence_;

      volume_ = other.volume_;

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
            * tune_id corresponding to TuneID::* from the tune_defaults.h in the tunes library
            */
   public void setTuneId(byte tune_id)
   {
      tune_id_ = tune_id;
   }
   /**
            * tune_id corresponding to TuneID::* from the tune_defaults.h in the tunes library
            */
   public byte getTuneId()
   {
      return tune_id_;
   }

   /**
            * if true the tune which is playing will be stopped and the new started
            */
   public void setTuneOverride(boolean tune_override)
   {
      tune_override_ = tune_override;
   }
   /**
            * if true the tune which is playing will be stopped and the new started
            */
   public boolean getTuneOverride()
   {
      return tune_override_;
   }

   /**
            * in Hz
            */
   public void setFrequency(int frequency)
   {
      frequency_ = frequency;
   }
   /**
            * in Hz
            */
   public int getFrequency()
   {
      return frequency_;
   }

   /**
            * in us
            */
   public void setDuration(long duration)
   {
      duration_ = duration;
   }
   /**
            * in us
            */
   public long getDuration()
   {
      return duration_;
   }

   /**
            * in us
            */
   public void setSilence(long silence)
   {
      silence_ = silence;
   }
   /**
            * in us
            */
   public long getSilence()
   {
      return silence_;
   }

   /**
            * value between 0-100 if supported by backend
            */
   public void setVolume(byte volume)
   {
      volume_ = volume;
   }
   /**
            * value between 0-100 if supported by backend
            */
   public byte getVolume()
   {
      return volume_;
   }


   public static Supplier<TuneControlPubSubType> getPubSubType()
   {
      return TuneControlPubSubType::new;
   }

   @Override
   public Supplier<TopicDataType> getPubSubTypePacket()
   {
      return TuneControlPubSubType::new;
   }

   @Override
   public boolean epsilonEquals(TuneControl other, double epsilon)
   {
      if(other == null) return false;
      if(other == this) return true;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_, other.timestamp_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.tune_id_, other.tune_id_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.tune_override_, other.tune_override_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.frequency_, other.frequency_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.duration_, other.duration_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.silence_, other.silence_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.volume_, other.volume_, epsilon)) return false;


      return true;
   }

   @Override
   public boolean equals(Object other)
   {
      if(other == null) return false;
      if(other == this) return true;
      if(!(other instanceof TuneControl)) return false;

      TuneControl otherMyClass = (TuneControl) other;

      if(this.timestamp_ != otherMyClass.timestamp_) return false;

      if(this.tune_id_ != otherMyClass.tune_id_) return false;

      if(this.tune_override_ != otherMyClass.tune_override_) return false;

      if(this.frequency_ != otherMyClass.frequency_) return false;

      if(this.duration_ != otherMyClass.duration_) return false;

      if(this.silence_ != otherMyClass.silence_) return false;

      if(this.volume_ != otherMyClass.volume_) return false;


      return true;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("TuneControl {");
      builder.append("timestamp=");
      builder.append(this.timestamp_);      builder.append(", ");
      builder.append("tune_id=");
      builder.append(this.tune_id_);      builder.append(", ");
      builder.append("tune_override=");
      builder.append(this.tune_override_);      builder.append(", ");
      builder.append("frequency=");
      builder.append(this.frequency_);      builder.append(", ");
      builder.append("duration=");
      builder.append(this.duration_);      builder.append(", ");
      builder.append("silence=");
      builder.append(this.silence_);      builder.append(", ");
      builder.append("volume=");
      builder.append(this.volume_);
      builder.append("}");
      return builder.toString();
   }
}
