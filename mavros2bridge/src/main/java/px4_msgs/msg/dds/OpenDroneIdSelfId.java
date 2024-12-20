package px4_msgs.msg.dds;

import us.ihmc.communication.packets.Packet;
import us.ihmc.euclid.interfaces.Settable;
import us.ihmc.euclid.interfaces.EpsilonComparable;
import java.util.function.Supplier;
import us.ihmc.pubsub.TopicDataType;

public class OpenDroneIdSelfId extends Packet<OpenDroneIdSelfId> implements Settable<OpenDroneIdSelfId>, EpsilonComparable<OpenDroneIdSelfId>
{
   public long timestamp_;
   public byte[] id_or_mac_;
   public byte description_type_;
   public char[] description_;

   public OpenDroneIdSelfId()
   {
      id_or_mac_ = new byte[20];

      description_ = new char[23];

   }

   public OpenDroneIdSelfId(OpenDroneIdSelfId other)
   {
      this();
      set(other);
   }

   public void set(OpenDroneIdSelfId other)
   {
      timestamp_ = other.timestamp_;

      for(int i1 = 0; i1 < id_or_mac_.length; ++i1)
      {
            id_or_mac_[i1] = other.id_or_mac_[i1];

      }

      description_type_ = other.description_type_;

      for(int i3 = 0; i3 < description_.length; ++i3)
      {
            description_[i3] = other.description_[i3];

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

   public void setDescriptionType(byte description_type)
   {
      description_type_ = description_type;
   }
   public byte getDescriptionType()
   {
      return description_type_;
   }


   public char[] getDescription()
   {
      return description_;
   }


   public static Supplier<OpenDroneIdSelfIdPubSubType> getPubSubType()
   {
      return OpenDroneIdSelfIdPubSubType::new;
   }

   @Override
   public Supplier<TopicDataType> getPubSubTypePacket()
   {
      return OpenDroneIdSelfIdPubSubType::new;
   }

   @Override
   public boolean epsilonEquals(OpenDroneIdSelfId other, double epsilon)
   {
      if(other == null) return false;
      if(other == this) return true;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_, other.timestamp_, epsilon)) return false;

      for(int i5 = 0; i5 < id_or_mac_.length; ++i5)
      {
                if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.id_or_mac_[i5], other.id_or_mac_[i5], epsilon)) return false;
      }

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.description_type_, other.description_type_, epsilon)) return false;

      for(int i7 = 0; i7 < description_.length; ++i7)
      {
                if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.description_[i7], other.description_[i7], epsilon)) return false;
      }


      return true;
   }

   @Override
   public boolean equals(Object other)
   {
      if(other == null) return false;
      if(other == this) return true;
      if(!(other instanceof OpenDroneIdSelfId)) return false;

      OpenDroneIdSelfId otherMyClass = (OpenDroneIdSelfId) other;

      if(this.timestamp_ != otherMyClass.timestamp_) return false;

      for(int i9 = 0; i9 < id_or_mac_.length; ++i9)
      {
                if(this.id_or_mac_[i9] != otherMyClass.id_or_mac_[i9]) return false;

      }
      if(this.description_type_ != otherMyClass.description_type_) return false;

      for(int i11 = 0; i11 < description_.length; ++i11)
      {
                if(this.description_[i11] != otherMyClass.description_[i11]) return false;

      }

      return true;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("OpenDroneIdSelfId {");
      builder.append("timestamp=");
      builder.append(this.timestamp_);      builder.append(", ");
      builder.append("id_or_mac=");
      builder.append(java.util.Arrays.toString(this.id_or_mac_));      builder.append(", ");
      builder.append("description_type=");
      builder.append(this.description_type_);      builder.append(", ");
      builder.append("description=");
      builder.append(java.util.Arrays.toString(this.description_));
      builder.append("}");
      return builder.toString();
   }
}
