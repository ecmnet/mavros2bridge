package px4_msgs.msg.dds;

/**
* 
* Topic data type of the struct "IrlockReport" defined in "IrlockReport_.idl". Use this class to provide the TopicDataType to a Participant. 
*
* This file was automatically generated from IrlockReport_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit IrlockReport_.idl instead.
*
*/
public class IrlockReportPubSubType implements us.ihmc.pubsub.TopicDataType<px4_msgs.msg.dds.IrlockReport>
{
   public static final java.lang.String name = "px4_msgs::msg::dds_::IrlockReport_";
   
   @Override
   public final java.lang.String getDefinitionChecksum()
   {
   		return "5eaee525298b481870aabc87d961a854d9dd8aaa670a46c3a918c449d827bbd9";
   }
   
   @Override
   public final java.lang.String getDefinitionVersion()
   {
   		return "";
   }

   private final us.ihmc.idl.CDR serializeCDR = new us.ihmc.idl.CDR();
   private final us.ihmc.idl.CDR deserializeCDR = new us.ihmc.idl.CDR();

   @Override
   public void serialize(px4_msgs.msg.dds.IrlockReport data, us.ihmc.pubsub.common.SerializedPayload serializedPayload) throws java.io.IOException
   {
      serializeCDR.serialize(serializedPayload);
      write(data, serializeCDR);
      serializeCDR.finishSerialize();
   }

   @Override
   public void deserialize(us.ihmc.pubsub.common.SerializedPayload serializedPayload, px4_msgs.msg.dds.IrlockReport data) throws java.io.IOException
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

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      return current_alignment - initial_alignment;
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.IrlockReport data)
   {
      return getCdrSerializedSize(data, 0);
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.IrlockReport data, int current_alignment)
   {
      int initial_alignment = current_alignment;

      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += 2 + us.ihmc.idl.CDR.alignment(current_alignment, 2);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);



      return current_alignment - initial_alignment;
   }

   public static void write(px4_msgs.msg.dds.IrlockReport data, us.ihmc.idl.CDR cdr)
   {
      cdr.write_type_12(data.getTimestamp());

      cdr.write_type_3(data.getSignature());

      cdr.write_type_5(data.getPosX());

      cdr.write_type_5(data.getPosY());

      cdr.write_type_5(data.getSizeX());

      cdr.write_type_5(data.getSizeY());

   }

   public static void read(px4_msgs.msg.dds.IrlockReport data, us.ihmc.idl.CDR cdr)
   {
      data.setTimestamp(cdr.read_type_12());
      	
      data.setSignature(cdr.read_type_3());
      	
      data.setPosX(cdr.read_type_5());
      	
      data.setPosY(cdr.read_type_5());
      	
      data.setSizeX(cdr.read_type_5());
      	
      data.setSizeY(cdr.read_type_5());
      	

   }

   @Override
   public final void serialize(px4_msgs.msg.dds.IrlockReport data, us.ihmc.idl.InterchangeSerializer ser)
   {
      ser.write_type_12("timestamp", data.getTimestamp());
      ser.write_type_3("signature", data.getSignature());
      ser.write_type_5("pos_x", data.getPosX());
      ser.write_type_5("pos_y", data.getPosY());
      ser.write_type_5("size_x", data.getSizeX());
      ser.write_type_5("size_y", data.getSizeY());
   }

   @Override
   public final void deserialize(us.ihmc.idl.InterchangeSerializer ser, px4_msgs.msg.dds.IrlockReport data)
   {
      data.setTimestamp(ser.read_type_12("timestamp"));
      data.setSignature(ser.read_type_3("signature"));
      data.setPosX(ser.read_type_5("pos_x"));
      data.setPosY(ser.read_type_5("pos_y"));
      data.setSizeX(ser.read_type_5("size_x"));
      data.setSizeY(ser.read_type_5("size_y"));
   }

   public static void staticCopy(px4_msgs.msg.dds.IrlockReport src, px4_msgs.msg.dds.IrlockReport dest)
   {
      dest.set(src);
   }

   @Override
   public px4_msgs.msg.dds.IrlockReport createData()
   {
      return new px4_msgs.msg.dds.IrlockReport();
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
   
   public void serialize(px4_msgs.msg.dds.IrlockReport data, us.ihmc.idl.CDR cdr)
   {
      write(data, cdr);
   }

   public void deserialize(px4_msgs.msg.dds.IrlockReport data, us.ihmc.idl.CDR cdr)
   {
      read(data, cdr);
   }
   
   public void copy(px4_msgs.msg.dds.IrlockReport src, px4_msgs.msg.dds.IrlockReport dest)
   {
      staticCopy(src, dest);
   }

   @Override
   public IrlockReportPubSubType newInstance()
   {
      return new IrlockReportPubSubType();
   }
}
