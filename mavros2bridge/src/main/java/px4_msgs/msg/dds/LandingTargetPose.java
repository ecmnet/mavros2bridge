package px4_msgs.msg.dds;

import us.ihmc.communication.packets.Packet;
import us.ihmc.euclid.interfaces.Settable;
import us.ihmc.euclid.interfaces.EpsilonComparable;
import java.util.function.Supplier;
import us.ihmc.pubsub.TopicDataType;

/**
       * Relative position of precision land target in navigation (body fixed, north aligned, NED) and inertial (world fixed, north aligned, NED) frames
       */
public class LandingTargetPose extends Packet<LandingTargetPose> implements Settable<LandingTargetPose>, EpsilonComparable<LandingTargetPose>
{
   /**
            * time since system start (microseconds)
            */
   public long timestamp_;
   /**
            * Flag indicating whether the landing target is static or moving with respect to the ground
            */
   public boolean is_static_;
   /**
            * Flag showing whether relative position is valid
            */
   public boolean rel_pos_valid_;
   /**
            * Flag showing whether relative velocity is valid
            */
   public boolean rel_vel_valid_;
   /**
            * X/north position of target, relative to vehicle (navigation frame) [meters]
            */
   public float x_rel_;
   /**
            * Y/east position of target, relative to vehicle (navigation frame) [meters]
            */
   public float y_rel_;
   /**
            * Z/down position of target, relative to vehicle (navigation frame) [meters]
            */
   public float z_rel_;
   /**
            * X/north velocity  of target, relative to vehicle (navigation frame) [meters/second]
            */
   public float vx_rel_;
   /**
            * Y/east velocity of target, relative to vehicle (navigation frame) [meters/second]
            */
   public float vy_rel_;
   /**
            * X/north position variance [meters^2]
            */
   public float cov_x_rel_;
   /**
            * Y/east position variance [meters^2]
            */
   public float cov_y_rel_;
   /**
            * X/north velocity variance [(meters/second)^2]
            */
   public float cov_vx_rel_;
   /**
            * Y/east velocity variance [(meters/second)^2]
            */
   public float cov_vy_rel_;
   /**
            * Flag showing whether absolute position is valid
            */
   public boolean abs_pos_valid_;
   /**
            * X/north position of target, relative to origin (navigation frame) [meters]
            */
   public float x_abs_;
   /**
            * Y/east position of target, relative to origin (navigation frame) [meters]
            */
   public float y_abs_;
   /**
            * Z/down position of target, relative to origin (navigation frame) [meters]
            */
   public float z_abs_;

   public LandingTargetPose()
   {
   }

   public LandingTargetPose(LandingTargetPose other)
   {
      this();
      set(other);
   }

