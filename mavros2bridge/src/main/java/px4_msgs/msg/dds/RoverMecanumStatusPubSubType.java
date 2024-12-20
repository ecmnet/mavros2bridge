package px4_msgs.msg.dds;

/**
* 
* Topic data type of the struct "RoverMecanumStatus" defined in "RoverMecanumStatus_.idl". Use this class to provide the TopicDataType to a Participant. 
*
* This file was automatically generated from RoverMecanumStatus_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit RoverMecanumStatus_.idl instead.
*
*/
public class RoverMecanumStatusPubSubType implements us.ihmc.pubsub.TopicDataType<px4_msgs.msg.dds.RoverMecanumStatus>
{
   public static final java.lang.String name = "px4_msgs::msg::dds_::RoverMecanumStatus_";
   
   @Override
   public final java.lang.String getDefinitionChecksum()
   {
   		return "4ab7ffc83244c6d6ae1e6aa0553530cec805764d1dcec27b3808a106a32a72c2";
   }
   
   @Override
   public final java.lang.String getDefinitionVersion()
   {
   		return "";
   }

   private final us.ihmc.idl.CDR serializeCDR = new us.ihmc.idl.CDR();
   private final us.ihmc.idl.CDR deserializeCDR = new us.ihmc.idl.CDR();

   @Override
   public void serialize(px4_msgs.msg.dds.RoverMecanumStatus data, us.ihmc.pubsub.common.SerializedPayload serializedPayload) throws java.io.IOException
   {
      serializeCDR.serialize(serializedPayload);
      write(data, serializeCDR);
      serializeCDR.finishSerialize();
   }

   @Override
   public void deserialize(us.ihmc.pubsub.common.SerializedPayload serializedPayload, px4_msgs.msg.dds.RoverMecanumStatus data) throws java.io.IOException
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


