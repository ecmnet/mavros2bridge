package px4_msgs.msg.dds;

import us.ihmc.communication.packets.Packet;
import us.ihmc.euclid.interfaces.Settable;
import us.ihmc.euclid.interfaces.EpsilonComparable;
import java.util.function.Supplier;
import us.ihmc.pubsub.TopicDataType;

public class EstimatorStatusFlags extends Packet<EstimatorStatusFlags> implements Settable<EstimatorStatusFlags>, EpsilonComparable<EstimatorStatusFlags>
{
   /**
            * time since system start (microseconds)
            */
   public long timestamp_;
   /**
            * the timestamp of the raw data (microseconds)
            */
   public long timestamp_sample_;
   /**
            * filter control status
            * number of filter control status (cs) changes
            */
   public long control_status_changes_;
   /**
            * 0 - true if the filter tilt alignment is complete
            */
   public boolean cs_tilt_align_;
   /**
            * 1 - true if the filter yaw alignment is complete
            */
   public boolean cs_yaw_align_;
   /**
            * 2 - true if GPS measurement fusion is intended
            */
   public boolean cs_gps_;
   /**
            * 3 - true if optical flow measurements fusion is intended
            */
   public boolean cs_opt_flow_;
   /**
            * 4 - true if a simple magnetic yaw heading fusion is intended
            */
   public boolean cs_mag_hdg_;
   /**
            * 5 - true if 3-axis magnetometer measurement fusion is intended
            */
   public boolean cs_mag_3d_;
   /**
            * 6 - true if synthetic magnetic declination measurements fusion is intended
            */
   public boolean cs_mag_dec_;
   /**
            * 7 - true when the vehicle is airborne
            */
   public boolean cs_in_air_;
   /**
            * 8 - true when wind velocity is being estimated
            */
   public boolean cs_wind_;
   /**
            * 9 - true when baro height is being fused as a primary height reference
            */
   public boolean cs_baro_hgt_;
   /**
            * 10 - true when range finder height is being fused as a primary height reference
            */
   public boolean cs_rng_hgt_;
   /**
            * 11 - true when GPS height is being fused as a primary height reference
            */
   public boolean cs_gps_hgt_;
   /**
            * 12 - true when local position data fusion from external vision is intended
            */
   public boolean cs_ev_pos_;
   /**
            * 13 - true when yaw data from external vision measurements fusion is intended
            */
   public boolean cs_ev_yaw_;
   /**
            * 14 - true when height data from external vision measurements is being fused
            */
   public boolean cs_ev_hgt_;
   /**
            * 15 - true when synthetic sideslip measurements are being fused
            */
   public boolean cs_fuse_beta_;
   /**
            * 16 - true when the mag field does not match the expected strength
            */
   public boolean cs_mag_field_disturbed_;
   /**
            * 17 - true when the vehicle is operating as a fixed wing vehicle
            */
   public boolean cs_fixed_wing_;
   /**
            * 18 - true when the magnetometer has been declared faulty and is no longer being used
            */
   public boolean cs_mag_fault_;
   /**
            * 19 - true when airspeed measurements are being fused
            */
   public boolean cs_fuse_aspd_;
   /**
            * 20 - true when protection from ground effect induced static pressure rise is active
            */
   public boolean cs_gnd_effect_;
   /**
            * 21 - true when rng data wasn't ready for more than 10s and new rng values haven't changed enough
            */
   public boolean cs_rng_stuck_;
   /**
            * 22 - true when yaw (not ground course) data fusion from a GPS receiver is intended
            */
   public boolean cs_gnss_yaw_;
   /**
            * 23 - true when the in-flight mag field alignment has been completed
            */
   public boolean cs_mag_aligned_in_flight_;
   /**
            * 24 - true when local frame velocity data fusion from external vision measurements is intended
            */
   public boolean cs_ev_vel_;
   /**
            * 25 - true when we are using a synthesized measurement for the magnetometer Z component
            */
   public boolean cs_synthetic_mag_z_;
   /**
            * 26 - true when the vehicle is at rest
            */
   public boolean cs_vehicle_at_rest_;
   /**
            * 27 - true when the GNSS heading has been declared faulty and is no longer being used
            */
   public boolean cs_gnss_yaw_fault_;
   /**
            * 28 - true when the range finder has been declared faulty and is no longer being used
            */
   public boolean cs_rng_fault_;
   /**
            * 29 - true if we are no longer fusing measurements that constrain horizontal velocity drift
            */
   public boolean cs_inertial_dead_reckoning_;
   /**
            * 30 - true if we are navigationg reliant on wind relative measurements
            */
   public boolean cs_wind_dead_reckoning_;
   /**
            * 31 - true when the range finder kinematic consistency check is passing
            */
   public boolean cs_rng_kin_consistent_;
   /**
            * 32 - true when fake position measurements are being fused
            */
   public boolean cs_fake_pos_;
   /**
            * 33 - true when fake height measurements are being fused
            */
   public boolean cs_fake_hgt_;
   /**
            * 34 - true when gravity vector measurements are being fused
            */
   public boolean cs_gravity_vector_;
   /**
            * 35 - true if 3-axis magnetometer measurement fusion (mag states only) is intended
            */
   public boolean cs_mag_;
   /**
            * 36 - true when the EV heading has been declared faulty and is no longer being used
            */
   public boolean cs_ev_yaw_fault_;
   /**
            * 37 - true when the heading obtained from mag data is declared consistent with the filter
            */
   public boolean cs_mag_heading_consistent_;
   /**
            * 38 - true if auxiliary global position measurement fusion is intended
            */
   public boolean cs_aux_gpos_;
   /**
            * 39 - true if we are fusing range finder data for terrain
            */
   public boolean cs_rng_terrain_;
   /**
            * 40 - true if we are fusing flow data for terrain
            */
   public boolean cs_opt_flow_terrain_;
   /**
            * 41 - true if a valid constant position is being fused
            */
   public boolean cs_valid_fake_pos_;
   /**
            * 42 - true if the vehicle is at a constant position
            */
   public boolean cs_constant_pos_;
   /**
            * fault status
            * number of filter fault status (fs) changes
            */
   public long fault_status_changes_;
   /**
            * 0 - true if the fusion of the magnetometer X-axis has encountered a numerical error
            */
   public boolean fs_bad_mag_x_;
   /**
            * 1 - true if the fusion of the magnetometer Y-axis has encountered a numerical error
            */
   public boolean fs_bad_mag_y_;
   /**
            * 2 - true if the fusion of the magnetometer Z-axis has encountered a numerical error
            */
   public boolean fs_bad_mag_z_;
   /**
            * 3 - true if the fusion of the heading angle has encountered a numerical error
            */
   public boolean fs_bad_hdg_;
   /**
            * 4 - true if the fusion of the magnetic declination has encountered a numerical error
            */
   public boolean fs_bad_mag_decl_;
   /**
            * 5 - true if fusion of the airspeed has encountered a numerical error
            */
   public boolean fs_bad_airspeed_;
   /**
            * 6 - true if fusion of the synthetic sideslip constraint has encountered a numerical error
            */
   public boolean fs_bad_sideslip_;
   /**
            * 7 - true if fusion of the optical flow X axis has encountered a numerical error
            */
   public boolean fs_bad_optflow_x_;
   /**
            * 8 - true if fusion of the optical flow Y axis has encountered a numerical error
            */
   public boolean fs_bad_optflow_y_;
   /**
            * 10 - true if bad vertical accelerometer data has been detected
            */
   public boolean fs_bad_acc_vertical_;
   /**
            * 11 - true if delta velocity data contains clipping (asymmetric railing)
            */
   public boolean fs_bad_acc_clipping_;
   /**
            * innovation test failures
            * number of innovation fault status (reject) changes
            */
   public long innovation_fault_status_changes_;
   /**
            * 0 - true if horizontal velocity observations have been rejected
            */
   public boolean reject_hor_vel_;
   /**
            * 1 - true if vertical velocity observations have been rejected
            */
   public boolean reject_ver_vel_;
   /**
            * 2 - true if horizontal position observations have been rejected
            */
   public boolean reject_hor_pos_;
   /**
            * 3 - true if vertical position observations have been rejected
            */
   public boolean reject_ver_pos_;
   /**
            * 7 - true if the yaw observation has been rejected
            */
   public boolean reject_yaw_;
   /**
            * 8 - true if the airspeed observation has been rejected
            */
   public boolean reject_airspeed_;
   /**
            * 9 - true if the synthetic sideslip observation has been rejected
            */
   public boolean reject_sideslip_;
   /**
            * 10 - true if the height above ground observation has been rejected
            */
   public boolean reject_hagl_;
   /**
            * 11 - true if the X optical flow observation has been rejected
            */
   public boolean reject_optflow_x_;
   /**
            * 12 - true if the Y optical flow observation has been rejected
            */
   public boolean reject_optflow_y_;

