package px4_msgs.msg.dds;

/**
* 
* Topic data type of the struct "DebugVect" defined in "DebugVect_.idl". Use this class to provide the TopicDataType to a Participant. 
*
* This file was automatically generated from DebugVect_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit DebugVect_.idl instead.
*
*/
public class DebugVectPubSubType implements us.ihmc.pubsub.TopicDataType<px4_msgs.msg.dds.DebugVect>
{
   public static final java.lang.String name = "px4_msgs::msg::dds_::DebugVect_";
   
   @Override
   public final java.lang.String getDefinitionChecksum()
   {
   		return "1d13d43054b3068a7c4c21b357d19aa19e4d60085e529b7487d856ba4cfcb232";
   }
   
   @Override
   public final java.lang.String getDefinitionVersion()
   {
   		return "";
   }

   private final us.ihmc.idl.CDR serializeCDR = new us.ihmc.idl.CDR();
   private final us.ihmc.idl.CDR deserializeCDR = new us.ihmc.idl.CDR();

   @Override
   public void serialize(px4_msgs.msg.dds.DebugVect data, us.ihmc.pubsub.common.SerializedPayload serializedPayload) throws java.io.IOException
   {
      serializeCDR.serialize(serializedPayload);
      write(data, serializeCDR);
      serializeCDR.finishSerialize();
   }

   @Override
   public void deserialize(us.ihmc.pubsub.common.SerializedPayload serializedPayload, px4_msgs.msg.dds.DebugVect data) throws java.io.IOException
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

      current_alignment += ((10) * 1) + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      return current_alignment - initial_alignment;
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.DebugVect data)
   {
      return getCdrSerializedSize(data, 0);
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.DebugVect data, int current_alignment)
   {
      int initial_alignment = current_alignment;

      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += ((10) * 1) + us.ihmc.idl.CDR.alignment(current_alignment, 1);
      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);



      return current_alignment - initial_alignment;
   }

   public static void write(px4_msgs.msg.dds.DebugVect data, us.ihmc.idl.CDR cdr)
   {
      cdr.write_type_12(data.getTimestamp());

      for(int i0 = 0; i0 < data.getName().length; ++i0)
      {
        	cdr.write_type_8(data.getName()[i0]);	
      }

      cdr.write_type_5(data.getX());

      cdr.write_type_5(data.getY());

      cdr.write_type_5(data.getZ());

   }

   public static void read(px4_msgs.msg.dds.DebugVect data, us.ihmc.idl.CDR cdr)
   {
      data.setTimestamp(cdr.read_type_12());
      	
      for(int i0 = 0; i0 < data.getName().length; ++i0)
      {
        	data.getName()[i0] = cdr.read_type_8();
        	
      }
      	
      data.setX(cdr.read_type_5());
      	
      data.setY(cdr.read_type_5());
      	
      data.setZ(cdr.read_type_5());
      	

   }

   @Override
   public final void serialize(px4_msgs.msg.dds.DebugVect data, us.ihmc.idl.InterchangeSerializer ser)
   {
      ser.write_type_12("timestamp", data.getTimestamp());
      ser.write_type_f("name", data.getName());
      ser.write_type_5("x", data.getX());
      ser.write_type_5("y", data.getY());
      ser.write_type_5("z", data.getZ());
   }

   @Override
   public final void deserialize(us.ihmc.idl.InterchangeSerializer ser, px4_msgs.msg.dds.DebugVect data)
   {
      data.setTimestamp(ser.read_type_12("timestamp"));
      ser.read_type_f("name", data.getName());
      data.setX(ser.read_type_5("x"));
      data.setY(ser.read_type_5("y"));
      data.setZ(ser.read_type_5("z"));
   }

   public static void staticCopy(px4_msgs.msg.dds.DebugVect src, px4_msgs.msg.dds.DebugVect dest)
   {
      dest.set(src);
   }

   @Override
   public px4_msgs.msg.dds.DebugVect createData()
   {
      return new px4_msgs.msg.dds.DebugVect();
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
   
   public void serialize(px4_msgs.msg.dds.DebugVect data, us.ihmc.idl.CDR cdr)
   {
      write(data, cdr);
   }

   public void deserialize(px4_msgs.msg.dds.DebugVect data, us.ihmc.idl.CDR cdr)
   {
      read(data, cdr);
   }
   
   public void copy(px4_msgs.msg.dds.DebugVect src, px4_msgs.msg.dds.DebugVect dest)
   {
      staticCopy(src, dest);
   }

   @Override
   public DebugVectPubSubType newInstance()
   {
      return new DebugVectPubSubType();
   }
}
