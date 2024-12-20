package px4_msgs.msg.dds;

/**
* 
* Topic data type of the struct "EstimatorStatusFlags" defined in "EstimatorStatusFlags_.idl". Use this class to provide the TopicDataType to a Participant. 
*
* This file was automatically generated from EstimatorStatusFlags_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit EstimatorStatusFlags_.idl instead.
*
*/
public class EstimatorStatusFlagsPubSubType implements us.ihmc.pubsub.TopicDataType<px4_msgs.msg.dds.EstimatorStatusFlags>
{
   public static final java.lang.String name = "px4_msgs::msg::dds_::EstimatorStatusFlags_";
   
   @Override
   public final java.lang.String getDefinitionChecksum()
   {
   		return "626ff6d42757e605653e111f2818f2f5638fc00cc5c7f847cd021b86f2e0462c";
   }
   
   @Override
   public final java.lang.String getDefinitionVersion()
   {
   		return "";
   }

   private final us.ihmc.idl.CDR serializeCDR = new us.ihmc.idl.CDR();
   private final us.ihmc.idl.CDR deserializeCDR = new us.ihmc.idl.CDR();

   @Override
   public void serialize(px4_msgs.msg.dds.EstimatorStatusFlags data, us.ihmc.pubsub.common.SerializedPayload serializedPayload) throws java.io.IOException
   {
      serializeCDR.serialize(serializedPayload);
      write(data, serializeCDR);
      serializeCDR.finishSerialize();
   }

