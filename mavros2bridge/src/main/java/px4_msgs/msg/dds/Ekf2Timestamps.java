package px4_msgs.msg.dds;

import us.ihmc.communication.packets.Packet;
import us.ihmc.euclid.interfaces.Settable;
import us.ihmc.euclid.interfaces.EpsilonComparable;
import java.util.function.Supplier;
import us.ihmc.pubsub.TopicDataType;

/**
       * this message contains the (relative) timestamps of the sensor inputs used by EKF2.
       * It can be used for reproducible replay.
       * the timestamp field is the ekf2 reference time and matches the timestamp of
       * the sensor_combined topic.
       * is set to this value, it means the associated sensor values did not update
       * timestamps are relative to the main timestamp and are in 0.1 ms (timestamp +
       * *_timestamp_rel = absolute timestamp). For int16, this allows a maximum
       * difference of +-3.2s to the sensor_combined topic.
       */
public class Ekf2Timestamps extends Packet<Ekf2Timestamps> implements Settable<Ekf2Timestamps>, EpsilonComparable<Ekf2Timestamps>
{
   /**
          * (0x7fff) If one of the relative timestamps
          */
   public static final short RELATIVE_TIMESTAMP_INVALID = 32767;
   /**
            * time since system start (microseconds)
            */
   public long timestamp_;
   public short airspeed_timestamp_rel_;
   public short distance_sensor_timestamp_rel_;
   public short optical_flow_timestamp_rel_;
   public short vehicle_air_data_timestamp_rel_;
   public short vehicle_magnetometer_timestamp_rel_;
   public short visual_odometry_timestamp_rel_;

   public Ekf2Timestamps()
   {
   }

   public Ekf2Timestamps(Ekf2Timestamps other)
   {
      this();
      set(other);
   }

   public void set(Ekf2Timestamps other)
   {
      timestamp_ = other.timestamp_;

      airspeed_timestamp_rel_ = other.airspeed_timestamp_rel_;

      distance_sensor_timestamp_rel_ = other.distance_sensor_timestamp_rel_;

      optical_flow_timestamp_rel_ = other.optical_flow_timestamp_rel_;

      vehicle_air_data_timestamp_rel_ = other.vehicle_air_data_timestamp_rel_;

      vehicle_magnetometer_timestamp_rel_ = other.vehicle_magnetometer_timestamp_rel_;

      visual_odometry_timestamp_rel_ = other.visual_odometry_timestamp_rel_;

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

   public void setAirspeedTimestampRel(short airspeed_timestamp_rel)
   {
      airspeed_timestamp_rel_ = airspeed_timestamp_rel;
   }
   public short getAirspeedTimestampRel()
   {
      return airspeed_timestamp_rel_;
   }

   public void setDistanceSensorTimestampRel(short distance_sensor_timestamp_rel)
   {
      distance_sensor_timestamp_rel_ = distance_sensor_timestamp_rel;
   }
   public short getDistanceSensorTimestampRel()
   {
      return distance_sensor_timestamp_rel_;
   }

   public void setOpticalFlowTimestampRel(short optical_flow_timestamp_rel)
   {
      optical_flow_timestamp_rel_ = optical_flow_timestamp_rel;
   }
   public short getOpticalFlowTimestampRel()
   {
      return optical_flow_timestamp_rel_;
   }

   public void setVehicleAirDataTimestampRel(short vehicle_air_data_timestamp_rel)
   {
      vehicle_air_data_timestamp_rel_ = vehicle_air_data_timestamp_rel;
   }
   public short getVehicleAirDataTimestampRel()
   {
      return vehicle_air_data_timestamp_rel_;
   }

   public void setVehicleMagnetometerTimestampRel(short vehicle_magnetometer_timestamp_rel)
   {
      vehicle_magnetometer_timestamp_rel_ = vehicle_magnetometer_timestamp_rel;
   }
   public short getVehicleMagnetometerTimestampRel()
   {
      return vehicle_magnetometer_timestamp_rel_;
   }

   public void setVisualOdometryTimestampRel(short visual_odometry_timestamp_rel)
   {
      visual_odometry_timestamp_rel_ = visual_odometry_timestamp_rel;
   }
   public short getVisualOdometryTimestampRel()
   {
      return visual_odometry_timestamp_rel_;
   }


   public static Supplier<Ekf2TimestampsPubSubType> getPubSubType()
   {
      return Ekf2TimestampsPubSubType::new;
   }

   @Override
   public Supplier<TopicDataType> getPubSubTypePacket()
   {
      return Ekf2TimestampsPubSubType::new;
   }

   @Override
   public boolean epsilonEquals(Ekf2Timestamps other, double epsilon)
   {
      if(other == null) return false;
      if(other == this) return true;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_, other.timestamp_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.airspeed_timestamp_rel_, other.airspeed_timestamp_rel_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.distance_sensor_timestamp_rel_, other.distance_sensor_timestamp_rel_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.optical_flow_timestamp_rel_, other.optical_flow_timestamp_rel_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.vehicle_air_data_timestamp_rel_, other.vehicle_air_data_timestamp_rel_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.vehicle_magnetometer_timestamp_rel_, other.vehicle_magnetometer_timestamp_rel_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.visual_odometry_timestamp_rel_, other.visual_odometry_timestamp_rel_, epsilon)) return false;


      return true;
   }

   @Override
   public boolean equals(Object other)
   {
      if(other == null) return false;
      if(other == this) return true;
      if(!(other instanceof Ekf2Timestamps)) return false;

      Ekf2Timestamps otherMyClass = (Ekf2Timestamps) other;

      if(this.timestamp_ != otherMyClass.timestamp_) return false;

      if(this.airspeed_timestamp_rel_ != otherMyClass.airspeed_timestamp_rel_) return false;

      if(this.distance_sensor_timestamp_rel_ != otherMyClass.distance_sensor_timestamp_rel_) return false;

      if(this.optical_flow_timestamp_rel_ != otherMyClass.optical_flow_timestamp_rel_) return false;

      if(this.vehicle_air_data_timestamp_rel_ != otherMyClass.vehicle_air_data_timestamp_rel_) return false;

      if(this.vehicle_magnetometer_timestamp_rel_ != otherMyClass.vehicle_magnetometer_timestamp_rel_) return false;

      if(this.visual_odometry_timestamp_rel_ != otherMyClass.visual_odometry_timestamp_rel_) return false;


      return true;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("Ekf2Timestamps {");
      builder.append("timestamp=");
      builder.append(this.timestamp_);      builder.append(", ");
      builder.append("airspeed_timestamp_rel=");
      builder.append(this.airspeed_timestamp_rel_);      builder.append(", ");
      builder.append("distance_sensor_timestamp_rel=");
      builder.append(this.distance_sensor_timestamp_rel_);      builder.append(", ");
      builder.append("optical_flow_timestamp_rel=");
      builder.append(this.optical_flow_timestamp_rel_);      builder.append(", ");
      builder.append("vehicle_air_data_timestamp_rel=");
      builder.append(this.vehicle_air_data_timestamp_rel_);      builder.append(", ");
      builder.append("vehicle_magnetometer_timestamp_rel=");
      builder.append(this.vehicle_magnetometer_timestamp_rel_);      builder.append(", ");
      builder.append("visual_odometry_timestamp_rel=");
      builder.append(this.visual_odometry_timestamp_rel_);
      builder.append("}");
      return builder.toString();
   }
}
