package px4_msgs.msg.dds;

/**
* 
* Topic data type of the struct "VehicleLocalPosition" defined in "VehicleLocalPosition_.idl". Use this class to provide the TopicDataType to a Participant. 
*
* This file was automatically generated from VehicleLocalPosition_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit VehicleLocalPosition_.idl instead.
*
*/
public class VehicleLocalPositionPubSubType implements us.ihmc.pubsub.TopicDataType<px4_msgs.msg.dds.VehicleLocalPosition>
{
   public static final java.lang.String name = "px4_msgs::msg::dds_::VehicleLocalPosition_";
   
   @Override
   public final java.lang.String getDefinitionChecksum()
   {
   		return "840ff4148cc5efd0183dfdfd73dc809de777adc9ee2c43022dcb1d4e4a117fb6";
   }
   
   @Override
   public final java.lang.String getDefinitionVersion()
   {
   		return "";
   }

   private final us.ihmc.idl.CDR serializeCDR = new us.ihmc.idl.CDR();
   private final us.ihmc.idl.CDR deserializeCDR = new us.ihmc.idl.CDR();

   @Override
   public void serialize(px4_msgs.msg.dds.VehicleLocalPosition data, us.ihmc.pubsub.common.SerializedPayload serializedPayload) throws java.io.IOException
   {
      serializeCDR.serialize(serializedPayload);
      write(data, serializeCDR);
      serializeCDR.finishSerialize();
   }

