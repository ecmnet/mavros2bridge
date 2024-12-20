package px4_msgs.msg.dds;

import us.ihmc.communication.packets.Packet;
import us.ihmc.euclid.interfaces.Settable;
import us.ihmc.euclid.interfaces.EpsilonComparable;
import java.util.function.Supplier;
import us.ihmc.pubsub.TopicDataType;

public class ActuatorControlsStatus extends Packet<ActuatorControlsStatus> implements Settable<ActuatorControlsStatus>, EpsilonComparable<ActuatorControlsStatus>
{
   /**
            * time since system start (microseconds)
            */
   public long timestamp_;
   public float[] control_power_;

   public ActuatorControlsStatus()
   {
      control_power_ = new float[3];

   }

   public ActuatorControlsStatus(ActuatorControlsStatus other)
   {
      this();
      set(other);
   }

   public void set(ActuatorControlsStatus other)
   {
      timestamp_ = other.timestamp_;

      for(int i1 = 0; i1 < control_power_.length; ++i1)
      {
            control_power_[i1] = other.control_power_[i1];

      }

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


   public float[] getControlPower()
   {
      return control_power_;
   }


   public static Supplier<ActuatorControlsStatusPubSubType> getPubSubType()
   {
      return ActuatorControlsStatusPubSubType::new;
   }

   @Override
   public Supplier<TopicDataType> getPubSubTypePacket()
   {
      return ActuatorControlsStatusPubSubType::new;
   }

   @Override
   public boolean epsilonEquals(ActuatorControlsStatus other, double epsilon)
   {
      if(other == null) return false;
      if(other == this) return true;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_, other.timestamp_, epsilon)) return false;

      for(int i3 = 0; i3 < control_power_.length; ++i3)
      {
                if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.control_power_[i3], other.control_power_[i3], epsilon)) return false;
      }


      return true;
   }

   @Override
   public boolean equals(Object other)
   {
      if(other == null) return false;
      if(other == this) return true;
      if(!(other instanceof ActuatorControlsStatus)) return false;

      ActuatorControlsStatus otherMyClass = (ActuatorControlsStatus) other;

      if(this.timestamp_ != otherMyClass.timestamp_) return false;

      for(int i5 = 0; i5 < control_power_.length; ++i5)
      {
                if(this.control_power_[i5] != otherMyClass.control_power_[i5]) return false;

      }

      return true;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("ActuatorControlsStatus {");
      builder.append("timestamp=");
      builder.append(this.timestamp_);      builder.append(", ");
      builder.append("control_power=");
      builder.append(java.util.Arrays.toString(this.control_power_));
      builder.append("}");
      return builder.toString();
   }
}
