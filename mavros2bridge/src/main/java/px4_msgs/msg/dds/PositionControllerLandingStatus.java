package px4_msgs.msg.dds;

import us.ihmc.communication.packets.Packet;
import us.ihmc.euclid.interfaces.Settable;
import us.ihmc.euclid.interfaces.EpsilonComparable;
import java.util.function.Supplier;
import us.ihmc.pubsub.TopicDataType;

public class PositionControllerLandingStatus extends Packet<PositionControllerLandingStatus> implements Settable<PositionControllerLandingStatus>, EpsilonComparable<PositionControllerLandingStatus>
{
   /**
          * abort reasons
          * after the manual operator abort, corresponds to individual bits of param FW_LND_ABORT
          */
   public static final byte NOT_ABORTED = (byte) 0;
   public static final byte ABORTED_BY_OPERATOR = (byte) 1;
   /**
          * FW_LND_ABORT (1 << 0)
          */
   public static final byte TERRAIN_NOT_FOUND = (byte) 2;
   /**
          * FW_LND_ABORT (1 << 1)
          */
   public static final byte TERRAIN_TIMEOUT = (byte) 3;
   public static final byte UNKNOWN_ABORT_CRITERION = (byte) 4;
   /**
            * [us] time since system start
            */
   public long timestamp_;
   /**
            * [m] lateral touchdown position offset manually commanded during landing
            */
   public float lateral_touchdown_offset_;
   /**
            * true if the aircraft is flaring
            */
   public boolean flaring_;
   /**
            * abort status is:
            * 0 if not aborted
            * >0 if aborted, with the singular abort criterion which triggered the landing abort enumerated by the following abort reasons
            */
   public byte abort_status_;

   public PositionControllerLandingStatus()
   {
   }

   public PositionControllerLandingStatus(PositionControllerLandingStatus other)
   {
      this();
      set(other);
   }

   public void set(PositionControllerLandingStatus other)
   {
      timestamp_ = other.timestamp_;

      lateral_touchdown_offset_ = other.lateral_touchdown_offset_;

      flaring_ = other.flaring_;

      abort_status_ = other.abort_status_;

   }

   /**
            * [us] time since system start
            */
   public void setTimestamp(long timestamp)
   {
      timestamp_ = timestamp;
   }
   /**
            * [us] time since system start
            */
   public long getTimestamp()
   {
      return timestamp_;
   }

   /**
            * [m] lateral touchdown position offset manually commanded during landing
            */
   public void setLateralTouchdownOffset(float lateral_touchdown_offset)
   {
      lateral_touchdown_offset_ = lateral_touchdown_offset;
   }
   /**
            * [m] lateral touchdown position offset manually commanded during landing
            */
   public float getLateralTouchdownOffset()
   {
      return lateral_touchdown_offset_;
   }

   /**
            * true if the aircraft is flaring
            */
   public void setFlaring(boolean flaring)
   {
      flaring_ = flaring;
   }
   /**
            * true if the aircraft is flaring
            */
   public boolean getFlaring()
   {
      return flaring_;
   }

   /**
            * abort status is:
            * 0 if not aborted
            * >0 if aborted, with the singular abort criterion which triggered the landing abort enumerated by the following abort reasons
            */
   public void setAbortStatus(byte abort_status)
   {
      abort_status_ = abort_status;
   }
   /**
            * abort status is:
            * 0 if not aborted
            * >0 if aborted, with the singular abort criterion which triggered the landing abort enumerated by the following abort reasons
            */
   public byte getAbortStatus()
   {
      return abort_status_;
   }


   public static Supplier<PositionControllerLandingStatusPubSubType> getPubSubType()
   {
      return PositionControllerLandingStatusPubSubType::new;
   }

   @Override
   public Supplier<TopicDataType> getPubSubTypePacket()
   {
      return PositionControllerLandingStatusPubSubType::new;
   }

   @Override
   public boolean epsilonEquals(PositionControllerLandingStatus other, double epsilon)
   {
      if(other == null) return false;
      if(other == this) return true;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_, other.timestamp_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.lateral_touchdown_offset_, other.lateral_touchdown_offset_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.flaring_, other.flaring_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.abort_status_, other.abort_status_, epsilon)) return false;


      return true;
   }

   @Override
   public boolean equals(Object other)
   {
      if(other == null) return false;
      if(other == this) return true;
      if(!(other instanceof PositionControllerLandingStatus)) return false;

      PositionControllerLandingStatus otherMyClass = (PositionControllerLandingStatus) other;

      if(this.timestamp_ != otherMyClass.timestamp_) return false;

      if(this.lateral_touchdown_offset_ != otherMyClass.lateral_touchdown_offset_) return false;

      if(this.flaring_ != otherMyClass.flaring_) return false;

      if(this.abort_status_ != otherMyClass.abort_status_) return false;


      return true;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("PositionControllerLandingStatus {");
      builder.append("timestamp=");
      builder.append(this.timestamp_);      builder.append(", ");
      builder.append("lateral_touchdown_offset=");
      builder.append(this.lateral_touchdown_offset_);      builder.append(", ");
      builder.append("flaring=");
      builder.append(this.flaring_);      builder.append(", ");
      builder.append("abort_status=");
      builder.append(this.abort_status_);
      builder.append("}");
      return builder.toString();
   }
}
