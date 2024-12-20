package px4_msgs.msg.dds;

import us.ihmc.communication.packets.Packet;
import us.ihmc.euclid.interfaces.Settable;
import us.ihmc.euclid.interfaces.EpsilonComparable;
import java.util.function.Supplier;
import us.ihmc.pubsub.TopicDataType;

/**
       * This message is used to notify the system about one or more parameter changes
       */
public class ParameterUpdate extends Packet<ParameterUpdate> implements Settable<ParameterUpdate>, EpsilonComparable<ParameterUpdate>
{
   /**
            * time since system start (microseconds)
            */
   public long timestamp_;
   /**
            * Instance count - constantly incrementing
            */
   public long instance_;
   public long get_count_;
   public long set_count_;
   public long find_count_;
   public long export_count_;
   public int active_;
   public int changed_;
   public int custom_default_;

   public ParameterUpdate()
   {
   }

   public ParameterUpdate(ParameterUpdate other)
   {
      this();
      set(other);
   }

   public void set(ParameterUpdate other)
   {
      timestamp_ = other.timestamp_;

      instance_ = other.instance_;

      get_count_ = other.get_count_;

      set_count_ = other.set_count_;

      find_count_ = other.find_count_;

      export_count_ = other.export_count_;

      active_ = other.active_;

      changed_ = other.changed_;

      custom_default_ = other.custom_default_;

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
            * Instance count - constantly incrementing
            */
   public void setInstance(long instance)
   {
      instance_ = instance;
   }
   /**
            * Instance count - constantly incrementing
            */
   public long getInstance()
   {
      return instance_;
   }

   public void setGetCount(long get_count)
   {
      get_count_ = get_count;
   }
   public long getGetCount()
   {
      return get_count_;
   }

   public void setSetCount(long set_count)
   {
      set_count_ = set_count;
   }
   public long getSetCount()
   {
      return set_count_;
   }

   public void setFindCount(long find_count)
   {
      find_count_ = find_count;
   }
   public long getFindCount()
   {
      return find_count_;
   }

   public void setExportCount(long export_count)
   {
      export_count_ = export_count;
   }
   public long getExportCount()
   {
      return export_count_;
   }

   public void setActive(int active)
   {
      active_ = active;
   }
   public int getActive()
   {
      return active_;
   }

   public void setChanged(int changed)
   {
      changed_ = changed;
   }
   public int getChanged()
   {
      return changed_;
   }

   public void setCustomDefault(int custom_default)
   {
      custom_default_ = custom_default;
   }
   public int getCustomDefault()
   {
      return custom_default_;
   }


   public static Supplier<ParameterUpdatePubSubType> getPubSubType()
   {
      return ParameterUpdatePubSubType::new;
   }

   @Override
   public Supplier<TopicDataType> getPubSubTypePacket()
   {
      return ParameterUpdatePubSubType::new;
   }

   @Override
   public boolean epsilonEquals(ParameterUpdate other, double epsilon)
   {
      if(other == null) return false;
      if(other == this) return true;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_, other.timestamp_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.instance_, other.instance_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.get_count_, other.get_count_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.set_count_, other.set_count_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.find_count_, other.find_count_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.export_count_, other.export_count_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.active_, other.active_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.changed_, other.changed_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.custom_default_, other.custom_default_, epsilon)) return false;


      return true;
   }

   @Override
   public boolean equals(Object other)
   {
      if(other == null) return false;
      if(other == this) return true;
      if(!(other instanceof ParameterUpdate)) return false;

      ParameterUpdate otherMyClass = (ParameterUpdate) other;

      if(this.timestamp_ != otherMyClass.timestamp_) return false;

      if(this.instance_ != otherMyClass.instance_) return false;

      if(this.get_count_ != otherMyClass.get_count_) return false;

      if(this.set_count_ != otherMyClass.set_count_) return false;

      if(this.find_count_ != otherMyClass.find_count_) return false;

      if(this.export_count_ != otherMyClass.export_count_) return false;

      if(this.active_ != otherMyClass.active_) return false;

      if(this.changed_ != otherMyClass.changed_) return false;

      if(this.custom_default_ != otherMyClass.custom_default_) return false;


      return true;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("ParameterUpdate {");
      builder.append("timestamp=");
      builder.append(this.timestamp_);      builder.append(", ");
      builder.append("instance=");
      builder.append(this.instance_);      builder.append(", ");
      builder.append("get_count=");
      builder.append(this.get_count_);      builder.append(", ");
      builder.append("set_count=");
      builder.append(this.set_count_);      builder.append(", ");
      builder.append("find_count=");
      builder.append(this.find_count_);      builder.append(", ");
      builder.append("export_count=");
      builder.append(this.export_count_);      builder.append(", ");
      builder.append("active=");
      builder.append(this.active_);      builder.append(", ");
      builder.append("changed=");
      builder.append(this.changed_);      builder.append(", ");
      builder.append("custom_default=");
      builder.append(this.custom_default_);
      builder.append("}");
      return builder.toString();
   }
}