   public EstimatorStatusFlags()
   {
   }

   public EstimatorStatusFlags(EstimatorStatusFlags other)
   {
      this();
      set(other);
   }

   public void set(EstimatorStatusFlags other)
   {
      timestamp_ = other.timestamp_;

      timestamp_sample_ = other.timestamp_sample_;

      control_status_changes_ = other.control_status_changes_;

      cs_tilt_align_ = other.cs_tilt_align_;

      cs_yaw_align_ = other.cs_yaw_align_;

      cs_gps_ = other.cs_gps_;

      cs_opt_flow_ = other.cs_opt_flow_;

      cs_mag_hdg_ = other.cs_mag_hdg_;

      cs_mag_3d_ = other.cs_mag_3d_;

      cs_mag_dec_ = other.cs_mag_dec_;

      cs_in_air_ = other.cs_in_air_;

      cs_wind_ = other.cs_wind_;

      cs_baro_hgt_ = other.cs_baro_hgt_;

      cs_rng_hgt_ = other.cs_rng_hgt_;

      cs_gps_hgt_ = other.cs_gps_hgt_;

      cs_ev_pos_ = other.cs_ev_pos_;

      cs_ev_yaw_ = other.cs_ev_yaw_;

      cs_ev_hgt_ = other.cs_ev_hgt_;

      cs_fuse_beta_ = other.cs_fuse_beta_;

      cs_mag_field_disturbed_ = other.cs_mag_field_disturbed_;

      cs_fixed_wing_ = other.cs_fixed_wing_;

      cs_mag_fault_ = other.cs_mag_fault_;

      cs_fuse_aspd_ = other.cs_fuse_aspd_;

      cs_gnd_effect_ = other.cs_gnd_effect_;

      cs_rng_stuck_ = other.cs_rng_stuck_;

      cs_gnss_yaw_ = other.cs_gnss_yaw_;

      cs_mag_aligned_in_flight_ = other.cs_mag_aligned_in_flight_;

      cs_ev_vel_ = other.cs_ev_vel_;

      cs_synthetic_mag_z_ = other.cs_synthetic_mag_z_;

      cs_vehicle_at_rest_ = other.cs_vehicle_at_rest_;

      cs_gnss_yaw_fault_ = other.cs_gnss_yaw_fault_;

      cs_rng_fault_ = other.cs_rng_fault_;

      cs_inertial_dead_reckoning_ = other.cs_inertial_dead_reckoning_;

      cs_wind_dead_reckoning_ = other.cs_wind_dead_reckoning_;

      cs_rng_kin_consistent_ = other.cs_rng_kin_consistent_;

      cs_fake_pos_ = other.cs_fake_pos_;

      cs_fake_hgt_ = other.cs_fake_hgt_;

      cs_gravity_vector_ = other.cs_gravity_vector_;

      cs_mag_ = other.cs_mag_;

      cs_ev_yaw_fault_ = other.cs_ev_yaw_fault_;

      cs_mag_heading_consistent_ = other.cs_mag_heading_consistent_;

      cs_aux_gpos_ = other.cs_aux_gpos_;

      cs_rng_terrain_ = other.cs_rng_terrain_;

      cs_opt_flow_terrain_ = other.cs_opt_flow_terrain_;

      cs_valid_fake_pos_ = other.cs_valid_fake_pos_;

      cs_constant_pos_ = other.cs_constant_pos_;

      fault_status_changes_ = other.fault_status_changes_;

      fs_bad_mag_x_ = other.fs_bad_mag_x_;

      fs_bad_mag_y_ = other.fs_bad_mag_y_;

      fs_bad_mag_z_ = other.fs_bad_mag_z_;

      fs_bad_hdg_ = other.fs_bad_hdg_;

      fs_bad_mag_decl_ = other.fs_bad_mag_decl_;

      fs_bad_airspeed_ = other.fs_bad_airspeed_;

      fs_bad_sideslip_ = other.fs_bad_sideslip_;

      fs_bad_optflow_x_ = other.fs_bad_optflow_x_;

      fs_bad_optflow_y_ = other.fs_bad_optflow_y_;

      fs_bad_acc_vertical_ = other.fs_bad_acc_vertical_;

      fs_bad_acc_clipping_ = other.fs_bad_acc_clipping_;

      innovation_fault_status_changes_ = other.innovation_fault_status_changes_;

      reject_hor_vel_ = other.reject_hor_vel_;

      reject_ver_vel_ = other.reject_ver_vel_;

      reject_hor_pos_ = other.reject_hor_pos_;

      reject_ver_pos_ = other.reject_ver_pos_;

      reject_yaw_ = other.reject_yaw_;

      reject_airspeed_ = other.reject_airspeed_;

      reject_sideslip_ = other.reject_sideslip_;

      reject_hagl_ = other.reject_hagl_;

      reject_optflow_x_ = other.reject_optflow_x_;

      reject_optflow_y_ = other.reject_optflow_y_;

   }

   /**
            * time since system start (microseconds)
            */
   public void setTimestamp(long timestamp)
   {
      timestamp_ = timestamp;
   }
   /**
            * time since system start (microseconds)
            */
   public long getTimestamp()
   {
      return timestamp_;
   }

   /**
            * the timestamp of the raw data (microseconds)
            */
   public void setTimestampSample(long timestamp_sample)
   {
      timestamp_sample_ = timestamp_sample;
   }
   /**
            * the timestamp of the raw data (microseconds)
            */
   public long getTimestampSample()
   {
      return timestamp_sample_;
   }

   /**
            * filter control status
            * number of filter control status (cs) changes
            */
   public void setControlStatusChanges(long control_status_changes)
   {
      control_status_changes_ = control_status_changes;
   }
   /**
            * filter control status
            * number of filter control status (cs) changes
            */
   public long getControlStatusChanges()
   {
      return control_status_changes_;
   }

   /**
            * 0 - true if the filter tilt alignment is complete
            */
   public void setCsTiltAlign(boolean cs_tilt_align)
   {
      cs_tilt_align_ = cs_tilt_align;
   }
   /**
            * 0 - true if the filter tilt alignment is complete
            */
   public boolean getCsTiltAlign()
   {
      return cs_tilt_align_;
   }

