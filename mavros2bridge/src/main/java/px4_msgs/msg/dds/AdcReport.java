package px4_msgs.msg.dds;

import us.ihmc.communication.packets.Packet;
import us.ihmc.euclid.interfaces.Settable;
import us.ihmc.euclid.interfaces.EpsilonComparable;
import java.util.function.Supplier;
import us.ihmc.pubsub.TopicDataType;

public class AdcReport extends Packet<AdcReport> implements Settable<AdcReport>, EpsilonComparable<AdcReport>
{
   /**
            * time since system start (microseconds)
            */
   public long timestamp_;
   /**
            * unique device ID for the sensor that does not change between power cycles
            */
   public long device_id_;
   /**
            * ADC channel IDs, negative for non-existent, TODO: should be kept same as array index
            */
   public short[] channel_id_;
   /**
            * ADC channel raw value, accept negative value, valid if channel ID is positive
            */
   public int[] raw_data_;
   /**
            * ADC channel resolution
            */
   public long resolution_;
   /**
            * ADC channel voltage reference, use to calculate LSB voltage(lsb=scale/resolution)
            */
   public float v_ref_;

   public AdcReport()
   {
      channel_id_ = new short[12];

      raw_data_ = new int[12];

   }

   public AdcReport(AdcReport other)
   {
      this();
      set(other);
   }

   public void set(AdcReport other)
   {
      timestamp_ = other.timestamp_;

      device_id_ = other.device_id_;

      for(int i1 = 0; i1 < channel_id_.length; ++i1)
      {
            channel_id_[i1] = other.channel_id_[i1];

      }

      for(int i3 = 0; i3 < raw_data_.length; ++i3)
      {
            raw_data_[i3] = other.raw_data_[i3];

      }

      resolution_ = other.resolution_;

      v_ref_ = other.v_ref_;

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
            * unique device ID for the sensor that does not change between power cycles
            */
   public void setDeviceId(long device_id)
   {
      device_id_ = device_id;
   }
   /**
            * unique device ID for the sensor that does not change between power cycles
            */
   public long getDeviceId()
   {
      return device_id_;
   }


   /**
            * ADC channel IDs, negative for non-existent, TODO: should be kept same as array index
            */
   public short[] getChannelId()
   {
      return channel_id_;
   }


   /**
            * ADC channel raw value, accept negative value, valid if channel ID is positive
            */
   public int[] getRawData()
   {
      return raw_data_;
   }

   /**
            * ADC channel resolution
            */
   public void setResolution(long resolution)
   {
      resolution_ = resolution;
   }
   /**
            * ADC channel resolution
            */
   public long getResolution()
   {
      return resolution_;
   }

   /**
            * ADC channel voltage reference, use to calculate LSB voltage(lsb=scale/resolution)
            */
   public void setVRef(float v_ref)
   {
      v_ref_ = v_ref;
   }
   /**
            * ADC channel voltage reference, use to calculate LSB voltage(lsb=scale/resolution)
            */
   public float getVRef()
   {
      return v_ref_;
   }


   public static Supplier<AdcReportPubSubType> getPubSubType()
   {
      return AdcReportPubSubType::new;
   }

   @Override
   public Supplier<TopicDataType> getPubSubTypePacket()
   {
      return AdcReportPubSubType::new;
   }

   @Override
   public boolean epsilonEquals(AdcReport other, double epsilon)
   {
      if(other == null) return false;
      if(other == this) return true;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_, other.timestamp_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.device_id_, other.device_id_, epsilon)) return false;

      for(int i5 = 0; i5 < channel_id_.length; ++i5)
      {
                if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.channel_id_[i5], other.channel_id_[i5], epsilon)) return false;
      }

      for(int i7 = 0; i7 < raw_data_.length; ++i7)
      {
                if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.raw_data_[i7], other.raw_data_[i7], epsilon)) return false;
      }

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.resolution_, other.resolution_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.v_ref_, other.v_ref_, epsilon)) return false;


      return true;
   }

   @Override
   public boolean equals(Object other)
   {
      if(other == null) return false;
      if(other == this) return true;
      if(!(other instanceof AdcReport)) return false;

      AdcReport otherMyClass = (AdcReport) other;

      if(this.timestamp_ != otherMyClass.timestamp_) return false;

      if(this.device_id_ != otherMyClass.device_id_) return false;

      for(int i9 = 0; i9 < channel_id_.length; ++i9)
      {
                if(this.channel_id_[i9] != otherMyClass.channel_id_[i9]) return false;

      }
      for(int i11 = 0; i11 < raw_data_.length; ++i11)
      {
                if(this.raw_data_[i11] != otherMyClass.raw_data_[i11]) return false;

      }
      if(this.resolution_ != otherMyClass.resolution_) return false;

      if(this.v_ref_ != otherMyClass.v_ref_) return false;


      return true;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("AdcReport {");
      builder.append("timestamp=");
      builder.append(this.timestamp_);      builder.append(", ");
      builder.append("device_id=");
      builder.append(this.device_id_);      builder.append(", ");
      builder.append("channel_id=");
      builder.append(java.util.Arrays.toString(this.channel_id_));      builder.append(", ");
      builder.append("raw_data=");
      builder.append(java.util.Arrays.toString(this.raw_data_));      builder.append(", ");
      builder.append("resolution=");
      builder.append(this.resolution_);      builder.append(", ");
      builder.append("v_ref=");
      builder.append(this.v_ref_);
      builder.append("}");
      return builder.toString();
   }
}
