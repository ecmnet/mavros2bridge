package px4_msgs.msg.dds;

/**
* 
* Topic data type of the struct "RoverAckermannStatus" defined in "RoverAckermannStatus_.idl". Use this class to provide the TopicDataType to a Participant. 
*
* This file was automatically generated from RoverAckermannStatus_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit RoverAckermannStatus_.idl instead.
*
*/
public class RoverAckermannStatusPubSubType implements us.ihmc.pubsub.TopicDataType<px4_msgs.msg.dds.RoverAckermannStatus>
{
   public static final java.lang.String name = "px4_msgs::msg::dds_::RoverAckermannStatus_";
   
   @Override
   public final java.lang.String getDefinitionChecksum()
   {
   		return "6ee133a5fb3745ee03529fc4294234ecaf619f643f9b8f29a1a2d9079fe9114b";
   }
   
   @Override
   public final java.lang.String getDefinitionVersion()
   {
   		return "";
   }

   private final us.ihmc.idl.CDR serializeCDR = new us.ihmc.idl.CDR();
   private final us.ihmc.idl.CDR deserializeCDR = new us.ihmc.idl.CDR();

   @Override
   public void serialize(px4_msgs.msg.dds.RoverAckermannStatus data, us.ihmc.pubsub.common.SerializedPayload serializedPayload) throws java.io.IOException
   {
      serializeCDR.serialize(serializedPayload);
      write(data, serializeCDR);
      serializeCDR.finishSerialize();
   }

   @Override
   public void deserialize(us.ihmc.pubsub.common.SerializedPayload serializedPayload, px4_msgs.msg.dds.RoverAckermannStatus data) throws java.io.IOException
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


      return current_alignment - initial_alignment;
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.RoverAckermannStatus data)
   {
      return getCdrSerializedSize(data, 0);
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.RoverAckermannStatus data, int current_alignment)
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



      return current_alignment - initial_alignment;
   }

   public static void write(px4_msgs.msg.dds.RoverAckermannStatus data, us.ihmc.idl.CDR cdr)
   {
      cdr.write_type_12(data.getTimestamp());

      cdr.write_type_5(data.getMeasuredForwardSpeed());

      cdr.write_type_5(data.getAdjustedForwardSpeedSetpoint());

      cdr.write_type_5(data.getSteeringSetpointNormalized());

      cdr.write_type_5(data.getAdjustedSteeringSetpointNormalized());

      cdr.write_type_5(data.getMeasuredLateralAcceleration());

      cdr.write_type_5(data.getPidThrottleIntegral());

      cdr.write_type_5(data.getPidLatAccelIntegral());

   }

   public static void read(px4_msgs.msg.dds.RoverAckermannStatus data, us.ihmc.idl.CDR cdr)
   {
      data.setTimestamp(cdr.read_type_12());
      	
      data.setMeasuredForwardSpeed(cdr.read_type_5());
      	
      data.setAdjustedForwardSpeedSetpoint(cdr.read_type_5());
      	
      data.setSteeringSetpointNormalized(cdr.read_type_5());
      	
      data.setAdjustedSteeringSetpointNormalized(cdr.read_type_5());
      	
      data.setMeasuredLateralAcceleration(cdr.read_type_5());
      	
      data.setPidThrottleIntegral(cdr.read_type_5());
      	
      data.setPidLatAccelIntegral(cdr.read_type_5());
      	

   }

   @Override
   public final void serialize(px4_msgs.msg.dds.RoverAckermannStatus data, us.ihmc.idl.InterchangeSerializer ser)
   {
      ser.write_type_12("timestamp", data.getTimestamp());
      ser.write_type_5("measured_forward_speed", data.getMeasuredForwardSpeed());
      ser.write_type_5("adjusted_forward_speed_setpoint", data.getAdjustedForwardSpeedSetpoint());
      ser.write_type_5("steering_setpoint_normalized", data.getSteeringSetpointNormalized());
      ser.write_type_5("adjusted_steering_setpoint_normalized", data.getAdjustedSteeringSetpointNormalized());
      ser.write_type_5("measured_lateral_acceleration", data.getMeasuredLateralAcceleration());
      ser.write_type_5("pid_throttle_integral", data.getPidThrottleIntegral());
      ser.write_type_5("pid_lat_accel_integral", data.getPidLatAccelIntegral());
   }

   @Override
   public final void deserialize(us.ihmc.idl.InterchangeSerializer ser, px4_msgs.msg.dds.RoverAckermannStatus data)
   {
      data.setTimestamp(ser.read_type_12("timestamp"));
      data.setMeasuredForwardSpeed(ser.read_type_5("measured_forward_speed"));
      data.setAdjustedForwardSpeedSetpoint(ser.read_type_5("adjusted_forward_speed_setpoint"));
      data.setSteeringSetpointNormalized(ser.read_type_5("steering_setpoint_normalized"));
      data.setAdjustedSteeringSetpointNormalized(ser.read_type_5("adjusted_steering_setpoint_normalized"));
      data.setMeasuredLateralAcceleration(ser.read_type_5("measured_lateral_acceleration"));
      data.setPidThrottleIntegral(ser.read_type_5("pid_throttle_integral"));
      data.setPidLatAccelIntegral(ser.read_type_5("pid_lat_accel_integral"));
   }

   public static void staticCopy(px4_msgs.msg.dds.RoverAckermannStatus src, px4_msgs.msg.dds.RoverAckermannStatus dest)
   {
      dest.set(src);
   }

   @Override
   public px4_msgs.msg.dds.RoverAckermannStatus createData()
   {
      return new px4_msgs.msg.dds.RoverAckermannStatus();
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
   
   public void serialize(px4_msgs.msg.dds.RoverAckermannStatus data, us.ihmc.idl.CDR cdr)
   {
      write(data, cdr);
   }

   public void deserialize(px4_msgs.msg.dds.RoverAckermannStatus data, us.ihmc.idl.CDR cdr)
   {
      read(data, cdr);
   }
   
   public void copy(px4_msgs.msg.dds.RoverAckermannStatus src, px4_msgs.msg.dds.RoverAckermannStatus dest)
   {
      staticCopy(src, dest);
   }

   @Override
   public RoverAckermannStatusPubSubType newInstance()
   {
      return new RoverAckermannStatusPubSubType();
   }
}
