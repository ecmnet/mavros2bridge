package px4_msgs.msg.dds;

import us.ihmc.communication.packets.Packet;
import us.ihmc.euclid.interfaces.Settable;
import us.ihmc.euclid.interfaces.EpsilonComparable;
import java.util.function.Supplier;
import us.ihmc.pubsub.TopicDataType;

public class OnboardComputerStatus extends Packet<OnboardComputerStatus> implements Settable<OnboardComputerStatus>, EpsilonComparable<OnboardComputerStatus>
{
   /**
            * ONBOARD_COMPUTER_STATUS message data
            * [us] time since system start (microseconds)
            */
   public long timestamp_;
   /**
            * [ms] time since system boot of the companion (milliseconds)
            */
   public long uptime_;
   /**
            * type of onboard computer 0: Mission computer primary, 1: Mission computer backup 1, 2: Mission computer backup 2, 3: Compute node, 4-5: Compute spares, 6-9: Payload computers.
            */
   public byte type_;
   /**
            * CPU usage on the component in percent
            */
   public byte[] cpu_cores_;
   /**
            * Combined CPU usage as the last 10 slices of 100 MS
            */
   public byte[] cpu_combined_;
   /**
            * GPU usage on the component in percent
            */
   public byte[] gpu_cores_;
   /**
            * Combined GPU usage as the last 10 slices of 100 MS
            */
   public byte[] gpu_combined_;
   /**
            * [degC] Temperature of the board
            */
   public byte temperature_board_;
   /**
            * [degC] Temperature of the CPU core
            */
   public byte[] temperature_core_;
   /**
            * [rpm] Fan speeds
            */
   public short[] fan_speed_;
   /**
            * [MB] Amount of used RAM on the component system
            */
   public long ram_usage_;
   /**
            * [MB] Total amount of RAM on the component system
            */
   public long ram_total_;

   public OnboardComputerStatus()
   {
      cpu_cores_ = new byte[8];

      cpu_combined_ = new byte[10];

      gpu_cores_ = new byte[4];

      gpu_combined_ = new byte[10];

      temperature_core_ = new byte[8];

      fan_speed_ = new short[4];

   }

   public OnboardComputerStatus(OnboardComputerStatus other)
   {
      this();
      set(other);
   }

   public void set(OnboardComputerStatus other)
   {
      timestamp_ = other.timestamp_;

      uptime_ = other.uptime_;

      type_ = other.type_;

      for(int i1 = 0; i1 < cpu_cores_.length; ++i1)
      {
            cpu_cores_[i1] = other.cpu_cores_[i1];

      }

      for(int i3 = 0; i3 < cpu_combined_.length; ++i3)
      {
            cpu_combined_[i3] = other.cpu_combined_[i3];

      }

      for(int i5 = 0; i5 < gpu_cores_.length; ++i5)
      {
            gpu_cores_[i5] = other.gpu_cores_[i5];

      }

      for(int i7 = 0; i7 < gpu_combined_.length; ++i7)
      {
            gpu_combined_[i7] = other.gpu_combined_[i7];

      }

      temperature_board_ = other.temperature_board_;

      for(int i9 = 0; i9 < temperature_core_.length; ++i9)
      {
            temperature_core_[i9] = other.temperature_core_[i9];

      }

      for(int i11 = 0; i11 < fan_speed_.length; ++i11)
      {
            fan_speed_[i11] = other.fan_speed_[i11];

      }

      ram_usage_ = other.ram_usage_;

      ram_total_ = other.ram_total_;

   }

   /**
            * ONBOARD_COMPUTER_STATUS message data
            * [us] time since system start (microseconds)
            */
   public void setTimestamp(long timestamp)
   {
      timestamp_ = timestamp;
   }
   /**
            * ONBOARD_COMPUTER_STATUS message data
            * [us] time since system start (microseconds)
            */
   public long getTimestamp()
   {
      return timestamp_;
   }

   /**
            * [ms] time since system boot of the companion (milliseconds)
            */
   public void setUptime(long uptime)
   {
      uptime_ = uptime;
   }
   /**
            * [ms] time since system boot of the companion (milliseconds)
            */
   public long getUptime()
   {
      return uptime_;
   }

   /**
            * type of onboard computer 0: Mission computer primary, 1: Mission computer backup 1, 2: Mission computer backup 2, 3: Compute node, 4-5: Compute spares, 6-9: Payload computers.
            */
   public void setType(byte type)
   {
      type_ = type;
   }
   /**
            * type of onboard computer 0: Mission computer primary, 1: Mission computer backup 1, 2: Mission computer backup 2, 3: Compute node, 4-5: Compute spares, 6-9: Payload computers.
            */
   public byte getType()
   {
      return type_;
   }


   /**
            * CPU usage on the component in percent
            */
   public byte[] getCpuCores()
   {
      return cpu_cores_;
   }


   /**
            * Combined CPU usage as the last 10 slices of 100 MS
            */
   public byte[] getCpuCombined()
   {
      return cpu_combined_;
   }


   /**
            * GPU usage on the component in percent
            */
   public byte[] getGpuCores()
   {
      return gpu_cores_;
   }


   /**
            * Combined GPU usage as the last 10 slices of 100 MS
            */
   public byte[] getGpuCombined()
   {
      return gpu_combined_;
   }

   /**
            * [degC] Temperature of the board
            */
   public void setTemperatureBoard(byte temperature_board)
   {
      temperature_board_ = temperature_board;
   }
   /**
            * [degC] Temperature of the board
            */
   public byte getTemperatureBoard()
   {
      return temperature_board_;
   }


   /**
            * [degC] Temperature of the CPU core
            */
   public byte[] getTemperatureCore()
   {
      return temperature_core_;
   }


