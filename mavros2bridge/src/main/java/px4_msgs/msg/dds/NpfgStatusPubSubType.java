package px4_msgs.msg.dds;

/**
* 
* Topic data type of the struct "NpfgStatus" defined in "NpfgStatus_.idl". Use this class to provide the TopicDataType to a Participant. 
*
* This file was automatically generated from NpfgStatus_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit NpfgStatus_.idl instead.
*
*/
public class NpfgStatusPubSubType implements us.ihmc.pubsub.TopicDataType<px4_msgs.msg.dds.NpfgStatus>
{
   public static final java.lang.String name = "px4_msgs::msg::dds_::NpfgStatus_";
   
   @Override
   public final java.lang.String getDefinitionChecksum()
   {
   		return "143f2766d8b07563ba5acd0c472436f4daf8a8255267fe76288ff4bd348d7487";
   }
   
   @Override
   public final java.lang.String getDefinitionVersion()
   {
   		return "";
   }

   private final us.ihmc.idl.CDR serializeCDR = new us.ihmc.idl.CDR();
   private final us.ihmc.idl.CDR deserializeCDR = new us.ihmc.idl.CDR();

   @Override
   public void serialize(px4_msgs.msg.dds.NpfgStatus data, us.ihmc.pubsub.common.SerializedPayload serializedPayload) throws java.io.IOException
   {
      serializeCDR.serialize(serializedPayload);
      write(data, serializeCDR);
      serializeCDR.finishSerialize();
   }

