package px4_msgs.msg.dds;

/**
* 
* Topic data type of the struct "RoverDifferentialSetpoint" defined in "RoverDifferentialSetpoint_.idl". Use this class to provide the TopicDataType to a Participant. 
*
* This file was automatically generated from RoverDifferentialSetpoint_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit RoverDifferentialSetpoint_.idl instead.
*
*/
public class RoverDifferentialSetpointPubSubType implements us.ihmc.pubsub.TopicDataType<px4_msgs.msg.dds.RoverDifferentialSetpoint>
{
   public static final java.lang.String name = "px4_msgs::msg::dds_::RoverDifferentialSetpoint_";
   
   @Override
   public final java.lang.String getDefinitionChecksum()
   {
   		return "8120d6dab046e604f33958a98366af1e2866189a0b972356b7c70d121e8081dd";
   }
   
   @Override
   public final java.lang.String getDefinitionVersion()
   {
   		return "";
   }

   private final us.ihmc.idl.CDR serializeCDR = new us.ihmc.idl.CDR();
   private final us.ihmc.idl.CDR deserializeCDR = new us.ihmc.idl.CDR();

   @Override
   public void serialize(px4_msgs.msg.dds.RoverDifferentialSetpoint data, us.ihmc.pubsub.common.SerializedPayload serializedPayload) throws java.io.IOException
   {
      serializeCDR.serialize(serializedPayload);
      write(data, serializeCDR);
      serializeCDR.finishSerialize();
   }

   @Override
   public void deserialize(us.ihmc.pubsub.common.SerializedPayload serializedPayload, px4_msgs.msg.dds.RoverDifferentialSetpoint data) throws java.io.IOException
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

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.RoverDifferentialSetpoint data)
   {
      return getCdrSerializedSize(data, 0);
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.RoverDifferentialSetpoint data, int current_alignment)
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

   public static void write(px4_msgs.msg.dds.RoverDifferentialSetpoint data, us.ihmc.idl.CDR cdr)
   {
      cdr.write_type_12(data.getTimestamp());

      cdr.write_type_5(data.getForwardSpeedSetpoint());

      cdr.write_type_5(data.getForwardSpeedSetpointNormalized());

      cdr.write_type_5(data.getYawRateSetpoint());

      cdr.write_type_5(data.getSpeedDiffSetpointNormalized());

      cdr.write_type_5(data.getYawSetpoint());

   }

   public static void read(px4_msgs.msg.dds.RoverDifferentialSetpoint data, us.ihmc.idl.CDR cdr)
   {
      data.setTimestamp(cdr.read_type_12());
      	
      data.setForwardSpeedSetpoint(cdr.read_type_5());
      	
      data.setForwardSpeedSetpointNormalized(cdr.read_type_5());
      	
      data.setYawRateSetpoint(cdr.read_type_5());
      	
      data.setSpeedDiffSetpointNormalized(cdr.read_type_5());
      	
      data.setYawSetpoint(cdr.read_type_5());
      	

   }

   @Override
   public final void serialize(px4_msgs.msg.dds.RoverDifferentialSetpoint data, us.ihmc.idl.InterchangeSerializer ser)
   {
      ser.write_type_12("timestamp", data.getTimestamp());
      ser.write_type_5("forward_speed_setpoint", data.getForwardSpeedSetpoint());
      ser.write_type_5("forward_speed_setpoint_normalized", data.getForwardSpeedSetpointNormalized());
      ser.write_type_5("yaw_rate_setpoint", data.getYawRateSetpoint());
      ser.write_type_5("speed_diff_setpoint_normalized", data.getSpeedDiffSetpointNormalized());
      ser.write_type_5("yaw_setpoint", data.getYawSetpoint());
   }

   @Override
   public final void deserialize(us.ihmc.idl.InterchangeSerializer ser, px4_msgs.msg.dds.RoverDifferentialSetpoint data)
   {
      data.setTimestamp(ser.read_type_12("timestamp"));
      data.setForwardSpeedSetpoint(ser.read_type_5("forward_speed_setpoint"));
      data.setForwardSpeedSetpointNormalized(ser.read_type_5("forward_speed_setpoint_normalized"));
      data.setYawRateSetpoint(ser.read_type_5("yaw_rate_setpoint"));
      data.setSpeedDiffSetpointNormalized(ser.read_type_5("speed_diff_setpoint_normalized"));
      data.setYawSetpoint(ser.read_type_5("yaw_setpoint"));
   }

   public static void staticCopy(px4_msgs.msg.dds.RoverDifferentialSetpoint src, px4_msgs.msg.dds.RoverDifferentialSetpoint dest)
   {
      dest.set(src);
   }

   @Override
   public px4_msgs.msg.dds.RoverDifferentialSetpoint createData()
   {
      return new px4_msgs.msg.dds.RoverDifferentialSetpoint();
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
   
   public void serialize(px4_msgs.msg.dds.RoverDifferentialSetpoint data, us.ihmc.idl.CDR cdr)
   {
      write(data, cdr);
   }

   public void deserialize(px4_msgs.msg.dds.RoverDifferentialSetpoint data, us.ihmc.idl.CDR cdr)
   {
      read(data, cdr);
   }
   
   public void copy(px4_msgs.msg.dds.RoverDifferentialSetpoint src, px4_msgs.msg.dds.RoverDifferentialSetpoint dest)
   {
      staticCopy(src, dest);
   }

   @Override
   public RoverDifferentialSetpointPubSubType newInstance()
   {
      return new RoverDifferentialSetpointPubSubType();
   }
}
