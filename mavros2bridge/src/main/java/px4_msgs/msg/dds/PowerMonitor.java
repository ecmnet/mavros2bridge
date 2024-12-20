package px4_msgs.msg.dds;

import us.ihmc.communication.packets.Packet;
import us.ihmc.euclid.interfaces.Settable;
import us.ihmc.euclid.interfaces.EpsilonComparable;
import java.util.function.Supplier;
import us.ihmc.pubsub.TopicDataType;

/**
       * power monitor message
       */
public class PowerMonitor extends Packet<PowerMonitor> implements Settable<PowerMonitor>, EpsilonComparable<PowerMonitor>
{
   /**
            * Time since system start (microseconds)
            */
   public long timestamp_;
   /**
            * Voltage in volts, 0 if unknown
            */
   public float voltage_v_;
   /**
            * Current in amperes, -1 if unknown
            */
   public float current_a_;
   /**
            * power in watts, -1 if unknown
            */
   public float power_w_;
   public short rconf_;
   public short rsv_;
   public short rbv_;
   public short rp_;
   public short rc_;
   public short rcal_;
   public short me_;
   public short al_;

   public PowerMonitor()
   {
   }

   public PowerMonitor(PowerMonitor other)
   {
      this();
      set(other);
   }

   public void set(PowerMonitor other)
   {
      timestamp_ = other.timestamp_;

      voltage_v_ = other.voltage_v_;

      current_a_ = other.current_a_;

      power_w_ = other.power_w_;

      rconf_ = other.rconf_;

      rsv_ = other.rsv_;

      rbv_ = other.rbv_;

      rp_ = other.rp_;

      rc_ = other.rc_;

      rcal_ = other.rcal_;

      me_ = other.me_;

      al_ = other.al_;

   }

   /**
            * Time since system start (microseconds)
            */
   public void setTimestamp(long timestamp)
   {
      timestamp_ = timestamp;
   }
   /**
            * Time since system start (microseconds)
            */
   public long getTimestamp()
   {
      return timestamp_;
   }

   /**
            * Voltage in volts, 0 if unknown
            */
   public void setVoltageV(float voltage_v)
   {
      voltage_v_ = voltage_v;
   }
   /**
            * Voltage in volts, 0 if unknown
            */
   public float getVoltageV()
   {
      return voltage_v_;
   }

   /**
            * Current in amperes, -1 if unknown
            */
   public void setCurrentA(float current_a)
   {
      current_a_ = current_a;
   }
   /**
            * Current in amperes, -1 if unknown
            */
   public float getCurrentA()
   {
      return current_a_;
   }

   /**
            * power in watts, -1 if unknown
            */
   public void setPowerW(float power_w)
   {
      power_w_ = power_w;
   }
   /**
            * power in watts, -1 if unknown
            */
   public float getPowerW()
   {
      return power_w_;
   }

   public void setRconf(short rconf)
   {
      rconf_ = rconf;
   }
   public short getRconf()
   {
      return rconf_;
   }

   public void setRsv(short rsv)
   {
      rsv_ = rsv;
   }
   public short getRsv()
   {
      return rsv_;
   }

   public void setRbv(short rbv)
   {
      rbv_ = rbv;
   }
   public short getRbv()
   {
      return rbv_;
   }

   public void setRp(short rp)
   {
      rp_ = rp;
   }
   public short getRp()
   {
      return rp_;
   }

   public void setRc(short rc)
   {
      rc_ = rc;
   }
   public short getRc()
   {
      return rc_;
   }

   public void setRcal(short rcal)
   {
      rcal_ = rcal;
   }
   public short getRcal()
   {
      return rcal_;
   }

   public void setMe(short me)
   {
      me_ = me;
   }
   public short getMe()
   {
      return me_;
   }

   public void setAl(short al)
   {
      al_ = al;
   }
   public short getAl()
   {
      return al_;
   }


   public static Supplier<PowerMonitorPubSubType> getPubSubType()
   {
      return PowerMonitorPubSubType::new;
   }

   @Override
   public Supplier<TopicDataType> getPubSubTypePacket()
   {
      return PowerMonitorPubSubType::new;
   }

   @Override
   public boolean epsilonEquals(PowerMonitor other, double epsilon)
   {
      if(other == null) return false;
      if(other == this) return true;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_, other.timestamp_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.voltage_v_, other.voltage_v_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.current_a_, other.current_a_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.power_w_, other.power_w_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.rconf_, other.rconf_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.rsv_, other.rsv_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.rbv_, other.rbv_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.rp_, other.rp_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.rc_, other.rc_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.rcal_, other.rcal_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.me_, other.me_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.al_, other.al_, epsilon)) return false;


      return true;
   }

   @Override
   public boolean equals(Object other)
   {
      if(other == null) return false;
      if(other == this) return true;
      if(!(other instanceof PowerMonitor)) return false;

      PowerMonitor otherMyClass = (PowerMonitor) other;

      if(this.timestamp_ != otherMyClass.timestamp_) return false;

      if(this.voltage_v_ != otherMyClass.voltage_v_) return false;

      if(this.current_a_ != otherMyClass.current_a_) return false;

      if(this.power_w_ != otherMyClass.power_w_) return false;

      if(this.rconf_ != otherMyClass.rconf_) return false;

      if(this.rsv_ != otherMyClass.rsv_) return false;

      if(this.rbv_ != otherMyClass.rbv_) return false;

      if(this.rp_ != otherMyClass.rp_) return false;

      if(this.rc_ != otherMyClass.rc_) return false;

      if(this.rcal_ != otherMyClass.rcal_) return false;

      if(this.me_ != otherMyClass.me_) return false;

      if(this.al_ != otherMyClass.al_) return false;


      return true;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("PowerMonitor {");
      builder.append("timestamp=");
      builder.append(this.timestamp_);      builder.append(", ");
      builder.append("voltage_v=");
      builder.append(this.voltage_v_);      builder.append(", ");
      builder.append("current_a=");
      builder.append(this.current_a_);      builder.append(", ");
      builder.append("power_w=");
      builder.append(this.power_w_);      builder.append(", ");
      builder.append("rconf=");
      builder.append(this.rconf_);      builder.append(", ");
      builder.append("rsv=");
      builder.append(this.rsv_);      builder.append(", ");
      builder.append("rbv=");
      builder.append(this.rbv_);      builder.append(", ");
      builder.append("rp=");
      builder.append(this.rp_);      builder.append(", ");
      builder.append("rc=");
      builder.append(this.rc_);      builder.append(", ");
      builder.append("rcal=");
      builder.append(this.rcal_);      builder.append(", ");
      builder.append("me=");
      builder.append(this.me_);      builder.append(", ");
      builder.append("al=");
      builder.append(this.al_);
      builder.append("}");
      return builder.toString();
   }
}
