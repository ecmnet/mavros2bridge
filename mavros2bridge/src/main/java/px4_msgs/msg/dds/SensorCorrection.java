package px4_msgs.msg.dds;

import us.ihmc.communication.packets.Packet;
import us.ihmc.euclid.interfaces.Settable;
import us.ihmc.euclid.interfaces.EpsilonComparable;
import java.util.function.Supplier;
import us.ihmc.pubsub.TopicDataType;

/**
       * 
       * Sensor corrections in SI-unit form for the voted sensor
       * 
       */
public class SensorCorrection extends Packet<SensorCorrection> implements Settable<SensorCorrection>, EpsilonComparable<SensorCorrection>
{
   /**
            * time since system start (microseconds)
            */
   public long timestamp_;
   public float[] accel_temperature_;
   /**
            * accelerometer 0 offsets in the FRD board frame XYZ-axis in m/s^s
            */
   public float[] accel_offset_0_;
   /**
            * accelerometer 1 offsets in the FRD board frame XYZ-axis in m/s^s
            */
   public float[] accel_offset_1_;
   /**
            * accelerometer 2 offsets in the FRD board frame XYZ-axis in m/s^s
            */
   public float[] accel_offset_2_;
   /**
            * accelerometer 3 offsets in the FRD board frame XYZ-axis in m/s^s
            */
   public float[] accel_offset_3_;
   public float[] gyro_temperature_;
   /**
            * gyro 0 XYZ offsets in the sensor frame in rad/s
            */
   public float[] gyro_offset_0_;
   /**
            * gyro 1 XYZ offsets in the sensor frame in rad/s
            */
   public float[] gyro_offset_1_;
   /**
            * gyro 2 XYZ offsets in the sensor frame in rad/s
            */
   public float[] gyro_offset_2_;
   /**
            * gyro 3 XYZ offsets in the sensor frame in rad/s
            */
   public float[] gyro_offset_3_;
   public float[] mag_temperature_;
   /**
            * magnetometer 0 offsets in the FRD board frame XYZ-axis in m/s^s
            */
   public float[] mag_offset_0_;
   /**
            * magnetometer 1 offsets in the FRD board frame XYZ-axis in m/s^s
            */
   public float[] mag_offset_1_;
   /**
            * magnetometer 2 offsets in the FRD board frame XYZ-axis in m/s^s
            */
   public float[] mag_offset_2_;
   /**
            * magnetometer 3 offsets in the FRD board frame XYZ-axis in m/s^s
            */
   public float[] mag_offset_3_;
   public float[] baro_temperature_;
   /**
            * barometric pressure 0 offsets in the sensor frame in Pascals
            */
   public float baro_offset_0_;
   /**
            * barometric pressure 1 offsets in the sensor frame in Pascals
            */
   public float baro_offset_1_;
   /**
            * barometric pressure 2 offsets in the sensor frame in Pascals
            */
   public float baro_offset_2_;
   /**
            * barometric pressure 3 offsets in the sensor frame in Pascals
            */
   public float baro_offset_3_;

   public SensorCorrection()
   {
      accel_temperature_ = new float[4];

      accel_offset_0_ = new float[3];

      accel_offset_1_ = new float[3];

      accel_offset_2_ = new float[3];

      accel_offset_3_ = new float[3];

      gyro_temperature_ = new float[4];

      gyro_offset_0_ = new float[3];

      gyro_offset_1_ = new float[3];

      gyro_offset_2_ = new float[3];

      gyro_offset_3_ = new float[3];

      mag_temperature_ = new float[4];

      mag_offset_0_ = new float[3];

      mag_offset_1_ = new float[3];

      mag_offset_2_ = new float[3];

      mag_offset_3_ = new float[3];

      baro_temperature_ = new float[4];

   }

   public SensorCorrection(SensorCorrection other)
   {
      this();
      set(other);
   }

