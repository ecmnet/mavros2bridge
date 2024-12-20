package px4_msgs.msg.dds;

/**
* 
* Topic data type of the struct "RateCtrlStatus" defined in "RateCtrlStatus_.idl". Use this class to provide the TopicDataType to a Participant. 
*
* This file was automatically generated from RateCtrlStatus_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit RateCtrlStatus_.idl instead.
*
*/
public class RateCtrlStatusPubSubType implements us.ihmc.pubsub.TopicDataType<px4_msgs.msg.dds.RateCtrlStatus>
{
   public static final java.lang.String name = "px4_msgs::msg::dds_::RateCtrlStatus_";
   
   @Override
   public final java.lang.String getDefinitionChecksum()
   {
   		return "bdf320538195dffe4567664e776daedde6402c2b284916e4278da26dcd11c666";
   }
   
   @Override
   public final java.lang.String getDefinitionVersion()
   {
   		return "";
   }

   private final us.ihmc.idl.CDR serializeCDR = new us.ihmc.idl.CDR();
   private final us.ihmc.idl.CDR deserializeCDR = new us.ihmc.idl.CDR();

   @Override
   public void serialize(px4_msgs.msg.dds.RateCtrlStatus data, us.ihmc.pubsub.common.SerializedPayload serializedPayload) throws java.io.IOException
   {
      serializeCDR.serialize(serializedPayload);
      write(data, serializeCDR);
      serializeCDR.finishSerialize();
   }

   @Override
   public void deserialize(us.ihmc.pubsub.common.SerializedPayload serializedPayload, px4_msgs.msg.dds.RateCtrlStatus data) throws java.io.IOException
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

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      return current_alignment - initial_alignment;
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.RateCtrlStatus data)
   {
      return getCdrSerializedSize(data, 0);
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.RateCtrlStatus data, int current_alignment)
   {
      int initial_alignment = current_alignment;

      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);



      return current_alignment - initial_alignment;
   }

   public static void write(px4_msgs.msg.dds.RateCtrlStatus data, us.ihmc.idl.CDR cdr)
   {
      cdr.write_type_12(data.getTimestamp());

      cdr.write_type_5(data.getRollspeedInteg());

      cdr.write_type_5(data.getPitchspeedInteg());

      cdr.write_type_5(data.getYawspeedInteg());

      cdr.write_type_5(data.getWheelRateInteg());

   }

   public static void read(px4_msgs.msg.dds.RateCtrlStatus data, us.ihmc.idl.CDR cdr)
   {
      data.setTimestamp(cdr.read_type_12());
      	
      data.setRollspeedInteg(cdr.read_type_5());
      	
      data.setPitchspeedInteg(cdr.read_type_5());
      	
      data.setYawspeedInteg(cdr.read_type_5());
      	
      data.setWheelRateInteg(cdr.read_type_5());
      	

   }

   @Override
   public final void serialize(px4_msgs.msg.dds.RateCtrlStatus data, us.ihmc.idl.InterchangeSerializer ser)
   {
      ser.write_type_12("timestamp", data.getTimestamp());
      ser.write_type_5("rollspeed_integ", data.getRollspeedInteg());
      ser.write_type_5("pitchspeed_integ", data.getPitchspeedInteg());
      ser.write_type_5("yawspeed_integ", data.getYawspeedInteg());
      ser.write_type_5("wheel_rate_integ", data.getWheelRateInteg());
   }

   @Override
   public final void deserialize(us.ihmc.idl.InterchangeSerializer ser, px4_msgs.msg.dds.RateCtrlStatus data)
   {
      data.setTimestamp(ser.read_type_12("timestamp"));
      data.setRollspeedInteg(ser.read_type_5("rollspeed_integ"));
      data.setPitchspeedInteg(ser.read_type_5("pitchspeed_integ"));
      data.setYawspeedInteg(ser.read_type_5("yawspeed_integ"));
      data.setWheelRateInteg(ser.read_type_5("wheel_rate_integ"));
   }

   public static void staticCopy(px4_msgs.msg.dds.RateCtrlStatus src, px4_msgs.msg.dds.RateCtrlStatus dest)
   {
      dest.set(src);
   }

   @Override
   public px4_msgs.msg.dds.RateCtrlStatus createData()
   {
      return new px4_msgs.msg.dds.RateCtrlStatus();
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
   
   public void serialize(px4_msgs.msg.dds.RateCtrlStatus data, us.ihmc.idl.CDR cdr)
   {
      write(data, cdr);
   }

   public void deserialize(px4_msgs.msg.dds.RateCtrlStatus data, us.ihmc.idl.CDR cdr)
   {
      read(data, cdr);
   }
   
   public void copy(px4_msgs.msg.dds.RateCtrlStatus src, px4_msgs.msg.dds.RateCtrlStatus dest)
   {
      staticCopy(src, dest);
   }

   @Override
   public RateCtrlStatusPubSubType newInstance()
   {
      return new RateCtrlStatusPubSubType();
   }
}
