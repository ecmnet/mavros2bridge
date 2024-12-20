package px4_msgs.msg.dds;

import us.ihmc.communication.packets.Packet;
import us.ihmc.euclid.interfaces.Settable;
import us.ihmc.euclid.interfaces.EpsilonComparable;
import java.util.function.Supplier;
import us.ihmc.pubsub.TopicDataType;

public class RegisterExtComponentRequest extends Packet<RegisterExtComponentRequest> implements Settable<RegisterExtComponentRequest>, EpsilonComparable<RegisterExtComponentRequest>
{
   /**
          * API version compatibility. Increase this on a breaking semantic change. Changes to any message field are detected separately and do not require an API version change.
          */
   public static final int LATEST_PX4_ROS2_API_VERSION = 1;
   public static final byte ORB_QUEUE_LENGTH = (byte) 2;
   /**
            * Request to register an external component
            * time since system start (microseconds)
            */
   public long timestamp_;
   /**
            * ID, set this to a random value
            */
   public long request_id_;
   /**
            * either the requested mode name, or component name
            */
   public char[] name_;
   /**
            * Set to LATEST_PX4_ROS2_API_VERSION
            */
   public int px4_ros2_api_version_;
   /**
            * Components to be registered
            */
   public boolean register_arming_check_;
   /**
            * registering a mode also requires arming_check to be set
            */
   public boolean register_mode_;
   /**
            * registering an executor also requires a mode to be registered (which is the owned mode by the executor)
            */
   public boolean register_mode_executor_;
   /**
            * set to true if an internal mode should be replaced
            */
   public boolean enable_replace_internal_mode_;
   /**
            * vehicle_status::NAVIGATION_STATE_*
            */
   public byte replace_internal_mode_;
   /**
            * switch to the registered mode (can only be set in combination with an executor)
            */
   public boolean activate_mode_immediately_;

   public RegisterExtComponentRequest()
   {
      name_ = new char[25];

   }

   public RegisterExtComponentRequest(RegisterExtComponentRequest other)
   {
      this();
      set(other);
   }

   public void set(RegisterExtComponentRequest other)
   {
      timestamp_ = other.timestamp_;

      request_id_ = other.request_id_;

      for(int i1 = 0; i1 < name_.length; ++i1)
      {
            name_[i1] = other.name_[i1];

      }

      px4_ros2_api_version_ = other.px4_ros2_api_version_;

      register_arming_check_ = other.register_arming_check_;

      register_mode_ = other.register_mode_;

      register_mode_executor_ = other.register_mode_executor_;

      enable_replace_internal_mode_ = other.enable_replace_internal_mode_;

      replace_internal_mode_ = other.replace_internal_mode_;

      activate_mode_immediately_ = other.activate_mode_immediately_;

   }

   /**
            * Request to register an external component
            * time since system start (microseconds)
            */
   public void setTimestamp(long timestamp)
   {
      timestamp_ = timestamp;
   }
   /**
            * Request to register an external component
            * time since system start (microseconds)
            */
   public long getTimestamp()
   {
      return timestamp_;
   }

   /**
            * ID, set this to a random value
            */
   public void setRequestId(long request_id)
   {
      request_id_ = request_id;
   }
   /**
            * ID, set this to a random value
            */
   public long getRequestId()
   {
      return request_id_;
   }


   /**
            * either the requested mode name, or component name
            */
   public char[] getName()
   {
      return name_;
   }

   /**
            * Set to LATEST_PX4_ROS2_API_VERSION
            */
   public void setPx4Ros2ApiVersion(int px4_ros2_api_version)
   {
      px4_ros2_api_version_ = px4_ros2_api_version;
   }
   /**
            * Set to LATEST_PX4_ROS2_API_VERSION
            */
   public int getPx4Ros2ApiVersion()
   {
      return px4_ros2_api_version_;
   }

   /**
            * Components to be registered
            */
   public void setRegisterArmingCheck(boolean register_arming_check)
   {
      register_arming_check_ = register_arming_check;
   }
   /**
            * Components to be registered
            */
   public boolean getRegisterArmingCheck()
   {
      return register_arming_check_;
   }

   /**
            * registering a mode also requires arming_check to be set
            */
   public void setRegisterMode(boolean register_mode)
   {
      register_mode_ = register_mode;
   }
   /**
            * registering a mode also requires arming_check to be set
            */
   public boolean getRegisterMode()
   {
      return register_mode_;
   }

   /**
            * registering an executor also requires a mode to be registered (which is the owned mode by the executor)
            */
   public void setRegisterModeExecutor(boolean register_mode_executor)
   {
      register_mode_executor_ = register_mode_executor;
   }
   /**
            * registering an executor also requires a mode to be registered (which is the owned mode by the executor)
            */
   public boolean getRegisterModeExecutor()
   {
      return register_mode_executor_;
   }

