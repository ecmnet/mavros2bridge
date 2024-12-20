package px4_msgs.msg.dds;

/**
* 
* Topic data type of the struct "RegisterExtComponentRequest" defined in "RegisterExtComponentRequest_.idl". Use this class to provide the TopicDataType to a Participant. 
*
* This file was automatically generated from RegisterExtComponentRequest_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit RegisterExtComponentRequest_.idl instead.
*
*/
public class RegisterExtComponentRequestPubSubType implements us.ihmc.pubsub.TopicDataType<px4_msgs.msg.dds.RegisterExtComponentRequest>
{
   public static final java.lang.String name = "px4_msgs::msg::dds_::RegisterExtComponentRequest_";
   
   @Override
   public final java.lang.String getDefinitionChecksum()
   {
   		return "ad6bda4a5649ec20b9b47eab3e8ee3d3b84a8db093e590f297df3108bb3e9c4e";
   }
   
   @Override
   public final java.lang.String getDefinitionVersion()
   {
   		return "";
   }

   private final us.ihmc.idl.CDR serializeCDR = new us.ihmc.idl.CDR();
   private final us.ihmc.idl.CDR deserializeCDR = new us.ihmc.idl.CDR();

   @Override
   public void serialize(px4_msgs.msg.dds.RegisterExtComponentRequest data, us.ihmc.pubsub.common.SerializedPayload serializedPayload) throws java.io.IOException
   {
      serializeCDR.serialize(serializedPayload);
      write(data, serializeCDR);
      serializeCDR.finishSerialize();
   }

   @Override
   public void deserialize(us.ihmc.pubsub.common.SerializedPayload serializedPayload, px4_msgs.msg.dds.RegisterExtComponentRequest data) throws java.io.IOException
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

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      return current_alignment - initial_alignment;
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.RegisterExtComponentRequest data)
   {
      return getCdrSerializedSize(data, 0);
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.RegisterExtComponentRequest data, int current_alignment)
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


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);



      return current_alignment - initial_alignment;
   }

   public static void write(px4_msgs.msg.dds.RegisterExtComponentRequest data, us.ihmc.idl.CDR cdr)
   {
      cdr.write_type_12(data.getTimestamp());

      cdr.write_type_12(data.getRequestId());

      for(int i0 = 0; i0 < data.getName().length; ++i0)
      {
        	cdr.write_type_8(data.getName()[i0]);	
      }

      cdr.write_type_3(data.getPx4Ros2ApiVersion());

      cdr.write_type_7(data.getRegisterArmingCheck());

      cdr.write_type_7(data.getRegisterMode());

      cdr.write_type_7(data.getRegisterModeExecutor());

      cdr.write_type_7(data.getEnableReplaceInternalMode());

      cdr.write_type_9(data.getReplaceInternalMode());

      cdr.write_type_7(data.getActivateModeImmediately());

   }

   public static void read(px4_msgs.msg.dds.RegisterExtComponentRequest data, us.ihmc.idl.CDR cdr)
   {
      data.setTimestamp(cdr.read_type_12());
      	
      data.setRequestId(cdr.read_type_12());
      	
      for(int i0 = 0; i0 < data.getName().length; ++i0)
      {
        	data.getName()[i0] = cdr.read_type_8();
        	
      }
      	
      data.setPx4Ros2ApiVersion(cdr.read_type_3());
      	
      data.setRegisterArmingCheck(cdr.read_type_7());
      	
      data.setRegisterMode(cdr.read_type_7());
      	
      data.setRegisterModeExecutor(cdr.read_type_7());
      	
      data.setEnableReplaceInternalMode(cdr.read_type_7());
      	
      data.setReplaceInternalMode(cdr.read_type_9());
      	
      data.setActivateModeImmediately(cdr.read_type_7());
      	

   }

   @Override
   public final void serialize(px4_msgs.msg.dds.RegisterExtComponentRequest data, us.ihmc.idl.InterchangeSerializer ser)
   {
      ser.write_type_12("timestamp", data.getTimestamp());
      ser.write_type_12("request_id", data.getRequestId());
      ser.write_type_f("name", data.getName());
      ser.write_type_3("px4_ros2_api_version", data.getPx4Ros2ApiVersion());
      ser.write_type_7("register_arming_check", data.getRegisterArmingCheck());
      ser.write_type_7("register_mode", data.getRegisterMode());
      ser.write_type_7("register_mode_executor", data.getRegisterModeExecutor());
      ser.write_type_7("enable_replace_internal_mode", data.getEnableReplaceInternalMode());
      ser.write_type_9("replace_internal_mode", data.getReplaceInternalMode());
      ser.write_type_7("activate_mode_immediately", data.getActivateModeImmediately());
   }

   @Override
   public final void deserialize(us.ihmc.idl.InterchangeSerializer ser, px4_msgs.msg.dds.RegisterExtComponentRequest data)
   {
      data.setTimestamp(ser.read_type_12("timestamp"));
      data.setRequestId(ser.read_type_12("request_id"));
      ser.read_type_f("name", data.getName());
      data.setPx4Ros2ApiVersion(ser.read_type_3("px4_ros2_api_version"));
      data.setRegisterArmingCheck(ser.read_type_7("register_arming_check"));
      data.setRegisterMode(ser.read_type_7("register_mode"));
      data.setRegisterModeExecutor(ser.read_type_7("register_mode_executor"));
      data.setEnableReplaceInternalMode(ser.read_type_7("enable_replace_internal_mode"));
      data.setReplaceInternalMode(ser.read_type_9("replace_internal_mode"));
      data.setActivateModeImmediately(ser.read_type_7("activate_mode_immediately"));
   }

   public static void staticCopy(px4_msgs.msg.dds.RegisterExtComponentRequest src, px4_msgs.msg.dds.RegisterExtComponentRequest dest)
   {
      dest.set(src);
   }

   @Override
   public px4_msgs.msg.dds.RegisterExtComponentRequest createData()
   {
      return new px4_msgs.msg.dds.RegisterExtComponentRequest();
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
   
   public void serialize(px4_msgs.msg.dds.RegisterExtComponentRequest data, us.ihmc.idl.CDR cdr)
   {
      write(data, cdr);
   }

   public void deserialize(px4_msgs.msg.dds.RegisterExtComponentRequest data, us.ihmc.idl.CDR cdr)
   {
      read(data, cdr);
   }
   
   public void copy(px4_msgs.msg.dds.RegisterExtComponentRequest src, px4_msgs.msg.dds.RegisterExtComponentRequest dest)
   {
      staticCopy(src, dest);
   }

   @Override
   public RegisterExtComponentRequestPubSubType newInstance()
   {
      return new RegisterExtComponentRequestPubSubType();
   }
}
