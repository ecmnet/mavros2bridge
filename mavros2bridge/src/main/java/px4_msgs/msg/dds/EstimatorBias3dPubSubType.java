package px4_msgs.msg.dds;

/**
* 
* Topic data type of the struct "EstimatorBias3d" defined in "EstimatorBias3d_.idl". Use this class to provide the TopicDataType to a Participant. 
*
* This file was automatically generated from EstimatorBias3d_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit EstimatorBias3d_.idl instead.
*
*/
public class EstimatorBias3dPubSubType implements us.ihmc.pubsub.TopicDataType<px4_msgs.msg.dds.EstimatorBias3d>
{
   public static final java.lang.String name = "px4_msgs::msg::dds_::EstimatorBias3d_";
   
   @Override
   public final java.lang.String getDefinitionChecksum()
   {
   		return "725f6bab0a2a4d689910da198e58119483288e593e5b23254a8b06d7a2d8a282";
   }
   
   @Override
   public final java.lang.String getDefinitionVersion()
   {
   		return "";
   }

   private final us.ihmc.idl.CDR serializeCDR = new us.ihmc.idl.CDR();
   private final us.ihmc.idl.CDR deserializeCDR = new us.ihmc.idl.CDR();

   @Override
   public void serialize(px4_msgs.msg.dds.EstimatorBias3d data, us.ihmc.pubsub.common.SerializedPayload serializedPayload) throws java.io.IOException
   {
      serializeCDR.serialize(serializedPayload);
      write(data, serializeCDR);
      serializeCDR.finishSerialize();
   }

   @Override
   public void deserialize(us.ihmc.pubsub.common.SerializedPayload serializedPayload, px4_msgs.msg.dds.EstimatorBias3d data) throws java.io.IOException
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

      current_alignment += ((3) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += ((3) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += ((3) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += ((3) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += ((3) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      return current_alignment - initial_alignment;
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.EstimatorBias3d data)
   {
      return getCdrSerializedSize(data, 0);
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.EstimatorBias3d data, int current_alignment)
   {
      int initial_alignment = current_alignment;

      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += ((3) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);
      current_alignment += ((3) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);
      current_alignment += ((3) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);
      current_alignment += ((3) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);
      current_alignment += ((3) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      return current_alignment - initial_alignment;
   }

   public static void write(px4_msgs.msg.dds.EstimatorBias3d data, us.ihmc.idl.CDR cdr)
   {
      cdr.write_type_12(data.getTimestamp());

      cdr.write_type_12(data.getTimestampSample());

      cdr.write_type_4(data.getDeviceId());

      for(int i0 = 0; i0 < data.getBias().length; ++i0)
      {
        	cdr.write_type_5(data.getBias()[i0]);	
      }

      for(int i0 = 0; i0 < data.getBiasVar().length; ++i0)
      {
        	cdr.write_type_5(data.getBiasVar()[i0]);	
      }

      for(int i0 = 0; i0 < data.getInnov().length; ++i0)
      {
        	cdr.write_type_5(data.getInnov()[i0]);	
      }

      for(int i0 = 0; i0 < data.getInnovVar().length; ++i0)
      {
        	cdr.write_type_5(data.getInnovVar()[i0]);	
      }

      for(int i0 = 0; i0 < data.getInnovTestRatio().length; ++i0)
      {
        	cdr.write_type_5(data.getInnovTestRatio()[i0]);	
      }

   }

   public static void read(px4_msgs.msg.dds.EstimatorBias3d data, us.ihmc.idl.CDR cdr)
   {
      data.setTimestamp(cdr.read_type_12());
      	
      data.setTimestampSample(cdr.read_type_12());
      	
      data.setDeviceId(cdr.read_type_4());
      	
      for(int i0 = 0; i0 < data.getBias().length; ++i0)
      {
        	data.getBias()[i0] = cdr.read_type_5();
        	
      }
      	
      for(int i0 = 0; i0 < data.getBiasVar().length; ++i0)
      {
        	data.getBiasVar()[i0] = cdr.read_type_5();
        	
      }
      	
      for(int i0 = 0; i0 < data.getInnov().length; ++i0)
      {
        	data.getInnov()[i0] = cdr.read_type_5();
        	
      }
      	
      for(int i0 = 0; i0 < data.getInnovVar().length; ++i0)
      {
        	data.getInnovVar()[i0] = cdr.read_type_5();
        	
      }
      	
      for(int i0 = 0; i0 < data.getInnovTestRatio().length; ++i0)
      {
        	data.getInnovTestRatio()[i0] = cdr.read_type_5();
        	
      }
      	

   }

   @Override
   public final void serialize(px4_msgs.msg.dds.EstimatorBias3d data, us.ihmc.idl.InterchangeSerializer ser)
   {
      ser.write_type_12("timestamp", data.getTimestamp());
      ser.write_type_12("timestamp_sample", data.getTimestampSample());
      ser.write_type_4("device_id", data.getDeviceId());
      ser.write_type_f("bias", data.getBias());
      ser.write_type_f("bias_var", data.getBiasVar());
      ser.write_type_f("innov", data.getInnov());
      ser.write_type_f("innov_var", data.getInnovVar());
      ser.write_type_f("innov_test_ratio", data.getInnovTestRatio());
   }

   @Override
   public final void deserialize(us.ihmc.idl.InterchangeSerializer ser, px4_msgs.msg.dds.EstimatorBias3d data)
   {
      data.setTimestamp(ser.read_type_12("timestamp"));
      data.setTimestampSample(ser.read_type_12("timestamp_sample"));
      data.setDeviceId(ser.read_type_4("device_id"));
      ser.read_type_f("bias", data.getBias());
      ser.read_type_f("bias_var", data.getBiasVar());
      ser.read_type_f("innov", data.getInnov());
      ser.read_type_f("innov_var", data.getInnovVar());
      ser.read_type_f("innov_test_ratio", data.getInnovTestRatio());
   }

   public static void staticCopy(px4_msgs.msg.dds.EstimatorBias3d src, px4_msgs.msg.dds.EstimatorBias3d dest)
   {
      dest.set(src);
   }

   @Override
   public px4_msgs.msg.dds.EstimatorBias3d createData()
   {
      return new px4_msgs.msg.dds.EstimatorBias3d();
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
   
   public void serialize(px4_msgs.msg.dds.EstimatorBias3d data, us.ihmc.idl.CDR cdr)
   {
      write(data, cdr);
   }

   public void deserialize(px4_msgs.msg.dds.EstimatorBias3d data, us.ihmc.idl.CDR cdr)
   {
      read(data, cdr);
   }
   
   public void copy(px4_msgs.msg.dds.EstimatorBias3d src, px4_msgs.msg.dds.EstimatorBias3d dest)
   {
      staticCopy(src, dest);
   }

   @Override
   public EstimatorBias3dPubSubType newInstance()
   {
      return new EstimatorBias3dPubSubType();
   }
}
