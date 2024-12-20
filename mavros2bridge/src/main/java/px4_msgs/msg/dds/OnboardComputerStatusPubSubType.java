package px4_msgs.msg.dds;

/**
* 
* Topic data type of the struct "OnboardComputerStatus" defined in "OnboardComputerStatus_.idl". Use this class to provide the TopicDataType to a Participant. 
*
* This file was automatically generated from OnboardComputerStatus_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit OnboardComputerStatus_.idl instead.
*
*/
public class OnboardComputerStatusPubSubType implements us.ihmc.pubsub.TopicDataType<px4_msgs.msg.dds.OnboardComputerStatus>
{
   public static final java.lang.String name = "px4_msgs::msg::dds_::OnboardComputerStatus_";
   
   @Override
   public final java.lang.String getDefinitionChecksum()
   {
   		return "0a3e74254b6720bd3bc298a7f1cf001d60d78a902d4ba8c99ac86140f61ab370";
   }
   
   @Override
   public final java.lang.String getDefinitionVersion()
   {
   		return "";
   }

   private final us.ihmc.idl.CDR serializeCDR = new us.ihmc.idl.CDR();
   private final us.ihmc.idl.CDR deserializeCDR = new us.ihmc.idl.CDR();

   @Override
   public void serialize(px4_msgs.msg.dds.OnboardComputerStatus data, us.ihmc.pubsub.common.SerializedPayload serializedPayload) throws java.io.IOException
   {
      serializeCDR.serialize(serializedPayload);
      write(data, serializeCDR);
      serializeCDR.finishSerialize();
   }

