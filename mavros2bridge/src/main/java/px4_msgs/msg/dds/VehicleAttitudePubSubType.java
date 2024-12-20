package px4_msgs.msg.dds;

/**
* 
* Topic data type of the struct "VehicleAttitude" defined in "VehicleAttitude_.idl". Use this class to provide the TopicDataType to a Participant. 
*
* This file was automatically generated from VehicleAttitude_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit VehicleAttitude_.idl instead.
*
*/
public class VehicleAttitudePubSubType implements us.ihmc.pubsub.TopicDataType<px4_msgs.msg.dds.VehicleAttitude>
{
   public static final java.lang.String name = "px4_msgs::msg::dds_::VehicleAttitude_";
   
   @Override
   public final java.lang.String getDefinitionChecksum()
   {
   		return "5675af6798558e50f59fb754469c4197011112df19fb02d3ebd7dda2106f11e4";
   }
   
   @Override
   public final java.lang.String getDefinitionVersion()
   {
   		return "";
   }

   private final us.ihmc.idl.CDR serializeCDR = new us.ihmc.idl.CDR();
   private final us.ihmc.idl.CDR deserializeCDR = new us.ihmc.idl.CDR();

   @Override
   public void serialize(px4_msgs.msg.dds.VehicleAttitude data, us.ihmc.pubsub.common.SerializedPayload serializedPayload) throws java.io.IOException
   {
      serializeCDR.serialize(serializedPayload);
      write(data, serializeCDR);
      serializeCDR.finishSerialize();
   }

   @Override
   public void deserialize(us.ihmc.pubsub.common.SerializedPayload serializedPayload, px4_msgs.msg.dds.VehicleAttitude data) throws java.io.IOException
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

      current_alignment += ((4) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += ((4) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      return current_alignment - initial_alignment;
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.VehicleAttitude data)
   {
      return getCdrSerializedSize(data, 0);
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.VehicleAttitude data, int current_alignment)
   {
      int initial_alignment = current_alignment;

      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += ((4) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);
      current_alignment += ((4) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);
      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);



      return current_alignment - initial_alignment;
   }

   public static void write(px4_msgs.msg.dds.VehicleAttitude data, us.ihmc.idl.CDR cdr)
   {
      cdr.write_type_12(data.getTimestamp());

      cdr.write_type_12(data.getTimestampSample());

      for(int i0 = 0; i0 < data.getQ().length; ++i0)
      {
        	cdr.write_type_5(data.getQ()[i0]);	
      }

      for(int i0 = 0; i0 < data.getDeltaQReset().length; ++i0)
      {
        	cdr.write_type_5(data.getDeltaQReset()[i0]);	
      }

      cdr.write_type_9(data.getQuatResetCounter());

   }

   public static void read(px4_msgs.msg.dds.VehicleAttitude data, us.ihmc.idl.CDR cdr)
   {
      data.setTimestamp(cdr.read_type_12());
      	
      data.setTimestampSample(cdr.read_type_12());
      	
      for(int i0 = 0; i0 < data.getQ().length; ++i0)
      {
        	data.getQ()[i0] = cdr.read_type_5();
        	
      }
      	
      for(int i0 = 0; i0 < data.getDeltaQReset().length; ++i0)
      {
        	data.getDeltaQReset()[i0] = cdr.read_type_5();
        	
      }
      	
      data.setQuatResetCounter(cdr.read_type_9());
      	

   }

   @Override
   public final void serialize(px4_msgs.msg.dds.VehicleAttitude data, us.ihmc.idl.InterchangeSerializer ser)
   {
      ser.write_type_12("timestamp", data.getTimestamp());
      ser.write_type_12("timestamp_sample", data.getTimestampSample());
      ser.write_type_f("q", data.getQ());
      ser.write_type_f("delta_q_reset", data.getDeltaQReset());
      ser.write_type_9("quat_reset_counter", data.getQuatResetCounter());
   }

   @Override
   public final void deserialize(us.ihmc.idl.InterchangeSerializer ser, px4_msgs.msg.dds.VehicleAttitude data)
   {
      data.setTimestamp(ser.read_type_12("timestamp"));
      data.setTimestampSample(ser.read_type_12("timestamp_sample"));
      ser.read_type_f("q", data.getQ());
      ser.read_type_f("delta_q_reset", data.getDeltaQReset());
      data.setQuatResetCounter(ser.read_type_9("quat_reset_counter"));
   }

   public static void staticCopy(px4_msgs.msg.dds.VehicleAttitude src, px4_msgs.msg.dds.VehicleAttitude dest)
   {
      dest.set(src);
   }

   @Override
   public px4_msgs.msg.dds.VehicleAttitude createData()
   {
      return new px4_msgs.msg.dds.VehicleAttitude();
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
   
   public void serialize(px4_msgs.msg.dds.VehicleAttitude data, us.ihmc.idl.CDR cdr)
   {
      write(data, cdr);
   }

   public void deserialize(px4_msgs.msg.dds.VehicleAttitude data, us.ihmc.idl.CDR cdr)
   {
      read(data, cdr);
   }
   
   public void copy(px4_msgs.msg.dds.VehicleAttitude src, px4_msgs.msg.dds.VehicleAttitude dest)
   {
      staticCopy(src, dest);
   }

   @Override
   public VehicleAttitudePubSubType newInstance()
   {
      return new VehicleAttitudePubSubType();
   }
}
