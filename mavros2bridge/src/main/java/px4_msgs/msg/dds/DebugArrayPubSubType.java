package px4_msgs.msg.dds;

/**
* 
* Topic data type of the struct "DebugArray" defined in "DebugArray_.idl". Use this class to provide the TopicDataType to a Participant. 
*
* This file was automatically generated from DebugArray_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit DebugArray_.idl instead.
*
*/
public class DebugArrayPubSubType implements us.ihmc.pubsub.TopicDataType<px4_msgs.msg.dds.DebugArray>
{
   public static final java.lang.String name = "px4_msgs::msg::dds_::DebugArray_";
   
   @Override
   public final java.lang.String getDefinitionChecksum()
   {
   		return "334f1a393c1158782496515f034d4f8ee4fc4717639145674bdb6d2776c4cb57";
   }
   
   @Override
   public final java.lang.String getDefinitionVersion()
   {
   		return "";
   }

   private final us.ihmc.idl.CDR serializeCDR = new us.ihmc.idl.CDR();
   private final us.ihmc.idl.CDR deserializeCDR = new us.ihmc.idl.CDR();

   @Override
   public void serialize(px4_msgs.msg.dds.DebugArray data, us.ihmc.pubsub.common.SerializedPayload serializedPayload) throws java.io.IOException
   {
      serializeCDR.serialize(serializedPayload);
      write(data, serializeCDR);
      serializeCDR.finishSerialize();
   }

   @Override
   public void deserialize(us.ihmc.pubsub.common.SerializedPayload serializedPayload, px4_msgs.msg.dds.DebugArray data) throws java.io.IOException
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

      current_alignment += ((10) * 1) + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += ((58) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      return current_alignment - initial_alignment;
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.DebugArray data)
   {
      return getCdrSerializedSize(data, 0);
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.DebugArray data, int current_alignment)
   {
      int initial_alignment = current_alignment;

      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += 2 + us.ihmc.idl.CDR.alignment(current_alignment, 2);


      current_alignment += ((10) * 1) + us.ihmc.idl.CDR.alignment(current_alignment, 1);
      current_alignment += ((58) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      return current_alignment - initial_alignment;
   }

   public static void write(px4_msgs.msg.dds.DebugArray data, us.ihmc.idl.CDR cdr)
   {
      cdr.write_type_12(data.getTimestamp());

      cdr.write_type_3(data.getId());

      for(int i0 = 0; i0 < data.getName().length; ++i0)
      {
        	cdr.write_type_8(data.getName()[i0]);	
      }

      for(int i0 = 0; i0 < data.getData().length; ++i0)
      {
        	cdr.write_type_5(data.getData()[i0]);	
      }

   }

   public static void read(px4_msgs.msg.dds.DebugArray data, us.ihmc.idl.CDR cdr)
   {
      data.setTimestamp(cdr.read_type_12());
      	
      data.setId(cdr.read_type_3());
      	
      for(int i0 = 0; i0 < data.getName().length; ++i0)
      {
        	data.getName()[i0] = cdr.read_type_8();
        	
      }
      	
      for(int i0 = 0; i0 < data.getData().length; ++i0)
      {
        	data.getData()[i0] = cdr.read_type_5();
        	
      }
      	

   }

   @Override
   public final void serialize(px4_msgs.msg.dds.DebugArray data, us.ihmc.idl.InterchangeSerializer ser)
   {
      ser.write_type_12("timestamp", data.getTimestamp());
      ser.write_type_3("id", data.getId());
      ser.write_type_f("name", data.getName());
      ser.write_type_f("data", data.getData());
   }

   @Override
   public final void deserialize(us.ihmc.idl.InterchangeSerializer ser, px4_msgs.msg.dds.DebugArray data)
   {
      data.setTimestamp(ser.read_type_12("timestamp"));
      data.setId(ser.read_type_3("id"));
      ser.read_type_f("name", data.getName());
      ser.read_type_f("data", data.getData());
   }

   public static void staticCopy(px4_msgs.msg.dds.DebugArray src, px4_msgs.msg.dds.DebugArray dest)
   {
      dest.set(src);
   }

   @Override
   public px4_msgs.msg.dds.DebugArray createData()
   {
      return new px4_msgs.msg.dds.DebugArray();
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
   
   public void serialize(px4_msgs.msg.dds.DebugArray data, us.ihmc.idl.CDR cdr)
   {
      write(data, cdr);
   }

   public void deserialize(px4_msgs.msg.dds.DebugArray data, us.ihmc.idl.CDR cdr)
   {
      read(data, cdr);
   }
   
   public void copy(px4_msgs.msg.dds.DebugArray src, px4_msgs.msg.dds.DebugArray dest)
   {
      staticCopy(src, dest);
   }

   @Override
   public DebugArrayPubSubType newInstance()
   {
      return new DebugArrayPubSubType();
   }
}
