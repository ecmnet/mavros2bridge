package px4_msgs.msg.dds;

/**
* 
* Topic data type of the struct "QshellRetval" defined in "QshellRetval_.idl". Use this class to provide the TopicDataType to a Participant. 
*
* This file was automatically generated from QshellRetval_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit QshellRetval_.idl instead.
*
*/
public class QshellRetvalPubSubType implements us.ihmc.pubsub.TopicDataType<px4_msgs.msg.dds.QshellRetval>
{
   public static final java.lang.String name = "px4_msgs::msg::dds_::QshellRetval_";
   
   @Override
   public final java.lang.String getDefinitionChecksum()
   {
   		return "1bb70a5924cdede92cdecb2c1185e72b7f71d8c9c1b8c350c4dcbeaab530ad9e";
   }
   
   @Override
   public final java.lang.String getDefinitionVersion()
   {
   		return "";
   }

   private final us.ihmc.idl.CDR serializeCDR = new us.ihmc.idl.CDR();
   private final us.ihmc.idl.CDR deserializeCDR = new us.ihmc.idl.CDR();

   @Override
   public void serialize(px4_msgs.msg.dds.QshellRetval data, us.ihmc.pubsub.common.SerializedPayload serializedPayload) throws java.io.IOException
   {
      serializeCDR.serialize(serializedPayload);
      write(data, serializeCDR);
      serializeCDR.finishSerialize();
   }

   @Override
   public void deserialize(us.ihmc.pubsub.common.SerializedPayload serializedPayload, px4_msgs.msg.dds.QshellRetval data) throws java.io.IOException
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


      return current_alignment - initial_alignment;
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.QshellRetval data)
   {
      return getCdrSerializedSize(data, 0);
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.QshellRetval data, int current_alignment)
   {
      int initial_alignment = current_alignment;

      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);



      return current_alignment - initial_alignment;
   }

   public static void write(px4_msgs.msg.dds.QshellRetval data, us.ihmc.idl.CDR cdr)
   {
      cdr.write_type_12(data.getTimestamp());

      cdr.write_type_2(data.getReturnValue());

      cdr.write_type_4(data.getReturnSequence());

   }

   public static void read(px4_msgs.msg.dds.QshellRetval data, us.ihmc.idl.CDR cdr)
   {
      data.setTimestamp(cdr.read_type_12());
      	
      data.setReturnValue(cdr.read_type_2());
      	
      data.setReturnSequence(cdr.read_type_4());
      	

   }

   @Override
   public final void serialize(px4_msgs.msg.dds.QshellRetval data, us.ihmc.idl.InterchangeSerializer ser)
   {
      ser.write_type_12("timestamp", data.getTimestamp());
      ser.write_type_2("return_value", data.getReturnValue());
      ser.write_type_4("return_sequence", data.getReturnSequence());
   }

   @Override
   public final void deserialize(us.ihmc.idl.InterchangeSerializer ser, px4_msgs.msg.dds.QshellRetval data)
   {
      data.setTimestamp(ser.read_type_12("timestamp"));
      data.setReturnValue(ser.read_type_2("return_value"));
      data.setReturnSequence(ser.read_type_4("return_sequence"));
   }

   public static void staticCopy(px4_msgs.msg.dds.QshellRetval src, px4_msgs.msg.dds.QshellRetval dest)
   {
      dest.set(src);
   }

   @Override
   public px4_msgs.msg.dds.QshellRetval createData()
   {
      return new px4_msgs.msg.dds.QshellRetval();
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
   
   public void serialize(px4_msgs.msg.dds.QshellRetval data, us.ihmc.idl.CDR cdr)
   {
      write(data, cdr);
   }

   public void deserialize(px4_msgs.msg.dds.QshellRetval data, us.ihmc.idl.CDR cdr)
   {
      read(data, cdr);
   }
   
   public void copy(px4_msgs.msg.dds.QshellRetval src, px4_msgs.msg.dds.QshellRetval dest)
   {
      staticCopy(src, dest);
   }

   @Override
   public QshellRetvalPubSubType newInstance()
   {
      return new QshellRetvalPubSubType();
   }
}
