package px4_msgs.msg.dds;

/**
* 
* Topic data type of the struct "ParameterUpdate" defined in "ParameterUpdate_.idl". Use this class to provide the TopicDataType to a Participant. 
*
* This file was automatically generated from ParameterUpdate_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit ParameterUpdate_.idl instead.
*
*/
public class ParameterUpdatePubSubType implements us.ihmc.pubsub.TopicDataType<px4_msgs.msg.dds.ParameterUpdate>
{
   public static final java.lang.String name = "px4_msgs::msg::dds_::ParameterUpdate_";
   
   @Override
   public final java.lang.String getDefinitionChecksum()
   {
   		return "a2e793902cb7f6e3a366fdb11b450b867acb5ad671c825ed4abd2b7b1354f017";
   }
   
   @Override
   public final java.lang.String getDefinitionVersion()
   {
   		return "";
   }

   private final us.ihmc.idl.CDR serializeCDR = new us.ihmc.idl.CDR();
   private final us.ihmc.idl.CDR deserializeCDR = new us.ihmc.idl.CDR();

   @Override
   public void serialize(px4_msgs.msg.dds.ParameterUpdate data, us.ihmc.pubsub.common.SerializedPayload serializedPayload) throws java.io.IOException
   {
      serializeCDR.serialize(serializedPayload);
      write(data, serializeCDR);
      serializeCDR.finishSerialize();
   }

   @Override
   public void deserialize(us.ihmc.pubsub.common.SerializedPayload serializedPayload, px4_msgs.msg.dds.ParameterUpdate data) throws java.io.IOException
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

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 2 + us.ihmc.idl.CDR.alignment(current_alignment, 2);

      current_alignment += 2 + us.ihmc.idl.CDR.alignment(current_alignment, 2);

      current_alignment += 2 + us.ihmc.idl.CDR.alignment(current_alignment, 2);


      return current_alignment - initial_alignment;
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.ParameterUpdate data)
   {
      return getCdrSerializedSize(data, 0);
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.ParameterUpdate data, int current_alignment)
   {
      int initial_alignment = current_alignment;

      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 2 + us.ihmc.idl.CDR.alignment(current_alignment, 2);


      current_alignment += 2 + us.ihmc.idl.CDR.alignment(current_alignment, 2);


      current_alignment += 2 + us.ihmc.idl.CDR.alignment(current_alignment, 2);



      return current_alignment - initial_alignment;
   }

   public static void write(px4_msgs.msg.dds.ParameterUpdate data, us.ihmc.idl.CDR cdr)
   {
      cdr.write_type_12(data.getTimestamp());

      cdr.write_type_4(data.getInstance());

      cdr.write_type_4(data.getGetCount());

      cdr.write_type_4(data.getSetCount());

      cdr.write_type_4(data.getFindCount());

      cdr.write_type_4(data.getExportCount());

      cdr.write_type_3(data.getActive());

      cdr.write_type_3(data.getChanged());

      cdr.write_type_3(data.getCustomDefault());

   }

   public static void read(px4_msgs.msg.dds.ParameterUpdate data, us.ihmc.idl.CDR cdr)
   {
      data.setTimestamp(cdr.read_type_12());
      	
      data.setInstance(cdr.read_type_4());
      	
      data.setGetCount(cdr.read_type_4());
      	
      data.setSetCount(cdr.read_type_4());
      	
      data.setFindCount(cdr.read_type_4());
      	
      data.setExportCount(cdr.read_type_4());
      	
      data.setActive(cdr.read_type_3());
      	
      data.setChanged(cdr.read_type_3());
      	
      data.setCustomDefault(cdr.read_type_3());
      	

   }

   @Override
   public final void serialize(px4_msgs.msg.dds.ParameterUpdate data, us.ihmc.idl.InterchangeSerializer ser)
   {
      ser.write_type_12("timestamp", data.getTimestamp());
      ser.write_type_4("instance", data.getInstance());
      ser.write_type_4("get_count", data.getGetCount());
      ser.write_type_4("set_count", data.getSetCount());
      ser.write_type_4("find_count", data.getFindCount());
      ser.write_type_4("export_count", data.getExportCount());
      ser.write_type_3("active", data.getActive());
      ser.write_type_3("changed", data.getChanged());
      ser.write_type_3("custom_default", data.getCustomDefault());
   }

   @Override
   public final void deserialize(us.ihmc.idl.InterchangeSerializer ser, px4_msgs.msg.dds.ParameterUpdate data)
   {
      data.setTimestamp(ser.read_type_12("timestamp"));
      data.setInstance(ser.read_type_4("instance"));
      data.setGetCount(ser.read_type_4("get_count"));
      data.setSetCount(ser.read_type_4("set_count"));
      data.setFindCount(ser.read_type_4("find_count"));
      data.setExportCount(ser.read_type_4("export_count"));
      data.setActive(ser.read_type_3("active"));
      data.setChanged(ser.read_type_3("changed"));
      data.setCustomDefault(ser.read_type_3("custom_default"));
   }

   public static void staticCopy(px4_msgs.msg.dds.ParameterUpdate src, px4_msgs.msg.dds.ParameterUpdate dest)
   {
      dest.set(src);
   }

   @Override
   public px4_msgs.msg.dds.ParameterUpdate createData()
   {
      return new px4_msgs.msg.dds.ParameterUpdate();
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
   
   public void serialize(px4_msgs.msg.dds.ParameterUpdate data, us.ihmc.idl.CDR cdr)
   {
      write(data, cdr);
   }

   public void deserialize(px4_msgs.msg.dds.ParameterUpdate data, us.ihmc.idl.CDR cdr)
   {
      read(data, cdr);
   }
   
   public void copy(px4_msgs.msg.dds.ParameterUpdate src, px4_msgs.msg.dds.ParameterUpdate dest)
   {
      staticCopy(src, dest);
   }

   @Override
   public ParameterUpdatePubSubType newInstance()
   {
      return new ParameterUpdatePubSubType();
   }
}
