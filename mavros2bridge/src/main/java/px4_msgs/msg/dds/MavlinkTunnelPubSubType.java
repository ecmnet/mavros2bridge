package px4_msgs.msg.dds;

/**
* 
* Topic data type of the struct "MavlinkTunnel" defined in "MavlinkTunnel_.idl". Use this class to provide the TopicDataType to a Participant. 
*
* This file was automatically generated from MavlinkTunnel_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit MavlinkTunnel_.idl instead.
*
*/
public class MavlinkTunnelPubSubType implements us.ihmc.pubsub.TopicDataType<px4_msgs.msg.dds.MavlinkTunnel>
{
   public static final java.lang.String name = "px4_msgs::msg::dds_::MavlinkTunnel_";
   
   @Override
   public final java.lang.String getDefinitionChecksum()
   {
   		return "431d99d35e0d4b0dc758289095475747b2e07d6d7330c96bd7a9c42ef9fa0c00";
   }
   
   @Override
   public final java.lang.String getDefinitionVersion()
   {
   		return "";
   }

   private final us.ihmc.idl.CDR serializeCDR = new us.ihmc.idl.CDR();
   private final us.ihmc.idl.CDR deserializeCDR = new us.ihmc.idl.CDR();

   @Override
   public void serialize(px4_msgs.msg.dds.MavlinkTunnel data, us.ihmc.pubsub.common.SerializedPayload serializedPayload) throws java.io.IOException
   {
      serializeCDR.serialize(serializedPayload);
      write(data, serializeCDR);
      serializeCDR.finishSerialize();
   }

   @Override
   public void deserialize(us.ihmc.pubsub.common.SerializedPayload serializedPayload, px4_msgs.msg.dds.MavlinkTunnel data) throws java.io.IOException
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

      current_alignment += 2 + us.ihmc.idl.CDR.alignment(current_alignment, 2);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += ((128) * 1) + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      return current_alignment - initial_alignment;
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.MavlinkTunnel data)
   {
      return getCdrSerializedSize(data, 0);
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.MavlinkTunnel data, int current_alignment)
   {
      int initial_alignment = current_alignment;

      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += 2 + us.ihmc.idl.CDR.alignment(current_alignment, 2);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += ((128) * 1) + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      return current_alignment - initial_alignment;
   }

   public static void write(px4_msgs.msg.dds.MavlinkTunnel data, us.ihmc.idl.CDR cdr)
   {
      cdr.write_type_12(data.getTimestamp());

      cdr.write_type_3(data.getPayloadType());

      cdr.write_type_9(data.getTargetSystem());

      cdr.write_type_9(data.getTargetComponent());

      cdr.write_type_9(data.getPayloadLength());

      for(int i0 = 0; i0 < data.getPayload().length; ++i0)
      {
        	cdr.write_type_9(data.getPayload()[i0]);	
      }

   }

   public static void read(px4_msgs.msg.dds.MavlinkTunnel data, us.ihmc.idl.CDR cdr)
   {
      data.setTimestamp(cdr.read_type_12());
      	
      data.setPayloadType(cdr.read_type_3());
      	
      data.setTargetSystem(cdr.read_type_9());
      	
      data.setTargetComponent(cdr.read_type_9());
      	
      data.setPayloadLength(cdr.read_type_9());
      	
      for(int i0 = 0; i0 < data.getPayload().length; ++i0)
      {
        	data.getPayload()[i0] = cdr.read_type_9();
        	
      }
      	

   }

   @Override
   public final void serialize(px4_msgs.msg.dds.MavlinkTunnel data, us.ihmc.idl.InterchangeSerializer ser)
   {
      ser.write_type_12("timestamp", data.getTimestamp());
      ser.write_type_3("payload_type", data.getPayloadType());
      ser.write_type_9("target_system", data.getTargetSystem());
      ser.write_type_9("target_component", data.getTargetComponent());
      ser.write_type_9("payload_length", data.getPayloadLength());
      ser.write_type_f("payload", data.getPayload());
   }

   @Override
   public final void deserialize(us.ihmc.idl.InterchangeSerializer ser, px4_msgs.msg.dds.MavlinkTunnel data)
   {
      data.setTimestamp(ser.read_type_12("timestamp"));
      data.setPayloadType(ser.read_type_3("payload_type"));
      data.setTargetSystem(ser.read_type_9("target_system"));
      data.setTargetComponent(ser.read_type_9("target_component"));
      data.setPayloadLength(ser.read_type_9("payload_length"));
      ser.read_type_f("payload", data.getPayload());
   }

   public static void staticCopy(px4_msgs.msg.dds.MavlinkTunnel src, px4_msgs.msg.dds.MavlinkTunnel dest)
   {
      dest.set(src);
   }

   @Override
   public px4_msgs.msg.dds.MavlinkTunnel createData()
   {
      return new px4_msgs.msg.dds.MavlinkTunnel();
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
   
   public void serialize(px4_msgs.msg.dds.MavlinkTunnel data, us.ihmc.idl.CDR cdr)
   {
      write(data, cdr);
   }

   public void deserialize(px4_msgs.msg.dds.MavlinkTunnel data, us.ihmc.idl.CDR cdr)
   {
      read(data, cdr);
   }
   
   public void copy(px4_msgs.msg.dds.MavlinkTunnel src, px4_msgs.msg.dds.MavlinkTunnel dest)
   {
      staticCopy(src, dest);
   }

   @Override
   public MavlinkTunnelPubSubType newInstance()
   {
      return new MavlinkTunnelPubSubType();
   }
}
