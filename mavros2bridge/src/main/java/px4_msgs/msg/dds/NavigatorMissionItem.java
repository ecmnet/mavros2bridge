package px4_msgs.msg.dds;

import us.ihmc.communication.packets.Packet;
import us.ihmc.euclid.interfaces.Settable;
import us.ihmc.euclid.interfaces.EpsilonComparable;
import java.util.function.Supplier;
import us.ihmc.pubsub.TopicDataType;

public class NavigatorMissionItem extends Packet<NavigatorMissionItem> implements Settable<NavigatorMissionItem>, EpsilonComparable<NavigatorMissionItem>
{
   /**
            * time since system start (microseconds)
            */
   public long timestamp_;
   /**
            * Sequence of the current mission item
            */
   public int sequence_current_;
   public int nav_cmd_;
   public float latitude_;
   public float longitude_;
   /**
            * time that the MAV should stay inside the radius before advancing in seconds
            */
   public float time_inside_;
   /**
            * default radius in which the mission is accepted as reached in meters
            */
   public float acceptance_radius_;
   /**
            * loiter radius in meters, 0 for a VTOL to hover, negative for counter-clockwise
            */
   public float loiter_radius_;
   /**
            * in radians NED -PI..+PI, NAN means don't change yaw
            */
   public float yaw_;
   /**
            * altitude in meters (AMSL)
            */
   public float altitude_;
   /**
            * mission frame
            */
   public byte frame_;
   /**
            * mission item origin (onboard or mavlink)
            */
   public byte origin_;
   /**
            * exit xtrack location: 0 for center of loiter wp, 1 for exit location
            */
   public boolean loiter_exit_xtrack_;
   /**
            * heading needs to be reached
            */
   public boolean force_heading_;
   /**
            * true if altitude is relative from start point
            */
   public boolean altitude_is_relative_;
   /**
            * true if next waypoint should follow after this one
            */
   public boolean autocontinue_;
   /**
            * part of the vtol back transition sequence
            */
   public boolean vtol_back_transition_;

   public NavigatorMissionItem()
   {
   }

   public NavigatorMissionItem(NavigatorMissionItem other)
   {
      this();
      set(other);
   }

