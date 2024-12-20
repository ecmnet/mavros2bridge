package px4_msgs.msg.dds;

import us.ihmc.communication.packets.Packet;
import us.ihmc.euclid.interfaces.Settable;
import us.ihmc.euclid.interfaces.EpsilonComparable;
import java.util.function.Supplier;
import us.ihmc.pubsub.TopicDataType;

/**
       * GNSS relative positioning information in NED frame. The NED frame is defined as the local topological system at the reference station.
       */
public class SensorGnssRelative extends Packet<SensorGnssRelative> implements Settable<SensorGnssRelative>, EpsilonComparable<SensorGnssRelative>
{
   /**
            * time since system start (microseconds)
            */
   public long timestamp_;
   /**
            * time since system start (microseconds)
            */
   public long timestamp_sample_;
   /**
            * unique device ID for the sensor that does not change between power cycles
            */
   public long device_id_;
   /**
            * Timestamp (microseconds, UTC), this is the timestamp which comes from the gps module. It might be unavailable right after cold start, indicated by a value of 0
            */
   public long time_utc_usec_;
   /**
            * Reference Station ID
            */
   public int reference_station_id_;
   /**
            * GPS NED relative position vector (m)
            */
   public float[] position_;
   /**
            * Accuracy of relative position (m)
            */
   public float[] position_accuracy_;
   /**
            * Heading of the relative position vector (radians)
            */
   public float heading_;
   /**
            * Accuracy of heading of the relative position vector (radians)
            */
   public float heading_accuracy_;
   /**
            * Length of the position vector (m)
            */
   public float position_length_;
   /**
            * Accuracy of the position length (m)
            */
   public float accuracy_length_;
   /**
            * GNSS valid fix (i.e within DOP & accuracy masks)
            */
   public boolean gnss_fix_ok_;
   /**
            * differential corrections were applied
            */
   public boolean differential_solution_;
   public boolean relative_position_valid_;
   /**
            * carrier phase range solution with floating ambiguities
            */
   public boolean carrier_solution_floating_;
   /**
            * carrier phase range solution with fixed ambiguities
            */
   public boolean carrier_solution_fixed_;
   /**
            * if the receiver is operating in moving base mode
            */
   public boolean moving_base_mode_;
   /**
            * extrapolated reference position was used to compute moving base solution this epoch
            */
   public boolean reference_position_miss_;
   /**
            * extrapolated reference observations were used to compute moving base solution this epoch
            */
   public boolean reference_observations_miss_;
   public boolean heading_valid_;
   /**
            * the components of the relative position vector (including the high-precision parts) are normalized
            */
   public boolean relative_position_normalized_;

   public SensorGnssRelative()
   {
      position_ = new float[3];

      position_accuracy_ = new float[3];

   }

   public SensorGnssRelative(SensorGnssRelative other)
   {
      this();
      set(other);
   }

