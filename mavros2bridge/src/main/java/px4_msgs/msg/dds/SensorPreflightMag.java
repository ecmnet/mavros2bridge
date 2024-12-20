package px4_msgs.msg.dds;

import us.ihmc.communication.packets.Packet;
import us.ihmc.euclid.interfaces.Settable;
import us.ihmc.euclid.interfaces.EpsilonComparable;
import java.util.function.Supplier;
import us.ihmc.pubsub.TopicDataType;

public class SensorPreflightMag extends Packet<SensorPreflightMag> implements Settable<SensorPreflightMag>, EpsilonComparable<SensorPreflightMag>
{
   /**
            * 
            * Pre-flight sensor check metrics.
            * The topic will not be updated when the vehicle is armed
            * 
            * time since system start (microseconds)
            */
   public long timestamp_;
   /**
            * maximum angle between magnetometer instance field vectors in radians.
            */
   public float mag_inconsistency_angle_;

   public SensorPreflightMag()
   {
   }

   public SensorPreflightMag(SensorPreflightMag other)
   {
      this();
      set(other);
   }

   public void set(SensorPreflightMag other)
   {
      timestamp_ = other.timestamp_;

      mag_inconsistency_angle_ = other.mag_inconsistency_angle_;

   }

   /**
            * 
            * Pre-flight sensor check metrics.
            * The topic will not be updated when the vehicle is armed
            * 
            * time since system start (microseconds)
            */
   public void setTimestamp(long timestamp)
   {
      timestamp_ = timestamp;
   }
   /**
            * 
            * Pre-flight sensor check metrics.
            * The topic will not be updated when the vehicle is armed
            * 
            * time since system start (microseconds)
            */
   public long getTimestamp()
   {
      return timestamp_;
   }

   /**
            * maximum angle between magnetometer instance field vectors in radians.
            */
   public void setMagInconsistencyAngle(float mag_inconsistency_angle)
   {
      mag_inconsistency_angle_ = mag_inconsistency_angle;
   }
   /**
            * maximum angle between magnetometer instance field vectors in radians.
            */
   public float getMagInconsistencyAngle()
   {
      return mag_inconsistency_angle_;
   }


   public static Supplier<SensorPreflightMagPubSubType> getPubSubType()
   {
      return SensorPreflightMagPubSubType::new;
   }

   @Override
   public Supplier<TopicDataType> getPubSubTypePacket()
   {
      return SensorPreflightMagPubSubType::new;
   }

   @Override
   public boolean epsilonEquals(SensorPreflightMag other, double epsilon)
   {
      if(other == null) return false;
      if(other == this) return true;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_, other.timestamp_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.mag_inconsistency_angle_, other.mag_inconsistency_angle_, epsilon)) return false;


      return true;
   }

   @Override
   public boolean equals(Object other)
   {
      if(other == null) return false;
      if(other == this) return true;
      if(!(other instanceof SensorPreflightMag)) return false;

      SensorPreflightMag otherMyClass = (SensorPreflightMag) other;

      if(this.timestamp_ != otherMyClass.timestamp_) return false;

      if(this.mag_inconsistency_angle_ != otherMyClass.mag_inconsistency_angle_) return false;


      return true;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("SensorPreflightMag {");
      builder.append("timestamp=");
      builder.append(this.timestamp_);      builder.append(", ");
      builder.append("mag_inconsistency_angle=");
      builder.append(this.mag_inconsistency_angle_);
      builder.append("}");
      return builder.toString();
   }
}
