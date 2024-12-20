package px4_msgs.msg.dds;

/**
* 
* Topic data type of the struct "Px4ioStatus" defined in "Px4ioStatus_.idl". Use this class to provide the TopicDataType to a Participant. 
*
* This file was automatically generated from Px4ioStatus_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit Px4ioStatus_.idl instead.
*
*/
public class Px4ioStatusPubSubType implements us.ihmc.pubsub.TopicDataType<px4_msgs.msg.dds.Px4ioStatus>
{
   public static final java.lang.String name = "px4_msgs::msg::dds_::Px4ioStatus_";
   
   @Override
   public final java.lang.String getDefinitionChecksum()
   {
   		return "7b2db4d9fc69ad047dd4fb91b01ecf85d5e2e301ebfa044a709a5721203d770e";
   }
   
   @Override
   public final java.lang.String getDefinitionVersion()
   {
   		return "";
   }

   private final us.ihmc.idl.CDR serializeCDR = new us.ihmc.idl.CDR();
   private final us.ihmc.idl.CDR deserializeCDR = new us.ihmc.idl.CDR();

   @Override
   public void serialize(px4_msgs.msg.dds.Px4ioStatus data, us.ihmc.pubsub.common.SerializedPayload serializedPayload) throws java.io.IOException
   {
      serializeCDR.serialize(serializedPayload);
      write(data, serializeCDR);
      serializeCDR.finishSerialize();
   }

   @Override
   public void deserialize(us.ihmc.pubsub.common.SerializedPayload serializedPayload, px4_msgs.msg.dds.Px4ioStatus data) throws java.io.IOException
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

      current_alignment += 2 + us.ihmc.idl.CDR.alignment(current_alignment, 2);

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


