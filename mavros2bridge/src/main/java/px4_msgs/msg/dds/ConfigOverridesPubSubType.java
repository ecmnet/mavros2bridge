package px4_msgs.msg.dds;

/**
* 
* Topic data type of the struct "ConfigOverrides" defined in "ConfigOverrides_.idl". Use this class to provide the TopicDataType to a Participant. 
*
* This file was automatically generated from ConfigOverrides_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit ConfigOverrides_.idl instead.
*
*/
public class ConfigOverridesPubSubType implements us.ihmc.pubsub.TopicDataType<px4_msgs.msg.dds.ConfigOverrides>
{
   public static final java.lang.String name = "px4_msgs::msg::dds_::ConfigOverrides_";
   
   @Override
   public final java.lang.String getDefinitionChecksum()
   {
   		return "c00af3ca512a44e465c0277612ac8fc949cf9812199da470a53ee35d12b6d58e";
   }
   
   @Override
   public final java.lang.String getDefinitionVersion()
   {
   		return "";
   }

   private final us.ihmc.idl.CDR serializeCDR = new us.ihmc.idl.CDR();
   private final us.ihmc.idl.CDR deserializeCDR = new us.ihmc.idl.CDR();

   @Override
   public void serialize(px4_msgs.msg.dds.ConfigOverrides data, us.ihmc.pubsub.common.SerializedPayload serializedPayload) throws java.io.IOException
   {
      serializeCDR.serialize(serializedPayload);
      write(data, serializeCDR);
      serializeCDR.finishSerialize();
   }

   @Override
   public void deserialize(us.ihmc.pubsub.common.SerializedPayload serializedPayload, px4_msgs.msg.dds.ConfigOverrides data) throws java.io.IOException
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

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      return current_alignment - initial_alignment;
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.ConfigOverrides data)
   {
      return getCdrSerializedSize(data, 0);
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.ConfigOverrides data, int current_alignment)
   {
      int initial_alignment = current_alignment;

      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 2 + us.ihmc.idl.CDR.alignment(current_alignment, 2);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);



      return current_alignment - initial_alignment;
   }

   public static void write(px4_msgs.msg.dds.ConfigOverrides data, us.ihmc.idl.CDR cdr)
   {
      cdr.write_type_12(data.getTimestamp());

      cdr.write_type_7(data.getDisableAutoDisarm());

      cdr.write_type_7(data.getDeferFailsafes());

      cdr.write_type_1(data.getDeferFailsafesTimeoutS());

      cdr.write_type_9(data.getSourceType());

      cdr.write_type_9(data.getSourceId());

   }

   public static void read(px4_msgs.msg.dds.ConfigOverrides data, us.ihmc.idl.CDR cdr)
   {
      data.setTimestamp(cdr.read_type_12());
      	
      data.setDisableAutoDisarm(cdr.read_type_7());
      	
      data.setDeferFailsafes(cdr.read_type_7());
      	
      data.setDeferFailsafesTimeoutS(cdr.read_type_1());
      	
      data.setSourceType(cdr.read_type_9());
      	
      data.setSourceId(cdr.read_type_9());
      	

   }

   @Override
   public final void serialize(px4_msgs.msg.dds.ConfigOverrides data, us.ihmc.idl.InterchangeSerializer ser)
   {
      ser.write_type_12("timestamp", data.getTimestamp());
      ser.write_type_7("disable_auto_disarm", data.getDisableAutoDisarm());
      ser.write_type_7("defer_failsafes", data.getDeferFailsafes());
      ser.write_type_1("defer_failsafes_timeout_s", data.getDeferFailsafesTimeoutS());
      ser.write_type_9("source_type", data.getSourceType());
      ser.write_type_9("source_id", data.getSourceId());
   }

   @Override
   public final void deserialize(us.ihmc.idl.InterchangeSerializer ser, px4_msgs.msg.dds.ConfigOverrides data)
   {
      data.setTimestamp(ser.read_type_12("timestamp"));
      data.setDisableAutoDisarm(ser.read_type_7("disable_auto_disarm"));
      data.setDeferFailsafes(ser.read_type_7("defer_failsafes"));
      data.setDeferFailsafesTimeoutS(ser.read_type_1("defer_failsafes_timeout_s"));
      data.setSourceType(ser.read_type_9("source_type"));
      data.setSourceId(ser.read_type_9("source_id"));
   }

   public static void staticCopy(px4_msgs.msg.dds.ConfigOverrides src, px4_msgs.msg.dds.ConfigOverrides dest)
   {
      dest.set(src);
   }

   @Override
   public px4_msgs.msg.dds.ConfigOverrides createData()
   {
      return new px4_msgs.msg.dds.ConfigOverrides();
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
   
   public void serialize(px4_msgs.msg.dds.ConfigOverrides data, us.ihmc.idl.CDR cdr)
   {
      write(data, cdr);
   }

   public void deserialize(px4_msgs.msg.dds.ConfigOverrides data, us.ihmc.idl.CDR cdr)
   {
      read(data, cdr);
   }
   
   public void copy(px4_msgs.msg.dds.ConfigOverrides src, px4_msgs.msg.dds.ConfigOverrides dest)
   {
      staticCopy(src, dest);
   }

   @Override
   public ConfigOverridesPubSubType newInstance()
   {
      return new ConfigOverridesPubSubType();
   }
}
