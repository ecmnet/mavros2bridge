package px4_msgs.msg.dds;

/**
* 
* Topic data type of the struct "AdcReport" defined in "AdcReport_.idl". Use this class to provide the TopicDataType to a Participant. 
*
* This file was automatically generated from AdcReport_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit AdcReport_.idl instead.
*
*/
public class AdcReportPubSubType implements us.ihmc.pubsub.TopicDataType<px4_msgs.msg.dds.AdcReport>
{
   public static final java.lang.String name = "px4_msgs::msg::dds_::AdcReport_";
   
   @Override
   public final java.lang.String getDefinitionChecksum()
   {
   		return "0706ef5963df87a35d9cea4c455d6e47f7a78046382c2b9634eeea86e85e8001";
   }
   
   @Override
   public final java.lang.String getDefinitionVersion()
   {
   		return "";
   }

   private final us.ihmc.idl.CDR serializeCDR = new us.ihmc.idl.CDR();
   private final us.ihmc.idl.CDR deserializeCDR = new us.ihmc.idl.CDR();

   @Override
   public void serialize(px4_msgs.msg.dds.AdcReport data, us.ihmc.pubsub.common.SerializedPayload serializedPayload) throws java.io.IOException
   {
      serializeCDR.serialize(serializedPayload);
      write(data, serializeCDR);
      serializeCDR.finishSerialize();
   }

   @Override
   public void deserialize(us.ihmc.pubsub.common.SerializedPayload serializedPayload, px4_msgs.msg.dds.AdcReport data) throws java.io.IOException
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

      current_alignment += ((12) * 2) + us.ihmc.idl.CDR.alignment(current_alignment, 2);

      current_alignment += ((12) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      return current_alignment - initial_alignment;
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.AdcReport data)
   {
      return getCdrSerializedSize(data, 0);
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.AdcReport data, int current_alignment)
   {
      int initial_alignment = current_alignment;

      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += ((12) * 2) + us.ihmc.idl.CDR.alignment(current_alignment, 2);
      current_alignment += ((12) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);
      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);



      return current_alignment - initial_alignment;
   }

   public static void write(px4_msgs.msg.dds.AdcReport data, us.ihmc.idl.CDR cdr)
   {
      cdr.write_type_12(data.getTimestamp());

      cdr.write_type_4(data.getDeviceId());

      for(int i0 = 0; i0 < data.getChannelId().length; ++i0)
      {
        	cdr.write_type_1(data.getChannelId()[i0]);	
      }

      for(int i0 = 0; i0 < data.getRawData().length; ++i0)
      {
        	cdr.write_type_2(data.getRawData()[i0]);	
      }

      cdr.write_type_4(data.getResolution());

      cdr.write_type_5(data.getVRef());

   }

   public static void read(px4_msgs.msg.dds.AdcReport data, us.ihmc.idl.CDR cdr)
   {
      data.setTimestamp(cdr.read_type_12());
      	
      data.setDeviceId(cdr.read_type_4());
      	
      for(int i0 = 0; i0 < data.getChannelId().length; ++i0)
      {
        	data.getChannelId()[i0] = cdr.read_type_1();
        	
      }
      	
      for(int i0 = 0; i0 < data.getRawData().length; ++i0)
      {
        	data.getRawData()[i0] = cdr.read_type_2();
        	
      }
      	
      data.setResolution(cdr.read_type_4());
      	
      data.setVRef(cdr.read_type_5());
      	

   }

   @Override
   public final void serialize(px4_msgs.msg.dds.AdcReport data, us.ihmc.idl.InterchangeSerializer ser)
   {
      ser.write_type_12("timestamp", data.getTimestamp());
      ser.write_type_4("device_id", data.getDeviceId());
      ser.write_type_f("channel_id", data.getChannelId());
      ser.write_type_f("raw_data", data.getRawData());
      ser.write_type_4("resolution", data.getResolution());
      ser.write_type_5("v_ref", data.getVRef());
   }

   @Override
   public final void deserialize(us.ihmc.idl.InterchangeSerializer ser, px4_msgs.msg.dds.AdcReport data)
   {
      data.setTimestamp(ser.read_type_12("timestamp"));
      data.setDeviceId(ser.read_type_4("device_id"));
      ser.read_type_f("channel_id", data.getChannelId());
      ser.read_type_f("raw_data", data.getRawData());
      data.setResolution(ser.read_type_4("resolution"));
      data.setVRef(ser.read_type_5("v_ref"));
   }

   public static void staticCopy(px4_msgs.msg.dds.AdcReport src, px4_msgs.msg.dds.AdcReport dest)
   {
      dest.set(src);
   }

   @Override
   public px4_msgs.msg.dds.AdcReport createData()
   {
      return new px4_msgs.msg.dds.AdcReport();
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
   
   public void serialize(px4_msgs.msg.dds.AdcReport data, us.ihmc.idl.CDR cdr)
   {
      write(data, cdr);
   }

   public void deserialize(px4_msgs.msg.dds.AdcReport data, us.ihmc.idl.CDR cdr)
   {
      read(data, cdr);
   }
   
   public void copy(px4_msgs.msg.dds.AdcReport src, px4_msgs.msg.dds.AdcReport dest)
   {
      staticCopy(src, dest);
   }

   @Override
   public AdcReportPubSubType newInstance()
   {
      return new AdcReportPubSubType();
   }
}
