package px4_msgs.msg.dds;

import us.ihmc.communication.packets.Packet;
import us.ihmc.euclid.interfaces.Settable;
import us.ihmc.euclid.interfaces.EpsilonComparable;
import java.util.function.Supplier;
import us.ihmc.pubsub.TopicDataType;

/**
       * UWB distance contains the distance information measured by an ultra-wideband positioning system,
       * such as Pozyx or NXP Rddrone.
       */
public class SensorUwb extends Packet<SensorUwb> implements Settable<SensorUwb>, EpsilonComparable<SensorUwb>
{
   /**
            * time since system start (microseconds)
            */
   public long timestamp_;
   /**
            * UWB SessionID
            */
   public long sessionid_;
   /**
            * Time between Ranging Rounds in ms
            */
   public long time_offset_;
   /**
            * Number of Ranges since last Start of Ranging
            */
   public long counter_;
   /**
            * MAC adress of Initiator (controller)
            */
   public int mac_;
   /**
            * MAC adress of Responder (Controlee)
            */
   public int mac_dest_;
   /**
            * status feedback #
            */
   public int status_;
   /**
            * None line of site condition y/n
            */
   public byte nlos_;
   /**
            * distance in m to the UWB receiver
            */
   public float distance_;
   /**
            * Angle of arrival, Angle in Degree -60..+60; FOV in both axis is 120 degrees
            * Angle of arrival of first incomming RX msg
            */
   public float aoa_azimuth_dev_;
   /**
            * Angle of arrival of first incomming RX msg
            */
   public float aoa_elevation_dev_;
   /**
            * Angle of arrival of first incomming RX msg at the responder
            */
   public float aoa_azimuth_resp_;
   /**
            * Angle of arrival of first incomming RX msg at the responder
            */
   public float aoa_elevation_resp_;
   /**
            * Figure of merit for the angle measurements
            * AOA Azimuth FOM
            */
   public byte aoa_azimuth_fom_;
   /**
            * AOA Elevation FOM
            */
   public byte aoa_elevation_fom_;
   /**
            * AOA Azimuth FOM
            */
   public byte aoa_dest_azimuth_fom_;
   /**
            * AOA Elevation FOM
            */
   public byte aoa_dest_elevation_fom_;
   /**
            * Initiator physical configuration
            * Direction the sensor faces from MAV_SENSOR_ORIENTATION enum
            */
   public byte orientation_;
   /**
            * Standard configuration is Antennas facing down and azimuth aligened in forward direction
            * UWB initiator offset in X axis (NED drone frame)
            */
   public float offset_x_;
   /**
            * UWB initiator offset in Y axis (NED drone frame)
            */
   public float offset_y_;
   /**
            * UWB initiator offset in Z axis (NED drone frame)
            */
   public float offset_z_;

   public SensorUwb()
   {
   }

   public SensorUwb(SensorUwb other)
   {
      this();
      set(other);
   }

