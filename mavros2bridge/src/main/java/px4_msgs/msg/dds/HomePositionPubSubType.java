package px4_msgs.msg.dds;

/**
* 
* Topic data type of the struct "HomePosition" defined in "HomePosition_.idl". Use this class to provide the TopicDataType to a Participant. 
*
* This file was automatically generated from HomePosition_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit HomePosition_.idl instead.
*
*/
public class HomePositionPubSubType implements us.ihmc.pubsub.TopicDataType<px4_msgs.msg.dds.HomePosition>
{
   public static final java.lang.String name = "px4_msgs::msg::dds_::HomePosition_";
   
   @Override
   public final java.lang.String getDefinitionChecksum()
   {
   		return "6966abd7160e14ccf8174207133ffa6aa72ea478627f9735c881cf670f50051b";
   }
   
   @Override
   public final java.lang.String getDefinitionVersion()
   {
   		return "";
   }

   private final us.ihmc.idl.CDR serializeCDR = new us.ihmc.idl.CDR();
   private final us.ihmc.idl.CDR deserializeCDR = new us.ihmc.idl.CDR();

   @Override
   public void serialize(px4_msgs.msg.dds.HomePosition data, us.ihmc.pubsub.common.SerializedPayload serializedPayload) throws java.io.IOException
   {
      serializeCDR.serialize(serializedPayload);
      write(data, serializeCDR);
      serializeCDR.finishSerialize();
   }

   @Override
   public void deserialize(us.ihmc.pubsub.common.SerializedPayload serializedPayload, px4_msgs.msg.dds.HomePosition data) throws java.io.IOException
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

      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);

      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      return current_alignment - initial_alignment;
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.HomePosition data)
   {
      return getCdrSerializedSize(data, 0);
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.HomePosition data, int current_alignment)
   {
      int initial_alignment = current_alignment;

      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);



      return current_alignment - initial_alignment;
   }

   public static void write(px4_msgs.msg.dds.HomePosition data, us.ihmc.idl.CDR cdr)
   {
      cdr.write_type_12(data.getTimestamp());

      cdr.write_type_6(data.getLat());

      cdr.write_type_6(data.getLon());

      cdr.write_type_5(data.getAlt());

      cdr.write_type_5(data.getX());

      cdr.write_type_5(data.getY());

      cdr.write_type_5(data.getZ());

      cdr.write_type_5(data.getYaw());

      cdr.write_type_7(data.getValidAlt());

      cdr.write_type_7(data.getValidHpos());

      cdr.write_type_7(data.getValidLpos());

      cdr.write_type_7(data.getManualHome());

      cdr.write_type_4(data.getUpdateCount());

   }

   public static void read(px4_msgs.msg.dds.HomePosition data, us.ihmc.idl.CDR cdr)
   {
      data.setTimestamp(cdr.read_type_12());
      	
      data.setLat(cdr.read_type_6());
      	
      data.setLon(cdr.read_type_6());
      	
      data.setAlt(cdr.read_type_5());
      	
      data.setX(cdr.read_type_5());
      	
      data.setY(cdr.read_type_5());
      	
      data.setZ(cdr.read_type_5());
      	
      data.setYaw(cdr.read_type_5());
      	
      data.setValidAlt(cdr.read_type_7());
      	
      data.setValidHpos(cdr.read_type_7());
      	
      data.setValidLpos(cdr.read_type_7());
      	
      data.setManualHome(cdr.read_type_7());
      	
      data.setUpdateCount(cdr.read_type_4());
      	

   }

   @Override
   public final void serialize(px4_msgs.msg.dds.HomePosition data, us.ihmc.idl.InterchangeSerializer ser)
   {
      ser.write_type_12("timestamp", data.getTimestamp());
      ser.write_type_6("lat", data.getLat());
      ser.write_type_6("lon", data.getLon());
      ser.write_type_5("alt", data.getAlt());
      ser.write_type_5("x", data.getX());
      ser.write_type_5("y", data.getY());
      ser.write_type_5("z", data.getZ());
      ser.write_type_5("yaw", data.getYaw());
      ser.write_type_7("valid_alt", data.getValidAlt());
      ser.write_type_7("valid_hpos", data.getValidHpos());
      ser.write_type_7("valid_lpos", data.getValidLpos());
      ser.write_type_7("manual_home", data.getManualHome());
      ser.write_type_4("update_count", data.getUpdateCount());
   }

   @Override
   public final void deserialize(us.ihmc.idl.InterchangeSerializer ser, px4_msgs.msg.dds.HomePosition data)
   {
      data.setTimestamp(ser.read_type_12("timestamp"));
      data.setLat(ser.read_type_6("lat"));
      data.setLon(ser.read_type_6("lon"));
      data.setAlt(ser.read_type_5("alt"));
      data.setX(ser.read_type_5("x"));
      data.setY(ser.read_type_5("y"));
      data.setZ(ser.read_type_5("z"));
      data.setYaw(ser.read_type_5("yaw"));
      data.setValidAlt(ser.read_type_7("valid_alt"));
      data.setValidHpos(ser.read_type_7("valid_hpos"));
      data.setValidLpos(ser.read_type_7("valid_lpos"));
      data.setManualHome(ser.read_type_7("manual_home"));
      data.setUpdateCount(ser.read_type_4("update_count"));
   }

   public static void staticCopy(px4_msgs.msg.dds.HomePosition src, px4_msgs.msg.dds.HomePosition dest)
   {
      dest.set(src);
   }

   @Override
   public px4_msgs.msg.dds.HomePosition createData()
   {
      return new px4_msgs.msg.dds.HomePosition();
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
   
   public void serialize(px4_msgs.msg.dds.HomePosition data, us.ihmc.idl.CDR cdr)
   {
      write(data, cdr);
   }

   public void deserialize(px4_msgs.msg.dds.HomePosition data, us.ihmc.idl.CDR cdr)
   {
      read(data, cdr);
   }
   
   public void copy(px4_msgs.msg.dds.HomePosition src, px4_msgs.msg.dds.HomePosition dest)
   {
      staticCopy(src, dest);
   }

   @Override
   public HomePositionPubSubType newInstance()
   {
      return new HomePositionPubSubType();
   }
}
