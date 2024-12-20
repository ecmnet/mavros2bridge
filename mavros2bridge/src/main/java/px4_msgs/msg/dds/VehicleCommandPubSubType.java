package px4_msgs.msg.dds;

/**
* 
* Topic data type of the struct "VehicleCommand" defined in "VehicleCommand_.idl". Use this class to provide the TopicDataType to a Participant. 
*
* This file was automatically generated from VehicleCommand_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit VehicleCommand_.idl instead.
*
*/
public class VehicleCommandPubSubType implements us.ihmc.pubsub.TopicDataType<px4_msgs.msg.dds.VehicleCommand>
{
   public static final java.lang.String name = "px4_msgs::msg::dds_::VehicleCommand_";
   
   @Override
   public final java.lang.String getDefinitionChecksum()
   {
   		return "531c9aef4b335f63aa74a818202a50ea9f5e0ceca800c46ac8643aaba3dcb5a6";
   }
   
   @Override
   public final java.lang.String getDefinitionVersion()
   {
   		return "";
   }

   private final us.ihmc.idl.CDR serializeCDR = new us.ihmc.idl.CDR();
   private final us.ihmc.idl.CDR deserializeCDR = new us.ihmc.idl.CDR();

   @Override
   public void serialize(px4_msgs.msg.dds.VehicleCommand data, us.ihmc.pubsub.common.SerializedPayload serializedPayload) throws java.io.IOException
   {
      serializeCDR.serialize(serializedPayload);
      write(data, serializeCDR);
      serializeCDR.finishSerialize();
   }

   @Override
   public void deserialize(us.ihmc.pubsub.common.SerializedPayload serializedPayload, px4_msgs.msg.dds.VehicleCommand data) throws java.io.IOException
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

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);

      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 2 + us.ihmc.idl.CDR.alignment(current_alignment, 2);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      return current_alignment - initial_alignment;
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.VehicleCommand data)
   {
      return getCdrSerializedSize(data, 0);
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.VehicleCommand data, int current_alignment)
   {
      int initial_alignment = current_alignment;

      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 2 + us.ihmc.idl.CDR.alignment(current_alignment, 2);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);



      return current_alignment - initial_alignment;
   }

   public static void write(px4_msgs.msg.dds.VehicleCommand data, us.ihmc.idl.CDR cdr)
   {
      cdr.write_type_12(data.getTimestamp());

      cdr.write_type_5(data.getParam1());

      cdr.write_type_5(data.getParam2());

      cdr.write_type_5(data.getParam3());

      cdr.write_type_5(data.getParam4());

      cdr.write_type_6(data.getParam5());

      cdr.write_type_6(data.getParam6());

      cdr.write_type_5(data.getParam7());

      cdr.write_type_4(data.getCommand());

      cdr.write_type_9(data.getTargetSystem());

      cdr.write_type_9(data.getTargetComponent());

      cdr.write_type_9(data.getSourceSystem());

      cdr.write_type_3(data.getSourceComponent());

      cdr.write_type_9(data.getConfirmation());

      cdr.write_type_7(data.getFromExternal());

   }

   public static void read(px4_msgs.msg.dds.VehicleCommand data, us.ihmc.idl.CDR cdr)
   {
      data.setTimestamp(cdr.read_type_12());
      	
      data.setParam1(cdr.read_type_5());
      	
      data.setParam2(cdr.read_type_5());
      	
      data.setParam3(cdr.read_type_5());
      	
      data.setParam4(cdr.read_type_5());
      	
      data.setParam5(cdr.read_type_6());
      	
      data.setParam6(cdr.read_type_6());
      	
      data.setParam7(cdr.read_type_5());
      	
      data.setCommand(cdr.read_type_4());
      	
      data.setTargetSystem(cdr.read_type_9());
      	
      data.setTargetComponent(cdr.read_type_9());
      	
      data.setSourceSystem(cdr.read_type_9());
      	
      data.setSourceComponent(cdr.read_type_3());
      	
      data.setConfirmation(cdr.read_type_9());
      	
      data.setFromExternal(cdr.read_type_7());
      	

   }

   @Override
   public final void serialize(px4_msgs.msg.dds.VehicleCommand data, us.ihmc.idl.InterchangeSerializer ser)
   {
      ser.write_type_12("timestamp", data.getTimestamp());
      ser.write_type_5("param1", data.getParam1());
      ser.write_type_5("param2", data.getParam2());
      ser.write_type_5("param3", data.getParam3());
      ser.write_type_5("param4", data.getParam4());
      ser.write_type_6("param5", data.getParam5());
      ser.write_type_6("param6", data.getParam6());
      ser.write_type_5("param7", data.getParam7());
      ser.write_type_4("command", data.getCommand());
      ser.write_type_9("target_system", data.getTargetSystem());
      ser.write_type_9("target_component", data.getTargetComponent());
      ser.write_type_9("source_system", data.getSourceSystem());
      ser.write_type_3("source_component", data.getSourceComponent());
      ser.write_type_9("confirmation", data.getConfirmation());
      ser.write_type_7("from_external", data.getFromExternal());
   }

   @Override
   public final void deserialize(us.ihmc.idl.InterchangeSerializer ser, px4_msgs.msg.dds.VehicleCommand data)
   {
      data.setTimestamp(ser.read_type_12("timestamp"));
      data.setParam1(ser.read_type_5("param1"));
      data.setParam2(ser.read_type_5("param2"));
      data.setParam3(ser.read_type_5("param3"));
      data.setParam4(ser.read_type_5("param4"));
      data.setParam5(ser.read_type_6("param5"));
      data.setParam6(ser.read_type_6("param6"));
      data.setParam7(ser.read_type_5("param7"));
      data.setCommand(ser.read_type_4("command"));
      data.setTargetSystem(ser.read_type_9("target_system"));
      data.setTargetComponent(ser.read_type_9("target_component"));
      data.setSourceSystem(ser.read_type_9("source_system"));
      data.setSourceComponent(ser.read_type_3("source_component"));
      data.setConfirmation(ser.read_type_9("confirmation"));
      data.setFromExternal(ser.read_type_7("from_external"));
   }

   public static void staticCopy(px4_msgs.msg.dds.VehicleCommand src, px4_msgs.msg.dds.VehicleCommand dest)
   {
      dest.set(src);
   }

   @Override
   public px4_msgs.msg.dds.VehicleCommand createData()
   {
      return new px4_msgs.msg.dds.VehicleCommand();
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
   
   public void serialize(px4_msgs.msg.dds.VehicleCommand data, us.ihmc.idl.CDR cdr)
   {
      write(data, cdr);
   }

   public void deserialize(px4_msgs.msg.dds.VehicleCommand data, us.ihmc.idl.CDR cdr)
   {
      read(data, cdr);
   }
   
   public void copy(px4_msgs.msg.dds.VehicleCommand src, px4_msgs.msg.dds.VehicleCommand dest)
   {
      staticCopy(src, dest);
   }

   @Override
   public VehicleCommandPubSubType newInstance()
   {
      return new VehicleCommandPubSubType();
   }
}
