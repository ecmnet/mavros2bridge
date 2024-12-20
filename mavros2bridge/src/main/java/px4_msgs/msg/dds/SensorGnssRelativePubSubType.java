package px4_msgs.msg.dds;

/**
* 
* Topic data type of the struct "SensorGnssRelative" defined in "SensorGnssRelative_.idl". Use this class to provide the TopicDataType to a Participant. 
*
* This file was automatically generated from SensorGnssRelative_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit SensorGnssRelative_.idl instead.
*
*/
public class SensorGnssRelativePubSubType implements us.ihmc.pubsub.TopicDataType<px4_msgs.msg.dds.SensorGnssRelative>
{
   public static final java.lang.String name = "px4_msgs::msg::dds_::SensorGnssRelative_";
   
   @Override
   public final java.lang.String getDefinitionChecksum()
   {
   		return "be67c19d48805bd616b97d70a7a9c56553965bf011600280ec94cf6214aa640c";
   }
   
   @Override
   public final java.lang.String getDefinitionVersion()
   {
   		return "";
   }

   private final us.ihmc.idl.CDR serializeCDR = new us.ihmc.idl.CDR();
   private final us.ihmc.idl.CDR deserializeCDR = new us.ihmc.idl.CDR();

   @Override
   public void serialize(px4_msgs.msg.dds.SensorGnssRelative data, us.ihmc.pubsub.common.SerializedPayload serializedPayload) throws java.io.IOException
   {
      serializeCDR.serialize(serializedPayload);
      write(data, serializeCDR);
      serializeCDR.finishSerialize();
   }

