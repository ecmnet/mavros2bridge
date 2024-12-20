package px4_msgs.msg.dds;

/**
* 
* Topic data type of the struct "Airspeed" defined in "Airspeed_.idl". Use this class to provide the TopicDataType to a Participant. 
*
* This file was automatically generated from Airspeed_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit Airspeed_.idl instead.
*
*/
public class AirspeedPubSubType implements us.ihmc.pubsub.TopicDataType<px4_msgs.msg.dds.Airspeed>
{
   public static final java.lang.String name = "px4_msgs::msg::dds_::Airspeed_";
   
   @Override
   public final java.lang.String getDefinitionChecksum()
   {
   		return "a7355019c02cc6fcecbd3f31c669e86acc54ace5d320a4302a1a9911472b2312";
   }
   
   @Override
   public final java.lang.String getDefinitionVersion()
   {
   		return "";
   }

   private final us.ihmc.idl.CDR serializeCDR = new us.ihmc.idl.CDR();
   private final us.ihmc.idl.CDR deserializeCDR = new us.ihmc.idl.CDR();

   @Override
   public void serialize(px4_msgs.msg.dds.Airspeed data, us.ihmc.pubsub.common.SerializedPayload serializedPayload) throws java.io.IOException
   {
      serializeCDR.serialize(serializedPayload);
      write(data, serializeCDR);
      serializeCDR.finishSerialize();
   }

   @Override
   public void deserialize(us.ihmc.pubsub.common.SerializedPayload serializedPayload, px4_msgs.msg.dds.Airspeed data) throws java.io.IOException
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


      return current_alignment - initial_alignment;
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.Airspeed data)
   {
      return getCdrSerializedSize(data, 0);
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.Airspeed data, int current_alignment)
   {
      int initial_alignment = current_alignment;

      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);



      return current_alignment - initial_alignment;
   }

   public static void write(px4_msgs.msg.dds.Airspeed data, us.ihmc.idl.CDR cdr)
   {
      cdr.write_type_12(data.getTimestamp());

      cdr.write_type_12(data.getTimestampSample());

      cdr.write_type_5(data.getIndicatedAirspeedMS());

      cdr.write_type_5(data.getTrueAirspeedMS());

      cdr.write_type_5(data.getAirTemperatureCelsius());

      cdr.write_type_5(data.getConfidence());

   }

   public static void read(px4_msgs.msg.dds.Airspeed data, us.ihmc.idl.CDR cdr)
   {
      data.setTimestamp(cdr.read_type_12());
      	
      data.setTimestampSample(cdr.read_type_12());
      	
      data.setIndicatedAirspeedMS(cdr.read_type_5());
      	
      data.setTrueAirspeedMS(cdr.read_type_5());
      	
      data.setAirTemperatureCelsius(cdr.read_type_5());
      	
      data.setConfidence(cdr.read_type_5());
      	

   }

   @Override
   public final void serialize(px4_msgs.msg.dds.Airspeed data, us.ihmc.idl.InterchangeSerializer ser)
   {
      ser.write_type_12("timestamp", data.getTimestamp());
      ser.write_type_12("timestamp_sample", data.getTimestampSample());
      ser.write_type_5("indicated_airspeed_m_s", data.getIndicatedAirspeedMS());
      ser.write_type_5("true_airspeed_m_s", data.getTrueAirspeedMS());
      ser.write_type_5("air_temperature_celsius", data.getAirTemperatureCelsius());
      ser.write_type_5("confidence", data.getConfidence());
   }

   @Override
   public final void deserialize(us.ihmc.idl.InterchangeSerializer ser, px4_msgs.msg.dds.Airspeed data)
   {
      data.setTimestamp(ser.read_type_12("timestamp"));
      data.setTimestampSample(ser.read_type_12("timestamp_sample"));
      data.setIndicatedAirspeedMS(ser.read_type_5("indicated_airspeed_m_s"));
      data.setTrueAirspeedMS(ser.read_type_5("true_airspeed_m_s"));
      data.setAirTemperatureCelsius(ser.read_type_5("air_temperature_celsius"));
      data.setConfidence(ser.read_type_5("confidence"));
   }

   public static void staticCopy(px4_msgs.msg.dds.Airspeed src, px4_msgs.msg.dds.Airspeed dest)
   {
      dest.set(src);
   }

   @Override
   public px4_msgs.msg.dds.Airspeed createData()
   {
      return new px4_msgs.msg.dds.Airspeed();
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
   
   public void serialize(px4_msgs.msg.dds.Airspeed data, us.ihmc.idl.CDR cdr)
   {
      write(data, cdr);
   }

   public void deserialize(px4_msgs.msg.dds.Airspeed data, us.ihmc.idl.CDR cdr)
   {
      read(data, cdr);
   }
   
   public void copy(px4_msgs.msg.dds.Airspeed src, px4_msgs.msg.dds.Airspeed dest)
   {
      staticCopy(src, dest);
   }

   @Override
   public AirspeedPubSubType newInstance()
   {
      return new AirspeedPubSubType();
   }
}
