package px4_msgs.msg.dds;

import us.ihmc.communication.packets.Packet;
import us.ihmc.euclid.interfaces.Settable;
import us.ihmc.euclid.interfaces.EpsilonComparable;
import java.util.function.Supplier;
import us.ihmc.pubsub.TopicDataType;

public class RcChannels extends Packet<RcChannels> implements Settable<RcChannels>, EpsilonComparable<RcChannels>
{
   public static final byte FUNCTION_THROTTLE = (byte) 0;
   public static final byte FUNCTION_ROLL = (byte) 1;
   public static final byte FUNCTION_PITCH = (byte) 2;
   public static final byte FUNCTION_YAW = (byte) 3;
   public static final byte FUNCTION_RETURN = (byte) 4;
   public static final byte FUNCTION_LOITER = (byte) 5;
   public static final byte FUNCTION_OFFBOARD = (byte) 6;
   public static final byte FUNCTION_FLAPS = (byte) 7;
   public static final byte FUNCTION_AUX_1 = (byte) 8;
   public static final byte FUNCTION_AUX_2 = (byte) 9;
   public static final byte FUNCTION_AUX_3 = (byte) 10;
   public static final byte FUNCTION_AUX_4 = (byte) 11;
   public static final byte FUNCTION_AUX_5 = (byte) 12;
   public static final byte FUNCTION_AUX_6 = (byte) 13;
   public static final byte FUNCTION_PARAM_1 = (byte) 14;
   public static final byte FUNCTION_PARAM_2 = (byte) 15;
   public static final byte FUNCTION_PARAM_3_5 = (byte) 16;
   public static final byte FUNCTION_KILLSWITCH = (byte) 17;
   public static final byte FUNCTION_TRANSITION = (byte) 18;
   public static final byte FUNCTION_GEAR = (byte) 19;
   public static final byte FUNCTION_ARMSWITCH = (byte) 20;
   public static final byte FUNCTION_FLTBTN_SLOT_1 = (byte) 21;
   public static final byte FUNCTION_FLTBTN_SLOT_2 = (byte) 22;
   public static final byte FUNCTION_FLTBTN_SLOT_3 = (byte) 23;
   public static final byte FUNCTION_FLTBTN_SLOT_4 = (byte) 24;
   public static final byte FUNCTION_FLTBTN_SLOT_5 = (byte) 25;
   public static final byte FUNCTION_FLTBTN_SLOT_6 = (byte) 26;
   public static final byte FUNCTION_ENGAGE_MAIN_MOTOR = (byte) 27;
   public static final byte FUNCTION_PAYLOAD_POWER = (byte) 28;
   public static final byte FUNCTION_FLTBTN_SLOT_COUNT = (byte) 6;
   /**
            * time since system start (microseconds)
            */
   public long timestamp_;
   /**
            * Timestamp of last valid RC signal
            */
   public long timestamp_last_valid_;
   /**
            * Scaled to -1..1 (throttle: 0..1)
            */
   public float[] channels_;
   /**
            * Number of valid channels
            */
   public byte channel_count_;
   /**
            * Functions mapping
            */
   public byte[] function_;
   /**
            * Receive signal strength index
            */
   public byte rssi_;
   /**
            * Control signal lost, should be checked together with topic timeout
            */
   public boolean signal_lost_;
   /**
            * Number of dropped frames
            */
   public long frame_drop_count_;

   public RcChannels()
   {
      channels_ = new float[18];

      function_ = new byte[29];

   }

   public RcChannels(RcChannels other)
   {
      this();
      set(other);
   }

