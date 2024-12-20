package px4_msgs.msg.dds;

import us.ihmc.communication.packets.Packet;
import us.ihmc.euclid.interfaces.Settable;
import us.ihmc.euclid.interfaces.EpsilonComparable;
import java.util.function.Supplier;
import us.ihmc.pubsub.TopicDataType;

/**
       * Encodes the system state of the vehicle published by commander
       */
public class VehicleStatus extends Packet<VehicleStatus> implements Settable<VehicleStatus>, EpsilonComparable<VehicleStatus>
{
   public static final byte ARMING_STATE_DISARMED = (byte) 1;
   public static final byte ARMING_STATE_ARMED = (byte) 2;
   public static final byte ARM_DISARM_REASON_TRANSITION_TO_STANDBY = (byte) 0;
   public static final byte ARM_DISARM_REASON_STICK_GESTURE = (byte) 1;
   public static final byte ARM_DISARM_REASON_RC_SWITCH = (byte) 2;
   public static final byte ARM_DISARM_REASON_COMMAND_INTERNAL = (byte) 3;
   public static final byte ARM_DISARM_REASON_COMMAND_EXTERNAL = (byte) 4;
   public static final byte ARM_DISARM_REASON_MISSION_START = (byte) 5;
   public static final byte ARM_DISARM_REASON_SAFETY_BUTTON = (byte) 6;
   public static final byte ARM_DISARM_REASON_AUTO_DISARM_LAND = (byte) 7;
   public static final byte ARM_DISARM_REASON_AUTO_DISARM_PREFLIGHT = (byte) 8;
   public static final byte ARM_DISARM_REASON_KILL_SWITCH = (byte) 9;
   public static final byte ARM_DISARM_REASON_LOCKDOWN = (byte) 10;
   public static final byte ARM_DISARM_REASON_FAILURE_DETECTOR = (byte) 11;
   public static final byte ARM_DISARM_REASON_SHUTDOWN = (byte) 12;
   public static final byte ARM_DISARM_REASON_UNIT_TEST = (byte) 13;
   /**
          * Manual mode
          */
   public static final byte NAVIGATION_STATE_MANUAL = (byte) 0;
   /**
          * Altitude control mode
          */
   public static final byte NAVIGATION_STATE_ALTCTL = (byte) 1;
   /**
          * Position control mode
          */
   public static final byte NAVIGATION_STATE_POSCTL = (byte) 2;
   /**
          * Auto mission mode
          */
   public static final byte NAVIGATION_STATE_AUTO_MISSION = (byte) 3;
   /**
          * Auto loiter mode
          */
   public static final byte NAVIGATION_STATE_AUTO_LOITER = (byte) 4;
   /**
          * Auto return to launch mode
          */
   public static final byte NAVIGATION_STATE_AUTO_RTL = (byte) 5;
   public static final byte NAVIGATION_STATE_POSITION_SLOW = (byte) 6;
   public static final byte NAVIGATION_STATE_FREE5 = (byte) 7;
   public static final byte NAVIGATION_STATE_FREE4 = (byte) 8;
   public static final byte NAVIGATION_STATE_FREE3 = (byte) 9;
   /**
          * Acro mode
          */
   public static final byte NAVIGATION_STATE_ACRO = (byte) 10;
   public static final byte NAVIGATION_STATE_FREE2 = (byte) 11;
   /**
          * Descend mode (no position control)
          */
   public static final byte NAVIGATION_STATE_DESCEND = (byte) 12;
   /**
          * Termination mode
          */
   public static final byte NAVIGATION_STATE_TERMINATION = (byte) 13;
   public static final byte NAVIGATION_STATE_OFFBOARD = (byte) 14;
   /**
          * Stabilized mode
          */
   public static final byte NAVIGATION_STATE_STAB = (byte) 15;
   public static final byte NAVIGATION_STATE_FREE1 = (byte) 16;
   /**
          * Takeoff
          */
   public static final byte NAVIGATION_STATE_AUTO_TAKEOFF = (byte) 17;
   /**
          * Land
          */
   public static final byte NAVIGATION_STATE_AUTO_LAND = (byte) 18;
   /**
          * Auto Follow
          */
   public static final byte NAVIGATION_STATE_AUTO_FOLLOW_TARGET = (byte) 19;
   /**
          * Precision land with landing target
          */
   public static final byte NAVIGATION_STATE_AUTO_PRECLAND = (byte) 20;
   /**
          * Orbit in a circle
          */
   public static final byte NAVIGATION_STATE_ORBIT = (byte) 21;
   /**
          * Takeoff, transition, establish loiter
          */
   public static final byte NAVIGATION_STATE_AUTO_VTOL_TAKEOFF = (byte) 22;
   public static final byte NAVIGATION_STATE_EXTERNAL1 = (byte) 23;
   public static final byte NAVIGATION_STATE_EXTERNAL2 = (byte) 24;
   public static final byte NAVIGATION_STATE_EXTERNAL3 = (byte) 25;
   public static final byte NAVIGATION_STATE_EXTERNAL4 = (byte) 26;
   public static final byte NAVIGATION_STATE_EXTERNAL5 = (byte) 27;
   public static final byte NAVIGATION_STATE_EXTERNAL6 = (byte) 28;
   public static final byte NAVIGATION_STATE_EXTERNAL7 = (byte) 29;
   public static final byte NAVIGATION_STATE_EXTERNAL8 = (byte) 30;
   public static final byte NAVIGATION_STATE_MAX = (byte) 31;
   public static final int FAILURE_NONE = 0;
   /**
          * (1 << 0)
          */
   public static final int FAILURE_ROLL = 1;
   /**
          * (1 << 1)
          */
   public static final int FAILURE_PITCH = 2;
   /**
          * (1 << 2)
          */
   public static final int FAILURE_ALT = 4;
   /**
          * (1 << 3)
          */
   public static final int FAILURE_EXT = 8;
   /**
          * (1 << 4)
          */
   public static final int FAILURE_ARM_ESC = 16;
   /**
          * (1 << 5)
          */
   public static final int FAILURE_BATTERY = 32;
   /**
          * (1 << 6)
          */
   public static final int FAILURE_IMBALANCED_PROP = 64;
   /**
          * (1 << 7)
          */
   public static final int FAILURE_MOTOR = 128;
   public static final byte HIL_STATE_OFF = (byte) 0;
   public static final byte HIL_STATE_ON = (byte) 1;
   public static final byte VEHICLE_TYPE_UNKNOWN = (byte) 0;
   public static final byte VEHICLE_TYPE_ROTARY_WING = (byte) 1;
   public static final byte VEHICLE_TYPE_FIXED_WING = (byte) 2;
   public static final byte VEHICLE_TYPE_ROVER = (byte) 3;
   public static final byte VEHICLE_TYPE_AIRSHIP = (byte) 4;
   public static final byte FAILSAFE_DEFER_STATE_DISABLED = (byte) 0;
   public static final byte FAILSAFE_DEFER_STATE_ENABLED = (byte) 1;
   /**
          * Failsafes deferred, but would trigger a failsafe
          */
   public static final byte FAILSAFE_DEFER_STATE_WOULD_FAILSAFE = (byte) 2;
   /**
            * time since system start (microseconds)
            */
   public long timestamp_;
   /**
            * Arming timestamp (microseconds)
            */
   public long armed_time_;
   /**
            * Takeoff timestamp (microseconds)
            */
   public long takeoff_time_;
   public byte arming_state_;
   public byte latest_arming_reason_;
   public byte latest_disarming_reason_;
   /**
            * time when current nav_state activated
            */
   public long nav_state_timestamp_;
   /**
            * Mode that the user selected (might be different from nav_state in a failsafe situation)
            */
   public byte nav_state_user_intention_;
   /**
            * Currently active mode
            */
   public byte nav_state_;
   /**
            * Current mode executor in charge (0=Autopilot)
            */
   public byte executor_in_charge_;
   /**
            * Bitmask for all valid nav_state values
            */
   public long valid_nav_states_mask_;
   /**
            * Bitmask for all modes that a user can select
            */
   public long can_set_nav_states_mask_;
   /**
            * Bitmask of detected failures
            */
   public int failure_detector_status_;
   public byte hil_state_;
   /**
            * If it's a VTOL, then the value will be VEHICLE_TYPE_ROTARY_WING while flying as a multicopter, and VEHICLE_TYPE_FIXED_WING when flying as a fixed-wing
            */
   public byte vehicle_type_;
   /**
            * true if system is in failsafe state (e.g.:RTL, Hover, Terminate, ...)
            */
   public boolean failsafe_;
   /**
            * true if system is in failsafe state but the user took over control
            */
   public boolean failsafe_and_user_took_over_;
   /**
            * one of FAILSAFE_DEFER_STATE_*
            */
   public byte failsafe_defer_state_;
   /**
            * Link loss
            * datalink to GCS lost
            */
   public boolean gcs_connection_lost_;
   /**
            * counts unique GCS connection lost events
            */
   public byte gcs_connection_lost_counter_;
   /**
            * Set to true if the high latency data link (eg. RockBlock Iridium 9603 telemetry module) is lost
            */
   public boolean high_latency_data_link_lost_;
   /**
            * VTOL flags
            * True if the system is VTOL capable
            */
   public boolean is_vtol_;
   /**
            * True if the system performs a 90° pitch down rotation during transition from MC to FW
            */
   public boolean is_vtol_tailsitter_;
   /**
            * True if VTOL is doing a transition
            */
   public boolean in_transition_mode_;
   /**
            * True if VTOL is doing a transition from MC to FW
            */
   public boolean in_transition_to_fw_;
   /**
            * MAVLink identification
            * system type, contains mavlink MAV_TYPE
            */
   public byte system_type_;
   /**
            * system id, contains MAVLink's system ID field
            */
   public byte system_id_;
   /**
            * subsystem / component id, contains MAVLink's component ID field
            */
   public byte component_id_;
   /**
            * Set to true if a safety button is connected
            */
   public boolean safety_button_available_;
   /**
            * Set to true if safety is off
            */
   public boolean safety_off_;
   /**
            * set if input power is valid
            */
   public boolean power_input_valid_;
   /**
            * set to true (never cleared) once telemetry received from usb link
            */
   public boolean usb_connected_;
   public boolean open_drone_id_system_present_;
   public boolean open_drone_id_system_healthy_;
   public boolean parachute_system_present_;
   public boolean parachute_system_healthy_;
   /**
            * Set to true if avoidance system is enabled via COM_OBS_AVOID parameter
            */
   public boolean avoidance_system_required_;
   /**
            * Status of the obstacle avoidance system
            */
   public boolean avoidance_system_valid_;
   public boolean rc_calibration_in_progress_;
   public boolean calibration_enabled_;
   /**
            * true if all checks necessary to arm pass
            */
   public boolean pre_flight_checks_pass_;

