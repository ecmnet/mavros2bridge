package px4_msgs.msg.dds;

/**
* 
* Topic data type of the struct "FailsafeFlags" defined in "FailsafeFlags_.idl". Use this class to provide the TopicDataType to a Participant. 
*
* This file was automatically generated from FailsafeFlags_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit FailsafeFlags_.idl instead.
*
*/
public class FailsafeFlagsPubSubType implements us.ihmc.pubsub.TopicDataType<px4_msgs.msg.dds.FailsafeFlags>
{
   public static final java.lang.String name = "px4_msgs::msg::dds_::FailsafeFlags_";
   
   @Override
   public final java.lang.String getDefinitionChecksum()
   {
   		return "f8626f745e291ad2385afc3838e0ae803d0fb80d8fc5f23f093fe05ae7b86dfa";
   }
   
   @Override
   public final java.lang.String getDefinitionVersion()
   {
   		return "";
   }

   private final us.ihmc.idl.CDR serializeCDR = new us.ihmc.idl.CDR();
   private final us.ihmc.idl.CDR deserializeCDR = new us.ihmc.idl.CDR();

   @Override
   public void serialize(px4_msgs.msg.dds.FailsafeFlags data, us.ihmc.pubsub.common.SerializedPayload serializedPayload) throws java.io.IOException
   {
      serializeCDR.serialize(serializedPayload);
      write(data, serializeCDR);
      serializeCDR.finishSerialize();
   }

