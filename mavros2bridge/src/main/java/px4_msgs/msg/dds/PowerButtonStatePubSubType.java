package px4_msgs.msg.dds;

/**
* 
* Topic data type of the struct "PowerButtonState" defined in "PowerButtonState_.idl". Use this class to provide the TopicDataType to a Participant. 
*
* This file was automatically generated from PowerButtonState_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit PowerButtonState_.idl instead.
*
*/
public class PowerButtonStatePubSubType implements us.ihmc.pubsub.TopicDataType<px4_msgs.msg.dds.PowerButtonState>
{
   public static final java.lang.String name = "px4_msgs::msg::dds_::PowerButtonState_";
   
   @Override
   public final java.lang.String getDefinitionChecksum()
   {
   		return "1cdf8d83c130b6ad80e6cea6e3fb67cde7a0b34a91d64e733986ce6a70607361";
   }
   
   @Override
   public final java.lang.String getDefinitionVersion()
   {
   		return "";
   }

   private final us.ihmc.idl.CDR serializeCDR = new us.ihmc.idl.CDR();
   private final us.ihmc.idl.CDR deserializeCDR = new us.ihmc.idl.CDR();

   @Override
   public void serialize(px4_msgs.msg.dds.PowerButtonState data, us.ihmc.pubsub.common.SerializedPayload serializedPayload) throws java.io.IOException
   {
      serializeCDR.serialize(serializedPayload);
      write(data, serializeCDR);
      serializeCDR.finishSerialize();
   }

   @Override
   public void deserialize(us.ihmc.pubsub.common.SerializedPayload serializedPayload, px4_msgs.msg.dds.PowerButtonState data) throws java.io.IOException
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


      return current_alignment - initial_alignment;
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.PowerButtonState data)
   {
      return getCdrSerializedSize(data, 0);
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.PowerButtonState data, int current_alignment)
   {
      int initial_alignment = current_alignment;

      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);



      return current_alignment - initial_alignment;
   }

   public static void write(px4_msgs.msg.dds.PowerButtonState data, us.ihmc.idl.CDR cdr)
   {
      cdr.write_type_12(data.getTimestamp());

      cdr.write_type_9(data.getEvent());

   }

   public static void read(px4_msgs.msg.dds.PowerButtonState data, us.ihmc.idl.CDR cdr)
   {
      data.setTimestamp(cdr.read_type_12());
      	
      data.setEvent(cdr.read_type_9());
      	

   }

   @Override
   public final void serialize(px4_msgs.msg.dds.PowerButtonState data, us.ihmc.idl.InterchangeSerializer ser)
   {
      ser.write_type_12("timestamp", data.getTimestamp());
      ser.write_type_9("event", data.getEvent());
   }

   @Override
   public final void deserialize(us.ihmc.idl.InterchangeSerializer ser, px4_msgs.msg.dds.PowerButtonState data)
   {
      data.setTimestamp(ser.read_type_12("timestamp"));
      data.setEvent(ser.read_type_9("event"));
   }

   public static void staticCopy(px4_msgs.msg.dds.PowerButtonState src, px4_msgs.msg.dds.PowerButtonState dest)
   {
      dest.set(src);
   }

   @Override
   public px4_msgs.msg.dds.PowerButtonState createData()
   {
      return new px4_msgs.msg.dds.PowerButtonState();
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
   
   public void serialize(px4_msgs.msg.dds.PowerButtonState data, us.ihmc.idl.CDR cdr)
   {
      write(data, cdr);
   }

   public void deserialize(px4_msgs.msg.dds.PowerButtonState data, us.ihmc.idl.CDR cdr)
   {
      read(data, cdr);
   }
   
   public void copy(px4_msgs.msg.dds.PowerButtonState src, px4_msgs.msg.dds.PowerButtonState dest)
   {
      staticCopy(src, dest);
   }

   @Override
   public PowerButtonStatePubSubType newInstance()
   {
      return new PowerButtonStatePubSubType();
   }
}
