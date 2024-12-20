package px4_msgs.msg.dds;

/**
* 
* Topic data type of the struct "GpioIn" defined in "GpioIn_.idl". Use this class to provide the TopicDataType to a Participant. 
*
* This file was automatically generated from GpioIn_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit GpioIn_.idl instead.
*
*/
public class GpioInPubSubType implements us.ihmc.pubsub.TopicDataType<px4_msgs.msg.dds.GpioIn>
{
   public static final java.lang.String name = "px4_msgs::msg::dds_::GpioIn_";
   
   @Override
   public final java.lang.String getDefinitionChecksum()
   {
   		return "2a511116c443cb704ef6b13aa7762547ab9bae7b860e46b27b276e8498f9862b";
   }
   
   @Override
   public final java.lang.String getDefinitionVersion()
   {
   		return "";
   }

   private final us.ihmc.idl.CDR serializeCDR = new us.ihmc.idl.CDR();
   private final us.ihmc.idl.CDR deserializeCDR = new us.ihmc.idl.CDR();

   @Override
   public void serialize(px4_msgs.msg.dds.GpioIn data, us.ihmc.pubsub.common.SerializedPayload serializedPayload) throws java.io.IOException
   {
      serializeCDR.serialize(serializedPayload);
      write(data, serializeCDR);
      serializeCDR.finishSerialize();
   }

   @Override
   public void deserialize(us.ihmc.pubsub.common.SerializedPayload serializedPayload, px4_msgs.msg.dds.GpioIn data) throws java.io.IOException
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


      return current_alignment - initial_alignment;
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.GpioIn data)
   {
      return getCdrSerializedSize(data, 0);
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.GpioIn data, int current_alignment)
   {
      int initial_alignment = current_alignment;

      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);



      return current_alignment - initial_alignment;
   }

   public static void write(px4_msgs.msg.dds.GpioIn data, us.ihmc.idl.CDR cdr)
   {
      cdr.write_type_12(data.getTimestamp());

      cdr.write_type_4(data.getDeviceId());

      cdr.write_type_4(data.getState());

   }

   public static void read(px4_msgs.msg.dds.GpioIn data, us.ihmc.idl.CDR cdr)
   {
      data.setTimestamp(cdr.read_type_12());
      	
      data.setDeviceId(cdr.read_type_4());
      	
      data.setState(cdr.read_type_4());
      	

   }

   @Override
   public final void serialize(px4_msgs.msg.dds.GpioIn data, us.ihmc.idl.InterchangeSerializer ser)
   {
      ser.write_type_12("timestamp", data.getTimestamp());
      ser.write_type_4("device_id", data.getDeviceId());
      ser.write_type_4("state", data.getState());
   }

   @Override
   public final void deserialize(us.ihmc.idl.InterchangeSerializer ser, px4_msgs.msg.dds.GpioIn data)
   {
      data.setTimestamp(ser.read_type_12("timestamp"));
      data.setDeviceId(ser.read_type_4("device_id"));
      data.setState(ser.read_type_4("state"));
   }

   public static void staticCopy(px4_msgs.msg.dds.GpioIn src, px4_msgs.msg.dds.GpioIn dest)
   {
      dest.set(src);
   }

   @Override
   public px4_msgs.msg.dds.GpioIn createData()
   {
      return new px4_msgs.msg.dds.GpioIn();
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
   
   public void serialize(px4_msgs.msg.dds.GpioIn data, us.ihmc.idl.CDR cdr)
   {
      write(data, cdr);
   }

   public void deserialize(px4_msgs.msg.dds.GpioIn data, us.ihmc.idl.CDR cdr)
   {
      read(data, cdr);
   }
   
   public void copy(px4_msgs.msg.dds.GpioIn src, px4_msgs.msg.dds.GpioIn dest)
   {
      staticCopy(src, dest);
   }

   @Override
   public GpioInPubSubType newInstance()
   {
      return new GpioInPubSubType();
   }
}
