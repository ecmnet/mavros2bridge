package px4_msgs.msg.dds;

/**
* 
* Topic data type of the struct "VehicleOpticalFlowVel" defined in "VehicleOpticalFlowVel_.idl". Use this class to provide the TopicDataType to a Participant. 
*
* This file was automatically generated from VehicleOpticalFlowVel_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit VehicleOpticalFlowVel_.idl instead.
*
*/
public class VehicleOpticalFlowVelPubSubType implements us.ihmc.pubsub.TopicDataType<px4_msgs.msg.dds.VehicleOpticalFlowVel>
{
   public static final java.lang.String name = "px4_msgs::msg::dds_::VehicleOpticalFlowVel_";
   
   @Override
   public final java.lang.String getDefinitionChecksum()
   {
   		return "413d27b9b028cbc3904e178838eead672401ab733d2695e44f75d702c9c405c8";
   }
   
   @Override
   public final java.lang.String getDefinitionVersion()
   {
   		return "";
   }

   private final us.ihmc.idl.CDR serializeCDR = new us.ihmc.idl.CDR();
   private final us.ihmc.idl.CDR deserializeCDR = new us.ihmc.idl.CDR();

   @Override
   public void serialize(px4_msgs.msg.dds.VehicleOpticalFlowVel data, us.ihmc.pubsub.common.SerializedPayload serializedPayload) throws java.io.IOException
   {
      serializeCDR.serialize(serializedPayload);
      write(data, serializeCDR);
      serializeCDR.finishSerialize();
   }

   @Override
   public void deserialize(us.ihmc.pubsub.common.SerializedPayload serializedPayload, px4_msgs.msg.dds.VehicleOpticalFlowVel data) throws java.io.IOException
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

