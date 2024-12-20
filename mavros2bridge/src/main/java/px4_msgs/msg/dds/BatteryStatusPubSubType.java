package px4_msgs.msg.dds;

/**
* 
* Topic data type of the struct "BatteryStatus" defined in "BatteryStatus_.idl". Use this class to provide the TopicDataType to a Participant. 
*
* This file was automatically generated from BatteryStatus_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit BatteryStatus_.idl instead.
*
*/
public class BatteryStatusPubSubType implements us.ihmc.pubsub.TopicDataType<px4_msgs.msg.dds.BatteryStatus>
{
   public static final java.lang.String name = "px4_msgs::msg::dds_::BatteryStatus_";
   
   @Override
   public final java.lang.String getDefinitionChecksum()
   {
   		return "8dc13ce8594e7c720a279f322461e1684fb36f697398413598934915f54ed6ac";
   }
   
   @Override
   public final java.lang.String getDefinitionVersion()
   {
   		return "";
   }

   private final us.ihmc.idl.CDR serializeCDR = new us.ihmc.idl.CDR();
   private final us.ihmc.idl.CDR deserializeCDR = new us.ihmc.idl.CDR();

   @Override
   public void serialize(px4_msgs.msg.dds.BatteryStatus data, us.ihmc.pubsub.common.SerializedPayload serializedPayload) throws java.io.IOException
   {
      serializeCDR.serialize(serializedPayload);
      write(data, serializeCDR);
      serializeCDR.finishSerialize();
   }

   @Override
   public void deserialize(us.ihmc.pubsub.common.SerializedPayload serializedPayload, px4_msgs.msg.dds.BatteryStatus data) throws java.io.IOException
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

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 2 + us.ihmc.idl.CDR.alignment(current_alignment, 2);

      current_alignment += 2 + us.ihmc.idl.CDR.alignment(current_alignment, 2);

      current_alignment += 2 + us.ihmc.idl.CDR.alignment(current_alignment, 2);

      current_alignment += 2 + us.ihmc.idl.CDR.alignment(current_alignment, 2);

      current_alignment += 2 + us.ihmc.idl.CDR.alignment(current_alignment, 2);

      current_alignment += 2 + us.ihmc.idl.CDR.alignment(current_alignment, 2);

      current_alignment += 2 + us.ihmc.idl.CDR.alignment(current_alignment, 2);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 2 + us.ihmc.idl.CDR.alignment(current_alignment, 2);

      current_alignment += ((14) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 2 + us.ihmc.idl.CDR.alignment(current_alignment, 2);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 2 + us.ihmc.idl.CDR.alignment(current_alignment, 2);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      return current_alignment - initial_alignment;
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.BatteryStatus data)
   {
      return getCdrSerializedSize(data, 0);
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.BatteryStatus data, int current_alignment)
   {
      int initial_alignment = current_alignment;

      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 2 + us.ihmc.idl.CDR.alignment(current_alignment, 2);


      current_alignment += 2 + us.ihmc.idl.CDR.alignment(current_alignment, 2);


      current_alignment += 2 + us.ihmc.idl.CDR.alignment(current_alignment, 2);


      current_alignment += 2 + us.ihmc.idl.CDR.alignment(current_alignment, 2);


      current_alignment += 2 + us.ihmc.idl.CDR.alignment(current_alignment, 2);


      current_alignment += 2 + us.ihmc.idl.CDR.alignment(current_alignment, 2);


      current_alignment += 2 + us.ihmc.idl.CDR.alignment(current_alignment, 2);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 2 + us.ihmc.idl.CDR.alignment(current_alignment, 2);


      current_alignment += ((14) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);
      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 2 + us.ihmc.idl.CDR.alignment(current_alignment, 2);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 2 + us.ihmc.idl.CDR.alignment(current_alignment, 2);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);



