package px4_msgs.msg.dds;

/**
* 
* Topic data type of the struct "AutotuneAttitudeControlStatus" defined in "AutotuneAttitudeControlStatus_.idl". Use this class to provide the TopicDataType to a Participant. 
*
* This file was automatically generated from AutotuneAttitudeControlStatus_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit AutotuneAttitudeControlStatus_.idl instead.
*
*/
public class AutotuneAttitudeControlStatusPubSubType implements us.ihmc.pubsub.TopicDataType<px4_msgs.msg.dds.AutotuneAttitudeControlStatus>
{
   public static final java.lang.String name = "px4_msgs::msg::dds_::AutotuneAttitudeControlStatus_";
   
   @Override
   public final java.lang.String getDefinitionChecksum()
   {
   		return "5117632e9c61222906df0ed1b250f237787e55371fc4200d35488ad6a71de6e8";
   }
   
   @Override
   public final java.lang.String getDefinitionVersion()
   {
   		return "";
   }

   private final us.ihmc.idl.CDR serializeCDR = new us.ihmc.idl.CDR();
   private final us.ihmc.idl.CDR deserializeCDR = new us.ihmc.idl.CDR();

   @Override
   public void serialize(px4_msgs.msg.dds.AutotuneAttitudeControlStatus data, us.ihmc.pubsub.common.SerializedPayload serializedPayload) throws java.io.IOException
   {
      serializeCDR.serialize(serializedPayload);
      write(data, serializeCDR);
      serializeCDR.finishSerialize();
   }

   @Override
   public void deserialize(us.ihmc.pubsub.common.SerializedPayload serializedPayload, px4_msgs.msg.dds.AutotuneAttitudeControlStatus data) throws java.io.IOException
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