   public void set(SensorGnssRelative other)
   {
      timestamp_ = other.timestamp_;

      timestamp_sample_ = other.timestamp_sample_;

      device_id_ = other.device_id_;

      time_utc_usec_ = other.time_utc_usec_;

      reference_station_id_ = other.reference_station_id_;

      for(int i1 = 0; i1 < position_.length; ++i1)
      {
            position_[i1] = other.position_[i1];

      }

      for(int i3 = 0; i3 < position_accuracy_.length; ++i3)
      {
            position_accuracy_[i3] = other.position_accuracy_[i3];

      }

      heading_ = other.heading_;

      heading_accuracy_ = other.heading_accuracy_;

      position_length_ = other.position_length_;

      accuracy_length_ = other.accuracy_length_;

      gnss_fix_ok_ = other.gnss_fix_ok_;

      differential_solution_ = other.differential_solution_;

      relative_position_valid_ = other.relative_position_valid_;

      carrier_solution_floating_ = other.carrier_solution_floating_;

      carrier_solution_fixed_ = other.carrier_solution_fixed_;

      moving_base_mode_ = other.moving_base_mode_;

      reference_position_miss_ = other.reference_position_miss_;

      reference_observations_miss_ = other.reference_observations_miss_;

      heading_valid_ = other.heading_valid_;

      relative_position_normalized_ = other.relative_position_normalized_;

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
            * time since system start (microseconds)
            */
   public void setTimestampSample(long timestamp_sample)
   {
      timestamp_sample_ = timestamp_sample;
   }
   /**
            * time since system start (microseconds)
            */
   public long getTimestampSample()
   {
      return timestamp_sample_;
   }

   /**
            * unique device ID for the sensor that does not change between power cycles
            */
   public void setDeviceId(long device_id)
   {
      device_id_ = device_id;
   }
   /**
            * unique device ID for the sensor that does not change between power cycles
            */
   public long getDeviceId()
   {
      return device_id_;
   }

   /**
            * Timestamp (microseconds, UTC), this is the timestamp which comes from the gps module. It might be unavailable right after cold start, indicated by a value of 0
            */
   public void setTimeUtcUsec(long time_utc_usec)
   {
      time_utc_usec_ = time_utc_usec;
   }
   /**
            * Timestamp (microseconds, UTC), this is the timestamp which comes from the gps module. It might be unavailable right after cold start, indicated by a value of 0
            */
   public long getTimeUtcUsec()
   {
      return time_utc_usec_;
   }

   /**
            * Reference Station ID
            */
   public void setReferenceStationId(int reference_station_id)
   {
      reference_station_id_ = reference_station_id;
   }
   /**
            * Reference Station ID
            */
   public int getReferenceStationId()
   {
      return reference_station_id_;
   }


   /**
            * GPS NED relative position vector (m)
            */
   public float[] getPosition()
   {
      return position_;
   }


   /**
            * Accuracy of relative position (m)
            */
   public float[] getPositionAccuracy()
   {
      return position_accuracy_;
   }

   /**
            * Heading of the relative position vector (radians)
            */
   public void setHeading(float heading)
   {
      heading_ = heading;
   }
   /**
            * Heading of the relative position vector (radians)
            */
   public float getHeading()
   {
      return heading_;
   }

   /**
            * Accuracy of heading of the relative position vector (radians)
            */
   public void setHeadingAccuracy(float heading_accuracy)
   {
      heading_accuracy_ = heading_accuracy;
   }
   /**
            * Accuracy of heading of the relative position vector (radians)
            */
   public float getHeadingAccuracy()
   {
      return heading_accuracy_;
   }

   /**
            * Length of the position vector (m)
            */
   public void setPositionLength(float position_length)
   {
      position_length_ = position_length;
   }
   /**
            * Length of the position vector (m)
            */
   public float getPositionLength()
   {
      return position_length_;
   }

   /**
            * Accuracy of the position length (m)
            */
   public void setAccuracyLength(float accuracy_length)
   {
      accuracy_length_ = accuracy_length;
   }
   /**
            * Accuracy of the position length (m)
            */
   public float getAccuracyLength()
   {
      return accuracy_length_;
   }

   /**
            * GNSS valid fix (i.e within DOP & accuracy masks)
            */
   public void setGnssFixOk(boolean gnss_fix_ok)
   {
      gnss_fix_ok_ = gnss_fix_ok;
   }
   /**
            * GNSS valid fix (i.e within DOP & accuracy masks)
            */
   public boolean getGnssFixOk()
   {
      return gnss_fix_ok_;
   }

   /**
            * differential corrections were applied
            */
   public void setDifferentialSolution(boolean differential_solution)
   {
      differential_solution_ = differential_solution;
   }
   /**
            * differential corrections were applied
            */
   public boolean getDifferentialSolution()
   {
      return differential_solution_;
   }

   public void setRelativePositionValid(boolean relative_position_valid)
   {
      relative_position_valid_ = relative_position_valid;
   }
   public boolean getRelativePositionValid()
   {
      return relative_position_valid_;
   }

   /**
            * carrier phase range solution with floating ambiguities
            */
   public void setCarrierSolutionFloating(boolean carrier_solution_floating)
   {
      carrier_solution_floating_ = carrier_solution_floating;
   }
   /**
            * carrier phase range solution with floating ambiguities
            */
   public boolean getCarrierSolutionFloating()
   {
      return carrier_solution_floating_;
   }

   /**
            * carrier phase range solution with fixed ambiguities
            */
   public void setCarrierSolutionFixed(boolean carrier_solution_fixed)
   {
      carrier_solution_fixed_ = carrier_solution_fixed;
   }
   /**
            * carrier phase range solution with fixed ambiguities
            */
   public boolean getCarrierSolutionFixed()
   {
      return carrier_solution_fixed_;
   }

   /**
            * if the receiver is operating in moving base mode
            */
   public void setMovingBaseMode(boolean moving_base_mode)
   {
      moving_base_mode_ = moving_base_mode;
   }
   /**
            * if the receiver is operating in moving base mode
            */
   public boolean getMovingBaseMode()
   {
      return moving_base_mode_;
   }

   /**
            * extrapolated reference position was used to compute moving base solution this epoch
            */
   public void setReferencePositionMiss(boolean reference_position_miss)
   {
      reference_position_miss_ = reference_position_miss;
   }
   /**
            * extrapolated reference position was used to compute moving base solution this epoch
            */
   public boolean getReferencePositionMiss()
   {
      return reference_position_miss_;
   }

   /**
            * extrapolated reference observations were used to compute moving base solution this epoch
            */
   public void setReferenceObservationsMiss(boolean reference_observations_miss)
   {
      reference_observations_miss_ = reference_observations_miss;
   }
   /**
            * extrapolated reference observations were used to compute moving base solution this epoch
            */
   public boolean getReferenceObservationsMiss()
   {
      return reference_observations_miss_;
   }

   public void setHeadingValid(boolean heading_valid)
   {
      heading_valid_ = heading_valid;
   }
   public boolean getHeadingValid()
   {
      return heading_valid_;
   }

   /**
            * the components of the relative position vector (including the high-precision parts) are normalized
            */
   public void setRelativePositionNormalized(boolean relative_position_normalized)
   {
      relative_position_normalized_ = relative_position_normalized;
   }
   /**
            * the components of the relative position vector (including the high-precision parts) are normalized
            */
   public boolean getRelativePositionNormalized()
   {
      return relative_position_normalized_;
   }


   public static Supplier<SensorGnssRelativePubSubType> getPubSubType()
   {
      return SensorGnssRelativePubSubType::new;
   }

   @Override
   public Supplier<TopicDataType> getPubSubTypePacket()
   {
      return SensorGnssRelativePubSubType::new;
   }

   @Override
   public boolean epsilonEquals(SensorGnssRelative other, double epsilon)
   {
      if(other == null) return false;
      if(other == this) return true;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_, other.timestamp_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_sample_, other.timestamp_sample_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.device_id_, other.device_id_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.time_utc_usec_, other.time_utc_usec_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.reference_station_id_, other.reference_station_id_, epsilon)) return false;

