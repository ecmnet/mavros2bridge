package px4_msgs.msg.dds;

/**
* 
* Topic data type of the struct "IridiumsbdStatus" defined in "IridiumsbdStatus_.idl". Use this class to provide the TopicDataType to a Participant. 
*
* This file was automatically generated from IridiumsbdStatus_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit IridiumsbdStatus_.idl instead.
*
*/
public class IridiumsbdStatusPubSubType implements us.ihmc.pubsub.TopicDataType<px4_msgs.msg.dds.IridiumsbdStatus>
{
   public static final java.lang.String name = "px4_msgs::msg::dds_::IridiumsbdStatus_";
   
   @Override
   public final java.lang.String getDefinitionChecksum()
   {
   		return "85da50f928ec061edc9f3eab2c9608eb6ebc10d16341605261267c55cb61881d";
   }
   
   @Override
   public final java.lang.String getDefinitionVersion()
   {
   		return "";
   }

   private final us.ihmc.idl.CDR serializeCDR = new us.ihmc.idl.CDR();
   private final us.ihmc.idl.CDR deserializeCDR = new us.ihmc.idl.CDR();

   @Override
   public void serialize(px4_msgs.msg.dds.IridiumsbdStatus data, us.ihmc.pubsub.common.SerializedPayload serializedPayload) throws java.io.IOException
   {
      serializeCDR.serialize(serializedPayload);
      write(data, serializeCDR);
      serializeCDR.finishSerialize();
   }

   @Override
   public void deserialize(us.ihmc.pubsub.common.SerializedPayload serializedPayload, px4_msgs.msg.dds.IridiumsbdStatus data) throws java.io.IOException
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

      current_alignment += 2 + us.ihmc.idl.CDR.alignment(current_alignment, 2);

      current_alignment += 2 + us.ihmc.idl.CDR.alignment(current_alignment, 2);

      current_alignment += 2 + us.ihmc.idl.CDR.alignment(current_alignment, 2);

      current_alignment += 2 + us.ihmc.idl.CDR.alignment(current_alignment, 2);

      current_alignment += 2 + us.ihmc.idl.CDR.alignment(current_alignment, 2);

