package px4_msgs.msg.dds;

import us.ihmc.communication.packets.Packet;
import us.ihmc.euclid.interfaces.Settable;
import us.ihmc.euclid.interfaces.EpsilonComparable;
import java.util.function.Supplier;
import us.ihmc.pubsub.TopicDataType;

public class UnregisterExtComponent extends Packet<UnregisterExtComponent> implements Settable<UnregisterExtComponent>, EpsilonComparable<UnregisterExtComponent>
{
   /**
            * time since system start (microseconds)
            */
   public long timestamp_;
   /**
            * either the mode name, or component name
            */
   public char[] name_;
   /**
            * arming check registration ID (-1 if not registered)
            */
   public byte arming_check_id_;
   /**
            * assigned mode ID (-1 if not registered)
            */
   public byte mode_id_;
   /**
            * assigned mode executor ID (-1 if not registered)
            */
   public byte mode_executor_id_;

   public UnregisterExtComponent()
   {
      name_ = new char[25];

   }

   public UnregisterExtComponent(UnregisterExtComponent other)
   {
      this();
      set(other);
   }

   public void set(UnregisterExtComponent other)
   {
      timestamp_ = other.timestamp_;

      for(int i1 = 0; i1 < name_.length; ++i1)
      {
            name_[i1] = other.name_[i1];

      }

      arming_check_id_ = other.arming_check_id_;

      mode_id_ = other.mode_id_;

      mode_executor_id_ = other.mode_executor_id_;

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
            * either the mode name, or component name
            */
   public char[] getName()
   {
      return name_;
   }

   /**
            * arming check registration ID (-1 if not registered)
            */
   public void setArmingCheckId(byte arming_check_id)
   {
      arming_check_id_ = arming_check_id;
   }
   /**
            * arming check registration ID (-1 if not registered)
            */
   public byte getArmingCheckId()
   {
      return arming_check_id_;
   }

   /**
            * assigned mode ID (-1 if not registered)
            */
   public void setModeId(byte mode_id)
   {
      mode_id_ = mode_id;
   }
   /**
            * assigned mode ID (-1 if not registered)
            */
   public byte getModeId()
   {
      return mode_id_;
   }

   /**
            * assigned mode executor ID (-1 if not registered)
            */
   public void setModeExecutorId(byte mode_executor_id)
   {
      mode_executor_id_ = mode_executor_id;
   }
   /**
            * assigned mode executor ID (-1 if not registered)
            */
   public byte getModeExecutorId()
   {
      return mode_executor_id_;
   }


   public static Supplier<UnregisterExtComponentPubSubType> getPubSubType()
   {
      return UnregisterExtComponentPubSubType::new;
   }

   @Override
   public Supplier<TopicDataType> getPubSubTypePacket()
   {
      return UnregisterExtComponentPubSubType::new;
   }

   @Override
   public boolean epsilonEquals(UnregisterExtComponent other, double epsilon)
   {
      if(other == null) return false;
      if(other == this) return true;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_, other.timestamp_, epsilon)) return false;

      for(int i3 = 0; i3 < name_.length; ++i3)
      {
                if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.name_[i3], other.name_[i3], epsilon)) return false;
      }

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.arming_check_id_, other.arming_check_id_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.mode_id_, other.mode_id_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.mode_executor_id_, other.mode_executor_id_, epsilon)) return false;


      return true;
   }

   @Override
   public boolean equals(Object other)
   {
      if(other == null) return false;
      if(other == this) return true;
      if(!(other instanceof UnregisterExtComponent)) return false;

      UnregisterExtComponent otherMyClass = (UnregisterExtComponent) other;

      if(this.timestamp_ != otherMyClass.timestamp_) return false;

      for(int i5 = 0; i5 < name_.length; ++i5)
      {
                if(this.name_[i5] != otherMyClass.name_[i5]) return false;

      }
      if(this.arming_check_id_ != otherMyClass.arming_check_id_) return false;

      if(this.mode_id_ != otherMyClass.mode_id_) return false;

      if(this.mode_executor_id_ != otherMyClass.mode_executor_id_) return false;


      return true;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("UnregisterExtComponent {");
      builder.append("timestamp=");
      builder.append(this.timestamp_);      builder.append(", ");
      builder.append("name=");
      builder.append(java.util.Arrays.toString(this.name_));      builder.append(", ");
      builder.append("arming_check_id=");
      builder.append(this.arming_check_id_);      builder.append(", ");
      builder.append("mode_id=");
      builder.append(this.mode_id_);      builder.append(", ");
      builder.append("mode_executor_id=");
      builder.append(this.mode_executor_id_);
      builder.append("}");
      return builder.toString();
   }
}
