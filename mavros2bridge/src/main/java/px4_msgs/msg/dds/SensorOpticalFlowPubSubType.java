package px4_msgs.msg.dds;

/**
* 
* Topic data type of the struct "SensorOpticalFlow" defined in "SensorOpticalFlow_.idl". Use this class to provide the TopicDataType to a Participant. 
*
* This file was automatically generated from SensorOpticalFlow_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit SensorOpticalFlow_.idl instead.
*
*/
public class SensorOpticalFlowPubSubType implements us.ihmc.pubsub.TopicDataType<px4_msgs.msg.dds.SensorOpticalFlow>
{
   public static final java.lang.String name = "px4_msgs::msg::dds_::SensorOpticalFlow_";
   
   @Override
   public final java.lang.String getDefinitionChecksum()
   {
   		return "7efa5506c2e1784d824e9787fd5f1d6f465c55c73f68002861076dd9f2b5bc76";
   }
   
   @Override
   public final java.lang.String getDefinitionVersion()
   {
   		return "";
   }

   private final us.ihmc.idl.CDR serializeCDR = new us.ihmc.idl.CDR();
   private final us.ihmc.idl.CDR deserializeCDR = new us.ihmc.idl.CDR();

   @Override
   public void serialize(px4_msgs.msg.dds.SensorOpticalFlow data, us.ihmc.pubsub.common.SerializedPayload serializedPayload) throws java.io.IOException
   {
      serializeCDR.serialize(serializedPayload);
      write(data, serializeCDR);
      serializeCDR.finishSerialize();
   }

   @Override
   public void deserialize(us.ihmc.pubsub.common.SerializedPayload serializedPayload, px4_msgs.msg.dds.SensorOpticalFlow data) throws java.io.IOException
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

      current_alignment += ((2) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += ((3) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      return current_alignment - initial_alignment;
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.SensorOpticalFlow data)
   {
      return getCdrSerializedSize(data, 0);
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.SensorOpticalFlow data, int current_alignment)
   {
      int initial_alignment = current_alignment;

      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += ((2) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);
      current_alignment += ((3) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);
      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);



      return current_alignment - initial_alignment;
   }

   public static void write(px4_msgs.msg.dds.SensorOpticalFlow data, us.ihmc.idl.CDR cdr)
   {
      cdr.write_type_12(data.getTimestamp());

      cdr.write_type_12(data.getTimestampSample());

      cdr.write_type_4(data.getDeviceId());

      for(int i0 = 0; i0 < data.getPixelFlow().length; ++i0)
      {
        	cdr.write_type_5(data.getPixelFlow()[i0]);	
      }

      for(int i0 = 0; i0 < data.getDeltaAngle().length; ++i0)
      {
        	cdr.write_type_5(data.getDeltaAngle()[i0]);	
      }

      cdr.write_type_7(data.getDeltaAngleAvailable());

      cdr.write_type_5(data.getDistanceM());

      cdr.write_type_7(data.getDistanceAvailable());

      cdr.write_type_4(data.getIntegrationTimespanUs());

      cdr.write_type_9(data.getQuality());

      cdr.write_type_4(data.getErrorCount());

      cdr.write_type_5(data.getMaxFlowRate());

      cdr.write_type_5(data.getMinGroundDistance());

      cdr.write_type_5(data.getMaxGroundDistance());

      cdr.write_type_9(data.getMode());

   }

   public static void read(px4_msgs.msg.dds.SensorOpticalFlow data, us.ihmc.idl.CDR cdr)
   {
      data.setTimestamp(cdr.read_type_12());
      	
      data.setTimestampSample(cdr.read_type_12());
      	
      data.setDeviceId(cdr.read_type_4());
      	
      for(int i0 = 0; i0 < data.getPixelFlow().length; ++i0)
      {
        	data.getPixelFlow()[i0] = cdr.read_type_5();
        	
      }
      	
      for(int i0 = 0; i0 < data.getDeltaAngle().length; ++i0)
      {
        	data.getDeltaAngle()[i0] = cdr.read_type_5();
        	
      }
      	
      data.setDeltaAngleAvailable(cdr.read_type_7());
      	
      data.setDistanceM(cdr.read_type_5());
      	
      data.setDistanceAvailable(cdr.read_type_7());
      	
      data.setIntegrationTimespanUs(cdr.read_type_4());
      	
      data.setQuality(cdr.read_type_9());
      	
      data.setErrorCount(cdr.read_type_4());
      	
      data.setMaxFlowRate(cdr.read_type_5());
      	
      data.setMinGroundDistance(cdr.read_type_5());
      	
      data.setMaxGroundDistance(cdr.read_type_5());
      	
      data.setMode(cdr.read_type_9());
      	

   }

