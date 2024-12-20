package px4_msgs.msg.dds;

import us.ihmc.communication.packets.Packet;
import us.ihmc.euclid.interfaces.Settable;
import us.ihmc.euclid.interfaces.EpsilonComparable;
import java.util.function.Supplier;
import us.ihmc.pubsub.TopicDataType;

/**
       * Vehicle Command Ackonwledgement uORB message.
       * Used for acknowledging the vehicle command being received.
       * Follows the MAVLink COMMAND_ACK message definition
       */
public class VehicleCommandAck extends Packet<VehicleCommandAck> implements Settable<VehicleCommandAck>, EpsilonComparable<VehicleCommandAck>
{
   /**
          * Result cases. This follows the MAVLink MAV_RESULT enum definition
          * Command ACCEPTED and EXECUTED |
          */
   public static final byte VEHICLE_CMD_RESULT_ACCEPTED = (byte) 0;
   /**
          * Command TEMPORARY REJECTED/DENIED |
          */
   public static final byte VEHICLE_CMD_RESULT_TEMPORARILY_REJECTED = (byte) 1;
   /**
          * Command PERMANENTLY DENIED |
          */
   public static final byte VEHICLE_CMD_RESULT_DENIED = (byte) 2;
   /**
          * Command UNKNOWN/UNSUPPORTED |
          */
   public static final byte VEHICLE_CMD_RESULT_UNSUPPORTED = (byte) 3;
   /**
          * Command executed, but failed |
          */
   public static final byte VEHICLE_CMD_RESULT_FAILED = (byte) 4;
   /**
          * Command being executed |
          */
   public static final byte VEHICLE_CMD_RESULT_IN_PROGRESS = (byte) 5;
   /**
          * Command Canceled
          */
   public static final byte VEHICLE_CMD_RESULT_CANCELLED = (byte) 6;
   /**
          * Arming denied specific cases
          */
   public static final int ARM_AUTH_DENIED_REASON_GENERIC = 0;
   public static final int ARM_AUTH_DENIED_REASON_NONE = 1;
   public static final int ARM_AUTH_DENIED_REASON_INVALID_WAYPOINT = 2;
   public static final int ARM_AUTH_DENIED_REASON_TIMEOUT = 3;
   public static final int ARM_AUTH_DENIED_REASON_AIRSPACE_IN_USE = 4;
   public static final int ARM_AUTH_DENIED_REASON_BAD_WEATHER = 5;
   public static final byte ORB_QUEUE_LENGTH = (byte) 4;
   /**
            * time since system start (microseconds)
            */
   public long timestamp_;
   /**
            * Command that is being acknowledged
            */
   public long command_;
   /**
            * Command result
            */
   public byte result_;
   /**
            * Also used as progress[%], it can be set with the reason why the command was denied, or the progress percentage when result is MAV_RESULT_IN_PROGRESS
            */
   public byte result_param1_;
   /**
            * Additional parameter of the result, example: which parameter of MAV_CMD_NAV_WAYPOINT caused it to be denied.
            */
   public int result_param2_;
   public byte target_system_;
   /**
            * Target component / mode executor
            */
   public int target_component_;
   /**
            * Indicates if the command came from an external source
            */
   public boolean from_external_;

   public VehicleCommandAck()
   {
   }

   public VehicleCommandAck(VehicleCommandAck other)
   {
      this();
      set(other);
   }

