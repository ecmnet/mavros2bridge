package px4_msgs.msg.dds;

/**
* 
* Topic data type of the struct "TrajectoryBezier" defined in "TrajectoryBezier_.idl". Use this class to provide the TopicDataType to a Participant. 
*
* This file was automatically generated from TrajectoryBezier_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit TrajectoryBezier_.idl instead.
*
*/
public class TrajectoryBezierPubSubType implements us.ihmc.pubsub.TopicDataType<px4_msgs.msg.dds.TrajectoryBezier>
{
   public static final java.lang.String name = "px4_msgs::msg::dds_::TrajectoryBezier_";
   
   @Override
   public final java.lang.String getDefinitionChecksum()
   {
   		return "3ca598eae05a9aff3c955950c1f71206bd515b12a7cdcc67e05e4216ee71daaf";
   }
   
   @Override
   public final java.lang.String getDefinitionVersion()
   {
   		return "";
   }

   private final us.ihmc.idl.CDR serializeCDR = new us.ihmc.idl.CDR();
   private final us.ihmc.idl.CDR deserializeCDR = new us.ihmc.idl.CDR();

   @Override
   public void serialize(px4_msgs.msg.dds.TrajectoryBezier data, us.ihmc.pubsub.common.SerializedPayload serializedPayload) throws java.io.IOException
   {
      serializeCDR.serialize(serializedPayload);
      write(data, serializeCDR);
      serializeCDR.finishSerialize();
   }

   @Override
   public void deserialize(us.ihmc.pubsub.common.SerializedPayload serializedPayload, px4_msgs.msg.dds.TrajectoryBezier data) throws java.io.IOException
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

      current_alignment += ((3) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      return current_alignment - initial_alignment;
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.TrajectoryBezier data)
   {
      return getCdrSerializedSize(data, 0);
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.TrajectoryBezier data, int current_alignment)
   {
      int initial_alignment = current_alignment;

      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += ((3) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);
      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);



      return current_alignment - initial_alignment;
   }

   public static void write(px4_msgs.msg.dds.TrajectoryBezier data, us.ihmc.idl.CDR cdr)
   {
      cdr.write_type_12(data.getTimestamp());

      for(int i0 = 0; i0 < data.getPosition().length; ++i0)
      {
        	cdr.write_type_5(data.getPosition()[i0]);	
      }

      cdr.write_type_5(data.getYaw());

      cdr.write_type_5(data.getDelta());

   }

   public static void read(px4_msgs.msg.dds.TrajectoryBezier data, us.ihmc.idl.CDR cdr)
   {
      data.setTimestamp(cdr.read_type_12());
      	
      for(int i0 = 0; i0 < data.getPosition().length; ++i0)
      {
        	data.getPosition()[i0] = cdr.read_type_5();
        	
      }
      	
      data.setYaw(cdr.read_type_5());
      	
      data.setDelta(cdr.read_type_5());
      	

   }

   @Override
   public final void serialize(px4_msgs.msg.dds.TrajectoryBezier data, us.ihmc.idl.InterchangeSerializer ser)
   {
      ser.write_type_12("timestamp", data.getTimestamp());
      ser.write_type_f("position", data.getPosition());
      ser.write_type_5("yaw", data.getYaw());
      ser.write_type_5("delta", data.getDelta());
   }

   @Override
   public final void deserialize(us.ihmc.idl.InterchangeSerializer ser, px4_msgs.msg.dds.TrajectoryBezier data)
   {
      data.setTimestamp(ser.read_type_12("timestamp"));
      ser.read_type_f("position", data.getPosition());
      data.setYaw(ser.read_type_5("yaw"));
      data.setDelta(ser.read_type_5("delta"));
   }

   public static void staticCopy(px4_msgs.msg.dds.TrajectoryBezier src, px4_msgs.msg.dds.TrajectoryBezier dest)
   {
      dest.set(src);
   }

   @Override
   public px4_msgs.msg.dds.TrajectoryBezier createData()
   {
      return new px4_msgs.msg.dds.TrajectoryBezier();
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
   
   public void serialize(px4_msgs.msg.dds.TrajectoryBezier data, us.ihmc.idl.CDR cdr)
   {
      write(data, cdr);
   }

   public void deserialize(px4_msgs.msg.dds.TrajectoryBezier data, us.ihmc.idl.CDR cdr)
   {
      read(data, cdr);
   }
   
   public void copy(px4_msgs.msg.dds.TrajectoryBezier src, px4_msgs.msg.dds.TrajectoryBezier dest)
   {
      staticCopy(src, dest);
   }

   @Override
   public TrajectoryBezierPubSubType newInstance()
   {
      return new TrajectoryBezierPubSubType();
   }
}
