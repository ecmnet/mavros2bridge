package px4_msgs.msg.dds;

import us.ihmc.communication.packets.Packet;
import us.ihmc.euclid.interfaces.Settable;
import us.ihmc.euclid.interfaces.EpsilonComparable;
import java.util.function.Supplier;
import us.ihmc.pubsub.TopicDataType;

/**
       * Any of the channels may not be available and be set to NaN
       * to indicate that it does not contain valid data.
       */
public class ManualControlSetpoint extends Packet<ManualControlSetpoint> implements Settable<ManualControlSetpoint>, EpsilonComparable<ManualControlSetpoint>
{
   public static final byte SOURCE_UNKNOWN = (byte) 0;
   /**
          * radio control (input_rc)
          */
   public static final byte SOURCE_RC = (byte) 1;
   /**
          * mavlink instance 0
          */
   public static final byte SOURCE_MAVLINK_0 = (byte) 2;
   /**
          * mavlink instance 1
          */
   public static final byte SOURCE_MAVLINK_1 = (byte) 3;
   /**
          * mavlink instance 2
          */
   public static final byte SOURCE_MAVLINK_2 = (byte) 4;
   /**
          * mavlink instance 3
          */
   public static final byte SOURCE_MAVLINK_3 = (byte) 5;
   /**
          * mavlink instance 4
          */
   public static final byte SOURCE_MAVLINK_4 = (byte) 6;
   /**
          * mavlink instance 5
          */
   public static final byte SOURCE_MAVLINK_5 = (byte) 7;
   /**
            * time since system start (microseconds)
            */
   public long timestamp_;
   /**
            * the timestamp of the raw data (microseconds)
            */
   public long timestamp_sample_;
   public boolean valid_;
   public byte data_source_;
   /**
            * Stick positions [-1,1]
            * on a common RC mode 1/2/3/4 remote/joystick the stick deflection: -1 is down/left, 1 is up/right
            * Note: QGC sends throttle/z in range [0,1000] - [0,1]. The MAVLink input conversion [0,1] to [-1,1] is at the moment kept backwards compatible.
            * Positive values are generally used for:
            * move right,   positive roll rotation,  right side down
            */
   public float roll_;
   /**
            * move forward, negative pitch rotation, nose down
            */
   public float pitch_;
   /**
            * positive yaw rotation,   clockwise when seen top down
            */
   public float yaw_;
   /**
            * move up,      positive thrust,         -1 is minimum available 0% or -100% +1 is 100% thrust
            */
   public float throttle_;
   /**
            * position of flaps switch/knob/lever [-1, 1]
            */
   public float flaps_;
   public float aux1_;
   public float aux2_;
   public float aux3_;
   public float aux4_;
   public float aux5_;
   public float aux6_;
   public boolean sticks_moving_;
   /**
            * From uint16 buttons field of Mavlink manual_control message
            */
   public int buttons_;

   public ManualControlSetpoint()
   {
   }

   public ManualControlSetpoint(ManualControlSetpoint other)
   {
      this();
      set(other);
   }