      return current_alignment - initial_alignment;
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.RoverMecanumStatus data)
   {
      return getCdrSerializedSize(data, 0);
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.RoverMecanumStatus data, int current_alignment)
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



      return current_alignment - initial_alignment;
   }

   public static void write(px4_msgs.msg.dds.RoverMecanumStatus data, us.ihmc.idl.CDR cdr)
   {
      cdr.write_type_12(data.getTimestamp());

      cdr.write_type_5(data.getMeasuredForwardSpeed());

      cdr.write_type_5(data.getAdjustedForwardSpeedSetpoint());

      cdr.write_type_5(data.getMeasuredLateralSpeed());

      cdr.write_type_5(data.getAdjustedLateralSpeedSetpoint());

      cdr.write_type_5(data.getMeasuredYawRate());

      cdr.write_type_5(data.getClyawYawRateSetpoint());

      cdr.write_type_5(data.getAdjustedYawRateSetpoint());

      cdr.write_type_5(data.getMeasuredYaw());

      cdr.write_type_5(data.getAdjustedYawSetpoint());

      cdr.write_type_5(data.getPidYawRateIntegral());

      cdr.write_type_5(data.getPidYawIntegral());

      cdr.write_type_5(data.getPidForwardThrottleIntegral());

      cdr.write_type_5(data.getPidLateralThrottleIntegral());

   }

   public static void read(px4_msgs.msg.dds.RoverMecanumStatus data, us.ihmc.idl.CDR cdr)
   {
      data.setTimestamp(cdr.read_type_12());
      	
      data.setMeasuredForwardSpeed(cdr.read_type_5());
      	
      data.setAdjustedForwardSpeedSetpoint(cdr.read_type_5());
      	
      data.setMeasuredLateralSpeed(cdr.read_type_5());
      	
      data.setAdjustedLateralSpeedSetpoint(cdr.read_type_5());
      	
      data.setMeasuredYawRate(cdr.read_type_5());
      	
      data.setClyawYawRateSetpoint(cdr.read_type_5());
      	
      data.setAdjustedYawRateSetpoint(cdr.read_type_5());
      	
      data.setMeasuredYaw(cdr.read_type_5());
      	
      data.setAdjustedYawSetpoint(cdr.read_type_5());
      	
      data.setPidYawRateIntegral(cdr.read_type_5());
      	
      data.setPidYawIntegral(cdr.read_type_5());
      	
      data.setPidForwardThrottleIntegral(cdr.read_type_5());
      	
      data.setPidLateralThrottleIntegral(cdr.read_type_5());
      	

   }

   @Override
   public final void serialize(px4_msgs.msg.dds.RoverMecanumStatus data, us.ihmc.idl.InterchangeSerializer ser)
   {
      ser.write_type_12("timestamp", data.getTimestamp());
      ser.write_type_5("measured_forward_speed", data.getMeasuredForwardSpeed());
      ser.write_type_5("adjusted_forward_speed_setpoint", data.getAdjustedForwardSpeedSetpoint());
      ser.write_type_5("measured_lateral_speed", data.getMeasuredLateralSpeed());
      ser.write_type_5("adjusted_lateral_speed_setpoint", data.getAdjustedLateralSpeedSetpoint());
      ser.write_type_5("measured_yaw_rate", data.getMeasuredYawRate());
      ser.write_type_5("clyaw_yaw_rate_setpoint", data.getClyawYawRateSetpoint());
      ser.write_type_5("adjusted_yaw_rate_setpoint", data.getAdjustedYawRateSetpoint());
      ser.write_type_5("measured_yaw", data.getMeasuredYaw());
      ser.write_type_5("adjusted_yaw_setpoint", data.getAdjustedYawSetpoint());
      ser.write_type_5("pid_yaw_rate_integral", data.getPidYawRateIntegral());
      ser.write_type_5("pid_yaw_integral", data.getPidYawIntegral());
      ser.write_type_5("pid_forward_throttle_integral", data.getPidForwardThrottleIntegral());
      ser.write_type_5("pid_lateral_throttle_integral", data.getPidLateralThrottleIntegral());
   }

   @Override
   public final void deserialize(us.ihmc.idl.InterchangeSerializer ser, px4_msgs.msg.dds.RoverMecanumStatus data)
   {
      data.setTimestamp(ser.read_type_12("timestamp"));
      data.setMeasuredForwardSpeed(ser.read_type_5("measured_forward_speed"));
      data.setAdjustedForwardSpeedSetpoint(ser.read_type_5("adjusted_forward_speed_setpoint"));
      data.setMeasuredLateralSpeed(ser.read_type_5("measured_lateral_speed"));
      data.setAdjustedLateralSpeedSetpoint(ser.read_type_5("adjusted_lateral_speed_setpoint"));
      data.setMeasuredYawRate(ser.read_type_5("measured_yaw_rate"));
      data.setClyawYawRateSetpoint(ser.read_type_5("clyaw_yaw_rate_setpoint"));
      data.setAdjustedYawRateSetpoint(ser.read_type_5("adjusted_yaw_rate_setpoint"));
      data.setMeasuredYaw(ser.read_type_5("measured_yaw"));
      data.setAdjustedYawSetpoint(ser.read_type_5("adjusted_yaw_setpoint"));
      data.setPidYawRateIntegral(ser.read_type_5("pid_yaw_rate_integral"));
      data.setPidYawIntegral(ser.read_type_5("pid_yaw_integral"));
      data.setPidForwardThrottleIntegral(ser.read_type_5("pid_forward_throttle_integral"));
      data.setPidLateralThrottleIntegral(ser.read_type_5("pid_lateral_throttle_integral"));
   }

   public static void staticCopy(px4_msgs.msg.dds.RoverMecanumStatus src, px4_msgs.msg.dds.RoverMecanumStatus dest)
   {
      dest.set(src);
   }

   @Override
   public px4_msgs.msg.dds.RoverMecanumStatus createData()
   {
      return new px4_msgs.msg.dds.RoverMecanumStatus();
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
   
   public void serialize(px4_msgs.msg.dds.RoverMecanumStatus data, us.ihmc.idl.CDR cdr)
   {
      write(data, cdr);
   }

   public void deserialize(px4_msgs.msg.dds.RoverMecanumStatus data, us.ihmc.idl.CDR cdr)
   {
      read(data, cdr);
   }
   
   public void copy(px4_msgs.msg.dds.RoverMecanumStatus src, px4_msgs.msg.dds.RoverMecanumStatus dest)
   {
      staticCopy(src, dest);
   }

   @Override
   public RoverMecanumStatusPubSubType newInstance()
   {
      return new RoverMecanumStatusPubSubType();
   }
}
