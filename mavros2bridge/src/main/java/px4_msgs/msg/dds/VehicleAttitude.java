package px4_msgs.msg.dds;

import us.ihmc.communication.packets.Packet;
import us.ihmc.euclid.interfaces.Settable;
import us.ihmc.euclid.interfaces.EpsilonComparable;
import java.util.function.Supplier;
import us.ihmc.pubsub.TopicDataType;

/**
       * This is similar to the mavlink message ATTITUDE_QUATERNION, but for onboard use
       * The quaternion uses the Hamilton convention, and the order is q(w, x, y, z)
       */
public class VehicleAttitude extends Packet<VehicleAttitude> implements Settable<VehicleAttitude>, EpsilonComparable<VehicleAttitude>
{
   /**
            * time since system start (microseconds)
            */
   public long timestamp_;
   /**
            * the timestamp of the raw data (microseconds)
            */
   public long timestamp_sample_;
   /**
            * Quaternion rotation from the FRD body frame to the NED earth frame
            */
   public float[] q_;
   /**
            * Amount by which quaternion has changed during last reset
            */
   public float[] delta_q_reset_;
   /**
            * Quaternion reset counter
            */
   public byte quat_reset_counter_;

   public VehicleAttitude()
   {
      q_ = new float[4];

      delta_q_reset_ = new float[4];

   }

   public VehicleAttitude(VehicleAttitude other)
   {
      this();
      set(other);
   }

   public void set(VehicleAttitude other)
   {
      timestamp_ = other.timestamp_;

      timestamp_sample_ = other.timestamp_sample_;

      for(int i1 = 0; i1 < q_.length; ++i1)
      {
            q_[i1] = other.q_[i1];

      }

      for(int i3 = 0; i3 < delta_q_reset_.length; ++i3)
      {
            delta_q_reset_[i3] = other.delta_q_reset_[i3];

      }

      quat_reset_counter_ = other.quat_reset_counter_;

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
            * the timestamp of the raw data (microseconds)
            */
   public void setTimestampSample(long timestamp_sample)
   {
      timestamp_sample_ = timestamp_sample;
   }
   /**
            * the timestamp of the raw data (microseconds)
            */
   public long getTimestampSample()
   {
      return timestamp_sample_;
   }


   /**
            * Quaternion rotation from the FRD body frame to the NED earth frame
            */
   public float[] getQ()
   {
      return q_;
   }


   /**
            * Amount by which quaternion has changed during last reset
            */
   public float[] getDeltaQReset()
   {
      return delta_q_reset_;
   }

   /**
            * Quaternion reset counter
            */
   public void setQuatResetCounter(byte quat_reset_counter)
   {
      quat_reset_counter_ = quat_reset_counter;
   }
   /**
            * Quaternion reset counter
            */
   public byte getQuatResetCounter()
   {
      return quat_reset_counter_;
   }


   public static Supplier<VehicleAttitudePubSubType> getPubSubType()
   {
      return VehicleAttitudePubSubType::new;
   }

   @Override
   public Supplier<TopicDataType> getPubSubTypePacket()
   {
      return VehicleAttitudePubSubType::new;
   }

   @Override
   public boolean epsilonEquals(VehicleAttitude other, double epsilon)
   {
      if(other == null) return false;
      if(other == this) return true;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_, other.timestamp_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_sample_, other.timestamp_sample_, epsilon)) return false;

      for(int i5 = 0; i5 < q_.length; ++i5)
      {
                if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.q_[i5], other.q_[i5], epsilon)) return false;
      }

      for(int i7 = 0; i7 < delta_q_reset_.length; ++i7)
      {
                if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.delta_q_reset_[i7], other.delta_q_reset_[i7], epsilon)) return false;
      }

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.quat_reset_counter_, other.quat_reset_counter_, epsilon)) return false;


      return true;
   }

   @Override
   public boolean equals(Object other)
   {
      if(other == null) return false;
      if(other == this) return true;
      if(!(other instanceof VehicleAttitude)) return false;

      VehicleAttitude otherMyClass = (VehicleAttitude) other;

      if(this.timestamp_ != otherMyClass.timestamp_) return false;

      if(this.timestamp_sample_ != otherMyClass.timestamp_sample_) return false;

      for(int i9 = 0; i9 < q_.length; ++i9)
      {
                if(this.q_[i9] != otherMyClass.q_[i9]) return false;

      }
      for(int i11 = 0; i11 < delta_q_reset_.length; ++i11)
      {
                if(this.delta_q_reset_[i11] != otherMyClass.delta_q_reset_[i11]) return false;

      }
      if(this.quat_reset_counter_ != otherMyClass.quat_reset_counter_) return false;


      return true;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("VehicleAttitude {");
      builder.append("timestamp=");
      builder.append(this.timestamp_);      builder.append(", ");
      builder.append("timestamp_sample=");
      builder.append(this.timestamp_sample_);      builder.append(", ");
      builder.append("q=");
      builder.append(java.util.Arrays.toString(this.q_));      builder.append(", ");
      builder.append("delta_q_reset=");
      builder.append(java.util.Arrays.toString(this.delta_q_reset_));      builder.append(", ");
      builder.append("quat_reset_counter=");
      builder.append(this.quat_reset_counter_);
      builder.append("}");
      return builder.toString();
   }
}
