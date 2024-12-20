package px4_msgs.msg.dds;

/**
* 
* Topic data type of the struct "TecsStatus" defined in "TecsStatus_.idl". Use this class to provide the TopicDataType to a Participant. 
*
* This file was automatically generated from TecsStatus_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit TecsStatus_.idl instead.
*
*/
public class TecsStatusPubSubType implements us.ihmc.pubsub.TopicDataType<px4_msgs.msg.dds.TecsStatus>
{
   public static final java.lang.String name = "px4_msgs::msg::dds_::TecsStatus_";
   
   @Override
   public final java.lang.String getDefinitionChecksum()
   {
   		return "fe9d12763460c7d41b5cfac682a78cf2c7b48abe376e2d22ffcd307dfc94b8b5";
   }
   
   @Override
   public final java.lang.String getDefinitionVersion()
   {
   		return "";
   }

   private final us.ihmc.idl.CDR serializeCDR = new us.ihmc.idl.CDR();
   private final us.ihmc.idl.CDR deserializeCDR = new us.ihmc.idl.CDR();

   @Override
   public void serialize(px4_msgs.msg.dds.TecsStatus data, us.ihmc.pubsub.common.SerializedPayload serializedPayload) throws java.io.IOException
   {
      serializeCDR.serialize(serializedPayload);
      write(data, serializeCDR);
      serializeCDR.finishSerialize();
   }

