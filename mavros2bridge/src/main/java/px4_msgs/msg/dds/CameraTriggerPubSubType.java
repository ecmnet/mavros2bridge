package px4_msgs.msg.dds;

/**
* 
* Topic data type of the struct "CameraTrigger" defined in "CameraTrigger_.idl". Use this class to provide the TopicDataType to a Participant. 
*
* This file was automatically generated from CameraTrigger_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit CameraTrigger_.idl instead.
*
*/
public class CameraTriggerPubSubType implements us.ihmc.pubsub.TopicDataType<px4_msgs.msg.dds.CameraTrigger>
{
   public static final java.lang.String name = "px4_msgs::msg::dds_::CameraTrigger_";
   
   @Override
   public final java.lang.String getDefinitionChecksum()
   {
   		return "e2780ea481a8adaab2048ef25bd51e5cf57553b410dc3033037af29dcecec2ed";
   }
   
   @Override
   public final java.lang.String getDefinitionVersion()
   {
   		return "";
   }

   private final us.ihmc.idl.CDR serializeCDR = new us.ihmc.idl.CDR();
   private final us.ihmc.idl.CDR deserializeCDR = new us.ihmc.idl.CDR();

   @Override
   public void serialize(px4_msgs.msg.dds.CameraTrigger data, us.ihmc.pubsub.common.SerializedPayload serializedPayload) throws java.io.IOException
   {
      serializeCDR.serialize(serializedPayload);
      write(data, serializeCDR);
      serializeCDR.finishSerialize();
   }

   @Override
   public void deserialize(us.ihmc.pubsub.common.SerializedPayload serializedPayload, px4_msgs.msg.dds.CameraTrigger data) throws java.io.IOException
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

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      return current_alignment - initial_alignment;
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.CameraTrigger data)
   {
      return getCdrSerializedSize(data, 0);
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.CameraTrigger data, int current_alignment)
   {
      int initial_alignment = current_alignment;

      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);



      return current_alignment - initial_alignment;
   }

   public static void write(px4_msgs.msg.dds.CameraTrigger data, us.ihmc.idl.CDR cdr)
   {
      cdr.write_type_12(data.getTimestamp());

      cdr.write_type_12(data.getTimestampUtc());

      cdr.write_type_4(data.getSeq());

      cdr.write_type_7(data.getFeedback());

   }

   public static void read(px4_msgs.msg.dds.CameraTrigger data, us.ihmc.idl.CDR cdr)
   {
      data.setTimestamp(cdr.read_type_12());
      	
      data.setTimestampUtc(cdr.read_type_12());
      	
      data.setSeq(cdr.read_type_4());
      	
      data.setFeedback(cdr.read_type_7());
      	

   }

   @Override
   public final void serialize(px4_msgs.msg.dds.CameraTrigger data, us.ihmc.idl.InterchangeSerializer ser)
   {
      ser.write_type_12("timestamp", data.getTimestamp());
      ser.write_type_12("timestamp_utc", data.getTimestampUtc());
      ser.write_type_4("seq", data.getSeq());
      ser.write_type_7("feedback", data.getFeedback());
   }

   @Override
   public final void deserialize(us.ihmc.idl.InterchangeSerializer ser, px4_msgs.msg.dds.CameraTrigger data)
   {
      data.setTimestamp(ser.read_type_12("timestamp"));
      data.setTimestampUtc(ser.read_type_12("timestamp_utc"));
      data.setSeq(ser.read_type_4("seq"));
      data.setFeedback(ser.read_type_7("feedback"));
   }

   public static void staticCopy(px4_msgs.msg.dds.CameraTrigger src, px4_msgs.msg.dds.CameraTrigger dest)
   {
      dest.set(src);
   }

   @Override
   public px4_msgs.msg.dds.CameraTrigger createData()
   {
      return new px4_msgs.msg.dds.CameraTrigger();
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
   
   public void serialize(px4_msgs.msg.dds.CameraTrigger data, us.ihmc.idl.CDR cdr)
   {
      write(data, cdr);
   }

   public void deserialize(px4_msgs.msg.dds.CameraTrigger data, us.ihmc.idl.CDR cdr)
   {
      read(data, cdr);
   }
   
   public void copy(px4_msgs.msg.dds.CameraTrigger src, px4_msgs.msg.dds.CameraTrigger dest)
   {
      staticCopy(src, dest);
   }

   @Override
   public CameraTriggerPubSubType newInstance()
   {
      return new CameraTriggerPubSubType();
   }
}
