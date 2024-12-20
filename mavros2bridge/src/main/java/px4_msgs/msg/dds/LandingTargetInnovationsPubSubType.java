package px4_msgs.msg.dds;

/**
* 
* Topic data type of the struct "LandingTargetInnovations" defined in "LandingTargetInnovations_.idl". Use this class to provide the TopicDataType to a Participant. 
*
* This file was automatically generated from LandingTargetInnovations_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit LandingTargetInnovations_.idl instead.
*
*/
public class LandingTargetInnovationsPubSubType implements us.ihmc.pubsub.TopicDataType<px4_msgs.msg.dds.LandingTargetInnovations>
{
   public static final java.lang.String name = "px4_msgs::msg::dds_::LandingTargetInnovations_";
   
   @Override
   public final java.lang.String getDefinitionChecksum()
   {
   		return "e4cf8bd5adcf1116ff75c8a9b91f5b19960d7b69a09628de04c7e43d8691f020";
   }
   
   @Override
   public final java.lang.String getDefinitionVersion()
   {
   		return "";
   }

   private final us.ihmc.idl.CDR serializeCDR = new us.ihmc.idl.CDR();
   private final us.ihmc.idl.CDR deserializeCDR = new us.ihmc.idl.CDR();

   @Override
   public void serialize(px4_msgs.msg.dds.LandingTargetInnovations data, us.ihmc.pubsub.common.SerializedPayload serializedPayload) throws java.io.IOException
   {
      serializeCDR.serialize(serializedPayload);
      write(data, serializeCDR);
      serializeCDR.finishSerialize();
   }

   @Override
   public void deserialize(us.ihmc.pubsub.common.SerializedPayload serializedPayload, px4_msgs.msg.dds.LandingTargetInnovations data) throws java.io.IOException
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

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.LandingTargetInnovations data)
   {
      return getCdrSerializedSize(data, 0);
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.LandingTargetInnovations data, int current_alignment)
   {
      int initial_alignment = current_alignment;

      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);



      return current_alignment - initial_alignment;
   }

   public static void write(px4_msgs.msg.dds.LandingTargetInnovations data, us.ihmc.idl.CDR cdr)
   {
      cdr.write_type_12(data.getTimestamp());

      cdr.write_type_5(data.getInnovX());

      cdr.write_type_5(data.getInnovY());

      cdr.write_type_5(data.getInnovCovX());

      cdr.write_type_5(data.getInnovCovY());

   }

   public static void read(px4_msgs.msg.dds.LandingTargetInnovations data, us.ihmc.idl.CDR cdr)
   {
      data.setTimestamp(cdr.read_type_12());
      	
      data.setInnovX(cdr.read_type_5());
      	
      data.setInnovY(cdr.read_type_5());
      	
      data.setInnovCovX(cdr.read_type_5());
      	
      data.setInnovCovY(cdr.read_type_5());
      	

   }

   @Override
   public final void serialize(px4_msgs.msg.dds.LandingTargetInnovations data, us.ihmc.idl.InterchangeSerializer ser)
   {
      ser.write_type_12("timestamp", data.getTimestamp());
      ser.write_type_5("innov_x", data.getInnovX());
      ser.write_type_5("innov_y", data.getInnovY());
      ser.write_type_5("innov_cov_x", data.getInnovCovX());
      ser.write_type_5("innov_cov_y", data.getInnovCovY());
   }

   @Override
   public final void deserialize(us.ihmc.idl.InterchangeSerializer ser, px4_msgs.msg.dds.LandingTargetInnovations data)
   {
      data.setTimestamp(ser.read_type_12("timestamp"));
      data.setInnovX(ser.read_type_5("innov_x"));
      data.setInnovY(ser.read_type_5("innov_y"));
      data.setInnovCovX(ser.read_type_5("innov_cov_x"));
      data.setInnovCovY(ser.read_type_5("innov_cov_y"));
   }

   public static void staticCopy(px4_msgs.msg.dds.LandingTargetInnovations src, px4_msgs.msg.dds.LandingTargetInnovations dest)
   {
      dest.set(src);
   }

   @Override
   public px4_msgs.msg.dds.LandingTargetInnovations createData()
   {
      return new px4_msgs.msg.dds.LandingTargetInnovations();
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
   
   public void serialize(px4_msgs.msg.dds.LandingTargetInnovations data, us.ihmc.idl.CDR cdr)
   {
      write(data, cdr);
   }

   public void deserialize(px4_msgs.msg.dds.LandingTargetInnovations data, us.ihmc.idl.CDR cdr)
   {
      read(data, cdr);
   }
   
   public void copy(px4_msgs.msg.dds.LandingTargetInnovations src, px4_msgs.msg.dds.LandingTargetInnovations dest)
   {
      staticCopy(src, dest);
   }

   @Override
   public LandingTargetInnovationsPubSubType newInstance()
   {
      return new LandingTargetInnovationsPubSubType();
   }
}
