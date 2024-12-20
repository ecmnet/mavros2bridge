package px4_msgs.msg.dds;

/**
* 
* Topic data type of the struct "Ping" defined in "Ping_.idl". Use this class to provide the TopicDataType to a Participant. 
*
* This file was automatically generated from Ping_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit Ping_.idl instead.
*
*/
public class PingPubSubType implements us.ihmc.pubsub.TopicDataType<px4_msgs.msg.dds.Ping>
{
   public static final java.lang.String name = "px4_msgs::msg::dds_::Ping_";
   
   @Override
   public final java.lang.String getDefinitionChecksum()
   {
   		return "b5c763e5732c5bc411d6bde57e92473fccf6ebfade69373814b55ceb46e9424b";
   }
   
   @Override
   public final java.lang.String getDefinitionVersion()
   {
   		return "";
   }

   private final us.ihmc.idl.CDR serializeCDR = new us.ihmc.idl.CDR();
   private final us.ihmc.idl.CDR deserializeCDR = new us.ihmc.idl.CDR();

   @Override
   public void serialize(px4_msgs.msg.dds.Ping data, us.ihmc.pubsub.common.SerializedPayload serializedPayload) throws java.io.IOException
   {
      serializeCDR.serialize(serializedPayload);
      write(data, serializeCDR);
      serializeCDR.finishSerialize();
   }

   @Override
   public void deserialize(us.ihmc.pubsub.common.SerializedPayload serializedPayload, px4_msgs.msg.dds.Ping data) throws java.io.IOException
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

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      return current_alignment - initial_alignment;
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.Ping data)
   {
      return getCdrSerializedSize(data, 0);
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.Ping data, int current_alignment)
   {
      int initial_alignment = current_alignment;

      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);



      return current_alignment - initial_alignment;
   }

   public static void write(px4_msgs.msg.dds.Ping data, us.ihmc.idl.CDR cdr)
   {
      cdr.write_type_12(data.getTimestamp());

      cdr.write_type_12(data.getPingTime());

      cdr.write_type_4(data.getPingSequence());

      cdr.write_type_4(data.getDroppedPackets());

      cdr.write_type_5(data.getRttMs());

      cdr.write_type_9(data.getSystemId());

      cdr.write_type_9(data.getComponentId());

   }

   public static void read(px4_msgs.msg.dds.Ping data, us.ihmc.idl.CDR cdr)
   {
      data.setTimestamp(cdr.read_type_12());
      	
      data.setPingTime(cdr.read_type_12());
      	
      data.setPingSequence(cdr.read_type_4());
      	
      data.setDroppedPackets(cdr.read_type_4());
      	
      data.setRttMs(cdr.read_type_5());
      	
      data.setSystemId(cdr.read_type_9());
      	
      data.setComponentId(cdr.read_type_9());
      	

   }

   @Override
   public final void serialize(px4_msgs.msg.dds.Ping data, us.ihmc.idl.InterchangeSerializer ser)
   {
      ser.write_type_12("timestamp", data.getTimestamp());
      ser.write_type_12("ping_time", data.getPingTime());
      ser.write_type_4("ping_sequence", data.getPingSequence());
      ser.write_type_4("dropped_packets", data.getDroppedPackets());
      ser.write_type_5("rtt_ms", data.getRttMs());
      ser.write_type_9("system_id", data.getSystemId());
      ser.write_type_9("component_id", data.getComponentId());
   }

   @Override
   public final void deserialize(us.ihmc.idl.InterchangeSerializer ser, px4_msgs.msg.dds.Ping data)
   {
      data.setTimestamp(ser.read_type_12("timestamp"));
      data.setPingTime(ser.read_type_12("ping_time"));
      data.setPingSequence(ser.read_type_4("ping_sequence"));
      data.setDroppedPackets(ser.read_type_4("dropped_packets"));
      data.setRttMs(ser.read_type_5("rtt_ms"));
      data.setSystemId(ser.read_type_9("system_id"));
      data.setComponentId(ser.read_type_9("component_id"));
   }

   public static void staticCopy(px4_msgs.msg.dds.Ping src, px4_msgs.msg.dds.Ping dest)
   {
      dest.set(src);
   }

   @Override
   public px4_msgs.msg.dds.Ping createData()
   {
      return new px4_msgs.msg.dds.Ping();
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
   
   public void serialize(px4_msgs.msg.dds.Ping data, us.ihmc.idl.CDR cdr)
   {
      write(data, cdr);
   }

   public void deserialize(px4_msgs.msg.dds.Ping data, us.ihmc.idl.CDR cdr)
   {
      read(data, cdr);
   }
   
   public void copy(px4_msgs.msg.dds.Ping src, px4_msgs.msg.dds.Ping dest)
   {
      staticCopy(src, dest);
   }

   @Override
   public PingPubSubType newInstance()
   {
      return new PingPubSubType();
   }
}
