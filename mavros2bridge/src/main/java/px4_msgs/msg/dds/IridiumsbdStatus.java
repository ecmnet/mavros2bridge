package px4_msgs.msg.dds;

import us.ihmc.communication.packets.Packet;
import us.ihmc.euclid.interfaces.Settable;
import us.ihmc.euclid.interfaces.EpsilonComparable;
import java.util.function.Supplier;
import us.ihmc.pubsub.TopicDataType;

public class IridiumsbdStatus extends Packet<IridiumsbdStatus> implements Settable<IridiumsbdStatus>, EpsilonComparable<IridiumsbdStatus>
{
   /**
            * time since system start (microseconds)
            */
   public long timestamp_;
   /**
            * timestamp of the last "OK" received after the "AT" command
            */
   public long last_at_ok_timestamp_;
   /**
            * current size of the tx buffer
            */
   public int tx_buf_write_index_;
   /**
            * the rx buffer is parsed up to that index
            */
   public int rx_buf_read_index_;
   /**
            * current size of the rx buffer
            */
   public int rx_buf_end_index_;
   /**
            * number of failed sbd sessions
            */
   public int failed_sbd_sessions_;
   /**
            * number of successful sbd sessions
            */
   public int successful_sbd_sessions_;
   /**
            * number of times the tx buffer was reset
            */
   public int num_tx_buf_reset_;
   /**
            * current signal quality, 0 is no signal, 5 the best
            */
   public byte signal_quality_;
   /**
            * current state of the driver, see the satcom_state of IridiumSBD.h for the definition
            */
   public byte state_;
   /**
            * indicates if a ring call is pending
            */
   public boolean ring_pending_;
   /**
            * indicates if a tx buffer write is pending
            */
   public boolean tx_buf_write_pending_;
   /**
            * indicates if a tx session is pending
            */
   public boolean tx_session_pending_;
   /**
            * indicates if a rx read is pending
            */
   public boolean rx_read_pending_;
   /**
            * indicates if a rx session is pending
            */
   public boolean rx_session_pending_;

   public IridiumsbdStatus()
   {
   }

   public IridiumsbdStatus(IridiumsbdStatus other)
   {
      this();
      set(other);
   }

