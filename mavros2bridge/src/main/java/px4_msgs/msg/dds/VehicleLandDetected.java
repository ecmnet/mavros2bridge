package px4_msgs.msg.dds;

import us.ihmc.communication.packets.Packet;
import us.ihmc.euclid.interfaces.Settable;
import us.ihmc.euclid.interfaces.EpsilonComparable;
import java.util.function.Supplier;
import us.ihmc.pubsub.TopicDataType;

public class VehicleLandDetected extends Packet<VehicleLandDetected> implements Settable<VehicleLandDetected>, EpsilonComparable<VehicleLandDetected>
{
   /**
            * time since system start (microseconds)
            */
   public long timestamp_;
   /**
            * true if vehicle is currently in free-fall
            */
   public boolean freefall_;
   /**
            * true if vehicle has ground contact but is not landed (1. stage)
            */
   public boolean ground_contact_;
   /**
            * true if the vehicle might have landed (2. stage)
            */
   public boolean maybe_landed_;
   /**
            * true if vehicle is currently landed on the ground (3. stage)
            */
   public boolean landed_;
   /**
            * indicates if from the perspective of the landing detector the vehicle might be in ground effect (baro). This flag will become true if the vehicle is not moving horizontally and is descending (crude assumption that user is landing).
            */
   public boolean in_ground_effect_;
   public boolean in_descend_;
   public boolean has_low_throttle_;
   public boolean vertical_movement_;
   public boolean horizontal_movement_;
   public boolean rotational_movement_;
   public boolean close_to_ground_or_skipped_check_;
   public boolean at_rest_;

   public VehicleLandDetected()
   {
   }

   public VehicleLandDetected(VehicleLandDetected other)
   {
      this();
      set(other);
   }

   public void set(VehicleLandDetected other)
   {
      timestamp_ = other.timestamp_;

      freefall_ = other.freefall_;

      ground_contact_ = other.ground_contact_;

      maybe_landed_ = other.maybe_landed_;

      landed_ = other.landed_;

      in_ground_effect_ = other.in_ground_effect_;

      in_descend_ = other.in_descend_;

      has_low_throttle_ = other.has_low_throttle_;

      vertical_movement_ = other.vertical_movement_;

      horizontal_movement_ = other.horizontal_movement_;

      rotational_movement_ = other.rotational_movement_;

      close_to_ground_or_skipped_check_ = other.close_to_ground_or_skipped_check_;

      at_rest_ = other.at_rest_;

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
            * true if vehicle is currently in free-fall
            */
   public void setFreefall(boolean freefall)
   {
      freefall_ = freefall;
   }
   /**
            * true if vehicle is currently in free-fall
            */
   public boolean getFreefall()
   {
      return freefall_;
   }

   /**
            * true if vehicle has ground contact but is not landed (1. stage)
            */
   public void setGroundContact(boolean ground_contact)
   {
      ground_contact_ = ground_contact;
   }
   /**
            * true if vehicle has ground contact but is not landed (1. stage)
            */
   public boolean getGroundContact()
   {
      return ground_contact_;
   }

   /**
            * true if the vehicle might have landed (2. stage)
            */
   public void setMaybeLanded(boolean maybe_landed)
   {
      maybe_landed_ = maybe_landed;
   }
   /**
            * true if the vehicle might have landed (2. stage)
            */
   public boolean getMaybeLanded()
   {
      return maybe_landed_;
   }

   /**
            * true if vehicle is currently landed on the ground (3. stage)
            */
   public void setLanded(boolean landed)
   {
      landed_ = landed;
   }
   /**
            * true if vehicle is currently landed on the ground (3. stage)
            */
   public boolean getLanded()
   {
      return landed_;
   }

   /**
            * indicates if from the perspective of the landing detector the vehicle might be in ground effect (baro). This flag will become true if the vehicle is not moving horizontally and is descending (crude assumption that user is landing).
            */
   public void setInGroundEffect(boolean in_ground_effect)
   {
      in_ground_effect_ = in_ground_effect;
   }
   /**
            * indicates if from the perspective of the landing detector the vehicle might be in ground effect (baro). This flag will become true if the vehicle is not moving horizontally and is descending (crude assumption that user is landing).
            */
   public boolean getInGroundEffect()
   {
      return in_ground_effect_;
   }

   public void setInDescend(boolean in_descend)
   {
      in_descend_ = in_descend;
   }
   public boolean getInDescend()
   {
      return in_descend_;
   }

   public void setHasLowThrottle(boolean has_low_throttle)
   {
      has_low_throttle_ = has_low_throttle;
   }
   public boolean getHasLowThrottle()
   {
      return has_low_throttle_;
   }

   public void setVerticalMovement(boolean vertical_movement)
   {
      vertical_movement_ = vertical_movement;
   }
   public boolean getVerticalMovement()
   {
      return vertical_movement_;
   }

   public void setHorizontalMovement(boolean horizontal_movement)
   {
      horizontal_movement_ = horizontal_movement;
   }
   public boolean getHorizontalMovement()
   {
      return horizontal_movement_;
   }

   public void setRotationalMovement(boolean rotational_movement)
   {
      rotational_movement_ = rotational_movement;
   }
   public boolean getRotationalMovement()
   {
      return rotational_movement_;
   }

   public void setCloseToGroundOrSkippedCheck(boolean close_to_ground_or_skipped_check)
   {
      close_to_ground_or_skipped_check_ = close_to_ground_or_skipped_check;
   }
   public boolean getCloseToGroundOrSkippedCheck()
   {
      return close_to_ground_or_skipped_check_;
   }

   public void setAtRest(boolean at_rest)
   {
      at_rest_ = at_rest;
   }
   public boolean getAtRest()
   {
      return at_rest_;
   }


   public static Supplier<VehicleLandDetectedPubSubType> getPubSubType()
   {
      return VehicleLandDetectedPubSubType::new;
   }

   @Override
   public Supplier<TopicDataType> getPubSubTypePacket()
   {
      return VehicleLandDetectedPubSubType::new;
   }

   @Override
   public boolean epsilonEquals(VehicleLandDetected other, double epsilon)
   {
      if(other == null) return false;
      if(other == this) return true;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_, other.timestamp_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.freefall_, other.freefall_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.ground_contact_, other.ground_contact_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.maybe_landed_, other.maybe_landed_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.landed_, other.landed_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.in_ground_effect_, other.in_ground_effect_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.in_descend_, other.in_descend_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.has_low_throttle_, other.has_low_throttle_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.vertical_movement_, other.vertical_movement_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.horizontal_movement_, other.horizontal_movement_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.rotational_movement_, other.rotational_movement_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.close_to_ground_or_skipped_check_, other.close_to_ground_or_skipped_check_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.at_rest_, other.at_rest_, epsilon)) return false;


