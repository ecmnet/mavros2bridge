package px4_msgs.msg.dds;

/**
* 
* Topic data type of the struct "EstimatorAidSource1d" defined in "EstimatorAidSource1d_.idl". Use this class to provide the TopicDataType to a Participant. 
*
* This file was automatically generated from EstimatorAidSource1d_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit EstimatorAidSource1d_.idl instead.
*
*/
public class EstimatorAidSource1dPubSubType implements us.ihmc.pubsub.TopicDataType<px4_msgs.msg.dds.EstimatorAidSource1d>
{
   public static final java.lang.String name = "px4_msgs::msg::dds_::EstimatorAidSource1d_";
   
   @Override
   public final java.lang.String getDefinitionChecksum()
   {
   		return "41fb4469a5474c66d21fc91cb1d91b69d38ab4831b23a3553d5d3150d7156ac9";
   }
   
   @Override
   public final java.lang.String getDefinitionVersion()
   {
   		return "";
   }

   private final us.ihmc.idl.CDR serializeCDR = new us.ihmc.idl.CDR();
   private final us.ihmc.idl.CDR deserializeCDR = new us.ihmc.idl.CDR();

   @Override
   public void serialize(px4_msgs.msg.dds.EstimatorAidSource1d data, us.ihmc.pubsub.common.SerializedPayload serializedPayload) throws java.io.IOException
   {
      serializeCDR.serialize(serializedPayload);
      write(data, serializeCDR);
      serializeCDR.finishSerialize();
   }

   @Override
   public void deserialize(us.ihmc.pubsub.common.SerializedPayload serializedPayload, px4_msgs.msg.dds.EstimatorAidSource1d data) throws java.io.IOException
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

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      return current_alignment - initial_alignment;
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.EstimatorAidSource1d data)
   {
      return getCdrSerializedSize(data, 0);
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.EstimatorAidSource1d data, int current_alignment)
   {
      int initial_alignment = current_alignment;

      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);



      return current_alignment - initial_alignment;
   }

   public static void write(px4_msgs.msg.dds.EstimatorAidSource1d data, us.ihmc.idl.CDR cdr)
   {
      cdr.write_type_12(data.getTimestamp());

      cdr.write_type_12(data.getTimestampSample());

      cdr.write_type_9(data.getEstimatorInstance());

      cdr.write_type_4(data.getDeviceId());

      cdr.write_type_12(data.getTimeLastFuse());

      cdr.write_type_5(data.getObservation());

      cdr.write_type_5(data.getObservationVariance());

      cdr.write_type_5(data.getInnovation());

      cdr.write_type_5(data.getInnovationFiltered());

      cdr.write_type_5(data.getInnovationVariance());

      cdr.write_type_5(data.getTestRatio());

      cdr.write_type_5(data.getTestRatioFiltered());

      cdr.write_type_7(data.getInnovationRejected());

      cdr.write_type_7(data.getFused());

   }

   public static void read(px4_msgs.msg.dds.EstimatorAidSource1d data, us.ihmc.idl.CDR cdr)
   {
      data.setTimestamp(cdr.read_type_12());
      	
      data.setTimestampSample(cdr.read_type_12());
      	
      data.setEstimatorInstance(cdr.read_type_9());
      	
      data.setDeviceId(cdr.read_type_4());
      	
      data.setTimeLastFuse(cdr.read_type_12());
      	
      data.setObservation(cdr.read_type_5());
      	
      data.setObservationVariance(cdr.read_type_5());
      	
      data.setInnovation(cdr.read_type_5());
      	
      data.setInnovationFiltered(cdr.read_type_5());
      	
      data.setInnovationVariance(cdr.read_type_5());
      	
      data.setTestRatio(cdr.read_type_5());
      	
      data.setTestRatioFiltered(cdr.read_type_5());
      	
      data.setInnovationRejected(cdr.read_type_7());
      	
      data.setFused(cdr.read_type_7());
      	

   }

   @Override
   public final void serialize(px4_msgs.msg.dds.EstimatorAidSource1d data, us.ihmc.idl.InterchangeSerializer ser)
   {
      ser.write_type_12("timestamp", data.getTimestamp());
      ser.write_type_12("timestamp_sample", data.getTimestampSample());
      ser.write_type_9("estimator_instance", data.getEstimatorInstance());
      ser.write_type_4("device_id", data.getDeviceId());
      ser.write_type_12("time_last_fuse", data.getTimeLastFuse());
      ser.write_type_5("observation", data.getObservation());
      ser.write_type_5("observation_variance", data.getObservationVariance());
      ser.write_type_5("innovation", data.getInnovation());
      ser.write_type_5("innovation_filtered", data.getInnovationFiltered());
      ser.write_type_5("innovation_variance", data.getInnovationVariance());
      ser.write_type_5("test_ratio", data.getTestRatio());
      ser.write_type_5("test_ratio_filtered", data.getTestRatioFiltered());
      ser.write_type_7("innovation_rejected", data.getInnovationRejected());
      ser.write_type_7("fused", data.getFused());
   }

   @Override
   public final void deserialize(us.ihmc.idl.InterchangeSerializer ser, px4_msgs.msg.dds.EstimatorAidSource1d data)
   {
      data.setTimestamp(ser.read_type_12("timestamp"));
      data.setTimestampSample(ser.read_type_12("timestamp_sample"));
      data.setEstimatorInstance(ser.read_type_9("estimator_instance"));
      data.setDeviceId(ser.read_type_4("device_id"));
      data.setTimeLastFuse(ser.read_type_12("time_last_fuse"));
      data.setObservation(ser.read_type_5("observation"));
      data.setObservationVariance(ser.read_type_5("observation_variance"));
      data.setInnovation(ser.read_type_5("innovation"));
      data.setInnovationFiltered(ser.read_type_5("innovation_filtered"));
      data.setInnovationVariance(ser.read_type_5("innovation_variance"));
      data.setTestRatio(ser.read_type_5("test_ratio"));
      data.setTestRatioFiltered(ser.read_type_5("test_ratio_filtered"));
      data.setInnovationRejected(ser.read_type_7("innovation_rejected"));
      data.setFused(ser.read_type_7("fused"));
   }

   public static void staticCopy(px4_msgs.msg.dds.EstimatorAidSource1d src, px4_msgs.msg.dds.EstimatorAidSource1d dest)
   {
      dest.set(src);
   }

   @Override
   public px4_msgs.msg.dds.EstimatorAidSource1d createData()
   {
      return new px4_msgs.msg.dds.EstimatorAidSource1d();
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
   
   public void serialize(px4_msgs.msg.dds.EstimatorAidSource1d data, us.ihmc.idl.CDR cdr)
   {
      write(data, cdr);
   }

   public void deserialize(px4_msgs.msg.dds.EstimatorAidSource1d data, us.ihmc.idl.CDR cdr)
   {
      read(data, cdr);
   }
   
   public void copy(px4_msgs.msg.dds.EstimatorAidSource1d src, px4_msgs.msg.dds.EstimatorAidSource1d dest)
   {
      staticCopy(src, dest);
   }

   @Override
   public EstimatorAidSource1dPubSubType newInstance()
   {
      return new EstimatorAidSource1dPubSubType();
   }
}
