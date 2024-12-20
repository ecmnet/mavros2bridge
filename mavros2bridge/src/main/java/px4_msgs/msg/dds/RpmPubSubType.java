package px4_msgs.msg.dds;

/**
* 
* Topic data type of the struct "Rpm" defined in "Rpm_.idl". Use this class to provide the TopicDataType to a Participant. 
*
* This file was automatically generated from Rpm_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit Rpm_.idl instead.
*
*/
public class RpmPubSubType implements us.ihmc.pubsub.TopicDataType<px4_msgs.msg.dds.Rpm>
{
   public static final java.lang.String name = "px4_msgs::msg::dds_::Rpm_";
   
   @Override
   public final java.lang.String getDefinitionChecksum()
   {
   		return "d6caf2386689916f82239517c30c5a761c520fb7748691635b1c7ef00875565a";
   }
   
   @Override
   public final java.lang.String getDefinitionVersion()
   {
   		return "";
   }

   private final us.ihmc.idl.CDR serializeCDR = new us.ihmc.idl.CDR();
   private final us.ihmc.idl.CDR deserializeCDR = new us.ihmc.idl.CDR();

   @Override
   public void serialize(px4_msgs.msg.dds.Rpm data, us.ihmc.pubsub.common.SerializedPayload serializedPayload) throws java.io.IOException
   {
      serializeCDR.serialize(serializedPayload);
      write(data, serializeCDR);
      serializeCDR.finishSerialize();
   }

   @Override
   public void deserialize(us.ihmc.pubsub.common.SerializedPayload serializedPayload, px4_msgs.msg.dds.Rpm data) throws java.io.IOException
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


      return current_alignment - initial_alignment;
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.Rpm data)
   {
      return getCdrSerializedSize(data, 0);
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.Rpm data, int current_alignment)
   {
      int initial_alignment = current_alignment;

      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);



      return current_alignment - initial_alignment;
   }

   public static void write(px4_msgs.msg.dds.Rpm data, us.ihmc.idl.CDR cdr)
   {
      cdr.write_type_12(data.getTimestamp());

      cdr.write_type_5(data.getIndicatedFrequencyRpm());

      cdr.write_type_5(data.getEstimatedAccurancyRpm());

   }

   public static void read(px4_msgs.msg.dds.Rpm data, us.ihmc.idl.CDR cdr)
   {
      data.setTimestamp(cdr.read_type_12());
      	
      data.setIndicatedFrequencyRpm(cdr.read_type_5());
      	
      data.setEstimatedAccurancyRpm(cdr.read_type_5());
      	

   }

   @Override
   public final void serialize(px4_msgs.msg.dds.Rpm data, us.ihmc.idl.InterchangeSerializer ser)
   {
      ser.write_type_12("timestamp", data.getTimestamp());
      ser.write_type_5("indicated_frequency_rpm", data.getIndicatedFrequencyRpm());
      ser.write_type_5("estimated_accurancy_rpm", data.getEstimatedAccurancyRpm());
   }

   @Override
   public final void deserialize(us.ihmc.idl.InterchangeSerializer ser, px4_msgs.msg.dds.Rpm data)
   {
      data.setTimestamp(ser.read_type_12("timestamp"));
      data.setIndicatedFrequencyRpm(ser.read_type_5("indicated_frequency_rpm"));
      data.setEstimatedAccurancyRpm(ser.read_type_5("estimated_accurancy_rpm"));
   }

   public static void staticCopy(px4_msgs.msg.dds.Rpm src, px4_msgs.msg.dds.Rpm dest)
   {
      dest.set(src);
   }

   @Override
   public px4_msgs.msg.dds.Rpm createData()
   {
      return new px4_msgs.msg.dds.Rpm();
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
   
   public void serialize(px4_msgs.msg.dds.Rpm data, us.ihmc.idl.CDR cdr)
   {
      write(data, cdr);
   }

   public void deserialize(px4_msgs.msg.dds.Rpm data, us.ihmc.idl.CDR cdr)
   {
      read(data, cdr);
   }
   
   public void copy(px4_msgs.msg.dds.Rpm src, px4_msgs.msg.dds.Rpm dest)
   {
      staticCopy(src, dest);
   }

   @Override
   public RpmPubSubType newInstance()
   {
      return new RpmPubSubType();
   }
}
