package px4_msgs.msg.dds;

/**
* 
* Topic data type of the struct "Gripper" defined in "Gripper_.idl". Use this class to provide the TopicDataType to a Participant. 
*
* This file was automatically generated from Gripper_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit Gripper_.idl instead.
*
*/
public class GripperPubSubType implements us.ihmc.pubsub.TopicDataType<px4_msgs.msg.dds.Gripper>
{
   public static final java.lang.String name = "px4_msgs::msg::dds_::Gripper_";
   
   @Override
   public final java.lang.String getDefinitionChecksum()
   {
   		return "144288807810037e81c00c82619ef39fb9db77fe7ed0b32d65e0a8d898db6f8a";
   }
   
   @Override
   public final java.lang.String getDefinitionVersion()
   {
   		return "";
   }

   private final us.ihmc.idl.CDR serializeCDR = new us.ihmc.idl.CDR();
   private final us.ihmc.idl.CDR deserializeCDR = new us.ihmc.idl.CDR();

   @Override
   public void serialize(px4_msgs.msg.dds.Gripper data, us.ihmc.pubsub.common.SerializedPayload serializedPayload) throws java.io.IOException
   {
      serializeCDR.serialize(serializedPayload);
      write(data, serializeCDR);
      serializeCDR.finishSerialize();
   }

   @Override
   public void deserialize(us.ihmc.pubsub.common.SerializedPayload serializedPayload, px4_msgs.msg.dds.Gripper data) throws java.io.IOException
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

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.Gripper data)
   {
      return getCdrSerializedSize(data, 0);
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.Gripper data, int current_alignment)
   {
      int initial_alignment = current_alignment;

      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);



      return current_alignment - initial_alignment;
   }

   public static void write(px4_msgs.msg.dds.Gripper data, us.ihmc.idl.CDR cdr)
   {
      cdr.write_type_12(data.getTimestamp());

      cdr.write_type_9(data.getCommand());

   }

   public static void read(px4_msgs.msg.dds.Gripper data, us.ihmc.idl.CDR cdr)
   {
      data.setTimestamp(cdr.read_type_12());
      	
      data.setCommand(cdr.read_type_9());
      	

   }

   @Override
   public final void serialize(px4_msgs.msg.dds.Gripper data, us.ihmc.idl.InterchangeSerializer ser)
   {
      ser.write_type_12("timestamp", data.getTimestamp());
      ser.write_type_9("command", data.getCommand());
   }

   @Override
   public final void deserialize(us.ihmc.idl.InterchangeSerializer ser, px4_msgs.msg.dds.Gripper data)
   {
      data.setTimestamp(ser.read_type_12("timestamp"));
      data.setCommand(ser.read_type_9("command"));
   }

   public static void staticCopy(px4_msgs.msg.dds.Gripper src, px4_msgs.msg.dds.Gripper dest)
   {
      dest.set(src);
   }

   @Override
   public px4_msgs.msg.dds.Gripper createData()
   {
      return new px4_msgs.msg.dds.Gripper();
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
   
   public void serialize(px4_msgs.msg.dds.Gripper data, us.ihmc.idl.CDR cdr)
   {
      write(data, cdr);
   }

   public void deserialize(px4_msgs.msg.dds.Gripper data, us.ihmc.idl.CDR cdr)
   {
      read(data, cdr);
   }
   
   public void copy(px4_msgs.msg.dds.Gripper src, px4_msgs.msg.dds.Gripper dest)
   {
      staticCopy(src, dest);
   }

   @Override
   public GripperPubSubType newInstance()
   {
      return new GripperPubSubType();
   }
}