   @Override
   public void deserialize(us.ihmc.pubsub.common.SerializedPayload serializedPayload, px4_msgs.msg.dds.NpfgStatus data) throws java.io.IOException
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

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      return current_alignment - initial_alignment;
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.NpfgStatus data)
   {
      return getCdrSerializedSize(data, 0);
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.NpfgStatus data, int current_alignment)
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


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);



      return current_alignment - initial_alignment;
   }

   public static void write(px4_msgs.msg.dds.NpfgStatus data, us.ihmc.idl.CDR cdr)
   {
      cdr.write_type_12(data.getTimestamp());

      cdr.write_type_9(data.getWindEstValid());

      cdr.write_type_5(data.getLatAccel());

      cdr.write_type_5(data.getLatAccelFf());

      cdr.write_type_5(data.getBearingFeas());

      cdr.write_type_5(data.getBearingFeasOnTrack());

      cdr.write_type_5(data.getSignedTrackError());

      cdr.write_type_5(data.getTrackErrorBound());

      cdr.write_type_5(data.getAirspeedRef());

      cdr.write_type_5(data.getBearing());

      cdr.write_type_5(data.getHeadingRef());

      cdr.write_type_5(data.getMinGroundSpeedRef());

      cdr.write_type_5(data.getAdaptedPeriod());

      cdr.write_type_5(data.getPGain());

      cdr.write_type_5(data.getTimeConst());

      cdr.write_type_5(data.getCanRunFactor());

   }

   public static void read(px4_msgs.msg.dds.NpfgStatus data, us.ihmc.idl.CDR cdr)
   {
      data.setTimestamp(cdr.read_type_12());
      	
      data.setWindEstValid(cdr.read_type_9());
      	
      data.setLatAccel(cdr.read_type_5());
      	
      data.setLatAccelFf(cdr.read_type_5());
      	
      data.setBearingFeas(cdr.read_type_5());
      	
      data.setBearingFeasOnTrack(cdr.read_type_5());
      	
      data.setSignedTrackError(cdr.read_type_5());
      	
      data.setTrackErrorBound(cdr.read_type_5());
      	
      data.setAirspeedRef(cdr.read_type_5());
      	
      data.setBearing(cdr.read_type_5());
      	
      data.setHeadingRef(cdr.read_type_5());
      	
      data.setMinGroundSpeedRef(cdr.read_type_5());
      	
      data.setAdaptedPeriod(cdr.read_type_5());
      	
      data.setPGain(cdr.read_type_5());
      	
      data.setTimeConst(cdr.read_type_5());
      	
      data.setCanRunFactor(cdr.read_type_5());
      	

   }

   @Override
   public final void serialize(px4_msgs.msg.dds.NpfgStatus data, us.ihmc.idl.InterchangeSerializer ser)
   {
      ser.write_type_12("timestamp", data.getTimestamp());
      ser.write_type_9("wind_est_valid", data.getWindEstValid());
      ser.write_type_5("lat_accel", data.getLatAccel());
      ser.write_type_5("lat_accel_ff", data.getLatAccelFf());
      ser.write_type_5("bearing_feas", data.getBearingFeas());
      ser.write_type_5("bearing_feas_on_track", data.getBearingFeasOnTrack());
      ser.write_type_5("signed_track_error", data.getSignedTrackError());
      ser.write_type_5("track_error_bound", data.getTrackErrorBound());
      ser.write_type_5("airspeed_ref", data.getAirspeedRef());
      ser.write_type_5("bearing", data.getBearing());
      ser.write_type_5("heading_ref", data.getHeadingRef());
      ser.write_type_5("min_ground_speed_ref", data.getMinGroundSpeedRef());
      ser.write_type_5("adapted_period", data.getAdaptedPeriod());
      ser.write_type_5("p_gain", data.getPGain());
      ser.write_type_5("time_const", data.getTimeConst());
      ser.write_type_5("can_run_factor", data.getCanRunFactor());
   }

   @Override
   public final void deserialize(us.ihmc.idl.InterchangeSerializer ser, px4_msgs.msg.dds.NpfgStatus data)
   {
      data.setTimestamp(ser.read_type_12("timestamp"));
      data.setWindEstValid(ser.read_type_9("wind_est_valid"));
      data.setLatAccel(ser.read_type_5("lat_accel"));
      data.setLatAccelFf(ser.read_type_5("lat_accel_ff"));
      data.setBearingFeas(ser.read_type_5("bearing_feas"));
      data.setBearingFeasOnTrack(ser.read_type_5("bearing_feas_on_track"));
      data.setSignedTrackError(ser.read_type_5("signed_track_error"));
      data.setTrackErrorBound(ser.read_type_5("track_error_bound"));
      data.setAirspeedRef(ser.read_type_5("airspeed_ref"));
      data.setBearing(ser.read_type_5("bearing"));
      data.setHeadingRef(ser.read_type_5("heading_ref"));
      data.setMinGroundSpeedRef(ser.read_type_5("min_ground_speed_ref"));
      data.setAdaptedPeriod(ser.read_type_5("adapted_period"));
      data.setPGain(ser.read_type_5("p_gain"));
      data.setTimeConst(ser.read_type_5("time_const"));
      data.setCanRunFactor(ser.read_type_5("can_run_factor"));
   }

   public static void staticCopy(px4_msgs.msg.dds.NpfgStatus src, px4_msgs.msg.dds.NpfgStatus dest)
   {
      dest.set(src);
   }

   @Override
   public px4_msgs.msg.dds.NpfgStatus createData()
   {
      return new px4_msgs.msg.dds.NpfgStatus();
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
   
   public void serialize(px4_msgs.msg.dds.NpfgStatus data, us.ihmc.idl.CDR cdr)
   {
      write(data, cdr);
   }

   public void deserialize(px4_msgs.msg.dds.NpfgStatus data, us.ihmc.idl.CDR cdr)
   {
      read(data, cdr);
   }
   
   public void copy(px4_msgs.msg.dds.NpfgStatus src, px4_msgs.msg.dds.NpfgStatus dest)
   {
      staticCopy(src, dest);
   }

   @Override
   public NpfgStatusPubSubType newInstance()
   {
      return new NpfgStatusPubSubType();
   }
}