   public void set(SensorCorrection other)
   {
      timestamp_ = other.timestamp_;

      for(int i1 = 0; i1 < accel_temperature_.length; ++i1)
      {
            accel_temperature_[i1] = other.accel_temperature_[i1];

      }

      for(int i3 = 0; i3 < accel_offset_0_.length; ++i3)
      {
            accel_offset_0_[i3] = other.accel_offset_0_[i3];

      }

      for(int i5 = 0; i5 < accel_offset_1_.length; ++i5)
      {
            accel_offset_1_[i5] = other.accel_offset_1_[i5];

      }

      for(int i7 = 0; i7 < accel_offset_2_.length; ++i7)
      {
            accel_offset_2_[i7] = other.accel_offset_2_[i7];

      }

      for(int i9 = 0; i9 < accel_offset_3_.length; ++i9)
      {
            accel_offset_3_[i9] = other.accel_offset_3_[i9];

      }

      for(int i11 = 0; i11 < gyro_temperature_.length; ++i11)
      {
            gyro_temperature_[i11] = other.gyro_temperature_[i11];

      }

      for(int i13 = 0; i13 < gyro_offset_0_.length; ++i13)
      {
            gyro_offset_0_[i13] = other.gyro_offset_0_[i13];

      }

      for(int i15 = 0; i15 < gyro_offset_1_.length; ++i15)
      {
            gyro_offset_1_[i15] = other.gyro_offset_1_[i15];

      }

      for(int i17 = 0; i17 < gyro_offset_2_.length; ++i17)
      {
            gyro_offset_2_[i17] = other.gyro_offset_2_[i17];

      }

      for(int i19 = 0; i19 < gyro_offset_3_.length; ++i19)
      {
            gyro_offset_3_[i19] = other.gyro_offset_3_[i19];

      }

      for(int i21 = 0; i21 < mag_temperature_.length; ++i21)
      {
            mag_temperature_[i21] = other.mag_temperature_[i21];

      }

      for(int i23 = 0; i23 < mag_offset_0_.length; ++i23)
      {
            mag_offset_0_[i23] = other.mag_offset_0_[i23];

      }

      for(int i25 = 0; i25 < mag_offset_1_.length; ++i25)
      {
            mag_offset_1_[i25] = other.mag_offset_1_[i25];

      }

      for(int i27 = 0; i27 < mag_offset_2_.length; ++i27)
      {
            mag_offset_2_[i27] = other.mag_offset_2_[i27];

      }

      for(int i29 = 0; i29 < mag_offset_3_.length; ++i29)
      {
            mag_offset_3_[i29] = other.mag_offset_3_[i29];

      }

      for(int i31 = 0; i31 < baro_temperature_.length; ++i31)
      {
            baro_temperature_[i31] = other.baro_temperature_[i31];

      }

      baro_offset_0_ = other.baro_offset_0_;

      baro_offset_1_ = other.baro_offset_1_;

      baro_offset_2_ = other.baro_offset_2_;

      baro_offset_3_ = other.baro_offset_3_;

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


   public float[] getAccelTemperature()
   {
      return accel_temperature_;
   }


   /**
            * accelerometer 0 offsets in the FRD board frame XYZ-axis in m/s^s
            */
   public float[] getAccelOffset0()
   {
      return accel_offset_0_;
   }


   /**
            * accelerometer 1 offsets in the FRD board frame XYZ-axis in m/s^s
            */
   public float[] getAccelOffset1()
   {
      return accel_offset_1_;
   }


   /**
            * accelerometer 2 offsets in the FRD board frame XYZ-axis in m/s^s
            */
   public float[] getAccelOffset2()
   {
      return accel_offset_2_;
   }


   /**
            * accelerometer 3 offsets in the FRD board frame XYZ-axis in m/s^s
            */
   public float[] getAccelOffset3()
   {
      return accel_offset_3_;
   }


   public float[] getGyroTemperature()
   {
      return gyro_temperature_;
   }


   /**
            * gyro 0 XYZ offsets in the sensor frame in rad/s
            */
   public float[] getGyroOffset0()
   {
      return gyro_offset_0_;
   }


   /**
            * gyro 1 XYZ offsets in the sensor frame in rad/s
            */
   public float[] getGyroOffset1()
   {
      return gyro_offset_1_;
   }


   /**
            * gyro 2 XYZ offsets in the sensor frame in rad/s
            */
   public float[] getGyroOffset2()
   {
      return gyro_offset_2_;
   }


   /**
            * gyro 3 XYZ offsets in the sensor frame in rad/s
            */
   public float[] getGyroOffset3()
   {
      return gyro_offset_3_;
   }


   public float[] getMagTemperature()
   {
      return mag_temperature_;
   }


   /**
            * magnetometer 0 offsets in the FRD board frame XYZ-axis in m/s^s
            */
   public float[] getMagOffset0()
   {
      return mag_offset_0_;
   }


   /**
            * magnetometer 1 offsets in the FRD board frame XYZ-axis in m/s^s
            */
   public float[] getMagOffset1()
   {
      return mag_offset_1_;
   }


   /**
            * magnetometer 2 offsets in the FRD board frame XYZ-axis in m/s^s
            */
   public float[] getMagOffset2()
   {
      return mag_offset_2_;
   }


   /**
            * magnetometer 3 offsets in the FRD board frame XYZ-axis in m/s^s
            */
   public float[] getMagOffset3()
   {
      return mag_offset_3_;
   }


   public float[] getBaroTemperature()
   {
      return baro_temperature_;
   }

   /**
            * barometric pressure 0 offsets in the sensor frame in Pascals
            */
   public void setBaroOffset0(float baro_offset_0)
   {
      baro_offset_0_ = baro_offset_0;
   }
   /**
            * barometric pressure 0 offsets in the sensor frame in Pascals
            */
   public float getBaroOffset0()
   {
      return baro_offset_0_;
   }

   /**
            * barometric pressure 1 offsets in the sensor frame in Pascals
            */
   public void setBaroOffset1(float baro_offset_1)
   {
      baro_offset_1_ = baro_offset_1;
   }
   /**
            * barometric pressure 1 offsets in the sensor frame in Pascals
            */
   public float getBaroOffset1()
   {
      return baro_offset_1_;
   }

   /**
            * barometric pressure 2 offsets in the sensor frame in Pascals
            */
   public void setBaroOffset2(float baro_offset_2)
   {
      baro_offset_2_ = baro_offset_2;
   }
   /**
            * barometric pressure 2 offsets in the sensor frame in Pascals
            */
   public float getBaroOffset2()
   {
      return baro_offset_2_;
   }

   /**
            * barometric pressure 3 offsets in the sensor frame in Pascals
            */
   public void setBaroOffset3(float baro_offset_3)
   {
      baro_offset_3_ = baro_offset_3;
   }
   /**
            * barometric pressure 3 offsets in the sensor frame in Pascals
            */
   public float getBaroOffset3()
   {
      return baro_offset_3_;
   }


   public static Supplier<SensorCorrectionPubSubType> getPubSubType()
   {
      return SensorCorrectionPubSubType::new;
   }

   @Override
   public Supplier<TopicDataType> getPubSubTypePacket()
   {
      return SensorCorrectionPubSubType::new;
   }

   @Override
   public boolean epsilonEquals(SensorCorrection other, double epsilon)
   {
      if(other == null) return false;
      if(other == this) return true;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_, other.timestamp_, epsilon)) return false;

