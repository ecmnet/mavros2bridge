package px4_msgs.msg.dds;

/**
* 
* Topic data type of the struct "MagnetometerBiasEstimate" defined in "MagnetometerBiasEstimate_.idl". Use this class to provide the TopicDataType to a Participant. 
*
* This file was automatically generated from MagnetometerBiasEstimate_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit MagnetometerBiasEstimate_.idl instead.
*
*/
public class MagnetometerBiasEstimatePubSubType implements us.ihmc.pubsub.TopicDataType<px4_msgs.msg.dds.MagnetometerBiasEstimate>
{
   public static final java.lang.String name = "px4_msgs::msg::dds_::MagnetometerBiasEstimate_";
   
   @Override
   public final java.lang.String getDefinitionChecksum()
   {
   		return "2a4150b9cfbd0204c0975bac221d20ff60919303cd7ef4e69ac0e4ef417a4940";
   }
   
   @Override
   public final java.lang.String getDefinitionVersion()
   {
   		return "";
   }

   private final us.ihmc.idl.CDR serializeCDR = new us.ihmc.idl.CDR();
   private final us.ihmc.idl.CDR deserializeCDR = new us.ihmc.idl.CDR();

   @Override
   public void serialize(px4_msgs.msg.dds.MagnetometerBiasEstimate data, us.ihmc.pubsub.common.SerializedPayload serializedPayload) throws java.io.IOException
   {
      serializeCDR.serialize(serializedPayload);
      write(data, serializeCDR);
      serializeCDR.finishSerialize();
   }

   @Override
   public void deserialize(us.ihmc.pubsub.common.SerializedPayload serializedPayload, px4_msgs.msg.dds.MagnetometerBiasEstimate data) throws java.io.IOException
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

      current_alignment += ((4) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += ((4) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += ((4) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += ((4) * 1) + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += ((4) * 1) + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      return current_alignment - initial_alignment;
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.MagnetometerBiasEstimate data)
   {
      return getCdrSerializedSize(data, 0);
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.MagnetometerBiasEstimate data, int current_alignment)
   {
      int initial_alignment = current_alignment;

      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += ((4) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);
      current_alignment += ((4) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);
      current_alignment += ((4) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);
      current_alignment += ((4) * 1) + us.ihmc.idl.CDR.alignment(current_alignment, 1);
      current_alignment += ((4) * 1) + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      return current_alignment - initial_alignment;
   }

   public static void write(px4_msgs.msg.dds.MagnetometerBiasEstimate data, us.ihmc.idl.CDR cdr)
   {
      cdr.write_type_12(data.getTimestamp());

      for(int i0 = 0; i0 < data.getBiasX().length; ++i0)
      {
        	cdr.write_type_5(data.getBiasX()[i0]);	
      }

      for(int i0 = 0; i0 < data.getBiasY().length; ++i0)
      {
        	cdr.write_type_5(data.getBiasY()[i0]);	
      }

      for(int i0 = 0; i0 < data.getBiasZ().length; ++i0)
      {
        	cdr.write_type_5(data.getBiasZ()[i0]);	
      }

      for(int i0 = 0; i0 < data.getValid().length; ++i0)
      {
        	cdr.write_type_7(data.getValid()[i0]);	
      }

      for(int i0 = 0; i0 < data.getStable().length; ++i0)
      {
        	cdr.write_type_7(data.getStable()[i0]);	
      }

   }

   public static void read(px4_msgs.msg.dds.MagnetometerBiasEstimate data, us.ihmc.idl.CDR cdr)
   {
      data.setTimestamp(cdr.read_type_12());
      	
      for(int i0 = 0; i0 < data.getBiasX().length; ++i0)
      {
        	data.getBiasX()[i0] = cdr.read_type_5();
        	
      }
      	
      for(int i0 = 0; i0 < data.getBiasY().length; ++i0)
      {
        	data.getBiasY()[i0] = cdr.read_type_5();
        	
      }
      	
      for(int i0 = 0; i0 < data.getBiasZ().length; ++i0)
      {
        	data.getBiasZ()[i0] = cdr.read_type_5();
        	
      }
      	
      for(int i0 = 0; i0 < data.getValid().length; ++i0)
      {
        	data.getValid()[i0] = cdr.read_type_7();
        	
      }
      	
      for(int i0 = 0; i0 < data.getStable().length; ++i0)
      {
        	data.getStable()[i0] = cdr.read_type_7();
        	
      }
      	

   }

   @Override
   public final void serialize(px4_msgs.msg.dds.MagnetometerBiasEstimate data, us.ihmc.idl.InterchangeSerializer ser)
   {
      ser.write_type_12("timestamp", data.getTimestamp());
      ser.write_type_f("bias_x", data.getBiasX());
      ser.write_type_f("bias_y", data.getBiasY());
      ser.write_type_f("bias_z", data.getBiasZ());
      ser.write_type_f("valid", data.getValid());
      ser.write_type_f("stable", data.getStable());
   }

   @Override
   public final void deserialize(us.ihmc.idl.InterchangeSerializer ser, px4_msgs.msg.dds.MagnetometerBiasEstimate data)
   {
      data.setTimestamp(ser.read_type_12("timestamp"));
      ser.read_type_f("bias_x", data.getBiasX());
      ser.read_type_f("bias_y", data.getBiasY());
      ser.read_type_f("bias_z", data.getBiasZ());
      ser.read_type_f("valid", data.getValid());
      ser.read_type_f("stable", data.getStable());
   }

   public static void staticCopy(px4_msgs.msg.dds.MagnetometerBiasEstimate src, px4_msgs.msg.dds.MagnetometerBiasEstimate dest)
   {
      dest.set(src);
   }

   @Override
   public px4_msgs.msg.dds.MagnetometerBiasEstimate createData()
   {
      return new px4_msgs.msg.dds.MagnetometerBiasEstimate();
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
   
   public void serialize(px4_msgs.msg.dds.MagnetometerBiasEstimate data, us.ihmc.idl.CDR cdr)
   {
      write(data, cdr);
   }

   public void deserialize(px4_msgs.msg.dds.MagnetometerBiasEstimate data, us.ihmc.idl.CDR cdr)
   {
      read(data, cdr);
   }
   
   public void copy(px4_msgs.msg.dds.MagnetometerBiasEstimate src, px4_msgs.msg.dds.MagnetometerBiasEstimate dest)
   {
      staticCopy(src, dest);
   }

   @Override
   public MagnetometerBiasEstimatePubSubType newInstance()
   {
      return new MagnetometerBiasEstimatePubSubType();
   }
}
