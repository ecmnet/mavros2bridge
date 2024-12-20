package px4_msgs.msg.dds;

import us.ihmc.communication.packets.Packet;
import us.ihmc.euclid.interfaces.Settable;
import us.ihmc.euclid.interfaces.EpsilonComparable;
import java.util.function.Supplier;
import us.ihmc.pubsub.TopicDataType;

/**
       * MAV_TUNNEL_PAYLOAD_TYPE enum
       */
public class MavlinkTunnel extends Packet<MavlinkTunnel> implements Settable<MavlinkTunnel>, EpsilonComparable<MavlinkTunnel>
{
   /**
          * Encoding of payload unknown
          */
   public static final byte MAV_TUNNEL_PAYLOAD_TYPE_UNKNOWN = (byte) 0;
   /**
          * Registered for STorM32 gimbal controller
          */
   public static final byte MAV_TUNNEL_PAYLOAD_TYPE_STORM32_RESERVED0 = (byte) 200;
   /**
          * Registered for STorM32 gimbal controller
          */
   public static final byte MAV_TUNNEL_PAYLOAD_TYPE_STORM32_RESERVED1 = (byte) 201;
   /**
          * Registered for STorM32 gimbal controller
          */
   public static final byte MAV_TUNNEL_PAYLOAD_TYPE_STORM32_RESERVED2 = (byte) 202;
   /**
          * Registered for STorM32 gimbal controller
          */
   public static final byte MAV_TUNNEL_PAYLOAD_TYPE_STORM32_RESERVED3 = (byte) 203;
   /**
          * Registered for STorM32 gimbal controller
          */
   public static final byte MAV_TUNNEL_PAYLOAD_TYPE_STORM32_RESERVED4 = (byte) 204;
   /**
          * Registered for STorM32 gimbal controller
          */
   public static final byte MAV_TUNNEL_PAYLOAD_TYPE_STORM32_RESERVED5 = (byte) 205;
   /**
          * Registered for STorM32 gimbal controller
          */
   public static final byte MAV_TUNNEL_PAYLOAD_TYPE_STORM32_RESERVED6 = (byte) 206;
   /**
          * Registered for STorM32 gimbal controller
          */
   public static final byte MAV_TUNNEL_PAYLOAD_TYPE_STORM32_RESERVED7 = (byte) 207;
   /**
          * Registered for STorM32 gimbal controller
          */
   public static final byte MAV_TUNNEL_PAYLOAD_TYPE_STORM32_RESERVED8 = (byte) 208;
   /**
          * Registered for STorM32 gimbal controller
          */
   public static final byte MAV_TUNNEL_PAYLOAD_TYPE_STORM32_RESERVED9 = (byte) 209;
   /**
            * Time since system start (microseconds)
            */
   public long timestamp_;
   /**
            * A code that identifies the content of the payload (0 for unknown, which is the default). If this code is less than 32768, it is a 'registered' payload type and the corresponding code should be added to the MAV_TUNNEL_PAYLOAD_TYPE enum. Software creators can register blocks of types as needed. Codes greater than 32767 are considered local experiments and should not be checked in to any widely distributed codebase.
            */
   public int payload_type_;
   /**
            * System ID (can be 0 for broadcast, but this is discouraged)
            */
   public byte target_system_;
   /**
            * Component ID (can be 0 for broadcast, but this is discouraged)
            */
   public byte target_component_;
   /**
            * Length of the data transported in payload
            */
   public byte payload_length_;
   /**
            * Data itself
            */
   public byte[] payload_;

   public MavlinkTunnel()
   {
      payload_ = new byte[128];

   }

   public MavlinkTunnel(MavlinkTunnel other)
   {
      this();
      set(other);
   }

   public void set(MavlinkTunnel other)
   {
      timestamp_ = other.timestamp_;

      payload_type_ = other.payload_type_;

      target_system_ = other.target_system_;

      target_component_ = other.target_component_;

      payload_length_ = other.payload_length_;

      for(int i1 = 0; i1 < payload_.length; ++i1)
      {
            payload_[i1] = other.payload_[i1];

      }

   }

   /**
            * Time since system start (microseconds)
            */
   public void setTimestamp(long timestamp)
   {
      timestamp_ = timestamp;
   }
   /**
            * Time since system start (microseconds)
            */
   public long getTimestamp()
   {
      return timestamp_;
   }

