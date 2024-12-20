package px4_msgs.msg.dds;

/**
* 
* Topic data type of the struct "FollowTargetEstimator" defined in "FollowTargetEstimator_.idl". Use this class to provide the TopicDataType to a Participant. 
*
* This file was automatically generated from FollowTargetEstimator_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit FollowTargetEstimator_.idl instead.
*
*/
public class FollowTargetEstimatorPubSubType implements us.ihmc.pubsub.TopicDataType<px4_msgs.msg.dds.FollowTargetEstimator>
{
   public static final java.lang.String name = "px4_msgs::msg::dds_::FollowTargetEstimator_";
   
   @Override
   public final java.lang.String getDefinitionChecksum()
   {
   		return "1d45a4fd3725ff2762fec9afb2ff2628c3b639fa30f249eb54e65ab60d16a5f4";
   }
   
   @Override
   public final java.lang.String getDefinitionVersion()
   {
   		return "";
   }

   private final us.ihmc.idl.CDR serializeCDR = new us.ihmc.idl.CDR();
   private final us.ihmc.idl.CDR deserializeCDR = new us.ihmc.idl.CDR();

   @Override
   public void serialize(px4_msgs.msg.dds.FollowTargetEstimator data, us.ihmc.pubsub.common.SerializedPayload serializedPayload) throws java.io.IOException
   {
      serializeCDR.serialize(serializedPayload);
      write(data, serializeCDR);
      serializeCDR.finishSerialize();
   }

   @Override
   public void deserialize(us.ihmc.pubsub.common.SerializedPayload serializedPayload, px4_msgs.msg.dds.FollowTargetEstimator data) throws java.io.IOException
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

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);

      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += ((3) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += ((3) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += ((3) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);

      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      return current_alignment - initial_alignment;
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.FollowTargetEstimator data)
   {
      return getCdrSerializedSize(data, 0);
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.FollowTargetEstimator data, int current_alignment)
   {
      int initial_alignment = current_alignment;

      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += ((3) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);
      current_alignment += ((3) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);
      current_alignment += ((3) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);
      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);



      return current_alignment - initial_alignment;
   }

   public static void write(px4_msgs.msg.dds.FollowTargetEstimator data, us.ihmc.idl.CDR cdr)
   {
      cdr.write_type_12(data.getTimestamp());

      cdr.write_type_12(data.getLastFilterResetTimestamp());

      cdr.write_type_7(data.getValid());

      cdr.write_type_7(data.getStale());

      cdr.write_type_6(data.getLatEst());

      cdr.write_type_6(data.getLonEst());

      cdr.write_type_5(data.getAltEst());

      for(int i0 = 0; i0 < data.getPosEst().length; ++i0)
      {
        	cdr.write_type_5(data.getPosEst()[i0]);	
      }

      for(int i0 = 0; i0 < data.getVelEst().length; ++i0)
      {
        	cdr.write_type_5(data.getVelEst()[i0]);	
      }

      for(int i0 = 0; i0 < data.getAccEst().length; ++i0)
      {
        	cdr.write_type_5(data.getAccEst()[i0]);	
      }

      cdr.write_type_12(data.getPredictionCount());

      cdr.write_type_12(data.getFusionCount());

   }

   public static void read(px4_msgs.msg.dds.FollowTargetEstimator data, us.ihmc.idl.CDR cdr)
   {
      data.setTimestamp(cdr.read_type_12());
      	
      data.setLastFilterResetTimestamp(cdr.read_type_12());
      	
      data.setValid(cdr.read_type_7());
      	
      data.setStale(cdr.read_type_7());
      	
      data.setLatEst(cdr.read_type_6());
      	
      data.setLonEst(cdr.read_type_6());
      	
      data.setAltEst(cdr.read_type_5());
      	
      for(int i0 = 0; i0 < data.getPosEst().length; ++i0)
      {
        	data.getPosEst()[i0] = cdr.read_type_5();
        	
      }
      	
      for(int i0 = 0; i0 < data.getVelEst().length; ++i0)
      {
        	data.getVelEst()[i0] = cdr.read_type_5();
        	
      }
      	
      for(int i0 = 0; i0 < data.getAccEst().length; ++i0)
      {
        	data.getAccEst()[i0] = cdr.read_type_5();
        	
      }
      	
      data.setPredictionCount(cdr.read_type_12());
      	
      data.setFusionCount(cdr.read_type_12());
      	

   }

   @Override
   public final void serialize(px4_msgs.msg.dds.FollowTargetEstimator data, us.ihmc.idl.InterchangeSerializer ser)
   {
      ser.write_type_12("timestamp", data.getTimestamp());
      ser.write_type_12("last_filter_reset_timestamp", data.getLastFilterResetTimestamp());
      ser.write_type_7("valid", data.getValid());
      ser.write_type_7("stale", data.getStale());
      ser.write_type_6("lat_est", data.getLatEst());
      ser.write_type_6("lon_est", data.getLonEst());
      ser.write_type_5("alt_est", data.getAltEst());
      ser.write_type_f("pos_est", data.getPosEst());
      ser.write_type_f("vel_est", data.getVelEst());
      ser.write_type_f("acc_est", data.getAccEst());
      ser.write_type_12("prediction_count", data.getPredictionCount());
      ser.write_type_12("fusion_count", data.getFusionCount());
   }

   @Override
   public final void deserialize(us.ihmc.idl.InterchangeSerializer ser, px4_msgs.msg.dds.FollowTargetEstimator data)
   {
      data.setTimestamp(ser.read_type_12("timestamp"));
      data.setLastFilterResetTimestamp(ser.read_type_12("last_filter_reset_timestamp"));
      data.setValid(ser.read_type_7("valid"));
      data.setStale(ser.read_type_7("stale"));
      data.setLatEst(ser.read_type_6("lat_est"));
      data.setLonEst(ser.read_type_6("lon_est"));
      data.setAltEst(ser.read_type_5("alt_est"));
      ser.read_type_f("pos_est", data.getPosEst());
      ser.read_type_f("vel_est", data.getVelEst());
      ser.read_type_f("acc_est", data.getAccEst());
      data.setPredictionCount(ser.read_type_12("prediction_count"));
      data.setFusionCount(ser.read_type_12("fusion_count"));
   }

   public static void staticCopy(px4_msgs.msg.dds.FollowTargetEstimator src, px4_msgs.msg.dds.FollowTargetEstimator dest)
   {
      dest.set(src);
   }

   @Override
   public px4_msgs.msg.dds.FollowTargetEstimator createData()
   {
      return new px4_msgs.msg.dds.FollowTargetEstimator();
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
   
   public void serialize(px4_msgs.msg.dds.FollowTargetEstimator data, us.ihmc.idl.CDR cdr)
   {
      write(data, cdr);
   }

   public void deserialize(px4_msgs.msg.dds.FollowTargetEstimator data, us.ihmc.idl.CDR cdr)
   {
      read(data, cdr);
   }
   
   public void copy(px4_msgs.msg.dds.FollowTargetEstimator src, px4_msgs.msg.dds.FollowTargetEstimator dest)
   {
      staticCopy(src, dest);
   }

   @Override
   public FollowTargetEstimatorPubSubType newInstance()
   {
      return new FollowTargetEstimatorPubSubType();
   }
}
