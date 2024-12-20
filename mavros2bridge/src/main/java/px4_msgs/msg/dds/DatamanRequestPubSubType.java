package px4_msgs.msg.dds;

/**
* 
* Topic data type of the struct "DatamanRequest" defined in "DatamanRequest_.idl". Use this class to provide the TopicDataType to a Participant. 
*
* This file was automatically generated from DatamanRequest_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit DatamanRequest_.idl instead.
*
*/
public class DatamanRequestPubSubType implements us.ihmc.pubsub.TopicDataType<px4_msgs.msg.dds.DatamanRequest>
{
   public static final java.lang.String name = "px4_msgs::msg::dds_::DatamanRequest_";
   
   @Override
   public final java.lang.String getDefinitionChecksum()
   {
   		return "afb45d908b1f417cf0390ae81cb11a171dbb4e5f3f1205ad93db8ee4daf3102c";
   }
   
   @Override
   public final java.lang.String getDefinitionVersion()
   {
   		return "";
   }

   private final us.ihmc.idl.CDR serializeCDR = new us.ihmc.idl.CDR();
   private final us.ihmc.idl.CDR deserializeCDR = new us.ihmc.idl.CDR();

   @Override
   public void serialize(px4_msgs.msg.dds.DatamanRequest data, us.ihmc.pubsub.common.SerializedPayload serializedPayload) throws java.io.IOException
   {
      serializeCDR.serialize(serializedPayload);
      write(data, serializeCDR);
      serializeCDR.finishSerialize();
   }

   @Override
   public void deserialize(us.ihmc.pubsub.common.SerializedPayload serializedPayload, px4_msgs.msg.dds.DatamanRequest data) throws java.io.IOException
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

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += ((56) * 1) + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      return current_alignment - initial_alignment;
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.DatamanRequest data)
   {
      return getCdrSerializedSize(data, 0);
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.DatamanRequest data, int current_alignment)
   {
      int initial_alignment = current_alignment;

      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += ((56) * 1) + us.ihmc.idl.CDR.alignment(current_alignment, 1);
      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);



      return current_alignment - initial_alignment;
   }

   public static void write(px4_msgs.msg.dds.DatamanRequest data, us.ihmc.idl.CDR cdr)
   {
      cdr.write_type_12(data.getTimestamp());

      cdr.write_type_9(data.getClientId());

      cdr.write_type_9(data.getRequestType());

      cdr.write_type_9(data.getItem());

      cdr.write_type_4(data.getIndex());

      for(int i0 = 0; i0 < data.getData().length; ++i0)
      {
        	cdr.write_type_9(data.getData()[i0]);	
      }

      cdr.write_type_4(data.getDataLength());

   }

   public static void read(px4_msgs.msg.dds.DatamanRequest data, us.ihmc.idl.CDR cdr)
   {
      data.setTimestamp(cdr.read_type_12());
      	
      data.setClientId(cdr.read_type_9());
      	
      data.setRequestType(cdr.read_type_9());
      	
      data.setItem(cdr.read_type_9());
      	
      data.setIndex(cdr.read_type_4());
      	
      for(int i0 = 0; i0 < data.getData().length; ++i0)
      {
        	data.getData()[i0] = cdr.read_type_9();
        	
      }
      	
      data.setDataLength(cdr.read_type_4());
      	

   }

   @Override
   public final void serialize(px4_msgs.msg.dds.DatamanRequest data, us.ihmc.idl.InterchangeSerializer ser)
   {
      ser.write_type_12("timestamp", data.getTimestamp());
      ser.write_type_9("client_id", data.getClientId());
      ser.write_type_9("request_type", data.getRequestType());
      ser.write_type_9("item", data.getItem());
      ser.write_type_4("index", data.getIndex());
      ser.write_type_f("data", data.getData());
      ser.write_type_4("data_length", data.getDataLength());
   }

   @Override
   public final void deserialize(us.ihmc.idl.InterchangeSerializer ser, px4_msgs.msg.dds.DatamanRequest data)
   {
      data.setTimestamp(ser.read_type_12("timestamp"));
      data.setClientId(ser.read_type_9("client_id"));
      data.setRequestType(ser.read_type_9("request_type"));
      data.setItem(ser.read_type_9("item"));
      data.setIndex(ser.read_type_4("index"));
      ser.read_type_f("data", data.getData());
      data.setDataLength(ser.read_type_4("data_length"));
   }

   public static void staticCopy(px4_msgs.msg.dds.DatamanRequest src, px4_msgs.msg.dds.DatamanRequest dest)
   {
      dest.set(src);
   }

   @Override
   public px4_msgs.msg.dds.DatamanRequest createData()
   {
      return new px4_msgs.msg.dds.DatamanRequest();
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
   
   public void serialize(px4_msgs.msg.dds.DatamanRequest data, us.ihmc.idl.CDR cdr)
   {
      write(data, cdr);
   }

   public void deserialize(px4_msgs.msg.dds.DatamanRequest data, us.ihmc.idl.CDR cdr)
   {
      read(data, cdr);
   }
   
   public void copy(px4_msgs.msg.dds.DatamanRequest src, px4_msgs.msg.dds.DatamanRequest dest)
   {
      staticCopy(src, dest);
   }

   @Override
   public DatamanRequestPubSubType newInstance()
   {
      return new DatamanRequestPubSubType();
   }
}
