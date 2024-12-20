package px4_msgs.msg.dds;

/**
* 
* Topic data type of the struct "VehicleOdometry" defined in "VehicleOdometry_.idl". Use this class to provide the TopicDataType to a Participant. 
*
* This file was automatically generated from VehicleOdometry_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit VehicleOdometry_.idl instead.
*
*/
public class VehicleOdometryPubSubType implements us.ihmc.pubsub.TopicDataType<px4_msgs.msg.dds.VehicleOdometry>
{
   public static final java.lang.String name = "px4_msgs::msg::dds_::VehicleOdometry_";
   
   @Override
   public final java.lang.String getDefinitionChecksum()
   {
   		return "30de0e193ad23b96b88a089b1053ae2536bc0359850482d6098ce4833872d1e2";
   }
   
   @Override
   public final java.lang.String getDefinitionVersion()
   {
   		return "";
   }

   private final us.ihmc.idl.CDR serializeCDR = new us.ihmc.idl.CDR();
   private final us.ihmc.idl.CDR deserializeCDR = new us.ihmc.idl.CDR();

   @Override
   public void serialize(px4_msgs.msg.dds.VehicleOdometry data, us.ihmc.pubsub.common.SerializedPayload serializedPayload) throws java.io.IOException
   {
      serializeCDR.serialize(serializedPayload);
      write(data, serializeCDR);
      serializeCDR.finishSerialize();
   }

   @Override
   public void deserialize(us.ihmc.pubsub.common.SerializedPayload serializedPayload, px4_msgs.msg.dds.VehicleOdometry data) throws java.io.IOException
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

