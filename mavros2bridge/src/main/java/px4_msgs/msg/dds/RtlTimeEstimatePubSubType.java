package px4_msgs.msg.dds;

/**
* 
* Topic data type of the struct "RtlTimeEstimate" defined in "RtlTimeEstimate_.idl". Use this class to provide the TopicDataType to a Participant. 
*
* This file was automatically generated from RtlTimeEstimate_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit RtlTimeEstimate_.idl instead.
*
*/
public class RtlTimeEstimatePubSubType implements us.ihmc.pubsub.TopicDataType<px4_msgs.msg.dds.RtlTimeEstimate>
{
   public static final java.lang.String name = "px4_msgs::msg::dds_::RtlTimeEstimate_";
   
   @Override
   public final java.lang.String getDefinitionChecksum()
   {
   		return "9f369be20cd37dbc4d49dcff6e2f67efe92b9b5de3e583f9cecfd72bbe1c1f6d";
   }
   
   @Override
   public final java.lang.String getDefinitionVersion()
   {
   		return "";
   }

   private final us.ihmc.idl.CDR serializeCDR = new us.ihmc.idl.CDR();
   private final us.ihmc.idl.CDR deserializeCDR = new us.ihmc.idl.CDR();

   @Override
   public void serialize(px4_msgs.msg.dds.RtlTimeEstimate data, us.ihmc.pubsub.common.SerializedPayload serializedPayload) throws java.io.IOException
   {
      serializeCDR.serialize(serializedPayload);
      write(data, serializeCDR);
      serializeCDR.finishSerialize();
   }

   @Override
   public void deserialize(us.ihmc.pubsub.common.SerializedPayload serializedPayload, px4_msgs.msg.dds.RtlTimeEstimate data) throws java.io.IOException
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

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      return current_alignment - initial_alignment;
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.RtlTimeEstimate data)
   {
      return getCdrSerializedSize(data, 0);
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.RtlTimeEstimate data, int current_alignment)
   {
      int initial_alignment = current_alignment;

      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);



      return current_alignment - initial_alignment;
   }

   public static void write(px4_msgs.msg.dds.RtlTimeEstimate data, us.ihmc.idl.CDR cdr)
   {
      cdr.write_type_12(data.getTimestamp());

      cdr.write_type_7(data.getValid());

      cdr.write_type_5(data.getTimeEstimate());

      cdr.write_type_5(data.getSafeTimeEstimate());

   }

   public static void read(px4_msgs.msg.dds.RtlTimeEstimate data, us.ihmc.idl.CDR cdr)
   {
      data.setTimestamp(cdr.read_type_12());
      	
      data.setValid(cdr.read_type_7());
      	
      data.setTimeEstimate(cdr.read_type_5());
      	
      data.setSafeTimeEstimate(cdr.read_type_5());
      	

   }

   @Override
   public final void serialize(px4_msgs.msg.dds.RtlTimeEstimate data, us.ihmc.idl.InterchangeSerializer ser)
   {
      ser.write_type_12("timestamp", data.getTimestamp());
      ser.write_type_7("valid", data.getValid());
      ser.write_type_5("time_estimate", data.getTimeEstimate());
      ser.write_type_5("safe_time_estimate", data.getSafeTimeEstimate());
   }

   @Override
   public final void deserialize(us.ihmc.idl.InterchangeSerializer ser, px4_msgs.msg.dds.RtlTimeEstimate data)
   {
      data.setTimestamp(ser.read_type_12("timestamp"));
      data.setValid(ser.read_type_7("valid"));
      data.setTimeEstimate(ser.read_type_5("time_estimate"));
      data.setSafeTimeEstimate(ser.read_type_5("safe_time_estimate"));
   }

   public static void staticCopy(px4_msgs.msg.dds.RtlTimeEstimate src, px4_msgs.msg.dds.RtlTimeEstimate dest)
   {
      dest.set(src);
   }

   @Override
   public px4_msgs.msg.dds.RtlTimeEstimate createData()
   {
      return new px4_msgs.msg.dds.RtlTimeEstimate();
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
   
   public void serialize(px4_msgs.msg.dds.RtlTimeEstimate data, us.ihmc.idl.CDR cdr)
   {
      write(data, cdr);
   }

   public void deserialize(px4_msgs.msg.dds.RtlTimeEstimate data, us.ihmc.idl.CDR cdr)
   {
      read(data, cdr);
   }
   
   public void copy(px4_msgs.msg.dds.RtlTimeEstimate src, px4_msgs.msg.dds.RtlTimeEstimate dest)
   {
      staticCopy(src, dest);
   }

   @Override
   public RtlTimeEstimatePubSubType newInstance()
   {
      return new RtlTimeEstimatePubSubType();
   }
}
