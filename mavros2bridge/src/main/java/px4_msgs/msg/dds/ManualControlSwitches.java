package px4_msgs.msg.dds;

import us.ihmc.communication.packets.Packet;
import us.ihmc.euclid.interfaces.Settable;
import us.ihmc.euclid.interfaces.EpsilonComparable;
import java.util.function.Supplier;
import us.ihmc.pubsub.TopicDataType;

public class ManualControlSwitches extends Packet<ManualControlSwitches> implements Settable<ManualControlSwitches>, EpsilonComparable<ManualControlSwitches>
{
   /**
          * switch is not mapped
          */
   public static final byte SWITCH_POS_NONE = (byte) 0;
   /**
          * switch activated (value = 1)
          */
   public static final byte SWITCH_POS_ON = (byte) 1;
   /**
          * middle position (value = 0)
          */
   public static final byte SWITCH_POS_MIDDLE = (byte) 2;
   /**
          * switch not activated (value = -1)
          */
   public static final byte SWITCH_POS_OFF = (byte) 3;
   /**
          * no mode slot assigned
          */
   public static final byte MODE_SLOT_NONE = (byte) 0;
   /**
          * mode slot 1 selected
          */
   public static final byte MODE_SLOT_1 = (byte) 1;
   /**
          * mode slot 2 selected
          */
   public static final byte MODE_SLOT_2 = (byte) 2;
   /**
          * mode slot 3 selected
          */
   public static final byte MODE_SLOT_3 = (byte) 3;
   /**
          * mode slot 4 selected
          */
   public static final byte MODE_SLOT_4 = (byte) 4;
   /**
          * mode slot 5 selected
          */
   public static final byte MODE_SLOT_5 = (byte) 5;
   /**
          * mode slot 6 selected
          */
   public static final byte MODE_SLOT_6 = (byte) 6;
   /**
          * number of slots
          */
   public static final byte MODE_SLOT_NUM = (byte) 6;
   /**
            * time since system start (microseconds)
            */
   public long timestamp_;
   /**
            * the timestamp of the raw data (microseconds)
            */
   public long timestamp_sample_;
   /**
            * the slot a specific model selector is in
            */
   public byte mode_slot_;
   /**
            * arm/disarm switch: _DISARMED_, ARMED
            */
   public byte arm_switch_;
   /**
            * return to launch 2 position switch (mandatory): _NORMAL_, RTL
            */
   public byte return_switch_;
   /**
            * loiter 2 position switch (optional): _MISSION_, LOITER
            */
   public byte loiter_switch_;
   /**
            * offboard 2 position switch (optional): _NORMAL_, OFFBOARD
            */
   public byte offboard_switch_;
   /**
            * throttle kill: _NORMAL_, KILL
            */
   public byte kill_switch_;
   /**
            * landing gear switch: _DOWN_, UP
            */
   public byte gear_switch_;
   /**
            * VTOL transition switch: _HOVER, FORWARD_FLIGHT
            */
   public byte transition_switch_;
   /**
            * Photo trigger switch
            */
   public byte photo_switch_;
   /**
            * Photo trigger switch
            */
   public byte video_switch_;
   /**
            * Payload power switch
            */
   public byte payload_power_switch_;
   /**
            * Engage the main motor (for helicopters)
            */
   public byte engage_main_motor_switch_;
   /**
            * number of switch changes
            */
   public long switch_changes_;

   public ManualControlSwitches()
   {
   }

   public ManualControlSwitches(ManualControlSwitches other)
   {
      this();
      set(other);
   }