   /**
            * 1 - true if the filter yaw alignment is complete
            */
   public void setCsYawAlign(boolean cs_yaw_align)
   {
      cs_yaw_align_ = cs_yaw_align;
   }
   /**
            * 1 - true if the filter yaw alignment is complete
            */
   public boolean getCsYawAlign()
   {
      return cs_yaw_align_;
   }

   /**
            * 2 - true if GPS measurement fusion is intended
            */
   public void setCsGps(boolean cs_gps)
   {
      cs_gps_ = cs_gps;
   }
   /**
            * 2 - true if GPS measurement fusion is intended
            */
   public boolean getCsGps()
   {
      return cs_gps_;
   }

   /**
            * 3 - true if optical flow measurements fusion is intended
            */
   public void setCsOptFlow(boolean cs_opt_flow)
   {
      cs_opt_flow_ = cs_opt_flow;
   }
   /**
            * 3 - true if optical flow measurements fusion is intended
            */
   public boolean getCsOptFlow()
   {
      return cs_opt_flow_;
   }

   /**
            * 4 - true if a simple magnetic yaw heading fusion is intended
            */
   public void setCsMagHdg(boolean cs_mag_hdg)
   {
      cs_mag_hdg_ = cs_mag_hdg;
   }
   /**
            * 4 - true if a simple magnetic yaw heading fusion is intended
            */
   public boolean getCsMagHdg()
   {
      return cs_mag_hdg_;
   }

   /**
            * 5 - true if 3-axis magnetometer measurement fusion is intended
            */
   public void setCsMag3d(boolean cs_mag_3d)
   {
      cs_mag_3d_ = cs_mag_3d;
   }
   /**
            * 5 - true if 3-axis magnetometer measurement fusion is intended
            */
   public boolean getCsMag3d()
   {
      return cs_mag_3d_;
   }

   /**
            * 6 - true if synthetic magnetic declination measurements fusion is intended
            */
   public void setCsMagDec(boolean cs_mag_dec)
   {
      cs_mag_dec_ = cs_mag_dec;
   }
   /**
            * 6 - true if synthetic magnetic declination measurements fusion is intended
            */
   public boolean getCsMagDec()
   {
      return cs_mag_dec_;
   }

   /**
            * 7 - true when the vehicle is airborne
            */
   public void setCsInAir(boolean cs_in_air)
   {
      cs_in_air_ = cs_in_air;
   }
   /**
            * 7 - true when the vehicle is airborne
            */
   public boolean getCsInAir()
   {
      return cs_in_air_;
   }

   /**
            * 8 - true when wind velocity is being estimated
            */
   public void setCsWind(boolean cs_wind)
   {
      cs_wind_ = cs_wind;
   }
   /**
            * 8 - true when wind velocity is being estimated
            */
   public boolean getCsWind()
   {
      return cs_wind_;
   }

   /**
            * 9 - true when baro height is being fused as a primary height reference
            */
   public void setCsBaroHgt(boolean cs_baro_hgt)
   {
      cs_baro_hgt_ = cs_baro_hgt;
   }
   /**
            * 9 - true when baro height is being fused as a primary height reference
            */
   public boolean getCsBaroHgt()
   {
      return cs_baro_hgt_;
   }

   /**
            * 10 - true when range finder height is being fused as a primary height reference
            */
   public void setCsRngHgt(boolean cs_rng_hgt)
   {
      cs_rng_hgt_ = cs_rng_hgt;
   }
   /**
            * 10 - true when range finder height is being fused as a primary height reference
            */
   public boolean getCsRngHgt()
   {
      return cs_rng_hgt_;
   }

   /**
            * 11 - true when GPS height is being fused as a primary height reference
            */
   public void setCsGpsHgt(boolean cs_gps_hgt)
   {
      cs_gps_hgt_ = cs_gps_hgt;
   }
   /**
            * 11 - true when GPS height is being fused as a primary height reference
            */
   public boolean getCsGpsHgt()
   {
      return cs_gps_hgt_;
   }

   /**
            * 12 - true when local position data fusion from external vision is intended
            */
   public void setCsEvPos(boolean cs_ev_pos)
   {
      cs_ev_pos_ = cs_ev_pos;
   }
   /**
            * 12 - true when local position data fusion from external vision is intended
            */
   public boolean getCsEvPos()
   {
      return cs_ev_pos_;
   }

   /**
            * 13 - true when yaw data from external vision measurements fusion is intended
            */
   public void setCsEvYaw(boolean cs_ev_yaw)
   {
      cs_ev_yaw_ = cs_ev_yaw;
   }
   /**
            * 13 - true when yaw data from external vision measurements fusion is intended
            */
   public boolean getCsEvYaw()
   {
      return cs_ev_yaw_;
   }

   /**
            * 14 - true when height data from external vision measurements is being fused
            */
   public void setCsEvHgt(boolean cs_ev_hgt)
   {
      cs_ev_hgt_ = cs_ev_hgt;
   }
   /**
            * 14 - true when height data from external vision measurements is being fused
            */
   public boolean getCsEvHgt()
   {
      return cs_ev_hgt_;
   }

   /**
            * 15 - true when synthetic sideslip measurements are being fused
            */
   public void setCsFuseBeta(boolean cs_fuse_beta)
   {
      cs_fuse_beta_ = cs_fuse_beta;
   }
   /**
            * 15 - true when synthetic sideslip measurements are being fused
            */
   public boolean getCsFuseBeta()
   {
      return cs_fuse_beta_;
   }

   /**
            * 16 - true when the mag field does not match the expected strength
            */
   public void setCsMagFieldDisturbed(boolean cs_mag_field_disturbed)
   {
      cs_mag_field_disturbed_ = cs_mag_field_disturbed;
   }
   /**
            * 16 - true when the mag field does not match the expected strength
            */
   public boolean getCsMagFieldDisturbed()
   {
      return cs_mag_field_disturbed_;
   }

   /**
            * 17 - true when the vehicle is operating as a fixed wing vehicle
            */
   public void setCsFixedWing(boolean cs_fixed_wing)
   {
      cs_fixed_wing_ = cs_fixed_wing;
   }
   /**
            * 17 - true when the vehicle is operating as a fixed wing vehicle
            */
   public boolean getCsFixedWing()
   {
      return cs_fixed_wing_;
   }

   /**
            * 18 - true when the magnetometer has been declared faulty and is no longer being used
            */
   public void setCsMagFault(boolean cs_mag_fault)
   {
      cs_mag_fault_ = cs_mag_fault;
   }
   /**
            * 18 - true when the magnetometer has been declared faulty and is no longer being used
            */
   public boolean getCsMagFault()
   {
      return cs_mag_fault_;
   }

   /**
            * 19 - true when airspeed measurements are being fused
            */
   public void setCsFuseAspd(boolean cs_fuse_aspd)
   {
      cs_fuse_aspd_ = cs_fuse_aspd;
   }
   /**
            * 19 - true when airspeed measurements are being fused
            */
   public boolean getCsFuseAspd()
   {
      return cs_fuse_aspd_;
   }

   /**
            * 20 - true when protection from ground effect induced static pressure rise is active
            */
   public void setCsGndEffect(boolean cs_gnd_effect)
   {
      cs_gnd_effect_ = cs_gnd_effect;
   }
   /**
            * 20 - true when protection from ground effect induced static pressure rise is active
            */
   public boolean getCsGndEffect()
   {
      return cs_gnd_effect_;
   }

   /**
            * 21 - true when rng data wasn't ready for more than 10s and new rng values haven't changed enough
            */
   public void setCsRngStuck(boolean cs_rng_stuck)
   {
      cs_rng_stuck_ = cs_rng_stuck;
   }
   /**
            * 21 - true when rng data wasn't ready for more than 10s and new rng values haven't changed enough
            */
   public boolean getCsRngStuck()
   {
      return cs_rng_stuck_;
   }

