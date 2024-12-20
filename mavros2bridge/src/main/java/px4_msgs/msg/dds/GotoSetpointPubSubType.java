package px4_msgs.msg.dds;

/**
* 
* Topic data type of the struct "GotoSetpoint" defined in "GotoSetpoint_.idl". Use this class to provide the TopicDataType to a Participant. 
*
* This file was automatically generated from GotoSetpoint_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit GotoSetpoint_.idl instead.
*
*/
public class GotoSetpointPubSubType implements us.ihmc.pubsub.TopicDataType<px4_msgs.msg.dds.GotoSetpoint>
{
   public static final java.lang.String name = "px4_msgs::msg::dds_::GotoSetpoint_";
   
   @Override
   public final java.lang.String getDefinitionChecksum()
   {
   		return "577180a6aeb5727118e141083b398f71170b1b51c614d66cf37f5ca1502f864f";
   }
   
   @Override
   public final java.lang.String getDefinitionVersion()
   {
   		return "";
   }

   private final us.ihmc.idl.CDR serializeCDR = new us.ihmc.idl.CDR();
   private final us.ihmc.idl.CDR deserializeCDR = new us.ihmc.idl.CDR();

   @Override
   public void serialize(px4_msgs.msg.dds.GotoSetpoint data, us.ihmc.pubsub.common.SerializedPayload serializedPayload) throws java.io.IOException
   {
      serializeCDR.serialize(serializedPayload);
      write(data, serializeCDR);
      serializeCDR.finishSerialize();
   }

   @Override
   public void deserialize(us.ihmc.pubsub.common.SerializedPayload serializedPayload, px4_msgs.msg.dds.GotoSetpoint data) throws java.io.IOException
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

      current_alignment += ((3) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      return current_alignment - initial_alignment;
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.GotoSetpoint data)
   {
      return getCdrSerializedSize(data, 0);
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.GotoSetpoint data, int current_alignment)
   {
      int initial_alignment = current_alignment;

      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += ((3) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);
      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);



      return current_alignment - initial_alignment;
   }

   public static void write(px4_msgs.msg.dds.GotoSetpoint data, us.ihmc.idl.CDR cdr)
   {
      cdr.write_type_12(data.getTimestamp());

      for(int i0 = 0; i0 < data.getPosition().length; ++i0)
      {
        	cdr.write_type_5(data.getPosition()[i0]);	
      }

      cdr.write_type_7(data.getFlagControlHeading());

      cdr.write_type_5(data.getHeading());

      cdr.write_type_7(data.getFlagSetMaxHorizontalSpeed());

      cdr.write_type_5(data.getMaxHorizontalSpeed());

      cdr.write_type_7(data.getFlagSetMaxVerticalSpeed());

      cdr.write_type_5(data.getMaxVerticalSpeed());

      cdr.write_type_7(data.getFlagSetMaxHeadingRate());

      cdr.write_type_5(data.getMaxHeadingRate());

   }

   public static void read(px4_msgs.msg.dds.GotoSetpoint data, us.ihmc.idl.CDR cdr)
   {
      data.setTimestamp(cdr.read_type_12());
      	
      for(int i0 = 0; i0 < data.getPosition().length; ++i0)
      {
        	data.getPosition()[i0] = cdr.read_type_5();
        	
      }
      	
      data.setFlagControlHeading(cdr.read_type_7());
      	
      data.setHeading(cdr.read_type_5());
      	
      data.setFlagSetMaxHorizontalSpeed(cdr.read_type_7());
      	
      data.setMaxHorizontalSpeed(cdr.read_type_5());
      	
      data.setFlagSetMaxVerticalSpeed(cdr.read_type_7());
      	
      data.setMaxVerticalSpeed(cdr.read_type_5());
      	
      data.setFlagSetMaxHeadingRate(cdr.read_type_7());
      	
      data.setMaxHeadingRate(cdr.read_type_5());
      	

   }

   @Override
   public final void serialize(px4_msgs.msg.dds.GotoSetpoint data, us.ihmc.idl.InterchangeSerializer ser)
   {
      ser.write_type_12("timestamp", data.getTimestamp());
      ser.write_type_f("position", data.getPosition());
      ser.write_type_7("flag_control_heading", data.getFlagControlHeading());
      ser.write_type_5("heading", data.getHeading());
      ser.write_type_7("flag_set_max_horizontal_speed", data.getFlagSetMaxHorizontalSpeed());
      ser.write_type_5("max_horizontal_speed", data.getMaxHorizontalSpeed());
      ser.write_type_7("flag_set_max_vertical_speed", data.getFlagSetMaxVerticalSpeed());
      ser.write_type_5("max_vertical_speed", data.getMaxVerticalSpeed());
      ser.write_type_7("flag_set_max_heading_rate", data.getFlagSetMaxHeadingRate());
      ser.write_type_5("max_heading_rate", data.getMaxHeadingRate());
   }

   @Override
   public final void deserialize(us.ihmc.idl.InterchangeSerializer ser, px4_msgs.msg.dds.GotoSetpoint data)
   {
      data.setTimestamp(ser.read_type_12("timestamp"));
      ser.read_type_f("position", data.getPosition());
      data.setFlagControlHeading(ser.read_type_7("flag_control_heading"));
      data.setHeading(ser.read_type_5("heading"));
      data.setFlagSetMaxHorizontalSpeed(ser.read_type_7("flag_set_max_horizontal_speed"));
      data.setMaxHorizontalSpeed(ser.read_type_5("max_horizontal_speed"));
      data.setFlagSetMaxVerticalSpeed(ser.read_type_7("flag_set_max_vertical_speed"));
      data.setMaxVerticalSpeed(ser.read_type_5("max_vertical_speed"));
      data.setFlagSetMaxHeadingRate(ser.read_type_7("flag_set_max_heading_rate"));
      data.setMaxHeadingRate(ser.read_type_5("max_heading_rate"));
   }

   public static void staticCopy(px4_msgs.msg.dds.GotoSetpoint src, px4_msgs.msg.dds.GotoSetpoint dest)
   {
      dest.set(src);
   }

   @Override
   public px4_msgs.msg.dds.GotoSetpoint createData()
   {
      return new px4_msgs.msg.dds.GotoSetpoint();
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
   
   public void serialize(px4_msgs.msg.dds.GotoSetpoint data, us.ihmc.idl.CDR cdr)
   {
      write(data, cdr);
   }

   public void deserialize(px4_msgs.msg.dds.GotoSetpoint data, us.ihmc.idl.CDR cdr)
   {
      read(data, cdr);
   }
   
   public void copy(px4_msgs.msg.dds.GotoSetpoint src, px4_msgs.msg.dds.GotoSetpoint dest)
   {
      staticCopy(src, dest);
   }

   @Override
   public GotoSetpointPubSubType newInstance()
   {
      return new GotoSetpointPubSubType();
   }
}
