package px4_msgs.msg.dds;

import us.ihmc.communication.packets.Packet;
import us.ihmc.euclid.interfaces.Settable;
import us.ihmc.euclid.interfaces.EpsilonComparable;
import java.util.function.Supplier;
import us.ihmc.pubsub.TopicDataType;

public class ActionRequest extends Packet<ActionRequest> implements Settable<ActionRequest>, EpsilonComparable<ActionRequest>
{
   public static final byte ACTION_DISARM = (byte) 0;
   public static final byte ACTION_ARM = (byte) 1;
   public static final byte ACTION_TOGGLE_ARMING = (byte) 2;
   public static final byte ACTION_UNKILL = (byte) 3;
   public static final byte ACTION_KILL = (byte) 4;
   public static final byte ACTION_SWITCH_MODE = (byte) 5;
   public static final byte ACTION_VTOL_TRANSITION_TO_MULTICOPTER = (byte) 6;
   public static final byte ACTION_VTOL_TRANSITION_TO_FIXEDWING = (byte) 7;
   public static final byte SOURCE_STICK_GESTURE = (byte) 0;
   public static final byte SOURCE_RC_SWITCH = (byte) 1;
   public static final byte SOURCE_RC_BUTTON = (byte) 2;
   public static final byte SOURCE_RC_MODE_SLOT = (byte) 3;
   /**
            * time since system start (microseconds)
            */
   public long timestamp_;
   /**
            * what action is requested
            */
   public byte action_;
   /**
            * how the request was triggered
            */
   public byte source_;
   /**
            * for ACTION_SWITCH_MODE what mode is requested according to vehicle_status_s::NAVIGATION_STATE_*
            */
   public byte mode_;

   public ActionRequest()
   {
   }

   public ActionRequest(ActionRequest other)
   {
      this();
      set(other);
   }

   public void set(ActionRequest other)
   {
      timestamp_ = other.timestamp_;

      action_ = other.action_;

      source_ = other.source_;

      mode_ = other.mode_;

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
            * what action is requested
            */
   public void setAction(byte action)
   {
      action_ = action;
   }
   /**
            * what action is requested
            */
   public byte getAction()
   {
      return action_;
   }

   /**
            * how the request was triggered
            */
   public void setSource(byte source)
   {
      source_ = source;
   }
   /**
            * how the request was triggered
            */
   public int getSource()
   {
      return source_;
   }

   /**
            * for ACTION_SWITCH_MODE what mode is requested according to vehicle_status_s::NAVIGATION_STATE_*
            */
   public void setMode(byte mode)
   {
      mode_ = mode;
   }
   /**
            * for ACTION_SWITCH_MODE what mode is requested according to vehicle_status_s::NAVIGATION_STATE_*
            */
   public byte getMode()
   {
      return mode_;
   }


   public static Supplier<ActionRequestPubSubType> getPubSubType()
   {
      return ActionRequestPubSubType::new;
   }

   @Override
   public Supplier<TopicDataType> getPubSubTypePacket()
   {
      return ActionRequestPubSubType::new;
   }

   @Override
   public boolean epsilonEquals(ActionRequest other, double epsilon)
   {
      if(other == null) return false;
      if(other == this) return true;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_, other.timestamp_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.action_, other.action_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.source_, other.source_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.mode_, other.mode_, epsilon)) return false;


      return true;
   }

   @Override
   public boolean equals(Object other)
   {
      if(other == null) return false;
      if(other == this) return true;
      if(!(other instanceof ActionRequest)) return false;

      ActionRequest otherMyClass = (ActionRequest) other;

      if(this.timestamp_ != otherMyClass.timestamp_) return false;

      if(this.action_ != otherMyClass.action_) return false;

      if(this.source_ != otherMyClass.source_) return false;

      if(this.mode_ != otherMyClass.mode_) return false;


      return true;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("ActionRequest {");
      builder.append("timestamp=");
      builder.append(this.timestamp_);      builder.append(", ");
      builder.append("action=");
      builder.append(this.action_);      builder.append(", ");
      builder.append("source=");
      builder.append(this.source_);      builder.append(", ");
      builder.append("mode=");
      builder.append(this.mode_);
      builder.append("}");
      return builder.toString();
   }
}