      return current_alignment - initial_alignment;
   }

   public static void write(px4_msgs.msg.dds.BatteryStatus data, us.ihmc.idl.CDR cdr)
   {
      cdr.write_type_12(data.getTimestamp());

      cdr.write_type_7(data.getConnected());

      cdr.write_type_5(data.getVoltageV());

      cdr.write_type_5(data.getCurrentA());

      cdr.write_type_5(data.getCurrentAverageA());

      cdr.write_type_5(data.getDischargedMah());

      cdr.write_type_5(data.getRemaining());

      cdr.write_type_5(data.getScale());

      cdr.write_type_5(data.getTimeRemainingS());

      cdr.write_type_5(data.getTemperature());

      cdr.write_type_9(data.getCellCount());

      cdr.write_type_9((byte) data.getSource());

      cdr.write_type_9(data.getPriority());

      cdr.write_type_3(data.getCapacity());

      cdr.write_type_3(data.getCycleCount());

      cdr.write_type_3(data.getAverageTimeToEmpty());

      cdr.write_type_3(data.getSerialNumber());

      cdr.write_type_3(data.getManufactureDate());

      cdr.write_type_3(data.getStateOfHealth());

      cdr.write_type_3(data.getMaxError());

      cdr.write_type_9(data.getId());

      cdr.write_type_3(data.getInterfaceError());

      for(int i0 = 0; i0 < data.getVoltageCellV().length; ++i0)
      {
        	cdr.write_type_5(data.getVoltageCellV()[i0]);	
      }

      cdr.write_type_5(data.getMaxCellVoltageDelta());

      cdr.write_type_7(data.getIsPoweringOff());

      cdr.write_type_7(data.getIsRequired());

      cdr.write_type_3(data.getFaults());

      cdr.write_type_9(data.getWarning());

      cdr.write_type_5(data.getFullChargeCapacityWh());

      cdr.write_type_5(data.getRemainingCapacityWh());

      cdr.write_type_3(data.getOverDischargeCount());

      cdr.write_type_5(data.getNominalVoltage());

      cdr.write_type_5(data.getInternalResistanceEstimate());

      cdr.write_type_5(data.getOcvEstimate());

      cdr.write_type_5(data.getOcvEstimateFiltered());

      cdr.write_type_5(data.getVoltBasedSocEstimate());

      cdr.write_type_5(data.getVoltagePrediction());

      cdr.write_type_5(data.getPredictionError());

      cdr.write_type_5(data.getEstimationCovarianceNorm());

   }

   public static void read(px4_msgs.msg.dds.BatteryStatus data, us.ihmc.idl.CDR cdr)
   {
      data.setTimestamp(cdr.read_type_12());
      	
      data.setConnected(cdr.read_type_7());
      	
      data.setVoltageV(cdr.read_type_5());
      	
      data.setCurrentA(cdr.read_type_5());
      	
      data.setCurrentAverageA(cdr.read_type_5());
      	
      data.setDischargedMah(cdr.read_type_5());
      	
      data.setRemaining(cdr.read_type_5());
      	
      data.setScale(cdr.read_type_5());
      	
      data.setTimeRemainingS(cdr.read_type_5());
      	
      data.setTemperature(cdr.read_type_5());
      	
      data.setCellCount(cdr.read_type_9());
      	
      data.setSource(cdr.read_type_9());
      	
      data.setPriority(cdr.read_type_9());
      	
      data.setCapacity(cdr.read_type_3());
      	
      data.setCycleCount(cdr.read_type_3());
      	
      data.setAverageTimeToEmpty(cdr.read_type_3());
      	
      data.setSerialNumber(cdr.read_type_3());
      	
      data.setManufactureDate(cdr.read_type_3());
      	
      data.setStateOfHealth(cdr.read_type_3());
      	
      data.setMaxError(cdr.read_type_3());
      	
      data.setId(cdr.read_type_9());
      	
      data.setInterfaceError(cdr.read_type_3());
      	
      for(int i0 = 0; i0 < data.getVoltageCellV().length; ++i0)
      {
        	data.getVoltageCellV()[i0] = cdr.read_type_5();
        	
      }
      	
      data.setMaxCellVoltageDelta(cdr.read_type_5());
      	
      data.setIsPoweringOff(cdr.read_type_7());
      	
      data.setIsRequired(cdr.read_type_7());
      	
      data.setFaults(cdr.read_type_3());
      	
      data.setWarning(cdr.read_type_9());
      	
      data.setFullChargeCapacityWh(cdr.read_type_5());
      	
      data.setRemainingCapacityWh(cdr.read_type_5());
      	
      data.setOverDischargeCount(cdr.read_type_3());
      	
      data.setNominalVoltage(cdr.read_type_5());
      	
      data.setInternalResistanceEstimate(cdr.read_type_5());
      	
      data.setOcvEstimate(cdr.read_type_5());
      	
      data.setOcvEstimateFiltered(cdr.read_type_5());
      	
      data.setVoltBasedSocEstimate(cdr.read_type_5());
      	
      data.setVoltagePrediction(cdr.read_type_5());
      	
      data.setPredictionError(cdr.read_type_5());
      	
      data.setEstimationCovarianceNorm(cdr.read_type_5());
      	

   }

   @Override
   public final void serialize(px4_msgs.msg.dds.BatteryStatus data, us.ihmc.idl.InterchangeSerializer ser)
   {
      ser.write_type_12("timestamp", data.getTimestamp());
      ser.write_type_7("connected", data.getConnected());
      ser.write_type_5("voltage_v", data.getVoltageV());
      ser.write_type_5("current_a", data.getCurrentA());
      ser.write_type_5("current_average_a", data.getCurrentAverageA());
      ser.write_type_5("discharged_mah", data.getDischargedMah());
      ser.write_type_5("remaining", data.getRemaining());
      ser.write_type_5("scale", data.getScale());
      ser.write_type_5("time_remaining_s", data.getTimeRemainingS());
      ser.write_type_5("temperature", data.getTemperature());
      ser.write_type_9("cell_count", data.getCellCount());
      ser.write_type_9("source", (byte) data.getSource());
      ser.write_type_9("priority", data.getPriority());
      ser.write_type_3("capacity", data.getCapacity());
      ser.write_type_3("cycle_count", data.getCycleCount());
      ser.write_type_3("average_time_to_empty", data.getAverageTimeToEmpty());
      ser.write_type_3("serial_number", data.getSerialNumber());
      ser.write_type_3("manufacture_date", data.getManufactureDate());
      ser.write_type_3("state_of_health", data.getStateOfHealth());
      ser.write_type_3("max_error", data.getMaxError());
      ser.write_type_9("id", data.getId());
      ser.write_type_3("interface_error", data.getInterfaceError());
      ser.write_type_f("voltage_cell_v", data.getVoltageCellV());
      ser.write_type_5("max_cell_voltage_delta", data.getMaxCellVoltageDelta());
      ser.write_type_7("is_powering_off", data.getIsPoweringOff());
      ser.write_type_7("is_required", data.getIsRequired());
      ser.write_type_3("faults", data.getFaults());
      ser.write_type_9("warning", data.getWarning());
      ser.write_type_5("full_charge_capacity_wh", data.getFullChargeCapacityWh());
      ser.write_type_5("remaining_capacity_wh", data.getRemainingCapacityWh());
      ser.write_type_3("over_discharge_count", data.getOverDischargeCount());
      ser.write_type_5("nominal_voltage", data.getNominalVoltage());
      ser.write_type_5("internal_resistance_estimate", data.getInternalResistanceEstimate());
      ser.write_type_5("ocv_estimate", data.getOcvEstimate());
      ser.write_type_5("ocv_estimate_filtered", data.getOcvEstimateFiltered());
      ser.write_type_5("volt_based_soc_estimate", data.getVoltBasedSocEstimate());
      ser.write_type_5("voltage_prediction", data.getVoltagePrediction());
      ser.write_type_5("prediction_error", data.getPredictionError());
      ser.write_type_5("estimation_covariance_norm", data.getEstimationCovarianceNorm());
   }

   @Override
   public final void deserialize(us.ihmc.idl.InterchangeSerializer ser, px4_msgs.msg.dds.BatteryStatus data)
   {
      data.setTimestamp(ser.read_type_12("timestamp"));
      data.setConnected(ser.read_type_7("connected"));
      data.setVoltageV(ser.read_type_5("voltage_v"));
      data.setCurrentA(ser.read_type_5("current_a"));
      data.setCurrentAverageA(ser.read_type_5("current_average_a"));
      data.setDischargedMah(ser.read_type_5("discharged_mah"));
      data.setRemaining(ser.read_type_5("remaining"));
      data.setScale(ser.read_type_5("scale"));
      data.setTimeRemainingS(ser.read_type_5("time_remaining_s"));
      data.setTemperature(ser.read_type_5("temperature"));
      data.setCellCount(ser.read_type_9("cell_count"));
      data.setSource(ser.read_type_9("source"));
      data.setPriority(ser.read_type_9("priority"));
      data.setCapacity(ser.read_type_3("capacity"));
      data.setCycleCount(ser.read_type_3("cycle_count"));
      data.setAverageTimeToEmpty(ser.read_type_3("average_time_to_empty"));
      data.setSerialNumber(ser.read_type_3("serial_number"));
      data.setManufactureDate(ser.read_type_3("manufacture_date"));
      data.setStateOfHealth(ser.read_type_3("state_of_health"));
      data.setMaxError(ser.read_type_3("max_error"));
      data.setId(ser.read_type_9("id"));
      data.setInterfaceError(ser.read_type_3("interface_error"));
      ser.read_type_f("voltage_cell_v", data.getVoltageCellV());
      data.setMaxCellVoltageDelta(ser.read_type_5("max_cell_voltage_delta"));
      data.setIsPoweringOff(ser.read_type_7("is_powering_off"));
      data.setIsRequired(ser.read_type_7("is_required"));
      data.setFaults(ser.read_type_3("faults"));
      data.setWarning(ser.read_type_9("warning"));
      data.setFullChargeCapacityWh(ser.read_type_5("full_charge_capacity_wh"));
      data.setRemainingCapacityWh(ser.read_type_5("remaining_capacity_wh"));
      data.setOverDischargeCount(ser.read_type_3("over_discharge_count"));
      data.setNominalVoltage(ser.read_type_5("nominal_voltage"));
      data.setInternalResistanceEstimate(ser.read_type_5("internal_resistance_estimate"));
      data.setOcvEstimate(ser.read_type_5("ocv_estimate"));
      data.setOcvEstimateFiltered(ser.read_type_5("ocv_estimate_filtered"));
      data.setVoltBasedSocEstimate(ser.read_type_5("volt_based_soc_estimate"));
      data.setVoltagePrediction(ser.read_type_5("voltage_prediction"));
      data.setPredictionError(ser.read_type_5("prediction_error"));
      data.setEstimationCovarianceNorm(ser.read_type_5("estimation_covariance_norm"));
   }

   public static void staticCopy(px4_msgs.msg.dds.BatteryStatus src, px4_msgs.msg.dds.BatteryStatus dest)
   {
      dest.set(src);
   }

   @Override
   public px4_msgs.msg.dds.BatteryStatus createData()
   {
      return new px4_msgs.msg.dds.BatteryStatus();
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
   
   public void serialize(px4_msgs.msg.dds.BatteryStatus data, us.ihmc.idl.CDR cdr)
   {
      write(data, cdr);
   }

   public void deserialize(px4_msgs.msg.dds.BatteryStatus data, us.ihmc.idl.CDR cdr)
   {
      read(data, cdr);
   }
   
   public void copy(px4_msgs.msg.dds.BatteryStatus src, px4_msgs.msg.dds.BatteryStatus dest)
   {
      staticCopy(src, dest);
   }

   @Override
   public BatteryStatusPubSubType newInstance()
   {
      return new BatteryStatusPubSubType();
   }
}
