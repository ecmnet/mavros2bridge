package px4_msgs.msg.dds;

import us.ihmc.communication.packets.Packet;
import us.ihmc.euclid.interfaces.Settable;
import us.ihmc.euclid.interfaces.EpsilonComparable;
import java.util.function.Supplier;
import us.ihmc.pubsub.TopicDataType;

public class InputRc extends Packet<InputRc> implements Settable<InputRc>, EpsilonComparable<InputRc>
{
   public static final byte RC_INPUT_SOURCE_UNKNOWN = (byte) 0;
   public static final byte RC_INPUT_SOURCE_PX4FMU_PPM = (byte) 1;
   public static final byte RC_INPUT_SOURCE_PX4IO_PPM = (byte) 2;
   public static final byte RC_INPUT_SOURCE_PX4IO_SPEKTRUM = (byte) 3;
   public static final byte RC_INPUT_SOURCE_PX4IO_SBUS = (byte) 4;
   public static final byte RC_INPUT_SOURCE_PX4IO_ST24 = (byte) 5;
   public static final byte RC_INPUT_SOURCE_MAVLINK = (byte) 6;
   public static final byte RC_INPUT_SOURCE_QURT = (byte) 7;
   public static final byte RC_INPUT_SOURCE_PX4FMU_SPEKTRUM = (byte) 8;
   public static final byte RC_INPUT_SOURCE_PX4FMU_SBUS = (byte) 9;
   public static final byte RC_INPUT_SOURCE_PX4FMU_ST24 = (byte) 10;
   public static final byte RC_INPUT_SOURCE_PX4FMU_SUMD = (byte) 11;
   public static final byte RC_INPUT_SOURCE_PX4FMU_DSM = (byte) 12;
   public static final byte RC_INPUT_SOURCE_PX4IO_SUMD = (byte) 13;
   public static final byte RC_INPUT_SOURCE_PX4FMU_CRSF = (byte) 14;
   public static final byte RC_INPUT_SOURCE_PX4FMU_GHST = (byte) 15;
   /**
          * Maximum number of R/C input channels in the system. S.Bus has up to 18 channels.
          */
   public static final byte RC_INPUT_MAX_CHANNELS = (byte) 18;
   public static final byte RSSI_MAX = (byte) 100;
   /**
            * time since system start (microseconds)
            */
   public long timestamp_;
   /**
            * last valid reception time
            */
   public long timestamp_last_signal_;
   /**
            * number of channels actually being seen
            */
   public byte channel_count_;
   /**
            * receive signal strength indicator (RSSI): < 0: Undefined, 0: no signal, 100: full reception
            */
   public int rssi_;
   /**
            * explicit failsafe flag: true on TX failure or TX out of range , false otherwise. Only the true state is reliable, as there are some (PPM) receivers on the market going into failsafe without telling us explicitly.
            */
   public boolean rc_failsafe_;
   /**
            * RC receiver connection status: True,if no frame has arrived in the expected time, false otherwise. True usually means that the receiver has been disconnected, but can also indicate a radio link loss on "stupid" systems. Will remain false, if a RX with failsafe option continues to transmit frames after a link loss.
            */
   public boolean rc_lost_;
   /**
            * Number of lost RC frames. Note: intended purpose: observe the radio link quality if RSSI is not available. This value must not be used to trigger any failsafe-alike functionality.
            */
   public int rc_lost_frame_count_;
   /**
            * Number of total RC frames. Note: intended purpose: observe the radio link quality if RSSI is not available. This value must not be used to trigger any failsafe-alike functionality.
            */
   public int rc_total_frame_count_;
   /**
            * Length of a single PPM frame. Zero for non-PPM systems
            */
   public int rc_ppm_frame_length_;
   /**
            * Input source
            */
   public byte input_source_;
   /**
            * link quality. Percentage 0-100%. -1 = invalid
            */
   public byte link_quality_;
   /**
            * Actual rssi in units of dBm. NaN = invalid
            */
   public float rssi_dbm_;

   public InputRc()
   {
   }

   public InputRc(InputRc other)
   {
      this();
      set(other);
   }

