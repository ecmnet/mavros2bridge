package px4_msgs.msg.dds;

import us.ihmc.communication.packets.Packet;
import us.ihmc.euclid.interfaces.Settable;
import us.ihmc.euclid.interfaces.EpsilonComparable;
import java.util.function.Supplier;
import us.ihmc.pubsub.TopicDataType;

public class AutotuneAttitudeControlStatus extends Packet<AutotuneAttitudeControlStatus> implements Settable<AutotuneAttitudeControlStatus>, EpsilonComparable<AutotuneAttitudeControlStatus>
{
   public static final byte STATE_IDLE = (byte) 0;
   public static final byte STATE_INIT = (byte) 1;
   public static final byte STATE_ROLL = (byte) 2;
   public static final byte STATE_ROLL_PAUSE = (byte) 3;
   public static final byte STATE_PITCH = (byte) 4;
   public static final byte STATE_PITCH_PAUSE = (byte) 5;
   public static final byte STATE_YAW = (byte) 6;
   public static final byte STATE_YAW_PAUSE = (byte) 7;
   public static final byte STATE_VERIFICATION = (byte) 8;
   public static final byte STATE_APPLY = (byte) 9;
   public static final byte STATE_TEST = (byte) 10;
   public static final byte STATE_COMPLETE = (byte) 11;
   public static final byte STATE_FAIL = (byte) 12;
   public static final byte STATE_WAIT_FOR_DISARM = (byte) 13;
   /**
            * time since system start (microseconds)
            */
   public long timestamp_;
   /**
            * coefficients of the identified discrete-time model
            */
   public float[] coeff_;
   /**
            * coefficients' variance of the identified discrete-time model
            */
   public float[] coeff_var_;
   /**
            * fitness of the parameter estimate
            */
   public float fitness_;
   public float innov_;
   public float dt_model_;
   public float kc_;
   public float ki_;
   public float kd_;
   public float kff_;
   public float att_p_;
   public float[] rate_sp_;
   public float u_filt_;
   public float y_filt_;
   public byte state_;

   public AutotuneAttitudeControlStatus()
   {
      coeff_ = new float[5];

      coeff_var_ = new float[5];

      rate_sp_ = new float[3];

   }

   public AutotuneAttitudeControlStatus(AutotuneAttitudeControlStatus other)
   {
      this();
      set(other);
   }

   public void set(AutotuneAttitudeControlStatus other)
   {
      timestamp_ = other.timestamp_;

      for(int i1 = 0; i1 < coeff_.length; ++i1)
      {
            coeff_[i1] = other.coeff_[i1];

      }

      for(int i3 = 0; i3 < coeff_var_.length; ++i3)
      {
            coeff_var_[i3] = other.coeff_var_[i3];

      }

      fitness_ = other.fitness_;

      innov_ = other.innov_;

      dt_model_ = other.dt_model_;

      kc_ = other.kc_;

      ki_ = other.ki_;

      kd_ = other.kd_;

      kff_ = other.kff_;

      att_p_ = other.att_p_;

      for(int i5 = 0; i5 < rate_sp_.length; ++i5)
      {
            rate_sp_[i5] = other.rate_sp_[i5];

      }

      u_filt_ = other.u_filt_;

      y_filt_ = other.y_filt_;

      state_ = other.state_;

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
            * coefficients of the identified discrete-time model
            */
   public float[] getCoeff()
   {
      return coeff_;
   }


   /**
            * coefficients' variance of the identified discrete-time model
            */
   public float[] getCoeffVar()
   {
      return coeff_var_;
   }

   /**
            * fitness of the parameter estimate
            */
   public void setFitness(float fitness)
   {
      fitness_ = fitness;
   }
   /**
            * fitness of the parameter estimate
            */
   public float getFitness()
   {
      return fitness_;
   }

   public void setInnov(float innov)
   {
      innov_ = innov;
   }
   public float getInnov()
   {
      return innov_;
   }

   public void setDtModel(float dt_model)
   {
      dt_model_ = dt_model;
   }
   public float getDtModel()
   {
      return dt_model_;
   }

   public void setKc(float kc)
   {
      kc_ = kc;
   }
   public float getKc()
   {
      return kc_;
   }

   public void setKi(float ki)
   {
      ki_ = ki;
   }
   public float getKi()
   {
      return ki_;
   }

   public void setKd(float kd)
   {
      kd_ = kd;
   }
   public float getKd()
   {
      return kd_;
   }

   public void setKff(float kff)
   {
      kff_ = kff;
   }
   public float getKff()
   {
      return kff_;
   }

   public void setAttP(float att_p)
   {
      att_p_ = att_p;
   }
   public float getAttP()
   {
      return att_p_;
   }


   public float[] getRateSp()
   {
      return rate_sp_;
   }

   public void setUFilt(float u_filt)
   {
      u_filt_ = u_filt;
   }
   public float getUFilt()
   {
      return u_filt_;
   }

   public void setYFilt(float y_filt)
   {
      y_filt_ = y_filt;
   }
   public float getYFilt()
   {
      return y_filt_;
   }

   public void setState(byte state)
   {
      state_ = state;
   }
   public byte getState()
   {
      return state_;
   }


   public static Supplier<AutotuneAttitudeControlStatusPubSubType> getPubSubType()
   {
      return AutotuneAttitudeControlStatusPubSubType::new;
   }

   @Override
   public Supplier<TopicDataType> getPubSubTypePacket()
   {
      return AutotuneAttitudeControlStatusPubSubType::new;
   }

   @Override
   public boolean epsilonEquals(AutotuneAttitudeControlStatus other, double epsilon)
   {
      if(other == null) return false;
      if(other == this) return true;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_, other.timestamp_, epsilon)) return false;

