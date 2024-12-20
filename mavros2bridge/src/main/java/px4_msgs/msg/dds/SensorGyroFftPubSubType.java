package px4_msgs.msg.dds;

/**
* 
* Topic data type of the struct "SensorGyroFft" defined in "SensorGyroFft_.idl". Use this class to provide the TopicDataType to a Participant. 
*
* This file was automatically generated from SensorGyroFft_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit SensorGyroFft_.idl instead.
*
*/
public class SensorGyroFftPubSubType implements us.ihmc.pubsub.TopicDataType<px4_msgs.msg.dds.SensorGyroFft>
{
   public static final java.lang.String name = "px4_msgs::msg::dds_::SensorGyroFft_";
   
   @Override
   public final java.lang.String getDefinitionChecksum()
   {
   		return "7b97eae20ecb8e7f9b19d0ba49855c47805a023c16e43a95af442e7c63af9e41";
   }
   
   @Override
   public final java.lang.String getDefinitionVersion()
   {
   		return "";
   }

   private final us.ihmc.idl.CDR serializeCDR = new us.ihmc.idl.CDR();
   private final us.ihmc.idl.CDR deserializeCDR = new us.ihmc.idl.CDR();

   @Override
   public void serialize(px4_msgs.msg.dds.SensorGyroFft data, us.ihmc.pubsub.common.SerializedPayload serializedPayload) throws java.io.IOException
   {
      serializeCDR.serialize(serializedPayload);
      write(data, serializeCDR);
      serializeCDR.finishSerialize();
   }