   public void set(InputRc other)
   {
      timestamp_ = other.timestamp_;

      timestamp_last_signal_ = other.timestamp_last_signal_;

      channel_count_ = other.channel_count_;

      rssi_ = other.rssi_;

      rc_failsafe_ = other.rc_failsafe_;

      rc_lost_ = other.rc_lost_;

      rc_lost_frame_count_ = other.rc_lost_frame_count_;

      rc_total_frame_count_ = other.rc_total_frame_count_;

      rc_ppm_frame_length_ = other.rc_ppm_frame_length_;

      input_source_ = other.input_source_;

      link_quality_ = other.link_quality_;

      rssi_dbm_ = other.rssi_dbm_;

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
            * last valid reception time
            */
   public void setTimestampLastSignal(long timestamp_last_signal)
   {
      timestamp_last_signal_ = timestamp_last_signal;
   }
   /**
            * last valid reception time
            */
   public long getTimestampLastSignal()
   {
      return timestamp_last_signal_;
   }

   /**
            * number of channels actually being seen
            */
   public void setChannelCount(byte channel_count)
   {
      channel_count_ = channel_count;
   }
   /**
            * number of channels actually being seen
            */
   public byte getChannelCount()
   {
      return channel_count_;
   }

   /**
            * receive signal strength indicator (RSSI): < 0: Undefined, 0: no signal, 100: full reception
            */
   public void setRssi(int rssi)
   {
      rssi_ = rssi;
   }
   /**
            * receive signal strength indicator (RSSI): < 0: Undefined, 0: no signal, 100: full reception
            */
   public int getRssi()
   {
      return rssi_;
   }

   /**
            * explicit failsafe flag: true on TX failure or TX out of range , false otherwise. Only the true state is reliable, as there are some (PPM) receivers on the market going into failsafe without telling us explicitly.
            */
   public void setRcFailsafe(boolean rc_failsafe)
   {
      rc_failsafe_ = rc_failsafe;
   }
   /**
            * explicit failsafe flag: true on TX failure or TX out of range , false otherwise. Only the true state is reliable, as there are some (PPM) receivers on the market going into failsafe without telling us explicitly.
            */
   public boolean getRcFailsafe()
   {
      return rc_failsafe_;
   }

   /**
            * RC receiver connection status: True,if no frame has arrived in the expected time, false otherwise. True usually means that the receiver has been disconnected, but can also indicate a radio link loss on "stupid" systems. Will remain false, if a RX with failsafe option continues to transmit frames after a link loss.
            */
   public void setRcLost(boolean rc_lost)
   {
      rc_lost_ = rc_lost;
   }
   /**
            * RC receiver connection status: True,if no frame has arrived in the expected time, false otherwise. True usually means that the receiver has been disconnected, but can also indicate a radio link loss on "stupid" systems. Will remain false, if a RX with failsafe option continues to transmit frames after a link loss.
            */
   public boolean getRcLost()
   {
      return rc_lost_;
   }

   /**
            * Number of lost RC frames. Note: intended purpose: observe the radio link quality if RSSI is not available. This value must not be used to trigger any failsafe-alike functionality.
            */
   public void setRcLostFrameCount(int rc_lost_frame_count)
   {
      rc_lost_frame_count_ = rc_lost_frame_count;
   }
   /**
            * Number of lost RC frames. Note: intended purpose: observe the radio link quality if RSSI is not available. This value must not be used to trigger any failsafe-alike functionality.
            */
   public int getRcLostFrameCount()
   {
      return rc_lost_frame_count_;
   }

   /**
            * Number of total RC frames. Note: intended purpose: observe the radio link quality if RSSI is not available. This value must not be used to trigger any failsafe-alike functionality.
            */
   public void setRcTotalFrameCount(int rc_total_frame_count)
   {
      rc_total_frame_count_ = rc_total_frame_count;
   }
   /**
            * Number of total RC frames. Note: intended purpose: observe the radio link quality if RSSI is not available. This value must not be used to trigger any failsafe-alike functionality.
            */
   public int getRcTotalFrameCount()
   {
      return rc_total_frame_count_;
   }

   /**
            * Length of a single PPM frame. Zero for non-PPM systems
            */
   public void setRcPpmFrameLength(int rc_ppm_frame_length)
   {
      rc_ppm_frame_length_ = rc_ppm_frame_length;
   }
   /**
            * Length of a single PPM frame. Zero for non-PPM systems
            */
   public int getRcPpmFrameLength()
   {
      return rc_ppm_frame_length_;
   }

   /**
            * Input source
            */
   public void setInputSource(byte input_source)
   {
      input_source_ = input_source;
   }
   /**
            * Input source
            */
   public byte getInputSource()
   {
      return input_source_;
   }

   /**
            * link quality. Percentage 0-100%. -1 = invalid
            */
   public void setLinkQuality(byte link_quality)
   {
      link_quality_ = link_quality;
   }
   /**
            * link quality. Percentage 0-100%. -1 = invalid
            */
   public byte getLinkQuality()
   {
      return link_quality_;
   }

   /**
            * Actual rssi in units of dBm. NaN = invalid
            */
   public void setRssiDbm(float rssi_dbm)
   {
      rssi_dbm_ = rssi_dbm;
   }
   /**
            * Actual rssi in units of dBm. NaN = invalid
            */
   public float getRssiDbm()
   {
      return rssi_dbm_;
   }


   public static Supplier<InputRcPubSubType> getPubSubType()
   {
      return InputRcPubSubType::new;
   }

   @Override
   public Supplier<TopicDataType> getPubSubTypePacket()
   {
      return InputRcPubSubType::new;
   }

   @Override
   public boolean epsilonEquals(InputRc other, double epsilon)
   {
      if(other == null) return false;
      if(other == this) return true;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_, other.timestamp_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_last_signal_, other.timestamp_last_signal_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.channel_count_, other.channel_count_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.rssi_, other.rssi_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.rc_failsafe_, other.rc_failsafe_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.rc_lost_, other.rc_lost_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.rc_lost_frame_count_, other.rc_lost_frame_count_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.rc_total_frame_count_, other.rc_total_frame_count_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.rc_ppm_frame_length_, other.rc_ppm_frame_length_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.input_source_, other.input_source_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.link_quality_, other.link_quality_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.rssi_dbm_, other.rssi_dbm_, epsilon)) return false;


