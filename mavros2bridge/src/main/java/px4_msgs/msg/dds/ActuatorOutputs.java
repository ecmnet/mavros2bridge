package px4_msgs.msg.dds;

import us.ihmc.communication.packets.Packet;
import us.ihmc.euclid.interfaces.Settable;
import us.ihmc.euclid.interfaces.EpsilonComparable;
import java.util.function.Supplier;
import us.ihmc.pubsub.TopicDataType;

public class ActuatorOutputs extends Packet<ActuatorOutputs> implements Settable<ActuatorOutputs>, EpsilonComparable<ActuatorOutputs>
{
   public static final byte NUM_ACTUATOR_OUTPUTS = (byte) 16;
   /**
          * for sanity checking
          */
   public static final byte NUM_ACTUATOR_OUTPUT_GROUPS = (byte) 4;
   /**
            * time since system start (microseconds)
            */
   public long timestamp_;
   /**
            * valid outputs
            */
   public long noutputs_;
   /**
            * output data, in natural output units
            */
   public float[] output_;

   public ActuatorOutputs()
   {
      output_ = new float[16];

   }

   public ActuatorOutputs(ActuatorOutputs other)
   {
      this();
      set(other);
   }

   public void set(ActuatorOutputs other)
   {
      timestamp_ = other.timestamp_;

      noutputs_ = other.noutputs_;

      for(int i1 = 0; i1 < output_.length; ++i1)
      {
            output_[i1] = other.output_[i1];

      }

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
            * valid outputs
            */
   public void setNoutputs(long noutputs)
   {
      noutputs_ = noutputs;
   }
   /**
            * valid outputs
            */
   public long getNoutputs()
   {
      return noutputs_;
   }


   /**
            * output data, in natural output units
            */
   public float[] getOutput()
   {
      return output_;
   }


   public static Supplier<ActuatorOutputsPubSubType> getPubSubType()
   {
      return ActuatorOutputsPubSubType::new;
   }

   @Override
   public Supplier<TopicDataType> getPubSubTypePacket()
   {
      return ActuatorOutputsPubSubType::new;
   }

   @Override
   public boolean epsilonEquals(ActuatorOutputs other, double epsilon)
   {
      if(other == null) return false;
      if(other == this) return true;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_, other.timestamp_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.noutputs_, other.noutputs_, epsilon)) return false;

      for(int i3 = 0; i3 < output_.length; ++i3)
      {
                if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.output_[i3], other.output_[i3], epsilon)) return false;
      }


      return true;
   }

   @Override
   public boolean equals(Object other)
   {
      if(other == null) return false;
      if(other == this) return true;
      if(!(other instanceof ActuatorOutputs)) return false;

      ActuatorOutputs otherMyClass = (ActuatorOutputs) other;

      if(this.timestamp_ != otherMyClass.timestamp_) return false;

      if(this.noutputs_ != otherMyClass.noutputs_) return false;

      for(int i5 = 0; i5 < output_.length; ++i5)
      {
                if(this.output_[i5] != otherMyClass.output_[i5]) return false;

      }

      return true;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("ActuatorOutputs {");
      builder.append("timestamp=");
      builder.append(this.timestamp_);      builder.append(", ");
      builder.append("noutputs=");
      builder.append(this.noutputs_);      builder.append(", ");
      builder.append("output=");
      builder.append(java.util.Arrays.toString(this.output_));
      builder.append("}");
      return builder.toString();
   }
}