   /**
            * 22 - true when yaw (not ground course) data fusion from a GPS receiver is intended
            */
   public void setCsGnssYaw(boolean cs_gnss_yaw)
   {
      cs_gnss_yaw_ = cs_gnss_yaw;
   }
   /**
            * 22 - true when yaw (not ground course) data fusion from a GPS receiver is intended
            */
   public boolean getCsGnssYaw()
   {
      return cs_gnss_yaw_;
   }

   /**
            * 23 - true when the in-flight mag field alignment has been completed
            */
   public void setCsMagAlignedInFlight(boolean cs_mag_aligned_in_flight)
   {
      cs_mag_aligned_in_flight_ = cs_mag_aligned_in_flight;
   }
   /**
            * 23 - true when the in-flight mag field alignment has been completed
            */
   public boolean getCsMagAlignedInFlight()
   {
      return cs_mag_aligned_in_flight_;
   }

   /**
            * 24 - true when local frame velocity data fusion from external vision measurements is intended
            */
   public void setCsEvVel(boolean cs_ev_vel)
   {
      cs_ev_vel_ = cs_ev_vel;
   }
   /**
            * 24 - true when local frame velocity data fusion from external vision measurements is intended
            */
   public boolean getCsEvVel()
   {
      return cs_ev_vel_;
   }

   /**
            * 25 - true when we are using a synthesized measurement for the magnetometer Z component
            */
   public void setCsSyntheticMagZ(boolean cs_synthetic_mag_z)
   {
      cs_synthetic_mag_z_ = cs_synthetic_mag_z;
   }
   /**
            * 25 - true when we are using a synthesized measurement for the magnetometer Z component
            */
   public boolean getCsSyntheticMagZ()
   {
      return cs_synthetic_mag_z_;
   }

   /**
            * 26 - true when the vehicle is at rest
            */
   public void setCsVehicleAtRest(boolean cs_vehicle_at_rest)
   {
      cs_vehicle_at_rest_ = cs_vehicle_at_rest;
   }
   /**
            * 26 - true when the vehicle is at rest
            */
   public boolean getCsVehicleAtRest()
   {
      return cs_vehicle_at_rest_;
   }

   /**
            * 27 - true when the GNSS heading has been declared faulty and is no longer being used
            */
   public void setCsGnssYawFault(boolean cs_gnss_yaw_fault)
   {
      cs_gnss_yaw_fault_ = cs_gnss_yaw_fault;
   }
   /**
            * 27 - true when the GNSS heading has been declared faulty and is no longer being used
            */
   public boolean getCsGnssYawFault()
   {
      return cs_gnss_yaw_fault_;
   }

   /**
            * 28 - true when the range finder has been declared faulty and is no longer being used
            */
   public void setCsRngFault(boolean cs_rng_fault)
   {
      cs_rng_fault_ = cs_rng_fault;
   }
   /**
            * 28 - true when the range finder has been declared faulty and is no longer being used
            */
   public boolean getCsRngFault()
   {
      return cs_rng_fault_;
   }

   /**
            * 29 - true if we are no longer fusing measurements that constrain horizontal velocity drift
            */
   public void setCsInertialDeadReckoning(boolean cs_inertial_dead_reckoning)
   {
      cs_inertial_dead_reckoning_ = cs_inertial_dead_reckoning;
   }
   /**
            * 29 - true if we are no longer fusing measurements that constrain horizontal velocity drift
            */
   public boolean getCsInertialDeadReckoning()
   {
      return cs_inertial_dead_reckoning_;
   }

   /**
            * 30 - true if we are navigationg reliant on wind relative measurements
            */
   public void setCsWindDeadReckoning(boolean cs_wind_dead_reckoning)
   {
      cs_wind_dead_reckoning_ = cs_wind_dead_reckoning;
   }
   /**
            * 30 - true if we are navigationg reliant on wind relative measurements
            */
   public boolean getCsWindDeadReckoning()
   {
      return cs_wind_dead_reckoning_;
   }

   /**
            * 31 - true when the range finder kinematic consistency check is passing
            */
   public void setCsRngKinConsistent(boolean cs_rng_kin_consistent)
   {
      cs_rng_kin_consistent_ = cs_rng_kin_consistent;
   }
   /**
            * 31 - true when the range finder kinematic consistency check is passing
            */
   public boolean getCsRngKinConsistent()
   {
      return cs_rng_kin_consistent_;
   }

   /**
            * 32 - true when fake position measurements are being fused
            */
   public void setCsFakePos(boolean cs_fake_pos)
   {
      cs_fake_pos_ = cs_fake_pos;
   }
   /**
            * 32 - true when fake position measurements are being fused
            */
   public boolean getCsFakePos()
   {
      return cs_fake_pos_;
   }

   /**
            * 33 - true when fake height measurements are being fused
            */
   public void setCsFakeHgt(boolean cs_fake_hgt)
   {
      cs_fake_hgt_ = cs_fake_hgt;
   }
   /**
            * 33 - true when fake height measurements are being fused
            */
   public boolean getCsFakeHgt()
   {
      return cs_fake_hgt_;
   }

   /**
            * 34 - true when gravity vector measurements are being fused
            */
   public void setCsGravityVector(boolean cs_gravity_vector)
   {
      cs_gravity_vector_ = cs_gravity_vector;
   }
   /**
            * 34 - true when gravity vector measurements are being fused
            */
   public boolean getCsGravityVector()
   {
      return cs_gravity_vector_;
   }

   /**
            * 35 - true if 3-axis magnetometer measurement fusion (mag states only) is intended
            */
   public void setCsMag(boolean cs_mag)
   {
      cs_mag_ = cs_mag;
   }
   /**
            * 35 - true if 3-axis magnetometer measurement fusion (mag states only) is intended
            */
   public boolean getCsMag()
   {
      return cs_mag_;
   }

   /**
            * 36 - true when the EV heading has been declared faulty and is no longer being used
            */
   public void setCsEvYawFault(boolean cs_ev_yaw_fault)
   {
      cs_ev_yaw_fault_ = cs_ev_yaw_fault;
   }
   /**
            * 36 - true when the EV heading has been declared faulty and is no longer being used
            */
   public boolean getCsEvYawFault()
   {
      return cs_ev_yaw_fault_;
   }

   /**
            * 37 - true when the heading obtained from mag data is declared consistent with the filter
            */
   public void setCsMagHeadingConsistent(boolean cs_mag_heading_consistent)
   {
      cs_mag_heading_consistent_ = cs_mag_heading_consistent;
   }
   /**
            * 37 - true when the heading obtained from mag data is declared consistent with the filter
            */
   public boolean getCsMagHeadingConsistent()
   {
      return cs_mag_heading_consistent_;
   }

   /**
            * 38 - true if auxiliary global position measurement fusion is intended
            */
   public void setCsAuxGpos(boolean cs_aux_gpos)
   {
      cs_aux_gpos_ = cs_aux_gpos;
   }
   /**
            * 38 - true if auxiliary global position measurement fusion is intended
            */
   public boolean getCsAuxGpos()
   {
      return cs_aux_gpos_;
   }

   /**
            * 39 - true if we are fusing range finder data for terrain
            */
   public void setCsRngTerrain(boolean cs_rng_terrain)
   {
      cs_rng_terrain_ = cs_rng_terrain;
   }
   /**
            * 39 - true if we are fusing range finder data for terrain
            */
   public boolean getCsRngTerrain()
   {
      return cs_rng_terrain_;
   }

