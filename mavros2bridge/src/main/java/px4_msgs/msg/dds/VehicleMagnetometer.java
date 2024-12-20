package px4_msgs.msg.dds;

import us.ihmc.communication.packets.Packet;
import us.ihmc.euclid.interfaces.Settable;
import us.ihmc.euclid.interfaces.EpsilonComparable;
import java.util.function.Supplier;
import us.ihmc.pubsub.TopicDataType;

public class VehicleMagnetometer extends Packet<VehicleMagnetometer> implements Settable<VehicleMagnetometer>, EpsilonComparable<VehicleMagnetometer>
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
            * unique device ID for the selected magnetometer
            */
   public long device_id_;
   /**
            * Magnetic field in the FRD body frame XYZ-axis in Gauss
            */
   public float[] magnetometer_ga_;
   /**
            * Calibration changed counter. Monotonically increases whenever calibration changes.
            */
   public byte calibration_count_;

   public VehicleMagnetometer()
   {
      magnetometer_ga_ = new float[3];

   }

   public VehicleMagnetometer(VehicleMagnetometer other)
   {
      this();
      set(other);
   }

   public void set(VehicleMagnetometer other)
   {
      timestamp_ = other.timestamp_;

      timestamp_sample_ = other.timestamp_sample_;

      device_id_ = other.device_id_;

      for(int i1 = 0; i1 < magnetometer_ga_.length; ++i1)
      {
            magnetometer_ga_[i1] = other.magnetometer_ga_[i1];

      }

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
            * unique device ID for the selected magnetometer
            */
   public void setDeviceId(long device_id)
   {
      device_id_ = device_id;
   }
   /**
            * unique device ID for the selected magnetometer
            */
   public long getDeviceId()
   {
      return device_id_;
   }


   /**
            * Magnetic field in the FRD body frame XYZ-axis in Gauss
            */
   public float[] getMagnetometerGa()
   {
      return magnetometer_ga_;
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


   public static Supplier<VehicleMagnetometerPubSubType> getPubSubType()
   {
      return VehicleMagnetometerPubSubType::new;
   }

   @Override
   public Supplier<TopicDataType> getPubSubTypePacket()
   {
      return VehicleMagnetometerPubSubType::new;
   }

   @Override
   public boolean epsilonEquals(VehicleMagnetometer other, double epsilon)
   {
      if(other == null) return false;
      if(other == this) return true;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_, other.timestamp_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_sample_, other.timestamp_sample_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.device_id_, other.device_id_, epsilon)) return false;

      for(int i3 = 0; i3 < magnetometer_ga_.length; ++i3)
      {
                if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.magnetometer_ga_[i3], other.magnetometer_ga_[i3], epsilon)) return false;
      }

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.calibration_count_, other.calibration_count_, epsilon)) return false;


      return true;
   }

   @Override
   public boolean equals(Object other)
   {
      if(other == null) return false;
      if(other == this) return true;
      if(!(other instanceof VehicleMagnetometer)) return false;

      VehicleMagnetometer otherMyClass = (VehicleMagnetometer) other;

      if(this.timestamp_ != otherMyClass.timestamp_) return false;

      if(this.timestamp_sample_ != otherMyClass.timestamp_sample_) return false;

      if(this.device_id_ != otherMyClass.device_id_) return false;

      for(int i5 = 0; i5 < magnetometer_ga_.length; ++i5)
      {
                if(this.magnetometer_ga_[i5] != otherMyClass.magnetometer_ga_[i5]) return false;

      }
      if(this.calibration_count_ != otherMyClass.calibration_count_) return false;


      return true;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("VehicleMagnetometer {");
      builder.append("timestamp=");
      builder.append(this.timestamp_);      builder.append(", ");
      builder.append("timestamp_sample=");
      builder.append(this.timestamp_sample_);      builder.append(", ");
      builder.append("device_id=");
      builder.append(this.device_id_);      builder.append(", ");
      builder.append("magnetometer_ga=");
      builder.append(java.util.Arrays.toString(this.magnetometer_ga_));      builder.append(", ");
      builder.append("calibration_count=");
      builder.append(this.calibration_count_);
      builder.append("}");
      return builder.toString();
   }
}
