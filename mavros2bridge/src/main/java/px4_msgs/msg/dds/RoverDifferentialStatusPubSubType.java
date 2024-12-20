package px4_msgs.msg.dds;

/**
* 
* Topic data type of the struct "RoverDifferentialStatus" defined in "RoverDifferentialStatus_.idl". Use this class to provide the TopicDataType to a Participant. 
*
* This file was automatically generated from RoverDifferentialStatus_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit RoverDifferentialStatus_.idl instead.
*
*/
public class RoverDifferentialStatusPubSubType implements us.ihmc.pubsub.TopicDataType<px4_msgs.msg.dds.RoverDifferentialStatus>
{
   public static final java.lang.String name = "px4_msgs::msg::dds_::RoverDifferentialStatus_";
   
   @Override
   public final java.lang.String getDefinitionChecksum()
   {
   		return "0b67d118e6438a5a93f048363781b140ecc61ebe381c6dde735c3e69f1f74622";
   }
   
   @Override
   public final java.lang.String getDefinitionVersion()
   {
   		return "";
   }

   private final us.ihmc.idl.CDR serializeCDR = new us.ihmc.idl.CDR();
   private final us.ihmc.idl.CDR deserializeCDR = new us.ihmc.idl.CDR();

   @Override
   public void serialize(px4_msgs.msg.dds.RoverDifferentialStatus data, us.ihmc.pubsub.common.SerializedPayload serializedPayload) throws java.io.IOException
   {
      serializeCDR.serialize(serializedPayload);
      write(data, serializeCDR);
      serializeCDR.finishSerialize();
   }

   @Override
   public void deserialize(us.ihmc.pubsub.common.SerializedPayload serializedPayload, px4_msgs.msg.dds.RoverDifferentialStatus data) throws java.io.IOException
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


      return current_alignment - initial_alignment;
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.RoverDifferentialStatus data)
   {
      return getCdrSerializedSize(data, 0);
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.RoverDifferentialStatus data, int current_alignment)
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



      return current_alignment - initial_alignment;
   }

   public static void write(px4_msgs.msg.dds.RoverDifferentialStatus data, us.ihmc.idl.CDR cdr)
   {
      cdr.write_type_12(data.getTimestamp());

      cdr.write_type_5(data.getMeasuredForwardSpeed());

      cdr.write_type_5(data.getAdjustedForwardSpeedSetpoint());

      cdr.write_type_5(data.getMeasuredYaw());

      cdr.write_type_5(data.getAdjustedYawSetpoint());

      cdr.write_type_5(data.getClyawYawRateSetpoint());

      cdr.write_type_5(data.getMeasuredYawRate());

      cdr.write_type_5(data.getAdjustedYawRateSetpoint());

      cdr.write_type_5(data.getPidYawIntegral());

      cdr.write_type_5(data.getPidYawRateIntegral());

      cdr.write_type_5(data.getPidThrottleIntegral());

   }

   public static void read(px4_msgs.msg.dds.RoverDifferentialStatus data, us.ihmc.idl.CDR cdr)
   {
      data.setTimestamp(cdr.read_type_12());
      	
      data.setMeasuredForwardSpeed(cdr.read_type_5());
      	
      data.setAdjustedForwardSpeedSetpoint(cdr.read_type_5());
      	
      data.setMeasuredYaw(cdr.read_type_5());
      	
      data.setAdjustedYawSetpoint(cdr.read_type_5());
      	
      data.setClyawYawRateSetpoint(cdr.read_type_5());
      	
      data.setMeasuredYawRate(cdr.read_type_5());
      	
      data.setAdjustedYawRateSetpoint(cdr.read_type_5());
      	
      data.setPidYawIntegral(cdr.read_type_5());
      	
      data.setPidYawRateIntegral(cdr.read_type_5());
      	
      data.setPidThrottleIntegral(cdr.read_type_5());
      	

   }

   @Override
   public final void serialize(px4_msgs.msg.dds.RoverDifferentialStatus data, us.ihmc.idl.InterchangeSerializer ser)
   {
      ser.write_type_12("timestamp", data.getTimestamp());
      ser.write_type_5("measured_forward_speed", data.getMeasuredForwardSpeed());
      ser.write_type_5("adjusted_forward_speed_setpoint", data.getAdjustedForwardSpeedSetpoint());
      ser.write_type_5("measured_yaw", data.getMeasuredYaw());
      ser.write_type_5("adjusted_yaw_setpoint", data.getAdjustedYawSetpoint());
      ser.write_type_5("clyaw_yaw_rate_setpoint", data.getClyawYawRateSetpoint());
      ser.write_type_5("measured_yaw_rate", data.getMeasuredYawRate());
      ser.write_type_5("adjusted_yaw_rate_setpoint", data.getAdjustedYawRateSetpoint());
      ser.write_type_5("pid_yaw_integral", data.getPidYawIntegral());
      ser.write_type_5("pid_yaw_rate_integral", data.getPidYawRateIntegral());
      ser.write_type_5("pid_throttle_integral", data.getPidThrottleIntegral());
   }

   @Override
   public final void deserialize(us.ihmc.idl.InterchangeSerializer ser, px4_msgs.msg.dds.RoverDifferentialStatus data)
   {
      data.setTimestamp(ser.read_type_12("timestamp"));
      data.setMeasuredForwardSpeed(ser.read_type_5("measured_forward_speed"));
      data.setAdjustedForwardSpeedSetpoint(ser.read_type_5("adjusted_forward_speed_setpoint"));
      data.setMeasuredYaw(ser.read_type_5("measured_yaw"));
      data.setAdjustedYawSetpoint(ser.read_type_5("adjusted_yaw_setpoint"));
      data.setClyawYawRateSetpoint(ser.read_type_5("clyaw_yaw_rate_setpoint"));
      data.setMeasuredYawRate(ser.read_type_5("measured_yaw_rate"));
      data.setAdjustedYawRateSetpoint(ser.read_type_5("adjusted_yaw_rate_setpoint"));
      data.setPidYawIntegral(ser.read_type_5("pid_yaw_integral"));
      data.setPidYawRateIntegral(ser.read_type_5("pid_yaw_rate_integral"));
      data.setPidThrottleIntegral(ser.read_type_5("pid_throttle_integral"));
   }

   public static void staticCopy(px4_msgs.msg.dds.RoverDifferentialStatus src, px4_msgs.msg.dds.RoverDifferentialStatus dest)
   {
      dest.set(src);
   }

   @Override
   public px4_msgs.msg.dds.RoverDifferentialStatus createData()
   {
      return new px4_msgs.msg.dds.RoverDifferentialStatus();
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
   
   public void serialize(px4_msgs.msg.dds.RoverDifferentialStatus data, us.ihmc.idl.CDR cdr)
   {
      write(data, cdr);
   }

   public void deserialize(px4_msgs.msg.dds.RoverDifferentialStatus data, us.ihmc.idl.CDR cdr)
   {
      read(data, cdr);
   }
   
   public void copy(px4_msgs.msg.dds.RoverDifferentialStatus src, px4_msgs.msg.dds.RoverDifferentialStatus dest)
   {
      staticCopy(src, dest);
   }

   @Override
   public RoverDifferentialStatusPubSubType newInstance()
   {
      return new RoverDifferentialStatusPubSubType();
   }
}
