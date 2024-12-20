package px4_msgs.msg.dds;

/**
* 
* Topic data type of the struct "SatelliteInfo" defined in "SatelliteInfo_.idl". Use this class to provide the TopicDataType to a Participant. 
*
* This file was automatically generated from SatelliteInfo_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit SatelliteInfo_.idl instead.
*
*/
public class SatelliteInfoPubSubType implements us.ihmc.pubsub.TopicDataType<px4_msgs.msg.dds.SatelliteInfo>
{
   public static final java.lang.String name = "px4_msgs::msg::dds_::SatelliteInfo_";
   
   @Override
   public final java.lang.String getDefinitionChecksum()
   {
   		return "38287455a5c7f32ad80f7de5132382e681f110641552f3d963c251dfc53b6d65";
   }
   
   @Override
   public final java.lang.String getDefinitionVersion()
   {
   		return "";
   }

   private final us.ihmc.idl.CDR serializeCDR = new us.ihmc.idl.CDR();
   private final us.ihmc.idl.CDR deserializeCDR = new us.ihmc.idl.CDR();

   @Override
   public void serialize(px4_msgs.msg.dds.SatelliteInfo data, us.ihmc.pubsub.common.SerializedPayload serializedPayload) throws java.io.IOException
   {
      serializeCDR.serialize(serializedPayload);
      write(data, serializeCDR);
      serializeCDR.finishSerialize();
   }

   @Override
   public void deserialize(us.ihmc.pubsub.common.SerializedPayload serializedPayload, px4_msgs.msg.dds.SatelliteInfo data) throws java.io.IOException
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

      current_alignment += ((20) * 1) + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += ((20) * 1) + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += ((20) * 1) + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += ((20) * 1) + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += ((20) * 1) + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += ((20) * 1) + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      return current_alignment - initial_alignment;
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.SatelliteInfo data)
   {
      return getCdrSerializedSize(data, 0);
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.SatelliteInfo data, int current_alignment)
   {
      int initial_alignment = current_alignment;

      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += ((20) * 1) + us.ihmc.idl.CDR.alignment(current_alignment, 1);
      current_alignment += ((20) * 1) + us.ihmc.idl.CDR.alignment(current_alignment, 1);
      current_alignment += ((20) * 1) + us.ihmc.idl.CDR.alignment(current_alignment, 1);
      current_alignment += ((20) * 1) + us.ihmc.idl.CDR.alignment(current_alignment, 1);
      current_alignment += ((20) * 1) + us.ihmc.idl.CDR.alignment(current_alignment, 1);
      current_alignment += ((20) * 1) + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      return current_alignment - initial_alignment;
   }

   public static void write(px4_msgs.msg.dds.SatelliteInfo data, us.ihmc.idl.CDR cdr)
   {
      cdr.write_type_12(data.getTimestamp());

      cdr.write_type_9(data.getCount());

      for(int i0 = 0; i0 < data.getSvid().length; ++i0)
      {
        	cdr.write_type_9(data.getSvid()[i0]);	
      }

      for(int i0 = 0; i0 < data.getUsed().length; ++i0)
      {
        	cdr.write_type_9(data.getUsed()[i0]);	
      }

      for(int i0 = 0; i0 < data.getElevation().length; ++i0)
      {
        	cdr.write_type_9(data.getElevation()[i0]);	
      }

      for(int i0 = 0; i0 < data.getAzimuth().length; ++i0)
      {
        	cdr.write_type_9(data.getAzimuth()[i0]);	
      }

      for(int i0 = 0; i0 < data.getSnr().length; ++i0)
      {
        	cdr.write_type_9(data.getSnr()[i0]);	
      }

      for(int i0 = 0; i0 < data.getPrn().length; ++i0)
      {
        	cdr.write_type_9(data.getPrn()[i0]);	
      }

   }

   public static void read(px4_msgs.msg.dds.SatelliteInfo data, us.ihmc.idl.CDR cdr)
   {
      data.setTimestamp(cdr.read_type_12());
      	
      data.setCount(cdr.read_type_9());
      	
      for(int i0 = 0; i0 < data.getSvid().length; ++i0)
      {
        	data.getSvid()[i0] = cdr.read_type_9();
        	
      }
      	
      for(int i0 = 0; i0 < data.getUsed().length; ++i0)
      {
        	data.getUsed()[i0] = cdr.read_type_9();
        	
      }
      	
      for(int i0 = 0; i0 < data.getElevation().length; ++i0)
      {
        	data.getElevation()[i0] = cdr.read_type_9();
        	
      }
      	
      for(int i0 = 0; i0 < data.getAzimuth().length; ++i0)
      {
        	data.getAzimuth()[i0] = cdr.read_type_9();
        	
      }
      	
      for(int i0 = 0; i0 < data.getSnr().length; ++i0)
      {
        	data.getSnr()[i0] = cdr.read_type_9();
        	
      }
      	
      for(int i0 = 0; i0 < data.getPrn().length; ++i0)
      {
        	data.getPrn()[i0] = cdr.read_type_9();
        	
      }
      	

   }

   @Override
   public final void serialize(px4_msgs.msg.dds.SatelliteInfo data, us.ihmc.idl.InterchangeSerializer ser)
   {
      ser.write_type_12("timestamp", data.getTimestamp());
      ser.write_type_9("count", data.getCount());
      ser.write_type_f("svid", data.getSvid());
      ser.write_type_f("used", data.getUsed());
      ser.write_type_f("elevation", data.getElevation());
      ser.write_type_f("azimuth", data.getAzimuth());
      ser.write_type_f("snr", data.getSnr());
      ser.write_type_f("prn", data.getPrn());
   }

   @Override
   public final void deserialize(us.ihmc.idl.InterchangeSerializer ser, px4_msgs.msg.dds.SatelliteInfo data)
   {
      data.setTimestamp(ser.read_type_12("timestamp"));
      data.setCount(ser.read_type_9("count"));
      ser.read_type_f("svid", data.getSvid());
      ser.read_type_f("used", data.getUsed());
      ser.read_type_f("elevation", data.getElevation());
      ser.read_type_f("azimuth", data.getAzimuth());
      ser.read_type_f("snr", data.getSnr());
      ser.read_type_f("prn", data.getPrn());
   }

   public static void staticCopy(px4_msgs.msg.dds.SatelliteInfo src, px4_msgs.msg.dds.SatelliteInfo dest)
   {
      dest.set(src);
   }

   @Override
   public px4_msgs.msg.dds.SatelliteInfo createData()
   {
      return new px4_msgs.msg.dds.SatelliteInfo();
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
   
   public void serialize(px4_msgs.msg.dds.SatelliteInfo data, us.ihmc.idl.CDR cdr)
   {
      write(data, cdr);
   }

   public void deserialize(px4_msgs.msg.dds.SatelliteInfo data, us.ihmc.idl.CDR cdr)
   {
      read(data, cdr);
   }
   
   public void copy(px4_msgs.msg.dds.SatelliteInfo src, px4_msgs.msg.dds.SatelliteInfo dest)
   {
      staticCopy(src, dest);
   }

   @Override
   public SatelliteInfoPubSubType newInstance()
   {
      return new SatelliteInfoPubSubType();
   }
}
