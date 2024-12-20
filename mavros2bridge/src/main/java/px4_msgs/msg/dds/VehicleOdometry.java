package px4_msgs.msg.dds;

import us.ihmc.communication.packets.Packet;
import us.ihmc.euclid.interfaces.Settable;
import us.ihmc.euclid.interfaces.EpsilonComparable;
import java.util.function.Supplier;
import us.ihmc.pubsub.TopicDataType;

public class VehicleOdometry extends Packet<VehicleOdometry> implements Settable<VehicleOdometry>, EpsilonComparable<VehicleOdometry>
{
   public static final byte POSE_FRAME_UNKNOWN = (byte) 0;
   /**
          * NED earth-fixed frame
          */
   public static final byte POSE_FRAME_NED = (byte) 1;
   /**
          * FRD world-fixed frame, arbitrary heading reference
          */
   public static final byte POSE_FRAME_FRD = (byte) 2;
   public static final byte VELOCITY_FRAME_UNKNOWN = (byte) 0;
   /**
          * NED earth-fixed frame
          */
   public static final byte VELOCITY_FRAME_NED = (byte) 1;
   /**
          * FRD world-fixed frame, arbitrary heading reference
          */
   public static final byte VELOCITY_FRAME_FRD = (byte) 2;
   /**
          * FRD body-fixed frame
          */
   public static final byte VELOCITY_FRAME_BODY_FRD = (byte) 3;
   /**
            * Vehicle odometry data. Fits ROS REP 147 for aerial vehicles
            * time since system start (microseconds)
            */
   public long timestamp_;
   public long timestamp_sample_;
   /**
            * Position and orientation frame of reference
            */
   public byte pose_frame_;
   /**
            * Position in meters. Frame of reference defined by local_frame. NaN if invalid/unknown
            */
   public float[] position_;
   /**
            * Quaternion rotation from FRD body frame to reference frame. First value NaN if invalid/unknown
            */
   public float[] q_;
   /**
            * Reference frame of the velocity data
            */
   public byte velocity_frame_;
   /**
            * Velocity in meters/sec. Frame of reference defined by velocity_frame variable. NaN if invalid/unknown
            */
   public float[] velocity_;
   /**
            * Angular velocity in body-fixed frame (rad/s). NaN if invalid/unknown
            */
   public float[] angular_velocity_;
   public float[] position_variance_;
   public float[] orientation_variance_;
   public float[] velocity_variance_;
   public byte reset_counter_;
   public byte quality_;

   public VehicleOdometry()
   {
      position_ = new float[3];

      q_ = new float[4];

      velocity_ = new float[3];

      angular_velocity_ = new float[3];

      position_variance_ = new float[3];

      orientation_variance_ = new float[3];

      velocity_variance_ = new float[3];

   }

   public VehicleOdometry(VehicleOdometry other)
   {
      this();
      set(other);
   }

   public void set(VehicleOdometry other)
   {
      timestamp_ = other.timestamp_;

      timestamp_sample_ = other.timestamp_sample_;

      pose_frame_ = other.pose_frame_;

      for(int i1 = 0; i1 < position_.length; ++i1)
      {
            position_[i1] = other.position_[i1];

      }

      for(int i3 = 0; i3 < q_.length; ++i3)
      {
            q_[i3] = other.q_[i3];

      }

      velocity_frame_ = other.velocity_frame_;

      for(int i5 = 0; i5 < velocity_.length; ++i5)
      {
            velocity_[i5] = other.velocity_[i5];

      }

      for(int i7 = 0; i7 < angular_velocity_.length; ++i7)
      {
            angular_velocity_[i7] = other.angular_velocity_[i7];

      }

      for(int i9 = 0; i9 < position_variance_.length; ++i9)
      {
            position_variance_[i9] = other.position_variance_[i9];

      }

      for(int i11 = 0; i11 < orientation_variance_.length; ++i11)
      {
            orientation_variance_[i11] = other.orientation_variance_[i11];

      }

      for(int i13 = 0; i13 < velocity_variance_.length; ++i13)
      {
            velocity_variance_[i13] = other.velocity_variance_[i13];

      }

      reset_counter_ = other.reset_counter_;

      quality_ = other.quality_;

   }

