package px4_msgs.msg.dds;

import us.ihmc.communication.packets.Packet;
import us.ihmc.euclid.interfaces.Settable;
import us.ihmc.euclid.interfaces.EpsilonComparable;
import java.util.function.Supplier;
import us.ihmc.pubsub.TopicDataType;

public class CellularStatus extends Packet<CellularStatus> implements Settable<CellularStatus>, EpsilonComparable<CellularStatus>
{
   /**
          * State unknown or not reportable
          */
   public static final byte CELLULAR_STATUS_FLAG_UNKNOWN = (byte) 0;
   /**
          * velocity setpoint
          */
   public static final byte CELLULAR_STATUS_FLAG_FAILED = (byte) 1;
   /**
          * Modem is being initialized
          */
   public static final byte CELLULAR_STATUS_FLAG_INITIALIZING = (byte) 2;
   /**
          * Modem is locked
          */
   public static final byte CELLULAR_STATUS_FLAG_LOCKED = (byte) 3;
   /**
          * Modem is not enabled and is powered down
          */
   public static final byte CELLULAR_STATUS_FLAG_DISABLED = (byte) 4;
   /**
          * Modem is currently transitioning to the CELLULAR_STATUS_FLAG_DISABLED state
          */
   public static final byte CELLULAR_STATUS_FLAG_DISABLING = (byte) 5;
   /**
          * Modem is currently transitioning to the CELLULAR_STATUS_FLAG_ENABLED state
          */
   public static final byte CELLULAR_STATUS_FLAG_ENABLING = (byte) 6;
   /**
          * Modem is enabled and powered on but not registered with a network provider and not available for data connections
          */
   public static final byte CELLULAR_STATUS_FLAG_ENABLED = (byte) 7;
   /**
          * Modem is searching for a network provider to register
          */
   public static final byte CELLULAR_STATUS_FLAG_SEARCHING = (byte) 8;
   /**
          * Modem is registered with a network provider, and data connections and messaging may be available for use
          */
   public static final byte CELLULAR_STATUS_FLAG_REGISTERED = (byte) 9;
   /**
          * Modem is disconnecting and deactivating the last active packet data bearer. This state will not be entered if more than one packet data bearer is active and one of the active bearers is deactivated
          */
   public static final byte CELLULAR_STATUS_FLAG_DISCONNECTING = (byte) 10;
   /**
          * Modem is activating and connecting the first packet data bearer. Subsequent bearer activations when another bearer is already active do not cause this state to be entered
          */
   public static final byte CELLULAR_STATUS_FLAG_CONNECTING = (byte) 11;
   /**
          * One or more packet data bearers is active and connected
          */
   public static final byte CELLULAR_STATUS_FLAG_CONNECTED = (byte) 12;
   /**
          * No error
          */
   public static final byte CELLULAR_NETWORK_FAILED_REASON_NONE = (byte) 0;
   /**
          * Error state is unknown
          */
   public static final byte CELLULAR_NETWORK_FAILED_REASON_UNKNOWN = (byte) 1;
   /**
          * SIM is required for the modem but missing
          */
   public static final byte CELLULAR_NETWORK_FAILED_REASON_SIM_MISSING = (byte) 2;
   /**
          * SIM is available, but not usable for connection
          */
   public static final byte CELLULAR_NETWORK_FAILED_REASON_SIM_ERROR = (byte) 3;
   /**
            * time since system start (microseconds)
            */
   public long timestamp_;
   /**
            * Status bitmap 1: Roaming is active
            */
   public int status_;
   /**
            * Failure reason when status in in CELLUAR_STATUS_FAILED
            */
   public byte failure_reason_;
   /**
            * Cellular network radio type 0: none 1: gsm 2: cdma 3: wcdma 4: lte
            */
   public byte type_;
   /**
            * Cellular network RSSI/RSRP in dBm, absolute value
            */
   public byte quality_;
   /**
            * Mobile country code. If unknown, set to: UINT16_MAX
            */
   public int mcc_;
   /**
            * Mobile network code. If unknown, set to: UINT16_MAX
            */
   public int mnc_;
   /**
            * Location area code. If unknown, set to: 0
            */
   public int lac_;

   public CellularStatus()
   {
   }

   public CellularStatus(CellularStatus other)
   {
      this();
      set(other);
   }

