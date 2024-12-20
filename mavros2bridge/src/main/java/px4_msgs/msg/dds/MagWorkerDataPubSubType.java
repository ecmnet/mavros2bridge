package px4_msgs.msg.dds;

/**
* 
* Topic data type of the struct "MagWorkerData" defined in "MagWorkerData_.idl". Use this class to provide the TopicDataType to a Participant. 
*
* This file was automatically generated from MagWorkerData_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit MagWorkerData_.idl instead.
*
*/
public class MagWorkerDataPubSubType implements us.ihmc.pubsub.TopicDataType<px4_msgs.msg.dds.MagWorkerData>
{
   public static final java.lang.String name = "px4_msgs::msg::dds_::MagWorkerData_";
   
   @Override
   public final java.lang.String getDefinitionChecksum()
   {
   		return "e5bb369479500b3dc8622617f1392e2ab0fb24b92f53b452ecc1cdadcf7a9a3b";
   }
   
   @Override
   public final java.lang.String getDefinitionVersion()
   {
   		return "";
   }

   private final us.ihmc.idl.CDR serializeCDR = new us.ihmc.idl.CDR();
   private final us.ihmc.idl.CDR deserializeCDR = new us.ihmc.idl.CDR();

   @Override
   public void serialize(px4_msgs.msg.dds.MagWorkerData data, us.ihmc.pubsub.common.SerializedPayload serializedPayload) throws java.io.IOException
   {
      serializeCDR.serialize(serializedPayload);
      write(data, serializeCDR);
      serializeCDR.finishSerialize();
   }

   @Override
   public void deserialize(us.ihmc.pubsub.common.SerializedPayload serializedPayload, px4_msgs.msg.dds.MagWorkerData data) throws java.io.IOException
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

      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);

      current_alignment += ((4) * 1) + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += ((4) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += ((4) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += ((4) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      return current_alignment - initial_alignment;
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.MagWorkerData data)
   {
      return getCdrSerializedSize(data, 0);
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.MagWorkerData data, int current_alignment)
   {
      int initial_alignment = current_alignment;

      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += ((4) * 1) + us.ihmc.idl.CDR.alignment(current_alignment, 1);
      current_alignment += ((4) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);
      current_alignment += ((4) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);
      current_alignment += ((4) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      return current_alignment - initial_alignment;
   }

   public static void write(px4_msgs.msg.dds.MagWorkerData data, us.ihmc.idl.CDR cdr)
   {
      cdr.write_type_12(data.getTimestamp());

      cdr.write_type_12(data.getTimestampSample());

      cdr.write_type_4(data.getDoneCount());

      cdr.write_type_4(data.getCalibrationPointsPerside());

      cdr.write_type_12(data.getCalibrationIntervalPersideUs());

      for(int i0 = 0; i0 < data.getSideDataCollected().length; ++i0)
      {
        	cdr.write_type_7(data.getSideDataCollected()[i0]);	
      }

      for(int i0 = 0; i0 < data.getX().length; ++i0)
      {
        	cdr.write_type_5(data.getX()[i0]);	
      }

      for(int i0 = 0; i0 < data.getY().length; ++i0)
      {
        	cdr.write_type_5(data.getY()[i0]);	
      }

      for(int i0 = 0; i0 < data.getZ().length; ++i0)
      {
        	cdr.write_type_5(data.getZ()[i0]);	
      }

   }

   public static void read(px4_msgs.msg.dds.MagWorkerData data, us.ihmc.idl.CDR cdr)
   {
      data.setTimestamp(cdr.read_type_12());
      	
      data.setTimestampSample(cdr.read_type_12());
      	
      data.setDoneCount(cdr.read_type_4());
      	
      data.setCalibrationPointsPerside(cdr.read_type_4());
      	
      data.setCalibrationIntervalPersideUs(cdr.read_type_12());
      	
      for(int i0 = 0; i0 < data.getSideDataCollected().length; ++i0)
      {
        	data.getSideDataCollected()[i0] = cdr.read_type_7();
        	
      }
      	
      for(int i0 = 0; i0 < data.getX().length; ++i0)
      {
        	data.getX()[i0] = cdr.read_type_5();
        	
      }
      	
      for(int i0 = 0; i0 < data.getY().length; ++i0)
      {
        	data.getY()[i0] = cdr.read_type_5();
        	
      }
      	
      for(int i0 = 0; i0 < data.getZ().length; ++i0)
      {
        	data.getZ()[i0] = cdr.read_type_5();
        	
      }
      	

   }

   @Override
   public final void serialize(px4_msgs.msg.dds.MagWorkerData data, us.ihmc.idl.InterchangeSerializer ser)
   {
      ser.write_type_12("timestamp", data.getTimestamp());
      ser.write_type_12("timestamp_sample", data.getTimestampSample());
      ser.write_type_4("done_count", data.getDoneCount());
      ser.write_type_4("calibration_points_perside", data.getCalibrationPointsPerside());
      ser.write_type_12("calibration_interval_perside_us", data.getCalibrationIntervalPersideUs());
      ser.write_type_f("side_data_collected", data.getSideDataCollected());
      ser.write_type_f("x", data.getX());
      ser.write_type_f("y", data.getY());
      ser.write_type_f("z", data.getZ());
   }

   @Override
   public final void deserialize(us.ihmc.idl.InterchangeSerializer ser, px4_msgs.msg.dds.MagWorkerData data)
   {
      data.setTimestamp(ser.read_type_12("timestamp"));
      data.setTimestampSample(ser.read_type_12("timestamp_sample"));
      data.setDoneCount(ser.read_type_4("done_count"));
      data.setCalibrationPointsPerside(ser.read_type_4("calibration_points_perside"));
      data.setCalibrationIntervalPersideUs(ser.read_type_12("calibration_interval_perside_us"));
      ser.read_type_f("side_data_collected", data.getSideDataCollected());
      ser.read_type_f("x", data.getX());
      ser.read_type_f("y", data.getY());
      ser.read_type_f("z", data.getZ());
   }

   public static void staticCopy(px4_msgs.msg.dds.MagWorkerData src, px4_msgs.msg.dds.MagWorkerData dest)
   {
      dest.set(src);
   }

   @Override
   public px4_msgs.msg.dds.MagWorkerData createData()
   {
      return new px4_msgs.msg.dds.MagWorkerData();
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
   
   public void serialize(px4_msgs.msg.dds.MagWorkerData data, us.ihmc.idl.CDR cdr)
   {
      write(data, cdr);
   }

   public void deserialize(px4_msgs.msg.dds.MagWorkerData data, us.ihmc.idl.CDR cdr)
   {
      read(data, cdr);
   }
   
   public void copy(px4_msgs.msg.dds.MagWorkerData src, px4_msgs.msg.dds.MagWorkerData dest)
   {
      staticCopy(src, dest);
   }

   @Override
   public MagWorkerDataPubSubType newInstance()
   {
      return new MagWorkerDataPubSubType();
   }
}
