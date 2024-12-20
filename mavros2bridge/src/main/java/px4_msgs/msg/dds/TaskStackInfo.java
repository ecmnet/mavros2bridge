package px4_msgs.msg.dds;

import us.ihmc.communication.packets.Packet;
import us.ihmc.euclid.interfaces.Settable;
import us.ihmc.euclid.interfaces.EpsilonComparable;
import java.util.function.Supplier;
import us.ihmc.pubsub.TopicDataType;

/**
       * stack information for a single running process
       */
public class TaskStackInfo extends Packet<TaskStackInfo> implements Settable<TaskStackInfo>, EpsilonComparable<TaskStackInfo>
{
   public static final byte ORB_QUEUE_LENGTH = (byte) 2;/**
            * time since system start (microseconds)
            */
   public long timestamp_;
   public int stack_free_;
   public char[] task_name_;

   public TaskStackInfo()
   {
      task_name_ = new char[24];

   }

   public TaskStackInfo(TaskStackInfo other)
   {
      this();
      set(other);
   }

   public void set(TaskStackInfo other)
   {
      timestamp_ = other.timestamp_;

      stack_free_ = other.stack_free_;

      for(int i1 = 0; i1 < task_name_.length; ++i1)
      {
            task_name_[i1] = other.task_name_[i1];

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

   public void setStackFree(int stack_free)
   {
      stack_free_ = stack_free;
   }
   public int getStackFree()
   {
      return stack_free_;
   }


   public char[] getTaskName()
   {
      return task_name_;
   }


   public static Supplier<TaskStackInfoPubSubType> getPubSubType()
   {
      return TaskStackInfoPubSubType::new;
   }

   @Override
   public Supplier<TopicDataType> getPubSubTypePacket()
   {
      return TaskStackInfoPubSubType::new;
   }

   @Override
   public boolean epsilonEquals(TaskStackInfo other, double epsilon)
   {
      if(other == null) return false;
      if(other == this) return true;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_, other.timestamp_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.stack_free_, other.stack_free_, epsilon)) return false;

      for(int i3 = 0; i3 < task_name_.length; ++i3)
      {
                if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.task_name_[i3], other.task_name_[i3], epsilon)) return false;
      }


      return true;
   }

   @Override
   public boolean equals(Object other)
   {
      if(other == null) return false;
      if(other == this) return true;
      if(!(other instanceof TaskStackInfo)) return false;

      TaskStackInfo otherMyClass = (TaskStackInfo) other;

      if(this.timestamp_ != otherMyClass.timestamp_) return false;

      if(this.stack_free_ != otherMyClass.stack_free_) return false;

      for(int i5 = 0; i5 < task_name_.length; ++i5)
      {
                if(this.task_name_[i5] != otherMyClass.task_name_[i5]) return false;

      }

      return true;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("TaskStackInfo {");
      builder.append("timestamp=");
      builder.append(this.timestamp_);      builder.append(", ");
      builder.append("stack_free=");
      builder.append(this.stack_free_);      builder.append(", ");
      builder.append("task_name=");
      builder.append(java.util.Arrays.toString(this.task_name_));
      builder.append("}");
      return builder.toString();
   }
}