   @Override
   public final void serialize(px4_msgs.msg.dds.SensorOpticalFlow data, us.ihmc.idl.InterchangeSerializer ser)
   {
      ser.write_type_12("timestamp", data.getTimestamp());
      ser.write_type_12("timestamp_sample", data.getTimestampSample());
      ser.write_type_4("device_id", data.getDeviceId());
      ser.write_type_f("pixel_flow", data.getPixelFlow());
      ser.write_type_f("delta_angle", data.getDeltaAngle());
      ser.write_type_7("delta_angle_available", data.getDeltaAngleAvailable());
      ser.write_type_5("distance_m", data.getDistanceM());
      ser.write_type_7("distance_available", data.getDistanceAvailable());
      ser.write_type_4("integration_timespan_us", data.getIntegrationTimespanUs());
      ser.write_type_9("quality", data.getQuality());
      ser.write_type_4("error_count", data.getErrorCount());
      ser.write_type_5("max_flow_rate", data.getMaxFlowRate());
      ser.write_type_5("min_ground_distance", data.getMinGroundDistance());
      ser.write_type_5("max_ground_distance", data.getMaxGroundDistance());
      ser.write_type_9("mode", data.getMode());
   }

   @Override
   public final void deserialize(us.ihmc.idl.InterchangeSerializer ser, px4_msgs.msg.dds.SensorOpticalFlow data)
   {
      data.setTimestamp(ser.read_type_12("timestamp"));
      data.setTimestampSample(ser.read_type_12("timestamp_sample"));
      data.setDeviceId(ser.read_type_4("device_id"));
      ser.read_type_f("pixel_flow", data.getPixelFlow());
      ser.read_type_f("delta_angle", data.getDeltaAngle());
      data.setDeltaAngleAvailable(ser.read_type_7("delta_angle_available"));
      data.setDistanceM(ser.read_type_5("distance_m"));
      data.setDistanceAvailable(ser.read_type_7("distance_available"));
      data.setIntegrationTimespanUs(ser.read_type_4("integration_timespan_us"));
      data.setQuality(ser.read_type_9("quality"));
      data.setErrorCount(ser.read_type_4("error_count"));
      data.setMaxFlowRate(ser.read_type_5("max_flow_rate"));
      data.setMinGroundDistance(ser.read_type_5("min_ground_distance"));
      data.setMaxGroundDistance(ser.read_type_5("max_ground_distance"));
      data.setMode(ser.read_type_9("mode"));
   }

   public static void staticCopy(px4_msgs.msg.dds.SensorOpticalFlow src, px4_msgs.msg.dds.SensorOpticalFlow dest)
   {
      dest.set(src);
   }

   @Override
   public px4_msgs.msg.dds.SensorOpticalFlow createData()
   {
      return new px4_msgs.msg.dds.SensorOpticalFlow();
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
   
   public void serialize(px4_msgs.msg.dds.SensorOpticalFlow data, us.ihmc.idl.CDR cdr)
   {
      write(data, cdr);
   }

   public void deserialize(px4_msgs.msg.dds.SensorOpticalFlow data, us.ihmc.idl.CDR cdr)
   {
      read(data, cdr);
   }
   
   public void copy(px4_msgs.msg.dds.SensorOpticalFlow src, px4_msgs.msg.dds.SensorOpticalFlow dest)
   {
      staticCopy(src, dest);
   }

   @Override
   public SensorOpticalFlowPubSubType newInstance()
   {
      return new SensorOpticalFlowPubSubType();
   }
}