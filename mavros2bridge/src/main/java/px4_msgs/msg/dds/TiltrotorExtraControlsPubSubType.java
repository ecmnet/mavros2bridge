package px4_msgs.msg.dds;

/**
* 
* Topic data type of the struct "TiltrotorExtraControls" defined in "TiltrotorExtraControls_.idl". Use this class to provide the TopicDataType to a Participant. 
*
* This file was automatically generated from TiltrotorExtraControls_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit TiltrotorExtraControls_.idl instead.
*
*/
public class TiltrotorExtraControlsPubSubType implements us.ihmc.pubsub.TopicDataType<px4_msgs.msg.dds.TiltrotorExtraControls>
{
   public static final java.lang.String name = "px4_msgs::msg::dds_::TiltrotorExtraControls_";
   
   @Override
   public final java.lang.String getDefinitionChecksum()
   {
   		return "3fe0e31da4df02529b8b28a3448c46cf908143bd484e6741271b1903b6416b0b";
   }
   
   @Override
   public final java.lang.String getDefinitionVersion()
   {
   		return "";
   }

   private final us.ihmc.idl.CDR serializeCDR = new us.ihmc.idl.CDR();
   private final us.ihmc.idl.CDR deserializeCDR = new us.ihmc.idl.CDR();

   @Override
   public void serialize(px4_msgs.msg.dds.TiltrotorExtraControls data, us.ihmc.pubsub.common.SerializedPayload serializedPayload) throws java.io.IOException
   {
      serializeCDR.serialize(serializedPayload);
      write(data, serializeCDR);
      serializeCDR.finishSerialize();
   }

   @Override
   public void deserialize(us.ihmc.pubsub.common.SerializedPayload serializedPayload, px4_msgs.msg.dds.TiltrotorExtraControls data) throws java.io.IOException
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

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.TiltrotorExtraControls data)
   {
      return getCdrSerializedSize(data, 0);
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.TiltrotorExtraControls data, int current_alignment)
   {
      int initial_alignment = current_alignment;

      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);



      return current_alignment - initial_alignment;
   }

   public static void write(px4_msgs.msg.dds.TiltrotorExtraControls data, us.ihmc.idl.CDR cdr)
   {
      cdr.write_type_12(data.getTimestamp());

      cdr.write_type_5(data.getCollectiveTiltNormalizedSetpoint());

      cdr.write_type_5(data.getCollectiveThrustNormalizedSetpoint());

   }

   public static void read(px4_msgs.msg.dds.TiltrotorExtraControls data, us.ihmc.idl.CDR cdr)
   {
      data.setTimestamp(cdr.read_type_12());
      	
      data.setCollectiveTiltNormalizedSetpoint(cdr.read_type_5());
      	
      data.setCollectiveThrustNormalizedSetpoint(cdr.read_type_5());
      	

   }

   @Override
   public final void serialize(px4_msgs.msg.dds.TiltrotorExtraControls data, us.ihmc.idl.InterchangeSerializer ser)
   {
      ser.write_type_12("timestamp", data.getTimestamp());
      ser.write_type_5("collective_tilt_normalized_setpoint", data.getCollectiveTiltNormalizedSetpoint());
      ser.write_type_5("collective_thrust_normalized_setpoint", data.getCollectiveThrustNormalizedSetpoint());
   }

   @Override
   public final void deserialize(us.ihmc.idl.InterchangeSerializer ser, px4_msgs.msg.dds.TiltrotorExtraControls data)
   {
      data.setTimestamp(ser.read_type_12("timestamp"));
      data.setCollectiveTiltNormalizedSetpoint(ser.read_type_5("collective_tilt_normalized_setpoint"));
      data.setCollectiveThrustNormalizedSetpoint(ser.read_type_5("collective_thrust_normalized_setpoint"));
   }

   public static void staticCopy(px4_msgs.msg.dds.TiltrotorExtraControls src, px4_msgs.msg.dds.TiltrotorExtraControls dest)
   {
      dest.set(src);
   }

   @Override
   public px4_msgs.msg.dds.TiltrotorExtraControls createData()
   {
      return new px4_msgs.msg.dds.TiltrotorExtraControls();
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
   
   public void serialize(px4_msgs.msg.dds.TiltrotorExtraControls data, us.ihmc.idl.CDR cdr)
   {
      write(data, cdr);
   }

   public void deserialize(px4_msgs.msg.dds.TiltrotorExtraControls data, us.ihmc.idl.CDR cdr)
   {
      read(data, cdr);
   }
   
   public void copy(px4_msgs.msg.dds.TiltrotorExtraControls src, px4_msgs.msg.dds.TiltrotorExtraControls dest)
   {
      staticCopy(src, dest);
   }

   @Override
   public TiltrotorExtraControlsPubSubType newInstance()
   {
      return new TiltrotorExtraControlsPubSubType();
   }
}
