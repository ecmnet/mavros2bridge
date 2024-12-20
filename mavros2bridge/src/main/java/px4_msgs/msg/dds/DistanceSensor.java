package px4_msgs.msg.dds;

import us.ihmc.communication.packets.Packet;
import us.ihmc.euclid.interfaces.Settable;
import us.ihmc.euclid.interfaces.EpsilonComparable;
import java.util.function.Supplier;
import us.ihmc.pubsub.TopicDataType;

/**
       * DISTANCE_SENSOR message data
       */
public class DistanceSensor extends Packet<DistanceSensor> implements Settable<DistanceSensor>, EpsilonComparable<DistanceSensor>
{
   public static final byte MAV_DISTANCE_SENSOR_LASER = (byte) 0;
   public static final byte MAV_DISTANCE_SENSOR_ULTRASOUND = (byte) 1;
   public static final byte MAV_DISTANCE_SENSOR_INFRARED = (byte) 2;
   public static final byte MAV_DISTANCE_SENSOR_RADAR = (byte) 3;
   /**
          * MAV_SENSOR_ROTATION_NONE
          */
   public static final byte ROTATION_YAW_0 = (byte) 0;
   /**
          * MAV_SENSOR_ROTATION_YAW_45
          */
   public static final byte ROTATION_YAW_45 = (byte) 1;
   /**
          * MAV_SENSOR_ROTATION_YAW_90
          */
   public static final byte ROTATION_YAW_90 = (byte) 2;
   /**
          * MAV_SENSOR_ROTATION_YAW_135
          */
   public static final byte ROTATION_YAW_135 = (byte) 3;
   /**
          * MAV_SENSOR_ROTATION_YAW_180
          */
   public static final byte ROTATION_YAW_180 = (byte) 4;
   /**
          * MAV_SENSOR_ROTATION_YAW_225
          */
   public static final byte ROTATION_YAW_225 = (byte) 5;
   /**
          * MAV_SENSOR_ROTATION_YAW_270
          */
   public static final byte ROTATION_YAW_270 = (byte) 6;
   /**
          * MAV_SENSOR_ROTATION_YAW_315
          */
   public static final byte ROTATION_YAW_315 = (byte) 7;
   /**
          * MAV_SENSOR_ROTATION_NONE
          */
   public static final byte ROTATION_FORWARD_FACING = (byte) 0;
   /**
          * MAV_SENSOR_ROTATION_YAW_90
          */
   public static final byte ROTATION_RIGHT_FACING = (byte) 2;
   /**
          * MAV_SENSOR_ROTATION_YAW_180
          */
   public static final byte ROTATION_BACKWARD_FACING = (byte) 4;
   /**
          * MAV_SENSOR_ROTATION_YAW_270
          */
   public static final byte ROTATION_LEFT_FACING = (byte) 6;
   /**
          * MAV_SENSOR_ROTATION_PITCH_90
          */
   public static final byte ROTATION_UPWARD_FACING = (byte) 24;
   /**
          * MAV_SENSOR_ROTATION_PITCH_270
          */
   public static final byte ROTATION_DOWNWARD_FACING = (byte) 25;
   /**
          * MAV_SENSOR_ROTATION_CUSTOM
          */
   public static final byte ROTATION_CUSTOM = (byte) 100;
   public static final byte MODE_UNKNOWN = (byte) 0;
   public static final byte MODE_ENABLED = (byte) 1;
   public static final byte MODE_DISABLED = (byte) 2;
   /**
            * time since system start (microseconds)
            */
   public long timestamp_;
   /**
            * unique device ID for the sensor that does not change between power cycles
            */
   public long device_id_;
   /**
            * Minimum distance the sensor can measure (in m)
            */
   public float min_distance_;
   /**
            * Maximum distance the sensor can measure (in m)
            */
   public float max_distance_;
   /**
            * Current distance reading (in m)
            */
   public float current_distance_;
   /**
            * Measurement variance (in m^2), 0 for unknown / invalid readings
            */
   public float variance_;
   /**
            * Signal quality in percent (0...100%), where 0 = invalid signal, 100 = perfect signal, and -1 = unknown signal quality.
            */
   public byte signal_quality_;
   /**
            * Type from MAV_DISTANCE_SENSOR enum
            */
   public byte type_;
   /**
            * Sensor horizontal field of view (rad)
            */
   public float h_fov_;
   /**
            * Sensor vertical field of view (rad)
            */
   public float v_fov_;
   /**
            * Quaterion sensor orientation with respect to the vehicle body frame to specify the orientation ROTATION_CUSTOM
            */
   public float[] q_;
   /**
            * Direction the sensor faces from MAV_SENSOR_ORIENTATION enum
            */
   public byte orientation_;
   public byte mode_;

