package px4_msgs.msg.dds;

/**
* 
* Topic data type of the struct "VehicleRatesSetpoint" defined in "VehicleRatesSetpoint_.idl". Use this class to provide the TopicDataType to a Participant. 
*
* This file was automatically generated from VehicleRatesSetpoint_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit VehicleRatesSetpoint_.idl instead.
*
*/
public class VehicleRatesSetpointPubSubType implements us.ihmc.pubsub.TopicDataType<px4_msgs.msg.dds.VehicleRatesSetpoint>
{
   public static final java.lang.String name = "px4_msgs::msg::dds_::VehicleRatesSetpoint_";
   
   @Override
   public final java.lang.String getDefinitionChecksum()
   {
   		return "36a5a26da8a34521d7d1715b07de87f72f18084f5807e71c1ea4b22cd303c074";
   }
   
   @Override
   public final java.lang.String getDefinitionVersion()
   {
   		return "";
   }

   private final us.ihmc.idl.CDR serializeCDR = new us.ihmc.idl.CDR();
   private final us.ihmc.idl.CDR deserializeCDR = new us.ihmc.idl.CDR();

   @Override
   public void serialize(px4_msgs.msg.dds.VehicleRatesSetpoint data, us.ihmc.pubsub.common.SerializedPayload serializedPayload) throws java.io.IOException
   {
      serializeCDR.serialize(serializedPayload);
      write(data, serializeCDR);
      serializeCDR.finishSerialize();
   }

   @Override
   public void deserialize(us.ihmc.pubsub.common.SerializedPayload serializedPayload, px4_msgs.msg.dds.VehicleRatesSetpoint data) throws java.io.IOException
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

      current_alignment += ((3) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      return current_alignment - initial_alignment;
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.VehicleRatesSetpoint data)
   {
      return getCdrSerializedSize(data, 0);
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.VehicleRatesSetpoint data, int current_alignment)
   {
      int initial_alignment = current_alignment;

      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += ((3) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);
      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);



      return current_alignment - initial_alignment;
   }

   public static void write(px4_msgs.msg.dds.VehicleRatesSetpoint data, us.ihmc.idl.CDR cdr)
   {
      cdr.write_type_12(data.getTimestamp());

      cdr.write_type_5(data.getRoll());

      cdr.write_type_5(data.getPitch());

      cdr.write_type_5(data.getYaw());

      for(int i0 = 0; i0 < data.getThrustBody().length; ++i0)
      {
        	cdr.write_type_5(data.getThrustBody()[i0]);	
      }

      cdr.write_type_7(data.getResetIntegral());

   }

   public static void read(px4_msgs.msg.dds.VehicleRatesSetpoint data, us.ihmc.idl.CDR cdr)
   {
      data.setTimestamp(cdr.read_type_12());
      	
      data.setRoll(cdr.read_type_5());
      	
      data.setPitch(cdr.read_type_5());
      	
      data.setYaw(cdr.read_type_5());
      	
      for(int i0 = 0; i0 < data.getThrustBody().length; ++i0)
      {
        	data.getThrustBody()[i0] = cdr.read_type_5();
        	
      }
      	
      data.setResetIntegral(cdr.read_type_7());
      	

   }

   @Override
   public final void serialize(px4_msgs.msg.dds.VehicleRatesSetpoint data, us.ihmc.idl.InterchangeSerializer ser)
   {
      ser.write_type_12("timestamp", data.getTimestamp());
      ser.write_type_5("roll", data.getRoll());
      ser.write_type_5("pitch", data.getPitch());
      ser.write_type_5("yaw", data.getYaw());
      ser.write_type_f("thrust_body", data.getThrustBody());
      ser.write_type_7("reset_integral", data.getResetIntegral());
   }

   @Override
   public final void deserialize(us.ihmc.idl.InterchangeSerializer ser, px4_msgs.msg.dds.VehicleRatesSetpoint data)
   {
      data.setTimestamp(ser.read_type_12("timestamp"));
      data.setRoll(ser.read_type_5("roll"));
      data.setPitch(ser.read_type_5("pitch"));
      data.setYaw(ser.read_type_5("yaw"));
      ser.read_type_f("thrust_body", data.getThrustBody());
      data.setResetIntegral(ser.read_type_7("reset_integral"));
   }

   public static void staticCopy(px4_msgs.msg.dds.VehicleRatesSetpoint src, px4_msgs.msg.dds.VehicleRatesSetpoint dest)
   {
      dest.set(src);
   }

   @Override
   public px4_msgs.msg.dds.VehicleRatesSetpoint createData()
   {
      return new px4_msgs.msg.dds.VehicleRatesSetpoint();
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
   
   public void serialize(px4_msgs.msg.dds.VehicleRatesSetpoint data, us.ihmc.idl.CDR cdr)
   {
      write(data, cdr);
   }

   public void deserialize(px4_msgs.msg.dds.VehicleRatesSetpoint data, us.ihmc.idl.CDR cdr)
   {
      read(data, cdr);
   }
   
   public void copy(px4_msgs.msg.dds.VehicleRatesSetpoint src, px4_msgs.msg.dds.VehicleRatesSetpoint dest)
   {
      staticCopy(src, dest);
   }

   @Override
   public VehicleRatesSetpointPubSubType newInstance()
   {
      return new VehicleRatesSetpointPubSubType();
   }
}
