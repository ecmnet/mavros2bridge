package px4_msgs.msg.dds;

/**
* 
* Topic data type of the struct "AirspeedValidated" defined in "AirspeedValidated_.idl". Use this class to provide the TopicDataType to a Participant. 
*
* This file was automatically generated from AirspeedValidated_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit AirspeedValidated_.idl instead.
*
*/
public class AirspeedValidatedPubSubType implements us.ihmc.pubsub.TopicDataType<px4_msgs.msg.dds.AirspeedValidated>
{
   public static final java.lang.String name = "px4_msgs::msg::dds_::AirspeedValidated_";
   
   @Override
   public final java.lang.String getDefinitionChecksum()
   {
   		return "3c685c4818513e91c0b70290e7fcff58a79c291fe7d0ee4ff106bacba11f3af0";
   }
   
   @Override
   public final java.lang.String getDefinitionVersion()
   {
   		return "";
   }

   private final us.ihmc.idl.CDR serializeCDR = new us.ihmc.idl.CDR();
   private final us.ihmc.idl.CDR deserializeCDR = new us.ihmc.idl.CDR();

   @Override
   public void serialize(px4_msgs.msg.dds.AirspeedValidated data, us.ihmc.pubsub.common.SerializedPayload serializedPayload) throws java.io.IOException
   {
      serializeCDR.serialize(serializedPayload);
      write(data, serializeCDR);
      serializeCDR.finishSerialize();
   }

   @Override
   public void deserialize(us.ihmc.pubsub.common.SerializedPayload serializedPayload, px4_msgs.msg.dds.AirspeedValidated data) throws java.io.IOException
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

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      return current_alignment - initial_alignment;
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.AirspeedValidated data)
   {
      return getCdrSerializedSize(data, 0);
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.AirspeedValidated data, int current_alignment)
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


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);



      return current_alignment - initial_alignment;
   }

   public static void write(px4_msgs.msg.dds.AirspeedValidated data, us.ihmc.idl.CDR cdr)
   {
      cdr.write_type_12(data.getTimestamp());

      cdr.write_type_5(data.getIndicatedAirspeedMS());

      cdr.write_type_5(data.getCalibratedAirspeedMS());

      cdr.write_type_5(data.getTrueAirspeedMS());

      cdr.write_type_5(data.getCalibratedGroundMinusWindMS());

      cdr.write_type_5(data.getTrueGroundMinusWindMS());

      cdr.write_type_7(data.getAirspeedSensorMeasurementValid());

      cdr.write_type_9(data.getSelectedAirspeedIndex());

      cdr.write_type_5(data.getAirspeedDerivativeFiltered());

      cdr.write_type_5(data.getThrottleFiltered());

      cdr.write_type_5(data.getPitchFiltered());

   }

   public static void read(px4_msgs.msg.dds.AirspeedValidated data, us.ihmc.idl.CDR cdr)
   {
      data.setTimestamp(cdr.read_type_12());
      	
      data.setIndicatedAirspeedMS(cdr.read_type_5());
      	
      data.setCalibratedAirspeedMS(cdr.read_type_5());
      	
      data.setTrueAirspeedMS(cdr.read_type_5());
      	
      data.setCalibratedGroundMinusWindMS(cdr.read_type_5());
      	
      data.setTrueGroundMinusWindMS(cdr.read_type_5());
      	
      data.setAirspeedSensorMeasurementValid(cdr.read_type_7());
      	
      data.setSelectedAirspeedIndex(cdr.read_type_9());
      	
      data.setAirspeedDerivativeFiltered(cdr.read_type_5());
      	
      data.setThrottleFiltered(cdr.read_type_5());
      	
      data.setPitchFiltered(cdr.read_type_5());
      	

   }

   @Override
   public final void serialize(px4_msgs.msg.dds.AirspeedValidated data, us.ihmc.idl.InterchangeSerializer ser)
   {
      ser.write_type_12("timestamp", data.getTimestamp());
      ser.write_type_5("indicated_airspeed_m_s", data.getIndicatedAirspeedMS());
      ser.write_type_5("calibrated_airspeed_m_s", data.getCalibratedAirspeedMS());
      ser.write_type_5("true_airspeed_m_s", data.getTrueAirspeedMS());
      ser.write_type_5("calibrated_ground_minus_wind_m_s", data.getCalibratedGroundMinusWindMS());
      ser.write_type_5("true_ground_minus_wind_m_s", data.getTrueGroundMinusWindMS());
      ser.write_type_7("airspeed_sensor_measurement_valid", data.getAirspeedSensorMeasurementValid());
      ser.write_type_9("selected_airspeed_index", data.getSelectedAirspeedIndex());
      ser.write_type_5("airspeed_derivative_filtered", data.getAirspeedDerivativeFiltered());
      ser.write_type_5("throttle_filtered", data.getThrottleFiltered());
      ser.write_type_5("pitch_filtered", data.getPitchFiltered());
   }

   @Override
   public final void deserialize(us.ihmc.idl.InterchangeSerializer ser, px4_msgs.msg.dds.AirspeedValidated data)
   {
      data.setTimestamp(ser.read_type_12("timestamp"));
      data.setIndicatedAirspeedMS(ser.read_type_5("indicated_airspeed_m_s"));
      data.setCalibratedAirspeedMS(ser.read_type_5("calibrated_airspeed_m_s"));
      data.setTrueAirspeedMS(ser.read_type_5("true_airspeed_m_s"));
      data.setCalibratedGroundMinusWindMS(ser.read_type_5("calibrated_ground_minus_wind_m_s"));
      data.setTrueGroundMinusWindMS(ser.read_type_5("true_ground_minus_wind_m_s"));
      data.setAirspeedSensorMeasurementValid(ser.read_type_7("airspeed_sensor_measurement_valid"));
      data.setSelectedAirspeedIndex(ser.read_type_9("selected_airspeed_index"));
      data.setAirspeedDerivativeFiltered(ser.read_type_5("airspeed_derivative_filtered"));
      data.setThrottleFiltered(ser.read_type_5("throttle_filtered"));
      data.setPitchFiltered(ser.read_type_5("pitch_filtered"));
   }

   public static void staticCopy(px4_msgs.msg.dds.AirspeedValidated src, px4_msgs.msg.dds.AirspeedValidated dest)
   {
      dest.set(src);
   }

   @Override
   public px4_msgs.msg.dds.AirspeedValidated createData()
   {
      return new px4_msgs.msg.dds.AirspeedValidated();
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
   
   public void serialize(px4_msgs.msg.dds.AirspeedValidated data, us.ihmc.idl.CDR cdr)
   {
      write(data, cdr);
   }

   public void deserialize(px4_msgs.msg.dds.AirspeedValidated data, us.ihmc.idl.CDR cdr)
   {
      read(data, cdr);
   }
   
   public void copy(px4_msgs.msg.dds.AirspeedValidated src, px4_msgs.msg.dds.AirspeedValidated dest)
   {
      staticCopy(src, dest);
   }

   @Override
   public AirspeedValidatedPubSubType newInstance()
   {
      return new AirspeedValidatedPubSubType();
   }
}
