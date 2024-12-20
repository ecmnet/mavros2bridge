package px4_msgs.msg.dds;

import us.ihmc.communication.packets.Packet;
import us.ihmc.euclid.interfaces.Settable;
import us.ihmc.euclid.interfaces.EpsilonComparable;
import java.util.function.Supplier;
import us.ihmc.pubsub.TopicDataType;

/**
       * The innovation test ratios are scalar values. In case the field is a vector,
       * the test ratio will be put in the first component of the vector.
       */
public class EstimatorInnovations extends Packet<EstimatorInnovations> implements Settable<EstimatorInnovations>, EpsilonComparable<EstimatorInnovations>
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
            * GPS
            * horizontal GPS velocity innovation (m/sec) and innovation variance ((m/sec)**2)
            */
   public float[] gps_hvel_;
   /**
            * vertical GPS velocity innovation (m/sec) and innovation variance ((m/sec)**2)
            */
   public float gps_vvel_;
   /**
            * horizontal GPS position innovation (m) and innovation variance (m**2)
            */
   public float[] gps_hpos_;
   /**
            * vertical GPS position innovation (m) and innovation variance (m**2)
            */
   public float gps_vpos_;
   /**
            * External Vision
            * horizontal external vision velocity innovation (m/sec) and innovation variance ((m/sec)**2)
            */
   public float[] ev_hvel_;
   /**
            * vertical external vision velocity innovation (m/sec) and innovation variance ((m/sec)**2)
            */
   public float ev_vvel_;
   /**
            * horizontal external vision position innovation (m) and innovation variance (m**2)
            */
   public float[] ev_hpos_;
   /**
            * vertical external vision position innovation (m) and innovation variance (m**2)
            */
   public float ev_vpos_;
   /**
            * Height sensors
            * range sensor height innovation (m) and innovation variance (m**2)
            */
   public float rng_vpos_;
   /**
            * barometer height innovation (m) and innovation variance (m**2)
            */
   public float baro_vpos_;
   /**
            * Auxiliary velocity
            * horizontal auxiliary velocity innovation from landing target measurement (m/sec) and innovation variance ((m/sec)**2)
            */
   public float[] aux_hvel_;
   /**
            * Optical flow
            * flow innvoation (rad/sec) and innovation variance ((rad/sec)**2)
            */
   public float[] flow_;
   /**
            * Various
            * heading innovation (rad) and innovation variance (rad**2)
            */
   public float heading_;
   /**
            * earth magnetic field innovation (Gauss) and innovation variance (Gauss**2)
            */
   public float[] mag_field_;
   /**
            * gravity innovation from accelerometerr vector (m/s**2)
            */
   public float[] gravity_;
   /**
            * drag specific force innovation (m/sec**2) and innovation variance ((m/sec)**2)
            */
   public float[] drag_;
   /**
            * airspeed innovation (m/sec) and innovation variance ((m/sec)**2)
            */
   public float airspeed_;
   /**
            * synthetic sideslip innovation (rad) and innovation variance (rad**2)
            */
   public float beta_;
   /**
            * height of ground innovation (m) and innovation variance (m**2)
            */
   public float hagl_;
   /**
            * height of ground rate innovation (m/s) and innovation variance ((m/s)**2)
            */
   public float hagl_rate_;

   public EstimatorInnovations()
   {
      gps_hvel_ = new float[2];

      gps_hpos_ = new float[2];

      ev_hvel_ = new float[2];

      ev_hpos_ = new float[2];

      aux_hvel_ = new float[2];

      flow_ = new float[2];

      mag_field_ = new float[3];

      gravity_ = new float[3];

      drag_ = new float[2];

   }

   public EstimatorInnovations(EstimatorInnovations other)
   {
      this();
      set(other);
   }

   public void set(EstimatorInnovations other)
   {
      timestamp_ = other.timestamp_;

      timestamp_sample_ = other.timestamp_sample_;

      for(int i1 = 0; i1 < gps_hvel_.length; ++i1)
      {
            gps_hvel_[i1] = other.gps_hvel_[i1];

      }

      gps_vvel_ = other.gps_vvel_;

      for(int i3 = 0; i3 < gps_hpos_.length; ++i3)
      {
            gps_hpos_[i3] = other.gps_hpos_[i3];

      }

      gps_vpos_ = other.gps_vpos_;

      for(int i5 = 0; i5 < ev_hvel_.length; ++i5)
      {
            ev_hvel_[i5] = other.ev_hvel_[i5];

      }

      ev_vvel_ = other.ev_vvel_;

      for(int i7 = 0; i7 < ev_hpos_.length; ++i7)
      {
            ev_hpos_[i7] = other.ev_hpos_[i7];

      }

      ev_vpos_ = other.ev_vpos_;

      rng_vpos_ = other.rng_vpos_;

      baro_vpos_ = other.baro_vpos_;

      for(int i9 = 0; i9 < aux_hvel_.length; ++i9)
      {
            aux_hvel_[i9] = other.aux_hvel_[i9];

      }

      for(int i11 = 0; i11 < flow_.length; ++i11)
      {
            flow_[i11] = other.flow_[i11];

      }

      heading_ = other.heading_;

      for(int i13 = 0; i13 < mag_field_.length; ++i13)
      {
            mag_field_[i13] = other.mag_field_[i13];

      }

      for(int i15 = 0; i15 < gravity_.length; ++i15)
      {
            gravity_[i15] = other.gravity_[i15];

      }

      for(int i17 = 0; i17 < drag_.length; ++i17)
      {
            drag_[i17] = other.drag_[i17];

      }

      airspeed_ = other.airspeed_;

      beta_ = other.beta_;

      hagl_ = other.hagl_;

      hagl_rate_ = other.hagl_rate_;

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
            * GPS
            * horizontal GPS velocity innovation (m/sec) and innovation variance ((m/sec)**2)
            */
   public float[] getGpsHvel()
   {
      return gps_hvel_;
   }

   /**
            * vertical GPS velocity innovation (m/sec) and innovation variance ((m/sec)**2)
            */
   public void setGpsVvel(float gps_vvel)
   {
      gps_vvel_ = gps_vvel;
   }
   /**
            * vertical GPS velocity innovation (m/sec) and innovation variance ((m/sec)**2)
            */
   public float getGpsVvel()
   {
      return gps_vvel_;
   }


   /**
            * horizontal GPS position innovation (m) and innovation variance (m**2)
            */
   public float[] getGpsHpos()
   {
      return gps_hpos_;
   }

   /**
            * vertical GPS position innovation (m) and innovation variance (m**2)
            */
   public void setGpsVpos(float gps_vpos)
   {
      gps_vpos_ = gps_vpos;
   }
   /**
            * vertical GPS position innovation (m) and innovation variance (m**2)
            */
   public float getGpsVpos()
   {
      return gps_vpos_;
   }


   /**
            * External Vision
            * horizontal external vision velocity innovation (m/sec) and innovation variance ((m/sec)**2)
            */
   public float[] getEvHvel()
   {
      return ev_hvel_;
   }

   /**
            * vertical external vision velocity innovation (m/sec) and innovation variance ((m/sec)**2)
            */
   public void setEvVvel(float ev_vvel)
   {
      ev_vvel_ = ev_vvel;
   }
   /**
            * vertical external vision velocity innovation (m/sec) and innovation variance ((m/sec)**2)
            */
   public float getEvVvel()
   {
      return ev_vvel_;
   }


   /**
            * horizontal external vision position innovation (m) and innovation variance (m**2)
            */
   public float[] getEvHpos()
   {
      return ev_hpos_;
   }

   /**
            * vertical external vision position innovation (m) and innovation variance (m**2)
            */
   public void setEvVpos(float ev_vpos)
   {
      ev_vpos_ = ev_vpos;
   }
   /**
            * vertical external vision position innovation (m) and innovation variance (m**2)
            */
   public float getEvVpos()
   {
      return ev_vpos_;
   }

   /**
            * Height sensors
            * range sensor height innovation (m) and innovation variance (m**2)
            */
   public void setRngVpos(float rng_vpos)
   {
      rng_vpos_ = rng_vpos;
   }
   /**
            * Height sensors
            * range sensor height innovation (m) and innovation variance (m**2)
            */
   public float getRngVpos()
   {
      return rng_vpos_;
   }

   /**
            * barometer height innovation (m) and innovation variance (m**2)
            */
   public void setBaroVpos(float baro_vpos)
   {
      baro_vpos_ = baro_vpos;
   }
   /**
            * barometer height innovation (m) and innovation variance (m**2)
            */
   public float getBaroVpos()
   {
      return baro_vpos_;
   }


   /**
            * Auxiliary velocity
            * horizontal auxiliary velocity innovation from landing target measurement (m/sec) and innovation variance ((m/sec)**2)
            */
   public float[] getAuxHvel()
   {
      return aux_hvel_;
   }


   /**
            * Optical flow
            * flow innvoation (rad/sec) and innovation variance ((rad/sec)**2)
            */
   public float[] getFlow()
   {
      return flow_;
   }

   /**
            * Various
            * heading innovation (rad) and innovation variance (rad**2)
            */
   public void setHeading(float heading)
   {
      heading_ = heading;
   }
   /**
            * Various
            * heading innovation (rad) and innovation variance (rad**2)
            */
   public float getHeading()
   {
      return heading_;
   }


   /**
            * earth magnetic field innovation (Gauss) and innovation variance (Gauss**2)
            */
   public float[] getMagField()
   {
      return mag_field_;
   }


   /**
            * gravity innovation from accelerometerr vector (m/s**2)
            */
   public float[] getGravity()
   {
      return gravity_;
   }


   /**
            * drag specific force innovation (m/sec**2) and innovation variance ((m/sec)**2)
            */
   public float[] getDrag()
   {
      return drag_;
   }

   /**
            * airspeed innovation (m/sec) and innovation variance ((m/sec)**2)
            */
   public void setAirspeed(float airspeed)
   {
      airspeed_ = airspeed;
   }
   /**
            * airspeed innovation (m/sec) and innovation variance ((m/sec)**2)
            */
   public float getAirspeed()
   {
      return airspeed_;
   }

   /**
            * synthetic sideslip innovation (rad) and innovation variance (rad**2)
            */
   public void setBeta(float beta)
   {
      beta_ = beta;
   }
   /**
            * synthetic sideslip innovation (rad) and innovation variance (rad**2)
            */
   public float getBeta()
   {
      return beta_;
   }

   /**
            * height of ground innovation (m) and innovation variance (m**2)
            */
   public void setHagl(float hagl)
   {
      hagl_ = hagl;
   }
   /**
            * height of ground innovation (m) and innovation variance (m**2)
            */
   public float getHagl()
   {
      return hagl_;
   }

   /**
            * height of ground rate innovation (m/s) and innovation variance ((m/s)**2)
            */
   public void setHaglRate(float hagl_rate)
   {
      hagl_rate_ = hagl_rate;
   }
   /**
            * height of ground rate innovation (m/s) and innovation variance ((m/s)**2)
            */
   public float getHaglRate()
   {
      return hagl_rate_;
   }


   public static Supplier<EstimatorInnovationsPubSubType> getPubSubType()
   {
      return EstimatorInnovationsPubSubType::new;
   }

   @Override
   public Supplier<TopicDataType> getPubSubTypePacket()
   {
      return EstimatorInnovationsPubSubType::new;
   }

   @Override
   public boolean epsilonEquals(EstimatorInnovations other, double epsilon)
   {
      if(other == null) return false;
      if(other == this) return true;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_, other.timestamp_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_sample_, other.timestamp_sample_, epsilon)) return false;

      for(int i19 = 0; i19 < gps_hvel_.length; ++i19)
      {
                if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.gps_hvel_[i19], other.gps_hvel_[i19], epsilon)) return false;
      }

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.gps_vvel_, other.gps_vvel_, epsilon)) return false;

      for(int i21 = 0; i21 < gps_hpos_.length; ++i21)
      {
                if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.gps_hpos_[i21], other.gps_hpos_[i21], epsilon)) return false;
      }

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.gps_vpos_, other.gps_vpos_, epsilon)) return false;

      for(int i23 = 0; i23 < ev_hvel_.length; ++i23)
      {
                if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.ev_hvel_[i23], other.ev_hvel_[i23], epsilon)) return false;
      }

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.ev_vvel_, other.ev_vvel_, epsilon)) return false;

      for(int i25 = 0; i25 < ev_hpos_.length; ++i25)
      {
                if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.ev_hpos_[i25], other.ev_hpos_[i25], epsilon)) return false;
      }

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.ev_vpos_, other.ev_vpos_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.rng_vpos_, other.rng_vpos_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.baro_vpos_, other.baro_vpos_, epsilon)) return false;

      for(int i27 = 0; i27 < aux_hvel_.length; ++i27)
      {
                if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.aux_hvel_[i27], other.aux_hvel_[i27], epsilon)) return false;
      }

      for(int i29 = 0; i29 < flow_.length; ++i29)
      {
                if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.flow_[i29], other.flow_[i29], epsilon)) return false;
      }

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.heading_, other.heading_, epsilon)) return false;

      for(int i31 = 0; i31 < mag_field_.length; ++i31)
      {
                if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.mag_field_[i31], other.mag_field_[i31], epsilon)) return false;
      }

      for(int i33 = 0; i33 < gravity_.length; ++i33)
      {
                if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.gravity_[i33], other.gravity_[i33], epsilon)) return false;
      }

      for(int i35 = 0; i35 < drag_.length; ++i35)
      {
                if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.drag_[i35], other.drag_[i35], epsilon)) return false;
      }

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.airspeed_, other.airspeed_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.beta_, other.beta_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.hagl_, other.hagl_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.hagl_rate_, other.hagl_rate_, epsilon)) return false;


      return true;
   }

   @Override
   public boolean equals(Object other)
   {
      if(other == null) return false;
      if(other == this) return true;
      if(!(other instanceof EstimatorInnovations)) return false;

      EstimatorInnovations otherMyClass = (EstimatorInnovations) other;

      if(this.timestamp_ != otherMyClass.timestamp_) return false;

      if(this.timestamp_sample_ != otherMyClass.timestamp_sample_) return false;

      for(int i37 = 0; i37 < gps_hvel_.length; ++i37)
      {
                if(this.gps_hvel_[i37] != otherMyClass.gps_hvel_[i37]) return false;

      }
      if(this.gps_vvel_ != otherMyClass.gps_vvel_) return false;

      for(int i39 = 0; i39 < gps_hpos_.length; ++i39)
      {
                if(this.gps_hpos_[i39] != otherMyClass.gps_hpos_[i39]) return false;

      }
      if(this.gps_vpos_ != otherMyClass.gps_vpos_) return false;

      for(int i41 = 0; i41 < ev_hvel_.length; ++i41)
      {
                if(this.ev_hvel_[i41] != otherMyClass.ev_hvel_[i41]) return false;

      }
      if(this.ev_vvel_ != otherMyClass.ev_vvel_) return false;

      for(int i43 = 0; i43 < ev_hpos_.length; ++i43)
      {
                if(this.ev_hpos_[i43] != otherMyClass.ev_hpos_[i43]) return false;

      }
      if(this.ev_vpos_ != otherMyClass.ev_vpos_) return false;

      if(this.rng_vpos_ != otherMyClass.rng_vpos_) return false;

      if(this.baro_vpos_ != otherMyClass.baro_vpos_) return false;

      for(int i45 = 0; i45 < aux_hvel_.length; ++i45)
      {
                if(this.aux_hvel_[i45] != otherMyClass.aux_hvel_[i45]) return false;

      }
      for(int i47 = 0; i47 < flow_.length; ++i47)
      {
                if(this.flow_[i47] != otherMyClass.flow_[i47]) return false;

      }
      if(this.heading_ != otherMyClass.heading_) return false;

      for(int i49 = 0; i49 < mag_field_.length; ++i49)
      {
                if(this.mag_field_[i49] != otherMyClass.mag_field_[i49]) return false;

      }
      for(int i51 = 0; i51 < gravity_.length; ++i51)
      {
                if(this.gravity_[i51] != otherMyClass.gravity_[i51]) return false;

      }
      for(int i53 = 0; i53 < drag_.length; ++i53)
      {
                if(this.drag_[i53] != otherMyClass.drag_[i53]) return false;

      }
      if(this.airspeed_ != otherMyClass.airspeed_) return false;

      if(this.beta_ != otherMyClass.beta_) return false;

      if(this.hagl_ != otherMyClass.hagl_) return false;

      if(this.hagl_rate_ != otherMyClass.hagl_rate_) return false;


      return true;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("EstimatorInnovations {");
      builder.append("timestamp=");
      builder.append(this.timestamp_);      builder.append(", ");
      builder.append("timestamp_sample=");
      builder.append(this.timestamp_sample_);      builder.append(", ");
      builder.append("gps_hvel=");
      builder.append(java.util.Arrays.toString(this.gps_hvel_));      builder.append(", ");
      builder.append("gps_vvel=");
      builder.append(this.gps_vvel_);      builder.append(", ");
      builder.append("gps_hpos=");
      builder.append(java.util.Arrays.toString(this.gps_hpos_));      builder.append(", ");
      builder.append("gps_vpos=");
      builder.append(this.gps_vpos_);      builder.append(", ");
      builder.append("ev_hvel=");
      builder.append(java.util.Arrays.toString(this.ev_hvel_));      builder.append(", ");
      builder.append("ev_vvel=");
      builder.append(this.ev_vvel_);      builder.append(", ");
      builder.append("ev_hpos=");
      builder.append(java.util.Arrays.toString(this.ev_hpos_));      builder.append(", ");
      builder.append("ev_vpos=");
      builder.append(this.ev_vpos_);      builder.append(", ");
      builder.append("rng_vpos=");
      builder.append(this.rng_vpos_);      builder.append(", ");
      builder.append("baro_vpos=");
      builder.append(this.baro_vpos_);      builder.append(", ");
      builder.append("aux_hvel=");
      builder.append(java.util.Arrays.toString(this.aux_hvel_));      builder.append(", ");
      builder.append("flow=");
      builder.append(java.util.Arrays.toString(this.flow_));      builder.append(", ");
      builder.append("heading=");
      builder.append(this.heading_);      builder.append(", ");
      builder.append("mag_field=");
      builder.append(java.util.Arrays.toString(this.mag_field_));      builder.append(", ");
      builder.append("gravity=");
      builder.append(java.util.Arrays.toString(this.gravity_));      builder.append(", ");
      builder.append("drag=");
      builder.append(java.util.Arrays.toString(this.drag_));      builder.append(", ");
      builder.append("airspeed=");
      builder.append(this.airspeed_);      builder.append(", ");
      builder.append("beta=");
      builder.append(this.beta_);      builder.append(", ");
      builder.append("hagl=");
      builder.append(this.hagl_);      builder.append(", ");
      builder.append("hagl_rate=");
      builder.append(this.hagl_rate_);
      builder.append("}");
      return builder.toString();
   }
}
