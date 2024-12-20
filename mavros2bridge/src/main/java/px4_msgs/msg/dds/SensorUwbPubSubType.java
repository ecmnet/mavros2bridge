package px4_msgs.msg.dds;

/**
* 
* Topic data type of the struct "SensorUwb" defined in "SensorUwb_.idl". Use this class to provide the TopicDataType to a Participant. 
*
* This file was automatically generated from SensorUwb_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit SensorUwb_.idl instead.
*
*/
public class SensorUwbPubSubType implements us.ihmc.pubsub.TopicDataType<px4_msgs.msg.dds.SensorUwb>
{
   public static final java.lang.String name = "px4_msgs::msg::dds_::SensorUwb_";
   
   @Override
   public final java.lang.String getDefinitionChecksum()
   {
   		return "c3acaea8914584d19032e53bda8f8e54075d32225811b2479ce16896b1a974af";
   }
   
   @Override
   public final java.lang.String getDefinitionVersion()
   {
   		return "";
   }

   private final us.ihmc.idl.CDR serializeCDR = new us.ihmc.idl.CDR();
   private final us.ihmc.idl.CDR deserializeCDR = new us.ihmc.idl.CDR();

   @Override
   public void serialize(px4_msgs.msg.dds.SensorUwb data, us.ihmc.pubsub.common.SerializedPayload serializedPayload) throws java.io.IOException
   {
      serializeCDR.serialize(serializedPayload);
      write(data, serializeCDR);
      serializeCDR.finishSerialize();
   }

   @Override
   public void deserialize(us.ihmc.pubsub.common.SerializedPayload serializedPayload, px4_msgs.msg.dds.SensorUwb data) throws java.io.IOException
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

      current_alignment += 2 + us.ihmc.idl.CDR.alignment(current_alignment, 2);

      current_alignment += 2 + us.ihmc.idl.CDR.alignment(current_alignment, 2);

