package px4_msgs.msg.dds;

/**
* 
* Topic data type of the struct "RegisterExtComponentReply" defined in "RegisterExtComponentReply_.idl". Use this class to provide the TopicDataType to a Participant. 
*
* This file was automatically generated from RegisterExtComponentReply_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit RegisterExtComponentReply_.idl instead.
*
*/
public class RegisterExtComponentReplyPubSubType implements us.ihmc.pubsub.TopicDataType<px4_msgs.msg.dds.RegisterExtComponentReply>
{
   public static final java.lang.String name = "px4_msgs::msg::dds_::RegisterExtComponentReply_";
   
   @Override
   public final java.lang.String getDefinitionChecksum()
   {
   		return "733e8c9cd707f22fed984df8b2fcac31874ebab3ef20f3d7dd6bba2ebd17cd72";
   }
   
   @Override
   public final java.lang.String getDefinitionVersion()
   {
   		return "";
   }

   private final us.ihmc.idl.CDR serializeCDR = new us.ihmc.idl.CDR();
   private final us.ihmc.idl.CDR deserializeCDR = new us.ihmc.idl.CDR();

   @Override
   public void serialize(px4_msgs.msg.dds.RegisterExtComponentReply data, us.ihmc.pubsub.common.SerializedPayload serializedPayload) throws java.io.IOException
   {
      serializeCDR.serialize(serializedPayload);
      write(data, serializeCDR);
      serializeCDR.finishSerialize();
   }

   @Override
   public void deserialize(us.ihmc.pubsub.common.SerializedPayload serializedPayload, px4_msgs.msg.dds.RegisterExtComponentReply data) throws java.io.IOException
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

      current_alignment += ((25) * 1) + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 2 + us.ihmc.idl.CDR.alignment(current_alignment, 2);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      return current_alignment - initial_alignment;
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.RegisterExtComponentReply data)
   {
      return getCdrSerializedSize(data, 0);
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.RegisterExtComponentReply data, int current_alignment)
   {
      int initial_alignment = current_alignment;

      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += ((25) * 1) + us.ihmc.idl.CDR.alignment(current_alignment, 1);
      current_alignment += 2 + us.ihmc.idl.CDR.alignment(current_alignment, 2);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);



      return current_alignment - initial_alignment;
   }

   public static void write(px4_msgs.msg.dds.RegisterExtComponentReply data, us.ihmc.idl.CDR cdr)
   {
      cdr.write_type_12(data.getTimestamp());

      cdr.write_type_12(data.getRequestId());

      for(int i0 = 0; i0 < data.getName().length; ++i0)
      {
        	cdr.write_type_8(data.getName()[i0]);	
      }

      cdr.write_type_3(data.getPx4Ros2ApiVersion());

      cdr.write_type_7(data.getSuccess());

      cdr.write_type_9(data.getArmingCheckId());

      cdr.write_type_9(data.getModeId());

      cdr.write_type_9(data.getModeExecutorId());

   }

   public static void read(px4_msgs.msg.dds.RegisterExtComponentReply data, us.ihmc.idl.CDR cdr)
   {
      data.setTimestamp(cdr.read_type_12());
      	
      data.setRequestId(cdr.read_type_12());
      	
      for(int i0 = 0; i0 < data.getName().length; ++i0)
      {
        	data.getName()[i0] = cdr.read_type_8();
        	
      }
      	
      data.setPx4Ros2ApiVersion(cdr.read_type_3());
      	
      data.setSuccess(cdr.read_type_7());
      	
      data.setArmingCheckId(cdr.read_type_9());
      	
      data.setModeId(cdr.read_type_9());
      	
      data.setModeExecutorId(cdr.read_type_9());
      	

   }

   @Override
   public final void serialize(px4_msgs.msg.dds.RegisterExtComponentReply data, us.ihmc.idl.InterchangeSerializer ser)
   {
      ser.write_type_12("timestamp", data.getTimestamp());
      ser.write_type_12("request_id", data.getRequestId());
      ser.write_type_f("name", data.getName());
      ser.write_type_3("px4_ros2_api_version", data.getPx4Ros2ApiVersion());
      ser.write_type_7("success", data.getSuccess());
      ser.write_type_9("arming_check_id", data.getArmingCheckId());
      ser.write_type_9("mode_id", data.getModeId());
      ser.write_type_9("mode_executor_id", data.getModeExecutorId());
   }

   @Override
   public final void deserialize(us.ihmc.idl.InterchangeSerializer ser, px4_msgs.msg.dds.RegisterExtComponentReply data)
   {
      data.setTimestamp(ser.read_type_12("timestamp"));
      data.setRequestId(ser.read_type_12("request_id"));
      ser.read_type_f("name", data.getName());
      data.setPx4Ros2ApiVersion(ser.read_type_3("px4_ros2_api_version"));
      data.setSuccess(ser.read_type_7("success"));
      data.setArmingCheckId(ser.read_type_9("arming_check_id"));
      data.setModeId(ser.read_type_9("mode_id"));
      data.setModeExecutorId(ser.read_type_9("mode_executor_id"));
   }

   public static void staticCopy(px4_msgs.msg.dds.RegisterExtComponentReply src, px4_msgs.msg.dds.RegisterExtComponentReply dest)
   {
      dest.set(src);
   }

   @Override
   public px4_msgs.msg.dds.RegisterExtComponentReply createData()
   {
      return new px4_msgs.msg.dds.RegisterExtComponentReply();
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
   
   public void serialize(px4_msgs.msg.dds.RegisterExtComponentReply data, us.ihmc.idl.CDR cdr)
   {
      write(data, cdr);
   }

   public void deserialize(px4_msgs.msg.dds.RegisterExtComponentReply data, us.ihmc.idl.CDR cdr)
   {
      read(data, cdr);
   }
   
   public void copy(px4_msgs.msg.dds.RegisterExtComponentReply src, px4_msgs.msg.dds.RegisterExtComponentReply dest)
   {
      staticCopy(src, dest);
   }

   @Override
   public RegisterExtComponentReplyPubSubType newInstance()
   {
      return new RegisterExtComponentReplyPubSubType();
   }
}
