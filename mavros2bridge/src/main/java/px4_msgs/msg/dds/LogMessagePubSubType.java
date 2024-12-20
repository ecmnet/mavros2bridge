package px4_msgs.msg.dds;

/**
* 
* Topic data type of the struct "LogMessage" defined in "LogMessage_.idl". Use this class to provide the TopicDataType to a Participant. 
*
* This file was automatically generated from LogMessage_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit LogMessage_.idl instead.
*
*/
public class LogMessagePubSubType implements us.ihmc.pubsub.TopicDataType<px4_msgs.msg.dds.LogMessage>
{
   public static final java.lang.String name = "px4_msgs::msg::dds_::LogMessage_";
   
   @Override
   public final java.lang.String getDefinitionChecksum()
   {
   		return "474b0e5a44f4bdc74197914be907f0dabcc2e10bf20dfd882283fd477239591c";
   }
   
   @Override
   public final java.lang.String getDefinitionVersion()
   {
   		return "";
   }

   private final us.ihmc.idl.CDR serializeCDR = new us.ihmc.idl.CDR();
   private final us.ihmc.idl.CDR deserializeCDR = new us.ihmc.idl.CDR();

   @Override
   public void serialize(px4_msgs.msg.dds.LogMessage data, us.ihmc.pubsub.common.SerializedPayload serializedPayload) throws java.io.IOException
   {
      serializeCDR.serialize(serializedPayload);
      write(data, serializeCDR);
      serializeCDR.finishSerialize();
   }

   @Override
   public void deserialize(us.ihmc.pubsub.common.SerializedPayload serializedPayload, px4_msgs.msg.dds.LogMessage data) throws java.io.IOException
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

      current_alignment += ((127) * 1) + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      return current_alignment - initial_alignment;
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.LogMessage data)
   {
      return getCdrSerializedSize(data, 0);
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.LogMessage data, int current_alignment)
   {
      int initial_alignment = current_alignment;

      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += ((127) * 1) + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      return current_alignment - initial_alignment;
   }

   public static void write(px4_msgs.msg.dds.LogMessage data, us.ihmc.idl.CDR cdr)
   {
      cdr.write_type_12(data.getTimestamp());

      cdr.write_type_9(data.getSeverity());

      for(int i0 = 0; i0 < data.getText().length; ++i0)
      {
        	cdr.write_type_8(data.getText()[i0]);	
      }

   }

   public static void read(px4_msgs.msg.dds.LogMessage data, us.ihmc.idl.CDR cdr)
   {
      data.setTimestamp(cdr.read_type_12());
      	
      data.setSeverity(cdr.read_type_9());
      	
      for(int i0 = 0; i0 < data.getText().length; ++i0)
      {
        	data.getText()[i0] = cdr.read_type_8();
        	
      }
      	

   }

   @Override
   public final void serialize(px4_msgs.msg.dds.LogMessage data, us.ihmc.idl.InterchangeSerializer ser)
   {
      ser.write_type_12("timestamp", data.getTimestamp());
      ser.write_type_9("severity", data.getSeverity());
      ser.write_type_f("text", data.getText());
   }

   @Override
   public final void deserialize(us.ihmc.idl.InterchangeSerializer ser, px4_msgs.msg.dds.LogMessage data)
   {
      data.setTimestamp(ser.read_type_12("timestamp"));
      data.setSeverity(ser.read_type_9("severity"));
      ser.read_type_f("text", data.getText());
   }

   public static void staticCopy(px4_msgs.msg.dds.LogMessage src, px4_msgs.msg.dds.LogMessage dest)
   {
      dest.set(src);
   }

   @Override
   public px4_msgs.msg.dds.LogMessage createData()
   {
      return new px4_msgs.msg.dds.LogMessage();
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
   
   public void serialize(px4_msgs.msg.dds.LogMessage data, us.ihmc.idl.CDR cdr)
   {
      write(data, cdr);
   }

   public void deserialize(px4_msgs.msg.dds.LogMessage data, us.ihmc.idl.CDR cdr)
   {
      read(data, cdr);
   }
   
   public void copy(px4_msgs.msg.dds.LogMessage src, px4_msgs.msg.dds.LogMessage dest)
   {
      staticCopy(src, dest);
   }

   @Override
   public LogMessagePubSubType newInstance()
   {
      return new LogMessagePubSubType();
   }
}