package px4_msgs.msg.dds;

import us.ihmc.communication.packets.Packet;
import us.ihmc.euclid.interfaces.Settable;
import us.ihmc.euclid.interfaces.EpsilonComparable;
import java.util.function.Supplier;
import us.ihmc.pubsub.TopicDataType;

public class NavigatorStatus extends Packet<NavigatorStatus> implements Settable<NavigatorStatus>, EpsilonComparable<NavigatorStatus>
{
   public static final byte FAILURE_NONE = (byte) 0;
   /**
          * Target altitude exceeds maximum height above ground
          */
   public static final byte FAILURE_HAGL = (byte) 1;
   /**
            * Current status of a Navigator mode
            * The possible values of nav_state are defined in the VehicleStatus msg.
            * time since system start (microseconds)
            */
   public long timestamp_;
   /**
            * Source mode (values in VehicleStatus)
            */
   public byte nav_state_;
   /**
            * Navigator failure enum
            */
   public byte failure_;

   public NavigatorStatus()
   {
   }

   public NavigatorStatus(NavigatorStatus other)
   {
      this();
      set(other);
   }

   public void set(NavigatorStatus other)
   {
      timestamp_ = other.timestamp_;

      nav_state_ = other.nav_state_;

      failure_ = other.failure_;

   }

   /**
            * Current status of a Navigator mode
            * The possible values of nav_state are defined in the VehicleStatus msg.
            * time since system start (microseconds)
            */
   public void setTimestamp(long timestamp)
   {
      timestamp_ = timestamp;
   }
   /**
            * Current status of a Navigator mode
            * The possible values of nav_state are defined in the VehicleStatus msg.
            * time since system start (microseconds)
            */
   public long getTimestamp()
   {
      return timestamp_;
   }

   /**
            * Source mode (values in VehicleStatus)
            */
   public void setNavState(byte nav_state)
   {
      nav_state_ = nav_state;
   }
   /**
            * Source mode (values in VehicleStatus)
            */
   public byte getNavState()
   {
      return nav_state_;
   }

   /**
            * Navigator failure enum
            */
   public void setFailure(byte failure)
   {
      failure_ = failure;
   }
   /**
            * Navigator failure enum
            */
   public byte getFailure()
   {
      return failure_;
   }


   public static Supplier<NavigatorStatusPubSubType> getPubSubType()
   {
      return NavigatorStatusPubSubType::new;
   }

   @Override
   public Supplier<TopicDataType> getPubSubTypePacket()
   {
      return NavigatorStatusPubSubType::new;
   }

   @Override
   public boolean epsilonEquals(NavigatorStatus other, double epsilon)
   {
      if(other == null) return false;
      if(other == this) return true;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_, other.timestamp_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.nav_state_, other.nav_state_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.failure_, other.failure_, epsilon)) return false;


      return true;
   }

   @Override
   public boolean equals(Object other)
   {
      if(other == null) return false;
      if(other == this) return true;
      if(!(other instanceof NavigatorStatus)) return false;

      NavigatorStatus otherMyClass = (NavigatorStatus) other;

      if(this.timestamp_ != otherMyClass.timestamp_) return false;

      if(this.nav_state_ != otherMyClass.nav_state_) return false;

      if(this.failure_ != otherMyClass.failure_) return false;


      return true;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("NavigatorStatus {");
      builder.append("timestamp=");
      builder.append(this.timestamp_);      builder.append(", ");
      builder.append("nav_state=");
      builder.append(this.nav_state_);      builder.append(", ");
      builder.append("failure=");
      builder.append(this.failure_);
      builder.append("}");
      return builder.toString();
   }
}