   @Override
   public void deserialize(us.ihmc.pubsub.common.SerializedPayload serializedPayload, px4_msgs.msg.dds.VehicleLocalPosition data) throws java.io.IOException
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

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += ((2) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += ((2) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);

      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);

      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      return current_alignment - initial_alignment;
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.VehicleLocalPosition data)
   {
      return getCdrSerializedSize(data, 0);
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.VehicleLocalPosition data, int current_alignment)
   {
      int initial_alignment = current_alignment;

      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += ((2) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);
      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += ((2) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);
      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);



      return current_alignment - initial_alignment;
   }

   public static void write(px4_msgs.msg.dds.VehicleLocalPosition data, us.ihmc.idl.CDR cdr)
   {
      cdr.write_type_12(data.getTimestamp());

      cdr.write_type_12(data.getTimestampSample());

      cdr.write_type_7(data.getXyValid());

      cdr.write_type_7(data.getZValid());

      cdr.write_type_7(data.getVXyValid());

      cdr.write_type_7(data.getVZValid());

      cdr.write_type_5(data.getX());

      cdr.write_type_5(data.getY());

      cdr.write_type_5(data.getZ());

      for(int i0 = 0; i0 < data.getDeltaXy().length; ++i0)
      {
        	cdr.write_type_5(data.getDeltaXy()[i0]);	
      }

      cdr.write_type_9(data.getXyResetCounter());

      cdr.write_type_5(data.getDeltaZ());

      cdr.write_type_9(data.getZResetCounter());

      cdr.write_type_5(data.getVx());

      cdr.write_type_5(data.getVy());

      cdr.write_type_5(data.getVz());

      cdr.write_type_5(data.getZDeriv());

      for(int i0 = 0; i0 < data.getDeltaVxy().length; ++i0)
      {
        	cdr.write_type_5(data.getDeltaVxy()[i0]);	
      }

      cdr.write_type_9(data.getVxyResetCounter());

      cdr.write_type_5(data.getDeltaVz());

      cdr.write_type_9(data.getVzResetCounter());

      cdr.write_type_5(data.getAx());

      cdr.write_type_5(data.getAy());

      cdr.write_type_5(data.getAz());

      cdr.write_type_5(data.getHeading());

      cdr.write_type_5(data.getHeadingVar());

      cdr.write_type_5(data.getUnaidedHeading());

      cdr.write_type_5(data.getDeltaHeading());

      cdr.write_type_9(data.getHeadingResetCounter());

      cdr.write_type_7(data.getHeadingGoodForControl());

      cdr.write_type_5(data.getTiltVar());

      cdr.write_type_7(data.getXyGlobal());

      cdr.write_type_7(data.getZGlobal());

      cdr.write_type_12(data.getRefTimestamp());

      cdr.write_type_6(data.getRefLat());

      cdr.write_type_6(data.getRefLon());

      cdr.write_type_5(data.getRefAlt());

      cdr.write_type_7(data.getDistBottomValid());

      cdr.write_type_5(data.getDistBottom());

      cdr.write_type_5(data.getDistBottomVar());

      cdr.write_type_5(data.getDeltaDistBottom());

      cdr.write_type_9(data.getDistBottomResetCounter());

      cdr.write_type_9(data.getDistBottomSensorBitfield());

      cdr.write_type_5(data.getEph());

      cdr.write_type_5(data.getEpv());

      cdr.write_type_5(data.getEvh());

      cdr.write_type_5(data.getEvv());

      cdr.write_type_7(data.getDeadReckoning());

      cdr.write_type_5(data.getVxyMax());

      cdr.write_type_5(data.getVzMax());

      cdr.write_type_5(data.getHaglMin());

      cdr.write_type_5(data.getHaglMax());

   }

   public static void read(px4_msgs.msg.dds.VehicleLocalPosition data, us.ihmc.idl.CDR cdr)
   {
      data.setTimestamp(cdr.read_type_12());
      	
      data.setTimestampSample(cdr.read_type_12());
      	
      data.setXyValid(cdr.read_type_7());
      	
      data.setZValid(cdr.read_type_7());
      	
      data.setVXyValid(cdr.read_type_7());
      	
      data.setVZValid(cdr.read_type_7());
      	
      data.setX(cdr.read_type_5());
      	
      data.setY(cdr.read_type_5());
      	
      data.setZ(cdr.read_type_5());
      	
      for(int i0 = 0; i0 < data.getDeltaXy().length; ++i0)
      {
        	data.getDeltaXy()[i0] = cdr.read_type_5();
        	
      }
      	
      data.setXyResetCounter(cdr.read_type_9());
      	
      data.setDeltaZ(cdr.read_type_5());
      	
      data.setZResetCounter(cdr.read_type_9());
      	
      data.setVx(cdr.read_type_5());
      	
      data.setVy(cdr.read_type_5());
      	
      data.setVz(cdr.read_type_5());
      	
      data.setZDeriv(cdr.read_type_5());
      	
      for(int i0 = 0; i0 < data.getDeltaVxy().length; ++i0)
      {
        	data.getDeltaVxy()[i0] = cdr.read_type_5();
        	
      }
      	
      data.setVxyResetCounter(cdr.read_type_9());
      	
      data.setDeltaVz(cdr.read_type_5());
      	
      data.setVzResetCounter(cdr.read_type_9());
      	
      data.setAx(cdr.read_type_5());
      	
      data.setAy(cdr.read_type_5());
      	
      data.setAz(cdr.read_type_5());
      	
      data.setHeading(cdr.read_type_5());
      	
      data.setHeadingVar(cdr.read_type_5());
      	
      data.setUnaidedHeading(cdr.read_type_5());
      	
      data.setDeltaHeading(cdr.read_type_5());
      	
      data.setHeadingResetCounter(cdr.read_type_9());
      	
      data.setHeadingGoodForControl(cdr.read_type_7());
      	
      data.setTiltVar(cdr.read_type_5());
      	
      data.setXyGlobal(cdr.read_type_7());
      	
      data.setZGlobal(cdr.read_type_7());
      	
      data.setRefTimestamp(cdr.read_type_12());
      	
      data.setRefLat(cdr.read_type_6());
      	
      data.setRefLon(cdr.read_type_6());
      	
      data.setRefAlt(cdr.read_type_5());
      	
      data.setDistBottomValid(cdr.read_type_7());
      	
      data.setDistBottom(cdr.read_type_5());
      	
      data.setDistBottomVar(cdr.read_type_5());
      	
      data.setDeltaDistBottom(cdr.read_type_5());
      	
      data.setDistBottomResetCounter(cdr.read_type_9());
      	
      data.setDistBottomSensorBitfield(cdr.read_type_9());
      	
      data.setEph(cdr.read_type_5());
      	
      data.setEpv(cdr.read_type_5());
      	
      data.setEvh(cdr.read_type_5());
      	
      data.setEvv(cdr.read_type_5());
      	
      data.setDeadReckoning(cdr.read_type_7());
      	
      data.setVxyMax(cdr.read_type_5());
      	
      data.setVzMax(cdr.read_type_5());
      	
      data.setHaglMin(cdr.read_type_5());
      	
      data.setHaglMax(cdr.read_type_5());
      	

   }

   @Override
   public final void serialize(px4_msgs.msg.dds.VehicleLocalPosition data, us.ihmc.idl.InterchangeSerializer ser)
   {
      ser.write_type_12("timestamp", data.getTimestamp());
      ser.write_type_12("timestamp_sample", data.getTimestampSample());
      ser.write_type_7("xy_valid", data.getXyValid());
      ser.write_type_7("z_valid", data.getZValid());
      ser.write_type_7("v_xy_valid", data.getVXyValid());
      ser.write_type_7("v_z_valid", data.getVZValid());
      ser.write_type_5("x", data.getX());
      ser.write_type_5("y", data.getY());
      ser.write_type_5("z", data.getZ());
      ser.write_type_f("delta_xy", data.getDeltaXy());
      ser.write_type_9("xy_reset_counter", data.getXyResetCounter());
      ser.write_type_5("delta_z", data.getDeltaZ());
      ser.write_type_9("z_reset_counter", data.getZResetCounter());
      ser.write_type_5("vx", data.getVx());
      ser.write_type_5("vy", data.getVy());
      ser.write_type_5("vz", data.getVz());
      ser.write_type_5("z_deriv", data.getZDeriv());
      ser.write_type_f("delta_vxy", data.getDeltaVxy());
      ser.write_type_9("vxy_reset_counter", data.getVxyResetCounter());
      ser.write_type_5("delta_vz", data.getDeltaVz());
      ser.write_type_9("vz_reset_counter", data.getVzResetCounter());
      ser.write_type_5("ax", data.getAx());
      ser.write_type_5("ay", data.getAy());
      ser.write_type_5("az", data.getAz());
      ser.write_type_5("heading", data.getHeading());
      ser.write_type_5("heading_var", data.getHeadingVar());
      ser.write_type_5("unaided_heading", data.getUnaidedHeading());
      ser.write_type_5("delta_heading", data.getDeltaHeading());
      ser.write_type_9("heading_reset_counter", data.getHeadingResetCounter());
      ser.write_type_7("heading_good_for_control", data.getHeadingGoodForControl());
      ser.write_type_5("tilt_var", data.getTiltVar());
      ser.write_type_7("xy_global", data.getXyGlobal());
      ser.write_type_7("z_global", data.getZGlobal());
      ser.write_type_12("ref_timestamp", data.getRefTimestamp());
      ser.write_type_6("ref_lat", data.getRefLat());
      ser.write_type_6("ref_lon", data.getRefLon());
      ser.write_type_5("ref_alt", data.getRefAlt());
      ser.write_type_7("dist_bottom_valid", data.getDistBottomValid());
      ser.write_type_5("dist_bottom", data.getDistBottom());
      ser.write_type_5("dist_bottom_var", data.getDistBottomVar());
      ser.write_type_5("delta_dist_bottom", data.getDeltaDistBottom());
      ser.write_type_9("dist_bottom_reset_counter", data.getDistBottomResetCounter());
      ser.write_type_9("dist_bottom_sensor_bitfield", data.getDistBottomSensorBitfield());
      ser.write_type_5("eph", data.getEph());
      ser.write_type_5("epv", data.getEpv());
      ser.write_type_5("evh", data.getEvh());
      ser.write_type_5("evv", data.getEvv());
      ser.write_type_7("dead_reckoning", data.getDeadReckoning());
      ser.write_type_5("vxy_max", data.getVxyMax());
      ser.write_type_5("vz_max", data.getVzMax());
      ser.write_type_5("hagl_min", data.getHaglMin());
      ser.write_type_5("hagl_max", data.getHaglMax());
   }

   @Override
   public final void deserialize(us.ihmc.idl.InterchangeSerializer ser, px4_msgs.msg.dds.VehicleLocalPosition data)
   {
      data.setTimestamp(ser.read_type_12("timestamp"));
      data.setTimestampSample(ser.read_type_12("timestamp_sample"));
      data.setXyValid(ser.read_type_7("xy_valid"));
      data.setZValid(ser.read_type_7("z_valid"));
      data.setVXyValid(ser.read_type_7("v_xy_valid"));
      data.setVZValid(ser.read_type_7("v_z_valid"));
      data.setX(ser.read_type_5("x"));
      data.setY(ser.read_type_5("y"));
      data.setZ(ser.read_type_5("z"));
      ser.read_type_f("delta_xy", data.getDeltaXy());
      data.setXyResetCounter(ser.read_type_9("xy_reset_counter"));
      data.setDeltaZ(ser.read_type_5("delta_z"));
      data.setZResetCounter(ser.read_type_9("z_reset_counter"));
      data.setVx(ser.read_type_5("vx"));
      data.setVy(ser.read_type_5("vy"));
      data.setVz(ser.read_type_5("vz"));
      data.setZDeriv(ser.read_type_5("z_deriv"));
      ser.read_type_f("delta_vxy", data.getDeltaVxy());
      data.setVxyResetCounter(ser.read_type_9("vxy_reset_counter"));
      data.setDeltaVz(ser.read_type_5("delta_vz"));
      data.setVzResetCounter(ser.read_type_9("vz_reset_counter"));
      data.setAx(ser.read_type_5("ax"));
      data.setAy(ser.read_type_5("ay"));
      data.setAz(ser.read_type_5("az"));
      data.setHeading(ser.read_type_5("heading"));
      data.setHeadingVar(ser.read_type_5("heading_var"));
      data.setUnaidedHeading(ser.read_type_5("unaided_heading"));
      data.setDeltaHeading(ser.read_type_5("delta_heading"));
      data.setHeadingResetCounter(ser.read_type_9("heading_reset_counter"));
      data.setHeadingGoodForControl(ser.read_type_7("heading_good_for_control"));
      data.setTiltVar(ser.read_type_5("tilt_var"));
      data.setXyGlobal(ser.read_type_7("xy_global"));
      data.setZGlobal(ser.read_type_7("z_global"));
      data.setRefTimestamp(ser.read_type_12("ref_timestamp"));
      data.setRefLat(ser.read_type_6("ref_lat"));
      data.setRefLon(ser.read_type_6("ref_lon"));
      data.setRefAlt(ser.read_type_5("ref_alt"));
      data.setDistBottomValid(ser.read_type_7("dist_bottom_valid"));
      data.setDistBottom(ser.read_type_5("dist_bottom"));
      data.setDistBottomVar(ser.read_type_5("dist_bottom_var"));
      data.setDeltaDistBottom(ser.read_type_5("delta_dist_bottom"));
      data.setDistBottomResetCounter(ser.read_type_9("dist_bottom_reset_counter"));
      data.setDistBottomSensorBitfield(ser.read_type_9("dist_bottom_sensor_bitfield"));
      data.setEph(ser.read_type_5("eph"));
      data.setEpv(ser.read_type_5("epv"));
      data.setEvh(ser.read_type_5("evh"));
      data.setEvv(ser.read_type_5("evv"));
      data.setDeadReckoning(ser.read_type_7("dead_reckoning"));
      data.setVxyMax(ser.read_type_5("vxy_max"));
      data.setVzMax(ser.read_type_5("vz_max"));
      data.setHaglMin(ser.read_type_5("hagl_min"));
      data.setHaglMax(ser.read_type_5("hagl_max"));
   }

   public static void staticCopy(px4_msgs.msg.dds.VehicleLocalPosition src, px4_msgs.msg.dds.VehicleLocalPosition dest)
   {
      dest.set(src);
   }

   @Override
   public px4_msgs.msg.dds.VehicleLocalPosition createData()
   {
      return new px4_msgs.msg.dds.VehicleLocalPosition();
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
   
   public void serialize(px4_msgs.msg.dds.VehicleLocalPosition data, us.ihmc.idl.CDR cdr)
   {
      write(data, cdr);
   }

   public void deserialize(px4_msgs.msg.dds.VehicleLocalPosition data, us.ihmc.idl.CDR cdr)
   {
      read(data, cdr);
   }
   
   public void copy(px4_msgs.msg.dds.VehicleLocalPosition src, px4_msgs.msg.dds.VehicleLocalPosition dest)
   {
      staticCopy(src, dest);
   }

   @Override
   public VehicleLocalPositionPubSubType newInstance()
   {
      return new VehicleLocalPositionPubSubType();
   }
}