      return true;
   }

   @Override
   public boolean equals(Object other)
   {
      if(other == null) return false;
      if(other == this) return true;
      if(!(other instanceof VehicleLandDetected)) return false;

      VehicleLandDetected otherMyClass = (VehicleLandDetected) other;

      if(this.timestamp_ != otherMyClass.timestamp_) return false;

      if(this.freefall_ != otherMyClass.freefall_) return false;

      if(this.ground_contact_ != otherMyClass.ground_contact_) return false;

      if(this.maybe_landed_ != otherMyClass.maybe_landed_) return false;

      if(this.landed_ != otherMyClass.landed_) return false;

      if(this.in_ground_effect_ != otherMyClass.in_ground_effect_) return false;

      if(this.in_descend_ != otherMyClass.in_descend_) return false;

      if(this.has_low_throttle_ != otherMyClass.has_low_throttle_) return false;

      if(this.vertical_movement_ != otherMyClass.vertical_movement_) return false;

      if(this.horizontal_movement_ != otherMyClass.horizontal_movement_) return false;

      if(this.rotational_movement_ != otherMyClass.rotational_movement_) return false;

      if(this.close_to_ground_or_skipped_check_ != otherMyClass.close_to_ground_or_skipped_check_) return false;

      if(this.at_rest_ != otherMyClass.at_rest_) return false;


      return true;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("VehicleLandDetected {");
      builder.append("timestamp=");
      builder.append(this.timestamp_);      builder.append(", ");
      builder.append("freefall=");
      builder.append(this.freefall_);      builder.append(", ");
      builder.append("ground_contact=");
      builder.append(this.ground_contact_);      builder.append(", ");
      builder.append("maybe_landed=");
      builder.append(this.maybe_landed_);      builder.append(", ");
      builder.append("landed=");
      builder.append(this.landed_);      builder.append(", ");
      builder.append("in_ground_effect=");
      builder.append(this.in_ground_effect_);      builder.append(", ");
      builder.append("in_descend=");
      builder.append(this.in_descend_);      builder.append(", ");
      builder.append("has_low_throttle=");
      builder.append(this.has_low_throttle_);      builder.append(", ");
      builder.append("vertical_movement=");
      builder.append(this.vertical_movement_);      builder.append(", ");
      builder.append("horizontal_movement=");
      builder.append(this.horizontal_movement_);      builder.append(", ");
      builder.append("rotational_movement=");
      builder.append(this.rotational_movement_);      builder.append(", ");
      builder.append("close_to_ground_or_skipped_check=");
      builder.append(this.close_to_ground_or_skipped_check_);      builder.append(", ");
      builder.append("at_rest=");
      builder.append(this.at_rest_);
      builder.append("}");
      return builder.toString();
   }
}