   @Override
   public void deserialize(us.ihmc.pubsub.common.SerializedPayload serializedPayload, px4_msgs.msg.dds.OnboardComputerStatus data) throws java.io.IOException
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

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += ((8) * 1) + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += ((10) * 1) + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += ((4) * 1) + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += ((10) * 1) + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += ((8) * 1) + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += ((4) * 2) + us.ihmc.idl.CDR.alignment(current_alignment, 2);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      return current_alignment - initial_alignment;
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.OnboardComputerStatus data)
   {
      return getCdrSerializedSize(data, 0);
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.OnboardComputerStatus data, int current_alignment)
   {
      int initial_alignment = current_alignment;

      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += ((8) * 1) + us.ihmc.idl.CDR.alignment(current_alignment, 1);
      current_alignment += ((10) * 1) + us.ihmc.idl.CDR.alignment(current_alignment, 1);
      current_alignment += ((4) * 1) + us.ihmc.idl.CDR.alignment(current_alignment, 1);
      current_alignment += ((10) * 1) + us.ihmc.idl.CDR.alignment(current_alignment, 1);
      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += ((8) * 1) + us.ihmc.idl.CDR.alignment(current_alignment, 1);
      current_alignment += ((4) * 2) + us.ihmc.idl.CDR.alignment(current_alignment, 2);
      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);



      return current_alignment - initial_alignment;
   }

   public static void write(px4_msgs.msg.dds.OnboardComputerStatus data, us.ihmc.idl.CDR cdr)
   {
      cdr.write_type_12(data.getTimestamp());

      cdr.write_type_4(data.getUptime());

      cdr.write_type_9(data.getType());

      for(int i0 = 0; i0 < data.getCpuCores().length; ++i0)
      {
        	cdr.write_type_9(data.getCpuCores()[i0]);	
      }

      for(int i0 = 0; i0 < data.getCpuCombined().length; ++i0)
      {
        	cdr.write_type_9(data.getCpuCombined()[i0]);	
      }

      for(int i0 = 0; i0 < data.getGpuCores().length; ++i0)
      {
        	cdr.write_type_9(data.getGpuCores()[i0]);	
      }

      for(int i0 = 0; i0 < data.getGpuCombined().length; ++i0)
      {
        	cdr.write_type_9(data.getGpuCombined()[i0]);	
      }

      cdr.write_type_9(data.getTemperatureBoard());

      for(int i0 = 0; i0 < data.getTemperatureCore().length; ++i0)
      {
        	cdr.write_type_9(data.getTemperatureCore()[i0]);	
      }

      for(int i0 = 0; i0 < data.getFanSpeed().length; ++i0)
      {
        	cdr.write_type_1(data.getFanSpeed()[i0]);	
      }

      cdr.write_type_4(data.getRamUsage());

      cdr.write_type_4(data.getRamTotal());

   }

   public static void read(px4_msgs.msg.dds.OnboardComputerStatus data, us.ihmc.idl.CDR cdr)
   {
      data.setTimestamp(cdr.read_type_12());
      	
      data.setUptime(cdr.read_type_4());
      	
      data.setType(cdr.read_type_9());
      	
      for(int i0 = 0; i0 < data.getCpuCores().length; ++i0)
      {
        	data.getCpuCores()[i0] = cdr.read_type_9();
        	
      }
      	
      for(int i0 = 0; i0 < data.getCpuCombined().length; ++i0)
      {
        	data.getCpuCombined()[i0] = cdr.read_type_9();
        	
      }
      	
      for(int i0 = 0; i0 < data.getGpuCores().length; ++i0)
      {
        	data.getGpuCores()[i0] = cdr.read_type_9();
        	
      }
      	
      for(int i0 = 0; i0 < data.getGpuCombined().length; ++i0)
      {
        	data.getGpuCombined()[i0] = cdr.read_type_9();
        	
      }
      	
      data.setTemperatureBoard(cdr.read_type_9());
      	
      for(int i0 = 0; i0 < data.getTemperatureCore().length; ++i0)
      {
        	data.getTemperatureCore()[i0] = cdr.read_type_9();
        	
      }
      	
      for(int i0 = 0; i0 < data.getFanSpeed().length; ++i0)
      {
        	data.getFanSpeed()[i0] = cdr.read_type_1();
        	
      }
      	
      data.setRamUsage(cdr.read_type_4());
      	
      data.setRamTotal(cdr.read_type_4());
      	

   }

   @Override
   public final void serialize(px4_msgs.msg.dds.OnboardComputerStatus data, us.ihmc.idl.InterchangeSerializer ser)
   {
      ser.write_type_12("timestamp", data.getTimestamp());
      ser.write_type_4("uptime", data.getUptime());
      ser.write_type_9("type", data.getType());
      ser.write_type_f("cpu_cores", data.getCpuCores());
      ser.write_type_f("cpu_combined", data.getCpuCombined());
      ser.write_type_f("gpu_cores", data.getGpuCores());
      ser.write_type_f("gpu_combined", data.getGpuCombined());
      ser.write_type_9("temperature_board", data.getTemperatureBoard());
      ser.write_type_f("temperature_core", data.getTemperatureCore());
      ser.write_type_f("fan_speed", data.getFanSpeed());
      ser.write_type_4("ram_usage", data.getRamUsage());
      ser.write_type_4("ram_total", data.getRamTotal());
   }

   @Override
   public final void deserialize(us.ihmc.idl.InterchangeSerializer ser, px4_msgs.msg.dds.OnboardComputerStatus data)
   {
      data.setTimestamp(ser.read_type_12("timestamp"));
      data.setUptime(ser.read_type_4("uptime"));
      data.setType(ser.read_type_9("type"));
      ser.read_type_f("cpu_cores", data.getCpuCores());
      ser.read_type_f("cpu_combined", data.getCpuCombined());
      ser.read_type_f("gpu_cores", data.getGpuCores());
      ser.read_type_f("gpu_combined", data.getGpuCombined());
      data.setTemperatureBoard(ser.read_type_9("temperature_board"));
      ser.read_type_f("temperature_core", data.getTemperatureCore());
      ser.read_type_f("fan_speed", data.getFanSpeed());
      data.setRamUsage(ser.read_type_4("ram_usage"));
      data.setRamTotal(ser.read_type_4("ram_total"));
   }

   public static void staticCopy(px4_msgs.msg.dds.OnboardComputerStatus src, px4_msgs.msg.dds.OnboardComputerStatus dest)
   {
      dest.set(src);
   }

   @Override
   public px4_msgs.msg.dds.OnboardComputerStatus createData()
   {
      return new px4_msgs.msg.dds.OnboardComputerStatus();
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
   
   public void serialize(px4_msgs.msg.dds.OnboardComputerStatus data, us.ihmc.idl.CDR cdr)
   {
      write(data, cdr);
   }

   public void deserialize(px4_msgs.msg.dds.OnboardComputerStatus data, us.ihmc.idl.CDR cdr)
   {
      read(data, cdr);
   }
   
   public void copy(px4_msgs.msg.dds.OnboardComputerStatus src, px4_msgs.msg.dds.OnboardComputerStatus dest)
   {
      staticCopy(src, dest);
   }

   @Override
   public OnboardComputerStatusPubSubType newInstance()
   {
      return new OnboardComputerStatusPubSubType();
   }
}
