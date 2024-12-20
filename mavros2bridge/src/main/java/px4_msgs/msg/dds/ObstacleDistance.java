package px4_msgs.msg.dds;

import us.ihmc.communication.packets.Packet;
import us.ihmc.euclid.interfaces.Settable;
import us.ihmc.euclid.interfaces.EpsilonComparable;
import java.util.function.Supplier;
import us.ihmc.pubsub.TopicDataType;

public class ObstacleDistance extends Packet<ObstacleDistance> implements Settable<ObstacleDistance>, EpsilonComparable<ObstacleDistance>
{
   public static final byte MAV_FRAME_GLOBAL = (byte) 0;
   public static final byte MAV_FRAME_LOCAL_NED = (byte) 1;
   public static final byte MAV_FRAME_BODY_FRD = (byte) 12;
   public static final byte MAV_DISTANCE_SENSOR_LASER = (byte) 0;
   public static final byte MAV_DISTANCE_SENSOR_ULTRASOUND = (byte) 1;
   public static final byte MAV_DISTANCE_SENSOR_INFRARED = (byte) 2;
   public static final byte MAV_DISTANCE_SENSOR_RADAR = (byte) 3;
   /**
            * Obstacle distances in front of the sensor.
            * time since system start (microseconds)
            */
   public long timestamp_;
   /**
            * Coordinate frame of reference for the yaw rotation and offset of the sensor data. Defaults to MAV_FRAME_GLOBAL, which is North aligned. For body-mounted sensors use MAV_FRAME_BODY_FRD, which is vehicle front aligned.
            */
   public byte frame_;
   /**
            * Type from MAV_DISTANCE_SENSOR enum.
            */
   public byte sensor_type_;
   /**
            * Angular width in degrees of each array element.
            */
   public float increment_;
   /**
            * Minimum distance the sensor can measure in centimeters.
            */
   public int min_distance_;
   /**
            * Maximum distance the sensor can measure in centimeters.
            */
   public int max_distance_;
   /**
            * Relative angle offset of the 0-index element in the distances array. Value of 0 corresponds to forward. Positive is clockwise direction, negative is counter-clockwise.
            */
   public float angle_offset_;

   public ObstacleDistance()
   {
   }

   public ObstacleDistance(ObstacleDistance other)
   {
      this();
      set(other);
   }

   public void set(ObstacleDistance other)
   {
      timestamp_ = other.timestamp_;

      frame_ = other.frame_;

      sensor_type_ = other.sensor_type_;

      increment_ = other.increment_;

      min_distance_ = other.min_distance_;

      max_distance_ = other.max_distance_;

      angle_offset_ = other.angle_offset_;

   }

   /**
            * Obstacle distances in front of the sensor.
            * time since system start (microseconds)
            */
   public void setTimestamp(long timestamp)
   {
      timestamp_ = timestamp;
   }
   /**
            * Obstacle distances in front of the sensor.
            * time since system start (microseconds)
            */
   public long getTimestamp()
   {
      return timestamp_;
   }

   /**
            * Coordinate frame of reference for the yaw rotation and offset of the sensor data. Defaults to MAV_FRAME_GLOBAL, which is North aligned. For body-mounted sensors use MAV_FRAME_BODY_FRD, which is vehicle front aligned.
            */
   public void setFrame(byte frame)
   {
      frame_ = frame;
   }
   /**
            * Coordinate frame of reference for the yaw rotation and offset of the sensor data. Defaults to MAV_FRAME_GLOBAL, which is North aligned. For body-mounted sensors use MAV_FRAME_BODY_FRD, which is vehicle front aligned.
            */
   public byte getFrame()
   {
      return frame_;
   }

   /**
            * Type from MAV_DISTANCE_SENSOR enum.
            */
   public void setSensorType(byte sensor_type)
   {
      sensor_type_ = sensor_type;
   }
   /**
            * Type from MAV_DISTANCE_SENSOR enum.
            */
   public byte getSensorType()
   {
      return sensor_type_;
   }

   /**
            * Angular width in degrees of each array element.
            */
   public void setIncrement(float increment)
   {
      increment_ = increment;
   }
   /**
            * Angular width in degrees of each array element.
            */
   public float getIncrement()
   {
      return increment_;
   }

   /**
            * Minimum distance the sensor can measure in centimeters.
            */
   public void setMinDistance(int min_distance)
   {
      min_distance_ = min_distance;
   }
   /**
            * Minimum distance the sensor can measure in centimeters.
            */
   public int getMinDistance()
   {
      return min_distance_;
   }

   /**
            * Maximum distance the sensor can measure in centimeters.
            */
   public void setMaxDistance(int max_distance)
   {
      max_distance_ = max_distance;
   }
   /**
            * Maximum distance the sensor can measure in centimeters.
            */
   public int getMaxDistance()
   {
      return max_distance_;
   }

   /**
            * Relative angle offset of the 0-index element in the distances array. Value of 0 corresponds to forward. Positive is clockwise direction, negative is counter-clockwise.
            */
   public void setAngleOffset(float angle_offset)
   {
      angle_offset_ = angle_offset;
   }
   /**
            * Relative angle offset of the 0-index element in the distances array. Value of 0 corresponds to forward. Positive is clockwise direction, negative is counter-clockwise.
            */
   public float getAngleOffset()
   {
      return angle_offset_;
   }


   public static Supplier<ObstacleDistancePubSubType> getPubSubType()
   {
      return ObstacleDistancePubSubType::new;
   }

   @Override
   public Supplier<TopicDataType> getPubSubTypePacket()
   {
      return ObstacleDistancePubSubType::new;
   }

   @Override
   public boolean epsilonEquals(ObstacleDistance other, double epsilon)
   {
      if(other == null) return false;
      if(other == this) return true;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_, other.timestamp_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.frame_, other.frame_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.sensor_type_, other.sensor_type_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.increment_, other.increment_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.min_distance_, other.min_distance_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.max_distance_, other.max_distance_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.angle_offset_, other.angle_offset_, epsilon)) return false;


      return true;
   }

   @Override
   public boolean equals(Object other)
   {
      if(other == null) return false;
      if(other == this) return true;
      if(!(other instanceof ObstacleDistance)) return false;

      ObstacleDistance otherMyClass = (ObstacleDistance) other;

      if(this.timestamp_ != otherMyClass.timestamp_) return false;

      if(this.frame_ != otherMyClass.frame_) return false;

      if(this.sensor_type_ != otherMyClass.sensor_type_) return false;

      if(this.increment_ != otherMyClass.increment_) return false;

      if(this.min_distance_ != otherMyClass.min_distance_) return false;

      if(this.max_distance_ != otherMyClass.max_distance_) return false;

      if(this.angle_offset_ != otherMyClass.angle_offset_) return false;


      return true;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("ObstacleDistance {");
      builder.append("timestamp=");
      builder.append(this.timestamp_);      builder.append(", ");
      builder.append("frame=");
      builder.append(this.frame_);      builder.append(", ");
      builder.append("sensor_type=");
      builder.append(this.sensor_type_);      builder.append(", ");
      builder.append("increment=");
      builder.append(this.increment_);      builder.append(", ");
      builder.append("min_distance=");
      builder.append(this.min_distance_);      builder.append(", ");
      builder.append("max_distance=");
      builder.append(this.max_distance_);      builder.append(", ");
      builder.append("angle_offset=");
      builder.append(this.angle_offset_);
      builder.append("}");
      return builder.toString();
   }
}
