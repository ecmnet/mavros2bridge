package px4_msgs.msg.dds;

import us.ihmc.communication.packets.Packet;
import us.ihmc.euclid.interfaces.Settable;
import us.ihmc.euclid.interfaces.EpsilonComparable;
import java.util.function.Supplier;
import us.ihmc.pubsub.TopicDataType;

public class LandingGear extends Packet<LandingGear> implements Settable<LandingGear>, EpsilonComparable<LandingGear>
{
   /**
          * landing gear up
          */
   public static final byte GEAR_UP = (byte) 1;
   /**
          * landing gear down
          */
   public static final byte GEAR_DOWN = (byte) 255;
   /**
          * keep the current state
          */
   public static final byte GEAR_KEEP = (byte) 0;
   /**
            * time since system start (microseconds)
            */
   public long timestamp_;
   public byte landing_gear_;

   public LandingGear()
   {
   }

   public LandingGear(LandingGear other)
   {
      this();
      set(other);
   }

   public void set(LandingGear other)
   {
      timestamp_ = other.timestamp_;

      landing_gear_ = other.landing_gear_;

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

   public void setLandingGear(byte landing_gear)
   {
      landing_gear_ = landing_gear;
   }
   public byte getLandingGear()
   {
      return landing_gear_;
   }


   public static Supplier<LandingGearPubSubType> getPubSubType()
   {
      return LandingGearPubSubType::new;
   }

   @Override
   public Supplier<TopicDataType> getPubSubTypePacket()
   {
      return LandingGearPubSubType::new;
   }

   @Override
   public boolean epsilonEquals(LandingGear other, double epsilon)
   {
      if(other == null) return false;
      if(other == this) return true;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_, other.timestamp_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.landing_gear_, other.landing_gear_, epsilon)) return false;


      return true;
   }

   @Override
   public boolean equals(Object other)
   {
      if(other == null) return false;
      if(other == this) return true;
      if(!(other instanceof LandingGear)) return false;

      LandingGear otherMyClass = (LandingGear) other;

      if(this.timestamp_ != otherMyClass.timestamp_) return false;

      if(this.landing_gear_ != otherMyClass.landing_gear_) return false;


      return true;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("LandingGear {");
      builder.append("timestamp=");
      builder.append(this.timestamp_);      builder.append(", ");
      builder.append("landing_gear=");
      builder.append(this.landing_gear_);
      builder.append("}");
      return builder.toString();
   }
}
