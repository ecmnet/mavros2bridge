package px4_msgs.msg.dds;

/**
* 
* Topic data type of the struct "PositionSetpoint" defined in "PositionSetpoint_.idl". Use this class to provide the TopicDataType to a Participant. 
*
* This file was automatically generated from PositionSetpoint_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit PositionSetpoint_.idl instead.
*
*/
public class PositionSetpointPubSubType implements us.ihmc.pubsub.TopicDataType<px4_msgs.msg.dds.PositionSetpoint>
{
   public static final java.lang.String name = "px4_msgs::msg::dds_::PositionSetpoint_";
   
   @Override
   public final java.lang.String getDefinitionChecksum()
   {
   		return "f566944f774f0cbe64bf1f41e3859260461f10efbea4260af36c6dfa248f9a80";
   }
   
   @Override
   public final java.lang.String getDefinitionVersion()
   {
   		return "";
   }

   private final us.ihmc.idl.CDR serializeCDR = new us.ihmc.idl.CDR();
   private final us.ihmc.idl.CDR deserializeCDR = new us.ihmc.idl.CDR();

   @Override
   public void serialize(px4_msgs.msg.dds.PositionSetpoint data, us.ihmc.pubsub.common.SerializedPayload serializedPayload) throws java.io.IOException
   {
      serializeCDR.serialize(serializedPayload);
      write(data, serializeCDR);
      serializeCDR.finishSerialize();
   }

