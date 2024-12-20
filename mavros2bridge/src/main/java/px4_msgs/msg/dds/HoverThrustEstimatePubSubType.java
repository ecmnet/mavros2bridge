package px4_msgs.msg.dds;

/**
* 
* Topic data type of the struct "HoverThrustEstimate" defined in "HoverThrustEstimate_.idl". Use this class to provide the TopicDataType to a Participant. 
*
* This file was automatically generated from HoverThrustEstimate_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit HoverThrustEstimate_.idl instead.
*
*/
public class HoverThrustEstimatePubSubType implements us.ihmc.pubsub.TopicDataType<px4_msgs.msg.dds.HoverThrustEstimate>
{
   public static final java.lang.String name = "px4_msgs::msg::dds_::HoverThrustEstimate_";
   
   @Override
   public final java.lang.String getDefinitionChecksum()
   {
   		return "849372cc58f54e25a0ef3d267eef76997f1b173d68de34a3448e8e04069baa87";
   }
   
   @Override
   public final java.lang.String getDefinitionVersion()
   {
   		return "";
   }

   private final us.ihmc.idl.CDR serializeCDR = new us.ihmc.idl.CDR();
   private final us.ihmc.idl.CDR deserializeCDR = new us.ihmc.idl.CDR();

   @Override
   public void serialize(px4_msgs.msg.dds.HoverThrustEstimate data, us.ihmc.pubsub.common.SerializedPayload serializedPayload) throws java.io.IOException
   {
      serializeCDR.serialize(serializedPayload);
      write(data, serializeCDR);
      serializeCDR.finishSerialize();
   }

   @Override
   public void deserialize(us.ihmc.pubsub.common.SerializedPayload serializedPayload, px4_msgs.msg.dds.HoverThrustEstimate data) throws java.io.IOException
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

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      return current_alignment - initial_alignment;
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.HoverThrustEstimate data)
   {
      return getCdrSerializedSize(data, 0);
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.HoverThrustEstimate data, int current_alignment)
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


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);



      return current_alignment - initial_alignment;
   }

   public static void write(px4_msgs.msg.dds.HoverThrustEstimate data, us.ihmc.idl.CDR cdr)
   {
      cdr.write_type_12(data.getTimestamp());

      cdr.write_type_12(data.getTimestampSample());

      cdr.write_type_5(data.getHoverThrust());

      cdr.write_type_5(data.getHoverThrustVar());

      cdr.write_type_5(data.getAccelInnov());

      cdr.write_type_5(data.getAccelInnovVar());

      cdr.write_type_5(data.getAccelInnovTestRatio());

      cdr.write_type_5(data.getAccelNoiseVar());

      cdr.write_type_7(data.getValid());

   }

   public static void read(px4_msgs.msg.dds.HoverThrustEstimate data, us.ihmc.idl.CDR cdr)
   {
      data.setTimestamp(cdr.read_type_12());
      	
      data.setTimestampSample(cdr.read_type_12());
      	
      data.setHoverThrust(cdr.read_type_5());
      	
      data.setHoverThrustVar(cdr.read_type_5());
      	
      data.setAccelInnov(cdr.read_type_5());
      	
      data.setAccelInnovVar(cdr.read_type_5());
      	
      data.setAccelInnovTestRatio(cdr.read_type_5());
      	
      data.setAccelNoiseVar(cdr.read_type_5());
      	
      data.setValid(cdr.read_type_7());
      	

   }

   @Override
   public final void serialize(px4_msgs.msg.dds.HoverThrustEstimate data, us.ihmc.idl.InterchangeSerializer ser)
   {
      ser.write_type_12("timestamp", data.getTimestamp());
      ser.write_type_12("timestamp_sample", data.getTimestampSample());
      ser.write_type_5("hover_thrust", data.getHoverThrust());
      ser.write_type_5("hover_thrust_var", data.getHoverThrustVar());
      ser.write_type_5("accel_innov", data.getAccelInnov());
      ser.write_type_5("accel_innov_var", data.getAccelInnovVar());
      ser.write_type_5("accel_innov_test_ratio", data.getAccelInnovTestRatio());
      ser.write_type_5("accel_noise_var", data.getAccelNoiseVar());
      ser.write_type_7("valid", data.getValid());
   }

   @Override
   public final void deserialize(us.ihmc.idl.InterchangeSerializer ser, px4_msgs.msg.dds.HoverThrustEstimate data)
   {
      data.setTimestamp(ser.read_type_12("timestamp"));
      data.setTimestampSample(ser.read_type_12("timestamp_sample"));
      data.setHoverThrust(ser.read_type_5("hover_thrust"));
      data.setHoverThrustVar(ser.read_type_5("hover_thrust_var"));
      data.setAccelInnov(ser.read_type_5("accel_innov"));
      data.setAccelInnovVar(ser.read_type_5("accel_innov_var"));
      data.setAccelInnovTestRatio(ser.read_type_5("accel_innov_test_ratio"));
      data.setAccelNoiseVar(ser.read_type_5("accel_noise_var"));
      data.setValid(ser.read_type_7("valid"));
   }

   public static void staticCopy(px4_msgs.msg.dds.HoverThrustEstimate src, px4_msgs.msg.dds.HoverThrustEstimate dest)
   {
      dest.set(src);
   }

   @Override
   public px4_msgs.msg.dds.HoverThrustEstimate createData()
   {
      return new px4_msgs.msg.dds.HoverThrustEstimate();
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
   
   public void serialize(px4_msgs.msg.dds.HoverThrustEstimate data, us.ihmc.idl.CDR cdr)
   {
      write(data, cdr);
   }

   public void deserialize(px4_msgs.msg.dds.HoverThrustEstimate data, us.ihmc.idl.CDR cdr)
   {
      read(data, cdr);
   }
   
   public void copy(px4_msgs.msg.dds.HoverThrustEstimate src, px4_msgs.msg.dds.HoverThrustEstimate dest)
   {
      staticCopy(src, dest);
   }

   @Override
   public HoverThrustEstimatePubSubType newInstance()
   {
      return new HoverThrustEstimatePubSubType();
   }
}
