package px4_msgs.msg.dds;

/**
* 
* Topic data type of the struct "FollowTarget" defined in "FollowTarget_.idl". Use this class to provide the TopicDataType to a Participant. 
*
* This file was automatically generated from FollowTarget_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit FollowTarget_.idl instead.
*
*/
public class FollowTargetPubSubType implements us.ihmc.pubsub.TopicDataType<px4_msgs.msg.dds.FollowTarget>
{
   public static final java.lang.String name = "px4_msgs::msg::dds_::FollowTarget_";
   
   @Override
   public final java.lang.String getDefinitionChecksum()
   {
   		return "33f4529dba1d207ebeadf5f862e6095264ca3ba70fafde4dc172e302b10ea50c";
   }
   
   @Override
   public final java.lang.String getDefinitionVersion()
   {
   		return "";
   }

   private final us.ihmc.idl.CDR serializeCDR = new us.ihmc.idl.CDR();
   private final us.ihmc.idl.CDR deserializeCDR = new us.ihmc.idl.CDR();

   @Override
   public void serialize(px4_msgs.msg.dds.FollowTarget data, us.ihmc.pubsub.common.SerializedPayload serializedPayload) throws java.io.IOException
   {
      serializeCDR.serialize(serializedPayload);
      write(data, serializeCDR);
      serializeCDR.finishSerialize();
   }

   @Override
   public void deserialize(us.ihmc.pubsub.common.SerializedPayload serializedPayload, px4_msgs.msg.dds.FollowTarget data) throws java.io.IOException
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

      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);

      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      return current_alignment - initial_alignment;
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.FollowTarget data)
   {
      return getCdrSerializedSize(data, 0);
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.FollowTarget data, int current_alignment)
   {
      int initial_alignment = current_alignment;

      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);



      return current_alignment - initial_alignment;
   }

   public static void write(px4_msgs.msg.dds.FollowTarget data, us.ihmc.idl.CDR cdr)
   {
      cdr.write_type_12(data.getTimestamp());

      cdr.write_type_6(data.getLat());

      cdr.write_type_6(data.getLon());

      cdr.write_type_5(data.getAlt());

      cdr.write_type_5(data.getVy());

      cdr.write_type_5(data.getVx());

      cdr.write_type_5(data.getVz());

      cdr.write_type_9(data.getEstCap());

   }

   public static void read(px4_msgs.msg.dds.FollowTarget data, us.ihmc.idl.CDR cdr)
   {
      data.setTimestamp(cdr.read_type_12());
      	
      data.setLat(cdr.read_type_6());
      	
      data.setLon(cdr.read_type_6());
      	
      data.setAlt(cdr.read_type_5());
      	
      data.setVy(cdr.read_type_5());
      	
      data.setVx(cdr.read_type_5());
      	
      data.setVz(cdr.read_type_5());
      	
      data.setEstCap(cdr.read_type_9());
      	

   }

   @Override
   public final void serialize(px4_msgs.msg.dds.FollowTarget data, us.ihmc.idl.InterchangeSerializer ser)
   {
      ser.write_type_12("timestamp", data.getTimestamp());
      ser.write_type_6("lat", data.getLat());
      ser.write_type_6("lon", data.getLon());
      ser.write_type_5("alt", data.getAlt());
      ser.write_type_5("vy", data.getVy());
      ser.write_type_5("vx", data.getVx());
      ser.write_type_5("vz", data.getVz());
      ser.write_type_9("est_cap", data.getEstCap());
   }

   @Override
   public final void deserialize(us.ihmc.idl.InterchangeSerializer ser, px4_msgs.msg.dds.FollowTarget data)
   {
      data.setTimestamp(ser.read_type_12("timestamp"));
      data.setLat(ser.read_type_6("lat"));
      data.setLon(ser.read_type_6("lon"));
      data.setAlt(ser.read_type_5("alt"));
      data.setVy(ser.read_type_5("vy"));
      data.setVx(ser.read_type_5("vx"));
      data.setVz(ser.read_type_5("vz"));
      data.setEstCap(ser.read_type_9("est_cap"));
   }

   public static void staticCopy(px4_msgs.msg.dds.FollowTarget src, px4_msgs.msg.dds.FollowTarget dest)
   {
      dest.set(src);
   }

   @Override
   public px4_msgs.msg.dds.FollowTarget createData()
   {
      return new px4_msgs.msg.dds.FollowTarget();
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
   
   public void serialize(px4_msgs.msg.dds.FollowTarget data, us.ihmc.idl.CDR cdr)
   {
      write(data, cdr);
   }

   public void deserialize(px4_msgs.msg.dds.FollowTarget data, us.ihmc.idl.CDR cdr)
   {
      read(data, cdr);
   }
   
   public void copy(px4_msgs.msg.dds.FollowTarget src, px4_msgs.msg.dds.FollowTarget dest)
   {
      staticCopy(src, dest);
   }

   @Override
   public FollowTargetPubSubType newInstance()
   {
      return new FollowTargetPubSubType();
   }
}
