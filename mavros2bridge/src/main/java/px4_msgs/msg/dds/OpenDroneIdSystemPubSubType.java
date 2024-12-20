package px4_msgs.msg.dds;

/**
* 
* Topic data type of the struct "OpenDroneIdSystem" defined in "OpenDroneIdSystem_.idl". Use this class to provide the TopicDataType to a Participant. 
*
* This file was automatically generated from OpenDroneIdSystem_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit OpenDroneIdSystem_.idl instead.
*
*/
public class OpenDroneIdSystemPubSubType implements us.ihmc.pubsub.TopicDataType<px4_msgs.msg.dds.OpenDroneIdSystem>
{
   public static final java.lang.String name = "px4_msgs::msg::dds_::OpenDroneIdSystem_";
   
   @Override
   public final java.lang.String getDefinitionChecksum()
   {
   		return "db9deec582eec557e335a7114ef61c97cddff668b0faf41345739e1b3e8bb37c";
   }
   
   @Override
   public final java.lang.String getDefinitionVersion()
   {
   		return "";
   }

   private final us.ihmc.idl.CDR serializeCDR = new us.ihmc.idl.CDR();
   private final us.ihmc.idl.CDR deserializeCDR = new us.ihmc.idl.CDR();

   @Override
   public void serialize(px4_msgs.msg.dds.OpenDroneIdSystem data, us.ihmc.pubsub.common.SerializedPayload serializedPayload) throws java.io.IOException
   {
      serializeCDR.serialize(serializedPayload);
      write(data, serializeCDR);
      serializeCDR.finishSerialize();
   }

   @Override
   public void deserialize(us.ihmc.pubsub.common.SerializedPayload serializedPayload, px4_msgs.msg.dds.OpenDroneIdSystem data) throws java.io.IOException
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

      current_alignment += ((20) * 1) + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 2 + us.ihmc.idl.CDR.alignment(current_alignment, 2);

