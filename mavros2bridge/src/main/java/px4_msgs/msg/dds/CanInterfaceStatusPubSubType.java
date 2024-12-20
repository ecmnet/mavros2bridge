package px4_msgs.msg.dds;

/**
* 
* Topic data type of the struct "CanInterfaceStatus" defined in "CanInterfaceStatus_.idl". Use this class to provide the TopicDataType to a Participant. 
*
* This file was automatically generated from CanInterfaceStatus_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit CanInterfaceStatus_.idl instead.
*
*/
public class CanInterfaceStatusPubSubType implements us.ihmc.pubsub.TopicDataType<px4_msgs.msg.dds.CanInterfaceStatus>
{
   public static final java.lang.String name = "px4_msgs::msg::dds_::CanInterfaceStatus_";
   
   @Override
   public final java.lang.String getDefinitionChecksum()
   {
   		return "bc4f29cf63c7de8d12e51b8d80f7a89376cee7859bc74b9f7bf1433a00f8cc51";
   }
   
   @Override
   public final java.lang.String getDefinitionVersion()
   {
   		return "";
   }

   private final us.ihmc.idl.CDR serializeCDR = new us.ihmc.idl.CDR();
   private final us.ihmc.idl.CDR deserializeCDR = new us.ihmc.idl.CDR();

   @Override
   public void serialize(px4_msgs.msg.dds.CanInterfaceStatus data, us.ihmc.pubsub.common.SerializedPayload serializedPayload) throws java.io.IOException
   {
      serializeCDR.serialize(serializedPayload);
      write(data, serializeCDR);
      serializeCDR.finishSerialize();
   }

   @Override
   public void deserialize(us.ihmc.pubsub.common.SerializedPayload serializedPayload, px4_msgs.msg.dds.CanInterfaceStatus data) throws java.io.IOException
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

      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);

      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      return current_alignment - initial_alignment;
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.CanInterfaceStatus data)
   {
      return getCdrSerializedSize(data, 0);
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.CanInterfaceStatus data, int current_alignment)
   {
      int initial_alignment = current_alignment;

      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);



      return current_alignment - initial_alignment;
   }

   public static void write(px4_msgs.msg.dds.CanInterfaceStatus data, us.ihmc.idl.CDR cdr)
   {
      cdr.write_type_12(data.getTimestamp());

      cdr.write_type_12(data.getIoErrors());

      cdr.write_type_12(data.getFramesTx());

      cdr.write_type_12(data.getFramesRx());

   }

   public static void read(px4_msgs.msg.dds.CanInterfaceStatus data, us.ihmc.idl.CDR cdr)
   {
      data.setTimestamp(cdr.read_type_12());
      	
      data.setIoErrors(cdr.read_type_12());
      	
      data.setFramesTx(cdr.read_type_12());
      	
      data.setFramesRx(cdr.read_type_12());
      	

   }

   @Override
   public final void serialize(px4_msgs.msg.dds.CanInterfaceStatus data, us.ihmc.idl.InterchangeSerializer ser)
   {
      ser.write_type_12("timestamp", data.getTimestamp());
      ser.write_type_12("io_errors", data.getIoErrors());
      ser.write_type_12("frames_tx", data.getFramesTx());
      ser.write_type_12("frames_rx", data.getFramesRx());
   }

   @Override
   public final void deserialize(us.ihmc.idl.InterchangeSerializer ser, px4_msgs.msg.dds.CanInterfaceStatus data)
   {
      data.setTimestamp(ser.read_type_12("timestamp"));
      data.setIoErrors(ser.read_type_12("io_errors"));
      data.setFramesTx(ser.read_type_12("frames_tx"));
      data.setFramesRx(ser.read_type_12("frames_rx"));
   }

   public static void staticCopy(px4_msgs.msg.dds.CanInterfaceStatus src, px4_msgs.msg.dds.CanInterfaceStatus dest)
   {
      dest.set(src);
   }

   @Override
   public px4_msgs.msg.dds.CanInterfaceStatus createData()
   {
      return new px4_msgs.msg.dds.CanInterfaceStatus();
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
   
   public void serialize(px4_msgs.msg.dds.CanInterfaceStatus data, us.ihmc.idl.CDR cdr)
   {
      write(data, cdr);
   }

   public void deserialize(px4_msgs.msg.dds.CanInterfaceStatus data, us.ihmc.idl.CDR cdr)
   {
      read(data, cdr);
   }
   
   public void copy(px4_msgs.msg.dds.CanInterfaceStatus src, px4_msgs.msg.dds.CanInterfaceStatus dest)
   {
      staticCopy(src, dest);
   }

   @Override
   public CanInterfaceStatusPubSubType newInstance()
   {
      return new CanInterfaceStatusPubSubType();
   }
}