   public void set(ManualControlSetpoint other)
   {
      timestamp_ = other.timestamp_;

      timestamp_sample_ = other.timestamp_sample_;

      valid_ = other.valid_;

      data_source_ = other.data_source_;

      roll_ = other.roll_;

      pitch_ = other.pitch_;

      yaw_ = other.yaw_;

      throttle_ = other.throttle_;

      flaps_ = other.flaps_;

      aux1_ = other.aux1_;

      aux2_ = other.aux2_;

      aux3_ = other.aux3_;

      aux4_ = other.aux4_;

      aux5_ = other.aux5_;

      aux6_ = other.aux6_;

      sticks_moving_ = other.sticks_moving_;

      buttons_ = other.buttons_;

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

   public void setValid(boolean valid)
   {
      valid_ = valid;
   }
   public boolean getValid()
   {
      return valid_;
   }

   public void setDataSource(byte data_source)
   {
      data_source_ = data_source;
   }
   public byte getDataSource()
   {
      return data_source_;
   }

   /**
            * Stick positions [-1,1]
            * on a common RC mode 1/2/3/4 remote/joystick the stick deflection: -1 is down/left, 1 is up/right
            * Note: QGC sends throttle/z in range [0,1000] - [0,1]. The MAVLink input conversion [0,1] to [-1,1] is at the moment kept backwards compatible.
            * Positive values are generally used for:
            * move right,   positive roll rotation,  right side down
            */
   public void setRoll(float roll)
   {
      roll_ = roll;
   }
   /**
            * Stick positions [-1,1]
            * on a common RC mode 1/2/3/4 remote/joystick the stick deflection: -1 is down/left, 1 is up/right
            * Note: QGC sends throttle/z in range [0,1000] - [0,1]. The MAVLink input conversion [0,1] to [-1,1] is at the moment kept backwards compatible.
            * Positive values are generally used for:
            * move right,   positive roll rotation,  right side down
            */
   public float getRoll()
   {
      return roll_;
   }

   /**
            * move forward, negative pitch rotation, nose down
            */
   public void setPitch(float pitch)
   {
      pitch_ = pitch;
   }
   /**
            * move forward, negative pitch rotation, nose down
            */
   public float getPitch()
   {
      return pitch_;
   }

   /**
            * positive yaw rotation,   clockwise when seen top down
            */
   public void setYaw(float yaw)
   {
      yaw_ = yaw;
   }
   /**
            * positive yaw rotation,   clockwise when seen top down
            */
   public float getYaw()
   {
      return yaw_;
   }

   /**
            * move up,      positive thrust,         -1 is minimum available 0% or -100% +1 is 100% thrust
            */
   public void setThrottle(float throttle)
   {
      throttle_ = throttle;
   }
   /**
            * move up,      positive thrust,         -1 is minimum available 0% or -100% +1 is 100% thrust
            */
   public float getThrottle()
   {
      return throttle_;
   }

   /**
            * position of flaps switch/knob/lever [-1, 1]
            */
   public void setFlaps(float flaps)
   {
      flaps_ = flaps;
   }
   /**
            * position of flaps switch/knob/lever [-1, 1]
            */
   public float getFlaps()
   {
      return flaps_;
   }

   public void setAux1(float aux1)
   {
      aux1_ = aux1;
   }
   public float getAux1()
   {
      return aux1_;
   }

   public void setAux2(float aux2)
   {
      aux2_ = aux2;
   }
   public float getAux2()
   {
      return aux2_;
   }

   public void setAux3(float aux3)
   {
      aux3_ = aux3;
   }
   public float getAux3()
   {
      return aux3_;
   }

   public void setAux4(float aux4)
   {
      aux4_ = aux4;
   }
   public float getAux4()
   {
      return aux4_;
   }

   public void setAux5(float aux5)
   {
      aux5_ = aux5;
   }
   public float getAux5()
   {
      return aux5_;
   }

   public void setAux6(float aux6)
   {
      aux6_ = aux6;
   }
   public float getAux6()
   {
      return aux6_;
   }

   public void setSticksMoving(boolean sticks_moving)
   {
      sticks_moving_ = sticks_moving;
   }
   public boolean getSticksMoving()
   {
      return sticks_moving_;
   }

   /**
            * From uint16 buttons field of Mavlink manual_control message
            */
   public void setButtons(int buttons)
   {
      buttons_ = buttons;
   }
   /**
            * From uint16 buttons field of Mavlink manual_control message
            */
   public int getButtons()
   {
      return buttons_;
   }


   public static Supplier<ManualControlSetpointPubSubType> getPubSubType()
   {
      return ManualControlSetpointPubSubType::new;
   }

   @Override
   public Supplier<TopicDataType> getPubSubTypePacket()
   {
      return ManualControlSetpointPubSubType::new;
   }

   @Override
   public boolean epsilonEquals(ManualControlSetpoint other, double epsilon)
   {
      if(other == null) return false;
      if(other == this) return true;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_, other.timestamp_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_sample_, other.timestamp_sample_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.valid_, other.valid_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.data_source_, other.data_source_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.roll_, other.roll_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.pitch_, other.pitch_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.yaw_, other.yaw_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.throttle_, other.throttle_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.flaps_, other.flaps_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.aux1_, other.aux1_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.aux2_, other.aux2_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.aux3_, other.aux3_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.aux4_, other.aux4_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.aux5_, other.aux5_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.aux6_, other.aux6_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.sticks_moving_, other.sticks_moving_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.buttons_, other.buttons_, epsilon)) return false;


