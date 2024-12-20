package px4_msgs.msg.dds;

/**
* 
* Topic data type of the struct "TakeoffStatus" defined in "TakeoffStatus_.idl". Use this class to provide the TopicDataType to a Participant. 
*
* This file was automatically generated from TakeoffStatus_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit TakeoffStatus_.idl instead.
*
*/
public class TakeoffStatusPubSubType implements us.ihmc.pubsub.TopicDataType<px4_msgs.msg.dds.TakeoffStatus>
{
   public static final java.lang.String name = "px4_msgs::msg::dds_::TakeoffStatus_";
   
   @Override
   public final java.lang.String getDefinitionChecksum()
   {
   		return "e40ae27aaedda7d0be72d4bfeb3f06cd268a76e6556c5b4a68aa8d76d266897a";
   }
   
   @Override
   public final java.lang.String getDefinitionVersion()
   {
   		return "";
   }

   private final us.ihmc.idl.CDR serializeCDR = new us.ihmc.idl.CDR();
   private final us.ihmc.idl.CDR deserializeCDR = new us.ihmc.idl.CDR();

   @Override
   public void serialize(px4_msgs.msg.dds.TakeoffStatus data, us.ihmc.pubsub.common.SerializedPayload serializedPayload) throws java.io.IOException
   {
      serializeCDR.serialize(serializedPayload);
      write(data, serializeCDR);
      serializeCDR.finishSerialize();
   }

   @Override
   public void deserialize(us.ihmc.pubsub.common.SerializedPayload serializedPayload, px4_msgs.msg.dds.TakeoffStatus data) throws java.io.IOException
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

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      return current_alignment - initial_alignment;
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.TakeoffStatus data)
   {
      return getCdrSerializedSize(data, 0);
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.TakeoffStatus data, int current_alignment)
   {
      int initial_alignment = current_alignment;

      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);



      return current_alignment - initial_alignment;
   }

   public static void write(px4_msgs.msg.dds.TakeoffStatus data, us.ihmc.idl.CDR cdr)
   {
      cdr.write_type_12(data.getTimestamp());

      cdr.write_type_9(data.getTakeoffState());

      cdr.write_type_5(data.getTiltLimit());

   }

   public static void read(px4_msgs.msg.dds.TakeoffStatus data, us.ihmc.idl.CDR cdr)
   {
      data.setTimestamp(cdr.read_type_12());
      	
      data.setTakeoffState(cdr.read_type_9());
      	
      data.setTiltLimit(cdr.read_type_5());
      	

   }

   @Override
   public final void serialize(px4_msgs.msg.dds.TakeoffStatus data, us.ihmc.idl.InterchangeSerializer ser)
   {
      ser.write_type_12("timestamp", data.getTimestamp());
      ser.write_type_9("takeoff_state", data.getTakeoffState());
      ser.write_type_5("tilt_limit", data.getTiltLimit());
   }

   @Override
   public final void deserialize(us.ihmc.idl.InterchangeSerializer ser, px4_msgs.msg.dds.TakeoffStatus data)
   {
      data.setTimestamp(ser.read_type_12("timestamp"));
      data.setTakeoffState(ser.read_type_9("takeoff_state"));
      data.setTiltLimit(ser.read_type_5("tilt_limit"));
   }

   public static void staticCopy(px4_msgs.msg.dds.TakeoffStatus src, px4_msgs.msg.dds.TakeoffStatus dest)
   {
      dest.set(src);
   }

   @Override
   public px4_msgs.msg.dds.TakeoffStatus createData()
   {
      return new px4_msgs.msg.dds.TakeoffStatus();
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
   
   public void serialize(px4_msgs.msg.dds.TakeoffStatus data, us.ihmc.idl.CDR cdr)
   {
      write(data, cdr);
   }

   public void deserialize(px4_msgs.msg.dds.TakeoffStatus data, us.ihmc.idl.CDR cdr)
   {
      read(data, cdr);
   }
   
   public void copy(px4_msgs.msg.dds.TakeoffStatus src, px4_msgs.msg.dds.TakeoffStatus dest)
   {
      staticCopy(src, dest);
   }

   @Override
   public TakeoffStatusPubSubType newInstance()
   {
      return new TakeoffStatusPubSubType();
   }
}
