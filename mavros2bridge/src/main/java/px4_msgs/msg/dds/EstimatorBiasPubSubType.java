package px4_msgs.msg.dds;

/**
* 
* Topic data type of the struct "EstimatorBias" defined in "EstimatorBias_.idl". Use this class to provide the TopicDataType to a Participant. 
*
* This file was automatically generated from EstimatorBias_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit EstimatorBias_.idl instead.
*
*/
public class EstimatorBiasPubSubType implements us.ihmc.pubsub.TopicDataType<px4_msgs.msg.dds.EstimatorBias>
{
   public static final java.lang.String name = "px4_msgs::msg::dds_::EstimatorBias_";
   
   @Override
   public final java.lang.String getDefinitionChecksum()
   {
   		return "82a367697e900844fbdc78744f6fbdaed6e5172e3670eb796df4d4005cc218ca";
   }
   
   @Override
   public final java.lang.String getDefinitionVersion()
   {
   		return "";
   }

   private final us.ihmc.idl.CDR serializeCDR = new us.ihmc.idl.CDR();
   private final us.ihmc.idl.CDR deserializeCDR = new us.ihmc.idl.CDR();

   @Override
   public void serialize(px4_msgs.msg.dds.EstimatorBias data, us.ihmc.pubsub.common.SerializedPayload serializedPayload) throws java.io.IOException
   {
      serializeCDR.serialize(serializedPayload);
      write(data, serializeCDR);
      serializeCDR.finishSerialize();
   }

   @Override
   public void deserialize(us.ihmc.pubsub.common.SerializedPayload serializedPayload, px4_msgs.msg.dds.EstimatorBias data) throws java.io.IOException
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

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      return current_alignment - initial_alignment;
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.EstimatorBias data)
   {
      return getCdrSerializedSize(data, 0);
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.EstimatorBias data, int current_alignment)
   {
      int initial_alignment = current_alignment;

      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);



      return current_alignment - initial_alignment;
   }

   public static void write(px4_msgs.msg.dds.EstimatorBias data, us.ihmc.idl.CDR cdr)
   {
      cdr.write_type_12(data.getTimestamp());

      cdr.write_type_12(data.getTimestampSample());

      cdr.write_type_4(data.getDeviceId());

      cdr.write_type_5(data.getBias());

      cdr.write_type_5(data.getBiasVar());

      cdr.write_type_5(data.getInnov());

      cdr.write_type_5(data.getInnovVar());

      cdr.write_type_5(data.getInnovTestRatio());

   }

   public static void read(px4_msgs.msg.dds.EstimatorBias data, us.ihmc.idl.CDR cdr)
   {
      data.setTimestamp(cdr.read_type_12());
      	
      data.setTimestampSample(cdr.read_type_12());
      	
      data.setDeviceId(cdr.read_type_4());
      	
      data.setBias(cdr.read_type_5());
      	
      data.setBiasVar(cdr.read_type_5());
      	
      data.setInnov(cdr.read_type_5());
      	
      data.setInnovVar(cdr.read_type_5());
      	
      data.setInnovTestRatio(cdr.read_type_5());
      	

   }

   @Override
   public final void serialize(px4_msgs.msg.dds.EstimatorBias data, us.ihmc.idl.InterchangeSerializer ser)
   {
      ser.write_type_12("timestamp", data.getTimestamp());
      ser.write_type_12("timestamp_sample", data.getTimestampSample());
      ser.write_type_4("device_id", data.getDeviceId());
      ser.write_type_5("bias", data.getBias());
      ser.write_type_5("bias_var", data.getBiasVar());
      ser.write_type_5("innov", data.getInnov());
      ser.write_type_5("innov_var", data.getInnovVar());
      ser.write_type_5("innov_test_ratio", data.getInnovTestRatio());
   }

   @Override
   public final void deserialize(us.ihmc.idl.InterchangeSerializer ser, px4_msgs.msg.dds.EstimatorBias data)
   {
      data.setTimestamp(ser.read_type_12("timestamp"));
      data.setTimestampSample(ser.read_type_12("timestamp_sample"));
      data.setDeviceId(ser.read_type_4("device_id"));
      data.setBias(ser.read_type_5("bias"));
      data.setBiasVar(ser.read_type_5("bias_var"));
      data.setInnov(ser.read_type_5("innov"));
      data.setInnovVar(ser.read_type_5("innov_var"));
      data.setInnovTestRatio(ser.read_type_5("innov_test_ratio"));
   }

   public static void staticCopy(px4_msgs.msg.dds.EstimatorBias src, px4_msgs.msg.dds.EstimatorBias dest)
   {
      dest.set(src);
   }

   @Override
   public px4_msgs.msg.dds.EstimatorBias createData()
   {
      return new px4_msgs.msg.dds.EstimatorBias();
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
   
   public void serialize(px4_msgs.msg.dds.EstimatorBias data, us.ihmc.idl.CDR cdr)
   {
      write(data, cdr);
   }

   public void deserialize(px4_msgs.msg.dds.EstimatorBias data, us.ihmc.idl.CDR cdr)
   {
      read(data, cdr);
   }
   
   public void copy(px4_msgs.msg.dds.EstimatorBias src, px4_msgs.msg.dds.EstimatorBias dest)
   {
      staticCopy(src, dest);
   }

   @Override
   public EstimatorBiasPubSubType newInstance()
   {
      return new EstimatorBiasPubSubType();
   }
}
