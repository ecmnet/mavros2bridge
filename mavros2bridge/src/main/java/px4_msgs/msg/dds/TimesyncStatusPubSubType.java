package px4_msgs.msg.dds;

/**
* 
* Topic data type of the struct "TimesyncStatus" defined in "TimesyncStatus_.idl". Use this class to provide the TopicDataType to a Participant. 
*
* This file was automatically generated from TimesyncStatus_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit TimesyncStatus_.idl instead.
*
*/
public class TimesyncStatusPubSubType implements us.ihmc.pubsub.TopicDataType<px4_msgs.msg.dds.TimesyncStatus>
{
   public static final java.lang.String name = "px4_msgs::msg::dds_::TimesyncStatus_";
   
   @Override
   public final java.lang.String getDefinitionChecksum()
   {
   		return "a46071e1d849cd062ac24bdcb67adfd225ec996124b1905ac27ecc0572910d46";
   }
   
   @Override
   public final java.lang.String getDefinitionVersion()
   {
   		return "";
   }

   private final us.ihmc.idl.CDR serializeCDR = new us.ihmc.idl.CDR();
   private final us.ihmc.idl.CDR deserializeCDR = new us.ihmc.idl.CDR();

   @Override
   public void serialize(px4_msgs.msg.dds.TimesyncStatus data, us.ihmc.pubsub.common.SerializedPayload serializedPayload) throws java.io.IOException
   {
      serializeCDR.serialize(serializedPayload);
      write(data, serializeCDR);
      serializeCDR.finishSerialize();
   }

   @Override
   public void deserialize(us.ihmc.pubsub.common.SerializedPayload serializedPayload, px4_msgs.msg.dds.TimesyncStatus data) throws java.io.IOException
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

      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);

      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);

      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      return current_alignment - initial_alignment;
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.TimesyncStatus data)
   {
      return getCdrSerializedSize(data, 0);
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.TimesyncStatus data, int current_alignment)
   {
      int initial_alignment = current_alignment;

      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);



      return current_alignment - initial_alignment;
   }

   public static void write(px4_msgs.msg.dds.TimesyncStatus data, us.ihmc.idl.CDR cdr)
   {
      cdr.write_type_12(data.getTimestamp());

      cdr.write_type_9(data.getSourceProtocol());

      cdr.write_type_12(data.getRemoteTimestamp());

      cdr.write_type_11(data.getObservedOffset());

      cdr.write_type_11(data.getEstimatedOffset());

      cdr.write_type_4(data.getRoundTripTime());

   }

   public static void read(px4_msgs.msg.dds.TimesyncStatus data, us.ihmc.idl.CDR cdr)
   {
      data.setTimestamp(cdr.read_type_12());
      	
      data.setSourceProtocol(cdr.read_type_9());
      	
      data.setRemoteTimestamp(cdr.read_type_12());
      	
      data.setObservedOffset(cdr.read_type_11());
      	
      data.setEstimatedOffset(cdr.read_type_11());
      	
      data.setRoundTripTime(cdr.read_type_4());
      	

   }

   @Override
   public final void serialize(px4_msgs.msg.dds.TimesyncStatus data, us.ihmc.idl.InterchangeSerializer ser)
   {
      ser.write_type_12("timestamp", data.getTimestamp());
      ser.write_type_9("source_protocol", data.getSourceProtocol());
      ser.write_type_12("remote_timestamp", data.getRemoteTimestamp());
      ser.write_type_11("observed_offset", data.getObservedOffset());
      ser.write_type_11("estimated_offset", data.getEstimatedOffset());
      ser.write_type_4("round_trip_time", data.getRoundTripTime());
   }

   @Override
   public final void deserialize(us.ihmc.idl.InterchangeSerializer ser, px4_msgs.msg.dds.TimesyncStatus data)
   {
      data.setTimestamp(ser.read_type_12("timestamp"));
      data.setSourceProtocol(ser.read_type_9("source_protocol"));
      data.setRemoteTimestamp(ser.read_type_12("remote_timestamp"));
      data.setObservedOffset(ser.read_type_11("observed_offset"));
      data.setEstimatedOffset(ser.read_type_11("estimated_offset"));
      data.setRoundTripTime(ser.read_type_4("round_trip_time"));
   }

   public static void staticCopy(px4_msgs.msg.dds.TimesyncStatus src, px4_msgs.msg.dds.TimesyncStatus dest)
   {
      dest.set(src);
   }

   @Override
   public px4_msgs.msg.dds.TimesyncStatus createData()
   {
      return new px4_msgs.msg.dds.TimesyncStatus();
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
   
   public void serialize(px4_msgs.msg.dds.TimesyncStatus data, us.ihmc.idl.CDR cdr)
   {
      write(data, cdr);
   }

   public void deserialize(px4_msgs.msg.dds.TimesyncStatus data, us.ihmc.idl.CDR cdr)
   {
      read(data, cdr);
   }
   
   public void copy(px4_msgs.msg.dds.TimesyncStatus src, px4_msgs.msg.dds.TimesyncStatus dest)
   {
      staticCopy(src, dest);
   }

   @Override
   public TimesyncStatusPubSubType newInstance()
   {
      return new TimesyncStatusPubSubType();
   }
}
