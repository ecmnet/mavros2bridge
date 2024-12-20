package px4_msgs.msg.dds;

/**
* 
* Topic data type of the struct "MavlinkLog" defined in "MavlinkLog_.idl". Use this class to provide the TopicDataType to a Participant. 
*
* This file was automatically generated from MavlinkLog_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit MavlinkLog_.idl instead.
*
*/
public class MavlinkLogPubSubType implements us.ihmc.pubsub.TopicDataType<px4_msgs.msg.dds.MavlinkLog>
{
   public static final java.lang.String name = "px4_msgs::msg::dds_::MavlinkLog_";
   
   @Override
   public final java.lang.String getDefinitionChecksum()
   {
   		return "47762e34bda385271906e0d832ea7e334113610666fd0c3cb1d684db756ad914";
   }
   
   @Override
   public final java.lang.String getDefinitionVersion()
   {
   		return "";
   }

   private final us.ihmc.idl.CDR serializeCDR = new us.ihmc.idl.CDR();
   private final us.ihmc.idl.CDR deserializeCDR = new us.ihmc.idl.CDR();

   @Override
   public void serialize(px4_msgs.msg.dds.MavlinkLog data, us.ihmc.pubsub.common.SerializedPayload serializedPayload) throws java.io.IOException
   {
      serializeCDR.serialize(serializedPayload);
      write(data, serializeCDR);
      serializeCDR.finishSerialize();
   }

   @Override
   public void deserialize(us.ihmc.pubsub.common.SerializedPayload serializedPayload, px4_msgs.msg.dds.MavlinkLog data) throws java.io.IOException
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

      current_alignment += ((127) * 1) + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      return current_alignment - initial_alignment;
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.MavlinkLog data)
   {
      return getCdrSerializedSize(data, 0);
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.MavlinkLog data, int current_alignment)
   {
      int initial_alignment = current_alignment;

      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += ((127) * 1) + us.ihmc.idl.CDR.alignment(current_alignment, 1);
      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);



      return current_alignment - initial_alignment;
   }

   public static void write(px4_msgs.msg.dds.MavlinkLog data, us.ihmc.idl.CDR cdr)
   {
      cdr.write_type_12(data.getTimestamp());

      for(int i0 = 0; i0 < data.getText().length; ++i0)
      {
        	cdr.write_type_8(data.getText()[i0]);	
      }

      cdr.write_type_9(data.getSeverity());

   }

   public static void read(px4_msgs.msg.dds.MavlinkLog data, us.ihmc.idl.CDR cdr)
   {
      data.setTimestamp(cdr.read_type_12());
      	
      for(int i0 = 0; i0 < data.getText().length; ++i0)
      {
        	data.getText()[i0] = cdr.read_type_8();
        	
      }
      	
      data.setSeverity(cdr.read_type_9());
      	

   }

   @Override
   public final void serialize(px4_msgs.msg.dds.MavlinkLog data, us.ihmc.idl.InterchangeSerializer ser)
   {
      ser.write_type_12("timestamp", data.getTimestamp());
      ser.write_type_f("text", data.getText());
      ser.write_type_9("severity", data.getSeverity());
   }

   @Override
   public final void deserialize(us.ihmc.idl.InterchangeSerializer ser, px4_msgs.msg.dds.MavlinkLog data)
   {
      data.setTimestamp(ser.read_type_12("timestamp"));
      ser.read_type_f("text", data.getText());
      data.setSeverity(ser.read_type_9("severity"));
   }

   public static void staticCopy(px4_msgs.msg.dds.MavlinkLog src, px4_msgs.msg.dds.MavlinkLog dest)
   {
      dest.set(src);
   }

   @Override
   public px4_msgs.msg.dds.MavlinkLog createData()
   {
      return new px4_msgs.msg.dds.MavlinkLog();
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
   
   public void serialize(px4_msgs.msg.dds.MavlinkLog data, us.ihmc.idl.CDR cdr)
   {
      write(data, cdr);
   }

   public void deserialize(px4_msgs.msg.dds.MavlinkLog data, us.ihmc.idl.CDR cdr)
   {
      read(data, cdr);
   }
   
   public void copy(px4_msgs.msg.dds.MavlinkLog src, px4_msgs.msg.dds.MavlinkLog dest)
   {
      staticCopy(src, dest);
   }

   @Override
   public MavlinkLogPubSubType newInstance()
   {
      return new MavlinkLogPubSubType();
   }
}
