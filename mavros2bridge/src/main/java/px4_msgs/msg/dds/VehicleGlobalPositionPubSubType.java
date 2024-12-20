package px4_msgs.msg.dds;

/**
* 
* Topic data type of the struct "VehicleGlobalPosition" defined in "VehicleGlobalPosition_.idl". Use this class to provide the TopicDataType to a Participant. 
*
* This file was automatically generated from VehicleGlobalPosition_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit VehicleGlobalPosition_.idl instead.
*
*/
public class VehicleGlobalPositionPubSubType implements us.ihmc.pubsub.TopicDataType<px4_msgs.msg.dds.VehicleGlobalPosition>
{
   public static final java.lang.String name = "px4_msgs::msg::dds_::VehicleGlobalPosition_";
   
   @Override
   public final java.lang.String getDefinitionChecksum()
   {
   		return "f21de60ea979ba20d63cddc83bdcad5727425a143aa5b5b9a8aa95935cee9296";
   }
   
   @Override
   public final java.lang.String getDefinitionVersion()
   {
   		return "";
   }

   private final us.ihmc.idl.CDR serializeCDR = new us.ihmc.idl.CDR();
   private final us.ihmc.idl.CDR deserializeCDR = new us.ihmc.idl.CDR();

   @Override
   public void serialize(px4_msgs.msg.dds.VehicleGlobalPosition data, us.ihmc.pubsub.common.SerializedPayload serializedPayload) throws java.io.IOException
   {
      serializeCDR.serialize(serializedPayload);
      write(data, serializeCDR);
      serializeCDR.finishSerialize();
   }

