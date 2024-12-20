package px4_msgs.msg.dds;

/**
* 
* Topic data type of the struct "VehicleAttitudeSetpoint" defined in "VehicleAttitudeSetpoint_.idl". Use this class to provide the TopicDataType to a Participant. 
*
* This file was automatically generated from VehicleAttitudeSetpoint_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit VehicleAttitudeSetpoint_.idl instead.
*
*/
public class VehicleAttitudeSetpointPubSubType implements us.ihmc.pubsub.TopicDataType<px4_msgs.msg.dds.VehicleAttitudeSetpoint>
{
   public static final java.lang.String name = "px4_msgs::msg::dds_::VehicleAttitudeSetpoint_";
   
   @Override
   public final java.lang.String getDefinitionChecksum()
   {
   		return "430f113182be57f0e89e1cd3da65a6dd8e34d98496960803d791580bdf88d7e0";
   }
   
   @Override
   public final java.lang.String getDefinitionVersion()
   {
   		return "";
   }

   private final us.ihmc.idl.CDR serializeCDR = new us.ihmc.idl.CDR();
   private final us.ihmc.idl.CDR deserializeCDR = new us.ihmc.idl.CDR();

   @Override
   public void serialize(px4_msgs.msg.dds.VehicleAttitudeSetpoint data, us.ihmc.pubsub.common.SerializedPayload serializedPayload) throws java.io.IOException
   {
      serializeCDR.serialize(serializedPayload);
      write(data, serializeCDR);
      serializeCDR.finishSerialize();
   }

   @Override
   public void deserialize(us.ihmc.pubsub.common.SerializedPayload serializedPayload, px4_msgs.msg.dds.VehicleAttitudeSetpoint data) throws java.io.IOException
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

      current_alignment += ((4) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += ((3) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      return current_alignment - initial_alignment;
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.VehicleAttitudeSetpoint data)
   {
      return getCdrSerializedSize(data, 0);
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.VehicleAttitudeSetpoint data, int current_alignment)
   {
      int initial_alignment = current_alignment;

      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += ((4) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);
      current_alignment += ((3) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);
      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);



      return current_alignment - initial_alignment;
   }

   public static void write(px4_msgs.msg.dds.VehicleAttitudeSetpoint data, us.ihmc.idl.CDR cdr)
   {
      cdr.write_type_12(data.getTimestamp());

      cdr.write_type_5(data.getYawSpMoveRate());

      for(int i0 = 0; i0 < data.getQD().length; ++i0)
      {
        	cdr.write_type_5(data.getQD()[i0]);	
      }

      for(int i0 = 0; i0 < data.getThrustBody().length; ++i0)
      {
        	cdr.write_type_5(data.getThrustBody()[i0]);	
      }

      cdr.write_type_7(data.getResetIntegral());

      cdr.write_type_7(data.getFwControlYawWheel());

   }

   public static void read(px4_msgs.msg.dds.VehicleAttitudeSetpoint data, us.ihmc.idl.CDR cdr)
   {
      data.setTimestamp(cdr.read_type_12());
      	
      data.setYawSpMoveRate(cdr.read_type_5());
      	
      for(int i0 = 0; i0 < data.getQD().length; ++i0)
      {
        	data.getQD()[i0] = cdr.read_type_5();
        	
      }
      	
      for(int i0 = 0; i0 < data.getThrustBody().length; ++i0)
      {
        	data.getThrustBody()[i0] = cdr.read_type_5();
        	
      }
      	
      data.setResetIntegral(cdr.read_type_7());
      	
      data.setFwControlYawWheel(cdr.read_type_7());
      	

   }

   @Override
   public final void serialize(px4_msgs.msg.dds.VehicleAttitudeSetpoint data, us.ihmc.idl.InterchangeSerializer ser)
   {
      ser.write_type_12("timestamp", data.getTimestamp());
      ser.write_type_5("yaw_sp_move_rate", data.getYawSpMoveRate());
      ser.write_type_f("q_d", data.getQD());
      ser.write_type_f("thrust_body", data.getThrustBody());
      ser.write_type_7("reset_integral", data.getResetIntegral());
      ser.write_type_7("fw_control_yaw_wheel", data.getFwControlYawWheel());
   }

   @Override
   public final void deserialize(us.ihmc.idl.InterchangeSerializer ser, px4_msgs.msg.dds.VehicleAttitudeSetpoint data)
   {
      data.setTimestamp(ser.read_type_12("timestamp"));
      data.setYawSpMoveRate(ser.read_type_5("yaw_sp_move_rate"));
      ser.read_type_f("q_d", data.getQD());
      ser.read_type_f("thrust_body", data.getThrustBody());
      data.setResetIntegral(ser.read_type_7("reset_integral"));
      data.setFwControlYawWheel(ser.read_type_7("fw_control_yaw_wheel"));
   }

   public static void staticCopy(px4_msgs.msg.dds.VehicleAttitudeSetpoint src, px4_msgs.msg.dds.VehicleAttitudeSetpoint dest)
   {
      dest.set(src);
   }

   @Override
   public px4_msgs.msg.dds.VehicleAttitudeSetpoint createData()
   {
      return new px4_msgs.msg.dds.VehicleAttitudeSetpoint();
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
   
   public void serialize(px4_msgs.msg.dds.VehicleAttitudeSetpoint data, us.ihmc.idl.CDR cdr)
   {
      write(data, cdr);
   }

   public void deserialize(px4_msgs.msg.dds.VehicleAttitudeSetpoint data, us.ihmc.idl.CDR cdr)
   {
      read(data, cdr);
   }
   
   public void copy(px4_msgs.msg.dds.VehicleAttitudeSetpoint src, px4_msgs.msg.dds.VehicleAttitudeSetpoint dest)
   {
      staticCopy(src, dest);
   }

   @Override
   public VehicleAttitudeSetpointPubSubType newInstance()
   {
      return new VehicleAttitudeSetpointPubSubType();
   }
}
