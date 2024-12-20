package px4_msgs.msg.dds;

import us.ihmc.communication.packets.Packet;
import us.ihmc.euclid.interfaces.Settable;
import us.ihmc.euclid.interfaces.EpsilonComparable;
import java.util.function.Supplier;
import us.ihmc.pubsub.TopicDataType;

public class SystemPower extends Packet<SystemPower> implements Settable<SystemPower>, EpsilonComparable<SystemPower>
{
   public static final byte BRICK1_VALID_SHIFTS = (byte) 0;
   public static final byte BRICK1_VALID_MASK = (byte) 1;
   public static final byte BRICK2_VALID_SHIFTS = (byte) 1;
   public static final byte BRICK2_VALID_MASK = (byte) 2;
   public static final byte BRICK3_VALID_SHIFTS = (byte) 2;
   public static final byte BRICK3_VALID_MASK = (byte) 4;
   public static final byte BRICK4_VALID_SHIFTS = (byte) 3;
   public static final byte BRICK4_VALID_MASK = (byte) 8;
   /**
            * time since system start (microseconds)
            */
   public long timestamp_;
   /**
            * peripheral 5V rail voltage
            */
   public float voltage5v_v_;
   /**
            * payload rail voltage
            */
   public float voltage_payload_v_;
   /**
            * Sensors 3V3 rail voltage
            */
   public float[] sensors3v3_;
   /**
            * Sensors 3V3 rail voltage was read (bitfield).
            */
   public byte sensors3v3_valid_;
   /**
            * USB is connected when 1
            */
   public byte usb_connected_;
   /**
            * brick bits power is good when bit 1
            */
   public byte brick_valid_;
   /**
            * USB is valid when 1
            */
   public byte usb_valid_;
   /**
            * servo power is good when 1
            */
   public byte servo_valid_;
   /**
            * peripheral overcurrent when 1
            */
   public byte periph_5v_oc_;
   /**
            * high power peripheral overcurrent when 1
            */
   public byte hipower_5v_oc_;
   /**
            * 5V to companion valid
            */
   public byte comp_5v_valid_;
   /**
            * 5V for CAN1/GPS1 valid
            */
   public byte can1_gps1_5v_valid_;
   /**
            * payload rail voltage is valid
            */
   public byte payload_v_valid_;

   public SystemPower()
   {
      sensors3v3_ = new float[4];

   }

   public SystemPower(SystemPower other)
   {
      this();
      set(other);
   }