   public void set(CellularStatus other)
   {
      timestamp_ = other.timestamp_;

      status_ = other.status_;

      failure_reason_ = other.failure_reason_;

      type_ = other.type_;

      quality_ = other.quality_;

      mcc_ = other.mcc_;

      mnc_ = other.mnc_;

      lac_ = other.lac_;

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
            * Status bitmap 1: Roaming is active
            */
   public void setStatus(int status)
   {
      status_ = status;
   }
   /**
            * Status bitmap 1: Roaming is active
            */
   public int getStatus()
   {
      return status_;
   }

   /**
            * Failure reason when status in in CELLUAR_STATUS_FAILED
            */
   public void setFailureReason(byte failure_reason)
   {
      failure_reason_ = failure_reason;
   }
   /**
            * Failure reason when status in in CELLUAR_STATUS_FAILED
            */
   public byte getFailureReason()
   {
      return failure_reason_;
   }

   /**
            * Cellular network radio type 0: none 1: gsm 2: cdma 3: wcdma 4: lte
            */
   public void setType(byte type)
   {
      type_ = type;
   }
   /**
            * Cellular network radio type 0: none 1: gsm 2: cdma 3: wcdma 4: lte
            */
   public byte getType()
   {
      return type_;
   }

   /**
            * Cellular network RSSI/RSRP in dBm, absolute value
            */
   public void setQuality(byte quality)
   {
      quality_ = quality;
   }
   /**
            * Cellular network RSSI/RSRP in dBm, absolute value
            */
   public byte getQuality()
   {
      return quality_;
   }

   /**
            * Mobile country code. If unknown, set to: UINT16_MAX
            */
   public void setMcc(int mcc)
   {
      mcc_ = mcc;
   }
   /**
            * Mobile country code. If unknown, set to: UINT16_MAX
            */
   public int getMcc()
   {
      return mcc_;
   }

   /**
            * Mobile network code. If unknown, set to: UINT16_MAX
            */
   public void setMnc(int mnc)
   {
      mnc_ = mnc;
   }
   /**
            * Mobile network code. If unknown, set to: UINT16_MAX
            */
   public int getMnc()
   {
      return mnc_;
   }

   /**
            * Location area code. If unknown, set to: 0
            */
   public void setLac(int lac)
   {
      lac_ = lac;
   }
   /**
            * Location area code. If unknown, set to: 0
            */
   public int getLac()
   {
      return lac_;
   }


   public static Supplier<CellularStatusPubSubType> getPubSubType()
   {
      return CellularStatusPubSubType::new;
   }

   @Override
   public Supplier<TopicDataType> getPubSubTypePacket()
   {
      return CellularStatusPubSubType::new;
   }

   @Override
   public boolean epsilonEquals(CellularStatus other, double epsilon)
   {
      if(other == null) return false;
      if(other == this) return true;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_, other.timestamp_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.status_, other.status_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.failure_reason_, other.failure_reason_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.type_, other.type_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.quality_, other.quality_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.mcc_, other.mcc_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.mnc_, other.mnc_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.lac_, other.lac_, epsilon)) return false;


      return true;
   }

   @Override
   public boolean equals(Object other)
   {
      if(other == null) return false;
      if(other == this) return true;
      if(!(other instanceof CellularStatus)) return false;

      CellularStatus otherMyClass = (CellularStatus) other;

      if(this.timestamp_ != otherMyClass.timestamp_) return false;

      if(this.status_ != otherMyClass.status_) return false;

      if(this.failure_reason_ != otherMyClass.failure_reason_) return false;

      if(this.type_ != otherMyClass.type_) return false;

      if(this.quality_ != otherMyClass.quality_) return false;

      if(this.mcc_ != otherMyClass.mcc_) return false;

      if(this.mnc_ != otherMyClass.mnc_) return false;

      if(this.lac_ != otherMyClass.lac_) return false;


      return true;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("CellularStatus {");
      builder.append("timestamp=");
      builder.append(this.timestamp_);      builder.append(", ");
      builder.append("status=");
      builder.append(this.status_);      builder.append(", ");
      builder.append("failure_reason=");
      builder.append(this.failure_reason_);      builder.append(", ");
      builder.append("type=");
      builder.append(this.type_);      builder.append(", ");
      builder.append("quality=");
      builder.append(this.quality_);      builder.append(", ");
      builder.append("mcc=");
      builder.append(this.mcc_);      builder.append(", ");
      builder.append("mnc=");
      builder.append(this.mnc_);      builder.append(", ");
      builder.append("lac=");
      builder.append(this.lac_);
      builder.append("}");
      return builder.toString();
   }
}
