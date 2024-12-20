package px4_msgs.msg.dds;

/**
* 
* Topic data type of the struct "NavigatorMissionItem" defined in "NavigatorMissionItem_.idl". Use this class to provide the TopicDataType to a Participant. 
*
* This file was automatically generated from NavigatorMissionItem_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit NavigatorMissionItem_.idl instead.
*
*/
public class NavigatorMissionItemPubSubType implements us.ihmc.pubsub.TopicDataType<px4_msgs.msg.dds.NavigatorMissionItem>
{
   public static final java.lang.String name = "px4_msgs::msg::dds_::NavigatorMissionItem_";
   
   @Override
   public final java.lang.String getDefinitionChecksum()
   {
   		return "684f6658d3edc9e2cc767d415cfead370e8793afff2d2c5df5b943b5a4ad841c";
   }
   
   @Override
   public final java.lang.String getDefinitionVersion()
   {
   		return "";
   }

   private final us.ihmc.idl.CDR serializeCDR = new us.ihmc.idl.CDR();
   private final us.ihmc.idl.CDR deserializeCDR = new us.ihmc.idl.CDR();

   @Override
   public void serialize(px4_msgs.msg.dds.NavigatorMissionItem data, us.ihmc.pubsub.common.SerializedPayload serializedPayload) throws java.io.IOException
   {
      serializeCDR.serialize(serializedPayload);
      write(data, serializeCDR);
      serializeCDR.finishSerialize();
   }

   @Override
   public void deserialize(us.ihmc.pubsub.common.SerializedPayload serializedPayload, px4_msgs.msg.dds.NavigatorMissionItem data) throws java.io.IOException
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

      current_alignment += 2 + us.ihmc.idl.CDR.alignment(current_alignment, 2);

      current_alignment += 2 + us.ihmc.idl.CDR.alignment(current_alignment, 2);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

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


