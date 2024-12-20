package px4_msgs.msg.dds;

/**
* 
* Topic data type of the struct "SensorSelection" defined in "SensorSelection_.idl". Use this class to provide the TopicDataType to a Participant. 
*
* This file was automatically generated from SensorSelection_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit SensorSelection_.idl instead.
*
*/
public class SensorSelectionPubSubType implements us.ihmc.pubsub.TopicDataType<px4_msgs.msg.dds.SensorSelection>
{
   public static final java.lang.String name = "px4_msgs::msg::dds_::SensorSelection_";
   
   @Override
   public final java.lang.String getDefinitionChecksum()
   {
   		return "16ea561b51e0289673b875021e131ddf3bcdcbb5a47a8697a689f78a7f6ae0f2";
   }
   
   @Override
   public final java.lang.String getDefinitionVersion()
   {
   		return "";
   }

   private final us.ihmc.idl.CDR serializeCDR = new us.ihmc.idl.CDR();
   private final us.ihmc.idl.CDR deserializeCDR = new us.ihmc.idl.CDR();

   @Override
   public void serialize(px4_msgs.msg.dds.SensorSelection data, us.ihmc.pubsub.common.SerializedPayload serializedPayload) throws java.io.IOException
   {
      serializeCDR.serialize(serializedPayload);
      write(data, serializeCDR);
      serializeCDR.finishSerialize();
   }

   @Override
   public void deserialize(us.ihmc.pubsub.common.SerializedPayload serializedPayload, px4_msgs.msg.dds.SensorSelection data) throws java.io.IOException
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

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.SensorSelection data)
   {
      return getCdrSerializedSize(data, 0);
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.SensorSelection data, int current_alignment)
   {
      int initial_alignment = current_alignment;

      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);



      return current_alignment - initial_alignment;
   }

   public static void write(px4_msgs.msg.dds.SensorSelection data, us.ihmc.idl.CDR cdr)
   {
      cdr.write_type_12(data.getTimestamp());

      cdr.write_type_4(data.getAccelDeviceId());

      cdr.write_type_4(data.getGyroDeviceId());

   }

   public static void read(px4_msgs.msg.dds.SensorSelection data, us.ihmc.idl.CDR cdr)
   {
      data.setTimestamp(cdr.read_type_12());
      	
      data.setAccelDeviceId(cdr.read_type_4());
      	
      data.setGyroDeviceId(cdr.read_type_4());
      	

   }

   @Override
   public final void serialize(px4_msgs.msg.dds.SensorSelection data, us.ihmc.idl.InterchangeSerializer ser)
   {
      ser.write_type_12("timestamp", data.getTimestamp());
      ser.write_type_4("accel_device_id", data.getAccelDeviceId());
      ser.write_type_4("gyro_device_id", data.getGyroDeviceId());
   }

   @Override
   public final void deserialize(us.ihmc.idl.InterchangeSerializer ser, px4_msgs.msg.dds.SensorSelection data)
   {
      data.setTimestamp(ser.read_type_12("timestamp"));
      data.setAccelDeviceId(ser.read_type_4("accel_device_id"));
      data.setGyroDeviceId(ser.read_type_4("gyro_device_id"));
   }

   public static void staticCopy(px4_msgs.msg.dds.SensorSelection src, px4_msgs.msg.dds.SensorSelection dest)
   {
      dest.set(src);
   }

   @Override
   public px4_msgs.msg.dds.SensorSelection createData()
   {
      return new px4_msgs.msg.dds.SensorSelection();
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
   
   public void serialize(px4_msgs.msg.dds.SensorSelection data, us.ihmc.idl.CDR cdr)
   {
      write(data, cdr);
   }

   public void deserialize(px4_msgs.msg.dds.SensorSelection data, us.ihmc.idl.CDR cdr)
   {
      read(data, cdr);
   }
   
   public void copy(px4_msgs.msg.dds.SensorSelection src, px4_msgs.msg.dds.SensorSelection dest)
   {
      staticCopy(src, dest);
   }

   @Override
   public SensorSelectionPubSubType newInstance()
   {
      return new SensorSelectionPubSubType();
   }
}
