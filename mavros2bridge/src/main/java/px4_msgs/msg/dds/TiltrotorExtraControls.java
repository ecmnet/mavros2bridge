package px4_msgs.msg.dds;

import us.ihmc.communication.packets.Packet;
import us.ihmc.euclid.interfaces.Settable;
import us.ihmc.euclid.interfaces.EpsilonComparable;
import java.util.function.Supplier;
import us.ihmc.pubsub.TopicDataType;

public class TiltrotorExtraControls extends Packet<TiltrotorExtraControls> implements Settable<TiltrotorExtraControls>, EpsilonComparable<TiltrotorExtraControls>
{
   /**
            * time since system start (microseconds)
            */
   public long timestamp_;
   /**
            * Collective tilt angle of motors of tiltrotor, 0: vertical, 1: horizontal [0, 1]
            */
   public float collective_tilt_normalized_setpoint_;
   /**
            * Collective thrust setpoint [0, 1]
            */
   public float collective_thrust_normalized_setpoint_;

   public TiltrotorExtraControls()
   {
   }

   public TiltrotorExtraControls(TiltrotorExtraControls other)
   {
      this();
      set(other);
   }

   public void set(TiltrotorExtraControls other)
   {
      timestamp_ = other.timestamp_;

      collective_tilt_normalized_setpoint_ = other.collective_tilt_normalized_setpoint_;

      collective_thrust_normalized_setpoint_ = other.collective_thrust_normalized_setpoint_;

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
            * Collective tilt angle of motors of tiltrotor, 0: vertical, 1: horizontal [0, 1]
            */
   public void setCollectiveTiltNormalizedSetpoint(float collective_tilt_normalized_setpoint)
   {
      collective_tilt_normalized_setpoint_ = collective_tilt_normalized_setpoint;
   }
   /**
            * Collective tilt angle of motors of tiltrotor, 0: vertical, 1: horizontal [0, 1]
            */
   public float getCollectiveTiltNormalizedSetpoint()
   {
      return collective_tilt_normalized_setpoint_;
   }

   /**
            * Collective thrust setpoint [0, 1]
            */
   public void setCollectiveThrustNormalizedSetpoint(float collective_thrust_normalized_setpoint)
   {
      collective_thrust_normalized_setpoint_ = collective_thrust_normalized_setpoint;
   }
   /**
            * Collective thrust setpoint [0, 1]
            */
   public float getCollectiveThrustNormalizedSetpoint()
   {
      return collective_thrust_normalized_setpoint_;
   }


   public static Supplier<TiltrotorExtraControlsPubSubType> getPubSubType()
   {
      return TiltrotorExtraControlsPubSubType::new;
   }

   @Override
   public Supplier<TopicDataType> getPubSubTypePacket()
   {
      return TiltrotorExtraControlsPubSubType::new;
   }

   @Override
   public boolean epsilonEquals(TiltrotorExtraControls other, double epsilon)
   {
      if(other == null) return false;
      if(other == this) return true;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_, other.timestamp_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.collective_tilt_normalized_setpoint_, other.collective_tilt_normalized_setpoint_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.collective_thrust_normalized_setpoint_, other.collective_thrust_normalized_setpoint_, epsilon)) return false;


      return true;
   }

   @Override
   public boolean equals(Object other)
   {
      if(other == null) return false;
      if(other == this) return true;
      if(!(other instanceof TiltrotorExtraControls)) return false;

      TiltrotorExtraControls otherMyClass = (TiltrotorExtraControls) other;

      if(this.timestamp_ != otherMyClass.timestamp_) return false;

      if(this.collective_tilt_normalized_setpoint_ != otherMyClass.collective_tilt_normalized_setpoint_) return false;

      if(this.collective_thrust_normalized_setpoint_ != otherMyClass.collective_thrust_normalized_setpoint_) return false;


      return true;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("TiltrotorExtraControls {");
      builder.append("timestamp=");
      builder.append(this.timestamp_);      builder.append(", ");
      builder.append("collective_tilt_normalized_setpoint=");
      builder.append(this.collective_tilt_normalized_setpoint_);      builder.append(", ");
      builder.append("collective_thrust_normalized_setpoint=");
      builder.append(this.collective_thrust_normalized_setpoint_);
      builder.append("}");
      return builder.toString();
   }
}
