package px4_msgs.msg.dds;

import us.ihmc.communication.packets.Packet;
import us.ihmc.euclid.interfaces.Settable;
import us.ihmc.euclid.interfaces.EpsilonComparable;
import java.util.function.Supplier;
import us.ihmc.pubsub.TopicDataType;

public class RtlStatus extends Packet<RtlStatus> implements Settable<RtlStatus>, EpsilonComparable<RtlStatus>
{
   /**
          * pending if evaluation can't pe performed currently e.g. when it is still loading the safe points
          */
   public static final byte RTL_STATUS_TYPE_NONE = (byte) 0;
   /**
          * chosen to directly go to a safe point or home position
          */
   public static final byte RTL_STATUS_TYPE_DIRECT_SAFE_POINT = (byte) 1;
   /**
          * going straight to the beginning of the mission landing
          */
   public static final byte RTL_STATUS_TYPE_DIRECT_MISSION_LAND = (byte) 2;
   /**
          * Following the mission from start index to mission landing. Start index is current WP if in Mission mode, and closest WP otherwise.
          */
   public static final byte RTL_STATUS_TYPE_FOLLOW_MISSION = (byte) 3;
   /**
          * Following the mission in reverse from start index to the beginning of the mission. Start index is previous WP if in Mission mode, and closest WP otherwise.
          */
   public static final byte RTL_STATUS_TYPE_FOLLOW_MISSION_REVERSE = (byte) 4;
   /**
            * time since system start (microseconds)
            */
   public long timestamp_;
   /**
            * unique ID of active set of safe_point_items
            */
   public long safe_points_id_;
   /**
            * flag if the RTL point needs reevaluation (e.g. new safe points available, but need loading).
            */
   public boolean is_evaluation_pending_;
   /**
            * flag if approaches are defined for current RTL_TYPE parameter setting
            */
   public boolean has_vtol_approach_;
   /**
            * Type of RTL chosen
            */
   public byte rtl_type_;
   /**
            * index of the chosen safe point, if in RTL_STATUS_TYPE_DIRECT_SAFE_POINT mode
            */
   public byte safe_point_index_;

   public RtlStatus()
   {
   }

   public RtlStatus(RtlStatus other)
   {
      this();
      set(other);
   }

   public void set(RtlStatus other)
   {
      timestamp_ = other.timestamp_;

      safe_points_id_ = other.safe_points_id_;

      is_evaluation_pending_ = other.is_evaluation_pending_;

      has_vtol_approach_ = other.has_vtol_approach_;

      rtl_type_ = other.rtl_type_;

      safe_point_index_ = other.safe_point_index_;

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
            * unique ID of active set of safe_point_items
            */
   public void setSafePointsId(long safe_points_id)
   {
      safe_points_id_ = safe_points_id;
   }
   /**
            * unique ID of active set of safe_point_items
            */
   public long getSafePointsId()
   {
      return safe_points_id_;
   }

   /**
            * flag if the RTL point needs reevaluation (e.g. new safe points available, but need loading).
            */
   public void setIsEvaluationPending(boolean is_evaluation_pending)
   {
      is_evaluation_pending_ = is_evaluation_pending;
   }
   /**
            * flag if the RTL point needs reevaluation (e.g. new safe points available, but need loading).
            */
   public boolean getIsEvaluationPending()
   {
      return is_evaluation_pending_;
   }

   /**
            * flag if approaches are defined for current RTL_TYPE parameter setting
            */
   public void setHasVtolApproach(boolean has_vtol_approach)
   {
      has_vtol_approach_ = has_vtol_approach;
   }
   /**
            * flag if approaches are defined for current RTL_TYPE parameter setting
            */
   public boolean getHasVtolApproach()
   {
      return has_vtol_approach_;
   }

   /**
            * Type of RTL chosen
            */
   public void setRtlType(byte rtl_type)
   {
      rtl_type_ = rtl_type;
   }
   /**
            * Type of RTL chosen
            */
   public byte getRtlType()
   {
      return rtl_type_;
   }

   /**
            * index of the chosen safe point, if in RTL_STATUS_TYPE_DIRECT_SAFE_POINT mode
            */
   public void setSafePointIndex(byte safe_point_index)
   {
      safe_point_index_ = safe_point_index;
   }
   /**
            * index of the chosen safe point, if in RTL_STATUS_TYPE_DIRECT_SAFE_POINT mode
            */
   public byte getSafePointIndex()
   {
      return safe_point_index_;
   }


   public static Supplier<RtlStatusPubSubType> getPubSubType()
   {
      return RtlStatusPubSubType::new;
   }

   @Override
   public Supplier<TopicDataType> getPubSubTypePacket()
   {
      return RtlStatusPubSubType::new;
   }

   @Override
   public boolean epsilonEquals(RtlStatus other, double epsilon)
   {
      if(other == null) return false;
      if(other == this) return true;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_, other.timestamp_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.safe_points_id_, other.safe_points_id_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.is_evaluation_pending_, other.is_evaluation_pending_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.has_vtol_approach_, other.has_vtol_approach_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.rtl_type_, other.rtl_type_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.safe_point_index_, other.safe_point_index_, epsilon)) return false;


      return true;
   }

   @Override
   public boolean equals(Object other)
   {
      if(other == null) return false;
      if(other == this) return true;
      if(!(other instanceof RtlStatus)) return false;

      RtlStatus otherMyClass = (RtlStatus) other;

      if(this.timestamp_ != otherMyClass.timestamp_) return false;

      if(this.safe_points_id_ != otherMyClass.safe_points_id_) return false;

      if(this.is_evaluation_pending_ != otherMyClass.is_evaluation_pending_) return false;

      if(this.has_vtol_approach_ != otherMyClass.has_vtol_approach_) return false;

      if(this.rtl_type_ != otherMyClass.rtl_type_) return false;

      if(this.safe_point_index_ != otherMyClass.safe_point_index_) return false;


      return true;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("RtlStatus {");
      builder.append("timestamp=");
      builder.append(this.timestamp_);      builder.append(", ");
      builder.append("safe_points_id=");
      builder.append(this.safe_points_id_);      builder.append(", ");
      builder.append("is_evaluation_pending=");
      builder.append(this.is_evaluation_pending_);      builder.append(", ");
      builder.append("has_vtol_approach=");
      builder.append(this.has_vtol_approach_);      builder.append(", ");
      builder.append("rtl_type=");
      builder.append(this.rtl_type_);      builder.append(", ");
      builder.append("safe_point_index=");
      builder.append(this.safe_point_index_);
      builder.append("}");
      return builder.toString();
   }
}
