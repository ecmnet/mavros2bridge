package px4_msgs.msg.dds;

/**
* 
* Topic data type of the struct "RcChannels" defined in "RcChannels_.idl". Use this class to provide the TopicDataType to a Participant. 
*
* This file was automatically generated from RcChannels_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit RcChannels_.idl instead.
*
*/
public class RcChannelsPubSubType implements us.ihmc.pubsub.TopicDataType<px4_msgs.msg.dds.RcChannels>
{
   public static final java.lang.String name = "px4_msgs::msg::dds_::RcChannels_";
   
   @Override
   public final java.lang.String getDefinitionChecksum()
   {
   		return "0159d714134dae3eb2b1bc55c55270ed3e111026ae875cfc3459babb4f9f91b2";
   }
   
   @Override
   public final java.lang.String getDefinitionVersion()
   {
   		return "";
   }

   private final us.ihmc.idl.CDR serializeCDR = new us.ihmc.idl.CDR();
   private final us.ihmc.idl.CDR deserializeCDR = new us.ihmc.idl.CDR();

   @Override
   public void serialize(px4_msgs.msg.dds.RcChannels data, us.ihmc.pubsub.common.SerializedPayload serializedPayload) throws java.io.IOException
   {
      serializeCDR.serialize(serializedPayload);
      write(data, serializeCDR);
      serializeCDR.finishSerialize();
   }

   @Override
   public void deserialize(us.ihmc.pubsub.common.SerializedPayload serializedPayload, px4_msgs.msg.dds.RcChannels data) throws java.io.IOException
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

      current_alignment += ((18) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += ((29) * 1) + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      return current_alignment - initial_alignment;
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.RcChannels data)
   {
      return getCdrSerializedSize(data, 0);
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.RcChannels data, int current_alignment)
   {
      int initial_alignment = current_alignment;

      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += ((18) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);
      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += ((29) * 1) + us.ihmc.idl.CDR.alignment(current_alignment, 1);
      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);



      return current_alignment - initial_alignment;
   }

   public static void write(px4_msgs.msg.dds.RcChannels data, us.ihmc.idl.CDR cdr)
   {
      cdr.write_type_12(data.getTimestamp());

      cdr.write_type_12(data.getTimestampLastValid());

      for(int i0 = 0; i0 < data.getChannels().length; ++i0)
      {
        	cdr.write_type_5(data.getChannels()[i0]);	
      }

      cdr.write_type_9(data.getChannelCount());

      for(int i0 = 0; i0 < data.getFunction().length; ++i0)
      {
        	cdr.write_type_9(data.getFunction()[i0]);	
      }

      cdr.write_type_9(data.getRssi());

      cdr.write_type_7(data.getSignalLost());

      cdr.write_type_4(data.getFrameDropCount());

   }

   public static void read(px4_msgs.msg.dds.RcChannels data, us.ihmc.idl.CDR cdr)
   {
      data.setTimestamp(cdr.read_type_12());
      	
      data.setTimestampLastValid(cdr.read_type_12());
      	
      for(int i0 = 0; i0 < data.getChannels().length; ++i0)
      {
        	data.getChannels()[i0] = cdr.read_type_5();
        	
      }
      	
      data.setChannelCount(cdr.read_type_9());
      	
      for(int i0 = 0; i0 < data.getFunction().length; ++i0)
      {
        	data.getFunction()[i0] = cdr.read_type_9();
        	
      }
      	
      data.setRssi(cdr.read_type_9());
      	
      data.setSignalLost(cdr.read_type_7());
      	
      data.setFrameDropCount(cdr.read_type_4());
      	

   }

   @Override
   public final void serialize(px4_msgs.msg.dds.RcChannels data, us.ihmc.idl.InterchangeSerializer ser)
   {
      ser.write_type_12("timestamp", data.getTimestamp());
      ser.write_type_12("timestamp_last_valid", data.getTimestampLastValid());
      ser.write_type_f("channels", data.getChannels());
      ser.write_type_9("channel_count", data.getChannelCount());
      ser.write_type_f("function", data.getFunction());
      ser.write_type_9("rssi", data.getRssi());
      ser.write_type_7("signal_lost", data.getSignalLost());
      ser.write_type_4("frame_drop_count", data.getFrameDropCount());
   }

   @Override
   public final void deserialize(us.ihmc.idl.InterchangeSerializer ser, px4_msgs.msg.dds.RcChannels data)
   {
      data.setTimestamp(ser.read_type_12("timestamp"));
      data.setTimestampLastValid(ser.read_type_12("timestamp_last_valid"));
      ser.read_type_f("channels", data.getChannels());
      data.setChannelCount(ser.read_type_9("channel_count"));
      ser.read_type_f("function", data.getFunction());
      data.setRssi(ser.read_type_9("rssi"));
      data.setSignalLost(ser.read_type_7("signal_lost"));
      data.setFrameDropCount(ser.read_type_4("frame_drop_count"));
   }

   public static void staticCopy(px4_msgs.msg.dds.RcChannels src, px4_msgs.msg.dds.RcChannels dest)
   {
      dest.set(src);
   }

   @Override
   public px4_msgs.msg.dds.RcChannels createData()
   {
      return new px4_msgs.msg.dds.RcChannels();
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
   
   public void serialize(px4_msgs.msg.dds.RcChannels data, us.ihmc.idl.CDR cdr)
   {
      write(data, cdr);
   }

   public void deserialize(px4_msgs.msg.dds.RcChannels data, us.ihmc.idl.CDR cdr)
   {
      read(data, cdr);
   }
   
   public void copy(px4_msgs.msg.dds.RcChannels src, px4_msgs.msg.dds.RcChannels dest)
   {
      staticCopy(src, dest);
   }

   @Override
   public RcChannelsPubSubType newInstance()
   {
      return new RcChannelsPubSubType();
   }
}