   @Override
   public void deserialize(us.ihmc.pubsub.common.SerializedPayload serializedPayload, px4_msgs.msg.dds.PositionSetpoint data) throws java.io.IOException
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

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);

      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      return current_alignment - initial_alignment;
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.PositionSetpoint data)
   {
      return getCdrSerializedSize(data, 0);
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.PositionSetpoint data, int current_alignment)
   {
      int initial_alignment = current_alignment;

      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);



      return current_alignment - initial_alignment;
   }

   public static void write(px4_msgs.msg.dds.PositionSetpoint data, us.ihmc.idl.CDR cdr)
   {
      cdr.write_type_12(data.getTimestamp());

      cdr.write_type_7(data.getValid());

      cdr.write_type_9(data.getType());

      cdr.write_type_5(data.getVx());

      cdr.write_type_5(data.getVy());

      cdr.write_type_5(data.getVz());

      cdr.write_type_6(data.getLat());

      cdr.write_type_6(data.getLon());

      cdr.write_type_5(data.getAlt());

      cdr.write_type_5(data.getYaw());

      cdr.write_type_5(data.getLoiterRadius());

      cdr.write_type_5(data.getLoiterMinorRadius());

      cdr.write_type_7(data.getLoiterDirectionCounterClockwise());

      cdr.write_type_5(data.getLoiterOrientation());

      cdr.write_type_9(data.getLoiterPattern());

      cdr.write_type_5(data.getAcceptanceRadius());

      cdr.write_type_5(data.getAltAcceptanceRadius());

      cdr.write_type_5(data.getCruisingSpeed());

      cdr.write_type_7(data.getGlidingEnabled());

      cdr.write_type_5(data.getCruisingThrottle());

   }

   public static void read(px4_msgs.msg.dds.PositionSetpoint data, us.ihmc.idl.CDR cdr)
   {
      data.setTimestamp(cdr.read_type_12());
      	
      data.setValid(cdr.read_type_7());
      	
      data.setType(cdr.read_type_9());
      	
      data.setVx(cdr.read_type_5());
      	
      data.setVy(cdr.read_type_5());
      	
      data.setVz(cdr.read_type_5());
      	
      data.setLat(cdr.read_type_6());
      	
      data.setLon(cdr.read_type_6());
      	
      data.setAlt(cdr.read_type_5());
      	
      data.setYaw(cdr.read_type_5());
      	
      data.setLoiterRadius(cdr.read_type_5());
      	
      data.setLoiterMinorRadius(cdr.read_type_5());
      	
      data.setLoiterDirectionCounterClockwise(cdr.read_type_7());
      	
      data.setLoiterOrientation(cdr.read_type_5());
      	
      data.setLoiterPattern(cdr.read_type_9());
      	
      data.setAcceptanceRadius(cdr.read_type_5());
      	
      data.setAltAcceptanceRadius(cdr.read_type_5());
      	
      data.setCruisingSpeed(cdr.read_type_5());
      	
      data.setGlidingEnabled(cdr.read_type_7());
      	
      data.setCruisingThrottle(cdr.read_type_5());
      	

   }

   @Override
   public final void serialize(px4_msgs.msg.dds.PositionSetpoint data, us.ihmc.idl.InterchangeSerializer ser)
   {
      ser.write_type_12("timestamp", data.getTimestamp());
      ser.write_type_7("valid", data.getValid());
      ser.write_type_9("type", data.getType());
      ser.write_type_5("vx", data.getVx());
      ser.write_type_5("vy", data.getVy());
      ser.write_type_5("vz", data.getVz());
      ser.write_type_6("lat", data.getLat());
      ser.write_type_6("lon", data.getLon());
      ser.write_type_5("alt", data.getAlt());
      ser.write_type_5("yaw", data.getYaw());
      ser.write_type_5("loiter_radius", data.getLoiterRadius());
      ser.write_type_5("loiter_minor_radius", data.getLoiterMinorRadius());
      ser.write_type_7("loiter_direction_counter_clockwise", data.getLoiterDirectionCounterClockwise());
      ser.write_type_5("loiter_orientation", data.getLoiterOrientation());
      ser.write_type_9("loiter_pattern", data.getLoiterPattern());
      ser.write_type_5("acceptance_radius", data.getAcceptanceRadius());
      ser.write_type_5("alt_acceptance_radius", data.getAltAcceptanceRadius());
      ser.write_type_5("cruising_speed", data.getCruisingSpeed());
      ser.write_type_7("gliding_enabled", data.getGlidingEnabled());
      ser.write_type_5("cruising_throttle", data.getCruisingThrottle());
   }

   @Override
   public final void deserialize(us.ihmc.idl.InterchangeSerializer ser, px4_msgs.msg.dds.PositionSetpoint data)
   {
      data.setTimestamp(ser.read_type_12("timestamp"));
      data.setValid(ser.read_type_7("valid"));
      data.setType(ser.read_type_9("type"));
      data.setVx(ser.read_type_5("vx"));
      data.setVy(ser.read_type_5("vy"));
      data.setVz(ser.read_type_5("vz"));
      data.setLat(ser.read_type_6("lat"));
      data.setLon(ser.read_type_6("lon"));
      data.setAlt(ser.read_type_5("alt"));
      data.setYaw(ser.read_type_5("yaw"));
      data.setLoiterRadius(ser.read_type_5("loiter_radius"));
      data.setLoiterMinorRadius(ser.read_type_5("loiter_minor_radius"));
      data.setLoiterDirectionCounterClockwise(ser.read_type_7("loiter_direction_counter_clockwise"));
      data.setLoiterOrientation(ser.read_type_5("loiter_orientation"));
      data.setLoiterPattern(ser.read_type_9("loiter_pattern"));
      data.setAcceptanceRadius(ser.read_type_5("acceptance_radius"));
      data.setAltAcceptanceRadius(ser.read_type_5("alt_acceptance_radius"));
      data.setCruisingSpeed(ser.read_type_5("cruising_speed"));
      data.setGlidingEnabled(ser.read_type_7("gliding_enabled"));
      data.setCruisingThrottle(ser.read_type_5("cruising_throttle"));
   }

   public static void staticCopy(px4_msgs.msg.dds.PositionSetpoint src, px4_msgs.msg.dds.PositionSetpoint dest)
   {
      dest.set(src);
   }

   @Override
   public px4_msgs.msg.dds.PositionSetpoint createData()
   {
      return new px4_msgs.msg.dds.PositionSetpoint();
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
   
   public void serialize(px4_msgs.msg.dds.PositionSetpoint data, us.ihmc.idl.CDR cdr)
   {
      write(data, cdr);
   }

   public void deserialize(px4_msgs.msg.dds.PositionSetpoint data, us.ihmc.idl.CDR cdr)
   {
      read(data, cdr);
   }
   
   public void copy(px4_msgs.msg.dds.PositionSetpoint src, px4_msgs.msg.dds.PositionSetpoint dest)
   {
      staticCopy(src, dest);
   }

   @Override
   public PositionSetpointPubSubType newInstance()
   {
      return new PositionSetpointPubSubType();
   }
}
