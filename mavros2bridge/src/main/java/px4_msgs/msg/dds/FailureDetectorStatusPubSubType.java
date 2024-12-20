package px4_msgs.msg.dds;

/**
* 
* Topic data type of the struct "FailureDetectorStatus" defined in "FailureDetectorStatus_.idl". Use this class to provide the TopicDataType to a Participant. 
*
* This file was automatically generated from FailureDetectorStatus_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit FailureDetectorStatus_.idl instead.
*
*/
public class FailureDetectorStatusPubSubType implements us.ihmc.pubsub.TopicDataType<px4_msgs.msg.dds.FailureDetectorStatus>
{
   public static final java.lang.String name = "px4_msgs::msg::dds_::FailureDetectorStatus_";
   
   @Override
   public final java.lang.String getDefinitionChecksum()
   {
   		return "30833f89dabaa33d8885d311ef3f30daf27da2ace7f6571e841f58c7e082ee4a";
   }
   
   @Override
   public final java.lang.String getDefinitionVersion()
   {
   		return "";
   }

   private final us.ihmc.idl.CDR serializeCDR = new us.ihmc.idl.CDR();
   private final us.ihmc.idl.CDR deserializeCDR = new us.ihmc.idl.CDR();

   @Override
   public void serialize(px4_msgs.msg.dds.FailureDetectorStatus data, us.ihmc.pubsub.common.SerializedPayload serializedPayload) throws java.io.IOException
   {
      serializeCDR.serialize(serializedPayload);
      write(data, serializeCDR);
      serializeCDR.finishSerialize();
   }

   @Override
   public void deserialize(us.ihmc.pubsub.common.SerializedPayload serializedPayload, px4_msgs.msg.dds.FailureDetectorStatus data) throws java.io.IOException
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

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 2 + us.ihmc.idl.CDR.alignment(current_alignment, 2);


      return current_alignment - initial_alignment;
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.FailureDetectorStatus data)
   {
      return getCdrSerializedSize(data, 0);
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.FailureDetectorStatus data, int current_alignment)
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


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 2 + us.ihmc.idl.CDR.alignment(current_alignment, 2);



      return current_alignment - initial_alignment;
   }

   public static void write(px4_msgs.msg.dds.FailureDetectorStatus data, us.ihmc.idl.CDR cdr)
   {
      cdr.write_type_12(data.getTimestamp());

      cdr.write_type_7(data.getFdRoll());

      cdr.write_type_7(data.getFdPitch());

      cdr.write_type_7(data.getFdAlt());

      cdr.write_type_7(data.getFdExt());

      cdr.write_type_7(data.getFdArmEscs());

      cdr.write_type_7(data.getFdBattery());

      cdr.write_type_7(data.getFdImbalancedProp());

      cdr.write_type_7(data.getFdMotor());

      cdr.write_type_5(data.getImbalancedPropMetric());

      cdr.write_type_3(data.getMotorFailureMask());

   }

   public static void read(px4_msgs.msg.dds.FailureDetectorStatus data, us.ihmc.idl.CDR cdr)
   {
      data.setTimestamp(cdr.read_type_12());
      	
      data.setFdRoll(cdr.read_type_7());
      	
      data.setFdPitch(cdr.read_type_7());
      	
      data.setFdAlt(cdr.read_type_7());
      	
      data.setFdExt(cdr.read_type_7());
      	
      data.setFdArmEscs(cdr.read_type_7());
      	
      data.setFdBattery(cdr.read_type_7());
      	
      data.setFdImbalancedProp(cdr.read_type_7());
      	
      data.setFdMotor(cdr.read_type_7());
      	
      data.setImbalancedPropMetric(cdr.read_type_5());
      	
      data.setMotorFailureMask(cdr.read_type_3());
      	

   }

   @Override
   public final void serialize(px4_msgs.msg.dds.FailureDetectorStatus data, us.ihmc.idl.InterchangeSerializer ser)
   {
      ser.write_type_12("timestamp", data.getTimestamp());
      ser.write_type_7("fd_roll", data.getFdRoll());
      ser.write_type_7("fd_pitch", data.getFdPitch());
      ser.write_type_7("fd_alt", data.getFdAlt());
      ser.write_type_7("fd_ext", data.getFdExt());
      ser.write_type_7("fd_arm_escs", data.getFdArmEscs());
      ser.write_type_7("fd_battery", data.getFdBattery());
      ser.write_type_7("fd_imbalanced_prop", data.getFdImbalancedProp());
      ser.write_type_7("fd_motor", data.getFdMotor());
      ser.write_type_5("imbalanced_prop_metric", data.getImbalancedPropMetric());
      ser.write_type_3("motor_failure_mask", data.getMotorFailureMask());
   }

   @Override
   public final void deserialize(us.ihmc.idl.InterchangeSerializer ser, px4_msgs.msg.dds.FailureDetectorStatus data)
   {
      data.setTimestamp(ser.read_type_12("timestamp"));
      data.setFdRoll(ser.read_type_7("fd_roll"));
      data.setFdPitch(ser.read_type_7("fd_pitch"));
      data.setFdAlt(ser.read_type_7("fd_alt"));
      data.setFdExt(ser.read_type_7("fd_ext"));
      data.setFdArmEscs(ser.read_type_7("fd_arm_escs"));
      data.setFdBattery(ser.read_type_7("fd_battery"));
      data.setFdImbalancedProp(ser.read_type_7("fd_imbalanced_prop"));
      data.setFdMotor(ser.read_type_7("fd_motor"));
      data.setImbalancedPropMetric(ser.read_type_5("imbalanced_prop_metric"));
      data.setMotorFailureMask(ser.read_type_3("motor_failure_mask"));
   }

   public static void staticCopy(px4_msgs.msg.dds.FailureDetectorStatus src, px4_msgs.msg.dds.FailureDetectorStatus dest)
   {
      dest.set(src);
   }

   @Override
   public px4_msgs.msg.dds.FailureDetectorStatus createData()
   {
      return new px4_msgs.msg.dds.FailureDetectorStatus();
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
   
   public void serialize(px4_msgs.msg.dds.FailureDetectorStatus data, us.ihmc.idl.CDR cdr)
   {
      write(data, cdr);
   }

   public void deserialize(px4_msgs.msg.dds.FailureDetectorStatus data, us.ihmc.idl.CDR cdr)
   {
      read(data, cdr);
   }
   
   public void copy(px4_msgs.msg.dds.FailureDetectorStatus src, px4_msgs.msg.dds.FailureDetectorStatus dest)
   {
      staticCopy(src, dest);
   }

   @Override
   public FailureDetectorStatusPubSubType newInstance()
   {
      return new FailureDetectorStatusPubSubType();
   }
}