   public void set(NavigatorMissionItem other)
   {
      timestamp_ = other.timestamp_;

      sequence_current_ = other.sequence_current_;

      nav_cmd_ = other.nav_cmd_;

      latitude_ = other.latitude_;

      longitude_ = other.longitude_;

      time_inside_ = other.time_inside_;

      acceptance_radius_ = other.acceptance_radius_;

      loiter_radius_ = other.loiter_radius_;

      yaw_ = other.yaw_;

      altitude_ = other.altitude_;

      frame_ = other.frame_;

      origin_ = other.origin_;

      loiter_exit_xtrack_ = other.loiter_exit_xtrack_;

      force_heading_ = other.force_heading_;

      altitude_is_relative_ = other.altitude_is_relative_;

      autocontinue_ = other.autocontinue_;

      vtol_back_transition_ = other.vtol_back_transition_;

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
            * Sequence of the current mission item
            */
   public void setSequenceCurrent(int sequence_current)
   {
      sequence_current_ = sequence_current;
   }
   /**
            * Sequence of the current mission item
            */
   public int getSequenceCurrent()
   {
      return sequence_current_;
   }

   public void setNavCmd(int nav_cmd)
   {
      nav_cmd_ = nav_cmd;
   }
   public int getNavCmd()
   {
      return nav_cmd_;
   }

   public void setLatitude(float latitude)
   {
      latitude_ = latitude;
   }
   public float getLatitude()
   {
      return latitude_;
   }

   public void setLongitude(float longitude)
   {
      longitude_ = longitude;
   }
   public float getLongitude()
   {
      return longitude_;
   }

   /**
            * time that the MAV should stay inside the radius before advancing in seconds
            */
   public void setTimeInside(float time_inside)
   {
      time_inside_ = time_inside;
   }
   /**
            * time that the MAV should stay inside the radius before advancing in seconds
            */
   public float getTimeInside()
   {
      return time_inside_;
   }

   /**
            * default radius in which the mission is accepted as reached in meters
            */
   public void setAcceptanceRadius(float acceptance_radius)
   {
      acceptance_radius_ = acceptance_radius;
   }
   /**
            * default radius in which the mission is accepted as reached in meters
            */
   public float getAcceptanceRadius()
   {
      return acceptance_radius_;
   }

   /**
            * loiter radius in meters, 0 for a VTOL to hover, negative for counter-clockwise
            */
   public void setLoiterRadius(float loiter_radius)
   {
      loiter_radius_ = loiter_radius;
   }
   /**
            * loiter radius in meters, 0 for a VTOL to hover, negative for counter-clockwise
            */
   public float getLoiterRadius()
   {
      return loiter_radius_;
   }

   /**
            * in radians NED -PI..+PI, NAN means don't change yaw
            */
   public void setYaw(float yaw)
   {
      yaw_ = yaw;
   }
   /**
            * in radians NED -PI..+PI, NAN means don't change yaw
            */
   public float getYaw()
   {
      return yaw_;
   }

   /**
            * altitude in meters (AMSL)
            */
   public void setAltitude(float altitude)
   {
      altitude_ = altitude;
   }
   /**
            * altitude in meters (AMSL)
            */
   public float getAltitude()
   {
      return altitude_;
   }

   /**
            * mission frame
            */
   public void setFrame(byte frame)
   {
      frame_ = frame;
   }
   /**
            * mission frame
            */
   public byte getFrame()
   {
      return frame_;
   }

   /**
            * mission item origin (onboard or mavlink)
            */
   public void setOrigin(byte origin)
   {
      origin_ = origin;
   }
   /**
            * mission item origin (onboard or mavlink)
            */
   public byte getOrigin()
   {
      return origin_;
   }

   /**
            * exit xtrack location: 0 for center of loiter wp, 1 for exit location
            */
   public void setLoiterExitXtrack(boolean loiter_exit_xtrack)
   {
      loiter_exit_xtrack_ = loiter_exit_xtrack;
   }
   /**
            * exit xtrack location: 0 for center of loiter wp, 1 for exit location
            */
   public boolean getLoiterExitXtrack()
   {
      return loiter_exit_xtrack_;
   }

   /**
            * heading needs to be reached
            */
   public void setForceHeading(boolean force_heading)
   {
      force_heading_ = force_heading;
   }
   /**
            * heading needs to be reached
            */
   public boolean getForceHeading()
   {
      return force_heading_;
   }

   /**
            * true if altitude is relative from start point
            */
   public void setAltitudeIsRelative(boolean altitude_is_relative)
   {
      altitude_is_relative_ = altitude_is_relative;
   }
   /**
            * true if altitude is relative from start point
            */
   public boolean getAltitudeIsRelative()
   {
      return altitude_is_relative_;
   }

   /**
            * true if next waypoint should follow after this one
            */
   public void setAutocontinue(boolean autocontinue)
   {
      autocontinue_ = autocontinue;
   }
   /**
            * true if next waypoint should follow after this one
            */
   public boolean getAutocontinue()
   {
      return autocontinue_;
   }

   /**
            * part of the vtol back transition sequence
            */
   public void setVtolBackTransition(boolean vtol_back_transition)
   {
      vtol_back_transition_ = vtol_back_transition;
   }
   /**
            * part of the vtol back transition sequence
            */
   public boolean getVtolBackTransition()
   {
      return vtol_back_transition_;
   }


   public static Supplier<NavigatorMissionItemPubSubType> getPubSubType()
   {
      return NavigatorMissionItemPubSubType::new;
   }

   @Override
   public Supplier<TopicDataType> getPubSubTypePacket()
   {
      return NavigatorMissionItemPubSubType::new;
   }

   @Override
   public boolean epsilonEquals(NavigatorMissionItem other, double epsilon)
   {
      if(other == null) return false;
      if(other == this) return true;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_, other.timestamp_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.sequence_current_, other.sequence_current_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.nav_cmd_, other.nav_cmd_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.latitude_, other.latitude_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.longitude_, other.longitude_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.time_inside_, other.time_inside_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.acceptance_radius_, other.acceptance_radius_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.loiter_radius_, other.loiter_radius_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.yaw_, other.yaw_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.altitude_, other.altitude_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.frame_, other.frame_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.origin_, other.origin_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.loiter_exit_xtrack_, other.loiter_exit_xtrack_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.force_heading_, other.force_heading_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.altitude_is_relative_, other.altitude_is_relative_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.autocontinue_, other.autocontinue_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.vtol_back_transition_, other.vtol_back_transition_, epsilon)) return false;


