package px4_msgs.msg.dds;

/**
* 
* Topic data type of the struct "ParameterResetRequest" defined in "ParameterResetRequest_.idl". Use this class to provide the TopicDataType to a Participant. 
*
* This file was automatically generated from ParameterResetRequest_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit ParameterResetRequest_.idl instead.
*
*/
public class ParameterResetRequestPubSubType implements us.ihmc.pubsub.TopicDataType<px4_msgs.msg.dds.ParameterResetRequest>
{
   public static final java.lang.String name = "px4_msgs::msg::dds_::ParameterResetRequest_";
   
   @Override
   public final java.lang.String getDefinitionChecksum()
   {
   		return "7fd173cdb366501206dbae2a50cf8758b19085318f80d1c8936d058734192412";
   }
   
   @Override
   public final java.lang.String getDefinitionVersion()
   {
   		return "";
   }

   private final us.ihmc.idl.CDR serializeCDR = new us.ihmc.idl.CDR();
   private final us.ihmc.idl.CDR deserializeCDR = new us.ihmc.idl.CDR();

   @Override
   public void serialize(px4_msgs.msg.dds.ParameterResetRequest data, us.ihmc.pubsub.common.SerializedPayload serializedPayload) throws java.io.IOException
   {
      serializeCDR.serialize(serializedPayload);
      write(data, serializeCDR);
      serializeCDR.finishSerialize();
   }

   @Override
   public void deserialize(us.ihmc.pubsub.common.SerializedPayload serializedPayload, px4_msgs.msg.dds.ParameterResetRequest data) throws java.io.IOException
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


      return current_alignment - initial_alignment;
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.ParameterResetRequest data)
   {
      return getCdrSerializedSize(data, 0);
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.ParameterResetRequest data, int current_alignment)
   {
      int initial_alignment = current_alignment;

      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += 2 + us.ihmc.idl.CDR.alignment(current_alignment, 2);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);



      return current_alignment - initial_alignment;
   }

   public static void write(px4_msgs.msg.dds.ParameterResetRequest data, us.ihmc.idl.CDR cdr)
   {
      cdr.write_type_12(data.getTimestamp());

      cdr.write_type_3(data.getParameterIndex());

      cdr.write_type_7(data.getResetAll());

   }

   public static void read(px4_msgs.msg.dds.ParameterResetRequest data, us.ihmc.idl.CDR cdr)
   {
      data.setTimestamp(cdr.read_type_12());
      	
      data.setParameterIndex(cdr.read_type_3());
      	
      data.setResetAll(cdr.read_type_7());
      	

   }

   @Override
   public final void serialize(px4_msgs.msg.dds.ParameterResetRequest data, us.ihmc.idl.InterchangeSerializer ser)
   {
      ser.write_type_12("timestamp", data.getTimestamp());
      ser.write_type_3("parameter_index", data.getParameterIndex());
      ser.write_type_7("reset_all", data.getResetAll());
   }

   @Override
   public final void deserialize(us.ihmc.idl.InterchangeSerializer ser, px4_msgs.msg.dds.ParameterResetRequest data)
   {
      data.setTimestamp(ser.read_type_12("timestamp"));
      data.setParameterIndex(ser.read_type_3("parameter_index"));
      data.setResetAll(ser.read_type_7("reset_all"));
   }

   public static void staticCopy(px4_msgs.msg.dds.ParameterResetRequest src, px4_msgs.msg.dds.ParameterResetRequest dest)
   {
      dest.set(src);
   }

   @Override
   public px4_msgs.msg.dds.ParameterResetRequest createData()
   {
      return new px4_msgs.msg.dds.ParameterResetRequest();
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
   
   public void serialize(px4_msgs.msg.dds.ParameterResetRequest data, us.ihmc.idl.CDR cdr)
   {
      write(data, cdr);
   }

   public void deserialize(px4_msgs.msg.dds.ParameterResetRequest data, us.ihmc.idl.CDR cdr)
   {
      read(data, cdr);
   }
   
   public void copy(px4_msgs.msg.dds.ParameterResetRequest src, px4_msgs.msg.dds.ParameterResetRequest dest)
   {
      staticCopy(src, dest);
   }

   @Override
   public ParameterResetRequestPubSubType newInstance()
   {
      return new ParameterResetRequestPubSubType();
   }
}
