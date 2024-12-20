package px4_msgs.msg.dds;

import us.ihmc.communication.packets.Packet;
import us.ihmc.euclid.interfaces.Settable;
import us.ihmc.euclid.interfaces.EpsilonComparable;
import java.util.function.Supplier;
import us.ihmc.pubsub.TopicDataType;

public class VehicleControlMode extends Packet<VehicleControlMode> implements Settable<VehicleControlMode>, EpsilonComparable<VehicleControlMode>
{
   /**
            * time since system start (microseconds)
            */
   public long timestamp_;
   /**
            * synonym for actuator_armed.armed
            */
   public boolean flag_armed_;
   public boolean flag_multicopter_position_control_enabled_;
   /**
            * true if manual input is mixed in
            */
   public boolean flag_control_manual_enabled_;
   /**
            * true if onboard autopilot should act
            */
   public boolean flag_control_auto_enabled_;
   /**
            * true if offboard control should be used
            */
   public boolean flag_control_offboard_enabled_;
   /**
            * true if position is controlled
            */
   public boolean flag_control_position_enabled_;
   /**
            * true if horizontal velocity (implies direction) is controlled
            */
   public boolean flag_control_velocity_enabled_;
   /**
            * true if altitude is controlled
            */
   public boolean flag_control_altitude_enabled_;
   /**
            * true if climb rate is controlled
            */
   public boolean flag_control_climb_rate_enabled_;
   /**
            * true if acceleration is controlled
            */
   public boolean flag_control_acceleration_enabled_;
   /**
            * true if attitude stabilization is mixed in
            */
   public boolean flag_control_attitude_enabled_;
   /**
            * true if rates are stabilized
            */
   public boolean flag_control_rates_enabled_;
   /**
            * true if control allocation is enabled
            */
   public boolean flag_control_allocation_enabled_;
   /**
            * true if flighttermination is enabled
            */
   public boolean flag_control_termination_enabled_;
   /**
            * TODO: use dedicated topic for external requests
            * Mode ID (nav_state)
            */
   public byte source_id_;

   public VehicleControlMode()
   {
   }

   public VehicleControlMode(VehicleControlMode other)
   {
      this();
      set(other);
   }