   public void set(SensorUwb other)
   {
      timestamp_ = other.timestamp_;

      sessionid_ = other.sessionid_;

      time_offset_ = other.time_offset_;

      counter_ = other.counter_;

      mac_ = other.mac_;

      mac_dest_ = other.mac_dest_;

      status_ = other.status_;

      nlos_ = other.nlos_;

      distance_ = other.distance_;

      aoa_azimuth_dev_ = other.aoa_azimuth_dev_;

      aoa_elevation_dev_ = other.aoa_elevation_dev_;

      aoa_azimuth_resp_ = other.aoa_azimuth_resp_;

      aoa_elevation_resp_ = other.aoa_elevation_resp_;

      aoa_azimuth_fom_ = other.aoa_azimuth_fom_;

      aoa_elevation_fom_ = other.aoa_elevation_fom_;

      aoa_dest_azimuth_fom_ = other.aoa_dest_azimuth_fom_;

      aoa_dest_elevation_fom_ = other.aoa_dest_elevation_fom_;

      orientation_ = other.orientation_;

      offset_x_ = other.offset_x_;

      offset_y_ = other.offset_y_;

      offset_z_ = other.offset_z_;

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
            * UWB SessionID
            */
   public void setSessionid(long sessionid)
   {
      sessionid_ = sessionid;
   }
   /**
            * UWB SessionID
            */
   public long getSessionid()
   {
      return sessionid_;
   }

   /**
            * Time between Ranging Rounds in ms
            */
   public void setTimeOffset(long time_offset)
   {
      time_offset_ = time_offset;
   }
   /**
            * Time between Ranging Rounds in ms
            */
   public long getTimeOffset()
   {
      return time_offset_;
   }

   /**
            * Number of Ranges since last Start of Ranging
            */
   public void setCounter(long counter)
   {
      counter_ = counter;
   }
   /**
            * Number of Ranges since last Start of Ranging
            */
   public long getCounter()
   {
      return counter_;
   }

   /**
            * MAC adress of Initiator (controller)
            */
   public void setMac(int mac)
   {
      mac_ = mac;
   }
   /**
            * MAC adress of Initiator (controller)
            */
   public int getMac()
   {
      return mac_;
   }

   /**
            * MAC adress of Responder (Controlee)
            */
   public void setMacDest(int mac_dest)
   {
      mac_dest_ = mac_dest;
   }
   /**
            * MAC adress of Responder (Controlee)
            */
   public int getMacDest()
   {
      return mac_dest_;
   }

   /**
            * status feedback #
            */
   public void setStatus(int status)
   {
      status_ = status;
   }
   /**
            * status feedback #
            */
   public int getStatus()
   {
      return status_;
   }

   /**
            * None line of site condition y/n
            */
   public void setNlos(byte nlos)
   {
      nlos_ = nlos;
   }
   /**
            * None line of site condition y/n
            */
   public byte getNlos()
   {
      return nlos_;
   }

   /**
            * distance in m to the UWB receiver
            */
   public void setDistance(float distance)
   {
      distance_ = distance;
   }
   /**
            * distance in m to the UWB receiver
            */
   public float getDistance()
   {
      return distance_;
   }

   /**
            * Angle of arrival, Angle in Degree -60..+60; FOV in both axis is 120 degrees
            * Angle of arrival of first incomming RX msg
            */
   public void setAoaAzimuthDev(float aoa_azimuth_dev)
   {
      aoa_azimuth_dev_ = aoa_azimuth_dev;
   }
   /**
            * Angle of arrival, Angle in Degree -60..+60; FOV in both axis is 120 degrees
            * Angle of arrival of first incomming RX msg
            */
   public float getAoaAzimuthDev()
   {
      return aoa_azimuth_dev_;
   }

   /**
            * Angle of arrival of first incomming RX msg
            */
   public void setAoaElevationDev(float aoa_elevation_dev)
   {
      aoa_elevation_dev_ = aoa_elevation_dev;
   }
   /**
            * Angle of arrival of first incomming RX msg
            */
   public float getAoaElevationDev()
   {
      return aoa_elevation_dev_;
   }

   /**
            * Angle of arrival of first incomming RX msg at the responder
            */
   public void setAoaAzimuthResp(float aoa_azimuth_resp)
   {
      aoa_azimuth_resp_ = aoa_azimuth_resp;
   }
   /**
            * Angle of arrival of first incomming RX msg at the responder
            */
   public float getAoaAzimuthResp()
   {
      return aoa_azimuth_resp_;
   }

   /**
            * Angle of arrival of first incomming RX msg at the responder
            */
   public void setAoaElevationResp(float aoa_elevation_resp)
   {
      aoa_elevation_resp_ = aoa_elevation_resp;
   }
   /**
            * Angle of arrival of first incomming RX msg at the responder
            */
   public float getAoaElevationResp()
   {
      return aoa_elevation_resp_;
   }

   /**
            * Figure of merit for the angle measurements
            * AOA Azimuth FOM
            */
   public void setAoaAzimuthFom(byte aoa_azimuth_fom)
   {
      aoa_azimuth_fom_ = aoa_azimuth_fom;
   }
   /**
            * Figure of merit for the angle measurements
            * AOA Azimuth FOM
            */
   public byte getAoaAzimuthFom()
   {
      return aoa_azimuth_fom_;
   }

   /**
            * AOA Elevation FOM
            */
   public void setAoaElevationFom(byte aoa_elevation_fom)
   {
      aoa_elevation_fom_ = aoa_elevation_fom;
   }
   /**
            * AOA Elevation FOM
            */
   public byte getAoaElevationFom()
   {
      return aoa_elevation_fom_;
   }

   /**
            * AOA Azimuth FOM
            */
   public void setAoaDestAzimuthFom(byte aoa_dest_azimuth_fom)
   {
      aoa_dest_azimuth_fom_ = aoa_dest_azimuth_fom;
   }
   /**
            * AOA Azimuth FOM
            */
   public byte getAoaDestAzimuthFom()
   {
      return aoa_dest_azimuth_fom_;
   }

   /**
            * AOA Elevation FOM
            */
   public void setAoaDestElevationFom(byte aoa_dest_elevation_fom)
   {
      aoa_dest_elevation_fom_ = aoa_dest_elevation_fom;
   }
   /**
            * AOA Elevation FOM
            */
   public byte getAoaDestElevationFom()
   {
      return aoa_dest_elevation_fom_;
   }

   /**
            * Initiator physical configuration
            * Direction the sensor faces from MAV_SENSOR_ORIENTATION enum
            */
   public void setOrientation(byte orientation)
   {
      orientation_ = orientation;
   }
   /**
            * Initiator physical configuration
            * Direction the sensor faces from MAV_SENSOR_ORIENTATION enum
            */
   public byte getOrientation()
   {
      return orientation_;
   }

   /**
            * Standard configuration is Antennas facing down and azimuth aligened in forward direction
            * UWB initiator offset in X axis (NED drone frame)
            */
   public void setOffsetX(float offset_x)
   {
      offset_x_ = offset_x;
   }
   /**
            * Standard configuration is Antennas facing down and azimuth aligened in forward direction
            * UWB initiator offset in X axis (NED drone frame)
            */
   public float getOffsetX()
   {
      return offset_x_;
   }

   /**
            * UWB initiator offset in Y axis (NED drone frame)
            */
   public void setOffsetY(float offset_y)
   {
      offset_y_ = offset_y;
   }
   /**
            * UWB initiator offset in Y axis (NED drone frame)
            */
   public float getOffsetY()
   {
      return offset_y_;
   }

   /**
            * UWB initiator offset in Z axis (NED drone frame)
            */
   public void setOffsetZ(float offset_z)
   {
      offset_z_ = offset_z;
   }
   /**
            * UWB initiator offset in Z axis (NED drone frame)
            */
   public float getOffsetZ()
   {
      return offset_z_;
   }


   public static Supplier<SensorUwbPubSubType> getPubSubType()
   {
      return SensorUwbPubSubType::new;
   }

   @Override
   public Supplier<TopicDataType> getPubSubTypePacket()
   {
      return SensorUwbPubSubType::new;
   }

   @Override
   public boolean epsilonEquals(SensorUwb other, double epsilon)
   {
      if(other == null) return false;
      if(other == this) return true;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_, other.timestamp_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.sessionid_, other.sessionid_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.time_offset_, other.time_offset_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.counter_, other.counter_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.mac_, other.mac_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.mac_dest_, other.mac_dest_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.status_, other.status_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.nlos_, other.nlos_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.distance_, other.distance_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.aoa_azimuth_dev_, other.aoa_azimuth_dev_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.aoa_elevation_dev_, other.aoa_elevation_dev_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.aoa_azimuth_resp_, other.aoa_azimuth_resp_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.aoa_elevation_resp_, other.aoa_elevation_resp_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.aoa_azimuth_fom_, other.aoa_azimuth_fom_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.aoa_elevation_fom_, other.aoa_elevation_fom_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.aoa_dest_azimuth_fom_, other.aoa_dest_azimuth_fom_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.aoa_dest_elevation_fom_, other.aoa_dest_elevation_fom_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.orientation_, other.orientation_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.offset_x_, other.offset_x_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.offset_y_, other.offset_y_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.offset_z_, other.offset_z_, epsilon)) return false;