   public VehicleStatus()
   {
   }

   public VehicleStatus(VehicleStatus other)
   {
      this();
      set(other);
   }

   public void set(VehicleStatus other)
   {
      timestamp_ = other.timestamp_;

      armed_time_ = other.armed_time_;

      takeoff_time_ = other.takeoff_time_;

      arming_state_ = other.arming_state_;

      latest_arming_reason_ = other.latest_arming_reason_;

      latest_disarming_reason_ = other.latest_disarming_reason_;

      nav_state_timestamp_ = other.nav_state_timestamp_;

      nav_state_user_intention_ = other.nav_state_user_intention_;

      nav_state_ = other.nav_state_;

      executor_in_charge_ = other.executor_in_charge_;

      valid_nav_states_mask_ = other.valid_nav_states_mask_;

      can_set_nav_states_mask_ = other.can_set_nav_states_mask_;

      failure_detector_status_ = other.failure_detector_status_;

      hil_state_ = other.hil_state_;

      vehicle_type_ = other.vehicle_type_;

      failsafe_ = other.failsafe_;

      failsafe_and_user_took_over_ = other.failsafe_and_user_took_over_;

      failsafe_defer_state_ = other.failsafe_defer_state_;

      gcs_connection_lost_ = other.gcs_connection_lost_;

      gcs_connection_lost_counter_ = other.gcs_connection_lost_counter_;

      high_latency_data_link_lost_ = other.high_latency_data_link_lost_;

      is_vtol_ = other.is_vtol_;

      is_vtol_tailsitter_ = other.is_vtol_tailsitter_;

      in_transition_mode_ = other.in_transition_mode_;

      in_transition_to_fw_ = other.in_transition_to_fw_;

      system_type_ = other.system_type_;

      system_id_ = other.system_id_;

      component_id_ = other.component_id_;

      safety_button_available_ = other.safety_button_available_;

      safety_off_ = other.safety_off_;

      power_input_valid_ = other.power_input_valid_;

      usb_connected_ = other.usb_connected_;

      open_drone_id_system_present_ = other.open_drone_id_system_present_;

      open_drone_id_system_healthy_ = other.open_drone_id_system_healthy_;

      parachute_system_present_ = other.parachute_system_present_;

      parachute_system_healthy_ = other.parachute_system_healthy_;

      avoidance_system_required_ = other.avoidance_system_required_;

      avoidance_system_valid_ = other.avoidance_system_valid_;

      rc_calibration_in_progress_ = other.rc_calibration_in_progress_;

      calibration_enabled_ = other.calibration_enabled_;

      pre_flight_checks_pass_ = other.pre_flight_checks_pass_;

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
            * Arming timestamp (microseconds)
            */
   public void setArmedTime(long armed_time)
   {
      armed_time_ = armed_time;
   }
   /**
            * Arming timestamp (microseconds)
            */
   public long getArmedTime()
   {
      return armed_time_;
   }

   /**
            * Takeoff timestamp (microseconds)
            */
   public void setTakeoffTime(long takeoff_time)
   {
      takeoff_time_ = takeoff_time;
   }
   /**
            * Takeoff timestamp (microseconds)
            */
   public long getTakeoffTime()
   {
      return takeoff_time_;
   }

   public void setArmingState(byte arming_state)
   {
      arming_state_ = arming_state;
   }
   public byte getArmingState()
   {
      return arming_state_;
   }

   public void setLatestArmingReason(byte latest_arming_reason)
   {
      latest_arming_reason_ = latest_arming_reason;
   }
   public byte getLatestArmingReason()
   {
      return latest_arming_reason_;
   }

   public void setLatestDisarmingReason(byte latest_disarming_reason)
   {
      latest_disarming_reason_ = latest_disarming_reason;
   }
   public byte getLatestDisarmingReason()
   {
      return latest_disarming_reason_;
   }

   /**
            * time when current nav_state activated
            */
   public void setNavStateTimestamp(long nav_state_timestamp)
   {
      nav_state_timestamp_ = nav_state_timestamp;
   }
   /**
            * time when current nav_state activated
            */
   public long getNavStateTimestamp()
   {
      return nav_state_timestamp_;
   }

   /**
            * Mode that the user selected (might be different from nav_state in a failsafe situation)
            */
   public void setNavStateUserIntention(byte nav_state_user_intention)
   {
      nav_state_user_intention_ = nav_state_user_intention;
   }
   /**
            * Mode that the user selected (might be different from nav_state in a failsafe situation)
            */
   public byte getNavStateUserIntention()
   {
      return nav_state_user_intention_;
   }

   /**
            * Currently active mode
            */
   public void setNavState(byte nav_state)
   {
      nav_state_ = nav_state;
   }
   /**
            * Currently active mode
            */
   public byte getNavState()
   {
      return nav_state_;
   }

   /**
            * Current mode executor in charge (0=Autopilot)
            */
   public void setExecutorInCharge(byte executor_in_charge)
   {
      executor_in_charge_ = executor_in_charge;
   }
   /**
            * Current mode executor in charge (0=Autopilot)
            */
   public byte getExecutorInCharge()
   {
      return executor_in_charge_;
   }

   /**
            * Bitmask for all valid nav_state values
            */
   public void setValidNavStatesMask(long valid_nav_states_mask)
   {
      valid_nav_states_mask_ = valid_nav_states_mask;
   }
   /**
            * Bitmask for all valid nav_state values
            */
   public long getValidNavStatesMask()
   {
      return valid_nav_states_mask_;
   }

   /**
            * Bitmask for all modes that a user can select
            */
   public void setCanSetNavStatesMask(long can_set_nav_states_mask)
   {
      can_set_nav_states_mask_ = can_set_nav_states_mask;
   }
   /**
            * Bitmask for all modes that a user can select
            */
   public long getCanSetNavStatesMask()
   {
      return can_set_nav_states_mask_;
   }

   /**
            * Bitmask of detected failures
            */
   public void setFailureDetectorStatus(int failure_detector_status)
   {
      failure_detector_status_ = failure_detector_status;
   }
   /**
            * Bitmask of detected failures
            */
   public int getFailureDetectorStatus()
   {
      return failure_detector_status_;
   }

   public void setHilState(byte hil_state)
   {
      hil_state_ = hil_state;
   }
   public byte getHilState()
   {
      return hil_state_;
   }

   /**
            * If it's a VTOL, then the value will be VEHICLE_TYPE_ROTARY_WING while flying as a multicopter, and VEHICLE_TYPE_FIXED_WING when flying as a fixed-wing
            */
   public void setVehicleType(byte vehicle_type)
   {
      vehicle_type_ = vehicle_type;
   }
   /**
            * If it's a VTOL, then the value will be VEHICLE_TYPE_ROTARY_WING while flying as a multicopter, and VEHICLE_TYPE_FIXED_WING when flying as a fixed-wing
            */
   public byte getVehicleType()
   {
      return vehicle_type_;
   }

   /**
            * true if system is in failsafe state (e.g.:RTL, Hover, Terminate, ...)
            */
   public void setFailsafe(boolean failsafe)
   {
      failsafe_ = failsafe;
   }
   /**
            * true if system is in failsafe state (e.g.:RTL, Hover, Terminate, ...)
            */
   public boolean getFailsafe()
   {
      return failsafe_;
   }

   /**
            * true if system is in failsafe state but the user took over control
            */
   public void setFailsafeAndUserTookOver(boolean failsafe_and_user_took_over)
   {
      failsafe_and_user_took_over_ = failsafe_and_user_took_over;
   }
   /**
            * true if system is in failsafe state but the user took over control
            */
   public boolean getFailsafeAndUserTookOver()
   {
      return failsafe_and_user_took_over_;
   }

   /**
            * one of FAILSAFE_DEFER_STATE_*
            */
   public void setFailsafeDeferState(byte failsafe_defer_state)
   {
      failsafe_defer_state_ = failsafe_defer_state;
   }
   /**
            * one of FAILSAFE_DEFER_STATE_*
            */
   public byte getFailsafeDeferState()
   {
      return failsafe_defer_state_;
   }

   /**
            * Link loss
            * datalink to GCS lost
            */
   public void setGcsConnectionLost(boolean gcs_connection_lost)
   {
      gcs_connection_lost_ = gcs_connection_lost;
   }
   /**
            * Link loss
            * datalink to GCS lost
            */
   public boolean getGcsConnectionLost()
   {
      return gcs_connection_lost_;
   }

   /**
            * counts unique GCS connection lost events
            */
   public void setGcsConnectionLostCounter(byte gcs_connection_lost_counter)
   {
      gcs_connection_lost_counter_ = gcs_connection_lost_counter;
   }
   /**
            * counts unique GCS connection lost events
            */
   public byte getGcsConnectionLostCounter()
   {
      return gcs_connection_lost_counter_;
   }

   /**
            * Set to true if the high latency data link (eg. RockBlock Iridium 9603 telemetry module) is lost
            */
   public void setHighLatencyDataLinkLost(boolean high_latency_data_link_lost)
   {
      high_latency_data_link_lost_ = high_latency_data_link_lost;
   }
   /**
            * Set to true if the high latency data link (eg. RockBlock Iridium 9603 telemetry module) is lost
            */
   public boolean getHighLatencyDataLinkLost()
   {
      return high_latency_data_link_lost_;
   }

   /**
            * VTOL flags
            * True if the system is VTOL capable
            */
   public void setIsVtol(boolean is_vtol)
   {
      is_vtol_ = is_vtol;
   }
   /**
            * VTOL flags
            * True if the system is VTOL capable
            */
   public boolean getIsVtol()
   {
      return is_vtol_;
   }

   /**
            * True if the system performs a 90° pitch down rotation during transition from MC to FW
            */
   public void setIsVtolTailsitter(boolean is_vtol_tailsitter)
   {
      is_vtol_tailsitter_ = is_vtol_tailsitter;
   }
   /**
            * True if the system performs a 90° pitch down rotation during transition from MC to FW
            */
   public boolean getIsVtolTailsitter()
   {
      return is_vtol_tailsitter_;
   }

   /**
            * True if VTOL is doing a transition
            */
   public void setInTransitionMode(boolean in_transition_mode)
   {
      in_transition_mode_ = in_transition_mode;
   }
   /**
            * True if VTOL is doing a transition
            */
   public boolean getInTransitionMode()
   {
      return in_transition_mode_;
   }

   /**
            * True if VTOL is doing a transition from MC to FW
            */
   public void setInTransitionToFw(boolean in_transition_to_fw)
   {
      in_transition_to_fw_ = in_transition_to_fw;
   }
   /**
            * True if VTOL is doing a transition from MC to FW
            */
   public boolean getInTransitionToFw()
   {
      return in_transition_to_fw_;
   }

   /**
            * MAVLink identification
            * system type, contains mavlink MAV_TYPE
            */
   public void setSystemType(byte system_type)
   {
      system_type_ = system_type;
   }
   /**
            * MAVLink identification
            * system type, contains mavlink MAV_TYPE
            */
   public byte getSystemType()
   {
      return system_type_;
   }

   /**
            * system id, contains MAVLink's system ID field
            */
   public void setSystemId(byte system_id)
   {
      system_id_ = system_id;
   }
   /**
            * system id, contains MAVLink's system ID field
            */
   public byte getSystemId()
   {
      return system_id_;
   }

   /**
            * subsystem / component id, contains MAVLink's component ID field
            */
   public void setComponentId(byte component_id)
   {
      component_id_ = component_id;
   }
   /**
            * subsystem / component id, contains MAVLink's component ID field
            */
   public byte getComponentId()
   {
      return component_id_;
   }

   /**
            * Set to true if a safety button is connected
            */
   public void setSafetyButtonAvailable(boolean safety_button_available)
   {
      safety_button_available_ = safety_button_available;
   }
   /**
            * Set to true if a safety button is connected
            */
   public boolean getSafetyButtonAvailable()
   {
      return safety_button_available_;
   }

   /**
            * Set to true if safety is off
            */
   public void setSafetyOff(boolean safety_off)
   {
      safety_off_ = safety_off;
   }
   /**
            * Set to true if safety is off
            */
   public boolean getSafetyOff()
   {
      return safety_off_;
   }

   /**
            * set if input power is valid
            */
   public void setPowerInputValid(boolean power_input_valid)
   {
      power_input_valid_ = power_input_valid;
   }
   /**
            * set if input power is valid
            */
   public boolean getPowerInputValid()
   {
      return power_input_valid_;
   }

   /**
            * set to true (never cleared) once telemetry received from usb link
            */
   public void setUsbConnected(boolean usb_connected)
   {
      usb_connected_ = usb_connected;
   }
   /**
            * set to true (never cleared) once telemetry received from usb link
            */
   public boolean getUsbConnected()
   {
      return usb_connected_;
   }

   public void setOpenDroneIdSystemPresent(boolean open_drone_id_system_present)
   {
      open_drone_id_system_present_ = open_drone_id_system_present;
   }
   public boolean getOpenDroneIdSystemPresent()
   {
      return open_drone_id_system_present_;
   }

   public void setOpenDroneIdSystemHealthy(boolean open_drone_id_system_healthy)
   {
      open_drone_id_system_healthy_ = open_drone_id_system_healthy;
   }
   public boolean getOpenDroneIdSystemHealthy()
   {
      return open_drone_id_system_healthy_;
   }

   public void setParachuteSystemPresent(boolean parachute_system_present)
   {
      parachute_system_present_ = parachute_system_present;
   }
   public boolean getParachuteSystemPresent()
   {
      return parachute_system_present_;
   }

   public void setParachuteSystemHealthy(boolean parachute_system_healthy)
   {
      parachute_system_healthy_ = parachute_system_healthy;
   }
   public boolean getParachuteSystemHealthy()
   {
      return parachute_system_healthy_;
   }

   /**
            * Set to true if avoidance system is enabled via COM_OBS_AVOID parameter
            */
   public void setAvoidanceSystemRequired(boolean avoidance_system_required)
   {
      avoidance_system_required_ = avoidance_system_required;
   }
   /**
            * Set to true if avoidance system is enabled via COM_OBS_AVOID parameter
            */
   public boolean getAvoidanceSystemRequired()
   {
      return avoidance_system_required_;
   }

   /**
            * Status of the obstacle avoidance system
            */
   public void setAvoidanceSystemValid(boolean avoidance_system_valid)
   {
      avoidance_system_valid_ = avoidance_system_valid;
   }
   /**
            * Status of the obstacle avoidance system
            */
   public boolean getAvoidanceSystemValid()
   {
      return avoidance_system_valid_;
   }

   public void setRcCalibrationInProgress(boolean rc_calibration_in_progress)
   {
      rc_calibration_in_progress_ = rc_calibration_in_progress;
   }
   public boolean getRcCalibrationInProgress()
   {
      return rc_calibration_in_progress_;
   }

   public void setCalibrationEnabled(boolean calibration_enabled)
   {
      calibration_enabled_ = calibration_enabled;
   }
   public boolean getCalibrationEnabled()
   {
      return calibration_enabled_;
   }

   /**
            * true if all checks necessary to arm pass
            */
   public void setPreFlightChecksPass(boolean pre_flight_checks_pass)
   {
      pre_flight_checks_pass_ = pre_flight_checks_pass;
   }
   /**
            * true if all checks necessary to arm pass
            */
   public boolean getPreFlightChecksPass()
   {
      return pre_flight_checks_pass_;
   }


   public static Supplier<VehicleStatusPubSubType> getPubSubType()
   {
      return VehicleStatusPubSubType::new;
   }

   @Override
   public Supplier<TopicDataType> getPubSubTypePacket()
   {
      return VehicleStatusPubSubType::new;
   }

   @Override
   public boolean epsilonEquals(VehicleStatus other, double epsilon)
   {
      if(other == null) return false;
      if(other == this) return true;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_, other.timestamp_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.armed_time_, other.armed_time_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.takeoff_time_, other.takeoff_time_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.arming_state_, other.arming_state_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.latest_arming_reason_, other.latest_arming_reason_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.latest_disarming_reason_, other.latest_disarming_reason_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.nav_state_timestamp_, other.nav_state_timestamp_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.nav_state_user_intention_, other.nav_state_user_intention_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.nav_state_, other.nav_state_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.executor_in_charge_, other.executor_in_charge_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.valid_nav_states_mask_, other.valid_nav_states_mask_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.can_set_nav_states_mask_, other.can_set_nav_states_mask_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.failure_detector_status_, other.failure_detector_status_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.hil_state_, other.hil_state_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.vehicle_type_, other.vehicle_type_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.failsafe_, other.failsafe_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.failsafe_and_user_took_over_, other.failsafe_and_user_took_over_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.failsafe_defer_state_, other.failsafe_defer_state_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.gcs_connection_lost_, other.gcs_connection_lost_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.gcs_connection_lost_counter_, other.gcs_connection_lost_counter_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.high_latency_data_link_lost_, other.high_latency_data_link_lost_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.is_vtol_, other.is_vtol_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.is_vtol_tailsitter_, other.is_vtol_tailsitter_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.in_transition_mode_, other.in_transition_mode_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.in_transition_to_fw_, other.in_transition_to_fw_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.system_type_, other.system_type_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.system_id_, other.system_id_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.component_id_, other.component_id_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.safety_button_available_, other.safety_button_available_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.safety_off_, other.safety_off_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.power_input_valid_, other.power_input_valid_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.usb_connected_, other.usb_connected_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.open_drone_id_system_present_, other.open_drone_id_system_present_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.open_drone_id_system_healthy_, other.open_drone_id_system_healthy_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.parachute_system_present_, other.parachute_system_present_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.parachute_system_healthy_, other.parachute_system_healthy_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.avoidance_system_required_, other.avoidance_system_required_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.avoidance_system_valid_, other.avoidance_system_valid_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.rc_calibration_in_progress_, other.rc_calibration_in_progress_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.calibration_enabled_, other.calibration_enabled_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.pre_flight_checks_pass_, other.pre_flight_checks_pass_, epsilon)) return false;


