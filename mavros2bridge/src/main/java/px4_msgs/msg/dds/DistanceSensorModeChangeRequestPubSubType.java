package px4_msgs.msg.dds;

/**
* 
* Topic data type of the struct "DistanceSensorModeChangeRequest" defined in "DistanceSensorModeChangeRequest_.idl". Use this class to provide the TopicDataType to a Participant. 
*
* This file was automatically generated from DistanceSensorModeChangeRequest_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit DistanceSensorModeChangeRequest_.idl instead.
*
*/
public class DistanceSensorModeChangeRequestPubSubType implements us.ihmc.pubsub.TopicDataType<px4_msgs.msg.dds.DistanceSensorModeChangeRequest>
{
   public static final java.lang.String name = "px4_msgs::msg::dds_::DistanceSensorModeChangeRequest_";
   
   @Override
   public final java.lang.String getDefinitionChecksum()
   {
   		return "c0d8e46b92a9fa09484d2dabcbecbc8ec18ac4c93baa2788b130d95e460231eb";
   }
   
   @Override
   public final java.lang.String getDefinitionVersion()
   {
   		return "";
   }

   private final us.ihmc.idl.CDR serializeCDR = new us.ihmc.idl.CDR();
   private final us.ihmc.idl.CDR deserializeCDR = new us.ihmc.idl.CDR();

   @Override
   public void serialize(px4_msgs.msg.dds.DistanceSensorModeChangeRequest data, us.ihmc.pubsub.common.SerializedPayload serializedPayload) throws java.io.IOException
   {
      serializeCDR.serialize(serializedPayload);
      write(data, serializeCDR);
      serializeCDR.finishSerialize();
   }

   @Override
   public void deserialize(us.ihmc.pubsub.common.SerializedPayload serializedPayload, px4_msgs.msg.dds.DistanceSensorModeChangeRequest data) throws java.io.IOException
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


      return current_alignment - initial_alignment;
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.DistanceSensorModeChangeRequest data)
   {
      return getCdrSerializedSize(data, 0);
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.DistanceSensorModeChangeRequest data, int current_alignment)
   {
      int initial_alignment = current_alignment;

      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);



      return current_alignment - initial_alignment;
   }

   public static void write(px4_msgs.msg.dds.DistanceSensorModeChangeRequest data, us.ihmc.idl.CDR cdr)
   {
      cdr.write_type_12(data.getTimestamp());

      cdr.write_type_9(data.getRequestOnOff());

   }

   public static void read(px4_msgs.msg.dds.DistanceSensorModeChangeRequest data, us.ihmc.idl.CDR cdr)
   {
      data.setTimestamp(cdr.read_type_12());
      	
      data.setRequestOnOff(cdr.read_type_9());
      	

   }

   @Override
   public final void serialize(px4_msgs.msg.dds.DistanceSensorModeChangeRequest data, us.ihmc.idl.InterchangeSerializer ser)
   {
      ser.write_type_12("timestamp", data.getTimestamp());
      ser.write_type_9("request_on_off", data.getRequestOnOff());
   }

   @Override
   public final void deserialize(us.ihmc.idl.InterchangeSerializer ser, px4_msgs.msg.dds.DistanceSensorModeChangeRequest data)
   {
      data.setTimestamp(ser.read_type_12("timestamp"));
      data.setRequestOnOff(ser.read_type_9("request_on_off"));
   }

   public static void staticCopy(px4_msgs.msg.dds.DistanceSensorModeChangeRequest src, px4_msgs.msg.dds.DistanceSensorModeChangeRequest dest)
   {
      dest.set(src);
   }

   @Override
   public px4_msgs.msg.dds.DistanceSensorModeChangeRequest createData()
   {
      return new px4_msgs.msg.dds.DistanceSensorModeChangeRequest();
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
   
   public void serialize(px4_msgs.msg.dds.DistanceSensorModeChangeRequest data, us.ihmc.idl.CDR cdr)
   {
      write(data, cdr);
   }

   public void deserialize(px4_msgs.msg.dds.DistanceSensorModeChangeRequest data, us.ihmc.idl.CDR cdr)
   {
      read(data, cdr);
   }
   
   public void copy(px4_msgs.msg.dds.DistanceSensorModeChangeRequest src, px4_msgs.msg.dds.DistanceSensorModeChangeRequest dest)
   {
      staticCopy(src, dest);
   }

   @Override
   public DistanceSensorModeChangeRequestPubSubType newInstance()
   {
      return new DistanceSensorModeChangeRequestPubSubType();
   }
}
