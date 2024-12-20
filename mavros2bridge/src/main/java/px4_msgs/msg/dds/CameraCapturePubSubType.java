package px4_msgs.msg.dds;

/**
* 
* Topic data type of the struct "CameraCapture" defined in "CameraCapture_.idl". Use this class to provide the TopicDataType to a Participant. 
*
* This file was automatically generated from CameraCapture_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit CameraCapture_.idl instead.
*
*/
public class CameraCapturePubSubType implements us.ihmc.pubsub.TopicDataType<px4_msgs.msg.dds.CameraCapture>
{
   public static final java.lang.String name = "px4_msgs::msg::dds_::CameraCapture_";
   
   @Override
   public final java.lang.String getDefinitionChecksum()
   {
   		return "83c5fe5a895fd73b15480be6d05c506bb02a6e3b71faaeab3bbf992ca59ecf0c";
   }
   
   @Override
   public final java.lang.String getDefinitionVersion()
   {
   		return "";
   }

   private final us.ihmc.idl.CDR serializeCDR = new us.ihmc.idl.CDR();
   private final us.ihmc.idl.CDR deserializeCDR = new us.ihmc.idl.CDR();

   @Override
   public void serialize(px4_msgs.msg.dds.CameraCapture data, us.ihmc.pubsub.common.SerializedPayload serializedPayload) throws java.io.IOException
   {
      serializeCDR.serialize(serializedPayload);
      write(data, serializeCDR);
      serializeCDR.finishSerialize();
   }

   @Override
   public void deserialize(us.ihmc.pubsub.common.SerializedPayload serializedPayload, px4_msgs.msg.dds.CameraCapture data) throws java.io.IOException
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

      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);

      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += ((4) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      return current_alignment - initial_alignment;
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.CameraCapture data)
   {
      return getCdrSerializedSize(data, 0);
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.CameraCapture data, int current_alignment)
   {
      int initial_alignment = current_alignment;

      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += ((4) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);
      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);



      return current_alignment - initial_alignment;
   }

   public static void write(px4_msgs.msg.dds.CameraCapture data, us.ihmc.idl.CDR cdr)
   {
      cdr.write_type_12(data.getTimestamp());

      cdr.write_type_12(data.getTimestampUtc());

      cdr.write_type_4(data.getSeq());

      cdr.write_type_6(data.getLat());

      cdr.write_type_6(data.getLon());

      cdr.write_type_5(data.getAlt());

      cdr.write_type_5(data.getGroundDistance());

      for(int i0 = 0; i0 < data.getQ().length; ++i0)
      {
        	cdr.write_type_5(data.getQ()[i0]);	
      }

      cdr.write_type_9(data.getResult());

   }

   public static void read(px4_msgs.msg.dds.CameraCapture data, us.ihmc.idl.CDR cdr)
   {
      data.setTimestamp(cdr.read_type_12());
      	
      data.setTimestampUtc(cdr.read_type_12());
      	
      data.setSeq(cdr.read_type_4());
      	
      data.setLat(cdr.read_type_6());
      	
      data.setLon(cdr.read_type_6());
      	
      data.setAlt(cdr.read_type_5());
      	
      data.setGroundDistance(cdr.read_type_5());
      	
      for(int i0 = 0; i0 < data.getQ().length; ++i0)
      {
        	data.getQ()[i0] = cdr.read_type_5();
        	
      }
      	
      data.setResult(cdr.read_type_9());
      	

   }

   @Override
   public final void serialize(px4_msgs.msg.dds.CameraCapture data, us.ihmc.idl.InterchangeSerializer ser)
   {
      ser.write_type_12("timestamp", data.getTimestamp());
      ser.write_type_12("timestamp_utc", data.getTimestampUtc());
      ser.write_type_4("seq", data.getSeq());
      ser.write_type_6("lat", data.getLat());
      ser.write_type_6("lon", data.getLon());
      ser.write_type_5("alt", data.getAlt());
      ser.write_type_5("ground_distance", data.getGroundDistance());
      ser.write_type_f("q", data.getQ());
      ser.write_type_9("result", data.getResult());
   }

   @Override
   public final void deserialize(us.ihmc.idl.InterchangeSerializer ser, px4_msgs.msg.dds.CameraCapture data)
   {
      data.setTimestamp(ser.read_type_12("timestamp"));
      data.setTimestampUtc(ser.read_type_12("timestamp_utc"));
      data.setSeq(ser.read_type_4("seq"));
      data.setLat(ser.read_type_6("lat"));
      data.setLon(ser.read_type_6("lon"));
      data.setAlt(ser.read_type_5("alt"));
      data.setGroundDistance(ser.read_type_5("ground_distance"));
      ser.read_type_f("q", data.getQ());
      data.setResult(ser.read_type_9("result"));
   }

   public static void staticCopy(px4_msgs.msg.dds.CameraCapture src, px4_msgs.msg.dds.CameraCapture dest)
   {
      dest.set(src);
   }

   @Override
   public px4_msgs.msg.dds.CameraCapture createData()
   {
      return new px4_msgs.msg.dds.CameraCapture();
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
   
   public void serialize(px4_msgs.msg.dds.CameraCapture data, us.ihmc.idl.CDR cdr)
   {
      write(data, cdr);
   }

   public void deserialize(px4_msgs.msg.dds.CameraCapture data, us.ihmc.idl.CDR cdr)
   {
      read(data, cdr);
   }
   
   public void copy(px4_msgs.msg.dds.CameraCapture src, px4_msgs.msg.dds.CameraCapture dest)
   {
      staticCopy(src, dest);
   }

   @Override
   public CameraCapturePubSubType newInstance()
   {
      return new CameraCapturePubSubType();
   }
}
