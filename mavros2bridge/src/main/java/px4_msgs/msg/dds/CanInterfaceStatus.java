package px4_msgs.msg.dds;

import us.ihmc.communication.packets.Packet;
import us.ihmc.euclid.interfaces.Settable;
import us.ihmc.euclid.interfaces.EpsilonComparable;
import java.util.function.Supplier;
import us.ihmc.pubsub.TopicDataType;

public class CanInterfaceStatus extends Packet<CanInterfaceStatus> implements Settable<CanInterfaceStatus>, EpsilonComparable<CanInterfaceStatus>
{
   /**
            * time since system start (microseconds)
            */
   public long timestamp_;
   public long io_errors_;
   public long frames_tx_;
   public long frames_rx_;

   public CanInterfaceStatus()
   {
   }

   public CanInterfaceStatus(CanInterfaceStatus other)
   {
      this();
      set(other);
   }

   public void set(CanInterfaceStatus other)
   {
      timestamp_ = other.timestamp_;

      io_errors_ = other.io_errors_;

      frames_tx_ = other.frames_tx_;

      frames_rx_ = other.frames_rx_;

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

   public void setIoErrors(long io_errors)
   {
      io_errors_ = io_errors;
   }
   public long getIoErrors()
   {
      return io_errors_;
   }

   public void setFramesTx(long frames_tx)
   {
      frames_tx_ = frames_tx;
   }
   public long getFramesTx()
   {
      return frames_tx_;
   }

   public void setFramesRx(long frames_rx)
   {
      frames_rx_ = frames_rx;
   }
   public long getFramesRx()
   {
      return frames_rx_;
   }


   public static Supplier<CanInterfaceStatusPubSubType> getPubSubType()
   {
      return CanInterfaceStatusPubSubType::new;
   }

   @Override
   public Supplier<TopicDataType> getPubSubTypePacket()
   {
      return CanInterfaceStatusPubSubType::new;
   }

   @Override
   public boolean epsilonEquals(CanInterfaceStatus other, double epsilon)
   {
      if(other == null) return false;
      if(other == this) return true;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_, other.timestamp_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.io_errors_, other.io_errors_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.frames_tx_, other.frames_tx_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.frames_rx_, other.frames_rx_, epsilon)) return false;


      return true;
   }

   @Override
   public boolean equals(Object other)
   {
      if(other == null) return false;
      if(other == this) return true;
      if(!(other instanceof CanInterfaceStatus)) return false;

      CanInterfaceStatus otherMyClass = (CanInterfaceStatus) other;

      if(this.timestamp_ != otherMyClass.timestamp_) return false;

      if(this.io_errors_ != otherMyClass.io_errors_) return false;

      if(this.frames_tx_ != otherMyClass.frames_tx_) return false;

      if(this.frames_rx_ != otherMyClass.frames_rx_) return false;


      return true;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("CanInterfaceStatus {");
      builder.append("timestamp=");
      builder.append(this.timestamp_);      builder.append(", ");
      builder.append("io_errors=");
      builder.append(this.io_errors_);      builder.append(", ");
      builder.append("frames_tx=");
      builder.append(this.frames_tx_);      builder.append(", ");
      builder.append("frames_rx=");
      builder.append(this.frames_rx_);
      builder.append("}");
      return builder.toString();
   }
}
