package px4_msgs.msg.dds;

/**
* 
* Topic data type of the struct "GimbalControls" defined in "GimbalControls_.idl". Use this class to provide the TopicDataType to a Participant. 
*
* This file was automatically generated from GimbalControls_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit GimbalControls_.idl instead.
*
*/
public class GimbalControlsPubSubType implements us.ihmc.pubsub.TopicDataType<px4_msgs.msg.dds.GimbalControls>
{
   public static final java.lang.String name = "px4_msgs::msg::dds_::GimbalControls_";
   
   @Override
   public final java.lang.String getDefinitionChecksum()
   {
   		return "8035cfa2cc1110e012941a4aa2fff4b876eea03978f4ef402a8ece21ea59f35b";
   }
   
   @Override
   public final java.lang.String getDefinitionVersion()
   {
   		return "";
   }

   private final us.ihmc.idl.CDR serializeCDR = new us.ihmc.idl.CDR();
   private final us.ihmc.idl.CDR deserializeCDR = new us.ihmc.idl.CDR();

   @Override
   public void serialize(px4_msgs.msg.dds.GimbalControls data, us.ihmc.pubsub.common.SerializedPayload serializedPayload) throws java.io.IOException
   {
      serializeCDR.serialize(serializedPayload);
      write(data, serializeCDR);
      serializeCDR.finishSerialize();
   }

   @Override
   public void deserialize(us.ihmc.pubsub.common.SerializedPayload serializedPayload, px4_msgs.msg.dds.GimbalControls data) throws java.io.IOException
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

      current_alignment += ((3) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      return current_alignment - initial_alignment;
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.GimbalControls data)
   {
      return getCdrSerializedSize(data, 0);
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.GimbalControls data, int current_alignment)
   {
      int initial_alignment = current_alignment;

      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += ((3) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      return current_alignment - initial_alignment;
   }

   public static void write(px4_msgs.msg.dds.GimbalControls data, us.ihmc.idl.CDR cdr)
   {
      cdr.write_type_12(data.getTimestamp());

      cdr.write_type_12(data.getTimestampSample());

      for(int i0 = 0; i0 < data.getControl().length; ++i0)
      {
        	cdr.write_type_5(data.getControl()[i0]);	
      }

   }

   public static void read(px4_msgs.msg.dds.GimbalControls data, us.ihmc.idl.CDR cdr)
   {
      data.setTimestamp(cdr.read_type_12());
      	
      data.setTimestampSample(cdr.read_type_12());
      	
      for(int i0 = 0; i0 < data.getControl().length; ++i0)
      {
        	data.getControl()[i0] = cdr.read_type_5();
        	
      }
      	

   }

   @Override
   public final void serialize(px4_msgs.msg.dds.GimbalControls data, us.ihmc.idl.InterchangeSerializer ser)
   {
      ser.write_type_12("timestamp", data.getTimestamp());
      ser.write_type_12("timestamp_sample", data.getTimestampSample());
      ser.write_type_f("control", data.getControl());
   }

   @Override
   public final void deserialize(us.ihmc.idl.InterchangeSerializer ser, px4_msgs.msg.dds.GimbalControls data)
   {
      data.setTimestamp(ser.read_type_12("timestamp"));
      data.setTimestampSample(ser.read_type_12("timestamp_sample"));
      ser.read_type_f("control", data.getControl());
   }

   public static void staticCopy(px4_msgs.msg.dds.GimbalControls src, px4_msgs.msg.dds.GimbalControls dest)
   {
      dest.set(src);
   }

   @Override
   public px4_msgs.msg.dds.GimbalControls createData()
   {
      return new px4_msgs.msg.dds.GimbalControls();
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
   
   public void serialize(px4_msgs.msg.dds.GimbalControls data, us.ihmc.idl.CDR cdr)
   {
      write(data, cdr);
   }

   public void deserialize(px4_msgs.msg.dds.GimbalControls data, us.ihmc.idl.CDR cdr)
   {
      read(data, cdr);
   }
   
   public void copy(px4_msgs.msg.dds.GimbalControls src, px4_msgs.msg.dds.GimbalControls dest)
   {
      staticCopy(src, dest);
   }

   @Override
   public GimbalControlsPubSubType newInstance()
   {
      return new GimbalControlsPubSubType();
   }
}