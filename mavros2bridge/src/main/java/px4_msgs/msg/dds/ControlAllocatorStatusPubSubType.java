package px4_msgs.msg.dds;

/**
* 
* Topic data type of the struct "ControlAllocatorStatus" defined in "ControlAllocatorStatus_.idl". Use this class to provide the TopicDataType to a Participant. 
*
* This file was automatically generated from ControlAllocatorStatus_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit ControlAllocatorStatus_.idl instead.
*
*/
public class ControlAllocatorStatusPubSubType implements us.ihmc.pubsub.TopicDataType<px4_msgs.msg.dds.ControlAllocatorStatus>
{
   public static final java.lang.String name = "px4_msgs::msg::dds_::ControlAllocatorStatus_";
   
   @Override
   public final java.lang.String getDefinitionChecksum()
   {
   		return "21b033fb2e6edcec1a480a496072f0b84b2a0c64d74e2a64e31e9b405c77550f";
   }
   
   @Override
   public final java.lang.String getDefinitionVersion()
   {
   		return "";
   }

   private final us.ihmc.idl.CDR serializeCDR = new us.ihmc.idl.CDR();
   private final us.ihmc.idl.CDR deserializeCDR = new us.ihmc.idl.CDR();

   @Override
   public void serialize(px4_msgs.msg.dds.ControlAllocatorStatus data, us.ihmc.pubsub.common.SerializedPayload serializedPayload) throws java.io.IOException
   {
      serializeCDR.serialize(serializedPayload);
      write(data, serializeCDR);
      serializeCDR.finishSerialize();
   }

   @Override
   public void deserialize(us.ihmc.pubsub.common.SerializedPayload serializedPayload, px4_msgs.msg.dds.ControlAllocatorStatus data) throws java.io.IOException
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

      current_alignment += ((3) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += ((3) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += ((16) * 1) + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 2 + us.ihmc.idl.CDR.alignment(current_alignment, 2);


      return current_alignment - initial_alignment;
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.ControlAllocatorStatus data)
   {
      return getCdrSerializedSize(data, 0);
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.ControlAllocatorStatus data, int current_alignment)
   {
      int initial_alignment = current_alignment;

      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += ((3) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);
      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += ((3) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);
      current_alignment += ((16) * 1) + us.ihmc.idl.CDR.alignment(current_alignment, 1);
      current_alignment += 2 + us.ihmc.idl.CDR.alignment(current_alignment, 2);



      return current_alignment - initial_alignment;
   }

   public static void write(px4_msgs.msg.dds.ControlAllocatorStatus data, us.ihmc.idl.CDR cdr)
   {
      cdr.write_type_12(data.getTimestamp());

      cdr.write_type_7(data.getTorqueSetpointAchieved());

      for(int i0 = 0; i0 < data.getUnallocatedTorque().length; ++i0)
      {
        	cdr.write_type_5(data.getUnallocatedTorque()[i0]);	
      }

      cdr.write_type_7(data.getThrustSetpointAchieved());

      for(int i0 = 0; i0 < data.getUnallocatedThrust().length; ++i0)
      {
        	cdr.write_type_5(data.getUnallocatedThrust()[i0]);	
      }

      for(int i0 = 0; i0 < data.getActuatorSaturation().length; ++i0)
      {
        	cdr.write_type_9(data.getActuatorSaturation()[i0]);	
      }

      cdr.write_type_3(data.getHandledMotorFailureMask());

   }

   public static void read(px4_msgs.msg.dds.ControlAllocatorStatus data, us.ihmc.idl.CDR cdr)
   {
      data.setTimestamp(cdr.read_type_12());
      	
      data.setTorqueSetpointAchieved(cdr.read_type_7());
      	
      for(int i0 = 0; i0 < data.getUnallocatedTorque().length; ++i0)
      {
        	data.getUnallocatedTorque()[i0] = cdr.read_type_5();
        	
      }
      	
      data.setThrustSetpointAchieved(cdr.read_type_7());
      	
      for(int i0 = 0; i0 < data.getUnallocatedThrust().length; ++i0)
      {
        	data.getUnallocatedThrust()[i0] = cdr.read_type_5();
        	
      }
      	
      for(int i0 = 0; i0 < data.getActuatorSaturation().length; ++i0)
      {
        	data.getActuatorSaturation()[i0] = cdr.read_type_9();
        	
      }
      	
      data.setHandledMotorFailureMask(cdr.read_type_3());
      	

   }

   @Override
   public final void serialize(px4_msgs.msg.dds.ControlAllocatorStatus data, us.ihmc.idl.InterchangeSerializer ser)
   {
      ser.write_type_12("timestamp", data.getTimestamp());
      ser.write_type_7("torque_setpoint_achieved", data.getTorqueSetpointAchieved());
      ser.write_type_f("unallocated_torque", data.getUnallocatedTorque());
      ser.write_type_7("thrust_setpoint_achieved", data.getThrustSetpointAchieved());
      ser.write_type_f("unallocated_thrust", data.getUnallocatedThrust());
      ser.write_type_f("actuator_saturation", data.getActuatorSaturation());
      ser.write_type_3("handled_motor_failure_mask", data.getHandledMotorFailureMask());
   }

   @Override
   public final void deserialize(us.ihmc.idl.InterchangeSerializer ser, px4_msgs.msg.dds.ControlAllocatorStatus data)
   {
      data.setTimestamp(ser.read_type_12("timestamp"));
      data.setTorqueSetpointAchieved(ser.read_type_7("torque_setpoint_achieved"));
      ser.read_type_f("unallocated_torque", data.getUnallocatedTorque());
      data.setThrustSetpointAchieved(ser.read_type_7("thrust_setpoint_achieved"));
      ser.read_type_f("unallocated_thrust", data.getUnallocatedThrust());
      ser.read_type_f("actuator_saturation", data.getActuatorSaturation());
      data.setHandledMotorFailureMask(ser.read_type_3("handled_motor_failure_mask"));
   }

   public static void staticCopy(px4_msgs.msg.dds.ControlAllocatorStatus src, px4_msgs.msg.dds.ControlAllocatorStatus dest)
   {
      dest.set(src);
   }

   @Override
   public px4_msgs.msg.dds.ControlAllocatorStatus createData()
   {
      return new px4_msgs.msg.dds.ControlAllocatorStatus();
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
   
   public void serialize(px4_msgs.msg.dds.ControlAllocatorStatus data, us.ihmc.idl.CDR cdr)
   {
      write(data, cdr);
   }

   public void deserialize(px4_msgs.msg.dds.ControlAllocatorStatus data, us.ihmc.idl.CDR cdr)
   {
      read(data, cdr);
   }
   
   public void copy(px4_msgs.msg.dds.ControlAllocatorStatus src, px4_msgs.msg.dds.ControlAllocatorStatus dest)
   {
      staticCopy(src, dest);
   }

   @Override
   public ControlAllocatorStatusPubSubType newInstance()
   {
      return new ControlAllocatorStatusPubSubType();
   }
}
