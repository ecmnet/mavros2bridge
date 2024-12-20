package px4_msgs.msg.dds;

/**
* 
* Topic data type of the struct "VehicleAcceleration" defined in "VehicleAcceleration_.idl". Use this class to provide the TopicDataType to a Participant. 
*
* This file was automatically generated from VehicleAcceleration_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit VehicleAcceleration_.idl instead.
*
*/
public class VehicleAccelerationPubSubType implements us.ihmc.pubsub.TopicDataType<px4_msgs.msg.dds.VehicleAcceleration>
{
   public static final java.lang.String name = "px4_msgs::msg::dds_::VehicleAcceleration_";
   
   @Override
   public final java.lang.String getDefinitionChecksum()
   {
   		return "759ac1357030df8c4a724a96b7e24494332b90a1893076b04958e41be4ac59a8";
   }
   
   @Override
   public final java.lang.String getDefinitionVersion()
   {
   		return "";
   }

   private final us.ihmc.idl.CDR serializeCDR = new us.ihmc.idl.CDR();
   private final us.ihmc.idl.CDR deserializeCDR = new us.ihmc.idl.CDR();

   @Override
   public void serialize(px4_msgs.msg.dds.VehicleAcceleration data, us.ihmc.pubsub.common.SerializedPayload serializedPayload) throws java.io.IOException
   {
      serializeCDR.serialize(serializedPayload);
      write(data, serializeCDR);
      serializeCDR.finishSerialize();
   }

   @Override
   public void deserialize(us.ihmc.pubsub.common.SerializedPayload serializedPayload, px4_msgs.msg.dds.VehicleAcceleration data) throws java.io.IOException
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


      return current_alignment - initial_alignment;
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.VehicleAcceleration data)
   {
      return getCdrSerializedSize(data, 0);
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.VehicleAcceleration data, int current_alignment)
   {
      int initial_alignment = current_alignment;

      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += ((3) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      return current_alignment - initial_alignment;
   }

   public static void write(px4_msgs.msg.dds.VehicleAcceleration data, us.ihmc.idl.CDR cdr)
   {
      cdr.write_type_12(data.getTimestamp());

      cdr.write_type_12(data.getTimestampSample());

      for(int i0 = 0; i0 < data.getXyz().length; ++i0)
      {
        	cdr.write_type_5(data.getXyz()[i0]);	
      }

   }

   public static void read(px4_msgs.msg.dds.VehicleAcceleration data, us.ihmc.idl.CDR cdr)
   {
      data.setTimestamp(cdr.read_type_12());
      	
      data.setTimestampSample(cdr.read_type_12());
      	
      for(int i0 = 0; i0 < data.getXyz().length; ++i0)
      {
        	data.getXyz()[i0] = cdr.read_type_5();
        	
      }
      	

   }

   @Override
   public final void serialize(px4_msgs.msg.dds.VehicleAcceleration data, us.ihmc.idl.InterchangeSerializer ser)
   {
      ser.write_type_12("timestamp", data.getTimestamp());
      ser.write_type_12("timestamp_sample", data.getTimestampSample());
      ser.write_type_f("xyz", data.getXyz());
   }

   @Override
   public final void deserialize(us.ihmc.idl.InterchangeSerializer ser, px4_msgs.msg.dds.VehicleAcceleration data)
   {
      data.setTimestamp(ser.read_type_12("timestamp"));
      data.setTimestampSample(ser.read_type_12("timestamp_sample"));
      ser.read_type_f("xyz", data.getXyz());
   }

   public static void staticCopy(px4_msgs.msg.dds.VehicleAcceleration src, px4_msgs.msg.dds.VehicleAcceleration dest)
   {
      dest.set(src);
   }

   @Override
   public px4_msgs.msg.dds.VehicleAcceleration createData()
   {
      return new px4_msgs.msg.dds.VehicleAcceleration();
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
   
   public void serialize(px4_msgs.msg.dds.VehicleAcceleration data, us.ihmc.idl.CDR cdr)
   {
      write(data, cdr);
   }

   public void deserialize(px4_msgs.msg.dds.VehicleAcceleration data, us.ihmc.idl.CDR cdr)
   {
      read(data, cdr);
   }
   
   public void copy(px4_msgs.msg.dds.VehicleAcceleration src, px4_msgs.msg.dds.VehicleAcceleration dest)
   {
      staticCopy(src, dest);
   }

   @Override
   public VehicleAccelerationPubSubType newInstance()
   {
      return new VehicleAccelerationPubSubType();
   }
}
