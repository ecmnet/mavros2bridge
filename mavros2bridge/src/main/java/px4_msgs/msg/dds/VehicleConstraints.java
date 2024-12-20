package px4_msgs.msg.dds;

import us.ihmc.communication.packets.Packet;
import us.ihmc.euclid.interfaces.Settable;
import us.ihmc.euclid.interfaces.EpsilonComparable;
import java.util.function.Supplier;
import us.ihmc.pubsub.TopicDataType;

/**
       * Local setpoint constraints in NED frame
       * setting something to NaN means that no limit is provided
       */
public class VehicleConstraints extends Packet<VehicleConstraints> implements Settable<VehicleConstraints>, EpsilonComparable<VehicleConstraints>
{
   /**
            * time since system start (microseconds)
            */
   public long timestamp_;
   /**
            * in meters/sec
            */
   public float speed_up_;
   /**
            * in meters/sec
            */
   public float speed_down_;
   /**
            * tell the controller to initiate takeoff when idling (ignored during flight)
            */
   public boolean want_takeoff_;

   public VehicleConstraints()
   {
   }

   public VehicleConstraints(VehicleConstraints other)
   {
      this();
      set(other);
   }

   public void set(VehicleConstraints other)
   {
      timestamp_ = other.timestamp_;

      speed_up_ = other.speed_up_;

      speed_down_ = other.speed_down_;

      want_takeoff_ = other.want_takeoff_;

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
            * in meters/sec
            */
   public void setSpeedUp(float speed_up)
   {
      speed_up_ = speed_up;
   }
   /**
            * in meters/sec
            */
   public float getSpeedUp()
   {
      return speed_up_;
   }

   /**
            * in meters/sec
            */
   public void setSpeedDown(float speed_down)
   {
      speed_down_ = speed_down;
   }
   /**
            * in meters/sec
            */
   public float getSpeedDown()
   {
      return speed_down_;
   }

   /**
            * tell the controller to initiate takeoff when idling (ignored during flight)
            */
   public void setWantTakeoff(boolean want_takeoff)
   {
      want_takeoff_ = want_takeoff;
   }
   /**
            * tell the controller to initiate takeoff when idling (ignored during flight)
            */
   public boolean getWantTakeoff()
   {
      return want_takeoff_;
   }


   public static Supplier<VehicleConstraintsPubSubType> getPubSubType()
   {
      return VehicleConstraintsPubSubType::new;
   }

   @Override
   public Supplier<TopicDataType> getPubSubTypePacket()
   {
      return VehicleConstraintsPubSubType::new;
   }

   @Override
   public boolean epsilonEquals(VehicleConstraints other, double epsilon)
   {
      if(other == null) return false;
      if(other == this) return true;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_, other.timestamp_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.speed_up_, other.speed_up_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.speed_down_, other.speed_down_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.want_takeoff_, other.want_takeoff_, epsilon)) return false;


      return true;
   }

   @Override
   public boolean equals(Object other)
   {
      if(other == null) return false;
      if(other == this) return true;
      if(!(other instanceof VehicleConstraints)) return false;

      VehicleConstraints otherMyClass = (VehicleConstraints) other;

      if(this.timestamp_ != otherMyClass.timestamp_) return false;

      if(this.speed_up_ != otherMyClass.speed_up_) return false;

      if(this.speed_down_ != otherMyClass.speed_down_) return false;

      if(this.want_takeoff_ != otherMyClass.want_takeoff_) return false;


      return true;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("VehicleConstraints {");
      builder.append("timestamp=");
      builder.append(this.timestamp_);      builder.append(", ");
      builder.append("speed_up=");
      builder.append(this.speed_up_);      builder.append(", ");
      builder.append("speed_down=");
      builder.append(this.speed_down_);      builder.append(", ");
      builder.append("want_takeoff=");
      builder.append(this.want_takeoff_);
      builder.append("}");
      return builder.toString();
   }
}
