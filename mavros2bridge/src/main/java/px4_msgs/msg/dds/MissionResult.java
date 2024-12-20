package px4_msgs.msg.dds;

import us.ihmc.communication.packets.Packet;
import us.ihmc.euclid.interfaces.Settable;
import us.ihmc.euclid.interfaces.EpsilonComparable;
import java.util.function.Supplier;
import us.ihmc.pubsub.TopicDataType;

public class MissionResult extends Packet<MissionResult> implements Settable<MissionResult>, EpsilonComparable<MissionResult>
{
   /**
            * time since system start (microseconds)
            */
   public long timestamp_;
   /**
            * Id for the mission for which the result was generated
            */
   public long mission_id_;
   /**
            * Id for the corresponding geofence for which the result was generated (used for mission feasibility)
            */
   public long geofence_id_;
   /**
            * Counter of the home position for which the result was generated (used for mission feasibility)
            */
   public long home_position_counter_;
   /**
            * Sequence of the mission item which has been reached, default -1
            */
   public int seq_reached_;
   /**
            * Sequence of the current mission item
            */
   public int seq_current_;
   /**
            * Total number of mission items
            */
   public int seq_total_;
   /**
            * true if mission is valid
            */
   public boolean valid_;
   /**
            * true if mission is valid, but has potentially problematic items leading to safety warnings
            */
   public boolean warning_;
   /**
            * true if mission has been completed
            */
   public boolean finished_;
   /**
            * true if the mission cannot continue or be completed for some reason
            */
   public boolean failure_;
   /**
            * true if the number of do jumps remaining has changed
            */
   public boolean item_do_jump_changed_;
   /**
            * indicate which item has changed
            */
   public int item_changed_index_;
   /**
            * set to the number of do jumps remaining for that item
            */
   public int item_do_jump_remaining_;
   /**
            * indicates the mode in which the mission is executed
            */
   public byte execution_mode_;

   public MissionResult()
   {
   }

   public MissionResult(MissionResult other)
   {
      this();
      set(other);
   }

   public void set(MissionResult other)
   {
      timestamp_ = other.timestamp_;

      mission_id_ = other.mission_id_;

      geofence_id_ = other.geofence_id_;

      home_position_counter_ = other.home_position_counter_;

      seq_reached_ = other.seq_reached_;

      seq_current_ = other.seq_current_;

      seq_total_ = other.seq_total_;

      valid_ = other.valid_;

      warning_ = other.warning_;

      finished_ = other.finished_;

      failure_ = other.failure_;

      item_do_jump_changed_ = other.item_do_jump_changed_;

      item_changed_index_ = other.item_changed_index_;

      item_do_jump_remaining_ = other.item_do_jump_remaining_;

      execution_mode_ = other.execution_mode_;

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
            * Id for the mission for which the result was generated
            */
   public void setMissionId(long mission_id)
   {
      mission_id_ = mission_id;
   }
   /**
            * Id for the mission for which the result was generated
            */
   public long getMissionId()
   {
      return mission_id_;
   }

   /**
            * Id for the corresponding geofence for which the result was generated (used for mission feasibility)
            */
   public void setGeofenceId(long geofence_id)
   {
      geofence_id_ = geofence_id;
   }
   /**
            * Id for the corresponding geofence for which the result was generated (used for mission feasibility)
            */
   public long getGeofenceId()
   {
      return geofence_id_;
   }

   /**
            * Counter of the home position for which the result was generated (used for mission feasibility)
            */
   public void setHomePositionCounter(long home_position_counter)
   {
      home_position_counter_ = home_position_counter;
   }
   /**
            * Counter of the home position for which the result was generated (used for mission feasibility)
            */
   public long getHomePositionCounter()
   {
      return home_position_counter_;
   }

   /**
            * Sequence of the mission item which has been reached, default -1
            */
   public void setSeqReached(int seq_reached)
   {
      seq_reached_ = seq_reached;
   }
   /**
            * Sequence of the mission item which has been reached, default -1
            */
   public int getSeqReached()
   {
      return seq_reached_;
   }

   /**
            * Sequence of the current mission item
            */
   public void setSeqCurrent(int seq_current)
   {
      seq_current_ = seq_current;
   }
   /**
            * Sequence of the current mission item
            */
   public int getSeqCurrent()
   {
      return seq_current_;
   }

   /**
            * Total number of mission items
            */
   public void setSeqTotal(int seq_total)
   {
      seq_total_ = seq_total;
   }
   /**
            * Total number of mission items
            */
   public int getSeqTotal()
   {
      return seq_total_;
   }

   /**
            * true if mission is valid
            */
   public void setValid(boolean valid)
   {
      valid_ = valid;
   }
   /**
            * true if mission is valid
            */
   public boolean getValid()
   {
      return valid_;
   }

   /**
            * true if mission is valid, but has potentially problematic items leading to safety warnings
            */
   public void setWarning(boolean warning)
   {
      warning_ = warning;
   }
   /**
            * true if mission is valid, but has potentially problematic items leading to safety warnings
            */
   public boolean getWarning()
   {
      return warning_;
   }

   /**
            * true if mission has been completed
            */
   public void setFinished(boolean finished)
   {
      finished_ = finished;
   }
   /**
            * true if mission has been completed
            */
   public boolean getFinished()
   {
      return finished_;
   }

   /**
            * true if the mission cannot continue or be completed for some reason
            */
   public void setFailure(boolean failure)
   {
      failure_ = failure;
   }
   /**
            * true if the mission cannot continue or be completed for some reason
            */
   public boolean getFailure()
   {
      return failure_;
   }

   /**
            * true if the number of do jumps remaining has changed
            */
   public void setItemDoJumpChanged(boolean item_do_jump_changed)
   {
      item_do_jump_changed_ = item_do_jump_changed;
   }
   /**
            * true if the number of do jumps remaining has changed
            */
   public boolean getItemDoJumpChanged()
   {
      return item_do_jump_changed_;
   }

   /**
            * indicate which item has changed
            */
   public void setItemChangedIndex(int item_changed_index)
   {
      item_changed_index_ = item_changed_index;
   }
   /**
            * indicate which item has changed
            */
   public int getItemChangedIndex()
   {
      return item_changed_index_;
   }

   /**
            * set to the number of do jumps remaining for that item
            */
   public void setItemDoJumpRemaining(int item_do_jump_remaining)
   {
      item_do_jump_remaining_ = item_do_jump_remaining;
   }
   /**
            * set to the number of do jumps remaining for that item
            */
   public int getItemDoJumpRemaining()
   {
      return item_do_jump_remaining_;
   }

   /**
            * indicates the mode in which the mission is executed
            */
   public void setExecutionMode(byte execution_mode)
   {
      execution_mode_ = execution_mode;
   }
   /**
            * indicates the mode in which the mission is executed
            */
   public byte getExecutionMode()
   {
      return execution_mode_;
   }


   public static Supplier<MissionResultPubSubType> getPubSubType()
   {
      return MissionResultPubSubType::new;
   }

   @Override
   public Supplier<TopicDataType> getPubSubTypePacket()
   {
      return MissionResultPubSubType::new;
   }

   @Override
   public boolean epsilonEquals(MissionResult other, double epsilon)
   {
      if(other == null) return false;
      if(other == this) return true;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_, other.timestamp_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.mission_id_, other.mission_id_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.geofence_id_, other.geofence_id_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.home_position_counter_, other.home_position_counter_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.seq_reached_, other.seq_reached_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.seq_current_, other.seq_current_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.seq_total_, other.seq_total_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.valid_, other.valid_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.warning_, other.warning_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.finished_, other.finished_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.failure_, other.failure_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.item_do_jump_changed_, other.item_do_jump_changed_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.item_changed_index_, other.item_changed_index_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.item_do_jump_remaining_, other.item_do_jump_remaining_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.execution_mode_, other.execution_mode_, epsilon)) return false;


