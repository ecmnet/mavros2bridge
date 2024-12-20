package px4_msgs.msg.dds;

/**
* 
* Topic data type of the struct "RadioStatus" defined in "RadioStatus_.idl". Use this class to provide the TopicDataType to a Participant. 
*
* This file was automatically generated from RadioStatus_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit RadioStatus_.idl instead.
*
*/
public class RadioStatusPubSubType implements us.ihmc.pubsub.TopicDataType<px4_msgs.msg.dds.RadioStatus>
{
   public static final java.lang.String name = "px4_msgs::msg::dds_::RadioStatus_";
   
   @Override
   public final java.lang.String getDefinitionChecksum()
   {
   		return "5377f91cf76a5acf45a0fe2a90e629ce6ca709af7b360f97763338ed7c808c8a";
   }
   
   @Override
   public final java.lang.String getDefinitionVersion()
   {
   		return "";
   }

   private final us.ihmc.idl.CDR serializeCDR = new us.ihmc.idl.CDR();
   private final us.ihmc.idl.CDR deserializeCDR = new us.ihmc.idl.CDR();

   @Override
   public void serialize(px4_msgs.msg.dds.RadioStatus data, us.ihmc.pubsub.common.SerializedPayload serializedPayload) throws java.io.IOException
   {
      serializeCDR.serialize(serializedPayload);
      write(data, serializeCDR);
      serializeCDR.finishSerialize();
   }

   @Override
   public void deserialize(us.ihmc.pubsub.common.SerializedPayload serializedPayload, px4_msgs.msg.dds.RadioStatus data) throws java.io.IOException
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

      current_alignment += 2 + us.ihmc.idl.CDR.alignment(current_alignment, 2);

      current_alignment += 2 + us.ihmc.idl.CDR.alignment(current_alignment, 2);


      return current_alignment - initial_alignment;
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.RadioStatus data)
   {
      return getCdrSerializedSize(data, 0);
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.RadioStatus data, int current_alignment)
   {
      int initial_alignment = current_alignment;

      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 2 + us.ihmc.idl.CDR.alignment(current_alignment, 2);


      current_alignment += 2 + us.ihmc.idl.CDR.alignment(current_alignment, 2);



      return current_alignment - initial_alignment;
   }

   public static void write(px4_msgs.msg.dds.RadioStatus data, us.ihmc.idl.CDR cdr)
   {
      cdr.write_type_12(data.getTimestamp());

      cdr.write_type_9(data.getRssi());

      cdr.write_type_9(data.getRemoteRssi());

      cdr.write_type_9(data.getTxbuf());

      cdr.write_type_9(data.getNoise());

      cdr.write_type_9(data.getRemoteNoise());

      cdr.write_type_3(data.getRxerrors());

      cdr.write_type_3(data.getFix());

   }

   public static void read(px4_msgs.msg.dds.RadioStatus data, us.ihmc.idl.CDR cdr)
   {
      data.setTimestamp(cdr.read_type_12());
      	
      data.setRssi(cdr.read_type_9());
      	
      data.setRemoteRssi(cdr.read_type_9());
      	
      data.setTxbuf(cdr.read_type_9());
      	
      data.setNoise(cdr.read_type_9());
      	
      data.setRemoteNoise(cdr.read_type_9());
      	
      data.setRxerrors(cdr.read_type_3());
      	
      data.setFix(cdr.read_type_3());
      	

   }

   @Override
   public final void serialize(px4_msgs.msg.dds.RadioStatus data, us.ihmc.idl.InterchangeSerializer ser)
   {
      ser.write_type_12("timestamp", data.getTimestamp());
      ser.write_type_9("rssi", data.getRssi());
      ser.write_type_9("remote_rssi", data.getRemoteRssi());
      ser.write_type_9("txbuf", data.getTxbuf());
      ser.write_type_9("noise", data.getNoise());
      ser.write_type_9("remote_noise", data.getRemoteNoise());
      ser.write_type_3("rxerrors", data.getRxerrors());
      ser.write_type_3("fix", data.getFix());
   }

   @Override
   public final void deserialize(us.ihmc.idl.InterchangeSerializer ser, px4_msgs.msg.dds.RadioStatus data)
   {
      data.setTimestamp(ser.read_type_12("timestamp"));
      data.setRssi(ser.read_type_9("rssi"));
      data.setRemoteRssi(ser.read_type_9("remote_rssi"));
      data.setTxbuf(ser.read_type_9("txbuf"));
      data.setNoise(ser.read_type_9("noise"));
      data.setRemoteNoise(ser.read_type_9("remote_noise"));
      data.setRxerrors(ser.read_type_3("rxerrors"));
      data.setFix(ser.read_type_3("fix"));
   }

   public static void staticCopy(px4_msgs.msg.dds.RadioStatus src, px4_msgs.msg.dds.RadioStatus dest)
   {
      dest.set(src);
   }

   @Override
   public px4_msgs.msg.dds.RadioStatus createData()
   {
      return new px4_msgs.msg.dds.RadioStatus();
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
   
   public void serialize(px4_msgs.msg.dds.RadioStatus data, us.ihmc.idl.CDR cdr)
   {
      write(data, cdr);
   }

   public void deserialize(px4_msgs.msg.dds.RadioStatus data, us.ihmc.idl.CDR cdr)
   {
      read(data, cdr);
   }
   
   public void copy(px4_msgs.msg.dds.RadioStatus src, px4_msgs.msg.dds.RadioStatus dest)
   {
      staticCopy(src, dest);
   }

   @Override
   public RadioStatusPubSubType newInstance()
   {
      return new RadioStatusPubSubType();
   }
}
