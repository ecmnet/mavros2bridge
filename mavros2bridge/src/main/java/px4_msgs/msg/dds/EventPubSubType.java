package px4_msgs.msg.dds;

/**
* 
* Topic data type of the struct "Event" defined in "Event_.idl". Use this class to provide the TopicDataType to a Participant. 
*
* This file was automatically generated from Event_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit Event_.idl instead.
*
*/
public class EventPubSubType implements us.ihmc.pubsub.TopicDataType<px4_msgs.msg.dds.Event>
{
   public static final java.lang.String name = "px4_msgs::msg::dds_::Event_";
   
   @Override
   public final java.lang.String getDefinitionChecksum()
   {
   		return "b695e010db88f389372fd39b0af5c242ee12b1a9f02586aff3d2c9ef7bd51ceb";
   }
   
   @Override
   public final java.lang.String getDefinitionVersion()
   {
   		return "";
   }

   private final us.ihmc.idl.CDR serializeCDR = new us.ihmc.idl.CDR();
   private final us.ihmc.idl.CDR deserializeCDR = new us.ihmc.idl.CDR();

   @Override
   public void serialize(px4_msgs.msg.dds.Event data, us.ihmc.pubsub.common.SerializedPayload serializedPayload) throws java.io.IOException
   {
      serializeCDR.serialize(serializedPayload);
      write(data, serializeCDR);
      serializeCDR.finishSerialize();
   }

   @Override
   public void deserialize(us.ihmc.pubsub.common.SerializedPayload serializedPayload, px4_msgs.msg.dds.Event data) throws java.io.IOException
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

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 2 + us.ihmc.idl.CDR.alignment(current_alignment, 2);

      current_alignment += ((25) * 1) + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      return current_alignment - initial_alignment;
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.Event data)
   {
      return getCdrSerializedSize(data, 0);
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.Event data, int current_alignment)
   {
      int initial_alignment = current_alignment;

      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 2 + us.ihmc.idl.CDR.alignment(current_alignment, 2);


      current_alignment += ((25) * 1) + us.ihmc.idl.CDR.alignment(current_alignment, 1);
      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);



      return current_alignment - initial_alignment;
   }

   public static void write(px4_msgs.msg.dds.Event data, us.ihmc.idl.CDR cdr)
   {
      cdr.write_type_12(data.getTimestamp());

      cdr.write_type_4(data.getId());

      cdr.write_type_3(data.getEventSequence());

      for(int i0 = 0; i0 < data.getArguments().length; ++i0)
      {
        	cdr.write_type_9(data.getArguments()[i0]);	
      }

      cdr.write_type_9(data.getLogLevels());

   }

   public static void read(px4_msgs.msg.dds.Event data, us.ihmc.idl.CDR cdr)
   {
      data.setTimestamp(cdr.read_type_12());
      	
      data.setId(cdr.read_type_4());
      	
      data.setEventSequence(cdr.read_type_3());
      	
      for(int i0 = 0; i0 < data.getArguments().length; ++i0)
      {
        	data.getArguments()[i0] = cdr.read_type_9();
        	
      }
      	
      data.setLogLevels(cdr.read_type_9());
      	

   }

   @Override
   public final void serialize(px4_msgs.msg.dds.Event data, us.ihmc.idl.InterchangeSerializer ser)
   {
      ser.write_type_12("timestamp", data.getTimestamp());
      ser.write_type_4("id", data.getId());
      ser.write_type_3("event_sequence", data.getEventSequence());
      ser.write_type_f("arguments", data.getArguments());
      ser.write_type_9("log_levels", data.getLogLevels());
   }

   @Override
   public final void deserialize(us.ihmc.idl.InterchangeSerializer ser, px4_msgs.msg.dds.Event data)
   {
      data.setTimestamp(ser.read_type_12("timestamp"));
      data.setId(ser.read_type_4("id"));
      data.setEventSequence(ser.read_type_3("event_sequence"));
      ser.read_type_f("arguments", data.getArguments());
      data.setLogLevels(ser.read_type_9("log_levels"));
   }

   public static void staticCopy(px4_msgs.msg.dds.Event src, px4_msgs.msg.dds.Event dest)
   {
      dest.set(src);
   }

   @Override
   public px4_msgs.msg.dds.Event createData()
   {
      return new px4_msgs.msg.dds.Event();
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
   
   public void serialize(px4_msgs.msg.dds.Event data, us.ihmc.idl.CDR cdr)
   {
      write(data, cdr);
   }

   public void deserialize(px4_msgs.msg.dds.Event data, us.ihmc.idl.CDR cdr)
   {
      read(data, cdr);
   }
   
   public void copy(px4_msgs.msg.dds.Event src, px4_msgs.msg.dds.Event dest)
   {
      staticCopy(src, dest);
   }

   @Override
   public EventPubSubType newInstance()
   {
      return new EventPubSubType();
   }
}
