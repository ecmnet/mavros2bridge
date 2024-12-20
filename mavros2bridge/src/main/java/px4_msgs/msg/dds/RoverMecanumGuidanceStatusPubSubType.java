package px4_msgs.msg.dds;

/**
* 
* Topic data type of the struct "RoverMecanumGuidanceStatus" defined in "RoverMecanumGuidanceStatus_.idl". Use this class to provide the TopicDataType to a Participant. 
*
* This file was automatically generated from RoverMecanumGuidanceStatus_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit RoverMecanumGuidanceStatus_.idl instead.
*
*/
public class RoverMecanumGuidanceStatusPubSubType implements us.ihmc.pubsub.TopicDataType<px4_msgs.msg.dds.RoverMecanumGuidanceStatus>
{
   public static final java.lang.String name = "px4_msgs::msg::dds_::RoverMecanumGuidanceStatus_";
   
   @Override
   public final java.lang.String getDefinitionChecksum()
   {
   		return "a0def2c21a3919a2b3dd5e1f0978d5ab5e4b0ea1f5dd8c66b3868d268cc77e31";
   }
   
   @Override
   public final java.lang.String getDefinitionVersion()
   {
   		return "";
   }

   private final us.ihmc.idl.CDR serializeCDR = new us.ihmc.idl.CDR();
   private final us.ihmc.idl.CDR deserializeCDR = new us.ihmc.idl.CDR();

   @Override
   public void serialize(px4_msgs.msg.dds.RoverMecanumGuidanceStatus data, us.ihmc.pubsub.common.SerializedPayload serializedPayload) throws java.io.IOException
   {
      serializeCDR.serialize(serializedPayload);
      write(data, serializeCDR);
      serializeCDR.finishSerialize();
   }

   @Override
   public void deserialize(us.ihmc.pubsub.common.SerializedPayload serializedPayload, px4_msgs.msg.dds.RoverMecanumGuidanceStatus data) throws java.io.IOException
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


      return current_alignment - initial_alignment;
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.RoverMecanumGuidanceStatus data)
   {
      return getCdrSerializedSize(data, 0);
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.RoverMecanumGuidanceStatus data, int current_alignment)
   {
      int initial_alignment = current_alignment;

      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);



      return current_alignment - initial_alignment;
   }

   public static void write(px4_msgs.msg.dds.RoverMecanumGuidanceStatus data, us.ihmc.idl.CDR cdr)
   {
      cdr.write_type_12(data.getTimestamp());

      cdr.write_type_5(data.getLookaheadDistance());

      cdr.write_type_5(data.getHeadingError());

      cdr.write_type_5(data.getDesiredSpeed());

   }

   public static void read(px4_msgs.msg.dds.RoverMecanumGuidanceStatus data, us.ihmc.idl.CDR cdr)
   {
      data.setTimestamp(cdr.read_type_12());
      	
      data.setLookaheadDistance(cdr.read_type_5());
      	
      data.setHeadingError(cdr.read_type_5());
      	
      data.setDesiredSpeed(cdr.read_type_5());
      	

   }

   @Override
   public final void serialize(px4_msgs.msg.dds.RoverMecanumGuidanceStatus data, us.ihmc.idl.InterchangeSerializer ser)
   {
      ser.write_type_12("timestamp", data.getTimestamp());
      ser.write_type_5("lookahead_distance", data.getLookaheadDistance());
      ser.write_type_5("heading_error", data.getHeadingError());
      ser.write_type_5("desired_speed", data.getDesiredSpeed());
   }

   @Override
   public final void deserialize(us.ihmc.idl.InterchangeSerializer ser, px4_msgs.msg.dds.RoverMecanumGuidanceStatus data)
   {
      data.setTimestamp(ser.read_type_12("timestamp"));
      data.setLookaheadDistance(ser.read_type_5("lookahead_distance"));
      data.setHeadingError(ser.read_type_5("heading_error"));
      data.setDesiredSpeed(ser.read_type_5("desired_speed"));
   }

   public static void staticCopy(px4_msgs.msg.dds.RoverMecanumGuidanceStatus src, px4_msgs.msg.dds.RoverMecanumGuidanceStatus dest)
   {
      dest.set(src);
   }

   @Override
   public px4_msgs.msg.dds.RoverMecanumGuidanceStatus createData()
   {
      return new px4_msgs.msg.dds.RoverMecanumGuidanceStatus();
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
   
   public void serialize(px4_msgs.msg.dds.RoverMecanumGuidanceStatus data, us.ihmc.idl.CDR cdr)
   {
      write(data, cdr);
   }

   public void deserialize(px4_msgs.msg.dds.RoverMecanumGuidanceStatus data, us.ihmc.idl.CDR cdr)
   {
      read(data, cdr);
   }
   
   public void copy(px4_msgs.msg.dds.RoverMecanumGuidanceStatus src, px4_msgs.msg.dds.RoverMecanumGuidanceStatus dest)
   {
      staticCopy(src, dest);
   }

   @Override
   public RoverMecanumGuidanceStatusPubSubType newInstance()
   {
      return new RoverMecanumGuidanceStatusPubSubType();
   }
}
