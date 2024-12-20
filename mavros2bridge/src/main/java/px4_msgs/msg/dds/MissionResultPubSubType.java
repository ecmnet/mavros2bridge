package px4_msgs.msg.dds;

/**
* 
* Topic data type of the struct "MissionResult" defined in "MissionResult_.idl". Use this class to provide the TopicDataType to a Participant. 
*
* This file was automatically generated from MissionResult_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit MissionResult_.idl instead.
*
*/
public class MissionResultPubSubType implements us.ihmc.pubsub.TopicDataType<px4_msgs.msg.dds.MissionResult>
{
   public static final java.lang.String name = "px4_msgs::msg::dds_::MissionResult_";
   
   @Override
   public final java.lang.String getDefinitionChecksum()
   {
   		return "543280df4b64953f77339f86130b178b46b935398a4a5c7293a735e5c107d2c7";
   }
   
   @Override
   public final java.lang.String getDefinitionVersion()
   {
   		return "";
   }

   private final us.ihmc.idl.CDR serializeCDR = new us.ihmc.idl.CDR();
   private final us.ihmc.idl.CDR deserializeCDR = new us.ihmc.idl.CDR();

   @Override
   public void serialize(px4_msgs.msg.dds.MissionResult data, us.ihmc.pubsub.common.SerializedPayload serializedPayload) throws java.io.IOException
   {
      serializeCDR.serialize(serializedPayload);
      write(data, serializeCDR);
      serializeCDR.finishSerialize();
   }

   @Override
   public void deserialize(us.ihmc.pubsub.common.SerializedPayload serializedPayload, px4_msgs.msg.dds.MissionResult data) throws java.io.IOException
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

      current_alignment += 2 + us.ihmc.idl.CDR.alignment(current_alignment, 2);

      current_alignment += 2 + us.ihmc.idl.CDR.alignment(current_alignment, 2);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 2 + us.ihmc.idl.CDR.alignment(current_alignment, 2);

