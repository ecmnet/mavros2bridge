package px4_msgs.msg.dds;

/**
* 
* Topic data type of the struct "RoverMecanumSetpoint" defined in "RoverMecanumSetpoint_.idl". Use this class to provide the TopicDataType to a Participant. 
*
* This file was automatically generated from RoverMecanumSetpoint_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit RoverMecanumSetpoint_.idl instead.
*
*/
public class RoverMecanumSetpointPubSubType implements us.ihmc.pubsub.TopicDataType<px4_msgs.msg.dds.RoverMecanumSetpoint>
{
   public static final java.lang.String name = "px4_msgs::msg::dds_::RoverMecanumSetpoint_";
   
   @Override
   public final java.lang.String getDefinitionChecksum()
   {
   		return "611ab423da865c87cd53d4e67c62cc39ad2388fb090e065aa42321817fc7ed17";
   }
   
   @Override
   public final java.lang.String getDefinitionVersion()
   {
   		return "";
   }

   private final us.ihmc.idl.CDR serializeCDR = new us.ihmc.idl.CDR();
   private final us.ihmc.idl.CDR deserializeCDR = new us.ihmc.idl.CDR();

   @Override
   public void serialize(px4_msgs.msg.dds.RoverMecanumSetpoint data, us.ihmc.pubsub.common.SerializedPayload serializedPayload) throws java.io.IOException
   {
      serializeCDR.serialize(serializedPayload);
      write(data, serializeCDR);
      serializeCDR.finishSerialize();
   }

   @Override
   public void deserialize(us.ihmc.pubsub.common.SerializedPayload serializedPayload, px4_msgs.msg.dds.RoverMecanumSetpoint data) throws java.io.IOException
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

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.RoverMecanumSetpoint data)
   {
      return getCdrSerializedSize(data, 0);
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.RoverMecanumSetpoint data, int current_alignment)
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

   public static void write(px4_msgs.msg.dds.RoverMecanumSetpoint data, us.ihmc.idl.CDR cdr)
   {
      cdr.write_type_12(data.getTimestamp());

      cdr.write_type_5(data.getForwardSpeedSetpoint());

      cdr.write_type_5(data.getForwardSpeedSetpointNormalized());

      cdr.write_type_5(data.getLateralSpeedSetpoint());

      cdr.write_type_5(data.getLateralSpeedSetpointNormalized());

      cdr.write_type_5(data.getYawRateSetpoint());

      cdr.write_type_5(data.getSpeedDiffSetpointNormalized());

      cdr.write_type_5(data.getYawSetpoint());

   }

   public static void read(px4_msgs.msg.dds.RoverMecanumSetpoint data, us.ihmc.idl.CDR cdr)
   {
      data.setTimestamp(cdr.read_type_12());
      	
      data.setForwardSpeedSetpoint(cdr.read_type_5());
      	
      data.setForwardSpeedSetpointNormalized(cdr.read_type_5());
      	
      data.setLateralSpeedSetpoint(cdr.read_type_5());
      	
      data.setLateralSpeedSetpointNormalized(cdr.read_type_5());
      	
      data.setYawRateSetpoint(cdr.read_type_5());
      	
      data.setSpeedDiffSetpointNormalized(cdr.read_type_5());
      	
      data.setYawSetpoint(cdr.read_type_5());
      	

   }

   @Override
   public final void serialize(px4_msgs.msg.dds.RoverMecanumSetpoint data, us.ihmc.idl.InterchangeSerializer ser)
   {
      ser.write_type_12("timestamp", data.getTimestamp());
      ser.write_type_5("forward_speed_setpoint", data.getForwardSpeedSetpoint());
      ser.write_type_5("forward_speed_setpoint_normalized", data.getForwardSpeedSetpointNormalized());
      ser.write_type_5("lateral_speed_setpoint", data.getLateralSpeedSetpoint());
      ser.write_type_5("lateral_speed_setpoint_normalized", data.getLateralSpeedSetpointNormalized());
      ser.write_type_5("yaw_rate_setpoint", data.getYawRateSetpoint());
      ser.write_type_5("speed_diff_setpoint_normalized", data.getSpeedDiffSetpointNormalized());
      ser.write_type_5("yaw_setpoint", data.getYawSetpoint());
   }

   @Override
   public final void deserialize(us.ihmc.idl.InterchangeSerializer ser, px4_msgs.msg.dds.RoverMecanumSetpoint data)
   {
      data.setTimestamp(ser.read_type_12("timestamp"));
      data.setForwardSpeedSetpoint(ser.read_type_5("forward_speed_setpoint"));
      data.setForwardSpeedSetpointNormalized(ser.read_type_5("forward_speed_setpoint_normalized"));
      data.setLateralSpeedSetpoint(ser.read_type_5("lateral_speed_setpoint"));
      data.setLateralSpeedSetpointNormalized(ser.read_type_5("lateral_speed_setpoint_normalized"));
      data.setYawRateSetpoint(ser.read_type_5("yaw_rate_setpoint"));
      data.setSpeedDiffSetpointNormalized(ser.read_type_5("speed_diff_setpoint_normalized"));
      data.setYawSetpoint(ser.read_type_5("yaw_setpoint"));
   }

   public static void staticCopy(px4_msgs.msg.dds.RoverMecanumSetpoint src, px4_msgs.msg.dds.RoverMecanumSetpoint dest)
   {
      dest.set(src);
   }

   @Override
   public px4_msgs.msg.dds.RoverMecanumSetpoint createData()
   {
      return new px4_msgs.msg.dds.RoverMecanumSetpoint();
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
   
   public void serialize(px4_msgs.msg.dds.RoverMecanumSetpoint data, us.ihmc.idl.CDR cdr)
   {
      write(data, cdr);
   }

   public void deserialize(px4_msgs.msg.dds.RoverMecanumSetpoint data, us.ihmc.idl.CDR cdr)
   {
      read(data, cdr);
   }
   
   public void copy(px4_msgs.msg.dds.RoverMecanumSetpoint src, px4_msgs.msg.dds.RoverMecanumSetpoint dest)
   {
      staticCopy(src, dest);
   }

   @Override
   public RoverMecanumSetpointPubSubType newInstance()
   {
      return new RoverMecanumSetpointPubSubType();
   }
}
