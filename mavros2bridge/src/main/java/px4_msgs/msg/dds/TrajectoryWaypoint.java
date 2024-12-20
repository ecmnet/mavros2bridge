package px4_msgs.msg.dds;

import us.ihmc.communication.packets.Packet;
import us.ihmc.euclid.interfaces.Settable;
import us.ihmc.euclid.interfaces.EpsilonComparable;
import java.util.function.Supplier;
import us.ihmc.pubsub.TopicDataType;

/**
       * Waypoint Trajectory description. See also Mavlink TRAJECTORY msg
       * The topic trajectory_waypoint describe each waypoint defined in vehicle_trajectory_waypoint
       */
public class TrajectoryWaypoint extends Packet<TrajectoryWaypoint> implements Settable<TrajectoryWaypoint>, EpsilonComparable<TrajectoryWaypoint>
{
   /**
            * time since system start (microseconds)
            */
   public long timestamp_;
   public float[] position_;
   public float[] velocity_;
   public float[] acceleration_;
   public float yaw_;
   public float yaw_speed_;
   public boolean point_valid_;
   public byte type_;

   public TrajectoryWaypoint()
   {
      position_ = new float[3];

      velocity_ = new float[3];

      acceleration_ = new float[3];

   }

   public TrajectoryWaypoint(TrajectoryWaypoint other)
   {
      this();
      set(other);
   }

   public void set(TrajectoryWaypoint other)
   {
      timestamp_ = other.timestamp_;

      for(int i1 = 0; i1 < position_.length; ++i1)
      {
            position_[i1] = other.position_[i1];

      }

      for(int i3 = 0; i3 < velocity_.length; ++i3)
      {
            velocity_[i3] = other.velocity_[i3];

      }

      for(int i5 = 0; i5 < acceleration_.length; ++i5)
      {
            acceleration_[i5] = other.acceleration_[i5];

      }

      yaw_ = other.yaw_;

      yaw_speed_ = other.yaw_speed_;

      point_valid_ = other.point_valid_;

      type_ = other.type_;

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


   public float[] getPosition()
   {
      return position_;
   }


   public float[] getVelocity()
   {
      return velocity_;
   }


   public float[] getAcceleration()
   {
      return acceleration_;
   }

   public void setYaw(float yaw)
   {
      yaw_ = yaw;
   }
   public float getYaw()
   {
      return yaw_;
   }

   public void setYawSpeed(float yaw_speed)
   {
      yaw_speed_ = yaw_speed;
   }
   public float getYawSpeed()
   {
      return yaw_speed_;
   }

   public void setPointValid(boolean point_valid)
   {
      point_valid_ = point_valid;
   }
   public boolean getPointValid()
   {
      return point_valid_;
   }

   public void setType(byte type)
   {
      type_ = type;
   }
   public byte getType()
   {
      return type_;
   }


   public static Supplier<TrajectoryWaypointPubSubType> getPubSubType()
   {
      return TrajectoryWaypointPubSubType::new;
   }

   @Override
   public Supplier<TopicDataType> getPubSubTypePacket()
   {
      return TrajectoryWaypointPubSubType::new;
   }

   @Override
   public boolean epsilonEquals(TrajectoryWaypoint other, double epsilon)
   {
      if(other == null) return false;
      if(other == this) return true;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_, other.timestamp_, epsilon)) return false;

      for(int i7 = 0; i7 < position_.length; ++i7)
      {
                if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.position_[i7], other.position_[i7], epsilon)) return false;
      }

      for(int i9 = 0; i9 < velocity_.length; ++i9)
      {
                if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.velocity_[i9], other.velocity_[i9], epsilon)) return false;
      }

      for(int i11 = 0; i11 < acceleration_.length; ++i11)
      {
                if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.acceleration_[i11], other.acceleration_[i11], epsilon)) return false;
      }

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.yaw_, other.yaw_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.yaw_speed_, other.yaw_speed_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.point_valid_, other.point_valid_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.type_, other.type_, epsilon)) return false;


      return true;
   }

   @Override
   public boolean equals(Object other)
   {
      if(other == null) return false;
      if(other == this) return true;
      if(!(other instanceof TrajectoryWaypoint)) return false;

      TrajectoryWaypoint otherMyClass = (TrajectoryWaypoint) other;

      if(this.timestamp_ != otherMyClass.timestamp_) return false;

      for(int i13 = 0; i13 < position_.length; ++i13)
      {
                if(this.position_[i13] != otherMyClass.position_[i13]) return false;

      }
      for(int i15 = 0; i15 < velocity_.length; ++i15)
      {
                if(this.velocity_[i15] != otherMyClass.velocity_[i15]) return false;

      }
      for(int i17 = 0; i17 < acceleration_.length; ++i17)
      {
                if(this.acceleration_[i17] != otherMyClass.acceleration_[i17]) return false;

      }
      if(this.yaw_ != otherMyClass.yaw_) return false;

      if(this.yaw_speed_ != otherMyClass.yaw_speed_) return false;

      if(this.point_valid_ != otherMyClass.point_valid_) return false;

      if(this.type_ != otherMyClass.type_) return false;


      return true;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("TrajectoryWaypoint {");
      builder.append("timestamp=");
      builder.append(this.timestamp_);      builder.append(", ");
      builder.append("position=");
      builder.append(java.util.Arrays.toString(this.position_));      builder.append(", ");
      builder.append("velocity=");
      builder.append(java.util.Arrays.toString(this.velocity_));      builder.append(", ");
      builder.append("acceleration=");
      builder.append(java.util.Arrays.toString(this.acceleration_));      builder.append(", ");
      builder.append("yaw=");
      builder.append(this.yaw_);      builder.append(", ");
      builder.append("yaw_speed=");
      builder.append(this.yaw_speed_);      builder.append(", ");
      builder.append("point_valid=");
      builder.append(this.point_valid_);      builder.append(", ");
      builder.append("type=");
      builder.append(this.type_);
      builder.append("}");
      return builder.toString();
   }
}