      for(int i33 = 0; i33 < accel_temperature_.length; ++i33)
      {
                if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.accel_temperature_[i33], other.accel_temperature_[i33], epsilon)) return false;
      }

      for(int i35 = 0; i35 < accel_offset_0_.length; ++i35)
      {
                if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.accel_offset_0_[i35], other.accel_offset_0_[i35], epsilon)) return false;
      }

      for(int i37 = 0; i37 < accel_offset_1_.length; ++i37)
      {
                if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.accel_offset_1_[i37], other.accel_offset_1_[i37], epsilon)) return false;
      }

      for(int i39 = 0; i39 < accel_offset_2_.length; ++i39)
      {
                if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.accel_offset_2_[i39], other.accel_offset_2_[i39], epsilon)) return false;
      }

      for(int i41 = 0; i41 < accel_offset_3_.length; ++i41)
      {
                if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.accel_offset_3_[i41], other.accel_offset_3_[i41], epsilon)) return false;
      }

      for(int i43 = 0; i43 < gyro_temperature_.length; ++i43)
      {
                if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.gyro_temperature_[i43], other.gyro_temperature_[i43], epsilon)) return false;
      }

      for(int i45 = 0; i45 < gyro_offset_0_.length; ++i45)
      {
                if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.gyro_offset_0_[i45], other.gyro_offset_0_[i45], epsilon)) return false;
      }

      for(int i47 = 0; i47 < gyro_offset_1_.length; ++i47)
      {
                if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.gyro_offset_1_[i47], other.gyro_offset_1_[i47], epsilon)) return false;
      }

      for(int i49 = 0; i49 < gyro_offset_2_.length; ++i49)
      {
                if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.gyro_offset_2_[i49], other.gyro_offset_2_[i49], epsilon)) return false;
      }

      for(int i51 = 0; i51 < gyro_offset_3_.length; ++i51)
      {
                if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.gyro_offset_3_[i51], other.gyro_offset_3_[i51], epsilon)) return false;
      }

      for(int i53 = 0; i53 < mag_temperature_.length; ++i53)
      {
                if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.mag_temperature_[i53], other.mag_temperature_[i53], epsilon)) return false;
      }

      for(int i55 = 0; i55 < mag_offset_0_.length; ++i55)
      {
                if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.mag_offset_0_[i55], other.mag_offset_0_[i55], epsilon)) return false;
      }

      for(int i57 = 0; i57 < mag_offset_1_.length; ++i57)
      {
                if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.mag_offset_1_[i57], other.mag_offset_1_[i57], epsilon)) return false;
      }

      for(int i59 = 0; i59 < mag_offset_2_.length; ++i59)
      {
                if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.mag_offset_2_[i59], other.mag_offset_2_[i59], epsilon)) return false;
      }

      for(int i61 = 0; i61 < mag_offset_3_.length; ++i61)
      {
                if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.mag_offset_3_[i61], other.mag_offset_3_[i61], epsilon)) return false;
      }

      for(int i63 = 0; i63 < baro_temperature_.length; ++i63)
      {
                if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.baro_temperature_[i63], other.baro_temperature_[i63], epsilon)) return false;
      }

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.baro_offset_0_, other.baro_offset_0_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.baro_offset_1_, other.baro_offset_1_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.baro_offset_2_, other.baro_offset_2_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.baro_offset_3_, other.baro_offset_3_, epsilon)) return false;


      return true;
   }

   @Override
   public boolean equals(Object other)
   {
      if(other == null) return false;
      if(other == this) return true;
      if(!(other instanceof SensorCorrection)) return false;

      SensorCorrection otherMyClass = (SensorCorrection) other;

      if(this.timestamp_ != otherMyClass.timestamp_) return false;

      for(int i65 = 0; i65 < accel_temperature_.length; ++i65)
      {
                if(this.accel_temperature_[i65] != otherMyClass.accel_temperature_[i65]) return false;

      }
      for(int i67 = 0; i67 < accel_offset_0_.length; ++i67)
      {
                if(this.accel_offset_0_[i67] != otherMyClass.accel_offset_0_[i67]) return false;

      }
      for(int i69 = 0; i69 < accel_offset_1_.length; ++i69)
      {
                if(this.accel_offset_1_[i69] != otherMyClass.accel_offset_1_[i69]) return false;

      }
      for(int i71 = 0; i71 < accel_offset_2_.length; ++i71)
      {
                if(this.accel_offset_2_[i71] != otherMyClass.accel_offset_2_[i71]) return false;

      }
      for(int i73 = 0; i73 < accel_offset_3_.length; ++i73)
      {
                if(this.accel_offset_3_[i73] != otherMyClass.accel_offset_3_[i73]) return false;

      }
      for(int i75 = 0; i75 < gyro_temperature_.length; ++i75)
      {
                if(this.gyro_temperature_[i75] != otherMyClass.gyro_temperature_[i75]) return false;

      }
      for(int i77 = 0; i77 < gyro_offset_0_.length; ++i77)
      {
                if(this.gyro_offset_0_[i77] != otherMyClass.gyro_offset_0_[i77]) return false;

      }
      for(int i79 = 0; i79 < gyro_offset_1_.length; ++i79)
      {
                if(this.gyro_offset_1_[i79] != otherMyClass.gyro_offset_1_[i79]) return false;

      }
      for(int i81 = 0; i81 < gyro_offset_2_.length; ++i81)
      {
                if(this.gyro_offset_2_[i81] != otherMyClass.gyro_offset_2_[i81]) return false;

      }
      for(int i83 = 0; i83 < gyro_offset_3_.length; ++i83)
      {
                if(this.gyro_offset_3_[i83] != otherMyClass.gyro_offset_3_[i83]) return false;

      }
      for(int i85 = 0; i85 < mag_temperature_.length; ++i85)
      {
                if(this.mag_temperature_[i85] != otherMyClass.mag_temperature_[i85]) return false;

      }
      for(int i87 = 0; i87 < mag_offset_0_.length; ++i87)
      {
                if(this.mag_offset_0_[i87] != otherMyClass.mag_offset_0_[i87]) return false;

      }
      for(int i89 = 0; i89 < mag_offset_1_.length; ++i89)
      {
                if(this.mag_offset_1_[i89] != otherMyClass.mag_offset_1_[i89]) return false;

      }
      for(int i91 = 0; i91 < mag_offset_2_.length; ++i91)
      {
                if(this.mag_offset_2_[i91] != otherMyClass.mag_offset_2_[i91]) return false;

      }
      for(int i93 = 0; i93 < mag_offset_3_.length; ++i93)
      {
                if(this.mag_offset_3_[i93] != otherMyClass.mag_offset_3_[i93]) return false;

      }
      for(int i95 = 0; i95 < baro_temperature_.length; ++i95)
      {
                if(this.baro_temperature_[i95] != otherMyClass.baro_temperature_[i95]) return false;

      }
      if(this.baro_offset_0_ != otherMyClass.baro_offset_0_) return false;

      if(this.baro_offset_1_ != otherMyClass.baro_offset_1_) return false;

      if(this.baro_offset_2_ != otherMyClass.baro_offset_2_) return false;

      if(this.baro_offset_3_ != otherMyClass.baro_offset_3_) return false;


      return true;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("SensorCorrection {");
      builder.append("timestamp=");
      builder.append(this.timestamp_);      builder.append(", ");
      builder.append("accel_temperature=");
      builder.append(java.util.Arrays.toString(this.accel_temperature_));      builder.append(", ");
      builder.append("accel_offset_0=");
      builder.append(java.util.Arrays.toString(this.accel_offset_0_));      builder.append(", ");
      builder.append("accel_offset_1=");
      builder.append(java.util.Arrays.toString(this.accel_offset_1_));      builder.append(", ");
      builder.append("accel_offset_2=");
      builder.append(java.util.Arrays.toString(this.accel_offset_2_));      builder.append(", ");
      builder.append("accel_offset_3=");
      builder.append(java.util.Arrays.toString(this.accel_offset_3_));      builder.append(", ");
      builder.append("gyro_temperature=");
      builder.append(java.util.Arrays.toString(this.gyro_temperature_));      builder.append(", ");
      builder.append("gyro_offset_0=");
      builder.append(java.util.Arrays.toString(this.gyro_offset_0_));      builder.append(", ");
      builder.append("gyro_offset_1=");
      builder.append(java.util.Arrays.toString(this.gyro_offset_1_));      builder.append(", ");
      builder.append("gyro_offset_2=");
      builder.append(java.util.Arrays.toString(this.gyro_offset_2_));      builder.append(", ");
      builder.append("gyro_offset_3=");
      builder.append(java.util.Arrays.toString(this.gyro_offset_3_));      builder.append(", ");
      builder.append("mag_temperature=");
      builder.append(java.util.Arrays.toString(this.mag_temperature_));      builder.append(", ");
      builder.append("mag_offset_0=");
      builder.append(java.util.Arrays.toString(this.mag_offset_0_));      builder.append(", ");
      builder.append("mag_offset_1=");
      builder.append(java.util.Arrays.toString(this.mag_offset_1_));      builder.append(", ");
      builder.append("mag_offset_2=");
      builder.append(java.util.Arrays.toString(this.mag_offset_2_));      builder.append(", ");
      builder.append("mag_offset_3=");
      builder.append(java.util.Arrays.toString(this.mag_offset_3_));      builder.append(", ");
      builder.append("baro_temperature=");
      builder.append(java.util.Arrays.toString(this.baro_temperature_));      builder.append(", ");
      builder.append("baro_offset_0=");
      builder.append(this.baro_offset_0_);      builder.append(", ");
      builder.append("baro_offset_1=");
      builder.append(this.baro_offset_1_);      builder.append(", ");
      builder.append("baro_offset_2=");
      builder.append(this.baro_offset_2_);      builder.append(", ");
      builder.append("baro_offset_3=");
      builder.append(this.baro_offset_3_);
      builder.append("}");
      return builder.toString();
   }
}
