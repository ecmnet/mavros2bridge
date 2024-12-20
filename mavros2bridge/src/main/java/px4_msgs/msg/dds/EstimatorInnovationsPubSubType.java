package px4_msgs.msg.dds;

/**
* 
* Topic data type of the struct "EstimatorInnovations" defined in "EstimatorInnovations_.idl". Use this class to provide the TopicDataType to a Participant. 
*
* This file was automatically generated from EstimatorInnovations_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit EstimatorInnovations_.idl instead.
*
*/
public class EstimatorInnovationsPubSubType implements us.ihmc.pubsub.TopicDataType<px4_msgs.msg.dds.EstimatorInnovations>
{
   public static final java.lang.String name = "px4_msgs::msg::dds_::EstimatorInnovations_";
   
   @Override
   public final java.lang.String getDefinitionChecksum()
   {
   		return "2c008801be9a3bd0e3804ced0461a2122760dde598db34c23261f34ad7635b2f";
   }
   
   @Override
   public final java.lang.String getDefinitionVersion()
   {
   		return "";
   }

   private final us.ihmc.idl.CDR serializeCDR = new us.ihmc.idl.CDR();
   private final us.ihmc.idl.CDR deserializeCDR = new us.ihmc.idl.CDR();

   @Override
   public void serialize(px4_msgs.msg.dds.EstimatorInnovations data, us.ihmc.pubsub.common.SerializedPayload serializedPayload) throws java.io.IOException
   {
      serializeCDR.serialize(serializedPayload);
      write(data, serializeCDR);
      serializeCDR.finishSerialize();
   }

   @Override
   public void deserialize(us.ihmc.pubsub.common.SerializedPayload serializedPayload, px4_msgs.msg.dds.EstimatorInnovations data) throws java.io.IOException
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