      return true;
   }

   @Override
   public boolean equals(Object other)
   {
      if(other == null) return false;
      if(other == this) return true;
      if(!(other instanceof ManualControlSetpoint)) return false;

      ManualControlSetpoint otherMyClass = (ManualControlSetpoint) other;

      if(this.timestamp_ != otherMyClass.timestamp_) return false;

      if(this.timestamp_sample_ != otherMyClass.timestamp_sample_) return false;

      if(this.valid_ != otherMyClass.valid_) return false;

      if(this.data_source_ != otherMyClass.data_source_) return false;

      if(this.roll_ != otherMyClass.roll_) return false;

      if(this.pitch_ != otherMyClass.pitch_) return false;

      if(this.yaw_ != otherMyClass.yaw_) return false;

      if(this.throttle_ != otherMyClass.throttle_) return false;

      if(this.flaps_ != otherMyClass.flaps_) return false;

      if(this.aux1_ != otherMyClass.aux1_) return false;

      if(this.aux2_ != otherMyClass.aux2_) return false;

      if(this.aux3_ != otherMyClass.aux3_) return false;

      if(this.aux4_ != otherMyClass.aux4_) return false;

      if(this.aux5_ != otherMyClass.aux5_) return false;

      if(this.aux6_ != otherMyClass.aux6_) return false;

      if(this.sticks_moving_ != otherMyClass.sticks_moving_) return false;

      if(this.buttons_ != otherMyClass.buttons_) return false;


      return true;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("ManualControlSetpoint {");
      builder.append("timestamp=");
      builder.append(this.timestamp_);      builder.append(", ");
      builder.append("timestamp_sample=");
      builder.append(this.timestamp_sample_);      builder.append(", ");
      builder.append("valid=");
      builder.append(this.valid_);      builder.append(", ");
      builder.append("data_source=");
      builder.append(this.data_source_);      builder.append(", ");
      builder.append("roll=");
      builder.append(this.roll_);      builder.append(", ");
      builder.append("pitch=");
      builder.append(this.pitch_);      builder.append(", ");
      builder.append("yaw=");
      builder.append(this.yaw_);      builder.append(", ");
      builder.append("throttle=");
      builder.append(this.throttle_);      builder.append(", ");
      builder.append("flaps=");
      builder.append(this.flaps_);      builder.append(", ");
      builder.append("aux1=");
      builder.append(this.aux1_);      builder.append(", ");
      builder.append("aux2=");
      builder.append(this.aux2_);      builder.append(", ");
      builder.append("aux3=");
      builder.append(this.aux3_);      builder.append(", ");
      builder.append("aux4=");
      builder.append(this.aux4_);      builder.append(", ");
      builder.append("aux5=");
      builder.append(this.aux5_);      builder.append(", ");
      builder.append("aux6=");
      builder.append(this.aux6_);      builder.append(", ");
      builder.append("sticks_moving=");
      builder.append(this.sticks_moving_);      builder.append(", ");
      builder.append("buttons=");
      builder.append(this.buttons_);
      builder.append("}");
      return builder.toString();
   }
}
