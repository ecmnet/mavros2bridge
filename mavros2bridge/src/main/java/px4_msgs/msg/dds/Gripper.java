package px4_msgs.msg.dds;

import us.ihmc.communication.packets.Packet;
import us.ihmc.euclid.interfaces.Settable;
import us.ihmc.euclid.interfaces.EpsilonComparable;
import java.util.function.Supplier;
import us.ihmc.pubsub.TopicDataType;

/**
       * # Used to command an actuation in the gripper, which is mapped to a specific output in the control allocation module
       */
public class Gripper extends Packet<Gripper> implements Settable<Gripper>, EpsilonComparable<Gripper>
{
   public static final byte COMMAND_GRAB = (byte) 0;
   public static final byte COMMAND_RELEASE = (byte) 1;
   public long timestamp_;
   /**
            * Commanded state for the gripper
            */
   public byte command_;

   public Gripper()
   {
   }

   public Gripper(Gripper other)
   {
      this();
      set(other);
   }

   public void set(Gripper other)
   {
      timestamp_ = other.timestamp_;

      command_ = other.command_;

   }

   public void setTimestamp(long timestamp)
   {
      timestamp_ = timestamp;
   }
   public long getTimestamp()
   {
      return timestamp_;
   }

   /**
            * Commanded state for the gripper
            */
   public void setCommand(byte command)
   {
      command_ = command;
   }
   /**
            * Commanded state for the gripper
            */
   public byte getCommand()
   {
      return command_;
   }


   public static Supplier<GripperPubSubType> getPubSubType()
   {
      return GripperPubSubType::new;
   }

   @Override
   public Supplier<TopicDataType> getPubSubTypePacket()
   {
      return GripperPubSubType::new;
   }

   @Override
   public boolean epsilonEquals(Gripper other, double epsilon)
   {
      if(other == null) return false;
      if(other == this) return true;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_, other.timestamp_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.command_, other.command_, epsilon)) return false;


      return true;
   }

   @Override
   public boolean equals(Object other)
   {
      if(other == null) return false;
      if(other == this) return true;
      if(!(other instanceof Gripper)) return false;

      Gripper otherMyClass = (Gripper) other;

      if(this.timestamp_ != otherMyClass.timestamp_) return false;

      if(this.command_ != otherMyClass.command_) return false;


      return true;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("Gripper {");
      builder.append("timestamp=");
      builder.append(this.timestamp_);      builder.append(", ");
      builder.append("command=");
      builder.append(this.command_);
      builder.append("}");
      return builder.toString();
   }
}
