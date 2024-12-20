package px4_msgs.msg.dds;

import us.ihmc.communication.packets.Packet;
import us.ihmc.euclid.interfaces.Settable;
import us.ihmc.euclid.interfaces.EpsilonComparable;
import java.util.function.Supplier;
import us.ihmc.pubsub.TopicDataType;

/**
       * 0 - true if the fusion of the magnetometer X-axis has encountered a numerical error
       * 1 - true if the fusion of the magnetometer Y-axis has encountered a numerical error
       * 2 - true if the fusion of the magnetometer Z-axis has encountered a numerical error
       * 3 - true if the fusion of the magnetic heading has encountered a numerical error
       * 4 - true if the fusion of the magnetic declination has encountered a numerical error
       * 5 - true if fusion of the airspeed has encountered a numerical error
       * 6 - true if fusion of the synthetic sideslip constraint has encountered a numerical error
       * 7 - true if fusion of the optical flow X axis has encountered a numerical error
       * 8 - true if fusion of the optical flow Y axis has encountered a numerical error
       * 9 - true if fusion of the North velocity has encountered a numerical error
       * 10 - true if fusion of the East velocity has encountered a numerical error
       * 11 - true if fusion of the Down velocity has encountered a numerical error
       * 12 - true if fusion of the North position has encountered a numerical error
       * 13 - true if fusion of the East position has encountered a numerical error
       * 14 - true if fusion of the Down position has encountered a numerical error
       * 15 - true if bad delta velocity bias estimates have been detected
       * 16 - true if bad vertical accelerometer data has been detected
       * 17 - true if delta velocity data contains clipping (asymmetric railing)
       * 0 - True if the attitude estimate is good
       * 1 - True if the horizontal velocity estimate is good
       * 2 - True if the vertical velocity estimate is good
       * 3 - True if the horizontal position (relative) estimate is good
       * 4 - True if the horizontal position (absolute) estimate is good
       * 5 - True if the vertical position (absolute) estimate is good
       * 6 - True if the vertical position (above ground) estimate is good
       * 7 - True if the EKF is in a constant position mode and is not using external measurements (eg GPS or optical flow)
       * 8 - True if the EKF has sufficient data to enter a mode that will provide a (relative) position estimate
       * 9 - True if the EKF has sufficient data to enter a mode that will provide a (absolute) position estimate
       * 10 - True if the EKF has detected a GPS glitch
       * 11 - True if the EKF has detected bad accelerometer data
       */
