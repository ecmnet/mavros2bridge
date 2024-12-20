package px4_msgs.msg.dds;

/**
* 
* Topic data type of the struct "SensorAirflow" defined in "SensorAirflow_.idl". Use this class to provide the TopicDataType to a Participant. 
*
* This file was automatically generated from SensorAirflow_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit SensorAirflow_.idl instead.
*
*/
public class SensorAirflowPubSubType implements us.ihmc.pubsub.TopicDataType<px4_msgs.msg.dds.SensorAirflow>
{
   public static final java.lang.String name = "px4_msgs::msg::dds_::SensorAirflow_";
   
   @Override
   public final java.lang.String getDefinitionChecksum()
   {
   		return "eb7128cbbb12a44251bb55b43fd074e24dff37da12df80bea3dd7777f27337c3";
   }
   
   @Override
   public final java.lang.String getDefinitionVersion()
   {
   		return "";
   }

   private final us.ihmc.idl.CDR serializeCDR = new us.ihmc.idl.CDR();
   private final us.ihmc.idl.CDR deserializeCDR = new us.ihmc.idl.CDR();

   @Override
   public void serialize(px4_msgs.msg.dds.SensorAirflow data, us.ihmc.pubsub.common.SerializedPayload serializedPayload) throws java.io.IOException
   {
      serializeCDR.serialize(serializedPayload);
      write(data, serializeCDR);
      serializeCDR.finishSerialize();
   }

   @Override
   public void deserialize(us.ihmc.pubsub.common.SerializedPayload serializedPayload, px4_msgs.msg.dds.SensorAirflow data) throws java.io.IOException
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

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      return current_alignment - initial_alignment;
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.SensorAirflow data)
   {
      return getCdrSerializedSize(data, 0);
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.SensorAirflow data, int current_alignment)
   {
      int initial_alignment = current_alignment;

      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);



      return current_alignment - initial_alignment;
   }

   public static void write(px4_msgs.msg.dds.SensorAirflow data, us.ihmc.idl.CDR cdr)
   {
      cdr.write_type_12(data.getTimestamp());

      cdr.write_type_4(data.getDeviceId());

      cdr.write_type_5(data.getSpeed());

      cdr.write_type_5(data.getDirection());

      cdr.write_type_9(data.getStatus());

   }

   public static void read(px4_msgs.msg.dds.SensorAirflow data, us.ihmc.idl.CDR cdr)
   {
      data.setTimestamp(cdr.read_type_12());
      	
      data.setDeviceId(cdr.read_type_4());
      	
      data.setSpeed(cdr.read_type_5());
      	
      data.setDirection(cdr.read_type_5());
      	
      data.setStatus(cdr.read_type_9());
      	

   }

   @Override
   public final void serialize(px4_msgs.msg.dds.SensorAirflow data, us.ihmc.idl.InterchangeSerializer ser)
   {
      ser.write_type_12("timestamp", data.getTimestamp());
      ser.write_type_4("device_id", data.getDeviceId());
      ser.write_type_5("speed", data.getSpeed());
      ser.write_type_5("direction", data.getDirection());
      ser.write_type_9("status", data.getStatus());
   }

   @Override
   public final void deserialize(us.ihmc.idl.InterchangeSerializer ser, px4_msgs.msg.dds.SensorAirflow data)
   {
      data.setTimestamp(ser.read_type_12("timestamp"));
      data.setDeviceId(ser.read_type_4("device_id"));
      data.setSpeed(ser.read_type_5("speed"));
      data.setDirection(ser.read_type_5("direction"));
      data.setStatus(ser.read_type_9("status"));
   }

   public static void staticCopy(px4_msgs.msg.dds.SensorAirflow src, px4_msgs.msg.dds.SensorAirflow dest)
   {
      dest.set(src);
   }

   @Override
   public px4_msgs.msg.dds.SensorAirflow createData()
   {
      return new px4_msgs.msg.dds.SensorAirflow();
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
   
   public void serialize(px4_msgs.msg.dds.SensorAirflow data, us.ihmc.idl.CDR cdr)
   {
      write(data, cdr);
   }

   public void deserialize(px4_msgs.msg.dds.SensorAirflow data, us.ihmc.idl.CDR cdr)
   {
      read(data, cdr);
   }
   
   public void copy(px4_msgs.msg.dds.SensorAirflow src, px4_msgs.msg.dds.SensorAirflow dest)
   {
      staticCopy(src, dest);
   }

   @Override
   public SensorAirflowPubSubType newInstance()
   {
      return new SensorAirflowPubSubType();
   }
}