   @Override
   public void deserialize(us.ihmc.pubsub.common.SerializedPayload serializedPayload, px4_msgs.msg.dds.VehicleGlobalPosition data) throws java.io.IOException
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

      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);

      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      return current_alignment - initial_alignment;
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.VehicleGlobalPosition data)
   {
      return getCdrSerializedSize(data, 0);
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.VehicleGlobalPosition data, int current_alignment)
   {
      int initial_alignment = current_alignment;

      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);



      return current_alignment - initial_alignment;
   }

   public static void write(px4_msgs.msg.dds.VehicleGlobalPosition data, us.ihmc.idl.CDR cdr)
   {
      cdr.write_type_12(data.getTimestamp());

      cdr.write_type_12(data.getTimestampSample());

      cdr.write_type_6(data.getLat());

      cdr.write_type_6(data.getLon());

      cdr.write_type_5(data.getAlt());

      cdr.write_type_5(data.getAltEllipsoid());

      cdr.write_type_7(data.getLatLonValid());

      cdr.write_type_7(data.getAltValid());

      cdr.write_type_5(data.getDeltaAlt());

      cdr.write_type_5(data.getDeltaTerrain());

      cdr.write_type_9(data.getLatLonResetCounter());

      cdr.write_type_9(data.getAltResetCounter());

      cdr.write_type_9(data.getTerrainResetCounter());

      cdr.write_type_5(data.getEph());

      cdr.write_type_5(data.getEpv());

      cdr.write_type_5(data.getTerrainAlt());

      cdr.write_type_7(data.getTerrainAltValid());

      cdr.write_type_7(data.getDeadReckoning());

   }

   public static void read(px4_msgs.msg.dds.VehicleGlobalPosition data, us.ihmc.idl.CDR cdr)
   {
      data.setTimestamp(cdr.read_type_12());
      	
      data.setTimestampSample(cdr.read_type_12());
      	
      data.setLat(cdr.read_type_6());
      	
      data.setLon(cdr.read_type_6());
      	
      data.setAlt(cdr.read_type_5());
      	
      data.setAltEllipsoid(cdr.read_type_5());
      	
      data.setLatLonValid(cdr.read_type_7());
      	
      data.setAltValid(cdr.read_type_7());
      	
      data.setDeltaAlt(cdr.read_type_5());
      	
      data.setDeltaTerrain(cdr.read_type_5());
      	
      data.setLatLonResetCounter(cdr.read_type_9());
      	
      data.setAltResetCounter(cdr.read_type_9());
      	
      data.setTerrainResetCounter(cdr.read_type_9());
      	
      data.setEph(cdr.read_type_5());
      	
      data.setEpv(cdr.read_type_5());
      	
      data.setTerrainAlt(cdr.read_type_5());
      	
      data.setTerrainAltValid(cdr.read_type_7());
      	
      data.setDeadReckoning(cdr.read_type_7());
      	

   }

   @Override
   public final void serialize(px4_msgs.msg.dds.VehicleGlobalPosition data, us.ihmc.idl.InterchangeSerializer ser)
   {
      ser.write_type_12("timestamp", data.getTimestamp());
      ser.write_type_12("timestamp_sample", data.getTimestampSample());
      ser.write_type_6("lat", data.getLat());
      ser.write_type_6("lon", data.getLon());
      ser.write_type_5("alt", data.getAlt());
      ser.write_type_5("alt_ellipsoid", data.getAltEllipsoid());
      ser.write_type_7("lat_lon_valid", data.getLatLonValid());
      ser.write_type_7("alt_valid", data.getAltValid());
      ser.write_type_5("delta_alt", data.getDeltaAlt());
      ser.write_type_5("delta_terrain", data.getDeltaTerrain());
      ser.write_type_9("lat_lon_reset_counter", data.getLatLonResetCounter());
      ser.write_type_9("alt_reset_counter", data.getAltResetCounter());
      ser.write_type_9("terrain_reset_counter", data.getTerrainResetCounter());
      ser.write_type_5("eph", data.getEph());
      ser.write_type_5("epv", data.getEpv());
      ser.write_type_5("terrain_alt", data.getTerrainAlt());
      ser.write_type_7("terrain_alt_valid", data.getTerrainAltValid());
      ser.write_type_7("dead_reckoning", data.getDeadReckoning());
   }

   @Override
   public final void deserialize(us.ihmc.idl.InterchangeSerializer ser, px4_msgs.msg.dds.VehicleGlobalPosition data)
   {
      data.setTimestamp(ser.read_type_12("timestamp"));
      data.setTimestampSample(ser.read_type_12("timestamp_sample"));
      data.setLat(ser.read_type_6("lat"));
      data.setLon(ser.read_type_6("lon"));
      data.setAlt(ser.read_type_5("alt"));
      data.setAltEllipsoid(ser.read_type_5("alt_ellipsoid"));
      data.setLatLonValid(ser.read_type_7("lat_lon_valid"));
      data.setAltValid(ser.read_type_7("alt_valid"));
      data.setDeltaAlt(ser.read_type_5("delta_alt"));
      data.setDeltaTerrain(ser.read_type_5("delta_terrain"));
      data.setLatLonResetCounter(ser.read_type_9("lat_lon_reset_counter"));
      data.setAltResetCounter(ser.read_type_9("alt_reset_counter"));
      data.setTerrainResetCounter(ser.read_type_9("terrain_reset_counter"));
      data.setEph(ser.read_type_5("eph"));
      data.setEpv(ser.read_type_5("epv"));
      data.setTerrainAlt(ser.read_type_5("terrain_alt"));
      data.setTerrainAltValid(ser.read_type_7("terrain_alt_valid"));
      data.setDeadReckoning(ser.read_type_7("dead_reckoning"));
   }

   public static void staticCopy(px4_msgs.msg.dds.VehicleGlobalPosition src, px4_msgs.msg.dds.VehicleGlobalPosition dest)
   {
      dest.set(src);
   }

   @Override
   public px4_msgs.msg.dds.VehicleGlobalPosition createData()
   {
      return new px4_msgs.msg.dds.VehicleGlobalPosition();
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
   
   public void serialize(px4_msgs.msg.dds.VehicleGlobalPosition data, us.ihmc.idl.CDR cdr)
   {
      write(data, cdr);
   }

   public void deserialize(px4_msgs.msg.dds.VehicleGlobalPosition data, us.ihmc.idl.CDR cdr)
   {
      read(data, cdr);
   }
   
   public void copy(px4_msgs.msg.dds.VehicleGlobalPosition src, px4_msgs.msg.dds.VehicleGlobalPosition dest)
   {
      staticCopy(src, dest);
   }

   @Override
   public VehicleGlobalPositionPubSubType newInstance()
   {
      return new VehicleGlobalPositionPubSubType();
   }
}
