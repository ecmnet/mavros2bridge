package px4_msgs.msg.dds;

import us.ihmc.communication.packets.Packet;
import us.ihmc.euclid.interfaces.Settable;
import us.ihmc.euclid.interfaces.EpsilonComparable;
import java.util.function.Supplier;
import us.ihmc.pubsub.TopicDataType;

/**
       * Input flags for the failsafe state machine set by the arming & health checks.
       * 
       * Flags must be named such that false == no failure (e.g. _invalid, _unhealthy, _lost)
       * The flag comments are used as label for the failsafe state machine simulation
       */
public class FailsafeFlags extends Packet<FailsafeFlags> implements Settable<FailsafeFlags>, EpsilonComparable<FailsafeFlags>
{
   /**
            * time since system start (microseconds)
            */
   public long timestamp_;
   /**
            * Per-mode requirements
            */
   public long mode_req_angular_velocity_;
   public long mode_req_attitude_;
   public long mode_req_local_alt_;
   public long mode_req_local_position_;
   public long mode_req_local_position_relaxed_;
   public long mode_req_global_position_;
   public long mode_req_mission_;
   public long mode_req_offboard_signal_;
   public long mode_req_home_position_;
   /**
            * if set, mode cannot be entered if wind or flight time limit exceeded
            */
   public long mode_req_wind_and_flight_time_compliance_;
   /**
            * if set, cannot arm while in this mode
            */
   public long mode_req_prevent_arming_;
   public long mode_req_manual_control_;
   /**
            * other requirements, not covered above (for external modes)
            */
   public long mode_req_other_;
   /**
            * Mode requirements
            * Angular velocity invalid
            */
   public boolean angular_velocity_invalid_;
   /**
            * Attitude invalid
            */
   public boolean attitude_invalid_;
   /**
            * Local altitude invalid
            */
   public boolean local_altitude_invalid_;
   /**
            * Local position estimate invalid
            */
   public boolean local_position_invalid_;
   /**
            * Local position with reduced accuracy requirements invalid (e.g. flying with optical flow)
            */
   public boolean local_position_invalid_relaxed_;
   /**
            * Local velocity estimate invalid
            */
   public boolean local_velocity_invalid_;
   /**
            * Global position estimate invalid
            */
   public boolean global_position_invalid_;
   /**
            * No mission available
            */
   public boolean auto_mission_missing_;
   /**
            * Offboard signal lost
            */
   public boolean offboard_control_signal_lost_;
   /**
            * No home position available
            */
   public boolean home_position_invalid_;
   /**
            * Control links
            * Manual control (RC) signal lost
            */
   public boolean manual_control_signal_lost_;
   /**
            * GCS connection lost
            */
   public boolean gcs_connection_lost_;
   /**
            * Battery
            * Battery warning level (see BatteryStatus.msg)
            */
   public byte battery_warning_;
   /**
            * Low battery based on remaining flight time
            */
   public boolean battery_low_remaining_time_;
   /**
            * Battery unhealthy
            */
   public boolean battery_unhealthy_;
   /**
            * Other
            * Geofence breached (one or multiple)
            */
   public boolean geofence_breached_;
   /**
            * Mission failure
            */
   public boolean mission_failure_;
   /**
            * vehicle in fixed-wing system failure failsafe mode (after quad-chute)
            */
   public boolean vtol_fixed_wing_system_failure_;
   /**
            * Wind limit exceeded
            */
   public boolean wind_limit_exceeded_;
   /**
            * Maximum flight time exceeded
            */
   public boolean flight_time_limit_exceeded_;
   /**
            * Local position estimate has dropped below threshold, but is currently still declared valid
            */
   public boolean local_position_accuracy_low_;
   /**
            * Navigator failed to execute a mode
            */
   public boolean navigator_failure_;
   /**
            * Failure detector
            * Critical failure (attitude/altitude limit exceeded, or external ATS)
            */
   public boolean fd_critical_failure_;
   /**
            * ESC failed to arm
            */
   public boolean fd_esc_arming_failure_;
   /**
            * Imbalanced propeller detected
            */
   public boolean fd_imbalanced_prop_;
   /**
            * Motor failure
            */
   public boolean fd_motor_failure_;

