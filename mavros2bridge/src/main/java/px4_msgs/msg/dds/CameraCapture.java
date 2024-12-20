package px4_msgs.msg.dds;

import us.ihmc.communication.packets.Packet;
import us.ihmc.euclid.interfaces.Settable;
import us.ihmc.euclid.interfaces.EpsilonComparable;
import java.util.function.Supplier;
import us.ihmc.pubsub.TopicDataType;

public class CameraCapture extends Packet<CameraCapture> implements Settable<CameraCapture>, EpsilonComparable<CameraCapture>
{
   /**
            * time since system start (microseconds)
            */
   public long timestamp_;
   /**
            * Capture time in UTC / GPS time
            */
   public long timestamp_utc_;
   /**
            * Image sequence number
            */
   public long seq_;
   /**
            * Latitude in degrees (WGS84)
            */
   public double lat_;
   /**
            * Longitude in degrees (WGS84)
            */
   public double lon_;
   /**
            * Altitude (AMSL)
            */
   public float alt_;
   /**
            * Altitude above ground (meters)
            */
   public float ground_distance_;
   /**
            * Attitude of the camera relative to NED earth-fixed frame when using a gimbal, otherwise vehicle attitude
            */
   public float[] q_;
   /**
            * 1 for success, 0 for failure, -1 if camera does not provide feedback
            */
   public byte result_;

   public CameraCapture()
   {
      q_ = new float[4];

   }

   public CameraCapture(CameraCapture other)
   {
      this();
      set(other);
   }

   public void set(CameraCapture other)
   {
      timestamp_ = other.timestamp_;

      timestamp_utc_ = other.timestamp_utc_;

      seq_ = other.seq_;

      lat_ = other.lat_;

      lon_ = other.lon_;

      alt_ = other.alt_;

      ground_distance_ = other.ground_distance_;

      for(int i1 = 0; i1 < q_.length; ++i1)
      {
            q_[i1] = other.q_[i1];

      }

      result_ = other.result_;

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
            * Capture time in UTC / GPS time
            */
   public void setTimestampUtc(long timestamp_utc)
   {
      timestamp_utc_ = timestamp_utc;
   }
   /**
            * Capture time in UTC / GPS time
            */
   public long getTimestampUtc()
   {
      return timestamp_utc_;
   }

   /**
            * Image sequence number
            */
   public void setSeq(long seq)
   {
      seq_ = seq;
   }
   /**
            * Image sequence number
            */
   public long getSeq()
   {
      return seq_;
   }

   /**
            * Latitude in degrees (WGS84)
            */
   public void setLat(double lat)
   {
      lat_ = lat;
   }
   /**
            * Latitude in degrees (WGS84)
            */
   public double getLat()
   {
      return lat_;
   }

   /**
            * Longitude in degrees (WGS84)
            */
   public void setLon(double lon)
   {
      lon_ = lon;
   }
   /**
            * Longitude in degrees (WGS84)
            */
   public double getLon()
   {
      return lon_;
   }

   /**
            * Altitude (AMSL)
            */
   public void setAlt(float alt)
   {
      alt_ = alt;
   }
   /**
            * Altitude (AMSL)
            */
   public float getAlt()
   {
      return alt_;
   }

   /**
            * Altitude above ground (meters)
            */
   public void setGroundDistance(float ground_distance)
   {
      ground_distance_ = ground_distance;
   }
   /**
            * Altitude above ground (meters)
            */
   public float getGroundDistance()
   {
      return ground_distance_;
   }


   /**
            * Attitude of the camera relative to NED earth-fixed frame when using a gimbal, otherwise vehicle attitude
            */
   public float[] getQ()
   {
      return q_;
   }

   /**
            * 1 for success, 0 for failure, -1 if camera does not provide feedback
            */
   public void setResult(byte result)
   {
      result_ = result;
   }
   /**
            * 1 for success, 0 for failure, -1 if camera does not provide feedback
            */
   public byte getResult()
   {
      return result_;
   }


   public static Supplier<CameraCapturePubSubType> getPubSubType()
   {
      return CameraCapturePubSubType::new;
   }

   @Override
   public Supplier<TopicDataType> getPubSubTypePacket()
   {
      return CameraCapturePubSubType::new;
   }

   @Override
   public boolean epsilonEquals(CameraCapture other, double epsilon)
   {
      if(other == null) return false;
      if(other == this) return true;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_, other.timestamp_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_utc_, other.timestamp_utc_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.seq_, other.seq_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.lat_, other.lat_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.lon_, other.lon_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.alt_, other.alt_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.ground_distance_, other.ground_distance_, epsilon)) return false;

      for(int i3 = 0; i3 < q_.length; ++i3)
      {
                if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.q_[i3], other.q_[i3], epsilon)) return false;
      }

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.result_, other.result_, epsilon)) return false;


      return true;
   }

   @Override
   public boolean equals(Object other)
   {
      if(other == null) return false;
      if(other == this) return true;
      if(!(other instanceof CameraCapture)) return false;

      CameraCapture otherMyClass = (CameraCapture) other;

      if(this.timestamp_ != otherMyClass.timestamp_) return false;

      if(this.timestamp_utc_ != otherMyClass.timestamp_utc_) return false;

      if(this.seq_ != otherMyClass.seq_) return false;

      if(this.lat_ != otherMyClass.lat_) return false;

      if(this.lon_ != otherMyClass.lon_) return false;

      if(this.alt_ != otherMyClass.alt_) return false;

      if(this.ground_distance_ != otherMyClass.ground_distance_) return false;

      for(int i5 = 0; i5 < q_.length; ++i5)
      {
                if(this.q_[i5] != otherMyClass.q_[i5]) return false;

      }
      if(this.result_ != otherMyClass.result_) return false;


      return true;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("CameraCapture {");
      builder.append("timestamp=");
      builder.append(this.timestamp_);      builder.append(", ");
      builder.append("timestamp_utc=");
      builder.append(this.timestamp_utc_);      builder.append(", ");
      builder.append("seq=");
      builder.append(this.seq_);      builder.append(", ");
      builder.append("lat=");
      builder.append(this.lat_);      builder.append(", ");
      builder.append("lon=");
      builder.append(this.lon_);      builder.append(", ");
      builder.append("alt=");
      builder.append(this.alt_);      builder.append(", ");
      builder.append("ground_distance=");
      builder.append(this.ground_distance_);      builder.append(", ");
      builder.append("q=");
      builder.append(java.util.Arrays.toString(this.q_));      builder.append(", ");
      builder.append("result=");
      builder.append(this.result_);
      builder.append("}");
      return builder.toString();
   }
}
