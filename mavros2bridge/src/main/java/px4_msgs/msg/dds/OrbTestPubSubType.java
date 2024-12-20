package px4_msgs.msg.dds;

/**
* 
* Topic data type of the struct "OrbTest" defined in "OrbTest_.idl". Use this class to provide the TopicDataType to a Participant. 
*
* This file was automatically generated from OrbTest_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit OrbTest_.idl instead.
*
*/
public class OrbTestPubSubType implements us.ihmc.pubsub.TopicDataType<px4_msgs.msg.dds.OrbTest>
{
   public static final java.lang.String name = "px4_msgs::msg::dds_::OrbTest_";
   
   @Override
   public final java.lang.String getDefinitionChecksum()
   {
   		return "4c1624049948d3fd6c1fbe8442007295da8963f3b9711ebbe9c247169d30b943";
   }
   
   @Override
   public final java.lang.String getDefinitionVersion()
   {
   		return "";
   }

   private final us.ihmc.idl.CDR serializeCDR = new us.ihmc.idl.CDR();
   private final us.ihmc.idl.CDR deserializeCDR = new us.ihmc.idl.CDR();

   @Override
   public void serialize(px4_msgs.msg.dds.OrbTest data, us.ihmc.pubsub.common.SerializedPayload serializedPayload) throws java.io.IOException
   {
      serializeCDR.serialize(serializedPayload);
      write(data, serializeCDR);
      serializeCDR.finishSerialize();
   }

   @Override
   public void deserialize(us.ihmc.pubsub.common.SerializedPayload serializedPayload, px4_msgs.msg.dds.OrbTest data) throws java.io.IOException
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

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.OrbTest data)
   {
      return getCdrSerializedSize(data, 0);
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.OrbTest data, int current_alignment)
   {
      int initial_alignment = current_alignment;

      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);



      return current_alignment - initial_alignment;
   }

   public static void write(px4_msgs.msg.dds.OrbTest data, us.ihmc.idl.CDR cdr)
   {
      cdr.write_type_12(data.getTimestamp());

      cdr.write_type_2(data.getVal());

   }

   public static void read(px4_msgs.msg.dds.OrbTest data, us.ihmc.idl.CDR cdr)
   {
      data.setTimestamp(cdr.read_type_12());
      	
      data.setVal(cdr.read_type_2());
      	

   }

   @Override
   public final void serialize(px4_msgs.msg.dds.OrbTest data, us.ihmc.idl.InterchangeSerializer ser)
   {
      ser.write_type_12("timestamp", data.getTimestamp());
      ser.write_type_2("val", data.getVal());
   }

   @Override
   public final void deserialize(us.ihmc.idl.InterchangeSerializer ser, px4_msgs.msg.dds.OrbTest data)
   {
      data.setTimestamp(ser.read_type_12("timestamp"));
      data.setVal(ser.read_type_2("val"));
   }

   public static void staticCopy(px4_msgs.msg.dds.OrbTest src, px4_msgs.msg.dds.OrbTest dest)
   {
      dest.set(src);
   }

   @Override
   public px4_msgs.msg.dds.OrbTest createData()
   {
      return new px4_msgs.msg.dds.OrbTest();
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
   
   public void serialize(px4_msgs.msg.dds.OrbTest data, us.ihmc.idl.CDR cdr)
   {
      write(data, cdr);
   }

   public void deserialize(px4_msgs.msg.dds.OrbTest data, us.ihmc.idl.CDR cdr)
   {
      read(data, cdr);
   }
   
   public void copy(px4_msgs.msg.dds.OrbTest src, px4_msgs.msg.dds.OrbTest dest)
   {
      staticCopy(src, dest);
   }

   @Override
   public OrbTestPubSubType newInstance()
   {
      return new OrbTestPubSubType();
   }
}
