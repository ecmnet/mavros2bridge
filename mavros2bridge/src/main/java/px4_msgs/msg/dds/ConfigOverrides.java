package px4_msgs.msg.dds;

import us.ihmc.communication.packets.Packet;
import us.ihmc.euclid.interfaces.Settable;
import us.ihmc.euclid.interfaces.EpsilonComparable;
import java.util.function.Supplier;
import us.ihmc.pubsub.TopicDataType;

public class ConfigOverrides extends Packet<ConfigOverrides> implements Settable<ConfigOverrides>, EpsilonComparable<ConfigOverrides>
{
   public static final byte SOURCE_TYPE_MODE = (byte) 0;
   public static final byte SOURCE_TYPE_MODE_EXECUTOR = (byte) 1;
   public static final byte ORB_QUEUE_LENGTH = (byte) 4;
   /**
            * Configurable overrides by (external) modes or mode executors
            * time since system start (microseconds)
            */
   public long timestamp_;
   /**
            * Prevent the drone from automatically disarming after landing (if configured)
            */
   public boolean disable_auto_disarm_;
   /**
            * Defer all failsafes that can be deferred (until the flag is cleared)
            */
   public boolean defer_failsafes_;
   /**
            * Maximum time a failsafe can be deferred. 0 = system default, -1 = no timeout
            */
   public short defer_failsafes_timeout_s_;
   public byte source_type_;
   /**
            * ID depending on source_type
            */
   public byte source_id_;

   public ConfigOverrides()
   {
   }

   public ConfigOverrides(ConfigOverrides other)
   {
      this();
      set(other);
   }

   public void set(ConfigOverrides other)
   {
      timestamp_ = other.timestamp_;

      disable_auto_disarm_ = other.disable_auto_disarm_;

      defer_failsafes_ = other.defer_failsafes_;

      defer_failsafes_timeout_s_ = other.defer_failsafes_timeout_s_;

      source_type_ = other.source_type_;

      source_id_ = other.source_id_;

   }

   /**
            * Configurable overrides by (external) modes or mode executors
            * time since system start (microseconds)
            */
   public void setTimestamp(long timestamp)
   {
      timestamp_ = timestamp;
   }
   /**
            * Configurable overrides by (external) modes or mode executors
            * time since system start (microseconds)
            */
   public long getTimestamp()
   {
      return timestamp_;
   }

   /**
            * Prevent the drone from automatically disarming after landing (if configured)
            */
   public void setDisableAutoDisarm(boolean disable_auto_disarm)
   {
      disable_auto_disarm_ = disable_auto_disarm;
   }
   /**
            * Prevent the drone from automatically disarming after landing (if configured)
            */
   public boolean getDisableAutoDisarm()
   {
      return disable_auto_disarm_;
   }

   /**
            * Defer all failsafes that can be deferred (until the flag is cleared)
            */
   public void setDeferFailsafes(boolean defer_failsafes)
   {
      defer_failsafes_ = defer_failsafes;
   }
   /**
            * Defer all failsafes that can be deferred (until the flag is cleared)
            */
   public boolean getDeferFailsafes()
   {
      return defer_failsafes_;
   }

   /**
            * Maximum time a failsafe can be deferred. 0 = system default, -1 = no timeout
            */
   public void setDeferFailsafesTimeoutS(short defer_failsafes_timeout_s)
   {
      defer_failsafes_timeout_s_ = defer_failsafes_timeout_s;
   }
   /**
            * Maximum time a failsafe can be deferred. 0 = system default, -1 = no timeout
            */
   public short getDeferFailsafesTimeoutS()
   {
      return defer_failsafes_timeout_s_;
   }

   public void setSourceType(byte source_type)
   {
      source_type_ = source_type;
   }
   public byte getSourceType()
   {
      return source_type_;
   }

   /**
            * ID depending on source_type
            */
   public void setSourceId(byte source_id)
   {
      source_id_ = source_id;
   }
   /**
            * ID depending on source_type
            */
   public byte getSourceId()
   {
      return source_id_;
   }


   public static Supplier<ConfigOverridesPubSubType> getPubSubType()
   {
      return ConfigOverridesPubSubType::new;
   }

   @Override
   public Supplier<TopicDataType> getPubSubTypePacket()
   {
      return ConfigOverridesPubSubType::new;
   }

   @Override
   public boolean epsilonEquals(ConfigOverrides other, double epsilon)
   {
      if(other == null) return false;
      if(other == this) return true;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_, other.timestamp_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.disable_auto_disarm_, other.disable_auto_disarm_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.defer_failsafes_, other.defer_failsafes_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.defer_failsafes_timeout_s_, other.defer_failsafes_timeout_s_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.source_type_, other.source_type_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.source_id_, other.source_id_, epsilon)) return false;


      return true;
   }

   @Override
   public boolean equals(Object other)
   {
      if(other == null) return false;
      if(other == this) return true;
      if(!(other instanceof ConfigOverrides)) return false;

      ConfigOverrides otherMyClass = (ConfigOverrides) other;

      if(this.timestamp_ != otherMyClass.timestamp_) return false;

      if(this.disable_auto_disarm_ != otherMyClass.disable_auto_disarm_) return false;

      if(this.defer_failsafes_ != otherMyClass.defer_failsafes_) return false;

      if(this.defer_failsafes_timeout_s_ != otherMyClass.defer_failsafes_timeout_s_) return false;

      if(this.source_type_ != otherMyClass.source_type_) return false;

      if(this.source_id_ != otherMyClass.source_id_) return false;


      return true;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("ConfigOverrides {");
      builder.append("timestamp=");
      builder.append(this.timestamp_);      builder.append(", ");
      builder.append("disable_auto_disarm=");
      builder.append(this.disable_auto_disarm_);      builder.append(", ");
      builder.append("defer_failsafes=");
      builder.append(this.defer_failsafes_);      builder.append(", ");
      builder.append("defer_failsafes_timeout_s=");
      builder.append(this.defer_failsafes_timeout_s_);      builder.append(", ");
      builder.append("source_type=");
      builder.append(this.source_type_);      builder.append(", ");
      builder.append("source_id=");
      builder.append(this.source_id_);
      builder.append("}");
      return builder.toString();
   }
}