   public FailsafeFlags()
   {
   }

   public FailsafeFlags(FailsafeFlags other)
   {
      this();
      set(other);
   }

   public void set(FailsafeFlags other)
   {
      timestamp_ = other.timestamp_;

      mode_req_angular_velocity_ = other.mode_req_angular_velocity_;

      mode_req_attitude_ = other.mode_req_attitude_;

      mode_req_local_alt_ = other.mode_req_local_alt_;

      mode_req_local_position_ = other.mode_req_local_position_;

      mode_req_local_position_relaxed_ = other.mode_req_local_position_relaxed_;

      mode_req_global_position_ = other.mode_req_global_position_;

      mode_req_mission_ = other.mode_req_mission_;

      mode_req_offboard_signal_ = other.mode_req_offboard_signal_;

      mode_req_home_position_ = other.mode_req_home_position_;

      mode_req_wind_and_flight_time_compliance_ = other.mode_req_wind_and_flight_time_compliance_;

      mode_req_prevent_arming_ = other.mode_req_prevent_arming_;

      mode_req_manual_control_ = other.mode_req_manual_control_;

      mode_req_other_ = other.mode_req_other_;

      angular_velocity_invalid_ = other.angular_velocity_invalid_;

      attitude_invalid_ = other.attitude_invalid_;

      local_altitude_invalid_ = other.local_altitude_invalid_;

      local_position_invalid_ = other.local_position_invalid_;

      local_position_invalid_relaxed_ = other.local_position_invalid_relaxed_;

      local_velocity_invalid_ = other.local_velocity_invalid_;

      global_position_invalid_ = other.global_position_invalid_;

      auto_mission_missing_ = other.auto_mission_missing_;

      offboard_control_signal_lost_ = other.offboard_control_signal_lost_;

      home_position_invalid_ = other.home_position_invalid_;

      manual_control_signal_lost_ = other.manual_control_signal_lost_;

      gcs_connection_lost_ = other.gcs_connection_lost_;

      battery_warning_ = other.battery_warning_;

      battery_low_remaining_time_ = other.battery_low_remaining_time_;

      battery_unhealthy_ = other.battery_unhealthy_;

      geofence_breached_ = other.geofence_breached_;

      mission_failure_ = other.mission_failure_;

      vtol_fixed_wing_system_failure_ = other.vtol_fixed_wing_system_failure_;

      wind_limit_exceeded_ = other.wind_limit_exceeded_;

      flight_time_limit_exceeded_ = other.flight_time_limit_exceeded_;

      local_position_accuracy_low_ = other.local_position_accuracy_low_;

      navigator_failure_ = other.navigator_failure_;

      fd_critical_failure_ = other.fd_critical_failure_;

      fd_esc_arming_failure_ = other.fd_esc_arming_failure_;

      fd_imbalanced_prop_ = other.fd_imbalanced_prop_;

      fd_motor_failure_ = other.fd_motor_failure_;

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
            * Per-mode requirements
            */
   public void setModeReqAngularVelocity(long mode_req_angular_velocity)
   {
      mode_req_angular_velocity_ = mode_req_angular_velocity;
   }
   /**
            * Per-mode requirements
            */
   public long getModeReqAngularVelocity()
   {
      return mode_req_angular_velocity_;
   }

   public void setModeReqAttitude(long mode_req_attitude)
   {
      mode_req_attitude_ = mode_req_attitude;
   }
   public long getModeReqAttitude()
   {
      return mode_req_attitude_;
   }

   public void setModeReqLocalAlt(long mode_req_local_alt)
   {
      mode_req_local_alt_ = mode_req_local_alt;
   }
   public long getModeReqLocalAlt()
   {
      return mode_req_local_alt_;
   }

   public void setModeReqLocalPosition(long mode_req_local_position)
   {
      mode_req_local_position_ = mode_req_local_position;
   }
   public long getModeReqLocalPosition()
   {
      return mode_req_local_position_;
   }

   public void setModeReqLocalPositionRelaxed(long mode_req_local_position_relaxed)
   {
      mode_req_local_position_relaxed_ = mode_req_local_position_relaxed;
   }
   public long getModeReqLocalPositionRelaxed()
   {
      return mode_req_local_position_relaxed_;
   }

   public void setModeReqGlobalPosition(long mode_req_global_position)
   {
      mode_req_global_position_ = mode_req_global_position;
   }
   public long getModeReqGlobalPosition()
   {
      return mode_req_global_position_;
   }

   public void setModeReqMission(long mode_req_mission)
   {
      mode_req_mission_ = mode_req_mission;
   }
   public long getModeReqMission()
   {
      return mode_req_mission_;
   }

   public void setModeReqOffboardSignal(long mode_req_offboard_signal)
   {
      mode_req_offboard_signal_ = mode_req_offboard_signal;
   }
   public long getModeReqOffboardSignal()
   {
      return mode_req_offboard_signal_;
   }

   public void setModeReqHomePosition(long mode_req_home_position)
   {
      mode_req_home_position_ = mode_req_home_position;
   }
   public long getModeReqHomePosition()
   {
      return mode_req_home_position_;
   }

   /**
            * if set, mode cannot be entered if wind or flight time limit exceeded
            */
   public void setModeReqWindAndFlightTimeCompliance(long mode_req_wind_and_flight_time_compliance)
   {
      mode_req_wind_and_flight_time_compliance_ = mode_req_wind_and_flight_time_compliance;
   }
   /**
            * if set, mode cannot be entered if wind or flight time limit exceeded
            */
   public long getModeReqWindAndFlightTimeCompliance()
   {
      return mode_req_wind_and_flight_time_compliance_;
   }

   /**
            * if set, cannot arm while in this mode
            */
   public void setModeReqPreventArming(long mode_req_prevent_arming)
   {
      mode_req_prevent_arming_ = mode_req_prevent_arming;
   }
   /**
            * if set, cannot arm while in this mode
            */
   public long getModeReqPreventArming()
   {
      return mode_req_prevent_arming_;
   }

   public void setModeReqManualControl(long mode_req_manual_control)
   {
      mode_req_manual_control_ = mode_req_manual_control;
   }
   public long getModeReqManualControl()
   {
      return mode_req_manual_control_;
   }

   /**
            * other requirements, not covered above (for external modes)
            */
   public void setModeReqOther(long mode_req_other)
   {
      mode_req_other_ = mode_req_other;
   }
   /**
            * other requirements, not covered above (for external modes)
            */
   public long getModeReqOther()
   {
      return mode_req_other_;
   }

   /**
            * Mode requirements
            * Angular velocity invalid
            */
   public void setAngularVelocityInvalid(boolean angular_velocity_invalid)
   {
      angular_velocity_invalid_ = angular_velocity_invalid;
   }
   /**
            * Mode requirements
            * Angular velocity invalid
            */
   public boolean getAngularVelocityInvalid()
   {
      return angular_velocity_invalid_;
   }

   /**
            * Attitude invalid
            */
   public void setAttitudeInvalid(boolean attitude_invalid)
   {
      attitude_invalid_ = attitude_invalid;
   }
   /**
            * Attitude invalid
            */
   public boolean getAttitudeInvalid()
   {
      return attitude_invalid_;
   }

   /**
            * Local altitude invalid
            */
   public void setLocalAltitudeInvalid(boolean local_altitude_invalid)
   {
      local_altitude_invalid_ = local_altitude_invalid;
   }
   /**
            * Local altitude invalid
            */
   public boolean getLocalAltitudeInvalid()
   {
      return local_altitude_invalid_;
   }

   /**
            * Local position estimate invalid
            */
   public void setLocalPositionInvalid(boolean local_position_invalid)
   {
      local_position_invalid_ = local_position_invalid;
   }
   /**
            * Local position estimate invalid
            */
   public boolean getLocalPositionInvalid()
   {
      return local_position_invalid_;
   }

   /**
            * Local position with reduced accuracy requirements invalid (e.g. flying with optical flow)
            */
   public void setLocalPositionInvalidRelaxed(boolean local_position_invalid_relaxed)
   {
      local_position_invalid_relaxed_ = local_position_invalid_relaxed;
   }
   /**
            * Local position with reduced accuracy requirements invalid (e.g. flying with optical flow)
            */
   public boolean getLocalPositionInvalidRelaxed()
   {
      return local_position_invalid_relaxed_;
   }

   /**
            * Local velocity estimate invalid
            */
   public void setLocalVelocityInvalid(boolean local_velocity_invalid)
   {
      local_velocity_invalid_ = local_velocity_invalid;
   }
   /**
            * Local velocity estimate invalid
            */
   public boolean getLocalVelocityInvalid()
   {
      return local_velocity_invalid_;
   }

   /**
            * Global position estimate invalid
            */
   public void setGlobalPositionInvalid(boolean global_position_invalid)
   {
      global_position_invalid_ = global_position_invalid;
   }
   /**
            * Global position estimate invalid
            */
   public boolean getGlobalPositionInvalid()
   {
      return global_position_invalid_;
   }

   /**
            * No mission available
            */
   public void setAutoMissionMissing(boolean auto_mission_missing)
   {
      auto_mission_missing_ = auto_mission_missing;
   }
   /**
            * No mission available
            */
   public boolean getAutoMissionMissing()
   {
      return auto_mission_missing_;
   }

   /**
            * Offboard signal lost
            */
   public void setOffboardControlSignalLost(boolean offboard_control_signal_lost)
   {
      offboard_control_signal_lost_ = offboard_control_signal_lost;
   }
   /**
            * Offboard signal lost
            */
   public boolean getOffboardControlSignalLost()
   {
      return offboard_control_signal_lost_;
   }

   /**
            * No home position available
            */
   public void setHomePositionInvalid(boolean home_position_invalid)
   {
      home_position_invalid_ = home_position_invalid;
   }
   /**
            * No home position available
            */
   public boolean getHomePositionInvalid()
   {
      return home_position_invalid_;
   }

   /**
            * Control links
            * Manual control (RC) signal lost
            */
   public void setManualControlSignalLost(boolean manual_control_signal_lost)
   {
      manual_control_signal_lost_ = manual_control_signal_lost;
   }
   /**
            * Control links
            * Manual control (RC) signal lost
            */
   public boolean getManualControlSignalLost()
   {
      return manual_control_signal_lost_;
   }

   /**
            * GCS connection lost
            */
   public void setGcsConnectionLost(boolean gcs_connection_lost)
   {
      gcs_connection_lost_ = gcs_connection_lost;
   }
   /**
            * GCS connection lost
            */
   public boolean getGcsConnectionLost()
   {
      return gcs_connection_lost_;
   }

   /**
            * Battery
            * Battery warning level (see BatteryStatus.msg)
            */
   public void setBatteryWarning(byte battery_warning)
   {
      battery_warning_ = battery_warning;
   }
   /**
            * Battery
            * Battery warning level (see BatteryStatus.msg)
            */
   public byte getBatteryWarning()
   {
      return battery_warning_;
   }

   /**
            * Low battery based on remaining flight time
            */
   public void setBatteryLowRemainingTime(boolean battery_low_remaining_time)
   {
      battery_low_remaining_time_ = battery_low_remaining_time;
   }
   /**
            * Low battery based on remaining flight time
            */
   public boolean getBatteryLowRemainingTime()
   {
      return battery_low_remaining_time_;
   }

   /**
            * Battery unhealthy
            */
   public void setBatteryUnhealthy(boolean battery_unhealthy)
   {
      battery_unhealthy_ = battery_unhealthy;
   }
   /**
            * Battery unhealthy
            */
   public boolean getBatteryUnhealthy()
   {
      return battery_unhealthy_;
   }

   /**
            * Other
            * Geofence breached (one or multiple)
            */
   public void setGeofenceBreached(boolean geofence_breached)
   {
      geofence_breached_ = geofence_breached;
   }
   /**
            * Other
            * Geofence breached (one or multiple)
            */
   public boolean getGeofenceBreached()
   {
      return geofence_breached_;
   }

   /**
            * Mission failure
            */
   public void setMissionFailure(boolean mission_failure)
   {
      mission_failure_ = mission_failure;
   }
   /**
            * Mission failure
            */
   public boolean getMissionFailure()
   {
      return mission_failure_;
   }

   /**
            * vehicle in fixed-wing system failure failsafe mode (after quad-chute)
            */
   public void setVtolFixedWingSystemFailure(boolean vtol_fixed_wing_system_failure)
   {
      vtol_fixed_wing_system_failure_ = vtol_fixed_wing_system_failure;
   }
   /**
            * vehicle in fixed-wing system failure failsafe mode (after quad-chute)
            */
   public boolean getVtolFixedWingSystemFailure()
   {
      return vtol_fixed_wing_system_failure_;
   }

   /**
            * Wind limit exceeded
            */
   public void setWindLimitExceeded(boolean wind_limit_exceeded)
   {
      wind_limit_exceeded_ = wind_limit_exceeded;
   }
   /**
            * Wind limit exceeded
            */
   public boolean getWindLimitExceeded()
   {
      return wind_limit_exceeded_;
   }

   /**
            * Maximum flight time exceeded
            */
   public void setFlightTimeLimitExceeded(boolean flight_time_limit_exceeded)
   {
      flight_time_limit_exceeded_ = flight_time_limit_exceeded;
   }
   /**
            * Maximum flight time exceeded
            */
   public boolean getFlightTimeLimitExceeded()
   {
      return flight_time_limit_exceeded_;
   }

   /**
            * Local position estimate has dropped below threshold, but is currently still declared valid
            */
   public void setLocalPositionAccuracyLow(boolean local_position_accuracy_low)
   {
      local_position_accuracy_low_ = local_position_accuracy_low;
   }
   /**
            * Local position estimate has dropped below threshold, but is currently still declared valid
            */
   public boolean getLocalPositionAccuracyLow()
   {
      return local_position_accuracy_low_;
   }

   /**
            * Navigator failed to execute a mode
            */
   public void setNavigatorFailure(boolean navigator_failure)
   {
      navigator_failure_ = navigator_failure;
   }
   /**
            * Navigator failed to execute a mode
            */
   public boolean getNavigatorFailure()
   {
      return navigator_failure_;
   }

   /**
            * Failure detector
            * Critical failure (attitude/altitude limit exceeded, or external ATS)
            */
   public void setFdCriticalFailure(boolean fd_critical_failure)
   {
      fd_critical_failure_ = fd_critical_failure;
   }
   /**
            * Failure detector
            * Critical failure (attitude/altitude limit exceeded, or external ATS)
            */
   public boolean getFdCriticalFailure()
   {
      return fd_critical_failure_;
   }

   /**
            * ESC failed to arm
            */
   public void setFdEscArmingFailure(boolean fd_esc_arming_failure)
   {
      fd_esc_arming_failure_ = fd_esc_arming_failure;
   }
   /**
            * ESC failed to arm
            */
   public boolean getFdEscArmingFailure()
   {
      return fd_esc_arming_failure_;
   }

   /**
            * Imbalanced propeller detected
            */
   public void setFdImbalancedProp(boolean fd_imbalanced_prop)
   {
      fd_imbalanced_prop_ = fd_imbalanced_prop;
   }
   /**
            * Imbalanced propeller detected
            */
   public boolean getFdImbalancedProp()
   {
      return fd_imbalanced_prop_;
   }

   /**
            * Motor failure
            */
   public void setFdMotorFailure(boolean fd_motor_failure)
   {
      fd_motor_failure_ = fd_motor_failure;
   }
   /**
            * Motor failure
            */
   public boolean getFdMotorFailure()
   {
      return fd_motor_failure_;
   }


   public static Supplier<FailsafeFlagsPubSubType> getPubSubType()
   {
      return FailsafeFlagsPubSubType::new;
   }

   @Override
   public Supplier<TopicDataType> getPubSubTypePacket()
   {
      return FailsafeFlagsPubSubType::new;
   }

   @Override
   public boolean epsilonEquals(FailsafeFlags other, double epsilon)
   {
      if(other == null) return false;
      if(other == this) return true;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_, other.timestamp_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.mode_req_angular_velocity_, other.mode_req_angular_velocity_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.mode_req_attitude_, other.mode_req_attitude_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.mode_req_local_alt_, other.mode_req_local_alt_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.mode_req_local_position_, other.mode_req_local_position_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.mode_req_local_position_relaxed_, other.mode_req_local_position_relaxed_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.mode_req_global_position_, other.mode_req_global_position_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.mode_req_mission_, other.mode_req_mission_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.mode_req_offboard_signal_, other.mode_req_offboard_signal_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.mode_req_home_position_, other.mode_req_home_position_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.mode_req_wind_and_flight_time_compliance_, other.mode_req_wind_and_flight_time_compliance_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.mode_req_prevent_arming_, other.mode_req_prevent_arming_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.mode_req_manual_control_, other.mode_req_manual_control_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.mode_req_other_, other.mode_req_other_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.angular_velocity_invalid_, other.angular_velocity_invalid_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.attitude_invalid_, other.attitude_invalid_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.local_altitude_invalid_, other.local_altitude_invalid_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.local_position_invalid_, other.local_position_invalid_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.local_position_invalid_relaxed_, other.local_position_invalid_relaxed_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.local_velocity_invalid_, other.local_velocity_invalid_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.global_position_invalid_, other.global_position_invalid_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.auto_mission_missing_, other.auto_mission_missing_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.offboard_control_signal_lost_, other.offboard_control_signal_lost_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.home_position_invalid_, other.home_position_invalid_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.manual_control_signal_lost_, other.manual_control_signal_lost_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.gcs_connection_lost_, other.gcs_connection_lost_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.battery_warning_, other.battery_warning_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.battery_low_remaining_time_, other.battery_low_remaining_time_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.battery_unhealthy_, other.battery_unhealthy_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.geofence_breached_, other.geofence_breached_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.mission_failure_, other.mission_failure_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.vtol_fixed_wing_system_failure_, other.vtol_fixed_wing_system_failure_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.wind_limit_exceeded_, other.wind_limit_exceeded_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.flight_time_limit_exceeded_, other.flight_time_limit_exceeded_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.local_position_accuracy_low_, other.local_position_accuracy_low_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.navigator_failure_, other.navigator_failure_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.fd_critical_failure_, other.fd_critical_failure_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.fd_esc_arming_failure_, other.fd_esc_arming_failure_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.fd_imbalanced_prop_, other.fd_imbalanced_prop_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.fd_motor_failure_, other.fd_motor_failure_, epsilon)) return false;