   @Override
   public void deserialize(us.ihmc.pubsub.common.SerializedPayload serializedPayload, px4_msgs.msg.dds.SensorGnssRelative data) throws java.io.IOException
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

      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);

      current_alignment += 2 + us.ihmc.idl.CDR.alignment(current_alignment, 2);

      current_alignment += ((3) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += ((3) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      return current_alignment - initial_alignment;
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.SensorGnssRelative data)
   {
      return getCdrSerializedSize(data, 0);
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.SensorGnssRelative data, int current_alignment)
   {
      int initial_alignment = current_alignment;

      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += 2 + us.ihmc.idl.CDR.alignment(current_alignment, 2);


      current_alignment += ((3) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);
      current_alignment += ((3) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);
      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);



      return current_alignment - initial_alignment;
   }

   public static void write(px4_msgs.msg.dds.SensorGnssRelative data, us.ihmc.idl.CDR cdr)
   {
      cdr.write_type_12(data.getTimestamp());

      cdr.write_type_12(data.getTimestampSample());

      cdr.write_type_4(data.getDeviceId());

      cdr.write_type_12(data.getTimeUtcUsec());

      cdr.write_type_3(data.getReferenceStationId());

      for(int i0 = 0; i0 < data.getPosition().length; ++i0)
      {
        	cdr.write_type_5(data.getPosition()[i0]);	
      }

      for(int i0 = 0; i0 < data.getPositionAccuracy().length; ++i0)
      {
        	cdr.write_type_5(data.getPositionAccuracy()[i0]);	
      }

      cdr.write_type_5(data.getHeading());

      cdr.write_type_5(data.getHeadingAccuracy());

      cdr.write_type_5(data.getPositionLength());

      cdr.write_type_5(data.getAccuracyLength());

      cdr.write_type_7(data.getGnssFixOk());

      cdr.write_type_7(data.getDifferentialSolution());

      cdr.write_type_7(data.getRelativePositionValid());

      cdr.write_type_7(data.getCarrierSolutionFloating());

      cdr.write_type_7(data.getCarrierSolutionFixed());

      cdr.write_type_7(data.getMovingBaseMode());

      cdr.write_type_7(data.getReferencePositionMiss());

      cdr.write_type_7(data.getReferenceObservationsMiss());

      cdr.write_type_7(data.getHeadingValid());

      cdr.write_type_7(data.getRelativePositionNormalized());

   }

   public static void read(px4_msgs.msg.dds.SensorGnssRelative data, us.ihmc.idl.CDR cdr)
   {
      data.setTimestamp(cdr.read_type_12());
      	
      data.setTimestampSample(cdr.read_type_12());
      	
      data.setDeviceId(cdr.read_type_4());
      	
      data.setTimeUtcUsec(cdr.read_type_12());
      	
      data.setReferenceStationId(cdr.read_type_3());
      	
      for(int i0 = 0; i0 < data.getPosition().length; ++i0)
      {
        	data.getPosition()[i0] = cdr.read_type_5();
        	
      }
      	
      for(int i0 = 0; i0 < data.getPositionAccuracy().length; ++i0)
      {
        	data.getPositionAccuracy()[i0] = cdr.read_type_5();
        	
      }
      	
      data.setHeading(cdr.read_type_5());
      	
      data.setHeadingAccuracy(cdr.read_type_5());
      	
      data.setPositionLength(cdr.read_type_5());
      	
      data.setAccuracyLength(cdr.read_type_5());
      	
      data.setGnssFixOk(cdr.read_type_7());
      	
      data.setDifferentialSolution(cdr.read_type_7());
      	
      data.setRelativePositionValid(cdr.read_type_7());
      	
      data.setCarrierSolutionFloating(cdr.read_type_7());
      	
      data.setCarrierSolutionFixed(cdr.read_type_7());
      	
      data.setMovingBaseMode(cdr.read_type_7());
      	
      data.setReferencePositionMiss(cdr.read_type_7());
      	
      data.setReferenceObservationsMiss(cdr.read_type_7());
      	
      data.setHeadingValid(cdr.read_type_7());
      	
      data.setRelativePositionNormalized(cdr.read_type_7());
      	

   }

   @Override
   public final void serialize(px4_msgs.msg.dds.SensorGnssRelative data, us.ihmc.idl.InterchangeSerializer ser)
   {
      ser.write_type_12("timestamp", data.getTimestamp());
      ser.write_type_12("timestamp_sample", data.getTimestampSample());
      ser.write_type_4("device_id", data.getDeviceId());
      ser.write_type_12("time_utc_usec", data.getTimeUtcUsec());
      ser.write_type_3("reference_station_id", data.getReferenceStationId());
      ser.write_type_f("position", data.getPosition());
      ser.write_type_f("position_accuracy", data.getPositionAccuracy());
      ser.write_type_5("heading", data.getHeading());
      ser.write_type_5("heading_accuracy", data.getHeadingAccuracy());
      ser.write_type_5("position_length", data.getPositionLength());
      ser.write_type_5("accuracy_length", data.getAccuracyLength());
      ser.write_type_7("gnss_fix_ok", data.getGnssFixOk());
      ser.write_type_7("differential_solution", data.getDifferentialSolution());
      ser.write_type_7("relative_position_valid", data.getRelativePositionValid());
      ser.write_type_7("carrier_solution_floating", data.getCarrierSolutionFloating());
      ser.write_type_7("carrier_solution_fixed", data.getCarrierSolutionFixed());
      ser.write_type_7("moving_base_mode", data.getMovingBaseMode());
      ser.write_type_7("reference_position_miss", data.getReferencePositionMiss());
      ser.write_type_7("reference_observations_miss", data.getReferenceObservationsMiss());
      ser.write_type_7("heading_valid", data.getHeadingValid());
      ser.write_type_7("relative_position_normalized", data.getRelativePositionNormalized());
   }

   @Override
   public final void deserialize(us.ihmc.idl.InterchangeSerializer ser, px4_msgs.msg.dds.SensorGnssRelative data)
   {
      data.setTimestamp(ser.read_type_12("timestamp"));
      data.setTimestampSample(ser.read_type_12("timestamp_sample"));
      data.setDeviceId(ser.read_type_4("device_id"));
      data.setTimeUtcUsec(ser.read_type_12("time_utc_usec"));
      data.setReferenceStationId(ser.read_type_3("reference_station_id"));
      ser.read_type_f("position", data.getPosition());
      ser.read_type_f("position_accuracy", data.getPositionAccuracy());
      data.setHeading(ser.read_type_5("heading"));
      data.setHeadingAccuracy(ser.read_type_5("heading_accuracy"));
      data.setPositionLength(ser.read_type_5("position_length"));
      data.setAccuracyLength(ser.read_type_5("accuracy_length"));
      data.setGnssFixOk(ser.read_type_7("gnss_fix_ok"));
      data.setDifferentialSolution(ser.read_type_7("differential_solution"));
      data.setRelativePositionValid(ser.read_type_7("relative_position_valid"));
      data.setCarrierSolutionFloating(ser.read_type_7("carrier_solution_floating"));
      data.setCarrierSolutionFixed(ser.read_type_7("carrier_solution_fixed"));
      data.setMovingBaseMode(ser.read_type_7("moving_base_mode"));
      data.setReferencePositionMiss(ser.read_type_7("reference_position_miss"));
      data.setReferenceObservationsMiss(ser.read_type_7("reference_observations_miss"));
      data.setHeadingValid(ser.read_type_7("heading_valid"));
      data.setRelativePositionNormalized(ser.read_type_7("relative_position_normalized"));
   }

   public static void staticCopy(px4_msgs.msg.dds.SensorGnssRelative src, px4_msgs.msg.dds.SensorGnssRelative dest)
   {
      dest.set(src);
   }

   @Override
   public px4_msgs.msg.dds.SensorGnssRelative createData()
   {
      return new px4_msgs.msg.dds.SensorGnssRelative();
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
   
   public void serialize(px4_msgs.msg.dds.SensorGnssRelative data, us.ihmc.idl.CDR cdr)
   {
      write(data, cdr);
   }

   public void deserialize(px4_msgs.msg.dds.SensorGnssRelative data, us.ihmc.idl.CDR cdr)
   {
      read(data, cdr);
   }
   
   public void copy(px4_msgs.msg.dds.SensorGnssRelative src, px4_msgs.msg.dds.SensorGnssRelative dest)
   {
      staticCopy(src, dest);
   }

   @Override
   public SensorGnssRelativePubSubType newInstance()
   {
      return new SensorGnssRelativePubSubType();
   }
}
