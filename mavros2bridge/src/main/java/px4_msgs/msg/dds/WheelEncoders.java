package px4_msgs.msg.dds;

import us.ihmc.communication.packets.Packet;
import us.ihmc.euclid.interfaces.Settable;
import us.ihmc.euclid.interfaces.EpsilonComparable;
import java.util.function.Supplier;
import us.ihmc.pubsub.TopicDataType;

public class WheelEncoders extends Packet<WheelEncoders> implements Settable<WheelEncoders>, EpsilonComparable<WheelEncoders>
{
   /**
            * time since system start (microseconds)
            */
   public long timestamp_;
   /**
            * Two wheels: 0 right, 1 left
            * [rad/s]
            */
   public float[] wheel_speed_;
   /**
            * [rad]
            */
   public float[] wheel_angle_;

   public WheelEncoders()
   {
      wheel_speed_ = new float[2];

      wheel_angle_ = new float[2];

   }

   public WheelEncoders(WheelEncoders other)
   {
      this();
      set(other);
   }

   public void set(WheelEncoders other)
   {
      timestamp_ = other.timestamp_;

      for(int i1 = 0; i1 < wheel_speed_.length; ++i1)
      {
            wheel_speed_[i1] = other.wheel_speed_[i1];

      }

      for(int i3 = 0; i3 < wheel_angle_.length; ++i3)
      {
            wheel_angle_[i3] = other.wheel_angle_[i3];

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
            * Two wheels: 0 right, 1 left
            * [rad/s]
            */
   public float[] getWheelSpeed()
   {
      return wheel_speed_;
   }


   /**
            * [rad]
            */
   public float[] getWheelAngle()
   {
      return wheel_angle_;
   }


   public static Supplier<WheelEncodersPubSubType> getPubSubType()
   {
      return WheelEncodersPubSubType::new;
   }

   @Override
   public Supplier<TopicDataType> getPubSubTypePacket()
   {
      return WheelEncodersPubSubType::new;
   }

   @Override
   public boolean epsilonEquals(WheelEncoders other, double epsilon)
   {
      if(other == null) return false;
      if(other == this) return true;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_, other.timestamp_, epsilon)) return false;

      for(int i5 = 0; i5 < wheel_speed_.length; ++i5)
      {
                if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.wheel_speed_[i5], other.wheel_speed_[i5], epsilon)) return false;
      }

      for(int i7 = 0; i7 < wheel_angle_.length; ++i7)
      {
                if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.wheel_angle_[i7], other.wheel_angle_[i7], epsilon)) return false;
      }


      return true;
   }

   @Override
   public boolean equals(Object other)
   {
      if(other == null) return false;
      if(other == this) return true;
      if(!(other instanceof WheelEncoders)) return false;

      WheelEncoders otherMyClass = (WheelEncoders) other;

      if(this.timestamp_ != otherMyClass.timestamp_) return false;

      for(int i9 = 0; i9 < wheel_speed_.length; ++i9)
      {
                if(this.wheel_speed_[i9] != otherMyClass.wheel_speed_[i9]) return false;

      }
      for(int i11 = 0; i11 < wheel_angle_.length; ++i11)
      {
                if(this.wheel_angle_[i11] != otherMyClass.wheel_angle_[i11]) return false;

      }

      return true;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("WheelEncoders {");
      builder.append("timestamp=");
      builder.append(this.timestamp_);      builder.append(", ");
      builder.append("wheel_speed=");
      builder.append(java.util.Arrays.toString(this.wheel_speed_));      builder.append(", ");
      builder.append("wheel_angle=");
      builder.append(java.util.Arrays.toString(this.wheel_angle_));
      builder.append("}");
      return builder.toString();
   }
}
