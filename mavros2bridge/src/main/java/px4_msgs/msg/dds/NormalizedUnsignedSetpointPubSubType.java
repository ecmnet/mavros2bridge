package px4_msgs.msg.dds;

/**
* 
* Topic data type of the struct "NormalizedUnsignedSetpoint" defined in "NormalizedUnsignedSetpoint_.idl". Use this class to provide the TopicDataType to a Participant. 
*
* This file was automatically generated from NormalizedUnsignedSetpoint_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit NormalizedUnsignedSetpoint_.idl instead.
*
*/
public class NormalizedUnsignedSetpointPubSubType implements us.ihmc.pubsub.TopicDataType<px4_msgs.msg.dds.NormalizedUnsignedSetpoint>
{
   public static final java.lang.String name = "px4_msgs::msg::dds_::NormalizedUnsignedSetpoint_";
   
   @Override
   public final java.lang.String getDefinitionChecksum()
   {
   		return "662880e239d2895cf6fc333520a83d7226c6fa1a28d2ac1eb89751600097c1e2";
   }
   
   @Override
   public final java.lang.String getDefinitionVersion()
   {
   		return "";
   }

   private final us.ihmc.idl.CDR serializeCDR = new us.ihmc.idl.CDR();
   private final us.ihmc.idl.CDR deserializeCDR = new us.ihmc.idl.CDR();

   @Override
   public void serialize(px4_msgs.msg.dds.NormalizedUnsignedSetpoint data, us.ihmc.pubsub.common.SerializedPayload serializedPayload) throws java.io.IOException
   {
      serializeCDR.serialize(serializedPayload);
      write(data, serializeCDR);
      serializeCDR.finishSerialize();
   }

   @Override
   public void deserialize(us.ihmc.pubsub.common.SerializedPayload serializedPayload, px4_msgs.msg.dds.NormalizedUnsignedSetpoint data) throws java.io.IOException
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


      return current_alignment - initial_alignment;
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.NormalizedUnsignedSetpoint data)
   {
      return getCdrSerializedSize(data, 0);
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.NormalizedUnsignedSetpoint data, int current_alignment)
   {
      int initial_alignment = current_alignment;

      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);



      return current_alignment - initial_alignment;
   }

   public static void write(px4_msgs.msg.dds.NormalizedUnsignedSetpoint data, us.ihmc.idl.CDR cdr)
   {
      cdr.write_type_12(data.getTimestamp());

      cdr.write_type_5(data.getNormalizedSetpoint());

   }

   public static void read(px4_msgs.msg.dds.NormalizedUnsignedSetpoint data, us.ihmc.idl.CDR cdr)
   {
      data.setTimestamp(cdr.read_type_12());
      	
      data.setNormalizedSetpoint(cdr.read_type_5());
      	

   }

   @Override
   public final void serialize(px4_msgs.msg.dds.NormalizedUnsignedSetpoint data, us.ihmc.idl.InterchangeSerializer ser)
   {
      ser.write_type_12("timestamp", data.getTimestamp());
      ser.write_type_5("normalized_setpoint", data.getNormalizedSetpoint());
   }

   @Override
   public final void deserialize(us.ihmc.idl.InterchangeSerializer ser, px4_msgs.msg.dds.NormalizedUnsignedSetpoint data)
   {
      data.setTimestamp(ser.read_type_12("timestamp"));
      data.setNormalizedSetpoint(ser.read_type_5("normalized_setpoint"));
   }

   public static void staticCopy(px4_msgs.msg.dds.NormalizedUnsignedSetpoint src, px4_msgs.msg.dds.NormalizedUnsignedSetpoint dest)
   {
      dest.set(src);
   }

   @Override
   public px4_msgs.msg.dds.NormalizedUnsignedSetpoint createData()
   {
      return new px4_msgs.msg.dds.NormalizedUnsignedSetpoint();
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
   
   public void serialize(px4_msgs.msg.dds.NormalizedUnsignedSetpoint data, us.ihmc.idl.CDR cdr)
   {
      write(data, cdr);
   }

   public void deserialize(px4_msgs.msg.dds.NormalizedUnsignedSetpoint data, us.ihmc.idl.CDR cdr)
   {
      read(data, cdr);
   }
   
   public void copy(px4_msgs.msg.dds.NormalizedUnsignedSetpoint src, px4_msgs.msg.dds.NormalizedUnsignedSetpoint dest)
   {
      staticCopy(src, dest);
   }

   @Override
   public NormalizedUnsignedSetpointPubSubType newInstance()
   {
      return new NormalizedUnsignedSetpointPubSubType();
   }
}
