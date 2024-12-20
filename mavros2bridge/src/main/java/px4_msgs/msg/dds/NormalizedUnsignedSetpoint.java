package px4_msgs.msg.dds;

import us.ihmc.communication.packets.Packet;
import us.ihmc.euclid.interfaces.Settable;
import us.ihmc.euclid.interfaces.EpsilonComparable;
import java.util.function.Supplier;
import us.ihmc.pubsub.TopicDataType;

public class NormalizedUnsignedSetpoint extends Packet<NormalizedUnsignedSetpoint> implements Settable<NormalizedUnsignedSetpoint>, EpsilonComparable<NormalizedUnsignedSetpoint>
{
   /**
            * time since system start (microseconds)
            */
   public long timestamp_;
   /**
            * [0, 1]
            */
   public float normalized_setpoint_;

   public NormalizedUnsignedSetpoint()
   {
   }

   public NormalizedUnsignedSetpoint(NormalizedUnsignedSetpoint other)
   {
      this();
      set(other);
   }

   public void set(NormalizedUnsignedSetpoint other)
   {
      timestamp_ = other.timestamp_;

      normalized_setpoint_ = other.normalized_setpoint_;

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
            * [0, 1]
            */
   public void setNormalizedSetpoint(float normalized_setpoint)
   {
      normalized_setpoint_ = normalized_setpoint;
   }
   /**
            * [0, 1]
            */
   public float getNormalizedSetpoint()
   {
      return normalized_setpoint_;
   }


   public static Supplier<NormalizedUnsignedSetpointPubSubType> getPubSubType()
   {
      return NormalizedUnsignedSetpointPubSubType::new;
   }

   @Override
   public Supplier<TopicDataType> getPubSubTypePacket()
   {
      return NormalizedUnsignedSetpointPubSubType::new;
   }

   @Override
   public boolean epsilonEquals(NormalizedUnsignedSetpoint other, double epsilon)
   {
      if(other == null) return false;
      if(other == this) return true;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_, other.timestamp_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.normalized_setpoint_, other.normalized_setpoint_, epsilon)) return false;


      return true;
   }

   @Override
   public boolean equals(Object other)
   {
      if(other == null) return false;
      if(other == this) return true;
      if(!(other instanceof NormalizedUnsignedSetpoint)) return false;

      NormalizedUnsignedSetpoint otherMyClass = (NormalizedUnsignedSetpoint) other;

      if(this.timestamp_ != otherMyClass.timestamp_) return false;

      if(this.normalized_setpoint_ != otherMyClass.normalized_setpoint_) return false;


      return true;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("NormalizedUnsignedSetpoint {");
      builder.append("timestamp=");
      builder.append(this.timestamp_);      builder.append(", ");
      builder.append("normalized_setpoint=");
      builder.append(this.normalized_setpoint_);
      builder.append("}");
      return builder.toString();
   }
}
