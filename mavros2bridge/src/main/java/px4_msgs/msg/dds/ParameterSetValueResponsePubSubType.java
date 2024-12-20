package px4_msgs.msg.dds;

/**
* 
* Topic data type of the struct "ParameterSetValueResponse" defined in "ParameterSetValueResponse_.idl". Use this class to provide the TopicDataType to a Participant. 
*
* This file was automatically generated from ParameterSetValueResponse_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit ParameterSetValueResponse_.idl instead.
*
*/
public class ParameterSetValueResponsePubSubType implements us.ihmc.pubsub.TopicDataType<px4_msgs.msg.dds.ParameterSetValueResponse>
{
   public static final java.lang.String name = "px4_msgs::msg::dds_::ParameterSetValueResponse_";
   
   @Override
   public final java.lang.String getDefinitionChecksum()
   {
   		return "cd6ba9718748b06e64c7b2b856dfbd4cbaa1caf438784184fd9842334369a08b";
   }
   
   @Override
   public final java.lang.String getDefinitionVersion()
   {
   		return "";
   }

   private final us.ihmc.idl.CDR serializeCDR = new us.ihmc.idl.CDR();
   private final us.ihmc.idl.CDR deserializeCDR = new us.ihmc.idl.CDR();

   @Override
   public void serialize(px4_msgs.msg.dds.ParameterSetValueResponse data, us.ihmc.pubsub.common.SerializedPayload serializedPayload) throws java.io.IOException
   {
      serializeCDR.serialize(serializedPayload);
      write(data, serializeCDR);
      serializeCDR.finishSerialize();
   }

   @Override
   public void deserialize(us.ihmc.pubsub.common.SerializedPayload serializedPayload, px4_msgs.msg.dds.ParameterSetValueResponse data) throws java.io.IOException
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

      current_alignment += 2 + us.ihmc.idl.CDR.alignment(current_alignment, 2);


      return current_alignment - initial_alignment;
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.ParameterSetValueResponse data)
   {
      return getCdrSerializedSize(data, 0);
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.ParameterSetValueResponse data, int current_alignment)
   {
      int initial_alignment = current_alignment;

      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += 2 + us.ihmc.idl.CDR.alignment(current_alignment, 2);



      return current_alignment - initial_alignment;
   }

   public static void write(px4_msgs.msg.dds.ParameterSetValueResponse data, us.ihmc.idl.CDR cdr)
   {
      cdr.write_type_12(data.getTimestamp());

      cdr.write_type_12(data.getRequestTimestamp());

      cdr.write_type_3(data.getParameterIndex());

   }

   public static void read(px4_msgs.msg.dds.ParameterSetValueResponse data, us.ihmc.idl.CDR cdr)
   {
      data.setTimestamp(cdr.read_type_12());
      	
      data.setRequestTimestamp(cdr.read_type_12());
      	
      data.setParameterIndex(cdr.read_type_3());
      	

   }

   @Override
   public final void serialize(px4_msgs.msg.dds.ParameterSetValueResponse data, us.ihmc.idl.InterchangeSerializer ser)
   {
      ser.write_type_12("timestamp", data.getTimestamp());
      ser.write_type_12("request_timestamp", data.getRequestTimestamp());
      ser.write_type_3("parameter_index", data.getParameterIndex());
   }

   @Override
   public final void deserialize(us.ihmc.idl.InterchangeSerializer ser, px4_msgs.msg.dds.ParameterSetValueResponse data)
   {
      data.setTimestamp(ser.read_type_12("timestamp"));
      data.setRequestTimestamp(ser.read_type_12("request_timestamp"));
      data.setParameterIndex(ser.read_type_3("parameter_index"));
   }

   public static void staticCopy(px4_msgs.msg.dds.ParameterSetValueResponse src, px4_msgs.msg.dds.ParameterSetValueResponse dest)
   {
      dest.set(src);
   }

   @Override
   public px4_msgs.msg.dds.ParameterSetValueResponse createData()
   {
      return new px4_msgs.msg.dds.ParameterSetValueResponse();
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
   
   public void serialize(px4_msgs.msg.dds.ParameterSetValueResponse data, us.ihmc.idl.CDR cdr)
   {
      write(data, cdr);
   }

   public void deserialize(px4_msgs.msg.dds.ParameterSetValueResponse data, us.ihmc.idl.CDR cdr)
   {
      read(data, cdr);
   }
   
   public void copy(px4_msgs.msg.dds.ParameterSetValueResponse src, px4_msgs.msg.dds.ParameterSetValueResponse dest)
   {
      staticCopy(src, dest);
   }

   @Override
   public ParameterSetValueResponsePubSubType newInstance()
   {
      return new ParameterSetValueResponsePubSubType();
   }
}