      current_alignment += 2 + us.ihmc.idl.CDR.alignment(current_alignment, 2);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      return current_alignment - initial_alignment;
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.SensorUwb data)
   {
      return getCdrSerializedSize(data, 0);
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.SensorUwb data, int current_alignment)
   {
      int initial_alignment = current_alignment;

      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 2 + us.ihmc.idl.CDR.alignment(current_alignment, 2);


      current_alignment += 2 + us.ihmc.idl.CDR.alignment(current_alignment, 2);


      current_alignment += 2 + us.ihmc.idl.CDR.alignment(current_alignment, 2);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);



      return current_alignment - initial_alignment;
   }

   public static void write(px4_msgs.msg.dds.SensorUwb data, us.ihmc.idl.CDR cdr)
   {
      cdr.write_type_12(data.getTimestamp());

      cdr.write_type_4(data.getSessionid());

      cdr.write_type_4(data.getTimeOffset());

      cdr.write_type_4(data.getCounter());

      cdr.write_type_3(data.getMac());

      cdr.write_type_3(data.getMacDest());

      cdr.write_type_3(data.getStatus());

      cdr.write_type_9(data.getNlos());

      cdr.write_type_5(data.getDistance());

      cdr.write_type_5(data.getAoaAzimuthDev());

      cdr.write_type_5(data.getAoaElevationDev());

      cdr.write_type_5(data.getAoaAzimuthResp());

      cdr.write_type_5(data.getAoaElevationResp());

      cdr.write_type_9(data.getAoaAzimuthFom());

      cdr.write_type_9(data.getAoaElevationFom());

      cdr.write_type_9(data.getAoaDestAzimuthFom());

      cdr.write_type_9(data.getAoaDestElevationFom());

      cdr.write_type_9(data.getOrientation());

      cdr.write_type_5(data.getOffsetX());

      cdr.write_type_5(data.getOffsetY());

      cdr.write_type_5(data.getOffsetZ());

   }

   public static void read(px4_msgs.msg.dds.SensorUwb data, us.ihmc.idl.CDR cdr)
   {
      data.setTimestamp(cdr.read_type_12());
      	
      data.setSessionid(cdr.read_type_4());
      	
      data.setTimeOffset(cdr.read_type_4());
      	
      data.setCounter(cdr.read_type_4());
      	
      data.setMac(cdr.read_type_3());
      	
      data.setMacDest(cdr.read_type_3());
      	
      data.setStatus(cdr.read_type_3());
      	
      data.setNlos(cdr.read_type_9());
      	
      data.setDistance(cdr.read_type_5());
      	
      data.setAoaAzimuthDev(cdr.read_type_5());
      	
      data.setAoaElevationDev(cdr.read_type_5());
      	
      data.setAoaAzimuthResp(cdr.read_type_5());
      	
      data.setAoaElevationResp(cdr.read_type_5());
      	
      data.setAoaAzimuthFom(cdr.read_type_9());
      	
      data.setAoaElevationFom(cdr.read_type_9());
      	
      data.setAoaDestAzimuthFom(cdr.read_type_9());
      	
      data.setAoaDestElevationFom(cdr.read_type_9());
      	
      data.setOrientation(cdr.read_type_9());
      	
      data.setOffsetX(cdr.read_type_5());
      	
      data.setOffsetY(cdr.read_type_5());
      	
      data.setOffsetZ(cdr.read_type_5());
      	

   }

   @Override
   public final void serialize(px4_msgs.msg.dds.SensorUwb data, us.ihmc.idl.InterchangeSerializer ser)
   {
      ser.write_type_12("timestamp", data.getTimestamp());
      ser.write_type_4("sessionid", data.getSessionid());
      ser.write_type_4("time_offset", data.getTimeOffset());
      ser.write_type_4("counter", data.getCounter());
      ser.write_type_3("mac", data.getMac());
      ser.write_type_3("mac_dest", data.getMacDest());
      ser.write_type_3("status", data.getStatus());
      ser.write_type_9("nlos", data.getNlos());
      ser.write_type_5("distance", data.getDistance());
      ser.write_type_5("aoa_azimuth_dev", data.getAoaAzimuthDev());
      ser.write_type_5("aoa_elevation_dev", data.getAoaElevationDev());
      ser.write_type_5("aoa_azimuth_resp", data.getAoaAzimuthResp());
      ser.write_type_5("aoa_elevation_resp", data.getAoaElevationResp());
      ser.write_type_9("aoa_azimuth_fom", data.getAoaAzimuthFom());
      ser.write_type_9("aoa_elevation_fom", data.getAoaElevationFom());
      ser.write_type_9("aoa_dest_azimuth_fom", data.getAoaDestAzimuthFom());
      ser.write_type_9("aoa_dest_elevation_fom", data.getAoaDestElevationFom());
      ser.write_type_9("orientation", data.getOrientation());
      ser.write_type_5("offset_x", data.getOffsetX());
      ser.write_type_5("offset_y", data.getOffsetY());
      ser.write_type_5("offset_z", data.getOffsetZ());
   }

   @Override
   public final void deserialize(us.ihmc.idl.InterchangeSerializer ser, px4_msgs.msg.dds.SensorUwb data)
   {
      data.setTimestamp(ser.read_type_12("timestamp"));
      data.setSessionid(ser.read_type_4("sessionid"));
      data.setTimeOffset(ser.read_type_4("time_offset"));
      data.setCounter(ser.read_type_4("counter"));
      data.setMac(ser.read_type_3("mac"));
      data.setMacDest(ser.read_type_3("mac_dest"));
      data.setStatus(ser.read_type_3("status"));
      data.setNlos(ser.read_type_9("nlos"));
      data.setDistance(ser.read_type_5("distance"));
      data.setAoaAzimuthDev(ser.read_type_5("aoa_azimuth_dev"));
      data.setAoaElevationDev(ser.read_type_5("aoa_elevation_dev"));
      data.setAoaAzimuthResp(ser.read_type_5("aoa_azimuth_resp"));
      data.setAoaElevationResp(ser.read_type_5("aoa_elevation_resp"));
      data.setAoaAzimuthFom(ser.read_type_9("aoa_azimuth_fom"));
      data.setAoaElevationFom(ser.read_type_9("aoa_elevation_fom"));
      data.setAoaDestAzimuthFom(ser.read_type_9("aoa_dest_azimuth_fom"));
      data.setAoaDestElevationFom(ser.read_type_9("aoa_dest_elevation_fom"));
      data.setOrientation(ser.read_type_9("orientation"));
      data.setOffsetX(ser.read_type_5("offset_x"));
      data.setOffsetY(ser.read_type_5("offset_y"));
      data.setOffsetZ(ser.read_type_5("offset_z"));
   }

   public static void staticCopy(px4_msgs.msg.dds.SensorUwb src, px4_msgs.msg.dds.SensorUwb dest)
   {
      dest.set(src);
   }

   @Override
   public px4_msgs.msg.dds.SensorUwb createData()
   {
      return new px4_msgs.msg.dds.SensorUwb();
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
   
   public void serialize(px4_msgs.msg.dds.SensorUwb data, us.ihmc.idl.CDR cdr)
   {
      write(data, cdr);
   }

   public void deserialize(px4_msgs.msg.dds.SensorUwb data, us.ihmc.idl.CDR cdr)
   {
      read(data, cdr);
   }
   
   public void copy(px4_msgs.msg.dds.SensorUwb src, px4_msgs.msg.dds.SensorUwb dest)
   {
      staticCopy(src, dest);
   }

   @Override
   public SensorUwbPubSubType newInstance()
   {
      return new SensorUwbPubSubType();
   }
}
