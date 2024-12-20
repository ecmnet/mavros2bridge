package px4_msgs.msg.dds;

import us.ihmc.communication.packets.Packet;
import us.ihmc.euclid.interfaces.Settable;
import us.ihmc.euclid.interfaces.EpsilonComparable;
import java.util.function.Supplier;
import us.ihmc.pubsub.TopicDataType;

public class VehicleAirData extends Packet<VehicleAirData> implements Settable<VehicleAirData>, EpsilonComparable<VehicleAirData>
{
   /**
            * time since system start (microseconds)
            */
   public long timestamp_;
   /**
            * the timestamp of the raw data (microseconds)
            */
   public long timestamp_sample_;
   /**
            * unique device ID for the selected barometer
            */
   public long baro_device_id_;
   /**
            * Altitude above MSL calculated from temperature compensated baro sensor data using an ISA corrected for sea level pressure SENS_BARO_QNH.
            */
   public float baro_alt_meter_;
   /**
            * Temperature in degrees Celsius
            */
   public float baro_temp_celcius_;
   /**
            * Absolute pressure in Pascals
            */
   public float baro_pressure_pa_;
   /**
            * air density
            */
   public float rho_;
   /**
            * equivalent airspeed to true airspeed conversion factor
            */
   public float eas2tas_;
   /**
            * Calibration changed counter. Monotonically increases whenever calibration changes.
            */
   public byte calibration_count_;

   public VehicleAirData()
   {
   }

   public VehicleAirData(VehicleAirData other)
   {
      this();
      set(other);
   }

   public void set(VehicleAirData other)
   {
      timestamp_ = other.timestamp_;

      timestamp_sample_ = other.timestamp_sample_;

      baro_device_id_ = other.baro_device_id_;

      baro_alt_meter_ = other.baro_alt_meter_;

      baro_temp_celcius_ = other.baro_temp_celcius_;

      baro_pressure_pa_ = other.baro_pressure_pa_;

      rho_ = other.rho_;

      eas2tas_ = other.eas2tas_;

      calibration_count_ = other.calibration_count_;

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
            * the timestamp of the raw data (microseconds)
            */
   public void setTimestampSample(long timestamp_sample)
   {
      timestamp_sample_ = timestamp_sample;
   }
   /**
            * the timestamp of the raw data (microseconds)
            */
   public long getTimestampSample()
   {
      return timestamp_sample_;
   }

   /**
            * unique device ID for the selected barometer
            */
   public void setBaroDeviceId(long baro_device_id)
   {
      baro_device_id_ = baro_device_id;
   }
   /**
            * unique device ID for the selected barometer
            */
   public long getBaroDeviceId()
   {
      return baro_device_id_;
   }

   /**
            * Altitude above MSL calculated from temperature compensated baro sensor data using an ISA corrected for sea level pressure SENS_BARO_QNH.
            */
   public void setBaroAltMeter(float baro_alt_meter)
   {
      baro_alt_meter_ = baro_alt_meter;
   }
   /**
            * Altitude above MSL calculated from temperature compensated baro sensor data using an ISA corrected for sea level pressure SENS_BARO_QNH.
            */
   public float getBaroAltMeter()
   {
      return baro_alt_meter_;
   }

   /**
            * Temperature in degrees Celsius
            */
   public void setBaroTempCelcius(float baro_temp_celcius)
   {
      baro_temp_celcius_ = baro_temp_celcius;
   }
   /**
            * Temperature in degrees Celsius
            */
   public float getBaroTempCelcius()
   {
      return baro_temp_celcius_;
   }

   /**
            * Absolute pressure in Pascals
            */
   public void setBaroPressurePa(float baro_pressure_pa)
   {
      baro_pressure_pa_ = baro_pressure_pa;
   }
   /**
            * Absolute pressure in Pascals
            */
   public float getBaroPressurePa()
   {
      return baro_pressure_pa_;
   }

   /**
            * air density
            */
   public void setRho(float rho)
   {
      rho_ = rho;
   }
   /**
            * air density
            */
   public float getRho()
   {
      return rho_;
   }

   /**
            * equivalent airspeed to true airspeed conversion factor
            */
   public void setEas2tas(float eas2tas)
   {
      eas2tas_ = eas2tas;
   }
   /**
            * equivalent airspeed to true airspeed conversion factor
            */
   public float getEas2tas()
   {
      return eas2tas_;
   }

   /**
            * Calibration changed counter. Monotonically increases whenever calibration changes.
            */
   public void setCalibrationCount(byte calibration_count)
   {
      calibration_count_ = calibration_count;
   }
   /**
            * Calibration changed counter. Monotonically increases whenever calibration changes.
            */
   public byte getCalibrationCount()
   {
      return calibration_count_;
   }


   public static Supplier<VehicleAirDataPubSubType> getPubSubType()
   {
      return VehicleAirDataPubSubType::new;
   }

   @Override
   public Supplier<TopicDataType> getPubSubTypePacket()
   {
      return VehicleAirDataPubSubType::new;
   }

   @Override
   public boolean epsilonEquals(VehicleAirData other, double epsilon)
   {
      if(other == null) return false;
      if(other == this) return true;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_, other.timestamp_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_sample_, other.timestamp_sample_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.baro_device_id_, other.baro_device_id_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.baro_alt_meter_, other.baro_alt_meter_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.baro_temp_celcius_, other.baro_temp_celcius_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.baro_pressure_pa_, other.baro_pressure_pa_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.rho_, other.rho_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.eas2tas_, other.eas2tas_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.calibration_count_, other.calibration_count_, epsilon)) return false;


      return true;
   }

   @Override
   public boolean equals(Object other)
   {
      if(other == null) return false;
      if(other == this) return true;
      if(!(other instanceof VehicleAirData)) return false;

      VehicleAirData otherMyClass = (VehicleAirData) other;

      if(this.timestamp_ != otherMyClass.timestamp_) return false;

      if(this.timestamp_sample_ != otherMyClass.timestamp_sample_) return false;

      if(this.baro_device_id_ != otherMyClass.baro_device_id_) return false;

      if(this.baro_alt_meter_ != otherMyClass.baro_alt_meter_) return false;

      if(this.baro_temp_celcius_ != otherMyClass.baro_temp_celcius_) return false;

      if(this.baro_pressure_pa_ != otherMyClass.baro_pressure_pa_) return false;

      if(this.rho_ != otherMyClass.rho_) return false;

      if(this.eas2tas_ != otherMyClass.eas2tas_) return false;

      if(this.calibration_count_ != otherMyClass.calibration_count_) return false;


      return true;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("VehicleAirData {");
      builder.append("timestamp=");
      builder.append(this.timestamp_);      builder.append(", ");
      builder.append("timestamp_sample=");
      builder.append(this.timestamp_sample_);      builder.append(", ");
      builder.append("baro_device_id=");
      builder.append(this.baro_device_id_);      builder.append(", ");
      builder.append("baro_alt_meter=");
      builder.append(this.baro_alt_meter_);      builder.append(", ");
      builder.append("baro_temp_celcius=");
      builder.append(this.baro_temp_celcius_);      builder.append(", ");
      builder.append("baro_pressure_pa=");
      builder.append(this.baro_pressure_pa_);      builder.append(", ");
      builder.append("rho=");
      builder.append(this.rho_);      builder.append(", ");
      builder.append("eas2tas=");
      builder.append(this.eas2tas_);      builder.append(", ");
      builder.append("calibration_count=");
      builder.append(this.calibration_count_);
      builder.append("}");
      return builder.toString();
   }
}
