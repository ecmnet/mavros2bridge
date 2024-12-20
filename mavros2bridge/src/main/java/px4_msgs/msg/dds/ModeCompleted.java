package px4_msgs.msg.dds;

import us.ihmc.communication.packets.Packet;
import us.ihmc.euclid.interfaces.Settable;
import us.ihmc.euclid.interfaces.EpsilonComparable;
import java.util.function.Supplier;
import us.ihmc.pubsub.TopicDataType;

public class ModeCompleted extends Packet<ModeCompleted> implements Settable<ModeCompleted>, EpsilonComparable<ModeCompleted>
{
   public static final byte RESULT_SUCCESS = (byte) 0;
   /**
          * [1-99]: reserved
          * Mode failed (generic error)
          */
   public static final byte RESULT_FAILURE_OTHER = (byte) 100;
   /**
            * Mode completion result, published by an active mode.
            * The possible values of nav_state are defined in the VehicleStatus msg.
            * Note that this is not always published (e.g. when a user switches modes or on
            * failsafe activation)
            * time since system start (microseconds)
            */
   public long timestamp_;
   /**
            * One of RESULT_*
            */
   public byte result_;
   /**
            * Source mode (values in VehicleStatus)
            */
   public byte nav_state_;

   public ModeCompleted()
   {
   }

   public ModeCompleted(ModeCompleted other)
   {
      this();
      set(other);
   }

   public void set(ModeCompleted other)
   {
      timestamp_ = other.timestamp_;

      result_ = other.result_;

      nav_state_ = other.nav_state_;

   }

   /**
            * Mode completion result, published by an active mode.
            * The possible values of nav_state are defined in the VehicleStatus msg.
            * Note that this is not always published (e.g. when a user switches modes or on
            * failsafe activation)
            * time since system start (microseconds)
            */
   public void setTimestamp(long timestamp)
   {
      timestamp_ = timestamp;
   }
   /**
            * Mode completion result, published by an active mode.
            * The possible values of nav_state are defined in the VehicleStatus msg.
            * Note that this is not always published (e.g. when a user switches modes or on
            * failsafe activation)
            * time since system start (microseconds)
            */
   public long getTimestamp()
   {
      return timestamp_;
   }

   /**
            * One of RESULT_*
            */
   public void setResult(byte result)
   {
      result_ = result;
   }
   /**
            * One of RESULT_*
            */
   public byte getResult()
   {
      return result_;
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


   public static Supplier<ModeCompletedPubSubType> getPubSubType()
   {
      return ModeCompletedPubSubType::new;
   }

   @Override
   public Supplier<TopicDataType> getPubSubTypePacket()
   {
      return ModeCompletedPubSubType::new;
   }

   @Override
   public boolean epsilonEquals(ModeCompleted other, double epsilon)
   {
      if(other == null) return false;
      if(other == this) return true;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_, other.timestamp_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.result_, other.result_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.nav_state_, other.nav_state_, epsilon)) return false;


      return true;
   }

   @Override
   public boolean equals(Object other)
   {
      if(other == null) return false;
      if(other == this) return true;
      if(!(other instanceof ModeCompleted)) return false;

      ModeCompleted otherMyClass = (ModeCompleted) other;

      if(this.timestamp_ != otherMyClass.timestamp_) return false;

      if(this.result_ != otherMyClass.result_) return false;

      if(this.nav_state_ != otherMyClass.nav_state_) return false;


      return true;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("ModeCompleted {");
      builder.append("timestamp=");
      builder.append(this.timestamp_);      builder.append(", ");
      builder.append("result=");
      builder.append(this.result_);      builder.append(", ");
      builder.append("nav_state=");
      builder.append(this.nav_state_);
      builder.append("}");
      return builder.toString();
   }
}
