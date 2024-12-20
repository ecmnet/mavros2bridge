package px4_msgs.msg.dds;

import us.ihmc.communication.packets.Packet;
import us.ihmc.euclid.interfaces.Settable;
import us.ihmc.euclid.interfaces.EpsilonComparable;
import java.util.function.Supplier;
import us.ihmc.pubsub.TopicDataType;

public class RadioStatus extends Packet<RadioStatus> implements Settable<RadioStatus>, EpsilonComparable<RadioStatus>
{
   /**
            * time since system start (microseconds)
            */
   public long timestamp_;
   /**
            * local signal strength
            */
   public byte rssi_;
   /**
            * remote signal strength
            */
   public byte remote_rssi_;
   /**
            * how full the tx buffer is as a percentage
            */
   public byte txbuf_;
   /**
            * background noise level
            */
   public byte noise_;
   /**
            * remote background noise level
            */
   public byte remote_noise_;
   /**
            * receive errors
            */
   public int rxerrors_;
   /**
            * count of error corrected packets
            */
   public int fix_;

   public RadioStatus()
   {
   }

   public RadioStatus(RadioStatus other)
   {
      this();
      set(other);
   }

   public void set(RadioStatus other)
   {
      timestamp_ = other.timestamp_;

      rssi_ = other.rssi_;

      remote_rssi_ = other.remote_rssi_;

      txbuf_ = other.txbuf_;

      noise_ = other.noise_;

      remote_noise_ = other.remote_noise_;

      rxerrors_ = other.rxerrors_;

      fix_ = other.fix_;

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
            * local signal strength
            */
   public void setRssi(byte rssi)
   {
      rssi_ = rssi;
   }
   /**
            * local signal strength
            */
   public byte getRssi()
   {
      return rssi_;
   }

   /**
            * remote signal strength
            */
   public void setRemoteRssi(byte remote_rssi)
   {
      remote_rssi_ = remote_rssi;
   }
   /**
            * remote signal strength
            */
   public byte getRemoteRssi()
   {
      return remote_rssi_;
   }

   /**
            * how full the tx buffer is as a percentage
            */
   public void setTxbuf(byte txbuf)
   {
      txbuf_ = txbuf;
   }
   /**
            * how full the tx buffer is as a percentage
            */
   public byte getTxbuf()
   {
      return txbuf_;
   }

   /**
            * background noise level
            */
   public void setNoise(byte noise)
   {
      noise_ = noise;
   }
   /**
            * background noise level
            */
   public byte getNoise()
   {
      return noise_;
   }

   /**
            * remote background noise level
            */
   public void setRemoteNoise(byte remote_noise)
   {
      remote_noise_ = remote_noise;
   }
   /**
            * remote background noise level
            */
   public byte getRemoteNoise()
   {
      return remote_noise_;
   }

   /**
            * receive errors
            */
   public void setRxerrors(int rxerrors)
   {
      rxerrors_ = rxerrors;
   }
   /**
            * receive errors
            */
   public int getRxerrors()
   {
      return rxerrors_;
   }

   /**
            * count of error corrected packets
            */
   public void setFix(int fix)
   {
      fix_ = fix;
   }
   /**
            * count of error corrected packets
            */
   public int getFix()
   {
      return fix_;
   }


   public static Supplier<RadioStatusPubSubType> getPubSubType()
   {
      return RadioStatusPubSubType::new;
   }

   @Override
   public Supplier<TopicDataType> getPubSubTypePacket()
   {
      return RadioStatusPubSubType::new;
   }

   @Override
   public boolean epsilonEquals(RadioStatus other, double epsilon)
   {
      if(other == null) return false;
      if(other == this) return true;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_, other.timestamp_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.rssi_, other.rssi_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.remote_rssi_, other.remote_rssi_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.txbuf_, other.txbuf_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.noise_, other.noise_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.remote_noise_, other.remote_noise_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.rxerrors_, other.rxerrors_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.fix_, other.fix_, epsilon)) return false;


      return true;
   }

   @Override
   public boolean equals(Object other)
   {
      if(other == null) return false;
      if(other == this) return true;
      if(!(other instanceof RadioStatus)) return false;

      RadioStatus otherMyClass = (RadioStatus) other;

      if(this.timestamp_ != otherMyClass.timestamp_) return false;

      if(this.rssi_ != otherMyClass.rssi_) return false;

      if(this.remote_rssi_ != otherMyClass.remote_rssi_) return false;

      if(this.txbuf_ != otherMyClass.txbuf_) return false;

      if(this.noise_ != otherMyClass.noise_) return false;

      if(this.remote_noise_ != otherMyClass.remote_noise_) return false;

      if(this.rxerrors_ != otherMyClass.rxerrors_) return false;

      if(this.fix_ != otherMyClass.fix_) return false;


      return true;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("RadioStatus {");
      builder.append("timestamp=");
      builder.append(this.timestamp_);      builder.append(", ");
      builder.append("rssi=");
      builder.append(this.rssi_);      builder.append(", ");
      builder.append("remote_rssi=");
      builder.append(this.remote_rssi_);      builder.append(", ");
      builder.append("txbuf=");
      builder.append(this.txbuf_);      builder.append(", ");
      builder.append("noise=");
      builder.append(this.noise_);      builder.append(", ");
      builder.append("remote_noise=");
      builder.append(this.remote_noise_);      builder.append(", ");
      builder.append("rxerrors=");
      builder.append(this.rxerrors_);      builder.append(", ");
      builder.append("fix=");
      builder.append(this.fix_);
      builder.append("}");
      return builder.toString();
   }
}
