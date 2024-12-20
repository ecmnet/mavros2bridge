package px4_msgs.msg.dds;

import us.ihmc.communication.packets.Packet;
import us.ihmc.euclid.interfaces.Settable;
import us.ihmc.euclid.interfaces.EpsilonComparable;
import java.util.function.Supplier;
import us.ihmc.pubsub.TopicDataType;

public class OrbitStatus extends Packet<OrbitStatus> implements Settable<OrbitStatus>, EpsilonComparable<OrbitStatus>
{
   /**
          * ORBIT_YAW_BEHAVIOUR
          */
   public static final byte ORBIT_YAW_BEHAVIOUR_HOLD_FRONT_TO_CIRCLE_CENTER = (byte) 0;
   public static final byte ORBIT_YAW_BEHAVIOUR_HOLD_INITIAL_HEADING = (byte) 1;
   public static final byte ORBIT_YAW_BEHAVIOUR_UNCONTROLLED = (byte) 2;
   public static final byte ORBIT_YAW_BEHAVIOUR_HOLD_FRONT_TANGENT_TO_CIRCLE = (byte) 3;
   public static final byte ORBIT_YAW_BEHAVIOUR_RC_CONTROLLED = (byte) 4;
   public static final byte ORBIT_YAW_BEHAVIOUR_UNCHANGED = (byte) 5;
   /**
            * time since system start (microseconds)
            */
   public long timestamp_;
   /**
            * Radius of the orbit circle. Positive values orbit clockwise, negative values orbit counter-clockwise. [m]
            */
   public float radius_;
   /**
            * The coordinate system of the fields: x, y, z.
            */
   public byte frame_;
   /**
            * X coordinate of center point. Coordinate system depends on frame field: local = x position in meters * 1e4, global = latitude in degrees * 1e7.
            */
   public double x_;
   /**
            * Y coordinate of center point. Coordinate system depends on frame field: local = y position in meters * 1e4, global = latitude in degrees * 1e7.
            */
   public double y_;
   /**
            * Altitude of center point. Coordinate system depends on frame field.
            */
   public float z_;
   public byte yaw_behaviour_;

   public OrbitStatus()
   {
   }

   public OrbitStatus(OrbitStatus other)
   {
      this();
      set(other);
   }

   public void set(OrbitStatus other)
   {
      timestamp_ = other.timestamp_;

      radius_ = other.radius_;

      frame_ = other.frame_;

      x_ = other.x_;

      y_ = other.y_;

      z_ = other.z_;

      yaw_behaviour_ = other.yaw_behaviour_;

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
            * Radius of the orbit circle. Positive values orbit clockwise, negative values orbit counter-clockwise. [m]
            */
   public void setRadius(float radius)
   {
      radius_ = radius;
   }
   /**
            * Radius of the orbit circle. Positive values orbit clockwise, negative values orbit counter-clockwise. [m]
            */
   public float getRadius()
   {
      return radius_;
   }

   /**
            * The coordinate system of the fields: x, y, z.
            */
   public void setFrame(byte frame)
   {
      frame_ = frame;
   }
   /**
            * The coordinate system of the fields: x, y, z.
            */
   public byte getFrame()
   {
      return frame_;
   }

   /**
            * X coordinate of center point. Coordinate system depends on frame field: local = x position in meters * 1e4, global = latitude in degrees * 1e7.
            */
   public void setX(double x)
   {
      x_ = x;
   }
   /**
            * X coordinate of center point. Coordinate system depends on frame field: local = x position in meters * 1e4, global = latitude in degrees * 1e7.
            */
   public double getX()
   {
      return x_;
   }

   /**
            * Y coordinate of center point. Coordinate system depends on frame field: local = y position in meters * 1e4, global = latitude in degrees * 1e7.
            */
   public void setY(double y)
   {
      y_ = y;
   }
   /**
            * Y coordinate of center point. Coordinate system depends on frame field: local = y position in meters * 1e4, global = latitude in degrees * 1e7.
            */
   public double getY()
   {
      return y_;
   }

   /**
            * Altitude of center point. Coordinate system depends on frame field.
            */
   public void setZ(float z)
   {
      z_ = z;
   }
   /**
            * Altitude of center point. Coordinate system depends on frame field.
            */
   public float getZ()
   {
      return z_;
   }

   public void setYawBehaviour(byte yaw_behaviour)
   {
      yaw_behaviour_ = yaw_behaviour;
   }
   public byte getYawBehaviour()
   {
      return yaw_behaviour_;
   }


   public static Supplier<OrbitStatusPubSubType> getPubSubType()
   {
      return OrbitStatusPubSubType::new;
   }

   @Override
   public Supplier<TopicDataType> getPubSubTypePacket()
   {
      return OrbitStatusPubSubType::new;
   }

   @Override
   public boolean epsilonEquals(OrbitStatus other, double epsilon)
   {
      if(other == null) return false;
      if(other == this) return true;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_, other.timestamp_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.radius_, other.radius_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.frame_, other.frame_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.x_, other.x_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.y_, other.y_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.z_, other.z_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.yaw_behaviour_, other.yaw_behaviour_, epsilon)) return false;


      return true;
   }

   @Override
   public boolean equals(Object other)
   {
      if(other == null) return false;
      if(other == this) return true;
      if(!(other instanceof OrbitStatus)) return false;

      OrbitStatus otherMyClass = (OrbitStatus) other;

      if(this.timestamp_ != otherMyClass.timestamp_) return false;

      if(this.radius_ != otherMyClass.radius_) return false;

      if(this.frame_ != otherMyClass.frame_) return false;

      if(this.x_ != otherMyClass.x_) return false;

      if(this.y_ != otherMyClass.y_) return false;

      if(this.z_ != otherMyClass.z_) return false;

      if(this.yaw_behaviour_ != otherMyClass.yaw_behaviour_) return false;


      return true;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("OrbitStatus {");
      builder.append("timestamp=");
      builder.append(this.timestamp_);      builder.append(", ");
      builder.append("radius=");
      builder.append(this.radius_);      builder.append(", ");
      builder.append("frame=");
      builder.append(this.frame_);      builder.append(", ");
      builder.append("x=");
      builder.append(this.x_);      builder.append(", ");
      builder.append("y=");
      builder.append(this.y_);      builder.append(", ");
      builder.append("z=");
      builder.append(this.z_);      builder.append(", ");
      builder.append("yaw_behaviour=");
      builder.append(this.yaw_behaviour_);
      builder.append("}");
      return builder.toString();
   }
}
