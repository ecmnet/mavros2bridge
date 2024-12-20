package px4_msgs.msg.dds;

/**
* 
* Topic data type of the struct "RoverAckermannSetpoint" defined in "RoverAckermannSetpoint_.idl". Use this class to provide the TopicDataType to a Participant. 
*
* This file was automatically generated from RoverAckermannSetpoint_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit RoverAckermannSetpoint_.idl instead.
*
*/
public class RoverAckermannSetpointPubSubType implements us.ihmc.pubsub.TopicDataType<px4_msgs.msg.dds.RoverAckermannSetpoint>
{
   public static final java.lang.String name = "px4_msgs::msg::dds_::RoverAckermannSetpoint_";
   
   @Override
   public final java.lang.String getDefinitionChecksum()
   {
   		return "0de19c840ffe564b1380c70026a15232a57d33e53bfe95c1e5d322e1c34746c6";
   }
   
   @Override
   public final java.lang.String getDefinitionVersion()
   {
   		return "";
   }

   private final us.ihmc.idl.CDR serializeCDR = new us.ihmc.idl.CDR();
   private final us.ihmc.idl.CDR deserializeCDR = new us.ihmc.idl.CDR();

   @Override
   public void serialize(px4_msgs.msg.dds.RoverAckermannSetpoint data, us.ihmc.pubsub.common.SerializedPayload serializedPayload) throws java.io.IOException
   {
      serializeCDR.serialize(serializedPayload);
      write(data, serializeCDR);
      serializeCDR.finishSerialize();
   }

   @Override
   public void deserialize(us.ihmc.pubsub.common.SerializedPayload serializedPayload, px4_msgs.msg.dds.RoverAckermannSetpoint data) throws java.io.IOException
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


      return current_alignment - initial_alignment;
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.RoverAckermannSetpoint data)
   {
      return getCdrSerializedSize(data, 0);
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.RoverAckermannSetpoint data, int current_alignment)
   {
      int initial_alignment = current_alignment;

      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);



      return current_alignment - initial_alignment;
   }

   public static void write(px4_msgs.msg.dds.RoverAckermannSetpoint data, us.ihmc.idl.CDR cdr)
   {
      cdr.write_type_12(data.getTimestamp());

      cdr.write_type_5(data.getForwardSpeedSetpoint());

      cdr.write_type_5(data.getForwardSpeedSetpointNormalized());

      cdr.write_type_5(data.getSteeringSetpoint());

      cdr.write_type_5(data.getSteeringSetpointNormalized());

      cdr.write_type_5(data.getLateralAccelerationSetpoint());

   }

   public static void read(px4_msgs.msg.dds.RoverAckermannSetpoint data, us.ihmc.idl.CDR cdr)
   {
      data.setTimestamp(cdr.read_type_12());
      	
      data.setForwardSpeedSetpoint(cdr.read_type_5());
      	
      data.setForwardSpeedSetpointNormalized(cdr.read_type_5());
      	
      data.setSteeringSetpoint(cdr.read_type_5());
      	
      data.setSteeringSetpointNormalized(cdr.read_type_5());
      	
      data.setLateralAccelerationSetpoint(cdr.read_type_5());
      	

   }

   @Override
   public final void serialize(px4_msgs.msg.dds.RoverAckermannSetpoint data, us.ihmc.idl.InterchangeSerializer ser)
   {
      ser.write_type_12("timestamp", data.getTimestamp());
      ser.write_type_5("forward_speed_setpoint", data.getForwardSpeedSetpoint());
      ser.write_type_5("forward_speed_setpoint_normalized", data.getForwardSpeedSetpointNormalized());
      ser.write_type_5("steering_setpoint", data.getSteeringSetpoint());
      ser.write_type_5("steering_setpoint_normalized", data.getSteeringSetpointNormalized());
      ser.write_type_5("lateral_acceleration_setpoint", data.getLateralAccelerationSetpoint());
   }

   @Override
   public final void deserialize(us.ihmc.idl.InterchangeSerializer ser, px4_msgs.msg.dds.RoverAckermannSetpoint data)
   {
      data.setTimestamp(ser.read_type_12("timestamp"));
      data.setForwardSpeedSetpoint(ser.read_type_5("forward_speed_setpoint"));
      data.setForwardSpeedSetpointNormalized(ser.read_type_5("forward_speed_setpoint_normalized"));
      data.setSteeringSetpoint(ser.read_type_5("steering_setpoint"));
      data.setSteeringSetpointNormalized(ser.read_type_5("steering_setpoint_normalized"));
      data.setLateralAccelerationSetpoint(ser.read_type_5("lateral_acceleration_setpoint"));
   }

   public static void staticCopy(px4_msgs.msg.dds.RoverAckermannSetpoint src, px4_msgs.msg.dds.RoverAckermannSetpoint dest)
   {
      dest.set(src);
   }

   @Override
   public px4_msgs.msg.dds.RoverAckermannSetpoint createData()
   {
      return new px4_msgs.msg.dds.RoverAckermannSetpoint();
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
   
   public void serialize(px4_msgs.msg.dds.RoverAckermannSetpoint data, us.ihmc.idl.CDR cdr)
   {
      write(data, cdr);
   }

   public void deserialize(px4_msgs.msg.dds.RoverAckermannSetpoint data, us.ihmc.idl.CDR cdr)
   {
      read(data, cdr);
   }
   
   public void copy(px4_msgs.msg.dds.RoverAckermannSetpoint src, px4_msgs.msg.dds.RoverAckermannSetpoint dest)
   {
      staticCopy(src, dest);
   }

   @Override
   public RoverAckermannSetpointPubSubType newInstance()
   {
      return new RoverAckermannSetpointPubSubType();
   }
}