   /**
            * A code that identifies the content of the payload (0 for unknown, which is the default). If this code is less than 32768, it is a 'registered' payload type and the corresponding code should be added to the MAV_TUNNEL_PAYLOAD_TYPE enum. Software creators can register blocks of types as needed. Codes greater than 32767 are considered local experiments and should not be checked in to any widely distributed codebase.
            */
   public void setPayloadType(int payload_type)
   {
      payload_type_ = payload_type;
   }
   /**
            * A code that identifies the content of the payload (0 for unknown, which is the default). If this code is less than 32768, it is a 'registered' payload type and the corresponding code should be added to the MAV_TUNNEL_PAYLOAD_TYPE enum. Software creators can register blocks of types as needed. Codes greater than 32767 are considered local experiments and should not be checked in to any widely distributed codebase.
            */
   public int getPayloadType()
   {
      return payload_type_;
   }

   /**
            * System ID (can be 0 for broadcast, but this is discouraged)
            */
   public void setTargetSystem(byte target_system)
   {
      target_system_ = target_system;
   }
   /**
            * System ID (can be 0 for broadcast, but this is discouraged)
            */
   public byte getTargetSystem()
   {
      return target_system_;
   }

   /**
            * Component ID (can be 0 for broadcast, but this is discouraged)
            */
   public void setTargetComponent(byte target_component)
   {
      target_component_ = target_component;
   }
   /**
            * Component ID (can be 0 for broadcast, but this is discouraged)
            */
   public byte getTargetComponent()
   {
      return target_component_;
   }

   /**
            * Length of the data transported in payload
            */
   public void setPayloadLength(byte payload_length)
   {
      payload_length_ = payload_length;
   }
   /**
            * Length of the data transported in payload
            */
   public byte getPayloadLength()
   {
      return payload_length_;
   }


   /**
            * Data itself
            */
   public byte[] getPayload()
   {
      return payload_;
   }


   public static Supplier<MavlinkTunnelPubSubType> getPubSubType()
   {
      return MavlinkTunnelPubSubType::new;
   }

   @Override
   public Supplier<TopicDataType> getPubSubTypePacket()
   {
      return MavlinkTunnelPubSubType::new;
   }

   @Override
   public boolean epsilonEquals(MavlinkTunnel other, double epsilon)
   {
      if(other == null) return false;
      if(other == this) return true;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_, other.timestamp_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.payload_type_, other.payload_type_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.target_system_, other.target_system_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.target_component_, other.target_component_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.payload_length_, other.payload_length_, epsilon)) return false;

      for(int i3 = 0; i3 < payload_.length; ++i3)
      {
                if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.payload_[i3], other.payload_[i3], epsilon)) return false;
      }


      return true;
   }

   @Override
   public boolean equals(Object other)
   {
      if(other == null) return false;
      if(other == this) return true;
      if(!(other instanceof MavlinkTunnel)) return false;

      MavlinkTunnel otherMyClass = (MavlinkTunnel) other;

      if(this.timestamp_ != otherMyClass.timestamp_) return false;

      if(this.payload_type_ != otherMyClass.payload_type_) return false;

      if(this.target_system_ != otherMyClass.target_system_) return false;

      if(this.target_component_ != otherMyClass.target_component_) return false;

      if(this.payload_length_ != otherMyClass.payload_length_) return false;

      for(int i5 = 0; i5 < payload_.length; ++i5)
      {
                if(this.payload_[i5] != otherMyClass.payload_[i5]) return false;

      }

      return true;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("MavlinkTunnel {");
      builder.append("timestamp=");
      builder.append(this.timestamp_);      builder.append(", ");
      builder.append("payload_type=");
      builder.append(this.payload_type_);      builder.append(", ");
      builder.append("target_system=");
      builder.append(this.target_system_);      builder.append(", ");
      builder.append("target_component=");
      builder.append(this.target_component_);      builder.append(", ");
      builder.append("payload_length=");
      builder.append(this.payload_length_);      builder.append(", ");
      builder.append("payload=");
      builder.append(java.util.Arrays.toString(this.payload_));
      builder.append("}");
      return builder.toString();
   }
}
