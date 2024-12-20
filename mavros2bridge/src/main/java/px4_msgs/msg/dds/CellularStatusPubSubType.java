package px4_msgs.msg.dds;

/**
* 
* Topic data type of the struct "CellularStatus" defined in "CellularStatus_.idl". Use this class to provide the TopicDataType to a Participant. 
*
* This file was automatically generated from CellularStatus_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit CellularStatus_.idl instead.
*
*/
public class CellularStatusPubSubType implements us.ihmc.pubsub.TopicDataType<px4_msgs.msg.dds.CellularStatus>
{
   public static final java.lang.String name = "px4_msgs::msg::dds_::CellularStatus_";
   
   @Override
   public final java.lang.String getDefinitionChecksum()
   {
   		return "81e1b88ab303134f07c504c61d8380eee226bbf0b87243eb69a6a43e31b71e2d";
   }
   
   @Override
   public final java.lang.String getDefinitionVersion()
   {
   		return "";
   }

   private final us.ihmc.idl.CDR serializeCDR = new us.ihmc.idl.CDR();
   private final us.ihmc.idl.CDR deserializeCDR = new us.ihmc.idl.CDR();

   @Override
   public void serialize(px4_msgs.msg.dds.CellularStatus data, us.ihmc.pubsub.common.SerializedPayload serializedPayload) throws java.io.IOException
   {
      serializeCDR.serialize(serializedPayload);
      write(data, serializeCDR);
      serializeCDR.finishSerialize();
   }

   @Override
   public void deserialize(us.ihmc.pubsub.common.SerializedPayload serializedPayload, px4_msgs.msg.dds.CellularStatus data) throws java.io.IOException
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

      current_alignment += 2 + us.ihmc.idl.CDR.alignment(current_alignment, 2);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 2 + us.ihmc.idl.CDR.alignment(current_alignment, 2);

      current_alignment += 2 + us.ihmc.idl.CDR.alignment(current_alignment, 2);

      current_alignment += 2 + us.ihmc.idl.CDR.alignment(current_alignment, 2);


      return current_alignment - initial_alignment;
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.CellularStatus data)
   {
      return getCdrSerializedSize(data, 0);
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.CellularStatus data, int current_alignment)
   {
      int initial_alignment = current_alignment;

      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += 2 + us.ihmc.idl.CDR.alignment(current_alignment, 2);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 2 + us.ihmc.idl.CDR.alignment(current_alignment, 2);


      current_alignment += 2 + us.ihmc.idl.CDR.alignment(current_alignment, 2);


      current_alignment += 2 + us.ihmc.idl.CDR.alignment(current_alignment, 2);



      return current_alignment - initial_alignment;
   }

   public static void write(px4_msgs.msg.dds.CellularStatus data, us.ihmc.idl.CDR cdr)
   {
      cdr.write_type_12(data.getTimestamp());

      cdr.write_type_3(data.getStatus());

      cdr.write_type_9(data.getFailureReason());

      cdr.write_type_9(data.getType());

      cdr.write_type_9(data.getQuality());

      cdr.write_type_3(data.getMcc());

      cdr.write_type_3(data.getMnc());

      cdr.write_type_3(data.getLac());

   }

   public static void read(px4_msgs.msg.dds.CellularStatus data, us.ihmc.idl.CDR cdr)
   {
      data.setTimestamp(cdr.read_type_12());
      	
      data.setStatus(cdr.read_type_3());
      	
      data.setFailureReason(cdr.read_type_9());
      	
      data.setType(cdr.read_type_9());
      	
      data.setQuality(cdr.read_type_9());
      	
      data.setMcc(cdr.read_type_3());
      	
      data.setMnc(cdr.read_type_3());
      	
      data.setLac(cdr.read_type_3());
      	

   }

   @Override
   public final void serialize(px4_msgs.msg.dds.CellularStatus data, us.ihmc.idl.InterchangeSerializer ser)
   {
      ser.write_type_12("timestamp", data.getTimestamp());
      ser.write_type_3("status", data.getStatus());
      ser.write_type_9("failure_reason", data.getFailureReason());
      ser.write_type_9("type", data.getType());
      ser.write_type_9("quality", data.getQuality());
      ser.write_type_3("mcc", data.getMcc());
      ser.write_type_3("mnc", data.getMnc());
      ser.write_type_3("lac", data.getLac());
   }

   @Override
   public final void deserialize(us.ihmc.idl.InterchangeSerializer ser, px4_msgs.msg.dds.CellularStatus data)
   {
      data.setTimestamp(ser.read_type_12("timestamp"));
      data.setStatus(ser.read_type_3("status"));
      data.setFailureReason(ser.read_type_9("failure_reason"));
      data.setType(ser.read_type_9("type"));
      data.setQuality(ser.read_type_9("quality"));
      data.setMcc(ser.read_type_3("mcc"));
      data.setMnc(ser.read_type_3("mnc"));
      data.setLac(ser.read_type_3("lac"));
   }

   public static void staticCopy(px4_msgs.msg.dds.CellularStatus src, px4_msgs.msg.dds.CellularStatus dest)
   {
      dest.set(src);
   }

   @Override
   public px4_msgs.msg.dds.CellularStatus createData()
   {
      return new px4_msgs.msg.dds.CellularStatus();
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
   
   public void serialize(px4_msgs.msg.dds.CellularStatus data, us.ihmc.idl.CDR cdr)
   {
      write(data, cdr);
   }

   public void deserialize(px4_msgs.msg.dds.CellularStatus data, us.ihmc.idl.CDR cdr)
   {
      read(data, cdr);
   }
   
   public void copy(px4_msgs.msg.dds.CellularStatus src, px4_msgs.msg.dds.CellularStatus dest)
   {
      staticCopy(src, dest);
   }

   @Override
   public CellularStatusPubSubType newInstance()
   {
      return new CellularStatusPubSubType();
   }
}
