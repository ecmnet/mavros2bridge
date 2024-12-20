package px4_msgs.msg.dds;

import us.ihmc.communication.packets.Packet;
import us.ihmc.euclid.interfaces.Settable;
import us.ihmc.euclid.interfaces.EpsilonComparable;
import java.util.function.Supplier;
import us.ihmc.pubsub.TopicDataType;

/**
       * Topic to test individual actuator output functions
       */
public class ActuatorTest extends Packet<ActuatorTest> implements Settable<ActuatorTest>, EpsilonComparable<ActuatorTest>
{
   /**
          * exit test mode for the given function
          */
   public static final byte ACTION_RELEASE_CONTROL = (byte) 0;
   /**
          * enable actuator test mode
          */
   public static final byte ACTION_DO_CONTROL = (byte) 1;
   public static final byte FUNCTION_MOTOR1 = (byte) 101;
   public static final byte MAX_NUM_MOTORS = (byte) 12;
   public static final byte FUNCTION_SERVO1 = (byte) 201;
   public static final byte MAX_NUM_SERVOS = (byte) 8;
   /**
          * >= MAX_NUM_MOTORS to support code in esc_calibration
          */
   public static final byte ORB_QUEUE_LENGTH = (byte) 16;
   /**
            * time since system start (microseconds)
            */
   public long timestamp_;
   /**
            * one of ACTION_*
            */
   public byte action_;
   /**
            * actuator output function
            */
   public int function_;
   /**
            * range: [-1, 1], where 1 means maximum positive output,
            */
   public float value_;
   /**
            * 0 to center servos or minimum motor thrust,
            * -1 maximum negative (if not supported by the motors, <0 maps to NaN),
            * and NaN maps to disarmed (stop the motors)
            * timeout in ms after which to exit test mode (if 0, do not time out)
            */
   public long timeout_ms_;

   public ActuatorTest()
   {
   }

   public ActuatorTest(ActuatorTest other)
   {
      this();
      set(other);
   }

   public void set(ActuatorTest other)
   {
      timestamp_ = other.timestamp_;

      action_ = other.action_;

      function_ = other.function_;

      value_ = other.value_;

      timeout_ms_ = other.timeout_ms_;

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
            * one of ACTION_*
            */
   public void setAction(byte action)
   {
      action_ = action;
   }
   /**
            * one of ACTION_*
            */
   public byte getAction()
   {
      return action_;
   }

   /**
            * actuator output function
            */
   public void setFunction(int function)
   {
      function_ = function;
   }
   /**
            * actuator output function
            */
   public int getFunction()
   {
      return function_;
   }

   /**
            * range: [-1, 1], where 1 means maximum positive output,
            */
   public void setValue(float value)
   {
      value_ = value;
   }
   /**
            * range: [-1, 1], where 1 means maximum positive output,
            */
   public float getValue()
   {
      return value_;
   }

   /**
            * 0 to center servos or minimum motor thrust,
            * -1 maximum negative (if not supported by the motors, <0 maps to NaN),
            * and NaN maps to disarmed (stop the motors)
            * timeout in ms after which to exit test mode (if 0, do not time out)
            */
   public void setTimeoutMs(long timeout_ms)
   {
      timeout_ms_ = timeout_ms;
   }
   /**
            * 0 to center servos or minimum motor thrust,
            * -1 maximum negative (if not supported by the motors, <0 maps to NaN),
            * and NaN maps to disarmed (stop the motors)
            * timeout in ms after which to exit test mode (if 0, do not time out)
            */
   public long getTimeoutMs()
   {
      return timeout_ms_;
   }


   public static Supplier<ActuatorTestPubSubType> getPubSubType()
   {
      return ActuatorTestPubSubType::new;
   }

   @Override
   public Supplier<TopicDataType> getPubSubTypePacket()
   {
      return ActuatorTestPubSubType::new;
   }

   @Override
   public boolean epsilonEquals(ActuatorTest other, double epsilon)
   {
      if(other == null) return false;
      if(other == this) return true;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_, other.timestamp_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.action_, other.action_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.function_, other.function_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.value_, other.value_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timeout_ms_, other.timeout_ms_, epsilon)) return false;


      return true;
   }

   @Override
   public boolean equals(Object other)
   {
      if(other == null) return false;
      if(other == this) return true;
      if(!(other instanceof ActuatorTest)) return false;

      ActuatorTest otherMyClass = (ActuatorTest) other;

      if(this.timestamp_ != otherMyClass.timestamp_) return false;

      if(this.action_ != otherMyClass.action_) return false;

      if(this.function_ != otherMyClass.function_) return false;

      if(this.value_ != otherMyClass.value_) return false;

      if(this.timeout_ms_ != otherMyClass.timeout_ms_) return false;


      return true;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("ActuatorTest {");
      builder.append("timestamp=");
      builder.append(this.timestamp_);      builder.append(", ");
      builder.append("action=");
      builder.append(this.action_);      builder.append(", ");
      builder.append("function=");
      builder.append(this.function_);      builder.append(", ");
      builder.append("value=");
      builder.append(this.value_);      builder.append(", ");
      builder.append("timeout_ms=");
      builder.append(this.timeout_ms_);
      builder.append("}");
      return builder.toString();
   }
}