   public void set(SystemPower other)
   {
      timestamp_ = other.timestamp_;

      voltage5v_v_ = other.voltage5v_v_;

      voltage_payload_v_ = other.voltage_payload_v_;

      for(int i1 = 0; i1 < sensors3v3_.length; ++i1)
      {
            sensors3v3_[i1] = other.sensors3v3_[i1];

      }

      sensors3v3_valid_ = other.sensors3v3_valid_;

      usb_connected_ = other.usb_connected_;

      brick_valid_ = other.brick_valid_;

      usb_valid_ = other.usb_valid_;

      servo_valid_ = other.servo_valid_;

      periph_5v_oc_ = other.periph_5v_oc_;

      hipower_5v_oc_ = other.hipower_5v_oc_;

      comp_5v_valid_ = other.comp_5v_valid_;

      can1_gps1_5v_valid_ = other.can1_gps1_5v_valid_;

      payload_v_valid_ = other.payload_v_valid_;

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
            * peripheral 5V rail voltage
            */
   public void setVoltage5vV(float voltage5v_v)
   {
      voltage5v_v_ = voltage5v_v;
   }
   /**
            * peripheral 5V rail voltage
            */
   public float getVoltage5vV()
   {
      return voltage5v_v_;
   }

   /**
            * payload rail voltage
            */
   public void setVoltagePayloadV(float voltage_payload_v)
   {
      voltage_payload_v_ = voltage_payload_v;
   }
   /**
            * payload rail voltage
            */
   public float getVoltagePayloadV()
   {
      return voltage_payload_v_;
   }


   /**
            * Sensors 3V3 rail voltage
            */
   public float[] getSensors3v3()
   {
      return sensors3v3_;
   }

   /**
            * Sensors 3V3 rail voltage was read (bitfield).
            */
   public void setSensors3v3Valid(byte sensors3v3_valid)
   {
      sensors3v3_valid_ = sensors3v3_valid;
   }
   /**
            * Sensors 3V3 rail voltage was read (bitfield).
            */
   public byte getSensors3v3Valid()
   {
      return sensors3v3_valid_;
   }

   /**
            * USB is connected when 1
            */
   public void setUsbConnected(byte usb_connected)
   {
      usb_connected_ = usb_connected;
   }
   /**
            * USB is connected when 1
            */
   public byte getUsbConnected()
   {
      return usb_connected_;
   }

   /**
            * brick bits power is good when bit 1
            */
   public void setBrickValid(byte brick_valid)
   {
      brick_valid_ = brick_valid;
   }
   /**
            * brick bits power is good when bit 1
            */
   public byte getBrickValid()
   {
      return brick_valid_;
   }

   /**
            * USB is valid when 1
            */
   public void setUsbValid(byte usb_valid)
   {
      usb_valid_ = usb_valid;
   }
   /**
            * USB is valid when 1
            */
   public byte getUsbValid()
   {
      return usb_valid_;
   }

   /**
            * servo power is good when 1
            */
   public void setServoValid(byte servo_valid)
   {
      servo_valid_ = servo_valid;
   }
   /**
            * servo power is good when 1
            */
   public byte getServoValid()
   {
      return servo_valid_;
   }

   /**
            * peripheral overcurrent when 1
            */
   public void setPeriph5vOc(byte periph_5v_oc)
   {
      periph_5v_oc_ = periph_5v_oc;
   }
   /**
            * peripheral overcurrent when 1
            */
   public byte getPeriph5vOc()
   {
      return periph_5v_oc_;
   }

   /**
            * high power peripheral overcurrent when 1
            */
   public void setHipower5vOc(byte hipower_5v_oc)
   {
      hipower_5v_oc_ = hipower_5v_oc;
   }
   /**
            * high power peripheral overcurrent when 1
            */
   public byte getHipower5vOc()
   {
      return hipower_5v_oc_;
   }

   /**
            * 5V to companion valid
            */
   public void setComp5vValid(byte comp_5v_valid)
   {
      comp_5v_valid_ = comp_5v_valid;
   }
   /**
            * 5V to companion valid
            */
   public byte getComp5vValid()
   {
      return comp_5v_valid_;
   }

   /**
            * 5V for CAN1/GPS1 valid
            */
   public void setCan1Gps15vValid(byte can1_gps1_5v_valid)
   {
      can1_gps1_5v_valid_ = can1_gps1_5v_valid;
   }
   /**
            * 5V for CAN1/GPS1 valid
            */
   public byte getCan1Gps15vValid()
   {
      return can1_gps1_5v_valid_;
   }

   /**
            * payload rail voltage is valid
            */
   public void setPayloadVValid(byte payload_v_valid)
   {
      payload_v_valid_ = payload_v_valid;
   }
   /**
            * payload rail voltage is valid
            */
   public byte getPayloadVValid()
   {
      return payload_v_valid_;
   }


   public static Supplier<SystemPowerPubSubType> getPubSubType()
   {
      return SystemPowerPubSubType::new;
   }

   @Override
   public Supplier<TopicDataType> getPubSubTypePacket()
   {
      return SystemPowerPubSubType::new;
   }

   @Override
   public boolean epsilonEquals(SystemPower other, double epsilon)
   {
      if(other == null) return false;
      if(other == this) return true;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_, other.timestamp_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.voltage5v_v_, other.voltage5v_v_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.voltage_payload_v_, other.voltage_payload_v_, epsilon)) return false;

