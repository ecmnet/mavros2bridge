package px4_msgs.msg.dds;

/**
* 
* Topic data type of the struct "ModeCompleted" defined in "ModeCompleted_.idl". Use this class to provide the TopicDataType to a Participant. 
*
* This file was automatically generated from ModeCompleted_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit ModeCompleted_.idl instead.
*
*/
public class ModeCompletedPubSubType implements us.ihmc.pubsub.TopicDataType<px4_msgs.msg.dds.ModeCompleted>
{
   public static final java.lang.String name = "px4_msgs::msg::dds_::ModeCompleted_";
   
   @Override
   public final java.lang.String getDefinitionChecksum()
   {
   		return "10fb32e26507bae408e8fda62d18f3dda75f9ccdc0b66ac8fb65b4ad49c9745f";
   }
   
   @Override
   public final java.lang.String getDefinitionVersion()
   {
   		return "";
   }

   private final us.ihmc.idl.CDR serializeCDR = new us.ihmc.idl.CDR();
   private final us.ihmc.idl.CDR deserializeCDR = new us.ihmc.idl.CDR();

   @Override
   public void serialize(px4_msgs.msg.dds.ModeCompleted data, us.ihmc.pubsub.common.SerializedPayload serializedPayload) throws java.io.IOException
   {
      serializeCDR.serialize(serializedPayload);
      write(data, serializeCDR);
      serializeCDR.finishSerialize();
   }

   @Override
   public void deserialize(us.ihmc.pubsub.common.SerializedPayload serializedPayload, px4_msgs.msg.dds.ModeCompleted data) throws java.io.IOException
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

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.ModeCompleted data)
   {
      return getCdrSerializedSize(data, 0);
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.ModeCompleted data, int current_alignment)
   {
      int initial_alignment = current_alignment;

      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);



      return current_alignment - initial_alignment;
   }

   public static void write(px4_msgs.msg.dds.ModeCompleted data, us.ihmc.idl.CDR cdr)
   {
      cdr.write_type_12(data.getTimestamp());

      cdr.write_type_9(data.getResult());

      cdr.write_type_9(data.getNavState());

   }

   public static void read(px4_msgs.msg.dds.ModeCompleted data, us.ihmc.idl.CDR cdr)
   {
      data.setTimestamp(cdr.read_type_12());
      	
      data.setResult(cdr.read_type_9());
      	
      data.setNavState(cdr.read_type_9());
      	

   }

   @Override
   public final void serialize(px4_msgs.msg.dds.ModeCompleted data, us.ihmc.idl.InterchangeSerializer ser)
   {
      ser.write_type_12("timestamp", data.getTimestamp());
      ser.write_type_9("result", data.getResult());
      ser.write_type_9("nav_state", data.getNavState());
   }

   @Override
   public final void deserialize(us.ihmc.idl.InterchangeSerializer ser, px4_msgs.msg.dds.ModeCompleted data)
   {
      data.setTimestamp(ser.read_type_12("timestamp"));
      data.setResult(ser.read_type_9("result"));
      data.setNavState(ser.read_type_9("nav_state"));
   }

   public static void staticCopy(px4_msgs.msg.dds.ModeCompleted src, px4_msgs.msg.dds.ModeCompleted dest)
   {
      dest.set(src);
   }

   @Override
   public px4_msgs.msg.dds.ModeCompleted createData()
   {
      return new px4_msgs.msg.dds.ModeCompleted();
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
   
   public void serialize(px4_msgs.msg.dds.ModeCompleted data, us.ihmc.idl.CDR cdr)
   {
      write(data, cdr);
   }

   public void deserialize(px4_msgs.msg.dds.ModeCompleted data, us.ihmc.idl.CDR cdr)
   {
      read(data, cdr);
   }
   
   public void copy(px4_msgs.msg.dds.ModeCompleted src, px4_msgs.msg.dds.ModeCompleted dest)
   {
      staticCopy(src, dest);
   }

   @Override
   public ModeCompletedPubSubType newInstance()
   {
      return new ModeCompletedPubSubType();
   }
}