   /**
            * Vehicle odometry data. Fits ROS REP 147 for aerial vehicles
            * time since system start (microseconds)
            */
   public void setTimestamp(long timestamp)
   {
      timestamp_ = timestamp;
   }
   /**
            * Vehicle odometry data. Fits ROS REP 147 for aerial vehicles
            * time since system start (microseconds)
            */
   public long getTimestamp()
   {
      return timestamp_;
   }

   public void setTimestampSample(long timestamp_sample)
   {
      timestamp_sample_ = timestamp_sample;
   }
   public long getTimestampSample()
   {
      return timestamp_sample_;
   }

   /**
            * Position and orientation frame of reference
            */
   public void setPoseFrame(byte pose_frame)
   {
      pose_frame_ = pose_frame;
   }
   /**
            * Position and orientation frame of reference
            */
   public byte getPoseFrame()
   {
      return pose_frame_;
   }


   /**
            * Position in meters. Frame of reference defined by local_frame. NaN if invalid/unknown
            */
   public float[] getPosition()
   {
      return position_;
   }


   /**
            * Quaternion rotation from FRD body frame to reference frame. First value NaN if invalid/unknown
            */
   public float[] getQ()
   {
      return q_;
   }

   /**
            * Reference frame of the velocity data
            */
   public void setVelocityFrame(byte velocity_frame)
   {
      velocity_frame_ = velocity_frame;
   }
   /**
            * Reference frame of the velocity data
            */
   public byte getVelocityFrame()
   {
      return velocity_frame_;
   }


   /**
            * Velocity in meters/sec. Frame of reference defined by velocity_frame variable. NaN if invalid/unknown
            */
   public float[] getVelocity()
   {
      return velocity_;
   }


   /**
            * Angular velocity in body-fixed frame (rad/s). NaN if invalid/unknown
            */
   public float[] getAngularVelocity()
   {
      return angular_velocity_;
   }


   public float[] getPositionVariance()
   {
      return position_variance_;
   }


   public float[] getOrientationVariance()
   {
      return orientation_variance_;
   }


   public float[] getVelocityVariance()
   {
      return velocity_variance_;
   }

   public void setResetCounter(byte reset_counter)
   {
      reset_counter_ = reset_counter;
   }
   public byte getResetCounter()
   {
      return reset_counter_;
   }

   public void setQuality(byte quality)
   {
      quality_ = quality;
   }
   public byte getQuality()
   {
      return quality_;
   }


   public static Supplier<VehicleOdometryPubSubType> getPubSubType()
   {
      return VehicleOdometryPubSubType::new;
   }

   @Override
   public Supplier<TopicDataType> getPubSubTypePacket()
   {
      return VehicleOdometryPubSubType::new;
   }

