package px4_msgs.msg.dds;

import us.ihmc.communication.packets.Packet;
import us.ihmc.euclid.interfaces.Settable;
import us.ihmc.euclid.interfaces.EpsilonComparable;
import java.util.function.Supplier;
import us.ihmc.pubsub.TopicDataType;

public class VehicleAngularVelocity extends Packet<VehicleAngularVelocity> implements Settable<VehicleAngularVelocity>, EpsilonComparable<VehicleAngularVelocity>
{
   /**
            * time since system start (microseconds)
            */
   public long timestamp_;
   /**
            * timestamp of the data sample on which this message is based (microseconds)
            */
   public long timestamp_sample_;
   /**
            * Bias corrected angular velocity about the FRD body frame XYZ-axis in rad/s
            */
   public float[] xyz_;
   /**
            * angular acceleration about the FRD body frame XYZ-axis in rad/s^2
            */
   public float[] xyz_derivative_;

   public VehicleAngularVelocity()
   {
      xyz_ = new float[3];

      xyz_derivative_ = new float[3];

   }

   public VehicleAngularVelocity(VehicleAngularVelocity other)
   {
      this();
      set(other);
   }

   public void set(VehicleAngularVelocity other)
   {
      timestamp_ = other.timestamp_;

      timestamp_sample_ = other.timestamp_sample_;

      for(int i1 = 0; i1 < xyz_.length; ++i1)
      {
            xyz_[i1] = other.xyz_[i1];

      }

      for(int i3 = 0; i3 < xyz_derivative_.length; ++i3)
      {
            xyz_derivative_[i3] = other.xyz_derivative_[i3];

      }

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
            * timestamp of the data sample on which this message is based (microseconds)
            */
   public void setTimestampSample(long timestamp_sample)
   {
      timestamp_sample_ = timestamp_sample;
   }
   /**
            * timestamp of the data sample on which this message is based (microseconds)
            */
   public long getTimestampSample()
   {
      return timestamp_sample_;
   }


   /**
            * Bias corrected angular velocity about the FRD body frame XYZ-axis in rad/s
            */
   public float[] getXyz()
   {
      return xyz_;
   }


   /**
            * angular acceleration about the FRD body frame XYZ-axis in rad/s^2
            */
   public float[] getXyzDerivative()
   {
      return xyz_derivative_;
   }


   public static Supplier<VehicleAngularVelocityPubSubType> getPubSubType()
   {
      return VehicleAngularVelocityPubSubType::new;
   }

   @Override
   public Supplier<TopicDataType> getPubSubTypePacket()
   {
      return VehicleAngularVelocityPubSubType::new;
   }

   @Override
   public boolean epsilonEquals(VehicleAngularVelocity other, double epsilon)
   {
      if(other == null) return false;
      if(other == this) return true;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_, other.timestamp_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_sample_, other.timestamp_sample_, epsilon)) return false;

      for(int i5 = 0; i5 < xyz_.length; ++i5)
      {
                if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.xyz_[i5], other.xyz_[i5], epsilon)) return false;
      }

      for(int i7 = 0; i7 < xyz_derivative_.length; ++i7)
      {
                if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.xyz_derivative_[i7], other.xyz_derivative_[i7], epsilon)) return false;
      }


      return true;
   }

   @Override
   public boolean equals(Object other)
   {
      if(other == null) return false;
      if(other == this) return true;
      if(!(other instanceof VehicleAngularVelocity)) return false;

      VehicleAngularVelocity otherMyClass = (VehicleAngularVelocity) other;

      if(this.timestamp_ != otherMyClass.timestamp_) return false;

      if(this.timestamp_sample_ != otherMyClass.timestamp_sample_) return false;

      for(int i9 = 0; i9 < xyz_.length; ++i9)
      {
                if(this.xyz_[i9] != otherMyClass.xyz_[i9]) return false;

      }
      for(int i11 = 0; i11 < xyz_derivative_.length; ++i11)
      {
                if(this.xyz_derivative_[i11] != otherMyClass.xyz_derivative_[i11]) return false;

      }

      return true;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("VehicleAngularVelocity {");
      builder.append("timestamp=");
      builder.append(this.timestamp_);      builder.append(", ");
      builder.append("timestamp_sample=");
      builder.append(this.timestamp_sample_);      builder.append(", ");
      builder.append("xyz=");
      builder.append(java.util.Arrays.toString(this.xyz_));      builder.append(", ");
      builder.append("xyz_derivative=");
      builder.append(java.util.Arrays.toString(this.xyz_derivative_));
      builder.append("}");
      return builder.toString();
   }
}
