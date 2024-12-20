package px4_msgs.msg.dds;

/**
* 
* Topic data type of the struct "Mission" defined in "Mission_.idl". Use this class to provide the TopicDataType to a Participant. 
*
* This file was automatically generated from Mission_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit Mission_.idl instead.
*
*/
public class MissionPubSubType implements us.ihmc.pubsub.TopicDataType<px4_msgs.msg.dds.Mission>
{
   public static final java.lang.String name = "px4_msgs::msg::dds_::Mission_";
   
   @Override
   public final java.lang.String getDefinitionChecksum()
   {
   		return "c59772610220b8a498dc186a2724344443f18102d8440d6ed642b4aa81c57cc1";
   }
   
   @Override
   public final java.lang.String getDefinitionVersion()
   {
   		return "";
   }

   private final us.ihmc.idl.CDR serializeCDR = new us.ihmc.idl.CDR();
   private final us.ihmc.idl.CDR deserializeCDR = new us.ihmc.idl.CDR();

   @Override
   public void serialize(px4_msgs.msg.dds.Mission data, us.ihmc.pubsub.common.SerializedPayload serializedPayload) throws java.io.IOException
   {
      serializeCDR.serialize(serializedPayload);
      write(data, serializeCDR);
      serializeCDR.finishSerialize();
   }

   @Override
   public void deserialize(us.ihmc.pubsub.common.SerializedPayload serializedPayload, px4_msgs.msg.dds.Mission data) throws java.io.IOException
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

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 2 + us.ihmc.idl.CDR.alignment(current_alignment, 2);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      return current_alignment - initial_alignment;
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.Mission data)
   {
      return getCdrSerializedSize(data, 0);
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.Mission data, int current_alignment)
   {
      int initial_alignment = current_alignment;

      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 2 + us.ihmc.idl.CDR.alignment(current_alignment, 2);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);



      return current_alignment - initial_alignment;
   }

   public static void write(px4_msgs.msg.dds.Mission data, us.ihmc.idl.CDR cdr)
   {
      cdr.write_type_12(data.getTimestamp());

      cdr.write_type_9(data.getMissionDatamanId());

      cdr.write_type_9(data.getFenceDatamanId());

      cdr.write_type_9(data.getSafepointDatamanId());

      cdr.write_type_3(data.getCount());

      cdr.write_type_2(data.getCurrentSeq());

      cdr.write_type_2(data.getLandStartIndex());

      cdr.write_type_2(data.getLandIndex());

      cdr.write_type_4(data.getMissionId());

      cdr.write_type_4(data.getGeofenceId());

      cdr.write_type_4(data.getSafePointsId());

   }

   public static void read(px4_msgs.msg.dds.Mission data, us.ihmc.idl.CDR cdr)
   {
      data.setTimestamp(cdr.read_type_12());
      	
      data.setMissionDatamanId(cdr.read_type_9());
      	
      data.setFenceDatamanId(cdr.read_type_9());
      	
      data.setSafepointDatamanId(cdr.read_type_9());
      	
      data.setCount(cdr.read_type_3());
      	
      data.setCurrentSeq(cdr.read_type_2());
      	
      data.setLandStartIndex(cdr.read_type_2());
      	
      data.setLandIndex(cdr.read_type_2());
      	
      data.setMissionId(cdr.read_type_4());
      	
      data.setGeofenceId(cdr.read_type_4());
      	
      data.setSafePointsId(cdr.read_type_4());
      	

   }

   @Override
   public final void serialize(px4_msgs.msg.dds.Mission data, us.ihmc.idl.InterchangeSerializer ser)
   {
      ser.write_type_12("timestamp", data.getTimestamp());
      ser.write_type_9("mission_dataman_id", data.getMissionDatamanId());
      ser.write_type_9("fence_dataman_id", data.getFenceDatamanId());
      ser.write_type_9("safepoint_dataman_id", data.getSafepointDatamanId());
      ser.write_type_3("count", data.getCount());
      ser.write_type_2("current_seq", data.getCurrentSeq());
      ser.write_type_2("land_start_index", data.getLandStartIndex());
      ser.write_type_2("land_index", data.getLandIndex());
      ser.write_type_4("mission_id", data.getMissionId());
      ser.write_type_4("geofence_id", data.getGeofenceId());
      ser.write_type_4("safe_points_id", data.getSafePointsId());
   }

   @Override
   public final void deserialize(us.ihmc.idl.InterchangeSerializer ser, px4_msgs.msg.dds.Mission data)
   {
      data.setTimestamp(ser.read_type_12("timestamp"));
      data.setMissionDatamanId(ser.read_type_9("mission_dataman_id"));
      data.setFenceDatamanId(ser.read_type_9("fence_dataman_id"));
      data.setSafepointDatamanId(ser.read_type_9("safepoint_dataman_id"));
      data.setCount(ser.read_type_3("count"));
      data.setCurrentSeq(ser.read_type_2("current_seq"));
      data.setLandStartIndex(ser.read_type_2("land_start_index"));
      data.setLandIndex(ser.read_type_2("land_index"));
      data.setMissionId(ser.read_type_4("mission_id"));
      data.setGeofenceId(ser.read_type_4("geofence_id"));
      data.setSafePointsId(ser.read_type_4("safe_points_id"));
   }

   public static void staticCopy(px4_msgs.msg.dds.Mission src, px4_msgs.msg.dds.Mission dest)
   {
      dest.set(src);
   }

   @Override
   public px4_msgs.msg.dds.Mission createData()
   {
      return new px4_msgs.msg.dds.Mission();
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
   
   public void serialize(px4_msgs.msg.dds.Mission data, us.ihmc.idl.CDR cdr)
   {
      write(data, cdr);
   }

   public void deserialize(px4_msgs.msg.dds.Mission data, us.ihmc.idl.CDR cdr)
   {
      read(data, cdr);
   }
   
   public void copy(px4_msgs.msg.dds.Mission src, px4_msgs.msg.dds.Mission dest)
   {
      staticCopy(src, dest);
   }

   @Override
   public MissionPubSubType newInstance()
   {
      return new MissionPubSubType();
   }
}
