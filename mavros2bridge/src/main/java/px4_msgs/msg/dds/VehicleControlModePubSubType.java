package px4_msgs.msg.dds;

/**
* 
* Topic data type of the struct "VehicleControlMode" defined in "VehicleControlMode_.idl". Use this class to provide the TopicDataType to a Participant. 
*
* This file was automatically generated from VehicleControlMode_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit VehicleControlMode_.idl instead.
*
*/
public class VehicleControlModePubSubType implements us.ihmc.pubsub.TopicDataType<px4_msgs.msg.dds.VehicleControlMode>
{
   public static final java.lang.String name = "px4_msgs::msg::dds_::VehicleControlMode_";
   
   @Override
   public final java.lang.String getDefinitionChecksum()
   {
   		return "21f02768ae56fe5f679709a38d9bb2afe915385bc742d11eb9ce822fe34e1816";
   }
   
   @Override
   public final java.lang.String getDefinitionVersion()
   {
   		return "";
   }

   private final us.ihmc.idl.CDR serializeCDR = new us.ihmc.idl.CDR();
   private final us.ihmc.idl.CDR deserializeCDR = new us.ihmc.idl.CDR();

   @Override
   public void serialize(px4_msgs.msg.dds.VehicleControlMode data, us.ihmc.pubsub.common.SerializedPayload serializedPayload) throws java.io.IOException
   {
      serializeCDR.serialize(serializedPayload);
      write(data, serializeCDR);
      serializeCDR.finishSerialize();
   }

