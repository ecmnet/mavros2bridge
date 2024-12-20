package px4_msgs.msg.dds;

import us.ihmc.communication.packets.Packet;
import us.ihmc.euclid.interfaces.Settable;
import us.ihmc.euclid.interfaces.EpsilonComparable;
import java.util.function.Supplier;
import us.ihmc.pubsub.TopicDataType;

/**
       * Vehicle Command uORB message. Used for commanding a mission / action / etc.
       * Follows the MAVLink COMMAND_INT / COMMAND_LONG definition
       */
public class VehicleCommand extends Packet<VehicleCommand> implements Settable<VehicleCommand>, EpsilonComparable<VehicleCommand>
{
   /**
          * test command
          */
   public static final int VEHICLE_CMD_CUSTOM_0 = 0;
   /**
          * test command
          */
   public static final int VEHICLE_CMD_CUSTOM_1 = 1;
   /**
          * test command
          */
   public static final int VEHICLE_CMD_CUSTOM_2 = 2;
   /**
          * Navigate to MISSION. |Hold time in decimal seconds. (ignored by fixed wing, time to stay at MISSION for rotary wing)| Acceptance radius in meters (if the sphere with this radius is hit, the MISSION counts as reached)| 0 to pass through the WP, if > 0 radius in meters to pass by WP. Positive value for clockwise orbit, negative value for counter-clockwise orbit. Allows trajectory control.| Desired yaw angle at MISSION (rotary wing)| Latitude| Longitude| Altitude|
          */
   public static final int VEHICLE_CMD_NAV_WAYPOINT = 16;
   /**
          * Loiter around this MISSION an unlimited amount of time |Empty| Empty| Radius around MISSION, in meters. If positive loiter clockwise, else counter-clockwise| Desired yaw angle.| Latitude| Longitude| Altitude|
          */
   public static final int VEHICLE_CMD_NAV_LOITER_UNLIM = 17;
   /**
          * Loiter around this MISSION for X turns |Turns| Empty| Radius around MISSION, in meters. If positive loiter clockwise, else counter-clockwise| Desired yaw angle.| Latitude| Longitude| Altitude|
          */
   public static final int VEHICLE_CMD_NAV_LOITER_TURNS = 18;
   /**
          * Loiter around this MISSION for X seconds |Seconds (decimal)| Empty| Radius around MISSION, in meters. If positive loiter clockwise, else counter-clockwise| Desired yaw angle.| Latitude| Longitude| Altitude|
          */
   public static final int VEHICLE_CMD_NAV_LOITER_TIME = 19;
   /**
          * Return to launch location |Empty| Empty| Empty| Empty| Empty| Empty| Empty|
          */
   public static final int VEHICLE_CMD_NAV_RETURN_TO_LAUNCH = 20;
   /**
          * Land at location |Empty| Empty| Empty| Desired yaw angle.| Latitude| Longitude| Altitude|
          */
   public static final int VEHICLE_CMD_NAV_LAND = 21;
   /**
          * Takeoff from ground / hand |Minimum pitch (if airspeed sensor present), desired pitch without sensor| Empty| Empty| Yaw angle (if magnetometer present), ignored without magnetometer| Latitude| Longitude| Altitude|
          */
   public static final int VEHICLE_CMD_NAV_TAKEOFF = 22;
   /**
          * Attempt a precision landing
          */
   public static final int VEHICLE_CMD_NAV_PRECLAND = 23;
   /**
          * Start orbiting on the circumference of a circle defined by the parameters. |Radius [m] |Velocity [m/s] |Yaw behaviour |Empty |Latitude/X |Longitude/Y |Altitude/Z |
          */
   public static final int VEHICLE_CMD_DO_ORBIT = 34;
   /**
          * Start flying on the outline of a figure eight defined by the parameters. |Major Radius [m] |Minor Radius [m] |Velocity [m/s] |Orientation |Latitude/X |Longitude/Y |Altitude/Z |
          */
   public static final int VEHICLE_CMD_DO_FIGUREEIGHT = 35;
   /**
          * Sets the region of interest (ROI) for a sensor set or the vehicle itself. This can then be used by the vehicles control system to control the vehicle attitude and the attitude of various sensors such as cameras. |Region of interest mode. (see MAV_ROI enum)| MISSION index/ target ID. (see MAV_ROI enum)| ROI index (allows a vehicle to manage multiple ROI's)| Empty| x the location of the fixed ROI (see MAV_FRAME)| y| z|
          */
   public static final int VEHICLE_CMD_NAV_ROI = 80;
   /**
          * Control autonomous path planning on the MAV. |0: Disable local obstacle avoidance / local path planning (without resetting map), 1: Enable local path planning, 2: Enable and reset local path planning| 0: Disable full path planning (without resetting map), 1: Enable, 2: Enable and reset map/occupancy grid, 3: Enable and reset planned route, but not occupancy grid| Empty| Yaw angle at goal, in compass degrees, [0..360]| Latitude/X of goal| Longitude/Y of goal| Altitude/Z of goal|
          */
   public static final int VEHICLE_CMD_NAV_PATHPLANNING = 81;
   /**
          * Takeoff from ground / hand and transition to fixed wing |Minimum pitch (if airspeed sensor present), desired pitch without sensor| Empty| Empty| Yaw angle (if magnetometer present), ignored without magnetometer| Latitude| Longitude| Altitude|
          */
   public static final int VEHICLE_CMD_NAV_VTOL_TAKEOFF = 84;
   /**
          * Transition to MC and land at location |Empty| Empty| Empty| Desired yaw angle.| Latitude| Longitude| Altitude|
          */
   public static final int VEHICLE_CMD_NAV_VTOL_LAND = 85;
   /**
          * set limits for external control |timeout - maximum time (in seconds) that external controller will be allowed to control vehicle. 0 means no timeout| absolute altitude min (in meters, AMSL) - if vehicle moves below this alt, the command will be aborted and the mission will continue.  0 means no lower altitude limit| absolute altitude max (in meters)- if vehicle moves above this alt, the command will be aborted and the mission will continue.  0 means no upper altitude limit| horizontal move limit (in meters, AMSL) - if vehicle moves more than this distance from it's location at the moment the command was executed, the command will be aborted and the mission will continue. 0 means no horizontal altitude limit| Empty| Empty| Empty|
          */
   public static final int VEHICLE_CMD_NAV_GUIDED_LIMITS = 90;
   /**
          * set id of master controller |System ID| Component ID| Empty| Empty| Empty| Empty| Empty|
          */
   public static final int VEHICLE_CMD_NAV_GUIDED_MASTER = 91;
   /**
          * Delay the next navigation command a number of seconds or until a specified time |Delay in seconds (decimal, -1 to enable time-of-day fields)| hour (24h format, UTC, -1 to ignore)| minute (24h format, UTC, -1 to ignore)| second (24h format, UTC)| Empty| Empty| Empty|
          */
   public static final int VEHICLE_CMD_NAV_DELAY = 93;
   /**
          * NOP - This command is only used to mark the upper limit of the NAV/ACTION commands in the enumeration |Empty| Empty| Empty| Empty| Empty| Empty| Empty|
          */
   public static final int VEHICLE_CMD_NAV_LAST = 95;
   /**
          * Delay mission state machine. |Delay in seconds (decimal)| Empty| Empty| Empty| Empty| Empty| Empty|
          */
   public static final int VEHICLE_CMD_CONDITION_DELAY = 112;
   /**
          * Ascend/descend at rate.  Delay mission state machine until desired altitude reached. |Descent / Ascend rate (m/s)| Empty| Empty| Empty| Empty| Empty| Finish Altitude|
          */
   public static final int VEHICLE_CMD_CONDITION_CHANGE_ALT = 113;
   /**
          * Delay mission state machine until within desired distance of next NAV point. |Distance (meters)| Empty| Empty| Empty| Empty| Empty| Empty|
          */
   public static final int VEHICLE_CMD_CONDITION_DISTANCE = 114;
   /**
          * Reach a certain target angle. |target angle: [0-360], 0 is north| speed during yaw change:[deg per second]| direction: negative: counter clockwise, positive: clockwise [-1,1]| relative offset or absolute angle: [ 1,0]| Empty| Empty| Empty|
          */
   public static final int VEHICLE_CMD_CONDITION_YAW = 115;
   /**
          * NOP - This command is only used to mark the upper limit of the CONDITION commands in the enumeration |Empty| Empty| Empty| Empty| Empty| Empty| Empty|
          */
   public static final int VEHICLE_CMD_CONDITION_LAST = 159;
   /**
          * Wait until passing a threshold |2D coord mode: 0: Orthogonal to planned route | Altitude mode: 0: Ignore altitude| Empty| Empty| Lat| Lon| Alt|
          */
   public static final int VEHICLE_CMD_CONDITION_GATE = 4501;
   /**
          * Set system mode. |Mode, as defined by ENUM MAV_MODE| Empty| Empty| Empty| Empty| Empty| Empty|
          */
   public static final int VEHICLE_CMD_DO_SET_MODE = 176;
   /**
          * Jump to the desired command in the mission list.  Repeat this action only the specified number of times |Sequence number| Repeat count| Empty| Empty| Empty| Empty| Empty|
          */
   public static final int VEHICLE_CMD_DO_JUMP = 177;
   /**
          * Change speed and/or throttle set points. |Speed type (0=Airspeed, 1=Ground Speed)| Speed  (m/s, -1 indicates no change)| Throttle  ( Percent, -1 indicates no change)| Empty| Empty| Empty| Empty|
          */
   public static final int VEHICLE_CMD_DO_CHANGE_SPEED = 178;
   /**
          * Changes the home location either to the current location or a specified location. |Use current (1=use current location, 0=use specified location)| Empty| Empty| Empty| Latitude| Longitude| Altitude|
          */
   public static final int VEHICLE_CMD_DO_SET_HOME = 179;
   /**
          * Set a system parameter.  Caution!  Use of this command requires knowledge of the numeric enumeration value of the parameter. |Parameter number| Parameter value| Empty| Empty| Empty| Empty| Empty|
          */
   public static final int VEHICLE_CMD_DO_SET_PARAMETER = 180;
   /**
          * Set a relay to a condition. |Relay number| Setting (1=on, 0=off, others possible depending on system hardware)| Empty| Empty| Empty| Empty| Empty|
          */
   public static final int VEHICLE_CMD_DO_SET_RELAY = 181;
   /**
          * Cycle a relay on and off for a desired number of cycles with a desired period. |Relay number| Cycle count| Cycle time (seconds, decimal)| Empty| Empty| Empty| Empty|
          */
   public static final int VEHICLE_CMD_DO_REPEAT_RELAY = 182;
   /**
          * Cycle a between its nominal setting and a desired PWM for a desired number of cycles with a desired period. |Servo number| PWM (microseconds, 1000 to 2000 typical)| Cycle count| Cycle time (seconds)| Empty| Empty| Empty|
          */
   public static final int VEHICLE_CMD_DO_REPEAT_SERVO = 184;
   /**
          * Terminate flight immediately |Flight termination activated if > 0.5| Empty| Empty| Empty| Empty| Empty| Empty|
          */
   public static final int VEHICLE_CMD_DO_FLIGHTTERMINATION = 185;
   /**
          * Set the vehicle to Loiter mode and change the altitude to specified value |Altitude| Frame of new altitude | Empty| Empty| Empty| Empty| Empty|
          */
   public static final int VEHICLE_CMD_DO_CHANGE_ALTITUDE = 186;
   /**
          * Sets actuators (e.g. servos) to a desired value. |Actuator 1| Actuator 2| Actuator 3| Actuator 4| Actuator 5| Actuator 6| Index|
          */
   public static final int VEHICLE_CMD_DO_SET_ACTUATOR = 187;
   /**
          * Mission command to perform a landing. This is used as a marker in a mission to tell the autopilot where a sequence of mission items that represents a landing starts. It may also be sent via a COMMAND_LONG to trigger a landing, in which case the nearest (geographically) landing sequence in the mission will be used. The Latitude/Longitude is optional, and may be set to 0/0 if not needed. If specified then it will be used to help find the closest landing sequence. |Empty| Empty| Empty| Empty| Latitude| Longitude| Empty|
          */
   public static final int VEHICLE_CMD_DO_LAND_START = 189;
   /**
          * Mission command to safely abort an autonomous landing. |Altitude (meters)| Empty| Empty| Empty| Empty| Empty| Empty|
          */
   public static final int VEHICLE_CMD_DO_GO_AROUND = 191;
   /**
          * Reposition to specific WGS84 GPS position. |Ground speed [m/s] |Bitmask |Loiter radius [m] for planes |Yaw	[deg] |Latitude	|Longitude |Altitude |
          */
   public static final int VEHICLE_CMD_DO_REPOSITION = 192;
   public static final int VEHICLE_CMD_DO_PAUSE_CONTINUE = 193;
   /**
          * Sets the region of interest (ROI) to a location. This can then be used by the vehicles control system to control the vehicle attitude and the attitude of various sensors such as cameras. |Empty| Empty| Empty| Empty| Latitude| Longitude| Altitude|
          */
   public static final int VEHICLE_CMD_DO_SET_ROI_LOCATION = 195;
   /**
          * Sets the region of interest (ROI) to be toward next waypoint, with optional pitch/roll/yaw offset. This can then be used by the vehicles control system to control the vehicle attitude and the attitude of various sensors such as cameras. |Empty| Empty| Empty| Empty| pitch offset from next waypoint| roll offset from next waypoint| yaw offset from next waypoint|
          */
   public static final int VEHICLE_CMD_DO_SET_ROI_WPNEXT_OFFSET = 196;
   /**
          * Cancels any previous ROI command returning the vehicle/sensors to default flight characteristics. This can then be used by the vehicles control system to control the vehicle attitude and the attitude of various sensors such as cameras. |Empty| Empty| Empty| Empty| Empty| Empty| Empty|
          */
   public static final int VEHICLE_CMD_DO_SET_ROI_NONE = 197;
   /**
          * Control onboard camera system. |Camera ID (-1 for all)| Transmission: 0: disabled, 1: enabled compressed, 2: enabled raw| Transmission mode: 0: video stream, >0: single images every n seconds (decimal)| Recording: 0: disabled, 1: enabled compressed, 2: enabled raw| Empty| Empty| Empty|
          */
   public static final int VEHICLE_CMD_DO_CONTROL_VIDEO = 200;
   /**
          * Sets the region of interest (ROI) for a sensor set or the vehicle itself. This can then be used by the vehicles control system to control the vehicle attitude and the attitude of various sensors such as cameras. |Region of interest mode. (see MAV_ROI enum)| MISSION index/ target ID. (see MAV_ROI enum)| ROI index (allows a vehicle to manage multiple ROI's)| Empty| x the location of the fixed ROI (see MAV_FRAME)| y| z|
          */
   public static final int VEHICLE_CMD_DO_SET_ROI = 201;
   public static final int VEHICLE_CMD_DO_DIGICAM_CONTROL = 203;
   /**
          * Mission command to configure a camera or antenna mount |Mount operation mode (see MAV_MOUNT_MODE enum)| stabilize roll? (1 = yes, 0 = no)| stabilize pitch? (1 = yes, 0 = no)| stabilize yaw? (1 = yes, 0 = no)| Empty| Empty| Empty|
          */
   public static final int VEHICLE_CMD_DO_MOUNT_CONFIGURE = 204;
   /**
          * Mission command to control a camera or antenna mount |pitch or lat in degrees, depending on mount mode.| roll or lon in degrees depending on mount mode| yaw or alt (in meters) depending on mount mode| reserved| reserved| reserved| MAV_MOUNT_MODE enum value|
          */
   public static final int VEHICLE_CMD_DO_MOUNT_CONTROL = 205;
   /**
          * Mission command to set TRIG_DIST for this flight |Camera trigger distance (meters)| Shutter integration time (ms)| Empty| Empty| Empty| Empty| Empty|
          */
   public static final int VEHICLE_CMD_DO_SET_CAM_TRIGG_DIST = 206;
   /**
          * Mission command to enable the geofence |enable? (0=disable, 1=enable)| Empty| Empty| Empty| Empty| Empty| Empty|
          */
   public static final int VEHICLE_CMD_DO_FENCE_ENABLE = 207;
   /**
          * Mission command to trigger a parachute |action (0=disable, 1=enable, 2=release, for some systems see PARACHUTE_ACTION enum, not in general message set.)| Empty| Empty| Empty| Empty| Empty| Empty|
          */
   public static final int VEHICLE_CMD_DO_PARACHUTE = 208;
   /**
          * motor test command |Instance (1, ...)| throttle type| throttle| timeout [s]| Motor count | Test order| Empty|
          */
   public static final int VEHICLE_CMD_DO_MOTOR_TEST = 209;
   /**
          * Change to/from inverted flight |inverted (0=normal, 1=inverted)| Empty| Empty| Empty| Empty| Empty| Empty|
          */
   public static final int VEHICLE_CMD_DO_INVERTED_FLIGHT = 210;
   /**
          * Command to operate a gripper
          */
   public static final int VEHICLE_CMD_DO_GRIPPER = 211;
   /**
          * Mission command to set TRIG_INTERVAL for this flight |Camera trigger distance (meters)| Shutter integration time (ms)| Empty| Empty| Empty| Empty| Empty|
          */
   public static final int VEHICLE_CMD_DO_SET_CAM_TRIGG_INTERVAL = 214;
   /**
          * Mission command to control a camera or antenna mount, using a quaternion as reference. |q1 - quaternion param #1, w (1 in null-rotation)| q2 - quaternion param #2, x (0 in null-rotation)| q3 - quaternion param #3, y (0 in null-rotation)| q4 - quaternion param #4, z (0 in null-rotation)| Empty| Empty| Empty|
          */
   public static final int VEHICLE_CMD_DO_MOUNT_CONTROL_QUAT = 220;
   /**
          * set id of master controller |System ID| Component ID| Empty| Empty| Empty| Empty| Empty|
          */
   public static final int VEHICLE_CMD_DO_GUIDED_MASTER = 221;
   /**
          * set limits for external control |timeout - maximum time (in seconds) that external controller will be allowed to control vehicle. 0 means no timeout| absolute altitude min (in meters, AMSL) - if vehicle moves below this alt, the command will be aborted and the mission will continue.  0 means no lower altitude limit| absolute altitude max (in meters)- if vehicle moves above this alt, the command will be aborted and the mission will continue.  0 means no upper altitude limit| horizontal move limit (in meters, AMSL) - if vehicle moves more than this distance from it's location at the moment the command was executed, the command will be aborted and the mission will continue. 0 means no horizontal altitude limit| Empty| Empty| Empty|
          */
   public static final int VEHICLE_CMD_DO_GUIDED_LIMITS = 222;
   /**
          * NOP - This command is only used to mark the upper limit of the DO commands in the enumeration |Empty| Empty| Empty| Empty| Empty| Empty| Empty|
          */
   public static final int VEHICLE_CMD_DO_LAST = 240;
   /**
          * Trigger calibration. This command will be only accepted if in pre-flight mode. See mavlink spec MAV_CMD_PREFLIGHT_CALIBRATION
          */
   public static final int VEHICLE_CMD_PREFLIGHT_CALIBRATION = 241;
   /**
          * param value for VEHICLE_CMD_PREFLIGHT_CALIBRATION to start temperature calibration
          */
   public static final int PREFLIGHT_CALIBRATION_TEMPERATURE_CALIBRATION = 3;
   /**
          * Set sensor offsets. This command will be only accepted if in pre-flight mode. |Sensor to adjust the offsets for: 0: gyros, 1: accelerometer, 2: magnetometer, 3: barometer, 4: optical flow| X axis offset (or generic dimension 1), in the sensor's raw units| Y axis offset (or generic dimension 2), in the sensor's raw units| Z axis offset (or generic dimension 3), in the sensor's raw units| Generic dimension 4, in the sensor's raw units| Generic dimension 5, in the sensor's raw units| Generic dimension 6, in the sensor's raw units|
          */
   public static final int VEHICLE_CMD_PREFLIGHT_SET_SENSOR_OFFSETS = 242;
   /**
          * UAVCAN configuration. If param 1 == 1 actuator mapping and direction assignment should be started
          */
   public static final int VEHICLE_CMD_PREFLIGHT_UAVCAN = 243;
   /**
          * Request storage of different parameter values and logs. This command will be only accepted if in pre-flight mode. |Parameter storage: 0: READ FROM FLASH/EEPROM, 1: WRITE CURRENT TO FLASH/EEPROM| Mission storage: 0: READ FROM FLASH/EEPROM, 1: WRITE CURRENT TO FLASH/EEPROM| Reserved| Reserved| Empty| Empty| Empty|
          */
   public static final int VEHICLE_CMD_PREFLIGHT_STORAGE = 245;
   /**
          * Request the reboot or shutdown of system components. |0: Do nothing for autopilot, 1: Reboot autopilot, 2: Shutdown autopilot.| 0: Do nothing for onboard computer, 1: Reboot onboard computer, 2: Shutdown onboard computer.| Reserved| Reserved| Empty| Empty| Empty|
          */
   public static final int VEHICLE_CMD_PREFLIGHT_REBOOT_SHUTDOWN = 246;
   /**
          * Mission command to set a Camera Auto Mount Pivoting Oblique Survey for this flight|Camera trigger distance (meters)| Shutter integration time (ms)| Camera minimum trigger interval| Number of positions| Roll| Pitch| Empty|
          */
   public static final int VEHICLE_CMD_OBLIQUE_SURVEY = 260;
   /**
          * Enable the specified standard MAVLink mode |MAV_STANDARD_MODE|
          */
   public static final int VEHICLE_CMD_DO_SET_STANDARD_MODE = 262;
   /**
          * Command to ask information about a low level gimbal
          */
   public static final int VEHICLE_CMD_GIMBAL_DEVICE_INFORMATION = 283;
   /**
          * start running a mission |first_item: the first mission item to run| last_item:  the last mission item to run (after this item is run, the mission ends)|
          */
   public static final int VEHICLE_CMD_MISSION_START = 300;
   /**
          * Actuator testing command|value [-1,1]|timeout [s]|Empty|Empty|output function|
          */
   public static final int VEHICLE_CMD_ACTUATOR_TEST = 310;
   /**
          * Actuator configuration command|configuration|Empty|Empty|Empty|output function|
          */
   public static final int VEHICLE_CMD_CONFIGURE_ACTUATOR = 311;
   /**
          * Arms / Disarms a component |1 to arm, 0 to disarm
          */
   public static final int VEHICLE_CMD_COMPONENT_ARM_DISARM = 400;
   /**
          * Instructs a target system to run pre-arm checks.
          */
   public static final int VEHICLE_CMD_RUN_PREARM_CHECKS = 401;
   /**
          * Inject artificial failure for testing purposes
          */
   public static final int VEHICLE_CMD_INJECT_FAILURE = 420;
   /**
          * Starts receiver pairing |0:Spektrum| 0:Spektrum DSM2, 1:Spektrum DSMX|
          */
   public static final int VEHICLE_CMD_START_RX_PAIR = 500;
   /**
          * Request to send a single instance of the specified message
          */
   public static final int VEHICLE_CMD_REQUEST_MESSAGE = 512;
   /**
          * Request camera information (CAMERA_INFORMATION). |0: No action 1: Request camera capabilities| Reserved (all remaining params)| Reserved (default:0)| Reserved (default:0)| Reserved (default:0)| Reserved (default:0)| Reserved (default:0)|
          */
   public static final int VEHICLE_CMD_REQUEST_CAMERA_INFORMATION = 521;
   /**
          * Set camera capture mode (photo, video, etc.)
          */
   public static final int VEHICLE_CMD_SET_CAMERA_MODE = 530;
   /**
          * Set camera zoom
          */
   public static final int VEHICLE_CMD_SET_CAMERA_ZOOM = 531;
   public static final int VEHICLE_CMD_SET_CAMERA_FOCUS = 532;
   /**
          * Setpoint to be sent to a gimbal manager to set a gimbal pitch and yaw
          */
   public static final int VEHICLE_CMD_DO_GIMBAL_MANAGER_PITCHYAW = 1000;
   /**
          * Gimbal configuration to set which sysid/compid is in primary and secondary control
          */
   public static final int VEHICLE_CMD_DO_GIMBAL_MANAGER_CONFIGURE = 1001;
   /**
          * Start image capture sequence.
          */
   public static final int VEHICLE_CMD_IMAGE_START_CAPTURE = 2000;
   /**
          * Enable or disable on-board camera triggering system
          */
   public static final int VEHICLE_CMD_DO_TRIGGER_CONTROL = 2003;
   /**
          * Start a video capture.
          */
   public static final int VEHICLE_CMD_VIDEO_START_CAPTURE = 2500;
   /**
          * Stop the current video capture.
          */
   public static final int VEHICLE_CMD_VIDEO_STOP_CAPTURE = 2501;
   /**
          * start streaming ULog data
          */
   public static final int VEHICLE_CMD_LOGGING_START = 2510;
   /**
          * stop streaming ULog data
          */
   public static final int VEHICLE_CMD_LOGGING_STOP = 2511;
   /**
          * control starting/stopping transmitting data over the high latency link
          */
   public static final int VEHICLE_CMD_CONTROL_HIGH_LATENCY = 2600;
   /**
          * Command VTOL transition
          */
   public static final int VEHICLE_CMD_DO_VTOL_TRANSITION = 3000;
   /**
          * Request arm authorization
          */
   public static final int VEHICLE_CMD_ARM_AUTHORIZATION_REQUEST = 3001;
   /**
          * Prepare a payload deployment in the flight plan
          */
   public static final int VEHICLE_CMD_PAYLOAD_PREPARE_DEPLOY = 30001;
   /**
          * Control a pre-programmed payload deployment
          */
   public static final int VEHICLE_CMD_PAYLOAD_CONTROL_DEPLOY = 30002;
   /**
          * Magnetometer calibration based on provided known yaw. This allows for fast calibration using WMM field tables in the vehicle, given only the known yaw of the vehicle. If Latitude and longitude are both zero then use the current vehicle location.
          */
   public static final int VEHICLE_CMD_FIXED_MAG_CAL_YAW = 42006;
   /**
          * Command to operate winch.
          */
   public static final int VEHICLE_CMD_DO_WINCH = 42600;
   /**
          * external reset of estimator global position when deadreckoning
          */
   public static final int VEHICLE_CMD_EXTERNAL_POSITION_ESTIMATE = 43003;
   public static final int VEHICLE_CMD_EXTERNAL_WIND_ESTIMATE = 43004;
   /**
          * PX4 vehicle commands (beyond 16 bit mavlink commands)
          * start of PX4 internal only vehicle commands (> UINT16_MAX)
          */
   public static final long VEHICLE_CMD_PX4_INTERNAL_START = 65537;
   /**
          * Sets the GPS coordinates of the vehicle local origin (0,0,0) position. |Empty|Empty|Empty|Empty|Latitude|Longitude|Altitude|
          */
   public static final long VEHICLE_CMD_SET_GPS_GLOBAL_ORIGIN = 100000;
   /**
          * Change mode by specifying nav_state directly. |nav_state|Empty|Empty|Empty|Empty|Empty|Empty|
          */
   public static final long VEHICLE_CMD_SET_NAV_STATE = 100001;
   /**
          * Load and keep safe position (Roll,Pitch,Yaw) from permanent memory and stop stabilization |
          */
   public static final byte VEHICLE_MOUNT_MODE_RETRACT = (byte) 0;
   /**
          * Load and keep neutral position (Roll,Pitch,Yaw) from permanent memory. |
          */
   public static final byte VEHICLE_MOUNT_MODE_NEUTRAL = (byte) 1;
   /**
          * Load neutral position and start MAVLink Roll,Pitch,Yaw control with stabilization |
          */
   public static final byte VEHICLE_MOUNT_MODE_MAVLINK_TARGETING = (byte) 2;
   /**
          * Load neutral position and start RC Roll,Pitch,Yaw control with stabilization |
          */
   public static final byte VEHICLE_MOUNT_MODE_RC_TARGETING = (byte) 3;
   /**
          * Load neutral position and start to point to Lat,Lon,Alt |
          */
   public static final byte VEHICLE_MOUNT_MODE_GPS_POINT = (byte) 4;
   /**
          * 
          */
   public static final byte VEHICLE_MOUNT_MODE_ENUM_END = (byte) 5;
   /**
          * No region of interest |
          */
   public static final byte VEHICLE_ROI_NONE = (byte) 0;
   /**
          * Point toward next MISSION |
          */
   public static final byte VEHICLE_ROI_WPNEXT = (byte) 1;
   /**
          * Point toward given MISSION |
          */
   public static final byte VEHICLE_ROI_WPINDEX = (byte) 2;
   /**
          * Point toward fixed location |
          */
   public static final byte VEHICLE_ROI_LOCATION = (byte) 3;
   /**
          * Point toward target
          */
   public static final byte VEHICLE_ROI_TARGET = (byte) 4;
   public static final byte VEHICLE_ROI_ENUM_END = (byte) 5;
   public static final byte PARACHUTE_ACTION_DISABLE = (byte) 0;
   public static final byte PARACHUTE_ACTION_ENABLE = (byte) 1;
   public static final byte PARACHUTE_ACTION_RELEASE = (byte) 2;
   public static final byte FAILURE_UNIT_SENSOR_GYRO = (byte) 0;
   public static final byte FAILURE_UNIT_SENSOR_ACCEL = (byte) 1;
   public static final byte FAILURE_UNIT_SENSOR_MAG = (byte) 2;
   public static final byte FAILURE_UNIT_SENSOR_BARO = (byte) 3;
   public static final byte FAILURE_UNIT_SENSOR_GPS = (byte) 4;
   public static final byte FAILURE_UNIT_SENSOR_OPTICAL_FLOW = (byte) 5;
   public static final byte FAILURE_UNIT_SENSOR_VIO = (byte) 6;
   public static final byte FAILURE_UNIT_SENSOR_DISTANCE_SENSOR = (byte) 7;
   public static final byte FAILURE_UNIT_SENSOR_AIRSPEED = (byte) 8;
   public static final byte FAILURE_UNIT_SYSTEM_BATTERY = (byte) 100;
   public static final byte FAILURE_UNIT_SYSTEM_MOTOR = (byte) 101;
   public static final byte FAILURE_UNIT_SYSTEM_SERVO = (byte) 102;
   public static final byte FAILURE_UNIT_SYSTEM_AVOIDANCE = (byte) 103;
   public static final byte FAILURE_UNIT_SYSTEM_RC_SIGNAL = (byte) 104;
   public static final byte FAILURE_UNIT_SYSTEM_MAVLINK_SIGNAL = (byte) 105;
   public static final byte FAILURE_TYPE_OK = (byte) 0;
   public static final byte FAILURE_TYPE_OFF = (byte) 1;
   public static final byte FAILURE_TYPE_STUCK = (byte) 2;
   public static final byte FAILURE_TYPE_GARBAGE = (byte) 3;
   public static final byte FAILURE_TYPE_WRONG = (byte) 4;
   public static final byte FAILURE_TYPE_SLOW = (byte) 5;
   public static final byte FAILURE_TYPE_DELAYED = (byte) 6;
   public static final byte FAILURE_TYPE_INTERMITTENT = (byte) 7;
   /**
          * used as param1 in DO_CHANGE_SPEED command
          */
   public static final byte SPEED_TYPE_AIRSPEED = (byte) 0;
   public static final byte SPEED_TYPE_GROUNDSPEED = (byte) 1;
   public static final byte SPEED_TYPE_CLIMB_SPEED = (byte) 2;
   public static final byte SPEED_TYPE_DESCEND_SPEED = (byte) 3;
   /**
          * used as param3 in CMD_DO_ORBIT
          */
   public static final byte ORBIT_YAW_BEHAVIOUR_HOLD_FRONT_TO_CIRCLE_CENTER = (byte) 0;
   public static final byte ORBIT_YAW_BEHAVIOUR_HOLD_INITIAL_HEADING = (byte) 1;
   public static final byte ORBIT_YAW_BEHAVIOUR_UNCONTROLLED = (byte) 2;
   public static final byte ORBIT_YAW_BEHAVIOUR_HOLD_FRONT_TANGENT_TO_CIRCLE = (byte) 3;
   public static final byte ORBIT_YAW_BEHAVIOUR_RC_CONTROLLED = (byte) 4;
   public static final byte ORBIT_YAW_BEHAVIOUR_UNCHANGED = (byte) 5;
   /**
          * used as param1 in ARM_DISARM command
          */
   public static final byte ARMING_ACTION_DISARM = (byte) 0;
   public static final byte ARMING_ACTION_ARM = (byte) 1;
   /**
          * param2 in VEHICLE_CMD_DO_GRIPPER
          */
   public static final byte GRIPPER_ACTION_RELEASE = (byte) 0;
   public static final byte GRIPPER_ACTION_GRAB = (byte) 1;
   public static final byte ORB_QUEUE_LENGTH = (byte) 8;
   public static final int COMPONENT_MODE_EXECUTOR_START = 1000;
   /**
            * time since system start (microseconds)
            */
   public long timestamp_;
   /**
            * Parameter 1, as defined by MAVLink uint16 VEHICLE_CMD enum.
            */
   public float param1_;
   /**
            * Parameter 2, as defined by MAVLink uint16 VEHICLE_CMD enum.
            */
   public float param2_;
   /**
            * Parameter 3, as defined by MAVLink uint16 VEHICLE_CMD enum.
            */
   public float param3_;
   /**
            * Parameter 4, as defined by MAVLink uint16 VEHICLE_CMD enum.
            */
   public float param4_;
   /**
            * Parameter 5, as defined by MAVLink uint16 VEHICLE_CMD enum.
            */
   public double param5_;
   /**
            * Parameter 6, as defined by MAVLink uint16 VEHICLE_CMD enum.
            */
   public double param6_;
   /**
            * Parameter 7, as defined by MAVLink uint16 VEHICLE_CMD enum.
            */
   public float param7_;
   /**
            * Command ID
            */
   public long command_;
   /**
            * System which should execute the command
            */
   public byte target_system_;
   /**
            * Component which should execute the command, 0 for all components
            */
   public byte target_component_;
   /**
            * System sending the command
            */
   public byte source_system_;
   /**
            * Component / mode executor sending the command
            */
   public int source_component_;
   /**
            * 0: First transmission of this command. 1-255: Confirmation transmissions (e.g. for kill command)
            */
   public byte confirmation_;
   public boolean from_external_;