      return true;
   }

   @Override
   public boolean equals(Object other)
   {
      if(other == null) return false;
      if(other == this) return true;
      if(!(other instanceof SensorUwb)) return false;

      SensorUwb otherMyClass = (SensorUwb) other;

      if(this.timestamp_ != otherMyClass.timestamp_) return false;

      if(this.sessionid_ != otherMyClass.sessionid_) return false;

      if(this.time_offset_ != otherMyClass.time_offset_) return false;

      if(this.counter_ != otherMyClass.counter_) return false;

      if(this.mac_ != otherMyClass.mac_) return false;

      if(this.mac_dest_ != otherMyClass.mac_dest_) return false;

      if(this.status_ != otherMyClass.status_) return false;

      if(this.nlos_ != otherMyClass.nlos_) return false;

      if(this.distance_ != otherMyClass.distance_) return false;

      if(this.aoa_azimuth_dev_ != otherMyClass.aoa_azimuth_dev_) return false;

      if(this.aoa_elevation_dev_ != otherMyClass.aoa_elevation_dev_) return false;

      if(this.aoa_azimuth_resp_ != otherMyClass.aoa_azimuth_resp_) return false;

      if(this.aoa_elevation_resp_ != otherMyClass.aoa_elevation_resp_) return false;

      if(this.aoa_azimuth_fom_ != otherMyClass.aoa_azimuth_fom_) return false;

      if(this.aoa_elevation_fom_ != otherMyClass.aoa_elevation_fom_) return false;

      if(this.aoa_dest_azimuth_fom_ != otherMyClass.aoa_dest_azimuth_fom_) return false;

      if(this.aoa_dest_elevation_fom_ != otherMyClass.aoa_dest_elevation_fom_) return false;

      if(this.orientation_ != otherMyClass.orientation_) return false;

      if(this.offset_x_ != otherMyClass.offset_x_) return false;

      if(this.offset_y_ != otherMyClass.offset_y_) return false;

      if(this.offset_z_ != otherMyClass.offset_z_) return false;


      return true;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("SensorUwb {");
      builder.append("timestamp=");
      builder.append(this.timestamp_);      builder.append(", ");
      builder.append("sessionid=");
      builder.append(this.sessionid_);      builder.append(", ");
      builder.append("time_offset=");
      builder.append(this.time_offset_);      builder.append(", ");
      builder.append("counter=");
      builder.append(this.counter_);      builder.append(", ");
      builder.append("mac=");
      builder.append(this.mac_);      builder.append(", ");
      builder.append("mac_dest=");
      builder.append(this.mac_dest_);      builder.append(", ");
      builder.append("status=");
      builder.append(this.status_);      builder.append(", ");
      builder.append("nlos=");
      builder.append(this.nlos_);      builder.append(", ");
      builder.append("distance=");
      builder.append(this.distance_);      builder.append(", ");
      builder.append("aoa_azimuth_dev=");
      builder.append(this.aoa_azimuth_dev_);      builder.append(", ");
      builder.append("aoa_elevation_dev=");
      builder.append(this.aoa_elevation_dev_);      builder.append(", ");
      builder.append("aoa_azimuth_resp=");
      builder.append(this.aoa_azimuth_resp_);      builder.append(", ");
      builder.append("aoa_elevation_resp=");
      builder.append(this.aoa_elevation_resp_);      builder.append(", ");
      builder.append("aoa_azimuth_fom=");
      builder.append(this.aoa_azimuth_fom_);      builder.append(", ");
      builder.append("aoa_elevation_fom=");
      builder.append(this.aoa_elevation_fom_);      builder.append(", ");
      builder.append("aoa_dest_azimuth_fom=");
      builder.append(this.aoa_dest_azimuth_fom_);      builder.append(", ");
      builder.append("aoa_dest_elevation_fom=");
      builder.append(this.aoa_dest_elevation_fom_);      builder.append(", ");
      builder.append("orientation=");
      builder.append(this.orientation_);      builder.append(", ");
      builder.append("offset_x=");
      builder.append(this.offset_x_);      builder.append(", ");
      builder.append("offset_y=");
      builder.append(this.offset_y_);      builder.append(", ");
      builder.append("offset_z=");
      builder.append(this.offset_z_);
      builder.append("}");
      return builder.toString();
   }
}
