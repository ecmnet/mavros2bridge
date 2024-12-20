package px4_msgs.msg.dds;

/**
* 
* Topic data type of the struct "VehicleLandDetected" defined in "VehicleLandDetected_.idl". Use this class to provide the TopicDataType to a Participant. 
*
* This file was automatically generated from VehicleLandDetected_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit VehicleLandDetected_.idl instead.
*
*/
public class VehicleLandDetectedPubSubType implements us.ihmc.pubsub.TopicDataType<px4_msgs.msg.dds.VehicleLandDetected>
{
   public static final java.lang.String name = "px4_msgs::msg::dds_::VehicleLandDetected_";
   
   @Override
   public final java.lang.String getDefinitionChecksum()
   {
   		return "37ec6f63b0c3156985b821d629c43c0d6a1f59bca0a3f43ccf5ef7681ea39d63";
   }
   
   @Override
   public final java.lang.String getDefinitionVersion()
   {
   		return "";
   }

   private final us.ihmc.idl.CDR serializeCDR = new us.ihmc.idl.CDR();
   private final us.ihmc.idl.CDR deserializeCDR = new us.ihmc.idl.CDR();

   @Override
   public void serialize(px4_msgs.msg.dds.VehicleLandDetected data, us.ihmc.pubsub.common.SerializedPayload serializedPayload) throws java.io.IOException
   {
      serializeCDR.serialize(serializedPayload);
      write(data, serializeCDR);
      serializeCDR.finishSerialize();
   }

   @Override
   public void deserialize(us.ihmc.pubsub.common.SerializedPayload serializedPayload, px4_msgs.msg.dds.VehicleLandDetected data) throws java.io.IOException
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

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      return current_alignment - initial_alignment;
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.VehicleLandDetected data)
   {
      return getCdrSerializedSize(data, 0);
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.VehicleLandDetected data, int current_alignment)
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


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);



      return current_alignment - initial_alignment;
   }

   public static void write(px4_msgs.msg.dds.VehicleLandDetected data, us.ihmc.idl.CDR cdr)
   {
      cdr.write_type_12(data.getTimestamp());

      cdr.write_type_7(data.getFreefall());

      cdr.write_type_7(data.getGroundContact());

      cdr.write_type_7(data.getMaybeLanded());

      cdr.write_type_7(data.getLanded());

      cdr.write_type_7(data.getInGroundEffect());

      cdr.write_type_7(data.getInDescend());

      cdr.write_type_7(data.getHasLowThrottle());

      cdr.write_type_7(data.getVerticalMovement());

      cdr.write_type_7(data.getHorizontalMovement());

      cdr.write_type_7(data.getRotationalMovement());

      cdr.write_type_7(data.getCloseToGroundOrSkippedCheck());

      cdr.write_type_7(data.getAtRest());

   }

   public static void read(px4_msgs.msg.dds.VehicleLandDetected data, us.ihmc.idl.CDR cdr)
   {
      data.setTimestamp(cdr.read_type_12());
      	
      data.setFreefall(cdr.read_type_7());
      	
      data.setGroundContact(cdr.read_type_7());
      	
      data.setMaybeLanded(cdr.read_type_7());
      	
      data.setLanded(cdr.read_type_7());
      	
      data.setInGroundEffect(cdr.read_type_7());
      	
      data.setInDescend(cdr.read_type_7());
      	
      data.setHasLowThrottle(cdr.read_type_7());
      	
      data.setVerticalMovement(cdr.read_type_7());
      	
      data.setHorizontalMovement(cdr.read_type_7());
      	
      data.setRotationalMovement(cdr.read_type_7());
      	
      data.setCloseToGroundOrSkippedCheck(cdr.read_type_7());
      	
      data.setAtRest(cdr.read_type_7());
      	

   }

   @Override
   public final void serialize(px4_msgs.msg.dds.VehicleLandDetected data, us.ihmc.idl.InterchangeSerializer ser)
   {
      ser.write_type_12("timestamp", data.getTimestamp());
      ser.write_type_7("freefall", data.getFreefall());
      ser.write_type_7("ground_contact", data.getGroundContact());
      ser.write_type_7("maybe_landed", data.getMaybeLanded());
      ser.write_type_7("landed", data.getLanded());
      ser.write_type_7("in_ground_effect", data.getInGroundEffect());
      ser.write_type_7("in_descend", data.getInDescend());
      ser.write_type_7("has_low_throttle", data.getHasLowThrottle());
      ser.write_type_7("vertical_movement", data.getVerticalMovement());
      ser.write_type_7("horizontal_movement", data.getHorizontalMovement());
      ser.write_type_7("rotational_movement", data.getRotationalMovement());
      ser.write_type_7("close_to_ground_or_skipped_check", data.getCloseToGroundOrSkippedCheck());
      ser.write_type_7("at_rest", data.getAtRest());
   }

   @Override
   public final void deserialize(us.ihmc.idl.InterchangeSerializer ser, px4_msgs.msg.dds.VehicleLandDetected data)
   {
      data.setTimestamp(ser.read_type_12("timestamp"));
      data.setFreefall(ser.read_type_7("freefall"));
      data.setGroundContact(ser.read_type_7("ground_contact"));
      data.setMaybeLanded(ser.read_type_7("maybe_landed"));
      data.setLanded(ser.read_type_7("landed"));
      data.setInGroundEffect(ser.read_type_7("in_ground_effect"));
      data.setInDescend(ser.read_type_7("in_descend"));
      data.setHasLowThrottle(ser.read_type_7("has_low_throttle"));
      data.setVerticalMovement(ser.read_type_7("vertical_movement"));
      data.setHorizontalMovement(ser.read_type_7("horizontal_movement"));
      data.setRotationalMovement(ser.read_type_7("rotational_movement"));
      data.setCloseToGroundOrSkippedCheck(ser.read_type_7("close_to_ground_or_skipped_check"));
      data.setAtRest(ser.read_type_7("at_rest"));
   }

   public static void staticCopy(px4_msgs.msg.dds.VehicleLandDetected src, px4_msgs.msg.dds.VehicleLandDetected dest)
   {
      dest.set(src);
   }

   @Override
   public px4_msgs.msg.dds.VehicleLandDetected createData()
   {
      return new px4_msgs.msg.dds.VehicleLandDetected();
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
   
   public void serialize(px4_msgs.msg.dds.VehicleLandDetected data, us.ihmc.idl.CDR cdr)
   {
      write(data, cdr);
   }

   public void deserialize(px4_msgs.msg.dds.VehicleLandDetected data, us.ihmc.idl.CDR cdr)
   {
      read(data, cdr);
   }
   
   public void copy(px4_msgs.msg.dds.VehicleLandDetected src, px4_msgs.msg.dds.VehicleLandDetected dest)
   {
      staticCopy(src, dest);
   }

   @Override
   public VehicleLandDetectedPubSubType newInstance()
   {
      return new VehicleLandDetectedPubSubType();
   }
}