public class EstimatorStatus extends Packet<EstimatorStatus> implements Settable<EstimatorStatus>, EpsilonComparable<EstimatorStatus>
{
   /**
          * bits are true when corresponding test has failed
          * 0 : insufficient fix type (no 3D solution)
          */
   public static final byte GPS_CHECK_FAIL_GPS_FIX = (byte) 0;
   /**
          * 1 : minimum required sat count fail
          */
   public static final byte GPS_CHECK_FAIL_MIN_SAT_COUNT = (byte) 1;
   /**
          * 2 : maximum allowed PDOP fail
          */
   public static final byte GPS_CHECK_FAIL_MAX_PDOP = (byte) 2;
   /**
          * 3 : maximum allowed horizontal position error fail
          */
   public static final byte GPS_CHECK_FAIL_MAX_HORZ_ERR = (byte) 3;
   /**
          * 4 : maximum allowed vertical position error fail
          */
   public static final byte GPS_CHECK_FAIL_MAX_VERT_ERR = (byte) 4;
   /**
          * 5 : maximum allowed speed error fail
          */
   public static final byte GPS_CHECK_FAIL_MAX_SPD_ERR = (byte) 5;
   /**
          * 6 : maximum allowed horizontal position drift fail - requires stationary vehicle
          */
   public static final byte GPS_CHECK_FAIL_MAX_HORZ_DRIFT = (byte) 6;
   /**
          * 7 : maximum allowed vertical position drift fail - requires stationary vehicle
          */
   public static final byte GPS_CHECK_FAIL_MAX_VERT_DRIFT = (byte) 7;
   /**
          * 8 : maximum allowed horizontal speed fail - requires stationary vehicle
          */
   public static final byte GPS_CHECK_FAIL_MAX_HORZ_SPD_ERR = (byte) 8;
   /**
          * 9 : maximum allowed vertical velocity discrepancy fail
          */
   public static final byte GPS_CHECK_FAIL_MAX_VERT_SPD_ERR = (byte) 9;
   /**
          * 10 : GPS signal is spoofed
          */
   public static final byte GPS_CHECK_FAIL_SPOOFED = (byte) 10;
   /**
          * 0 - true if the filter tilt alignment is complete
          */
   public static final byte CS_TILT_ALIGN = (byte) 0;
   /**
          * 1 - true if the filter yaw alignment is complete
          */
   public static final byte CS_YAW_ALIGN = (byte) 1;
   /**
          * 2 - true if GPS measurements are being fused
          */
   public static final byte CS_GPS = (byte) 2;
   /**
          * 3 - true if optical flow measurements are being fused
          */
   public static final byte CS_OPT_FLOW = (byte) 3;
   /**
          * 4 - true if a simple magnetic yaw heading is being fused
          */
   public static final byte CS_MAG_HDG = (byte) 4;
   /**
          * 5 - true if 3-axis magnetometer measurement are being fused
          */
   public static final byte CS_MAG_3D = (byte) 5;
   /**
          * 6 - true if synthetic magnetic declination measurements are being fused
          */
   public static final byte CS_MAG_DEC = (byte) 6;
   /**
          * 7 - true when thought to be airborne
          */
   public static final byte CS_IN_AIR = (byte) 7;
   /**
          * 8 - true when wind velocity is being estimated
          */
   public static final byte CS_WIND = (byte) 8;
   /**
          * 9 - true when baro height is being fused as a primary height reference
          */
   public static final byte CS_BARO_HGT = (byte) 9;
   /**
          * 10 - true when range finder height is being fused as a primary height reference
          */
   public static final byte CS_RNG_HGT = (byte) 10;
   /**
          * 11 - true when GPS height is being fused as a primary height reference
          */
   public static final byte CS_GPS_HGT = (byte) 11;
   /**
          * 12 - true when local position data from external vision is being fused
          */
   public static final byte CS_EV_POS = (byte) 12;
   /**
          * 13 - true when yaw data from external vision measurements is being fused
          */
   public static final byte CS_EV_YAW = (byte) 13;
   /**
          * 14 - true when height data from external vision measurements is being fused
          */
   public static final byte CS_EV_HGT = (byte) 14;
   /**
          * 15 - true when synthetic sideslip measurements are being fused
          */
   public static final byte CS_BETA = (byte) 15;
   /**
          * 16 - true when only the magnetic field states are updated by the magnetometer
          */
   public static final byte CS_MAG_FIELD = (byte) 16;
   /**
          * 17 - true when thought to be operating as a fixed wing vehicle with constrained sideslip
          */
   public static final byte CS_FIXED_WING = (byte) 17;
   /**
          * 18 - true when the magnetometer has been declared faulty and is no longer being used
          */
   public static final byte CS_MAG_FAULT = (byte) 18;
   /**
          * 19 - true when airspeed measurements are being fused
          */
   public static final byte CS_ASPD = (byte) 19;
   /**
          * 20 - true when when protection from ground effect induced static pressure rise is active
          */
   public static final byte CS_GND_EFFECT = (byte) 20;
   /**
          * 21 - true when a stuck range finder sensor has been detected
          */
   public static final byte CS_RNG_STUCK = (byte) 21;
   /**
          * 22 - true when yaw (not ground course) data from a GPS receiver is being fused
          */
   public static final byte CS_GPS_YAW = (byte) 22;
   /**
          * 23 - true when the in-flight mag field alignment has been completed
          */
   public static final byte CS_MAG_ALIGNED = (byte) 23;
   /**
          * 24 - true when local frame velocity data fusion from external vision measurements is intended
          */
   public static final byte CS_EV_VEL = (byte) 24;
   /**
          * 25 - true when we are using a synthesized measurement for the magnetometer Z component
          */
   public static final byte CS_SYNTHETIC_MAG_Z = (byte) 25;
   /**
          * 26 - true when the vehicle is at rest
          */
   public static final byte CS_VEHICLE_AT_REST = (byte) 26;
   /**
          * 27 - true when the GNSS heading has been declared faulty and is no longer being used
          */
   public static final byte CS_GPS_YAW_FAULT = (byte) 27;
   /**
          * 28 - true when the range finder has been declared faulty and is no longer being used
          */
   public static final byte CS_RNG_FAULT = (byte) 28;
   /**
            * time since system start (microseconds)
            */
   public long timestamp_;
   /**
            * the timestamp of the raw data (microseconds)
            */
   public long timestamp_sample_;
   /**
            * return a vector containing the output predictor angular, velocity and position tracking error magnitudes (rad), (m/s), (m)
            */
   public float[] output_tracking_error_;
   /**
            * Bitmask to indicate status of GPS checks - see definition below
            */
   public int gps_check_fail_flags_;
   /**
            * Bitmask to indicate EKF logic state
            */
   public long control_mode_flags_;
   /**
            * Bitmask to indicate EKF internal faults
            */
   public long filter_fault_flags_;
   /**
            * 1-Sigma estimated horizontal position accuracy relative to the estimators origin (m)
            */
   public float pos_horiz_accuracy_;
   /**
            * 1-Sigma estimated vertical position accuracy relative to the estimators origin (m)
            */
   public float pos_vert_accuracy_;
   /**
            * low-pass filtered ratio of the largest heading innovation component to the innovation test limit
            */
   public float hdg_test_ratio_;
   /**
            * low-pass filtered ratio of the largest velocity innovation component to the innovation test limit
            */
   public float vel_test_ratio_;
   /**
            * low-pass filtered ratio of the largest horizontal position innovation component to the innovation test limit
            */
   public float pos_test_ratio_;
   /**
            * low-pass filtered ratio of the vertical position innovation to the innovation test limit
            */
   public float hgt_test_ratio_;
   /**
            * low-pass filtered ratio of the true airspeed innovation to the innovation test limit
            */
   public float tas_test_ratio_;
   /**
            * low-pass filtered ratio of the height above ground innovation to the innovation test limit
            */
   public float hagl_test_ratio_;
   /**
            * low-pass filtered ratio of the synthetic sideslip innovation to the innovation test limit
            */
   public float beta_test_ratio_;
   /**
            * Bitmask indicating which filter kinematic state outputs are valid for flight control use.
            */
   public int solution_status_flags_;
   /**
            * number of horizontal position reset events (allow to wrap if count exceeds 255)
            */
   public byte reset_count_vel_ne_;
   /**
            * number of vertical velocity reset events (allow to wrap if count exceeds 255)
            */
   public byte reset_count_vel_d_;
   /**
            * number of horizontal position reset events (allow to wrap if count exceeds 255)
            */
   public byte reset_count_pos_ne_;
   /**
            * number of vertical position reset events (allow to wrap if count exceeds 255)
            */
   public byte reset_count_pod_d_;
   /**
            * number of quaternion reset events (allow to wrap if count exceeds 255)
            */
   public byte reset_count_quat_;
   /**
            * cumulative amount of time in seconds that the EKF inertial calculation has slipped relative to system time
            */
   public float time_slip_;
   public boolean pre_flt_fail_innov_heading_;
   public boolean pre_flt_fail_innov_height_;
   public boolean pre_flt_fail_innov_pos_horiz_;
   public boolean pre_flt_fail_innov_vel_horiz_;
   public boolean pre_flt_fail_innov_vel_vert_;
   public boolean pre_flt_fail_mag_field_disturbed_;
   public long accel_device_id_;
   public long gyro_device_id_;
   public long baro_device_id_;
   public long mag_device_id_;
   /**
            * legacy local position estimator (LPE) flags
            * Bitmask to indicate sensor health states (vel, pos, hgt)
            */
   public byte health_flags_;
   /**
            * Bitmask to indicate timeout flags (vel, pos, hgt)
            */
   public byte timeout_flags_;
   public float mag_inclination_deg_;
   public float mag_inclination_ref_deg_;
   public float mag_strength_gs_;
   public float mag_strength_ref_gs_;