   /**
            * 40 - true if we are fusing flow data for terrain
            */
   public void setCsOptFlowTerrain(boolean cs_opt_flow_terrain)
   {
      cs_opt_flow_terrain_ = cs_opt_flow_terrain;
   }
   /**
            * 40 - true if we are fusing flow data for terrain
            */
   public boolean getCsOptFlowTerrain()
   {
      return cs_opt_flow_terrain_;
   }

   /**
            * 41 - true if a valid constant position is being fused
            */
   public void setCsValidFakePos(boolean cs_valid_fake_pos)
   {
      cs_valid_fake_pos_ = cs_valid_fake_pos;
   }
   /**
            * 41 - true if a valid constant position is being fused
            */
   public boolean getCsValidFakePos()
   {
      return cs_valid_fake_pos_;
   }

   /**
            * 42 - true if the vehicle is at a constant position
            */
   public void setCsConstantPos(boolean cs_constant_pos)
   {
      cs_constant_pos_ = cs_constant_pos;
   }
   /**
            * 42 - true if the vehicle is at a constant position
            */
   public boolean getCsConstantPos()
   {
      return cs_constant_pos_;
   }

   /**
            * fault status
            * number of filter fault status (fs) changes
            */
   public void setFaultStatusChanges(long fault_status_changes)
   {
      fault_status_changes_ = fault_status_changes;
   }
   /**
            * fault status
            * number of filter fault status (fs) changes
            */
   public long getFaultStatusChanges()
   {
      return fault_status_changes_;
   }

   /**
            * 0 - true if the fusion of the magnetometer X-axis has encountered a numerical error
            */
   public void setFsBadMagX(boolean fs_bad_mag_x)
   {
      fs_bad_mag_x_ = fs_bad_mag_x;
   }
   /**
            * 0 - true if the fusion of the magnetometer X-axis has encountered a numerical error
            */
   public boolean getFsBadMagX()
   {
      return fs_bad_mag_x_;
   }

   /**
            * 1 - true if the fusion of the magnetometer Y-axis has encountered a numerical error
            */
   public void setFsBadMagY(boolean fs_bad_mag_y)
   {
      fs_bad_mag_y_ = fs_bad_mag_y;
   }
   /**
            * 1 - true if the fusion of the magnetometer Y-axis has encountered a numerical error
            */
   public boolean getFsBadMagY()
   {
      return fs_bad_mag_y_;
   }

   /**
            * 2 - true if the fusion of the magnetometer Z-axis has encountered a numerical error
            */
   public void setFsBadMagZ(boolean fs_bad_mag_z)
   {
      fs_bad_mag_z_ = fs_bad_mag_z;
   }
   /**
            * 2 - true if the fusion of the magnetometer Z-axis has encountered a numerical error
            */
   public boolean getFsBadMagZ()
   {
      return fs_bad_mag_z_;
   }

   /**
            * 3 - true if the fusion of the heading angle has encountered a numerical error
            */
   public void setFsBadHdg(boolean fs_bad_hdg)
   {
      fs_bad_hdg_ = fs_bad_hdg;
   }
   /**
            * 3 - true if the fusion of the heading angle has encountered a numerical error
            */
   public boolean getFsBadHdg()
   {
      return fs_bad_hdg_;
   }

   /**
            * 4 - true if the fusion of the magnetic declination has encountered a numerical error
            */
   public void setFsBadMagDecl(boolean fs_bad_mag_decl)
   {
      fs_bad_mag_decl_ = fs_bad_mag_decl;
   }
   /**
            * 4 - true if the fusion of the magnetic declination has encountered a numerical error
            */
   public boolean getFsBadMagDecl()
   {
      return fs_bad_mag_decl_;
   }

   /**
            * 5 - true if fusion of the airspeed has encountered a numerical error
            */
   public void setFsBadAirspeed(boolean fs_bad_airspeed)
   {
      fs_bad_airspeed_ = fs_bad_airspeed;
   }
   /**
            * 5 - true if fusion of the airspeed has encountered a numerical error
            */
   public boolean getFsBadAirspeed()
   {
      return fs_bad_airspeed_;
   }

   /**
            * 6 - true if fusion of the synthetic sideslip constraint has encountered a numerical error
            */
   public void setFsBadSideslip(boolean fs_bad_sideslip)
   {
      fs_bad_sideslip_ = fs_bad_sideslip;
   }
   /**
            * 6 - true if fusion of the synthetic sideslip constraint has encountered a numerical error
            */
   public boolean getFsBadSideslip()
   {
      return fs_bad_sideslip_;
   }

   /**
            * 7 - true if fusion of the optical flow X axis has encountered a numerical error
            */
   public void setFsBadOptflowX(boolean fs_bad_optflow_x)
   {
      fs_bad_optflow_x_ = fs_bad_optflow_x;
   }
   /**
            * 7 - true if fusion of the optical flow X axis has encountered a numerical error
            */
   public boolean getFsBadOptflowX()
   {
      return fs_bad_optflow_x_;
   }

   /**
            * 8 - true if fusion of the optical flow Y axis has encountered a numerical error
            */
   public void setFsBadOptflowY(boolean fs_bad_optflow_y)
   {
      fs_bad_optflow_y_ = fs_bad_optflow_y;
   }
   /**
            * 8 - true if fusion of the optical flow Y axis has encountered a numerical error
            */
   public boolean getFsBadOptflowY()
   {
      return fs_bad_optflow_y_;
   }

   /**
            * 10 - true if bad vertical accelerometer data has been detected
            */
   public void setFsBadAccVertical(boolean fs_bad_acc_vertical)
   {
      fs_bad_acc_vertical_ = fs_bad_acc_vertical;
   }
   /**
            * 10 - true if bad vertical accelerometer data has been detected
            */
   public boolean getFsBadAccVertical()
   {
      return fs_bad_acc_vertical_;
   }

   /**
            * 11 - true if delta velocity data contains clipping (asymmetric railing)
            */
   public void setFsBadAccClipping(boolean fs_bad_acc_clipping)
   {
      fs_bad_acc_clipping_ = fs_bad_acc_clipping;
   }
   /**
            * 11 - true if delta velocity data contains clipping (asymmetric railing)
            */
   public boolean getFsBadAccClipping()
   {
      return fs_bad_acc_clipping_;
   }

   /**
            * innovation test failures
            * number of innovation fault status (reject) changes
            */
   public void setInnovationFaultStatusChanges(long innovation_fault_status_changes)
   {
      innovation_fault_status_changes_ = innovation_fault_status_changes;
   }
   /**
            * innovation test failures
            * number of innovation fault status (reject) changes
            */
   public long getInnovationFaultStatusChanges()
   {
      return innovation_fault_status_changes_;
   }

   /**
            * 0 - true if horizontal velocity observations have been rejected
            */
   public void setRejectHorVel(boolean reject_hor_vel)
   {
      reject_hor_vel_ = reject_hor_vel;
   }
   /**
            * 0 - true if horizontal velocity observations have been rejected
            */
   public boolean getRejectHorVel()
   {
      return reject_hor_vel_;
   }

   /**
            * 1 - true if vertical velocity observations have been rejected
            */
   public void setRejectVerVel(boolean reject_ver_vel)
   {
      reject_ver_vel_ = reject_ver_vel;
   }
   /**
            * 1 - true if vertical velocity observations have been rejected
            */
   public boolean getRejectVerVel()
   {
      return reject_ver_vel_;
   }