   public void set(VehicleControlMode other)
   {
      timestamp_ = other.timestamp_;

      flag_armed_ = other.flag_armed_;

      flag_multicopter_position_control_enabled_ = other.flag_multicopter_position_control_enabled_;

      flag_control_manual_enabled_ = other.flag_control_manual_enabled_;

      flag_control_auto_enabled_ = other.flag_control_auto_enabled_;

      flag_control_offboard_enabled_ = other.flag_control_offboard_enabled_;

      flag_control_position_enabled_ = other.flag_control_position_enabled_;

      flag_control_velocity_enabled_ = other.flag_control_velocity_enabled_;

      flag_control_altitude_enabled_ = other.flag_control_altitude_enabled_;

      flag_control_climb_rate_enabled_ = other.flag_control_climb_rate_enabled_;

      flag_control_acceleration_enabled_ = other.flag_control_acceleration_enabled_;

      flag_control_attitude_enabled_ = other.flag_control_attitude_enabled_;

      flag_control_rates_enabled_ = other.flag_control_rates_enabled_;

      flag_control_allocation_enabled_ = other.flag_control_allocation_enabled_;

      flag_control_termination_enabled_ = other.flag_control_termination_enabled_;

      source_id_ = other.source_id_;

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
            * synonym for actuator_armed.armed
            */
   public void setFlagArmed(boolean flag_armed)
   {
      flag_armed_ = flag_armed;
   }
   /**
            * synonym for actuator_armed.armed
            */
   public boolean getFlagArmed()
   {
      return flag_armed_;
   }

   public void setFlagMulticopterPositionControlEnabled(boolean flag_multicopter_position_control_enabled)
   {
      flag_multicopter_position_control_enabled_ = flag_multicopter_position_control_enabled;
   }
   public boolean getFlagMulticopterPositionControlEnabled()
   {
      return flag_multicopter_position_control_enabled_;
   }

   /**
            * true if manual input is mixed in
            */
   public void setFlagControlManualEnabled(boolean flag_control_manual_enabled)
   {
      flag_control_manual_enabled_ = flag_control_manual_enabled;
   }
   /**
            * true if manual input is mixed in
            */
   public boolean getFlagControlManualEnabled()
   {
      return flag_control_manual_enabled_;
   }

   /**
            * true if onboard autopilot should act
            */
   public void setFlagControlAutoEnabled(boolean flag_control_auto_enabled)
   {
      flag_control_auto_enabled_ = flag_control_auto_enabled;
   }
   /**
            * true if onboard autopilot should act
            */
   public boolean getFlagControlAutoEnabled()
   {
      return flag_control_auto_enabled_;
   }

   /**
            * true if offboard control should be used
            */
   public void setFlagControlOffboardEnabled(boolean flag_control_offboard_enabled)
   {
      flag_control_offboard_enabled_ = flag_control_offboard_enabled;
   }
   /**
            * true if offboard control should be used
            */
   public boolean getFlagControlOffboardEnabled()
   {
      return flag_control_offboard_enabled_;
   }

   /**
            * true if position is controlled
            */
   public void setFlagControlPositionEnabled(boolean flag_control_position_enabled)
   {
      flag_control_position_enabled_ = flag_control_position_enabled;
   }
   /**
            * true if position is controlled
            */
   public boolean getFlagControlPositionEnabled()
   {
      return flag_control_position_enabled_;
   }

   /**
            * true if horizontal velocity (implies direction) is controlled
            */
   public void setFlagControlVelocityEnabled(boolean flag_control_velocity_enabled)
   {
      flag_control_velocity_enabled_ = flag_control_velocity_enabled;
   }
   /**
            * true if horizontal velocity (implies direction) is controlled
            */
   public boolean getFlagControlVelocityEnabled()
   {
      return flag_control_velocity_enabled_;
   }

   /**
            * true if altitude is controlled
            */
   public void setFlagControlAltitudeEnabled(boolean flag_control_altitude_enabled)
   {
      flag_control_altitude_enabled_ = flag_control_altitude_enabled;
   }
   /**
            * true if altitude is controlled
            */
   public boolean getFlagControlAltitudeEnabled()
   {
      return flag_control_altitude_enabled_;
   }

   /**
            * true if climb rate is controlled
            */
   public void setFlagControlClimbRateEnabled(boolean flag_control_climb_rate_enabled)
   {
      flag_control_climb_rate_enabled_ = flag_control_climb_rate_enabled;
   }
   /**
            * true if climb rate is controlled
            */
   public boolean getFlagControlClimbRateEnabled()
   {
      return flag_control_climb_rate_enabled_;
   }

   /**
            * true if acceleration is controlled
            */
   public void setFlagControlAccelerationEnabled(boolean flag_control_acceleration_enabled)
   {
      flag_control_acceleration_enabled_ = flag_control_acceleration_enabled;
   }
   /**
            * true if acceleration is controlled
            */
   public boolean getFlagControlAccelerationEnabled()
   {
      return flag_control_acceleration_enabled_;
   }

   /**
            * true if attitude stabilization is mixed in
            */
   public void setFlagControlAttitudeEnabled(boolean flag_control_attitude_enabled)
   {
      flag_control_attitude_enabled_ = flag_control_attitude_enabled;
   }
   /**
            * true if attitude stabilization is mixed in
            */
   public boolean getFlagControlAttitudeEnabled()
   {
      return flag_control_attitude_enabled_;
   }

   /**
            * true if rates are stabilized
            */
   public void setFlagControlRatesEnabled(boolean flag_control_rates_enabled)
   {
      flag_control_rates_enabled_ = flag_control_rates_enabled;
   }
   /**
            * true if rates are stabilized
            */
   public boolean getFlagControlRatesEnabled()
   {
      return flag_control_rates_enabled_;
   }

   /**
            * true if control allocation is enabled
            */
   public void setFlagControlAllocationEnabled(boolean flag_control_allocation_enabled)
   {
      flag_control_allocation_enabled_ = flag_control_allocation_enabled;
   }
   /**
            * true if control allocation is enabled
            */
   public boolean getFlagControlAllocationEnabled()
   {
      return flag_control_allocation_enabled_;
   }

   /**
            * true if flighttermination is enabled
            */
   public void setFlagControlTerminationEnabled(boolean flag_control_termination_enabled)
   {
      flag_control_termination_enabled_ = flag_control_termination_enabled;
   }
   /**
            * true if flighttermination is enabled
            */
   public boolean getFlagControlTerminationEnabled()
   {
      return flag_control_termination_enabled_;
   }

   /**
            * TODO: use dedicated topic for external requests
            * Mode ID (nav_state)
            */
   public void setSourceId(byte source_id)
   {
      source_id_ = source_id;
   }
   /**
            * TODO: use dedicated topic for external requests
            * Mode ID (nav_state)
            */
   public byte getSourceId()
   {
      return source_id_;
   }


   public static Supplier<VehicleControlModePubSubType> getPubSubType()
   {
      return VehicleControlModePubSubType::new;
   }

   @Override
   public Supplier<TopicDataType> getPubSubTypePacket()
   {
      return VehicleControlModePubSubType::new;
   }

   @Override
   public boolean epsilonEquals(VehicleControlMode other, double epsilon)
   {
      if(other == null) return false;
      if(other == this) return true;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_, other.timestamp_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.flag_armed_, other.flag_armed_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.flag_multicopter_position_control_enabled_, other.flag_multicopter_position_control_enabled_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.flag_control_manual_enabled_, other.flag_control_manual_enabled_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.flag_control_auto_enabled_, other.flag_control_auto_enabled_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.flag_control_offboard_enabled_, other.flag_control_offboard_enabled_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.flag_control_position_enabled_, other.flag_control_position_enabled_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.flag_control_velocity_enabled_, other.flag_control_velocity_enabled_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.flag_control_altitude_enabled_, other.flag_control_altitude_enabled_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.flag_control_climb_rate_enabled_, other.flag_control_climb_rate_enabled_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.flag_control_acceleration_enabled_, other.flag_control_acceleration_enabled_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.flag_control_attitude_enabled_, other.flag_control_attitude_enabled_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.flag_control_rates_enabled_, other.flag_control_rates_enabled_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.flag_control_allocation_enabled_, other.flag_control_allocation_enabled_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.flag_control_termination_enabled_, other.flag_control_termination_enabled_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.source_id_, other.source_id_, epsilon)) return false;


