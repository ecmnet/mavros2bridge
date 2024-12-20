package px4_msgs.msg.dds;

import us.ihmc.communication.packets.Packet;
import us.ihmc.euclid.interfaces.Settable;
import us.ihmc.euclid.interfaces.EpsilonComparable;
import java.util.function.Supplier;
import us.ihmc.pubsub.TopicDataType;

public class ActuatorServos extends Packet<ActuatorServos> implements Settable<ActuatorServos>, EpsilonComparable<ActuatorServos>
{
   public static final byte NUM_CONTROLS = (byte) 8;/**
            * Servo control message
            * time since system start (microseconds)
            */
   public long timestamp_;
   /**
            * the timestamp the data this control response is based on was sampled
            */
   public long timestamp_sample_;
   /**
            * range: [-1, 1], where 1 means maximum positive position,
            */
   public float[] control_;

   public ActuatorServos()
   {
      control_ = new float[8];

   }

   public ActuatorServos(ActuatorServos other)
   {
      this();
      set(other);
   }

   public void set(ActuatorServos other)
   {
      timestamp_ = other.timestamp_;

      timestamp_sample_ = other.timestamp_sample_;

      for(int i1 = 0; i1 < control_.length; ++i1)
      {
            control_[i1] = other.control_[i1];

      }

   }

   /**
            * Servo control message
            * time since system start (microseconds)
            */
   public void setTimestamp(long timestamp)
   {
      timestamp_ = timestamp;
   }
   /**
            * Servo control message
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
            * range: [-1, 1], where 1 means maximum positive position,
            */
   public float[] getControl()
   {
      return control_;
   }


   public static Supplier<ActuatorServosPubSubType> getPubSubType()
   {
      return ActuatorServosPubSubType::new;
   }

   @Override
   public Supplier<TopicDataType> getPubSubTypePacket()
   {
      return ActuatorServosPubSubType::new;
   }

   @Override
   public boolean epsilonEquals(ActuatorServos other, double epsilon)
   {
      if(other == null) return false;
      if(other == this) return true;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_, other.timestamp_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_sample_, other.timestamp_sample_, epsilon)) return false;

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
      if(!(other instanceof ActuatorServos)) return false;

      ActuatorServos otherMyClass = (ActuatorServos) other;

      if(this.timestamp_ != otherMyClass.timestamp_) return false;

      if(this.timestamp_sample_ != otherMyClass.timestamp_sample_) return false;

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

      builder.append("ActuatorServos {");
      builder.append("timestamp=");
      builder.append(this.timestamp_);      builder.append(", ");
      builder.append("timestamp_sample=");
      builder.append(this.timestamp_sample_);      builder.append(", ");
      builder.append("control=");
      builder.append(java.util.Arrays.toString(this.control_));
      builder.append("}");
      return builder.toString();
   }
}
