package px4_msgs.msg.dds;

import us.ihmc.communication.packets.Packet;
import us.ihmc.euclid.interfaces.Settable;
import us.ihmc.euclid.interfaces.EpsilonComparable;
import java.util.function.Supplier;
import us.ihmc.pubsub.TopicDataType;

/**
       * Bezier Trajectory description. See also Mavlink TRAJECTORY msg
       * The topic trajectory_bezier describe each waypoint defined in vehicle_trajectory_bezier
       */
public class TrajectoryBezier extends Packet<TrajectoryBezier> implements Settable<TrajectoryBezier>, EpsilonComparable<TrajectoryBezier>
{
   /**
            * time since system start (microseconds)
            */
   public long timestamp_;
   /**
            * local position x,y,z (metres)
            */
   public float[] position_;
   /**
            * yaw angle (rad)
            */
   public float yaw_;
   /**
            * time it should take to get to this waypoint, if this is the final waypoint (seconds)
            */
   public float delta_;

   public TrajectoryBezier()
   {
      position_ = new float[3];

   }

   public TrajectoryBezier(TrajectoryBezier other)
   {
      this();
      set(other);
   }

   public void set(TrajectoryBezier other)
   {
      timestamp_ = other.timestamp_;

      for(int i1 = 0; i1 < position_.length; ++i1)
      {
            position_[i1] = other.position_[i1];

      }

      yaw_ = other.yaw_;

      delta_ = other.delta_;

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
            * local position x,y,z (metres)
            */
   public float[] getPosition()
   {
      return position_;
   }

   /**
            * yaw angle (rad)
            */
   public void setYaw(float yaw)
   {
      yaw_ = yaw;
   }
   /**
            * yaw angle (rad)
            */
   public float getYaw()
   {
      return yaw_;
   }

   /**
            * time it should take to get to this waypoint, if this is the final waypoint (seconds)
            */
   public void setDelta(float delta)
   {
      delta_ = delta;
   }
   /**
            * time it should take to get to this waypoint, if this is the final waypoint (seconds)
            */
   public float getDelta()
   {
      return delta_;
   }


   public static Supplier<TrajectoryBezierPubSubType> getPubSubType()
   {
      return TrajectoryBezierPubSubType::new;
   }

   @Override
   public Supplier<TopicDataType> getPubSubTypePacket()
   {
      return TrajectoryBezierPubSubType::new;
   }

   @Override
   public boolean epsilonEquals(TrajectoryBezier other, double epsilon)
   {
      if(other == null) return false;
      if(other == this) return true;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_, other.timestamp_, epsilon)) return false;

      for(int i3 = 0; i3 < position_.length; ++i3)
      {
                if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.position_[i3], other.position_[i3], epsilon)) return false;
      }

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.yaw_, other.yaw_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.delta_, other.delta_, epsilon)) return false;


      return true;
   }

   @Override
   public boolean equals(Object other)
   {
      if(other == null) return false;
      if(other == this) return true;
      if(!(other instanceof TrajectoryBezier)) return false;

      TrajectoryBezier otherMyClass = (TrajectoryBezier) other;

      if(this.timestamp_ != otherMyClass.timestamp_) return false;

      for(int i5 = 0; i5 < position_.length; ++i5)
      {
                if(this.position_[i5] != otherMyClass.position_[i5]) return false;

      }
      if(this.yaw_ != otherMyClass.yaw_) return false;

      if(this.delta_ != otherMyClass.delta_) return false;


      return true;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("TrajectoryBezier {");
      builder.append("timestamp=");
      builder.append(this.timestamp_);      builder.append(", ");
      builder.append("position=");
      builder.append(java.util.Arrays.toString(this.position_));      builder.append(", ");
      builder.append("yaw=");
      builder.append(this.yaw_);      builder.append(", ");
      builder.append("delta=");
      builder.append(this.delta_);
      builder.append("}");
      return builder.toString();
   }
}
