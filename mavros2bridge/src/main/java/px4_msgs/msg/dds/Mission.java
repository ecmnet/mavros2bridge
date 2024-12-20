package px4_msgs.msg.dds;

import us.ihmc.communication.packets.Packet;
import us.ihmc.euclid.interfaces.Settable;
import us.ihmc.euclid.interfaces.EpsilonComparable;
import java.util.function.Supplier;
import us.ihmc.pubsub.TopicDataType;

public class Mission extends Packet<Mission> implements Settable<Mission>, EpsilonComparable<Mission>
{
   /**
            * time since system start (microseconds)
            */
   public long timestamp_;
   /**
            * default 0, there are two offboard storage places in the dataman: 0 or 1
            */
   public byte mission_dataman_id_;
   /**
            * default 0, there are two offboard storage places in the dataman: 0 or 1
            */
   public byte fence_dataman_id_;
   /**
            * default 0, there are two offboard storage places in the dataman: 0 or 1
            */
   public byte safepoint_dataman_id_;
   /**
            * count of the missions stored in the dataman
            */
   public int count_;
   /**
            * default -1, start at the one changed latest
            */
   public int current_seq_;
   /**
            * Index of the land start marker, if unavailable index of the land item, -1 otherwise
            */
   public int land_start_index_;
   /**
            * Index of the land item, -1 otherwise
            */
   public int land_index_;
   /**
            * indicates updates to the mission, reload from dataman if changed
            */
   public long mission_id_;
   /**
            * indicates updates to the geofence, reload from dataman if changed
            */
   public long geofence_id_;
   /**
            * indicates updates to the safe points, reload from dataman if changed
            */
   public long safe_points_id_;

   public Mission()
   {
   }

   public Mission(Mission other)
   {
      this();
      set(other);
   }

   public void set(Mission other)
   {
      timestamp_ = other.timestamp_;

      mission_dataman_id_ = other.mission_dataman_id_;

      fence_dataman_id_ = other.fence_dataman_id_;

      safepoint_dataman_id_ = other.safepoint_dataman_id_;

      count_ = other.count_;

      current_seq_ = other.current_seq_;

      land_start_index_ = other.land_start_index_;

      land_index_ = other.land_index_;

      mission_id_ = other.mission_id_;

      geofence_id_ = other.geofence_id_;

      safe_points_id_ = other.safe_points_id_;

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
            * default 0, there are two offboard storage places in the dataman: 0 or 1
            */
   public void setMissionDatamanId(byte mission_dataman_id)
   {
      mission_dataman_id_ = mission_dataman_id;
   }
   /**
            * default 0, there are two offboard storage places in the dataman: 0 or 1
            */
   public byte getMissionDatamanId()
   {
      return mission_dataman_id_;
   }

   /**
            * default 0, there are two offboard storage places in the dataman: 0 or 1
            */
   public void setFenceDatamanId(byte fence_dataman_id)
   {
      fence_dataman_id_ = fence_dataman_id;
   }
   /**
            * default 0, there are two offboard storage places in the dataman: 0 or 1
            */
   public byte getFenceDatamanId()
   {
      return fence_dataman_id_;
   }

   /**
            * default 0, there are two offboard storage places in the dataman: 0 or 1
            */
   public void setSafepointDatamanId(byte safepoint_dataman_id)
   {
      safepoint_dataman_id_ = safepoint_dataman_id;
   }
   /**
            * default 0, there are two offboard storage places in the dataman: 0 or 1
            */
   public byte getSafepointDatamanId()
   {
      return safepoint_dataman_id_;
   }

   /**
            * count of the missions stored in the dataman
            */
   public void setCount(int count)
   {
      count_ = count;
   }
   /**
            * count of the missions stored in the dataman
            */
   public int getCount()
   {
      return count_;
   }

   /**
            * default -1, start at the one changed latest
            */
   public void setCurrentSeq(int current_seq)
   {
      current_seq_ = current_seq;
   }
   /**
            * default -1, start at the one changed latest
            */
   public int getCurrentSeq()
   {
      return current_seq_;
   }

   /**
            * Index of the land start marker, if unavailable index of the land item, -1 otherwise
            */
   public void setLandStartIndex(int land_start_index)
   {
      land_start_index_ = land_start_index;
   }
   /**
            * Index of the land start marker, if unavailable index of the land item, -1 otherwise
            */
   public int getLandStartIndex()
   {
      return land_start_index_;
   }

   /**
            * Index of the land item, -1 otherwise
            */
   public void setLandIndex(int land_index)
   {
      land_index_ = land_index;
   }
   /**
            * Index of the land item, -1 otherwise
            */
   public int getLandIndex()
   {
      return land_index_;
   }

   /**
            * indicates updates to the mission, reload from dataman if changed
            */
   public void setMissionId(long mission_id)
   {
      mission_id_ = mission_id;
   }
   /**
            * indicates updates to the mission, reload from dataman if changed
            */
   public long getMissionId()
   {
      return mission_id_;
   }

   /**
            * indicates updates to the geofence, reload from dataman if changed
            */
   public void setGeofenceId(long geofence_id)
   {
      geofence_id_ = geofence_id;
   }
   /**
            * indicates updates to the geofence, reload from dataman if changed
            */
   public long getGeofenceId()
   {
      return geofence_id_;
   }

   /**
            * indicates updates to the safe points, reload from dataman if changed
            */
   public void setSafePointsId(long safe_points_id)
   {
      safe_points_id_ = safe_points_id;
   }
   /**
            * indicates updates to the safe points, reload from dataman if changed
            */
   public long getSafePointsId()
   {
      return safe_points_id_;
   }


   public static Supplier<MissionPubSubType> getPubSubType()
   {
      return MissionPubSubType::new;
   }

   @Override
   public Supplier<TopicDataType> getPubSubTypePacket()
   {
      return MissionPubSubType::new;
   }

   @Override
   public boolean epsilonEquals(Mission other, double epsilon)
   {
      if(other == null) return false;
      if(other == this) return true;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_, other.timestamp_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.mission_dataman_id_, other.mission_dataman_id_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.fence_dataman_id_, other.fence_dataman_id_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.safepoint_dataman_id_, other.safepoint_dataman_id_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.count_, other.count_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.current_seq_, other.current_seq_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.land_start_index_, other.land_start_index_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.land_index_, other.land_index_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.mission_id_, other.mission_id_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.geofence_id_, other.geofence_id_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.safe_points_id_, other.safe_points_id_, epsilon)) return false;


