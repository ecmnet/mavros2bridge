package px4_msgs.msg.dds;

/**
* 
* Topic data type of the struct "SystemPower" defined in "SystemPower_.idl". Use this class to provide the TopicDataType to a Participant. 
*
* This file was automatically generated from SystemPower_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit SystemPower_.idl instead.
*
*/
public class SystemPowerPubSubType implements us.ihmc.pubsub.TopicDataType<px4_msgs.msg.dds.SystemPower>
{
   public static final java.lang.String name = "px4_msgs::msg::dds_::SystemPower_";
   
   @Override
   public final java.lang.String getDefinitionChecksum()
   {
   		return "9ba879efc9f513a5ec20a8765ebed16b99d487f355af8cbc1f70fecd290a3cc2";
   }
   
   @Override
   public final java.lang.String getDefinitionVersion()
   {
   		return "";
   }

   private final us.ihmc.idl.CDR serializeCDR = new us.ihmc.idl.CDR();
   private final us.ihmc.idl.CDR deserializeCDR = new us.ihmc.idl.CDR();

   @Override
   public void serialize(px4_msgs.msg.dds.SystemPower data, us.ihmc.pubsub.common.SerializedPayload serializedPayload) throws java.io.IOException
   {
      serializeCDR.serialize(serializedPayload);
      write(data, serializeCDR);
      serializeCDR.finishSerialize();
   }

   @Override
   public void deserialize(us.ihmc.pubsub.common.SerializedPayload serializedPayload, px4_msgs.msg.dds.SystemPower data) throws java.io.IOException
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

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += ((4) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);

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


      return current_alignment - initial_alignment;
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.SystemPower data)
   {
      return getCdrSerializedSize(data, 0);
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.SystemPower data, int current_alignment)
   {
      int initial_alignment = current_alignment;

      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += ((4) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);
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



      return current_alignment - initial_alignment;
   }

   public static void write(px4_msgs.msg.dds.SystemPower data, us.ihmc.idl.CDR cdr)
   {
      cdr.write_type_12(data.getTimestamp());

      cdr.write_type_5(data.getVoltage5vV());

      cdr.write_type_5(data.getVoltagePayloadV());

      for(int i0 = 0; i0 < data.getSensors3v3().length; ++i0)
      {
        	cdr.write_type_5(data.getSensors3v3()[i0]);	
      }

      cdr.write_type_9(data.getSensors3v3Valid());

      cdr.write_type_9(data.getUsbConnected());

      cdr.write_type_9(data.getBrickValid());

      cdr.write_type_9(data.getUsbValid());

      cdr.write_type_9(data.getServoValid());

      cdr.write_type_9(data.getPeriph5vOc());

      cdr.write_type_9(data.getHipower5vOc());

      cdr.write_type_9(data.getComp5vValid());

      cdr.write_type_9(data.getCan1Gps15vValid());

      cdr.write_type_9(data.getPayloadVValid());

   }

   public static void read(px4_msgs.msg.dds.SystemPower data, us.ihmc.idl.CDR cdr)
   {
      data.setTimestamp(cdr.read_type_12());
      	
      data.setVoltage5vV(cdr.read_type_5());
      	
      data.setVoltagePayloadV(cdr.read_type_5());
      	
      for(int i0 = 0; i0 < data.getSensors3v3().length; ++i0)
      {
        	data.getSensors3v3()[i0] = cdr.read_type_5();
        	
      }
      	
      data.setSensors3v3Valid(cdr.read_type_9());
      	
      data.setUsbConnected(cdr.read_type_9());
      	
      data.setBrickValid(cdr.read_type_9());
      	
      data.setUsbValid(cdr.read_type_9());
      	
      data.setServoValid(cdr.read_type_9());
      	
      data.setPeriph5vOc(cdr.read_type_9());
      	
      data.setHipower5vOc(cdr.read_type_9());
      	
      data.setComp5vValid(cdr.read_type_9());
      	
      data.setCan1Gps15vValid(cdr.read_type_9());
      	
      data.setPayloadVValid(cdr.read_type_9());
      	

   }

   @Override
   public final void serialize(px4_msgs.msg.dds.SystemPower data, us.ihmc.idl.InterchangeSerializer ser)
   {
      ser.write_type_12("timestamp", data.getTimestamp());
      ser.write_type_5("voltage5v_v", data.getVoltage5vV());
      ser.write_type_5("voltage_payload_v", data.getVoltagePayloadV());
      ser.write_type_f("sensors3v3", data.getSensors3v3());
      ser.write_type_9("sensors3v3_valid", data.getSensors3v3Valid());
      ser.write_type_9("usb_connected", data.getUsbConnected());
      ser.write_type_9("brick_valid", data.getBrickValid());
      ser.write_type_9("usb_valid", data.getUsbValid());
      ser.write_type_9("servo_valid", data.getServoValid());
      ser.write_type_9("periph_5v_oc", data.getPeriph5vOc());
      ser.write_type_9("hipower_5v_oc", data.getHipower5vOc());
      ser.write_type_9("comp_5v_valid", data.getComp5vValid());
      ser.write_type_9("can1_gps1_5v_valid", data.getCan1Gps15vValid());
      ser.write_type_9("payload_v_valid", data.getPayloadVValid());
   }

   @Override
   public final void deserialize(us.ihmc.idl.InterchangeSerializer ser, px4_msgs.msg.dds.SystemPower data)
   {
      data.setTimestamp(ser.read_type_12("timestamp"));
      data.setVoltage5vV(ser.read_type_5("voltage5v_v"));
      data.setVoltagePayloadV(ser.read_type_5("voltage_payload_v"));
      ser.read_type_f("sensors3v3", data.getSensors3v3());
      data.setSensors3v3Valid(ser.read_type_9("sensors3v3_valid"));
      data.setUsbConnected(ser.read_type_9("usb_connected"));
      data.setBrickValid(ser.read_type_9("brick_valid"));
      data.setUsbValid(ser.read_type_9("usb_valid"));
      data.setServoValid(ser.read_type_9("servo_valid"));
      data.setPeriph5vOc(ser.read_type_9("periph_5v_oc"));
      data.setHipower5vOc(ser.read_type_9("hipower_5v_oc"));
      data.setComp5vValid(ser.read_type_9("comp_5v_valid"));
      data.setCan1Gps15vValid(ser.read_type_9("can1_gps1_5v_valid"));
      data.setPayloadVValid(ser.read_type_9("payload_v_valid"));
   }

   public static void staticCopy(px4_msgs.msg.dds.SystemPower src, px4_msgs.msg.dds.SystemPower dest)
   {
      dest.set(src);
   }

   @Override
   public px4_msgs.msg.dds.SystemPower createData()
   {
      return new px4_msgs.msg.dds.SystemPower();
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
   
   public void serialize(px4_msgs.msg.dds.SystemPower data, us.ihmc.idl.CDR cdr)
   {
      write(data, cdr);
   }

   public void deserialize(px4_msgs.msg.dds.SystemPower data, us.ihmc.idl.CDR cdr)
   {
      read(data, cdr);
   }
   
   public void copy(px4_msgs.msg.dds.SystemPower src, px4_msgs.msg.dds.SystemPower dest)
   {
      staticCopy(src, dest);
   }

   @Override
   public SystemPowerPubSubType newInstance()
   {
      return new SystemPowerPubSubType();
   }
}
