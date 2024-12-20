package px4_msgs.msg.dds;

/**
* 
* Topic data type of the struct "PositionControllerLandingStatus" defined in "PositionControllerLandingStatus_.idl". Use this class to provide the TopicDataType to a Participant. 
*
* This file was automatically generated from PositionControllerLandingStatus_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit PositionControllerLandingStatus_.idl instead.
*
*/
public class PositionControllerLandingStatusPubSubType implements us.ihmc.pubsub.TopicDataType<px4_msgs.msg.dds.PositionControllerLandingStatus>
{
   public static final java.lang.String name = "px4_msgs::msg::dds_::PositionControllerLandingStatus_";
   
   @Override
   public final java.lang.String getDefinitionChecksum()
   {
   		return "638a84bc6f1015a2eb567954a75bedac921959b84c97c88ea3b1690059c4e5ad";
   }
   
   @Override
   public final java.lang.String getDefinitionVersion()
   {
   		return "";
   }

   private final us.ihmc.idl.CDR serializeCDR = new us.ihmc.idl.CDR();
   private final us.ihmc.idl.CDR deserializeCDR = new us.ihmc.idl.CDR();

   @Override
   public void serialize(px4_msgs.msg.dds.PositionControllerLandingStatus data, us.ihmc.pubsub.common.SerializedPayload serializedPayload) throws java.io.IOException
   {
      serializeCDR.serialize(serializedPayload);
      write(data, serializeCDR);
      serializeCDR.finishSerialize();
   }

   @Override
   public void deserialize(us.ihmc.pubsub.common.SerializedPayload serializedPayload, px4_msgs.msg.dds.PositionControllerLandingStatus data) throws java.io.IOException
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

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      return current_alignment - initial_alignment;
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.PositionControllerLandingStatus data)
   {
      return getCdrSerializedSize(data, 0);
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.PositionControllerLandingStatus data, int current_alignment)
   {
      int initial_alignment = current_alignment;

      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);



      return current_alignment - initial_alignment;
   }

   public static void write(px4_msgs.msg.dds.PositionControllerLandingStatus data, us.ihmc.idl.CDR cdr)
   {
      cdr.write_type_12(data.getTimestamp());

      cdr.write_type_5(data.getLateralTouchdownOffset());

      cdr.write_type_7(data.getFlaring());

      cdr.write_type_9(data.getAbortStatus());

   }

   public static void read(px4_msgs.msg.dds.PositionControllerLandingStatus data, us.ihmc.idl.CDR cdr)
   {
      data.setTimestamp(cdr.read_type_12());
      	
      data.setLateralTouchdownOffset(cdr.read_type_5());
      	
      data.setFlaring(cdr.read_type_7());
      	
      data.setAbortStatus(cdr.read_type_9());
      	

   }

   @Override
   public final void serialize(px4_msgs.msg.dds.PositionControllerLandingStatus data, us.ihmc.idl.InterchangeSerializer ser)
   {
      ser.write_type_12("timestamp", data.getTimestamp());
      ser.write_type_5("lateral_touchdown_offset", data.getLateralTouchdownOffset());
      ser.write_type_7("flaring", data.getFlaring());
      ser.write_type_9("abort_status", data.getAbortStatus());
   }

   @Override
   public final void deserialize(us.ihmc.idl.InterchangeSerializer ser, px4_msgs.msg.dds.PositionControllerLandingStatus data)
   {
      data.setTimestamp(ser.read_type_12("timestamp"));
      data.setLateralTouchdownOffset(ser.read_type_5("lateral_touchdown_offset"));
      data.setFlaring(ser.read_type_7("flaring"));
      data.setAbortStatus(ser.read_type_9("abort_status"));
   }

   public static void staticCopy(px4_msgs.msg.dds.PositionControllerLandingStatus src, px4_msgs.msg.dds.PositionControllerLandingStatus dest)
   {
      dest.set(src);
   }

   @Override
   public px4_msgs.msg.dds.PositionControllerLandingStatus createData()
   {
      return new px4_msgs.msg.dds.PositionControllerLandingStatus();
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
   
   public void serialize(px4_msgs.msg.dds.PositionControllerLandingStatus data, us.ihmc.idl.CDR cdr)
   {
      write(data, cdr);
   }

   public void deserialize(px4_msgs.msg.dds.PositionControllerLandingStatus data, us.ihmc.idl.CDR cdr)
   {
      read(data, cdr);
   }
   
   public void copy(px4_msgs.msg.dds.PositionControllerLandingStatus src, px4_msgs.msg.dds.PositionControllerLandingStatus dest)
   {
      staticCopy(src, dest);
   }

   @Override
   public PositionControllerLandingStatusPubSubType newInstance()
   {
      return new PositionControllerLandingStatusPubSubType();
   }
}