   public void set(LandingTargetPose other)
   {
      timestamp_ = other.timestamp_;

      is_static_ = other.is_static_;

      rel_pos_valid_ = other.rel_pos_valid_;

      rel_vel_valid_ = other.rel_vel_valid_;

      x_rel_ = other.x_rel_;

      y_rel_ = other.y_rel_;

      z_rel_ = other.z_rel_;

      vx_rel_ = other.vx_rel_;

      vy_rel_ = other.vy_rel_;

      cov_x_rel_ = other.cov_x_rel_;

      cov_y_rel_ = other.cov_y_rel_;

      cov_vx_rel_ = other.cov_vx_rel_;

      cov_vy_rel_ = other.cov_vy_rel_;

      abs_pos_valid_ = other.abs_pos_valid_;

      x_abs_ = other.x_abs_;

      y_abs_ = other.y_abs_;

      z_abs_ = other.z_abs_;

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
            * Flag indicating whether the landing target is static or moving with respect to the ground
            */
   public void setIsStatic(boolean is_static)
   {
      is_static_ = is_static;
   }
   /**
            * Flag indicating whether the landing target is static or moving with respect to the ground
            */
   public boolean getIsStatic()
   {
      return is_static_;
   }

   /**
            * Flag showing whether relative position is valid
            */
   public void setRelPosValid(boolean rel_pos_valid)
   {
      rel_pos_valid_ = rel_pos_valid;
   }
   /**
            * Flag showing whether relative position is valid
            */
   public boolean getRelPosValid()
   {
      return rel_pos_valid_;
   }

   /**
            * Flag showing whether relative velocity is valid
            */
   public void setRelVelValid(boolean rel_vel_valid)
   {
      rel_vel_valid_ = rel_vel_valid;
   }
   /**
            * Flag showing whether relative velocity is valid
            */
   public boolean getRelVelValid()
   {
      return rel_vel_valid_;
   }

   /**
            * X/north position of target, relative to vehicle (navigation frame) [meters]
            */
   public void setXRel(float x_rel)
   {
      x_rel_ = x_rel;
   }
   /**
            * X/north position of target, relative to vehicle (navigation frame) [meters]
            */
   public float getXRel()
   {
      return x_rel_;
   }

   /**
            * Y/east position of target, relative to vehicle (navigation frame) [meters]
            */
   public void setYRel(float y_rel)
   {
      y_rel_ = y_rel;
   }
   /**
            * Y/east position of target, relative to vehicle (navigation frame) [meters]
            */
   public float getYRel()
   {
      return y_rel_;
   }

   /**
            * Z/down position of target, relative to vehicle (navigation frame) [meters]
            */
   public void setZRel(float z_rel)
   {
      z_rel_ = z_rel;
   }
   /**
            * Z/down position of target, relative to vehicle (navigation frame) [meters]
            */
   public float getZRel()
   {
      return z_rel_;
   }

   /**
            * X/north velocity  of target, relative to vehicle (navigation frame) [meters/second]
            */
   public void setVxRel(float vx_rel)
   {
      vx_rel_ = vx_rel;
   }
   /**
            * X/north velocity  of target, relative to vehicle (navigation frame) [meters/second]
            */
   public float getVxRel()
   {
      return vx_rel_;
   }

   /**
            * Y/east velocity of target, relative to vehicle (navigation frame) [meters/second]
            */
   public void setVyRel(float vy_rel)
   {
      vy_rel_ = vy_rel;
   }
   /**
            * Y/east velocity of target, relative to vehicle (navigation frame) [meters/second]
            */
   public float getVyRel()
   {
      return vy_rel_;
   }

   /**
            * X/north position variance [meters^2]
            */
   public void setCovXRel(float cov_x_rel)
   {
      cov_x_rel_ = cov_x_rel;
   }
   /**
            * X/north position variance [meters^2]
            */
   public float getCovXRel()
   {
      return cov_x_rel_;
   }

   /**
            * Y/east position variance [meters^2]
            */
   public void setCovYRel(float cov_y_rel)
   {
      cov_y_rel_ = cov_y_rel;
   }
   /**
            * Y/east position variance [meters^2]
            */
   public float getCovYRel()
   {
      return cov_y_rel_;
   }

   /**
            * X/north velocity variance [(meters/second)^2]
            */
   public void setCovVxRel(float cov_vx_rel)
   {
      cov_vx_rel_ = cov_vx_rel;
   }
   /**
            * X/north velocity variance [(meters/second)^2]
            */
   public float getCovVxRel()
   {
      return cov_vx_rel_;
   }

   /**
            * Y/east velocity variance [(meters/second)^2]
            */
   public void setCovVyRel(float cov_vy_rel)
   {
      cov_vy_rel_ = cov_vy_rel;
   }
   /**
            * Y/east velocity variance [(meters/second)^2]
            */
   public float getCovVyRel()
   {
      return cov_vy_rel_;
   }

   /**
            * Flag showing whether absolute position is valid
            */
   public void setAbsPosValid(boolean abs_pos_valid)
   {
      abs_pos_valid_ = abs_pos_valid;
   }
   /**
            * Flag showing whether absolute position is valid
            */
   public boolean getAbsPosValid()
   {
      return abs_pos_valid_;
   }

   /**
            * X/north position of target, relative to origin (navigation frame) [meters]
            */
   public void setXAbs(float x_abs)
   {
      x_abs_ = x_abs;
   }
   /**
            * X/north position of target, relative to origin (navigation frame) [meters]
            */
   public float getXAbs()
   {
      return x_abs_;
   }

   /**
            * Y/east position of target, relative to origin (navigation frame) [meters]
            */
   public void setYAbs(float y_abs)
   {
      y_abs_ = y_abs;
   }
   /**
            * Y/east position of target, relative to origin (navigation frame) [meters]
            */
   public float getYAbs()
   {
      return y_abs_;
   }

   /**
            * Z/down position of target, relative to origin (navigation frame) [meters]
            */
   public void setZAbs(float z_abs)
   {
      z_abs_ = z_abs;
   }
   /**
            * Z/down position of target, relative to origin (navigation frame) [meters]
            */
   public float getZAbs()
   {
      return z_abs_;
   }


   public static Supplier<LandingTargetPosePubSubType> getPubSubType()
   {
      return LandingTargetPosePubSubType::new;
   }

   @Override
   public Supplier<TopicDataType> getPubSubTypePacket()
   {
      return LandingTargetPosePubSubType::new;
   }

   @Override
   public boolean epsilonEquals(LandingTargetPose other, double epsilon)
   {
      if(other == null) return false;
      if(other == this) return true;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_, other.timestamp_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.is_static_, other.is_static_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.rel_pos_valid_, other.rel_pos_valid_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.rel_vel_valid_, other.rel_vel_valid_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.x_rel_, other.x_rel_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.y_rel_, other.y_rel_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.z_rel_, other.z_rel_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.vx_rel_, other.vx_rel_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.vy_rel_, other.vy_rel_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.cov_x_rel_, other.cov_x_rel_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.cov_y_rel_, other.cov_y_rel_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.cov_vx_rel_, other.cov_vx_rel_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.cov_vy_rel_, other.cov_vy_rel_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.abs_pos_valid_, other.abs_pos_valid_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.x_abs_, other.x_abs_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.y_abs_, other.y_abs_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.z_abs_, other.z_abs_, epsilon)) return false;


