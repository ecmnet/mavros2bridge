package px4_msgs.msg.dds;

import us.ihmc.communication.packets.Packet;
import us.ihmc.euclid.interfaces.Settable;
import us.ihmc.euclid.interfaces.EpsilonComparable;
import java.util.function.Supplier;
import us.ihmc.pubsub.TopicDataType;

public class SensorOpticalFlow extends Packet<SensorOpticalFlow> implements Settable<SensorOpticalFlow>, EpsilonComparable<SensorOpticalFlow>
{
   public static final byte MODE_UNKNOWN = (byte) 0;
   public static final byte MODE_BRIGHT = (byte) 1;
   public static final byte MODE_LOWLIGHT = (byte) 2;
   public static final byte MODE_SUPER_LOWLIGHT = (byte) 3;
   /**
            * time since system start (microseconds)
            */
   public long timestamp_;
   public long timestamp_sample_;
   /**
            * unique device ID for the sensor that does not change between power cycles
            */
   public long device_id_;
   /**
            * (radians) optical flow in radians where a positive value is produced by a RH rotation about the body axis
            */
   public float[] pixel_flow_;
   /**
            * (radians) accumulated gyro radians where a positive value is produced by a RH rotation about the body axis. Set to NaN if flow sensor does not have 3-axis gyro data.
            */
   public float[] delta_angle_;
   public boolean delta_angle_available_;
   /**
            * (meters) Distance to the center of the flow field
            */
   public float distance_m_;
   public boolean distance_available_;
   /**
            * (microseconds) accumulation timespan in microseconds
            */
   public long integration_timespan_us_;
   /**
            * quality, 0: bad quality, 255: maximum quality
            */
   public byte quality_;
   public long error_count_;
   /**
            * (radians/s) Magnitude of maximum angular which the optical flow sensor can measure reliably
            */
   public float max_flow_rate_;
   /**
            * (meters) Minimum distance from ground at which the optical flow sensor operates reliably
            */
   public float min_ground_distance_;
   /**
            * (meters) Maximum distance from ground at which the optical flow sensor operates reliably
            */
   public float max_ground_distance_;
   public byte mode_;

   public SensorOpticalFlow()
   {
      pixel_flow_ = new float[2];

      delta_angle_ = new float[3];

   }

   public SensorOpticalFlow(SensorOpticalFlow other)
   {
      this();
      set(other);
   }

