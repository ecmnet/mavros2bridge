package px4_msgs.msg.dds;

/**
* 
* Topic data type of the struct "RtlStatus" defined in "RtlStatus_.idl". Use this class to provide the TopicDataType to a Participant. 
*
* This file was automatically generated from RtlStatus_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit RtlStatus_.idl instead.
*
*/
public class RtlStatusPubSubType implements us.ihmc.pubsub.TopicDataType<px4_msgs.msg.dds.RtlStatus>
{
   public static final java.lang.String name = "px4_msgs::msg::dds_::RtlStatus_";
   
   @Override
   public final java.lang.String getDefinitionChecksum()
   {
   		return "fa931befaa374280d409085f586a865458fa499f80c5f23ce53b1e3f6be3bcbd";
   }
   
   @Override
   public final java.lang.String getDefinitionVersion()
   {
   		return "";
   }

   private final us.ihmc.idl.CDR serializeCDR = new us.ihmc.idl.CDR();
   private final us.ihmc.idl.CDR deserializeCDR = new us.ihmc.idl.CDR();

   @Override
   public void serialize(px4_msgs.msg.dds.RtlStatus data, us.ihmc.pubsub.common.SerializedPayload serializedPayload) throws java.io.IOException
   {
      serializeCDR.serialize(serializedPayload);
      write(data, serializeCDR);
      serializeCDR.finishSerialize();
   }

   @Override
   public void deserialize(us.ihmc.pubsub.common.SerializedPayload serializedPayload, px4_msgs.msg.dds.RtlStatus data) throws java.io.IOException
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

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      return current_alignment - initial_alignment;
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.RtlStatus data)
   {
      return getCdrSerializedSize(data, 0);
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.RtlStatus data, int current_alignment)
   {
      int initial_alignment = current_alignment;

      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);



      return current_alignment - initial_alignment;
   }

   public static void write(px4_msgs.msg.dds.RtlStatus data, us.ihmc.idl.CDR cdr)
   {
      cdr.write_type_12(data.getTimestamp());

      cdr.write_type_4(data.getSafePointsId());

      cdr.write_type_7(data.getIsEvaluationPending());

      cdr.write_type_7(data.getHasVtolApproach());

      cdr.write_type_9(data.getRtlType());

      cdr.write_type_9(data.getSafePointIndex());

   }

   public static void read(px4_msgs.msg.dds.RtlStatus data, us.ihmc.idl.CDR cdr)
   {
      data.setTimestamp(cdr.read_type_12());
      	
      data.setSafePointsId(cdr.read_type_4());
      	
      data.setIsEvaluationPending(cdr.read_type_7());
      	
      data.setHasVtolApproach(cdr.read_type_7());
      	
      data.setRtlType(cdr.read_type_9());
      	
      data.setSafePointIndex(cdr.read_type_9());
      	

   }

   @Override
   public final void serialize(px4_msgs.msg.dds.RtlStatus data, us.ihmc.idl.InterchangeSerializer ser)
   {
      ser.write_type_12("timestamp", data.getTimestamp());
      ser.write_type_4("safe_points_id", data.getSafePointsId());
      ser.write_type_7("is_evaluation_pending", data.getIsEvaluationPending());
      ser.write_type_7("has_vtol_approach", data.getHasVtolApproach());
      ser.write_type_9("rtl_type", data.getRtlType());
      ser.write_type_9("safe_point_index", data.getSafePointIndex());
   }

   @Override
   public final void deserialize(us.ihmc.idl.InterchangeSerializer ser, px4_msgs.msg.dds.RtlStatus data)
   {
      data.setTimestamp(ser.read_type_12("timestamp"));
      data.setSafePointsId(ser.read_type_4("safe_points_id"));
      data.setIsEvaluationPending(ser.read_type_7("is_evaluation_pending"));
      data.setHasVtolApproach(ser.read_type_7("has_vtol_approach"));
      data.setRtlType(ser.read_type_9("rtl_type"));
      data.setSafePointIndex(ser.read_type_9("safe_point_index"));
   }

   public static void staticCopy(px4_msgs.msg.dds.RtlStatus src, px4_msgs.msg.dds.RtlStatus dest)
   {
      dest.set(src);
   }

   @Override
   public px4_msgs.msg.dds.RtlStatus createData()
   {
      return new px4_msgs.msg.dds.RtlStatus();
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
   
   public void serialize(px4_msgs.msg.dds.RtlStatus data, us.ihmc.idl.CDR cdr)
   {
      write(data, cdr);
   }

   public void deserialize(px4_msgs.msg.dds.RtlStatus data, us.ihmc.idl.CDR cdr)
   {
      read(data, cdr);
   }
   
   public void copy(px4_msgs.msg.dds.RtlStatus src, px4_msgs.msg.dds.RtlStatus dest)
   {
      staticCopy(src, dest);
   }

   @Override
   public RtlStatusPubSubType newInstance()
   {
      return new RtlStatusPubSubType();
   }
}