      current_alignment += 2 + us.ihmc.idl.CDR.alignment(current_alignment, 2);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      return current_alignment - initial_alignment;
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.OpenDroneIdSystem data)
   {
      return getCdrSerializedSize(data, 0);
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.OpenDroneIdSystem data, int current_alignment)
   {
      int initial_alignment = current_alignment;

      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += ((20) * 1) + us.ihmc.idl.CDR.alignment(current_alignment, 1);
      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 2 + us.ihmc.idl.CDR.alignment(current_alignment, 2);


      current_alignment += 2 + us.ihmc.idl.CDR.alignment(current_alignment, 2);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);



      return current_alignment - initial_alignment;
   }

   public static void write(px4_msgs.msg.dds.OpenDroneIdSystem data, us.ihmc.idl.CDR cdr)
   {
      cdr.write_type_12(data.getTimestamp());

      for(int i0 = 0; i0 < data.getIdOrMac().length; ++i0)
      {
        	cdr.write_type_9(data.getIdOrMac()[i0]);	
      }

      cdr.write_type_9(data.getOperatorLocationType());

      cdr.write_type_9(data.getClassificationType());

      cdr.write_type_2(data.getOperatorLatitude());

      cdr.write_type_2(data.getOperatorLongitude());

      cdr.write_type_3(data.getAreaCount());

      cdr.write_type_3(data.getAreaRadius());

      cdr.write_type_5(data.getAreaCeiling());

      cdr.write_type_5(data.getAreaFloor());

      cdr.write_type_9(data.getCategoryEu());

      cdr.write_type_9(data.getClassEu());

      cdr.write_type_5(data.getOperatorAltitudeGeo());

   }

   public static void read(px4_msgs.msg.dds.OpenDroneIdSystem data, us.ihmc.idl.CDR cdr)
   {
      data.setTimestamp(cdr.read_type_12());
      	
      for(int i0 = 0; i0 < data.getIdOrMac().length; ++i0)
      {
        	data.getIdOrMac()[i0] = cdr.read_type_9();
        	
      }
      	
      data.setOperatorLocationType(cdr.read_type_9());
      	
      data.setClassificationType(cdr.read_type_9());
      	
      data.setOperatorLatitude(cdr.read_type_2());
      	
      data.setOperatorLongitude(cdr.read_type_2());
      	
      data.setAreaCount(cdr.read_type_3());
      	
      data.setAreaRadius(cdr.read_type_3());
      	
      data.setAreaCeiling(cdr.read_type_5());
      	
      data.setAreaFloor(cdr.read_type_5());
      	
      data.setCategoryEu(cdr.read_type_9());
      	
      data.setClassEu(cdr.read_type_9());
      	
      data.setOperatorAltitudeGeo(cdr.read_type_5());
      	

   }

   @Override
   public final void serialize(px4_msgs.msg.dds.OpenDroneIdSystem data, us.ihmc.idl.InterchangeSerializer ser)
   {
      ser.write_type_12("timestamp", data.getTimestamp());
      ser.write_type_f("id_or_mac", data.getIdOrMac());
      ser.write_type_9("operator_location_type", data.getOperatorLocationType());
      ser.write_type_9("classification_type", data.getClassificationType());
      ser.write_type_2("operator_latitude", data.getOperatorLatitude());
      ser.write_type_2("operator_longitude", data.getOperatorLongitude());
      ser.write_type_3("area_count", data.getAreaCount());
      ser.write_type_3("area_radius", data.getAreaRadius());
      ser.write_type_5("area_ceiling", data.getAreaCeiling());
      ser.write_type_5("area_floor", data.getAreaFloor());
      ser.write_type_9("category_eu", data.getCategoryEu());
      ser.write_type_9("class_eu", data.getClassEu());
      ser.write_type_5("operator_altitude_geo", data.getOperatorAltitudeGeo());
   }

   @Override
   public final void deserialize(us.ihmc.idl.InterchangeSerializer ser, px4_msgs.msg.dds.OpenDroneIdSystem data)
   {
      data.setTimestamp(ser.read_type_12("timestamp"));
      ser.read_type_f("id_or_mac", data.getIdOrMac());
      data.setOperatorLocationType(ser.read_type_9("operator_location_type"));
      data.setClassificationType(ser.read_type_9("classification_type"));
      data.setOperatorLatitude(ser.read_type_2("operator_latitude"));
      data.setOperatorLongitude(ser.read_type_2("operator_longitude"));
      data.setAreaCount(ser.read_type_3("area_count"));
      data.setAreaRadius(ser.read_type_3("area_radius"));
      data.setAreaCeiling(ser.read_type_5("area_ceiling"));
      data.setAreaFloor(ser.read_type_5("area_floor"));
      data.setCategoryEu(ser.read_type_9("category_eu"));
      data.setClassEu(ser.read_type_9("class_eu"));
      data.setOperatorAltitudeGeo(ser.read_type_5("operator_altitude_geo"));
   }

   public static void staticCopy(px4_msgs.msg.dds.OpenDroneIdSystem src, px4_msgs.msg.dds.OpenDroneIdSystem dest)
   {
      dest.set(src);
   }

   @Override
   public px4_msgs.msg.dds.OpenDroneIdSystem createData()
   {
      return new px4_msgs.msg.dds.OpenDroneIdSystem();
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
   
   public void serialize(px4_msgs.msg.dds.OpenDroneIdSystem data, us.ihmc.idl.CDR cdr)
   {
      write(data, cdr);
   }

   public void deserialize(px4_msgs.msg.dds.OpenDroneIdSystem data, us.ihmc.idl.CDR cdr)
   {
      read(data, cdr);
   }
   
   public void copy(px4_msgs.msg.dds.OpenDroneIdSystem src, px4_msgs.msg.dds.OpenDroneIdSystem dest)
   {
      staticCopy(src, dest);
   }

   @Override
   public OpenDroneIdSystemPubSubType newInstance()
   {
      return new OpenDroneIdSystemPubSubType();
   }
}