      return true;
   }

   @Override
   public boolean equals(Object other)
   {
      if(other == null) return false;
      if(other == this) return true;
      if(!(other instanceof InputRc)) return false;

      InputRc otherMyClass = (InputRc) other;

      if(this.timestamp_ != otherMyClass.timestamp_) return false;

      if(this.timestamp_last_signal_ != otherMyClass.timestamp_last_signal_) return false;

      if(this.channel_count_ != otherMyClass.channel_count_) return false;

      if(this.rssi_ != otherMyClass.rssi_) return false;

      if(this.rc_failsafe_ != otherMyClass.rc_failsafe_) return false;

      if(this.rc_lost_ != otherMyClass.rc_lost_) return false;

      if(this.rc_lost_frame_count_ != otherMyClass.rc_lost_frame_count_) return false;

      if(this.rc_total_frame_count_ != otherMyClass.rc_total_frame_count_) return false;

      if(this.rc_ppm_frame_length_ != otherMyClass.rc_ppm_frame_length_) return false;

      if(this.input_source_ != otherMyClass.input_source_) return false;

      if(this.link_quality_ != otherMyClass.link_quality_) return false;

      if(this.rssi_dbm_ != otherMyClass.rssi_dbm_) return false;


      return true;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("InputRc {");
      builder.append("timestamp=");
      builder.append(this.timestamp_);      builder.append(", ");
      builder.append("timestamp_last_signal=");
      builder.append(this.timestamp_last_signal_);      builder.append(", ");
      builder.append("channel_count=");
      builder.append(this.channel_count_);      builder.append(", ");
      builder.append("rssi=");
      builder.append(this.rssi_);      builder.append(", ");
      builder.append("rc_failsafe=");
      builder.append(this.rc_failsafe_);      builder.append(", ");
      builder.append("rc_lost=");
      builder.append(this.rc_lost_);      builder.append(", ");
      builder.append("rc_lost_frame_count=");
      builder.append(this.rc_lost_frame_count_);      builder.append(", ");
      builder.append("rc_total_frame_count=");
      builder.append(this.rc_total_frame_count_);      builder.append(", ");
      builder.append("rc_ppm_frame_length=");
      builder.append(this.rc_ppm_frame_length_);      builder.append(", ");
      builder.append("input_source=");
      builder.append(this.input_source_);      builder.append(", ");
      builder.append("link_quality=");
      builder.append(this.link_quality_);      builder.append(", ");
      builder.append("rssi_dbm=");
      builder.append(this.rssi_dbm_);
      builder.append("}");
      return builder.toString();
   }
}