      return true;
   }

   @Override
   public boolean equals(Object other)
   {
      if(other == null) return false;
      if(other == this) return true;
      if(!(other instanceof NavigatorMissionItem)) return false;

      NavigatorMissionItem otherMyClass = (NavigatorMissionItem) other;

      if(this.timestamp_ != otherMyClass.timestamp_) return false;

      if(this.sequence_current_ != otherMyClass.sequence_current_) return false;

      if(this.nav_cmd_ != otherMyClass.nav_cmd_) return false;

      if(this.latitude_ != otherMyClass.latitude_) return false;

      if(this.longitude_ != otherMyClass.longitude_) return false;

      if(this.time_inside_ != otherMyClass.time_inside_) return false;

      if(this.acceptance_radius_ != otherMyClass.acceptance_radius_) return false;

      if(this.loiter_radius_ != otherMyClass.loiter_radius_) return false;

      if(this.yaw_ != otherMyClass.yaw_) return false;

      if(this.altitude_ != otherMyClass.altitude_) return false;

      if(this.frame_ != otherMyClass.frame_) return false;

      if(this.origin_ != otherMyClass.origin_) return false;

      if(this.loiter_exit_xtrack_ != otherMyClass.loiter_exit_xtrack_) return false;

      if(this.force_heading_ != otherMyClass.force_heading_) return false;

      if(this.altitude_is_relative_ != otherMyClass.altitude_is_relative_) return false;

      if(this.autocontinue_ != otherMyClass.autocontinue_) return false;

      if(this.vtol_back_transition_ != otherMyClass.vtol_back_transition_) return false;


      return true;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("NavigatorMissionItem {");
      builder.append("timestamp=");
      builder.append(this.timestamp_);      builder.append(", ");
      builder.append("sequence_current=");
      builder.append(this.sequence_current_);      builder.append(", ");
      builder.append("nav_cmd=");
      builder.append(this.nav_cmd_);      builder.append(", ");
      builder.append("latitude=");
      builder.append(this.latitude_);      builder.append(", ");
      builder.append("longitude=");
      builder.append(this.longitude_);      builder.append(", ");
      builder.append("time_inside=");
      builder.append(this.time_inside_);      builder.append(", ");
      builder.append("acceptance_radius=");
      builder.append(this.acceptance_radius_);      builder.append(", ");
      builder.append("loiter_radius=");
      builder.append(this.loiter_radius_);      builder.append(", ");
      builder.append("yaw=");
      builder.append(this.yaw_);      builder.append(", ");
      builder.append("altitude=");
      builder.append(this.altitude_);      builder.append(", ");
      builder.append("frame=");
      builder.append(this.frame_);      builder.append(", ");
      builder.append("origin=");
      builder.append(this.origin_);      builder.append(", ");
      builder.append("loiter_exit_xtrack=");
      builder.append(this.loiter_exit_xtrack_);      builder.append(", ");
      builder.append("force_heading=");
      builder.append(this.force_heading_);      builder.append(", ");
      builder.append("altitude_is_relative=");
      builder.append(this.altitude_is_relative_);      builder.append(", ");
      builder.append("autocontinue=");
      builder.append(this.autocontinue_);      builder.append(", ");
      builder.append("vtol_back_transition=");
      builder.append(this.vtol_back_transition_);
      builder.append("}");
      return builder.toString();
   }
}
