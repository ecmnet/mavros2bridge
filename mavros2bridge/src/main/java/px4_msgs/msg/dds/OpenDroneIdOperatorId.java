package px4_msgs.msg.dds;

import us.ihmc.communication.packets.Packet;
import us.ihmc.euclid.interfaces.Settable;
import us.ihmc.euclid.interfaces.EpsilonComparable;
import java.util.function.Supplier;
import us.ihmc.pubsub.TopicDataType;

public class OpenDroneIdOperatorId extends Packet<OpenDroneIdOperatorId> implements Settable<OpenDroneIdOperatorId>, EpsilonComparable<OpenDroneIdOperatorId>
{
   public long timestamp_;
   public byte[] id_or_mac_;
   public byte operator_id_type_;
   public char[] operator_id_;

   public OpenDroneIdOperatorId()
   {
      id_or_mac_ = new byte[20];

      operator_id_ = new char[20];

   }

   public OpenDroneIdOperatorId(OpenDroneIdOperatorId other)
   {
      this();
      set(other);
   }

   public void set(OpenDroneIdOperatorId other)
   {
      timestamp_ = other.timestamp_;

      for(int i1 = 0; i1 < id_or_mac_.length; ++i1)
      {
            id_or_mac_[i1] = other.id_or_mac_[i1];

      }

      operator_id_type_ = other.operator_id_type_;

      for(int i3 = 0; i3 < operator_id_.length; ++i3)
      {
            operator_id_[i3] = other.operator_id_[i3];

      }

   }

   public void setTimestamp(long timestamp)
   {
      timestamp_ = timestamp;
   }
   public long getTimestamp()
   {
      return timestamp_;
   }


   public byte[] getIdOrMac()
   {
      return id_or_mac_;
   }

   public void setOperatorIdType(byte operator_id_type)
   {
      operator_id_type_ = operator_id_type;
   }
   public byte getOperatorIdType()
   {
      return operator_id_type_;
   }


   public char[] getOperatorId()
   {
      return operator_id_;
   }


   public static Supplier<OpenDroneIdOperatorIdPubSubType> getPubSubType()
   {
      return OpenDroneIdOperatorIdPubSubType::new;
   }

   @Override
   public Supplier<TopicDataType> getPubSubTypePacket()
   {
      return OpenDroneIdOperatorIdPubSubType::new;
   }

   @Override
   public boolean epsilonEquals(OpenDroneIdOperatorId other, double epsilon)
   {
      if(other == null) return false;
      if(other == this) return true;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_, other.timestamp_, epsilon)) return false;

      for(int i5 = 0; i5 < id_or_mac_.length; ++i5)
      {
                if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.id_or_mac_[i5], other.id_or_mac_[i5], epsilon)) return false;
      }

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.operator_id_type_, other.operator_id_type_, epsilon)) return false;

      for(int i7 = 0; i7 < operator_id_.length; ++i7)
      {
                if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.operator_id_[i7], other.operator_id_[i7], epsilon)) return false;
      }


      return true;
   }

   @Override
   public boolean equals(Object other)
   {
      if(other == null) return false;
      if(other == this) return true;
      if(!(other instanceof OpenDroneIdOperatorId)) return false;

      OpenDroneIdOperatorId otherMyClass = (OpenDroneIdOperatorId) other;

      if(this.timestamp_ != otherMyClass.timestamp_) return false;

      for(int i9 = 0; i9 < id_or_mac_.length; ++i9)
      {
                if(this.id_or_mac_[i9] != otherMyClass.id_or_mac_[i9]) return false;

      }
      if(this.operator_id_type_ != otherMyClass.operator_id_type_) return false;

      for(int i11 = 0; i11 < operator_id_.length; ++i11)
      {
                if(this.operator_id_[i11] != otherMyClass.operator_id_[i11]) return false;

      }

      return true;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("OpenDroneIdOperatorId {");
      builder.append("timestamp=");
      builder.append(this.timestamp_);      builder.append(", ");
      builder.append("id_or_mac=");
      builder.append(java.util.Arrays.toString(this.id_or_mac_));      builder.append(", ");
      builder.append("operator_id_type=");
      builder.append(this.operator_id_type_);      builder.append(", ");
      builder.append("operator_id=");
      builder.append(java.util.Arrays.toString(this.operator_id_));
      builder.append("}");
      return builder.toString();
   }
}
