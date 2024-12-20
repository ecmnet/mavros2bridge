package px4_msgs.msg.dds;

import us.ihmc.communication.packets.Packet;
import us.ihmc.euclid.interfaces.Settable;
import us.ihmc.euclid.interfaces.EpsilonComparable;
import java.util.function.Supplier;
import us.ihmc.pubsub.TopicDataType;

public class VehicleThrustSetpoint extends Packet<VehicleThrustSetpoint> implements Settable<VehicleThrustSetpoint>, EpsilonComparable<VehicleThrustSetpoint>
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
            * thrust setpoint along X, Y, Z body axis [-1, 1]
            */
   public float[] xyz_;

   public VehicleThrustSetpoint()
   {
      xyz_ = new float[3];

   }

   public VehicleThrustSetpoint(VehicleThrustSetpoint other)
   {
      this();
      set(other);
   }

   public void set(VehicleThrustSetpoint other)
   {
      timestamp_ = other.timestamp_;

      timestamp_sample_ = other.timestamp_sample_;

      for(int i1 = 0; i1 < xyz_.length; ++i1)
      {
            xyz_[i1] = other.xyz_[i1];

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
            * thrust setpoint along X, Y, Z body axis [-1, 1]
            */
   public float[] getXyz()
   {
      return xyz_;
   }


   public static Supplier<VehicleThrustSetpointPubSubType> getPubSubType()
   {
      return VehicleThrustSetpointPubSubType::new;
   }

   @Override
   public Supplier<TopicDataType> getPubSubTypePacket()
   {
      return VehicleThrustSetpointPubSubType::new;
   }

   @Override
   public boolean epsilonEquals(VehicleThrustSetpoint other, double epsilon)
   {
      if(other == null) return false;
      if(other == this) return true;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_, other.timestamp_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_sample_, other.timestamp_sample_, epsilon)) return false;

      for(int i3 = 0; i3 < xyz_.length; ++i3)
      {
                if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.xyz_[i3], other.xyz_[i3], epsilon)) return false;
      }


      return true;
   }

   @Override
   public boolean equals(Object other)
   {
      if(other == null) return false;
      if(other == this) return true;
      if(!(other instanceof VehicleThrustSetpoint)) return false;

      VehicleThrustSetpoint otherMyClass = (VehicleThrustSetpoint) other;

      if(this.timestamp_ != otherMyClass.timestamp_) return false;

      if(this.timestamp_sample_ != otherMyClass.timestamp_sample_) return false;

      for(int i5 = 0; i5 < xyz_.length; ++i5)
      {
                if(this.xyz_[i5] != otherMyClass.xyz_[i5]) return false;

      }

      return true;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("VehicleThrustSetpoint {");
      builder.append("timestamp=");
      builder.append(this.timestamp_);      builder.append(", ");
      builder.append("timestamp_sample=");
      builder.append(this.timestamp_sample_);      builder.append(", ");
      builder.append("xyz=");
      builder.append(java.util.Arrays.toString(this.xyz_));
      builder.append("}");
      return builder.toString();
   }
}
