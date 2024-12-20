package px4_msgs.msg.dds;

/**
* 
* Topic data type of the struct "ObstacleDistance" defined in "ObstacleDistance_.idl". Use this class to provide the TopicDataType to a Participant. 
*
* This file was automatically generated from ObstacleDistance_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit ObstacleDistance_.idl instead.
*
*/
public class ObstacleDistancePubSubType implements us.ihmc.pubsub.TopicDataType<px4_msgs.msg.dds.ObstacleDistance>
{
   public static final java.lang.String name = "px4_msgs::msg::dds_::ObstacleDistance_";
   
   @Override
   public final java.lang.String getDefinitionChecksum()
   {
   		return "91621fe73d85b7608e6fbd5098b03a859913aef66283186218f50fd1470e20b8";
   }
   
   @Override
   public final java.lang.String getDefinitionVersion()
   {
   		return "";
   }

   private final us.ihmc.idl.CDR serializeCDR = new us.ihmc.idl.CDR();
   private final us.ihmc.idl.CDR deserializeCDR = new us.ihmc.idl.CDR();

   @Override
   public void serialize(px4_msgs.msg.dds.ObstacleDistance data, us.ihmc.pubsub.common.SerializedPayload serializedPayload) throws java.io.IOException
   {
      serializeCDR.serialize(serializedPayload);
      write(data, serializeCDR);
      serializeCDR.finishSerialize();
   }

   @Override
   public void deserialize(us.ihmc.pubsub.common.SerializedPayload serializedPayload, px4_msgs.msg.dds.ObstacleDistance data) throws java.io.IOException
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

      current_alignment += 2 + us.ihmc.idl.CDR.alignment(current_alignment, 2);

      current_alignment += 2 + us.ihmc.idl.CDR.alignment(current_alignment, 2);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      return current_alignment - initial_alignment;
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.ObstacleDistance data)
   {
      return getCdrSerializedSize(data, 0);
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.ObstacleDistance data, int current_alignment)
   {
      int initial_alignment = current_alignment;

      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 2 + us.ihmc.idl.CDR.alignment(current_alignment, 2);


      current_alignment += 2 + us.ihmc.idl.CDR.alignment(current_alignment, 2);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);



      return current_alignment - initial_alignment;
   }

   public static void write(px4_msgs.msg.dds.ObstacleDistance data, us.ihmc.idl.CDR cdr)
   {
      cdr.write_type_12(data.getTimestamp());

      cdr.write_type_9(data.getFrame());

      cdr.write_type_9(data.getSensorType());

      cdr.write_type_5(data.getIncrement());

      cdr.write_type_3(data.getMinDistance());

      cdr.write_type_3(data.getMaxDistance());

      cdr.write_type_5(data.getAngleOffset());

   }

   public static void read(px4_msgs.msg.dds.ObstacleDistance data, us.ihmc.idl.CDR cdr)
   {
      data.setTimestamp(cdr.read_type_12());
      	
      data.setFrame(cdr.read_type_9());
      	
      data.setSensorType(cdr.read_type_9());
      	
      data.setIncrement(cdr.read_type_5());
      	
      data.setMinDistance(cdr.read_type_3());
      	
      data.setMaxDistance(cdr.read_type_3());
      	
      data.setAngleOffset(cdr.read_type_5());
      	

   }

   @Override
   public final void serialize(px4_msgs.msg.dds.ObstacleDistance data, us.ihmc.idl.InterchangeSerializer ser)
   {
      ser.write_type_12("timestamp", data.getTimestamp());
      ser.write_type_9("frame", data.getFrame());
      ser.write_type_9("sensor_type", data.getSensorType());
      ser.write_type_5("increment", data.getIncrement());
      ser.write_type_3("min_distance", data.getMinDistance());
      ser.write_type_3("max_distance", data.getMaxDistance());
      ser.write_type_5("angle_offset", data.getAngleOffset());
   }

   @Override
   public final void deserialize(us.ihmc.idl.InterchangeSerializer ser, px4_msgs.msg.dds.ObstacleDistance data)
   {
      data.setTimestamp(ser.read_type_12("timestamp"));
      data.setFrame(ser.read_type_9("frame"));
      data.setSensorType(ser.read_type_9("sensor_type"));
      data.setIncrement(ser.read_type_5("increment"));
      data.setMinDistance(ser.read_type_3("min_distance"));
      data.setMaxDistance(ser.read_type_3("max_distance"));
      data.setAngleOffset(ser.read_type_5("angle_offset"));
   }

   public static void staticCopy(px4_msgs.msg.dds.ObstacleDistance src, px4_msgs.msg.dds.ObstacleDistance dest)
   {
      dest.set(src);
   }

   @Override
   public px4_msgs.msg.dds.ObstacleDistance createData()
   {
      return new px4_msgs.msg.dds.ObstacleDistance();
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
   
   public void serialize(px4_msgs.msg.dds.ObstacleDistance data, us.ihmc.idl.CDR cdr)
   {
      write(data, cdr);
   }

   public void deserialize(px4_msgs.msg.dds.ObstacleDistance data, us.ihmc.idl.CDR cdr)
   {
      read(data, cdr);
   }
   
   public void copy(px4_msgs.msg.dds.ObstacleDistance src, px4_msgs.msg.dds.ObstacleDistance dest)
   {
      staticCopy(src, dest);
   }

   @Override
   public ObstacleDistancePubSubType newInstance()
   {
      return new ObstacleDistancePubSubType();
   }
}