   /**
            * 2 - true if horizontal position observations have been rejected
            */
   public void setRejectHorPos(boolean reject_hor_pos)
   {
      reject_hor_pos_ = reject_hor_pos;
   }
   /**
            * 2 - true if horizontal position observations have been rejected
            */
   public boolean getRejectHorPos()
   {
      return reject_hor_pos_;
   }

   /**
            * 3 - true if vertical position observations have been rejected
            */
   public void setRejectVerPos(boolean reject_ver_pos)
   {
      reject_ver_pos_ = reject_ver_pos;
   }
   /**
            * 3 - true if vertical position observations have been rejected
            */
   public boolean getRejectVerPos()
   {
      return reject_ver_pos_;
   }

   /**
            * 7 - true if the yaw observation has been rejected
            */
   public void setRejectYaw(boolean reject_yaw)
   {
      reject_yaw_ = reject_yaw;
   }
   /**
            * 7 - true if the yaw observation has been rejected
            */
   public boolean getRejectYaw()
   {
      return reject_yaw_;
   }

   /**
            * 8 - true if the airspeed observation has been rejected
            */
   public void setRejectAirspeed(boolean reject_airspeed)
   {
      reject_airspeed_ = reject_airspeed;
   }
   /**
            * 8 - true if the airspeed observation has been rejected
            */
   public boolean getRejectAirspeed()
   {
      return reject_airspeed_;
   }

   /**
            * 9 - true if the synthetic sideslip observation has been rejected
            */
   public void setRejectSideslip(boolean reject_sideslip)
   {
      reject_sideslip_ = reject_sideslip;
   }
   /**
            * 9 - true if the synthetic sideslip observation has been rejected
            */
   public boolean getRejectSideslip()
   {
      return reject_sideslip_;
   }

   /**
            * 10 - true if the height above ground observation has been rejected
            */
   public void setRejectHagl(boolean reject_hagl)
   {
      reject_hagl_ = reject_hagl;
   }
   /**
            * 10 - true if the height above ground observation has been rejected
            */
   public boolean getRejectHagl()
   {
      return reject_hagl_;
   }

   /**
            * 11 - true if the X optical flow observation has been rejected
            */
   public void setRejectOptflowX(boolean reject_optflow_x)
   {
      reject_optflow_x_ = reject_optflow_x;
   }
   /**
            * 11 - true if the X optical flow observation has been rejected
            */
   public boolean getRejectOptflowX()
   {
      return reject_optflow_x_;
   }

   /**
            * 12 - true if the Y optical flow observation has been rejected
            */
   public void setRejectOptflowY(boolean reject_optflow_y)
   {
      reject_optflow_y_ = reject_optflow_y;
   }
   /**
            * 12 - true if the Y optical flow observation has been rejected
            */
   public boolean getRejectOptflowY()
   {
      return reject_optflow_y_;
   }


   public static Supplier<EstimatorStatusFlagsPubSubType> getPubSubType()
   {
      return EstimatorStatusFlagsPubSubType::new;
   }

   @Override
   public Supplier<TopicDataType> getPubSubTypePacket()
   {
      return EstimatorStatusFlagsPubSubType::new;
   }