   public void set(ManualControlSwitches other)
   {
      timestamp_ = other.timestamp_;

      timestamp_sample_ = other.timestamp_sample_;

      mode_slot_ = other.mode_slot_;

      arm_switch_ = other.arm_switch_;

      return_switch_ = other.return_switch_;

      loiter_switch_ = other.loiter_switch_;

      offboard_switch_ = other.offboard_switch_;

      kill_switch_ = other.kill_switch_;

      gear_switch_ = other.gear_switch_;

      transition_switch_ = other.transition_switch_;

      photo_switch_ = other.photo_switch_;

      video_switch_ = other.video_switch_;

      payload_power_switch_ = other.payload_power_switch_;

      engage_main_motor_switch_ = other.engage_main_motor_switch_;

      switch_changes_ = other.switch_changes_;

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
            * the timestamp of the raw data (microseconds)
            */
   public void setTimestampSample(long timestamp_sample)
   {
      timestamp_sample_ = timestamp_sample;
   }
   /**
            * the timestamp of the raw data (microseconds)
            */
   public long getTimestampSample()
   {
      return timestamp_sample_;
   }

   /**
            * the slot a specific model selector is in
            */
   public void setModeSlot(byte mode_slot)
   {
      mode_slot_ = mode_slot;
   }
   /**
            * the slot a specific model selector is in
            */
   public byte getModeSlot()
   {
      return mode_slot_;
   }

   /**
            * arm/disarm switch: _DISARMED_, ARMED
            */
   public void setArmSwitch(byte arm_switch)
   {
      arm_switch_ = arm_switch;
   }
   /**
            * arm/disarm switch: _DISARMED_, ARMED
            */
   public byte getArmSwitch()
   {
      return arm_switch_;
   }

   /**
            * return to launch 2 position switch (mandatory): _NORMAL_, RTL
            */
   public void setReturnSwitch(byte return_switch)
   {
      return_switch_ = return_switch;
   }
   /**
            * return to launch 2 position switch (mandatory): _NORMAL_, RTL
            */
   public byte getReturnSwitch()
   {
      return return_switch_;
   }

   /**
            * loiter 2 position switch (optional): _MISSION_, LOITER
            */
   public void setLoiterSwitch(byte loiter_switch)
   {
      loiter_switch_ = loiter_switch;
   }
   /**
            * loiter 2 position switch (optional): _MISSION_, LOITER
            */
   public byte getLoiterSwitch()
   {
      return loiter_switch_;
   }

   /**
            * offboard 2 position switch (optional): _NORMAL_, OFFBOARD
            */
   public void setOffboardSwitch(byte offboard_switch)
   {
      offboard_switch_ = offboard_switch;
   }
   /**
            * offboard 2 position switch (optional): _NORMAL_, OFFBOARD
            */
   public byte getOffboardSwitch()
   {
      return offboard_switch_;
   }

   /**
            * throttle kill: _NORMAL_, KILL
            */
   public void setKillSwitch(byte kill_switch)
   {
      kill_switch_ = kill_switch;
   }
   /**
            * throttle kill: _NORMAL_, KILL
            */
   public byte getKillSwitch()
   {
      return kill_switch_;
   }

   /**
            * landing gear switch: _DOWN_, UP
            */
   public void setGearSwitch(byte gear_switch)
   {
      gear_switch_ = gear_switch;
   }
   /**
            * landing gear switch: _DOWN_, UP
            */
   public byte getGearSwitch()
   {
      return gear_switch_;
   }

   /**
            * VTOL transition switch: _HOVER, FORWARD_FLIGHT
            */
   public void setTransitionSwitch(byte transition_switch)
   {
      transition_switch_ = transition_switch;
   }
   /**
            * VTOL transition switch: _HOVER, FORWARD_FLIGHT
            */
   public byte getTransitionSwitch()
   {
      return transition_switch_;
   }

   /**
            * Photo trigger switch
            */
   public void setPhotoSwitch(byte photo_switch)
   {
      photo_switch_ = photo_switch;
   }
   /**
            * Photo trigger switch
            */
   public byte getPhotoSwitch()
   {
      return photo_switch_;
   }

   /**
            * Photo trigger switch
            */
   public void setVideoSwitch(byte video_switch)
   {
      video_switch_ = video_switch;
   }
   /**
            * Photo trigger switch
            */
   public byte getVideoSwitch()
   {
      return video_switch_;
   }

   /**
            * Payload power switch
            */
   public void setPayloadPowerSwitch(byte payload_power_switch)
   {
      payload_power_switch_ = payload_power_switch;
   }
   /**
            * Payload power switch
            */
   public byte getPayloadPowerSwitch()
   {
      return payload_power_switch_;
   }

   /**
            * Engage the main motor (for helicopters)
            */
   public void setEngageMainMotorSwitch(byte engage_main_motor_switch)
   {
      engage_main_motor_switch_ = engage_main_motor_switch;
   }
   /**
            * Engage the main motor (for helicopters)
            */
   public byte getEngageMainMotorSwitch()
   {
      return engage_main_motor_switch_;
   }

   /**
            * number of switch changes
            */
   public void setSwitchChanges(long switch_changes)
   {
      switch_changes_ = switch_changes;
   }
   /**
            * number of switch changes
            */
   public long getSwitchChanges()
   {
      return switch_changes_;
   }


   public static Supplier<ManualControlSwitchesPubSubType> getPubSubType()
   {
      return ManualControlSwitchesPubSubType::new;
   }

   @Override
   public Supplier<TopicDataType> getPubSubTypePacket()
   {
      return ManualControlSwitchesPubSubType::new;
   }

   @Override
   public boolean epsilonEquals(ManualControlSwitches other, double epsilon)
   {
      if(other == null) return false;
      if(other == this) return true;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_, other.timestamp_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_sample_, other.timestamp_sample_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.mode_slot_, other.mode_slot_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.arm_switch_, other.arm_switch_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.return_switch_, other.return_switch_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.loiter_switch_, other.loiter_switch_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.offboard_switch_, other.offboard_switch_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.kill_switch_, other.kill_switch_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.gear_switch_, other.gear_switch_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.transition_switch_, other.transition_switch_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.photo_switch_, other.photo_switch_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.video_switch_, other.video_switch_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.payload_power_switch_, other.payload_power_switch_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.engage_main_motor_switch_, other.engage_main_motor_switch_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.switch_changes_, other.switch_changes_, epsilon)) return false;