   public void set(VehicleCommandAck other)
   {
      timestamp_ = other.timestamp_;

      command_ = other.command_;

      result_ = other.result_;

      result_param1_ = other.result_param1_;

      result_param2_ = other.result_param2_;

      target_system_ = other.target_system_;

      target_component_ = other.target_component_;

      from_external_ = other.from_external_;

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
            * Command that is being acknowledged
            */
   public void setCommand(long command)
   {
      command_ = command;
   }
   /**
            * Command that is being acknowledged
            */
   public long getCommand()
   {
      return command_;
   }

   /**
            * Command result
            */
   public void setResult(byte result)
   {
      result_ = result;
   }
   /**
            * Command result
            */
   public byte getResult()
   {
      return result_;
   }

   /**
            * Also used as progress[%], it can be set with the reason why the command was denied, or the progress percentage when result is MAV_RESULT_IN_PROGRESS
            */
   public void setResultParam1(byte result_param1)
   {
      result_param1_ = result_param1;
   }
   /**
            * Also used as progress[%], it can be set with the reason why the command was denied, or the progress percentage when result is MAV_RESULT_IN_PROGRESS
            */
   public byte getResultParam1()
   {
      return result_param1_;
   }

   /**
            * Additional parameter of the result, example: which parameter of MAV_CMD_NAV_WAYPOINT caused it to be denied.
            */
   public void setResultParam2(int result_param2)
   {
      result_param2_ = result_param2;
   }
   /**
            * Additional parameter of the result, example: which parameter of MAV_CMD_NAV_WAYPOINT caused it to be denied.
            */
   public int getResultParam2()
   {
      return result_param2_;
   }

   public void setTargetSystem(byte target_system)
   {
      target_system_ = target_system;
   }
   public byte getTargetSystem()
   {
      return target_system_;
   }

   /**
            * Target component / mode executor
            */
   public void setTargetComponent(int target_component)
   {
      target_component_ = target_component;
   }
   /**
            * Target component / mode executor
            */
   public int getTargetComponent()
   {
      return target_component_;
   }

   /**
            * Indicates if the command came from an external source
            */
   public void setFromExternal(boolean from_external)
   {
      from_external_ = from_external;
   }
   /**
            * Indicates if the command came from an external source
            */
   public boolean getFromExternal()
   {
      return from_external_;
   }


   public static Supplier<VehicleCommandAckPubSubType> getPubSubType()
   {
      return VehicleCommandAckPubSubType::new;
   }

   @Override
   public Supplier<TopicDataType> getPubSubTypePacket()
   {
      return VehicleCommandAckPubSubType::new;
   }

   @Override
   public boolean epsilonEquals(VehicleCommandAck other, double epsilon)
   {
      if(other == null) return false;
      if(other == this) return true;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_, other.timestamp_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.command_, other.command_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.result_, other.result_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.result_param1_, other.result_param1_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.result_param2_, other.result_param2_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.target_system_, other.target_system_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.target_component_, other.target_component_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.from_external_, other.from_external_, epsilon)) return false;


      return true;
   }

   @Override
   public boolean equals(Object other)
   {
      if(other == null) return false;
      if(other == this) return true;
      if(!(other instanceof VehicleCommandAck)) return false;

      VehicleCommandAck otherMyClass = (VehicleCommandAck) other;

      if(this.timestamp_ != otherMyClass.timestamp_) return false;

      if(this.command_ != otherMyClass.command_) return false;

      if(this.result_ != otherMyClass.result_) return false;

      if(this.result_param1_ != otherMyClass.result_param1_) return false;

      if(this.result_param2_ != otherMyClass.result_param2_) return false;

      if(this.target_system_ != otherMyClass.target_system_) return false;

      if(this.target_component_ != otherMyClass.target_component_) return false;

      if(this.from_external_ != otherMyClass.from_external_) return false;


      return true;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("VehicleCommandAck {");
      builder.append("timestamp=");
      builder.append(this.timestamp_);      builder.append(", ");
      builder.append("command=");
      builder.append(this.command_);      builder.append(", ");
      builder.append("result=");
      builder.append(this.result_);      builder.append(", ");
      builder.append("result_param1=");
      builder.append(this.result_param1_);      builder.append(", ");
      builder.append("result_param2=");
      builder.append(this.result_param2_);      builder.append(", ");
      builder.append("target_system=");
      builder.append(this.target_system_);      builder.append(", ");
      builder.append("target_component=");
      builder.append(this.target_component_);      builder.append(", ");
      builder.append("from_external=");
      builder.append(this.from_external_);
      builder.append("}");
      return builder.toString();
   }
}
