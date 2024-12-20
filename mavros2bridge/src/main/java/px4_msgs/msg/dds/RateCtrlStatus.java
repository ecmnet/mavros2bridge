package px4_msgs.msg.dds;

import us.ihmc.communication.packets.Packet;
import us.ihmc.euclid.interfaces.Settable;
import us.ihmc.euclid.interfaces.EpsilonComparable;
import java.util.function.Supplier;
import us.ihmc.pubsub.TopicDataType;

public class RateCtrlStatus extends Packet<RateCtrlStatus> implements Settable<RateCtrlStatus>, EpsilonComparable<RateCtrlStatus>
{
   /**
            * time since system start (microseconds)
            */
   public long timestamp_;
   /**
            * rate controller integrator status
            */
   public float rollspeed_integ_;
   public float pitchspeed_integ_;
   public float yawspeed_integ_;
   /**
            * FW only and optional
            */
   public float wheel_rate_integ_;

   public RateCtrlStatus()
   {
   }

   public RateCtrlStatus(RateCtrlStatus other)
   {
      this();
      set(other);
   }

   public void set(RateCtrlStatus other)
   {
      timestamp_ = other.timestamp_;

      rollspeed_integ_ = other.rollspeed_integ_;

      pitchspeed_integ_ = other.pitchspeed_integ_;

      yawspeed_integ_ = other.yawspeed_integ_;

      wheel_rate_integ_ = other.wheel_rate_integ_;

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
            * rate controller integrator status
            */
   public void setRollspeedInteg(float rollspeed_integ)
   {
      rollspeed_integ_ = rollspeed_integ;
   }
   /**
            * rate controller integrator status
            */
   public float getRollspeedInteg()
   {
      return rollspeed_integ_;
   }

   public void setPitchspeedInteg(float pitchspeed_integ)
   {
      pitchspeed_integ_ = pitchspeed_integ;
   }
   public float getPitchspeedInteg()
   {
      return pitchspeed_integ_;
   }

   public void setYawspeedInteg(float yawspeed_integ)
   {
      yawspeed_integ_ = yawspeed_integ;
   }
   public float getYawspeedInteg()
   {
      return yawspeed_integ_;
   }

   /**
            * FW only and optional
            */
   public void setWheelRateInteg(float wheel_rate_integ)
   {
      wheel_rate_integ_ = wheel_rate_integ;
   }
   /**
            * FW only and optional
            */
   public float getWheelRateInteg()
   {
      return wheel_rate_integ_;
   }


   public static Supplier<RateCtrlStatusPubSubType> getPubSubType()
   {
      return RateCtrlStatusPubSubType::new;
   }

   @Override
   public Supplier<TopicDataType> getPubSubTypePacket()
   {
      return RateCtrlStatusPubSubType::new;
   }

   @Override
   public boolean epsilonEquals(RateCtrlStatus other, double epsilon)
   {
      if(other == null) return false;
      if(other == this) return true;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_, other.timestamp_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.rollspeed_integ_, other.rollspeed_integ_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.pitchspeed_integ_, other.pitchspeed_integ_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.yawspeed_integ_, other.yawspeed_integ_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.wheel_rate_integ_, other.wheel_rate_integ_, epsilon)) return false;


      return true;
   }

   @Override
   public boolean equals(Object other)
   {
      if(other == null) return false;
      if(other == this) return true;
      if(!(other instanceof RateCtrlStatus)) return false;

      RateCtrlStatus otherMyClass = (RateCtrlStatus) other;

      if(this.timestamp_ != otherMyClass.timestamp_) return false;

      if(this.rollspeed_integ_ != otherMyClass.rollspeed_integ_) return false;

      if(this.pitchspeed_integ_ != otherMyClass.pitchspeed_integ_) return false;

      if(this.yawspeed_integ_ != otherMyClass.yawspeed_integ_) return false;

      if(this.wheel_rate_integ_ != otherMyClass.wheel_rate_integ_) return false;


      return true;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("RateCtrlStatus {");
      builder.append("timestamp=");
      builder.append(this.timestamp_);      builder.append(", ");
      builder.append("rollspeed_integ=");
      builder.append(this.rollspeed_integ_);      builder.append(", ");
      builder.append("pitchspeed_integ=");
      builder.append(this.pitchspeed_integ_);      builder.append(", ");
      builder.append("yawspeed_integ=");
      builder.append(this.yawspeed_integ_);      builder.append(", ");
      builder.append("wheel_rate_integ=");
      builder.append(this.wheel_rate_integ_);
      builder.append("}");
      return builder.toString();
   }
}
