package px4_msgs.msg.dds;

/**
* 
* Topic data type of the struct "LoggerStatus" defined in "LoggerStatus_.idl". Use this class to provide the TopicDataType to a Participant. 
*
* This file was automatically generated from LoggerStatus_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit LoggerStatus_.idl instead.
*
*/
public class LoggerStatusPubSubType implements us.ihmc.pubsub.TopicDataType<px4_msgs.msg.dds.LoggerStatus>
{
   public static final java.lang.String name = "px4_msgs::msg::dds_::LoggerStatus_";
   
   @Override
   public final java.lang.String getDefinitionChecksum()
   {
   		return "5bb9d821a8e988d22c73cc7ed55bbe52daffb733d6567d78666df74204868fb7";
   }
   
   @Override
   public final java.lang.String getDefinitionVersion()
   {
   		return "";
   }

   private final us.ihmc.idl.CDR serializeCDR = new us.ihmc.idl.CDR();
   private final us.ihmc.idl.CDR deserializeCDR = new us.ihmc.idl.CDR();

   @Override
   public void serialize(px4_msgs.msg.dds.LoggerStatus data, us.ihmc.pubsub.common.SerializedPayload serializedPayload) throws java.io.IOException
   {
      serializeCDR.serialize(serializedPayload);
      write(data, serializeCDR);
      serializeCDR.finishSerialize();
   }

   @Override
   public void deserialize(us.ihmc.pubsub.common.SerializedPayload serializedPayload, px4_msgs.msg.dds.LoggerStatus data) throws java.io.IOException
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

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      return current_alignment - initial_alignment;
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.LoggerStatus data)
   {
      return getCdrSerializedSize(data, 0);
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.LoggerStatus data, int current_alignment)
   {
      int initial_alignment = current_alignment;

      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);



      return current_alignment - initial_alignment;
   }

   public static void write(px4_msgs.msg.dds.LoggerStatus data, us.ihmc.idl.CDR cdr)
   {
      cdr.write_type_12(data.getTimestamp());

      cdr.write_type_9(data.getType());

      cdr.write_type_9(data.getBackend());

      cdr.write_type_7(data.getIsLogging());

      cdr.write_type_5(data.getTotalWrittenKb());

      cdr.write_type_5(data.getWriteRateKbS());

      cdr.write_type_4(data.getDropouts());

      cdr.write_type_4(data.getMessageGaps());

      cdr.write_type_4(data.getBufferUsedBytes());

      cdr.write_type_4(data.getBufferSizeBytes());

      cdr.write_type_9(data.getNumMessages());

   }

   public static void read(px4_msgs.msg.dds.LoggerStatus data, us.ihmc.idl.CDR cdr)
   {
      data.setTimestamp(cdr.read_type_12());
      	
      data.setType(cdr.read_type_9());
      	
      data.setBackend(cdr.read_type_9());
      	
      data.setIsLogging(cdr.read_type_7());
      	
      data.setTotalWrittenKb(cdr.read_type_5());
      	
      data.setWriteRateKbS(cdr.read_type_5());
      	
      data.setDropouts(cdr.read_type_4());
      	
      data.setMessageGaps(cdr.read_type_4());
      	
      data.setBufferUsedBytes(cdr.read_type_4());
      	
      data.setBufferSizeBytes(cdr.read_type_4());
      	
      data.setNumMessages(cdr.read_type_9());
      	

   }

   @Override
   public final void serialize(px4_msgs.msg.dds.LoggerStatus data, us.ihmc.idl.InterchangeSerializer ser)
   {
      ser.write_type_12("timestamp", data.getTimestamp());
      ser.write_type_9("type", data.getType());
      ser.write_type_9("backend", data.getBackend());
      ser.write_type_7("is_logging", data.getIsLogging());
      ser.write_type_5("total_written_kb", data.getTotalWrittenKb());
      ser.write_type_5("write_rate_kb_s", data.getWriteRateKbS());
      ser.write_type_4("dropouts", data.getDropouts());
      ser.write_type_4("message_gaps", data.getMessageGaps());
      ser.write_type_4("buffer_used_bytes", data.getBufferUsedBytes());
      ser.write_type_4("buffer_size_bytes", data.getBufferSizeBytes());
      ser.write_type_9("num_messages", data.getNumMessages());
   }

   @Override
   public final void deserialize(us.ihmc.idl.InterchangeSerializer ser, px4_msgs.msg.dds.LoggerStatus data)
   {
      data.setTimestamp(ser.read_type_12("timestamp"));
      data.setType(ser.read_type_9("type"));
      data.setBackend(ser.read_type_9("backend"));
      data.setIsLogging(ser.read_type_7("is_logging"));
      data.setTotalWrittenKb(ser.read_type_5("total_written_kb"));
      data.setWriteRateKbS(ser.read_type_5("write_rate_kb_s"));
      data.setDropouts(ser.read_type_4("dropouts"));
      data.setMessageGaps(ser.read_type_4("message_gaps"));
      data.setBufferUsedBytes(ser.read_type_4("buffer_used_bytes"));
      data.setBufferSizeBytes(ser.read_type_4("buffer_size_bytes"));
      data.setNumMessages(ser.read_type_9("num_messages"));
   }

   public static void staticCopy(px4_msgs.msg.dds.LoggerStatus src, px4_msgs.msg.dds.LoggerStatus dest)
   {
      dest.set(src);
   }

   @Override
   public px4_msgs.msg.dds.LoggerStatus createData()
   {
      return new px4_msgs.msg.dds.LoggerStatus();
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
   
   public void serialize(px4_msgs.msg.dds.LoggerStatus data, us.ihmc.idl.CDR cdr)
   {
      write(data, cdr);
   }

   public void deserialize(px4_msgs.msg.dds.LoggerStatus data, us.ihmc.idl.CDR cdr)
   {
      read(data, cdr);
   }
   
   public void copy(px4_msgs.msg.dds.LoggerStatus src, px4_msgs.msg.dds.LoggerStatus dest)
   {
      staticCopy(src, dest);
   }

   @Override
   public LoggerStatusPubSubType newInstance()
   {
      return new LoggerStatusPubSubType();
   }
}
