package px4_msgs.msg.dds;

/**
* 
* Topic data type of the struct "Wind" defined in "Wind_.idl". Use this class to provide the TopicDataType to a Participant. 
*
* This file was automatically generated from Wind_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit Wind_.idl instead.
*
*/
public class WindPubSubType implements us.ihmc.pubsub.TopicDataType<px4_msgs.msg.dds.Wind>
{
   public static final java.lang.String name = "px4_msgs::msg::dds_::Wind_";
   
   @Override
   public final java.lang.String getDefinitionChecksum()
   {
   		return "3d98b6878d13aae0aed21d7afda55f0061bd0679a7fce6cd9d08268799f101f9";
   }
   
   @Override
   public final java.lang.String getDefinitionVersion()
   {
   		return "";
   }

   private final us.ihmc.idl.CDR serializeCDR = new us.ihmc.idl.CDR();
   private final us.ihmc.idl.CDR deserializeCDR = new us.ihmc.idl.CDR();

   @Override
   public void serialize(px4_msgs.msg.dds.Wind data, us.ihmc.pubsub.common.SerializedPayload serializedPayload) throws java.io.IOException
   {
      serializeCDR.serialize(serializedPayload);
      write(data, serializeCDR);
      serializeCDR.finishSerialize();
   }

   @Override
   public void deserialize(us.ihmc.pubsub.common.SerializedPayload serializedPayload, px4_msgs.msg.dds.Wind data) throws java.io.IOException
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


      return current_alignment - initial_alignment;
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.Wind data)
   {
      return getCdrSerializedSize(data, 0);
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.Wind data, int current_alignment)
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



      return current_alignment - initial_alignment;
   }

   public static void write(px4_msgs.msg.dds.Wind data, us.ihmc.idl.CDR cdr)
   {
      cdr.write_type_12(data.getTimestamp());

      cdr.write_type_12(data.getTimestampSample());

      cdr.write_type_5(data.getWindspeedNorth());

      cdr.write_type_5(data.getWindspeedEast());

      cdr.write_type_5(data.getVarianceNorth());

      cdr.write_type_5(data.getVarianceEast());

      cdr.write_type_5(data.getTasInnov());

      cdr.write_type_5(data.getTasInnovVar());

      cdr.write_type_5(data.getBetaInnov());

      cdr.write_type_5(data.getBetaInnovVar());

   }

   public static void read(px4_msgs.msg.dds.Wind data, us.ihmc.idl.CDR cdr)
   {
      data.setTimestamp(cdr.read_type_12());
      	
      data.setTimestampSample(cdr.read_type_12());
      	
      data.setWindspeedNorth(cdr.read_type_5());
      	
      data.setWindspeedEast(cdr.read_type_5());
      	
      data.setVarianceNorth(cdr.read_type_5());
      	
      data.setVarianceEast(cdr.read_type_5());
      	
      data.setTasInnov(cdr.read_type_5());
      	
      data.setTasInnovVar(cdr.read_type_5());
      	
      data.setBetaInnov(cdr.read_type_5());
      	
      data.setBetaInnovVar(cdr.read_type_5());
      	

   }

   @Override
   public final void serialize(px4_msgs.msg.dds.Wind data, us.ihmc.idl.InterchangeSerializer ser)
   {
      ser.write_type_12("timestamp", data.getTimestamp());
      ser.write_type_12("timestamp_sample", data.getTimestampSample());
      ser.write_type_5("windspeed_north", data.getWindspeedNorth());
      ser.write_type_5("windspeed_east", data.getWindspeedEast());
      ser.write_type_5("variance_north", data.getVarianceNorth());
      ser.write_type_5("variance_east", data.getVarianceEast());
      ser.write_type_5("tas_innov", data.getTasInnov());
      ser.write_type_5("tas_innov_var", data.getTasInnovVar());
      ser.write_type_5("beta_innov", data.getBetaInnov());
      ser.write_type_5("beta_innov_var", data.getBetaInnovVar());
   }

   @Override
   public final void deserialize(us.ihmc.idl.InterchangeSerializer ser, px4_msgs.msg.dds.Wind data)
   {
      data.setTimestamp(ser.read_type_12("timestamp"));
      data.setTimestampSample(ser.read_type_12("timestamp_sample"));
      data.setWindspeedNorth(ser.read_type_5("windspeed_north"));
      data.setWindspeedEast(ser.read_type_5("windspeed_east"));
      data.setVarianceNorth(ser.read_type_5("variance_north"));
      data.setVarianceEast(ser.read_type_5("variance_east"));
      data.setTasInnov(ser.read_type_5("tas_innov"));
      data.setTasInnovVar(ser.read_type_5("tas_innov_var"));
      data.setBetaInnov(ser.read_type_5("beta_innov"));
      data.setBetaInnovVar(ser.read_type_5("beta_innov_var"));
   }

   public static void staticCopy(px4_msgs.msg.dds.Wind src, px4_msgs.msg.dds.Wind dest)
   {
      dest.set(src);
   }

   @Override
   public px4_msgs.msg.dds.Wind createData()
   {
      return new px4_msgs.msg.dds.Wind();
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
   
   public void serialize(px4_msgs.msg.dds.Wind data, us.ihmc.idl.CDR cdr)
   {
      write(data, cdr);
   }

   public void deserialize(px4_msgs.msg.dds.Wind data, us.ihmc.idl.CDR cdr)
   {
      read(data, cdr);
   }
   
   public void copy(px4_msgs.msg.dds.Wind src, px4_msgs.msg.dds.Wind dest)
   {
      staticCopy(src, dest);
   }

   @Override
   public WindPubSubType newInstance()
   {
      return new WindPubSubType();
   }
}
