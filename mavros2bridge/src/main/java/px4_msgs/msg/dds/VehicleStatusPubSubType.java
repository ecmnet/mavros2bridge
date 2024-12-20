package px4_msgs.msg.dds;

/**
* 
* Topic data type of the struct "VehicleStatus" defined in "VehicleStatus_.idl". Use this class to provide the TopicDataType to a Participant. 
*
* This file was automatically generated from VehicleStatus_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit VehicleStatus_.idl instead.
*
*/
public class VehicleStatusPubSubType implements us.ihmc.pubsub.TopicDataType<px4_msgs.msg.dds.VehicleStatus>
{
   public static final java.lang.String name = "px4_msgs::msg::dds_::VehicleStatus_";
   
   @Override
   public final java.lang.String getDefinitionChecksum()
   {
   		return "fff804816bafea41c05b5f1e16ec84b6d2a94e37c7b75365e53183ac3aa2c9d0";
   }
   
   @Override
   public final java.lang.String getDefinitionVersion()
   {
   		return "";
   }

   private final us.ihmc.idl.CDR serializeCDR = new us.ihmc.idl.CDR();
   private final us.ihmc.idl.CDR deserializeCDR = new us.ihmc.idl.CDR();

   @Override
   public void serialize(px4_msgs.msg.dds.VehicleStatus data, us.ihmc.pubsub.common.SerializedPayload serializedPayload) throws java.io.IOException
   {
      serializeCDR.serialize(serializedPayload);
      write(data, serializeCDR);
      serializeCDR.finishSerialize();
   }

   @Override
   public void deserialize(us.ihmc.pubsub.common.SerializedPayload serializedPayload, px4_msgs.msg.dds.VehicleStatus data) throws java.io.IOException
   {
      deserializeCDR.deserialize(serializedPayload);
      read(data, deserializeCDR);
      deserializeCDR.finishDeserialize();
   }

   public static int getMaxCdrSerializedSize()
   {
      return getMaxCdrSerializedSize(0);
   }

