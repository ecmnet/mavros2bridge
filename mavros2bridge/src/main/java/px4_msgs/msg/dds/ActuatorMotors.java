package px4_msgs.msg.dds;

import us.ihmc.communication.packets.Packet;
import us.ihmc.euclid.interfaces.Settable;
import us.ihmc.euclid.interfaces.EpsilonComparable;
import java.util.function.Supplier;
import us.ihmc.pubsub.TopicDataType;

public class ActuatorMotors extends Packet<ActuatorMotors> implements Settable<ActuatorMotors>, EpsilonComparable<ActuatorMotors>
{
   public static final byte ACTUATOR_FUNCTION_MOTOR1 = (byte) 101;
   public static final byte NUM_CONTROLS = (byte) 12;
   /**
            * Motor control message
            * time since system start (microseconds)
            */
   public long timestamp_;
   /**
            * the timestamp the data this control response is based on was sampled
            */
   public long timestamp_sample_;
   /**
            * bitset which motors are configured to be reversible
            */
   public int reversible_flags_;
   /**
            * range: [-1, 1], where 1 means maximum positive thrust,
            */
   public float[] control_;

   public ActuatorMotors()
   {
      control_ = new float[12];

   }

   public ActuatorMotors(ActuatorMotors other)
   {
      this();
      set(other);
   }

   public void set(ActuatorMotors other)
   {
      timestamp_ = other.timestamp_;

      timestamp_sample_ = other.timestamp_sample_;

      reversible_flags_ = other.reversible_flags_;

      for(int i1 = 0; i1 < control_.length; ++i1)
      {
            control_[i1] = other.control_[i1];

      }

   }

   /**
            * Motor control message
            * time since system start (microseconds)
            */
   public void setTimestamp(long timestamp)
   {
      timestamp_ = timestamp;
   }
   /**
            * Motor control message
            * time since system start (microseconds)
            */
   public long getTimestamp()
   {
      return timestamp_;
   }

   /**
            * the timestamp the data this control response is based on was sampled
            */
   public void setTimestampSample(long timestamp_sample)
   {
      timestamp_sample_ = timestamp_sample;
   }
   /**
            * the timestamp the data this control response is based on was sampled
            */
   public long getTimestampSample()
   {
      return timestamp_sample_;
   }

   /**
            * bitset which motors are configured to be reversible
            */
   public void setReversibleFlags(int reversible_flags)
   {
      reversible_flags_ = reversible_flags;
   }
   /**
            * bitset which motors are configured to be reversible
            */
   public int getReversibleFlags()
   {
      return reversible_flags_;
   }


   /**
            * range: [-1, 1], where 1 means maximum positive thrust,
            */
   public float[] getControl()
   {
      return control_;
   }


   public static Supplier<ActuatorMotorsPubSubType> getPubSubType()
   {
      return ActuatorMotorsPubSubType::new;
   }

   @Override
   public Supplier<TopicDataType> getPubSubTypePacket()
   {
      return ActuatorMotorsPubSubType::new;
   }

   @Override
   public boolean epsilonEquals(ActuatorMotors other, double epsilon)
   {
      if(other == null) return false;
      if(other == this) return true;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_, other.timestamp_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_sample_, other.timestamp_sample_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.reversible_flags_, other.reversible_flags_, epsilon)) return false;

      for(int i3 = 0; i3 < control_.length; ++i3)
      {
                if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.control_[i3], other.control_[i3], epsilon)) return false;
      }


      return true;
   }

   @Override
   public boolean equals(Object other)
   {
      if(other == null) return false;
      if(other == this) return true;
      if(!(other instanceof ActuatorMotors)) return false;

      ActuatorMotors otherMyClass = (ActuatorMotors) other;

      if(this.timestamp_ != otherMyClass.timestamp_) return false;

      if(this.timestamp_sample_ != otherMyClass.timestamp_sample_) return false;

      if(this.reversible_flags_ != otherMyClass.reversible_flags_) return false;

      for(int i5 = 0; i5 < control_.length; ++i5)
      {
                if(this.control_[i5] != otherMyClass.control_[i5]) return false;

      }

      return true;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("ActuatorMotors {");
      builder.append("timestamp=");
      builder.append(this.timestamp_);      builder.append(", ");
      builder.append("timestamp_sample=");
      builder.append(this.timestamp_sample_);      builder.append(", ");
      builder.append("reversible_flags=");
      builder.append(this.reversible_flags_);      builder.append(", ");
      builder.append("control=");
      builder.append(java.util.Arrays.toString(this.control_));
      builder.append("}");
      return builder.toString();
   }
}