   @Override
   public void deserialize(us.ihmc.pubsub.common.SerializedPayload serializedPayload, px4_msgs.msg.dds.FailsafeFlags data) throws java.io.IOException
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

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

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

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.FailsafeFlags data)
   {
      return getCdrSerializedSize(data, 0);
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.FailsafeFlags data, int current_alignment)
   {
      int initial_alignment = current_alignment;

      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


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

   public static void write(px4_msgs.msg.dds.FailsafeFlags data, us.ihmc.idl.CDR cdr)
   {
      cdr.write_type_12(data.getTimestamp());

      cdr.write_type_4(data.getModeReqAngularVelocity());

      cdr.write_type_4(data.getModeReqAttitude());

      cdr.write_type_4(data.getModeReqLocalAlt());

      cdr.write_type_4(data.getModeReqLocalPosition());

      cdr.write_type_4(data.getModeReqLocalPositionRelaxed());

      cdr.write_type_4(data.getModeReqGlobalPosition());

      cdr.write_type_4(data.getModeReqMission());

      cdr.write_type_4(data.getModeReqOffboardSignal());

      cdr.write_type_4(data.getModeReqHomePosition());

      cdr.write_type_4(data.getModeReqWindAndFlightTimeCompliance());

      cdr.write_type_4(data.getModeReqPreventArming());

      cdr.write_type_4(data.getModeReqManualControl());

      cdr.write_type_4(data.getModeReqOther());

      cdr.write_type_7(data.getAngularVelocityInvalid());

      cdr.write_type_7(data.getAttitudeInvalid());

      cdr.write_type_7(data.getLocalAltitudeInvalid());

      cdr.write_type_7(data.getLocalPositionInvalid());

      cdr.write_type_7(data.getLocalPositionInvalidRelaxed());

      cdr.write_type_7(data.getLocalVelocityInvalid());

      cdr.write_type_7(data.getGlobalPositionInvalid());

      cdr.write_type_7(data.getAutoMissionMissing());

      cdr.write_type_7(data.getOffboardControlSignalLost());

      cdr.write_type_7(data.getHomePositionInvalid());

      cdr.write_type_7(data.getManualControlSignalLost());

      cdr.write_type_7(data.getGcsConnectionLost());

      cdr.write_type_9(data.getBatteryWarning());

      cdr.write_type_7(data.getBatteryLowRemainingTime());

      cdr.write_type_7(data.getBatteryUnhealthy());

      cdr.write_type_7(data.getGeofenceBreached());

      cdr.write_type_7(data.getMissionFailure());

      cdr.write_type_7(data.getVtolFixedWingSystemFailure());

      cdr.write_type_7(data.getWindLimitExceeded());

      cdr.write_type_7(data.getFlightTimeLimitExceeded());

      cdr.write_type_7(data.getLocalPositionAccuracyLow());

      cdr.write_type_7(data.getNavigatorFailure());

      cdr.write_type_7(data.getFdCriticalFailure());

      cdr.write_type_7(data.getFdEscArmingFailure());

      cdr.write_type_7(data.getFdImbalancedProp());

      cdr.write_type_7(data.getFdMotorFailure());

   }

   public static void read(px4_msgs.msg.dds.FailsafeFlags data, us.ihmc.idl.CDR cdr)
   {
      data.setTimestamp(cdr.read_type_12());
      	
      data.setModeReqAngularVelocity(cdr.read_type_4());
      	
      data.setModeReqAttitude(cdr.read_type_4());
      	
      data.setModeReqLocalAlt(cdr.read_type_4());
      	
      data.setModeReqLocalPosition(cdr.read_type_4());
      	
      data.setModeReqLocalPositionRelaxed(cdr.read_type_4());
      	
      data.setModeReqGlobalPosition(cdr.read_type_4());
      	
      data.setModeReqMission(cdr.read_type_4());
      	
      data.setModeReqOffboardSignal(cdr.read_type_4());
      	
      data.setModeReqHomePosition(cdr.read_type_4());
      	
      data.setModeReqWindAndFlightTimeCompliance(cdr.read_type_4());
      	
      data.setModeReqPreventArming(cdr.read_type_4());
      	
      data.setModeReqManualControl(cdr.read_type_4());
      	
      data.setModeReqOther(cdr.read_type_4());
      	
      data.setAngularVelocityInvalid(cdr.read_type_7());
      	
      data.setAttitudeInvalid(cdr.read_type_7());
      	
      data.setLocalAltitudeInvalid(cdr.read_type_7());
      	
      data.setLocalPositionInvalid(cdr.read_type_7());
      	
      data.setLocalPositionInvalidRelaxed(cdr.read_type_7());
      	
      data.setLocalVelocityInvalid(cdr.read_type_7());
      	
      data.setGlobalPositionInvalid(cdr.read_type_7());
      	
      data.setAutoMissionMissing(cdr.read_type_7());
      	
      data.setOffboardControlSignalLost(cdr.read_type_7());
      	
      data.setHomePositionInvalid(cdr.read_type_7());
      	
      data.setManualControlSignalLost(cdr.read_type_7());
      	
      data.setGcsConnectionLost(cdr.read_type_7());
      	
      data.setBatteryWarning(cdr.read_type_9());
      	
      data.setBatteryLowRemainingTime(cdr.read_type_7());
      	
      data.setBatteryUnhealthy(cdr.read_type_7());
      	
      data.setGeofenceBreached(cdr.read_type_7());
      	
      data.setMissionFailure(cdr.read_type_7());
      	
      data.setVtolFixedWingSystemFailure(cdr.read_type_7());
      	
      data.setWindLimitExceeded(cdr.read_type_7());
      	
      data.setFlightTimeLimitExceeded(cdr.read_type_7());
      	
      data.setLocalPositionAccuracyLow(cdr.read_type_7());
      	
      data.setNavigatorFailure(cdr.read_type_7());
      	
      data.setFdCriticalFailure(cdr.read_type_7());
      	
      data.setFdEscArmingFailure(cdr.read_type_7());
      	
      data.setFdImbalancedProp(cdr.read_type_7());
      	
      data.setFdMotorFailure(cdr.read_type_7());
      	

   }

   @Override
   public final void serialize(px4_msgs.msg.dds.FailsafeFlags data, us.ihmc.idl.InterchangeSerializer ser)
   {
      ser.write_type_12("timestamp", data.getTimestamp());
      ser.write_type_4("mode_req_angular_velocity", data.getModeReqAngularVelocity());
      ser.write_type_4("mode_req_attitude", data.getModeReqAttitude());
      ser.write_type_4("mode_req_local_alt", data.getModeReqLocalAlt());
      ser.write_type_4("mode_req_local_position", data.getModeReqLocalPosition());
      ser.write_type_4("mode_req_local_position_relaxed", data.getModeReqLocalPositionRelaxed());
      ser.write_type_4("mode_req_global_position", data.getModeReqGlobalPosition());
      ser.write_type_4("mode_req_mission", data.getModeReqMission());
      ser.write_type_4("mode_req_offboard_signal", data.getModeReqOffboardSignal());
      ser.write_type_4("mode_req_home_position", data.getModeReqHomePosition());
      ser.write_type_4("mode_req_wind_and_flight_time_compliance", data.getModeReqWindAndFlightTimeCompliance());
      ser.write_type_4("mode_req_prevent_arming", data.getModeReqPreventArming());
      ser.write_type_4("mode_req_manual_control", data.getModeReqManualControl());
      ser.write_type_4("mode_req_other", data.getModeReqOther());
      ser.write_type_7("angular_velocity_invalid", data.getAngularVelocityInvalid());
      ser.write_type_7("attitude_invalid", data.getAttitudeInvalid());
      ser.write_type_7("local_altitude_invalid", data.getLocalAltitudeInvalid());
      ser.write_type_7("local_position_invalid", data.getLocalPositionInvalid());
      ser.write_type_7("local_position_invalid_relaxed", data.getLocalPositionInvalidRelaxed());
      ser.write_type_7("local_velocity_invalid", data.getLocalVelocityInvalid());
      ser.write_type_7("global_position_invalid", data.getGlobalPositionInvalid());
      ser.write_type_7("auto_mission_missing", data.getAutoMissionMissing());
      ser.write_type_7("offboard_control_signal_lost", data.getOffboardControlSignalLost());
      ser.write_type_7("home_position_invalid", data.getHomePositionInvalid());
      ser.write_type_7("manual_control_signal_lost", data.getManualControlSignalLost());
      ser.write_type_7("gcs_connection_lost", data.getGcsConnectionLost());
      ser.write_type_9("battery_warning", data.getBatteryWarning());
      ser.write_type_7("battery_low_remaining_time", data.getBatteryLowRemainingTime());
      ser.write_type_7("battery_unhealthy", data.getBatteryUnhealthy());
      ser.write_type_7("geofence_breached", data.getGeofenceBreached());
      ser.write_type_7("mission_failure", data.getMissionFailure());
      ser.write_type_7("vtol_fixed_wing_system_failure", data.getVtolFixedWingSystemFailure());
      ser.write_type_7("wind_limit_exceeded", data.getWindLimitExceeded());
      ser.write_type_7("flight_time_limit_exceeded", data.getFlightTimeLimitExceeded());
      ser.write_type_7("local_position_accuracy_low", data.getLocalPositionAccuracyLow());
      ser.write_type_7("navigator_failure", data.getNavigatorFailure());
      ser.write_type_7("fd_critical_failure", data.getFdCriticalFailure());
      ser.write_type_7("fd_esc_arming_failure", data.getFdEscArmingFailure());
      ser.write_type_7("fd_imbalanced_prop", data.getFdImbalancedProp());
      ser.write_type_7("fd_motor_failure", data.getFdMotorFailure());
   }

   @Override
   public final void deserialize(us.ihmc.idl.InterchangeSerializer ser, px4_msgs.msg.dds.FailsafeFlags data)
   {
      data.setTimestamp(ser.read_type_12("timestamp"));
      data.setModeReqAngularVelocity(ser.read_type_4("mode_req_angular_velocity"));
      data.setModeReqAttitude(ser.read_type_4("mode_req_attitude"));
      data.setModeReqLocalAlt(ser.read_type_4("mode_req_local_alt"));
      data.setModeReqLocalPosition(ser.read_type_4("mode_req_local_position"));
      data.setModeReqLocalPositionRelaxed(ser.read_type_4("mode_req_local_position_relaxed"));
      data.setModeReqGlobalPosition(ser.read_type_4("mode_req_global_position"));
      data.setModeReqMission(ser.read_type_4("mode_req_mission"));
      data.setModeReqOffboardSignal(ser.read_type_4("mode_req_offboard_signal"));
      data.setModeReqHomePosition(ser.read_type_4("mode_req_home_position"));
      data.setModeReqWindAndFlightTimeCompliance(ser.read_type_4("mode_req_wind_and_flight_time_compliance"));
      data.setModeReqPreventArming(ser.read_type_4("mode_req_prevent_arming"));
      data.setModeReqManualControl(ser.read_type_4("mode_req_manual_control"));
      data.setModeReqOther(ser.read_type_4("mode_req_other"));
      data.setAngularVelocityInvalid(ser.read_type_7("angular_velocity_invalid"));
      data.setAttitudeInvalid(ser.read_type_7("attitude_invalid"));
      data.setLocalAltitudeInvalid(ser.read_type_7("local_altitude_invalid"));
      data.setLocalPositionInvalid(ser.read_type_7("local_position_invalid"));
      data.setLocalPositionInvalidRelaxed(ser.read_type_7("local_position_invalid_relaxed"));
      data.setLocalVelocityInvalid(ser.read_type_7("local_velocity_invalid"));
      data.setGlobalPositionInvalid(ser.read_type_7("global_position_invalid"));
      data.setAutoMissionMissing(ser.read_type_7("auto_mission_missing"));
      data.setOffboardControlSignalLost(ser.read_type_7("offboard_control_signal_lost"));
      data.setHomePositionInvalid(ser.read_type_7("home_position_invalid"));
      data.setManualControlSignalLost(ser.read_type_7("manual_control_signal_lost"));
      data.setGcsConnectionLost(ser.read_type_7("gcs_connection_lost"));
      data.setBatteryWarning(ser.read_type_9("battery_warning"));
      data.setBatteryLowRemainingTime(ser.read_type_7("battery_low_remaining_time"));
      data.setBatteryUnhealthy(ser.read_type_7("battery_unhealthy"));
      data.setGeofenceBreached(ser.read_type_7("geofence_breached"));
      data.setMissionFailure(ser.read_type_7("mission_failure"));
      data.setVtolFixedWingSystemFailure(ser.read_type_7("vtol_fixed_wing_system_failure"));
      data.setWindLimitExceeded(ser.read_type_7("wind_limit_exceeded"));
      data.setFlightTimeLimitExceeded(ser.read_type_7("flight_time_limit_exceeded"));
      data.setLocalPositionAccuracyLow(ser.read_type_7("local_position_accuracy_low"));
      data.setNavigatorFailure(ser.read_type_7("navigator_failure"));
      data.setFdCriticalFailure(ser.read_type_7("fd_critical_failure"));
      data.setFdEscArmingFailure(ser.read_type_7("fd_esc_arming_failure"));
      data.setFdImbalancedProp(ser.read_type_7("fd_imbalanced_prop"));
      data.setFdMotorFailure(ser.read_type_7("fd_motor_failure"));
   }

   public static void staticCopy(px4_msgs.msg.dds.FailsafeFlags src, px4_msgs.msg.dds.FailsafeFlags dest)
   {
      dest.set(src);
   }

   @Override
   public px4_msgs.msg.dds.FailsafeFlags createData()
   {
      return new px4_msgs.msg.dds.FailsafeFlags();
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
   
   public void serialize(px4_msgs.msg.dds.FailsafeFlags data, us.ihmc.idl.CDR cdr)
   {
      write(data, cdr);
   }

   public void deserialize(px4_msgs.msg.dds.FailsafeFlags data, us.ihmc.idl.CDR cdr)
   {
      read(data, cdr);
   }
   
   public void copy(px4_msgs.msg.dds.FailsafeFlags src, px4_msgs.msg.dds.FailsafeFlags dest)
   {
      staticCopy(src, dest);
   }

   @Override
   public FailsafeFlagsPubSubType newInstance()
   {
      return new FailsafeFlagsPubSubType();
   }
}
