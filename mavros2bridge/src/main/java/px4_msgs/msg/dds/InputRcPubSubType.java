package px4_msgs.msg.dds;

/**
* 
* Topic data type of the struct "InputRc" defined in "InputRc_.idl". Use this class to provide the TopicDataType to a Participant. 
*
* This file was automatically generated from InputRc_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit InputRc_.idl instead.
*
*/
public class InputRcPubSubType implements us.ihmc.pubsub.TopicDataType<px4_msgs.msg.dds.InputRc>
{
   public static final java.lang.String name = "px4_msgs::msg::dds_::InputRc_";
   
   @Override
   public final java.lang.String getDefinitionChecksum()
   {
   		return "892583c3d3a8d6f01a0ed098ed7a37f6de130cb05638619c6c2f85c76da6f871";
   }
   
   @Override
   public final java.lang.String getDefinitionVersion()
   {
   		return "";
   }

   private final us.ihmc.idl.CDR serializeCDR = new us.ihmc.idl.CDR();
   private final us.ihmc.idl.CDR deserializeCDR = new us.ihmc.idl.CDR();

   @Override
   public void serialize(px4_msgs.msg.dds.InputRc data, us.ihmc.pubsub.common.SerializedPayload serializedPayload) throws java.io.IOException
   {
      serializeCDR.serialize(serializedPayload);
      write(data, serializeCDR);
      serializeCDR.finishSerialize();
   }

   @Override
   public void deserialize(us.ihmc.pubsub.common.SerializedPayload serializedPayload, px4_msgs.msg.dds.InputRc data) throws java.io.IOException
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

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 2 + us.ihmc.idl.CDR.alignment(current_alignment, 2);

      current_alignment += 2 + us.ihmc.idl.CDR.alignment(current_alignment, 2);

      current_alignment += 2 + us.ihmc.idl.CDR.alignment(current_alignment, 2);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      return current_alignment - initial_alignment;
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.InputRc data)
   {
      return getCdrSerializedSize(data, 0);
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.InputRc data, int current_alignment)
   {
      int initial_alignment = current_alignment;

      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 2 + us.ihmc.idl.CDR.alignment(current_alignment, 2);


      current_alignment += 2 + us.ihmc.idl.CDR.alignment(current_alignment, 2);


      current_alignment += 2 + us.ihmc.idl.CDR.alignment(current_alignment, 2);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);



      return current_alignment - initial_alignment;
   }

   public static void write(px4_msgs.msg.dds.InputRc data, us.ihmc.idl.CDR cdr)
   {
      cdr.write_type_12(data.getTimestamp());

      cdr.write_type_12(data.getTimestampLastSignal());

      cdr.write_type_9(data.getChannelCount());

      cdr.write_type_2(data.getRssi());

      cdr.write_type_7(data.getRcFailsafe());

      cdr.write_type_7(data.getRcLost());

      cdr.write_type_3(data.getRcLostFrameCount());

      cdr.write_type_3(data.getRcTotalFrameCount());

      cdr.write_type_3(data.getRcPpmFrameLength());

      cdr.write_type_9(data.getInputSource());

      cdr.write_type_9(data.getLinkQuality());

      cdr.write_type_5(data.getRssiDbm());

   }

   public static void read(px4_msgs.msg.dds.InputRc data, us.ihmc.idl.CDR cdr)
   {
      data.setTimestamp(cdr.read_type_12());
      	
      data.setTimestampLastSignal(cdr.read_type_12());
      	
      data.setChannelCount(cdr.read_type_9());
      	
      data.setRssi(cdr.read_type_2());
      	
      data.setRcFailsafe(cdr.read_type_7());
      	
      data.setRcLost(cdr.read_type_7());
      	
      data.setRcLostFrameCount(cdr.read_type_3());
      	
      data.setRcTotalFrameCount(cdr.read_type_3());
      	
      data.setRcPpmFrameLength(cdr.read_type_3());
      	
      data.setInputSource(cdr.read_type_9());
      	
      data.setLinkQuality(cdr.read_type_9());
      	
      data.setRssiDbm(cdr.read_type_5());
      	

   }

   @Override
   public final void serialize(px4_msgs.msg.dds.InputRc data, us.ihmc.idl.InterchangeSerializer ser)
   {
      ser.write_type_12("timestamp", data.getTimestamp());
      ser.write_type_12("timestamp_last_signal", data.getTimestampLastSignal());
      ser.write_type_9("channel_count", data.getChannelCount());
      ser.write_type_2("rssi", data.getRssi());
      ser.write_type_7("rc_failsafe", data.getRcFailsafe());
      ser.write_type_7("rc_lost", data.getRcLost());
      ser.write_type_3("rc_lost_frame_count", data.getRcLostFrameCount());
      ser.write_type_3("rc_total_frame_count", data.getRcTotalFrameCount());
      ser.write_type_3("rc_ppm_frame_length", data.getRcPpmFrameLength());
      ser.write_type_9("input_source", data.getInputSource());
      ser.write_type_9("link_quality", data.getLinkQuality());
      ser.write_type_5("rssi_dbm", data.getRssiDbm());
   }

   @Override
   public final void deserialize(us.ihmc.idl.InterchangeSerializer ser, px4_msgs.msg.dds.InputRc data)
   {
      data.setTimestamp(ser.read_type_12("timestamp"));
      data.setTimestampLastSignal(ser.read_type_12("timestamp_last_signal"));
      data.setChannelCount(ser.read_type_9("channel_count"));
      data.setRssi(ser.read_type_2("rssi"));
      data.setRcFailsafe(ser.read_type_7("rc_failsafe"));
      data.setRcLost(ser.read_type_7("rc_lost"));
      data.setRcLostFrameCount(ser.read_type_3("rc_lost_frame_count"));
      data.setRcTotalFrameCount(ser.read_type_3("rc_total_frame_count"));
      data.setRcPpmFrameLength(ser.read_type_3("rc_ppm_frame_length"));
      data.setInputSource(ser.read_type_9("input_source"));
      data.setLinkQuality(ser.read_type_9("link_quality"));
      data.setRssiDbm(ser.read_type_5("rssi_dbm"));
   }

   public static void staticCopy(px4_msgs.msg.dds.InputRc src, px4_msgs.msg.dds.InputRc dest)
   {
      dest.set(src);
   }

   @Override
   public px4_msgs.msg.dds.InputRc createData()
   {
      return new px4_msgs.msg.dds.InputRc();
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
   
   public void serialize(px4_msgs.msg.dds.InputRc data, us.ihmc.idl.CDR cdr)
   {
      write(data, cdr);
   }

   public void deserialize(px4_msgs.msg.dds.InputRc data, us.ihmc.idl.CDR cdr)
   {
      read(data, cdr);
   }
   
   public void copy(px4_msgs.msg.dds.InputRc src, px4_msgs.msg.dds.InputRc dest)
   {
      staticCopy(src, dest);
   }

   @Override
   public InputRcPubSubType newInstance()
   {
      return new InputRcPubSubType();
   }
}
