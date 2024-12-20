package px4_msgs.msg.dds;

import us.ihmc.communication.packets.Packet;
import us.ihmc.euclid.interfaces.Settable;
import us.ihmc.euclid.interfaces.EpsilonComparable;
import java.util.function.Supplier;
import us.ihmc.pubsub.TopicDataType;

/**
       * broadcast message to request all registered arming checks to be reported
       */
public class ArmingCheckRequest extends Packet<ArmingCheckRequest> implements Settable<ArmingCheckRequest>, EpsilonComparable<ArmingCheckRequest>
{
   /**
            * time since system start (microseconds)
            */
   public long timestamp_;
   public byte request_id_;

   public ArmingCheckRequest()
   {
   }

   public ArmingCheckRequest(ArmingCheckRequest other)
   {
      this();
      set(other);
   }

   public void set(ArmingCheckRequest other)
   {
      timestamp_ = other.timestamp_;

      request_id_ = other.request_id_;

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

   public void setRequestId(byte request_id)
   {
      request_id_ = request_id;
   }
   public byte getRequestId()
   {
      return request_id_;
   }


   public static Supplier<ArmingCheckRequestPubSubType> getPubSubType()
   {
      return ArmingCheckRequestPubSubType::new;
   }

   @Override
   public Supplier<TopicDataType> getPubSubTypePacket()
   {
      return ArmingCheckRequestPubSubType::new;
   }

   @Override
   public boolean epsilonEquals(ArmingCheckRequest other, double epsilon)
   {
      if(other == null) return false;
      if(other == this) return true;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_, other.timestamp_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.request_id_, other.request_id_, epsilon)) return false;


      return true;
   }

   @Override
   public boolean equals(Object other)
   {
      if(other == null) return false;
      if(other == this) return true;
      if(!(other instanceof ArmingCheckRequest)) return false;

      ArmingCheckRequest otherMyClass = (ArmingCheckRequest) other;

      if(this.timestamp_ != otherMyClass.timestamp_) return false;

      if(this.request_id_ != otherMyClass.request_id_) return false;


      return true;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("ArmingCheckRequest {");
      builder.append("timestamp=");
      builder.append(this.timestamp_);      builder.append(", ");
      builder.append("request_id=");
      builder.append(this.request_id_);
      builder.append("}");
      return builder.toString();
   }
}
