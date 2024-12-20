package px4_msgs.msg.dds;

import us.ihmc.communication.packets.Packet;
import us.ihmc.euclid.interfaces.Settable;
import us.ihmc.euclid.interfaces.EpsilonComparable;
import java.util.function.Supplier;
import us.ihmc.pubsub.TopicDataType;

public class SatelliteInfo extends Packet<SatelliteInfo> implements Settable<SatelliteInfo>, EpsilonComparable<SatelliteInfo>
{
   public static final byte SAT_INFO_MAX_SATELLITES = (byte) 20;/**
            * time since system start (microseconds)
            */
   public long timestamp_;
   /**
            * Number of satellites visible to the receiver
            */
   public byte count_;
   /**
            * Space vehicle ID [1..255], see scheme below
            */
   public byte[] svid_;
   /**
            * 0: Satellite not used, 1: used for navigation
            */
   public byte[] used_;
   /**
            * Elevation (0: right on top of receiver, 90: on the horizon) of satellite
            */
   public byte[] elevation_;
   /**
            * Direction of satellite, 0: 0 deg, 255: 360 deg.
            */
   public byte[] azimuth_;
   /**
            * dBHz, Signal to noise ratio of satellite C/N0, range 0..99, zero when not tracking this satellite.
            */
   public byte[] snr_;
   /**
            * Satellite PRN code assignment, (psuedorandom number SBAS, valid codes are 120-144)
            */
   public byte[] prn_;

   public SatelliteInfo()
   {
      svid_ = new byte[20];

      used_ = new byte[20];

      elevation_ = new byte[20];

      azimuth_ = new byte[20];

      snr_ = new byte[20];

      prn_ = new byte[20];

   }

   public SatelliteInfo(SatelliteInfo other)
   {
      this();
      set(other);
   }

   public void set(SatelliteInfo other)
   {
      timestamp_ = other.timestamp_;

      count_ = other.count_;

      for(int i1 = 0; i1 < svid_.length; ++i1)
      {
            svid_[i1] = other.svid_[i1];

      }

      for(int i3 = 0; i3 < used_.length; ++i3)
      {
            used_[i3] = other.used_[i3];

      }

      for(int i5 = 0; i5 < elevation_.length; ++i5)
      {
            elevation_[i5] = other.elevation_[i5];

      }

      for(int i7 = 0; i7 < azimuth_.length; ++i7)
      {
            azimuth_[i7] = other.azimuth_[i7];

      }

      for(int i9 = 0; i9 < snr_.length; ++i9)
      {
            snr_[i9] = other.snr_[i9];

      }

      for(int i11 = 0; i11 < prn_.length; ++i11)
      {
            prn_[i11] = other.prn_[i11];

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
            * Number of satellites visible to the receiver
            */
   public void setCount(byte count)
   {
      count_ = count;
   }
   /**
            * Number of satellites visible to the receiver
            */
   public byte getCount()
   {
      return count_;
   }


   /**
            * Space vehicle ID [1..255], see scheme below
            */
   public byte[] getSvid()
   {
      return svid_;
   }


   /**
            * 0: Satellite not used, 1: used for navigation
            */
   public byte[] getUsed()
   {
      return used_;
   }


   /**
            * Elevation (0: right on top of receiver, 90: on the horizon) of satellite
            */
   public byte[] getElevation()
   {
      return elevation_;
   }


   /**
            * Direction of satellite, 0: 0 deg, 255: 360 deg.
            */
   public byte[] getAzimuth()
   {
      return azimuth_;
   }


   /**
            * dBHz, Signal to noise ratio of satellite C/N0, range 0..99, zero when not tracking this satellite.
            */
   public byte[] getSnr()
   {
      return snr_;
   }


   /**
            * Satellite PRN code assignment, (psuedorandom number SBAS, valid codes are 120-144)
            */
   public byte[] getPrn()
   {
      return prn_;
   }


   public static Supplier<SatelliteInfoPubSubType> getPubSubType()
   {
      return SatelliteInfoPubSubType::new;
   }

   @Override
   public Supplier<TopicDataType> getPubSubTypePacket()
   {
      return SatelliteInfoPubSubType::new;
   }

   @Override
   public boolean epsilonEquals(SatelliteInfo other, double epsilon)
   {
      if(other == null) return false;
      if(other == this) return true;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_, other.timestamp_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.count_, other.count_, epsilon)) return false;

      for(int i13 = 0; i13 < svid_.length; ++i13)
      {
                if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.svid_[i13], other.svid_[i13], epsilon)) return false;
      }

      for(int i15 = 0; i15 < used_.length; ++i15)
      {
                if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.used_[i15], other.used_[i15], epsilon)) return false;
      }

      for(int i17 = 0; i17 < elevation_.length; ++i17)
      {
                if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.elevation_[i17], other.elevation_[i17], epsilon)) return false;
      }

      for(int i19 = 0; i19 < azimuth_.length; ++i19)
      {
                if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.azimuth_[i19], other.azimuth_[i19], epsilon)) return false;
      }

      for(int i21 = 0; i21 < snr_.length; ++i21)
      {
                if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.snr_[i21], other.snr_[i21], epsilon)) return false;
      }

      for(int i23 = 0; i23 < prn_.length; ++i23)
      {
                if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.prn_[i23], other.prn_[i23], epsilon)) return false;
      }


      return true;
   }

   @Override
   public boolean equals(Object other)
   {
      if(other == null) return false;
      if(other == this) return true;
      if(!(other instanceof SatelliteInfo)) return false;

      SatelliteInfo otherMyClass = (SatelliteInfo) other;

      if(this.timestamp_ != otherMyClass.timestamp_) return false;

      if(this.count_ != otherMyClass.count_) return false;

      for(int i25 = 0; i25 < svid_.length; ++i25)
      {
                if(this.svid_[i25] != otherMyClass.svid_[i25]) return false;

      }
      for(int i27 = 0; i27 < used_.length; ++i27)
      {
                if(this.used_[i27] != otherMyClass.used_[i27]) return false;

      }
      for(int i29 = 0; i29 < elevation_.length; ++i29)
      {
                if(this.elevation_[i29] != otherMyClass.elevation_[i29]) return false;

      }
      for(int i31 = 0; i31 < azimuth_.length; ++i31)
      {
                if(this.azimuth_[i31] != otherMyClass.azimuth_[i31]) return false;

      }
      for(int i33 = 0; i33 < snr_.length; ++i33)
      {
                if(this.snr_[i33] != otherMyClass.snr_[i33]) return false;

      }
      for(int i35 = 0; i35 < prn_.length; ++i35)
      {
                if(this.prn_[i35] != otherMyClass.prn_[i35]) return false;

      }

      return true;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("SatelliteInfo {");
      builder.append("timestamp=");
      builder.append(this.timestamp_);      builder.append(", ");
      builder.append("count=");
      builder.append(this.count_);      builder.append(", ");
      builder.append("svid=");
      builder.append(java.util.Arrays.toString(this.svid_));      builder.append(", ");
      builder.append("used=");
      builder.append(java.util.Arrays.toString(this.used_));      builder.append(", ");
      builder.append("elevation=");
      builder.append(java.util.Arrays.toString(this.elevation_));      builder.append(", ");
      builder.append("azimuth=");
      builder.append(java.util.Arrays.toString(this.azimuth_));      builder.append(", ");
      builder.append("snr=");
      builder.append(java.util.Arrays.toString(this.snr_));      builder.append(", ");
      builder.append("prn=");
      builder.append(java.util.Arrays.toString(this.prn_));
      builder.append("}");
      return builder.toString();
   }
}