   public DistanceSensor()
   {
      q_ = new float[4];

   }

   public DistanceSensor(DistanceSensor other)
   {
      this();
      set(other);
   }

   public void set(DistanceSensor other)
   {
      timestamp_ = other.timestamp_;

      device_id_ = other.device_id_;

      min_distance_ = other.min_distance_;

      max_distance_ = other.max_distance_;

      current_distance_ = other.current_distance_;

      variance_ = other.variance_;

      signal_quality_ = other.signal_quality_;

      type_ = other.type_;

      h_fov_ = other.h_fov_;

      v_fov_ = other.v_fov_;

      for(int i1 = 0; i1 < q_.length; ++i1)
      {
            q_[i1] = other.q_[i1];

      }

      orientation_ = other.orientation_;

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
            * Minimum distance the sensor can measure (in m)
            */
   public void setMinDistance(float min_distance)
   {
      min_distance_ = min_distance;
   }
   /**
            * Minimum distance the sensor can measure (in m)
            */
   public float getMinDistance()
   {
      return min_distance_;
   }

   /**
            * Maximum distance the sensor can measure (in m)
            */
   public void setMaxDistance(float max_distance)
   {
      max_distance_ = max_distance;
   }
   /**
            * Maximum distance the sensor can measure (in m)
            */
   public float getMaxDistance()
   {
      return max_distance_;
   }

   /**
            * Current distance reading (in m)
            */
   public void setCurrentDistance(float current_distance)
   {
      current_distance_ = current_distance;
   }
   /**
            * Current distance reading (in m)
            */
   public float getCurrentDistance()
   {
      return current_distance_;
   }

   /**
            * Measurement variance (in m^2), 0 for unknown / invalid readings
            */
   public void setVariance(float variance)
   {
      variance_ = variance;
   }
   /**
            * Measurement variance (in m^2), 0 for unknown / invalid readings
            */
   public float getVariance()
   {
      return variance_;
   }

   /**
            * Signal quality in percent (0...100%), where 0 = invalid signal, 100 = perfect signal, and -1 = unknown signal quality.
            */
   public void setSignalQuality(byte signal_quality)
   {
      signal_quality_ = signal_quality;
   }
   /**
            * Signal quality in percent (0...100%), where 0 = invalid signal, 100 = perfect signal, and -1 = unknown signal quality.
            */
   public byte getSignalQuality()
   {
      return signal_quality_;
   }

   /**
            * Type from MAV_DISTANCE_SENSOR enum
            */
   public void setType(byte type)
   {
      type_ = type;
   }
   /**
            * Type from MAV_DISTANCE_SENSOR enum
            */
   public byte getType()
   {
      return type_;
   }

   /**
            * Sensor horizontal field of view (rad)
            */
   public void setHFov(float h_fov)
   {
      h_fov_ = h_fov;
   }
   /**
            * Sensor horizontal field of view (rad)
            */
   public float getHFov()
   {
      return h_fov_;
   }

   /**
            * Sensor vertical field of view (rad)
            */
   public void setVFov(float v_fov)
   {
      v_fov_ = v_fov;
   }
   /**
            * Sensor vertical field of view (rad)
            */
   public float getVFov()
   {
      return v_fov_;
   }


   /**
            * Quaterion sensor orientation with respect to the vehicle body frame to specify the orientation ROTATION_CUSTOM
            */
   public float[] getQ()
   {
      return q_;
   }

   /**
            * Direction the sensor faces from MAV_SENSOR_ORIENTATION enum
            */
   public void setOrientation(byte orientation)
   {
      orientation_ = orientation;
   }
   /**
            * Direction the sensor faces from MAV_SENSOR_ORIENTATION enum
            */
   public byte getOrientation()
   {
      return orientation_;
   }

   public void setMode(byte mode)
   {
      mode_ = mode;
   }
   public byte getMode()
   {
      return mode_;
   }


   public static Supplier<DistanceSensorPubSubType> getPubSubType()
   {
      return DistanceSensorPubSubType::new;
   }

   @Override
   public Supplier<TopicDataType> getPubSubTypePacket()
   {
      return DistanceSensorPubSubType::new;
   }

   @Override
   public boolean epsilonEquals(DistanceSensor other, double epsilon)
   {
      if(other == null) return false;
      if(other == this) return true;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_, other.timestamp_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.device_id_, other.device_id_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.min_distance_, other.min_distance_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.max_distance_, other.max_distance_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.current_distance_, other.current_distance_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.variance_, other.variance_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.signal_quality_, other.signal_quality_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.type_, other.type_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.h_fov_, other.h_fov_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.v_fov_, other.v_fov_, epsilon)) return false;

