package px4_msgs.msg.dds;

/**
* 
* Topic data type of the struct "RcParameterMap" defined in "RcParameterMap_.idl". Use this class to provide the TopicDataType to a Participant. 
*
* This file was automatically generated from RcParameterMap_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit RcParameterMap_.idl instead.
*
*/
public class RcParameterMapPubSubType implements us.ihmc.pubsub.TopicDataType<px4_msgs.msg.dds.RcParameterMap>
{
   public static final java.lang.String name = "px4_msgs::msg::dds_::RcParameterMap_";
   
   @Override
   public final java.lang.String getDefinitionChecksum()
   {
   		return "726d0c80e7d292074379b9e16ef8e7ab8aa5db13c57f23d5236581f761449d00";
   }
   
   @Override
   public final java.lang.String getDefinitionVersion()
   {
   		return "";
   }

   private final us.ihmc.idl.CDR serializeCDR = new us.ihmc.idl.CDR();
   private final us.ihmc.idl.CDR deserializeCDR = new us.ihmc.idl.CDR();

   @Override
   public void serialize(px4_msgs.msg.dds.RcParameterMap data, us.ihmc.pubsub.common.SerializedPayload serializedPayload) throws java.io.IOException
   {
      serializeCDR.serialize(serializedPayload);
      write(data, serializeCDR);
      serializeCDR.finishSerialize();
   }

   @Override
   public void deserialize(us.ihmc.pubsub.common.SerializedPayload serializedPayload, px4_msgs.msg.dds.RcParameterMap data) throws java.io.IOException
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

      current_alignment += ((3) * 1) + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += ((3) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += ((51) * 1) + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += ((3) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += ((3) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += ((3) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += ((3) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      return current_alignment - initial_alignment;
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.RcParameterMap data)
   {
      return getCdrSerializedSize(data, 0);
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.RcParameterMap data, int current_alignment)
   {
      int initial_alignment = current_alignment;

      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += ((3) * 1) + us.ihmc.idl.CDR.alignment(current_alignment, 1);
      current_alignment += ((3) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);
      current_alignment += ((51) * 1) + us.ihmc.idl.CDR.alignment(current_alignment, 1);
      current_alignment += ((3) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);
      current_alignment += ((3) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);
      current_alignment += ((3) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);
      current_alignment += ((3) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      return current_alignment - initial_alignment;
   }

   public static void write(px4_msgs.msg.dds.RcParameterMap data, us.ihmc.idl.CDR cdr)
   {
      cdr.write_type_12(data.getTimestamp());

      for(int i0 = 0; i0 < data.getValid().length; ++i0)
      {
        	cdr.write_type_7(data.getValid()[i0]);	
      }

      for(int i0 = 0; i0 < data.getParamIndex().length; ++i0)
      {
        	cdr.write_type_2(data.getParamIndex()[i0]);	
      }

      for(int i0 = 0; i0 < data.getParamId().length; ++i0)
      {
        	cdr.write_type_8(data.getParamId()[i0]);	
      }

      for(int i0 = 0; i0 < data.getScale().length; ++i0)
      {
        	cdr.write_type_5(data.getScale()[i0]);	
      }

      for(int i0 = 0; i0 < data.getValue0().length; ++i0)
      {
        	cdr.write_type_5(data.getValue0()[i0]);	
      }

      for(int i0 = 0; i0 < data.getValueMin().length; ++i0)
      {
        	cdr.write_type_5(data.getValueMin()[i0]);	
      }

      for(int i0 = 0; i0 < data.getValueMax().length; ++i0)
      {
        	cdr.write_type_5(data.getValueMax()[i0]);	
      }

   }

   public static void read(px4_msgs.msg.dds.RcParameterMap data, us.ihmc.idl.CDR cdr)
   {
      data.setTimestamp(cdr.read_type_12());
      	
      for(int i0 = 0; i0 < data.getValid().length; ++i0)
      {
        	data.getValid()[i0] = cdr.read_type_7();
        	
      }
      	
      for(int i0 = 0; i0 < data.getParamIndex().length; ++i0)
      {
        	data.getParamIndex()[i0] = cdr.read_type_2();
        	
      }
      	
      for(int i0 = 0; i0 < data.getParamId().length; ++i0)
      {
        	data.getParamId()[i0] = cdr.read_type_8();
        	
      }
      	
      for(int i0 = 0; i0 < data.getScale().length; ++i0)
      {
        	data.getScale()[i0] = cdr.read_type_5();
        	
      }
      	
      for(int i0 = 0; i0 < data.getValue0().length; ++i0)
      {
        	data.getValue0()[i0] = cdr.read_type_5();
        	
      }
      	
      for(int i0 = 0; i0 < data.getValueMin().length; ++i0)
      {
        	data.getValueMin()[i0] = cdr.read_type_5();
        	
      }
      	
      for(int i0 = 0; i0 < data.getValueMax().length; ++i0)
      {
        	data.getValueMax()[i0] = cdr.read_type_5();
        	
      }
      	

   }

   @Override
   public final void serialize(px4_msgs.msg.dds.RcParameterMap data, us.ihmc.idl.InterchangeSerializer ser)
   {
      ser.write_type_12("timestamp", data.getTimestamp());
      ser.write_type_f("valid", data.getValid());
      ser.write_type_f("param_index", data.getParamIndex());
      ser.write_type_f("param_id", data.getParamId());
      ser.write_type_f("scale", data.getScale());
      ser.write_type_f("value0", data.getValue0());
      ser.write_type_f("value_min", data.getValueMin());
      ser.write_type_f("value_max", data.getValueMax());
   }

   @Override
   public final void deserialize(us.ihmc.idl.InterchangeSerializer ser, px4_msgs.msg.dds.RcParameterMap data)
   {
      data.setTimestamp(ser.read_type_12("timestamp"));
      ser.read_type_f("valid", data.getValid());
      ser.read_type_f("param_index", data.getParamIndex());
      ser.read_type_f("param_id", data.getParamId());
      ser.read_type_f("scale", data.getScale());
      ser.read_type_f("value0", data.getValue0());
      ser.read_type_f("value_min", data.getValueMin());
      ser.read_type_f("value_max", data.getValueMax());
   }

   public static void staticCopy(px4_msgs.msg.dds.RcParameterMap src, px4_msgs.msg.dds.RcParameterMap dest)
   {
      dest.set(src);
   }

   @Override
   public px4_msgs.msg.dds.RcParameterMap createData()
   {
      return new px4_msgs.msg.dds.RcParameterMap();
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
   
   public void serialize(px4_msgs.msg.dds.RcParameterMap data, us.ihmc.idl.CDR cdr)
   {
      write(data, cdr);
   }

   public void deserialize(px4_msgs.msg.dds.RcParameterMap data, us.ihmc.idl.CDR cdr)
   {
      read(data, cdr);
   }
   
   public void copy(px4_msgs.msg.dds.RcParameterMap src, px4_msgs.msg.dds.RcParameterMap dest)
   {
      staticCopy(src, dest);
   }

   @Override
   public RcParameterMapPubSubType newInstance()
   {
      return new RcParameterMapPubSubType();
   }
}
