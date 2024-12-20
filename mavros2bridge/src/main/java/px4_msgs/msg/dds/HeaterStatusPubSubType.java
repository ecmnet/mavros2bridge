package px4_msgs.msg.dds;

/**
* 
* Topic data type of the struct "HeaterStatus" defined in "HeaterStatus_.idl". Use this class to provide the TopicDataType to a Participant. 
*
* This file was automatically generated from HeaterStatus_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit HeaterStatus_.idl instead.
*
*/
public class HeaterStatusPubSubType implements us.ihmc.pubsub.TopicDataType<px4_msgs.msg.dds.HeaterStatus>
{
   public static final java.lang.String name = "px4_msgs::msg::dds_::HeaterStatus_";
   
   @Override
   public final java.lang.String getDefinitionChecksum()
   {
   		return "67b8976f1e9aa79918902db94f53090bb88f75cadf0fd886006426d52d918bf6";
   }
   
   @Override
   public final java.lang.String getDefinitionVersion()
   {
   		return "";
   }

   private final us.ihmc.idl.CDR serializeCDR = new us.ihmc.idl.CDR();
   private final us.ihmc.idl.CDR deserializeCDR = new us.ihmc.idl.CDR();

   @Override
   public void serialize(px4_msgs.msg.dds.HeaterStatus data, us.ihmc.pubsub.common.SerializedPayload serializedPayload) throws java.io.IOException
   {
      serializeCDR.serialize(serializedPayload);
      write(data, serializeCDR);
      serializeCDR.finishSerialize();
   }

   @Override
   public void deserialize(us.ihmc.pubsub.common.SerializedPayload serializedPayload, px4_msgs.msg.dds.HeaterStatus data) throws java.io.IOException
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

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      return current_alignment - initial_alignment;
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.HeaterStatus data)
   {
      return getCdrSerializedSize(data, 0);
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.HeaterStatus data, int current_alignment)
   {
      int initial_alignment = current_alignment;

      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);



      return current_alignment - initial_alignment;
   }

   public static void write(px4_msgs.msg.dds.HeaterStatus data, us.ihmc.idl.CDR cdr)
   {
      cdr.write_type_12(data.getTimestamp());

      cdr.write_type_4(data.getDeviceId());

      cdr.write_type_7(data.getHeaterOn());

      cdr.write_type_7(data.getTemperatureTargetMet());

      cdr.write_type_5(data.getTemperatureSensor());

      cdr.write_type_5(data.getTemperatureTarget());

      cdr.write_type_4(data.getControllerPeriodUsec());

      cdr.write_type_4(data.getControllerTimeOnUsec());

      cdr.write_type_5(data.getProportionalValue());

      cdr.write_type_5(data.getIntegratorValue());

      cdr.write_type_5(data.getFeedForwardValue());

      cdr.write_type_9(data.getMode());

   }

   public static void read(px4_msgs.msg.dds.HeaterStatus data, us.ihmc.idl.CDR cdr)
   {
      data.setTimestamp(cdr.read_type_12());
      	
      data.setDeviceId(cdr.read_type_4());
      	
      data.setHeaterOn(cdr.read_type_7());
      	
      data.setTemperatureTargetMet(cdr.read_type_7());
      	
      data.setTemperatureSensor(cdr.read_type_5());
      	
      data.setTemperatureTarget(cdr.read_type_5());
      	
      data.setControllerPeriodUsec(cdr.read_type_4());
      	
      data.setControllerTimeOnUsec(cdr.read_type_4());
      	
      data.setProportionalValue(cdr.read_type_5());
      	
      data.setIntegratorValue(cdr.read_type_5());
      	
      data.setFeedForwardValue(cdr.read_type_5());
      	
      data.setMode(cdr.read_type_9());
      	

   }

   @Override
   public final void serialize(px4_msgs.msg.dds.HeaterStatus data, us.ihmc.idl.InterchangeSerializer ser)
   {
      ser.write_type_12("timestamp", data.getTimestamp());
      ser.write_type_4("device_id", data.getDeviceId());
      ser.write_type_7("heater_on", data.getHeaterOn());
      ser.write_type_7("temperature_target_met", data.getTemperatureTargetMet());
      ser.write_type_5("temperature_sensor", data.getTemperatureSensor());
      ser.write_type_5("temperature_target", data.getTemperatureTarget());
      ser.write_type_4("controller_period_usec", data.getControllerPeriodUsec());
      ser.write_type_4("controller_time_on_usec", data.getControllerTimeOnUsec());
      ser.write_type_5("proportional_value", data.getProportionalValue());
      ser.write_type_5("integrator_value", data.getIntegratorValue());
      ser.write_type_5("feed_forward_value", data.getFeedForwardValue());
      ser.write_type_9("mode", data.getMode());
   }

   @Override
   public final void deserialize(us.ihmc.idl.InterchangeSerializer ser, px4_msgs.msg.dds.HeaterStatus data)
   {
      data.setTimestamp(ser.read_type_12("timestamp"));
      data.setDeviceId(ser.read_type_4("device_id"));
      data.setHeaterOn(ser.read_type_7("heater_on"));
      data.setTemperatureTargetMet(ser.read_type_7("temperature_target_met"));
      data.setTemperatureSensor(ser.read_type_5("temperature_sensor"));
      data.setTemperatureTarget(ser.read_type_5("temperature_target"));
      data.setControllerPeriodUsec(ser.read_type_4("controller_period_usec"));
      data.setControllerTimeOnUsec(ser.read_type_4("controller_time_on_usec"));
      data.setProportionalValue(ser.read_type_5("proportional_value"));
      data.setIntegratorValue(ser.read_type_5("integrator_value"));
      data.setFeedForwardValue(ser.read_type_5("feed_forward_value"));
      data.setMode(ser.read_type_9("mode"));
   }

   public static void staticCopy(px4_msgs.msg.dds.HeaterStatus src, px4_msgs.msg.dds.HeaterStatus dest)
   {
      dest.set(src);
   }

   @Override
   public px4_msgs.msg.dds.HeaterStatus createData()
   {
      return new px4_msgs.msg.dds.HeaterStatus();
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
   
   public void serialize(px4_msgs.msg.dds.HeaterStatus data, us.ihmc.idl.CDR cdr)
   {
      write(data, cdr);
   }

   public void deserialize(px4_msgs.msg.dds.HeaterStatus data, us.ihmc.idl.CDR cdr)
   {
      read(data, cdr);
   }
   
   public void copy(px4_msgs.msg.dds.HeaterStatus src, px4_msgs.msg.dds.HeaterStatus dest)
   {
      staticCopy(src, dest);
   }

   @Override
   public HeaterStatusPubSubType newInstance()
   {
      return new HeaterStatusPubSubType();
   }
}
