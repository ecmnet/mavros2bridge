package px4_msgs.msg.dds;

/**
* 
* Topic data type of the struct "TaskStackInfo" defined in "TaskStackInfo_.idl". Use this class to provide the TopicDataType to a Participant. 
*
* This file was automatically generated from TaskStackInfo_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit TaskStackInfo_.idl instead.
*
*/
public class TaskStackInfoPubSubType implements us.ihmc.pubsub.TopicDataType<px4_msgs.msg.dds.TaskStackInfo>
{
   public static final java.lang.String name = "px4_msgs::msg::dds_::TaskStackInfo_";
   
   @Override
   public final java.lang.String getDefinitionChecksum()
   {
   		return "60d92c456b1a4b9a8e6caba4a152041a5bdb3319e99b03fd186d2baaa5d80f44";
   }
   
   @Override
   public final java.lang.String getDefinitionVersion()
   {
   		return "";
   }

   private final us.ihmc.idl.CDR serializeCDR = new us.ihmc.idl.CDR();
   private final us.ihmc.idl.CDR deserializeCDR = new us.ihmc.idl.CDR();

   @Override
   public void serialize(px4_msgs.msg.dds.TaskStackInfo data, us.ihmc.pubsub.common.SerializedPayload serializedPayload) throws java.io.IOException
   {
      serializeCDR.serialize(serializedPayload);
      write(data, serializeCDR);
      serializeCDR.finishSerialize();
   }

   @Override
   public void deserialize(us.ihmc.pubsub.common.SerializedPayload serializedPayload, px4_msgs.msg.dds.TaskStackInfo data) throws java.io.IOException
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

      current_alignment += 2 + us.ihmc.idl.CDR.alignment(current_alignment, 2);

      current_alignment += ((24) * 1) + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      return current_alignment - initial_alignment;
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.TaskStackInfo data)
   {
      return getCdrSerializedSize(data, 0);
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.TaskStackInfo data, int current_alignment)
   {
      int initial_alignment = current_alignment;

      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += 2 + us.ihmc.idl.CDR.alignment(current_alignment, 2);


      current_alignment += ((24) * 1) + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      return current_alignment - initial_alignment;
   }

   public static void write(px4_msgs.msg.dds.TaskStackInfo data, us.ihmc.idl.CDR cdr)
   {
      cdr.write_type_12(data.getTimestamp());

      cdr.write_type_3(data.getStackFree());

      for(int i0 = 0; i0 < data.getTaskName().length; ++i0)
      {
        	cdr.write_type_8(data.getTaskName()[i0]);	
      }

   }

   public static void read(px4_msgs.msg.dds.TaskStackInfo data, us.ihmc.idl.CDR cdr)
   {
      data.setTimestamp(cdr.read_type_12());
      	
      data.setStackFree(cdr.read_type_3());
      	
      for(int i0 = 0; i0 < data.getTaskName().length; ++i0)
      {
        	data.getTaskName()[i0] = cdr.read_type_8();
        	
      }
      	

   }

   @Override
   public final void serialize(px4_msgs.msg.dds.TaskStackInfo data, us.ihmc.idl.InterchangeSerializer ser)
   {
      ser.write_type_12("timestamp", data.getTimestamp());
      ser.write_type_3("stack_free", data.getStackFree());
      ser.write_type_f("task_name", data.getTaskName());
   }

   @Override
   public final void deserialize(us.ihmc.idl.InterchangeSerializer ser, px4_msgs.msg.dds.TaskStackInfo data)
   {
      data.setTimestamp(ser.read_type_12("timestamp"));
      data.setStackFree(ser.read_type_3("stack_free"));
      ser.read_type_f("task_name", data.getTaskName());
   }

   public static void staticCopy(px4_msgs.msg.dds.TaskStackInfo src, px4_msgs.msg.dds.TaskStackInfo dest)
   {
      dest.set(src);
   }

   @Override
   public px4_msgs.msg.dds.TaskStackInfo createData()
   {
      return new px4_msgs.msg.dds.TaskStackInfo();
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
   
   public void serialize(px4_msgs.msg.dds.TaskStackInfo data, us.ihmc.idl.CDR cdr)
   {
      write(data, cdr);
   }

   public void deserialize(px4_msgs.msg.dds.TaskStackInfo data, us.ihmc.idl.CDR cdr)
   {
      read(data, cdr);
   }
   
   public void copy(px4_msgs.msg.dds.TaskStackInfo src, px4_msgs.msg.dds.TaskStackInfo dest)
   {
      staticCopy(src, dest);
   }

   @Override
   public TaskStackInfoPubSubType newInstance()
   {
      return new TaskStackInfoPubSubType();
   }
}