   public void set(IridiumsbdStatus other)
   {
      timestamp_ = other.timestamp_;

      last_at_ok_timestamp_ = other.last_at_ok_timestamp_;

      tx_buf_write_index_ = other.tx_buf_write_index_;

      rx_buf_read_index_ = other.rx_buf_read_index_;

      rx_buf_end_index_ = other.rx_buf_end_index_;

      failed_sbd_sessions_ = other.failed_sbd_sessions_;

      successful_sbd_sessions_ = other.successful_sbd_sessions_;

      num_tx_buf_reset_ = other.num_tx_buf_reset_;

      signal_quality_ = other.signal_quality_;

      state_ = other.state_;

      ring_pending_ = other.ring_pending_;

      tx_buf_write_pending_ = other.tx_buf_write_pending_;

      tx_session_pending_ = other.tx_session_pending_;

      rx_read_pending_ = other.rx_read_pending_;

      rx_session_pending_ = other.rx_session_pending_;

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
            * timestamp of the last "OK" received after the "AT" command
            */
   public void setLastAtOkTimestamp(long last_at_ok_timestamp)
   {
      last_at_ok_timestamp_ = last_at_ok_timestamp;
   }
   /**
            * timestamp of the last "OK" received after the "AT" command
            */
   public long getLastAtOkTimestamp()
   {
      return last_at_ok_timestamp_;
   }

   /**
            * current size of the tx buffer
            */
   public void setTxBufWriteIndex(int tx_buf_write_index)
   {
      tx_buf_write_index_ = tx_buf_write_index;
   }
   /**
            * current size of the tx buffer
            */
   public int getTxBufWriteIndex()
   {
      return tx_buf_write_index_;
   }

   /**
            * the rx buffer is parsed up to that index
            */
   public void setRxBufReadIndex(int rx_buf_read_index)
   {
      rx_buf_read_index_ = rx_buf_read_index;
   }
   /**
            * the rx buffer is parsed up to that index
            */
   public int getRxBufReadIndex()
   {
      return rx_buf_read_index_;
   }

   /**
            * current size of the rx buffer
            */
   public void setRxBufEndIndex(int rx_buf_end_index)
   {
      rx_buf_end_index_ = rx_buf_end_index;
   }
   /**
            * current size of the rx buffer
            */
   public int getRxBufEndIndex()
   {
      return rx_buf_end_index_;
   }

   /**
            * number of failed sbd sessions
            */
   public void setFailedSbdSessions(int failed_sbd_sessions)
   {
      failed_sbd_sessions_ = failed_sbd_sessions;
   }
   /**
            * number of failed sbd sessions
            */
   public int getFailedSbdSessions()
   {
      return failed_sbd_sessions_;
   }

   /**
            * number of successful sbd sessions
            */
   public void setSuccessfulSbdSessions(int successful_sbd_sessions)
   {
      successful_sbd_sessions_ = successful_sbd_sessions;
   }
   /**
            * number of successful sbd sessions
            */
   public int getSuccessfulSbdSessions()
   {
      return successful_sbd_sessions_;
   }

   /**
            * number of times the tx buffer was reset
            */
   public void setNumTxBufReset(int num_tx_buf_reset)
   {
      num_tx_buf_reset_ = num_tx_buf_reset;
   }
   /**
            * number of times the tx buffer was reset
            */
   public int getNumTxBufReset()
   {
      return num_tx_buf_reset_;
   }

   /**
            * current signal quality, 0 is no signal, 5 the best
            */
   public void setSignalQuality(byte signal_quality)
   {
      signal_quality_ = signal_quality;
   }
   /**
            * current signal quality, 0 is no signal, 5 the best
            */
   public byte getSignalQuality()
   {
      return signal_quality_;
   }

   /**
            * current state of the driver, see the satcom_state of IridiumSBD.h for the definition
            */
   public void setState(byte state)
   {
      state_ = state;
   }
   /**
            * current state of the driver, see the satcom_state of IridiumSBD.h for the definition
            */
   public byte getState()
   {
      return state_;
   }

   /**
            * indicates if a ring call is pending
            */
   public void setRingPending(boolean ring_pending)
   {
      ring_pending_ = ring_pending;
   }
   /**
            * indicates if a ring call is pending
            */
   public boolean getRingPending()
   {
      return ring_pending_;
   }

   /**
            * indicates if a tx buffer write is pending
            */
   public void setTxBufWritePending(boolean tx_buf_write_pending)
   {
      tx_buf_write_pending_ = tx_buf_write_pending;
   }
   /**
            * indicates if a tx buffer write is pending
            */
   public boolean getTxBufWritePending()
   {
      return tx_buf_write_pending_;
   }

   /**
            * indicates if a tx session is pending
            */
   public void setTxSessionPending(boolean tx_session_pending)
   {
      tx_session_pending_ = tx_session_pending;
   }
   /**
            * indicates if a tx session is pending
            */
   public boolean getTxSessionPending()
   {
      return tx_session_pending_;
   }

   /**
            * indicates if a rx read is pending
            */
   public void setRxReadPending(boolean rx_read_pending)
   {
      rx_read_pending_ = rx_read_pending;
   }
   /**
            * indicates if a rx read is pending
            */
   public boolean getRxReadPending()
   {
      return rx_read_pending_;
   }

   /**
            * indicates if a rx session is pending
            */
   public void setRxSessionPending(boolean rx_session_pending)
   {
      rx_session_pending_ = rx_session_pending;
   }
   /**
            * indicates if a rx session is pending
            */
   public boolean getRxSessionPending()
   {
      return rx_session_pending_;
   }


   public static Supplier<IridiumsbdStatusPubSubType> getPubSubType()
   {
      return IridiumsbdStatusPubSubType::new;
   }

   @Override
   public Supplier<TopicDataType> getPubSubTypePacket()
   {
      return IridiumsbdStatusPubSubType::new;
   }

   @Override
   public boolean epsilonEquals(IridiumsbdStatus other, double epsilon)
   {
      if(other == null) return false;
      if(other == this) return true;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_, other.timestamp_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.last_at_ok_timestamp_, other.last_at_ok_timestamp_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.tx_buf_write_index_, other.tx_buf_write_index_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.rx_buf_read_index_, other.rx_buf_read_index_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.rx_buf_end_index_, other.rx_buf_end_index_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.failed_sbd_sessions_, other.failed_sbd_sessions_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.successful_sbd_sessions_, other.successful_sbd_sessions_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.num_tx_buf_reset_, other.num_tx_buf_reset_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.signal_quality_, other.signal_quality_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.state_, other.state_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.ring_pending_, other.ring_pending_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.tx_buf_write_pending_, other.tx_buf_write_pending_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.tx_session_pending_, other.tx_session_pending_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.rx_read_pending_, other.rx_read_pending_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.rx_session_pending_, other.rx_session_pending_, epsilon)) return false;