   public void set(RcChannels other)
   {
      timestamp_ = other.timestamp_;

      timestamp_last_valid_ = other.timestamp_last_valid_;

      for(int i1 = 0; i1 < channels_.length; ++i1)
      {
            channels_[i1] = other.channels_[i1];

      }

      channel_count_ = other.channel_count_;

      for(int i3 = 0; i3 < function_.length; ++i3)
      {
            function_[i3] = other.function_[i3];

      }

      rssi_ = other.rssi_;

      signal_lost_ = other.signal_lost_;

      frame_drop_count_ = other.frame_drop_count_;

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
            * Timestamp of last valid RC signal
            */
   public void setTimestampLastValid(long timestamp_last_valid)
   {
      timestamp_last_valid_ = timestamp_last_valid;
   }
   /**
            * Timestamp of last valid RC signal
            */
   public long getTimestampLastValid()
   {
      return timestamp_last_valid_;
   }


   /**
            * Scaled to -1..1 (throttle: 0..1)
            */
   public float[] getChannels()
   {
      return channels_;
   }

   /**
            * Number of valid channels
            */
   public void setChannelCount(byte channel_count)
   {
      channel_count_ = channel_count;
   }
   /**
            * Number of valid channels
            */
   public byte getChannelCount()
   {
      return channel_count_;
   }


   /**
            * Functions mapping
            */
   public byte[] getFunction()
   {
      return function_;
   }

   /**
            * Receive signal strength index
            */
   public void setRssi(byte rssi)
   {
      rssi_ = rssi;
   }
   /**
            * Receive signal strength index
            */
   public byte getRssi()
   {
      return rssi_;
   }

   /**
            * Control signal lost, should be checked together with topic timeout
            */
   public void setSignalLost(boolean signal_lost)
   {
      signal_lost_ = signal_lost;
   }
   /**
            * Control signal lost, should be checked together with topic timeout
            */
   public boolean getSignalLost()
   {
      return signal_lost_;
   }

   /**
            * Number of dropped frames
            */
   public void setFrameDropCount(long frame_drop_count)
   {
      frame_drop_count_ = frame_drop_count;
   }
   /**
            * Number of dropped frames
            */
   public long getFrameDropCount()
   {
      return frame_drop_count_;
   }


   public static Supplier<RcChannelsPubSubType> getPubSubType()
   {
      return RcChannelsPubSubType::new;
   }

   @Override
   public Supplier<TopicDataType> getPubSubTypePacket()
   {
      return RcChannelsPubSubType::new;
   }

   @Override
   public boolean epsilonEquals(RcChannels other, double epsilon)
   {
      if(other == null) return false;
      if(other == this) return true;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_, other.timestamp_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_last_valid_, other.timestamp_last_valid_, epsilon)) return false;

      for(int i5 = 0; i5 < channels_.length; ++i5)
      {
                if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.channels_[i5], other.channels_[i5], epsilon)) return false;
      }

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.channel_count_, other.channel_count_, epsilon)) return false;

      for(int i7 = 0; i7 < function_.length; ++i7)
      {
                if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.function_[i7], other.function_[i7], epsilon)) return false;
      }

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.rssi_, other.rssi_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.signal_lost_, other.signal_lost_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.frame_drop_count_, other.frame_drop_count_, epsilon)) return false;


      return true;
   }

   @Override
   public boolean equals(Object other)
   {
      if(other == null) return false;
      if(other == this) return true;
      if(!(other instanceof RcChannels)) return false;

      RcChannels otherMyClass = (RcChannels) other;

      if(this.timestamp_ != otherMyClass.timestamp_) return false;

      if(this.timestamp_last_valid_ != otherMyClass.timestamp_last_valid_) return false;

      for(int i9 = 0; i9 < channels_.length; ++i9)
      {
                if(this.channels_[i9] != otherMyClass.channels_[i9]) return false;

      }
      if(this.channel_count_ != otherMyClass.channel_count_) return false;

      for(int i11 = 0; i11 < function_.length; ++i11)
      {
                if(this.function_[i11] != otherMyClass.function_[i11]) return false;

      }
      if(this.rssi_ != otherMyClass.rssi_) return false;

      if(this.signal_lost_ != otherMyClass.signal_lost_) return false;

      if(this.frame_drop_count_ != otherMyClass.frame_drop_count_) return false;


      return true;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("RcChannels {");
      builder.append("timestamp=");
      builder.append(this.timestamp_);      builder.append(", ");
      builder.append("timestamp_last_valid=");
      builder.append(this.timestamp_last_valid_);      builder.append(", ");
      builder.append("channels=");
      builder.append(java.util.Arrays.toString(this.channels_));      builder.append(", ");
      builder.append("channel_count=");
      builder.append(this.channel_count_);      builder.append(", ");
      builder.append("function=");
      builder.append(java.util.Arrays.toString(this.function_));      builder.append(", ");
      builder.append("rssi=");
      builder.append(this.rssi_);      builder.append(", ");
      builder.append("signal_lost=");
      builder.append(this.signal_lost_);      builder.append(", ");
      builder.append("frame_drop_count=");
      builder.append(this.frame_drop_count_);
      builder.append("}");
      return builder.toString();
   }
}
