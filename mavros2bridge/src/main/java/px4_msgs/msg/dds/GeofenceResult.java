package px4_msgs.msg.dds;

import us.ihmc.communication.packets.Packet;
import us.ihmc.euclid.interfaces.Settable;
import us.ihmc.euclid.interfaces.EpsilonComparable;
import java.util.function.Supplier;
import us.ihmc.pubsub.TopicDataType;

public class GeofenceResult extends Packet<GeofenceResult> implements Settable<GeofenceResult>, EpsilonComparable<GeofenceResult>
{
   /**
          * no action on geofence violation
          */
   public static final byte GF_ACTION_NONE = (byte) 0;
   /**
          * critical mavlink message
          */
   public static final byte GF_ACTION_WARN = (byte) 1;
   /**
          * switch to AUTO|LOITER
          */
   public static final byte GF_ACTION_LOITER = (byte) 2;
   /**
          * switch to AUTO|RTL
          */
   public static final byte GF_ACTION_RTL = (byte) 3;
   /**
          * flight termination
          */
   public static final byte GF_ACTION_TERMINATE = (byte) 4;
   /**
          * switch to AUTO|LAND
          */
   public static final byte GF_ACTION_LAND = (byte) 5;
   /**
            * time since system start (microseconds)
            */
   public long timestamp_;
   /**
            * true the check for max distance from Home is triggered
            */
   public boolean geofence_max_dist_triggered_;
   /**
            * true the check for max altitude above Home is triggered
            */
   public boolean geofence_max_alt_triggered_;
   /**
            * true the check for custom inclusion/exclusion geofence(s) is triggered
            */
   public boolean geofence_custom_fence_triggered_;
   /**
            * action to take when the geofence is breached
            */
   public byte geofence_action_;

   public GeofenceResult()
   {
   }

   public GeofenceResult(GeofenceResult other)
   {
      this();
      set(other);
   }

   public void set(GeofenceResult other)
   {
      timestamp_ = other.timestamp_;

      geofence_max_dist_triggered_ = other.geofence_max_dist_triggered_;

      geofence_max_alt_triggered_ = other.geofence_max_alt_triggered_;

      geofence_custom_fence_triggered_ = other.geofence_custom_fence_triggered_;

      geofence_action_ = other.geofence_action_;

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
            * true the check for max distance from Home is triggered
            */
   public void setGeofenceMaxDistTriggered(boolean geofence_max_dist_triggered)
   {
      geofence_max_dist_triggered_ = geofence_max_dist_triggered;
   }
   /**
            * true the check for max distance from Home is triggered
            */
   public boolean getGeofenceMaxDistTriggered()
   {
      return geofence_max_dist_triggered_;
   }

   /**
            * true the check for max altitude above Home is triggered
            */
   public void setGeofenceMaxAltTriggered(boolean geofence_max_alt_triggered)
   {
      geofence_max_alt_triggered_ = geofence_max_alt_triggered;
   }
   /**
            * true the check for max altitude above Home is triggered
            */
   public boolean getGeofenceMaxAltTriggered()
   {
      return geofence_max_alt_triggered_;
   }

   /**
            * true the check for custom inclusion/exclusion geofence(s) is triggered
            */
   public void setGeofenceCustomFenceTriggered(boolean geofence_custom_fence_triggered)
   {
      geofence_custom_fence_triggered_ = geofence_custom_fence_triggered;
   }
   /**
            * true the check for custom inclusion/exclusion geofence(s) is triggered
            */
   public boolean getGeofenceCustomFenceTriggered()
   {
      return geofence_custom_fence_triggered_;
   }

   /**
            * action to take when the geofence is breached
            */
   public void setGeofenceAction(byte geofence_action)
   {
      geofence_action_ = geofence_action;
   }
   /**
            * action to take when the geofence is breached
            */
   public byte getGeofenceAction()
   {
      return geofence_action_;
   }


   public static Supplier<GeofenceResultPubSubType> getPubSubType()
   {
      return GeofenceResultPubSubType::new;
   }

   @Override
   public Supplier<TopicDataType> getPubSubTypePacket()
   {
      return GeofenceResultPubSubType::new;
   }

   @Override
   public boolean epsilonEquals(GeofenceResult other, double epsilon)
   {
      if(other == null) return false;
      if(other == this) return true;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_, other.timestamp_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.geofence_max_dist_triggered_, other.geofence_max_dist_triggered_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.geofence_max_alt_triggered_, other.geofence_max_alt_triggered_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.geofence_custom_fence_triggered_, other.geofence_custom_fence_triggered_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.geofence_action_, other.geofence_action_, epsilon)) return false;


      return true;
   }

   @Override
   public boolean equals(Object other)
   {
      if(other == null) return false;
      if(other == this) return true;
      if(!(other instanceof GeofenceResult)) return false;

      GeofenceResult otherMyClass = (GeofenceResult) other;

      if(this.timestamp_ != otherMyClass.timestamp_) return false;

      if(this.geofence_max_dist_triggered_ != otherMyClass.geofence_max_dist_triggered_) return false;

      if(this.geofence_max_alt_triggered_ != otherMyClass.geofence_max_alt_triggered_) return false;

      if(this.geofence_custom_fence_triggered_ != otherMyClass.geofence_custom_fence_triggered_) return false;

      if(this.geofence_action_ != otherMyClass.geofence_action_) return false;


      return true;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("GeofenceResult {");
      builder.append("timestamp=");
      builder.append(this.timestamp_);      builder.append(", ");
      builder.append("geofence_max_dist_triggered=");
      builder.append(this.geofence_max_dist_triggered_);      builder.append(", ");
      builder.append("geofence_max_alt_triggered=");
      builder.append(this.geofence_max_alt_triggered_);      builder.append(", ");
      builder.append("geofence_custom_fence_triggered=");
      builder.append(this.geofence_custom_fence_triggered_);      builder.append(", ");
      builder.append("geofence_action=");
      builder.append(this.geofence_action_);
      builder.append("}");
      return builder.toString();
   }
}