      for(int i7 = 0; i7 < coeff_.length; ++i7)
      {
                if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.coeff_[i7], other.coeff_[i7], epsilon)) return false;
      }

      for(int i9 = 0; i9 < coeff_var_.length; ++i9)
      {
                if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.coeff_var_[i9], other.coeff_var_[i9], epsilon)) return false;
      }

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.fitness_, other.fitness_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.innov_, other.innov_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.dt_model_, other.dt_model_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.kc_, other.kc_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.ki_, other.ki_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.kd_, other.kd_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.kff_, other.kff_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.att_p_, other.att_p_, epsilon)) return false;

      for(int i11 = 0; i11 < rate_sp_.length; ++i11)
      {
                if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.rate_sp_[i11], other.rate_sp_[i11], epsilon)) return false;
      }

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.u_filt_, other.u_filt_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.y_filt_, other.y_filt_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.state_, other.state_, epsilon)) return false;


      return true;
   }

   @Override
   public boolean equals(Object other)
   {
      if(other == null) return false;
      if(other == this) return true;
      if(!(other instanceof AutotuneAttitudeControlStatus)) return false;

      AutotuneAttitudeControlStatus otherMyClass = (AutotuneAttitudeControlStatus) other;

      if(this.timestamp_ != otherMyClass.timestamp_) return false;

      for(int i13 = 0; i13 < coeff_.length; ++i13)
      {
                if(this.coeff_[i13] != otherMyClass.coeff_[i13]) return false;

      }
      for(int i15 = 0; i15 < coeff_var_.length; ++i15)
      {
                if(this.coeff_var_[i15] != otherMyClass.coeff_var_[i15]) return false;

      }
      if(this.fitness_ != otherMyClass.fitness_) return false;

      if(this.innov_ != otherMyClass.innov_) return false;

      if(this.dt_model_ != otherMyClass.dt_model_) return false;

      if(this.kc_ != otherMyClass.kc_) return false;

      if(this.ki_ != otherMyClass.ki_) return false;

      if(this.kd_ != otherMyClass.kd_) return false;

      if(this.kff_ != otherMyClass.kff_) return false;

      if(this.att_p_ != otherMyClass.att_p_) return false;

      for(int i17 = 0; i17 < rate_sp_.length; ++i17)
      {
                if(this.rate_sp_[i17] != otherMyClass.rate_sp_[i17]) return false;

      }
      if(this.u_filt_ != otherMyClass.u_filt_) return false;

      if(this.y_filt_ != otherMyClass.y_filt_) return false;

      if(this.state_ != otherMyClass.state_) return false;


      return true;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("AutotuneAttitudeControlStatus {");
      builder.append("timestamp=");
      builder.append(this.timestamp_);      builder.append(", ");
      builder.append("coeff=");
      builder.append(java.util.Arrays.toString(this.coeff_));      builder.append(", ");
      builder.append("coeff_var=");
      builder.append(java.util.Arrays.toString(this.coeff_var_));      builder.append(", ");
      builder.append("fitness=");
      builder.append(this.fitness_);      builder.append(", ");
      builder.append("innov=");
      builder.append(this.innov_);      builder.append(", ");
      builder.append("dt_model=");
      builder.append(this.dt_model_);      builder.append(", ");
      builder.append("kc=");
      builder.append(this.kc_);      builder.append(", ");
      builder.append("ki=");
      builder.append(this.ki_);      builder.append(", ");
      builder.append("kd=");
      builder.append(this.kd_);      builder.append(", ");
      builder.append("kff=");
      builder.append(this.kff_);      builder.append(", ");
      builder.append("att_p=");
      builder.append(this.att_p_);      builder.append(", ");
      builder.append("rate_sp=");
      builder.append(java.util.Arrays.toString(this.rate_sp_));      builder.append(", ");
      builder.append("u_filt=");
      builder.append(this.u_filt_);      builder.append(", ");
      builder.append("y_filt=");
      builder.append(this.y_filt_);      builder.append(", ");
      builder.append("state=");
      builder.append(this.state_);
      builder.append("}");
      return builder.toString();
   }
}
