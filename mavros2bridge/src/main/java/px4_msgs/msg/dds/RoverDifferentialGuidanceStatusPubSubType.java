package px4_msgs.msg.dds;

/**
* 
* Topic data type of the struct "RoverDifferentialGuidanceStatus" defined in "RoverDifferentialGuidanceStatus_.idl". Use this class to provide the TopicDataType to a Participant. 
*
* This file was automatically generated from RoverDifferentialGuidanceStatus_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit RoverDifferentialGuidanceStatus_.idl instead.
*
*/
public class RoverDifferentialGuidanceStatusPubSubType implements us.ihmc.pubsub.TopicDataType<px4_msgs.msg.dds.RoverDifferentialGuidanceStatus>
{
   public static final java.lang.String name = "px4_msgs::msg::dds_::RoverDifferentialGuidanceStatus_";
   
   @Override
   public final java.lang.String getDefinitionChecksum()
   {
   		return "50920c15e49d939d8bea0532951d5d1bfcb04d29374ec9180ccba561704e9dfb";
   }
   
   @Override
   public final java.lang.String getDefinitionVersion()
   {
   		return "";
   }

   private final us.ihmc.idl.CDR serializeCDR = new us.ihmc.idl.CDR();
   private final us.ihmc.idl.CDR deserializeCDR = new us.ihmc.idl.CDR();

   @Override
   public void serialize(px4_msgs.msg.dds.RoverDifferentialGuidanceStatus data, us.ihmc.pubsub.common.SerializedPayload serializedPayload) throws java.io.IOException
   {
      serializeCDR.serialize(serializedPayload);
      write(data, serializeCDR);
      serializeCDR.finishSerialize();
   }

   @Override
   public void deserialize(us.ihmc.pubsub.common.SerializedPayload serializedPayload, px4_msgs.msg.dds.RoverDifferentialGuidanceStatus data) throws java.io.IOException
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

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      return current_alignment - initial_alignment;
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.RoverDifferentialGuidanceStatus data)
   {
      return getCdrSerializedSize(data, 0);
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.RoverDifferentialGuidanceStatus data, int current_alignment)
   {
      int initial_alignment = current_alignment;

      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);



      return current_alignment - initial_alignment;
   }

   public static void write(px4_msgs.msg.dds.RoverDifferentialGuidanceStatus data, us.ihmc.idl.CDR cdr)
   {
      cdr.write_type_12(data.getTimestamp());

      cdr.write_type_5(data.getLookaheadDistance());

      cdr.write_type_5(data.getHeadingErrorDeg());

      cdr.write_type_9(data.getStateMachine());

   }

   public static void read(px4_msgs.msg.dds.RoverDifferentialGuidanceStatus data, us.ihmc.idl.CDR cdr)
   {
      data.setTimestamp(cdr.read_type_12());
      	
      data.setLookaheadDistance(cdr.read_type_5());
      	
      data.setHeadingErrorDeg(cdr.read_type_5());
      	
      data.setStateMachine(cdr.read_type_9());
      	

   }

   @Override
   public final void serialize(px4_msgs.msg.dds.RoverDifferentialGuidanceStatus data, us.ihmc.idl.InterchangeSerializer ser)
   {
      ser.write_type_12("timestamp", data.getTimestamp());
      ser.write_type_5("lookahead_distance", data.getLookaheadDistance());
      ser.write_type_5("heading_error_deg", data.getHeadingErrorDeg());
      ser.write_type_9("state_machine", data.getStateMachine());
   }

   @Override
   public final void deserialize(us.ihmc.idl.InterchangeSerializer ser, px4_msgs.msg.dds.RoverDifferentialGuidanceStatus data)
   {
      data.setTimestamp(ser.read_type_12("timestamp"));
      data.setLookaheadDistance(ser.read_type_5("lookahead_distance"));
      data.setHeadingErrorDeg(ser.read_type_5("heading_error_deg"));
      data.setStateMachine(ser.read_type_9("state_machine"));
   }

   public static void staticCopy(px4_msgs.msg.dds.RoverDifferentialGuidanceStatus src, px4_msgs.msg.dds.RoverDifferentialGuidanceStatus dest)
   {
      dest.set(src);
   }

   @Override
   public px4_msgs.msg.dds.RoverDifferentialGuidanceStatus createData()
   {
      return new px4_msgs.msg.dds.RoverDifferentialGuidanceStatus();
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
   
   public void serialize(px4_msgs.msg.dds.RoverDifferentialGuidanceStatus data, us.ihmc.idl.CDR cdr)
   {
      write(data, cdr);
   }

   public void deserialize(px4_msgs.msg.dds.RoverDifferentialGuidanceStatus data, us.ihmc.idl.CDR cdr)
   {
      read(data, cdr);
   }
   
   public void copy(px4_msgs.msg.dds.RoverDifferentialGuidanceStatus src, px4_msgs.msg.dds.RoverDifferentialGuidanceStatus dest)
   {
      staticCopy(src, dest);
   }

   @Override
   public RoverDifferentialGuidanceStatusPubSubType newInstance()
   {
      return new RoverDifferentialGuidanceStatusPubSubType();
   }
}