   @Override
   public void deserialize(us.ihmc.pubsub.common.SerializedPayload serializedPayload, px4_msgs.msg.dds.VehicleControlMode data) throws java.io.IOException
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

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.VehicleControlMode data)
   {
      return getCdrSerializedSize(data, 0);
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.VehicleControlMode data, int current_alignment)
   {
      int initial_alignment = current_alignment;

      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


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

   public static void write(px4_msgs.msg.dds.VehicleControlMode data, us.ihmc.idl.CDR cdr)
   {
      cdr.write_type_12(data.getTimestamp());

      cdr.write_type_7(data.getFlagArmed());

      cdr.write_type_7(data.getFlagMulticopterPositionControlEnabled());

      cdr.write_type_7(data.getFlagControlManualEnabled());

      cdr.write_type_7(data.getFlagControlAutoEnabled());

      cdr.write_type_7(data.getFlagControlOffboardEnabled());

      cdr.write_type_7(data.getFlagControlPositionEnabled());

      cdr.write_type_7(data.getFlagControlVelocityEnabled());

      cdr.write_type_7(data.getFlagControlAltitudeEnabled());

      cdr.write_type_7(data.getFlagControlClimbRateEnabled());

      cdr.write_type_7(data.getFlagControlAccelerationEnabled());

      cdr.write_type_7(data.getFlagControlAttitudeEnabled());

      cdr.write_type_7(data.getFlagControlRatesEnabled());

      cdr.write_type_7(data.getFlagControlAllocationEnabled());

      cdr.write_type_7(data.getFlagControlTerminationEnabled());

      cdr.write_type_9(data.getSourceId());

   }

   public static void read(px4_msgs.msg.dds.VehicleControlMode data, us.ihmc.idl.CDR cdr)
   {
      data.setTimestamp(cdr.read_type_12());
      	
      data.setFlagArmed(cdr.read_type_7());
      	
      data.setFlagMulticopterPositionControlEnabled(cdr.read_type_7());
      	
      data.setFlagControlManualEnabled(cdr.read_type_7());
      	
      data.setFlagControlAutoEnabled(cdr.read_type_7());
      	
      data.setFlagControlOffboardEnabled(cdr.read_type_7());
      	
      data.setFlagControlPositionEnabled(cdr.read_type_7());
      	
      data.setFlagControlVelocityEnabled(cdr.read_type_7());
      	
      data.setFlagControlAltitudeEnabled(cdr.read_type_7());
      	
      data.setFlagControlClimbRateEnabled(cdr.read_type_7());
      	
      data.setFlagControlAccelerationEnabled(cdr.read_type_7());
      	
      data.setFlagControlAttitudeEnabled(cdr.read_type_7());
      	
      data.setFlagControlRatesEnabled(cdr.read_type_7());
      	
      data.setFlagControlAllocationEnabled(cdr.read_type_7());
      	
      data.setFlagControlTerminationEnabled(cdr.read_type_7());
      	
      data.setSourceId(cdr.read_type_9());
      	

   }

   @Override
   public final void serialize(px4_msgs.msg.dds.VehicleControlMode data, us.ihmc.idl.InterchangeSerializer ser)
   {
      ser.write_type_12("timestamp", data.getTimestamp());
      ser.write_type_7("flag_armed", data.getFlagArmed());
      ser.write_type_7("flag_multicopter_position_control_enabled", data.getFlagMulticopterPositionControlEnabled());
      ser.write_type_7("flag_control_manual_enabled", data.getFlagControlManualEnabled());
      ser.write_type_7("flag_control_auto_enabled", data.getFlagControlAutoEnabled());
      ser.write_type_7("flag_control_offboard_enabled", data.getFlagControlOffboardEnabled());
      ser.write_type_7("flag_control_position_enabled", data.getFlagControlPositionEnabled());
      ser.write_type_7("flag_control_velocity_enabled", data.getFlagControlVelocityEnabled());
      ser.write_type_7("flag_control_altitude_enabled", data.getFlagControlAltitudeEnabled());
      ser.write_type_7("flag_control_climb_rate_enabled", data.getFlagControlClimbRateEnabled());
      ser.write_type_7("flag_control_acceleration_enabled", data.getFlagControlAccelerationEnabled());
      ser.write_type_7("flag_control_attitude_enabled", data.getFlagControlAttitudeEnabled());
      ser.write_type_7("flag_control_rates_enabled", data.getFlagControlRatesEnabled());
      ser.write_type_7("flag_control_allocation_enabled", data.getFlagControlAllocationEnabled());
      ser.write_type_7("flag_control_termination_enabled", data.getFlagControlTerminationEnabled());
      ser.write_type_9("source_id", data.getSourceId());
   }

   @Override
   public final void deserialize(us.ihmc.idl.InterchangeSerializer ser, px4_msgs.msg.dds.VehicleControlMode data)
   {
      data.setTimestamp(ser.read_type_12("timestamp"));
      data.setFlagArmed(ser.read_type_7("flag_armed"));
      data.setFlagMulticopterPositionControlEnabled(ser.read_type_7("flag_multicopter_position_control_enabled"));
      data.setFlagControlManualEnabled(ser.read_type_7("flag_control_manual_enabled"));
      data.setFlagControlAutoEnabled(ser.read_type_7("flag_control_auto_enabled"));
      data.setFlagControlOffboardEnabled(ser.read_type_7("flag_control_offboard_enabled"));
      data.setFlagControlPositionEnabled(ser.read_type_7("flag_control_position_enabled"));
      data.setFlagControlVelocityEnabled(ser.read_type_7("flag_control_velocity_enabled"));
      data.setFlagControlAltitudeEnabled(ser.read_type_7("flag_control_altitude_enabled"));
      data.setFlagControlClimbRateEnabled(ser.read_type_7("flag_control_climb_rate_enabled"));
      data.setFlagControlAccelerationEnabled(ser.read_type_7("flag_control_acceleration_enabled"));
      data.setFlagControlAttitudeEnabled(ser.read_type_7("flag_control_attitude_enabled"));
      data.setFlagControlRatesEnabled(ser.read_type_7("flag_control_rates_enabled"));
      data.setFlagControlAllocationEnabled(ser.read_type_7("flag_control_allocation_enabled"));
      data.setFlagControlTerminationEnabled(ser.read_type_7("flag_control_termination_enabled"));
      data.setSourceId(ser.read_type_9("source_id"));
   }

   public static void staticCopy(px4_msgs.msg.dds.VehicleControlMode src, px4_msgs.msg.dds.VehicleControlMode dest)
   {
      dest.set(src);
   }

   @Override
   public px4_msgs.msg.dds.VehicleControlMode createData()
   {
      return new px4_msgs.msg.dds.VehicleControlMode();
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
   
   public void serialize(px4_msgs.msg.dds.VehicleControlMode data, us.ihmc.idl.CDR cdr)
   {
      write(data, cdr);
   }

   public void deserialize(px4_msgs.msg.dds.VehicleControlMode data, us.ihmc.idl.CDR cdr)
   {
      read(data, cdr);
   }
   
   public void copy(px4_msgs.msg.dds.VehicleControlMode src, px4_msgs.msg.dds.VehicleControlMode dest)
   {
      staticCopy(src, dest);
   }

   @Override
   public VehicleControlModePubSubType newInstance()
   {
      return new VehicleControlModePubSubType();
   }
}