      current_alignment += 2 + us.ihmc.idl.CDR.alignment(current_alignment, 2);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      return current_alignment - initial_alignment;
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.MissionResult data)
   {
      return getCdrSerializedSize(data, 0);
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.MissionResult data, int current_alignment)
   {
      int initial_alignment = current_alignment;

      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 2 + us.ihmc.idl.CDR.alignment(current_alignment, 2);


      current_alignment += 2 + us.ihmc.idl.CDR.alignment(current_alignment, 2);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 2 + us.ihmc.idl.CDR.alignment(current_alignment, 2);


      current_alignment += 2 + us.ihmc.idl.CDR.alignment(current_alignment, 2);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);



      return current_alignment - initial_alignment;
   }

   public static void write(px4_msgs.msg.dds.MissionResult data, us.ihmc.idl.CDR cdr)
   {
      cdr.write_type_12(data.getTimestamp());

      cdr.write_type_4(data.getMissionId());

      cdr.write_type_4(data.getGeofenceId());

      cdr.write_type_4(data.getHomePositionCounter());

      cdr.write_type_2(data.getSeqReached());

      cdr.write_type_3(data.getSeqCurrent());

      cdr.write_type_3(data.getSeqTotal());

      cdr.write_type_7(data.getValid());

      cdr.write_type_7(data.getWarning());

      cdr.write_type_7(data.getFinished());

      cdr.write_type_7(data.getFailure());

      cdr.write_type_7(data.getItemDoJumpChanged());

      cdr.write_type_3(data.getItemChangedIndex());

      cdr.write_type_3(data.getItemDoJumpRemaining());

      cdr.write_type_9(data.getExecutionMode());

   }

   public static void read(px4_msgs.msg.dds.MissionResult data, us.ihmc.idl.CDR cdr)
   {
      data.setTimestamp(cdr.read_type_12());
      	
      data.setMissionId(cdr.read_type_4());
      	
      data.setGeofenceId(cdr.read_type_4());
      	
      data.setHomePositionCounter(cdr.read_type_4());
      	
      data.setSeqReached(cdr.read_type_2());
      	
      data.setSeqCurrent(cdr.read_type_3());
      	
      data.setSeqTotal(cdr.read_type_3());
      	
      data.setValid(cdr.read_type_7());
      	
      data.setWarning(cdr.read_type_7());
      	
      data.setFinished(cdr.read_type_7());
      	
      data.setFailure(cdr.read_type_7());
      	
      data.setItemDoJumpChanged(cdr.read_type_7());
      	
      data.setItemChangedIndex(cdr.read_type_3());
      	
      data.setItemDoJumpRemaining(cdr.read_type_3());
      	
      data.setExecutionMode(cdr.read_type_9());
      	

   }

   @Override
   public final void serialize(px4_msgs.msg.dds.MissionResult data, us.ihmc.idl.InterchangeSerializer ser)
   {
      ser.write_type_12("timestamp", data.getTimestamp());
      ser.write_type_4("mission_id", data.getMissionId());
      ser.write_type_4("geofence_id", data.getGeofenceId());
      ser.write_type_4("home_position_counter", data.getHomePositionCounter());
      ser.write_type_2("seq_reached", data.getSeqReached());
      ser.write_type_3("seq_current", data.getSeqCurrent());
      ser.write_type_3("seq_total", data.getSeqTotal());
      ser.write_type_7("valid", data.getValid());
      ser.write_type_7("warning", data.getWarning());
      ser.write_type_7("finished", data.getFinished());
      ser.write_type_7("failure", data.getFailure());
      ser.write_type_7("item_do_jump_changed", data.getItemDoJumpChanged());
      ser.write_type_3("item_changed_index", data.getItemChangedIndex());
      ser.write_type_3("item_do_jump_remaining", data.getItemDoJumpRemaining());
      ser.write_type_9("execution_mode", data.getExecutionMode());
   }

   @Override
   public final void deserialize(us.ihmc.idl.InterchangeSerializer ser, px4_msgs.msg.dds.MissionResult data)
   {
      data.setTimestamp(ser.read_type_12("timestamp"));
      data.setMissionId(ser.read_type_4("mission_id"));
      data.setGeofenceId(ser.read_type_4("geofence_id"));
      data.setHomePositionCounter(ser.read_type_4("home_position_counter"));
      data.setSeqReached(ser.read_type_2("seq_reached"));
      data.setSeqCurrent(ser.read_type_3("seq_current"));
      data.setSeqTotal(ser.read_type_3("seq_total"));
      data.setValid(ser.read_type_7("valid"));
      data.setWarning(ser.read_type_7("warning"));
      data.setFinished(ser.read_type_7("finished"));
      data.setFailure(ser.read_type_7("failure"));
      data.setItemDoJumpChanged(ser.read_type_7("item_do_jump_changed"));
      data.setItemChangedIndex(ser.read_type_3("item_changed_index"));
      data.setItemDoJumpRemaining(ser.read_type_3("item_do_jump_remaining"));
      data.setExecutionMode(ser.read_type_9("execution_mode"));
   }

   public static void staticCopy(px4_msgs.msg.dds.MissionResult src, px4_msgs.msg.dds.MissionResult dest)
   {
      dest.set(src);
   }

   @Override
   public px4_msgs.msg.dds.MissionResult createData()
   {
      return new px4_msgs.msg.dds.MissionResult();
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
   
   public void serialize(px4_msgs.msg.dds.MissionResult data, us.ihmc.idl.CDR cdr)
   {
      write(data, cdr);
   }

   public void deserialize(px4_msgs.msg.dds.MissionResult data, us.ihmc.idl.CDR cdr)
   {
      read(data, cdr);
   }
   
   public void copy(px4_msgs.msg.dds.MissionResult src, px4_msgs.msg.dds.MissionResult dest)
   {
      staticCopy(src, dest);
   }

   @Override
   public MissionResultPubSubType newInstance()
   {
      return new MissionResultPubSubType();
   }
}