   @Override
   public boolean epsilonEquals(VehicleOdometry other, double epsilon)
   {
      if(other == null) return false;
      if(other == this) return true;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_, other.timestamp_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_sample_, other.timestamp_sample_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.pose_frame_, other.pose_frame_, epsilon)) return false;

      for(int i15 = 0; i15 < position_.length; ++i15)
      {
                if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.position_[i15], other.position_[i15], epsilon)) return false;
      }

      for(int i17 = 0; i17 < q_.length; ++i17)
      {
                if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.q_[i17], other.q_[i17], epsilon)) return false;
      }

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.velocity_frame_, other.velocity_frame_, epsilon)) return false;

      for(int i19 = 0; i19 < velocity_.length; ++i19)
      {
                if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.velocity_[i19], other.velocity_[i19], epsilon)) return false;
      }

      for(int i21 = 0; i21 < angular_velocity_.length; ++i21)
      {
                if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.angular_velocity_[i21], other.angular_velocity_[i21], epsilon)) return false;
      }

      for(int i23 = 0; i23 < position_variance_.length; ++i23)
      {
                if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.position_variance_[i23], other.position_variance_[i23], epsilon)) return false;
      }

      for(int i25 = 0; i25 < orientation_variance_.length; ++i25)
      {
                if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.orientation_variance_[i25], other.orientation_variance_[i25], epsilon)) return false;
      }

      for(int i27 = 0; i27 < velocity_variance_.length; ++i27)
      {
                if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.velocity_variance_[i27], other.velocity_variance_[i27], epsilon)) return false;
      }

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.reset_counter_, other.reset_counter_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.quality_, other.quality_, epsilon)) return false;


      return true;
   }

   @Override
   public boolean equals(Object other)
   {
      if(other == null) return false;
      if(other == this) return true;
      if(!(other instanceof VehicleOdometry)) return false;

      VehicleOdometry otherMyClass = (VehicleOdometry) other;

      if(this.timestamp_ != otherMyClass.timestamp_) return false;

      if(this.timestamp_sample_ != otherMyClass.timestamp_sample_) return false;

      if(this.pose_frame_ != otherMyClass.pose_frame_) return false;

      for(int i29 = 0; i29 < position_.length; ++i29)
      {
                if(this.position_[i29] != otherMyClass.position_[i29]) return false;

      }
      for(int i31 = 0; i31 < q_.length; ++i31)
      {
                if(this.q_[i31] != otherMyClass.q_[i31]) return false;

      }
      if(this.velocity_frame_ != otherMyClass.velocity_frame_) return false;

      for(int i33 = 0; i33 < velocity_.length; ++i33)
      {
                if(this.velocity_[i33] != otherMyClass.velocity_[i33]) return false;

      }
      for(int i35 = 0; i35 < angular_velocity_.length; ++i35)
      {
                if(this.angular_velocity_[i35] != otherMyClass.angular_velocity_[i35]) return false;

      }
      for(int i37 = 0; i37 < position_variance_.length; ++i37)
      {
                if(this.position_variance_[i37] != otherMyClass.position_variance_[i37]) return false;

      }
      for(int i39 = 0; i39 < orientation_variance_.length; ++i39)
      {
                if(this.orientation_variance_[i39] != otherMyClass.orientation_variance_[i39]) return false;

      }
      for(int i41 = 0; i41 < velocity_variance_.length; ++i41)
      {
                if(this.velocity_variance_[i41] != otherMyClass.velocity_variance_[i41]) return false;

      }
      if(this.reset_counter_ != otherMyClass.reset_counter_) return false;

      if(this.quality_ != otherMyClass.quality_) return false;


      return true;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("VehicleOdometry {");
      builder.append("timestamp=");
      builder.append(this.timestamp_);      builder.append(", ");
      builder.append("timestamp_sample=");
      builder.append(this.timestamp_sample_);      builder.append(", ");
      builder.append("pose_frame=");
      builder.append(this.pose_frame_);      builder.append(", ");
      builder.append("position=");
      builder.append(java.util.Arrays.toString(this.position_));      builder.append(", ");
      builder.append("q=");
      builder.append(java.util.Arrays.toString(this.q_));      builder.append(", ");
      builder.append("velocity_frame=");
      builder.append(this.velocity_frame_);      builder.append(", ");
      builder.append("velocity=");
      builder.append(java.util.Arrays.toString(this.velocity_));      builder.append(", ");
      builder.append("angular_velocity=");
      builder.append(java.util.Arrays.toString(this.angular_velocity_));      builder.append(", ");
      builder.append("position_variance=");
      builder.append(java.util.Arrays.toString(this.position_variance_));      builder.append(", ");
      builder.append("orientation_variance=");
      builder.append(java.util.Arrays.toString(this.orientation_variance_));      builder.append(", ");
      builder.append("velocity_variance=");
      builder.append(java.util.Arrays.toString(this.velocity_variance_));      builder.append(", ");
      builder.append("reset_counter=");
      builder.append(this.reset_counter_);      builder.append(", ");
      builder.append("quality=");
      builder.append(this.quality_);
      builder.append("}");
      return builder.toString();
   }
}