      return true;
   }

   @Override
   public boolean equals(Object other)
   {
      if(other == null) return false;
      if(other == this) return true;
      if(!(other instanceof VehicleControlMode)) return false;

      VehicleControlMode otherMyClass = (VehicleControlMode) other;

      if(this.timestamp_ != otherMyClass.timestamp_) return false;

      if(this.flag_armed_ != otherMyClass.flag_armed_) return false;

      if(this.flag_multicopter_position_control_enabled_ != otherMyClass.flag_multicopter_position_control_enabled_) return false;

      if(this.flag_control_manual_enabled_ != otherMyClass.flag_control_manual_enabled_) return false;

      if(this.flag_control_auto_enabled_ != otherMyClass.flag_control_auto_enabled_) return false;

      if(this.flag_control_offboard_enabled_ != otherMyClass.flag_control_offboard_enabled_) return false;

      if(this.flag_control_position_enabled_ != otherMyClass.flag_control_position_enabled_) return false;

      if(this.flag_control_velocity_enabled_ != otherMyClass.flag_control_velocity_enabled_) return false;

      if(this.flag_control_altitude_enabled_ != otherMyClass.flag_control_altitude_enabled_) return false;

      if(this.flag_control_climb_rate_enabled_ != otherMyClass.flag_control_climb_rate_enabled_) return false;

      if(this.flag_control_acceleration_enabled_ != otherMyClass.flag_control_acceleration_enabled_) return false;

      if(this.flag_control_attitude_enabled_ != otherMyClass.flag_control_attitude_enabled_) return false;

      if(this.flag_control_rates_enabled_ != otherMyClass.flag_control_rates_enabled_) return false;

      if(this.flag_control_allocation_enabled_ != otherMyClass.flag_control_allocation_enabled_) return false;

      if(this.flag_control_termination_enabled_ != otherMyClass.flag_control_termination_enabled_) return false;

      if(this.source_id_ != otherMyClass.source_id_) return false;


      return true;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("VehicleControlMode {");
      builder.append("timestamp=");
      builder.append(this.timestamp_);      builder.append(", ");
      builder.append("flag_armed=");
      builder.append(this.flag_armed_);      builder.append(", ");
      builder.append("flag_multicopter_position_control_enabled=");
      builder.append(this.flag_multicopter_position_control_enabled_);      builder.append(", ");
      builder.append("flag_control_manual_enabled=");
      builder.append(this.flag_control_manual_enabled_);      builder.append(", ");
      builder.append("flag_control_auto_enabled=");
      builder.append(this.flag_control_auto_enabled_);      builder.append(", ");
      builder.append("flag_control_offboard_enabled=");
      builder.append(this.flag_control_offboard_enabled_);      builder.append(", ");
      builder.append("flag_control_position_enabled=");
      builder.append(this.flag_control_position_enabled_);      builder.append(", ");
      builder.append("flag_control_velocity_enabled=");
      builder.append(this.flag_control_velocity_enabled_);      builder.append(", ");
      builder.append("flag_control_altitude_enabled=");
      builder.append(this.flag_control_altitude_enabled_);      builder.append(", ");
      builder.append("flag_control_climb_rate_enabled=");
      builder.append(this.flag_control_climb_rate_enabled_);      builder.append(", ");
      builder.append("flag_control_acceleration_enabled=");
      builder.append(this.flag_control_acceleration_enabled_);      builder.append(", ");
      builder.append("flag_control_attitude_enabled=");
      builder.append(this.flag_control_attitude_enabled_);      builder.append(", ");
      builder.append("flag_control_rates_enabled=");
      builder.append(this.flag_control_rates_enabled_);      builder.append(", ");
      builder.append("flag_control_allocation_enabled=");
      builder.append(this.flag_control_allocation_enabled_);      builder.append(", ");
      builder.append("flag_control_termination_enabled=");
      builder.append(this.flag_control_termination_enabled_);      builder.append(", ");
      builder.append("source_id=");
      builder.append(this.source_id_);
      builder.append("}");
      return builder.toString();
   }
}
