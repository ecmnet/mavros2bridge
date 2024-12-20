package px4_msgs.msg.dds;

/**
* 
* Topic data type of the struct "UnregisterExtComponent" defined in "UnregisterExtComponent_.idl". Use this class to provide the TopicDataType to a Participant. 
*
* This file was automatically generated from UnregisterExtComponent_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit UnregisterExtComponent_.idl instead.
*
*/
public class UnregisterExtComponentPubSubType implements us.ihmc.pubsub.TopicDataType<px4_msgs.msg.dds.UnregisterExtComponent>
{
   public static final java.lang.String name = "px4_msgs::msg::dds_::UnregisterExtComponent_";
   
   @Override
   public final java.lang.String getDefinitionChecksum()
   {
   		return "d70e4bd79484ff25394717a84275eedcaf932c119ae5fd7ceb01fe36854e2803";
   }
   
   @Override
   public final java.lang.String getDefinitionVersion()
   {
   		return "";
   }

   private final us.ihmc.idl.CDR serializeCDR = new us.ihmc.idl.CDR();
   private final us.ihmc.idl.CDR deserializeCDR = new us.ihmc.idl.CDR();

   @Override
   public void serialize(px4_msgs.msg.dds.UnregisterExtComponent data, us.ihmc.pubsub.common.SerializedPayload serializedPayload) throws java.io.IOException
   {
      serializeCDR.serialize(serializedPayload);
      write(data, serializeCDR);
      serializeCDR.finishSerialize();
   }

   @Override
   public void deserialize(us.ihmc.pubsub.common.SerializedPayload serializedPayload, px4_msgs.msg.dds.UnregisterExtComponent data) throws java.io.IOException
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

      current_alignment += ((25) * 1) + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      return current_alignment - initial_alignment;
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.UnregisterExtComponent data)
   {
      return getCdrSerializedSize(data, 0);
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.UnregisterExtComponent data, int current_alignment)
   {
      int initial_alignment = current_alignment;

      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += ((25) * 1) + us.ihmc.idl.CDR.alignment(current_alignment, 1);
      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);



      return current_alignment - initial_alignment;
   }

   public static void write(px4_msgs.msg.dds.UnregisterExtComponent data, us.ihmc.idl.CDR cdr)
   {
      cdr.write_type_12(data.getTimestamp());

      for(int i0 = 0; i0 < data.getName().length; ++i0)
      {
        	cdr.write_type_8(data.getName()[i0]);	
      }

      cdr.write_type_9(data.getArmingCheckId());

      cdr.write_type_9(data.getModeId());

      cdr.write_type_9(data.getModeExecutorId());

   }

   public static void read(px4_msgs.msg.dds.UnregisterExtComponent data, us.ihmc.idl.CDR cdr)
   {
      data.setTimestamp(cdr.read_type_12());
      	
      for(int i0 = 0; i0 < data.getName().length; ++i0)
      {
        	data.getName()[i0] = cdr.read_type_8();
        	
      }
      	
      data.setArmingCheckId(cdr.read_type_9());
      	
      data.setModeId(cdr.read_type_9());
      	
      data.setModeExecutorId(cdr.read_type_9());
      	

   }

   @Override
   public final void serialize(px4_msgs.msg.dds.UnregisterExtComponent data, us.ihmc.idl.InterchangeSerializer ser)
   {
      ser.write_type_12("timestamp", data.getTimestamp());
      ser.write_type_f("name", data.getName());
      ser.write_type_9("arming_check_id", data.getArmingCheckId());
      ser.write_type_9("mode_id", data.getModeId());
      ser.write_type_9("mode_executor_id", data.getModeExecutorId());
   }

   @Override
   public final void deserialize(us.ihmc.idl.InterchangeSerializer ser, px4_msgs.msg.dds.UnregisterExtComponent data)
   {
      data.setTimestamp(ser.read_type_12("timestamp"));
      ser.read_type_f("name", data.getName());
      data.setArmingCheckId(ser.read_type_9("arming_check_id"));
      data.setModeId(ser.read_type_9("mode_id"));
      data.setModeExecutorId(ser.read_type_9("mode_executor_id"));
   }

   public static void staticCopy(px4_msgs.msg.dds.UnregisterExtComponent src, px4_msgs.msg.dds.UnregisterExtComponent dest)
   {
      dest.set(src);
   }

   @Override
   public px4_msgs.msg.dds.UnregisterExtComponent createData()
   {
      return new px4_msgs.msg.dds.UnregisterExtComponent();
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
   
   public void serialize(px4_msgs.msg.dds.UnregisterExtComponent data, us.ihmc.idl.CDR cdr)
   {
      write(data, cdr);
   }

   public void deserialize(px4_msgs.msg.dds.UnregisterExtComponent data, us.ihmc.idl.CDR cdr)
   {
      read(data, cdr);
   }
   
   public void copy(px4_msgs.msg.dds.UnregisterExtComponent src, px4_msgs.msg.dds.UnregisterExtComponent dest)
   {
      staticCopy(src, dest);
   }

   @Override
   public UnregisterExtComponentPubSubType newInstance()
   {
      return new UnregisterExtComponentPubSubType();
   }
}