      return true;
   }

   @Override
   public boolean equals(Object other)
   {
      if(other == null) return false;
      if(other == this) return true;
      if(!(other instanceof LandingTargetPose)) return false;

      LandingTargetPose otherMyClass = (LandingTargetPose) other;

      if(this.timestamp_ != otherMyClass.timestamp_) return false;

      if(this.is_static_ != otherMyClass.is_static_) return false;

      if(this.rel_pos_valid_ != otherMyClass.rel_pos_valid_) return false;

      if(this.rel_vel_valid_ != otherMyClass.rel_vel_valid_) return false;

      if(this.x_rel_ != otherMyClass.x_rel_) return false;

      if(this.y_rel_ != otherMyClass.y_rel_) return false;

      if(this.z_rel_ != otherMyClass.z_rel_) return false;

      if(this.vx_rel_ != otherMyClass.vx_rel_) return false;

      if(this.vy_rel_ != otherMyClass.vy_rel_) return false;

      if(this.cov_x_rel_ != otherMyClass.cov_x_rel_) return false;

      if(this.cov_y_rel_ != otherMyClass.cov_y_rel_) return false;

      if(this.cov_vx_rel_ != otherMyClass.cov_vx_rel_) return false;

      if(this.cov_vy_rel_ != otherMyClass.cov_vy_rel_) return false;

      if(this.abs_pos_valid_ != otherMyClass.abs_pos_valid_) return false;

      if(this.x_abs_ != otherMyClass.x_abs_) return false;

      if(this.y_abs_ != otherMyClass.y_abs_) return false;

      if(this.z_abs_ != otherMyClass.z_abs_) return false;


      return true;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("LandingTargetPose {");
      builder.append("timestamp=");
      builder.append(this.timestamp_);      builder.append(", ");
      builder.append("is_static=");
      builder.append(this.is_static_);      builder.append(", ");
      builder.append("rel_pos_valid=");
      builder.append(this.rel_pos_valid_);      builder.append(", ");
      builder.append("rel_vel_valid=");
      builder.append(this.rel_vel_valid_);      builder.append(", ");
      builder.append("x_rel=");
      builder.append(this.x_rel_);      builder.append(", ");
      builder.append("y_rel=");
      builder.append(this.y_rel_);      builder.append(", ");
      builder.append("z_rel=");
      builder.append(this.z_rel_);      builder.append(", ");
      builder.append("vx_rel=");
      builder.append(this.vx_rel_);      builder.append(", ");
      builder.append("vy_rel=");
      builder.append(this.vy_rel_);      builder.append(", ");
      builder.append("cov_x_rel=");
      builder.append(this.cov_x_rel_);      builder.append(", ");
      builder.append("cov_y_rel=");
      builder.append(this.cov_y_rel_);      builder.append(", ");
      builder.append("cov_vx_rel=");
      builder.append(this.cov_vx_rel_);      builder.append(", ");
      builder.append("cov_vy_rel=");
      builder.append(this.cov_vy_rel_);      builder.append(", ");
      builder.append("abs_pos_valid=");
      builder.append(this.abs_pos_valid_);      builder.append(", ");
      builder.append("x_abs=");
      builder.append(this.x_abs_);      builder.append(", ");
      builder.append("y_abs=");
      builder.append(this.y_abs_);      builder.append(", ");
      builder.append("z_abs=");
      builder.append(this.z_abs_);
      builder.append("}");
      return builder.toString();
   }
}
