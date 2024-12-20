package px4_msgs.msg.dds;

import us.ihmc.communication.packets.Packet;
import us.ihmc.euclid.interfaces.Settable;
import us.ihmc.euclid.interfaces.EpsilonComparable;
import java.util.function.Supplier;
import us.ihmc.pubsub.TopicDataType;

public class SensorAirflow extends Packet<SensorAirflow> implements Settable<SensorAirflow>, EpsilonComparable<SensorAirflow>
{
   /**
            * time since system start (microseconds)
            */
   public long timestamp_;
   /**
            * unique device ID for the sensor that does not change between power cycles
            */
   public long device_id_;
   /**
            * the speed being reported by the wind / airflow sensor
            */
   public float speed_;
   /**
            * the direction being reported by the wind / airflow sensor
            */
   public float direction_;
   /**
            * Status code from the sensor
            */
   public byte status_;

   public SensorAirflow()
   {
   }

   public SensorAirflow(SensorAirflow other)
   {
      this();
      set(other);
   }

   public void set(SensorAirflow other)
   {
      timestamp_ = other.timestamp_;

      device_id_ = other.device_id_;

      speed_ = other.speed_;

      direction_ = other.direction_;

      status_ = other.status_;

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
            * the speed being reported by the wind / airflow sensor
            */
   public void setSpeed(float speed)
   {
      speed_ = speed;
   }
   /**
            * the speed being reported by the wind / airflow sensor
            */
   public float getSpeed()
   {
      return speed_;
   }

   /**
            * the direction being reported by the wind / airflow sensor
            */
   public void setDirection(float direction)
   {
      direction_ = direction;
   }
   /**
            * the direction being reported by the wind / airflow sensor
            */
   public float getDirection()
   {
      return direction_;
   }

   /**
            * Status code from the sensor
            */
   public void setStatus(byte status)
   {
      status_ = status;
   }
   /**
            * Status code from the sensor
            */
   public byte getStatus()
   {
      return status_;
   }


   public static Supplier<SensorAirflowPubSubType> getPubSubType()
   {
      return SensorAirflowPubSubType::new;
   }

   @Override
   public Supplier<TopicDataType> getPubSubTypePacket()
   {
      return SensorAirflowPubSubType::new;
   }

   @Override
   public boolean epsilonEquals(SensorAirflow other, double epsilon)
   {
      if(other == null) return false;
      if(other == this) return true;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_, other.timestamp_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.device_id_, other.device_id_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.speed_, other.speed_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.direction_, other.direction_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.status_, other.status_, epsilon)) return false;


      return true;
   }

   @Override
   public boolean equals(Object other)
   {
      if(other == null) return false;
      if(other == this) return true;
      if(!(other instanceof SensorAirflow)) return false;

      SensorAirflow otherMyClass = (SensorAirflow) other;

      if(this.timestamp_ != otherMyClass.timestamp_) return false;

      if(this.device_id_ != otherMyClass.device_id_) return false;

      if(this.speed_ != otherMyClass.speed_) return false;

      if(this.direction_ != otherMyClass.direction_) return false;

      if(this.status_ != otherMyClass.status_) return false;


      return true;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("SensorAirflow {");
      builder.append("timestamp=");
      builder.append(this.timestamp_);      builder.append(", ");
      builder.append("device_id=");
      builder.append(this.device_id_);      builder.append(", ");
      builder.append("speed=");
      builder.append(this.speed_);      builder.append(", ");
      builder.append("direction=");
      builder.append(this.direction_);      builder.append(", ");
      builder.append("status=");
      builder.append(this.status_);
      builder.append("}");
      return builder.toString();
   }
}
