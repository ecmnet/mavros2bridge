package px4_msgs.msg.dds;

/**
* 
* Topic data type of the struct "GeneratorStatus" defined in "GeneratorStatus_.idl". Use this class to provide the TopicDataType to a Participant. 
*
* This file was automatically generated from GeneratorStatus_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit GeneratorStatus_.idl instead.
*
*/
public class GeneratorStatusPubSubType implements us.ihmc.pubsub.TopicDataType<px4_msgs.msg.dds.GeneratorStatus>
{
   public static final java.lang.String name = "px4_msgs::msg::dds_::GeneratorStatus_";
   
   @Override
   public final java.lang.String getDefinitionChecksum()
   {
   		return "bb2e9df1e3233bb695ed54e395c656d99804e4079bd725a1fab9a0a641401a21";
   }
   
   @Override
   public final java.lang.String getDefinitionVersion()
   {
   		return "";
   }

   private final us.ihmc.idl.CDR serializeCDR = new us.ihmc.idl.CDR();
   private final us.ihmc.idl.CDR deserializeCDR = new us.ihmc.idl.CDR();

   @Override
   public void serialize(px4_msgs.msg.dds.GeneratorStatus data, us.ihmc.pubsub.common.SerializedPayload serializedPayload) throws java.io.IOException
   {
      serializeCDR.serialize(serializedPayload);
      write(data, serializeCDR);
      serializeCDR.finishSerialize();
   }

   @Override
   public void deserialize(us.ihmc.pubsub.common.SerializedPayload serializedPayload, px4_msgs.msg.dds.GeneratorStatus data) throws java.io.IOException
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

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 2 + us.ihmc.idl.CDR.alignment(current_alignment, 2);

      current_alignment += 2 + us.ihmc.idl.CDR.alignment(current_alignment, 2);

      current_alignment += 2 + us.ihmc.idl.CDR.alignment(current_alignment, 2);


      return current_alignment - initial_alignment;
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.GeneratorStatus data)
   {
      return getCdrSerializedSize(data, 0);
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.GeneratorStatus data, int current_alignment)
   {
      int initial_alignment = current_alignment;

      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 2 + us.ihmc.idl.CDR.alignment(current_alignment, 2);


      current_alignment += 2 + us.ihmc.idl.CDR.alignment(current_alignment, 2);


      current_alignment += 2 + us.ihmc.idl.CDR.alignment(current_alignment, 2);



      return current_alignment - initial_alignment;
   }

   public static void write(px4_msgs.msg.dds.GeneratorStatus data, us.ihmc.idl.CDR cdr)
   {
      cdr.write_type_12(data.getTimestamp());

      cdr.write_type_12(data.getStatus());

      cdr.write_type_5(data.getBatteryCurrent());

      cdr.write_type_5(data.getLoadCurrent());

      cdr.write_type_5(data.getPowerGenerated());

      cdr.write_type_5(data.getBusVoltage());

      cdr.write_type_5(data.getBatCurrentSetpoint());

      cdr.write_type_4(data.getRuntime());

      cdr.write_type_2(data.getTimeUntilMaintenance());

      cdr.write_type_3(data.getGeneratorSpeed());

      cdr.write_type_1(data.getRectifierTemperature());

      cdr.write_type_1(data.getGeneratorTemperature());

   }

   public static void read(px4_msgs.msg.dds.GeneratorStatus data, us.ihmc.idl.CDR cdr)
   {
      data.setTimestamp(cdr.read_type_12());
      	
      data.setStatus(cdr.read_type_12());
      	
      data.setBatteryCurrent(cdr.read_type_5());
      	
      data.setLoadCurrent(cdr.read_type_5());
      	
      data.setPowerGenerated(cdr.read_type_5());
      	
      data.setBusVoltage(cdr.read_type_5());
      	
      data.setBatCurrentSetpoint(cdr.read_type_5());
      	
      data.setRuntime(cdr.read_type_4());
      	
      data.setTimeUntilMaintenance(cdr.read_type_2());
      	
      data.setGeneratorSpeed(cdr.read_type_3());
      	
      data.setRectifierTemperature(cdr.read_type_1());
      	
      data.setGeneratorTemperature(cdr.read_type_1());
      	

   }

   @Override
   public final void serialize(px4_msgs.msg.dds.GeneratorStatus data, us.ihmc.idl.InterchangeSerializer ser)
   {
      ser.write_type_12("timestamp", data.getTimestamp());
      ser.write_type_12("status", data.getStatus());
      ser.write_type_5("battery_current", data.getBatteryCurrent());
      ser.write_type_5("load_current", data.getLoadCurrent());
      ser.write_type_5("power_generated", data.getPowerGenerated());
      ser.write_type_5("bus_voltage", data.getBusVoltage());
      ser.write_type_5("bat_current_setpoint", data.getBatCurrentSetpoint());
      ser.write_type_4("runtime", data.getRuntime());
      ser.write_type_2("time_until_maintenance", data.getTimeUntilMaintenance());
      ser.write_type_3("generator_speed", data.getGeneratorSpeed());
      ser.write_type_1("rectifier_temperature", data.getRectifierTemperature());
      ser.write_type_1("generator_temperature", data.getGeneratorTemperature());
   }

   @Override
   public final void deserialize(us.ihmc.idl.InterchangeSerializer ser, px4_msgs.msg.dds.GeneratorStatus data)
   {
      data.setTimestamp(ser.read_type_12("timestamp"));
      data.setStatus(ser.read_type_12("status"));
      data.setBatteryCurrent(ser.read_type_5("battery_current"));
      data.setLoadCurrent(ser.read_type_5("load_current"));
      data.setPowerGenerated(ser.read_type_5("power_generated"));
      data.setBusVoltage(ser.read_type_5("bus_voltage"));
      data.setBatCurrentSetpoint(ser.read_type_5("bat_current_setpoint"));
      data.setRuntime(ser.read_type_4("runtime"));
      data.setTimeUntilMaintenance(ser.read_type_2("time_until_maintenance"));
      data.setGeneratorSpeed(ser.read_type_3("generator_speed"));
      data.setRectifierTemperature(ser.read_type_1("rectifier_temperature"));
      data.setGeneratorTemperature(ser.read_type_1("generator_temperature"));
   }

   public static void staticCopy(px4_msgs.msg.dds.GeneratorStatus src, px4_msgs.msg.dds.GeneratorStatus dest)
   {
      dest.set(src);
   }

   @Override
   public px4_msgs.msg.dds.GeneratorStatus createData()
   {
      return new px4_msgs.msg.dds.GeneratorStatus();
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
   
   public void serialize(px4_msgs.msg.dds.GeneratorStatus data, us.ihmc.idl.CDR cdr)
   {
      write(data, cdr);
   }

   public void deserialize(px4_msgs.msg.dds.GeneratorStatus data, us.ihmc.idl.CDR cdr)
   {
      read(data, cdr);
   }
   
   public void copy(px4_msgs.msg.dds.GeneratorStatus src, px4_msgs.msg.dds.GeneratorStatus dest)
   {
      staticCopy(src, dest);
   }

   @Override
   public GeneratorStatusPubSubType newInstance()
   {
      return new GeneratorStatusPubSubType();
   }
}
