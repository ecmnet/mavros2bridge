package px4_msgs.msg.dds;

/**
* 
* Topic data type of the struct "SensorsStatus" defined in "SensorsStatus_.idl". Use this class to provide the TopicDataType to a Participant. 
*
* This file was automatically generated from SensorsStatus_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit SensorsStatus_.idl instead.
*
*/
public class SensorsStatusPubSubType implements us.ihmc.pubsub.TopicDataType<px4_msgs.msg.dds.SensorsStatus>
{
   public static final java.lang.String name = "px4_msgs::msg::dds_::SensorsStatus_";
   
   @Override
   public final java.lang.String getDefinitionChecksum()
   {
   		return "c94b0b22164c13e9c68dca9e196cdb7696ca4200b4fd53861eef068384833fa7";
   }
   
   @Override
   public final java.lang.String getDefinitionVersion()
   {
   		return "";
   }

   private final us.ihmc.idl.CDR serializeCDR = new us.ihmc.idl.CDR();
   private final us.ihmc.idl.CDR deserializeCDR = new us.ihmc.idl.CDR();

   @Override
   public void serialize(px4_msgs.msg.dds.SensorsStatus data, us.ihmc.pubsub.common.SerializedPayload serializedPayload) throws java.io.IOException
   {
      serializeCDR.serialize(serializedPayload);
      write(data, serializeCDR);
      serializeCDR.finishSerialize();
   }

   @Override
   public void deserialize(us.ihmc.pubsub.common.SerializedPayload serializedPayload, px4_msgs.msg.dds.SensorsStatus data) throws java.io.IOException
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

      current_alignment += ((4) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += ((4) * 1) + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += ((4) * 1) + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += ((4) * 1) + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += ((4) * 1) + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      return current_alignment - initial_alignment;
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.SensorsStatus data)
   {
      return getCdrSerializedSize(data, 0);
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.SensorsStatus data, int current_alignment)
   {
      int initial_alignment = current_alignment;

      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += ((4) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);
      current_alignment += ((4) * 1) + us.ihmc.idl.CDR.alignment(current_alignment, 1);
      current_alignment += ((4) * 1) + us.ihmc.idl.CDR.alignment(current_alignment, 1);
      current_alignment += ((4) * 1) + us.ihmc.idl.CDR.alignment(current_alignment, 1);
      current_alignment += ((4) * 1) + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      return current_alignment - initial_alignment;
   }

   public static void write(px4_msgs.msg.dds.SensorsStatus data, us.ihmc.idl.CDR cdr)
   {
      cdr.write_type_12(data.getTimestamp());

      cdr.write_type_4(data.getDeviceIdPrimary());

      for(int i0 = 0; i0 < data.getInconsistency().length; ++i0)
      {
        	cdr.write_type_5(data.getInconsistency()[i0]);	
      }

      for(int i0 = 0; i0 < data.getHealthy().length; ++i0)
      {
        	cdr.write_type_7(data.getHealthy()[i0]);	
      }

      for(int i0 = 0; i0 < data.getPriority().length; ++i0)
      {
        	cdr.write_type_9(data.getPriority()[i0]);	
      }

      for(int i0 = 0; i0 < data.getEnabled().length; ++i0)
      {
        	cdr.write_type_7(data.getEnabled()[i0]);	
      }

      for(int i0 = 0; i0 < data.getExternal().length; ++i0)
      {
        	cdr.write_type_7(data.getExternal()[i0]);	
      }

   }

   public static void read(px4_msgs.msg.dds.SensorsStatus data, us.ihmc.idl.CDR cdr)
   {
      data.setTimestamp(cdr.read_type_12());
      	
      data.setDeviceIdPrimary(cdr.read_type_4());
      	
      for(int i0 = 0; i0 < data.getInconsistency().length; ++i0)
      {
        	data.getInconsistency()[i0] = cdr.read_type_5();
        	
      }
      	
      for(int i0 = 0; i0 < data.getHealthy().length; ++i0)
      {
        	data.getHealthy()[i0] = cdr.read_type_7();
        	
      }
      	
      for(int i0 = 0; i0 < data.getPriority().length; ++i0)
      {
        	data.getPriority()[i0] = cdr.read_type_9();
        	
      }
      	
      for(int i0 = 0; i0 < data.getEnabled().length; ++i0)
      {
        	data.getEnabled()[i0] = cdr.read_type_7();
        	
      }
      	
      for(int i0 = 0; i0 < data.getExternal().length; ++i0)
      {
        	data.getExternal()[i0] = cdr.read_type_7();
        	
      }
      	

   }

   @Override
   public final void serialize(px4_msgs.msg.dds.SensorsStatus data, us.ihmc.idl.InterchangeSerializer ser)
   {
      ser.write_type_12("timestamp", data.getTimestamp());
      ser.write_type_4("device_id_primary", data.getDeviceIdPrimary());
      ser.write_type_f("inconsistency", data.getInconsistency());
      ser.write_type_f("healthy", data.getHealthy());
      ser.write_type_f("priority", data.getPriority());
      ser.write_type_f("enabled", data.getEnabled());
      ser.write_type_f("external", data.getExternal());
   }

   @Override
   public final void deserialize(us.ihmc.idl.InterchangeSerializer ser, px4_msgs.msg.dds.SensorsStatus data)
   {
      data.setTimestamp(ser.read_type_12("timestamp"));
      data.setDeviceIdPrimary(ser.read_type_4("device_id_primary"));
      ser.read_type_f("inconsistency", data.getInconsistency());
      ser.read_type_f("healthy", data.getHealthy());
      ser.read_type_f("priority", data.getPriority());
      ser.read_type_f("enabled", data.getEnabled());
      ser.read_type_f("external", data.getExternal());
   }

   public static void staticCopy(px4_msgs.msg.dds.SensorsStatus src, px4_msgs.msg.dds.SensorsStatus dest)
   {
      dest.set(src);
   }

   @Override
   public px4_msgs.msg.dds.SensorsStatus createData()
   {
      return new px4_msgs.msg.dds.SensorsStatus();
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
   
   public void serialize(px4_msgs.msg.dds.SensorsStatus data, us.ihmc.idl.CDR cdr)
   {
      write(data, cdr);
   }

   public void deserialize(px4_msgs.msg.dds.SensorsStatus data, us.ihmc.idl.CDR cdr)
   {
      read(data, cdr);
   }
   
   public void copy(px4_msgs.msg.dds.SensorsStatus src, px4_msgs.msg.dds.SensorsStatus dest)
   {
      staticCopy(src, dest);
   }

   @Override
   public SensorsStatusPubSubType newInstance()
   {
      return new SensorsStatusPubSubType();
   }
}
