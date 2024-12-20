package px4_msgs.msg.dds;

/**
* 
* Topic data type of the struct "YawEstimatorStatus" defined in "YawEstimatorStatus_.idl". Use this class to provide the TopicDataType to a Participant. 
*
* This file was automatically generated from YawEstimatorStatus_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit YawEstimatorStatus_.idl instead.
*
*/
public class YawEstimatorStatusPubSubType implements us.ihmc.pubsub.TopicDataType<px4_msgs.msg.dds.YawEstimatorStatus>
{
   public static final java.lang.String name = "px4_msgs::msg::dds_::YawEstimatorStatus_";
   
   @Override
   public final java.lang.String getDefinitionChecksum()
   {
   		return "80174be913cde8d5c43b7f8dd63aca752785e59a5079f6324fda213da1f37862";
   }
   
   @Override
   public final java.lang.String getDefinitionVersion()
   {
   		return "";
   }

   private final us.ihmc.idl.CDR serializeCDR = new us.ihmc.idl.CDR();
   private final us.ihmc.idl.CDR deserializeCDR = new us.ihmc.idl.CDR();

   @Override
   public void serialize(px4_msgs.msg.dds.YawEstimatorStatus data, us.ihmc.pubsub.common.SerializedPayload serializedPayload) throws java.io.IOException
   {
      serializeCDR.serialize(serializedPayload);
      write(data, serializeCDR);
      serializeCDR.finishSerialize();
   }

   @Override
   public void deserialize(us.ihmc.pubsub.common.SerializedPayload serializedPayload, px4_msgs.msg.dds.YawEstimatorStatus data) throws java.io.IOException
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

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += ((5) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += ((5) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += ((5) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += ((5) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      return current_alignment - initial_alignment;
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.YawEstimatorStatus data)
   {
      return getCdrSerializedSize(data, 0);
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.YawEstimatorStatus data, int current_alignment)
   {
      int initial_alignment = current_alignment;

      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += ((5) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);
      current_alignment += ((5) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);
      current_alignment += ((5) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);
      current_alignment += ((5) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      return current_alignment - initial_alignment;
   }

   public static void write(px4_msgs.msg.dds.YawEstimatorStatus data, us.ihmc.idl.CDR cdr)
   {
      cdr.write_type_12(data.getTimestamp());

      cdr.write_type_12(data.getTimestampSample());

      cdr.write_type_5(data.getYawComposite());

      cdr.write_type_5(data.getYawVariance());

      cdr.write_type_7(data.getYawCompositeValid());

      for(int i0 = 0; i0 < data.getYaw().length; ++i0)
      {
        	cdr.write_type_5(data.getYaw()[i0]);	
      }

      for(int i0 = 0; i0 < data.getInnovVn().length; ++i0)
      {
        	cdr.write_type_5(data.getInnovVn()[i0]);	
      }

      for(int i0 = 0; i0 < data.getInnovVe().length; ++i0)
      {
        	cdr.write_type_5(data.getInnovVe()[i0]);	
      }

      for(int i0 = 0; i0 < data.getWeight().length; ++i0)
      {
        	cdr.write_type_5(data.getWeight()[i0]);	
      }

   }

   public static void read(px4_msgs.msg.dds.YawEstimatorStatus data, us.ihmc.idl.CDR cdr)
   {
      data.setTimestamp(cdr.read_type_12());
      	
      data.setTimestampSample(cdr.read_type_12());
      	
      data.setYawComposite(cdr.read_type_5());
      	
      data.setYawVariance(cdr.read_type_5());
      	
      data.setYawCompositeValid(cdr.read_type_7());
      	
      for(int i0 = 0; i0 < data.getYaw().length; ++i0)
      {
        	data.getYaw()[i0] = cdr.read_type_5();
        	
      }
      	
      for(int i0 = 0; i0 < data.getInnovVn().length; ++i0)
      {
        	data.getInnovVn()[i0] = cdr.read_type_5();
        	
      }
      	
      for(int i0 = 0; i0 < data.getInnovVe().length; ++i0)
      {
        	data.getInnovVe()[i0] = cdr.read_type_5();
        	
      }
      	
      for(int i0 = 0; i0 < data.getWeight().length; ++i0)
      {
        	data.getWeight()[i0] = cdr.read_type_5();
        	
      }
      	

   }

   @Override
   public final void serialize(px4_msgs.msg.dds.YawEstimatorStatus data, us.ihmc.idl.InterchangeSerializer ser)
   {
      ser.write_type_12("timestamp", data.getTimestamp());
      ser.write_type_12("timestamp_sample", data.getTimestampSample());
      ser.write_type_5("yaw_composite", data.getYawComposite());
      ser.write_type_5("yaw_variance", data.getYawVariance());
      ser.write_type_7("yaw_composite_valid", data.getYawCompositeValid());
      ser.write_type_f("yaw", data.getYaw());
      ser.write_type_f("innov_vn", data.getInnovVn());
      ser.write_type_f("innov_ve", data.getInnovVe());
      ser.write_type_f("weight", data.getWeight());
   }

   @Override
   public final void deserialize(us.ihmc.idl.InterchangeSerializer ser, px4_msgs.msg.dds.YawEstimatorStatus data)
   {
      data.setTimestamp(ser.read_type_12("timestamp"));
      data.setTimestampSample(ser.read_type_12("timestamp_sample"));
      data.setYawComposite(ser.read_type_5("yaw_composite"));
      data.setYawVariance(ser.read_type_5("yaw_variance"));
      data.setYawCompositeValid(ser.read_type_7("yaw_composite_valid"));
      ser.read_type_f("yaw", data.getYaw());
      ser.read_type_f("innov_vn", data.getInnovVn());
      ser.read_type_f("innov_ve", data.getInnovVe());
      ser.read_type_f("weight", data.getWeight());
   }

   public static void staticCopy(px4_msgs.msg.dds.YawEstimatorStatus src, px4_msgs.msg.dds.YawEstimatorStatus dest)
   {
      dest.set(src);
   }

   @Override
   public px4_msgs.msg.dds.YawEstimatorStatus createData()
   {
      return new px4_msgs.msg.dds.YawEstimatorStatus();
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
   
   public void serialize(px4_msgs.msg.dds.YawEstimatorStatus data, us.ihmc.idl.CDR cdr)
   {
      write(data, cdr);
   }

   public void deserialize(px4_msgs.msg.dds.YawEstimatorStatus data, us.ihmc.idl.CDR cdr)
   {
      read(data, cdr);
   }
   
   public void copy(px4_msgs.msg.dds.YawEstimatorStatus src, px4_msgs.msg.dds.YawEstimatorStatus dest)
   {
      staticCopy(src, dest);
   }

   @Override
   public YawEstimatorStatusPubSubType newInstance()
   {
      return new YawEstimatorStatusPubSubType();
   }
}
