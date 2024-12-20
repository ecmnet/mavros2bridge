package px4_msgs.msg.dds;

/**
* 
* Topic data type of the struct "Ekf2Timestamps" defined in "Ekf2Timestamps_.idl". Use this class to provide the TopicDataType to a Participant. 
*
* This file was automatically generated from Ekf2Timestamps_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit Ekf2Timestamps_.idl instead.
*
*/
public class Ekf2TimestampsPubSubType implements us.ihmc.pubsub.TopicDataType<px4_msgs.msg.dds.Ekf2Timestamps>
{
   public static final java.lang.String name = "px4_msgs::msg::dds_::Ekf2Timestamps_";
   
   @Override
   public final java.lang.String getDefinitionChecksum()
   {
   		return "074a4fb6b69a89eb2cda5cbf3d85fad97c2987a5221ded073c8b78ad58a3374e";
   }
   
   @Override
   public final java.lang.String getDefinitionVersion()
   {
   		return "";
   }

   private final us.ihmc.idl.CDR serializeCDR = new us.ihmc.idl.CDR();
   private final us.ihmc.idl.CDR deserializeCDR = new us.ihmc.idl.CDR();

   @Override
   public void serialize(px4_msgs.msg.dds.Ekf2Timestamps data, us.ihmc.pubsub.common.SerializedPayload serializedPayload) throws java.io.IOException
   {
      serializeCDR.serialize(serializedPayload);
      write(data, serializeCDR);
      serializeCDR.finishSerialize();
   }

   @Override
   public void deserialize(us.ihmc.pubsub.common.SerializedPayload serializedPayload, px4_msgs.msg.dds.Ekf2Timestamps data) throws java.io.IOException
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

      current_alignment += 2 + us.ihmc.idl.CDR.alignment(current_alignment, 2);

      current_alignment += 2 + us.ihmc.idl.CDR.alignment(current_alignment, 2);

      current_alignment += 2 + us.ihmc.idl.CDR.alignment(current_alignment, 2);

      current_alignment += 2 + us.ihmc.idl.CDR.alignment(current_alignment, 2);

      current_alignment += 2 + us.ihmc.idl.CDR.alignment(current_alignment, 2);

      current_alignment += 2 + us.ihmc.idl.CDR.alignment(current_alignment, 2);


      return current_alignment - initial_alignment;
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.Ekf2Timestamps data)
   {
      return getCdrSerializedSize(data, 0);
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.Ekf2Timestamps data, int current_alignment)
   {
      int initial_alignment = current_alignment;

      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += 2 + us.ihmc.idl.CDR.alignment(current_alignment, 2);


      current_alignment += 2 + us.ihmc.idl.CDR.alignment(current_alignment, 2);


      current_alignment += 2 + us.ihmc.idl.CDR.alignment(current_alignment, 2);


      current_alignment += 2 + us.ihmc.idl.CDR.alignment(current_alignment, 2);


      current_alignment += 2 + us.ihmc.idl.CDR.alignment(current_alignment, 2);


      current_alignment += 2 + us.ihmc.idl.CDR.alignment(current_alignment, 2);



      return current_alignment - initial_alignment;
   }

   public static void write(px4_msgs.msg.dds.Ekf2Timestamps data, us.ihmc.idl.CDR cdr)
   {
      cdr.write_type_12(data.getTimestamp());

      cdr.write_type_1(data.getAirspeedTimestampRel());

      cdr.write_type_1(data.getDistanceSensorTimestampRel());

      cdr.write_type_1(data.getOpticalFlowTimestampRel());

      cdr.write_type_1(data.getVehicleAirDataTimestampRel());

      cdr.write_type_1(data.getVehicleMagnetometerTimestampRel());

      cdr.write_type_1(data.getVisualOdometryTimestampRel());

   }

   public static void read(px4_msgs.msg.dds.Ekf2Timestamps data, us.ihmc.idl.CDR cdr)
   {
      data.setTimestamp(cdr.read_type_12());
      	
      data.setAirspeedTimestampRel(cdr.read_type_1());
      	
      data.setDistanceSensorTimestampRel(cdr.read_type_1());
      	
      data.setOpticalFlowTimestampRel(cdr.read_type_1());
      	
      data.setVehicleAirDataTimestampRel(cdr.read_type_1());
      	
      data.setVehicleMagnetometerTimestampRel(cdr.read_type_1());
      	
      data.setVisualOdometryTimestampRel(cdr.read_type_1());
      	

   }

   @Override
   public final void serialize(px4_msgs.msg.dds.Ekf2Timestamps data, us.ihmc.idl.InterchangeSerializer ser)
   {
      ser.write_type_12("timestamp", data.getTimestamp());
      ser.write_type_1("airspeed_timestamp_rel", data.getAirspeedTimestampRel());
      ser.write_type_1("distance_sensor_timestamp_rel", data.getDistanceSensorTimestampRel());
      ser.write_type_1("optical_flow_timestamp_rel", data.getOpticalFlowTimestampRel());
      ser.write_type_1("vehicle_air_data_timestamp_rel", data.getVehicleAirDataTimestampRel());
      ser.write_type_1("vehicle_magnetometer_timestamp_rel", data.getVehicleMagnetometerTimestampRel());
      ser.write_type_1("visual_odometry_timestamp_rel", data.getVisualOdometryTimestampRel());
   }

   @Override
   public final void deserialize(us.ihmc.idl.InterchangeSerializer ser, px4_msgs.msg.dds.Ekf2Timestamps data)
   {
      data.setTimestamp(ser.read_type_12("timestamp"));
      data.setAirspeedTimestampRel(ser.read_type_1("airspeed_timestamp_rel"));
      data.setDistanceSensorTimestampRel(ser.read_type_1("distance_sensor_timestamp_rel"));
      data.setOpticalFlowTimestampRel(ser.read_type_1("optical_flow_timestamp_rel"));
      data.setVehicleAirDataTimestampRel(ser.read_type_1("vehicle_air_data_timestamp_rel"));
      data.setVehicleMagnetometerTimestampRel(ser.read_type_1("vehicle_magnetometer_timestamp_rel"));
      data.setVisualOdometryTimestampRel(ser.read_type_1("visual_odometry_timestamp_rel"));
   }

   public static void staticCopy(px4_msgs.msg.dds.Ekf2Timestamps src, px4_msgs.msg.dds.Ekf2Timestamps dest)
   {
      dest.set(src);
   }

   @Override
   public px4_msgs.msg.dds.Ekf2Timestamps createData()
   {
      return new px4_msgs.msg.dds.Ekf2Timestamps();
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
   
   public void serialize(px4_msgs.msg.dds.Ekf2Timestamps data, us.ihmc.idl.CDR cdr)
   {
      write(data, cdr);
   }

   public void deserialize(px4_msgs.msg.dds.Ekf2Timestamps data, us.ihmc.idl.CDR cdr)
   {
      read(data, cdr);
   }
   
   public void copy(px4_msgs.msg.dds.Ekf2Timestamps src, px4_msgs.msg.dds.Ekf2Timestamps dest)
   {
      staticCopy(src, dest);
   }

   @Override
   public Ekf2TimestampsPubSubType newInstance()
   {
      return new Ekf2TimestampsPubSubType();
   }
}
