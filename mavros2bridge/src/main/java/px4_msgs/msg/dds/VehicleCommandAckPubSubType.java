package px4_msgs.msg.dds;

/**
* 
* Topic data type of the struct "VehicleCommandAck" defined in "VehicleCommandAck_.idl". Use this class to provide the TopicDataType to a Participant. 
*
* This file was automatically generated from VehicleCommandAck_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit VehicleCommandAck_.idl instead.
*
*/
public class VehicleCommandAckPubSubType implements us.ihmc.pubsub.TopicDataType<px4_msgs.msg.dds.VehicleCommandAck>
{
   public static final java.lang.String name = "px4_msgs::msg::dds_::VehicleCommandAck_";
   
   @Override
   public final java.lang.String getDefinitionChecksum()
   {
   		return "8ae2e554c182d843da4c5c21888cd068f3431e02844655a4ed7ebb7093bb2371";
   }
   
   @Override
   public final java.lang.String getDefinitionVersion()
   {
   		return "";
   }

   private final us.ihmc.idl.CDR serializeCDR = new us.ihmc.idl.CDR();
   private final us.ihmc.idl.CDR deserializeCDR = new us.ihmc.idl.CDR();

   @Override
   public void serialize(px4_msgs.msg.dds.VehicleCommandAck data, us.ihmc.pubsub.common.SerializedPayload serializedPayload) throws java.io.IOException
   {
      serializeCDR.serialize(serializedPayload);
      write(data, serializeCDR);
      serializeCDR.finishSerialize();
   }

   @Override
   public void deserialize(us.ihmc.pubsub.common.SerializedPayload serializedPayload, px4_msgs.msg.dds.VehicleCommandAck data) throws java.io.IOException
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

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 2 + us.ihmc.idl.CDR.alignment(current_alignment, 2);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      return current_alignment - initial_alignment;
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.VehicleCommandAck data)
   {
      return getCdrSerializedSize(data, 0);
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.VehicleCommandAck data, int current_alignment)
   {
      int initial_alignment = current_alignment;

      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 2 + us.ihmc.idl.CDR.alignment(current_alignment, 2);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);



      return current_alignment - initial_alignment;
   }

   public static void write(px4_msgs.msg.dds.VehicleCommandAck data, us.ihmc.idl.CDR cdr)
   {
      cdr.write_type_12(data.getTimestamp());

      cdr.write_type_4(data.getCommand());

      cdr.write_type_9(data.getResult());

      cdr.write_type_9(data.getResultParam1());

      cdr.write_type_2(data.getResultParam2());

      cdr.write_type_9(data.getTargetSystem());

      cdr.write_type_3(data.getTargetComponent());

      cdr.write_type_7(data.getFromExternal());

   }

   public static void read(px4_msgs.msg.dds.VehicleCommandAck data, us.ihmc.idl.CDR cdr)
   {
      data.setTimestamp(cdr.read_type_12());
      	
      data.setCommand(cdr.read_type_4());
      	
      data.setResult(cdr.read_type_9());
      	
      data.setResultParam1(cdr.read_type_9());
      	
      data.setResultParam2(cdr.read_type_2());
      	
      data.setTargetSystem(cdr.read_type_9());
      	
      data.setTargetComponent(cdr.read_type_3());
      	
      data.setFromExternal(cdr.read_type_7());
      	

   }

   @Override
   public final void serialize(px4_msgs.msg.dds.VehicleCommandAck data, us.ihmc.idl.InterchangeSerializer ser)
   {
      ser.write_type_12("timestamp", data.getTimestamp());
      ser.write_type_4("command", data.getCommand());
      ser.write_type_9("result", data.getResult());
      ser.write_type_9("result_param1", data.getResultParam1());
      ser.write_type_2("result_param2", data.getResultParam2());
      ser.write_type_9("target_system", data.getTargetSystem());
      ser.write_type_3("target_component", data.getTargetComponent());
      ser.write_type_7("from_external", data.getFromExternal());
   }

   @Override
   public final void deserialize(us.ihmc.idl.InterchangeSerializer ser, px4_msgs.msg.dds.VehicleCommandAck data)
   {
      data.setTimestamp(ser.read_type_12("timestamp"));
      data.setCommand(ser.read_type_4("command"));
      data.setResult(ser.read_type_9("result"));
      data.setResultParam1(ser.read_type_9("result_param1"));
      data.setResultParam2(ser.read_type_2("result_param2"));
      data.setTargetSystem(ser.read_type_9("target_system"));
      data.setTargetComponent(ser.read_type_3("target_component"));
      data.setFromExternal(ser.read_type_7("from_external"));
   }

   public static void staticCopy(px4_msgs.msg.dds.VehicleCommandAck src, px4_msgs.msg.dds.VehicleCommandAck dest)
   {
      dest.set(src);
   }

   @Override
   public px4_msgs.msg.dds.VehicleCommandAck createData()
   {
      return new px4_msgs.msg.dds.VehicleCommandAck();
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
   
   public void serialize(px4_msgs.msg.dds.VehicleCommandAck data, us.ihmc.idl.CDR cdr)
   {
      write(data, cdr);
   }

   public void deserialize(px4_msgs.msg.dds.VehicleCommandAck data, us.ihmc.idl.CDR cdr)
   {
      read(data, cdr);
   }
   
   public void copy(px4_msgs.msg.dds.VehicleCommandAck src, px4_msgs.msg.dds.VehicleCommandAck dest)
   {
      staticCopy(src, dest);
   }

   @Override
   public VehicleCommandAckPubSubType newInstance()
   {
      return new VehicleCommandAckPubSubType();
   }
}
