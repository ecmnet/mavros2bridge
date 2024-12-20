package px4_msgs.msg.dds;

import us.ihmc.communication.packets.Packet;
import us.ihmc.euclid.interfaces.Settable;
import us.ihmc.euclid.interfaces.EpsilonComparable;
import java.util.function.Supplier;
import us.ihmc.pubsub.TopicDataType;

public class MagWorkerData extends Packet<MagWorkerData> implements Settable<MagWorkerData>, EpsilonComparable<MagWorkerData>
{
   public static final byte MAX_MAGS = (byte) 4;/**
            * time since system start (microseconds)
            */
   public long timestamp_;
   public long timestamp_sample_;
   public long done_count_;
   public long calibration_points_perside_;
   public long calibration_interval_perside_us_;
   public boolean[] side_data_collected_;
   public float[] x_;
   public float[] y_;
   public float[] z_;

   public MagWorkerData()
   {
      side_data_collected_ = new boolean[4];

      x_ = new float[4];

      y_ = new float[4];

      z_ = new float[4];

   }

   public MagWorkerData(MagWorkerData other)
   {
      this();
      set(other);
   }

   public void set(MagWorkerData other)
   {
      timestamp_ = other.timestamp_;

      timestamp_sample_ = other.timestamp_sample_;

      done_count_ = other.done_count_;

      calibration_points_perside_ = other.calibration_points_perside_;

      calibration_interval_perside_us_ = other.calibration_interval_perside_us_;

      for(int i1 = 0; i1 < side_data_collected_.length; ++i1)
      {
            side_data_collected_[i1] = other.side_data_collected_[i1];

      }

      for(int i3 = 0; i3 < x_.length; ++i3)
      {
            x_[i3] = other.x_[i3];

      }

      for(int i5 = 0; i5 < y_.length; ++i5)
      {
            y_[i5] = other.y_[i5];

      }

      for(int i7 = 0; i7 < z_.length; ++i7)
      {
            z_[i7] = other.z_[i7];

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

   public void setTimestampSample(long timestamp_sample)
   {
      timestamp_sample_ = timestamp_sample;
   }
   public long getTimestampSample()
   {
      return timestamp_sample_;
   }

   public void setDoneCount(long done_count)
   {
      done_count_ = done_count;
   }
   public long getDoneCount()
   {
      return done_count_;
   }

   public void setCalibrationPointsPerside(long calibration_points_perside)
   {
      calibration_points_perside_ = calibration_points_perside;
   }
   public long getCalibrationPointsPerside()
   {
      return calibration_points_perside_;
   }

   public void setCalibrationIntervalPersideUs(long calibration_interval_perside_us)
   {
      calibration_interval_perside_us_ = calibration_interval_perside_us;
   }
   public long getCalibrationIntervalPersideUs()
   {
      return calibration_interval_perside_us_;
   }


   public boolean[] getSideDataCollected()
   {
      return side_data_collected_;
   }


   public float[] getX()
   {
      return x_;
   }


   public float[] getY()
   {
      return y_;
   }


   public float[] getZ()
   {
      return z_;
   }


   public static Supplier<MagWorkerDataPubSubType> getPubSubType()
   {
      return MagWorkerDataPubSubType::new;
   }

   @Override
   public Supplier<TopicDataType> getPubSubTypePacket()
   {
      return MagWorkerDataPubSubType::new;
   }

   @Override
   public boolean epsilonEquals(MagWorkerData other, double epsilon)
   {
      if(other == null) return false;
      if(other == this) return true;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_, other.timestamp_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_sample_, other.timestamp_sample_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.done_count_, other.done_count_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.calibration_points_perside_, other.calibration_points_perside_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.calibration_interval_perside_us_, other.calibration_interval_perside_us_, epsilon)) return false;

      for(int i9 = 0; i9 < side_data_collected_.length; ++i9)
      {
                if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.side_data_collected_[i9], other.side_data_collected_[i9], epsilon)) return false;

      }

      for(int i11 = 0; i11 < x_.length; ++i11)
      {
                if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.x_[i11], other.x_[i11], epsilon)) return false;
      }

      for(int i13 = 0; i13 < y_.length; ++i13)
      {
                if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.y_[i13], other.y_[i13], epsilon)) return false;
      }

      for(int i15 = 0; i15 < z_.length; ++i15)
      {
                if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.z_[i15], other.z_[i15], epsilon)) return false;
      }


      return true;
   }

   @Override
   public boolean equals(Object other)
   {
      if(other == null) return false;
      if(other == this) return true;
      if(!(other instanceof MagWorkerData)) return false;

      MagWorkerData otherMyClass = (MagWorkerData) other;

      if(this.timestamp_ != otherMyClass.timestamp_) return false;

      if(this.timestamp_sample_ != otherMyClass.timestamp_sample_) return false;

      if(this.done_count_ != otherMyClass.done_count_) return false;

      if(this.calibration_points_perside_ != otherMyClass.calibration_points_perside_) return false;

      if(this.calibration_interval_perside_us_ != otherMyClass.calibration_interval_perside_us_) return false;

      for(int i17 = 0; i17 < side_data_collected_.length; ++i17)
      {
                if(this.side_data_collected_[i17] != otherMyClass.side_data_collected_[i17]) return false;

      }
      for(int i19 = 0; i19 < x_.length; ++i19)
      {
                if(this.x_[i19] != otherMyClass.x_[i19]) return false;

      }
      for(int i21 = 0; i21 < y_.length; ++i21)
      {
                if(this.y_[i21] != otherMyClass.y_[i21]) return false;

      }
      for(int i23 = 0; i23 < z_.length; ++i23)
      {
                if(this.z_[i23] != otherMyClass.z_[i23]) return false;

      }

      return true;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("MagWorkerData {");
      builder.append("timestamp=");
      builder.append(this.timestamp_);      builder.append(", ");
      builder.append("timestamp_sample=");
      builder.append(this.timestamp_sample_);      builder.append(", ");
      builder.append("done_count=");
      builder.append(this.done_count_);      builder.append(", ");
      builder.append("calibration_points_perside=");
      builder.append(this.calibration_points_perside_);      builder.append(", ");
      builder.append("calibration_interval_perside_us=");
      builder.append(this.calibration_interval_perside_us_);      builder.append(", ");
      builder.append("side_data_collected=");
      builder.append(java.util.Arrays.toString(this.side_data_collected_));      builder.append(", ");
      builder.append("x=");
      builder.append(java.util.Arrays.toString(this.x_));      builder.append(", ");
      builder.append("y=");
      builder.append(java.util.Arrays.toString(this.y_));      builder.append(", ");
      builder.append("z=");
      builder.append(java.util.Arrays.toString(this.z_));
      builder.append("}");
      return builder.toString();
   }
}
