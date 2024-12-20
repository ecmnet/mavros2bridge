package px4_msgs.msg.dds;

import us.ihmc.communication.packets.Packet;
import us.ihmc.euclid.interfaces.Settable;
import us.ihmc.euclid.interfaces.EpsilonComparable;
import java.util.function.Supplier;
import us.ihmc.pubsub.TopicDataType;

/**
       * Position and (optional) heading setpoints with corresponding speed constraints
       * Setpoints are intended as inputs to position and heading smoothers, respectively
       * Setpoints do not need to be kinematically consistent
       * Optional heading setpoints may be specified as controlled by the respective flag
       * Unset optional setpoints are not controlled
       * Unset optional constraints default to vehicle specifications
       */
public class GotoSetpoint extends Packet<GotoSetpoint> implements Settable<GotoSetpoint>, EpsilonComparable<GotoSetpoint>
{
   /**
            * time since system start (microseconds)
            */
   public long timestamp_;
   /**
            * setpoints
            * [m] NED local world frame
            */
   public float[] position_;
   /**
            * true if heading is to be controlled
            */
   public boolean flag_control_heading_;
   /**
            * (optional) [rad] [-pi,pi] from North
            */
   public float heading_;
   /**
            * constraints
            * true if setting a non-default horizontal speed limit
            */
   public boolean flag_set_max_horizontal_speed_;
   /**
            * (optional) [m/s] maximum speed (absolute) in the NE-plane
            */
   public float max_horizontal_speed_;
   /**
            * true if setting a non-default vertical speed limit
            */
   public boolean flag_set_max_vertical_speed_;
   /**
            * (optional) [m/s] maximum speed (absolute) in the D-axis
            */
   public float max_vertical_speed_;
   /**
            * true if setting a non-default heading rate limit
            */
   public boolean flag_set_max_heading_rate_;
   /**
            * (optional) [rad/s] maximum heading rate (absolute)
            */
   public float max_heading_rate_;

   public GotoSetpoint()
   {
      position_ = new float[3];

   }

   public GotoSetpoint(GotoSetpoint other)
   {
      this();
      set(other);
   }

   public void set(GotoSetpoint other)
   {
      timestamp_ = other.timestamp_;

      for(int i1 = 0; i1 < position_.length; ++i1)
      {
            position_[i1] = other.position_[i1];

      }

      flag_control_heading_ = other.flag_control_heading_;

      heading_ = other.heading_;

      flag_set_max_horizontal_speed_ = other.flag_set_max_horizontal_speed_;

      max_horizontal_speed_ = other.max_horizontal_speed_;

      flag_set_max_vertical_speed_ = other.flag_set_max_vertical_speed_;

      max_vertical_speed_ = other.max_vertical_speed_;

      flag_set_max_heading_rate_ = other.flag_set_max_heading_rate_;

      max_heading_rate_ = other.max_heading_rate_;

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
            * setpoints
            * [m] NED local world frame
            */
   public float[] getPosition()
   {
      return position_;
   }

   /**
            * true if heading is to be controlled
            */
   public void setFlagControlHeading(boolean flag_control_heading)
   {
      flag_control_heading_ = flag_control_heading;
   }
   /**
            * true if heading is to be controlled
            */
   public boolean getFlagControlHeading()
   {
      return flag_control_heading_;
   }

   /**
            * (optional) [rad] [-pi,pi] from North
            */
   public void setHeading(float heading)
   {
      heading_ = heading;
   }
   /**
            * (optional) [rad] [-pi,pi] from North
            */
   public float getHeading()
   {
      return heading_;
   }

   /**
            * constraints
            * true if setting a non-default horizontal speed limit
            */
   public void setFlagSetMaxHorizontalSpeed(boolean flag_set_max_horizontal_speed)
   {
      flag_set_max_horizontal_speed_ = flag_set_max_horizontal_speed;
   }
   /**
            * constraints
            * true if setting a non-default horizontal speed limit
            */
   public boolean getFlagSetMaxHorizontalSpeed()
   {
      return flag_set_max_horizontal_speed_;
   }

   /**
            * (optional) [m/s] maximum speed (absolute) in the NE-plane
            */
   public void setMaxHorizontalSpeed(float max_horizontal_speed)
   {
      max_horizontal_speed_ = max_horizontal_speed;
   }
   /**
            * (optional) [m/s] maximum speed (absolute) in the NE-plane
            */
   public float getMaxHorizontalSpeed()
   {
      return max_horizontal_speed_;
   }

   /**
            * true if setting a non-default vertical speed limit
            */
   public void setFlagSetMaxVerticalSpeed(boolean flag_set_max_vertical_speed)
   {
      flag_set_max_vertical_speed_ = flag_set_max_vertical_speed;
   }
   /**
            * true if setting a non-default vertical speed limit
            */
   public boolean getFlagSetMaxVerticalSpeed()
   {
      return flag_set_max_vertical_speed_;
   }

   /**
            * (optional) [m/s] maximum speed (absolute) in the D-axis
            */
   public void setMaxVerticalSpeed(float max_vertical_speed)
   {
      max_vertical_speed_ = max_vertical_speed;
   }
   /**
            * (optional) [m/s] maximum speed (absolute) in the D-axis
            */
   public float getMaxVerticalSpeed()
   {
      return max_vertical_speed_;
   }

   /**
            * true if setting a non-default heading rate limit
            */
   public void setFlagSetMaxHeadingRate(boolean flag_set_max_heading_rate)
   {
      flag_set_max_heading_rate_ = flag_set_max_heading_rate;
   }
   /**
            * true if setting a non-default heading rate limit
            */
   public boolean getFlagSetMaxHeadingRate()
   {
      return flag_set_max_heading_rate_;
   }

   /**
            * (optional) [rad/s] maximum heading rate (absolute)
            */
   public void setMaxHeadingRate(float max_heading_rate)
   {
      max_heading_rate_ = max_heading_rate;
   }
   /**
            * (optional) [rad/s] maximum heading rate (absolute)
            */
   public float getMaxHeadingRate()
   {
      return max_heading_rate_;
   }


   public static Supplier<GotoSetpointPubSubType> getPubSubType()
   {
      return GotoSetpointPubSubType::new;
   }

   @Override
   public Supplier<TopicDataType> getPubSubTypePacket()
   {
      return GotoSetpointPubSubType::new;
   }

   @Override
   public boolean epsilonEquals(GotoSetpoint other, double epsilon)
   {
      if(other == null) return false;
      if(other == this) return true;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_, other.timestamp_, epsilon)) return false;

