package px4_msgs.msg.dds;

/**
* 
* Topic data type of the struct "ParameterSetUsedRequest" defined in "ParameterSetUsedRequest_.idl". Use this class to provide the TopicDataType to a Participant. 
*
* This file was automatically generated from ParameterSetUsedRequest_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit ParameterSetUsedRequest_.idl instead.
*
*/
public class ParameterSetUsedRequestPubSubType implements us.ihmc.pubsub.TopicDataType<px4_msgs.msg.dds.ParameterSetUsedRequest>
{
   public static final java.lang.String name = "px4_msgs::msg::dds_::ParameterSetUsedRequest_";
   
   @Override
   public final java.lang.String getDefinitionChecksum()
   {
   		return "c30f1d389948589ac25fd9ffa823f8c2dba16745f134382a6791f2ecc049b530";
   }
   
   @Override
   public final java.lang.String getDefinitionVersion()
   {
   		return "";
   }

   private final us.ihmc.idl.CDR serializeCDR = new us.ihmc.idl.CDR();
   private final us.ihmc.idl.CDR deserializeCDR = new us.ihmc.idl.CDR();

   @Override
   public void serialize(px4_msgs.msg.dds.ParameterSetUsedRequest data, us.ihmc.pubsub.common.SerializedPayload serializedPayload) throws java.io.IOException
   {
      serializeCDR.serialize(serializedPayload);
      write(data, serializeCDR);
      serializeCDR.finishSerialize();
   }

   @Override
   public void deserialize(us.ihmc.pubsub.common.SerializedPayload serializedPayload, px4_msgs.msg.dds.ParameterSetUsedRequest data) throws java.io.IOException
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


      return current_alignment - initial_alignment;
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.ParameterSetUsedRequest data)
   {
      return getCdrSerializedSize(data, 0);
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.ParameterSetUsedRequest data, int current_alignment)
   {
      int initial_alignment = current_alignment;

      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += 2 + us.ihmc.idl.CDR.alignment(current_alignment, 2);



      return current_alignment - initial_alignment;
   }

   public static void write(px4_msgs.msg.dds.ParameterSetUsedRequest data, us.ihmc.idl.CDR cdr)
   {
      cdr.write_type_12(data.getTimestamp());

      cdr.write_type_3(data.getParameterIndex());

   }

   public static void read(px4_msgs.msg.dds.ParameterSetUsedRequest data, us.ihmc.idl.CDR cdr)
   {
      data.setTimestamp(cdr.read_type_12());
      	
      data.setParameterIndex(cdr.read_type_3());
      	

   }

   @Override
   public final void serialize(px4_msgs.msg.dds.ParameterSetUsedRequest data, us.ihmc.idl.InterchangeSerializer ser)
   {
      ser.write_type_12("timestamp", data.getTimestamp());
      ser.write_type_3("parameter_index", data.getParameterIndex());
   }

   @Override
   public final void deserialize(us.ihmc.idl.InterchangeSerializer ser, px4_msgs.msg.dds.ParameterSetUsedRequest data)
   {
      data.setTimestamp(ser.read_type_12("timestamp"));
      data.setParameterIndex(ser.read_type_3("parameter_index"));
   }

   public static void staticCopy(px4_msgs.msg.dds.ParameterSetUsedRequest src, px4_msgs.msg.dds.ParameterSetUsedRequest dest)
   {
      dest.set(src);
   }

   @Override
   public px4_msgs.msg.dds.ParameterSetUsedRequest createData()
   {
      return new px4_msgs.msg.dds.ParameterSetUsedRequest();
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
   
   public void serialize(px4_msgs.msg.dds.ParameterSetUsedRequest data, us.ihmc.idl.CDR cdr)
   {
      write(data, cdr);
   }

   public void deserialize(px4_msgs.msg.dds.ParameterSetUsedRequest data, us.ihmc.idl.CDR cdr)
   {
      read(data, cdr);
   }
   
   public void copy(px4_msgs.msg.dds.ParameterSetUsedRequest src, px4_msgs.msg.dds.ParameterSetUsedRequest dest)
   {
      staticCopy(src, dest);
   }

   @Override
   public ParameterSetUsedRequestPubSubType newInstance()
   {
      return new ParameterSetUsedRequestPubSubType();
   }
}