   @Override
   public boolean epsilonEquals(EstimatorStatusFlags other, double epsilon)
   {
      if(other == null) return false;
      if(other == this) return true;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_, other.timestamp_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_sample_, other.timestamp_sample_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.control_status_changes_, other.control_status_changes_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.cs_tilt_align_, other.cs_tilt_align_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.cs_yaw_align_, other.cs_yaw_align_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.cs_gps_, other.cs_gps_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.cs_opt_flow_, other.cs_opt_flow_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.cs_mag_hdg_, other.cs_mag_hdg_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.cs_mag_3d_, other.cs_mag_3d_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.cs_mag_dec_, other.cs_mag_dec_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.cs_in_air_, other.cs_in_air_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.cs_wind_, other.cs_wind_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.cs_baro_hgt_, other.cs_baro_hgt_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.cs_rng_hgt_, other.cs_rng_hgt_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.cs_gps_hgt_, other.cs_gps_hgt_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.cs_ev_pos_, other.cs_ev_pos_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.cs_ev_yaw_, other.cs_ev_yaw_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.cs_ev_hgt_, other.cs_ev_hgt_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.cs_fuse_beta_, other.cs_fuse_beta_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.cs_mag_field_disturbed_, other.cs_mag_field_disturbed_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.cs_fixed_wing_, other.cs_fixed_wing_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.cs_mag_fault_, other.cs_mag_fault_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.cs_fuse_aspd_, other.cs_fuse_aspd_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.cs_gnd_effect_, other.cs_gnd_effect_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.cs_rng_stuck_, other.cs_rng_stuck_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.cs_gnss_yaw_, other.cs_gnss_yaw_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.cs_mag_aligned_in_flight_, other.cs_mag_aligned_in_flight_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.cs_ev_vel_, other.cs_ev_vel_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.cs_synthetic_mag_z_, other.cs_synthetic_mag_z_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.cs_vehicle_at_rest_, other.cs_vehicle_at_rest_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.cs_gnss_yaw_fault_, other.cs_gnss_yaw_fault_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.cs_rng_fault_, other.cs_rng_fault_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.cs_inertial_dead_reckoning_, other.cs_inertial_dead_reckoning_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.cs_wind_dead_reckoning_, other.cs_wind_dead_reckoning_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.cs_rng_kin_consistent_, other.cs_rng_kin_consistent_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.cs_fake_pos_, other.cs_fake_pos_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.cs_fake_hgt_, other.cs_fake_hgt_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.cs_gravity_vector_, other.cs_gravity_vector_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.cs_mag_, other.cs_mag_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.cs_ev_yaw_fault_, other.cs_ev_yaw_fault_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.cs_mag_heading_consistent_, other.cs_mag_heading_consistent_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.cs_aux_gpos_, other.cs_aux_gpos_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.cs_rng_terrain_, other.cs_rng_terrain_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.cs_opt_flow_terrain_, other.cs_opt_flow_terrain_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.cs_valid_fake_pos_, other.cs_valid_fake_pos_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.cs_constant_pos_, other.cs_constant_pos_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.fault_status_changes_, other.fault_status_changes_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.fs_bad_mag_x_, other.fs_bad_mag_x_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.fs_bad_mag_y_, other.fs_bad_mag_y_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.fs_bad_mag_z_, other.fs_bad_mag_z_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.fs_bad_hdg_, other.fs_bad_hdg_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.fs_bad_mag_decl_, other.fs_bad_mag_decl_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.fs_bad_airspeed_, other.fs_bad_airspeed_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.fs_bad_sideslip_, other.fs_bad_sideslip_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.fs_bad_optflow_x_, other.fs_bad_optflow_x_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.fs_bad_optflow_y_, other.fs_bad_optflow_y_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.fs_bad_acc_vertical_, other.fs_bad_acc_vertical_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.fs_bad_acc_clipping_, other.fs_bad_acc_clipping_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.innovation_fault_status_changes_, other.innovation_fault_status_changes_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.reject_hor_vel_, other.reject_hor_vel_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.reject_ver_vel_, other.reject_ver_vel_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.reject_hor_pos_, other.reject_hor_pos_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.reject_ver_pos_, other.reject_ver_pos_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.reject_yaw_, other.reject_yaw_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.reject_airspeed_, other.reject_airspeed_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.reject_sideslip_, other.reject_sideslip_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.reject_hagl_, other.reject_hagl_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.reject_optflow_x_, other.reject_optflow_x_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.reject_optflow_y_, other.reject_optflow_y_, epsilon)) return false;


      return true;
   }

   @Override
   public boolean equals(Object other)
   {
      if(other == null) return false;
      if(other == this) return true;
      if(!(other instanceof EstimatorStatusFlags)) return false;

      EstimatorStatusFlags otherMyClass = (EstimatorStatusFlags) other;

      if(this.timestamp_ != otherMyClass.timestamp_) return false;

      if(this.timestamp_sample_ != otherMyClass.timestamp_sample_) return false;

      if(this.control_status_changes_ != otherMyClass.control_status_changes_) return false;

      if(this.cs_tilt_align_ != otherMyClass.cs_tilt_align_) return false;

      if(this.cs_yaw_align_ != otherMyClass.cs_yaw_align_) return false;

      if(this.cs_gps_ != otherMyClass.cs_gps_) return false;

      if(this.cs_opt_flow_ != otherMyClass.cs_opt_flow_) return false;

      if(this.cs_mag_hdg_ != otherMyClass.cs_mag_hdg_) return false;

      if(this.cs_mag_3d_ != otherMyClass.cs_mag_3d_) return false;

      if(this.cs_mag_dec_ != otherMyClass.cs_mag_dec_) return false;

      if(this.cs_in_air_ != otherMyClass.cs_in_air_) return false;

      if(this.cs_wind_ != otherMyClass.cs_wind_) return false;

      if(this.cs_baro_hgt_ != otherMyClass.cs_baro_hgt_) return false;

      if(this.cs_rng_hgt_ != otherMyClass.cs_rng_hgt_) return false;

      if(this.cs_gps_hgt_ != otherMyClass.cs_gps_hgt_) return false;

      if(this.cs_ev_pos_ != otherMyClass.cs_ev_pos_) return false;

      if(this.cs_ev_yaw_ != otherMyClass.cs_ev_yaw_) return false;

      if(this.cs_ev_hgt_ != otherMyClass.cs_ev_hgt_) return false;

      if(this.cs_fuse_beta_ != otherMyClass.cs_fuse_beta_) return false;

      if(this.cs_mag_field_disturbed_ != otherMyClass.cs_mag_field_disturbed_) return false;

      if(this.cs_fixed_wing_ != otherMyClass.cs_fixed_wing_) return false;

      if(this.cs_mag_fault_ != otherMyClass.cs_mag_fault_) return false;

      if(this.cs_fuse_aspd_ != otherMyClass.cs_fuse_aspd_) return false;

      if(this.cs_gnd_effect_ != otherMyClass.cs_gnd_effect_) return false;

      if(this.cs_rng_stuck_ != otherMyClass.cs_rng_stuck_) return false;

      if(this.cs_gnss_yaw_ != otherMyClass.cs_gnss_yaw_) return false;

      if(this.cs_mag_aligned_in_flight_ != otherMyClass.cs_mag_aligned_in_flight_) return false;

      if(this.cs_ev_vel_ != otherMyClass.cs_ev_vel_) return false;

      if(this.cs_synthetic_mag_z_ != otherMyClass.cs_synthetic_mag_z_) return false;

      if(this.cs_vehicle_at_rest_ != otherMyClass.cs_vehicle_at_rest_) return false;

      if(this.cs_gnss_yaw_fault_ != otherMyClass.cs_gnss_yaw_fault_) return false;

      if(this.cs_rng_fault_ != otherMyClass.cs_rng_fault_) return false;

      if(this.cs_inertial_dead_reckoning_ != otherMyClass.cs_inertial_dead_reckoning_) return false;

      if(this.cs_wind_dead_reckoning_ != otherMyClass.cs_wind_dead_reckoning_) return false;

      if(this.cs_rng_kin_consistent_ != otherMyClass.cs_rng_kin_consistent_) return false;

      if(this.cs_fake_pos_ != otherMyClass.cs_fake_pos_) return false;

      if(this.cs_fake_hgt_ != otherMyClass.cs_fake_hgt_) return false;

      if(this.cs_gravity_vector_ != otherMyClass.cs_gravity_vector_) return false;

      if(this.cs_mag_ != otherMyClass.cs_mag_) return false;

      if(this.cs_ev_yaw_fault_ != otherMyClass.cs_ev_yaw_fault_) return false;

      if(this.cs_mag_heading_consistent_ != otherMyClass.cs_mag_heading_consistent_) return false;

      if(this.cs_aux_gpos_ != otherMyClass.cs_aux_gpos_) return false;

      if(this.cs_rng_terrain_ != otherMyClass.cs_rng_terrain_) return false;

      if(this.cs_opt_flow_terrain_ != otherMyClass.cs_opt_flow_terrain_) return false;

      if(this.cs_valid_fake_pos_ != otherMyClass.cs_valid_fake_pos_) return false;

      if(this.cs_constant_pos_ != otherMyClass.cs_constant_pos_) return false;

      if(this.fault_status_changes_ != otherMyClass.fault_status_changes_) return false;

      if(this.fs_bad_mag_x_ != otherMyClass.fs_bad_mag_x_) return false;

      if(this.fs_bad_mag_y_ != otherMyClass.fs_bad_mag_y_) return false;

      if(this.fs_bad_mag_z_ != otherMyClass.fs_bad_mag_z_) return false;

      if(this.fs_bad_hdg_ != otherMyClass.fs_bad_hdg_) return false;

      if(this.fs_bad_mag_decl_ != otherMyClass.fs_bad_mag_decl_) return false;

      if(this.fs_bad_airspeed_ != otherMyClass.fs_bad_airspeed_) return false;

      if(this.fs_bad_sideslip_ != otherMyClass.fs_bad_sideslip_) return false;

      if(this.fs_bad_optflow_x_ != otherMyClass.fs_bad_optflow_x_) return false;

      if(this.fs_bad_optflow_y_ != otherMyClass.fs_bad_optflow_y_) return false;

      if(this.fs_bad_acc_vertical_ != otherMyClass.fs_bad_acc_vertical_) return false;

      if(this.fs_bad_acc_clipping_ != otherMyClass.fs_bad_acc_clipping_) return false;

      if(this.innovation_fault_status_changes_ != otherMyClass.innovation_fault_status_changes_) return false;

      if(this.reject_hor_vel_ != otherMyClass.reject_hor_vel_) return false;

      if(this.reject_ver_vel_ != otherMyClass.reject_ver_vel_) return false;

      if(this.reject_hor_pos_ != otherMyClass.reject_hor_pos_) return false;

      if(this.reject_ver_pos_ != otherMyClass.reject_ver_pos_) return false;

      if(this.reject_yaw_ != otherMyClass.reject_yaw_) return false;

      if(this.reject_airspeed_ != otherMyClass.reject_airspeed_) return false;

      if(this.reject_sideslip_ != otherMyClass.reject_sideslip_) return false;

      if(this.reject_hagl_ != otherMyClass.reject_hagl_) return false;

      if(this.reject_optflow_x_ != otherMyClass.reject_optflow_x_) return false;

      if(this.reject_optflow_y_ != otherMyClass.reject_optflow_y_) return false;


      return true;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("EstimatorStatusFlags {");
      builder.append("timestamp=");
      builder.append(this.timestamp_);      builder.append(", ");
      builder.append("timestamp_sample=");
      builder.append(this.timestamp_sample_);      builder.append(", ");
      builder.append("control_status_changes=");
      builder.append(this.control_status_changes_);      builder.append(", ");
      builder.append("cs_tilt_align=");
      builder.append(this.cs_tilt_align_);      builder.append(", ");
      builder.append("cs_yaw_align=");
      builder.append(this.cs_yaw_align_);      builder.append(", ");
      builder.append("cs_gps=");
      builder.append(this.cs_gps_);      builder.append(", ");
      builder.append("cs_opt_flow=");
      builder.append(this.cs_opt_flow_);      builder.append(", ");
      builder.append("cs_mag_hdg=");
      builder.append(this.cs_mag_hdg_);      builder.append(", ");
      builder.append("cs_mag_3d=");
      builder.append(this.cs_mag_3d_);      builder.append(", ");
      builder.append("cs_mag_dec=");
      builder.append(this.cs_mag_dec_);      builder.append(", ");
      builder.append("cs_in_air=");
      builder.append(this.cs_in_air_);      builder.append(", ");
      builder.append("cs_wind=");
      builder.append(this.cs_wind_);      builder.append(", ");
      builder.append("cs_baro_hgt=");
      builder.append(this.cs_baro_hgt_);      builder.append(", ");
      builder.append("cs_rng_hgt=");
      builder.append(this.cs_rng_hgt_);      builder.append(", ");
      builder.append("cs_gps_hgt=");
      builder.append(this.cs_gps_hgt_);      builder.append(", ");
      builder.append("cs_ev_pos=");
      builder.append(this.cs_ev_pos_);      builder.append(", ");
      builder.append("cs_ev_yaw=");
      builder.append(this.cs_ev_yaw_);      builder.append(", ");
      builder.append("cs_ev_hgt=");
      builder.append(this.cs_ev_hgt_);      builder.append(", ");
      builder.append("cs_fuse_beta=");
      builder.append(this.cs_fuse_beta_);      builder.append(", ");
      builder.append("cs_mag_field_disturbed=");
      builder.append(this.cs_mag_field_disturbed_);      builder.append(", ");
      builder.append("cs_fixed_wing=");
      builder.append(this.cs_fixed_wing_);      builder.append(", ");
      builder.append("cs_mag_fault=");
      builder.append(this.cs_mag_fault_);      builder.append(", ");
      builder.append("cs_fuse_aspd=");
      builder.append(this.cs_fuse_aspd_);      builder.append(", ");
      builder.append("cs_gnd_effect=");
      builder.append(this.cs_gnd_effect_);      builder.append(", ");
      builder.append("cs_rng_stuck=");
      builder.append(this.cs_rng_stuck_);      builder.append(", ");
      builder.append("cs_gnss_yaw=");
      builder.append(this.cs_gnss_yaw_);      builder.append(", ");
      builder.append("cs_mag_aligned_in_flight=");
      builder.append(this.cs_mag_aligned_in_flight_);      builder.append(", ");
      builder.append("cs_ev_vel=");
      builder.append(this.cs_ev_vel_);      builder.append(", ");
      builder.append("cs_synthetic_mag_z=");
      builder.append(this.cs_synthetic_mag_z_);      builder.append(", ");
      builder.append("cs_vehicle_at_rest=");
      builder.append(this.cs_vehicle_at_rest_);      builder.append(", ");
      builder.append("cs_gnss_yaw_fault=");
      builder.append(this.cs_gnss_yaw_fault_);      builder.append(", ");
      builder.append("cs_rng_fault=");
      builder.append(this.cs_rng_fault_);      builder.append(", ");
      builder.append("cs_inertial_dead_reckoning=");
      builder.append(this.cs_inertial_dead_reckoning_);      builder.append(", ");
      builder.append("cs_wind_dead_reckoning=");
      builder.append(this.cs_wind_dead_reckoning_);      builder.append(", ");
      builder.append("cs_rng_kin_consistent=");
      builder.append(this.cs_rng_kin_consistent_);      builder.append(", ");
      builder.append("cs_fake_pos=");
      builder.append(this.cs_fake_pos_);      builder.append(", ");
      builder.append("cs_fake_hgt=");
      builder.append(this.cs_fake_hgt_);      builder.append(", ");
      builder.append("cs_gravity_vector=");
      builder.append(this.cs_gravity_vector_);      builder.append(", ");
      builder.append("cs_mag=");
      builder.append(this.cs_mag_);      builder.append(", ");
      builder.append("cs_ev_yaw_fault=");
      builder.append(this.cs_ev_yaw_fault_);      builder.append(", ");
      builder.append("cs_mag_heading_consistent=");
      builder.append(this.cs_mag_heading_consistent_);      builder.append(", ");
      builder.append("cs_aux_gpos=");
      builder.append(this.cs_aux_gpos_);      builder.append(", ");
      builder.append("cs_rng_terrain=");
      builder.append(this.cs_rng_terrain_);      builder.append(", ");
      builder.append("cs_opt_flow_terrain=");
      builder.append(this.cs_opt_flow_terrain_);      builder.append(", ");
      builder.append("cs_valid_fake_pos=");
      builder.append(this.cs_valid_fake_pos_);      builder.append(", ");
      builder.append("cs_constant_pos=");
      builder.append(this.cs_constant_pos_);      builder.append(", ");
      builder.append("fault_status_changes=");
      builder.append(this.fault_status_changes_);      builder.append(", ");
      builder.append("fs_bad_mag_x=");
      builder.append(this.fs_bad_mag_x_);      builder.append(", ");
      builder.append("fs_bad_mag_y=");
      builder.append(this.fs_bad_mag_y_);      builder.append(", ");
      builder.append("fs_bad_mag_z=");
      builder.append(this.fs_bad_mag_z_);      builder.append(", ");
      builder.append("fs_bad_hdg=");
      builder.append(this.fs_bad_hdg_);      builder.append(", ");
      builder.append("fs_bad_mag_decl=");
      builder.append(this.fs_bad_mag_decl_);      builder.append(", ");
      builder.append("fs_bad_airspeed=");
      builder.append(this.fs_bad_airspeed_);      builder.append(", ");
      builder.append("fs_bad_sideslip=");
      builder.append(this.fs_bad_sideslip_);      builder.append(", ");
      builder.append("fs_bad_optflow_x=");
      builder.append(this.fs_bad_optflow_x_);      builder.append(", ");
      builder.append("fs_bad_optflow_y=");
      builder.append(this.fs_bad_optflow_y_);      builder.append(", ");
      builder.append("fs_bad_acc_vertical=");
      builder.append(this.fs_bad_acc_vertical_);      builder.append(", ");
      builder.append("fs_bad_acc_clipping=");
      builder.append(this.fs_bad_acc_clipping_);      builder.append(", ");
      builder.append("innovation_fault_status_changes=");
      builder.append(this.innovation_fault_status_changes_);      builder.append(", ");
      builder.append("reject_hor_vel=");
      builder.append(this.reject_hor_vel_);      builder.append(", ");
      builder.append("reject_ver_vel=");
      builder.append(this.reject_ver_vel_);      builder.append(", ");
      builder.append("reject_hor_pos=");
      builder.append(this.reject_hor_pos_);      builder.append(", ");
      builder.append("reject_ver_pos=");
      builder.append(this.reject_ver_pos_);      builder.append(", ");
      builder.append("reject_yaw=");
      builder.append(this.reject_yaw_);      builder.append(", ");
      builder.append("reject_airspeed=");
      builder.append(this.reject_airspeed_);      builder.append(", ");
      builder.append("reject_sideslip=");
      builder.append(this.reject_sideslip_);      builder.append(", ");
      builder.append("reject_hagl=");
      builder.append(this.reject_hagl_);      builder.append(", ");
      builder.append("reject_optflow_x=");
      builder.append(this.reject_optflow_x_);      builder.append(", ");
      builder.append("reject_optflow_y=");
      builder.append(this.reject_optflow_y_);
      builder.append("}");
      return builder.toString();
   }
}