   @Override
   public void deserialize(us.ihmc.pubsub.common.SerializedPayload serializedPayload, px4_msgs.msg.dds.EstimatorStatusFlags data) throws java.io.IOException
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

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);

      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      return current_alignment - initial_alignment;
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.EstimatorStatusFlags data)
   {
      return getCdrSerializedSize(data, 0);
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.EstimatorStatusFlags data, int current_alignment)
   {
      int initial_alignment = current_alignment;

      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);


      current_alignment += 1 + us.ihmc.idl.CDR.alignment(current_alignment, 1);



      return current_alignment - initial_alignment;
   }

   public static void write(px4_msgs.msg.dds.EstimatorStatusFlags data, us.ihmc.idl.CDR cdr)
   {
      cdr.write_type_12(data.getTimestamp());

      cdr.write_type_12(data.getTimestampSample());

      cdr.write_type_4(data.getControlStatusChanges());

      cdr.write_type_7(data.getCsTiltAlign());

      cdr.write_type_7(data.getCsYawAlign());

      cdr.write_type_7(data.getCsGps());

      cdr.write_type_7(data.getCsOptFlow());

      cdr.write_type_7(data.getCsMagHdg());

      cdr.write_type_7(data.getCsMag3d());

      cdr.write_type_7(data.getCsMagDec());

      cdr.write_type_7(data.getCsInAir());

      cdr.write_type_7(data.getCsWind());

      cdr.write_type_7(data.getCsBaroHgt());

      cdr.write_type_7(data.getCsRngHgt());

      cdr.write_type_7(data.getCsGpsHgt());

      cdr.write_type_7(data.getCsEvPos());

      cdr.write_type_7(data.getCsEvYaw());

      cdr.write_type_7(data.getCsEvHgt());

      cdr.write_type_7(data.getCsFuseBeta());

      cdr.write_type_7(data.getCsMagFieldDisturbed());

      cdr.write_type_7(data.getCsFixedWing());

      cdr.write_type_7(data.getCsMagFault());

      cdr.write_type_7(data.getCsFuseAspd());

      cdr.write_type_7(data.getCsGndEffect());

      cdr.write_type_7(data.getCsRngStuck());

      cdr.write_type_7(data.getCsGnssYaw());

      cdr.write_type_7(data.getCsMagAlignedInFlight());

      cdr.write_type_7(data.getCsEvVel());

      cdr.write_type_7(data.getCsSyntheticMagZ());

      cdr.write_type_7(data.getCsVehicleAtRest());

      cdr.write_type_7(data.getCsGnssYawFault());

      cdr.write_type_7(data.getCsRngFault());

      cdr.write_type_7(data.getCsInertialDeadReckoning());

      cdr.write_type_7(data.getCsWindDeadReckoning());

      cdr.write_type_7(data.getCsRngKinConsistent());

      cdr.write_type_7(data.getCsFakePos());

      cdr.write_type_7(data.getCsFakeHgt());

      cdr.write_type_7(data.getCsGravityVector());

      cdr.write_type_7(data.getCsMag());

      cdr.write_type_7(data.getCsEvYawFault());

      cdr.write_type_7(data.getCsMagHeadingConsistent());

      cdr.write_type_7(data.getCsAuxGpos());

      cdr.write_type_7(data.getCsRngTerrain());

      cdr.write_type_7(data.getCsOptFlowTerrain());

      cdr.write_type_7(data.getCsValidFakePos());

      cdr.write_type_7(data.getCsConstantPos());

      cdr.write_type_4(data.getFaultStatusChanges());

      cdr.write_type_7(data.getFsBadMagX());

      cdr.write_type_7(data.getFsBadMagY());

      cdr.write_type_7(data.getFsBadMagZ());

      cdr.write_type_7(data.getFsBadHdg());

      cdr.write_type_7(data.getFsBadMagDecl());

      cdr.write_type_7(data.getFsBadAirspeed());

      cdr.write_type_7(data.getFsBadSideslip());

      cdr.write_type_7(data.getFsBadOptflowX());

      cdr.write_type_7(data.getFsBadOptflowY());

      cdr.write_type_7(data.getFsBadAccVertical());

      cdr.write_type_7(data.getFsBadAccClipping());

      cdr.write_type_4(data.getInnovationFaultStatusChanges());

      cdr.write_type_7(data.getRejectHorVel());

      cdr.write_type_7(data.getRejectVerVel());

      cdr.write_type_7(data.getRejectHorPos());

      cdr.write_type_7(data.getRejectVerPos());

      cdr.write_type_7(data.getRejectYaw());

      cdr.write_type_7(data.getRejectAirspeed());

      cdr.write_type_7(data.getRejectSideslip());

      cdr.write_type_7(data.getRejectHagl());

      cdr.write_type_7(data.getRejectOptflowX());

      cdr.write_type_7(data.getRejectOptflowY());

   }

   public static void read(px4_msgs.msg.dds.EstimatorStatusFlags data, us.ihmc.idl.CDR cdr)
   {
      data.setTimestamp(cdr.read_type_12());
      	
      data.setTimestampSample(cdr.read_type_12());
      	
      data.setControlStatusChanges(cdr.read_type_4());
      	
      data.setCsTiltAlign(cdr.read_type_7());
      	
      data.setCsYawAlign(cdr.read_type_7());
      	
      data.setCsGps(cdr.read_type_7());
      	
      data.setCsOptFlow(cdr.read_type_7());
      	
      data.setCsMagHdg(cdr.read_type_7());
      	
      data.setCsMag3d(cdr.read_type_7());
      	
      data.setCsMagDec(cdr.read_type_7());
      	
      data.setCsInAir(cdr.read_type_7());
      	
      data.setCsWind(cdr.read_type_7());
      	
      data.setCsBaroHgt(cdr.read_type_7());
      	
      data.setCsRngHgt(cdr.read_type_7());
      	
      data.setCsGpsHgt(cdr.read_type_7());
      	
      data.setCsEvPos(cdr.read_type_7());
      	
      data.setCsEvYaw(cdr.read_type_7());
      	
      data.setCsEvHgt(cdr.read_type_7());
      	
      data.setCsFuseBeta(cdr.read_type_7());
      	
      data.setCsMagFieldDisturbed(cdr.read_type_7());
      	
      data.setCsFixedWing(cdr.read_type_7());
      	
      data.setCsMagFault(cdr.read_type_7());
      	
      data.setCsFuseAspd(cdr.read_type_7());
      	
      data.setCsGndEffect(cdr.read_type_7());
      	
      data.setCsRngStuck(cdr.read_type_7());
      	
      data.setCsGnssYaw(cdr.read_type_7());
      	
      data.setCsMagAlignedInFlight(cdr.read_type_7());
      	
      data.setCsEvVel(cdr.read_type_7());
      	
      data.setCsSyntheticMagZ(cdr.read_type_7());
      	
      data.setCsVehicleAtRest(cdr.read_type_7());
      	
      data.setCsGnssYawFault(cdr.read_type_7());
      	
      data.setCsRngFault(cdr.read_type_7());
      	
      data.setCsInertialDeadReckoning(cdr.read_type_7());
      	
      data.setCsWindDeadReckoning(cdr.read_type_7());
      	
      data.setCsRngKinConsistent(cdr.read_type_7());
      	
      data.setCsFakePos(cdr.read_type_7());
      	
      data.setCsFakeHgt(cdr.read_type_7());
      	
      data.setCsGravityVector(cdr.read_type_7());
      	
      data.setCsMag(cdr.read_type_7());
      	
      data.setCsEvYawFault(cdr.read_type_7());
      	
      data.setCsMagHeadingConsistent(cdr.read_type_7());
      	
      data.setCsAuxGpos(cdr.read_type_7());
      	
      data.setCsRngTerrain(cdr.read_type_7());
      	
      data.setCsOptFlowTerrain(cdr.read_type_7());
      	
      data.setCsValidFakePos(cdr.read_type_7());
      	
      data.setCsConstantPos(cdr.read_type_7());
      	
      data.setFaultStatusChanges(cdr.read_type_4());
      	
      data.setFsBadMagX(cdr.read_type_7());
      	
      data.setFsBadMagY(cdr.read_type_7());
      	
      data.setFsBadMagZ(cdr.read_type_7());
      	
      data.setFsBadHdg(cdr.read_type_7());
      	
      data.setFsBadMagDecl(cdr.read_type_7());
      	
      data.setFsBadAirspeed(cdr.read_type_7());
      	
      data.setFsBadSideslip(cdr.read_type_7());
      	
      data.setFsBadOptflowX(cdr.read_type_7());
      	
      data.setFsBadOptflowY(cdr.read_type_7());
      	
      data.setFsBadAccVertical(cdr.read_type_7());
      	
      data.setFsBadAccClipping(cdr.read_type_7());
      	
      data.setInnovationFaultStatusChanges(cdr.read_type_4());
      	
      data.setRejectHorVel(cdr.read_type_7());
      	
      data.setRejectVerVel(cdr.read_type_7());
      	
      data.setRejectHorPos(cdr.read_type_7());
      	
      data.setRejectVerPos(cdr.read_type_7());
      	
      data.setRejectYaw(cdr.read_type_7());
      	
      data.setRejectAirspeed(cdr.read_type_7());
      	
      data.setRejectSideslip(cdr.read_type_7());
      	
      data.setRejectHagl(cdr.read_type_7());
      	
      data.setRejectOptflowX(cdr.read_type_7());
      	
      data.setRejectOptflowY(cdr.read_type_7());
      	

   }

   @Override
   public final void serialize(px4_msgs.msg.dds.EstimatorStatusFlags data, us.ihmc.idl.InterchangeSerializer ser)
   {
      ser.write_type_12("timestamp", data.getTimestamp());
      ser.write_type_12("timestamp_sample", data.getTimestampSample());
      ser.write_type_4("control_status_changes", data.getControlStatusChanges());
      ser.write_type_7("cs_tilt_align", data.getCsTiltAlign());
      ser.write_type_7("cs_yaw_align", data.getCsYawAlign());
      ser.write_type_7("cs_gps", data.getCsGps());
      ser.write_type_7("cs_opt_flow", data.getCsOptFlow());
      ser.write_type_7("cs_mag_hdg", data.getCsMagHdg());
      ser.write_type_7("cs_mag_3d", data.getCsMag3d());
      ser.write_type_7("cs_mag_dec", data.getCsMagDec());
      ser.write_type_7("cs_in_air", data.getCsInAir());
      ser.write_type_7("cs_wind", data.getCsWind());
      ser.write_type_7("cs_baro_hgt", data.getCsBaroHgt());
      ser.write_type_7("cs_rng_hgt", data.getCsRngHgt());
      ser.write_type_7("cs_gps_hgt", data.getCsGpsHgt());
      ser.write_type_7("cs_ev_pos", data.getCsEvPos());
      ser.write_type_7("cs_ev_yaw", data.getCsEvYaw());
      ser.write_type_7("cs_ev_hgt", data.getCsEvHgt());
      ser.write_type_7("cs_fuse_beta", data.getCsFuseBeta());
      ser.write_type_7("cs_mag_field_disturbed", data.getCsMagFieldDisturbed());
      ser.write_type_7("cs_fixed_wing", data.getCsFixedWing());
      ser.write_type_7("cs_mag_fault", data.getCsMagFault());
      ser.write_type_7("cs_fuse_aspd", data.getCsFuseAspd());
      ser.write_type_7("cs_gnd_effect", data.getCsGndEffect());
      ser.write_type_7("cs_rng_stuck", data.getCsRngStuck());
      ser.write_type_7("cs_gnss_yaw", data.getCsGnssYaw());
      ser.write_type_7("cs_mag_aligned_in_flight", data.getCsMagAlignedInFlight());
      ser.write_type_7("cs_ev_vel", data.getCsEvVel());
      ser.write_type_7("cs_synthetic_mag_z", data.getCsSyntheticMagZ());
      ser.write_type_7("cs_vehicle_at_rest", data.getCsVehicleAtRest());
      ser.write_type_7("cs_gnss_yaw_fault", data.getCsGnssYawFault());
      ser.write_type_7("cs_rng_fault", data.getCsRngFault());
      ser.write_type_7("cs_inertial_dead_reckoning", data.getCsInertialDeadReckoning());
      ser.write_type_7("cs_wind_dead_reckoning", data.getCsWindDeadReckoning());
      ser.write_type_7("cs_rng_kin_consistent", data.getCsRngKinConsistent());
      ser.write_type_7("cs_fake_pos", data.getCsFakePos());
      ser.write_type_7("cs_fake_hgt", data.getCsFakeHgt());
      ser.write_type_7("cs_gravity_vector", data.getCsGravityVector());
      ser.write_type_7("cs_mag", data.getCsMag());
      ser.write_type_7("cs_ev_yaw_fault", data.getCsEvYawFault());
      ser.write_type_7("cs_mag_heading_consistent", data.getCsMagHeadingConsistent());
      ser.write_type_7("cs_aux_gpos", data.getCsAuxGpos());
      ser.write_type_7("cs_rng_terrain", data.getCsRngTerrain());
      ser.write_type_7("cs_opt_flow_terrain", data.getCsOptFlowTerrain());
      ser.write_type_7("cs_valid_fake_pos", data.getCsValidFakePos());
      ser.write_type_7("cs_constant_pos", data.getCsConstantPos());
      ser.write_type_4("fault_status_changes", data.getFaultStatusChanges());
      ser.write_type_7("fs_bad_mag_x", data.getFsBadMagX());
      ser.write_type_7("fs_bad_mag_y", data.getFsBadMagY());
      ser.write_type_7("fs_bad_mag_z", data.getFsBadMagZ());
      ser.write_type_7("fs_bad_hdg", data.getFsBadHdg());
      ser.write_type_7("fs_bad_mag_decl", data.getFsBadMagDecl());
      ser.write_type_7("fs_bad_airspeed", data.getFsBadAirspeed());
      ser.write_type_7("fs_bad_sideslip", data.getFsBadSideslip());
      ser.write_type_7("fs_bad_optflow_x", data.getFsBadOptflowX());
      ser.write_type_7("fs_bad_optflow_y", data.getFsBadOptflowY());
      ser.write_type_7("fs_bad_acc_vertical", data.getFsBadAccVertical());
      ser.write_type_7("fs_bad_acc_clipping", data.getFsBadAccClipping());
      ser.write_type_4("innovation_fault_status_changes", data.getInnovationFaultStatusChanges());
      ser.write_type_7("reject_hor_vel", data.getRejectHorVel());
      ser.write_type_7("reject_ver_vel", data.getRejectVerVel());
      ser.write_type_7("reject_hor_pos", data.getRejectHorPos());
      ser.write_type_7("reject_ver_pos", data.getRejectVerPos());
      ser.write_type_7("reject_yaw", data.getRejectYaw());
      ser.write_type_7("reject_airspeed", data.getRejectAirspeed());
      ser.write_type_7("reject_sideslip", data.getRejectSideslip());
      ser.write_type_7("reject_hagl", data.getRejectHagl());
      ser.write_type_7("reject_optflow_x", data.getRejectOptflowX());
      ser.write_type_7("reject_optflow_y", data.getRejectOptflowY());
   }

   @Override
   public final void deserialize(us.ihmc.idl.InterchangeSerializer ser, px4_msgs.msg.dds.EstimatorStatusFlags data)
   {
      data.setTimestamp(ser.read_type_12("timestamp"));
      data.setTimestampSample(ser.read_type_12("timestamp_sample"));
      data.setControlStatusChanges(ser.read_type_4("control_status_changes"));
      data.setCsTiltAlign(ser.read_type_7("cs_tilt_align"));
      data.setCsYawAlign(ser.read_type_7("cs_yaw_align"));
      data.setCsGps(ser.read_type_7("cs_gps"));
      data.setCsOptFlow(ser.read_type_7("cs_opt_flow"));
      data.setCsMagHdg(ser.read_type_7("cs_mag_hdg"));
      data.setCsMag3d(ser.read_type_7("cs_mag_3d"));
      data.setCsMagDec(ser.read_type_7("cs_mag_dec"));
      data.setCsInAir(ser.read_type_7("cs_in_air"));
      data.setCsWind(ser.read_type_7("cs_wind"));
      data.setCsBaroHgt(ser.read_type_7("cs_baro_hgt"));
      data.setCsRngHgt(ser.read_type_7("cs_rng_hgt"));
      data.setCsGpsHgt(ser.read_type_7("cs_gps_hgt"));
      data.setCsEvPos(ser.read_type_7("cs_ev_pos"));
      data.setCsEvYaw(ser.read_type_7("cs_ev_yaw"));
      data.setCsEvHgt(ser.read_type_7("cs_ev_hgt"));
      data.setCsFuseBeta(ser.read_type_7("cs_fuse_beta"));
      data.setCsMagFieldDisturbed(ser.read_type_7("cs_mag_field_disturbed"));
      data.setCsFixedWing(ser.read_type_7("cs_fixed_wing"));
      data.setCsMagFault(ser.read_type_7("cs_mag_fault"));
      data.setCsFuseAspd(ser.read_type_7("cs_fuse_aspd"));
      data.setCsGndEffect(ser.read_type_7("cs_gnd_effect"));
      data.setCsRngStuck(ser.read_type_7("cs_rng_stuck"));
      data.setCsGnssYaw(ser.read_type_7("cs_gnss_yaw"));
      data.setCsMagAlignedInFlight(ser.read_type_7("cs_mag_aligned_in_flight"));
      data.setCsEvVel(ser.read_type_7("cs_ev_vel"));
      data.setCsSyntheticMagZ(ser.read_type_7("cs_synthetic_mag_z"));
      data.setCsVehicleAtRest(ser.read_type_7("cs_vehicle_at_rest"));
      data.setCsGnssYawFault(ser.read_type_7("cs_gnss_yaw_fault"));
      data.setCsRngFault(ser.read_type_7("cs_rng_fault"));
      data.setCsInertialDeadReckoning(ser.read_type_7("cs_inertial_dead_reckoning"));
      data.setCsWindDeadReckoning(ser.read_type_7("cs_wind_dead_reckoning"));
      data.setCsRngKinConsistent(ser.read_type_7("cs_rng_kin_consistent"));
      data.setCsFakePos(ser.read_type_7("cs_fake_pos"));
      data.setCsFakeHgt(ser.read_type_7("cs_fake_hgt"));
      data.setCsGravityVector(ser.read_type_7("cs_gravity_vector"));
      data.setCsMag(ser.read_type_7("cs_mag"));
      data.setCsEvYawFault(ser.read_type_7("cs_ev_yaw_fault"));
      data.setCsMagHeadingConsistent(ser.read_type_7("cs_mag_heading_consistent"));
      data.setCsAuxGpos(ser.read_type_7("cs_aux_gpos"));
      data.setCsRngTerrain(ser.read_type_7("cs_rng_terrain"));
      data.setCsOptFlowTerrain(ser.read_type_7("cs_opt_flow_terrain"));
      data.setCsValidFakePos(ser.read_type_7("cs_valid_fake_pos"));
      data.setCsConstantPos(ser.read_type_7("cs_constant_pos"));
      data.setFaultStatusChanges(ser.read_type_4("fault_status_changes"));
      data.setFsBadMagX(ser.read_type_7("fs_bad_mag_x"));
      data.setFsBadMagY(ser.read_type_7("fs_bad_mag_y"));
      data.setFsBadMagZ(ser.read_type_7("fs_bad_mag_z"));
      data.setFsBadHdg(ser.read_type_7("fs_bad_hdg"));
      data.setFsBadMagDecl(ser.read_type_7("fs_bad_mag_decl"));
      data.setFsBadAirspeed(ser.read_type_7("fs_bad_airspeed"));
      data.setFsBadSideslip(ser.read_type_7("fs_bad_sideslip"));
      data.setFsBadOptflowX(ser.read_type_7("fs_bad_optflow_x"));
      data.setFsBadOptflowY(ser.read_type_7("fs_bad_optflow_y"));
      data.setFsBadAccVertical(ser.read_type_7("fs_bad_acc_vertical"));
      data.setFsBadAccClipping(ser.read_type_7("fs_bad_acc_clipping"));
      data.setInnovationFaultStatusChanges(ser.read_type_4("innovation_fault_status_changes"));
      data.setRejectHorVel(ser.read_type_7("reject_hor_vel"));
      data.setRejectVerVel(ser.read_type_7("reject_ver_vel"));
      data.setRejectHorPos(ser.read_type_7("reject_hor_pos"));
      data.setRejectVerPos(ser.read_type_7("reject_ver_pos"));
      data.setRejectYaw(ser.read_type_7("reject_yaw"));
      data.setRejectAirspeed(ser.read_type_7("reject_airspeed"));
      data.setRejectSideslip(ser.read_type_7("reject_sideslip"));
      data.setRejectHagl(ser.read_type_7("reject_hagl"));
      data.setRejectOptflowX(ser.read_type_7("reject_optflow_x"));
      data.setRejectOptflowY(ser.read_type_7("reject_optflow_y"));
   }

   public static void staticCopy(px4_msgs.msg.dds.EstimatorStatusFlags src, px4_msgs.msg.dds.EstimatorStatusFlags dest)
   {
      dest.set(src);
   }

   @Override
   public px4_msgs.msg.dds.EstimatorStatusFlags createData()
   {
      return new px4_msgs.msg.dds.EstimatorStatusFlags();
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
   
   public void serialize(px4_msgs.msg.dds.EstimatorStatusFlags data, us.ihmc.idl.CDR cdr)
   {
      write(data, cdr);
   }

   public void deserialize(px4_msgs.msg.dds.EstimatorStatusFlags data, us.ihmc.idl.CDR cdr)
   {
      read(data, cdr);
   }
   
   public void copy(px4_msgs.msg.dds.EstimatorStatusFlags src, px4_msgs.msg.dds.EstimatorStatusFlags dest)
   {
      staticCopy(src, dest);
   }

   @Override
   public EstimatorStatusFlagsPubSubType newInstance()
   {
      return new EstimatorStatusFlagsPubSubType();
   }
}