   public void set(SensorOpticalFlow other)
   {
      timestamp_ = other.timestamp_;

      timestamp_sample_ = other.timestamp_sample_;

      device_id_ = other.device_id_;

      for(int i1 = 0; i1 < pixel_flow_.length; ++i1)
      {
            pixel_flow_[i1] = other.pixel_flow_[i1];

      }

      for(int i3 = 0; i3 < delta_angle_.length; ++i3)
      {
            delta_angle_[i3] = other.delta_angle_[i3];

      }

      delta_angle_available_ = other.delta_angle_available_;

      distance_m_ = other.distance_m_;

      distance_available_ = other.distance_available_;

      integration_timespan_us_ = other.integration_timespan_us_;

      quality_ = other.quality_;

      error_count_ = other.error_count_;

      max_flow_rate_ = other.max_flow_rate_;

      min_ground_distance_ = other.min_ground_distance_;

      max_ground_distance_ = other.max_ground_distance_;

      mode_ = other.mode_;

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

   /**
            * unique device ID for the sensor that does not change between power cycles
            */
   public void setDeviceId(long device_id)
   {
      device_id_ = device_id;
   }
   /**
            * unique device ID for the sensor that does not change between power cycles
            */
   public long getDeviceId()
   {
      return device_id_;
   }


   /**
            * (radians) optical flow in radians where a positive value is produced by a RH rotation about the body axis
            */
   public float[] getPixelFlow()
   {
      return pixel_flow_;
   }


   /**
            * (radians) accumulated gyro radians where a positive value is produced by a RH rotation about the body axis. Set to NaN if flow sensor does not have 3-axis gyro data.
            */
   public float[] getDeltaAngle()
   {
      return delta_angle_;
   }

   public void setDeltaAngleAvailable(boolean delta_angle_available)
   {
      delta_angle_available_ = delta_angle_available;
   }
   public boolean getDeltaAngleAvailable()
   {
      return delta_angle_available_;
   }

   /**
            * (meters) Distance to the center of the flow field
            */
   public void setDistanceM(float distance_m)
   {
      distance_m_ = distance_m;
   }
   /**
            * (meters) Distance to the center of the flow field
            */
   public float getDistanceM()
   {
      return distance_m_;
   }

   public void setDistanceAvailable(boolean distance_available)
   {
      distance_available_ = distance_available;
   }
   public boolean getDistanceAvailable()
   {
      return distance_available_;
   }

   /**
            * (microseconds) accumulation timespan in microseconds
            */
   public void setIntegrationTimespanUs(long integration_timespan_us)
   {
      integration_timespan_us_ = integration_timespan_us;
   }
   /**
            * (microseconds) accumulation timespan in microseconds
            */
   public long getIntegrationTimespanUs()
   {
      return integration_timespan_us_;
   }

   /**
            * quality, 0: bad quality, 255: maximum quality
            */
   public void setQuality(byte quality)
   {
      quality_ = quality;
   }
   /**
            * quality, 0: bad quality, 255: maximum quality
            */
   public byte getQuality()
   {
      return quality_;
   }

   public void setErrorCount(long error_count)
   {
      error_count_ = error_count;
   }
   public long getErrorCount()
   {
      return error_count_;
   }

   /**
            * (radians/s) Magnitude of maximum angular which the optical flow sensor can measure reliably
            */
   public void setMaxFlowRate(float max_flow_rate)
   {
      max_flow_rate_ = max_flow_rate;
   }
   /**
            * (radians/s) Magnitude of maximum angular which the optical flow sensor can measure reliably
            */
   public float getMaxFlowRate()
   {
      return max_flow_rate_;
   }

   /**
            * (meters) Minimum distance from ground at which the optical flow sensor operates reliably
            */
   public void setMinGroundDistance(float min_ground_distance)
   {
      min_ground_distance_ = min_ground_distance;
   }
   /**
            * (meters) Minimum distance from ground at which the optical flow sensor operates reliably
            */
   public float getMinGroundDistance()
   {
      return min_ground_distance_;
   }

   /**
            * (meters) Maximum distance from ground at which the optical flow sensor operates reliably
            */
   public void setMaxGroundDistance(float max_ground_distance)
   {
      max_ground_distance_ = max_ground_distance;
   }
   /**
            * (meters) Maximum distance from ground at which the optical flow sensor operates reliably
            */
   public float getMaxGroundDistance()
   {
      return max_ground_distance_;
   }

   public void setMode(byte mode)
   {
      mode_ = mode;
   }
   public byte getMode()
   {
      return mode_;
   }


   public static Supplier<SensorOpticalFlowPubSubType> getPubSubType()
   {
      return SensorOpticalFlowPubSubType::new;
   }

   @Override
   public Supplier<TopicDataType> getPubSubTypePacket()
   {
      return SensorOpticalFlowPubSubType::new;
   }

   @Override
   public boolean epsilonEquals(SensorOpticalFlow other, double epsilon)
   {
      if(other == null) return false;
      if(other == this) return true;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_, other.timestamp_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_sample_, other.timestamp_sample_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.device_id_, other.device_id_, epsilon)) return false;

