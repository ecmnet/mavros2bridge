package px4_msgs.msg.dds;

/**
* 
* Topic data type of the struct "EscReport" defined in "EscReport_.idl". Use this class to provide the TopicDataType to a Participant. 
*
* This file was automatically generated from EscReport_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit EscReport_.idl instead.
*
*/
public class EscReportPubSubType implements us.ihmc.pubsub.TopicDataType<px4_msgs.msg.dds.EscReport>
{
   public static final java.lang.String name = "px4_msgs::msg::dds_::EscReport_";
   
   @Override
   public final java.lang.String getDefinitionChecksum()
   {
   		return "00a72c81ce9d41de814406720a40d178c405dfe42f09b981187945bac2b4b18d";
   }
   
   @Override
   public final java.lang.String getDefinitionVersion()
   {
   		return "";
   }

   private final us.ihmc.idl.CDR serializeCDR = new us.ihmc.idl.CDR();
   private final us.ihmc.idl.CDR deserializeCDR = new us.ihmc.idl.CDR();

   @Override
   public void serialize(px4_msgs.msg.dds.EscReport data, us.ihmc.pubsub.common.SerializedPayload serializedPayload) throws java.io.IOException
   {
      serializeCDR.serialize(serializedPayload);
      write(data, serializeCDR);
      serializeCDR.finishSerialize();
   }

   @Override
   public void deserialize(us.ihmc.pubsub.common.SerializedPayload serializedPayload, px4_msgs.msg.dds.EscReport data) throws java.io.IOException
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

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 2 + us.ihmc.idl.CDR.alignment(current_alignment, 2);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      return current_alignment - initial_alignment;
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.EscReport data)
   {
      return getCdrSerializedSize(data, 0);
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.EscReport data, int current_alignment)
   {
      int initial_alignment = current_alignment;

      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 2 + us.ihmc.idl.CDR.alignment(current_alignment, 2);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);



      return current_alignment - initial_alignment;
   }

   public static void write(px4_msgs.msg.dds.EscReport data, us.ihmc.idl.CDR cdr)
   {
      cdr.write_type_12(data.getTimestamp());

      cdr.write_type_4(data.getEscErrorcount());

      cdr.write_type_2(data.getEscRpm());

      cdr.write_type_5(data.getEscVoltage());

      cdr.write_type_5(data.getEscCurrent());

      cdr.write_type_5(data.getEscTemperature());

      cdr.write_type_9(data.getEscAddress());

      cdr.write_type_9(data.getEscCmdcount());

      cdr.write_type_9(data.getEscState());

      cdr.write_type_9(data.getActuatorFunction());

      cdr.write_type_3(data.getFailures());

      cdr.write_type_9(data.getEscPower());

   }

   public static void read(px4_msgs.msg.dds.EscReport data, us.ihmc.idl.CDR cdr)
   {
      data.setTimestamp(cdr.read_type_12());
      	
      data.setEscErrorcount(cdr.read_type_4());
      	
      data.setEscRpm(cdr.read_type_2());
      	
      data.setEscVoltage(cdr.read_type_5());
      	
      data.setEscCurrent(cdr.read_type_5());
      	
      data.setEscTemperature(cdr.read_type_5());
      	
      data.setEscAddress(cdr.read_type_9());
      	
      data.setEscCmdcount(cdr.read_type_9());
      	
      data.setEscState(cdr.read_type_9());
      	
      data.setActuatorFunction(cdr.read_type_9());
      	
      data.setFailures(cdr.read_type_3());
      	
      data.setEscPower(cdr.read_type_9());
      	

   }

   @Override
   public final void serialize(px4_msgs.msg.dds.EscReport data, us.ihmc.idl.InterchangeSerializer ser)
   {
      ser.write_type_12("timestamp", data.getTimestamp());
      ser.write_type_4("esc_errorcount", data.getEscErrorcount());
      ser.write_type_2("esc_rpm", data.getEscRpm());
      ser.write_type_5("esc_voltage", data.getEscVoltage());
      ser.write_type_5("esc_current", data.getEscCurrent());
      ser.write_type_5("esc_temperature", data.getEscTemperature());
      ser.write_type_9("esc_address", data.getEscAddress());
      ser.write_type_9("esc_cmdcount", data.getEscCmdcount());
      ser.write_type_9("esc_state", data.getEscState());
      ser.write_type_9("actuator_function", data.getActuatorFunction());
      ser.write_type_3("failures", data.getFailures());
      ser.write_type_9("esc_power", data.getEscPower());
   }

   @Override
   public final void deserialize(us.ihmc.idl.InterchangeSerializer ser, px4_msgs.msg.dds.EscReport data)
   {
      data.setTimestamp(ser.read_type_12("timestamp"));
      data.setEscErrorcount(ser.read_type_4("esc_errorcount"));
      data.setEscRpm(ser.read_type_2("esc_rpm"));
      data.setEscVoltage(ser.read_type_5("esc_voltage"));
      data.setEscCurrent(ser.read_type_5("esc_current"));
      data.setEscTemperature(ser.read_type_5("esc_temperature"));
      data.setEscAddress(ser.read_type_9("esc_address"));
      data.setEscCmdcount(ser.read_type_9("esc_cmdcount"));
      data.setEscState(ser.read_type_9("esc_state"));
      data.setActuatorFunction(ser.read_type_9("actuator_function"));
      data.setFailures(ser.read_type_3("failures"));
      data.setEscPower(ser.read_type_9("esc_power"));
   }

   public static void staticCopy(px4_msgs.msg.dds.EscReport src, px4_msgs.msg.dds.EscReport dest)
   {
      dest.set(src);
   }

   @Override
   public px4_msgs.msg.dds.EscReport createData()
   {
      return new px4_msgs.msg.dds.EscReport();
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
   
   public void serialize(px4_msgs.msg.dds.EscReport data, us.ihmc.idl.CDR cdr)
   {
      write(data, cdr);
   }

   public void deserialize(px4_msgs.msg.dds.EscReport data, us.ihmc.idl.CDR cdr)
   {
      read(data, cdr);
   }
   
   public void copy(px4_msgs.msg.dds.EscReport src, px4_msgs.msg.dds.EscReport dest)
   {
      staticCopy(src, dest);
   }

   @Override
   public EscReportPubSubType newInstance()
   {
      return new EscReportPubSubType();
   }
}
