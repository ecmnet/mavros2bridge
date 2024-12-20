package px4_msgs.msg.dds;

import us.ihmc.communication.packets.Packet;
import us.ihmc.euclid.interfaces.Settable;
import us.ihmc.euclid.interfaces.EpsilonComparable;
import java.util.function.Supplier;
import us.ihmc.pubsub.TopicDataType;

public class EstimatorEventFlags extends Packet<EstimatorEventFlags> implements Settable<EstimatorEventFlags>, EpsilonComparable<EstimatorEventFlags>
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
            * information events
            * number of information event changes
            */
   public long information_event_changes_;
   /**
            * 0 - true when gps quality checks are passing passed
            */
   public boolean gps_checks_passed_;
   /**
            * 1 - true when the velocity states are reset to the gps measurement
            */
   public boolean reset_vel_to_gps_;
   /**
            * 2 - true when the velocity states are reset using the optical flow measurement
            */
   public boolean reset_vel_to_flow_;
   /**
            * 3 - true when the velocity states are reset to the vision system measurement
            */
   public boolean reset_vel_to_vision_;
   /**
            * 4 - true when the velocity states are reset to zero
            */
   public boolean reset_vel_to_zero_;
   /**
            * 5 - true when the position states are reset to the last known position
            */
   public boolean reset_pos_to_last_known_;
   /**
            * 6 - true when the position states are reset to the gps measurement
            */
   public boolean reset_pos_to_gps_;
   /**
            * 7 - true when the position states are reset to the vision system measurement
            */
   public boolean reset_pos_to_vision_;
   /**
            * 8 - true when the filter starts using gps measurements to correct the state estimates
            */
   public boolean starting_gps_fusion_;
   /**
            * 9 - true when the filter starts using vision system position measurements to correct the state estimates
            */
   public boolean starting_vision_pos_fusion_;
   /**
            * 10 - true when the filter starts using vision system velocity measurements to correct the state estimates
            */
   public boolean starting_vision_vel_fusion_;
   /**
            * 11 - true when the filter starts using vision system yaw  measurements to correct the state estimates
            */
   public boolean starting_vision_yaw_fusion_;
   /**
            * 12 - true when the filter resets the yaw to an estimate derived from IMU and GPS data
            */
   public boolean yaw_aligned_to_imu_gps_;
   /**
            * 13 - true when the vertical position state is reset to the baro measurement
            */
   public boolean reset_hgt_to_baro_;
   /**
            * 14 - true when the vertical position state is reset to the gps measurement
            */
   public boolean reset_hgt_to_gps_;
   /**
            * 15 - true when the vertical position state is reset to the rng measurement
            */
   public boolean reset_hgt_to_rng_;
   /**
            * 16 - true when the vertical position state is reset to the ev measurement
            */
   public boolean reset_hgt_to_ev_;

   public EstimatorEventFlags()
   {
   }

   public EstimatorEventFlags(EstimatorEventFlags other)
   {
      this();
      set(other);
   }

   public void set(EstimatorEventFlags other)
   {
      timestamp_ = other.timestamp_;

      timestamp_sample_ = other.timestamp_sample_;

      information_event_changes_ = other.information_event_changes_;

      gps_checks_passed_ = other.gps_checks_passed_;

      reset_vel_to_gps_ = other.reset_vel_to_gps_;

      reset_vel_to_flow_ = other.reset_vel_to_flow_;

      reset_vel_to_vision_ = other.reset_vel_to_vision_;

      reset_vel_to_zero_ = other.reset_vel_to_zero_;

      reset_pos_to_last_known_ = other.reset_pos_to_last_known_;

      reset_pos_to_gps_ = other.reset_pos_to_gps_;

      reset_pos_to_vision_ = other.reset_pos_to_vision_;

      starting_gps_fusion_ = other.starting_gps_fusion_;

      starting_vision_pos_fusion_ = other.starting_vision_pos_fusion_;

      starting_vision_vel_fusion_ = other.starting_vision_vel_fusion_;

      starting_vision_yaw_fusion_ = other.starting_vision_yaw_fusion_;

      yaw_aligned_to_imu_gps_ = other.yaw_aligned_to_imu_gps_;

      reset_hgt_to_baro_ = other.reset_hgt_to_baro_;

      reset_hgt_to_gps_ = other.reset_hgt_to_gps_;

      reset_hgt_to_rng_ = other.reset_hgt_to_rng_;

      reset_hgt_to_ev_ = other.reset_hgt_to_ev_;

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
            * information events
            * number of information event changes
            */
   public void setInformationEventChanges(long information_event_changes)
   {
      information_event_changes_ = information_event_changes;
   }
   /**
            * information events
            * number of information event changes
            */
   public long getInformationEventChanges()
   {
      return information_event_changes_;
   }

   /**
            * 0 - true when gps quality checks are passing passed
            */
   public void setGpsChecksPassed(boolean gps_checks_passed)
   {
      gps_checks_passed_ = gps_checks_passed;
   }
   /**
            * 0 - true when gps quality checks are passing passed
            */
   public boolean getGpsChecksPassed()
   {
      return gps_checks_passed_;
   }

   /**
            * 1 - true when the velocity states are reset to the gps measurement
            */
   public void setResetVelToGps(boolean reset_vel_to_gps)
   {
      reset_vel_to_gps_ = reset_vel_to_gps;
   }
   /**
            * 1 - true when the velocity states are reset to the gps measurement
            */
   public boolean getResetVelToGps()
   {
      return reset_vel_to_gps_;
   }

   /**
            * 2 - true when the velocity states are reset using the optical flow measurement
            */
   public void setResetVelToFlow(boolean reset_vel_to_flow)
   {
      reset_vel_to_flow_ = reset_vel_to_flow;
   }
   /**
            * 2 - true when the velocity states are reset using the optical flow measurement
            */
   public boolean getResetVelToFlow()
   {
      return reset_vel_to_flow_;
   }

   /**
            * 3 - true when the velocity states are reset to the vision system measurement
            */
   public void setResetVelToVision(boolean reset_vel_to_vision)
   {
      reset_vel_to_vision_ = reset_vel_to_vision;
   }
   /**
            * 3 - true when the velocity states are reset to the vision system measurement
            */
   public boolean getResetVelToVision()
   {
      return reset_vel_to_vision_;
   }

   /**
            * 4 - true when the velocity states are reset to zero
            */
   public void setResetVelToZero(boolean reset_vel_to_zero)
   {
      reset_vel_to_zero_ = reset_vel_to_zero;
   }
   /**
            * 4 - true when the velocity states are reset to zero
            */
   public boolean getResetVelToZero()
   {
      return reset_vel_to_zero_;
   }

   /**
            * 5 - true when the position states are reset to the last known position
            */
   public void setResetPosToLastKnown(boolean reset_pos_to_last_known)
   {
      reset_pos_to_last_known_ = reset_pos_to_last_known;
   }
   /**
            * 5 - true when the position states are reset to the last known position
            */
   public boolean getResetPosToLastKnown()
   {
      return reset_pos_to_last_known_;
   }

   /**
            * 6 - true when the position states are reset to the gps measurement
            */
   public void setResetPosToGps(boolean reset_pos_to_gps)
   {
      reset_pos_to_gps_ = reset_pos_to_gps;
   }
   /**
            * 6 - true when the position states are reset to the gps measurement
            */
   public boolean getResetPosToGps()
   {
      return reset_pos_to_gps_;
   }

   /**
            * 7 - true when the position states are reset to the vision system measurement
            */
   public void setResetPosToVision(boolean reset_pos_to_vision)
   {
      reset_pos_to_vision_ = reset_pos_to_vision;
   }
   /**
            * 7 - true when the position states are reset to the vision system measurement
            */
   public boolean getResetPosToVision()
   {
      return reset_pos_to_vision_;
   }

   /**
            * 8 - true when the filter starts using gps measurements to correct the state estimates
            */
   public void setStartingGpsFusion(boolean starting_gps_fusion)
   {
      starting_gps_fusion_ = starting_gps_fusion;
   }
   /**
            * 8 - true when the filter starts using gps measurements to correct the state estimates
            */
   public boolean getStartingGpsFusion()
   {
      return starting_gps_fusion_;
   }

   /**
            * 9 - true when the filter starts using vision system position measurements to correct the state estimates
            */
   public void setStartingVisionPosFusion(boolean starting_vision_pos_fusion)
   {
      starting_vision_pos_fusion_ = starting_vision_pos_fusion;
   }
   /**
            * 9 - true when the filter starts using vision system position measurements to correct the state estimates
            */
   public boolean getStartingVisionPosFusion()
   {
      return starting_vision_pos_fusion_;
   }

   /**
            * 10 - true when the filter starts using vision system velocity measurements to correct the state estimates
            */
   public void setStartingVisionVelFusion(boolean starting_vision_vel_fusion)
   {
      starting_vision_vel_fusion_ = starting_vision_vel_fusion;
   }
   /**
            * 10 - true when the filter starts using vision system velocity measurements to correct the state estimates
            */
   public boolean getStartingVisionVelFusion()
   {
      return starting_vision_vel_fusion_;
   }

   /**
            * 11 - true when the filter starts using vision system yaw  measurements to correct the state estimates
            */
   public void setStartingVisionYawFusion(boolean starting_vision_yaw_fusion)
   {
      starting_vision_yaw_fusion_ = starting_vision_yaw_fusion;
   }
   /**
            * 11 - true when the filter starts using vision system yaw  measurements to correct the state estimates
            */
   public boolean getStartingVisionYawFusion()
   {
      return starting_vision_yaw_fusion_;
   }

   /**
            * 12 - true when the filter resets the yaw to an estimate derived from IMU and GPS data
            */
   public void setYawAlignedToImuGps(boolean yaw_aligned_to_imu_gps)
   {
      yaw_aligned_to_imu_gps_ = yaw_aligned_to_imu_gps;
   }
   /**
            * 12 - true when the filter resets the yaw to an estimate derived from IMU and GPS data
            */
   public boolean getYawAlignedToImuGps()
   {
      return yaw_aligned_to_imu_gps_;
   }

   /**
            * 13 - true when the vertical position state is reset to the baro measurement
            */
   public void setResetHgtToBaro(boolean reset_hgt_to_baro)
   {
      reset_hgt_to_baro_ = reset_hgt_to_baro;
   }
   /**
            * 13 - true when the vertical position state is reset to the baro measurement
            */
   public boolean getResetHgtToBaro()
   {
      return reset_hgt_to_baro_;
   }

   /**
            * 14 - true when the vertical position state is reset to the gps measurement
            */
   public void setResetHgtToGps(boolean reset_hgt_to_gps)
   {
      reset_hgt_to_gps_ = reset_hgt_to_gps;
   }
   /**
            * 14 - true when the vertical position state is reset to the gps measurement
            */
   public boolean getResetHgtToGps()
   {
      return reset_hgt_to_gps_;
   }

   /**
            * 15 - true when the vertical position state is reset to the rng measurement
            */
   public void setResetHgtToRng(boolean reset_hgt_to_rng)
   {
      reset_hgt_to_rng_ = reset_hgt_to_rng;
   }
   /**
            * 15 - true when the vertical position state is reset to the rng measurement
            */
   public boolean getResetHgtToRng()
   {
      return reset_hgt_to_rng_;
   }

   /**
            * 16 - true when the vertical position state is reset to the ev measurement
            */
   public void setResetHgtToEv(boolean reset_hgt_to_ev)
   {
      reset_hgt_to_ev_ = reset_hgt_to_ev;
   }
   /**
            * 16 - true when the vertical position state is reset to the ev measurement
            */
   public boolean getResetHgtToEv()
   {
      return reset_hgt_to_ev_;
   }


   public static Supplier<EstimatorEventFlagsPubSubType> getPubSubType()
   {
      return EstimatorEventFlagsPubSubType::new;
   }

   @Override
   public Supplier<TopicDataType> getPubSubTypePacket()
   {
      return EstimatorEventFlagsPubSubType::new;
   }

   @Override
   public boolean epsilonEquals(EstimatorEventFlags other, double epsilon)
   {
      if(other == null) return false;
      if(other == this) return true;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_, other.timestamp_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_sample_, other.timestamp_sample_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.information_event_changes_, other.information_event_changes_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.gps_checks_passed_, other.gps_checks_passed_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.reset_vel_to_gps_, other.reset_vel_to_gps_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.reset_vel_to_flow_, other.reset_vel_to_flow_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.reset_vel_to_vision_, other.reset_vel_to_vision_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.reset_vel_to_zero_, other.reset_vel_to_zero_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.reset_pos_to_last_known_, other.reset_pos_to_last_known_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.reset_pos_to_gps_, other.reset_pos_to_gps_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.reset_pos_to_vision_, other.reset_pos_to_vision_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.starting_gps_fusion_, other.starting_gps_fusion_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.starting_vision_pos_fusion_, other.starting_vision_pos_fusion_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.starting_vision_vel_fusion_, other.starting_vision_vel_fusion_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.starting_vision_yaw_fusion_, other.starting_vision_yaw_fusion_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.yaw_aligned_to_imu_gps_, other.yaw_aligned_to_imu_gps_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.reset_hgt_to_baro_, other.reset_hgt_to_baro_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.reset_hgt_to_gps_, other.reset_hgt_to_gps_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.reset_hgt_to_rng_, other.reset_hgt_to_rng_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.reset_hgt_to_ev_, other.reset_hgt_to_ev_, epsilon)) return false;


      return true;
   }

   @Override
   public boolean equals(Object other)
   {
      if(other == null) return false;
      if(other == this) return true;
      if(!(other instanceof EstimatorEventFlags)) return false;

      EstimatorEventFlags otherMyClass = (EstimatorEventFlags) other;

      if(this.timestamp_ != otherMyClass.timestamp_) return false;

      if(this.timestamp_sample_ != otherMyClass.timestamp_sample_) return false;

      if(this.information_event_changes_ != otherMyClass.information_event_changes_) return false;

      if(this.gps_checks_passed_ != otherMyClass.gps_checks_passed_) return false;

      if(this.reset_vel_to_gps_ != otherMyClass.reset_vel_to_gps_) return false;

      if(this.reset_vel_to_flow_ != otherMyClass.reset_vel_to_flow_) return false;

      if(this.reset_vel_to_vision_ != otherMyClass.reset_vel_to_vision_) return false;

      if(this.reset_vel_to_zero_ != otherMyClass.reset_vel_to_zero_) return false;

      if(this.reset_pos_to_last_known_ != otherMyClass.reset_pos_to_last_known_) return false;

      if(this.reset_pos_to_gps_ != otherMyClass.reset_pos_to_gps_) return false;

      if(this.reset_pos_to_vision_ != otherMyClass.reset_pos_to_vision_) return false;

      if(this.starting_gps_fusion_ != otherMyClass.starting_gps_fusion_) return false;

      if(this.starting_vision_pos_fusion_ != otherMyClass.starting_vision_pos_fusion_) return false;

      if(this.starting_vision_vel_fusion_ != otherMyClass.starting_vision_vel_fusion_) return false;

      if(this.starting_vision_yaw_fusion_ != otherMyClass.starting_vision_yaw_fusion_) return false;

      if(this.yaw_aligned_to_imu_gps_ != otherMyClass.yaw_aligned_to_imu_gps_) return false;

      if(this.reset_hgt_to_baro_ != otherMyClass.reset_hgt_to_baro_) return false;

      if(this.reset_hgt_to_gps_ != otherMyClass.reset_hgt_to_gps_) return false;

      if(this.reset_hgt_to_rng_ != otherMyClass.reset_hgt_to_rng_) return false;

      if(this.reset_hgt_to_ev_ != otherMyClass.reset_hgt_to_ev_) return false;


      return true;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("EstimatorEventFlags {");
      builder.append("timestamp=");
      builder.append(this.timestamp_);      builder.append(", ");
      builder.append("timestamp_sample=");
      builder.append(this.timestamp_sample_);      builder.append(", ");
      builder.append("information_event_changes=");
      builder.append(this.information_event_changes_);      builder.append(", ");
      builder.append("gps_checks_passed=");
      builder.append(this.gps_checks_passed_);      builder.append(", ");
      builder.append("reset_vel_to_gps=");
      builder.append(this.reset_vel_to_gps_);      builder.append(", ");
      builder.append("reset_vel_to_flow=");
      builder.append(this.reset_vel_to_flow_);      builder.append(", ");
      builder.append("reset_vel_to_vision=");
      builder.append(this.reset_vel_to_vision_);      builder.append(", ");
      builder.append("reset_vel_to_zero=");
      builder.append(this.reset_vel_to_zero_);      builder.append(", ");
      builder.append("reset_pos_to_last_known=");
      builder.append(this.reset_pos_to_last_known_);      builder.append(", ");
      builder.append("reset_pos_to_gps=");
      builder.append(this.reset_pos_to_gps_);      builder.append(", ");
      builder.append("reset_pos_to_vision=");
      builder.append(this.reset_pos_to_vision_);      builder.append(", ");
      builder.append("starting_gps_fusion=");
      builder.append(this.starting_gps_fusion_);      builder.append(", ");
      builder.append("starting_vision_pos_fusion=");
      builder.append(this.starting_vision_pos_fusion_);      builder.append(", ");
      builder.append("starting_vision_vel_fusion=");
      builder.append(this.starting_vision_vel_fusion_);      builder.append(", ");
      builder.append("starting_vision_yaw_fusion=");
      builder.append(this.starting_vision_yaw_fusion_);      builder.append(", ");
      builder.append("yaw_aligned_to_imu_gps=");
      builder.append(this.yaw_aligned_to_imu_gps_);      builder.append(", ");
      builder.append("reset_hgt_to_baro=");
      builder.append(this.reset_hgt_to_baro_);      builder.append(", ");
      builder.append("reset_hgt_to_gps=");
      builder.append(this.reset_hgt_to_gps_);      builder.append(", ");
      builder.append("reset_hgt_to_rng=");
      builder.append(this.reset_hgt_to_rng_);      builder.append(", ");
      builder.append("reset_hgt_to_ev=");
      builder.append(this.reset_hgt_to_ev_);
      builder.append("}");
      return builder.toString();
   }
}