   /**
            * set to true if an internal mode should be replaced
            */
   public void setEnableReplaceInternalMode(boolean enable_replace_internal_mode)
   {
      enable_replace_internal_mode_ = enable_replace_internal_mode;
   }
   /**
            * set to true if an internal mode should be replaced
            */
   public boolean getEnableReplaceInternalMode()
   {
      return enable_replace_internal_mode_;
   }

   /**
            * vehicle_status::NAVIGATION_STATE_*
            */
   public void setReplaceInternalMode(byte replace_internal_mode)
   {
      replace_internal_mode_ = replace_internal_mode;
   }
   /**
            * vehicle_status::NAVIGATION_STATE_*
            */
   public byte getReplaceInternalMode()
   {
      return replace_internal_mode_;
   }

   /**
            * switch to the registered mode (can only be set in combination with an executor)
            */
   public void setActivateModeImmediately(boolean activate_mode_immediately)
   {
      activate_mode_immediately_ = activate_mode_immediately;
   }
   /**
            * switch to the registered mode (can only be set in combination with an executor)
            */
   public boolean getActivateModeImmediately()
   {
      return activate_mode_immediately_;
   }


   public static Supplier<RegisterExtComponentRequestPubSubType> getPubSubType()
   {
      return RegisterExtComponentRequestPubSubType::new;
   }

   @Override
   public Supplier<TopicDataType> getPubSubTypePacket()
   {
      return RegisterExtComponentRequestPubSubType::new;
   }

   @Override
   public boolean epsilonEquals(RegisterExtComponentRequest other, double epsilon)
   {
      if(other == null) return false;
      if(other == this) return true;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_, other.timestamp_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.request_id_, other.request_id_, epsilon)) return false;

      for(int i3 = 0; i3 < name_.length; ++i3)
      {
                if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.name_[i3], other.name_[i3], epsilon)) return false;
      }

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.px4_ros2_api_version_, other.px4_ros2_api_version_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.register_arming_check_, other.register_arming_check_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.register_mode_, other.register_mode_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.register_mode_executor_, other.register_mode_executor_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.enable_replace_internal_mode_, other.enable_replace_internal_mode_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.replace_internal_mode_, other.replace_internal_mode_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.activate_mode_immediately_, other.activate_mode_immediately_, epsilon)) return false;


      return true;
   }

   @Override
   public boolean equals(Object other)
   {
      if(other == null) return false;
      if(other == this) return true;
      if(!(other instanceof RegisterExtComponentRequest)) return false;

      RegisterExtComponentRequest otherMyClass = (RegisterExtComponentRequest) other;

      if(this.timestamp_ != otherMyClass.timestamp_) return false;

      if(this.request_id_ != otherMyClass.request_id_) return false;

      for(int i5 = 0; i5 < name_.length; ++i5)
      {
                if(this.name_[i5] != otherMyClass.name_[i5]) return false;

      }
      if(this.px4_ros2_api_version_ != otherMyClass.px4_ros2_api_version_) return false;

      if(this.register_arming_check_ != otherMyClass.register_arming_check_) return false;

      if(this.register_mode_ != otherMyClass.register_mode_) return false;

      if(this.register_mode_executor_ != otherMyClass.register_mode_executor_) return false;

      if(this.enable_replace_internal_mode_ != otherMyClass.enable_replace_internal_mode_) return false;

      if(this.replace_internal_mode_ != otherMyClass.replace_internal_mode_) return false;

      if(this.activate_mode_immediately_ != otherMyClass.activate_mode_immediately_) return false;


      return true;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("RegisterExtComponentRequest {");
      builder.append("timestamp=");
      builder.append(this.timestamp_);      builder.append(", ");
      builder.append("request_id=");
      builder.append(this.request_id_);      builder.append(", ");
      builder.append("name=");
      builder.append(java.util.Arrays.toString(this.name_));      builder.append(", ");
      builder.append("px4_ros2_api_version=");
      builder.append(this.px4_ros2_api_version_);      builder.append(", ");
      builder.append("register_arming_check=");
      builder.append(this.register_arming_check_);      builder.append(", ");
      builder.append("register_mode=");
      builder.append(this.register_mode_);      builder.append(", ");
      builder.append("register_mode_executor=");
      builder.append(this.register_mode_executor_);      builder.append(", ");
      builder.append("enable_replace_internal_mode=");
      builder.append(this.enable_replace_internal_mode_);      builder.append(", ");
      builder.append("replace_internal_mode=");
      builder.append(this.replace_internal_mode_);      builder.append(", ");
      builder.append("activate_mode_immediately=");
      builder.append(this.activate_mode_immediately_);
      builder.append("}");
      return builder.toString();
   }
}
