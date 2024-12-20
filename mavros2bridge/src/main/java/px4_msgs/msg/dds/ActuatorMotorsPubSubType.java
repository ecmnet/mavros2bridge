package px4_msgs.msg.dds;

/**
* 
* Topic data type of the struct "ActuatorMotors" defined in "ActuatorMotors_.idl". Use this class to provide the TopicDataType to a Participant. 
*
* This file was automatically generated from ActuatorMotors_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit ActuatorMotors_.idl instead.
*
*/
public class ActuatorMotorsPubSubType implements us.ihmc.pubsub.TopicDataType<px4_msgs.msg.dds.ActuatorMotors>
{
   public static final java.lang.String name = "px4_msgs::msg::dds_::ActuatorMotors_";
   
   @Override
   public final java.lang.String getDefinitionChecksum()
   {
   		return "c50c96893eab800e0885b91969a92c2880e7f6abf8e69432702908e12cd1571c";
   }
   
   @Override
   public final java.lang.String getDefinitionVersion()
   {
   		return "";
   }

   private final us.ihmc.idl.CDR serializeCDR = new us.ihmc.idl.CDR();
   private final us.ihmc.idl.CDR deserializeCDR = new us.ihmc.idl.CDR();

   @Override
   public void serialize(px4_msgs.msg.dds.ActuatorMotors data, us.ihmc.pubsub.common.SerializedPayload serializedPayload) throws java.io.IOException
   {
      serializeCDR.serialize(serializedPayload);
      write(data, serializeCDR);
      serializeCDR.finishSerialize();
   }

   @Override
   public void deserialize(us.ihmc.pubsub.common.SerializedPayload serializedPayload, px4_msgs.msg.dds.ActuatorMotors data) throws java.io.IOException
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

      current_alignment += 2 + us.ihmc.idl.CDR.alignment(current_alignment, 2);

      current_alignment += ((12) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      return current_alignment - initial_alignment;
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.ActuatorMotors data)
   {
      return getCdrSerializedSize(data, 0);
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.ActuatorMotors data, int current_alignment)
   {
      int initial_alignment = current_alignment;

      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += 2 + us.ihmc.idl.CDR.alignment(current_alignment, 2);


      current_alignment += ((12) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      return current_alignment - initial_alignment;
   }

   public static void write(px4_msgs.msg.dds.ActuatorMotors data, us.ihmc.idl.CDR cdr)
   {
      cdr.write_type_12(data.getTimestamp());

      cdr.write_type_12(data.getTimestampSample());

      cdr.write_type_3(data.getReversibleFlags());

      for(int i0 = 0; i0 < data.getControl().length; ++i0)
      {
        	cdr.write_type_5(data.getControl()[i0]);	
      }

   }

   public static void read(px4_msgs.msg.dds.ActuatorMotors data, us.ihmc.idl.CDR cdr)
   {
      data.setTimestamp(cdr.read_type_12());
      	
      data.setTimestampSample(cdr.read_type_12());
      	
      data.setReversibleFlags(cdr.read_type_3());
      	
      for(int i0 = 0; i0 < data.getControl().length; ++i0)
      {
        	data.getControl()[i0] = cdr.read_type_5();
        	
      }
      	

   }

   @Override
   public final void serialize(px4_msgs.msg.dds.ActuatorMotors data, us.ihmc.idl.InterchangeSerializer ser)
   {
      ser.write_type_12("timestamp", data.getTimestamp());
      ser.write_type_12("timestamp_sample", data.getTimestampSample());
      ser.write_type_3("reversible_flags", data.getReversibleFlags());
      ser.write_type_f("control", data.getControl());
   }

   @Override
   public final void deserialize(us.ihmc.idl.InterchangeSerializer ser, px4_msgs.msg.dds.ActuatorMotors data)
   {
      data.setTimestamp(ser.read_type_12("timestamp"));
      data.setTimestampSample(ser.read_type_12("timestamp_sample"));
      data.setReversibleFlags(ser.read_type_3("reversible_flags"));
      ser.read_type_f("control", data.getControl());
   }

   public static void staticCopy(px4_msgs.msg.dds.ActuatorMotors src, px4_msgs.msg.dds.ActuatorMotors dest)
   {
      dest.set(src);
   }

   @Override
   public px4_msgs.msg.dds.ActuatorMotors createData()
   {
      return new px4_msgs.msg.dds.ActuatorMotors();
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
   
   public void serialize(px4_msgs.msg.dds.ActuatorMotors data, us.ihmc.idl.CDR cdr)
   {
      write(data, cdr);
   }

   public void deserialize(px4_msgs.msg.dds.ActuatorMotors data, us.ihmc.idl.CDR cdr)
   {
      read(data, cdr);
   }
   
   public void copy(px4_msgs.msg.dds.ActuatorMotors src, px4_msgs.msg.dds.ActuatorMotors dest)
   {
      staticCopy(src, dest);
   }

   @Override
   public ActuatorMotorsPubSubType newInstance()
   {
      return new ActuatorMotorsPubSubType();
   }
}