      return true;
   }

   @Override
   public boolean equals(Object other)
   {
      if(other == null) return false;
      if(other == this) return true;
      if(!(other instanceof ManualControlSwitches)) return false;

      ManualControlSwitches otherMyClass = (ManualControlSwitches) other;

      if(this.timestamp_ != otherMyClass.timestamp_) return false;

      if(this.timestamp_sample_ != otherMyClass.timestamp_sample_) return false;

      if(this.mode_slot_ != otherMyClass.mode_slot_) return false;

      if(this.arm_switch_ != otherMyClass.arm_switch_) return false;

      if(this.return_switch_ != otherMyClass.return_switch_) return false;

      if(this.loiter_switch_ != otherMyClass.loiter_switch_) return false;

      if(this.offboard_switch_ != otherMyClass.offboard_switch_) return false;

      if(this.kill_switch_ != otherMyClass.kill_switch_) return false;

      if(this.gear_switch_ != otherMyClass.gear_switch_) return false;

      if(this.transition_switch_ != otherMyClass.transition_switch_) return false;

      if(this.photo_switch_ != otherMyClass.photo_switch_) return false;

      if(this.video_switch_ != otherMyClass.video_switch_) return false;

      if(this.payload_power_switch_ != otherMyClass.payload_power_switch_) return false;

      if(this.engage_main_motor_switch_ != otherMyClass.engage_main_motor_switch_) return false;

      if(this.switch_changes_ != otherMyClass.switch_changes_) return false;


      return true;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("ManualControlSwitches {");
      builder.append("timestamp=");
      builder.append(this.timestamp_);      builder.append(", ");
      builder.append("timestamp_sample=");
      builder.append(this.timestamp_sample_);      builder.append(", ");
      builder.append("mode_slot=");
      builder.append(this.mode_slot_);      builder.append(", ");
      builder.append("arm_switch=");
      builder.append(this.arm_switch_);      builder.append(", ");
      builder.append("return_switch=");
      builder.append(this.return_switch_);      builder.append(", ");
      builder.append("loiter_switch=");
      builder.append(this.loiter_switch_);      builder.append(", ");
      builder.append("offboard_switch=");
      builder.append(this.offboard_switch_);      builder.append(", ");
      builder.append("kill_switch=");
      builder.append(this.kill_switch_);      builder.append(", ");
      builder.append("gear_switch=");
      builder.append(this.gear_switch_);      builder.append(", ");
      builder.append("transition_switch=");
      builder.append(this.transition_switch_);      builder.append(", ");
      builder.append("photo_switch=");
      builder.append(this.photo_switch_);      builder.append(", ");
      builder.append("video_switch=");
      builder.append(this.video_switch_);      builder.append(", ");
      builder.append("payload_power_switch=");
      builder.append(this.payload_power_switch_);      builder.append(", ");
      builder.append("engage_main_motor_switch=");
      builder.append(this.engage_main_motor_switch_);      builder.append(", ");
      builder.append("switch_changes=");
      builder.append(this.switch_changes_);
      builder.append("}");
      return builder.toString();
   }
}
