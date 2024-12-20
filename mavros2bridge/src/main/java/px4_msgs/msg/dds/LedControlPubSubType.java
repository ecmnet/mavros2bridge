package px4_msgs.msg.dds;

/**
* 
* Topic data type of the struct "LedControl" defined in "LedControl_.idl". Use this class to provide the TopicDataType to a Participant. 
*
* This file was automatically generated from LedControl_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit LedControl_.idl instead.
*
*/
public class LedControlPubSubType implements us.ihmc.pubsub.TopicDataType<px4_msgs.msg.dds.LedControl>
{
   public static final java.lang.String name = "px4_msgs::msg::dds_::LedControl_";
   
   @Override
   public final java.lang.String getDefinitionChecksum()
   {
   		return "189152cf8506a2a0ede6963e3ded2bd920f11576b72506efb363e552de1e98f5";
   }
   
   @Override
   public final java.lang.String getDefinitionVersion()
   {
   		return "";
   }

   private final us.ihmc.idl.CDR serializeCDR = new us.ihmc.idl.CDR();
   private final us.ihmc.idl.CDR deserializeCDR = new us.ihmc.idl.CDR();

   @Override
   public void serialize(px4_msgs.msg.dds.LedControl data, us.ihmc.pubsub.common.SerializedPayload serializedPayload) throws java.io.IOException
   {
      serializeCDR.serialize(serializedPayload);
      write(data, serializeCDR);
      serializeCDR.finishSerialize();
   }

   @Override
   public void deserialize(us.ihmc.pubsub.common.SerializedPayload serializedPayload, px4_msgs.msg.dds.LedControl data) throws java.io.IOException
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

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      return current_alignment - initial_alignment;
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.LedControl data)
   {
      return getCdrSerializedSize(data, 0);
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.LedControl data, int current_alignment)
   {
      int initial_alignment = current_alignment;

      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);



      return current_alignment - initial_alignment;
   }

   public static void write(px4_msgs.msg.dds.LedControl data, us.ihmc.idl.CDR cdr)
   {
      cdr.write_type_12(data.getTimestamp());

      cdr.write_type_9(data.getLedMask());

      cdr.write_type_9(data.getColor());

      cdr.write_type_9(data.getMode());

      cdr.write_type_9(data.getNumBlinks());

      cdr.write_type_9(data.getPriority());

   }

   public static void read(px4_msgs.msg.dds.LedControl data, us.ihmc.idl.CDR cdr)
   {
      data.setTimestamp(cdr.read_type_12());
      	
      data.setLedMask(cdr.read_type_9());
      	
      data.setColor(cdr.read_type_9());
      	
      data.setMode(cdr.read_type_9());
      	
      data.setNumBlinks(cdr.read_type_9());
      	
      data.setPriority(cdr.read_type_9());
      	

   }

   @Override
   public final void serialize(px4_msgs.msg.dds.LedControl data, us.ihmc.idl.InterchangeSerializer ser)
   {
      ser.write_type_12("timestamp", data.getTimestamp());
      ser.write_type_9("led_mask", data.getLedMask());
      ser.write_type_9("color", data.getColor());
      ser.write_type_9("mode", data.getMode());
      ser.write_type_9("num_blinks", data.getNumBlinks());
      ser.write_type_9("priority", data.getPriority());
   }

   @Override
   public final void deserialize(us.ihmc.idl.InterchangeSerializer ser, px4_msgs.msg.dds.LedControl data)
   {
      data.setTimestamp(ser.read_type_12("timestamp"));
      data.setLedMask(ser.read_type_9("led_mask"));
      data.setColor(ser.read_type_9("color"));
      data.setMode(ser.read_type_9("mode"));
      data.setNumBlinks(ser.read_type_9("num_blinks"));
      data.setPriority(ser.read_type_9("priority"));
   }

   public static void staticCopy(px4_msgs.msg.dds.LedControl src, px4_msgs.msg.dds.LedControl dest)
   {
      dest.set(src);
   }

   @Override
   public px4_msgs.msg.dds.LedControl createData()
   {
      return new px4_msgs.msg.dds.LedControl();
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
   
   public void serialize(px4_msgs.msg.dds.LedControl data, us.ihmc.idl.CDR cdr)
   {
      write(data, cdr);
   }

   public void deserialize(px4_msgs.msg.dds.LedControl data, us.ihmc.idl.CDR cdr)
   {
      read(data, cdr);
   }
   
   public void copy(px4_msgs.msg.dds.LedControl src, px4_msgs.msg.dds.LedControl dest)
   {
      staticCopy(src, dest);
   }

   @Override
   public LedControlPubSubType newInstance()
   {
      return new LedControlPubSubType();
   }
}
