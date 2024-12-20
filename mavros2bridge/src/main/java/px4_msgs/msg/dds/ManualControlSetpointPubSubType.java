package px4_msgs.msg.dds;

/**
* 
* Topic data type of the struct "ManualControlSetpoint" defined in "ManualControlSetpoint_.idl". Use this class to provide the TopicDataType to a Participant. 
*
* This file was automatically generated from ManualControlSetpoint_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit ManualControlSetpoint_.idl instead.
*
*/
public class ManualControlSetpointPubSubType implements us.ihmc.pubsub.TopicDataType<px4_msgs.msg.dds.ManualControlSetpoint>
{
   public static final java.lang.String name = "px4_msgs::msg::dds_::ManualControlSetpoint_";
   
   @Override
   public final java.lang.String getDefinitionChecksum()
   {
   		return "351a02febc0cd2582448ced3928c7ff856c82fe9907ce8814af2776959f1f018";
   }
   
   @Override
   public final java.lang.String getDefinitionVersion()
   {
   		return "";
   }

   private final us.ihmc.idl.CDR serializeCDR = new us.ihmc.idl.CDR();
   private final us.ihmc.idl.CDR deserializeCDR = new us.ihmc.idl.CDR();

   @Override
   public void serialize(px4_msgs.msg.dds.ManualControlSetpoint data, us.ihmc.pubsub.common.SerializedPayload serializedPayload) throws java.io.IOException
   {
      serializeCDR.serialize(serializedPayload);
      write(data, serializeCDR);
      serializeCDR.finishSerialize();
   }

   @Override
   public void deserialize(us.ihmc.pubsub.common.SerializedPayload serializedPayload, px4_msgs.msg.dds.ManualControlSetpoint data) throws java.io.IOException
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

      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

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

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 2 + us.ihmc.idl.CDR.alignment(current_alignment, 2);


      return current_alignment - initial_alignment;
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.ManualControlSetpoint data)
   {
      return getCdrSerializedSize(data, 0);
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.ManualControlSetpoint data, int current_alignment)
   {
      int initial_alignment = current_alignment;

      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


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


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 2 + us.ihmc.idl.CDR.alignment(current_alignment, 2);



      return current_alignment - initial_alignment;
   }

   public static void write(px4_msgs.msg.dds.ManualControlSetpoint data, us.ihmc.idl.CDR cdr)
   {
      cdr.write_type_12(data.getTimestamp());

      cdr.write_type_12(data.getTimestampSample());

      cdr.write_type_7(data.getValid());

      cdr.write_type_9(data.getDataSource());

      cdr.write_type_5(data.getRoll());

      cdr.write_type_5(data.getPitch());

      cdr.write_type_5(data.getYaw());

      cdr.write_type_5(data.getThrottle());

      cdr.write_type_5(data.getFlaps());

      cdr.write_type_5(data.getAux1());

      cdr.write_type_5(data.getAux2());

      cdr.write_type_5(data.getAux3());

      cdr.write_type_5(data.getAux4());

      cdr.write_type_5(data.getAux5());

      cdr.write_type_5(data.getAux6());

      cdr.write_type_7(data.getSticksMoving());

      cdr.write_type_3(data.getButtons());

   }

   public static void read(px4_msgs.msg.dds.ManualControlSetpoint data, us.ihmc.idl.CDR cdr)
   {
      data.setTimestamp(cdr.read_type_12());
      	
      data.setTimestampSample(cdr.read_type_12());
      	
      data.setValid(cdr.read_type_7());
      	
      data.setDataSource(cdr.read_type_9());
      	
      data.setRoll(cdr.read_type_5());
      	
      data.setPitch(cdr.read_type_5());
      	
      data.setYaw(cdr.read_type_5());
      	
      data.setThrottle(cdr.read_type_5());
      	
      data.setFlaps(cdr.read_type_5());
      	
      data.setAux1(cdr.read_type_5());
      	
      data.setAux2(cdr.read_type_5());
      	
      data.setAux3(cdr.read_type_5());
      	
      data.setAux4(cdr.read_type_5());
      	
      data.setAux5(cdr.read_type_5());
      	
      data.setAux6(cdr.read_type_5());
      	
      data.setSticksMoving(cdr.read_type_7());
      	
      data.setButtons(cdr.read_type_3());
      	

   }

   @Override
   public final void serialize(px4_msgs.msg.dds.ManualControlSetpoint data, us.ihmc.idl.InterchangeSerializer ser)
   {
      ser.write_type_12("timestamp", data.getTimestamp());
      ser.write_type_12("timestamp_sample", data.getTimestampSample());
      ser.write_type_7("valid", data.getValid());
      ser.write_type_9("data_source", data.getDataSource());
      ser.write_type_5("roll", data.getRoll());
      ser.write_type_5("pitch", data.getPitch());
      ser.write_type_5("yaw", data.getYaw());
      ser.write_type_5("throttle", data.getThrottle());
      ser.write_type_5("flaps", data.getFlaps());
      ser.write_type_5("aux1", data.getAux1());
      ser.write_type_5("aux2", data.getAux2());
      ser.write_type_5("aux3", data.getAux3());
      ser.write_type_5("aux4", data.getAux4());
      ser.write_type_5("aux5", data.getAux5());
      ser.write_type_5("aux6", data.getAux6());
      ser.write_type_7("sticks_moving", data.getSticksMoving());
      ser.write_type_3("buttons", data.getButtons());
   }

   @Override
   public final void deserialize(us.ihmc.idl.InterchangeSerializer ser, px4_msgs.msg.dds.ManualControlSetpoint data)
   {
      data.setTimestamp(ser.read_type_12("timestamp"));
      data.setTimestampSample(ser.read_type_12("timestamp_sample"));
      data.setValid(ser.read_type_7("valid"));
      data.setDataSource(ser.read_type_9("data_source"));
      data.setRoll(ser.read_type_5("roll"));
      data.setPitch(ser.read_type_5("pitch"));
      data.setYaw(ser.read_type_5("yaw"));
      data.setThrottle(ser.read_type_5("throttle"));
      data.setFlaps(ser.read_type_5("flaps"));
      data.setAux1(ser.read_type_5("aux1"));
      data.setAux2(ser.read_type_5("aux2"));
      data.setAux3(ser.read_type_5("aux3"));
      data.setAux4(ser.read_type_5("aux4"));
      data.setAux5(ser.read_type_5("aux5"));
      data.setAux6(ser.read_type_5("aux6"));
      data.setSticksMoving(ser.read_type_7("sticks_moving"));
      data.setButtons(ser.read_type_3("buttons"));
   }

   public static void staticCopy(px4_msgs.msg.dds.ManualControlSetpoint src, px4_msgs.msg.dds.ManualControlSetpoint dest)
   {
      dest.set(src);
   }

   @Override
   public px4_msgs.msg.dds.ManualControlSetpoint createData()
   {
      return new px4_msgs.msg.dds.ManualControlSetpoint();
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
   
   public void serialize(px4_msgs.msg.dds.ManualControlSetpoint data, us.ihmc.idl.CDR cdr)
   {
      write(data, cdr);
   }

   public void deserialize(px4_msgs.msg.dds.ManualControlSetpoint data, us.ihmc.idl.CDR cdr)
   {
      read(data, cdr);
   }
   
   public void copy(px4_msgs.msg.dds.ManualControlSetpoint src, px4_msgs.msg.dds.ManualControlSetpoint dest)
   {
      staticCopy(src, dest);
   }

   @Override
   public ManualControlSetpointPubSubType newInstance()
   {
      return new ManualControlSetpointPubSubType();
   }
}