      for(int i3 = 0; i3 < position_.length; ++i3)
      {
                if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.position_[i3], other.position_[i3], epsilon)) return false;
      }

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.flag_control_heading_, other.flag_control_heading_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.heading_, other.heading_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.flag_set_max_horizontal_speed_, other.flag_set_max_horizontal_speed_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.max_horizontal_speed_, other.max_horizontal_speed_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.flag_set_max_vertical_speed_, other.flag_set_max_vertical_speed_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.max_vertical_speed_, other.max_vertical_speed_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.flag_set_max_heading_rate_, other.flag_set_max_heading_rate_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.max_heading_rate_, other.max_heading_rate_, epsilon)) return false;


      return true;
   }

   @Override
   public boolean equals(Object other)
   {
      if(other == null) return false;
      if(other == this) return true;
      if(!(other instanceof GotoSetpoint)) return false;

      GotoSetpoint otherMyClass = (GotoSetpoint) other;

      if(this.timestamp_ != otherMyClass.timestamp_) return false;

      for(int i5 = 0; i5 < position_.length; ++i5)
      {
                if(this.position_[i5] != otherMyClass.position_[i5]) return false;

      }
      if(this.flag_control_heading_ != otherMyClass.flag_control_heading_) return false;

      if(this.heading_ != otherMyClass.heading_) return false;

      if(this.flag_set_max_horizontal_speed_ != otherMyClass.flag_set_max_horizontal_speed_) return false;

      if(this.max_horizontal_speed_ != otherMyClass.max_horizontal_speed_) return false;

      if(this.flag_set_max_vertical_speed_ != otherMyClass.flag_set_max_vertical_speed_) return false;

      if(this.max_vertical_speed_ != otherMyClass.max_vertical_speed_) return false;

      if(this.flag_set_max_heading_rate_ != otherMyClass.flag_set_max_heading_rate_) return false;

      if(this.max_heading_rate_ != otherMyClass.max_heading_rate_) return false;


      return true;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("GotoSetpoint {");
      builder.append("timestamp=");
      builder.append(this.timestamp_);      builder.append(", ");
      builder.append("position=");
      builder.append(java.util.Arrays.toString(this.position_));      builder.append(", ");
      builder.append("flag_control_heading=");
      builder.append(this.flag_control_heading_);      builder.append(", ");
      builder.append("heading=");
      builder.append(this.heading_);      builder.append(", ");
      builder.append("flag_set_max_horizontal_speed=");
      builder.append(this.flag_set_max_horizontal_speed_);      builder.append(", ");
      builder.append("max_horizontal_speed=");
      builder.append(this.max_horizontal_speed_);      builder.append(", ");
      builder.append("flag_set_max_vertical_speed=");
      builder.append(this.flag_set_max_vertical_speed_);      builder.append(", ");
      builder.append("max_vertical_speed=");
      builder.append(this.max_vertical_speed_);      builder.append(", ");
      builder.append("flag_set_max_heading_rate=");
      builder.append(this.flag_set_max_heading_rate_);      builder.append(", ");
      builder.append("max_heading_rate=");
      builder.append(this.max_heading_rate_);
      builder.append("}");
      return builder.toString();
   }
}
