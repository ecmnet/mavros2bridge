package px4_msgs.msg.dds;

import us.ihmc.communication.packets.Packet;
import us.ihmc.euclid.interfaces.Settable;
import us.ihmc.euclid.interfaces.EpsilonComparable;
import java.util.function.Supplier;
import us.ihmc.pubsub.TopicDataType;

public class MountOrientation extends Packet<MountOrientation> implements Settable<MountOrientation>, EpsilonComparable<MountOrientation>
{
   /**
            * time since system start (microseconds)
            */
   public long timestamp_;
   /**
            * Attitude/direction of the mount as euler angles in rad
            */
   public float[] attitude_euler_angle_;

   public MountOrientation()
   {
      attitude_euler_angle_ = new float[3];

   }

   public MountOrientation(MountOrientation other)
   {
      this();
      set(other);
   }

   public void set(MountOrientation other)
   {
      timestamp_ = other.timestamp_;

      for(int i1 = 0; i1 < attitude_euler_angle_.length; ++i1)
      {
            attitude_euler_angle_[i1] = other.attitude_euler_angle_[i1];

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
            * Attitude/direction of the mount as euler angles in rad
            */
   public float[] getAttitudeEulerAngle()
   {
      return attitude_euler_angle_;
   }


   public static Supplier<MountOrientationPubSubType> getPubSubType()
   {
      return MountOrientationPubSubType::new;
   }

   @Override
   public Supplier<TopicDataType> getPubSubTypePacket()
   {
      return MountOrientationPubSubType::new;
   }

   @Override
   public boolean epsilonEquals(MountOrientation other, double epsilon)
   {
      if(other == null) return false;
      if(other == this) return true;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_, other.timestamp_, epsilon)) return false;

      for(int i3 = 0; i3 < attitude_euler_angle_.length; ++i3)
      {
                if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.attitude_euler_angle_[i3], other.attitude_euler_angle_[i3], epsilon)) return false;
      }


      return true;
   }

   @Override
   public boolean equals(Object other)
   {
      if(other == null) return false;
      if(other == this) return true;
      if(!(other instanceof MountOrientation)) return false;

      MountOrientation otherMyClass = (MountOrientation) other;

      if(this.timestamp_ != otherMyClass.timestamp_) return false;

      for(int i5 = 0; i5 < attitude_euler_angle_.length; ++i5)
      {
                if(this.attitude_euler_angle_[i5] != otherMyClass.attitude_euler_angle_[i5]) return false;

      }

      return true;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("MountOrientation {");
      builder.append("timestamp=");
      builder.append(this.timestamp_);      builder.append(", ");
      builder.append("attitude_euler_angle=");
      builder.append(java.util.Arrays.toString(this.attitude_euler_angle_));
      builder.append("}");
      return builder.toString();
   }
}
