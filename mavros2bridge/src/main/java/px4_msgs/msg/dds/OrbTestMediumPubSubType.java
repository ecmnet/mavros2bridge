package px4_msgs.msg.dds;

/**
* 
* Topic data type of the struct "OrbTestMedium" defined in "OrbTestMedium_.idl". Use this class to provide the TopicDataType to a Participant. 
*
* This file was automatically generated from OrbTestMedium_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit OrbTestMedium_.idl instead.
*
*/
public class OrbTestMediumPubSubType implements us.ihmc.pubsub.TopicDataType<px4_msgs.msg.dds.OrbTestMedium>
{
   public static final java.lang.String name = "px4_msgs::msg::dds_::OrbTestMedium_";
   
   @Override
   public final java.lang.String getDefinitionChecksum()
   {
   		return "1214ad1b69ceed6351628d3c6ec20c993274ccb87f92b3b4ae7fa26562196576";
   }
   
   @Override
   public final java.lang.String getDefinitionVersion()
   {
   		return "";
   }

   private final us.ihmc.idl.CDR serializeCDR = new us.ihmc.idl.CDR();
   private final us.ihmc.idl.CDR deserializeCDR = new us.ihmc.idl.CDR();

   @Override
   public void serialize(px4_msgs.msg.dds.OrbTestMedium data, us.ihmc.pubsub.common.SerializedPayload serializedPayload) throws java.io.IOException
   {
      serializeCDR.serialize(serializedPayload);
      write(data, serializeCDR);
      serializeCDR.finishSerialize();
   }

   @Override
   public void deserialize(us.ihmc.pubsub.common.SerializedPayload serializedPayload, px4_msgs.msg.dds.OrbTestMedium data) throws java.io.IOException
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

      current_alignment += ((64) * 1) + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      return current_alignment - initial_alignment;
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.OrbTestMedium data)
   {
      return getCdrSerializedSize(data, 0);
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.OrbTestMedium data, int current_alignment)
   {
      int initial_alignment = current_alignment;

      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += ((64) * 1) + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      return current_alignment - initial_alignment;
   }

   public static void write(px4_msgs.msg.dds.OrbTestMedium data, us.ihmc.idl.CDR cdr)
   {
      cdr.write_type_12(data.getTimestamp());

      cdr.write_type_2(data.getVal());

      for(int i0 = 0; i0 < data.getJunk().length; ++i0)
      {
        	cdr.write_type_9(data.getJunk()[i0]);	
      }

   }

   public static void read(px4_msgs.msg.dds.OrbTestMedium data, us.ihmc.idl.CDR cdr)
   {
      data.setTimestamp(cdr.read_type_12());
      	
      data.setVal(cdr.read_type_2());
      	
      for(int i0 = 0; i0 < data.getJunk().length; ++i0)
      {
        	data.getJunk()[i0] = cdr.read_type_9();
        	
      }
      	

   }

   @Override
   public final void serialize(px4_msgs.msg.dds.OrbTestMedium data, us.ihmc.idl.InterchangeSerializer ser)
   {
      ser.write_type_12("timestamp", data.getTimestamp());
      ser.write_type_2("val", data.getVal());
      ser.write_type_f("junk", data.getJunk());
   }

   @Override
   public final void deserialize(us.ihmc.idl.InterchangeSerializer ser, px4_msgs.msg.dds.OrbTestMedium data)
   {
      data.setTimestamp(ser.read_type_12("timestamp"));
      data.setVal(ser.read_type_2("val"));
      ser.read_type_f("junk", data.getJunk());
   }

   public static void staticCopy(px4_msgs.msg.dds.OrbTestMedium src, px4_msgs.msg.dds.OrbTestMedium dest)
   {
      dest.set(src);
   }

   @Override
   public px4_msgs.msg.dds.OrbTestMedium createData()
   {
      return new px4_msgs.msg.dds.OrbTestMedium();
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
   
   public void serialize(px4_msgs.msg.dds.OrbTestMedium data, us.ihmc.idl.CDR cdr)
   {
      write(data, cdr);
   }

   public void deserialize(px4_msgs.msg.dds.OrbTestMedium data, us.ihmc.idl.CDR cdr)
   {
      read(data, cdr);
   }
   
   public void copy(px4_msgs.msg.dds.OrbTestMedium src, px4_msgs.msg.dds.OrbTestMedium dest)
   {
      staticCopy(src, dest);
   }

   @Override
   public OrbTestMediumPubSubType newInstance()
   {
      return new OrbTestMediumPubSubType();
   }
}
