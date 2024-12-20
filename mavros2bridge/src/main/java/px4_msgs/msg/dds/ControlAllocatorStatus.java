package px4_msgs.msg.dds;

import us.ihmc.communication.packets.Packet;
import us.ihmc.euclid.interfaces.Settable;
import us.ihmc.euclid.interfaces.EpsilonComparable;
import java.util.function.Supplier;
import us.ihmc.pubsub.TopicDataType;

/**
       * Computed as: unallocated_torque = torque_setpoint - allocated_torque
       * Computed as: unallocated_thrust = thrust_setpoint - allocated_thrust
       * Note 1: actuator saturation does not necessarily imply that the thrust setpoint or the torque setpoint were not achieved.
       * Note 2: an actuator with limited dynamics can be indicated as upper-saturated even if it as not reached its maximum value.
       */
public class ControlAllocatorStatus extends Packet<ControlAllocatorStatus> implements Settable<ControlAllocatorStatus>, EpsilonComparable<ControlAllocatorStatus>
{
   /**
          * The actuator is not saturated
          */
   public static final byte ACTUATOR_SATURATION_OK = (byte) 0;
   /**
          * The actuator is saturated (with a value <= the desired value) because it cannot increase its value faster
          */
   public static final byte ACTUATOR_SATURATION_UPPER_DYN = (byte) 1;
   /**
          * The actuator is saturated (with a value <= the desired value) because it has reached its maximum value
          */
   public static final byte ACTUATOR_SATURATION_UPPER = (byte) 2;
   /**
          * The actuator is saturated (with a value >= the desired value) because it cannot decrease its value faster
          */
   public static final byte ACTUATOR_SATURATION_LOWER_DYN = (byte) 255;
   /**
          * The actuator is saturated (with a value >= the desired value) because it has reached its minimum value
          */
   public static final byte ACTUATOR_SATURATION_LOWER = (byte) 254;
   /**
            * time since system start (microseconds)
            */
   public long timestamp_;
   /**
            * Boolean indicating whether the 3D torque setpoint was correctly allocated to actuators. 0 if not achieved, 1 if achieved.
            */
   public boolean torque_setpoint_achieved_;
   /**
            * Unallocated torque. Equal to 0 if the setpoint was achieved.
            */
   public float[] unallocated_torque_;
   /**
            * Boolean indicating whether the 3D thrust setpoint was correctly allocated to actuators. 0 if not achieved, 1 if achieved.
            */
   public boolean thrust_setpoint_achieved_;
   /**
            * Unallocated thrust. Equal to 0 if the setpoint was achieved.
            */
   public float[] unallocated_thrust_;
   /**
            * Indicates actuator saturation status.
            */
   public byte[] actuator_saturation_;
   /**
            * Bitmask of failed motors that were removed from the allocation / effectiveness matrix. Not necessarily identical to the report from FailureDetector
            */
   public int handled_motor_failure_mask_;

   public ControlAllocatorStatus()
   {
      unallocated_torque_ = new float[3];

      unallocated_thrust_ = new float[3];

      actuator_saturation_ = new byte[16];

   }

   public ControlAllocatorStatus(ControlAllocatorStatus other)
   {
      this();
      set(other);
   }

