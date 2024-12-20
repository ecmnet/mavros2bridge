package px4_msgs.msg.dds;

/**
* 
* Topic data type of the struct "OrbitStatus" defined in "OrbitStatus_.idl". Use this class to provide the TopicDataType to a Participant. 
*
* This file was automatically generated from OrbitStatus_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit OrbitStatus_.idl instead.
*
*/
public class OrbitStatusPubSubType implements us.ihmc.pubsub.TopicDataType<px4_msgs.msg.dds.OrbitStatus>
{
   public static final java.lang.String name = "px4_msgs::msg::dds_::OrbitStatus_";
   
   @Override
   public final java.lang.String getDefinitionChecksum()
   {
   		return "ec0acd0b4da137698dc77f9470569a92bccb4fe7f3aa455d1d9f22ab42b77647";
   }
   
   @Override
   public final java.lang.String getDefinitionVersion()
   {
   		return "";
   }

   private final us.ihmc.idl.CDR serializeCDR = new us.ihmc.idl.CDR();
   private final us.ihmc.idl.CDR deserializeCDR = new us.ihmc.idl.CDR();

   @Override
   public void serialize(px4_msgs.msg.dds.OrbitStatus data, us.ihmc.pubsub.common.SerializedPayload serializedPayload) throws java.io.IOException
   {
      serializeCDR.serialize(serializedPayload);
      write(data, serializeCDR);
      serializeCDR.finishSerialize();
   }

   @Override
   public void deserialize(us.ihmc.pubsub.common.SerializedPayload serializedPayload, px4_msgs.msg.dds.OrbitStatus data) throws java.io.IOException
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

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);

      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      return current_alignment - initial_alignment;
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.OrbitStatus data)
   {
      return getCdrSerializedSize(data, 0);
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.OrbitStatus data, int current_alignment)
   {
      int initial_alignment = current_alignment;

      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);



      return current_alignment - initial_alignment;
   }

   public static void write(px4_msgs.msg.dds.OrbitStatus data, us.ihmc.idl.CDR cdr)
   {
      cdr.write_type_12(data.getTimestamp());

      cdr.write_type_5(data.getRadius());

      cdr.write_type_9(data.getFrame());

      cdr.write_type_6(data.getX());

      cdr.write_type_6(data.getY());

      cdr.write_type_5(data.getZ());

      cdr.write_type_9(data.getYawBehaviour());

   }

   public static void read(px4_msgs.msg.dds.OrbitStatus data, us.ihmc.idl.CDR cdr)
   {
      data.setTimestamp(cdr.read_type_12());
      	
      data.setRadius(cdr.read_type_5());
      	
      data.setFrame(cdr.read_type_9());
      	
      data.setX(cdr.read_type_6());
      	
      data.setY(cdr.read_type_6());
      	
      data.setZ(cdr.read_type_5());
      	
      data.setYawBehaviour(cdr.read_type_9());
      	

   }

   @Override
   public final void serialize(px4_msgs.msg.dds.OrbitStatus data, us.ihmc.idl.InterchangeSerializer ser)
   {
      ser.write_type_12("timestamp", data.getTimestamp());
      ser.write_type_5("radius", data.getRadius());
      ser.write_type_9("frame", data.getFrame());
      ser.write_type_6("x", data.getX());
      ser.write_type_6("y", data.getY());
      ser.write_type_5("z", data.getZ());
      ser.write_type_9("yaw_behaviour", data.getYawBehaviour());
   }

   @Override
   public final void deserialize(us.ihmc.idl.InterchangeSerializer ser, px4_msgs.msg.dds.OrbitStatus data)
   {
      data.setTimestamp(ser.read_type_12("timestamp"));
      data.setRadius(ser.read_type_5("radius"));
      data.setFrame(ser.read_type_9("frame"));
      data.setX(ser.read_type_6("x"));
      data.setY(ser.read_type_6("y"));
      data.setZ(ser.read_type_5("z"));
      data.setYawBehaviour(ser.read_type_9("yaw_behaviour"));
   }

   public static void staticCopy(px4_msgs.msg.dds.OrbitStatus src, px4_msgs.msg.dds.OrbitStatus dest)
   {
      dest.set(src);
   }

   @Override
   public px4_msgs.msg.dds.OrbitStatus createData()
   {
      return new px4_msgs.msg.dds.OrbitStatus();
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
   
   public void serialize(px4_msgs.msg.dds.OrbitStatus data, us.ihmc.idl.CDR cdr)
   {
      write(data, cdr);
   }

   public void deserialize(px4_msgs.msg.dds.OrbitStatus data, us.ihmc.idl.CDR cdr)
   {
      read(data, cdr);
   }
   
   public void copy(px4_msgs.msg.dds.OrbitStatus src, px4_msgs.msg.dds.OrbitStatus dest)
   {
      staticCopy(src, dest);
   }

   @Override
   public OrbitStatusPubSubType newInstance()
   {
      return new OrbitStatusPubSubType();
   }
}
