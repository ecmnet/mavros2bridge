package px4_msgs.msg.dds;

import us.ihmc.communication.packets.Packet;
import us.ihmc.euclid.interfaces.Settable;
import us.ihmc.euclid.interfaces.EpsilonComparable;
import java.util.function.Supplier;
import us.ihmc.pubsub.TopicDataType;

public class FigureEightStatus extends Packet<FigureEightStatus> implements Settable<FigureEightStatus>, EpsilonComparable<FigureEightStatus>
{
   /**
            * time since system start (microseconds)
            */
   public long timestamp_;
   /**
            * Major axis radius of the figure eight [m]. Positive values orbit clockwise, negative values orbit counter-clockwise.
            */
   public float major_radius_;
   /**
            * Minor axis radius of the figure eight [m].
            */
   public float minor_radius_;
   /**
            * Orientation of the major axis of the figure eight [rad].
            */
   public float orientation_;
   /**
            * The coordinate system of the fields: x, y, z.
            */
   public byte frame_;
   /**
            * X coordinate of center point. Coordinate system depends on frame field: local = x position in meters * 1e4, global = latitude in degrees * 1e7.
            */
   public int x_;
   /**
            * Y coordinate of center point. Coordinate system depends on frame field: local = y position in meters * 1e4, global = latitude in degrees * 1e7.
            */
   public int y_;
   /**
            * Altitude of center point. Coordinate system depends on frame field.
            */
   public float z_;

   public FigureEightStatus()
   {
   }

   public FigureEightStatus(FigureEightStatus other)
   {
      this();
      set(other);
   }

   public void set(FigureEightStatus other)
   {
      timestamp_ = other.timestamp_;

      major_radius_ = other.major_radius_;

      minor_radius_ = other.minor_radius_;

      orientation_ = other.orientation_;

      frame_ = other.frame_;

      x_ = other.x_;

      y_ = other.y_;

      z_ = other.z_;

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
            * Major axis radius of the figure eight [m]. Positive values orbit clockwise, negative values orbit counter-clockwise.
            */
   public void setMajorRadius(float major_radius)
   {
      major_radius_ = major_radius;
   }
   /**
            * Major axis radius of the figure eight [m]. Positive values orbit clockwise, negative values orbit counter-clockwise.
            */
   public float getMajorRadius()
   {
      return major_radius_;
   }

   /**
            * Minor axis radius of the figure eight [m].
            */
   public void setMinorRadius(float minor_radius)
   {
      minor_radius_ = minor_radius;
   }
   /**
            * Minor axis radius of the figure eight [m].
            */
   public float getMinorRadius()
   {
      return minor_radius_;
   }

   /**
            * Orientation of the major axis of the figure eight [rad].
            */
   public void setOrientation(float orientation)
   {
      orientation_ = orientation;
   }
   /**
            * Orientation of the major axis of the figure eight [rad].
            */
   public float getOrientation()
   {
      return orientation_;
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
   public void setX(int x)
   {
      x_ = x;
   }
   /**
            * X coordinate of center point. Coordinate system depends on frame field: local = x position in meters * 1e4, global = latitude in degrees * 1e7.
            */
   public int getX()
   {
      return x_;
   }

   /**
            * Y coordinate of center point. Coordinate system depends on frame field: local = y position in meters * 1e4, global = latitude in degrees * 1e7.
            */
   public void setY(int y)
   {
      y_ = y;
   }
   /**
            * Y coordinate of center point. Coordinate system depends on frame field: local = y position in meters * 1e4, global = latitude in degrees * 1e7.
            */
   public int getY()
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


   public static Supplier<FigureEightStatusPubSubType> getPubSubType()
   {
      return FigureEightStatusPubSubType::new;
   }

   @Override
   public Supplier<TopicDataType> getPubSubTypePacket()
   {
      return FigureEightStatusPubSubType::new;
   }

   @Override
   public boolean epsilonEquals(FigureEightStatus other, double epsilon)
   {
      if(other == null) return false;
      if(other == this) return true;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_, other.timestamp_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.major_radius_, other.major_radius_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.minor_radius_, other.minor_radius_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.orientation_, other.orientation_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.frame_, other.frame_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.x_, other.x_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.y_, other.y_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.z_, other.z_, epsilon)) return false;


      return true;
   }

   @Override
   public boolean equals(Object other)
   {
      if(other == null) return false;
      if(other == this) return true;
      if(!(other instanceof FigureEightStatus)) return false;

      FigureEightStatus otherMyClass = (FigureEightStatus) other;

      if(this.timestamp_ != otherMyClass.timestamp_) return false;

      if(this.major_radius_ != otherMyClass.major_radius_) return false;

      if(this.minor_radius_ != otherMyClass.minor_radius_) return false;

      if(this.orientation_ != otherMyClass.orientation_) return false;

      if(this.frame_ != otherMyClass.frame_) return false;

      if(this.x_ != otherMyClass.x_) return false;

      if(this.y_ != otherMyClass.y_) return false;

      if(this.z_ != otherMyClass.z_) return false;


      return true;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("FigureEightStatus {");
      builder.append("timestamp=");
      builder.append(this.timestamp_);      builder.append(", ");
      builder.append("major_radius=");
      builder.append(this.major_radius_);      builder.append(", ");
      builder.append("minor_radius=");
      builder.append(this.minor_radius_);      builder.append(", ");
      builder.append("orientation=");
      builder.append(this.orientation_);      builder.append(", ");
      builder.append("frame=");
      builder.append(this.frame_);      builder.append(", ");
      builder.append("x=");
      builder.append(this.x_);      builder.append(", ");
      builder.append("y=");
      builder.append(this.y_);      builder.append(", ");
      builder.append("z=");
      builder.append(this.z_);
      builder.append("}");
      return builder.toString();
   }
}
