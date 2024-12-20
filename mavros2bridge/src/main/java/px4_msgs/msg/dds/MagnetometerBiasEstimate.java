package px4_msgs.msg.dds;

import us.ihmc.communication.packets.Packet;
import us.ihmc.euclid.interfaces.Settable;
import us.ihmc.euclid.interfaces.EpsilonComparable;
import java.util.function.Supplier;
import us.ihmc.pubsub.TopicDataType;

public class MagnetometerBiasEstimate extends Packet<MagnetometerBiasEstimate> implements Settable<MagnetometerBiasEstimate>, EpsilonComparable<MagnetometerBiasEstimate>
{
   /**
            * time since system start (microseconds)
            */
   public long timestamp_;
   /**
            * estimated X-bias of all the sensors
            */
   public float[] bias_x_;
   /**
            * estimated Y-bias of all the sensors
            */
   public float[] bias_y_;
   /**
            * estimated Z-bias of all the sensors
            */
   public float[] bias_z_;
   /**
            * true if the estimator has converged
            */
   public boolean[] valid_;
   public boolean[] stable_;

   public MagnetometerBiasEstimate()
   {
      bias_x_ = new float[4];

      bias_y_ = new float[4];

      bias_z_ = new float[4];

      valid_ = new boolean[4];

      stable_ = new boolean[4];

   }

   public MagnetometerBiasEstimate(MagnetometerBiasEstimate other)
   {
      this();
      set(other);
   }

   public void set(MagnetometerBiasEstimate other)
   {
      timestamp_ = other.timestamp_;

      for(int i1 = 0; i1 < bias_x_.length; ++i1)
      {
            bias_x_[i1] = other.bias_x_[i1];

      }

      for(int i3 = 0; i3 < bias_y_.length; ++i3)
      {
            bias_y_[i3] = other.bias_y_[i3];

      }

      for(int i5 = 0; i5 < bias_z_.length; ++i5)
      {
            bias_z_[i5] = other.bias_z_[i5];

      }

      for(int i7 = 0; i7 < valid_.length; ++i7)
      {
            valid_[i7] = other.valid_[i7];

      }

      for(int i9 = 0; i9 < stable_.length; ++i9)
      {
            stable_[i9] = other.stable_[i9];

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
            * estimated X-bias of all the sensors
            */
   public float[] getBiasX()
   {
      return bias_x_;
   }


   /**
            * estimated Y-bias of all the sensors
            */
   public float[] getBiasY()
   {
      return bias_y_;
   }


   /**
            * estimated Z-bias of all the sensors
            */
   public float[] getBiasZ()
   {
      return bias_z_;
   }


   /**
            * true if the estimator has converged
            */
   public boolean[] getValid()
   {
      return valid_;
   }


   public boolean[] getStable()
   {
      return stable_;
   }


   public static Supplier<MagnetometerBiasEstimatePubSubType> getPubSubType()
   {
      return MagnetometerBiasEstimatePubSubType::new;
   }

   @Override
   public Supplier<TopicDataType> getPubSubTypePacket()
   {
      return MagnetometerBiasEstimatePubSubType::new;
   }

   @Override
   public boolean epsilonEquals(MagnetometerBiasEstimate other, double epsilon)
   {
      if(other == null) return false;
      if(other == this) return true;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_, other.timestamp_, epsilon)) return false;

      for(int i11 = 0; i11 < bias_x_.length; ++i11)
      {
                if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.bias_x_[i11], other.bias_x_[i11], epsilon)) return false;
      }

      for(int i13 = 0; i13 < bias_y_.length; ++i13)
      {
                if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.bias_y_[i13], other.bias_y_[i13], epsilon)) return false;
      }

      for(int i15 = 0; i15 < bias_z_.length; ++i15)
      {
                if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.bias_z_[i15], other.bias_z_[i15], epsilon)) return false;
      }

      for(int i17 = 0; i17 < valid_.length; ++i17)
      {
                if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.valid_[i17], other.valid_[i17], epsilon)) return false;

      }

      for(int i19 = 0; i19 < stable_.length; ++i19)
      {
                if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.stable_[i19], other.stable_[i19], epsilon)) return false;

      }


      return true;
   }

   @Override
   public boolean equals(Object other)
   {
      if(other == null) return false;
      if(other == this) return true;
      if(!(other instanceof MagnetometerBiasEstimate)) return false;

      MagnetometerBiasEstimate otherMyClass = (MagnetometerBiasEstimate) other;

      if(this.timestamp_ != otherMyClass.timestamp_) return false;

      for(int i21 = 0; i21 < bias_x_.length; ++i21)
      {
                if(this.bias_x_[i21] != otherMyClass.bias_x_[i21]) return false;

      }
      for(int i23 = 0; i23 < bias_y_.length; ++i23)
      {
                if(this.bias_y_[i23] != otherMyClass.bias_y_[i23]) return false;

      }
      for(int i25 = 0; i25 < bias_z_.length; ++i25)
      {
                if(this.bias_z_[i25] != otherMyClass.bias_z_[i25]) return false;

      }
      for(int i27 = 0; i27 < valid_.length; ++i27)
      {
                if(this.valid_[i27] != otherMyClass.valid_[i27]) return false;

      }
      for(int i29 = 0; i29 < stable_.length; ++i29)
      {
                if(this.stable_[i29] != otherMyClass.stable_[i29]) return false;

      }

      return true;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("MagnetometerBiasEstimate {");
      builder.append("timestamp=");
      builder.append(this.timestamp_);      builder.append(", ");
      builder.append("bias_x=");
      builder.append(java.util.Arrays.toString(this.bias_x_));      builder.append(", ");
      builder.append("bias_y=");
      builder.append(java.util.Arrays.toString(this.bias_y_));      builder.append(", ");
      builder.append("bias_z=");
      builder.append(java.util.Arrays.toString(this.bias_z_));      builder.append(", ");
      builder.append("valid=");
      builder.append(java.util.Arrays.toString(this.valid_));      builder.append(", ");
      builder.append("stable=");
      builder.append(java.util.Arrays.toString(this.stable_));
      builder.append("}");
      return builder.toString();
   }
}