      return true;
   }

   @Override
   public boolean equals(Object other)
   {
      if(other == null) return false;
      if(other == this) return true;
      if(!(other instanceof MissionResult)) return false;

      MissionResult otherMyClass = (MissionResult) other;

      if(this.timestamp_ != otherMyClass.timestamp_) return false;

      if(this.mission_id_ != otherMyClass.mission_id_) return false;

      if(this.geofence_id_ != otherMyClass.geofence_id_) return false;

      if(this.home_position_counter_ != otherMyClass.home_position_counter_) return false;

      if(this.seq_reached_ != otherMyClass.seq_reached_) return false;

      if(this.seq_current_ != otherMyClass.seq_current_) return false;

      if(this.seq_total_ != otherMyClass.seq_total_) return false;

      if(this.valid_ != otherMyClass.valid_) return false;

      if(this.warning_ != otherMyClass.warning_) return false;

      if(this.finished_ != otherMyClass.finished_) return false;

      if(this.failure_ != otherMyClass.failure_) return false;

      if(this.item_do_jump_changed_ != otherMyClass.item_do_jump_changed_) return false;

      if(this.item_changed_index_ != otherMyClass.item_changed_index_) return false;

      if(this.item_do_jump_remaining_ != otherMyClass.item_do_jump_remaining_) return false;

      if(this.execution_mode_ != otherMyClass.execution_mode_) return false;


      return true;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("MissionResult {");
      builder.append("timestamp=");
      builder.append(this.timestamp_);      builder.append(", ");
      builder.append("mission_id=");
      builder.append(this.mission_id_);      builder.append(", ");
      builder.append("geofence_id=");
      builder.append(this.geofence_id_);      builder.append(", ");
      builder.append("home_position_counter=");
      builder.append(this.home_position_counter_);      builder.append(", ");
      builder.append("seq_reached=");
      builder.append(this.seq_reached_);      builder.append(", ");
      builder.append("seq_current=");
      builder.append(this.seq_current_);      builder.append(", ");
      builder.append("seq_total=");
      builder.append(this.seq_total_);      builder.append(", ");
      builder.append("valid=");
      builder.append(this.valid_);      builder.append(", ");
      builder.append("warning=");
      builder.append(this.warning_);      builder.append(", ");
      builder.append("finished=");
      builder.append(this.finished_);      builder.append(", ");
      builder.append("failure=");
      builder.append(this.failure_);      builder.append(", ");
      builder.append("item_do_jump_changed=");
      builder.append(this.item_do_jump_changed_);      builder.append(", ");
      builder.append("item_changed_index=");
      builder.append(this.item_changed_index_);      builder.append(", ");
      builder.append("item_do_jump_remaining=");
      builder.append(this.item_do_jump_remaining_);      builder.append(", ");
      builder.append("execution_mode=");
      builder.append(this.execution_mode_);
      builder.append("}");
      return builder.toString();
   }
}
