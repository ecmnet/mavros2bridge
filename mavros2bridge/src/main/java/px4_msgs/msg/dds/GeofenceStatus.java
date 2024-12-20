package px4_msgs.msg.dds;

import us.ihmc.communication.packets.Packet;
import us.ihmc.euclid.interfaces.Settable;
import us.ihmc.euclid.interfaces.EpsilonComparable;
import java.util.function.Supplier;
import us.ihmc.pubsub.TopicDataType;

public class GeofenceStatus extends Packet<GeofenceStatus> implements Settable<GeofenceStatus>, EpsilonComparable<GeofenceStatus>
{
   public static final byte GF_STATUS_LOADING = (byte) 0;
   public static final byte GF_STATUS_READY = (byte) 1;
   /**
            * time since system start (microseconds)
            */
   public long timestamp_;
   /**
            * loaded geofence id
            */
   public long geofence_id_;
   /**
            * Current geofence status
            */
   public byte status_;

   public GeofenceStatus()
   {
   }

   public GeofenceStatus(GeofenceStatus other)
   {
      this();
      set(other);
   }

   public void set(GeofenceStatus other)
   {
      timestamp_ = other.timestamp_;

      geofence_id_ = other.geofence_id_;

      status_ = other.status_;

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
            * loaded geofence id
            */
   public void setGeofenceId(long geofence_id)
   {
      geofence_id_ = geofence_id;
   }
   /**
            * loaded geofence id
            */
   public long getGeofenceId()
   {
      return geofence_id_;
   }

   /**
            * Current geofence status
            */
   public void setStatus(byte status)
   {
      status_ = status;
   }
   /**
            * Current geofence status
            */
   public byte getStatus()
   {
      return status_;
   }


   public static Supplier<GeofenceStatusPubSubType> getPubSubType()
   {
      return GeofenceStatusPubSubType::new;
   }

   @Override
   public Supplier<TopicDataType> getPubSubTypePacket()
   {
      return GeofenceStatusPubSubType::new;
   }

   @Override
   public boolean epsilonEquals(GeofenceStatus other, double epsilon)
   {
      if(other == null) return false;
      if(other == this) return true;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_, other.timestamp_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.geofence_id_, other.geofence_id_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.status_, other.status_, epsilon)) return false;


      return true;
   }

   @Override
   public boolean equals(Object other)
   {
      if(other == null) return false;
      if(other == this) return true;
      if(!(other instanceof GeofenceStatus)) return false;

      GeofenceStatus otherMyClass = (GeofenceStatus) other;

      if(this.timestamp_ != otherMyClass.timestamp_) return false;

      if(this.geofence_id_ != otherMyClass.geofence_id_) return false;

      if(this.status_ != otherMyClass.status_) return false;


      return true;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("GeofenceStatus {");
      builder.append("timestamp=");
      builder.append(this.timestamp_);      builder.append(", ");
      builder.append("geofence_id=");
      builder.append(this.geofence_id_);      builder.append(", ");
      builder.append("status=");
      builder.append(this.status_);
      builder.append("}");
      return builder.toString();
   }
}
