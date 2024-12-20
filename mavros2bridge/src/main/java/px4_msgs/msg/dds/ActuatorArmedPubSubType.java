package px4_msgs.msg.dds;

/**
* 
* Topic data type of the struct "ActuatorArmed" defined in "ActuatorArmed_.idl". Use this class to provide the TopicDataType to a Participant. 
*
* This file was automatically generated from ActuatorArmed_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit ActuatorArmed_.idl instead.
*
*/
public class ActuatorArmedPubSubType implements us.ihmc.pubsub.TopicDataType<px4_msgs.msg.dds.ActuatorArmed>
{
   public static final java.lang.String name = "px4_msgs::msg::dds_::ActuatorArmed_";
   
   @Override
   public final java.lang.String getDefinitionChecksum()
   {
   		return "81ba9ef62cfa88c9243639aabaf376dd1de7afa7d94a54628185df47b1dba8cc";
   }
   
   @Override
   public final java.lang.String getDefinitionVersion()
   {
   		return "";
   }

   private final us.ihmc.idl.CDR serializeCDR = new us.ihmc.idl.CDR();
   private final us.ihmc.idl.CDR deserializeCDR = new us.ihmc.idl.CDR();

   @Override
   public void serialize(px4_msgs.msg.dds.ActuatorArmed data, us.ihmc.pubsub.common.SerializedPayload serializedPayload) throws java.io.IOException
   {
      serializeCDR.serialize(serializedPayload);
      write(data, serializeCDR);
      serializeCDR.finishSerialize();
   }

   @Override
   public void deserialize(us.ihmc.pubsub.common.SerializedPayload serializedPayload, px4_msgs.msg.dds.ActuatorArmed data) throws java.io.IOException
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


      return current_alignment - initial_alignment;
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.ActuatorArmed data)
   {
      return getCdrSerializedSize(data, 0);
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.ActuatorArmed data, int current_alignment)
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



      return current_alignment - initial_alignment;
   }

   public static void write(px4_msgs.msg.dds.ActuatorArmed data, us.ihmc.idl.CDR cdr)
   {
      cdr.write_type_12(data.getTimestamp());

      cdr.write_type_7(data.getArmed());

      cdr.write_type_7(data.getPrearmed());

      cdr.write_type_7(data.getReadyToArm());

      cdr.write_type_7(data.getLockdown());

      cdr.write_type_7(data.getManualLockdown());

      cdr.write_type_7(data.getForceFailsafe());

      cdr.write_type_7(data.getInEscCalibrationMode());

   }

   public static void read(px4_msgs.msg.dds.ActuatorArmed data, us.ihmc.idl.CDR cdr)
   {
      data.setTimestamp(cdr.read_type_12());
      	
      data.setArmed(cdr.read_type_7());
      	
      data.setPrearmed(cdr.read_type_7());
      	
      data.setReadyToArm(cdr.read_type_7());
      	
      data.setLockdown(cdr.read_type_7());
      	
      data.setManualLockdown(cdr.read_type_7());
      	
      data.setForceFailsafe(cdr.read_type_7());
      	
      data.setInEscCalibrationMode(cdr.read_type_7());
      	

   }

   @Override
   public final void serialize(px4_msgs.msg.dds.ActuatorArmed data, us.ihmc.idl.InterchangeSerializer ser)
   {
      ser.write_type_12("timestamp", data.getTimestamp());
      ser.write_type_7("armed", data.getArmed());
      ser.write_type_7("prearmed", data.getPrearmed());
      ser.write_type_7("ready_to_arm", data.getReadyToArm());
      ser.write_type_7("lockdown", data.getLockdown());
      ser.write_type_7("manual_lockdown", data.getManualLockdown());
      ser.write_type_7("force_failsafe", data.getForceFailsafe());
      ser.write_type_7("in_esc_calibration_mode", data.getInEscCalibrationMode());
   }

   @Override
   public final void deserialize(us.ihmc.idl.InterchangeSerializer ser, px4_msgs.msg.dds.ActuatorArmed data)
   {
      data.setTimestamp(ser.read_type_12("timestamp"));
      data.setArmed(ser.read_type_7("armed"));
      data.setPrearmed(ser.read_type_7("prearmed"));
      data.setReadyToArm(ser.read_type_7("ready_to_arm"));
      data.setLockdown(ser.read_type_7("lockdown"));
      data.setManualLockdown(ser.read_type_7("manual_lockdown"));
      data.setForceFailsafe(ser.read_type_7("force_failsafe"));
      data.setInEscCalibrationMode(ser.read_type_7("in_esc_calibration_mode"));
   }

   public static void staticCopy(px4_msgs.msg.dds.ActuatorArmed src, px4_msgs.msg.dds.ActuatorArmed dest)
   {
      dest.set(src);
   }

   @Override
   public px4_msgs.msg.dds.ActuatorArmed createData()
   {
      return new px4_msgs.msg.dds.ActuatorArmed();
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
   
   public void serialize(px4_msgs.msg.dds.ActuatorArmed data, us.ihmc.idl.CDR cdr)
   {
      write(data, cdr);
   }

   public void deserialize(px4_msgs.msg.dds.ActuatorArmed data, us.ihmc.idl.CDR cdr)
   {
      read(data, cdr);
   }
   
   public void copy(px4_msgs.msg.dds.ActuatorArmed src, px4_msgs.msg.dds.ActuatorArmed dest)
   {
      staticCopy(src, dest);
   }

   @Override
   public ActuatorArmedPubSubType newInstance()
   {
      return new ActuatorArmedPubSubType();
   }
}
