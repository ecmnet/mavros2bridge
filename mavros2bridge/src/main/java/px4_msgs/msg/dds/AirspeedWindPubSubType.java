package px4_msgs.msg.dds;

/**
* 
* Topic data type of the struct "AirspeedWind" defined in "AirspeedWind_.idl". Use this class to provide the TopicDataType to a Participant. 
*
* This file was automatically generated from AirspeedWind_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit AirspeedWind_.idl instead.
*
*/
public class AirspeedWindPubSubType implements us.ihmc.pubsub.TopicDataType<px4_msgs.msg.dds.AirspeedWind>
{
   public static final java.lang.String name = "px4_msgs::msg::dds_::AirspeedWind_";
   
   @Override
   public final java.lang.String getDefinitionChecksum()
   {
   		return "7c3aee3eaffa64547446b96b869193218c174b2d298b63a815350cd7e2f51c91";
   }
   
   @Override
   public final java.lang.String getDefinitionVersion()
   {
   		return "";
   }

   private final us.ihmc.idl.CDR serializeCDR = new us.ihmc.idl.CDR();
   private final us.ihmc.idl.CDR deserializeCDR = new us.ihmc.idl.CDR();

   @Override
   public void serialize(px4_msgs.msg.dds.AirspeedWind data, us.ihmc.pubsub.common.SerializedPayload serializedPayload) throws java.io.IOException
   {
      serializeCDR.serialize(serializedPayload);
      write(data, serializeCDR);
      serializeCDR.finishSerialize();
   }

   @Override
   public void deserialize(us.ihmc.pubsub.common.SerializedPayload serializedPayload, px4_msgs.msg.dds.AirspeedWind data) throws java.io.IOException
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

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      return current_alignment - initial_alignment;
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.AirspeedWind data)
   {
      return getCdrSerializedSize(data, 0);
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.AirspeedWind data, int current_alignment)
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


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);



      return current_alignment - initial_alignment;
   }

   public static void write(px4_msgs.msg.dds.AirspeedWind data, us.ihmc.idl.CDR cdr)
   {
      cdr.write_type_12(data.getTimestamp());

      cdr.write_type_12(data.getTimestampSample());

      cdr.write_type_5(data.getWindspeedNorth());

      cdr.write_type_5(data.getWindspeedEast());

      cdr.write_type_5(data.getVarianceNorth());

      cdr.write_type_5(data.getVarianceEast());

      cdr.write_type_5(data.getTasInnov());

      cdr.write_type_5(data.getTasInnovVar());

      cdr.write_type_5(data.getTasScaleRaw());

      cdr.write_type_5(data.getTasScaleRawVar());

      cdr.write_type_5(data.getTasScaleValidated());

      cdr.write_type_5(data.getBetaInnov());

      cdr.write_type_5(data.getBetaInnovVar());

      cdr.write_type_9((byte) data.getSource());

   }

   public static void read(px4_msgs.msg.dds.AirspeedWind data, us.ihmc.idl.CDR cdr)
   {
      data.setTimestamp(cdr.read_type_12());
      	
      data.setTimestampSample(cdr.read_type_12());
      	
      data.setWindspeedNorth(cdr.read_type_5());
      	
      data.setWindspeedEast(cdr.read_type_5());
      	
      data.setVarianceNorth(cdr.read_type_5());
      	
      data.setVarianceEast(cdr.read_type_5());
      	
      data.setTasInnov(cdr.read_type_5());
      	
      data.setTasInnovVar(cdr.read_type_5());
      	
      data.setTasScaleRaw(cdr.read_type_5());
      	
      data.setTasScaleRawVar(cdr.read_type_5());
      	
      data.setTasScaleValidated(cdr.read_type_5());
      	
      data.setBetaInnov(cdr.read_type_5());
      	
      data.setBetaInnovVar(cdr.read_type_5());
      	
      data.setSource(cdr.read_type_9());
      	

   }

   @Override
   public final void serialize(px4_msgs.msg.dds.AirspeedWind data, us.ihmc.idl.InterchangeSerializer ser)
   {
      ser.write_type_12("timestamp", data.getTimestamp());
      ser.write_type_12("timestamp_sample", data.getTimestampSample());
      ser.write_type_5("windspeed_north", data.getWindspeedNorth());
      ser.write_type_5("windspeed_east", data.getWindspeedEast());
      ser.write_type_5("variance_north", data.getVarianceNorth());
      ser.write_type_5("variance_east", data.getVarianceEast());
      ser.write_type_5("tas_innov", data.getTasInnov());
      ser.write_type_5("tas_innov_var", data.getTasInnovVar());
      ser.write_type_5("tas_scale_raw", data.getTasScaleRaw());
      ser.write_type_5("tas_scale_raw_var", data.getTasScaleRawVar());
      ser.write_type_5("tas_scale_validated", data.getTasScaleValidated());
      ser.write_type_5("beta_innov", data.getBetaInnov());
      ser.write_type_5("beta_innov_var", data.getBetaInnovVar());
      ser.write_type_9("source", (byte) data.getSource());
   }

   @Override
   public final void deserialize(us.ihmc.idl.InterchangeSerializer ser, px4_msgs.msg.dds.AirspeedWind data)
   {
      data.setTimestamp(ser.read_type_12("timestamp"));
      data.setTimestampSample(ser.read_type_12("timestamp_sample"));
      data.setWindspeedNorth(ser.read_type_5("windspeed_north"));
      data.setWindspeedEast(ser.read_type_5("windspeed_east"));
      data.setVarianceNorth(ser.read_type_5("variance_north"));
      data.setVarianceEast(ser.read_type_5("variance_east"));
      data.setTasInnov(ser.read_type_5("tas_innov"));
      data.setTasInnovVar(ser.read_type_5("tas_innov_var"));
      data.setTasScaleRaw(ser.read_type_5("tas_scale_raw"));
      data.setTasScaleRawVar(ser.read_type_5("tas_scale_raw_var"));
      data.setTasScaleValidated(ser.read_type_5("tas_scale_validated"));
      data.setBetaInnov(ser.read_type_5("beta_innov"));
      data.setBetaInnovVar(ser.read_type_5("beta_innov_var"));
      data.setSource(ser.read_type_9("source"));
   }

   public static void staticCopy(px4_msgs.msg.dds.AirspeedWind src, px4_msgs.msg.dds.AirspeedWind dest)
   {
      dest.set(src);
   }

   @Override
   public px4_msgs.msg.dds.AirspeedWind createData()
   {
      return new px4_msgs.msg.dds.AirspeedWind();
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
   
   public void serialize(px4_msgs.msg.dds.AirspeedWind data, us.ihmc.idl.CDR cdr)
   {
      write(data, cdr);
   }

   public void deserialize(px4_msgs.msg.dds.AirspeedWind data, us.ihmc.idl.CDR cdr)
   {
      read(data, cdr);
   }
   
   public void copy(px4_msgs.msg.dds.AirspeedWind src, px4_msgs.msg.dds.AirspeedWind dest)
   {
      staticCopy(src, dest);
   }

   @Override
   public AirspeedWindPubSubType newInstance()
   {
      return new AirspeedWindPubSubType();
   }
}
