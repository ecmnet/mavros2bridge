package px4_msgs.msg.dds;

/**
* 
* Topic data type of the struct "VehicleRoi" defined in "VehicleRoi_.idl". Use this class to provide the TopicDataType to a Participant. 
*
* This file was automatically generated from VehicleRoi_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit VehicleRoi_.idl instead.
*
*/
public class VehicleRoiPubSubType implements us.ihmc.pubsub.TopicDataType<px4_msgs.msg.dds.VehicleRoi>
{
   public static final java.lang.String name = "px4_msgs::msg::dds_::VehicleRoi_";
   
   @Override
   public final java.lang.String getDefinitionChecksum()
   {
   		return "ee3b7899cff3f90f05ea7eef63dbccc182cf3ff58005fe888617caf481f5a63e";
   }
   
   @Override
   public final java.lang.String getDefinitionVersion()
   {
   		return "";
   }

   private final us.ihmc.idl.CDR serializeCDR = new us.ihmc.idl.CDR();
   private final us.ihmc.idl.CDR deserializeCDR = new us.ihmc.idl.CDR();

   @Override
   public void serialize(px4_msgs.msg.dds.VehicleRoi data, us.ihmc.pubsub.common.SerializedPayload serializedPayload) throws java.io.IOException
   {
      serializeCDR.serialize(serializedPayload);
      write(data, serializeCDR);
      serializeCDR.finishSerialize();
   }

   @Override
   public void deserialize(us.ihmc.pubsub.common.SerializedPayload serializedPayload, px4_msgs.msg.dds.VehicleRoi data) throws java.io.IOException
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

      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);

      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      return current_alignment - initial_alignment;
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.VehicleRoi data)
   {
      return getCdrSerializedSize(data, 0);
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.VehicleRoi data, int current_alignment)
   {
      int initial_alignment = current_alignment;

      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);



      return current_alignment - initial_alignment;
   }

   public static void write(px4_msgs.msg.dds.VehicleRoi data, us.ihmc.idl.CDR cdr)
   {
      cdr.write_type_12(data.getTimestamp());

      cdr.write_type_9(data.getMode());

      cdr.write_type_6(data.getLat());

      cdr.write_type_6(data.getLon());

      cdr.write_type_5(data.getAlt());

      cdr.write_type_5(data.getRollOffset());

      cdr.write_type_5(data.getPitchOffset());

      cdr.write_type_5(data.getYawOffset());

   }

   public static void read(px4_msgs.msg.dds.VehicleRoi data, us.ihmc.idl.CDR cdr)
   {
      data.setTimestamp(cdr.read_type_12());
      	
      data.setMode(cdr.read_type_9());
      	
      data.setLat(cdr.read_type_6());
      	
      data.setLon(cdr.read_type_6());
      	
      data.setAlt(cdr.read_type_5());
      	
      data.setRollOffset(cdr.read_type_5());
      	
      data.setPitchOffset(cdr.read_type_5());
      	
      data.setYawOffset(cdr.read_type_5());
      	

   }

   @Override
   public final void serialize(px4_msgs.msg.dds.VehicleRoi data, us.ihmc.idl.InterchangeSerializer ser)
   {
      ser.write_type_12("timestamp", data.getTimestamp());
      ser.write_type_9("mode", data.getMode());
      ser.write_type_6("lat", data.getLat());
      ser.write_type_6("lon", data.getLon());
      ser.write_type_5("alt", data.getAlt());
      ser.write_type_5("roll_offset", data.getRollOffset());
      ser.write_type_5("pitch_offset", data.getPitchOffset());
      ser.write_type_5("yaw_offset", data.getYawOffset());
   }

   @Override
   public final void deserialize(us.ihmc.idl.InterchangeSerializer ser, px4_msgs.msg.dds.VehicleRoi data)
   {
      data.setTimestamp(ser.read_type_12("timestamp"));
      data.setMode(ser.read_type_9("mode"));
      data.setLat(ser.read_type_6("lat"));
      data.setLon(ser.read_type_6("lon"));
      data.setAlt(ser.read_type_5("alt"));
      data.setRollOffset(ser.read_type_5("roll_offset"));
      data.setPitchOffset(ser.read_type_5("pitch_offset"));
      data.setYawOffset(ser.read_type_5("yaw_offset"));
   }

   public static void staticCopy(px4_msgs.msg.dds.VehicleRoi src, px4_msgs.msg.dds.VehicleRoi dest)
   {
      dest.set(src);
   }

   @Override
   public px4_msgs.msg.dds.VehicleRoi createData()
   {
      return new px4_msgs.msg.dds.VehicleRoi();
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
   
   public void serialize(px4_msgs.msg.dds.VehicleRoi data, us.ihmc.idl.CDR cdr)
   {
      write(data, cdr);
   }

   public void deserialize(px4_msgs.msg.dds.VehicleRoi data, us.ihmc.idl.CDR cdr)
   {
      read(data, cdr);
   }
   
   public void copy(px4_msgs.msg.dds.VehicleRoi src, px4_msgs.msg.dds.VehicleRoi dest)
   {
      staticCopy(src, dest);
   }

   @Override
   public VehicleRoiPubSubType newInstance()
   {
      return new VehicleRoiPubSubType();
   }
}
