package px4_msgs.msg.dds;

/**
* 
* Topic data type of the struct "FigureEightStatus" defined in "FigureEightStatus_.idl". Use this class to provide the TopicDataType to a Participant. 
*
* This file was automatically generated from FigureEightStatus_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit FigureEightStatus_.idl instead.
*
*/
public class FigureEightStatusPubSubType implements us.ihmc.pubsub.TopicDataType<px4_msgs.msg.dds.FigureEightStatus>
{
   public static final java.lang.String name = "px4_msgs::msg::dds_::FigureEightStatus_";
   
   @Override
   public final java.lang.String getDefinitionChecksum()
   {
   		return "42e69da40bc22f86ab88a5e0ed09d63a07786a19e528baced26064d5a01bb63b";
   }
   
   @Override
   public final java.lang.String getDefinitionVersion()
   {
   		return "";
   }

   private final us.ihmc.idl.CDR serializeCDR = new us.ihmc.idl.CDR();
   private final us.ihmc.idl.CDR deserializeCDR = new us.ihmc.idl.CDR();

   @Override
   public void serialize(px4_msgs.msg.dds.FigureEightStatus data, us.ihmc.pubsub.common.SerializedPayload serializedPayload) throws java.io.IOException
   {
      serializeCDR.serialize(serializedPayload);
      write(data, serializeCDR);
      serializeCDR.finishSerialize();
   }

   @Override
   public void deserialize(us.ihmc.pubsub.common.SerializedPayload serializedPayload, px4_msgs.msg.dds.FigureEightStatus data) throws java.io.IOException
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

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      return current_alignment - initial_alignment;
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.FigureEightStatus data)
   {
      return getCdrSerializedSize(data, 0);
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.FigureEightStatus data, int current_alignment)
   {
      int initial_alignment = current_alignment;

      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);



      return current_alignment - initial_alignment;
   }

   public static void write(px4_msgs.msg.dds.FigureEightStatus data, us.ihmc.idl.CDR cdr)
   {
      cdr.write_type_12(data.getTimestamp());

      cdr.write_type_5(data.getMajorRadius());

      cdr.write_type_5(data.getMinorRadius());

      cdr.write_type_5(data.getOrientation());

      cdr.write_type_9(data.getFrame());

      cdr.write_type_2(data.getX());

      cdr.write_type_2(data.getY());

      cdr.write_type_5(data.getZ());

   }

   public static void read(px4_msgs.msg.dds.FigureEightStatus data, us.ihmc.idl.CDR cdr)
   {
      data.setTimestamp(cdr.read_type_12());
      	
      data.setMajorRadius(cdr.read_type_5());
      	
      data.setMinorRadius(cdr.read_type_5());
      	
      data.setOrientation(cdr.read_type_5());
      	
      data.setFrame(cdr.read_type_9());
      	
      data.setX(cdr.read_type_2());
      	
      data.setY(cdr.read_type_2());
      	
      data.setZ(cdr.read_type_5());
      	

   }

   @Override
   public final void serialize(px4_msgs.msg.dds.FigureEightStatus data, us.ihmc.idl.InterchangeSerializer ser)
   {
      ser.write_type_12("timestamp", data.getTimestamp());
      ser.write_type_5("major_radius", data.getMajorRadius());
      ser.write_type_5("minor_radius", data.getMinorRadius());
      ser.write_type_5("orientation", data.getOrientation());
      ser.write_type_9("frame", data.getFrame());
      ser.write_type_2("x", data.getX());
      ser.write_type_2("y", data.getY());
      ser.write_type_5("z", data.getZ());
   }

   @Override
   public final void deserialize(us.ihmc.idl.InterchangeSerializer ser, px4_msgs.msg.dds.FigureEightStatus data)
   {
      data.setTimestamp(ser.read_type_12("timestamp"));
      data.setMajorRadius(ser.read_type_5("major_radius"));
      data.setMinorRadius(ser.read_type_5("minor_radius"));
      data.setOrientation(ser.read_type_5("orientation"));
      data.setFrame(ser.read_type_9("frame"));
      data.setX(ser.read_type_2("x"));
      data.setY(ser.read_type_2("y"));
      data.setZ(ser.read_type_5("z"));
   }

   public static void staticCopy(px4_msgs.msg.dds.FigureEightStatus src, px4_msgs.msg.dds.FigureEightStatus dest)
   {
      dest.set(src);
   }

   @Override
   public px4_msgs.msg.dds.FigureEightStatus createData()
   {
      return new px4_msgs.msg.dds.FigureEightStatus();
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
   
   public void serialize(px4_msgs.msg.dds.FigureEightStatus data, us.ihmc.idl.CDR cdr)
   {
      write(data, cdr);
   }

   public void deserialize(px4_msgs.msg.dds.FigureEightStatus data, us.ihmc.idl.CDR cdr)
   {
      read(data, cdr);
   }
   
   public void copy(px4_msgs.msg.dds.FigureEightStatus src, px4_msgs.msg.dds.FigureEightStatus dest)
   {
      staticCopy(src, dest);
   }

   @Override
   public FigureEightStatusPubSubType newInstance()
   {
      return new FigureEightStatusPubSubType();
   }
}
