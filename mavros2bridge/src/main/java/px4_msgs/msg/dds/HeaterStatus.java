package px4_msgs.msg.dds;

import us.ihmc.communication.packets.Packet;
import us.ihmc.euclid.interfaces.Settable;
import us.ihmc.euclid.interfaces.EpsilonComparable;
import java.util.function.Supplier;
import us.ihmc.pubsub.TopicDataType;

public class HeaterStatus extends Packet<HeaterStatus> implements Settable<HeaterStatus>, EpsilonComparable<HeaterStatus>
{
   public static final byte MODE_GPIO = (byte) 1;
   public static final byte MODE_PX4IO = (byte) 2;
   /**
            * time since system start (microseconds)
            */
   public long timestamp_;
   public long device_id_;
   public boolean heater_on_;
   public boolean temperature_target_met_;
   public float temperature_sensor_;
   public float temperature_target_;
   public long controller_period_usec_;
   public long controller_time_on_usec_;
   public float proportional_value_;
   public float integrator_value_;
   public float feed_forward_value_;
   public byte mode_;

   public HeaterStatus()
   {
   }

   public HeaterStatus(HeaterStatus other)
   {
      this();
      set(other);
   }

   public void set(HeaterStatus other)
   {
      timestamp_ = other.timestamp_;

      device_id_ = other.device_id_;

      heater_on_ = other.heater_on_;

      temperature_target_met_ = other.temperature_target_met_;

      temperature_sensor_ = other.temperature_sensor_;

      temperature_target_ = other.temperature_target_;

      controller_period_usec_ = other.controller_period_usec_;

      controller_time_on_usec_ = other.controller_time_on_usec_;

      proportional_value_ = other.proportional_value_;

      integrator_value_ = other.integrator_value_;

      feed_forward_value_ = other.feed_forward_value_;

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

   public void setDeviceId(long device_id)
   {
      device_id_ = device_id;
   }
   public long getDeviceId()
   {
      return device_id_;
   }

   public void setHeaterOn(boolean heater_on)
   {
      heater_on_ = heater_on;
   }
   public boolean getHeaterOn()
   {
      return heater_on_;
   }

   public void setTemperatureTargetMet(boolean temperature_target_met)
   {
      temperature_target_met_ = temperature_target_met;
   }
   public boolean getTemperatureTargetMet()
   {
      return temperature_target_met_;
   }

   public void setTemperatureSensor(float temperature_sensor)
   {
      temperature_sensor_ = temperature_sensor;
   }
   public float getTemperatureSensor()
   {
      return temperature_sensor_;
   }

   public void setTemperatureTarget(float temperature_target)
   {
      temperature_target_ = temperature_target;
   }
   public float getTemperatureTarget()
   {
      return temperature_target_;
   }

   public void setControllerPeriodUsec(long controller_period_usec)
   {
      controller_period_usec_ = controller_period_usec;
   }
   public long getControllerPeriodUsec()
   {
      return controller_period_usec_;
   }

   public void setControllerTimeOnUsec(long controller_time_on_usec)
   {
      controller_time_on_usec_ = controller_time_on_usec;
   }
   public long getControllerTimeOnUsec()
   {
      return controller_time_on_usec_;
   }

   public void setProportionalValue(float proportional_value)
   {
      proportional_value_ = proportional_value;
   }
   public float getProportionalValue()
   {
      return proportional_value_;
   }

   public void setIntegratorValue(float integrator_value)
   {
      integrator_value_ = integrator_value;
   }
   public float getIntegratorValue()
   {
      return integrator_value_;
   }

   public void setFeedForwardValue(float feed_forward_value)
   {
      feed_forward_value_ = feed_forward_value;
   }
   public float getFeedForwardValue()
   {
      return feed_forward_value_;
   }

   public void setMode(byte mode)
   {
      mode_ = mode;
   }
   public byte getMode()
   {
      return mode_;
   }


   public static Supplier<HeaterStatusPubSubType> getPubSubType()
   {
      return HeaterStatusPubSubType::new;
   }

   @Override
   public Supplier<TopicDataType> getPubSubTypePacket()
   {
      return HeaterStatusPubSubType::new;
   }

   @Override
   public boolean epsilonEquals(HeaterStatus other, double epsilon)
   {
      if(other == null) return false;
      if(other == this) return true;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_, other.timestamp_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.device_id_, other.device_id_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.heater_on_, other.heater_on_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.temperature_target_met_, other.temperature_target_met_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.temperature_sensor_, other.temperature_sensor_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.temperature_target_, other.temperature_target_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.controller_period_usec_, other.controller_period_usec_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.controller_time_on_usec_, other.controller_time_on_usec_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.proportional_value_, other.proportional_value_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.integrator_value_, other.integrator_value_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.feed_forward_value_, other.feed_forward_value_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.mode_, other.mode_, epsilon)) return false;


      return true;
   }

   @Override
   public boolean equals(Object other)
   {
      if(other == null) return false;
      if(other == this) return true;
      if(!(other instanceof HeaterStatus)) return false;

      HeaterStatus otherMyClass = (HeaterStatus) other;

      if(this.timestamp_ != otherMyClass.timestamp_) return false;

      if(this.device_id_ != otherMyClass.device_id_) return false;

      if(this.heater_on_ != otherMyClass.heater_on_) return false;

      if(this.temperature_target_met_ != otherMyClass.temperature_target_met_) return false;

      if(this.temperature_sensor_ != otherMyClass.temperature_sensor_) return false;

      if(this.temperature_target_ != otherMyClass.temperature_target_) return false;

      if(this.controller_period_usec_ != otherMyClass.controller_period_usec_) return false;

      if(this.controller_time_on_usec_ != otherMyClass.controller_time_on_usec_) return false;

      if(this.proportional_value_ != otherMyClass.proportional_value_) return false;

      if(this.integrator_value_ != otherMyClass.integrator_value_) return false;

      if(this.feed_forward_value_ != otherMyClass.feed_forward_value_) return false;

      if(this.mode_ != otherMyClass.mode_) return false;


      return true;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("HeaterStatus {");
      builder.append("timestamp=");
      builder.append(this.timestamp_);      builder.append(", ");
      builder.append("device_id=");
      builder.append(this.device_id_);      builder.append(", ");
      builder.append("heater_on=");
      builder.append(this.heater_on_);      builder.append(", ");
      builder.append("temperature_target_met=");
      builder.append(this.temperature_target_met_);      builder.append(", ");
      builder.append("temperature_sensor=");
      builder.append(this.temperature_sensor_);      builder.append(", ");
      builder.append("temperature_target=");
      builder.append(this.temperature_target_);      builder.append(", ");
      builder.append("controller_period_usec=");
      builder.append(this.controller_period_usec_);      builder.append(", ");
      builder.append("controller_time_on_usec=");
      builder.append(this.controller_time_on_usec_);      builder.append(", ");
      builder.append("proportional_value=");
      builder.append(this.proportional_value_);      builder.append(", ");
      builder.append("integrator_value=");
      builder.append(this.integrator_value_);      builder.append(", ");
      builder.append("feed_forward_value=");
      builder.append(this.feed_forward_value_);      builder.append(", ");
      builder.append("mode=");
      builder.append(this.mode_);
      builder.append("}");
      return builder.toString();
   }
}
