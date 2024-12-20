package px4_msgs.msg.dds;

/**
* 
* Topic data type of the struct "GeofenceResult" defined in "GeofenceResult_.idl". Use this class to provide the TopicDataType to a Participant. 
*
* This file was automatically generated from GeofenceResult_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit GeofenceResult_.idl instead.
*
*/
public class GeofenceResultPubSubType implements us.ihmc.pubsub.TopicDataType<px4_msgs.msg.dds.GeofenceResult>
{
   public static final java.lang.String name = "px4_msgs::msg::dds_::GeofenceResult_";
   
   @Override
   public final java.lang.String getDefinitionChecksum()
   {
   		return "f6654b265d70e366db6ae8bfd0f83ff788052ed893fc36dbbccbfdb97178c36a";
   }
   
   @Override
   public final java.lang.String getDefinitionVersion()
   {
   		return "";
   }

   private final us.ihmc.idl.CDR serializeCDR = new us.ihmc.idl.CDR();
   private final us.ihmc.idl.CDR deserializeCDR = new us.ihmc.idl.CDR();

   @Override
   public void serialize(px4_msgs.msg.dds.GeofenceResult data, us.ihmc.pubsub.common.SerializedPayload serializedPayload) throws java.io.IOException
   {
      serializeCDR.serialize(serializedPayload);
      write(data, serializeCDR);
      serializeCDR.finishSerialize();
   }

   @Override
   public void deserialize(us.ihmc.pubsub.common.SerializedPayload serializedPayload, px4_msgs.msg.dds.GeofenceResult data) throws java.io.IOException
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

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      return current_alignment - initial_alignment;
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.GeofenceResult data)
   {
      return getCdrSerializedSize(data, 0);
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.GeofenceResult data, int current_alignment)
   {
      int initial_alignment = current_alignment;

      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);



      return current_alignment - initial_alignment;
   }

   public static void write(px4_msgs.msg.dds.GeofenceResult data, us.ihmc.idl.CDR cdr)
   {
      cdr.write_type_12(data.getTimestamp());

      cdr.write_type_7(data.getGeofenceMaxDistTriggered());

      cdr.write_type_7(data.getGeofenceMaxAltTriggered());

      cdr.write_type_7(data.getGeofenceCustomFenceTriggered());

      cdr.write_type_9(data.getGeofenceAction());

   }

   public static void read(px4_msgs.msg.dds.GeofenceResult data, us.ihmc.idl.CDR cdr)
   {
      data.setTimestamp(cdr.read_type_12());
      	
      data.setGeofenceMaxDistTriggered(cdr.read_type_7());
      	
      data.setGeofenceMaxAltTriggered(cdr.read_type_7());
      	
      data.setGeofenceCustomFenceTriggered(cdr.read_type_7());
      	
      data.setGeofenceAction(cdr.read_type_9());
      	

   }

   @Override
   public final void serialize(px4_msgs.msg.dds.GeofenceResult data, us.ihmc.idl.InterchangeSerializer ser)
   {
      ser.write_type_12("timestamp", data.getTimestamp());
      ser.write_type_7("geofence_max_dist_triggered", data.getGeofenceMaxDistTriggered());
      ser.write_type_7("geofence_max_alt_triggered", data.getGeofenceMaxAltTriggered());
      ser.write_type_7("geofence_custom_fence_triggered", data.getGeofenceCustomFenceTriggered());
      ser.write_type_9("geofence_action", data.getGeofenceAction());
   }

   @Override
   public final void deserialize(us.ihmc.idl.InterchangeSerializer ser, px4_msgs.msg.dds.GeofenceResult data)
   {
      data.setTimestamp(ser.read_type_12("timestamp"));
      data.setGeofenceMaxDistTriggered(ser.read_type_7("geofence_max_dist_triggered"));
      data.setGeofenceMaxAltTriggered(ser.read_type_7("geofence_max_alt_triggered"));
      data.setGeofenceCustomFenceTriggered(ser.read_type_7("geofence_custom_fence_triggered"));
      data.setGeofenceAction(ser.read_type_9("geofence_action"));
   }

   public static void staticCopy(px4_msgs.msg.dds.GeofenceResult src, px4_msgs.msg.dds.GeofenceResult dest)
   {
      dest.set(src);
   }

   @Override
   public px4_msgs.msg.dds.GeofenceResult createData()
   {
      return new px4_msgs.msg.dds.GeofenceResult();
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
   
   public void serialize(px4_msgs.msg.dds.GeofenceResult data, us.ihmc.idl.CDR cdr)
   {
      write(data, cdr);
   }

   public void deserialize(px4_msgs.msg.dds.GeofenceResult data, us.ihmc.idl.CDR cdr)
   {
      read(data, cdr);
   }
   
   public void copy(px4_msgs.msg.dds.GeofenceResult src, px4_msgs.msg.dds.GeofenceResult dest)
   {
      staticCopy(src, dest);
   }

   @Override
   public GeofenceResultPubSubType newInstance()
   {
      return new GeofenceResultPubSubType();
   }
}
