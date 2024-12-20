package px4_msgs.msg.dds;

/**
* 
* Topic data type of the struct "VelocityLimits" defined in "VelocityLimits_.idl". Use this class to provide the TopicDataType to a Participant. 
*
* This file was automatically generated from VelocityLimits_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit VelocityLimits_.idl instead.
*
*/
public class VelocityLimitsPubSubType implements us.ihmc.pubsub.TopicDataType<px4_msgs.msg.dds.VelocityLimits>
{
   public static final java.lang.String name = "px4_msgs::msg::dds_::VelocityLimits_";
   
   @Override
   public final java.lang.String getDefinitionChecksum()
   {
   		return "d0de45809dbc537c2919f3f35ca9ec3819af0a7c3c89de494de773583e0c9d96";
   }
   
   @Override
   public final java.lang.String getDefinitionVersion()
   {
   		return "";
   }

   private final us.ihmc.idl.CDR serializeCDR = new us.ihmc.idl.CDR();
   private final us.ihmc.idl.CDR deserializeCDR = new us.ihmc.idl.CDR();

   @Override
   public void serialize(px4_msgs.msg.dds.VelocityLimits data, us.ihmc.pubsub.common.SerializedPayload serializedPayload) throws java.io.IOException
   {
      serializeCDR.serialize(serializedPayload);
      write(data, serializeCDR);
      serializeCDR.finishSerialize();
   }

   @Override
   public void deserialize(us.ihmc.pubsub.common.SerializedPayload serializedPayload, px4_msgs.msg.dds.VelocityLimits data) throws java.io.IOException
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


      return current_alignment - initial_alignment;
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.VelocityLimits data)
   {
      return getCdrSerializedSize(data, 0);
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.VelocityLimits data, int current_alignment)
   {
      int initial_alignment = current_alignment;

      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);



      return current_alignment - initial_alignment;
   }

   public static void write(px4_msgs.msg.dds.VelocityLimits data, us.ihmc.idl.CDR cdr)
   {
      cdr.write_type_12(data.getTimestamp());

      cdr.write_type_5(data.getHorizontalVelocity());

      cdr.write_type_5(data.getVerticalVelocity());

      cdr.write_type_5(data.getYawRate());

   }

   public static void read(px4_msgs.msg.dds.VelocityLimits data, us.ihmc.idl.CDR cdr)
   {
      data.setTimestamp(cdr.read_type_12());
      	
      data.setHorizontalVelocity(cdr.read_type_5());
      	
      data.setVerticalVelocity(cdr.read_type_5());
      	
      data.setYawRate(cdr.read_type_5());
      	

   }

   @Override
   public final void serialize(px4_msgs.msg.dds.VelocityLimits data, us.ihmc.idl.InterchangeSerializer ser)
   {
      ser.write_type_12("timestamp", data.getTimestamp());
      ser.write_type_5("horizontal_velocity", data.getHorizontalVelocity());
      ser.write_type_5("vertical_velocity", data.getVerticalVelocity());
      ser.write_type_5("yaw_rate", data.getYawRate());
   }

   @Override
   public final void deserialize(us.ihmc.idl.InterchangeSerializer ser, px4_msgs.msg.dds.VelocityLimits data)
   {
      data.setTimestamp(ser.read_type_12("timestamp"));
      data.setHorizontalVelocity(ser.read_type_5("horizontal_velocity"));
      data.setVerticalVelocity(ser.read_type_5("vertical_velocity"));
      data.setYawRate(ser.read_type_5("yaw_rate"));
   }

   public static void staticCopy(px4_msgs.msg.dds.VelocityLimits src, px4_msgs.msg.dds.VelocityLimits dest)
   {
      dest.set(src);
   }

   @Override
   public px4_msgs.msg.dds.VelocityLimits createData()
   {
      return new px4_msgs.msg.dds.VelocityLimits();
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
   
   public void serialize(px4_msgs.msg.dds.VelocityLimits data, us.ihmc.idl.CDR cdr)
   {
      write(data, cdr);
   }

   public void deserialize(px4_msgs.msg.dds.VelocityLimits data, us.ihmc.idl.CDR cdr)
   {
      read(data, cdr);
   }
   
   public void copy(px4_msgs.msg.dds.VelocityLimits src, px4_msgs.msg.dds.VelocityLimits dest)
   {
      staticCopy(src, dest);
   }

   @Override
   public VelocityLimitsPubSubType newInstance()
   {
      return new VelocityLimitsPubSubType();
   }
}
