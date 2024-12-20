package px4_msgs.msg.dds;

/**
* 
* Topic data type of the struct "ActuatorOutputs" defined in "ActuatorOutputs_.idl". Use this class to provide the TopicDataType to a Participant. 
*
* This file was automatically generated from ActuatorOutputs_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit ActuatorOutputs_.idl instead.
*
*/
public class ActuatorOutputsPubSubType implements us.ihmc.pubsub.TopicDataType<px4_msgs.msg.dds.ActuatorOutputs>
{
   public static final java.lang.String name = "px4_msgs::msg::dds_::ActuatorOutputs_";
   
   @Override
   public final java.lang.String getDefinitionChecksum()
   {
   		return "282e36ef7b102018de8e613e4a51c871937ba40eb9281537c34794cadb654d91";
   }
   
   @Override
   public final java.lang.String getDefinitionVersion()
   {
   		return "";
   }

   private final us.ihmc.idl.CDR serializeCDR = new us.ihmc.idl.CDR();
   private final us.ihmc.idl.CDR deserializeCDR = new us.ihmc.idl.CDR();

   @Override
   public void serialize(px4_msgs.msg.dds.ActuatorOutputs data, us.ihmc.pubsub.common.SerializedPayload serializedPayload) throws java.io.IOException
   {
      serializeCDR.serialize(serializedPayload);
      write(data, serializeCDR);
      serializeCDR.finishSerialize();
   }

   @Override
   public void deserialize(us.ihmc.pubsub.common.SerializedPayload serializedPayload, px4_msgs.msg.dds.ActuatorOutputs data) throws java.io.IOException
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

      current_alignment += ((16) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      return current_alignment - initial_alignment;
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.ActuatorOutputs data)
   {
      return getCdrSerializedSize(data, 0);
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.ActuatorOutputs data, int current_alignment)
   {
      int initial_alignment = current_alignment;

      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += ((16) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      return current_alignment - initial_alignment;
   }

   public static void write(px4_msgs.msg.dds.ActuatorOutputs data, us.ihmc.idl.CDR cdr)
   {
      cdr.write_type_12(data.getTimestamp());

      cdr.write_type_4(data.getNoutputs());

      for(int i0 = 0; i0 < data.getOutput().length; ++i0)
      {
        	cdr.write_type_5(data.getOutput()[i0]);	
      }

   }

   public static void read(px4_msgs.msg.dds.ActuatorOutputs data, us.ihmc.idl.CDR cdr)
   {
      data.setTimestamp(cdr.read_type_12());
      	
      data.setNoutputs(cdr.read_type_4());
      	
      for(int i0 = 0; i0 < data.getOutput().length; ++i0)
      {
        	data.getOutput()[i0] = cdr.read_type_5();
        	
      }
      	

   }

   @Override
   public final void serialize(px4_msgs.msg.dds.ActuatorOutputs data, us.ihmc.idl.InterchangeSerializer ser)
   {
      ser.write_type_12("timestamp", data.getTimestamp());
      ser.write_type_4("noutputs", data.getNoutputs());
      ser.write_type_f("output", data.getOutput());
   }

   @Override
   public final void deserialize(us.ihmc.idl.InterchangeSerializer ser, px4_msgs.msg.dds.ActuatorOutputs data)
   {
      data.setTimestamp(ser.read_type_12("timestamp"));
      data.setNoutputs(ser.read_type_4("noutputs"));
      ser.read_type_f("output", data.getOutput());
   }

   public static void staticCopy(px4_msgs.msg.dds.ActuatorOutputs src, px4_msgs.msg.dds.ActuatorOutputs dest)
   {
      dest.set(src);
   }

   @Override
   public px4_msgs.msg.dds.ActuatorOutputs createData()
   {
      return new px4_msgs.msg.dds.ActuatorOutputs();
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
   
   public void serialize(px4_msgs.msg.dds.ActuatorOutputs data, us.ihmc.idl.CDR cdr)
   {
      write(data, cdr);
   }

   public void deserialize(px4_msgs.msg.dds.ActuatorOutputs data, us.ihmc.idl.CDR cdr)
   {
      read(data, cdr);
   }
   
   public void copy(px4_msgs.msg.dds.ActuatorOutputs src, px4_msgs.msg.dds.ActuatorOutputs dest)
   {
      staticCopy(src, dest);
   }

   @Override
   public ActuatorOutputsPubSubType newInstance()
   {
      return new ActuatorOutputsPubSubType();
   }
}
