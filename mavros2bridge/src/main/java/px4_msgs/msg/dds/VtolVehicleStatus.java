package px4_msgs.msg.dds;

import us.ihmc.communication.packets.Packet;
import us.ihmc.euclid.interfaces.Settable;
import us.ihmc.euclid.interfaces.EpsilonComparable;
import java.util.function.Supplier;
import us.ihmc.pubsub.TopicDataType;

public class VtolVehicleStatus extends Packet<VtolVehicleStatus> implements Settable<VtolVehicleStatus>, EpsilonComparable<VtolVehicleStatus>
{
   /**
          * VEHICLE_VTOL_STATE, should match 1:1 MAVLinks's MAV_VTOL_STATE
          */
   public static final byte VEHICLE_VTOL_STATE_UNDEFINED = (byte) 0;
   public static final byte VEHICLE_VTOL_STATE_TRANSITION_TO_FW = (byte) 1;
   public static final byte VEHICLE_VTOL_STATE_TRANSITION_TO_MC = (byte) 2;
   public static final byte VEHICLE_VTOL_STATE_MC = (byte) 3;
   public static final byte VEHICLE_VTOL_STATE_FW = (byte) 4;
   /**
            * time since system start (microseconds)
            */
   public long timestamp_;
   /**
            * current state of the vtol, see VEHICLE_VTOL_STATE
            */
   public byte vehicle_vtol_state_;
   /**
            * vehicle in fixed-wing system failure failsafe mode (after quad-chute)
            */
   public boolean fixed_wing_system_failure_;

   public VtolVehicleStatus()
   {
   }

   public VtolVehicleStatus(VtolVehicleStatus other)
   {
      this();
      set(other);
   }

   public void set(VtolVehicleStatus other)
   {
      timestamp_ = other.timestamp_;

      vehicle_vtol_state_ = other.vehicle_vtol_state_;

      fixed_wing_system_failure_ = other.fixed_wing_system_failure_;

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
            * current state of the vtol, see VEHICLE_VTOL_STATE
            */
   public void setVehicleVtolState(byte vehicle_vtol_state)
   {
      vehicle_vtol_state_ = vehicle_vtol_state;
   }
   /**
            * current state of the vtol, see VEHICLE_VTOL_STATE
            */
   public byte getVehicleVtolState()
   {
      return vehicle_vtol_state_;
   }

   /**
            * vehicle in fixed-wing system failure failsafe mode (after quad-chute)
            */
   public void setFixedWingSystemFailure(boolean fixed_wing_system_failure)
   {
      fixed_wing_system_failure_ = fixed_wing_system_failure;
   }
   /**
            * vehicle in fixed-wing system failure failsafe mode (after quad-chute)
            */
   public boolean getFixedWingSystemFailure()
   {
      return fixed_wing_system_failure_;
   }


   public static Supplier<VtolVehicleStatusPubSubType> getPubSubType()
   {
      return VtolVehicleStatusPubSubType::new;
   }

   @Override
   public Supplier<TopicDataType> getPubSubTypePacket()
   {
      return VtolVehicleStatusPubSubType::new;
   }

   @Override
   public boolean epsilonEquals(VtolVehicleStatus other, double epsilon)
   {
      if(other == null) return false;
      if(other == this) return true;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_, other.timestamp_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.vehicle_vtol_state_, other.vehicle_vtol_state_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.fixed_wing_system_failure_, other.fixed_wing_system_failure_, epsilon)) return false;


      return true;
   }

   @Override
   public boolean equals(Object other)
   {
      if(other == null) return false;
      if(other == this) return true;
      if(!(other instanceof VtolVehicleStatus)) return false;

      VtolVehicleStatus otherMyClass = (VtolVehicleStatus) other;

      if(this.timestamp_ != otherMyClass.timestamp_) return false;

      if(this.vehicle_vtol_state_ != otherMyClass.vehicle_vtol_state_) return false;

      if(this.fixed_wing_system_failure_ != otherMyClass.fixed_wing_system_failure_) return false;


      return true;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("VtolVehicleStatus {");
      builder.append("timestamp=");
      builder.append(this.timestamp_);      builder.append(", ");
      builder.append("vehicle_vtol_state=");
      builder.append(this.vehicle_vtol_state_);      builder.append(", ");
      builder.append("fixed_wing_system_failure=");
      builder.append(this.fixed_wing_system_failure_);
      builder.append("}");
      return builder.toString();
   }
}