      for(int i5 = 0; i5 < position_.length; ++i5)
      {
                if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.position_[i5], other.position_[i5], epsilon)) return false;
      }

      for(int i7 = 0; i7 < position_accuracy_.length; ++i7)
      {
                if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.position_accuracy_[i7], other.position_accuracy_[i7], epsilon)) return false;
      }

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.heading_, other.heading_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.heading_accuracy_, other.heading_accuracy_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.position_length_, other.position_length_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.accuracy_length_, other.accuracy_length_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.gnss_fix_ok_, other.gnss_fix_ok_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.differential_solution_, other.differential_solution_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.relative_position_valid_, other.relative_position_valid_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.carrier_solution_floating_, other.carrier_solution_floating_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.carrier_solution_fixed_, other.carrier_solution_fixed_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.moving_base_mode_, other.moving_base_mode_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.reference_position_miss_, other.reference_position_miss_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.reference_observations_miss_, other.reference_observations_miss_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.heading_valid_, other.heading_valid_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.relative_position_normalized_, other.relative_position_normalized_, epsilon)) return false;


      return true;
   }

   @Override
   public boolean equals(Object other)
   {
      if(other == null) return false;
      if(other == this) return true;
      if(!(other instanceof SensorGnssRelative)) return false;

      SensorGnssRelative otherMyClass = (SensorGnssRelative) other;

      if(this.timestamp_ != otherMyClass.timestamp_) return false;

      if(this.timestamp_sample_ != otherMyClass.timestamp_sample_) return false;

      if(this.device_id_ != otherMyClass.device_id_) return false;

      if(this.time_utc_usec_ != otherMyClass.time_utc_usec_) return false;

      if(this.reference_station_id_ != otherMyClass.reference_station_id_) return false;

      for(int i9 = 0; i9 < position_.length; ++i9)
      {
                if(this.position_[i9] != otherMyClass.position_[i9]) return false;

      }
      for(int i11 = 0; i11 < position_accuracy_.length; ++i11)
      {
                if(this.position_accuracy_[i11] != otherMyClass.position_accuracy_[i11]) return false;

      }
      if(this.heading_ != otherMyClass.heading_) return false;

      if(this.heading_accuracy_ != otherMyClass.heading_accuracy_) return false;

      if(this.position_length_ != otherMyClass.position_length_) return false;

      if(this.accuracy_length_ != otherMyClass.accuracy_length_) return false;

      if(this.gnss_fix_ok_ != otherMyClass.gnss_fix_ok_) return false;

      if(this.differential_solution_ != otherMyClass.differential_solution_) return false;

      if(this.relative_position_valid_ != otherMyClass.relative_position_valid_) return false;

      if(this.carrier_solution_floating_ != otherMyClass.carrier_solution_floating_) return false;

      if(this.carrier_solution_fixed_ != otherMyClass.carrier_solution_fixed_) return false;

      if(this.moving_base_mode_ != otherMyClass.moving_base_mode_) return false;

      if(this.reference_position_miss_ != otherMyClass.reference_position_miss_) return false;

      if(this.reference_observations_miss_ != otherMyClass.reference_observations_miss_) return false;

      if(this.heading_valid_ != otherMyClass.heading_valid_) return false;

      if(this.relative_position_normalized_ != otherMyClass.relative_position_normalized_) return false;


      return true;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("SensorGnssRelative {");
      builder.append("timestamp=");
      builder.append(this.timestamp_);      builder.append(", ");
      builder.append("timestamp_sample=");
      builder.append(this.timestamp_sample_);      builder.append(", ");
      builder.append("device_id=");
      builder.append(this.device_id_);      builder.append(", ");
      builder.append("time_utc_usec=");
      builder.append(this.time_utc_usec_);      builder.append(", ");
      builder.append("reference_station_id=");
      builder.append(this.reference_station_id_);      builder.append(", ");
      builder.append("position=");
      builder.append(java.util.Arrays.toString(this.position_));      builder.append(", ");
      builder.append("position_accuracy=");
      builder.append(java.util.Arrays.toString(this.position_accuracy_));      builder.append(", ");
      builder.append("heading=");
      builder.append(this.heading_);      builder.append(", ");
      builder.append("heading_accuracy=");
      builder.append(this.heading_accuracy_);      builder.append(", ");
      builder.append("position_length=");
      builder.append(this.position_length_);      builder.append(", ");
      builder.append("accuracy_length=");
      builder.append(this.accuracy_length_);      builder.append(", ");
      builder.append("gnss_fix_ok=");
      builder.append(this.gnss_fix_ok_);      builder.append(", ");
      builder.append("differential_solution=");
      builder.append(this.differential_solution_);      builder.append(", ");
      builder.append("relative_position_valid=");
      builder.append(this.relative_position_valid_);      builder.append(", ");
      builder.append("carrier_solution_floating=");
      builder.append(this.carrier_solution_floating_);      builder.append(", ");
      builder.append("carrier_solution_fixed=");
      builder.append(this.carrier_solution_fixed_);      builder.append(", ");
      builder.append("moving_base_mode=");
      builder.append(this.moving_base_mode_);      builder.append(", ");
      builder.append("reference_position_miss=");
      builder.append(this.reference_position_miss_);      builder.append(", ");
      builder.append("reference_observations_miss=");
      builder.append(this.reference_observations_miss_);      builder.append(", ");
      builder.append("heading_valid=");
      builder.append(this.heading_valid_);      builder.append(", ");
      builder.append("relative_position_normalized=");
      builder.append(this.relative_position_normalized_);
      builder.append("}");
      return builder.toString();
   }
}
