package px4_msgs.msg.dds;

/**
* 
* Topic data type of the struct "VehicleLocalPositionSetpoint" defined in "VehicleLocalPositionSetpoint_.idl". Use this class to provide the TopicDataType to a Participant. 
*
* This file was automatically generated from VehicleLocalPositionSetpoint_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit VehicleLocalPositionSetpoint_.idl instead.
*
*/
public class VehicleLocalPositionSetpointPubSubType implements us.ihmc.pubsub.TopicDataType<px4_msgs.msg.dds.VehicleLocalPositionSetpoint>
{
   public static final java.lang.String name = "px4_msgs::msg::dds_::VehicleLocalPositionSetpoint_";
   
   @Override
   public final java.lang.String getDefinitionChecksum()
   {
   		return "de7fc42cd5f4d0b7bae4197461db9a291ce61335187311077c25667ee1279a25";
   }
   
   @Override
   public final java.lang.String getDefinitionVersion()
   {
   		return "";
   }

   private final us.ihmc.idl.CDR serializeCDR = new us.ihmc.idl.CDR();
   private final us.ihmc.idl.CDR deserializeCDR = new us.ihmc.idl.CDR();

   @Override
   public void serialize(px4_msgs.msg.dds.VehicleLocalPositionSetpoint data, us.ihmc.pubsub.common.SerializedPayload serializedPayload) throws java.io.IOException
   {
      serializeCDR.serialize(serializedPayload);
      write(data, serializeCDR);
      serializeCDR.finishSerialize();
   }

   @Override
   public void deserialize(us.ihmc.pubsub.common.SerializedPayload serializedPayload, px4_msgs.msg.dds.VehicleLocalPositionSetpoint data) throws java.io.IOException
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

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += ((3) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += ((3) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      return current_alignment - initial_alignment;
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.VehicleLocalPositionSetpoint data)
   {
      return getCdrSerializedSize(data, 0);
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.VehicleLocalPositionSetpoint data, int current_alignment)
   {
      int initial_alignment = current_alignment;

      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += ((3) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);
      current_alignment += ((3) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);
      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);



      return current_alignment - initial_alignment;
   }

   public static void write(px4_msgs.msg.dds.VehicleLocalPositionSetpoint data, us.ihmc.idl.CDR cdr)
   {
      cdr.write_type_12(data.getTimestamp());

      cdr.write_type_5(data.getX());

      cdr.write_type_5(data.getY());

      cdr.write_type_5(data.getZ());

      cdr.write_type_5(data.getVx());

      cdr.write_type_5(data.getVy());

      cdr.write_type_5(data.getVz());

      for(int i0 = 0; i0 < data.getAcceleration().length; ++i0)
      {
        	cdr.write_type_5(data.getAcceleration()[i0]);	
      }

      for(int i0 = 0; i0 < data.getThrust().length; ++i0)
      {
        	cdr.write_type_5(data.getThrust()[i0]);	
      }

      cdr.write_type_5(data.getYaw());

      cdr.write_type_5(data.getYawspeed());

   }

   public static void read(px4_msgs.msg.dds.VehicleLocalPositionSetpoint data, us.ihmc.idl.CDR cdr)
   {
      data.setTimestamp(cdr.read_type_12());
      	
      data.setX(cdr.read_type_5());
      	
      data.setY(cdr.read_type_5());
      	
      data.setZ(cdr.read_type_5());
      	
      data.setVx(cdr.read_type_5());
      	
      data.setVy(cdr.read_type_5());
      	
      data.setVz(cdr.read_type_5());
      	
      for(int i0 = 0; i0 < data.getAcceleration().length; ++i0)
      {
        	data.getAcceleration()[i0] = cdr.read_type_5();
        	
      }
      	
      for(int i0 = 0; i0 < data.getThrust().length; ++i0)
      {
        	data.getThrust()[i0] = cdr.read_type_5();
        	
      }
      	
      data.setYaw(cdr.read_type_5());
      	
      data.setYawspeed(cdr.read_type_5());
      	

   }

   @Override
   public final void serialize(px4_msgs.msg.dds.VehicleLocalPositionSetpoint data, us.ihmc.idl.InterchangeSerializer ser)
   {
      ser.write_type_12("timestamp", data.getTimestamp());
      ser.write_type_5("x", data.getX());
      ser.write_type_5("y", data.getY());
      ser.write_type_5("z", data.getZ());
      ser.write_type_5("vx", data.getVx());
      ser.write_type_5("vy", data.getVy());
      ser.write_type_5("vz", data.getVz());
      ser.write_type_f("acceleration", data.getAcceleration());
      ser.write_type_f("thrust", data.getThrust());
      ser.write_type_5("yaw", data.getYaw());
      ser.write_type_5("yawspeed", data.getYawspeed());
   }

   @Override
   public final void deserialize(us.ihmc.idl.InterchangeSerializer ser, px4_msgs.msg.dds.VehicleLocalPositionSetpoint data)
   {
      data.setTimestamp(ser.read_type_12("timestamp"));
      data.setX(ser.read_type_5("x"));
      data.setY(ser.read_type_5("y"));
      data.setZ(ser.read_type_5("z"));
      data.setVx(ser.read_type_5("vx"));
      data.setVy(ser.read_type_5("vy"));
      data.setVz(ser.read_type_5("vz"));
      ser.read_type_f("acceleration", data.getAcceleration());
      ser.read_type_f("thrust", data.getThrust());
      data.setYaw(ser.read_type_5("yaw"));
      data.setYawspeed(ser.read_type_5("yawspeed"));
   }

   public static void staticCopy(px4_msgs.msg.dds.VehicleLocalPositionSetpoint src, px4_msgs.msg.dds.VehicleLocalPositionSetpoint dest)
   {
      dest.set(src);
   }

   @Override
   public px4_msgs.msg.dds.VehicleLocalPositionSetpoint createData()
   {
      return new px4_msgs.msg.dds.VehicleLocalPositionSetpoint();
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
   
   public void serialize(px4_msgs.msg.dds.VehicleLocalPositionSetpoint data, us.ihmc.idl.CDR cdr)
   {
      write(data, cdr);
   }

   public void deserialize(px4_msgs.msg.dds.VehicleLocalPositionSetpoint data, us.ihmc.idl.CDR cdr)
   {
      read(data, cdr);
   }
   
   public void copy(px4_msgs.msg.dds.VehicleLocalPositionSetpoint src, px4_msgs.msg.dds.VehicleLocalPositionSetpoint dest)
   {
      staticCopy(src, dest);
   }

   @Override
   public VehicleLocalPositionSetpointPubSubType newInstance()
   {
      return new VehicleLocalPositionSetpointPubSubType();
   }
}