      return true;
   }

   @Override
   public boolean equals(Object other)
   {
      if(other == null) return false;
      if(other == this) return true;
      if(!(other instanceof IridiumsbdStatus)) return false;

      IridiumsbdStatus otherMyClass = (IridiumsbdStatus) other;

      if(this.timestamp_ != otherMyClass.timestamp_) return false;

      if(this.last_at_ok_timestamp_ != otherMyClass.last_at_ok_timestamp_) return false;

      if(this.tx_buf_write_index_ != otherMyClass.tx_buf_write_index_) return false;

      if(this.rx_buf_read_index_ != otherMyClass.rx_buf_read_index_) return false;

      if(this.rx_buf_end_index_ != otherMyClass.rx_buf_end_index_) return false;

      if(this.failed_sbd_sessions_ != otherMyClass.failed_sbd_sessions_) return false;

      if(this.successful_sbd_sessions_ != otherMyClass.successful_sbd_sessions_) return false;

      if(this.num_tx_buf_reset_ != otherMyClass.num_tx_buf_reset_) return false;

      if(this.signal_quality_ != otherMyClass.signal_quality_) return false;

      if(this.state_ != otherMyClass.state_) return false;

      if(this.ring_pending_ != otherMyClass.ring_pending_) return false;

      if(this.tx_buf_write_pending_ != otherMyClass.tx_buf_write_pending_) return false;

      if(this.tx_session_pending_ != otherMyClass.tx_session_pending_) return false;

      if(this.rx_read_pending_ != otherMyClass.rx_read_pending_) return false;

      if(this.rx_session_pending_ != otherMyClass.rx_session_pending_) return false;


      return true;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("IridiumsbdStatus {");
      builder.append("timestamp=");
      builder.append(this.timestamp_);      builder.append(", ");
      builder.append("last_at_ok_timestamp=");
      builder.append(this.last_at_ok_timestamp_);      builder.append(", ");
      builder.append("tx_buf_write_index=");
      builder.append(this.tx_buf_write_index_);      builder.append(", ");
      builder.append("rx_buf_read_index=");
      builder.append(this.rx_buf_read_index_);      builder.append(", ");
      builder.append("rx_buf_end_index=");
      builder.append(this.rx_buf_end_index_);      builder.append(", ");
      builder.append("failed_sbd_sessions=");
      builder.append(this.failed_sbd_sessions_);      builder.append(", ");
      builder.append("successful_sbd_sessions=");
      builder.append(this.successful_sbd_sessions_);      builder.append(", ");
      builder.append("num_tx_buf_reset=");
      builder.append(this.num_tx_buf_reset_);      builder.append(", ");
      builder.append("signal_quality=");
      builder.append(this.signal_quality_);      builder.append(", ");
      builder.append("state=");
      builder.append(this.state_);      builder.append(", ");
      builder.append("ring_pending=");
      builder.append(this.ring_pending_);      builder.append(", ");
      builder.append("tx_buf_write_pending=");
      builder.append(this.tx_buf_write_pending_);      builder.append(", ");
      builder.append("tx_session_pending=");
      builder.append(this.tx_session_pending_);      builder.append(", ");
      builder.append("rx_read_pending=");
      builder.append(this.rx_read_pending_);      builder.append(", ");
      builder.append("rx_session_pending=");
      builder.append(this.rx_session_pending_);
      builder.append("}");
      return builder.toString();
   }
}
