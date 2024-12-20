package px4_msgs.msg.dds;

/**
* 
* Topic data type of the struct "GpsInjectData" defined in "GpsInjectData_.idl". Use this class to provide the TopicDataType to a Participant. 
*
* This file was automatically generated from GpsInjectData_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit GpsInjectData_.idl instead.
*
*/
public class GpsInjectDataPubSubType implements us.ihmc.pubsub.TopicDataType<px4_msgs.msg.dds.GpsInjectData>
{
   public static final java.lang.String name = "px4_msgs::msg::dds_::GpsInjectData_";
   
   @Override
   public final java.lang.String getDefinitionChecksum()
   {
   		return "d7b4416e2f849a5cf4306928fe4cf2225042fb8f92d0c94bd99f858f55a04a39";
   }
   
   @Override
   public final java.lang.String getDefinitionVersion()
   {
   		return "";
   }

   private final us.ihmc.idl.CDR serializeCDR = new us.ihmc.idl.CDR();
   private final us.ihmc.idl.CDR deserializeCDR = new us.ihmc.idl.CDR();

   @Override
   public void serialize(px4_msgs.msg.dds.GpsInjectData data, us.ihmc.pubsub.common.SerializedPayload serializedPayload) throws java.io.IOException
   {
      serializeCDR.serialize(serializedPayload);
      write(data, serializeCDR);
      serializeCDR.finishSerialize();
   }

   @Override
   public void deserialize(us.ihmc.pubsub.common.SerializedPayload serializedPayload, px4_msgs.msg.dds.GpsInjectData data) throws java.io.IOException
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

      current_alignment += 2 + us.ihmc.idl.CDR.alignment(current_alignment, 2);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += ((300) * 1) + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      return current_alignment - initial_alignment;
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.GpsInjectData data)
   {
      return getCdrSerializedSize(data, 0);
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.GpsInjectData data, int current_alignment)
   {
      int initial_alignment = current_alignment;

      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 2 + us.ihmc.idl.CDR.alignment(current_alignment, 2);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += ((300) * 1) + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      return current_alignment - initial_alignment;
   }

   public static void write(px4_msgs.msg.dds.GpsInjectData data, us.ihmc.idl.CDR cdr)
   {
      cdr.write_type_12(data.getTimestamp());

      cdr.write_type_4(data.getDeviceId());

      cdr.write_type_3(data.getLen());

      cdr.write_type_9(data.getFlags());

      for(int i0 = 0; i0 < data.getData().length; ++i0)
      {
        	cdr.write_type_9(data.getData()[i0]);	
      }

   }

   public static void read(px4_msgs.msg.dds.GpsInjectData data, us.ihmc.idl.CDR cdr)
   {
      data.setTimestamp(cdr.read_type_12());
      	
      data.setDeviceId(cdr.read_type_4());
      	
      data.setLen(cdr.read_type_3());
      	
      data.setFlags(cdr.read_type_9());
      	
      for(int i0 = 0; i0 < data.getData().length; ++i0)
      {
        	data.getData()[i0] = cdr.read_type_9();
        	
      }
      	

   }

   @Override
   public final void serialize(px4_msgs.msg.dds.GpsInjectData data, us.ihmc.idl.InterchangeSerializer ser)
   {
      ser.write_type_12("timestamp", data.getTimestamp());
      ser.write_type_4("device_id", data.getDeviceId());
      ser.write_type_3("len", data.getLen());
      ser.write_type_9("flags", data.getFlags());
      ser.write_type_f("data", data.getData());
   }

   @Override
   public final void deserialize(us.ihmc.idl.InterchangeSerializer ser, px4_msgs.msg.dds.GpsInjectData data)
   {
      data.setTimestamp(ser.read_type_12("timestamp"));
      data.setDeviceId(ser.read_type_4("device_id"));
      data.setLen(ser.read_type_3("len"));
      data.setFlags(ser.read_type_9("flags"));
      ser.read_type_f("data", data.getData());
   }

   public static void staticCopy(px4_msgs.msg.dds.GpsInjectData src, px4_msgs.msg.dds.GpsInjectData dest)
   {
      dest.set(src);
   }

   @Override
   public px4_msgs.msg.dds.GpsInjectData createData()
   {
      return new px4_msgs.msg.dds.GpsInjectData();
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
   
   public void serialize(px4_msgs.msg.dds.GpsInjectData data, us.ihmc.idl.CDR cdr)
   {
      write(data, cdr);
   }

   public void deserialize(px4_msgs.msg.dds.GpsInjectData data, us.ihmc.idl.CDR cdr)
   {
      read(data, cdr);
   }
   
   public void copy(px4_msgs.msg.dds.GpsInjectData src, px4_msgs.msg.dds.GpsInjectData dest)
   {
      staticCopy(src, dest);
   }

   @Override
   public GpsInjectDataPubSubType newInstance()
   {
      return new GpsInjectDataPubSubType();
   }
}
