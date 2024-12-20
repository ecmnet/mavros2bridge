package px4_msgs.msg.dds;

/**
* 
* Topic data type of the struct "PwmInput" defined in "PwmInput_.idl". Use this class to provide the TopicDataType to a Participant. 
*
* This file was automatically generated from PwmInput_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit PwmInput_.idl instead.
*
*/
public class PwmInputPubSubType implements us.ihmc.pubsub.TopicDataType<px4_msgs.msg.dds.PwmInput>
{
   public static final java.lang.String name = "px4_msgs::msg::dds_::PwmInput_";
   
   @Override
   public final java.lang.String getDefinitionChecksum()
   {
   		return "ec14100a2ccb62c66deaffe9fef322cdcf0f27bb668f366b80331b68f4ab0ddb";
   }
   
   @Override
   public final java.lang.String getDefinitionVersion()
   {
   		return "";
   }

   private final us.ihmc.idl.CDR serializeCDR = new us.ihmc.idl.CDR();
   private final us.ihmc.idl.CDR deserializeCDR = new us.ihmc.idl.CDR();

   @Override
   public void serialize(px4_msgs.msg.dds.PwmInput data, us.ihmc.pubsub.common.SerializedPayload serializedPayload) throws java.io.IOException
   {
      serializeCDR.serialize(serializedPayload);
      write(data, serializeCDR);
      serializeCDR.finishSerialize();
   }

   @Override
   public void deserialize(us.ihmc.pubsub.common.SerializedPayload serializedPayload, px4_msgs.msg.dds.PwmInput data) throws java.io.IOException
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

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      return current_alignment - initial_alignment;
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.PwmInput data)
   {
      return getCdrSerializedSize(data, 0);
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.PwmInput data, int current_alignment)
   {
      int initial_alignment = current_alignment;

      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);



      return current_alignment - initial_alignment;
   }

   public static void write(px4_msgs.msg.dds.PwmInput data, us.ihmc.idl.CDR cdr)
   {
      cdr.write_type_12(data.getTimestamp());

      cdr.write_type_12(data.getErrorCount());

      cdr.write_type_4(data.getPulseWidth());

      cdr.write_type_4(data.getPeriod());

   }

   public static void read(px4_msgs.msg.dds.PwmInput data, us.ihmc.idl.CDR cdr)
   {
      data.setTimestamp(cdr.read_type_12());
      	
      data.setErrorCount(cdr.read_type_12());
      	
      data.setPulseWidth(cdr.read_type_4());
      	
      data.setPeriod(cdr.read_type_4());
      	

   }

   @Override
   public final void serialize(px4_msgs.msg.dds.PwmInput data, us.ihmc.idl.InterchangeSerializer ser)
   {
      ser.write_type_12("timestamp", data.getTimestamp());
      ser.write_type_12("error_count", data.getErrorCount());
      ser.write_type_4("pulse_width", data.getPulseWidth());
      ser.write_type_4("period", data.getPeriod());
   }

   @Override
   public final void deserialize(us.ihmc.idl.InterchangeSerializer ser, px4_msgs.msg.dds.PwmInput data)
   {
      data.setTimestamp(ser.read_type_12("timestamp"));
      data.setErrorCount(ser.read_type_12("error_count"));
      data.setPulseWidth(ser.read_type_4("pulse_width"));
      data.setPeriod(ser.read_type_4("period"));
   }

   public static void staticCopy(px4_msgs.msg.dds.PwmInput src, px4_msgs.msg.dds.PwmInput dest)
   {
      dest.set(src);
   }

   @Override
   public px4_msgs.msg.dds.PwmInput createData()
   {
      return new px4_msgs.msg.dds.PwmInput();
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
   
   public void serialize(px4_msgs.msg.dds.PwmInput data, us.ihmc.idl.CDR cdr)
   {
      write(data, cdr);
   }

   public void deserialize(px4_msgs.msg.dds.PwmInput data, us.ihmc.idl.CDR cdr)
   {
      read(data, cdr);
   }
   
   public void copy(px4_msgs.msg.dds.PwmInput src, px4_msgs.msg.dds.PwmInput dest)
   {
      staticCopy(src, dest);
   }

   @Override
   public PwmInputPubSubType newInstance()
   {
      return new PwmInputPubSubType();
   }
}
