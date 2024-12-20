package px4_msgs.msg.dds;

/**
* 
* Topic data type of the struct "TransponderReport" defined in "TransponderReport_.idl". Use this class to provide the TopicDataType to a Participant. 
*
* This file was automatically generated from TransponderReport_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit TransponderReport_.idl instead.
*
*/
public class TransponderReportPubSubType implements us.ihmc.pubsub.TopicDataType<px4_msgs.msg.dds.TransponderReport>
{
   public static final java.lang.String name = "px4_msgs::msg::dds_::TransponderReport_";
   
   @Override
   public final java.lang.String getDefinitionChecksum()
   {
   		return "399bf6a2011827f1425f1971c1035f5db0a5b7949135cfd8e7afbd64af9b9c08";
   }
   
   @Override
   public final java.lang.String getDefinitionVersion()
   {
   		return "";
   }

   private final us.ihmc.idl.CDR serializeCDR = new us.ihmc.idl.CDR();
   private final us.ihmc.idl.CDR deserializeCDR = new us.ihmc.idl.CDR();

   @Override
   public void serialize(px4_msgs.msg.dds.TransponderReport data, us.ihmc.pubsub.common.SerializedPayload serializedPayload) throws java.io.IOException
   {
      serializeCDR.serialize(serializedPayload);
      write(data, serializeCDR);
      serializeCDR.finishSerialize();
   }

