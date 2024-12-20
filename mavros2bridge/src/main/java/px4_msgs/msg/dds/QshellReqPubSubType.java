package px4_msgs.msg.dds;

/**
* 
* Topic data type of the struct "QshellReq" defined in "QshellReq_.idl". Use this class to provide the TopicDataType to a Participant. 
*
* This file was automatically generated from QshellReq_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit QshellReq_.idl instead.
*
*/
public class QshellReqPubSubType implements us.ihmc.pubsub.TopicDataType<px4_msgs.msg.dds.QshellReq>
{
   public static final java.lang.String name = "px4_msgs::msg::dds_::QshellReq_";
   
   @Override
   public final java.lang.String getDefinitionChecksum()
   {
   		return "7d701efd696948da0d4e38a70dd96393f002a555b2c7e505ad77c8c0a5bda3d4";
   }
   
   @Override
   public final java.lang.String getDefinitionVersion()
   {
   		return "";
   }

   private final us.ihmc.idl.CDR serializeCDR = new us.ihmc.idl.CDR();
   private final us.ihmc.idl.CDR deserializeCDR = new us.ihmc.idl.CDR();

   @Override
   public void serialize(px4_msgs.msg.dds.QshellReq data, us.ihmc.pubsub.common.SerializedPayload serializedPayload) throws java.io.IOException
   {
      serializeCDR.serialize(serializedPayload);
      write(data, serializeCDR);
      serializeCDR.finishSerialize();
   }

   @Override
   public void deserialize(us.ihmc.pubsub.common.SerializedPayload serializedPayload, px4_msgs.msg.dds.QshellReq data) throws java.io.IOException
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

      current_alignment += ((100) * 1) + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      return current_alignment - initial_alignment;
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.QshellReq data)
   {
      return getCdrSerializedSize(data, 0);
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.QshellReq data, int current_alignment)
   {
      int initial_alignment = current_alignment;

      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += ((100) * 1) + us.ihmc.idl.CDR.alignment(current_alignment, 1);
      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);



      return current_alignment - initial_alignment;
   }

   public static void write(px4_msgs.msg.dds.QshellReq data, us.ihmc.idl.CDR cdr)
   {
      cdr.write_type_12(data.getTimestamp());

      for(int i0 = 0; i0 < data.getCmd().length; ++i0)
      {
        	cdr.write_type_8(data.getCmd()[i0]);	
      }

      cdr.write_type_4(data.getStrlen());

      cdr.write_type_4(data.getRequestSequence());

   }

   public static void read(px4_msgs.msg.dds.QshellReq data, us.ihmc.idl.CDR cdr)
   {
      data.setTimestamp(cdr.read_type_12());
      	
      for(int i0 = 0; i0 < data.getCmd().length; ++i0)
      {
        	data.getCmd()[i0] = cdr.read_type_8();
        	
      }
      	
      data.setStrlen(cdr.read_type_4());
      	
      data.setRequestSequence(cdr.read_type_4());
      	

   }

   @Override
   public final void serialize(px4_msgs.msg.dds.QshellReq data, us.ihmc.idl.InterchangeSerializer ser)
   {
      ser.write_type_12("timestamp", data.getTimestamp());
      ser.write_type_f("cmd", data.getCmd());
      ser.write_type_4("strlen", data.getStrlen());
      ser.write_type_4("request_sequence", data.getRequestSequence());
   }

   @Override
   public final void deserialize(us.ihmc.idl.InterchangeSerializer ser, px4_msgs.msg.dds.QshellReq data)
   {
      data.setTimestamp(ser.read_type_12("timestamp"));
      ser.read_type_f("cmd", data.getCmd());
      data.setStrlen(ser.read_type_4("strlen"));
      data.setRequestSequence(ser.read_type_4("request_sequence"));
   }

   public static void staticCopy(px4_msgs.msg.dds.QshellReq src, px4_msgs.msg.dds.QshellReq dest)
   {
      dest.set(src);
   }

   @Override
   public px4_msgs.msg.dds.QshellReq createData()
   {
      return new px4_msgs.msg.dds.QshellReq();
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
   
   public void serialize(px4_msgs.msg.dds.QshellReq data, us.ihmc.idl.CDR cdr)
   {
      write(data, cdr);
   }

   public void deserialize(px4_msgs.msg.dds.QshellReq data, us.ihmc.idl.CDR cdr)
   {
      read(data, cdr);
   }
   
   public void copy(px4_msgs.msg.dds.QshellReq src, px4_msgs.msg.dds.QshellReq dest)
   {
      staticCopy(src, dest);
   }

   @Override
   public QshellReqPubSubType newInstance()
   {
      return new QshellReqPubSubType();
   }
}