      for(int i5 = 0; i5 < pixel_flow_.length; ++i5)
      {
                if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.pixel_flow_[i5], other.pixel_flow_[i5], epsilon)) return false;
      }

      for(int i7 = 0; i7 < delta_angle_.length; ++i7)
      {
                if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.delta_angle_[i7], other.delta_angle_[i7], epsilon)) return false;
      }

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.delta_angle_available_, other.delta_angle_available_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.distance_m_, other.distance_m_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.distance_available_, other.distance_available_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.integration_timespan_us_, other.integration_timespan_us_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.quality_, other.quality_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.error_count_, other.error_count_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.max_flow_rate_, other.max_flow_rate_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.min_ground_distance_, other.min_ground_distance_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.max_ground_distance_, other.max_ground_distance_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.mode_, other.mode_, epsilon)) return false;


      return true;
   }

   @Override
   public boolean equals(Object other)
   {
      if(other == null) return false;
      if(other == this) return true;
      if(!(other instanceof SensorOpticalFlow)) return false;

      SensorOpticalFlow otherMyClass = (SensorOpticalFlow) other;

      if(this.timestamp_ != otherMyClass.timestamp_) return false;

      if(this.timestamp_sample_ != otherMyClass.timestamp_sample_) return false;

      if(this.device_id_ != otherMyClass.device_id_) return false;

      for(int i9 = 0; i9 < pixel_flow_.length; ++i9)
      {
                if(this.pixel_flow_[i9] != otherMyClass.pixel_flow_[i9]) return false;

      }
      for(int i11 = 0; i11 < delta_angle_.length; ++i11)
      {
                if(this.delta_angle_[i11] != otherMyClass.delta_angle_[i11]) return false;

      }
      if(this.delta_angle_available_ != otherMyClass.delta_angle_available_) return false;

      if(this.distance_m_ != otherMyClass.distance_m_) return false;

      if(this.distance_available_ != otherMyClass.distance_available_) return false;

      if(this.integration_timespan_us_ != otherMyClass.integration_timespan_us_) return false;

      if(this.quality_ != otherMyClass.quality_) return false;

      if(this.error_count_ != otherMyClass.error_count_) return false;

      if(this.max_flow_rate_ != otherMyClass.max_flow_rate_) return false;

      if(this.min_ground_distance_ != otherMyClass.min_ground_distance_) return false;

      if(this.max_ground_distance_ != otherMyClass.max_ground_distance_) return false;

      if(this.mode_ != otherMyClass.mode_) return false;


      return true;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("SensorOpticalFlow {");
      builder.append("timestamp=");
      builder.append(this.timestamp_);      builder.append(", ");
      builder.append("timestamp_sample=");
      builder.append(this.timestamp_sample_);      builder.append(", ");
      builder.append("device_id=");
      builder.append(this.device_id_);      builder.append(", ");
      builder.append("pixel_flow=");
      builder.append(java.util.Arrays.toString(this.pixel_flow_));      builder.append(", ");
      builder.append("delta_angle=");
      builder.append(java.util.Arrays.toString(this.delta_angle_));      builder.append(", ");
      builder.append("delta_angle_available=");
      builder.append(this.delta_angle_available_);      builder.append(", ");
      builder.append("distance_m=");
      builder.append(this.distance_m_);      builder.append(", ");
      builder.append("distance_available=");
      builder.append(this.distance_available_);      builder.append(", ");
      builder.append("integration_timespan_us=");
      builder.append(this.integration_timespan_us_);      builder.append(", ");
      builder.append("quality=");
      builder.append(this.quality_);      builder.append(", ");
      builder.append("error_count=");
      builder.append(this.error_count_);      builder.append(", ");
      builder.append("max_flow_rate=");
      builder.append(this.max_flow_rate_);      builder.append(", ");
      builder.append("min_ground_distance=");
      builder.append(this.min_ground_distance_);      builder.append(", ");
      builder.append("max_ground_distance=");
      builder.append(this.max_ground_distance_);      builder.append(", ");
      builder.append("mode=");
      builder.append(this.mode_);
      builder.append("}");
      return builder.toString();
   }
}
