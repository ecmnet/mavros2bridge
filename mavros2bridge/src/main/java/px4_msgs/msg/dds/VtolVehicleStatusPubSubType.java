package px4_msgs.msg.dds;

/**
* 
* Topic data type of the struct "VtolVehicleStatus" defined in "VtolVehicleStatus_.idl". Use this class to provide the TopicDataType to a Participant. 
*
* This file was automatically generated from VtolVehicleStatus_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit VtolVehicleStatus_.idl instead.
*
*/
public class VtolVehicleStatusPubSubType implements us.ihmc.pubsub.TopicDataType<px4_msgs.msg.dds.VtolVehicleStatus>
{
   public static final java.lang.String name = "px4_msgs::msg::dds_::VtolVehicleStatus_";
   
   @Override
   public final java.lang.String getDefinitionChecksum()
   {
   		return "3a7ffd107f1a1f4220e5984dd683ab94997943d4f491937c6f331b70c2dbf4f8";
   }
   
   @Override
   public final java.lang.String getDefinitionVersion()
   {
   		return "";
   }

   private final us.ihmc.idl.CDR serializeCDR = new us.ihmc.idl.CDR();
   private final us.ihmc.idl.CDR deserializeCDR = new us.ihmc.idl.CDR();

   @Override
   public void serialize(px4_msgs.msg.dds.VtolVehicleStatus data, us.ihmc.pubsub.common.SerializedPayload serializedPayload) throws java.io.IOException
   {
      serializeCDR.serialize(serializedPayload);
      write(data, serializeCDR);
      serializeCDR.finishSerialize();
   }

   @Override
   public void deserialize(us.ihmc.pubsub.common.SerializedPayload serializedPayload, px4_msgs.msg.dds.VtolVehicleStatus data) throws java.io.IOException
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

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      return current_alignment - initial_alignment;
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.VtolVehicleStatus data)
   {
      return getCdrSerializedSize(data, 0);
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.VtolVehicleStatus data, int current_alignment)
   {
      int initial_alignment = current_alignment;

      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);



      return current_alignment - initial_alignment;
   }

   public static void write(px4_msgs.msg.dds.VtolVehicleStatus data, us.ihmc.idl.CDR cdr)
   {
      cdr.write_type_12(data.getTimestamp());

      cdr.write_type_9(data.getVehicleVtolState());

      cdr.write_type_7(data.getFixedWingSystemFailure());

   }

   public static void read(px4_msgs.msg.dds.VtolVehicleStatus data, us.ihmc.idl.CDR cdr)
   {
      data.setTimestamp(cdr.read_type_12());
      	
      data.setVehicleVtolState(cdr.read_type_9());
      	
      data.setFixedWingSystemFailure(cdr.read_type_7());
      	

   }

   @Override
   public final void serialize(px4_msgs.msg.dds.VtolVehicleStatus data, us.ihmc.idl.InterchangeSerializer ser)
   {
      ser.write_type_12("timestamp", data.getTimestamp());
      ser.write_type_9("vehicle_vtol_state", data.getVehicleVtolState());
      ser.write_type_7("fixed_wing_system_failure", data.getFixedWingSystemFailure());
   }

   @Override
   public final void deserialize(us.ihmc.idl.InterchangeSerializer ser, px4_msgs.msg.dds.VtolVehicleStatus data)
   {
      data.setTimestamp(ser.read_type_12("timestamp"));
      data.setVehicleVtolState(ser.read_type_9("vehicle_vtol_state"));
      data.setFixedWingSystemFailure(ser.read_type_7("fixed_wing_system_failure"));
   }

   public static void staticCopy(px4_msgs.msg.dds.VtolVehicleStatus src, px4_msgs.msg.dds.VtolVehicleStatus dest)
   {
      dest.set(src);
   }

   @Override
   public px4_msgs.msg.dds.VtolVehicleStatus createData()
   {
      return new px4_msgs.msg.dds.VtolVehicleStatus();
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
   
   public void serialize(px4_msgs.msg.dds.VtolVehicleStatus data, us.ihmc.idl.CDR cdr)
   {
      write(data, cdr);
   }

   public void deserialize(px4_msgs.msg.dds.VtolVehicleStatus data, us.ihmc.idl.CDR cdr)
   {
      read(data, cdr);
   }
   
   public void copy(px4_msgs.msg.dds.VtolVehicleStatus src, px4_msgs.msg.dds.VtolVehicleStatus dest)
   {
      staticCopy(src, dest);
   }

   @Override
   public VtolVehicleStatusPubSubType newInstance()
   {
      return new VtolVehicleStatusPubSubType();
   }
}
