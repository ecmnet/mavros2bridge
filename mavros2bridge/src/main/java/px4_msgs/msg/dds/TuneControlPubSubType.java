package px4_msgs.msg.dds;

/**
* 
* Topic data type of the struct "TuneControl" defined in "TuneControl_.idl". Use this class to provide the TopicDataType to a Participant. 
*
* This file was automatically generated from TuneControl_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit TuneControl_.idl instead.
*
*/
public class TuneControlPubSubType implements us.ihmc.pubsub.TopicDataType<px4_msgs.msg.dds.TuneControl>
{
   public static final java.lang.String name = "px4_msgs::msg::dds_::TuneControl_";
   
   @Override
   public final java.lang.String getDefinitionChecksum()
   {
   		return "c2cbe1f095d8ad040f9ddcc3148808d5fa158191951eba8e3660b6b2c0a54378";
   }
   
   @Override
   public final java.lang.String getDefinitionVersion()
   {
   		return "";
   }

   private final us.ihmc.idl.CDR serializeCDR = new us.ihmc.idl.CDR();
   private final us.ihmc.idl.CDR deserializeCDR = new us.ihmc.idl.CDR();

   @Override
   public void serialize(px4_msgs.msg.dds.TuneControl data, us.ihmc.pubsub.common.SerializedPayload serializedPayload) throws java.io.IOException
   {
      serializeCDR.serialize(serializedPayload);
      write(data, serializeCDR);
      serializeCDR.finishSerialize();
   }

   @Override
   public void deserialize(us.ihmc.pubsub.common.SerializedPayload serializedPayload, px4_msgs.msg.dds.TuneControl data) throws java.io.IOException
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

      current_alignment += 2 + us.ihmc.idl.CDR.alignment(current_alignment, 2);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      return current_alignment - initial_alignment;
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.TuneControl data)
   {
      return getCdrSerializedSize(data, 0);
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.TuneControl data, int current_alignment)
   {
      int initial_alignment = current_alignment;

      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 2 + us.ihmc.idl.CDR.alignment(current_alignment, 2);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);



      return current_alignment - initial_alignment;
   }

   public static void write(px4_msgs.msg.dds.TuneControl data, us.ihmc.idl.CDR cdr)
   {
      cdr.write_type_12(data.getTimestamp());

      cdr.write_type_9(data.getTuneId());

      cdr.write_type_7(data.getTuneOverride());

      cdr.write_type_3(data.getFrequency());

      cdr.write_type_4(data.getDuration());

      cdr.write_type_4(data.getSilence());

      cdr.write_type_9(data.getVolume());

   }

   public static void read(px4_msgs.msg.dds.TuneControl data, us.ihmc.idl.CDR cdr)
   {
      data.setTimestamp(cdr.read_type_12());
      	
      data.setTuneId(cdr.read_type_9());
      	
      data.setTuneOverride(cdr.read_type_7());
      	
      data.setFrequency(cdr.read_type_3());
      	
      data.setDuration(cdr.read_type_4());
      	
      data.setSilence(cdr.read_type_4());
      	
      data.setVolume(cdr.read_type_9());
      	

   }

   @Override
   public final void serialize(px4_msgs.msg.dds.TuneControl data, us.ihmc.idl.InterchangeSerializer ser)
   {
      ser.write_type_12("timestamp", data.getTimestamp());
      ser.write_type_9("tune_id", data.getTuneId());
      ser.write_type_7("tune_override", data.getTuneOverride());
      ser.write_type_3("frequency", data.getFrequency());
      ser.write_type_4("duration", data.getDuration());
      ser.write_type_4("silence", data.getSilence());
      ser.write_type_9("volume", data.getVolume());
   }

   @Override
   public final void deserialize(us.ihmc.idl.InterchangeSerializer ser, px4_msgs.msg.dds.TuneControl data)
   {
      data.setTimestamp(ser.read_type_12("timestamp"));
      data.setTuneId(ser.read_type_9("tune_id"));
      data.setTuneOverride(ser.read_type_7("tune_override"));
      data.setFrequency(ser.read_type_3("frequency"));
      data.setDuration(ser.read_type_4("duration"));
      data.setSilence(ser.read_type_4("silence"));
      data.setVolume(ser.read_type_9("volume"));
   }

   public static void staticCopy(px4_msgs.msg.dds.TuneControl src, px4_msgs.msg.dds.TuneControl dest)
   {
      dest.set(src);
   }

   @Override
   public px4_msgs.msg.dds.TuneControl createData()
   {
      return new px4_msgs.msg.dds.TuneControl();
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
   
   public void serialize(px4_msgs.msg.dds.TuneControl data, us.ihmc.idl.CDR cdr)
   {
      write(data, cdr);
   }

   public void deserialize(px4_msgs.msg.dds.TuneControl data, us.ihmc.idl.CDR cdr)
   {
      read(data, cdr);
   }
   
   public void copy(px4_msgs.msg.dds.TuneControl src, px4_msgs.msg.dds.TuneControl dest)
   {
      staticCopy(src, dest);
   }

   @Override
   public TuneControlPubSubType newInstance()
   {
      return new TuneControlPubSubType();
   }
}