   public VehicleCommand()
   {
   }

   public VehicleCommand(VehicleCommand other)
   {
      this();
      set(other);
   }

   public void set(VehicleCommand other)
   {
      timestamp_ = other.timestamp_;

      param1_ = other.param1_;

      param2_ = other.param2_;

      param3_ = other.param3_;

      param4_ = other.param4_;

      param5_ = other.param5_;

      param6_ = other.param6_;

      param7_ = other.param7_;

      command_ = other.command_;

      target_system_ = other.target_system_;

      target_component_ = other.target_component_;

      source_system_ = other.source_system_;

      source_component_ = other.source_component_;

      confirmation_ = other.confirmation_;

      from_external_ = other.from_external_;

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
            * Parameter 1, as defined by MAVLink uint16 VEHICLE_CMD enum.
            */
   public void setParam1(float param1)
   {
      param1_ = param1;
   }
   /**
            * Parameter 1, as defined by MAVLink uint16 VEHICLE_CMD enum.
            */
   public float getParam1()
   {
      return param1_;
   }

   /**
            * Parameter 2, as defined by MAVLink uint16 VEHICLE_CMD enum.
            */
   public void setParam2(float param2)
   {
      param2_ = param2;
   }
   /**
            * Parameter 2, as defined by MAVLink uint16 VEHICLE_CMD enum.
            */
   public float getParam2()
   {
      return param2_;
   }

   /**
            * Parameter 3, as defined by MAVLink uint16 VEHICLE_CMD enum.
            */
   public void setParam3(float param3)
   {
      param3_ = param3;
   }
   /**
            * Parameter 3, as defined by MAVLink uint16 VEHICLE_CMD enum.
            */
   public float getParam3()
   {
      return param3_;
   }

   /**
            * Parameter 4, as defined by MAVLink uint16 VEHICLE_CMD enum.
            */
   public void setParam4(float param4)
   {
      param4_ = param4;
   }
   /**
            * Parameter 4, as defined by MAVLink uint16 VEHICLE_CMD enum.
            */
   public float getParam4()
   {
      return param4_;
   }

   /**
            * Parameter 5, as defined by MAVLink uint16 VEHICLE_CMD enum.
            */
   public void setParam5(double param5)
   {
      param5_ = param5;
   }
   /**
            * Parameter 5, as defined by MAVLink uint16 VEHICLE_CMD enum.
            */
   public double getParam5()
   {
      return param5_;
   }

   /**
            * Parameter 6, as defined by MAVLink uint16 VEHICLE_CMD enum.
            */
   public void setParam6(double param6)
   {
      param6_ = param6;
   }
   /**
            * Parameter 6, as defined by MAVLink uint16 VEHICLE_CMD enum.
            */
   public double getParam6()
   {
      return param6_;
   }

   /**
            * Parameter 7, as defined by MAVLink uint16 VEHICLE_CMD enum.
            */
   public void setParam7(float param7)
   {
      param7_ = param7;
   }
   /**
            * Parameter 7, as defined by MAVLink uint16 VEHICLE_CMD enum.
            */
   public float getParam7()
   {
      return param7_;
   }

   /**
            * Command ID
            */
   public void setCommand(long command)
   {
      command_ = command;
   }
   /**
            * Command ID
            */
   public long getCommand()
   {
      return command_;
   }

   /**
            * System which should execute the command
            */
   public void setTargetSystem(byte target_system)
   {
      target_system_ = target_system;
   }
   /**
            * System which should execute the command
            */
   public byte getTargetSystem()
   {
      return target_system_;
   }

   /**
            * Component which should execute the command, 0 for all components
            */
   public void setTargetComponent(byte target_component)
   {
      target_component_ = target_component;
   }
   /**
            * Component which should execute the command, 0 for all components
            */
   public byte getTargetComponent()
   {
      return target_component_;
   }

   /**
            * System sending the command
            */
   public void setSourceSystem(byte source_system)
   {
      source_system_ = source_system;
   }
   /**
            * System sending the command
            */
   public byte getSourceSystem()
   {
      return source_system_;
   }

   /**
            * Component / mode executor sending the command
            */
   public void setSourceComponent(int source_component)
   {
      source_component_ = source_component;
   }
   /**
            * Component / mode executor sending the command
            */
   public int getSourceComponent()
   {
      return source_component_;
   }

   /**
            * 0: First transmission of this command. 1-255: Confirmation transmissions (e.g. for kill command)
            */
   public void setConfirmation(byte confirmation)
   {
      confirmation_ = confirmation;
   }
   /**
            * 0: First transmission of this command. 1-255: Confirmation transmissions (e.g. for kill command)
            */
   public byte getConfirmation()
   {
      return confirmation_;
   }

   public void setFromExternal(boolean from_external)
   {
      from_external_ = from_external;
   }
   public boolean getFromExternal()
   {
      return from_external_;
   }


   public static Supplier<VehicleCommandPubSubType> getPubSubType()
   {
      return VehicleCommandPubSubType::new;
   }

   @Override
   public Supplier<TopicDataType> getPubSubTypePacket()
   {
      return VehicleCommandPubSubType::new;
   }

   @Override
   public boolean epsilonEquals(VehicleCommand other, double epsilon)
   {
      if(other == null) return false;
      if(other == this) return true;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_, other.timestamp_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.param1_, other.param1_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.param2_, other.param2_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.param3_, other.param3_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.param4_, other.param4_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.param5_, other.param5_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.param6_, other.param6_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.param7_, other.param7_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.command_, other.command_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.target_system_, other.target_system_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.target_component_, other.target_component_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.source_system_, other.source_system_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.source_component_, other.source_component_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.confirmation_, other.confirmation_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.from_external_, other.from_external_, epsilon)) return false;


