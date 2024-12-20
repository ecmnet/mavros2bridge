package px4_msgs.msg.dds;

/**
* 
* Topic data type of the struct "LandingGear" defined in "LandingGear_.idl". Use this class to provide the TopicDataType to a Participant. 
*
* This file was automatically generated from LandingGear_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit LandingGear_.idl instead.
*
*/
public class LandingGearPubSubType implements us.ihmc.pubsub.TopicDataType<px4_msgs.msg.dds.LandingGear>
{
   public static final java.lang.String name = "px4_msgs::msg::dds_::LandingGear_";
   
   @Override
   public final java.lang.String getDefinitionChecksum()
   {
   		return "06aee0382445c0877666ddf8cfebd30ca7fbc93d76b63834a097a5bc448d8284";
   }
   
   @Override
   public final java.lang.String getDefinitionVersion()
   {
   		return "";
   }

   private final us.ihmc.idl.CDR serializeCDR = new us.ihmc.idl.CDR();
   private final us.ihmc.idl.CDR deserializeCDR = new us.ihmc.idl.CDR();

   @Override
   public void serialize(px4_msgs.msg.dds.LandingGear data, us.ihmc.pubsub.common.SerializedPayload serializedPayload) throws java.io.IOException
   {
      serializeCDR.serialize(serializedPayload);
      write(data, serializeCDR);
      serializeCDR.finishSerialize();
   }

   @Override
   public void deserialize(us.ihmc.pubsub.common.SerializedPayload serializedPayload, px4_msgs.msg.dds.LandingGear data) throws java.io.IOException
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

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.LandingGear data)
   {
      return getCdrSerializedSize(data, 0);
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.LandingGear data, int current_alignment)
   {
      int initial_alignment = current_alignment;

      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);



      return current_alignment - initial_alignment;
   }

   public static void write(px4_msgs.msg.dds.LandingGear data, us.ihmc.idl.CDR cdr)
   {
      cdr.write_type_12(data.getTimestamp());

      cdr.write_type_9(data.getLandingGear());

   }

   public static void read(px4_msgs.msg.dds.LandingGear data, us.ihmc.idl.CDR cdr)
   {
      data.setTimestamp(cdr.read_type_12());
      	
      data.setLandingGear(cdr.read_type_9());
      	

   }

   @Override
   public final void serialize(px4_msgs.msg.dds.LandingGear data, us.ihmc.idl.InterchangeSerializer ser)
   {
      ser.write_type_12("timestamp", data.getTimestamp());
      ser.write_type_9("landing_gear", data.getLandingGear());
   }

   @Override
   public final void deserialize(us.ihmc.idl.InterchangeSerializer ser, px4_msgs.msg.dds.LandingGear data)
   {
      data.setTimestamp(ser.read_type_12("timestamp"));
      data.setLandingGear(ser.read_type_9("landing_gear"));
   }

   public static void staticCopy(px4_msgs.msg.dds.LandingGear src, px4_msgs.msg.dds.LandingGear dest)
   {
      dest.set(src);
   }

   @Override
   public px4_msgs.msg.dds.LandingGear createData()
   {
      return new px4_msgs.msg.dds.LandingGear();
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
   
   public void serialize(px4_msgs.msg.dds.LandingGear data, us.ihmc.idl.CDR cdr)
   {
      write(data, cdr);
   }

   public void deserialize(px4_msgs.msg.dds.LandingGear data, us.ihmc.idl.CDR cdr)
   {
      read(data, cdr);
   }
   
   public void copy(px4_msgs.msg.dds.LandingGear src, px4_msgs.msg.dds.LandingGear dest)
   {
      staticCopy(src, dest);
   }

   @Override
   public LandingGearPubSubType newInstance()
   {
      return new LandingGearPubSubType();
   }
}
