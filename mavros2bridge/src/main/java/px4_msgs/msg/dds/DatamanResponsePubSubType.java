package px4_msgs.msg.dds;

/**
* 
* Topic data type of the struct "DatamanResponse" defined in "DatamanResponse_.idl". Use this class to provide the TopicDataType to a Participant. 
*
* This file was automatically generated from DatamanResponse_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit DatamanResponse_.idl instead.
*
*/
public class DatamanResponsePubSubType implements us.ihmc.pubsub.TopicDataType<px4_msgs.msg.dds.DatamanResponse>
{
   public static final java.lang.String name = "px4_msgs::msg::dds_::DatamanResponse_";
   
   @Override
   public final java.lang.String getDefinitionChecksum()
   {
   		return "578857124167be9fc1f851d27bb1cbefbb314e6039b4bc1c656cf2f4c8b69664";
   }
   
   @Override
   public final java.lang.String getDefinitionVersion()
   {
   		return "";
   }

   private final us.ihmc.idl.CDR serializeCDR = new us.ihmc.idl.CDR();
   private final us.ihmc.idl.CDR deserializeCDR = new us.ihmc.idl.CDR();

   @Override
   public void serialize(px4_msgs.msg.dds.DatamanResponse data, us.ihmc.pubsub.common.SerializedPayload serializedPayload) throws java.io.IOException
   {
      serializeCDR.serialize(serializedPayload);
      write(data, serializeCDR);
      serializeCDR.finishSerialize();
   }

   @Override
   public void deserialize(us.ihmc.pubsub.common.SerializedPayload serializedPayload, px4_msgs.msg.dds.DatamanResponse data) throws java.io.IOException
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

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      return current_alignment - initial_alignment;
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.DatamanResponse data)
   {
      return getCdrSerializedSize(data, 0);
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.DatamanResponse data, int current_alignment)
   {
      int initial_alignment = current_alignment;

      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += ((56) * 1) + us.ihmc.idl.CDR.alignment(current_alignment, 1);
      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);



      return current_alignment - initial_alignment;
   }

   public static void write(px4_msgs.msg.dds.DatamanResponse data, us.ihmc.idl.CDR cdr)
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

      cdr.write_type_9(data.getStatus());

   }

   public static void read(px4_msgs.msg.dds.DatamanResponse data, us.ihmc.idl.CDR cdr)
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
      	
      data.setStatus(cdr.read_type_9());
      	

   }

   @Override
   public final void serialize(px4_msgs.msg.dds.DatamanResponse data, us.ihmc.idl.InterchangeSerializer ser)
   {
      ser.write_type_12("timestamp", data.getTimestamp());
      ser.write_type_9("client_id", data.getClientId());
      ser.write_type_9("request_type", data.getRequestType());
      ser.write_type_9("item", data.getItem());
      ser.write_type_4("index", data.getIndex());
      ser.write_type_f("data", data.getData());
      ser.write_type_9("status", data.getStatus());
   }

   @Override
   public final void deserialize(us.ihmc.idl.InterchangeSerializer ser, px4_msgs.msg.dds.DatamanResponse data)
   {
      data.setTimestamp(ser.read_type_12("timestamp"));
      data.setClientId(ser.read_type_9("client_id"));
      data.setRequestType(ser.read_type_9("request_type"));
      data.setItem(ser.read_type_9("item"));
      data.setIndex(ser.read_type_4("index"));
      ser.read_type_f("data", data.getData());
      data.setStatus(ser.read_type_9("status"));
   }

   public static void staticCopy(px4_msgs.msg.dds.DatamanResponse src, px4_msgs.msg.dds.DatamanResponse dest)
   {
      dest.set(src);
   }

   @Override
   public px4_msgs.msg.dds.DatamanResponse createData()
   {
      return new px4_msgs.msg.dds.DatamanResponse();
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
   
   public void serialize(px4_msgs.msg.dds.DatamanResponse data, us.ihmc.idl.CDR cdr)
   {
      write(data, cdr);
   }

   public void deserialize(px4_msgs.msg.dds.DatamanResponse data, us.ihmc.idl.CDR cdr)
   {
      read(data, cdr);
   }
   
   public void copy(px4_msgs.msg.dds.DatamanResponse src, px4_msgs.msg.dds.DatamanResponse dest)
   {
      staticCopy(src, dest);
   }

   @Override
   public DatamanResponsePubSubType newInstance()
   {
      return new DatamanResponsePubSubType();
   }
}
