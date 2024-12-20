package px4_msgs.msg.dds;

import us.ihmc.communication.packets.Packet;
import us.ihmc.euclid.interfaces.Settable;
import us.ihmc.euclid.interfaces.EpsilonComparable;
import java.util.function.Supplier;
import us.ihmc.pubsub.TopicDataType;

public class CameraStatus extends Packet<CameraStatus> implements Settable<CameraStatus>, EpsilonComparable<CameraStatus>
{
   /**
            * time since system start (microseconds)
            */
   public long timestamp_;
   /**
            * mavlink system id of the currently active camera
            */
   public byte active_sys_id_;
   /**
            * mavlink component id of currently active camera
            */
   public byte active_comp_id_;

   public CameraStatus()
   {
   }

   public CameraStatus(CameraStatus other)
   {
      this();
      set(other);
   }

   public void set(CameraStatus other)
   {
      timestamp_ = other.timestamp_;

      active_sys_id_ = other.active_sys_id_;

      active_comp_id_ = other.active_comp_id_;

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
            * mavlink system id of the currently active camera
            */
   public void setActiveSysId(byte active_sys_id)
   {
      active_sys_id_ = active_sys_id;
   }
   /**
            * mavlink system id of the currently active camera
            */
   public byte getActiveSysId()
   {
      return active_sys_id_;
   }

   /**
            * mavlink component id of currently active camera
            */
   public void setActiveCompId(byte active_comp_id)
   {
      active_comp_id_ = active_comp_id;
   }
   /**
            * mavlink component id of currently active camera
            */
   public byte getActiveCompId()
   {
      return active_comp_id_;
   }


   public static Supplier<CameraStatusPubSubType> getPubSubType()
   {
      return CameraStatusPubSubType::new;
   }

   @Override
   public Supplier<TopicDataType> getPubSubTypePacket()
   {
      return CameraStatusPubSubType::new;
   }

   @Override
   public boolean epsilonEquals(CameraStatus other, double epsilon)
   {
      if(other == null) return false;
      if(other == this) return true;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_, other.timestamp_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.active_sys_id_, other.active_sys_id_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.active_comp_id_, other.active_comp_id_, epsilon)) return false;


      return true;
   }

   @Override
   public boolean equals(Object other)
   {
      if(other == null) return false;
      if(other == this) return true;
      if(!(other instanceof CameraStatus)) return false;

      CameraStatus otherMyClass = (CameraStatus) other;

      if(this.timestamp_ != otherMyClass.timestamp_) return false;

      if(this.active_sys_id_ != otherMyClass.active_sys_id_) return false;

      if(this.active_comp_id_ != otherMyClass.active_comp_id_) return false;


      return true;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("CameraStatus {");
      builder.append("timestamp=");
      builder.append(this.timestamp_);      builder.append(", ");
      builder.append("active_sys_id=");
      builder.append(this.active_sys_id_);      builder.append(", ");
      builder.append("active_comp_id=");
      builder.append(this.active_comp_id_);
      builder.append("}");
      return builder.toString();
   }
}