      return true;
   }

   @Override
   public boolean equals(Object other)
   {
      if(other == null) return false;
      if(other == this) return true;
      if(!(other instanceof Mission)) return false;

      Mission otherMyClass = (Mission) other;

      if(this.timestamp_ != otherMyClass.timestamp_) return false;

      if(this.mission_dataman_id_ != otherMyClass.mission_dataman_id_) return false;

      if(this.fence_dataman_id_ != otherMyClass.fence_dataman_id_) return false;

      if(this.safepoint_dataman_id_ != otherMyClass.safepoint_dataman_id_) return false;

      if(this.count_ != otherMyClass.count_) return false;

      if(this.current_seq_ != otherMyClass.current_seq_) return false;

      if(this.land_start_index_ != otherMyClass.land_start_index_) return false;

      if(this.land_index_ != otherMyClass.land_index_) return false;

      if(this.mission_id_ != otherMyClass.mission_id_) return false;

      if(this.geofence_id_ != otherMyClass.geofence_id_) return false;

      if(this.safe_points_id_ != otherMyClass.safe_points_id_) return false;


      return true;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("Mission {");
      builder.append("timestamp=");
      builder.append(this.timestamp_);      builder.append(", ");
      builder.append("mission_dataman_id=");
      builder.append(this.mission_dataman_id_);      builder.append(", ");
      builder.append("fence_dataman_id=");
      builder.append(this.fence_dataman_id_);      builder.append(", ");
      builder.append("safepoint_dataman_id=");
      builder.append(this.safepoint_dataman_id_);      builder.append(", ");
      builder.append("count=");
      builder.append(this.count_);      builder.append(", ");
      builder.append("current_seq=");
      builder.append(this.current_seq_);      builder.append(", ");
      builder.append("land_start_index=");
      builder.append(this.land_start_index_);      builder.append(", ");
      builder.append("land_index=");
      builder.append(this.land_index_);      builder.append(", ");
      builder.append("mission_id=");
      builder.append(this.mission_id_);      builder.append(", ");
      builder.append("geofence_id=");
      builder.append(this.geofence_id_);      builder.append(", ");
      builder.append("safe_points_id=");
      builder.append(this.safe_points_id_);
      builder.append("}");
      return builder.toString();
   }
}
