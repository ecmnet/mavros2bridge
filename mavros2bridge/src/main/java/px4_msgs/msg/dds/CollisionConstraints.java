package px4_msgs.msg.dds;

import us.ihmc.communication.packets.Packet;
import us.ihmc.euclid.interfaces.Settable;
import us.ihmc.euclid.interfaces.EpsilonComparable;
import java.util.function.Supplier;
import us.ihmc.pubsub.TopicDataType;

/**
       * Local setpoint constraints in NED frame
       * setting something to NaN means that no limit is provided
       */
public class CollisionConstraints extends Packet<CollisionConstraints> implements Settable<CollisionConstraints>, EpsilonComparable<CollisionConstraints>
{
   /**
            * time since system start (microseconds)
            */
   public long timestamp_;
   /**
            * velocities demanded
            */
   public float[] original_setpoint_;
   /**
            * velocities allowed
            */
   public float[] adapted_setpoint_;

   public CollisionConstraints()
   {
      original_setpoint_ = new float[2];

      adapted_setpoint_ = new float[2];

   }

   public CollisionConstraints(CollisionConstraints other)
   {
      this();
      set(other);
   }

   public void set(CollisionConstraints other)
   {
      timestamp_ = other.timestamp_;

      for(int i1 = 0; i1 < original_setpoint_.length; ++i1)
      {
            original_setpoint_[i1] = other.original_setpoint_[i1];

      }

      for(int i3 = 0; i3 < adapted_setpoint_.length; ++i3)
      {
            adapted_setpoint_[i3] = other.adapted_setpoint_[i3];

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
            * velocities demanded
            */
   public float[] getOriginalSetpoint()
   {
      return original_setpoint_;
   }


   /**
            * velocities allowed
            */
   public float[] getAdaptedSetpoint()
   {
      return adapted_setpoint_;
   }


   public static Supplier<CollisionConstraintsPubSubType> getPubSubType()
   {
      return CollisionConstraintsPubSubType::new;
   }

   @Override
   public Supplier<TopicDataType> getPubSubTypePacket()
   {
      return CollisionConstraintsPubSubType::new;
   }

   @Override
   public boolean epsilonEquals(CollisionConstraints other, double epsilon)
   {
      if(other == null) return false;
      if(other == this) return true;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_, other.timestamp_, epsilon)) return false;

      for(int i5 = 0; i5 < original_setpoint_.length; ++i5)
      {
                if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.original_setpoint_[i5], other.original_setpoint_[i5], epsilon)) return false;
      }

      for(int i7 = 0; i7 < adapted_setpoint_.length; ++i7)
      {
                if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.adapted_setpoint_[i7], other.adapted_setpoint_[i7], epsilon)) return false;
      }


      return true;
   }

   @Override
   public boolean equals(Object other)
   {
      if(other == null) return false;
      if(other == this) return true;
      if(!(other instanceof CollisionConstraints)) return false;

      CollisionConstraints otherMyClass = (CollisionConstraints) other;

      if(this.timestamp_ != otherMyClass.timestamp_) return false;

      for(int i9 = 0; i9 < original_setpoint_.length; ++i9)
      {
                if(this.original_setpoint_[i9] != otherMyClass.original_setpoint_[i9]) return false;

      }
      for(int i11 = 0; i11 < adapted_setpoint_.length; ++i11)
      {
                if(this.adapted_setpoint_[i11] != otherMyClass.adapted_setpoint_[i11]) return false;

      }

      return true;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("CollisionConstraints {");
      builder.append("timestamp=");
      builder.append(this.timestamp_);      builder.append(", ");
      builder.append("original_setpoint=");
      builder.append(java.util.Arrays.toString(this.original_setpoint_));      builder.append(", ");
      builder.append("adapted_setpoint=");
      builder.append(java.util.Arrays.toString(this.adapted_setpoint_));
      builder.append("}");
      return builder.toString();
   }
}
