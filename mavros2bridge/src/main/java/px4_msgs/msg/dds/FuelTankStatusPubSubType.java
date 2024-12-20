package px4_msgs.msg.dds;

/**
* 
* Topic data type of the struct "FuelTankStatus" defined in "FuelTankStatus_.idl". Use this class to provide the TopicDataType to a Participant. 
*
* This file was automatically generated from FuelTankStatus_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit FuelTankStatus_.idl instead.
*
*/
public class FuelTankStatusPubSubType implements us.ihmc.pubsub.TopicDataType<px4_msgs.msg.dds.FuelTankStatus>
{
   public static final java.lang.String name = "px4_msgs::msg::dds_::FuelTankStatus_";
   
   @Override
   public final java.lang.String getDefinitionChecksum()
   {
   		return "329f8f05a9ba47069612f8c453262d6cd94bc40bb4065dde0938838e43a9d103";
   }
   
   @Override
   public final java.lang.String getDefinitionVersion()
   {
   		return "";
   }

   private final us.ihmc.idl.CDR serializeCDR = new us.ihmc.idl.CDR();
   private final us.ihmc.idl.CDR deserializeCDR = new us.ihmc.idl.CDR();

   @Override
   public void serialize(px4_msgs.msg.dds.FuelTankStatus data, us.ihmc.pubsub.common.SerializedPayload serializedPayload) throws java.io.IOException
   {
      serializeCDR.serialize(serializedPayload);
      write(data, serializeCDR);
      serializeCDR.finishSerialize();
   }

   @Override
   public void deserialize(us.ihmc.pubsub.common.SerializedPayload serializedPayload, px4_msgs.msg.dds.FuelTankStatus data) throws java.io.IOException
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

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      return current_alignment - initial_alignment;
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.FuelTankStatus data)
   {
      return getCdrSerializedSize(data, 0);
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.FuelTankStatus data, int current_alignment)
   {
      int initial_alignment = current_alignment;

      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);



      return current_alignment - initial_alignment;
   }

   public static void write(px4_msgs.msg.dds.FuelTankStatus data, us.ihmc.idl.CDR cdr)
   {
      cdr.write_type_12(data.getTimestamp());

      cdr.write_type_5(data.getMaximumFuelCapacity());

      cdr.write_type_5(data.getConsumedFuel());

      cdr.write_type_5(data.getFuelConsumptionRate());

      cdr.write_type_9(data.getPercentRemaining());

      cdr.write_type_5(data.getRemainingFuel());

      cdr.write_type_9(data.getFuelTankId());

      cdr.write_type_4(data.getFuelType());

      cdr.write_type_5(data.getTemperature());

   }

   public static void read(px4_msgs.msg.dds.FuelTankStatus data, us.ihmc.idl.CDR cdr)
   {
      data.setTimestamp(cdr.read_type_12());
      	
      data.setMaximumFuelCapacity(cdr.read_type_5());
      	
      data.setConsumedFuel(cdr.read_type_5());
      	
      data.setFuelConsumptionRate(cdr.read_type_5());
      	
      data.setPercentRemaining(cdr.read_type_9());
      	
      data.setRemainingFuel(cdr.read_type_5());
      	
      data.setFuelTankId(cdr.read_type_9());
      	
      data.setFuelType(cdr.read_type_4());
      	
      data.setTemperature(cdr.read_type_5());
      	

   }

   @Override
   public final void serialize(px4_msgs.msg.dds.FuelTankStatus data, us.ihmc.idl.InterchangeSerializer ser)
   {
      ser.write_type_12("timestamp", data.getTimestamp());
      ser.write_type_5("maximum_fuel_capacity", data.getMaximumFuelCapacity());
      ser.write_type_5("consumed_fuel", data.getConsumedFuel());
      ser.write_type_5("fuel_consumption_rate", data.getFuelConsumptionRate());
      ser.write_type_9("percent_remaining", data.getPercentRemaining());
      ser.write_type_5("remaining_fuel", data.getRemainingFuel());
      ser.write_type_9("fuel_tank_id", data.getFuelTankId());
      ser.write_type_4("fuel_type", data.getFuelType());
      ser.write_type_5("temperature", data.getTemperature());
   }

   @Override
   public final void deserialize(us.ihmc.idl.InterchangeSerializer ser, px4_msgs.msg.dds.FuelTankStatus data)
   {
      data.setTimestamp(ser.read_type_12("timestamp"));
      data.setMaximumFuelCapacity(ser.read_type_5("maximum_fuel_capacity"));
      data.setConsumedFuel(ser.read_type_5("consumed_fuel"));
      data.setFuelConsumptionRate(ser.read_type_5("fuel_consumption_rate"));
      data.setPercentRemaining(ser.read_type_9("percent_remaining"));
      data.setRemainingFuel(ser.read_type_5("remaining_fuel"));
      data.setFuelTankId(ser.read_type_9("fuel_tank_id"));
      data.setFuelType(ser.read_type_4("fuel_type"));
      data.setTemperature(ser.read_type_5("temperature"));
   }

   public static void staticCopy(px4_msgs.msg.dds.FuelTankStatus src, px4_msgs.msg.dds.FuelTankStatus dest)
   {
      dest.set(src);
   }

   @Override
   public px4_msgs.msg.dds.FuelTankStatus createData()
   {
      return new px4_msgs.msg.dds.FuelTankStatus();
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
   
   public void serialize(px4_msgs.msg.dds.FuelTankStatus data, us.ihmc.idl.CDR cdr)
   {
      write(data, cdr);
   }

   public void deserialize(px4_msgs.msg.dds.FuelTankStatus data, us.ihmc.idl.CDR cdr)
   {
      read(data, cdr);
   }
   
   public void copy(px4_msgs.msg.dds.FuelTankStatus src, px4_msgs.msg.dds.FuelTankStatus dest)
   {
      staticCopy(src, dest);
   }

   @Override
   public FuelTankStatusPubSubType newInstance()
   {
      return new FuelTankStatusPubSubType();
   }
}
