package px4_msgs.msg.dds;

/**
* 
* Topic data type of the struct "VehicleConstraints" defined in "VehicleConstraints_.idl". Use this class to provide the TopicDataType to a Participant. 
*
* This file was automatically generated from VehicleConstraints_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit VehicleConstraints_.idl instead.
*
*/
public class VehicleConstraintsPubSubType implements us.ihmc.pubsub.TopicDataType<px4_msgs.msg.dds.VehicleConstraints>
{
   public static final java.lang.String name = "px4_msgs::msg::dds_::VehicleConstraints_";
   
   @Override
   public final java.lang.String getDefinitionChecksum()
   {
   		return "230fb141941e27dacb8877ac81fc088f4f98aa0882e0bd39f61348e033d5c301";
   }
   
   @Override
   public final java.lang.String getDefinitionVersion()
   {
   		return "";
   }

   private final us.ihmc.idl.CDR serializeCDR = new us.ihmc.idl.CDR();
   private final us.ihmc.idl.CDR deserializeCDR = new us.ihmc.idl.CDR();

   @Override
   public void serialize(px4_msgs.msg.dds.VehicleConstraints data, us.ihmc.pubsub.common.SerializedPayload serializedPayload) throws java.io.IOException
   {
      serializeCDR.serialize(serializedPayload);
      write(data, serializeCDR);
      serializeCDR.finishSerialize();
   }

   @Override
   public void deserialize(us.ihmc.pubsub.common.SerializedPayload serializedPayload, px4_msgs.msg.dds.VehicleConstraints data) throws java.io.IOException
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

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      return current_alignment - initial_alignment;
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.VehicleConstraints data)
   {
      return getCdrSerializedSize(data, 0);
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.VehicleConstraints data, int current_alignment)
   {
      int initial_alignment = current_alignment;

      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);



      return current_alignment - initial_alignment;
   }

   public static void write(px4_msgs.msg.dds.VehicleConstraints data, us.ihmc.idl.CDR cdr)
   {
      cdr.write_type_12(data.getTimestamp());

      cdr.write_type_5(data.getSpeedUp());

      cdr.write_type_5(data.getSpeedDown());

      cdr.write_type_7(data.getWantTakeoff());

   }

   public static void read(px4_msgs.msg.dds.VehicleConstraints data, us.ihmc.idl.CDR cdr)
   {
      data.setTimestamp(cdr.read_type_12());
      	
      data.setSpeedUp(cdr.read_type_5());
      	
      data.setSpeedDown(cdr.read_type_5());
      	
      data.setWantTakeoff(cdr.read_type_7());
      	

   }

   @Override
   public final void serialize(px4_msgs.msg.dds.VehicleConstraints data, us.ihmc.idl.InterchangeSerializer ser)
   {
      ser.write_type_12("timestamp", data.getTimestamp());
      ser.write_type_5("speed_up", data.getSpeedUp());
      ser.write_type_5("speed_down", data.getSpeedDown());
      ser.write_type_7("want_takeoff", data.getWantTakeoff());
   }

   @Override
   public final void deserialize(us.ihmc.idl.InterchangeSerializer ser, px4_msgs.msg.dds.VehicleConstraints data)
   {
      data.setTimestamp(ser.read_type_12("timestamp"));
      data.setSpeedUp(ser.read_type_5("speed_up"));
      data.setSpeedDown(ser.read_type_5("speed_down"));
      data.setWantTakeoff(ser.read_type_7("want_takeoff"));
   }

   public static void staticCopy(px4_msgs.msg.dds.VehicleConstraints src, px4_msgs.msg.dds.VehicleConstraints dest)
   {
      dest.set(src);
   }

   @Override
   public px4_msgs.msg.dds.VehicleConstraints createData()
   {
      return new px4_msgs.msg.dds.VehicleConstraints();
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
   
   public void serialize(px4_msgs.msg.dds.VehicleConstraints data, us.ihmc.idl.CDR cdr)
   {
      write(data, cdr);
   }

   public void deserialize(px4_msgs.msg.dds.VehicleConstraints data, us.ihmc.idl.CDR cdr)
   {
      read(data, cdr);
   }
   
   public void copy(px4_msgs.msg.dds.VehicleConstraints src, px4_msgs.msg.dds.VehicleConstraints dest)
   {
      staticCopy(src, dest);
   }

   @Override
   public VehicleConstraintsPubSubType newInstance()
   {
      return new VehicleConstraintsPubSubType();
   }
}