   public static int getMaxCdrSerializedSize(int current_alignment)
   {
      int initial_alignment = current_alignment;

      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);

      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);

      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 2 + us.ihmc.idl.CDR.alignment(current_alignment, 2);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      return current_alignment - initial_alignment;
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.VehicleStatus data)
   {
      return getCdrSerializedSize(data, 0);
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.VehicleStatus data, int current_alignment)
   {
      int initial_alignment = current_alignment;

      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 2 + us.ihmc.idl.CDR.alignment(current_alignment, 2);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);



      return current_alignment - initial_alignment;
   }

   public static void write(px4_msgs.msg.dds.VehicleStatus data, us.ihmc.idl.CDR cdr)
   {
      cdr.write_type_12(data.getTimestamp());

      cdr.write_type_12(data.getArmedTime());

      cdr.write_type_12(data.getTakeoffTime());

      cdr.write_type_9(data.getArmingState());

      cdr.write_type_9(data.getLatestArmingReason());

      cdr.write_type_9(data.getLatestDisarmingReason());

      cdr.write_type_12(data.getNavStateTimestamp());

      cdr.write_type_9(data.getNavStateUserIntention());

      cdr.write_type_9(data.getNavState());

      cdr.write_type_9(data.getExecutorInCharge());

      cdr.write_type_4(data.getValidNavStatesMask());

      cdr.write_type_4(data.getCanSetNavStatesMask());

      cdr.write_type_3(data.getFailureDetectorStatus());

      cdr.write_type_9(data.getHilState());

      cdr.write_type_9(data.getVehicleType());

      cdr.write_type_7(data.getFailsafe());

      cdr.write_type_7(data.getFailsafeAndUserTookOver());

      cdr.write_type_9(data.getFailsafeDeferState());

      cdr.write_type_7(data.getGcsConnectionLost());

      cdr.write_type_9(data.getGcsConnectionLostCounter());

      cdr.write_type_7(data.getHighLatencyDataLinkLost());

      cdr.write_type_7(data.getIsVtol());

      cdr.write_type_7(data.getIsVtolTailsitter());

      cdr.write_type_7(data.getInTransitionMode());

      cdr.write_type_7(data.getInTransitionToFw());

      cdr.write_type_9(data.getSystemType());

      cdr.write_type_9(data.getSystemId());

      cdr.write_type_9(data.getComponentId());

      cdr.write_type_7(data.getSafetyButtonAvailable());

      cdr.write_type_7(data.getSafetyOff());

      cdr.write_type_7(data.getPowerInputValid());

      cdr.write_type_7(data.getUsbConnected());

      cdr.write_type_7(data.getOpenDroneIdSystemPresent());

      cdr.write_type_7(data.getOpenDroneIdSystemHealthy());

      cdr.write_type_7(data.getParachuteSystemPresent());

      cdr.write_type_7(data.getParachuteSystemHealthy());

      cdr.write_type_7(data.getAvoidanceSystemRequired());

      cdr.write_type_7(data.getAvoidanceSystemValid());

      cdr.write_type_7(data.getRcCalibrationInProgress());

      cdr.write_type_7(data.getCalibrationEnabled());

      cdr.write_type_7(data.getPreFlightChecksPass());

   }

   public static void read(px4_msgs.msg.dds.VehicleStatus data, us.ihmc.idl.CDR cdr)
   {
      data.setTimestamp(cdr.read_type_12());
      	
      data.setArmedTime(cdr.read_type_12());
      	
      data.setTakeoffTime(cdr.read_type_12());
      	
      data.setArmingState(cdr.read_type_9());
      	
      data.setLatestArmingReason(cdr.read_type_9());
      	
      data.setLatestDisarmingReason(cdr.read_type_9());
      	
      data.setNavStateTimestamp(cdr.read_type_12());
      	
      data.setNavStateUserIntention(cdr.read_type_9());
      	
      data.setNavState(cdr.read_type_9());
      	
      data.setExecutorInCharge(cdr.read_type_9());
      	
      data.setValidNavStatesMask(cdr.read_type_4());
      	
      data.setCanSetNavStatesMask(cdr.read_type_4());
      	
      data.setFailureDetectorStatus(cdr.read_type_3());
      	
      data.setHilState(cdr.read_type_9());
      	
      data.setVehicleType(cdr.read_type_9());
      	
      data.setFailsafe(cdr.read_type_7());
      	
      data.setFailsafeAndUserTookOver(cdr.read_type_7());
      	
      data.setFailsafeDeferState(cdr.read_type_9());
      	
      data.setGcsConnectionLost(cdr.read_type_7());
      	
      data.setGcsConnectionLostCounter(cdr.read_type_9());
      	
      data.setHighLatencyDataLinkLost(cdr.read_type_7());
      	
      data.setIsVtol(cdr.read_type_7());
      	
      data.setIsVtolTailsitter(cdr.read_type_7());
      	
      data.setInTransitionMode(cdr.read_type_7());
      	
      data.setInTransitionToFw(cdr.read_type_7());
      	
      data.setSystemType(cdr.read_type_9());
      	
      data.setSystemId(cdr.read_type_9());
      	
      data.setComponentId(cdr.read_type_9());
      	
      data.setSafetyButtonAvailable(cdr.read_type_7());
      	
      data.setSafetyOff(cdr.read_type_7());
      	
      data.setPowerInputValid(cdr.read_type_7());
      	
      data.setUsbConnected(cdr.read_type_7());
      	
      data.setOpenDroneIdSystemPresent(cdr.read_type_7());
      	
      data.setOpenDroneIdSystemHealthy(cdr.read_type_7());
      	
      data.setParachuteSystemPresent(cdr.read_type_7());
      	
      data.setParachuteSystemHealthy(cdr.read_type_7());
      	
      data.setAvoidanceSystemRequired(cdr.read_type_7());
      	
      data.setAvoidanceSystemValid(cdr.read_type_7());
      	
      data.setRcCalibrationInProgress(cdr.read_type_7());
      	
      data.setCalibrationEnabled(cdr.read_type_7());
      	
      data.setPreFlightChecksPass(cdr.read_type_7());
      	

   }

   @Override
   public final void serialize(px4_msgs.msg.dds.VehicleStatus data, us.ihmc.idl.InterchangeSerializer ser)
   {
      ser.write_type_12("timestamp", data.getTimestamp());
      ser.write_type_12("armed_time", data.getArmedTime());
      ser.write_type_12("takeoff_time", data.getTakeoffTime());
      ser.write_type_9("arming_state", data.getArmingState());
      ser.write_type_9("latest_arming_reason", data.getLatestArmingReason());
      ser.write_type_9("latest_disarming_reason", data.getLatestDisarmingReason());
      ser.write_type_12("nav_state_timestamp", data.getNavStateTimestamp());
      ser.write_type_9("nav_state_user_intention", data.getNavStateUserIntention());
      ser.write_type_9("nav_state", data.getNavState());
      ser.write_type_9("executor_in_charge", data.getExecutorInCharge());
      ser.write_type_4("valid_nav_states_mask", data.getValidNavStatesMask());
      ser.write_type_4("can_set_nav_states_mask", data.getCanSetNavStatesMask());
      ser.write_type_3("failure_detector_status", data.getFailureDetectorStatus());
      ser.write_type_9("hil_state", data.getHilState());
      ser.write_type_9("vehicle_type", data.getVehicleType());
      ser.write_type_7("failsafe", data.getFailsafe());
      ser.write_type_7("failsafe_and_user_took_over", data.getFailsafeAndUserTookOver());
      ser.write_type_9("failsafe_defer_state", data.getFailsafeDeferState());
      ser.write_type_7("gcs_connection_lost", data.getGcsConnectionLost());
      ser.write_type_9("gcs_connection_lost_counter", data.getGcsConnectionLostCounter());
      ser.write_type_7("high_latency_data_link_lost", data.getHighLatencyDataLinkLost());
      ser.write_type_7("is_vtol", data.getIsVtol());
      ser.write_type_7("is_vtol_tailsitter", data.getIsVtolTailsitter());
      ser.write_type_7("in_transition_mode", data.getInTransitionMode());
      ser.write_type_7("in_transition_to_fw", data.getInTransitionToFw());
      ser.write_type_9("system_type", data.getSystemType());
      ser.write_type_9("system_id", data.getSystemId());
      ser.write_type_9("component_id", data.getComponentId());
      ser.write_type_7("safety_button_available", data.getSafetyButtonAvailable());
      ser.write_type_7("safety_off", data.getSafetyOff());
      ser.write_type_7("power_input_valid", data.getPowerInputValid());
      ser.write_type_7("usb_connected", data.getUsbConnected());
      ser.write_type_7("open_drone_id_system_present", data.getOpenDroneIdSystemPresent());
      ser.write_type_7("open_drone_id_system_healthy", data.getOpenDroneIdSystemHealthy());
      ser.write_type_7("parachute_system_present", data.getParachuteSystemPresent());
      ser.write_type_7("parachute_system_healthy", data.getParachuteSystemHealthy());
      ser.write_type_7("avoidance_system_required", data.getAvoidanceSystemRequired());
      ser.write_type_7("avoidance_system_valid", data.getAvoidanceSystemValid());
      ser.write_type_7("rc_calibration_in_progress", data.getRcCalibrationInProgress());
      ser.write_type_7("calibration_enabled", data.getCalibrationEnabled());
      ser.write_type_7("pre_flight_checks_pass", data.getPreFlightChecksPass());
   }

   @Override
   public final void deserialize(us.ihmc.idl.InterchangeSerializer ser, px4_msgs.msg.dds.VehicleStatus data)
   {
      data.setTimestamp(ser.read_type_12("timestamp"));
      data.setArmedTime(ser.read_type_12("armed_time"));
      data.setTakeoffTime(ser.read_type_12("takeoff_time"));
      data.setArmingState(ser.read_type_9("arming_state"));
      data.setLatestArmingReason(ser.read_type_9("latest_arming_reason"));
      data.setLatestDisarmingReason(ser.read_type_9("latest_disarming_reason"));
      data.setNavStateTimestamp(ser.read_type_12("nav_state_timestamp"));
      data.setNavStateUserIntention(ser.read_type_9("nav_state_user_intention"));
      data.setNavState(ser.read_type_9("nav_state"));
      data.setExecutorInCharge(ser.read_type_9("executor_in_charge"));
      data.setValidNavStatesMask(ser.read_type_4("valid_nav_states_mask"));
      data.setCanSetNavStatesMask(ser.read_type_4("can_set_nav_states_mask"));
      data.setFailureDetectorStatus(ser.read_type_3("failure_detector_status"));
      data.setHilState(ser.read_type_9("hil_state"));
      data.setVehicleType(ser.read_type_9("vehicle_type"));
      data.setFailsafe(ser.read_type_7("failsafe"));
      data.setFailsafeAndUserTookOver(ser.read_type_7("failsafe_and_user_took_over"));
      data.setFailsafeDeferState(ser.read_type_9("failsafe_defer_state"));
      data.setGcsConnectionLost(ser.read_type_7("gcs_connection_lost"));
      data.setGcsConnectionLostCounter(ser.read_type_9("gcs_connection_lost_counter"));
      data.setHighLatencyDataLinkLost(ser.read_type_7("high_latency_data_link_lost"));
      data.setIsVtol(ser.read_type_7("is_vtol"));
      data.setIsVtolTailsitter(ser.read_type_7("is_vtol_tailsitter"));
      data.setInTransitionMode(ser.read_type_7("in_transition_mode"));
      data.setInTransitionToFw(ser.read_type_7("in_transition_to_fw"));
      data.setSystemType(ser.read_type_9("system_type"));
      data.setSystemId(ser.read_type_9("system_id"));
      data.setComponentId(ser.read_type_9("component_id"));
      data.setSafetyButtonAvailable(ser.read_type_7("safety_button_available"));
      data.setSafetyOff(ser.read_type_7("safety_off"));
      data.setPowerInputValid(ser.read_type_7("power_input_valid"));
      data.setUsbConnected(ser.read_type_7("usb_connected"));
      data.setOpenDroneIdSystemPresent(ser.read_type_7("open_drone_id_system_present"));
      data.setOpenDroneIdSystemHealthy(ser.read_type_7("open_drone_id_system_healthy"));
      data.setParachuteSystemPresent(ser.read_type_7("parachute_system_present"));
      data.setParachuteSystemHealthy(ser.read_type_7("parachute_system_healthy"));
      data.setAvoidanceSystemRequired(ser.read_type_7("avoidance_system_required"));
      data.setAvoidanceSystemValid(ser.read_type_7("avoidance_system_valid"));
      data.setRcCalibrationInProgress(ser.read_type_7("rc_calibration_in_progress"));
      data.setCalibrationEnabled(ser.read_type_7("calibration_enabled"));
      data.setPreFlightChecksPass(ser.read_type_7("pre_flight_checks_pass"));
   }

   public static void staticCopy(px4_msgs.msg.dds.VehicleStatus src, px4_msgs.msg.dds.VehicleStatus dest)
   {
      dest.set(src);
   }

   @Override
   public px4_msgs.msg.dds.VehicleStatus createData()
   {
      return new px4_msgs.msg.dds.VehicleStatus();
   }
   @Override
   public int getTypeSize()
   {
      return us.ihmc.idl.CDR.getTypeSize(getMaxCdrSerializedSize());
   }

   @Override
   public java.lang.String getName()
   {
      return name;
   }
   
   public void serialize(px4_msgs.msg.dds.VehicleStatus data, us.ihmc.idl.CDR cdr)
   {
      write(data, cdr);
   }

   public void deserialize(px4_msgs.msg.dds.VehicleStatus data, us.ihmc.idl.CDR cdr)
   {
      read(data, cdr);
   }
   
   public void copy(px4_msgs.msg.dds.VehicleStatus src, px4_msgs.msg.dds.VehicleStatus dest)
   {
      staticCopy(src, dest);
   }

   @Override
   public VehicleStatusPubSubType newInstance()
   {
      return new VehicleStatusPubSubType();
   }
}