      current_alignment += ((2) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += ((2) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += ((2) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += ((2) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += ((2) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += ((2) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += ((3) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += ((3) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += ((3) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      return current_alignment - initial_alignment;
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.VehicleOpticalFlowVel data)
   {
      return getCdrSerializedSize(data, 0);
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.VehicleOpticalFlowVel data, int current_alignment)
   {
      int initial_alignment = current_alignment;

      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += ((2) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);
      current_alignment += ((2) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);
      current_alignment += ((2) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);
      current_alignment += ((2) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);
      current_alignment += ((2) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);
      current_alignment += ((2) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);
      current_alignment += ((3) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);
      current_alignment += ((3) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);
      current_alignment += ((3) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      return current_alignment - initial_alignment;
   }

   public static void write(px4_msgs.msg.dds.VehicleOpticalFlowVel data, us.ihmc.idl.CDR cdr)
   {
      cdr.write_type_12(data.getTimestamp());

      cdr.write_type_12(data.getTimestampSample());

      for(int i0 = 0; i0 < data.getVelBody().length; ++i0)
      {
        	cdr.write_type_5(data.getVelBody()[i0]);	
      }

      for(int i0 = 0; i0 < data.getVelNe().length; ++i0)
      {
        	cdr.write_type_5(data.getVelNe()[i0]);	
      }

      for(int i0 = 0; i0 < data.getVelBodyFiltered().length; ++i0)
      {
        	cdr.write_type_5(data.getVelBodyFiltered()[i0]);	
      }

      for(int i0 = 0; i0 < data.getVelNeFiltered().length; ++i0)
      {
        	cdr.write_type_5(data.getVelNeFiltered()[i0]);	
      }

      for(int i0 = 0; i0 < data.getFlowRateUncompensated().length; ++i0)
      {
        	cdr.write_type_5(data.getFlowRateUncompensated()[i0]);	
      }

      for(int i0 = 0; i0 < data.getFlowRateCompensated().length; ++i0)
      {
        	cdr.write_type_5(data.getFlowRateCompensated()[i0]);	
      }

      for(int i0 = 0; i0 < data.getGyroRate().length; ++i0)
      {
        	cdr.write_type_5(data.getGyroRate()[i0]);	
      }

      for(int i0 = 0; i0 < data.getGyroBias().length; ++i0)
      {
        	cdr.write_type_5(data.getGyroBias()[i0]);	
      }

      for(int i0 = 0; i0 < data.getRefGyro().length; ++i0)
      {
        	cdr.write_type_5(data.getRefGyro()[i0]);	
      }

   }

   public static void read(px4_msgs.msg.dds.VehicleOpticalFlowVel data, us.ihmc.idl.CDR cdr)
   {
      data.setTimestamp(cdr.read_type_12());
      	
      data.setTimestampSample(cdr.read_type_12());
      	
      for(int i0 = 0; i0 < data.getVelBody().length; ++i0)
      {
        	data.getVelBody()[i0] = cdr.read_type_5();
        	
      }
      	
      for(int i0 = 0; i0 < data.getVelNe().length; ++i0)
      {
        	data.getVelNe()[i0] = cdr.read_type_5();
        	
      }
      	
      for(int i0 = 0; i0 < data.getVelBodyFiltered().length; ++i0)
      {
        	data.getVelBodyFiltered()[i0] = cdr.read_type_5();
        	
      }
      	
      for(int i0 = 0; i0 < data.getVelNeFiltered().length; ++i0)
      {
        	data.getVelNeFiltered()[i0] = cdr.read_type_5();
        	
      }
      	
      for(int i0 = 0; i0 < data.getFlowRateUncompensated().length; ++i0)
      {
        	data.getFlowRateUncompensated()[i0] = cdr.read_type_5();
        	
      }
      	
      for(int i0 = 0; i0 < data.getFlowRateCompensated().length; ++i0)
      {
        	data.getFlowRateCompensated()[i0] = cdr.read_type_5();
        	
      }
      	
      for(int i0 = 0; i0 < data.getGyroRate().length; ++i0)
      {
        	data.getGyroRate()[i0] = cdr.read_type_5();
        	
      }
      	
      for(int i0 = 0; i0 < data.getGyroBias().length; ++i0)
      {
        	data.getGyroBias()[i0] = cdr.read_type_5();
        	
      }
      	
      for(int i0 = 0; i0 < data.getRefGyro().length; ++i0)
      {
        	data.getRefGyro()[i0] = cdr.read_type_5();
        	
      }
      	

   }

   @Override
   public final void serialize(px4_msgs.msg.dds.VehicleOpticalFlowVel data, us.ihmc.idl.InterchangeSerializer ser)
   {
      ser.write_type_12("timestamp", data.getTimestamp());
      ser.write_type_12("timestamp_sample", data.getTimestampSample());
      ser.write_type_f("vel_body", data.getVelBody());
      ser.write_type_f("vel_ne", data.getVelNe());
      ser.write_type_f("vel_body_filtered", data.getVelBodyFiltered());
      ser.write_type_f("vel_ne_filtered", data.getVelNeFiltered());
      ser.write_type_f("flow_rate_uncompensated", data.getFlowRateUncompensated());
      ser.write_type_f("flow_rate_compensated", data.getFlowRateCompensated());
      ser.write_type_f("gyro_rate", data.getGyroRate());
      ser.write_type_f("gyro_bias", data.getGyroBias());
      ser.write_type_f("ref_gyro", data.getRefGyro());
   }

   @Override
   public final void deserialize(us.ihmc.idl.InterchangeSerializer ser, px4_msgs.msg.dds.VehicleOpticalFlowVel data)
   {
      data.setTimestamp(ser.read_type_12("timestamp"));
      data.setTimestampSample(ser.read_type_12("timestamp_sample"));
      ser.read_type_f("vel_body", data.getVelBody());
      ser.read_type_f("vel_ne", data.getVelNe());
      ser.read_type_f("vel_body_filtered", data.getVelBodyFiltered());
      ser.read_type_f("vel_ne_filtered", data.getVelNeFiltered());
      ser.read_type_f("flow_rate_uncompensated", data.getFlowRateUncompensated());
      ser.read_type_f("flow_rate_compensated", data.getFlowRateCompensated());
      ser.read_type_f("gyro_rate", data.getGyroRate());
      ser.read_type_f("gyro_bias", data.getGyroBias());
      ser.read_type_f("ref_gyro", data.getRefGyro());
   }

   public static void staticCopy(px4_msgs.msg.dds.VehicleOpticalFlowVel src, px4_msgs.msg.dds.VehicleOpticalFlowVel dest)
   {
      dest.set(src);
   }

   @Override
   public px4_msgs.msg.dds.VehicleOpticalFlowVel createData()
   {
      return new px4_msgs.msg.dds.VehicleOpticalFlowVel();
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
   
   public void serialize(px4_msgs.msg.dds.VehicleOpticalFlowVel data, us.ihmc.idl.CDR cdr)
   {
      write(data, cdr);
   }

   public void deserialize(px4_msgs.msg.dds.VehicleOpticalFlowVel data, us.ihmc.idl.CDR cdr)
   {
      read(data, cdr);
   }
   
   public void copy(px4_msgs.msg.dds.VehicleOpticalFlowVel src, px4_msgs.msg.dds.VehicleOpticalFlowVel dest)
   {
      staticCopy(src, dest);
   }

   @Override
   public VehicleOpticalFlowVelPubSubType newInstance()
   {
      return new VehicleOpticalFlowVelPubSubType();
   }
}