   @Override
   public void deserialize(us.ihmc.pubsub.common.SerializedPayload serializedPayload, px4_msgs.msg.dds.SensorGyroFft data) throws java.io.IOException
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

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += ((3) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += ((3) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += ((3) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += ((3) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += ((3) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += ((3) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      return current_alignment - initial_alignment;
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.SensorGyroFft data)
   {
      return getCdrSerializedSize(data, 0);
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.SensorGyroFft data, int current_alignment)
   {
      int initial_alignment = current_alignment;

      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += ((3) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);
      current_alignment += ((3) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);
      current_alignment += ((3) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);
      current_alignment += ((3) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);
      current_alignment += ((3) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);
      current_alignment += ((3) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      return current_alignment - initial_alignment;
   }

   public static void write(px4_msgs.msg.dds.SensorGyroFft data, us.ihmc.idl.CDR cdr)
   {
      cdr.write_type_12(data.getTimestamp());

      cdr.write_type_12(data.getTimestampSample());

      cdr.write_type_4(data.getDeviceId());

      cdr.write_type_5(data.getSensorSampleRateHz());

      cdr.write_type_5(data.getResolutionHz());

      for(int i0 = 0; i0 < data.getPeakFrequenciesX().length; ++i0)
      {
        	cdr.write_type_5(data.getPeakFrequenciesX()[i0]);	
      }

      for(int i0 = 0; i0 < data.getPeakFrequenciesY().length; ++i0)
      {
        	cdr.write_type_5(data.getPeakFrequenciesY()[i0]);	
      }

      for(int i0 = 0; i0 < data.getPeakFrequenciesZ().length; ++i0)
      {
        	cdr.write_type_5(data.getPeakFrequenciesZ()[i0]);	
      }

      for(int i0 = 0; i0 < data.getPeakSnrX().length; ++i0)
      {
        	cdr.write_type_5(data.getPeakSnrX()[i0]);	
      }

      for(int i0 = 0; i0 < data.getPeakSnrY().length; ++i0)
      {
        	cdr.write_type_5(data.getPeakSnrY()[i0]);	
      }

      for(int i0 = 0; i0 < data.getPeakSnrZ().length; ++i0)
      {
        	cdr.write_type_5(data.getPeakSnrZ()[i0]);	
      }

   }

   public static void read(px4_msgs.msg.dds.SensorGyroFft data, us.ihmc.idl.CDR cdr)
   {
      data.setTimestamp(cdr.read_type_12());
      	
      data.setTimestampSample(cdr.read_type_12());
      	
      data.setDeviceId(cdr.read_type_4());
      	
      data.setSensorSampleRateHz(cdr.read_type_5());
      	
      data.setResolutionHz(cdr.read_type_5());
      	
      for(int i0 = 0; i0 < data.getPeakFrequenciesX().length; ++i0)
      {
        	data.getPeakFrequenciesX()[i0] = cdr.read_type_5();
        	
      }
      	
      for(int i0 = 0; i0 < data.getPeakFrequenciesY().length; ++i0)
      {
        	data.getPeakFrequenciesY()[i0] = cdr.read_type_5();
        	
      }
      	
      for(int i0 = 0; i0 < data.getPeakFrequenciesZ().length; ++i0)
      {
        	data.getPeakFrequenciesZ()[i0] = cdr.read_type_5();
        	
      }
      	
      for(int i0 = 0; i0 < data.getPeakSnrX().length; ++i0)
      {
        	data.getPeakSnrX()[i0] = cdr.read_type_5();
        	
      }
      	
      for(int i0 = 0; i0 < data.getPeakSnrY().length; ++i0)
      {
        	data.getPeakSnrY()[i0] = cdr.read_type_5();
        	
      }
      	
      for(int i0 = 0; i0 < data.getPeakSnrZ().length; ++i0)
      {
        	data.getPeakSnrZ()[i0] = cdr.read_type_5();
        	
      }
      	

   }

   @Override
   public final void serialize(px4_msgs.msg.dds.SensorGyroFft data, us.ihmc.idl.InterchangeSerializer ser)
   {
      ser.write_type_12("timestamp", data.getTimestamp());
      ser.write_type_12("timestamp_sample", data.getTimestampSample());
      ser.write_type_4("device_id", data.getDeviceId());
      ser.write_type_5("sensor_sample_rate_hz", data.getSensorSampleRateHz());
      ser.write_type_5("resolution_hz", data.getResolutionHz());
      ser.write_type_f("peak_frequencies_x", data.getPeakFrequenciesX());
      ser.write_type_f("peak_frequencies_y", data.getPeakFrequenciesY());
      ser.write_type_f("peak_frequencies_z", data.getPeakFrequenciesZ());
      ser.write_type_f("peak_snr_x", data.getPeakSnrX());
      ser.write_type_f("peak_snr_y", data.getPeakSnrY());
      ser.write_type_f("peak_snr_z", data.getPeakSnrZ());
   }

   @Override
   public final void deserialize(us.ihmc.idl.InterchangeSerializer ser, px4_msgs.msg.dds.SensorGyroFft data)
   {
      data.setTimestamp(ser.read_type_12("timestamp"));
      data.setTimestampSample(ser.read_type_12("timestamp_sample"));
      data.setDeviceId(ser.read_type_4("device_id"));
      data.setSensorSampleRateHz(ser.read_type_5("sensor_sample_rate_hz"));
      data.setResolutionHz(ser.read_type_5("resolution_hz"));
      ser.read_type_f("peak_frequencies_x", data.getPeakFrequenciesX());
      ser.read_type_f("peak_frequencies_y", data.getPeakFrequenciesY());
      ser.read_type_f("peak_frequencies_z", data.getPeakFrequenciesZ());
      ser.read_type_f("peak_snr_x", data.getPeakSnrX());
      ser.read_type_f("peak_snr_y", data.getPeakSnrY());
      ser.read_type_f("peak_snr_z", data.getPeakSnrZ());
   }

   public static void staticCopy(px4_msgs.msg.dds.SensorGyroFft src, px4_msgs.msg.dds.SensorGyroFft dest)
   {
      dest.set(src);
   }

   @Override
   public px4_msgs.msg.dds.SensorGyroFft createData()
   {
      return new px4_msgs.msg.dds.SensorGyroFft();
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
   
   public void serialize(px4_msgs.msg.dds.SensorGyroFft data, us.ihmc.idl.CDR cdr)
   {
      write(data, cdr);
   }

   public void deserialize(px4_msgs.msg.dds.SensorGyroFft data, us.ihmc.idl.CDR cdr)
   {
      read(data, cdr);
   }
   
   public void copy(px4_msgs.msg.dds.SensorGyroFft src, px4_msgs.msg.dds.SensorGyroFft dest)
   {
      staticCopy(src, dest);
   }

   @Override
   public SensorGyroFftPubSubType newInstance()
   {
      return new SensorGyroFftPubSubType();
   }
}