      current_alignment += ((3) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += ((4) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += ((3) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += ((3) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += ((3) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += ((3) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += ((3) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      return current_alignment - initial_alignment;
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.VehicleOdometry data)
   {
      return getCdrSerializedSize(data, 0);
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.VehicleOdometry data, int current_alignment)
   {
      int initial_alignment = current_alignment;

      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += ((3) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);
      current_alignment += ((4) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);
      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += ((3) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);
      current_alignment += ((3) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);
      current_alignment += ((3) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);
      current_alignment += ((3) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);
      current_alignment += ((3) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);
      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);



      return current_alignment - initial_alignment;
   }

   public static void write(px4_msgs.msg.dds.VehicleOdometry data, us.ihmc.idl.CDR cdr)
   {
      cdr.write_type_12(data.getTimestamp());

      cdr.write_type_12(data.getTimestampSample());

      cdr.write_type_9(data.getPoseFrame());

      for(int i0 = 0; i0 < data.getPosition().length; ++i0)
      {
        	cdr.write_type_5(data.getPosition()[i0]);	
      }

      for(int i0 = 0; i0 < data.getQ().length; ++i0)
      {
        	cdr.write_type_5(data.getQ()[i0]);	
      }

      cdr.write_type_9(data.getVelocityFrame());

      for(int i0 = 0; i0 < data.getVelocity().length; ++i0)
      {
        	cdr.write_type_5(data.getVelocity()[i0]);	
      }

      for(int i0 = 0; i0 < data.getAngularVelocity().length; ++i0)
      {
        	cdr.write_type_5(data.getAngularVelocity()[i0]);	
      }

      for(int i0 = 0; i0 < data.getPositionVariance().length; ++i0)
      {
        	cdr.write_type_5(data.getPositionVariance()[i0]);	
      }

      for(int i0 = 0; i0 < data.getOrientationVariance().length; ++i0)
      {
        	cdr.write_type_5(data.getOrientationVariance()[i0]);	
      }

      for(int i0 = 0; i0 < data.getVelocityVariance().length; ++i0)
      {
        	cdr.write_type_5(data.getVelocityVariance()[i0]);	
      }

      cdr.write_type_9(data.getResetCounter());

      cdr.write_type_9(data.getQuality());

   }

   public static void read(px4_msgs.msg.dds.VehicleOdometry data, us.ihmc.idl.CDR cdr)
   {
      data.setTimestamp(cdr.read_type_12());
      	
      data.setTimestampSample(cdr.read_type_12());
      	
      data.setPoseFrame(cdr.read_type_9());
      	
      for(int i0 = 0; i0 < data.getPosition().length; ++i0)
      {
        	data.getPosition()[i0] = cdr.read_type_5();
        	
      }
      	
      for(int i0 = 0; i0 < data.getQ().length; ++i0)
      {
        	data.getQ()[i0] = cdr.read_type_5();
        	
      }
      	
      data.setVelocityFrame(cdr.read_type_9());
      	
      for(int i0 = 0; i0 < data.getVelocity().length; ++i0)
      {
        	data.getVelocity()[i0] = cdr.read_type_5();
        	
      }
      	
      for(int i0 = 0; i0 < data.getAngularVelocity().length; ++i0)
      {
        	data.getAngularVelocity()[i0] = cdr.read_type_5();
        	
      }
      	
      for(int i0 = 0; i0 < data.getPositionVariance().length; ++i0)
      {
        	data.getPositionVariance()[i0] = cdr.read_type_5();
        	
      }
      	
      for(int i0 = 0; i0 < data.getOrientationVariance().length; ++i0)
      {
        	data.getOrientationVariance()[i0] = cdr.read_type_5();
        	
      }
      	
      for(int i0 = 0; i0 < data.getVelocityVariance().length; ++i0)
      {
        	data.getVelocityVariance()[i0] = cdr.read_type_5();
        	
      }
      	
      data.setResetCounter(cdr.read_type_9());
      	
      data.setQuality(cdr.read_type_9());
      	

   }

   @Override
   public final void serialize(px4_msgs.msg.dds.VehicleOdometry data, us.ihmc.idl.InterchangeSerializer ser)
   {
      ser.write_type_12("timestamp", data.getTimestamp());
      ser.write_type_12("timestamp_sample", data.getTimestampSample());
      ser.write_type_9("pose_frame", data.getPoseFrame());
      ser.write_type_f("position", data.getPosition());
      ser.write_type_f("q", data.getQ());
      ser.write_type_9("velocity_frame", data.getVelocityFrame());
      ser.write_type_f("velocity", data.getVelocity());
      ser.write_type_f("angular_velocity", data.getAngularVelocity());
      ser.write_type_f("position_variance", data.getPositionVariance());
      ser.write_type_f("orientation_variance", data.getOrientationVariance());
      ser.write_type_f("velocity_variance", data.getVelocityVariance());
      ser.write_type_9("reset_counter", data.getResetCounter());
      ser.write_type_9("quality", data.getQuality());
   }

   @Override
   public final void deserialize(us.ihmc.idl.InterchangeSerializer ser, px4_msgs.msg.dds.VehicleOdometry data)
   {
      data.setTimestamp(ser.read_type_12("timestamp"));
      data.setTimestampSample(ser.read_type_12("timestamp_sample"));
      data.setPoseFrame(ser.read_type_9("pose_frame"));
      ser.read_type_f("position", data.getPosition());
      ser.read_type_f("q", data.getQ());
      data.setVelocityFrame(ser.read_type_9("velocity_frame"));
      ser.read_type_f("velocity", data.getVelocity());
      ser.read_type_f("angular_velocity", data.getAngularVelocity());
      ser.read_type_f("position_variance", data.getPositionVariance());
      ser.read_type_f("orientation_variance", data.getOrientationVariance());
      ser.read_type_f("velocity_variance", data.getVelocityVariance());
      data.setResetCounter(ser.read_type_9("reset_counter"));
      data.setQuality(ser.read_type_9("quality"));
   }

   public static void staticCopy(px4_msgs.msg.dds.VehicleOdometry src, px4_msgs.msg.dds.VehicleOdometry dest)
   {
      dest.set(src);
   }

   @Override
   public px4_msgs.msg.dds.VehicleOdometry createData()
   {
      return new px4_msgs.msg.dds.VehicleOdometry();
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
   
   public void serialize(px4_msgs.msg.dds.VehicleOdometry data, us.ihmc.idl.CDR cdr)
   {
      write(data, cdr);
   }

   public void deserialize(px4_msgs.msg.dds.VehicleOdometry data, us.ihmc.idl.CDR cdr)
   {
      read(data, cdr);
   }
   
   public void copy(px4_msgs.msg.dds.VehicleOdometry src, px4_msgs.msg.dds.VehicleOdometry dest)
   {
      staticCopy(src, dest);
   }

   @Override
   public VehicleOdometryPubSubType newInstance()
   {
      return new VehicleOdometryPubSubType();
   }
}
