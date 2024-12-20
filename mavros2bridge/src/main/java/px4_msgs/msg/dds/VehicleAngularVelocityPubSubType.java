package px4_msgs.msg.dds;

/**
* 
* Topic data type of the struct "VehicleAngularVelocity" defined in "VehicleAngularVelocity_.idl". Use this class to provide the TopicDataType to a Participant. 
*
* This file was automatically generated from VehicleAngularVelocity_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit VehicleAngularVelocity_.idl instead.
*
*/
public class VehicleAngularVelocityPubSubType implements us.ihmc.pubsub.TopicDataType<px4_msgs.msg.dds.VehicleAngularVelocity>
{
   public static final java.lang.String name = "px4_msgs::msg::dds_::VehicleAngularVelocity_";
   
   @Override
   public final java.lang.String getDefinitionChecksum()
   {
   		return "8b48eb4ad68b6fe9eb0e749fce1e35da8ddd834c80dcfbcc8ed6db5ee4d0dd8d";
   }
   
   @Override
   public final java.lang.String getDefinitionVersion()
   {
   		return "";
   }

   private final us.ihmc.idl.CDR serializeCDR = new us.ihmc.idl.CDR();
   private final us.ihmc.idl.CDR deserializeCDR = new us.ihmc.idl.CDR();

   @Override
   public void serialize(px4_msgs.msg.dds.VehicleAngularVelocity data, us.ihmc.pubsub.common.SerializedPayload serializedPayload) throws java.io.IOException
   {
      serializeCDR.serialize(serializedPayload);
      write(data, serializeCDR);
      serializeCDR.finishSerialize();
   }

   @Override
   public void deserialize(us.ihmc.pubsub.common.SerializedPayload serializedPayload, px4_msgs.msg.dds.VehicleAngularVelocity data) throws java.io.IOException
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

      current_alignment += ((3) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += ((3) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      return current_alignment - initial_alignment;
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.VehicleAngularVelocity data)
   {
      return getCdrSerializedSize(data, 0);
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.VehicleAngularVelocity data, int current_alignment)
   {
      int initial_alignment = current_alignment;

      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += ((3) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);
      current_alignment += ((3) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      return current_alignment - initial_alignment;
   }

   public static void write(px4_msgs.msg.dds.VehicleAngularVelocity data, us.ihmc.idl.CDR cdr)
   {
      cdr.write_type_12(data.getTimestamp());

      cdr.write_type_12(data.getTimestampSample());

      for(int i0 = 0; i0 < data.getXyz().length; ++i0)
      {
        	cdr.write_type_5(data.getXyz()[i0]);	
      }

      for(int i0 = 0; i0 < data.getXyzDerivative().length; ++i0)
      {
        	cdr.write_type_5(data.getXyzDerivative()[i0]);	
      }

   }

   public static void read(px4_msgs.msg.dds.VehicleAngularVelocity data, us.ihmc.idl.CDR cdr)
   {
      data.setTimestamp(cdr.read_type_12());
      	
      data.setTimestampSample(cdr.read_type_12());
      	
      for(int i0 = 0; i0 < data.getXyz().length; ++i0)
      {
        	data.getXyz()[i0] = cdr.read_type_5();
        	
      }
      	
      for(int i0 = 0; i0 < data.getXyzDerivative().length; ++i0)
      {
        	data.getXyzDerivative()[i0] = cdr.read_type_5();
        	
      }
      	

   }

   @Override
   public final void serialize(px4_msgs.msg.dds.VehicleAngularVelocity data, us.ihmc.idl.InterchangeSerializer ser)
   {
      ser.write_type_12("timestamp", data.getTimestamp());
      ser.write_type_12("timestamp_sample", data.getTimestampSample());
      ser.write_type_f("xyz", data.getXyz());
      ser.write_type_f("xyz_derivative", data.getXyzDerivative());
   }

   @Override
   public final void deserialize(us.ihmc.idl.InterchangeSerializer ser, px4_msgs.msg.dds.VehicleAngularVelocity data)
   {
      data.setTimestamp(ser.read_type_12("timestamp"));
      data.setTimestampSample(ser.read_type_12("timestamp_sample"));
      ser.read_type_f("xyz", data.getXyz());
      ser.read_type_f("xyz_derivative", data.getXyzDerivative());
   }

   public static void staticCopy(px4_msgs.msg.dds.VehicleAngularVelocity src, px4_msgs.msg.dds.VehicleAngularVelocity dest)
   {
      dest.set(src);
   }

   @Override
   public px4_msgs.msg.dds.VehicleAngularVelocity createData()
   {
      return new px4_msgs.msg.dds.VehicleAngularVelocity();
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
   
   public void serialize(px4_msgs.msg.dds.VehicleAngularVelocity data, us.ihmc.idl.CDR cdr)
   {
      write(data, cdr);
   }

   public void deserialize(px4_msgs.msg.dds.VehicleAngularVelocity data, us.ihmc.idl.CDR cdr)
   {
      read(data, cdr);
   }
   
   public void copy(px4_msgs.msg.dds.VehicleAngularVelocity src, px4_msgs.msg.dds.VehicleAngularVelocity dest)
   {
      staticCopy(src, dest);
   }

   @Override
   public VehicleAngularVelocityPubSubType newInstance()
   {
      return new VehicleAngularVelocityPubSubType();
   }
}
