package px4_msgs.msg.dds;

/**
* 
* Topic data type of the struct "Cpuload" defined in "Cpuload_.idl". Use this class to provide the TopicDataType to a Participant. 
*
* This file was automatically generated from Cpuload_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit Cpuload_.idl instead.
*
*/
public class CpuloadPubSubType implements us.ihmc.pubsub.TopicDataType<px4_msgs.msg.dds.Cpuload>
{
   public static final java.lang.String name = "px4_msgs::msg::dds_::Cpuload_";
   
   @Override
   public final java.lang.String getDefinitionChecksum()
   {
   		return "c7172a5d43caf0ba529c9810792bdc7ef84af12aeb7e84c0265eef013d8318f9";
   }
   
   @Override
   public final java.lang.String getDefinitionVersion()
   {
   		return "";
   }

   private final us.ihmc.idl.CDR serializeCDR = new us.ihmc.idl.CDR();
   private final us.ihmc.idl.CDR deserializeCDR = new us.ihmc.idl.CDR();

   @Override
   public void serialize(px4_msgs.msg.dds.Cpuload data, us.ihmc.pubsub.common.SerializedPayload serializedPayload) throws java.io.IOException
   {
      serializeCDR.serialize(serializedPayload);
      write(data, serializeCDR);
      serializeCDR.finishSerialize();
   }

   @Override
   public void deserialize(us.ihmc.pubsub.common.SerializedPayload serializedPayload, px4_msgs.msg.dds.Cpuload data) throws java.io.IOException
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

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      return current_alignment - initial_alignment;
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.Cpuload data)
   {
      return getCdrSerializedSize(data, 0);
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.Cpuload data, int current_alignment)
   {
      int initial_alignment = current_alignment;

      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);



      return current_alignment - initial_alignment;
   }

   public static void write(px4_msgs.msg.dds.Cpuload data, us.ihmc.idl.CDR cdr)
   {
      cdr.write_type_12(data.getTimestamp());

      cdr.write_type_5(data.getLoad());

      cdr.write_type_5(data.getRamUsage());

   }

   public static void read(px4_msgs.msg.dds.Cpuload data, us.ihmc.idl.CDR cdr)
   {
      data.setTimestamp(cdr.read_type_12());
      	
      data.setLoad(cdr.read_type_5());
      	
      data.setRamUsage(cdr.read_type_5());
      	

   }

   @Override
   public final void serialize(px4_msgs.msg.dds.Cpuload data, us.ihmc.idl.InterchangeSerializer ser)
   {
      ser.write_type_12("timestamp", data.getTimestamp());
      ser.write_type_5("load", data.getLoad());
      ser.write_type_5("ram_usage", data.getRamUsage());
   }

   @Override
   public final void deserialize(us.ihmc.idl.InterchangeSerializer ser, px4_msgs.msg.dds.Cpuload data)
   {
      data.setTimestamp(ser.read_type_12("timestamp"));
      data.setLoad(ser.read_type_5("load"));
      data.setRamUsage(ser.read_type_5("ram_usage"));
   }

   public static void staticCopy(px4_msgs.msg.dds.Cpuload src, px4_msgs.msg.dds.Cpuload dest)
   {
      dest.set(src);
   }

   @Override
   public px4_msgs.msg.dds.Cpuload createData()
   {
      return new px4_msgs.msg.dds.Cpuload();
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
   
   public void serialize(px4_msgs.msg.dds.Cpuload data, us.ihmc.idl.CDR cdr)
   {
      write(data, cdr);
   }

   public void deserialize(px4_msgs.msg.dds.Cpuload data, us.ihmc.idl.CDR cdr)
   {
      read(data, cdr);
   }
   
   public void copy(px4_msgs.msg.dds.Cpuload src, px4_msgs.msg.dds.Cpuload dest)
   {
      staticCopy(src, dest);
   }

   @Override
   public CpuloadPubSubType newInstance()
   {
      return new CpuloadPubSubType();
   }
}
