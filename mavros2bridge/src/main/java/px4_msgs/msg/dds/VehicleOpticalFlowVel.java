package px4_msgs.msg.dds;

import us.ihmc.communication.packets.Packet;
import us.ihmc.euclid.interfaces.Settable;
import us.ihmc.euclid.interfaces.EpsilonComparable;
import java.util.function.Supplier;
import us.ihmc.pubsub.TopicDataType;

public class VehicleOpticalFlowVel extends Packet<VehicleOpticalFlowVel> implements Settable<VehicleOpticalFlowVel>, EpsilonComparable<VehicleOpticalFlowVel>
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
            * velocity obtained from gyro-compensated and distance-scaled optical flow raw measurements in body frame(m/s)
            */
   public float[] vel_body_;
   /**
            * same as vel_body but in local frame (m/s)
            */
   public float[] vel_ne_;
   /**
            * filtered velocity obtained from gyro-compensated and distance-scaled optical flow raw measurements in body frame(m/s)
            */
   public float[] vel_body_filtered_;
   /**
            * filtered same as vel_body_filtered but in local frame (m/s)
            */
   public float[] vel_ne_filtered_;
   /**
            * integrated optical flow measurement (rad/s)
            */
   public float[] flow_rate_uncompensated_;
   /**
            * integrated optical flow measurement compensated for angular motion (rad/s)
            */
   public float[] flow_rate_compensated_;
   /**
            * gyro measurement synchronized with flow measurements (rad/s)
            */
   public float[] gyro_rate_;
   public float[] gyro_bias_;
   public float[] ref_gyro_;

   public VehicleOpticalFlowVel()
   {
      vel_body_ = new float[2];

      vel_ne_ = new float[2];

      vel_body_filtered_ = new float[2];

      vel_ne_filtered_ = new float[2];

      flow_rate_uncompensated_ = new float[2];

      flow_rate_compensated_ = new float[2];

      gyro_rate_ = new float[3];

      gyro_bias_ = new float[3];

      ref_gyro_ = new float[3];

   }

   public VehicleOpticalFlowVel(VehicleOpticalFlowVel other)
   {
      this();
      set(other);
   }

   public void set(VehicleOpticalFlowVel other)
   {
      timestamp_ = other.timestamp_;

      timestamp_sample_ = other.timestamp_sample_;

      for(int i1 = 0; i1 < vel_body_.length; ++i1)
      {
            vel_body_[i1] = other.vel_body_[i1];

      }

      for(int i3 = 0; i3 < vel_ne_.length; ++i3)
      {
            vel_ne_[i3] = other.vel_ne_[i3];

      }

      for(int i5 = 0; i5 < vel_body_filtered_.length; ++i5)
      {
            vel_body_filtered_[i5] = other.vel_body_filtered_[i5];

      }

      for(int i7 = 0; i7 < vel_ne_filtered_.length; ++i7)
      {
            vel_ne_filtered_[i7] = other.vel_ne_filtered_[i7];

      }

      for(int i9 = 0; i9 < flow_rate_uncompensated_.length; ++i9)
      {
            flow_rate_uncompensated_[i9] = other.flow_rate_uncompensated_[i9];

      }

      for(int i11 = 0; i11 < flow_rate_compensated_.length; ++i11)
      {
            flow_rate_compensated_[i11] = other.flow_rate_compensated_[i11];

      }

      for(int i13 = 0; i13 < gyro_rate_.length; ++i13)
      {
            gyro_rate_[i13] = other.gyro_rate_[i13];

      }

      for(int i15 = 0; i15 < gyro_bias_.length; ++i15)
      {
            gyro_bias_[i15] = other.gyro_bias_[i15];

      }

      for(int i17 = 0; i17 < ref_gyro_.length; ++i17)
      {
            ref_gyro_[i17] = other.ref_gyro_[i17];

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
            * velocity obtained from gyro-compensated and distance-scaled optical flow raw measurements in body frame(m/s)
            */
   public float[] getVelBody()
   {
      return vel_body_;
   }


   /**
            * same as vel_body but in local frame (m/s)
            */
   public float[] getVelNe()
   {
      return vel_ne_;
   }


   /**
            * filtered velocity obtained from gyro-compensated and distance-scaled optical flow raw measurements in body frame(m/s)
            */
   public float[] getVelBodyFiltered()
   {
      return vel_body_filtered_;
   }


   /**
            * filtered same as vel_body_filtered but in local frame (m/s)
            */
   public float[] getVelNeFiltered()
   {
      return vel_ne_filtered_;
   }


   /**
            * integrated optical flow measurement (rad/s)
            */
   public float[] getFlowRateUncompensated()
   {
      return flow_rate_uncompensated_;
   }


   /**
            * integrated optical flow measurement compensated for angular motion (rad/s)
            */
   public float[] getFlowRateCompensated()
   {
      return flow_rate_compensated_;
   }


   /**
            * gyro measurement synchronized with flow measurements (rad/s)
            */
   public float[] getGyroRate()
   {
      return gyro_rate_;
   }


   public float[] getGyroBias()
   {
      return gyro_bias_;
   }


   public float[] getRefGyro()
   {
      return ref_gyro_;
   }


   public static Supplier<VehicleOpticalFlowVelPubSubType> getPubSubType()
   {
      return VehicleOpticalFlowVelPubSubType::new;
   }

   @Override
   public Supplier<TopicDataType> getPubSubTypePacket()
   {
      return VehicleOpticalFlowVelPubSubType::new;
   }

   @Override
   public boolean epsilonEquals(VehicleOpticalFlowVel other, double epsilon)
   {
      if(other == null) return false;
      if(other == this) return true;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_, other.timestamp_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_sample_, other.timestamp_sample_, epsilon)) return false;

      for(int i19 = 0; i19 < vel_body_.length; ++i19)
      {
                if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.vel_body_[i19], other.vel_body_[i19], epsilon)) return false;
      }

      for(int i21 = 0; i21 < vel_ne_.length; ++i21)
      {
                if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.vel_ne_[i21], other.vel_ne_[i21], epsilon)) return false;
      }

      for(int i23 = 0; i23 < vel_body_filtered_.length; ++i23)
      {
                if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.vel_body_filtered_[i23], other.vel_body_filtered_[i23], epsilon)) return false;
      }

      for(int i25 = 0; i25 < vel_ne_filtered_.length; ++i25)
      {
                if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.vel_ne_filtered_[i25], other.vel_ne_filtered_[i25], epsilon)) return false;
      }

      for(int i27 = 0; i27 < flow_rate_uncompensated_.length; ++i27)
      {
                if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.flow_rate_uncompensated_[i27], other.flow_rate_uncompensated_[i27], epsilon)) return false;
      }

      for(int i29 = 0; i29 < flow_rate_compensated_.length; ++i29)
      {
                if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.flow_rate_compensated_[i29], other.flow_rate_compensated_[i29], epsilon)) return false;
      }

      for(int i31 = 0; i31 < gyro_rate_.length; ++i31)
      {
                if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.gyro_rate_[i31], other.gyro_rate_[i31], epsilon)) return false;
      }

      for(int i33 = 0; i33 < gyro_bias_.length; ++i33)
      {
                if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.gyro_bias_[i33], other.gyro_bias_[i33], epsilon)) return false;
      }

      for(int i35 = 0; i35 < ref_gyro_.length; ++i35)
      {
                if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.ref_gyro_[i35], other.ref_gyro_[i35], epsilon)) return false;
      }


      return true;
   }

   @Override
   public boolean equals(Object other)
   {
      if(other == null) return false;
      if(other == this) return true;
      if(!(other instanceof VehicleOpticalFlowVel)) return false;

      VehicleOpticalFlowVel otherMyClass = (VehicleOpticalFlowVel) other;

      if(this.timestamp_ != otherMyClass.timestamp_) return false;

      if(this.timestamp_sample_ != otherMyClass.timestamp_sample_) return false;

      for(int i37 = 0; i37 < vel_body_.length; ++i37)
      {
                if(this.vel_body_[i37] != otherMyClass.vel_body_[i37]) return false;

      }
      for(int i39 = 0; i39 < vel_ne_.length; ++i39)
      {
                if(this.vel_ne_[i39] != otherMyClass.vel_ne_[i39]) return false;

      }
      for(int i41 = 0; i41 < vel_body_filtered_.length; ++i41)
      {
                if(this.vel_body_filtered_[i41] != otherMyClass.vel_body_filtered_[i41]) return false;

      }
      for(int i43 = 0; i43 < vel_ne_filtered_.length; ++i43)
      {
                if(this.vel_ne_filtered_[i43] != otherMyClass.vel_ne_filtered_[i43]) return false;

      }
      for(int i45 = 0; i45 < flow_rate_uncompensated_.length; ++i45)
      {
                if(this.flow_rate_uncompensated_[i45] != otherMyClass.flow_rate_uncompensated_[i45]) return false;

      }
      for(int i47 = 0; i47 < flow_rate_compensated_.length; ++i47)
      {
                if(this.flow_rate_compensated_[i47] != otherMyClass.flow_rate_compensated_[i47]) return false;

      }
      for(int i49 = 0; i49 < gyro_rate_.length; ++i49)
      {
                if(this.gyro_rate_[i49] != otherMyClass.gyro_rate_[i49]) return false;

      }
      for(int i51 = 0; i51 < gyro_bias_.length; ++i51)
      {
                if(this.gyro_bias_[i51] != otherMyClass.gyro_bias_[i51]) return false;

      }
      for(int i53 = 0; i53 < ref_gyro_.length; ++i53)
      {
                if(this.ref_gyro_[i53] != otherMyClass.ref_gyro_[i53]) return false;

      }

      return true;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("VehicleOpticalFlowVel {");
      builder.append("timestamp=");
      builder.append(this.timestamp_);      builder.append(", ");
      builder.append("timestamp_sample=");
      builder.append(this.timestamp_sample_);      builder.append(", ");
      builder.append("vel_body=");
      builder.append(java.util.Arrays.toString(this.vel_body_));      builder.append(", ");
      builder.append("vel_ne=");
      builder.append(java.util.Arrays.toString(this.vel_ne_));      builder.append(", ");
      builder.append("vel_body_filtered=");
      builder.append(java.util.Arrays.toString(this.vel_body_filtered_));      builder.append(", ");
      builder.append("vel_ne_filtered=");
      builder.append(java.util.Arrays.toString(this.vel_ne_filtered_));      builder.append(", ");
      builder.append("flow_rate_uncompensated=");
      builder.append(java.util.Arrays.toString(this.flow_rate_uncompensated_));      builder.append(", ");
      builder.append("flow_rate_compensated=");
      builder.append(java.util.Arrays.toString(this.flow_rate_compensated_));      builder.append(", ");
      builder.append("gyro_rate=");
      builder.append(java.util.Arrays.toString(this.gyro_rate_));      builder.append(", ");
      builder.append("gyro_bias=");
      builder.append(java.util.Arrays.toString(this.gyro_bias_));      builder.append(", ");
      builder.append("ref_gyro=");
      builder.append(java.util.Arrays.toString(this.ref_gyro_));
      builder.append("}");
      return builder.toString();
   }
}
