package px4_msgs.msg.dds;

/**
* 
* Topic data type of the struct "PpsCapture" defined in "PpsCapture_.idl". Use this class to provide the TopicDataType to a Participant. 
*
* This file was automatically generated from PpsCapture_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit PpsCapture_.idl instead.
*
*/
public class PpsCapturePubSubType implements us.ihmc.pubsub.TopicDataType<px4_msgs.msg.dds.PpsCapture>
{
   public static final java.lang.String name = "px4_msgs::msg::dds_::PpsCapture_";
   
   @Override
   public final java.lang.String getDefinitionChecksum()
   {
   		return "428928520e4354f139feeef83b27ef71a8b2d02880c1b501cf5e852d923ff19b";
   }
   
   @Override
   public final java.lang.String getDefinitionVersion()
   {
   		return "";
   }

   private final us.ihmc.idl.CDR serializeCDR = new us.ihmc.idl.CDR();
   private final us.ihmc.idl.CDR deserializeCDR = new us.ihmc.idl.CDR();

   @Override
   public void serialize(px4_msgs.msg.dds.PpsCapture data, us.ihmc.pubsub.common.SerializedPayload serializedPayload) throws java.io.IOException
   {
      serializeCDR.serialize(serializedPayload);
      write(data, serializeCDR);
      serializeCDR.finishSerialize();
   }

   @Override
   public void deserialize(us.ihmc.pubsub.common.SerializedPayload serializedPayload, px4_msgs.msg.dds.PpsCapture data) throws java.io.IOException
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


      return current_alignment - initial_alignment;
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.PpsCapture data)
   {
      return getCdrSerializedSize(data, 0);
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.PpsCapture data, int current_alignment)
   {
      int initial_alignment = current_alignment;

      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);



      return current_alignment - initial_alignment;
   }

   public static void write(px4_msgs.msg.dds.PpsCapture data, us.ihmc.idl.CDR cdr)
   {
      cdr.write_type_12(data.getTimestamp());

      cdr.write_type_12(data.getRtcTimestamp());

      cdr.write_type_9(data.getPpsRateExceededCounter());

   }

   public static void read(px4_msgs.msg.dds.PpsCapture data, us.ihmc.idl.CDR cdr)
   {
      data.setTimestamp(cdr.read_type_12());
      	
      data.setRtcTimestamp(cdr.read_type_12());
      	
      data.setPpsRateExceededCounter(cdr.read_type_9());
      	

   }

   @Override
   public final void serialize(px4_msgs.msg.dds.PpsCapture data, us.ihmc.idl.InterchangeSerializer ser)
   {
      ser.write_type_12("timestamp", data.getTimestamp());
      ser.write_type_12("rtc_timestamp", data.getRtcTimestamp());
      ser.write_type_9("pps_rate_exceeded_counter", data.getPpsRateExceededCounter());
   }

   @Override
   public final void deserialize(us.ihmc.idl.InterchangeSerializer ser, px4_msgs.msg.dds.PpsCapture data)
   {
      data.setTimestamp(ser.read_type_12("timestamp"));
      data.setRtcTimestamp(ser.read_type_12("rtc_timestamp"));
      data.setPpsRateExceededCounter(ser.read_type_9("pps_rate_exceeded_counter"));
   }

   public static void staticCopy(px4_msgs.msg.dds.PpsCapture src, px4_msgs.msg.dds.PpsCapture dest)
   {
      dest.set(src);
   }

   @Override
   public px4_msgs.msg.dds.PpsCapture createData()
   {
      return new px4_msgs.msg.dds.PpsCapture();
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
   
   public void serialize(px4_msgs.msg.dds.PpsCapture data, us.ihmc.idl.CDR cdr)
   {
      write(data, cdr);
   }

   public void deserialize(px4_msgs.msg.dds.PpsCapture data, us.ihmc.idl.CDR cdr)
   {
      read(data, cdr);
   }
   
   public void copy(px4_msgs.msg.dds.PpsCapture src, px4_msgs.msg.dds.PpsCapture dest)
   {
      staticCopy(src, dest);
   }

   @Override
   public PpsCapturePubSubType newInstance()
   {
      return new PpsCapturePubSubType();
   }
}