   @Override
   public void deserialize(us.ihmc.pubsub.common.SerializedPayload serializedPayload, px4_msgs.msg.dds.TecsStatus data) throws java.io.IOException
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

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.TecsStatus data)
   {
      return getCdrSerializedSize(data, 0);
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.TecsStatus data, int current_alignment)
   {
      int initial_alignment = current_alignment;

      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


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


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);



      return current_alignment - initial_alignment;
   }

   public static void write(px4_msgs.msg.dds.TecsStatus data, us.ihmc.idl.CDR cdr)
   {
      cdr.write_type_12(data.getTimestamp());

      cdr.write_type_5(data.getAltitudeSp());

      cdr.write_type_5(data.getAltitudeReference());

      cdr.write_type_5(data.getAltitudeTimeConstant());

      cdr.write_type_5(data.getHeightRateReference());

      cdr.write_type_5(data.getHeightRateDirect());

      cdr.write_type_5(data.getHeightRateSetpoint());

      cdr.write_type_5(data.getHeightRate());

      cdr.write_type_5(data.getEquivalentAirspeedSp());

      cdr.write_type_5(data.getTrueAirspeedSp());

      cdr.write_type_5(data.getTrueAirspeedFiltered());

      cdr.write_type_5(data.getTrueAirspeedDerivativeSp());

      cdr.write_type_5(data.getTrueAirspeedDerivative());

      cdr.write_type_5(data.getTrueAirspeedDerivativeRaw());

      cdr.write_type_5(data.getTotalEnergyRateSp());

      cdr.write_type_5(data.getTotalEnergyRate());

      cdr.write_type_5(data.getTotalEnergyBalanceRateSp());

      cdr.write_type_5(data.getTotalEnergyBalanceRate());

      cdr.write_type_5(data.getThrottleInteg());

      cdr.write_type_5(data.getPitchInteg());

      cdr.write_type_5(data.getThrottleSp());

      cdr.write_type_5(data.getPitchSpRad());

      cdr.write_type_5(data.getThrottleTrim());

      cdr.write_type_5(data.getUnderspeedRatio());

      cdr.write_type_5(data.getFastDescendRatio());

   }

   public static void read(px4_msgs.msg.dds.TecsStatus data, us.ihmc.idl.CDR cdr)
   {
      data.setTimestamp(cdr.read_type_12());
      	
      data.setAltitudeSp(cdr.read_type_5());
      	
      data.setAltitudeReference(cdr.read_type_5());
      	
      data.setAltitudeTimeConstant(cdr.read_type_5());
      	
      data.setHeightRateReference(cdr.read_type_5());
      	
      data.setHeightRateDirect(cdr.read_type_5());
      	
      data.setHeightRateSetpoint(cdr.read_type_5());
      	
      data.setHeightRate(cdr.read_type_5());
      	
      data.setEquivalentAirspeedSp(cdr.read_type_5());
      	
      data.setTrueAirspeedSp(cdr.read_type_5());
      	
      data.setTrueAirspeedFiltered(cdr.read_type_5());
      	
      data.setTrueAirspeedDerivativeSp(cdr.read_type_5());
      	
      data.setTrueAirspeedDerivative(cdr.read_type_5());
      	
      data.setTrueAirspeedDerivativeRaw(cdr.read_type_5());
      	
      data.setTotalEnergyRateSp(cdr.read_type_5());
      	
      data.setTotalEnergyRate(cdr.read_type_5());
      	
      data.setTotalEnergyBalanceRateSp(cdr.read_type_5());
      	
      data.setTotalEnergyBalanceRate(cdr.read_type_5());
      	
      data.setThrottleInteg(cdr.read_type_5());
      	
      data.setPitchInteg(cdr.read_type_5());
      	
      data.setThrottleSp(cdr.read_type_5());
      	
      data.setPitchSpRad(cdr.read_type_5());
      	
      data.setThrottleTrim(cdr.read_type_5());
      	
      data.setUnderspeedRatio(cdr.read_type_5());
      	
      data.setFastDescendRatio(cdr.read_type_5());
      	

   }

   @Override
   public final void serialize(px4_msgs.msg.dds.TecsStatus data, us.ihmc.idl.InterchangeSerializer ser)
   {
      ser.write_type_12("timestamp", data.getTimestamp());
      ser.write_type_5("altitude_sp", data.getAltitudeSp());
      ser.write_type_5("altitude_reference", data.getAltitudeReference());
      ser.write_type_5("altitude_time_constant", data.getAltitudeTimeConstant());
      ser.write_type_5("height_rate_reference", data.getHeightRateReference());
      ser.write_type_5("height_rate_direct", data.getHeightRateDirect());
      ser.write_type_5("height_rate_setpoint", data.getHeightRateSetpoint());
      ser.write_type_5("height_rate", data.getHeightRate());
      ser.write_type_5("equivalent_airspeed_sp", data.getEquivalentAirspeedSp());
      ser.write_type_5("true_airspeed_sp", data.getTrueAirspeedSp());
      ser.write_type_5("true_airspeed_filtered", data.getTrueAirspeedFiltered());
      ser.write_type_5("true_airspeed_derivative_sp", data.getTrueAirspeedDerivativeSp());
      ser.write_type_5("true_airspeed_derivative", data.getTrueAirspeedDerivative());
      ser.write_type_5("true_airspeed_derivative_raw", data.getTrueAirspeedDerivativeRaw());
      ser.write_type_5("total_energy_rate_sp", data.getTotalEnergyRateSp());
      ser.write_type_5("total_energy_rate", data.getTotalEnergyRate());
      ser.write_type_5("total_energy_balance_rate_sp", data.getTotalEnergyBalanceRateSp());
      ser.write_type_5("total_energy_balance_rate", data.getTotalEnergyBalanceRate());
      ser.write_type_5("throttle_integ", data.getThrottleInteg());
      ser.write_type_5("pitch_integ", data.getPitchInteg());
      ser.write_type_5("throttle_sp", data.getThrottleSp());
      ser.write_type_5("pitch_sp_rad", data.getPitchSpRad());
      ser.write_type_5("throttle_trim", data.getThrottleTrim());
      ser.write_type_5("underspeed_ratio", data.getUnderspeedRatio());
      ser.write_type_5("fast_descend_ratio", data.getFastDescendRatio());
   }

   @Override
   public final void deserialize(us.ihmc.idl.InterchangeSerializer ser, px4_msgs.msg.dds.TecsStatus data)
   {
      data.setTimestamp(ser.read_type_12("timestamp"));
      data.setAltitudeSp(ser.read_type_5("altitude_sp"));
      data.setAltitudeReference(ser.read_type_5("altitude_reference"));
      data.setAltitudeTimeConstant(ser.read_type_5("altitude_time_constant"));
      data.setHeightRateReference(ser.read_type_5("height_rate_reference"));
      data.setHeightRateDirect(ser.read_type_5("height_rate_direct"));
      data.setHeightRateSetpoint(ser.read_type_5("height_rate_setpoint"));
      data.setHeightRate(ser.read_type_5("height_rate"));
      data.setEquivalentAirspeedSp(ser.read_type_5("equivalent_airspeed_sp"));
      data.setTrueAirspeedSp(ser.read_type_5("true_airspeed_sp"));
      data.setTrueAirspeedFiltered(ser.read_type_5("true_airspeed_filtered"));
      data.setTrueAirspeedDerivativeSp(ser.read_type_5("true_airspeed_derivative_sp"));
      data.setTrueAirspeedDerivative(ser.read_type_5("true_airspeed_derivative"));
      data.setTrueAirspeedDerivativeRaw(ser.read_type_5("true_airspeed_derivative_raw"));
      data.setTotalEnergyRateSp(ser.read_type_5("total_energy_rate_sp"));
      data.setTotalEnergyRate(ser.read_type_5("total_energy_rate"));
      data.setTotalEnergyBalanceRateSp(ser.read_type_5("total_energy_balance_rate_sp"));
      data.setTotalEnergyBalanceRate(ser.read_type_5("total_energy_balance_rate"));
      data.setThrottleInteg(ser.read_type_5("throttle_integ"));
      data.setPitchInteg(ser.read_type_5("pitch_integ"));
      data.setThrottleSp(ser.read_type_5("throttle_sp"));
      data.setPitchSpRad(ser.read_type_5("pitch_sp_rad"));
      data.setThrottleTrim(ser.read_type_5("throttle_trim"));
      data.setUnderspeedRatio(ser.read_type_5("underspeed_ratio"));
      data.setFastDescendRatio(ser.read_type_5("fast_descend_ratio"));
   }

   public static void staticCopy(px4_msgs.msg.dds.TecsStatus src, px4_msgs.msg.dds.TecsStatus dest)
   {
      dest.set(src);
   }

   @Override
   public px4_msgs.msg.dds.TecsStatus createData()
   {
      return new px4_msgs.msg.dds.TecsStatus();
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
   
   public void serialize(px4_msgs.msg.dds.TecsStatus data, us.ihmc.idl.CDR cdr)
   {
      write(data, cdr);
   }

   public void deserialize(px4_msgs.msg.dds.TecsStatus data, us.ihmc.idl.CDR cdr)
   {
      read(data, cdr);
   }
   
   public void copy(px4_msgs.msg.dds.TecsStatus src, px4_msgs.msg.dds.TecsStatus dest)
   {
      staticCopy(src, dest);
   }

   @Override
   public TecsStatusPubSubType newInstance()
   {
      return new TecsStatusPubSubType();
   }
}