      current_alignment += 2 + us.ihmc.idl.CDR.alignment(current_alignment, 2);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      return current_alignment - initial_alignment;
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.IridiumsbdStatus data)
   {
      return getCdrSerializedSize(data, 0);
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.IridiumsbdStatus data, int current_alignment)
   {
      int initial_alignment = current_alignment;

      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += 2 + us.ihmc.idl.CDR.alignment(current_alignment, 2);


      current_alignment += 2 + us.ihmc.idl.CDR.alignment(current_alignment, 2);


      current_alignment += 2 + us.ihmc.idl.CDR.alignment(current_alignment, 2);


      current_alignment += 2 + us.ihmc.idl.CDR.alignment(current_alignment, 2);


      current_alignment += 2 + us.ihmc.idl.CDR.alignment(current_alignment, 2);


      current_alignment += 2 + us.ihmc.idl.CDR.alignment(current_alignment, 2);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);



      return current_alignment - initial_alignment;
   }

   public static void write(px4_msgs.msg.dds.IridiumsbdStatus data, us.ihmc.idl.CDR cdr)
   {
      cdr.write_type_12(data.getTimestamp());

      cdr.write_type_12(data.getLastAtOkTimestamp());

      cdr.write_type_3(data.getTxBufWriteIndex());

      cdr.write_type_3(data.getRxBufReadIndex());

      cdr.write_type_3(data.getRxBufEndIndex());

      cdr.write_type_3(data.getFailedSbdSessions());

      cdr.write_type_3(data.getSuccessfulSbdSessions());

      cdr.write_type_3(data.getNumTxBufReset());

      cdr.write_type_9(data.getSignalQuality());

      cdr.write_type_9(data.getState());

      cdr.write_type_7(data.getRingPending());

      cdr.write_type_7(data.getTxBufWritePending());

      cdr.write_type_7(data.getTxSessionPending());

      cdr.write_type_7(data.getRxReadPending());

      cdr.write_type_7(data.getRxSessionPending());

   }

   public static void read(px4_msgs.msg.dds.IridiumsbdStatus data, us.ihmc.idl.CDR cdr)
   {
      data.setTimestamp(cdr.read_type_12());
      	
      data.setLastAtOkTimestamp(cdr.read_type_12());
      	
      data.setTxBufWriteIndex(cdr.read_type_3());
      	
      data.setRxBufReadIndex(cdr.read_type_3());
      	
      data.setRxBufEndIndex(cdr.read_type_3());
      	
      data.setFailedSbdSessions(cdr.read_type_3());
      	
      data.setSuccessfulSbdSessions(cdr.read_type_3());
      	
      data.setNumTxBufReset(cdr.read_type_3());
      	
      data.setSignalQuality(cdr.read_type_9());
      	
      data.setState(cdr.read_type_9());
      	
      data.setRingPending(cdr.read_type_7());
      	
      data.setTxBufWritePending(cdr.read_type_7());
      	
      data.setTxSessionPending(cdr.read_type_7());
      	
      data.setRxReadPending(cdr.read_type_7());
      	
      data.setRxSessionPending(cdr.read_type_7());
      	

   }

   @Override
   public final void serialize(px4_msgs.msg.dds.IridiumsbdStatus data, us.ihmc.idl.InterchangeSerializer ser)
   {
      ser.write_type_12("timestamp", data.getTimestamp());
      ser.write_type_12("last_at_ok_timestamp", data.getLastAtOkTimestamp());
      ser.write_type_3("tx_buf_write_index", data.getTxBufWriteIndex());
      ser.write_type_3("rx_buf_read_index", data.getRxBufReadIndex());
      ser.write_type_3("rx_buf_end_index", data.getRxBufEndIndex());
      ser.write_type_3("failed_sbd_sessions", data.getFailedSbdSessions());
      ser.write_type_3("successful_sbd_sessions", data.getSuccessfulSbdSessions());
      ser.write_type_3("num_tx_buf_reset", data.getNumTxBufReset());
      ser.write_type_9("signal_quality", data.getSignalQuality());
      ser.write_type_9("state", data.getState());
      ser.write_type_7("ring_pending", data.getRingPending());
      ser.write_type_7("tx_buf_write_pending", data.getTxBufWritePending());
      ser.write_type_7("tx_session_pending", data.getTxSessionPending());
      ser.write_type_7("rx_read_pending", data.getRxReadPending());
      ser.write_type_7("rx_session_pending", data.getRxSessionPending());
   }

   @Override
   public final void deserialize(us.ihmc.idl.InterchangeSerializer ser, px4_msgs.msg.dds.IridiumsbdStatus data)
   {
      data.setTimestamp(ser.read_type_12("timestamp"));
      data.setLastAtOkTimestamp(ser.read_type_12("last_at_ok_timestamp"));
      data.setTxBufWriteIndex(ser.read_type_3("tx_buf_write_index"));
      data.setRxBufReadIndex(ser.read_type_3("rx_buf_read_index"));
      data.setRxBufEndIndex(ser.read_type_3("rx_buf_end_index"));
      data.setFailedSbdSessions(ser.read_type_3("failed_sbd_sessions"));
      data.setSuccessfulSbdSessions(ser.read_type_3("successful_sbd_sessions"));
      data.setNumTxBufReset(ser.read_type_3("num_tx_buf_reset"));
      data.setSignalQuality(ser.read_type_9("signal_quality"));
      data.setState(ser.read_type_9("state"));
      data.setRingPending(ser.read_type_7("ring_pending"));
      data.setTxBufWritePending(ser.read_type_7("tx_buf_write_pending"));
      data.setTxSessionPending(ser.read_type_7("tx_session_pending"));
      data.setRxReadPending(ser.read_type_7("rx_read_pending"));
      data.setRxSessionPending(ser.read_type_7("rx_session_pending"));
   }

   public static void staticCopy(px4_msgs.msg.dds.IridiumsbdStatus src, px4_msgs.msg.dds.IridiumsbdStatus dest)
   {
      dest.set(src);
   }

   @Override
   public px4_msgs.msg.dds.IridiumsbdStatus createData()
   {
      return new px4_msgs.msg.dds.IridiumsbdStatus();
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
   
   public void serialize(px4_msgs.msg.dds.IridiumsbdStatus data, us.ihmc.idl.CDR cdr)
   {
      write(data, cdr);
   }

   public void deserialize(px4_msgs.msg.dds.IridiumsbdStatus data, us.ihmc.idl.CDR cdr)
   {
      read(data, cdr);
   }
   
   public void copy(px4_msgs.msg.dds.IridiumsbdStatus src, px4_msgs.msg.dds.IridiumsbdStatus dest)
   {
      staticCopy(src, dest);
   }

   @Override
   public IridiumsbdStatusPubSubType newInstance()
   {
      return new IridiumsbdStatusPubSubType();
   }
}
