package px4_msgs.msg.dds;

import us.ihmc.communication.packets.Packet;
import us.ihmc.euclid.interfaces.Settable;
import us.ihmc.euclid.interfaces.EpsilonComparable;
import java.util.function.Supplier;
import us.ihmc.pubsub.TopicDataType;

public class RegisterExtComponentReply extends Packet<RegisterExtComponentReply> implements Settable<RegisterExtComponentReply>, EpsilonComparable<RegisterExtComponentReply>
{
   public static final byte ORB_QUEUE_LENGTH = (byte) 2;/**
            * time since system start (microseconds)
            */
   public long timestamp_;
   /**
            * ID from the request
            */
   public long request_id_;
   /**
            * name from the request
            */
   public char[] name_;
   public int px4_ros2_api_version_;
   public boolean success_;
   /**
            * arming check registration ID (-1 if invalid)
            */
   public byte arming_check_id_;
   /**
            * assigned mode ID (-1 if invalid)
            */
   public byte mode_id_;
   /**
            * assigned mode executor ID (-1 if invalid)
            */
   public byte mode_executor_id_;

   public RegisterExtComponentReply()
   {
      name_ = new char[25];

   }

   public RegisterExtComponentReply(RegisterExtComponentReply other)
   {
      this();
      set(other);
   }

   public void set(RegisterExtComponentReply other)
   {
      timestamp_ = other.timestamp_;

      request_id_ = other.request_id_;

      for(int i1 = 0; i1 < name_.length; ++i1)
      {
            name_[i1] = other.name_[i1];

      }

      px4_ros2_api_version_ = other.px4_ros2_api_version_;

      success_ = other.success_;

      arming_check_id_ = other.arming_check_id_;

      mode_id_ = other.mode_id_;

      mode_executor_id_ = other.mode_executor_id_;

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
            * ID from the request
            */
   public void setRequestId(long request_id)
   {
      request_id_ = request_id;
   }
   /**
            * ID from the request
            */
   public long getRequestId()
   {
      return request_id_;
   }


   /**
            * name from the request
            */
   public char[] getName()
   {
      return name_;
   }

   public void setPx4Ros2ApiVersion(int px4_ros2_api_version)
   {
      px4_ros2_api_version_ = px4_ros2_api_version;
   }
   public int getPx4Ros2ApiVersion()
   {
      return px4_ros2_api_version_;
   }

   public void setSuccess(boolean success)
   {
      success_ = success;
   }
   public boolean getSuccess()
   {
      return success_;
   }

   /**
            * arming check registration ID (-1 if invalid)
            */
   public void setArmingCheckId(byte arming_check_id)
   {
      arming_check_id_ = arming_check_id;
   }
   /**
            * arming check registration ID (-1 if invalid)
            */
   public byte getArmingCheckId()
   {
      return arming_check_id_;
   }

   /**
            * assigned mode ID (-1 if invalid)
            */
   public void setModeId(byte mode_id)
   {
      mode_id_ = mode_id;
   }
   /**
            * assigned mode ID (-1 if invalid)
            */
   public byte getModeId()
   {
      return mode_id_;
   }

   /**
            * assigned mode executor ID (-1 if invalid)
            */
   public void setModeExecutorId(byte mode_executor_id)
   {
      mode_executor_id_ = mode_executor_id;
   }
   /**
            * assigned mode executor ID (-1 if invalid)
            */
   public byte getModeExecutorId()
   {
      return mode_executor_id_;
   }


   public static Supplier<RegisterExtComponentReplyPubSubType> getPubSubType()
   {
      return RegisterExtComponentReplyPubSubType::new;
   }

   @Override
   public Supplier<TopicDataType> getPubSubTypePacket()
   {
      return RegisterExtComponentReplyPubSubType::new;
   }

   @Override
   public boolean epsilonEquals(RegisterExtComponentReply other, double epsilon)
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

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.success_, other.success_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.arming_check_id_, other.arming_check_id_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.mode_id_, other.mode_id_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.mode_executor_id_, other.mode_executor_id_, epsilon)) return false;


      return true;
   }

   @Override
   public boolean equals(Object other)
   {
      if(other == null) return false;
      if(other == this) return true;
      if(!(other instanceof RegisterExtComponentReply)) return false;

      RegisterExtComponentReply otherMyClass = (RegisterExtComponentReply) other;

      if(this.timestamp_ != otherMyClass.timestamp_) return false;

      if(this.request_id_ != otherMyClass.request_id_) return false;

      for(int i5 = 0; i5 < name_.length; ++i5)
      {
                if(this.name_[i5] != otherMyClass.name_[i5]) return false;

      }
      if(this.px4_ros2_api_version_ != otherMyClass.px4_ros2_api_version_) return false;

      if(this.success_ != otherMyClass.success_) return false;

      if(this.arming_check_id_ != otherMyClass.arming_check_id_) return false;

      if(this.mode_id_ != otherMyClass.mode_id_) return false;

      if(this.mode_executor_id_ != otherMyClass.mode_executor_id_) return false;


      return true;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("RegisterExtComponentReply {");
      builder.append("timestamp=");
      builder.append(this.timestamp_);      builder.append(", ");
      builder.append("request_id=");
      builder.append(this.request_id_);      builder.append(", ");
      builder.append("name=");
      builder.append(java.util.Arrays.toString(this.name_));      builder.append(", ");
      builder.append("px4_ros2_api_version=");
      builder.append(this.px4_ros2_api_version_);      builder.append(", ");
      builder.append("success=");
      builder.append(this.success_);      builder.append(", ");
      builder.append("arming_check_id=");
      builder.append(this.arming_check_id_);      builder.append(", ");
      builder.append("mode_id=");
      builder.append(this.mode_id_);      builder.append(", ");
      builder.append("mode_executor_id=");
      builder.append(this.mode_executor_id_);
      builder.append("}");
      return builder.toString();
   }
}
