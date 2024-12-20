package px4_msgs.msg.dds;

/**
* 
* Topic data type of the struct "CameraStatus" defined in "CameraStatus_.idl". Use this class to provide the TopicDataType to a Participant. 
*
* This file was automatically generated from CameraStatus_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit CameraStatus_.idl instead.
*
*/
public class CameraStatusPubSubType implements us.ihmc.pubsub.TopicDataType<px4_msgs.msg.dds.CameraStatus>
{
   public static final java.lang.String name = "px4_msgs::msg::dds_::CameraStatus_";
   
   @Override
   public final java.lang.String getDefinitionChecksum()
   {
   		return "bdb8f5743ee6d21670c8e3641aaf05cd1e6a71e6491014eee9729fe480bbc40f";
   }
   
   @Override
   public final java.lang.String getDefinitionVersion()
   {
   		return "";
   }

   private final us.ihmc.idl.CDR serializeCDR = new us.ihmc.idl.CDR();
   private final us.ihmc.idl.CDR deserializeCDR = new us.ihmc.idl.CDR();

   @Override
   public void serialize(px4_msgs.msg.dds.CameraStatus data, us.ihmc.pubsub.common.SerializedPayload serializedPayload) throws java.io.IOException
   {
      serializeCDR.serialize(serializedPayload);
      write(data, serializeCDR);
      serializeCDR.finishSerialize();
   }

   @Override
   public void deserialize(us.ihmc.pubsub.common.SerializedPayload serializedPayload, px4_msgs.msg.dds.CameraStatus data) throws java.io.IOException
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


      return current_alignment - initial_alignment;
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.CameraStatus data)
   {
      return getCdrSerializedSize(data, 0);
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.CameraStatus data, int current_alignment)
   {
      int initial_alignment = current_alignment;

      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);



      return current_alignment - initial_alignment;
   }

   public static void write(px4_msgs.msg.dds.CameraStatus data, us.ihmc.idl.CDR cdr)
   {
      cdr.write_type_12(data.getTimestamp());

      cdr.write_type_9(data.getActiveSysId());

      cdr.write_type_9(data.getActiveCompId());

   }

   public static void read(px4_msgs.msg.dds.CameraStatus data, us.ihmc.idl.CDR cdr)
   {
      data.setTimestamp(cdr.read_type_12());
      	
      data.setActiveSysId(cdr.read_type_9());
      	
      data.setActiveCompId(cdr.read_type_9());
      	

   }

   @Override
   public final void serialize(px4_msgs.msg.dds.CameraStatus data, us.ihmc.idl.InterchangeSerializer ser)
   {
      ser.write_type_12("timestamp", data.getTimestamp());
      ser.write_type_9("active_sys_id", data.getActiveSysId());
      ser.write_type_9("active_comp_id", data.getActiveCompId());
   }

   @Override
   public final void deserialize(us.ihmc.idl.InterchangeSerializer ser, px4_msgs.msg.dds.CameraStatus data)
   {
      data.setTimestamp(ser.read_type_12("timestamp"));
      data.setActiveSysId(ser.read_type_9("active_sys_id"));
      data.setActiveCompId(ser.read_type_9("active_comp_id"));
   }

   public static void staticCopy(px4_msgs.msg.dds.CameraStatus src, px4_msgs.msg.dds.CameraStatus dest)
   {
      dest.set(src);
   }

   @Override
   public px4_msgs.msg.dds.CameraStatus createData()
   {
      return new px4_msgs.msg.dds.CameraStatus();
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
   
   public void serialize(px4_msgs.msg.dds.CameraStatus data, us.ihmc.idl.CDR cdr)
   {
      write(data, cdr);
   }

   public void deserialize(px4_msgs.msg.dds.CameraStatus data, us.ihmc.idl.CDR cdr)
   {
      read(data, cdr);
   }
   
   public void copy(px4_msgs.msg.dds.CameraStatus src, px4_msgs.msg.dds.CameraStatus dest)
   {
      staticCopy(src, dest);
   }

   @Override
   public CameraStatusPubSubType newInstance()
   {
      return new CameraStatusPubSubType();
   }
}
