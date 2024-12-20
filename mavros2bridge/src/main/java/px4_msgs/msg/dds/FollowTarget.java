package px4_msgs.msg.dds;

import us.ihmc.communication.packets.Packet;
import us.ihmc.euclid.interfaces.Settable;
import us.ihmc.euclid.interfaces.EpsilonComparable;
import java.util.function.Supplier;
import us.ihmc.pubsub.TopicDataType;

public class FollowTarget extends Packet<FollowTarget> implements Settable<FollowTarget>, EpsilonComparable<FollowTarget>
{
   /**
            * time since system start (microseconds)
            */
   public long timestamp_;
   /**
            * target position (deg * 1e7)
            */
   public double lat_;
   /**
            * target position (deg * 1e7)
            */
   public double lon_;
   /**
            * target position
            */
   public float alt_;
   /**
            * target vel in y
            */
   public float vy_;
   /**
            * target vel in x
            */
   public float vx_;
   /**
            * target vel in z
            */
   public float vz_;
   /**
            * target reporting capabilities
            */
   public byte est_cap_;

   public FollowTarget()
   {
   }

   public FollowTarget(FollowTarget other)
   {
      this();
      set(other);
   }

   public void set(FollowTarget other)
   {
      timestamp_ = other.timestamp_;

      lat_ = other.lat_;

      lon_ = other.lon_;

      alt_ = other.alt_;

      vy_ = other.vy_;

      vx_ = other.vx_;

      vz_ = other.vz_;

      est_cap_ = other.est_cap_;

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
            * target position (deg * 1e7)
            */
   public void setLat(double lat)
   {
      lat_ = lat;
   }
   /**
            * target position (deg * 1e7)
            */
   public double getLat()
   {
      return lat_;
   }

   /**
            * target position (deg * 1e7)
            */
   public void setLon(double lon)
   {
      lon_ = lon;
   }
   /**
            * target position (deg * 1e7)
            */
   public double getLon()
   {
      return lon_;
   }

   /**
            * target position
            */
   public void setAlt(float alt)
   {
      alt_ = alt;
   }
   /**
            * target position
            */
   public float getAlt()
   {
      return alt_;
   }

   /**
            * target vel in y
            */
   public void setVy(float vy)
   {
      vy_ = vy;
   }
   /**
            * target vel in y
            */
   public float getVy()
   {
      return vy_;
   }

   /**
            * target vel in x
            */
   public void setVx(float vx)
   {
      vx_ = vx;
   }
   /**
            * target vel in x
            */
   public float getVx()
   {
      return vx_;
   }

   /**
            * target vel in z
            */
   public void setVz(float vz)
   {
      vz_ = vz;
   }
   /**
            * target vel in z
            */
   public float getVz()
   {
      return vz_;
   }

   /**
            * target reporting capabilities
            */
   public void setEstCap(byte est_cap)
   {
      est_cap_ = est_cap;
   }
   /**
            * target reporting capabilities
            */
   public byte getEstCap()
   {
      return est_cap_;
   }


   public static Supplier<FollowTargetPubSubType> getPubSubType()
   {
      return FollowTargetPubSubType::new;
   }

   @Override
   public Supplier<TopicDataType> getPubSubTypePacket()
   {
      return FollowTargetPubSubType::new;
   }

   @Override
   public boolean epsilonEquals(FollowTarget other, double epsilon)
   {
      if(other == null) return false;
      if(other == this) return true;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_, other.timestamp_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.lat_, other.lat_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.lon_, other.lon_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.alt_, other.alt_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.vy_, other.vy_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.vx_, other.vx_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.vz_, other.vz_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.est_cap_, other.est_cap_, epsilon)) return false;


      return true;
   }

   @Override
   public boolean equals(Object other)
   {
      if(other == null) return false;
      if(other == this) return true;
      if(!(other instanceof FollowTarget)) return false;

      FollowTarget otherMyClass = (FollowTarget) other;

      if(this.timestamp_ != otherMyClass.timestamp_) return false;

      if(this.lat_ != otherMyClass.lat_) return false;

      if(this.lon_ != otherMyClass.lon_) return false;

      if(this.alt_ != otherMyClass.alt_) return false;

      if(this.vy_ != otherMyClass.vy_) return false;

      if(this.vx_ != otherMyClass.vx_) return false;

      if(this.vz_ != otherMyClass.vz_) return false;

      if(this.est_cap_ != otherMyClass.est_cap_) return false;


      return true;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("FollowTarget {");
      builder.append("timestamp=");
      builder.append(this.timestamp_);      builder.append(", ");
      builder.append("lat=");
      builder.append(this.lat_);      builder.append(", ");
      builder.append("lon=");
      builder.append(this.lon_);      builder.append(", ");
      builder.append("alt=");
      builder.append(this.alt_);      builder.append(", ");
      builder.append("vy=");
      builder.append(this.vy_);      builder.append(", ");
      builder.append("vx=");
      builder.append(this.vx_);      builder.append(", ");
      builder.append("vz=");
      builder.append(this.vz_);      builder.append(", ");
      builder.append("est_cap=");
      builder.append(this.est_cap_);
      builder.append("}");
      return builder.toString();
   }
}