      return current_alignment - initial_alignment;
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.Px4ioStatus data)
   {
      return getCdrSerializedSize(data, 0);
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.Px4ioStatus data, int current_alignment)
   {
      int initial_alignment = current_alignment;

      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += 2 + us.ihmc.idl.CDR.alignment(current_alignment, 2);


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



      return current_alignment - initial_alignment;
   }

   public static void write(px4_msgs.msg.dds.Px4ioStatus data, us.ihmc.idl.CDR cdr)
   {
      cdr.write_type_12(data.getTimestamp());

      cdr.write_type_3(data.getFreeMemoryBytes());

      cdr.write_type_5(data.getVoltageV());

      cdr.write_type_5(data.getRssiV());

      cdr.write_type_7(data.getStatusArmSync());

      cdr.write_type_7(data.getStatusFailsafe());

      cdr.write_type_7(data.getStatusFmuInitialized());

      cdr.write_type_7(data.getStatusFmuOk());

      cdr.write_type_7(data.getStatusInitOk());

      cdr.write_type_7(data.getStatusOutputsArmed());

      cdr.write_type_7(data.getStatusRawPwm());

      cdr.write_type_7(data.getStatusRcOk());

      cdr.write_type_7(data.getStatusRcDsm());

      cdr.write_type_7(data.getStatusRcPpm());

      cdr.write_type_7(data.getStatusRcSbus());

      cdr.write_type_7(data.getStatusRcSt24());

      cdr.write_type_7(data.getStatusRcSumd());

      cdr.write_type_7(data.getStatusSafetyButtonEvent());

      cdr.write_type_7(data.getAlarmPwmError());

      cdr.write_type_7(data.getAlarmRcLost());

      cdr.write_type_7(data.getArmingFailsafeCustom());

      cdr.write_type_7(data.getArmingFmuArmed());

      cdr.write_type_7(data.getArmingFmuPrearmed());

      cdr.write_type_7(data.getArmingForceFailsafe());

      cdr.write_type_7(data.getArmingIoArmOk());

      cdr.write_type_7(data.getArmingLockdown());

      cdr.write_type_7(data.getArmingTerminationFailsafe());

   }

   public static void read(px4_msgs.msg.dds.Px4ioStatus data, us.ihmc.idl.CDR cdr)
   {
      data.setTimestamp(cdr.read_type_12());
      	
      data.setFreeMemoryBytes(cdr.read_type_3());
      	
      data.setVoltageV(cdr.read_type_5());
      	
      data.setRssiV(cdr.read_type_5());
      	
      data.setStatusArmSync(cdr.read_type_7());
      	
      data.setStatusFailsafe(cdr.read_type_7());
      	
      data.setStatusFmuInitialized(cdr.read_type_7());
      	
      data.setStatusFmuOk(cdr.read_type_7());
      	
      data.setStatusInitOk(cdr.read_type_7());
      	
      data.setStatusOutputsArmed(cdr.read_type_7());
      	
      data.setStatusRawPwm(cdr.read_type_7());
      	
      data.setStatusRcOk(cdr.read_type_7());
      	
      data.setStatusRcDsm(cdr.read_type_7());
      	
      data.setStatusRcPpm(cdr.read_type_7());
      	
      data.setStatusRcSbus(cdr.read_type_7());
      	
      data.setStatusRcSt24(cdr.read_type_7());
      	
      data.setStatusRcSumd(cdr.read_type_7());
      	
      data.setStatusSafetyButtonEvent(cdr.read_type_7());
      	
      data.setAlarmPwmError(cdr.read_type_7());
      	
      data.setAlarmRcLost(cdr.read_type_7());
      	
      data.setArmingFailsafeCustom(cdr.read_type_7());
      	
      data.setArmingFmuArmed(cdr.read_type_7());
      	
      data.setArmingFmuPrearmed(cdr.read_type_7());
      	
      data.setArmingForceFailsafe(cdr.read_type_7());
      	
      data.setArmingIoArmOk(cdr.read_type_7());
      	
      data.setArmingLockdown(cdr.read_type_7());
      	
      data.setArmingTerminationFailsafe(cdr.read_type_7());
      	

   }

   @Override
   public final void serialize(px4_msgs.msg.dds.Px4ioStatus data, us.ihmc.idl.InterchangeSerializer ser)
   {
      ser.write_type_12("timestamp", data.getTimestamp());
      ser.write_type_3("free_memory_bytes", data.getFreeMemoryBytes());
      ser.write_type_5("voltage_v", data.getVoltageV());
      ser.write_type_5("rssi_v", data.getRssiV());
      ser.write_type_7("status_arm_sync", data.getStatusArmSync());
      ser.write_type_7("status_failsafe", data.getStatusFailsafe());
      ser.write_type_7("status_fmu_initialized", data.getStatusFmuInitialized());
      ser.write_type_7("status_fmu_ok", data.getStatusFmuOk());
      ser.write_type_7("status_init_ok", data.getStatusInitOk());
      ser.write_type_7("status_outputs_armed", data.getStatusOutputsArmed());
      ser.write_type_7("status_raw_pwm", data.getStatusRawPwm());
      ser.write_type_7("status_rc_ok", data.getStatusRcOk());
      ser.write_type_7("status_rc_dsm", data.getStatusRcDsm());
      ser.write_type_7("status_rc_ppm", data.getStatusRcPpm());
      ser.write_type_7("status_rc_sbus", data.getStatusRcSbus());
      ser.write_type_7("status_rc_st24", data.getStatusRcSt24());
      ser.write_type_7("status_rc_sumd", data.getStatusRcSumd());
      ser.write_type_7("status_safety_button_event", data.getStatusSafetyButtonEvent());
      ser.write_type_7("alarm_pwm_error", data.getAlarmPwmError());
      ser.write_type_7("alarm_rc_lost", data.getAlarmRcLost());
      ser.write_type_7("arming_failsafe_custom", data.getArmingFailsafeCustom());
      ser.write_type_7("arming_fmu_armed", data.getArmingFmuArmed());
      ser.write_type_7("arming_fmu_prearmed", data.getArmingFmuPrearmed());
      ser.write_type_7("arming_force_failsafe", data.getArmingForceFailsafe());
      ser.write_type_7("arming_io_arm_ok", data.getArmingIoArmOk());
      ser.write_type_7("arming_lockdown", data.getArmingLockdown());
      ser.write_type_7("arming_termination_failsafe", data.getArmingTerminationFailsafe());
   }

   @Override
   public final void deserialize(us.ihmc.idl.InterchangeSerializer ser, px4_msgs.msg.dds.Px4ioStatus data)
   {
      data.setTimestamp(ser.read_type_12("timestamp"));
      data.setFreeMemoryBytes(ser.read_type_3("free_memory_bytes"));
      data.setVoltageV(ser.read_type_5("voltage_v"));
      data.setRssiV(ser.read_type_5("rssi_v"));
      data.setStatusArmSync(ser.read_type_7("status_arm_sync"));
      data.setStatusFailsafe(ser.read_type_7("status_failsafe"));
      data.setStatusFmuInitialized(ser.read_type_7("status_fmu_initialized"));
      data.setStatusFmuOk(ser.read_type_7("status_fmu_ok"));
      data.setStatusInitOk(ser.read_type_7("status_init_ok"));
      data.setStatusOutputsArmed(ser.read_type_7("status_outputs_armed"));
      data.setStatusRawPwm(ser.read_type_7("status_raw_pwm"));
      data.setStatusRcOk(ser.read_type_7("status_rc_ok"));
      data.setStatusRcDsm(ser.read_type_7("status_rc_dsm"));
      data.setStatusRcPpm(ser.read_type_7("status_rc_ppm"));
      data.setStatusRcSbus(ser.read_type_7("status_rc_sbus"));
      data.setStatusRcSt24(ser.read_type_7("status_rc_st24"));
      data.setStatusRcSumd(ser.read_type_7("status_rc_sumd"));
      data.setStatusSafetyButtonEvent(ser.read_type_7("status_safety_button_event"));
      data.setAlarmPwmError(ser.read_type_7("alarm_pwm_error"));
      data.setAlarmRcLost(ser.read_type_7("alarm_rc_lost"));
      data.setArmingFailsafeCustom(ser.read_type_7("arming_failsafe_custom"));
      data.setArmingFmuArmed(ser.read_type_7("arming_fmu_armed"));
      data.setArmingFmuPrearmed(ser.read_type_7("arming_fmu_prearmed"));
      data.setArmingForceFailsafe(ser.read_type_7("arming_force_failsafe"));
      data.setArmingIoArmOk(ser.read_type_7("arming_io_arm_ok"));
      data.setArmingLockdown(ser.read_type_7("arming_lockdown"));
      data.setArmingTerminationFailsafe(ser.read_type_7("arming_termination_failsafe"));
   }

   public static void staticCopy(px4_msgs.msg.dds.Px4ioStatus src, px4_msgs.msg.dds.Px4ioStatus dest)
   {
      dest.set(src);
   }

   @Override
   public px4_msgs.msg.dds.Px4ioStatus createData()
   {
      return new px4_msgs.msg.dds.Px4ioStatus();
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
   
   public void serialize(px4_msgs.msg.dds.Px4ioStatus data, us.ihmc.idl.CDR cdr)
   {
      write(data, cdr);
   }

   public void deserialize(px4_msgs.msg.dds.Px4ioStatus data, us.ihmc.idl.CDR cdr)
   {
      read(data, cdr);
   }
   
   public void copy(px4_msgs.msg.dds.Px4ioStatus src, px4_msgs.msg.dds.Px4ioStatus dest)
   {
      staticCopy(src, dest);
   }

   @Override
   public Px4ioStatusPubSubType newInstance()
   {
      return new Px4ioStatusPubSubType();
   }
}