   /**
            * [rpm] Fan speeds
            */
   public short[] getFanSpeed()
   {
      return fan_speed_;
   }

   /**
            * [MB] Amount of used RAM on the component system
            */
   public void setRamUsage(long ram_usage)
   {
      ram_usage_ = ram_usage;
   }
   /**
            * [MB] Amount of used RAM on the component system
            */
   public long getRamUsage()
   {
      return ram_usage_;
   }

   /**
            * [MB] Total amount of RAM on the component system
            */
   public void setRamTotal(long ram_total)
   {
      ram_total_ = ram_total;
   }
   /**
            * [MB] Total amount of RAM on the component system
            */
   public long getRamTotal()
   {
      return ram_total_;
   }


   public static Supplier<OnboardComputerStatusPubSubType> getPubSubType()
   {
      return OnboardComputerStatusPubSubType::new;
   }

   @Override
   public Supplier<TopicDataType> getPubSubTypePacket()
   {
      return OnboardComputerStatusPubSubType::new;
   }

   @Override
   public boolean epsilonEquals(OnboardComputerStatus other, double epsilon)
   {
      if(other == null) return false;
      if(other == this) return true;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_, other.timestamp_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.uptime_, other.uptime_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.type_, other.type_, epsilon)) return false;

      for(int i13 = 0; i13 < cpu_cores_.length; ++i13)
      {
                if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.cpu_cores_[i13], other.cpu_cores_[i13], epsilon)) return false;
      }

      for(int i15 = 0; i15 < cpu_combined_.length; ++i15)
      {
                if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.cpu_combined_[i15], other.cpu_combined_[i15], epsilon)) return false;
      }

      for(int i17 = 0; i17 < gpu_cores_.length; ++i17)
      {
                if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.gpu_cores_[i17], other.gpu_cores_[i17], epsilon)) return false;
      }

      for(int i19 = 0; i19 < gpu_combined_.length; ++i19)
      {
                if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.gpu_combined_[i19], other.gpu_combined_[i19], epsilon)) return false;
      }

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.temperature_board_, other.temperature_board_, epsilon)) return false;

      for(int i21 = 0; i21 < temperature_core_.length; ++i21)
      {
                if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.temperature_core_[i21], other.temperature_core_[i21], epsilon)) return false;
      }

      for(int i23 = 0; i23 < fan_speed_.length; ++i23)
      {
                if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.fan_speed_[i23], other.fan_speed_[i23], epsilon)) return false;
      }

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.ram_usage_, other.ram_usage_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.ram_total_, other.ram_total_, epsilon)) return false;


      return true;
   }

   @Override
   public boolean equals(Object other)
   {
      if(other == null) return false;
      if(other == this) return true;
      if(!(other instanceof OnboardComputerStatus)) return false;

      OnboardComputerStatus otherMyClass = (OnboardComputerStatus) other;

      if(this.timestamp_ != otherMyClass.timestamp_) return false;

      if(this.uptime_ != otherMyClass.uptime_) return false;

      if(this.type_ != otherMyClass.type_) return false;

      for(int i25 = 0; i25 < cpu_cores_.length; ++i25)
      {
                if(this.cpu_cores_[i25] != otherMyClass.cpu_cores_[i25]) return false;

      }
      for(int i27 = 0; i27 < cpu_combined_.length; ++i27)
      {
                if(this.cpu_combined_[i27] != otherMyClass.cpu_combined_[i27]) return false;

      }
      for(int i29 = 0; i29 < gpu_cores_.length; ++i29)
      {
                if(this.gpu_cores_[i29] != otherMyClass.gpu_cores_[i29]) return false;

      }
      for(int i31 = 0; i31 < gpu_combined_.length; ++i31)
      {
                if(this.gpu_combined_[i31] != otherMyClass.gpu_combined_[i31]) return false;

      }
      if(this.temperature_board_ != otherMyClass.temperature_board_) return false;

      for(int i33 = 0; i33 < temperature_core_.length; ++i33)
      {
                if(this.temperature_core_[i33] != otherMyClass.temperature_core_[i33]) return false;

      }
      for(int i35 = 0; i35 < fan_speed_.length; ++i35)
      {
                if(this.fan_speed_[i35] != otherMyClass.fan_speed_[i35]) return false;

      }
      if(this.ram_usage_ != otherMyClass.ram_usage_) return false;

      if(this.ram_total_ != otherMyClass.ram_total_) return false;


      return true;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("OnboardComputerStatus {");
      builder.append("timestamp=");
      builder.append(this.timestamp_);      builder.append(", ");
      builder.append("uptime=");
      builder.append(this.uptime_);      builder.append(", ");
      builder.append("type=");
      builder.append(this.type_);      builder.append(", ");
      builder.append("cpu_cores=");
      builder.append(java.util.Arrays.toString(this.cpu_cores_));      builder.append(", ");
      builder.append("cpu_combined=");
      builder.append(java.util.Arrays.toString(this.cpu_combined_));      builder.append(", ");
      builder.append("gpu_cores=");
      builder.append(java.util.Arrays.toString(this.gpu_cores_));      builder.append(", ");
      builder.append("gpu_combined=");
      builder.append(java.util.Arrays.toString(this.gpu_combined_));      builder.append(", ");
      builder.append("temperature_board=");
      builder.append(this.temperature_board_);      builder.append(", ");
      builder.append("temperature_core=");
      builder.append(java.util.Arrays.toString(this.temperature_core_));      builder.append(", ");
      builder.append("fan_speed=");
      builder.append(java.util.Arrays.toString(this.fan_speed_));      builder.append(", ");
      builder.append("ram_usage=");
      builder.append(this.ram_usage_);      builder.append(", ");
      builder.append("ram_total=");
      builder.append(this.ram_total_);
      builder.append("}");
      return builder.toString();
   }
}
