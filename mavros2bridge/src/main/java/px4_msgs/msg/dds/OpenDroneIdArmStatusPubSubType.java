package px4_msgs.msg.dds;

/**
* 
* Topic data type of the struct "OpenDroneIdArmStatus" defined in "OpenDroneIdArmStatus_.idl". Use this class to provide the TopicDataType to a Participant. 
*
* This file was automatically generated from OpenDroneIdArmStatus_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit OpenDroneIdArmStatus_.idl instead.
*
*/
public class OpenDroneIdArmStatusPubSubType implements us.ihmc.pubsub.TopicDataType<px4_msgs.msg.dds.OpenDroneIdArmStatus>
{
   public static final java.lang.String name = "px4_msgs::msg::dds_::OpenDroneIdArmStatus_";
   
   @Override
   public final java.lang.String getDefinitionChecksum()
   {
   		return "c5054f13273f51572c89d0929596f154fd9f232bfcd63180248ba429acaccf3d";
   }
   
   @Override
   public final java.lang.String getDefinitionVersion()
   {
   		return "";
   }

   private final us.ihmc.idl.CDR serializeCDR = new us.ihmc.idl.CDR();
   private final us.ihmc.idl.CDR deserializeCDR = new us.ihmc.idl.CDR();

   @Override
   public void serialize(px4_msgs.msg.dds.OpenDroneIdArmStatus data, us.ihmc.pubsub.common.SerializedPayload serializedPayload) throws java.io.IOException
   {
      serializeCDR.serialize(serializedPayload);
      write(data, serializeCDR);
      serializeCDR.finishSerialize();
   }

   @Override
   public void deserialize(us.ihmc.pubsub.common.SerializedPayload serializedPayload, px4_msgs.msg.dds.OpenDroneIdArmStatus data) throws java.io.IOException
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

      current_alignment += ((50) * 1) + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      return current_alignment - initial_alignment;
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.OpenDroneIdArmStatus data)
   {
      return getCdrSerializedSize(data, 0);
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.OpenDroneIdArmStatus data, int current_alignment)
   {
      int initial_alignment = current_alignment;

      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += ((50) * 1) + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      return current_alignment - initial_alignment;
   }

   public static void write(px4_msgs.msg.dds.OpenDroneIdArmStatus data, us.ihmc.idl.CDR cdr)
   {
      cdr.write_type_12(data.getTimestamp());

      cdr.write_type_9(data.getStatus());

      for(int i0 = 0; i0 < data.getError().length; ++i0)
      {
        	cdr.write_type_8(data.getError()[i0]);	
      }

   }

   public static void read(px4_msgs.msg.dds.OpenDroneIdArmStatus data, us.ihmc.idl.CDR cdr)
   {
      data.setTimestamp(cdr.read_type_12());
      	
      data.setStatus(cdr.read_type_9());
      	
      for(int i0 = 0; i0 < data.getError().length; ++i0)
      {
        	data.getError()[i0] = cdr.read_type_8();
        	
      }
      	

   }

   @Override
   public final void serialize(px4_msgs.msg.dds.OpenDroneIdArmStatus data, us.ihmc.idl.InterchangeSerializer ser)
   {
      ser.write_type_12("timestamp", data.getTimestamp());
      ser.write_type_9("status", data.getStatus());
      ser.write_type_f("error", data.getError());
   }

   @Override
   public final void deserialize(us.ihmc.idl.InterchangeSerializer ser, px4_msgs.msg.dds.OpenDroneIdArmStatus data)
   {
      data.setTimestamp(ser.read_type_12("timestamp"));
      data.setStatus(ser.read_type_9("status"));
      ser.read_type_f("error", data.getError());
   }

   public static void staticCopy(px4_msgs.msg.dds.OpenDroneIdArmStatus src, px4_msgs.msg.dds.OpenDroneIdArmStatus dest)
   {
      dest.set(src);
   }

   @Override
   public px4_msgs.msg.dds.OpenDroneIdArmStatus createData()
   {
      return new px4_msgs.msg.dds.OpenDroneIdArmStatus();
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
   
   public void serialize(px4_msgs.msg.dds.OpenDroneIdArmStatus data, us.ihmc.idl.CDR cdr)
   {
      write(data, cdr);
   }

   public void deserialize(px4_msgs.msg.dds.OpenDroneIdArmStatus data, us.ihmc.idl.CDR cdr)
   {
      read(data, cdr);
   }
   
   public void copy(px4_msgs.msg.dds.OpenDroneIdArmStatus src, px4_msgs.msg.dds.OpenDroneIdArmStatus dest)
   {
      staticCopy(src, dest);
   }

   @Override
   public OpenDroneIdArmStatusPubSubType newInstance()
   {
      return new OpenDroneIdArmStatusPubSubType();
   }
}