      current_alignment += ((5) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += ((5) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += ((3) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      return current_alignment - initial_alignment;
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.AutotuneAttitudeControlStatus data)
   {
      return getCdrSerializedSize(data, 0);
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.AutotuneAttitudeControlStatus data, int current_alignment)
   {
      int initial_alignment = current_alignment;

      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += ((5) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);
      current_alignment += ((5) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);
      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += ((3) * 4) + us.ihmc.idl.CDR.alignment(current_alignment, 4);
      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);



      return current_alignment - initial_alignment;
   }

   public static void write(px4_msgs.msg.dds.AutotuneAttitudeControlStatus data, us.ihmc.idl.CDR cdr)
   {
      cdr.write_type_12(data.getTimestamp());

      for(int i0 = 0; i0 < data.getCoeff().length; ++i0)
      {
        	cdr.write_type_5(data.getCoeff()[i0]);	
      }

      for(int i0 = 0; i0 < data.getCoeffVar().length; ++i0)
      {
        	cdr.write_type_5(data.getCoeffVar()[i0]);	
      }

      cdr.write_type_5(data.getFitness());

      cdr.write_type_5(data.getInnov());

      cdr.write_type_5(data.getDtModel());

      cdr.write_type_5(data.getKc());

      cdr.write_type_5(data.getKi());

      cdr.write_type_5(data.getKd());

      cdr.write_type_5(data.getKff());

      cdr.write_type_5(data.getAttP());

      for(int i0 = 0; i0 < data.getRateSp().length; ++i0)
      {
        	cdr.write_type_5(data.getRateSp()[i0]);	
      }

      cdr.write_type_5(data.getUFilt());

      cdr.write_type_5(data.getYFilt());

      cdr.write_type_9(data.getState());

   }

   public static void read(px4_msgs.msg.dds.AutotuneAttitudeControlStatus data, us.ihmc.idl.CDR cdr)
   {
      data.setTimestamp(cdr.read_type_12());
      	
      for(int i0 = 0; i0 < data.getCoeff().length; ++i0)
      {
        	data.getCoeff()[i0] = cdr.read_type_5();
        	
      }
      	
      for(int i0 = 0; i0 < data.getCoeffVar().length; ++i0)
      {
        	data.getCoeffVar()[i0] = cdr.read_type_5();
        	
      }
      	
      data.setFitness(cdr.read_type_5());
      	
      data.setInnov(cdr.read_type_5());
      	
      data.setDtModel(cdr.read_type_5());
      	
      data.setKc(cdr.read_type_5());
      	
      data.setKi(cdr.read_type_5());
      	
      data.setKd(cdr.read_type_5());
      	
      data.setKff(cdr.read_type_5());
      	
      data.setAttP(cdr.read_type_5());
      	
      for(int i0 = 0; i0 < data.getRateSp().length; ++i0)
      {
        	data.getRateSp()[i0] = cdr.read_type_5();
        	
      }
      	
      data.setUFilt(cdr.read_type_5());
      	
      data.setYFilt(cdr.read_type_5());
      	
      data.setState(cdr.read_type_9());
      	

   }

   @Override
   public final void serialize(px4_msgs.msg.dds.AutotuneAttitudeControlStatus data, us.ihmc.idl.InterchangeSerializer ser)
   {
      ser.write_type_12("timestamp", data.getTimestamp());
      ser.write_type_f("coeff", data.getCoeff());
      ser.write_type_f("coeff_var", data.getCoeffVar());
      ser.write_type_5("fitness", data.getFitness());
      ser.write_type_5("innov", data.getInnov());
      ser.write_type_5("dt_model", data.getDtModel());
      ser.write_type_5("kc", data.getKc());
      ser.write_type_5("ki", data.getKi());
      ser.write_type_5("kd", data.getKd());
      ser.write_type_5("kff", data.getKff());
      ser.write_type_5("att_p", data.getAttP());
      ser.write_type_f("rate_sp", data.getRateSp());
      ser.write_type_5("u_filt", data.getUFilt());
      ser.write_type_5("y_filt", data.getYFilt());
      ser.write_type_9("state", data.getState());
   }

   @Override
   public final void deserialize(us.ihmc.idl.InterchangeSerializer ser, px4_msgs.msg.dds.AutotuneAttitudeControlStatus data)
   {
      data.setTimestamp(ser.read_type_12("timestamp"));
      ser.read_type_f("coeff", data.getCoeff());
      ser.read_type_f("coeff_var", data.getCoeffVar());
      data.setFitness(ser.read_type_5("fitness"));
      data.setInnov(ser.read_type_5("innov"));
      data.setDtModel(ser.read_type_5("dt_model"));
      data.setKc(ser.read_type_5("kc"));
      data.setKi(ser.read_type_5("ki"));
      data.setKd(ser.read_type_5("kd"));
      data.setKff(ser.read_type_5("kff"));
      data.setAttP(ser.read_type_5("att_p"));
      ser.read_type_f("rate_sp", data.getRateSp());
      data.setUFilt(ser.read_type_5("u_filt"));
      data.setYFilt(ser.read_type_5("y_filt"));
      data.setState(ser.read_type_9("state"));
   }

   public static void staticCopy(px4_msgs.msg.dds.AutotuneAttitudeControlStatus src, px4_msgs.msg.dds.AutotuneAttitudeControlStatus dest)
   {
      dest.set(src);
   }

   @Override
   public px4_msgs.msg.dds.AutotuneAttitudeControlStatus createData()
   {
      return new px4_msgs.msg.dds.AutotuneAttitudeControlStatus();
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
   
   public void serialize(px4_msgs.msg.dds.AutotuneAttitudeControlStatus data, us.ihmc.idl.CDR cdr)
   {
      write(data, cdr);
   }

   public void deserialize(px4_msgs.msg.dds.AutotuneAttitudeControlStatus data, us.ihmc.idl.CDR cdr)
   {
      read(data, cdr);
   }
   
   public void copy(px4_msgs.msg.dds.AutotuneAttitudeControlStatus src, px4_msgs.msg.dds.AutotuneAttitudeControlStatus dest)
   {
      staticCopy(src, dest);
   }

   @Override
   public AutotuneAttitudeControlStatusPubSubType newInstance()
   {
      return new AutotuneAttitudeControlStatusPubSubType();
   }
}