      return true;
   }

   @Override
   public boolean equals(Object other)
   {
      if(other == null) return false;
      if(other == this) return true;
      if(!(other instanceof VehicleStatus)) return false;

      VehicleStatus otherMyClass = (VehicleStatus) other;

      if(this.timestamp_ != otherMyClass.timestamp_) return false;

      if(this.armed_time_ != otherMyClass.armed_time_) return false;

      if(this.takeoff_time_ != otherMyClass.takeoff_time_) return false;

      if(this.arming_state_ != otherMyClass.arming_state_) return false;

      if(this.latest_arming_reason_ != otherMyClass.latest_arming_reason_) return false;

      if(this.latest_disarming_reason_ != otherMyClass.latest_disarming_reason_) return false;

      if(this.nav_state_timestamp_ != otherMyClass.nav_state_timestamp_) return false;

      if(this.nav_state_user_intention_ != otherMyClass.nav_state_user_intention_) return false;

      if(this.nav_state_ != otherMyClass.nav_state_) return false;

      if(this.executor_in_charge_ != otherMyClass.executor_in_charge_) return false;

      if(this.valid_nav_states_mask_ != otherMyClass.valid_nav_states_mask_) return false;

      if(this.can_set_nav_states_mask_ != otherMyClass.can_set_nav_states_mask_) return false;

      if(this.failure_detector_status_ != otherMyClass.failure_detector_status_) return false;

      if(this.hil_state_ != otherMyClass.hil_state_) return false;

      if(this.vehicle_type_ != otherMyClass.vehicle_type_) return false;

      if(this.failsafe_ != otherMyClass.failsafe_) return false;

      if(this.failsafe_and_user_took_over_ != otherMyClass.failsafe_and_user_took_over_) return false;

      if(this.failsafe_defer_state_ != otherMyClass.failsafe_defer_state_) return false;

      if(this.gcs_connection_lost_ != otherMyClass.gcs_connection_lost_) return false;

      if(this.gcs_connection_lost_counter_ != otherMyClass.gcs_connection_lost_counter_) return false;

      if(this.high_latency_data_link_lost_ != otherMyClass.high_latency_data_link_lost_) return false;

      if(this.is_vtol_ != otherMyClass.is_vtol_) return false;

      if(this.is_vtol_tailsitter_ != otherMyClass.is_vtol_tailsitter_) return false;

      if(this.in_transition_mode_ != otherMyClass.in_transition_mode_) return false;

      if(this.in_transition_to_fw_ != otherMyClass.in_transition_to_fw_) return false;

      if(this.system_type_ != otherMyClass.system_type_) return false;

      if(this.system_id_ != otherMyClass.system_id_) return false;

      if(this.component_id_ != otherMyClass.component_id_) return false;

      if(this.safety_button_available_ != otherMyClass.safety_button_available_) return false;

      if(this.safety_off_ != otherMyClass.safety_off_) return false;

      if(this.power_input_valid_ != otherMyClass.power_input_valid_) return false;

      if(this.usb_connected_ != otherMyClass.usb_connected_) return false;

      if(this.open_drone_id_system_present_ != otherMyClass.open_drone_id_system_present_) return false;

      if(this.open_drone_id_system_healthy_ != otherMyClass.open_drone_id_system_healthy_) return false;

      if(this.parachute_system_present_ != otherMyClass.parachute_system_present_) return false;

      if(this.parachute_system_healthy_ != otherMyClass.parachute_system_healthy_) return false;

      if(this.avoidance_system_required_ != otherMyClass.avoidance_system_required_) return false;

      if(this.avoidance_system_valid_ != otherMyClass.avoidance_system_valid_) return false;

      if(this.rc_calibration_in_progress_ != otherMyClass.rc_calibration_in_progress_) return false;

      if(this.calibration_enabled_ != otherMyClass.calibration_enabled_) return false;

      if(this.pre_flight_checks_pass_ != otherMyClass.pre_flight_checks_pass_) return false;


      return true;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("VehicleStatus {");
      builder.append("timestamp=");
      builder.append(this.timestamp_);      builder.append(", ");
      builder.append("armed_time=");
      builder.append(this.armed_time_);      builder.append(", ");
      builder.append("takeoff_time=");
      builder.append(this.takeoff_time_);      builder.append(", ");
      builder.append("arming_state=");
      builder.append(this.arming_state_);      builder.append(", ");
      builder.append("latest_arming_reason=");
      builder.append(this.latest_arming_reason_);      builder.append(", ");
      builder.append("latest_disarming_reason=");
      builder.append(this.latest_disarming_reason_);      builder.append(", ");
      builder.append("nav_state_timestamp=");
      builder.append(this.nav_state_timestamp_);      builder.append(", ");
      builder.append("nav_state_user_intention=");
      builder.append(this.nav_state_user_intention_);      builder.append(", ");
      builder.append("nav_state=");
      builder.append(this.nav_state_);      builder.append(", ");
      builder.append("executor_in_charge=");
      builder.append(this.executor_in_charge_);      builder.append(", ");
      builder.append("valid_nav_states_mask=");
      builder.append(this.valid_nav_states_mask_);      builder.append(", ");
      builder.append("can_set_nav_states_mask=");
      builder.append(this.can_set_nav_states_mask_);      builder.append(", ");
      builder.append("failure_detector_status=");
      builder.append(this.failure_detector_status_);      builder.append(", ");
      builder.append("hil_state=");
      builder.append(this.hil_state_);      builder.append(", ");
      builder.append("vehicle_type=");
      builder.append(this.vehicle_type_);      builder.append(", ");
      builder.append("failsafe=");
      builder.append(this.failsafe_);      builder.append(", ");
      builder.append("failsafe_and_user_took_over=");
      builder.append(this.failsafe_and_user_took_over_);      builder.append(", ");
      builder.append("failsafe_defer_state=");
      builder.append(this.failsafe_defer_state_);      builder.append(", ");
      builder.append("gcs_connection_lost=");
      builder.append(this.gcs_connection_lost_);      builder.append(", ");
      builder.append("gcs_connection_lost_counter=");
      builder.append(this.gcs_connection_lost_counter_);      builder.append(", ");
      builder.append("high_latency_data_link_lost=");
      builder.append(this.high_latency_data_link_lost_);      builder.append(", ");
      builder.append("is_vtol=");
      builder.append(this.is_vtol_);      builder.append(", ");
      builder.append("is_vtol_tailsitter=");
      builder.append(this.is_vtol_tailsitter_);      builder.append(", ");
      builder.append("in_transition_mode=");
      builder.append(this.in_transition_mode_);      builder.append(", ");
      builder.append("in_transition_to_fw=");
      builder.append(this.in_transition_to_fw_);      builder.append(", ");
      builder.append("system_type=");
      builder.append(this.system_type_);      builder.append(", ");
      builder.append("system_id=");
      builder.append(this.system_id_);      builder.append(", ");
      builder.append("component_id=");
      builder.append(this.component_id_);      builder.append(", ");
      builder.append("safety_button_available=");
      builder.append(this.safety_button_available_);      builder.append(", ");
      builder.append("safety_off=");
      builder.append(this.safety_off_);      builder.append(", ");
      builder.append("power_input_valid=");
      builder.append(this.power_input_valid_);      builder.append(", ");
      builder.append("usb_connected=");
      builder.append(this.usb_connected_);      builder.append(", ");
      builder.append("open_drone_id_system_present=");
      builder.append(this.open_drone_id_system_present_);      builder.append(", ");
      builder.append("open_drone_id_system_healthy=");
      builder.append(this.open_drone_id_system_healthy_);      builder.append(", ");
      builder.append("parachute_system_present=");
      builder.append(this.parachute_system_present_);      builder.append(", ");
      builder.append("parachute_system_healthy=");
      builder.append(this.parachute_system_healthy_);      builder.append(", ");
      builder.append("avoidance_system_required=");
      builder.append(this.avoidance_system_required_);      builder.append(", ");
      builder.append("avoidance_system_valid=");
      builder.append(this.avoidance_system_valid_);      builder.append(", ");
      builder.append("rc_calibration_in_progress=");
      builder.append(this.rc_calibration_in_progress_);      builder.append(", ");
      builder.append("calibration_enabled=");
      builder.append(this.calibration_enabled_);      builder.append(", ");
      builder.append("pre_flight_checks_pass=");
      builder.append(this.pre_flight_checks_pass_);
      builder.append("}");
      return builder.toString();
   }
}