      return true;
   }

   @Override
   public boolean equals(Object other)
   {
      if(other == null) return false;
      if(other == this) return true;
      if(!(other instanceof FailsafeFlags)) return false;

      FailsafeFlags otherMyClass = (FailsafeFlags) other;

      if(this.timestamp_ != otherMyClass.timestamp_) return false;

      if(this.mode_req_angular_velocity_ != otherMyClass.mode_req_angular_velocity_) return false;

      if(this.mode_req_attitude_ != otherMyClass.mode_req_attitude_) return false;

      if(this.mode_req_local_alt_ != otherMyClass.mode_req_local_alt_) return false;

      if(this.mode_req_local_position_ != otherMyClass.mode_req_local_position_) return false;

      if(this.mode_req_local_position_relaxed_ != otherMyClass.mode_req_local_position_relaxed_) return false;

      if(this.mode_req_global_position_ != otherMyClass.mode_req_global_position_) return false;

      if(this.mode_req_mission_ != otherMyClass.mode_req_mission_) return false;

      if(this.mode_req_offboard_signal_ != otherMyClass.mode_req_offboard_signal_) return false;

      if(this.mode_req_home_position_ != otherMyClass.mode_req_home_position_) return false;

      if(this.mode_req_wind_and_flight_time_compliance_ != otherMyClass.mode_req_wind_and_flight_time_compliance_) return false;

      if(this.mode_req_prevent_arming_ != otherMyClass.mode_req_prevent_arming_) return false;

      if(this.mode_req_manual_control_ != otherMyClass.mode_req_manual_control_) return false;

      if(this.mode_req_other_ != otherMyClass.mode_req_other_) return false;

      if(this.angular_velocity_invalid_ != otherMyClass.angular_velocity_invalid_) return false;

      if(this.attitude_invalid_ != otherMyClass.attitude_invalid_) return false;

      if(this.local_altitude_invalid_ != otherMyClass.local_altitude_invalid_) return false;

      if(this.local_position_invalid_ != otherMyClass.local_position_invalid_) return false;

      if(this.local_position_invalid_relaxed_ != otherMyClass.local_position_invalid_relaxed_) return false;

      if(this.local_velocity_invalid_ != otherMyClass.local_velocity_invalid_) return false;

      if(this.global_position_invalid_ != otherMyClass.global_position_invalid_) return false;

      if(this.auto_mission_missing_ != otherMyClass.auto_mission_missing_) return false;

      if(this.offboard_control_signal_lost_ != otherMyClass.offboard_control_signal_lost_) return false;

      if(this.home_position_invalid_ != otherMyClass.home_position_invalid_) return false;

      if(this.manual_control_signal_lost_ != otherMyClass.manual_control_signal_lost_) return false;

      if(this.gcs_connection_lost_ != otherMyClass.gcs_connection_lost_) return false;

      if(this.battery_warning_ != otherMyClass.battery_warning_) return false;

      if(this.battery_low_remaining_time_ != otherMyClass.battery_low_remaining_time_) return false;

      if(this.battery_unhealthy_ != otherMyClass.battery_unhealthy_) return false;

      if(this.geofence_breached_ != otherMyClass.geofence_breached_) return false;

      if(this.mission_failure_ != otherMyClass.mission_failure_) return false;

      if(this.vtol_fixed_wing_system_failure_ != otherMyClass.vtol_fixed_wing_system_failure_) return false;

      if(this.wind_limit_exceeded_ != otherMyClass.wind_limit_exceeded_) return false;

      if(this.flight_time_limit_exceeded_ != otherMyClass.flight_time_limit_exceeded_) return false;

      if(this.local_position_accuracy_low_ != otherMyClass.local_position_accuracy_low_) return false;

      if(this.navigator_failure_ != otherMyClass.navigator_failure_) return false;

      if(this.fd_critical_failure_ != otherMyClass.fd_critical_failure_) return false;

      if(this.fd_esc_arming_failure_ != otherMyClass.fd_esc_arming_failure_) return false;

      if(this.fd_imbalanced_prop_ != otherMyClass.fd_imbalanced_prop_) return false;

      if(this.fd_motor_failure_ != otherMyClass.fd_motor_failure_) return false;


      return true;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("FailsafeFlags {");
      builder.append("timestamp=");
      builder.append(this.timestamp_);      builder.append(", ");
      builder.append("mode_req_angular_velocity=");
      builder.append(this.mode_req_angular_velocity_);      builder.append(", ");
      builder.append("mode_req_attitude=");
      builder.append(this.mode_req_attitude_);      builder.append(", ");
      builder.append("mode_req_local_alt=");
      builder.append(this.mode_req_local_alt_);      builder.append(", ");
      builder.append("mode_req_local_position=");
      builder.append(this.mode_req_local_position_);      builder.append(", ");
      builder.append("mode_req_local_position_relaxed=");
      builder.append(this.mode_req_local_position_relaxed_);      builder.append(", ");
      builder.append("mode_req_global_position=");
      builder.append(this.mode_req_global_position_);      builder.append(", ");
      builder.append("mode_req_mission=");
      builder.append(this.mode_req_mission_);      builder.append(", ");
      builder.append("mode_req_offboard_signal=");
      builder.append(this.mode_req_offboard_signal_);      builder.append(", ");
      builder.append("mode_req_home_position=");
      builder.append(this.mode_req_home_position_);      builder.append(", ");
      builder.append("mode_req_wind_and_flight_time_compliance=");
      builder.append(this.mode_req_wind_and_flight_time_compliance_);      builder.append(", ");
      builder.append("mode_req_prevent_arming=");
      builder.append(this.mode_req_prevent_arming_);      builder.append(", ");
      builder.append("mode_req_manual_control=");
      builder.append(this.mode_req_manual_control_);      builder.append(", ");
      builder.append("mode_req_other=");
      builder.append(this.mode_req_other_);      builder.append(", ");
      builder.append("angular_velocity_invalid=");
      builder.append(this.angular_velocity_invalid_);      builder.append(", ");
      builder.append("attitude_invalid=");
      builder.append(this.attitude_invalid_);      builder.append(", ");
      builder.append("local_altitude_invalid=");
      builder.append(this.local_altitude_invalid_);      builder.append(", ");
      builder.append("local_position_invalid=");
      builder.append(this.local_position_invalid_);      builder.append(", ");
      builder.append("local_position_invalid_relaxed=");
      builder.append(this.local_position_invalid_relaxed_);      builder.append(", ");
      builder.append("local_velocity_invalid=");
      builder.append(this.local_velocity_invalid_);      builder.append(", ");
      builder.append("global_position_invalid=");
      builder.append(this.global_position_invalid_);      builder.append(", ");
      builder.append("auto_mission_missing=");
      builder.append(this.auto_mission_missing_);      builder.append(", ");
      builder.append("offboard_control_signal_lost=");
      builder.append(this.offboard_control_signal_lost_);      builder.append(", ");
      builder.append("home_position_invalid=");
      builder.append(this.home_position_invalid_);      builder.append(", ");
      builder.append("manual_control_signal_lost=");
      builder.append(this.manual_control_signal_lost_);      builder.append(", ");
      builder.append("gcs_connection_lost=");
      builder.append(this.gcs_connection_lost_);      builder.append(", ");
      builder.append("battery_warning=");
      builder.append(this.battery_warning_);      builder.append(", ");
      builder.append("battery_low_remaining_time=");
      builder.append(this.battery_low_remaining_time_);      builder.append(", ");
      builder.append("battery_unhealthy=");
      builder.append(this.battery_unhealthy_);      builder.append(", ");
      builder.append("geofence_breached=");
      builder.append(this.geofence_breached_);      builder.append(", ");
      builder.append("mission_failure=");
      builder.append(this.mission_failure_);      builder.append(", ");
      builder.append("vtol_fixed_wing_system_failure=");
      builder.append(this.vtol_fixed_wing_system_failure_);      builder.append(", ");
      builder.append("wind_limit_exceeded=");
      builder.append(this.wind_limit_exceeded_);      builder.append(", ");
      builder.append("flight_time_limit_exceeded=");
      builder.append(this.flight_time_limit_exceeded_);      builder.append(", ");
      builder.append("local_position_accuracy_low=");
      builder.append(this.local_position_accuracy_low_);      builder.append(", ");
      builder.append("navigator_failure=");
      builder.append(this.navigator_failure_);      builder.append(", ");
      builder.append("fd_critical_failure=");
      builder.append(this.fd_critical_failure_);      builder.append(", ");
      builder.append("fd_esc_arming_failure=");
      builder.append(this.fd_esc_arming_failure_);      builder.append(", ");
      builder.append("fd_imbalanced_prop=");
      builder.append(this.fd_imbalanced_prop_);      builder.append(", ");
      builder.append("fd_motor_failure=");
      builder.append(this.fd_motor_failure_);
      builder.append("}");
      return builder.toString();
   }
}
