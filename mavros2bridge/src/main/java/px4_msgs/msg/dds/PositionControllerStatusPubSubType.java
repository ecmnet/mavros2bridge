package px4_msgs.msg.dds;

/**
* 
* Topic data type of the struct "PositionControllerStatus" defined in "PositionControllerStatus_.idl". Use this class to provide the TopicDataType to a Participant. 
*
* This file was automatically generated from PositionControllerStatus_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit PositionControllerStatus_.idl instead.
*
*/
public class PositionControllerStatusPubSubType implements us.ihmc.pubsub.TopicDataType<px4_msgs.msg.dds.PositionControllerStatus>
{
   public static final java.lang.String name = "px4_msgs::msg::dds_::PositionControllerStatus_";
   
   @Override
   public final java.lang.String getDefinitionChecksum()
   {
   		return "273058cb36e53575f4e88dfdbb84116f082e3e2415a43cf05fc531dc4037eb34";
   }
   
   @Override
   public final java.lang.String getDefinitionVersion()
   {
   		return "";
   }

   private final us.ihmc.idl.CDR serializeCDR = new us.ihmc.idl.CDR();
   private final us.ihmc.idl.CDR deserializeCDR = new us.ihmc.idl.CDR();

   @Override
   public void serialize(px4_msgs.msg.dds.PositionControllerStatus data, us.ihmc.pubsub.common.SerializedPayload serializedPayload) throws java.io.IOException
   {
      serializeCDR.serialize(serializedPayload);
      write(data, serializeCDR);
      serializeCDR.finishSerialize();
   }

   @Override
   public void deserialize(us.ihmc.pubsub.common.SerializedPayload serializedPayload, px4_msgs.msg.dds.PositionControllerStatus data) throws java.io.IOException
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

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.PositionControllerStatus data)
   {
      return getCdrSerializedSize(data, 0);
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.PositionControllerStatus data, int current_alignment)
   {
      int initial_alignment = current_alignment;

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


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);



      return current_alignment - initial_alignment;
   }

   public static void write(px4_msgs.msg.dds.PositionControllerStatus data, us.ihmc.idl.CDR cdr)
   {
      cdr.write_type_12(data.getTimestamp());

      cdr.write_type_5(data.getNavRoll());

      cdr.write_type_5(data.getNavPitch());

      cdr.write_type_5(data.getNavBearing());

      cdr.write_type_5(data.getTargetBearing());

      cdr.write_type_5(data.getXtrackError());

      cdr.write_type_5(data.getWpDist());

      cdr.write_type_5(data.getAcceptanceRadius());

      cdr.write_type_5(data.getYawAcceptance());

      cdr.write_type_5(data.getAltitudeAcceptance());

      cdr.write_type_9(data.getType());

   }

   public static void read(px4_msgs.msg.dds.PositionControllerStatus data, us.ihmc.idl.CDR cdr)
   {
      data.setTimestamp(cdr.read_type_12());
      	
      data.setNavRoll(cdr.read_type_5());
      	
      data.setNavPitch(cdr.read_type_5());
      	
      data.setNavBearing(cdr.read_type_5());
      	
      data.setTargetBearing(cdr.read_type_5());
      	
      data.setXtrackError(cdr.read_type_5());
      	
      data.setWpDist(cdr.read_type_5());
      	
      data.setAcceptanceRadius(cdr.read_type_5());
      	
      data.setYawAcceptance(cdr.read_type_5());
      	
      data.setAltitudeAcceptance(cdr.read_type_5());
      	
      data.setType(cdr.read_type_9());
      	

   }

   @Override
   public final void serialize(px4_msgs.msg.dds.PositionControllerStatus data, us.ihmc.idl.InterchangeSerializer ser)
   {
      ser.write_type_12("timestamp", data.getTimestamp());
      ser.write_type_5("nav_roll", data.getNavRoll());
      ser.write_type_5("nav_pitch", data.getNavPitch());
      ser.write_type_5("nav_bearing", data.getNavBearing());
      ser.write_type_5("target_bearing", data.getTargetBearing());
      ser.write_type_5("xtrack_error", data.getXtrackError());
      ser.write_type_5("wp_dist", data.getWpDist());
      ser.write_type_5("acceptance_radius", data.getAcceptanceRadius());
      ser.write_type_5("yaw_acceptance", data.getYawAcceptance());
      ser.write_type_5("altitude_acceptance", data.getAltitudeAcceptance());
      ser.write_type_9("type", data.getType());
   }

   @Override
   public final void deserialize(us.ihmc.idl.InterchangeSerializer ser, px4_msgs.msg.dds.PositionControllerStatus data)
   {
      data.setTimestamp(ser.read_type_12("timestamp"));
      data.setNavRoll(ser.read_type_5("nav_roll"));
      data.setNavPitch(ser.read_type_5("nav_pitch"));
      data.setNavBearing(ser.read_type_5("nav_bearing"));
      data.setTargetBearing(ser.read_type_5("target_bearing"));
      data.setXtrackError(ser.read_type_5("xtrack_error"));
      data.setWpDist(ser.read_type_5("wp_dist"));
      data.setAcceptanceRadius(ser.read_type_5("acceptance_radius"));
      data.setYawAcceptance(ser.read_type_5("yaw_acceptance"));
      data.setAltitudeAcceptance(ser.read_type_5("altitude_acceptance"));
      data.setType(ser.read_type_9("type"));
   }

   public static void staticCopy(px4_msgs.msg.dds.PositionControllerStatus src, px4_msgs.msg.dds.PositionControllerStatus dest)
   {
      dest.set(src);
   }

   @Override
   public px4_msgs.msg.dds.PositionControllerStatus createData()
   {
      return new px4_msgs.msg.dds.PositionControllerStatus();
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
   
   public void serialize(px4_msgs.msg.dds.PositionControllerStatus data, us.ihmc.idl.CDR cdr)
   {
      write(data, cdr);
   }

   public void deserialize(px4_msgs.msg.dds.PositionControllerStatus data, us.ihmc.idl.CDR cdr)
   {
      read(data, cdr);
   }
   
   public void copy(px4_msgs.msg.dds.PositionControllerStatus src, px4_msgs.msg.dds.PositionControllerStatus dest)
   {
      staticCopy(src, dest);
   }

   @Override
   public PositionControllerStatusPubSubType newInstance()
   {
      return new PositionControllerStatusPubSubType();
   }
}
