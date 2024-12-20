package px4_msgs.msg.dds;

import us.ihmc.communication.packets.Packet;
import us.ihmc.euclid.interfaces.Settable;
import us.ihmc.euclid.interfaces.EpsilonComparable;
import java.util.function.Supplier;
import us.ihmc.pubsub.TopicDataType;

public class ActuatorServosTrim extends Packet<ActuatorServosTrim> implements Settable<ActuatorServosTrim>, EpsilonComparable<ActuatorServosTrim>
{
   public static final byte NUM_CONTROLS = (byte) 8;/**
            * Servo trims, added as offset to servo outputs
            * time since system start (microseconds)
            */
   public long timestamp_;
   /**
            * range: [-1, 1]
            */
   public float[] trim_;

   public ActuatorServosTrim()
   {
      trim_ = new float[8];

   }

   public ActuatorServosTrim(ActuatorServosTrim other)
   {
      this();
      set(other);
   }

   public void set(ActuatorServosTrim other)
   {
      timestamp_ = other.timestamp_;

      for(int i1 = 0; i1 < trim_.length; ++i1)
      {
            trim_[i1] = other.trim_[i1];

      }

   }

   /**
            * Servo trims, added as offset to servo outputs
            * time since system start (microseconds)
            */
   public void setTimestamp(long timestamp)
   {
      timestamp_ = timestamp;
   }
   /**
            * Servo trims, added as offset to servo outputs
            * time since system start (microseconds)
            */
   public long getTimestamp()
   {
      return timestamp_;
   }


   /**
            * range: [-1, 1]
            */
   public float[] getTrim()
   {
      return trim_;
   }


   public static Supplier<ActuatorServosTrimPubSubType> getPubSubType()
   {
      return ActuatorServosTrimPubSubType::new;
   }

   @Override
   public Supplier<TopicDataType> getPubSubTypePacket()
   {
      return ActuatorServosTrimPubSubType::new;
   }

   @Override
   public boolean epsilonEquals(ActuatorServosTrim other, double epsilon)
   {
      if(other == null) return false;
      if(other == this) return true;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_, other.timestamp_, epsilon)) return false;

      for(int i3 = 0; i3 < trim_.length; ++i3)
      {
                if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.trim_[i3], other.trim_[i3], epsilon)) return false;
      }


      return true;
   }

   @Override
   public boolean equals(Object other)
   {
      if(other == null) return false;
      if(other == this) return true;
      if(!(other instanceof ActuatorServosTrim)) return false;

      ActuatorServosTrim otherMyClass = (ActuatorServosTrim) other;

      if(this.timestamp_ != otherMyClass.timestamp_) return false;

      for(int i5 = 0; i5 < trim_.length; ++i5)
      {
                if(this.trim_[i5] != otherMyClass.trim_[i5]) return false;

      }

      return true;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("ActuatorServosTrim {");
      builder.append("timestamp=");
      builder.append(this.timestamp_);      builder.append(", ");
      builder.append("trim=");
      builder.append(java.util.Arrays.toString(this.trim_));
      builder.append("}");
      return builder.toString();
   }
}
