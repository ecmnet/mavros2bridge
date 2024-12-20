package px4_msgs.msg.dds;

/**
* 
* Topic data type of the struct "TrajectoryWaypoint" defined in "TrajectoryWaypoint_.idl". Use this class to provide the TopicDataType to a Participant. 
*
* This file was automatically generated from TrajectoryWaypoint_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit TrajectoryWaypoint_.idl instead.
*
*/
public class TrajectoryWaypointPubSubType implements us.ihmc.pubsub.TopicDataType<px4_msgs.msg.dds.TrajectoryWaypoint>
{
   public static final java.lang.String name = "px4_msgs::msg::dds_::TrajectoryWaypoint_";
   
   @Override
   public final java.lang.String getDefinitionChecksum()
   {
   		return "2d24b2a95dd161024aa109fe8510c9cf815476bf2584438ff3f4637abf9bc238";
   }
   
   @Override
   public final java.lang.String getDefinitionVersion()
   {
   		return "";
   }

   private final us.ihmc.idl.CDR serializeCDR = new us.ihmc.idl.CDR();
   private final us.ihmc.idl.CDR deserializeCDR = new us.ihmc.idl.CDR();

   @Override
   public void serialize(px4_msgs.msg.dds.TrajectoryWaypoint data, us.ihmc.pubsub.common.SerializedPayload serializedPayload) throws java.io.IOException
   {
      serializeCDR.serialize(serializedPayload);
      write(data, serializeCDR);
      serializeCDR.finishSerialize();
   }

   @Override
   public void deserialize(us.ihmc.pubsub.common.SerializedPayload serializedPayload, px4_msgs.msg.dds.TrajectoryWaypoint data) throws java.io.IOException
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

      current_alignment += ((3) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += ((3) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      return current_alignment - initial_alignment;
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.TrajectoryWaypoint data)
   {
      return getCdrSerializedSize(data, 0);
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.TrajectoryWaypoint data, int current_alignment)
   {
      int initial_alignment = current_alignment;

      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += ((3) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);
      current_alignment += ((3) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);
      current_alignment += ((3) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);
      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);



      return current_alignment - initial_alignment;
   }

   public static void write(px4_msgs.msg.dds.TrajectoryWaypoint data, us.ihmc.idl.CDR cdr)
   {
      cdr.write_type_12(data.getTimestamp());

      for(int i0 = 0; i0 < data.getPosition().length; ++i0)
      {
        	cdr.write_type_5(data.getPosition()[i0]);	
      }

      for(int i0 = 0; i0 < data.getVelocity().length; ++i0)
      {
        	cdr.write_type_5(data.getVelocity()[i0]);	
      }

      for(int i0 = 0; i0 < data.getAcceleration().length; ++i0)
      {
        	cdr.write_type_5(data.getAcceleration()[i0]);	
      }

      cdr.write_type_5(data.getYaw());

      cdr.write_type_5(data.getYawSpeed());

      cdr.write_type_7(data.getPointValid());

      cdr.write_type_9(data.getType());

   }

   public static void read(px4_msgs.msg.dds.TrajectoryWaypoint data, us.ihmc.idl.CDR cdr)
   {
      data.setTimestamp(cdr.read_type_12());
      	
      for(int i0 = 0; i0 < data.getPosition().length; ++i0)
      {
        	data.getPosition()[i0] = cdr.read_type_5();
        	
      }
      	
      for(int i0 = 0; i0 < data.getVelocity().length; ++i0)
      {
        	data.getVelocity()[i0] = cdr.read_type_5();
        	
      }
      	
      for(int i0 = 0; i0 < data.getAcceleration().length; ++i0)
      {
        	data.getAcceleration()[i0] = cdr.read_type_5();
        	
      }
      	
      data.setYaw(cdr.read_type_5());
      	
      data.setYawSpeed(cdr.read_type_5());
      	
      data.setPointValid(cdr.read_type_7());
      	
      data.setType(cdr.read_type_9());
      	

   }

   @Override
   public final void serialize(px4_msgs.msg.dds.TrajectoryWaypoint data, us.ihmc.idl.InterchangeSerializer ser)
   {
      ser.write_type_12("timestamp", data.getTimestamp());
      ser.write_type_f("position", data.getPosition());
      ser.write_type_f("velocity", data.getVelocity());
      ser.write_type_f("acceleration", data.getAcceleration());
      ser.write_type_5("yaw", data.getYaw());
      ser.write_type_5("yaw_speed", data.getYawSpeed());
      ser.write_type_7("point_valid", data.getPointValid());
      ser.write_type_9("type", data.getType());
   }

   @Override
   public final void deserialize(us.ihmc.idl.InterchangeSerializer ser, px4_msgs.msg.dds.TrajectoryWaypoint data)
   {
      data.setTimestamp(ser.read_type_12("timestamp"));
      ser.read_type_f("position", data.getPosition());
      ser.read_type_f("velocity", data.getVelocity());
      ser.read_type_f("acceleration", data.getAcceleration());
      data.setYaw(ser.read_type_5("yaw"));
      data.setYawSpeed(ser.read_type_5("yaw_speed"));
      data.setPointValid(ser.read_type_7("point_valid"));
      data.setType(ser.read_type_9("type"));
   }

   public static void staticCopy(px4_msgs.msg.dds.TrajectoryWaypoint src, px4_msgs.msg.dds.TrajectoryWaypoint dest)
   {
      dest.set(src);
   }

   @Override
   public px4_msgs.msg.dds.TrajectoryWaypoint createData()
   {
      return new px4_msgs.msg.dds.TrajectoryWaypoint();
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
   
   public void serialize(px4_msgs.msg.dds.TrajectoryWaypoint data, us.ihmc.idl.CDR cdr)
   {
      write(data, cdr);
   }

   public void deserialize(px4_msgs.msg.dds.TrajectoryWaypoint data, us.ihmc.idl.CDR cdr)
   {
      read(data, cdr);
   }
   
   public void copy(px4_msgs.msg.dds.TrajectoryWaypoint src, px4_msgs.msg.dds.TrajectoryWaypoint dest)
   {
      staticCopy(src, dest);
   }

   @Override
   public TrajectoryWaypointPubSubType newInstance()
   {
      return new TrajectoryWaypointPubSubType();
   }
}