   public void set(ControlAllocatorStatus other)
   {
      timestamp_ = other.timestamp_;

      torque_setpoint_achieved_ = other.torque_setpoint_achieved_;

      for(int i1 = 0; i1 < unallocated_torque_.length; ++i1)
      {
            unallocated_torque_[i1] = other.unallocated_torque_[i1];

      }

      thrust_setpoint_achieved_ = other.thrust_setpoint_achieved_;

      for(int i3 = 0; i3 < unallocated_thrust_.length; ++i3)
      {
            unallocated_thrust_[i3] = other.unallocated_thrust_[i3];

      }

      for(int i5 = 0; i5 < actuator_saturation_.length; ++i5)
      {
            actuator_saturation_[i5] = other.actuator_saturation_[i5];

      }

      handled_motor_failure_mask_ = other.handled_motor_failure_mask_;

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
            * Boolean indicating whether the 3D torque setpoint was correctly allocated to actuators. 0 if not achieved, 1 if achieved.
            */
   public void setTorqueSetpointAchieved(boolean torque_setpoint_achieved)
   {
      torque_setpoint_achieved_ = torque_setpoint_achieved;
   }
   /**
            * Boolean indicating whether the 3D torque setpoint was correctly allocated to actuators. 0 if not achieved, 1 if achieved.
            */
   public boolean getTorqueSetpointAchieved()
   {
      return torque_setpoint_achieved_;
   }


   /**
            * Unallocated torque. Equal to 0 if the setpoint was achieved.
            */
   public float[] getUnallocatedTorque()
   {
      return unallocated_torque_;
   }

   /**
            * Boolean indicating whether the 3D thrust setpoint was correctly allocated to actuators. 0 if not achieved, 1 if achieved.
            */
   public void setThrustSetpointAchieved(boolean thrust_setpoint_achieved)
   {
      thrust_setpoint_achieved_ = thrust_setpoint_achieved;
   }
   /**
            * Boolean indicating whether the 3D thrust setpoint was correctly allocated to actuators. 0 if not achieved, 1 if achieved.
            */
   public boolean getThrustSetpointAchieved()
   {
      return thrust_setpoint_achieved_;
   }


   /**
            * Unallocated thrust. Equal to 0 if the setpoint was achieved.
            */
   public float[] getUnallocatedThrust()
   {
      return unallocated_thrust_;
   }


   /**
            * Indicates actuator saturation status.
            */
   public byte[] getActuatorSaturation()
   {
      return actuator_saturation_;
   }

   /**
            * Bitmask of failed motors that were removed from the allocation / effectiveness matrix. Not necessarily identical to the report from FailureDetector
            */
   public void setHandledMotorFailureMask(int handled_motor_failure_mask)
   {
      handled_motor_failure_mask_ = handled_motor_failure_mask;
   }
   /**
            * Bitmask of failed motors that were removed from the allocation / effectiveness matrix. Not necessarily identical to the report from FailureDetector
            */
   public int getHandledMotorFailureMask()
   {
      return handled_motor_failure_mask_;
   }


   public static Supplier<ControlAllocatorStatusPubSubType> getPubSubType()
   {
      return ControlAllocatorStatusPubSubType::new;
   }

   @Override
   public Supplier<TopicDataType> getPubSubTypePacket()
   {
      return ControlAllocatorStatusPubSubType::new;
   }

   @Override
   public boolean epsilonEquals(ControlAllocatorStatus other, double epsilon)
   {
      if(other == null) return false;
      if(other == this) return true;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_, other.timestamp_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.torque_setpoint_achieved_, other.torque_setpoint_achieved_, epsilon)) return false;

      for(int i7 = 0; i7 < unallocated_torque_.length; ++i7)
      {
                if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.unallocated_torque_[i7], other.unallocated_torque_[i7], epsilon)) return false;
      }

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.thrust_setpoint_achieved_, other.thrust_setpoint_achieved_, epsilon)) return false;

      for(int i9 = 0; i9 < unallocated_thrust_.length; ++i9)
      {
                if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.unallocated_thrust_[i9], other.unallocated_thrust_[i9], epsilon)) return false;
      }

      for(int i11 = 0; i11 < actuator_saturation_.length; ++i11)
      {
                if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.actuator_saturation_[i11], other.actuator_saturation_[i11], epsilon)) return false;
      }

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.handled_motor_failure_mask_, other.handled_motor_failure_mask_, epsilon)) return false;


      return true;
   }

   @Override
   public boolean equals(Object other)
   {
      if(other == null) return false;
      if(other == this) return true;
      if(!(other instanceof ControlAllocatorStatus)) return false;

      ControlAllocatorStatus otherMyClass = (ControlAllocatorStatus) other;

      if(this.timestamp_ != otherMyClass.timestamp_) return false;

      if(this.torque_setpoint_achieved_ != otherMyClass.torque_setpoint_achieved_) return false;

      for(int i13 = 0; i13 < unallocated_torque_.length; ++i13)
      {
                if(this.unallocated_torque_[i13] != otherMyClass.unallocated_torque_[i13]) return false;

      }
      if(this.thrust_setpoint_achieved_ != otherMyClass.thrust_setpoint_achieved_) return false;

      for(int i15 = 0; i15 < unallocated_thrust_.length; ++i15)
      {
                if(this.unallocated_thrust_[i15] != otherMyClass.unallocated_thrust_[i15]) return false;

      }
      for(int i17 = 0; i17 < actuator_saturation_.length; ++i17)
      {
                if(this.actuator_saturation_[i17] != otherMyClass.actuator_saturation_[i17]) return false;

      }
      if(this.handled_motor_failure_mask_ != otherMyClass.handled_motor_failure_mask_) return false;


      return true;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("ControlAllocatorStatus {");
      builder.append("timestamp=");
      builder.append(this.timestamp_);      builder.append(", ");
      builder.append("torque_setpoint_achieved=");
      builder.append(this.torque_setpoint_achieved_);      builder.append(", ");
      builder.append("unallocated_torque=");
      builder.append(java.util.Arrays.toString(this.unallocated_torque_));      builder.append(", ");
      builder.append("thrust_setpoint_achieved=");
      builder.append(this.thrust_setpoint_achieved_);      builder.append(", ");
      builder.append("unallocated_thrust=");
      builder.append(java.util.Arrays.toString(this.unallocated_thrust_));      builder.append(", ");
      builder.append("actuator_saturation=");
      builder.append(java.util.Arrays.toString(this.actuator_saturation_));      builder.append(", ");
      builder.append("handled_motor_failure_mask=");
      builder.append(this.handled_motor_failure_mask_);
      builder.append("}");
      return builder.toString();
   }
}
