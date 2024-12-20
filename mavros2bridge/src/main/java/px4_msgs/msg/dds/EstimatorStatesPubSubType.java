package px4_msgs.msg.dds;

/**
* 
* Topic data type of the struct "EstimatorStates" defined in "EstimatorStates_.idl". Use this class to provide the TopicDataType to a Participant. 
*
* This file was automatically generated from EstimatorStates_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit EstimatorStates_.idl instead.
*
*/
public class EstimatorStatesPubSubType implements us.ihmc.pubsub.TopicDataType<px4_msgs.msg.dds.EstimatorStates>
{
   public static final java.lang.String name = "px4_msgs::msg::dds_::EstimatorStates_";
   
   @Override
   public final java.lang.String getDefinitionChecksum()
   {
   		return "1b399c82ad36e1ef08d7d390568418ba50342855b706d97d2abdb7ed8fb8fd65";
   }
   
   @Override
   public final java.lang.String getDefinitionVersion()
   {
   		return "";
   }

   private final us.ihmc.idl.CDR serializeCDR = new us.ihmc.idl.CDR();
   private final us.ihmc.idl.CDR deserializeCDR = new us.ihmc.idl.CDR();

   @Override
   public void serialize(px4_msgs.msg.dds.EstimatorStates data, us.ihmc.pubsub.common.SerializedPayload serializedPayload) throws java.io.IOException
   {
      serializeCDR.serialize(serializedPayload);
      write(data, serializeCDR);
      serializeCDR.finishSerialize();
   }

   @Override
   public void deserialize(us.ihmc.pubsub.common.SerializedPayload serializedPayload, px4_msgs.msg.dds.EstimatorStates data) throws java.io.IOException
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

      current_alignment += ((25) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += ((24) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      return current_alignment - initial_alignment;
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.EstimatorStates data)
   {
      return getCdrSerializedSize(data, 0);
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.EstimatorStates data, int current_alignment)
   {
      int initial_alignment = current_alignment;

      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += ((25) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);
      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += ((24) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      return current_alignment - initial_alignment;
   }

   public static void write(px4_msgs.msg.dds.EstimatorStates data, us.ihmc.idl.CDR cdr)
   {
      cdr.write_type_12(data.getTimestamp());

      cdr.write_type_12(data.getTimestampSample());

      for(int i0 = 0; i0 < data.getStates().length; ++i0)
      {
        	cdr.write_type_5(data.getStates()[i0]);	
      }

      cdr.write_type_9(data.getNStates());

      for(int i0 = 0; i0 < data.getCovariances().length; ++i0)
      {
        	cdr.write_type_5(data.getCovariances()[i0]);	
      }

   }

   public static void read(px4_msgs.msg.dds.EstimatorStates data, us.ihmc.idl.CDR cdr)
   {
      data.setTimestamp(cdr.read_type_12());
      	
      data.setTimestampSample(cdr.read_type_12());
      	
      for(int i0 = 0; i0 < data.getStates().length; ++i0)
      {
        	data.getStates()[i0] = cdr.read_type_5();
        	
      }
      	
      data.setNStates(cdr.read_type_9());
      	
      for(int i0 = 0; i0 < data.getCovariances().length; ++i0)
      {
        	data.getCovariances()[i0] = cdr.read_type_5();
        	
      }
      	

   }

   @Override
   public final void serialize(px4_msgs.msg.dds.EstimatorStates data, us.ihmc.idl.InterchangeSerializer ser)
   {
      ser.write_type_12("timestamp", data.getTimestamp());
      ser.write_type_12("timestamp_sample", data.getTimestampSample());
      ser.write_type_f("states", data.getStates());
      ser.write_type_9("n_states", data.getNStates());
      ser.write_type_f("covariances", data.getCovariances());
   }

   @Override
   public final void deserialize(us.ihmc.idl.InterchangeSerializer ser, px4_msgs.msg.dds.EstimatorStates data)
   {
      data.setTimestamp(ser.read_type_12("timestamp"));
      data.setTimestampSample(ser.read_type_12("timestamp_sample"));
      ser.read_type_f("states", data.getStates());
      data.setNStates(ser.read_type_9("n_states"));
      ser.read_type_f("covariances", data.getCovariances());
   }

   public static void staticCopy(px4_msgs.msg.dds.EstimatorStates src, px4_msgs.msg.dds.EstimatorStates dest)
   {
      dest.set(src);
   }

   @Override
   public px4_msgs.msg.dds.EstimatorStates createData()
   {
      return new px4_msgs.msg.dds.EstimatorStates();
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
   
   public void serialize(px4_msgs.msg.dds.EstimatorStates data, us.ihmc.idl.CDR cdr)
   {
      write(data, cdr);
   }

   public void deserialize(px4_msgs.msg.dds.EstimatorStates data, us.ihmc.idl.CDR cdr)
   {
      read(data, cdr);
   }
   
   public void copy(px4_msgs.msg.dds.EstimatorStates src, px4_msgs.msg.dds.EstimatorStates dest)
   {
      staticCopy(src, dest);
   }

   @Override
   public EstimatorStatesPubSubType newInstance()
   {
      return new EstimatorStatesPubSubType();
   }
}