      return current_alignment - initial_alignment;
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.NavigatorMissionItem data)
   {
      return getCdrSerializedSize(data, 0);
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.NavigatorMissionItem data, int current_alignment)
   {
      int initial_alignment = current_alignment;

      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += 2 + us.ihmc.idl.CDR.alignment(current_alignment, 2);


      current_alignment += 2 + us.ihmc.idl.CDR.alignment(current_alignment, 2);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


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



      return current_alignment - initial_alignment;
   }

   public static void write(px4_msgs.msg.dds.NavigatorMissionItem data, us.ihmc.idl.CDR cdr)
   {
      cdr.write_type_12(data.getTimestamp());

      cdr.write_type_3(data.getSequenceCurrent());

      cdr.write_type_3(data.getNavCmd());

      cdr.write_type_5(data.getLatitude());

      cdr.write_type_5(data.getLongitude());

      cdr.write_type_5(data.getTimeInside());

      cdr.write_type_5(data.getAcceptanceRadius());

      cdr.write_type_5(data.getLoiterRadius());

      cdr.write_type_5(data.getYaw());

      cdr.write_type_5(data.getAltitude());

      cdr.write_type_9(data.getFrame());

      cdr.write_type_9(data.getOrigin());

      cdr.write_type_7(data.getLoiterExitXtrack());

      cdr.write_type_7(data.getForceHeading());

      cdr.write_type_7(data.getAltitudeIsRelative());

      cdr.write_type_7(data.getAutocontinue());

      cdr.write_type_7(data.getVtolBackTransition());

   }

   public static void read(px4_msgs.msg.dds.NavigatorMissionItem data, us.ihmc.idl.CDR cdr)
   {
      data.setTimestamp(cdr.read_type_12());
      	
      data.setSequenceCurrent(cdr.read_type_3());
      	
      data.setNavCmd(cdr.read_type_3());
      	
      data.setLatitude(cdr.read_type_5());
      	
      data.setLongitude(cdr.read_type_5());
      	
      data.setTimeInside(cdr.read_type_5());
      	
      data.setAcceptanceRadius(cdr.read_type_5());
      	
      data.setLoiterRadius(cdr.read_type_5());
      	
      data.setYaw(cdr.read_type_5());
      	
      data.setAltitude(cdr.read_type_5());
      	
      data.setFrame(cdr.read_type_9());
      	
      data.setOrigin(cdr.read_type_9());
      	
      data.setLoiterExitXtrack(cdr.read_type_7());
      	
      data.setForceHeading(cdr.read_type_7());
      	
      data.setAltitudeIsRelative(cdr.read_type_7());
      	
      data.setAutocontinue(cdr.read_type_7());
      	
      data.setVtolBackTransition(cdr.read_type_7());
      	

   }

   @Override
   public final void serialize(px4_msgs.msg.dds.NavigatorMissionItem data, us.ihmc.idl.InterchangeSerializer ser)
   {
      ser.write_type_12("timestamp", data.getTimestamp());
      ser.write_type_3("sequence_current", data.getSequenceCurrent());
      ser.write_type_3("nav_cmd", data.getNavCmd());
      ser.write_type_5("latitude", data.getLatitude());
      ser.write_type_5("longitude", data.getLongitude());
      ser.write_type_5("time_inside", data.getTimeInside());
      ser.write_type_5("acceptance_radius", data.getAcceptanceRadius());
      ser.write_type_5("loiter_radius", data.getLoiterRadius());
      ser.write_type_5("yaw", data.getYaw());
      ser.write_type_5("altitude", data.getAltitude());
      ser.write_type_9("frame", data.getFrame());
      ser.write_type_9("origin", data.getOrigin());
      ser.write_type_7("loiter_exit_xtrack", data.getLoiterExitXtrack());
      ser.write_type_7("force_heading", data.getForceHeading());
      ser.write_type_7("altitude_is_relative", data.getAltitudeIsRelative());
      ser.write_type_7("autocontinue", data.getAutocontinue());
      ser.write_type_7("vtol_back_transition", data.getVtolBackTransition());
   }

   @Override
   public final void deserialize(us.ihmc.idl.InterchangeSerializer ser, px4_msgs.msg.dds.NavigatorMissionItem data)
   {
      data.setTimestamp(ser.read_type_12("timestamp"));
      data.setSequenceCurrent(ser.read_type_3("sequence_current"));
      data.setNavCmd(ser.read_type_3("nav_cmd"));
      data.setLatitude(ser.read_type_5("latitude"));
      data.setLongitude(ser.read_type_5("longitude"));
      data.setTimeInside(ser.read_type_5("time_inside"));
      data.setAcceptanceRadius(ser.read_type_5("acceptance_radius"));
      data.setLoiterRadius(ser.read_type_5("loiter_radius"));
      data.setYaw(ser.read_type_5("yaw"));
      data.setAltitude(ser.read_type_5("altitude"));
      data.setFrame(ser.read_type_9("frame"));
      data.setOrigin(ser.read_type_9("origin"));
      data.setLoiterExitXtrack(ser.read_type_7("loiter_exit_xtrack"));
      data.setForceHeading(ser.read_type_7("force_heading"));
      data.setAltitudeIsRelative(ser.read_type_7("altitude_is_relative"));
      data.setAutocontinue(ser.read_type_7("autocontinue"));
      data.setVtolBackTransition(ser.read_type_7("vtol_back_transition"));
   }

   public static void staticCopy(px4_msgs.msg.dds.NavigatorMissionItem src, px4_msgs.msg.dds.NavigatorMissionItem dest)
   {
      dest.set(src);
   }

   @Override
   public px4_msgs.msg.dds.NavigatorMissionItem createData()
   {
      return new px4_msgs.msg.dds.NavigatorMissionItem();
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
   
   public void serialize(px4_msgs.msg.dds.NavigatorMissionItem data, us.ihmc.idl.CDR cdr)
   {
      write(data, cdr);
   }

   public void deserialize(px4_msgs.msg.dds.NavigatorMissionItem data, us.ihmc.idl.CDR cdr)
   {
      read(data, cdr);
   }
   
   public void copy(px4_msgs.msg.dds.NavigatorMissionItem src, px4_msgs.msg.dds.NavigatorMissionItem dest)
   {
      staticCopy(src, dest);
   }

   @Override
   public NavigatorMissionItemPubSubType newInstance()
   {
      return new NavigatorMissionItemPubSubType();
   }
}