      for(int i3 = 0; i3 < q_.length; ++i3)
      {
                if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.q_[i3], other.q_[i3], epsilon)) return false;
      }

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.orientation_, other.orientation_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.mode_, other.mode_, epsilon)) return false;


      return true;
   }

   @Override
   public boolean equals(Object other)
   {
      if(other == null) return false;
      if(other == this) return true;
      if(!(other instanceof DistanceSensor)) return false;

      DistanceSensor otherMyClass = (DistanceSensor) other;

      if(this.timestamp_ != otherMyClass.timestamp_) return false;

      if(this.device_id_ != otherMyClass.device_id_) return false;

      if(this.min_distance_ != otherMyClass.min_distance_) return false;

      if(this.max_distance_ != otherMyClass.max_distance_) return false;

      if(this.current_distance_ != otherMyClass.current_distance_) return false;

      if(this.variance_ != otherMyClass.variance_) return false;

      if(this.signal_quality_ != otherMyClass.signal_quality_) return false;

      if(this.type_ != otherMyClass.type_) return false;

      if(this.h_fov_ != otherMyClass.h_fov_) return false;

      if(this.v_fov_ != otherMyClass.v_fov_) return false;

      for(int i5 = 0; i5 < q_.length; ++i5)
      {
                if(this.q_[i5] != otherMyClass.q_[i5]) return false;

      }
      if(this.orientation_ != otherMyClass.orientation_) return false;

      if(this.mode_ != otherMyClass.mode_) return false;


      return true;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("DistanceSensor {");
      builder.append("timestamp=");
      builder.append(this.timestamp_);      builder.append(", ");
      builder.append("device_id=");
      builder.append(this.device_id_);      builder.append(", ");
      builder.append("min_distance=");
      builder.append(this.min_distance_);      builder.append(", ");
      builder.append("max_distance=");
      builder.append(this.max_distance_);      builder.append(", ");
      builder.append("current_distance=");
      builder.append(this.current_distance_);      builder.append(", ");
      builder.append("variance=");
      builder.append(this.variance_);      builder.append(", ");
      builder.append("signal_quality=");
      builder.append(this.signal_quality_);      builder.append(", ");
      builder.append("type=");
      builder.append(this.type_);      builder.append(", ");
      builder.append("h_fov=");
      builder.append(this.h_fov_);      builder.append(", ");
      builder.append("v_fov=");
      builder.append(this.v_fov_);      builder.append(", ");
      builder.append("q=");
      builder.append(java.util.Arrays.toString(this.q_));      builder.append(", ");
      builder.append("orientation=");
      builder.append(this.orientation_);      builder.append(", ");
      builder.append("mode=");
      builder.append(this.mode_);
      builder.append("}");
      return builder.toString();
   }
}
