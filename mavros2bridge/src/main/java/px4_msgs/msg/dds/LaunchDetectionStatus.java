package px4_msgs.msg.dds;

import us.ihmc.communication.packets.Packet;
import us.ihmc.euclid.interfaces.Settable;
import us.ihmc.euclid.interfaces.EpsilonComparable;
import java.util.function.Supplier;
import us.ihmc.pubsub.TopicDataType;

/**
       * Status of the launch detection state machine (fixed-wing only)
       */
public class LaunchDetectionStatus extends Packet<LaunchDetectionStatus> implements Settable<LaunchDetectionStatus>, EpsilonComparable<LaunchDetectionStatus>
{
   /**
          * waiting for launch
          */
   public static final byte STATE_WAITING_FOR_LAUNCH = (byte) 0;
   /**
          * launch detected, but keep motor(s) disabled (e.g. because it can't spin freely while on catapult)
          */
   public static final byte STATE_LAUNCH_DETECTED_DISABLED_MOTOR = (byte) 1;
   /**
          * launch detected, use normal takeoff/flying configuration
          */
   public static final byte STATE_FLYING = (byte) 2;
   /**
            * time since system start (microseconds)
            */
   public long timestamp_;
   public byte launch_detection_state_;

   public LaunchDetectionStatus()
   {
   }

   public LaunchDetectionStatus(LaunchDetectionStatus other)
   {
      this();
      set(other);
   }

   public void set(LaunchDetectionStatus other)
   {
      timestamp_ = other.timestamp_;

      launch_detection_state_ = other.launch_detection_state_;

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

   public void setLaunchDetectionState(byte launch_detection_state)
   {
      launch_detection_state_ = launch_detection_state;
   }
   public byte getLaunchDetectionState()
   {
      return launch_detection_state_;
   }


   public static Supplier<LaunchDetectionStatusPubSubType> getPubSubType()
   {
      return LaunchDetectionStatusPubSubType::new;
   }

   @Override
   public Supplier<TopicDataType> getPubSubTypePacket()
   {
      return LaunchDetectionStatusPubSubType::new;
   }

   @Override
   public boolean epsilonEquals(LaunchDetectionStatus other, double epsilon)
   {
      if(other == null) return false;
      if(other == this) return true;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_, other.timestamp_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.launch_detection_state_, other.launch_detection_state_, epsilon)) return false;


      return true;
   }

   @Override
   public boolean equals(Object other)
   {
      if(other == null) return false;
      if(other == this) return true;
      if(!(other instanceof LaunchDetectionStatus)) return false;

      LaunchDetectionStatus otherMyClass = (LaunchDetectionStatus) other;

      if(this.timestamp_ != otherMyClass.timestamp_) return false;

      if(this.launch_detection_state_ != otherMyClass.launch_detection_state_) return false;


      return true;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("LaunchDetectionStatus {");
      builder.append("timestamp=");
      builder.append(this.timestamp_);      builder.append(", ");
      builder.append("launch_detection_state=");
      builder.append(this.launch_detection_state_);
      builder.append("}");
      return builder.toString();
   }
}
