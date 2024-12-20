package px4_msgs.msg.dds;

/**
* 
* Topic data type of the struct "DistanceSensor" defined in "DistanceSensor_.idl". Use this class to provide the TopicDataType to a Participant. 
*
* This file was automatically generated from DistanceSensor_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit DistanceSensor_.idl instead.
*
*/
public class DistanceSensorPubSubType implements us.ihmc.pubsub.TopicDataType<px4_msgs.msg.dds.DistanceSensor>
{
   public static final java.lang.String name = "px4_msgs::msg::dds_::DistanceSensor_";
   
   @Override
   public final java.lang.String getDefinitionChecksum()
   {
   		return "9c2f2e3ea0efd196f0a95f856c357f6bc41c75c2773b26323390f76fd79544e0";
   }
   
   @Override
   public final java.lang.String getDefinitionVersion()
   {
   		return "";
   }

   private final us.ihmc.idl.CDR serializeCDR = new us.ihmc.idl.CDR();
   private final us.ihmc.idl.CDR deserializeCDR = new us.ihmc.idl.CDR();

   @Override
   public void serialize(px4_msgs.msg.dds.DistanceSensor data, us.ihmc.pubsub.common.SerializedPayload serializedPayload) throws java.io.IOException
   {
      serializeCDR.serialize(serializedPayload);
      write(data, serializeCDR);
      serializeCDR.finishSerialize();
   }

   @Override
   public void deserialize(us.ihmc.pubsub.common.SerializedPayload serializedPayload, px4_msgs.msg.dds.DistanceSensor data) throws java.io.IOException
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

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += ((4) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      return current_alignment - initial_alignment;
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.DistanceSensor data)
   {
      return getCdrSerializedSize(data, 0);
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.DistanceSensor data, int current_alignment)
   {
      int initial_alignment = current_alignment;

      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += ((4) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);
      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);



      return current_alignment - initial_alignment;
   }

   public static void write(px4_msgs.msg.dds.DistanceSensor data, us.ihmc.idl.CDR cdr)
   {
      cdr.write_type_12(data.getTimestamp());

      cdr.write_type_4(data.getDeviceId());

      cdr.write_type_5(data.getMinDistance());

      cdr.write_type_5(data.getMaxDistance());

      cdr.write_type_5(data.getCurrentDistance());

      cdr.write_type_5(data.getVariance());

      cdr.write_type_9(data.getSignalQuality());

      cdr.write_type_9(data.getType());

      cdr.write_type_5(data.getHFov());

      cdr.write_type_5(data.getVFov());

      for(int i0 = 0; i0 < data.getQ().length; ++i0)
      {
        	cdr.write_type_5(data.getQ()[i0]);	
      }

      cdr.write_type_9(data.getOrientation());

      cdr.write_type_9(data.getMode());

   }

   public static void read(px4_msgs.msg.dds.DistanceSensor data, us.ihmc.idl.CDR cdr)
   {
      data.setTimestamp(cdr.read_type_12());
      	
      data.setDeviceId(cdr.read_type_4());
      	
      data.setMinDistance(cdr.read_type_5());
      	
      data.setMaxDistance(cdr.read_type_5());
      	
      data.setCurrentDistance(cdr.read_type_5());
      	
      data.setVariance(cdr.read_type_5());
      	
      data.setSignalQuality(cdr.read_type_9());
      	
      data.setType(cdr.read_type_9());
      	
      data.setHFov(cdr.read_type_5());
      	
      data.setVFov(cdr.read_type_5());
      	
      for(int i0 = 0; i0 < data.getQ().length; ++i0)
      {
        	data.getQ()[i0] = cdr.read_type_5();
        	
      }
      	
      data.setOrientation(cdr.read_type_9());
      	
      data.setMode(cdr.read_type_9());
      	

   }

   @Override
   public final void serialize(px4_msgs.msg.dds.DistanceSensor data, us.ihmc.idl.InterchangeSerializer ser)
   {
      ser.write_type_12("timestamp", data.getTimestamp());
      ser.write_type_4("device_id", data.getDeviceId());
      ser.write_type_5("min_distance", data.getMinDistance());
      ser.write_type_5("max_distance", data.getMaxDistance());
      ser.write_type_5("current_distance", data.getCurrentDistance());
      ser.write_type_5("variance", data.getVariance());
      ser.write_type_9("signal_quality", data.getSignalQuality());
      ser.write_type_9("type", data.getType());
      ser.write_type_5("h_fov", data.getHFov());
      ser.write_type_5("v_fov", data.getVFov());
      ser.write_type_f("q", data.getQ());
      ser.write_type_9("orientation", data.getOrientation());
      ser.write_type_9("mode", data.getMode());
   }

   @Override
   public final void deserialize(us.ihmc.idl.InterchangeSerializer ser, px4_msgs.msg.dds.DistanceSensor data)
   {
      data.setTimestamp(ser.read_type_12("timestamp"));
      data.setDeviceId(ser.read_type_4("device_id"));
      data.setMinDistance(ser.read_type_5("min_distance"));
      data.setMaxDistance(ser.read_type_5("max_distance"));
      data.setCurrentDistance(ser.read_type_5("current_distance"));
      data.setVariance(ser.read_type_5("variance"));
      data.setSignalQuality(ser.read_type_9("signal_quality"));
      data.setType(ser.read_type_9("type"));
      data.setHFov(ser.read_type_5("h_fov"));
      data.setVFov(ser.read_type_5("v_fov"));
      ser.read_type_f("q", data.getQ());
      data.setOrientation(ser.read_type_9("orientation"));
      data.setMode(ser.read_type_9("mode"));
   }

   public static void staticCopy(px4_msgs.msg.dds.DistanceSensor src, px4_msgs.msg.dds.DistanceSensor dest)
   {
      dest.set(src);
   }

   @Override
   public px4_msgs.msg.dds.DistanceSensor createData()
   {
      return new px4_msgs.msg.dds.DistanceSensor();
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
   
   public void serialize(px4_msgs.msg.dds.DistanceSensor data, us.ihmc.idl.CDR cdr)
   {
      write(data, cdr);
   }

   public void deserialize(px4_msgs.msg.dds.DistanceSensor data, us.ihmc.idl.CDR cdr)
   {
      read(data, cdr);
   }
   
   public void copy(px4_msgs.msg.dds.DistanceSensor src, px4_msgs.msg.dds.DistanceSensor dest)
   {
      staticCopy(src, dest);
   }

   @Override
   public DistanceSensorPubSubType newInstance()
   {
      return new DistanceSensorPubSubType();
   }
}
