package px4_msgs.msg.dds;

/**
* 
* Topic data type of the struct "OffboardControlMode" defined in "OffboardControlMode_.idl". Use this class to provide the TopicDataType to a Participant. 
*
* This file was automatically generated from OffboardControlMode_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit OffboardControlMode_.idl instead.
*
*/
public class OffboardControlModePubSubType implements us.ihmc.pubsub.TopicDataType<px4_msgs.msg.dds.OffboardControlMode>
{
   public static final java.lang.String name = "px4_msgs::msg::dds_::OffboardControlMode_";
   
   @Override
   public final java.lang.String getDefinitionChecksum()
   {
   		return "a1cba5da13709e4aa5ead55379945fc79fe4e78624ae306136cac3734e8ea37a";
   }
   
   @Override
   public final java.lang.String getDefinitionVersion()
   {
   		return "";
   }

   private final us.ihmc.idl.CDR serializeCDR = new us.ihmc.idl.CDR();
   private final us.ihmc.idl.CDR deserializeCDR = new us.ihmc.idl.CDR();

   @Override
   public void serialize(px4_msgs.msg.dds.OffboardControlMode data, us.ihmc.pubsub.common.SerializedPayload serializedPayload) throws java.io.IOException
   {
      serializeCDR.serialize(serializedPayload);
      write(data, serializeCDR);
      serializeCDR.finishSerialize();
   }

   @Override
   public void deserialize(us.ihmc.pubsub.common.SerializedPayload serializedPayload, px4_msgs.msg.dds.OffboardControlMode data) throws java.io.IOException
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

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      return current_alignment - initial_alignment;
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.OffboardControlMode data)
   {
      return getCdrSerializedSize(data, 0);
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.OffboardControlMode data, int current_alignment)
   {
      int initial_alignment = current_alignment;

      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);



      return current_alignment - initial_alignment;
   }

   public static void write(px4_msgs.msg.dds.OffboardControlMode data, us.ihmc.idl.CDR cdr)
   {
      cdr.write_type_12(data.getTimestamp());

      cdr.write_type_7(data.getPosition());

      cdr.write_type_7(data.getVelocity());

      cdr.write_type_7(data.getAcceleration());

      cdr.write_type_7(data.getAttitude());

      cdr.write_type_7(data.getBodyRate());

      cdr.write_type_7(data.getThrustAndTorque());

      cdr.write_type_7(data.getDirectActuator());

   }

   public static void read(px4_msgs.msg.dds.OffboardControlMode data, us.ihmc.idl.CDR cdr)
   {
      data.setTimestamp(cdr.read_type_12());
      	
      data.setPosition(cdr.read_type_7());
      	
      data.setVelocity(cdr.read_type_7());
      	
      data.setAcceleration(cdr.read_type_7());
      	
      data.setAttitude(cdr.read_type_7());
      	
      data.setBodyRate(cdr.read_type_7());
      	
      data.setThrustAndTorque(cdr.read_type_7());
      	
      data.setDirectActuator(cdr.read_type_7());
      	

   }

   @Override
   public final void serialize(px4_msgs.msg.dds.OffboardControlMode data, us.ihmc.idl.InterchangeSerializer ser)
   {
      ser.write_type_12("timestamp", data.getTimestamp());
      ser.write_type_7("position", data.getPosition());
      ser.write_type_7("velocity", data.getVelocity());
      ser.write_type_7("acceleration", data.getAcceleration());
      ser.write_type_7("attitude", data.getAttitude());
      ser.write_type_7("body_rate", data.getBodyRate());
      ser.write_type_7("thrust_and_torque", data.getThrustAndTorque());
      ser.write_type_7("direct_actuator", data.getDirectActuator());
   }

   @Override
   public final void deserialize(us.ihmc.idl.InterchangeSerializer ser, px4_msgs.msg.dds.OffboardControlMode data)
   {
      data.setTimestamp(ser.read_type_12("timestamp"));
      data.setPosition(ser.read_type_7("position"));
      data.setVelocity(ser.read_type_7("velocity"));
      data.setAcceleration(ser.read_type_7("acceleration"));
      data.setAttitude(ser.read_type_7("attitude"));
      data.setBodyRate(ser.read_type_7("body_rate"));
      data.setThrustAndTorque(ser.read_type_7("thrust_and_torque"));
      data.setDirectActuator(ser.read_type_7("direct_actuator"));
   }

   public static void staticCopy(px4_msgs.msg.dds.OffboardControlMode src, px4_msgs.msg.dds.OffboardControlMode dest)
   {
      dest.set(src);
   }

   @Override
   public px4_msgs.msg.dds.OffboardControlMode createData()
   {
      return new px4_msgs.msg.dds.OffboardControlMode();
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
   
   public void serialize(px4_msgs.msg.dds.OffboardControlMode data, us.ihmc.idl.CDR cdr)
   {
      write(data, cdr);
   }

   public void deserialize(px4_msgs.msg.dds.OffboardControlMode data, us.ihmc.idl.CDR cdr)
   {
      read(data, cdr);
   }
   
   public void copy(px4_msgs.msg.dds.OffboardControlMode src, px4_msgs.msg.dds.OffboardControlMode dest)
   {
      staticCopy(src, dest);
   }

   @Override
   public OffboardControlModePubSubType newInstance()
   {
      return new OffboardControlModePubSubType();
   }
}
