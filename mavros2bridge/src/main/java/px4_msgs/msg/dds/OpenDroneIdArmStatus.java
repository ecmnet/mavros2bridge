package px4_msgs.msg.dds;

import us.ihmc.communication.packets.Packet;
import us.ihmc.euclid.interfaces.Settable;
import us.ihmc.euclid.interfaces.EpsilonComparable;
import java.util.function.Supplier;
import us.ihmc.pubsub.TopicDataType;

public class OpenDroneIdArmStatus extends Packet<OpenDroneIdArmStatus> implements Settable<OpenDroneIdArmStatus>, EpsilonComparable<OpenDroneIdArmStatus>
{
   public long timestamp_;
   public byte status_;
   public char[] error_;

   public OpenDroneIdArmStatus()
   {
      error_ = new char[50];

   }

   public OpenDroneIdArmStatus(OpenDroneIdArmStatus other)
   {
      this();
      set(other);
   }

   public void set(OpenDroneIdArmStatus other)
   {
      timestamp_ = other.timestamp_;

      status_ = other.status_;

      for(int i1 = 0; i1 < error_.length; ++i1)
      {
            error_[i1] = other.error_[i1];

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

   public void setStatus(byte status)
   {
      status_ = status;
   }
   public byte getStatus()
   {
      return status_;
   }


   public char[] getError()
   {
      return error_;
   }


   public static Supplier<OpenDroneIdArmStatusPubSubType> getPubSubType()
   {
      return OpenDroneIdArmStatusPubSubType::new;
   }

   @Override
   public Supplier<TopicDataType> getPubSubTypePacket()
   {
      return OpenDroneIdArmStatusPubSubType::new;
   }

   @Override
   public boolean epsilonEquals(OpenDroneIdArmStatus other, double epsilon)
   {
      if(other == null) return false;
      if(other == this) return true;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_, other.timestamp_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.status_, other.status_, epsilon)) return false;

      for(int i3 = 0; i3 < error_.length; ++i3)
      {
                if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.error_[i3], other.error_[i3], epsilon)) return false;
      }


      return true;
   }

   @Override
   public boolean equals(Object other)
   {
      if(other == null) return false;
      if(other == this) return true;
      if(!(other instanceof OpenDroneIdArmStatus)) return false;

      OpenDroneIdArmStatus otherMyClass = (OpenDroneIdArmStatus) other;

      if(this.timestamp_ != otherMyClass.timestamp_) return false;

      if(this.status_ != otherMyClass.status_) return false;

      for(int i5 = 0; i5 < error_.length; ++i5)
      {
                if(this.error_[i5] != otherMyClass.error_[i5]) return false;

      }

      return true;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("OpenDroneIdArmStatus {");
      builder.append("timestamp=");
      builder.append(this.timestamp_);      builder.append(", ");
      builder.append("status=");
      builder.append(this.status_);      builder.append(", ");
      builder.append("error=");
      builder.append(java.util.Arrays.toString(this.error_));
      builder.append("}");
      return builder.toString();
   }
}