      return true;
   }

   @Override
   public boolean equals(Object other)
   {
      if(other == null) return false;
      if(other == this) return true;
      if(!(other instanceof VehicleCommand)) return false;

      VehicleCommand otherMyClass = (VehicleCommand) other;

      if(this.timestamp_ != otherMyClass.timestamp_) return false;

      if(this.param1_ != otherMyClass.param1_) return false;

      if(this.param2_ != otherMyClass.param2_) return false;

      if(this.param3_ != otherMyClass.param3_) return false;

      if(this.param4_ != otherMyClass.param4_) return false;

      if(this.param5_ != otherMyClass.param5_) return false;

      if(this.param6_ != otherMyClass.param6_) return false;

      if(this.param7_ != otherMyClass.param7_) return false;

      if(this.command_ != otherMyClass.command_) return false;

      if(this.target_system_ != otherMyClass.target_system_) return false;

      if(this.target_component_ != otherMyClass.target_component_) return false;

      if(this.source_system_ != otherMyClass.source_system_) return false;

      if(this.source_component_ != otherMyClass.source_component_) return false;

      if(this.confirmation_ != otherMyClass.confirmation_) return false;

      if(this.from_external_ != otherMyClass.from_external_) return false;


      return true;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("VehicleCommand {");
      builder.append("timestamp=");
      builder.append(this.timestamp_);      builder.append(", ");
      builder.append("param1=");
      builder.append(this.param1_);      builder.append(", ");
      builder.append("param2=");
      builder.append(this.param2_);      builder.append(", ");
      builder.append("param3=");
      builder.append(this.param3_);      builder.append(", ");
      builder.append("param4=");
      builder.append(this.param4_);      builder.append(", ");
      builder.append("param5=");
      builder.append(this.param5_);      builder.append(", ");
      builder.append("param6=");
      builder.append(this.param6_);      builder.append(", ");
      builder.append("param7=");
      builder.append(this.param7_);      builder.append(", ");
      builder.append("command=");
      builder.append(this.command_);      builder.append(", ");
      builder.append("target_system=");
      builder.append(this.target_system_);      builder.append(", ");
      builder.append("target_component=");
      builder.append(this.target_component_);      builder.append(", ");
      builder.append("source_system=");
      builder.append(this.source_system_);      builder.append(", ");
      builder.append("source_component=");
      builder.append(this.source_component_);      builder.append(", ");
      builder.append("confirmation=");
      builder.append(this.confirmation_);      builder.append(", ");
      builder.append("from_external=");
      builder.append(this.from_external_);
      builder.append("}");
      return builder.toString();
   }
}