      current_alignment += ((2) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += ((2) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += ((2) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += ((2) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += ((2) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += ((2) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += ((3) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += ((3) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += ((2) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      return current_alignment - initial_alignment;
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.EstimatorInnovations data)
   {
      return getCdrSerializedSize(data, 0);
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.EstimatorInnovations data, int current_alignment)
   {
      int initial_alignment = current_alignment;

      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += ((2) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);
      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += ((2) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);
      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += ((2) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);
      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += ((2) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);
      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += ((2) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);
      current_alignment += ((2) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);
      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += ((3) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);
      current_alignment += ((3) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);
      current_alignment += ((2) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);
      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);



      return current_alignment - initial_alignment;
   }

   public static void write(px4_msgs.msg.dds.EstimatorInnovations data, us.ihmc.idl.CDR cdr)
   {
      cdr.write_type_12(data.getTimestamp());

      cdr.write_type_12(data.getTimestampSample());

      for(int i0 = 0; i0 < data.getGpsHvel().length; ++i0)
      {
        	cdr.write_type_5(data.getGpsHvel()[i0]);	
      }

      cdr.write_type_5(data.getGpsVvel());

      for(int i0 = 0; i0 < data.getGpsHpos().length; ++i0)
      {
        	cdr.write_type_5(data.getGpsHpos()[i0]);	
      }

      cdr.write_type_5(data.getGpsVpos());

      for(int i0 = 0; i0 < data.getEvHvel().length; ++i0)
      {
        	cdr.write_type_5(data.getEvHvel()[i0]);	
      }

      cdr.write_type_5(data.getEvVvel());

      for(int i0 = 0; i0 < data.getEvHpos().length; ++i0)
      {
        	cdr.write_type_5(data.getEvHpos()[i0]);	
      }

      cdr.write_type_5(data.getEvVpos());

      cdr.write_type_5(data.getRngVpos());

      cdr.write_type_5(data.getBaroVpos());

      for(int i0 = 0; i0 < data.getAuxHvel().length; ++i0)
      {
        	cdr.write_type_5(data.getAuxHvel()[i0]);	
      }

      for(int i0 = 0; i0 < data.getFlow().length; ++i0)
      {
        	cdr.write_type_5(data.getFlow()[i0]);	
      }

      cdr.write_type_5(data.getHeading());

      for(int i0 = 0; i0 < data.getMagField().length; ++i0)
      {
        	cdr.write_type_5(data.getMagField()[i0]);	
      }

      for(int i0 = 0; i0 < data.getGravity().length; ++i0)
      {
        	cdr.write_type_5(data.getGravity()[i0]);	
      }

      for(int i0 = 0; i0 < data.getDrag().length; ++i0)
      {
        	cdr.write_type_5(data.getDrag()[i0]);	
      }

      cdr.write_type_5(data.getAirspeed());

      cdr.write_type_5(data.getBeta());

      cdr.write_type_5(data.getHagl());

      cdr.write_type_5(data.getHaglRate());

   }

   public static void read(px4_msgs.msg.dds.EstimatorInnovations data, us.ihmc.idl.CDR cdr)
   {
      data.setTimestamp(cdr.read_type_12());
      	
      data.setTimestampSample(cdr.read_type_12());
      	
      for(int i0 = 0; i0 < data.getGpsHvel().length; ++i0)
      {
        	data.getGpsHvel()[i0] = cdr.read_type_5();
        	
      }
      	
      data.setGpsVvel(cdr.read_type_5());
      	
      for(int i0 = 0; i0 < data.getGpsHpos().length; ++i0)
      {
        	data.getGpsHpos()[i0] = cdr.read_type_5();
        	
      }
      	
      data.setGpsVpos(cdr.read_type_5());
      	
      for(int i0 = 0; i0 < data.getEvHvel().length; ++i0)
      {
        	data.getEvHvel()[i0] = cdr.read_type_5();
        	
      }
      	
      data.setEvVvel(cdr.read_type_5());
      	
      for(int i0 = 0; i0 < data.getEvHpos().length; ++i0)
      {
        	data.getEvHpos()[i0] = cdr.read_type_5();
        	
      }
      	
      data.setEvVpos(cdr.read_type_5());
      	
      data.setRngVpos(cdr.read_type_5());
      	
      data.setBaroVpos(cdr.read_type_5());
      	
      for(int i0 = 0; i0 < data.getAuxHvel().length; ++i0)
      {
        	data.getAuxHvel()[i0] = cdr.read_type_5();
        	
      }
      	
      for(int i0 = 0; i0 < data.getFlow().length; ++i0)
      {
        	data.getFlow()[i0] = cdr.read_type_5();
        	
      }
      	
      data.setHeading(cdr.read_type_5());
      	
      for(int i0 = 0; i0 < data.getMagField().length; ++i0)
      {
        	data.getMagField()[i0] = cdr.read_type_5();
        	
      }
      	
      for(int i0 = 0; i0 < data.getGravity().length; ++i0)
      {
        	data.getGravity()[i0] = cdr.read_type_5();
        	
      }
      	
      for(int i0 = 0; i0 < data.getDrag().length; ++i0)
      {
        	data.getDrag()[i0] = cdr.read_type_5();
        	
      }
      	
      data.setAirspeed(cdr.read_type_5());
      	
      data.setBeta(cdr.read_type_5());
      	
      data.setHagl(cdr.read_type_5());
      	
      data.setHaglRate(cdr.read_type_5());
      	

   }

   @Override
   public final void serialize(px4_msgs.msg.dds.EstimatorInnovations data, us.ihmc.idl.InterchangeSerializer ser)
   {
      ser.write_type_12("timestamp", data.getTimestamp());
      ser.write_type_12("timestamp_sample", data.getTimestampSample());
      ser.write_type_f("gps_hvel", data.getGpsHvel());
      ser.write_type_5("gps_vvel", data.getGpsVvel());
      ser.write_type_f("gps_hpos", data.getGpsHpos());
      ser.write_type_5("gps_vpos", data.getGpsVpos());
      ser.write_type_f("ev_hvel", data.getEvHvel());
      ser.write_type_5("ev_vvel", data.getEvVvel());
      ser.write_type_f("ev_hpos", data.getEvHpos());
      ser.write_type_5("ev_vpos", data.getEvVpos());
      ser.write_type_5("rng_vpos", data.getRngVpos());
      ser.write_type_5("baro_vpos", data.getBaroVpos());
      ser.write_type_f("aux_hvel", data.getAuxHvel());
      ser.write_type_f("flow", data.getFlow());
      ser.write_type_5("heading", data.getHeading());
      ser.write_type_f("mag_field", data.getMagField());
      ser.write_type_f("gravity", data.getGravity());
      ser.write_type_f("drag", data.getDrag());
      ser.write_type_5("airspeed", data.getAirspeed());
      ser.write_type_5("beta", data.getBeta());
      ser.write_type_5("hagl", data.getHagl());
      ser.write_type_5("hagl_rate", data.getHaglRate());
   }

   @Override
   public final void deserialize(us.ihmc.idl.InterchangeSerializer ser, px4_msgs.msg.dds.EstimatorInnovations data)
   {
      data.setTimestamp(ser.read_type_12("timestamp"));
      data.setTimestampSample(ser.read_type_12("timestamp_sample"));
      ser.read_type_f("gps_hvel", data.getGpsHvel());
      data.setGpsVvel(ser.read_type_5("gps_vvel"));
      ser.read_type_f("gps_hpos", data.getGpsHpos());
      data.setGpsVpos(ser.read_type_5("gps_vpos"));
      ser.read_type_f("ev_hvel", data.getEvHvel());
      data.setEvVvel(ser.read_type_5("ev_vvel"));
      ser.read_type_f("ev_hpos", data.getEvHpos());
      data.setEvVpos(ser.read_type_5("ev_vpos"));
      data.setRngVpos(ser.read_type_5("rng_vpos"));
      data.setBaroVpos(ser.read_type_5("baro_vpos"));
      ser.read_type_f("aux_hvel", data.getAuxHvel());
      ser.read_type_f("flow", data.getFlow());
      data.setHeading(ser.read_type_5("heading"));
      ser.read_type_f("mag_field", data.getMagField());
      ser.read_type_f("gravity", data.getGravity());
      ser.read_type_f("drag", data.getDrag());
      data.setAirspeed(ser.read_type_5("airspeed"));
      data.setBeta(ser.read_type_5("beta"));
      data.setHagl(ser.read_type_5("hagl"));
      data.setHaglRate(ser.read_type_5("hagl_rate"));
   }

   public static void staticCopy(px4_msgs.msg.dds.EstimatorInnovations src, px4_msgs.msg.dds.EstimatorInnovations dest)
   {
      dest.set(src);
   }

   @Override
   public px4_msgs.msg.dds.EstimatorInnovations createData()
   {
      return new px4_msgs.msg.dds.EstimatorInnovations();
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
   
   public void serialize(px4_msgs.msg.dds.EstimatorInnovations data, us.ihmc.idl.CDR cdr)
   {
      write(data, cdr);
   }

   public void deserialize(px4_msgs.msg.dds.EstimatorInnovations data, us.ihmc.idl.CDR cdr)
   {
      read(data, cdr);
   }
   
   public void copy(px4_msgs.msg.dds.EstimatorInnovations src, px4_msgs.msg.dds.EstimatorInnovations dest)
   {
      staticCopy(src, dest);
   }

   @Override
   public EstimatorInnovationsPubSubType newInstance()
   {
      return new EstimatorInnovationsPubSubType();
   }
}