   @Override
   public void deserialize(us.ihmc.pubsub.common.SerializedPayload serializedPayload, px4_msgs.msg.dds.TransponderReport data) throws java.io.IOException
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

      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);

      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += ((9) * 1) + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 2 + us.ihmc.idl.CDR.alignment(current_alignment, 2);

      current_alignment += 2 + us.ihmc.idl.CDR.alignment(current_alignment, 2);

      current_alignment += ((18) * 1) + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      return current_alignment - initial_alignment;
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.TransponderReport data)
   {
      return getCdrSerializedSize(data, 0);
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.TransponderReport data, int current_alignment)
   {
      int initial_alignment = current_alignment;

      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += ((9) * 1) + us.ihmc.idl.CDR.alignment(current_alignment, 1);
      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 2 + us.ihmc.idl.CDR.alignment(current_alignment, 2);


      current_alignment += 2 + us.ihmc.idl.CDR.alignment(current_alignment, 2);


      current_alignment += ((18) * 1) + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      return current_alignment - initial_alignment;
   }

   public static void write(px4_msgs.msg.dds.TransponderReport data, us.ihmc.idl.CDR cdr)
   {
      cdr.write_type_12(data.getTimestamp());

      cdr.write_type_4(data.getIcaoAddress());

      cdr.write_type_6(data.getLat());

      cdr.write_type_6(data.getLon());

      cdr.write_type_9(data.getAltitudeType());

      cdr.write_type_5(data.getAltitude());

      cdr.write_type_5(data.getHeading());

      cdr.write_type_5(data.getHorVelocity());

      cdr.write_type_5(data.getVerVelocity());

      for(int i0 = 0; i0 < data.getCallsign().length; ++i0)
      {
        	cdr.write_type_8(data.getCallsign()[i0]);	
      }

      cdr.write_type_9(data.getEmitterType());

      cdr.write_type_9(data.getTslc());

      cdr.write_type_3(data.getFlags());

      cdr.write_type_3(data.getSquawk());

      for(int i0 = 0; i0 < data.getUasId().length; ++i0)
      {
        	cdr.write_type_9(data.getUasId()[i0]);	
      }

   }

   public static void read(px4_msgs.msg.dds.TransponderReport data, us.ihmc.idl.CDR cdr)
   {
      data.setTimestamp(cdr.read_type_12());
      	
      data.setIcaoAddress(cdr.read_type_4());
      	
      data.setLat(cdr.read_type_6());
      	
      data.setLon(cdr.read_type_6());
      	
      data.setAltitudeType(cdr.read_type_9());
      	
      data.setAltitude(cdr.read_type_5());
      	
      data.setHeading(cdr.read_type_5());
      	
      data.setHorVelocity(cdr.read_type_5());
      	
      data.setVerVelocity(cdr.read_type_5());
      	
      for(int i0 = 0; i0 < data.getCallsign().length; ++i0)
      {
        	data.getCallsign()[i0] = cdr.read_type_8();
        	
      }
      	
      data.setEmitterType(cdr.read_type_9());
      	
      data.setTslc(cdr.read_type_9());
      	
      data.setFlags(cdr.read_type_3());
      	
      data.setSquawk(cdr.read_type_3());
      	
      for(int i0 = 0; i0 < data.getUasId().length; ++i0)
      {
        	data.getUasId()[i0] = cdr.read_type_9();
        	
      }
      	

   }

   @Override
   public final void serialize(px4_msgs.msg.dds.TransponderReport data, us.ihmc.idl.InterchangeSerializer ser)
   {
      ser.write_type_12("timestamp", data.getTimestamp());
      ser.write_type_4("icao_address", data.getIcaoAddress());
      ser.write_type_6("lat", data.getLat());
      ser.write_type_6("lon", data.getLon());
      ser.write_type_9("altitude_type", data.getAltitudeType());
      ser.write_type_5("altitude", data.getAltitude());
      ser.write_type_5("heading", data.getHeading());
      ser.write_type_5("hor_velocity", data.getHorVelocity());
      ser.write_type_5("ver_velocity", data.getVerVelocity());
      ser.write_type_f("callsign", data.getCallsign());
      ser.write_type_9("emitter_type", data.getEmitterType());
      ser.write_type_9("tslc", data.getTslc());
      ser.write_type_3("flags", data.getFlags());
      ser.write_type_3("squawk", data.getSquawk());
      ser.write_type_f("uas_id", data.getUasId());
   }

   @Override
   public final void deserialize(us.ihmc.idl.InterchangeSerializer ser, px4_msgs.msg.dds.TransponderReport data)
   {
      data.setTimestamp(ser.read_type_12("timestamp"));
      data.setIcaoAddress(ser.read_type_4("icao_address"));
      data.setLat(ser.read_type_6("lat"));
      data.setLon(ser.read_type_6("lon"));
      data.setAltitudeType(ser.read_type_9("altitude_type"));
      data.setAltitude(ser.read_type_5("altitude"));
      data.setHeading(ser.read_type_5("heading"));
      data.setHorVelocity(ser.read_type_5("hor_velocity"));
      data.setVerVelocity(ser.read_type_5("ver_velocity"));
      ser.read_type_f("callsign", data.getCallsign());
      data.setEmitterType(ser.read_type_9("emitter_type"));
      data.setTslc(ser.read_type_9("tslc"));
      data.setFlags(ser.read_type_3("flags"));
      data.setSquawk(ser.read_type_3("squawk"));
      ser.read_type_f("uas_id", data.getUasId());
   }

   public static void staticCopy(px4_msgs.msg.dds.TransponderReport src, px4_msgs.msg.dds.TransponderReport dest)
   {
      dest.set(src);
   }

   @Override
   public px4_msgs.msg.dds.TransponderReport createData()
   {
      return new px4_msgs.msg.dds.TransponderReport();
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
   
   public void serialize(px4_msgs.msg.dds.TransponderReport data, us.ihmc.idl.CDR cdr)
   {
      write(data, cdr);
   }

   public void deserialize(px4_msgs.msg.dds.TransponderReport data, us.ihmc.idl.CDR cdr)
   {
      read(data, cdr);
   }
   
   public void copy(px4_msgs.msg.dds.TransponderReport src, px4_msgs.msg.dds.TransponderReport dest)
   {
      staticCopy(src, dest);
   }

   @Override
   public TransponderReportPubSubType newInstance()
   {
      return new TransponderReportPubSubType();
   }
}
