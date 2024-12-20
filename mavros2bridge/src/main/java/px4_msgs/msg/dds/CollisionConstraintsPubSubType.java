package px4_msgs.msg.dds;

/**
* 
* Topic data type of the struct "CollisionConstraints" defined in "CollisionConstraints_.idl". Use this class to provide the TopicDataType to a Participant. 
*
* This file was automatically generated from CollisionConstraints_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit CollisionConstraints_.idl instead.
*
*/
public class CollisionConstraintsPubSubType implements us.ihmc.pubsub.TopicDataType<px4_msgs.msg.dds.CollisionConstraints>
{
   public static final java.lang.String name = "px4_msgs::msg::dds_::CollisionConstraints_";
   
   @Override
   public final java.lang.String getDefinitionChecksum()
   {
   		return "d522c61ac2bf8103533c1f1fc3ccd73a77192df9609d3b2df85f3ba67ee92db4";
   }
   
   @Override
   public final java.lang.String getDefinitionVersion()
   {
   		return "";
   }

   private final us.ihmc.idl.CDR serializeCDR = new us.ihmc.idl.CDR();
   private final us.ihmc.idl.CDR deserializeCDR = new us.ihmc.idl.CDR();

   @Override
   public void serialize(px4_msgs.msg.dds.CollisionConstraints data, us.ihmc.pubsub.common.SerializedPayload serializedPayload) throws java.io.IOException
   {
      serializeCDR.serialize(serializedPayload);
      write(data, serializeCDR);
      serializeCDR.finishSerialize();
   }

   @Override
   public void deserialize(us.ihmc.pubsub.common.SerializedPayload serializedPayload, px4_msgs.msg.dds.CollisionConstraints data) throws java.io.IOException
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

      current_alignment += ((2) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += ((2) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      return current_alignment - initial_alignment;
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.CollisionConstraints data)
   {
      return getCdrSerializedSize(data, 0);
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.CollisionConstraints data, int current_alignment)
   {
      int initial_alignment = current_alignment;

      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += ((2) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);
      current_alignment += ((2) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      return current_alignment - initial_alignment;
   }

   public static void write(px4_msgs.msg.dds.CollisionConstraints data, us.ihmc.idl.CDR cdr)
   {
      cdr.write_type_12(data.getTimestamp());

      for(int i0 = 0; i0 < data.getOriginalSetpoint().length; ++i0)
      {
        	cdr.write_type_5(data.getOriginalSetpoint()[i0]);	
      }

      for(int i0 = 0; i0 < data.getAdaptedSetpoint().length; ++i0)
      {
        	cdr.write_type_5(data.getAdaptedSetpoint()[i0]);	
      }

   }

   public static void read(px4_msgs.msg.dds.CollisionConstraints data, us.ihmc.idl.CDR cdr)
   {
      data.setTimestamp(cdr.read_type_12());
      	
      for(int i0 = 0; i0 < data.getOriginalSetpoint().length; ++i0)
      {
        	data.getOriginalSetpoint()[i0] = cdr.read_type_5();
        	
      }
      	
      for(int i0 = 0; i0 < data.getAdaptedSetpoint().length; ++i0)
      {
        	data.getAdaptedSetpoint()[i0] = cdr.read_type_5();
        	
      }
      	

   }

   @Override
   public final void serialize(px4_msgs.msg.dds.CollisionConstraints data, us.ihmc.idl.InterchangeSerializer ser)
   {
      ser.write_type_12("timestamp", data.getTimestamp());
      ser.write_type_f("original_setpoint", data.getOriginalSetpoint());
      ser.write_type_f("adapted_setpoint", data.getAdaptedSetpoint());
   }

   @Override
   public final void deserialize(us.ihmc.idl.InterchangeSerializer ser, px4_msgs.msg.dds.CollisionConstraints data)
   {
      data.setTimestamp(ser.read_type_12("timestamp"));
      ser.read_type_f("original_setpoint", data.getOriginalSetpoint());
      ser.read_type_f("adapted_setpoint", data.getAdaptedSetpoint());
   }

   public static void staticCopy(px4_msgs.msg.dds.CollisionConstraints src, px4_msgs.msg.dds.CollisionConstraints dest)
   {
      dest.set(src);
   }

   @Override
   public px4_msgs.msg.dds.CollisionConstraints createData()
   {
      return new px4_msgs.msg.dds.CollisionConstraints();
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
   
   public void serialize(px4_msgs.msg.dds.CollisionConstraints data, us.ihmc.idl.CDR cdr)
   {
      write(data, cdr);
   }

   public void deserialize(px4_msgs.msg.dds.CollisionConstraints data, us.ihmc.idl.CDR cdr)
   {
      read(data, cdr);
   }
   
   public void copy(px4_msgs.msg.dds.CollisionConstraints src, px4_msgs.msg.dds.CollisionConstraints dest)
   {
      staticCopy(src, dest);
   }

   @Override
   public CollisionConstraintsPubSubType newInstance()
   {
      return new CollisionConstraintsPubSubType();
   }
}
