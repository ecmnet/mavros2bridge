package px4_msgs.msg.dds;

import us.ihmc.communication.packets.Packet;
import us.ihmc.euclid.interfaces.Settable;
import us.ihmc.euclid.interfaces.EpsilonComparable;
import java.util.function.Supplier;
import us.ihmc.pubsub.TopicDataType;

public class SensorSelection extends Packet<SensorSelection> implements Settable<SensorSelection>, EpsilonComparable<SensorSelection>
{
   /**
            * 
            * Sensor ID's for the voted sensors output on the sensor_combined topic.
            * Will be updated on startup of the sensor module and when sensor selection changes
            * 
            * time since system start (microseconds)
            */
   public long timestamp_;
   /**
            * unique device ID for the selected accelerometers
            */
   public long accel_device_id_;
   /**
            * unique device ID for the selected rate gyros
            */
   public long gyro_device_id_;

   public SensorSelection()
   {
   }

   public SensorSelection(SensorSelection other)
   {
      this();
      set(other);
   }

   public void set(SensorSelection other)
   {
      timestamp_ = other.timestamp_;

      accel_device_id_ = other.accel_device_id_;

      gyro_device_id_ = other.gyro_device_id_;

   }

   /**
            * 
            * Sensor ID's for the voted sensors output on the sensor_combined topic.
            * Will be updated on startup of the sensor module and when sensor selection changes
            * 
            * time since system start (microseconds)
            */
   public void setTimestamp(long timestamp)
   {
      timestamp_ = timestamp;
   }
   /**
            * 
            * Sensor ID's for the voted sensors output on the sensor_combined topic.
            * Will be updated on startup of the sensor module and when sensor selection changes
            * 
            * time since system start (microseconds)
            */
   public long getTimestamp()
   {
      return timestamp_;
   }

   /**
            * unique device ID for the selected accelerometers
            */
   public void setAccelDeviceId(long accel_device_id)
   {
      accel_device_id_ = accel_device_id;
   }
   /**
            * unique device ID for the selected accelerometers
            */
   public long getAccelDeviceId()
   {
      return accel_device_id_;
   }

   /**
            * unique device ID for the selected rate gyros
            */
   public void setGyroDeviceId(long gyro_device_id)
   {
      gyro_device_id_ = gyro_device_id;
   }
   /**
            * unique device ID for the selected rate gyros
            */
   public long getGyroDeviceId()
   {
      return gyro_device_id_;
   }


   public static Supplier<SensorSelectionPubSubType> getPubSubType()
   {
      return SensorSelectionPubSubType::new;
   }

   @Override
   public Supplier<TopicDataType> getPubSubTypePacket()
   {
      return SensorSelectionPubSubType::new;
   }

   @Override
   public boolean epsilonEquals(SensorSelection other, double epsilon)
   {
      if(other == null) return false;
      if(other == this) return true;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_, other.timestamp_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.accel_device_id_, other.accel_device_id_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.gyro_device_id_, other.gyro_device_id_, epsilon)) return false;


      return true;
   }

   @Override
   public boolean equals(Object other)
   {
      if(other == null) return false;
      if(other == this) return true;
      if(!(other instanceof SensorSelection)) return false;

      SensorSelection otherMyClass = (SensorSelection) other;

      if(this.timestamp_ != otherMyClass.timestamp_) return false;

      if(this.accel_device_id_ != otherMyClass.accel_device_id_) return false;

      if(this.gyro_device_id_ != otherMyClass.gyro_device_id_) return false;


      return true;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("SensorSelection {");
      builder.append("timestamp=");
      builder.append(this.timestamp_);      builder.append(", ");
      builder.append("accel_device_id=");
      builder.append(this.accel_device_id_);      builder.append(", ");
      builder.append("gyro_device_id=");
      builder.append(this.gyro_device_id_);
      builder.append("}");
      return builder.toString();
   }
}
