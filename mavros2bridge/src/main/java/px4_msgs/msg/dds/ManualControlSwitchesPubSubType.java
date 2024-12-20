package px4_msgs.msg.dds;

/**
* 
* Topic data type of the struct "ManualControlSwitches" defined in "ManualControlSwitches_.idl". Use this class to provide the TopicDataType to a Participant. 
*
* This file was automatically generated from ManualControlSwitches_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit ManualControlSwitches_.idl instead.
*
*/
public class ManualControlSwitchesPubSubType implements us.ihmc.pubsub.TopicDataType<px4_msgs.msg.dds.ManualControlSwitches>
{
   public static final java.lang.String name = "px4_msgs::msg::dds_::ManualControlSwitches_";
   
   @Override
   public final java.lang.String getDefinitionChecksum()
   {
   		return "4b38bb903da814de9dede7414486590196cfb59bd2d6d4dfeeeb641fff234991";
   }
   
   @Override
   public final java.lang.String getDefinitionVersion()
   {
   		return "";
   }

   private final us.ihmc.idl.CDR serializeCDR = new us.ihmc.idl.CDR();
   private final us.ihmc.idl.CDR deserializeCDR = new us.ihmc.idl.CDR();

   @Override
   public void serialize(px4_msgs.msg.dds.ManualControlSwitches data, us.ihmc.pubsub.common.SerializedPayload serializedPayload) throws java.io.IOException
   {
      serializeCDR.serialize(serializedPayload);
      write(data, serializeCDR);
      serializeCDR.finishSerialize();
   }