   public EstimatorStatus()
   {
      output_tracking_error_ = new float[3];

   }

   public EstimatorStatus(EstimatorStatus other)
   {
      this();
      set(other);
   }

   public void set(EstimatorStatus other)
   {
      timestamp_ = other.timestamp_;

      timestamp_sample_ = other.timestamp_sample_;

      for(int i1 = 0; i1 < output_tracking_error_.length; ++i1)
      {
            output_tracking_error_[i1] = other.output_tracking_error_[i1];

      }

      gps_check_fail_flags_ = other.gps_check_fail_flags_;

      control_mode_flags_ = other.control_mode_flags_;

      filter_fault_flags_ = other.filter_fault_flags_;

      pos_horiz_accuracy_ = other.pos_horiz_accuracy_;

      pos_vert_accuracy_ = other.pos_vert_accuracy_;

      hdg_test_ratio_ = other.hdg_test_ratio_;

      vel_test_ratio_ = other.vel_test_ratio_;

      pos_test_ratio_ = other.pos_test_ratio_;

      hgt_test_ratio_ = other.hgt_test_ratio_;

      tas_test_ratio_ = other.tas_test_ratio_;

      hagl_test_ratio_ = other.hagl_test_ratio_;

      beta_test_ratio_ = other.beta_test_ratio_;

      solution_status_flags_ = other.solution_status_flags_;

      reset_count_vel_ne_ = other.reset_count_vel_ne_;

      reset_count_vel_d_ = other.reset_count_vel_d_;

      reset_count_pos_ne_ = other.reset_count_pos_ne_;

      reset_count_pod_d_ = other.reset_count_pod_d_;

      reset_count_quat_ = other.reset_count_quat_;

      time_slip_ = other.time_slip_;

      pre_flt_fail_innov_heading_ = other.pre_flt_fail_innov_heading_;

      pre_flt_fail_innov_height_ = other.pre_flt_fail_innov_height_;

      pre_flt_fail_innov_pos_horiz_ = other.pre_flt_fail_innov_pos_horiz_;

      pre_flt_fail_innov_vel_horiz_ = other.pre_flt_fail_innov_vel_horiz_;

      pre_flt_fail_innov_vel_vert_ = other.pre_flt_fail_innov_vel_vert_;

      pre_flt_fail_mag_field_disturbed_ = other.pre_flt_fail_mag_field_disturbed_;

      accel_device_id_ = other.accel_device_id_;

      gyro_device_id_ = other.gyro_device_id_;

      baro_device_id_ = other.baro_device_id_;

      mag_device_id_ = other.mag_device_id_;

      health_flags_ = other.health_flags_;

      timeout_flags_ = other.timeout_flags_;

      mag_inclination_deg_ = other.mag_inclination_deg_;

      mag_inclination_ref_deg_ = other.mag_inclination_ref_deg_;

      mag_strength_gs_ = other.mag_strength_gs_;

      mag_strength_ref_gs_ = other.mag_strength_ref_gs_;

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
            * return a vector containing the output predictor angular, velocity and position tracking error magnitudes (rad), (m/s), (m)
            */
   public float[] getOutputTrackingError()
   {
      return output_tracking_error_;
   }

   /**
            * Bitmask to indicate status of GPS checks - see definition below
            */
   public void setGpsCheckFailFlags(int gps_check_fail_flags)
   {
      gps_check_fail_flags_ = gps_check_fail_flags;
   }
   /**
            * Bitmask to indicate status of GPS checks - see definition below
            */
   public int getGpsCheckFailFlags()
   {
      return gps_check_fail_flags_;
   }

   /**
            * Bitmask to indicate EKF logic state
            */
   public void setControlModeFlags(long control_mode_flags)
   {
      control_mode_flags_ = control_mode_flags;
   }
   /**
            * Bitmask to indicate EKF logic state
            */
   public long getControlModeFlags()
   {
      return control_mode_flags_;
   }

   /**
            * Bitmask to indicate EKF internal faults
            */
   public void setFilterFaultFlags(long filter_fault_flags)
   {
      filter_fault_flags_ = filter_fault_flags;
   }
   /**
            * Bitmask to indicate EKF internal faults
            */
   public long getFilterFaultFlags()
   {
      return filter_fault_flags_;
   }

   /**
            * 1-Sigma estimated horizontal position accuracy relative to the estimators origin (m)
            */
   public void setPosHorizAccuracy(float pos_horiz_accuracy)
   {
      pos_horiz_accuracy_ = pos_horiz_accuracy;
   }
   /**
            * 1-Sigma estimated horizontal position accuracy relative to the estimators origin (m)
            */
   public float getPosHorizAccuracy()
   {
      return pos_horiz_accuracy_;
   }

   /**
            * 1-Sigma estimated vertical position accuracy relative to the estimators origin (m)
            */
   public void setPosVertAccuracy(float pos_vert_accuracy)
   {
      pos_vert_accuracy_ = pos_vert_accuracy;
   }
   /**
            * 1-Sigma estimated vertical position accuracy relative to the estimators origin (m)
            */
   public float getPosVertAccuracy()
   {
      return pos_vert_accuracy_;
   }

   /**
            * low-pass filtered ratio of the largest heading innovation component to the innovation test limit
            */
   public void setHdgTestRatio(float hdg_test_ratio)
   {
      hdg_test_ratio_ = hdg_test_ratio;
   }
   /**
            * low-pass filtered ratio of the largest heading innovation component to the innovation test limit
            */
   public float getHdgTestRatio()
   {
      return hdg_test_ratio_;
   }

   /**
            * low-pass filtered ratio of the largest velocity innovation component to the innovation test limit
            */
   public void setVelTestRatio(float vel_test_ratio)
   {
      vel_test_ratio_ = vel_test_ratio;
   }
   /**
            * low-pass filtered ratio of the largest velocity innovation component to the innovation test limit
            */
   public float getVelTestRatio()
   {
      return vel_test_ratio_;
   }

   /**
            * low-pass filtered ratio of the largest horizontal position innovation component to the innovation test limit
            */
   public void setPosTestRatio(float pos_test_ratio)
   {
      pos_test_ratio_ = pos_test_ratio;
   }
   /**
            * low-pass filtered ratio of the largest horizontal position innovation component to the innovation test limit
            */
   public float getPosTestRatio()
   {
      return pos_test_ratio_;
   }

   /**
            * low-pass filtered ratio of the vertical position innovation to the innovation test limit
            */
   public void setHgtTestRatio(float hgt_test_ratio)
   {
      hgt_test_ratio_ = hgt_test_ratio;
   }
   /**
            * low-pass filtered ratio of the vertical position innovation to the innovation test limit
            */
   public float getHgtTestRatio()
   {
      return hgt_test_ratio_;
   }

   /**
            * low-pass filtered ratio of the true airspeed innovation to the innovation test limit
            */
   public void setTasTestRatio(float tas_test_ratio)
   {
      tas_test_ratio_ = tas_test_ratio;
   }
   /**
            * low-pass filtered ratio of the true airspeed innovation to the innovation test limit
            */
   public float getTasTestRatio()
   {
      return tas_test_ratio_;
   }

   /**
            * low-pass filtered ratio of the height above ground innovation to the innovation test limit
            */
   public void setHaglTestRatio(float hagl_test_ratio)
   {
      hagl_test_ratio_ = hagl_test_ratio;
   }
   /**
            * low-pass filtered ratio of the height above ground innovation to the innovation test limit
            */
   public float getHaglTestRatio()
   {
      return hagl_test_ratio_;
   }

   /**
            * low-pass filtered ratio of the synthetic sideslip innovation to the innovation test limit
            */
   public void setBetaTestRatio(float beta_test_ratio)
   {
      beta_test_ratio_ = beta_test_ratio;
   }
   /**
            * low-pass filtered ratio of the synthetic sideslip innovation to the innovation test limit
            */
   public float getBetaTestRatio()
   {
      return beta_test_ratio_;
   }

   /**
            * Bitmask indicating which filter kinematic state outputs are valid for flight control use.
            */
   public void setSolutionStatusFlags(int solution_status_flags)
   {
      solution_status_flags_ = solution_status_flags;
   }
   /**
            * Bitmask indicating which filter kinematic state outputs are valid for flight control use.
            */
   public int getSolutionStatusFlags()
   {
      return solution_status_flags_;
   }

   /**
            * number of horizontal position reset events (allow to wrap if count exceeds 255)
            */
   public void setResetCountVelNe(byte reset_count_vel_ne)
   {
      reset_count_vel_ne_ = reset_count_vel_ne;
   }
   /**
            * number of horizontal position reset events (allow to wrap if count exceeds 255)
            */
   public byte getResetCountVelNe()
   {
      return reset_count_vel_ne_;
   }

   /**
            * number of vertical velocity reset events (allow to wrap if count exceeds 255)
            */
   public void setResetCountVelD(byte reset_count_vel_d)
   {
      reset_count_vel_d_ = reset_count_vel_d;
   }
   /**
            * number of vertical velocity reset events (allow to wrap if count exceeds 255)
            */
   public byte getResetCountVelD()
   {
      return reset_count_vel_d_;
   }

   /**
            * number of horizontal position reset events (allow to wrap if count exceeds 255)
            */
   public void setResetCountPosNe(byte reset_count_pos_ne)
   {
      reset_count_pos_ne_ = reset_count_pos_ne;
   }
   /**
            * number of horizontal position reset events (allow to wrap if count exceeds 255)
            */
   public byte getResetCountPosNe()
   {
      return reset_count_pos_ne_;
   }

   /**
            * number of vertical position reset events (allow to wrap if count exceeds 255)
            */
   public void setResetCountPodD(byte reset_count_pod_d)
   {
      reset_count_pod_d_ = reset_count_pod_d;
   }
   /**
            * number of vertical position reset events (allow to wrap if count exceeds 255)
            */
   public byte getResetCountPodD()
   {
      return reset_count_pod_d_;
   }

   /**
            * number of quaternion reset events (allow to wrap if count exceeds 255)
            */
   public void setResetCountQuat(byte reset_count_quat)
   {
      reset_count_quat_ = reset_count_quat;
   }
   /**
            * number of quaternion reset events (allow to wrap if count exceeds 255)
            */
   public byte getResetCountQuat()
   {
      return reset_count_quat_;
   }

   /**
            * cumulative amount of time in seconds that the EKF inertial calculation has slipped relative to system time
            */
   public void setTimeSlip(float time_slip)
   {
      time_slip_ = time_slip;
   }
   /**
            * cumulative amount of time in seconds that the EKF inertial calculation has slipped relative to system time
            */
   public float getTimeSlip()
   {
      return time_slip_;
   }

   public void setPreFltFailInnovHeading(boolean pre_flt_fail_innov_heading)
   {
      pre_flt_fail_innov_heading_ = pre_flt_fail_innov_heading;
   }
   public boolean getPreFltFailInnovHeading()
   {
      return pre_flt_fail_innov_heading_;
   }

   public void setPreFltFailInnovHeight(boolean pre_flt_fail_innov_height)
   {
      pre_flt_fail_innov_height_ = pre_flt_fail_innov_height;
   }
   public boolean getPreFltFailInnovHeight()
   {
      return pre_flt_fail_innov_height_;
   }

   public void setPreFltFailInnovPosHoriz(boolean pre_flt_fail_innov_pos_horiz)
   {
      pre_flt_fail_innov_pos_horiz_ = pre_flt_fail_innov_pos_horiz;
   }
   public boolean getPreFltFailInnovPosHoriz()
   {
      return pre_flt_fail_innov_pos_horiz_;
   }

   public void setPreFltFailInnovVelHoriz(boolean pre_flt_fail_innov_vel_horiz)
   {
      pre_flt_fail_innov_vel_horiz_ = pre_flt_fail_innov_vel_horiz;
   }
   public boolean getPreFltFailInnovVelHoriz()
   {
      return pre_flt_fail_innov_vel_horiz_;
   }

   public void setPreFltFailInnovVelVert(boolean pre_flt_fail_innov_vel_vert)
   {
      pre_flt_fail_innov_vel_vert_ = pre_flt_fail_innov_vel_vert;
   }
   public boolean getPreFltFailInnovVelVert()
   {
      return pre_flt_fail_innov_vel_vert_;
   }

   public void setPreFltFailMagFieldDisturbed(boolean pre_flt_fail_mag_field_disturbed)
   {
      pre_flt_fail_mag_field_disturbed_ = pre_flt_fail_mag_field_disturbed;
   }
   public boolean getPreFltFailMagFieldDisturbed()
   {
      return pre_flt_fail_mag_field_disturbed_;
   }

   public void setAccelDeviceId(long accel_device_id)
   {
      accel_device_id_ = accel_device_id;
   }
   public long getAccelDeviceId()
   {
      return accel_device_id_;
   }

   public void setGyroDeviceId(long gyro_device_id)
   {
      gyro_device_id_ = gyro_device_id;
   }
   public long getGyroDeviceId()
   {
      return gyro_device_id_;
   }

   public void setBaroDeviceId(long baro_device_id)
   {
      baro_device_id_ = baro_device_id;
   }
   public long getBaroDeviceId()
   {
      return baro_device_id_;
   }

   public void setMagDeviceId(long mag_device_id)
   {
      mag_device_id_ = mag_device_id;
   }
   public long getMagDeviceId()
   {
      return mag_device_id_;
   }

   /**
            * legacy local position estimator (LPE) flags
            * Bitmask to indicate sensor health states (vel, pos, hgt)
            */
   public void setHealthFlags(byte health_flags)
   {
      health_flags_ = health_flags;
   }
   /**
            * legacy local position estimator (LPE) flags
            * Bitmask to indicate sensor health states (vel, pos, hgt)
            */
   public byte getHealthFlags()
   {
      return health_flags_;
   }

   /**
            * Bitmask to indicate timeout flags (vel, pos, hgt)
            */
   public void setTimeoutFlags(byte timeout_flags)
   {
      timeout_flags_ = timeout_flags;
   }
   /**
            * Bitmask to indicate timeout flags (vel, pos, hgt)
            */
   public byte getTimeoutFlags()
   {
      return timeout_flags_;
   }

   public void setMagInclinationDeg(float mag_inclination_deg)
   {
      mag_inclination_deg_ = mag_inclination_deg;
   }
   public float getMagInclinationDeg()
   {
      return mag_inclination_deg_;
   }

   public void setMagInclinationRefDeg(float mag_inclination_ref_deg)
   {
      mag_inclination_ref_deg_ = mag_inclination_ref_deg;
   }
   public float getMagInclinationRefDeg()
   {
      return mag_inclination_ref_deg_;
   }

   public void setMagStrengthGs(float mag_strength_gs)
   {
      mag_strength_gs_ = mag_strength_gs;
   }
   public float getMagStrengthGs()
   {
      return mag_strength_gs_;
   }

   public void setMagStrengthRefGs(float mag_strength_ref_gs)
   {
      mag_strength_ref_gs_ = mag_strength_ref_gs;
   }
   public float getMagStrengthRefGs()
   {
      return mag_strength_ref_gs_;
   }


   public static Supplier<EstimatorStatusPubSubType> getPubSubType()
   {
      return EstimatorStatusPubSubType::new;
   }

   @Override
   public Supplier<TopicDataType> getPubSubTypePacket()
   {
      return EstimatorStatusPubSubType::new;
   }

   @Override
   public boolean epsilonEquals(EstimatorStatus other, double epsilon)
   {
      if(other == null) return false;
      if(other == this) return true;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_, other.timestamp_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_sample_, other.timestamp_sample_, epsilon)) return false;