      for(int i3 = 0; i3 < sensors3v3_.length; ++i3)
      {
                if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.sensors3v3_[i3], other.sensors3v3_[i3], epsilon)) return false;
      }

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.sensors3v3_valid_, other.sensors3v3_valid_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.usb_connected_, other.usb_connected_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.brick_valid_, other.brick_valid_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.usb_valid_, other.usb_valid_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.servo_valid_, other.servo_valid_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.periph_5v_oc_, other.periph_5v_oc_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.hipower_5v_oc_, other.hipower_5v_oc_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.comp_5v_valid_, other.comp_5v_valid_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.can1_gps1_5v_valid_, other.can1_gps1_5v_valid_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.payload_v_valid_, other.payload_v_valid_, epsilon)) return false;


      return true;
   }

   @Override
   public boolean equals(Object other)
   {
      if(other == null) return false;
      if(other == this) return true;
      if(!(other instanceof SystemPower)) return false;

      SystemPower otherMyClass = (SystemPower) other;

      if(this.timestamp_ != otherMyClass.timestamp_) return false;

      if(this.voltage5v_v_ != otherMyClass.voltage5v_v_) return false;

      if(this.voltage_payload_v_ != otherMyClass.voltage_payload_v_) return false;

      for(int i5 = 0; i5 < sensors3v3_.length; ++i5)
      {
                if(this.sensors3v3_[i5] != otherMyClass.sensors3v3_[i5]) return false;

      }
      if(this.sensors3v3_valid_ != otherMyClass.sensors3v3_valid_) return false;

      if(this.usb_connected_ != otherMyClass.usb_connected_) return false;

      if(this.brick_valid_ != otherMyClass.brick_valid_) return false;

      if(this.usb_valid_ != otherMyClass.usb_valid_) return false;

      if(this.servo_valid_ != otherMyClass.servo_valid_) return false;

      if(this.periph_5v_oc_ != otherMyClass.periph_5v_oc_) return false;

      if(this.hipower_5v_oc_ != otherMyClass.hipower_5v_oc_) return false;

      if(this.comp_5v_valid_ != otherMyClass.comp_5v_valid_) return false;

      if(this.can1_gps1_5v_valid_ != otherMyClass.can1_gps1_5v_valid_) return false;

      if(this.payload_v_valid_ != otherMyClass.payload_v_valid_) return false;


      return true;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("SystemPower {");
      builder.append("timestamp=");
      builder.append(this.timestamp_);      builder.append(", ");
      builder.append("voltage5v_v=");
      builder.append(this.voltage5v_v_);      builder.append(", ");
      builder.append("voltage_payload_v=");
      builder.append(this.voltage_payload_v_);      builder.append(", ");
      builder.append("sensors3v3=");
      builder.append(java.util.Arrays.toString(this.sensors3v3_));      builder.append(", ");
      builder.append("sensors3v3_valid=");
      builder.append(this.sensors3v3_valid_);      builder.append(", ");
      builder.append("usb_connected=");
      builder.append(this.usb_connected_);      builder.append(", ");
      builder.append("brick_valid=");
      builder.append(this.brick_valid_);      builder.append(", ");
      builder.append("usb_valid=");
      builder.append(this.usb_valid_);      builder.append(", ");
      builder.append("servo_valid=");
      builder.append(this.servo_valid_);      builder.append(", ");
      builder.append("periph_5v_oc=");
      builder.append(this.periph_5v_oc_);      builder.append(", ");
      builder.append("hipower_5v_oc=");
      builder.append(this.hipower_5v_oc_);      builder.append(", ");
      builder.append("comp_5v_valid=");
      builder.append(this.comp_5v_valid_);      builder.append(", ");
      builder.append("can1_gps1_5v_valid=");
      builder.append(this.can1_gps1_5v_valid_);      builder.append(", ");
      builder.append("payload_v_valid=");
      builder.append(this.payload_v_valid_);
      builder.append("}");
      return builder.toString();
   }
}
