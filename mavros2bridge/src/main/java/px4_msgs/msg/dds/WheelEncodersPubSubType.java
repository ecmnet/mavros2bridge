package px4_msgs.msg.dds;

/**
* 
* Topic data type of the struct "WheelEncoders" defined in "WheelEncoders_.idl". Use this class to provide the TopicDataType to a Participant. 
*
* This file was automatically generated from WheelEncoders_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit WheelEncoders_.idl instead.
*
*/
public class WheelEncodersPubSubType implements us.ihmc.pubsub.TopicDataType<px4_msgs.msg.dds.WheelEncoders>
{
   public static final java.lang.String name = "px4_msgs::msg::dds_::WheelEncoders_";
   
   @Override
   public final java.lang.String getDefinitionChecksum()
   {
   		return "a8a3f59252940e4116d81738573ed83f98078d8416fbae3f462b1d0249d07fc9";
   }
   
   @Override
   public final java.lang.String getDefinitionVersion()
   {
   		return "";
   }

   private final us.ihmc.idl.CDR serializeCDR = new us.ihmc.idl.CDR();
   private final us.ihmc.idl.CDR deserializeCDR = new us.ihmc.idl.CDR();

   @Override
   public void serialize(px4_msgs.msg.dds.WheelEncoders data, us.ihmc.pubsub.common.SerializedPayload serializedPayload) throws java.io.IOException
   {
      serializeCDR.serialize(serializedPayload);
      write(data, serializeCDR);
      serializeCDR.finishSerialize();
   }

   @Override
   public void deserialize(us.ihmc.pubsub.common.SerializedPayload serializedPayload, px4_msgs.msg.dds.WheelEncoders data) throws java.io.IOException
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

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.WheelEncoders data)
   {
      return getCdrSerializedSize(data, 0);
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.WheelEncoders data, int current_alignment)
   {
      int initial_alignment = current_alignment;

      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += ((2) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);
      current_alignment += ((2) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      return current_alignment - initial_alignment;
   }

   public static void write(px4_msgs.msg.dds.WheelEncoders data, us.ihmc.idl.CDR cdr)
   {
      cdr.write_type_12(data.getTimestamp());

      for(int i0 = 0; i0 < data.getWheelSpeed().length; ++i0)
      {
        	cdr.write_type_5(data.getWheelSpeed()[i0]);	
      }

      for(int i0 = 0; i0 < data.getWheelAngle().length; ++i0)
      {
        	cdr.write_type_5(data.getWheelAngle()[i0]);	
      }

   }

   public static void read(px4_msgs.msg.dds.WheelEncoders data, us.ihmc.idl.CDR cdr)
   {
      data.setTimestamp(cdr.read_type_12());
      	
      for(int i0 = 0; i0 < data.getWheelSpeed().length; ++i0)
      {
        	data.getWheelSpeed()[i0] = cdr.read_type_5();
        	
      }
      	
      for(int i0 = 0; i0 < data.getWheelAngle().length; ++i0)
      {
        	data.getWheelAngle()[i0] = cdr.read_type_5();
        	
      }
      	

   }

   @Override
   public final void serialize(px4_msgs.msg.dds.WheelEncoders data, us.ihmc.idl.InterchangeSerializer ser)
   {
      ser.write_type_12("timestamp", data.getTimestamp());
      ser.write_type_f("wheel_speed", data.getWheelSpeed());
      ser.write_type_f("wheel_angle", data.getWheelAngle());
   }

   @Override
   public final void deserialize(us.ihmc.idl.InterchangeSerializer ser, px4_msgs.msg.dds.WheelEncoders data)
   {
      data.setTimestamp(ser.read_type_12("timestamp"));
      ser.read_type_f("wheel_speed", data.getWheelSpeed());
      ser.read_type_f("wheel_angle", data.getWheelAngle());
   }

   public static void staticCopy(px4_msgs.msg.dds.WheelEncoders src, px4_msgs.msg.dds.WheelEncoders dest)
   {
      dest.set(src);
   }

   @Override
   public px4_msgs.msg.dds.WheelEncoders createData()
   {
      return new px4_msgs.msg.dds.WheelEncoders();
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
   
   public void serialize(px4_msgs.msg.dds.WheelEncoders data, us.ihmc.idl.CDR cdr)
   {
      write(data, cdr);
   }

   public void deserialize(px4_msgs.msg.dds.WheelEncoders data, us.ihmc.idl.CDR cdr)
   {
      read(data, cdr);
   }
   
   public void copy(px4_msgs.msg.dds.WheelEncoders src, px4_msgs.msg.dds.WheelEncoders dest)
   {
      staticCopy(src, dest);
   }

   @Override
   public WheelEncodersPubSubType newInstance()
   {
      return new WheelEncodersPubSubType();
   }
}