      for(int i3 = 0; i3 < output_tracking_error_.length; ++i3)
      {
                if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.output_tracking_error_[i3], other.output_tracking_error_[i3], epsilon)) return false;
      }

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.gps_check_fail_flags_, other.gps_check_fail_flags_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.control_mode_flags_, other.control_mode_flags_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.filter_fault_flags_, other.filter_fault_flags_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.pos_horiz_accuracy_, other.pos_horiz_accuracy_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.pos_vert_accuracy_, other.pos_vert_accuracy_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.hdg_test_ratio_, other.hdg_test_ratio_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.vel_test_ratio_, other.vel_test_ratio_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.pos_test_ratio_, other.pos_test_ratio_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.hgt_test_ratio_, other.hgt_test_ratio_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.tas_test_ratio_, other.tas_test_ratio_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.hagl_test_ratio_, other.hagl_test_ratio_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.beta_test_ratio_, other.beta_test_ratio_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.solution_status_flags_, other.solution_status_flags_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.reset_count_vel_ne_, other.reset_count_vel_ne_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.reset_count_vel_d_, other.reset_count_vel_d_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.reset_count_pos_ne_, other.reset_count_pos_ne_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.reset_count_pod_d_, other.reset_count_pod_d_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.reset_count_quat_, other.reset_count_quat_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.time_slip_, other.time_slip_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.pre_flt_fail_innov_heading_, other.pre_flt_fail_innov_heading_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.pre_flt_fail_innov_height_, other.pre_flt_fail_innov_height_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.pre_flt_fail_innov_pos_horiz_, other.pre_flt_fail_innov_pos_horiz_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.pre_flt_fail_innov_vel_horiz_, other.pre_flt_fail_innov_vel_horiz_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.pre_flt_fail_innov_vel_vert_, other.pre_flt_fail_innov_vel_vert_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.pre_flt_fail_mag_field_disturbed_, other.pre_flt_fail_mag_field_disturbed_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.accel_device_id_, other.accel_device_id_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.gyro_device_id_, other.gyro_device_id_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.baro_device_id_, other.baro_device_id_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.mag_device_id_, other.mag_device_id_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.health_flags_, other.health_flags_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timeout_flags_, other.timeout_flags_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.mag_inclination_deg_, other.mag_inclination_deg_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.mag_inclination_ref_deg_, other.mag_inclination_ref_deg_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.mag_strength_gs_, other.mag_strength_gs_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.mag_strength_ref_gs_, other.mag_strength_ref_gs_, epsilon)) return false;


      return true;
   }

   @Override
   public boolean equals(Object other)
   {
      if(other == null) return false;
      if(other == this) return true;
      if(!(other instanceof EstimatorStatus)) return false;

      EstimatorStatus otherMyClass = (EstimatorStatus) other;

      if(this.timestamp_ != otherMyClass.timestamp_) return false;

      if(this.timestamp_sample_ != otherMyClass.timestamp_sample_) return false;

      for(int i5 = 0; i5 < output_tracking_error_.length; ++i5)
      {
                if(this.output_tracking_error_[i5] != otherMyClass.output_tracking_error_[i5]) return false;

      }
      if(this.gps_check_fail_flags_ != otherMyClass.gps_check_fail_flags_) return false;

      if(this.control_mode_flags_ != otherMyClass.control_mode_flags_) return false;

      if(this.filter_fault_flags_ != otherMyClass.filter_fault_flags_) return false;

      if(this.pos_horiz_accuracy_ != otherMyClass.pos_horiz_accuracy_) return false;

      if(this.pos_vert_accuracy_ != otherMyClass.pos_vert_accuracy_) return false;

      if(this.hdg_test_ratio_ != otherMyClass.hdg_test_ratio_) return false;

      if(this.vel_test_ratio_ != otherMyClass.vel_test_ratio_) return false;

      if(this.pos_test_ratio_ != otherMyClass.pos_test_ratio_) return false;

      if(this.hgt_test_ratio_ != otherMyClass.hgt_test_ratio_) return false;

      if(this.tas_test_ratio_ != otherMyClass.tas_test_ratio_) return false;

      if(this.hagl_test_ratio_ != otherMyClass.hagl_test_ratio_) return false;

      if(this.beta_test_ratio_ != otherMyClass.beta_test_ratio_) return false;

      if(this.solution_status_flags_ != otherMyClass.solution_status_flags_) return false;

      if(this.reset_count_vel_ne_ != otherMyClass.reset_count_vel_ne_) return false;

      if(this.reset_count_vel_d_ != otherMyClass.reset_count_vel_d_) return false;

      if(this.reset_count_pos_ne_ != otherMyClass.reset_count_pos_ne_) return false;

      if(this.reset_count_pod_d_ != otherMyClass.reset_count_pod_d_) return false;

      if(this.reset_count_quat_ != otherMyClass.reset_count_quat_) return false;

      if(this.time_slip_ != otherMyClass.time_slip_) return false;

      if(this.pre_flt_fail_innov_heading_ != otherMyClass.pre_flt_fail_innov_heading_) return false;

      if(this.pre_flt_fail_innov_height_ != otherMyClass.pre_flt_fail_innov_height_) return false;

      if(this.pre_flt_fail_innov_pos_horiz_ != otherMyClass.pre_flt_fail_innov_pos_horiz_) return false;

      if(this.pre_flt_fail_innov_vel_horiz_ != otherMyClass.pre_flt_fail_innov_vel_horiz_) return false;

      if(this.pre_flt_fail_innov_vel_vert_ != otherMyClass.pre_flt_fail_innov_vel_vert_) return false;

      if(this.pre_flt_fail_mag_field_disturbed_ != otherMyClass.pre_flt_fail_mag_field_disturbed_) return false;

      if(this.accel_device_id_ != otherMyClass.accel_device_id_) return false;

      if(this.gyro_device_id_ != otherMyClass.gyro_device_id_) return false;

      if(this.baro_device_id_ != otherMyClass.baro_device_id_) return false;

      if(this.mag_device_id_ != otherMyClass.mag_device_id_) return false;

      if(this.health_flags_ != otherMyClass.health_flags_) return false;

      if(this.timeout_flags_ != otherMyClass.timeout_flags_) return false;

      if(this.mag_inclination_deg_ != otherMyClass.mag_inclination_deg_) return false;

      if(this.mag_inclination_ref_deg_ != otherMyClass.mag_inclination_ref_deg_) return false;

      if(this.mag_strength_gs_ != otherMyClass.mag_strength_gs_) return false;

      if(this.mag_strength_ref_gs_ != otherMyClass.mag_strength_ref_gs_) return false;


      return true;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("EstimatorStatus {");
      builder.append("timestamp=");
      builder.append(this.timestamp_);      builder.append(", ");
      builder.append("timestamp_sample=");
      builder.append(this.timestamp_sample_);      builder.append(", ");
      builder.append("output_tracking_error=");
      builder.append(java.util.Arrays.toString(this.output_tracking_error_));      builder.append(", ");
      builder.append("gps_check_fail_flags=");
      builder.append(this.gps_check_fail_flags_);      builder.append(", ");
      builder.append("control_mode_flags=");
      builder.append(this.control_mode_flags_);      builder.append(", ");
      builder.append("filter_fault_flags=");
      builder.append(this.filter_fault_flags_);      builder.append(", ");
      builder.append("pos_horiz_accuracy=");
      builder.append(this.pos_horiz_accuracy_);      builder.append(", ");
      builder.append("pos_vert_accuracy=");
      builder.append(this.pos_vert_accuracy_);      builder.append(", ");
      builder.append("hdg_test_ratio=");
      builder.append(this.hdg_test_ratio_);      builder.append(", ");
      builder.append("vel_test_ratio=");
      builder.append(this.vel_test_ratio_);      builder.append(", ");
      builder.append("pos_test_ratio=");
      builder.append(this.pos_test_ratio_);      builder.append(", ");
      builder.append("hgt_test_ratio=");
      builder.append(this.hgt_test_ratio_);      builder.append(", ");
      builder.append("tas_test_ratio=");
      builder.append(this.tas_test_ratio_);      builder.append(", ");
      builder.append("hagl_test_ratio=");
      builder.append(this.hagl_test_ratio_);      builder.append(", ");
      builder.append("beta_test_ratio=");
      builder.append(this.beta_test_ratio_);      builder.append(", ");
      builder.append("solution_status_flags=");
      builder.append(this.solution_status_flags_);      builder.append(", ");
      builder.append("reset_count_vel_ne=");
      builder.append(this.reset_count_vel_ne_);      builder.append(", ");
      builder.append("reset_count_vel_d=");
      builder.append(this.reset_count_vel_d_);      builder.append(", ");
      builder.append("reset_count_pos_ne=");
      builder.append(this.reset_count_pos_ne_);      builder.append(", ");
      builder.append("reset_count_pod_d=");
      builder.append(this.reset_count_pod_d_);      builder.append(", ");
      builder.append("reset_count_quat=");
      builder.append(this.reset_count_quat_);      builder.append(", ");
      builder.append("time_slip=");
      builder.append(this.time_slip_);      builder.append(", ");
      builder.append("pre_flt_fail_innov_heading=");
      builder.append(this.pre_flt_fail_innov_heading_);      builder.append(", ");
      builder.append("pre_flt_fail_innov_height=");
      builder.append(this.pre_flt_fail_innov_height_);      builder.append(", ");
      builder.append("pre_flt_fail_innov_pos_horiz=");
      builder.append(this.pre_flt_fail_innov_pos_horiz_);      builder.append(", ");
      builder.append("pre_flt_fail_innov_vel_horiz=");
      builder.append(this.pre_flt_fail_innov_vel_horiz_);      builder.append(", ");
      builder.append("pre_flt_fail_innov_vel_vert=");
      builder.append(this.pre_flt_fail_innov_vel_vert_);      builder.append(", ");
      builder.append("pre_flt_fail_mag_field_disturbed=");
      builder.append(this.pre_flt_fail_mag_field_disturbed_);      builder.append(", ");
      builder.append("accel_device_id=");
      builder.append(this.accel_device_id_);      builder.append(", ");
      builder.append("gyro_device_id=");
      builder.append(this.gyro_device_id_);      builder.append(", ");
      builder.append("baro_device_id=");
      builder.append(this.baro_device_id_);      builder.append(", ");
      builder.append("mag_device_id=");
      builder.append(this.mag_device_id_);      builder.append(", ");
      builder.append("health_flags=");
      builder.append(this.health_flags_);      builder.append(", ");
      builder.append("timeout_flags=");
      builder.append(this.timeout_flags_);      builder.append(", ");
      builder.append("mag_inclination_deg=");
      builder.append(this.mag_inclination_deg_);      builder.append(", ");
      builder.append("mag_inclination_ref_deg=");
      builder.append(this.mag_inclination_ref_deg_);      builder.append(", ");
      builder.append("mag_strength_gs=");
      builder.append(this.mag_strength_gs_);      builder.append(", ");
      builder.append("mag_strength_ref_gs=");
      builder.append(this.mag_strength_ref_gs_);
      builder.append("}");
      return builder.toString();
   }
}