   @Override
   public void deserialize(us.ihmc.pubsub.common.SerializedPayload serializedPayload, px4_msgs.msg.dds.ManualControlSwitches data) throws java.io.IOException
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

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      return current_alignment - initial_alignment;
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.ManualControlSwitches data)
   {
      return getCdrSerializedSize(data, 0);
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.ManualControlSwitches data, int current_alignment)
   {
      int initial_alignment = current_alignment;

      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);



      return current_alignment - initial_alignment;
   }

   public static void write(px4_msgs.msg.dds.ManualControlSwitches data, us.ihmc.idl.CDR cdr)
   {
      cdr.write_type_12(data.getTimestamp());

      cdr.write_type_12(data.getTimestampSample());

      cdr.write_type_9(data.getModeSlot());

      cdr.write_type_9(data.getArmSwitch());

      cdr.write_type_9(data.getReturnSwitch());

      cdr.write_type_9(data.getLoiterSwitch());

      cdr.write_type_9(data.getOffboardSwitch());

      cdr.write_type_9(data.getKillSwitch());

      cdr.write_type_9(data.getGearSwitch());

      cdr.write_type_9(data.getTransitionSwitch());

      cdr.write_type_9(data.getPhotoSwitch());

      cdr.write_type_9(data.getVideoSwitch());

      cdr.write_type_9(data.getPayloadPowerSwitch());

      cdr.write_type_9(data.getEngageMainMotorSwitch());

      cdr.write_type_4(data.getSwitchChanges());

   }

   public static void read(px4_msgs.msg.dds.ManualControlSwitches data, us.ihmc.idl.CDR cdr)
   {
      data.setTimestamp(cdr.read_type_12());
      	
      data.setTimestampSample(cdr.read_type_12());
      	
      data.setModeSlot(cdr.read_type_9());
      	
      data.setArmSwitch(cdr.read_type_9());
      	
      data.setReturnSwitch(cdr.read_type_9());
      	
      data.setLoiterSwitch(cdr.read_type_9());
      	
      data.setOffboardSwitch(cdr.read_type_9());
      	
      data.setKillSwitch(cdr.read_type_9());
      	
      data.setGearSwitch(cdr.read_type_9());
      	
      data.setTransitionSwitch(cdr.read_type_9());
      	
      data.setPhotoSwitch(cdr.read_type_9());
      	
      data.setVideoSwitch(cdr.read_type_9());
      	
      data.setPayloadPowerSwitch(cdr.read_type_9());
      	
      data.setEngageMainMotorSwitch(cdr.read_type_9());
      	
      data.setSwitchChanges(cdr.read_type_4());
      	

   }

   @Override
   public final void serialize(px4_msgs.msg.dds.ManualControlSwitches data, us.ihmc.idl.InterchangeSerializer ser)
   {
      ser.write_type_12("timestamp", data.getTimestamp());
      ser.write_type_12("timestamp_sample", data.getTimestampSample());
      ser.write_type_9("mode_slot", data.getModeSlot());
      ser.write_type_9("arm_switch", data.getArmSwitch());
      ser.write_type_9("return_switch", data.getReturnSwitch());
      ser.write_type_9("loiter_switch", data.getLoiterSwitch());
      ser.write_type_9("offboard_switch", data.getOffboardSwitch());
      ser.write_type_9("kill_switch", data.getKillSwitch());
      ser.write_type_9("gear_switch", data.getGearSwitch());
      ser.write_type_9("transition_switch", data.getTransitionSwitch());
      ser.write_type_9("photo_switch", data.getPhotoSwitch());
      ser.write_type_9("video_switch", data.getVideoSwitch());
      ser.write_type_9("payload_power_switch", data.getPayloadPowerSwitch());
      ser.write_type_9("engage_main_motor_switch", data.getEngageMainMotorSwitch());
      ser.write_type_4("switch_changes", data.getSwitchChanges());
   }

   @Override
   public final void deserialize(us.ihmc.idl.InterchangeSerializer ser, px4_msgs.msg.dds.ManualControlSwitches data)
   {
      data.setTimestamp(ser.read_type_12("timestamp"));
      data.setTimestampSample(ser.read_type_12("timestamp_sample"));
      data.setModeSlot(ser.read_type_9("mode_slot"));
      data.setArmSwitch(ser.read_type_9("arm_switch"));
      data.setReturnSwitch(ser.read_type_9("return_switch"));
      data.setLoiterSwitch(ser.read_type_9("loiter_switch"));
      data.setOffboardSwitch(ser.read_type_9("offboard_switch"));
      data.setKillSwitch(ser.read_type_9("kill_switch"));
      data.setGearSwitch(ser.read_type_9("gear_switch"));
      data.setTransitionSwitch(ser.read_type_9("transition_switch"));
      data.setPhotoSwitch(ser.read_type_9("photo_switch"));
      data.setVideoSwitch(ser.read_type_9("video_switch"));
      data.setPayloadPowerSwitch(ser.read_type_9("payload_power_switch"));
      data.setEngageMainMotorSwitch(ser.read_type_9("engage_main_motor_switch"));
      data.setSwitchChanges(ser.read_type_4("switch_changes"));
   }

   public static void staticCopy(px4_msgs.msg.dds.ManualControlSwitches src, px4_msgs.msg.dds.ManualControlSwitches dest)
   {
      dest.set(src);
   }

   @Override
   public px4_msgs.msg.dds.ManualControlSwitches createData()
   {
      return new px4_msgs.msg.dds.ManualControlSwitches();
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
   
   public void serialize(px4_msgs.msg.dds.ManualControlSwitches data, us.ihmc.idl.CDR cdr)
   {
      write(data, cdr);
   }

   public void deserialize(px4_msgs.msg.dds.ManualControlSwitches data, us.ihmc.idl.CDR cdr)
   {
      read(data, cdr);
   }
   
   public void copy(px4_msgs.msg.dds.ManualControlSwitches src, px4_msgs.msg.dds.ManualControlSwitches dest)
   {
      staticCopy(src, dest);
   }

   @Override
   public ManualControlSwitchesPubSubType newInstance()
   {
      return new ManualControlSwitchesPubSubType();
   }
}
