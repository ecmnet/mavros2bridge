package px4_msgs.msg.dds;

/**
* 
* Topic data type of the struct "LandingTargetPose" defined in "LandingTargetPose_.idl". Use this class to provide the TopicDataType to a Participant. 
*
* This file was automatically generated from LandingTargetPose_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit LandingTargetPose_.idl instead.
*
*/
public class LandingTargetPosePubSubType implements us.ihmc.pubsub.TopicDataType<px4_msgs.msg.dds.LandingTargetPose>
{
   public static final java.lang.String name = "px4_msgs::msg::dds_::LandingTargetPose_";
   
   @Override
   public final java.lang.String getDefinitionChecksum()
   {
   		return "b887ca82ec2eecca0ada70d77adf465dc08a1aedd273e50398af161ba34439e8";
   }
   
   @Override
   public final java.lang.String getDefinitionVersion()
   {
   		return "";
   }

   private final us.ihmc.idl.CDR serializeCDR = new us.ihmc.idl.CDR();
   private final us.ihmc.idl.CDR deserializeCDR = new us.ihmc.idl.CDR();

   @Override
   public void serialize(px4_msgs.msg.dds.LandingTargetPose data, us.ihmc.pubsub.common.SerializedPayload serializedPayload) throws java.io.IOException
   {
      serializeCDR.serialize(serializedPayload);
      write(data, serializeCDR);
      serializeCDR.finishSerialize();
   }

   @Override
   public void deserialize(us.ihmc.pubsub.common.SerializedPayload serializedPayload, px4_msgs.msg.dds.LandingTargetPose data) throws java.io.IOException
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

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      return current_alignment - initial_alignment;
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.LandingTargetPose data)
   {
      return getCdrSerializedSize(data, 0);
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.LandingTargetPose data, int current_alignment)
   {
      int initial_alignment = current_alignment;

      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);



      return current_alignment - initial_alignment;
   }

   public static void write(px4_msgs.msg.dds.LandingTargetPose data, us.ihmc.idl.CDR cdr)
   {
      cdr.write_type_12(data.getTimestamp());

      cdr.write_type_7(data.getIsStatic());

      cdr.write_type_7(data.getRelPosValid());

      cdr.write_type_7(data.getRelVelValid());

      cdr.write_type_5(data.getXRel());

      cdr.write_type_5(data.getYRel());

      cdr.write_type_5(data.getZRel());

      cdr.write_type_5(data.getVxRel());

      cdr.write_type_5(data.getVyRel());

      cdr.write_type_5(data.getCovXRel());

      cdr.write_type_5(data.getCovYRel());

      cdr.write_type_5(data.getCovVxRel());

      cdr.write_type_5(data.getCovVyRel());

      cdr.write_type_7(data.getAbsPosValid());

      cdr.write_type_5(data.getXAbs());

      cdr.write_type_5(data.getYAbs());

      cdr.write_type_5(data.getZAbs());

   }

   public static void read(px4_msgs.msg.dds.LandingTargetPose data, us.ihmc.idl.CDR cdr)
   {
      data.setTimestamp(cdr.read_type_12());
      	
      data.setIsStatic(cdr.read_type_7());
      	
      data.setRelPosValid(cdr.read_type_7());
      	
      data.setRelVelValid(cdr.read_type_7());
      	
      data.setXRel(cdr.read_type_5());
      	
      data.setYRel(cdr.read_type_5());
      	
      data.setZRel(cdr.read_type_5());
      	
      data.setVxRel(cdr.read_type_5());
      	
      data.setVyRel(cdr.read_type_5());
      	
      data.setCovXRel(cdr.read_type_5());
      	
      data.setCovYRel(cdr.read_type_5());
      	
      data.setCovVxRel(cdr.read_type_5());
      	
      data.setCovVyRel(cdr.read_type_5());
      	
      data.setAbsPosValid(cdr.read_type_7());
      	
      data.setXAbs(cdr.read_type_5());
      	
      data.setYAbs(cdr.read_type_5());
      	
      data.setZAbs(cdr.read_type_5());
      	

   }

   @Override
   public final void serialize(px4_msgs.msg.dds.LandingTargetPose data, us.ihmc.idl.InterchangeSerializer ser)
   {
      ser.write_type_12("timestamp", data.getTimestamp());
      ser.write_type_7("is_static", data.getIsStatic());
      ser.write_type_7("rel_pos_valid", data.getRelPosValid());
      ser.write_type_7("rel_vel_valid", data.getRelVelValid());
      ser.write_type_5("x_rel", data.getXRel());
      ser.write_type_5("y_rel", data.getYRel());
      ser.write_type_5("z_rel", data.getZRel());
      ser.write_type_5("vx_rel", data.getVxRel());
      ser.write_type_5("vy_rel", data.getVyRel());
      ser.write_type_5("cov_x_rel", data.getCovXRel());
      ser.write_type_5("cov_y_rel", data.getCovYRel());
      ser.write_type_5("cov_vx_rel", data.getCovVxRel());
      ser.write_type_5("cov_vy_rel", data.getCovVyRel());
      ser.write_type_7("abs_pos_valid", data.getAbsPosValid());
      ser.write_type_5("x_abs", data.getXAbs());
      ser.write_type_5("y_abs", data.getYAbs());
      ser.write_type_5("z_abs", data.getZAbs());
   }

   @Override
   public final void deserialize(us.ihmc.idl.InterchangeSerializer ser, px4_msgs.msg.dds.LandingTargetPose data)
   {
      data.setTimestamp(ser.read_type_12("timestamp"));
      data.setIsStatic(ser.read_type_7("is_static"));
      data.setRelPosValid(ser.read_type_7("rel_pos_valid"));
      data.setRelVelValid(ser.read_type_7("rel_vel_valid"));
      data.setXRel(ser.read_type_5("x_rel"));
      data.setYRel(ser.read_type_5("y_rel"));
      data.setZRel(ser.read_type_5("z_rel"));
      data.setVxRel(ser.read_type_5("vx_rel"));
      data.setVyRel(ser.read_type_5("vy_rel"));
      data.setCovXRel(ser.read_type_5("cov_x_rel"));
      data.setCovYRel(ser.read_type_5("cov_y_rel"));
      data.setCovVxRel(ser.read_type_5("cov_vx_rel"));
      data.setCovVyRel(ser.read_type_5("cov_vy_rel"));
      data.setAbsPosValid(ser.read_type_7("abs_pos_valid"));
      data.setXAbs(ser.read_type_5("x_abs"));
      data.setYAbs(ser.read_type_5("y_abs"));
      data.setZAbs(ser.read_type_5("z_abs"));
   }

   public static void staticCopy(px4_msgs.msg.dds.LandingTargetPose src, px4_msgs.msg.dds.LandingTargetPose dest)
   {
      dest.set(src);
   }

   @Override
   public px4_msgs.msg.dds.LandingTargetPose createData()
   {
      return new px4_msgs.msg.dds.LandingTargetPose();
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
   
   public void serialize(px4_msgs.msg.dds.LandingTargetPose data, us.ihmc.idl.CDR cdr)
   {
      write(data, cdr);
   }

   public void deserialize(px4_msgs.msg.dds.LandingTargetPose data, us.ihmc.idl.CDR cdr)
   {
      read(data, cdr);
   }
   
   public void copy(px4_msgs.msg.dds.LandingTargetPose src, px4_msgs.msg.dds.LandingTargetPose dest)
   {
      staticCopy(src, dest);
   }

   @Override
   public LandingTargetPosePubSubType newInstance()
   {
      return new LandingTargetPosePubSubType();
   }
}
