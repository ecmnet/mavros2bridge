package px4_msgs.msg.dds;

import us.ihmc.communication.packets.Packet;
import us.ihmc.euclid.interfaces.Settable;
import us.ihmc.euclid.interfaces.EpsilonComparable;
import java.util.function.Supplier;
import us.ihmc.pubsub.TopicDataType;

public class OrbTest extends Packet<OrbTest> implements Settable<OrbTest>, EpsilonComparable<OrbTest>
{
   /**
            * time since system start (microseconds)
            */
   public long timestamp_;
   public int val_;

   public OrbTest()
   {
   }

   public OrbTest(OrbTest other)
   {
      this();
      set(other);
   }

   public void set(OrbTest other)
   {
      timestamp_ = other.timestamp_;

      val_ = other.val_;

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

   public void setVal(int val)
   {
      val_ = val;
   }
   public int getVal()
   {
      return val_;
   }


   public static Supplier<OrbTestPubSubType> getPubSubType()
   {
      return OrbTestPubSubType::new;
   }

   @Override
   public Supplier<TopicDataType> getPubSubTypePacket()
   {
      return OrbTestPubSubType::new;
   }

   @Override
   public boolean epsilonEquals(OrbTest other, double epsilon)
   {
      if(other == null) return false;
      if(other == this) return true;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_, other.timestamp_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.val_, other.val_, epsilon)) return false;


      return true;
   }

   @Override
   public boolean equals(Object other)
   {
      if(other == null) return false;
      if(other == this) return true;
      if(!(other instanceof OrbTest)) return false;

      OrbTest otherMyClass = (OrbTest) other;

      if(this.timestamp_ != otherMyClass.timestamp_) return false;

      if(this.val_ != otherMyClass.val_) return false;


      return true;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("OrbTest {");
      builder.append("timestamp=");
      builder.append(this.timestamp_);      builder.append(", ");
      builder.append("val=");
      builder.append(this.val_);
      builder.append("}");
      return builder.toString();
   }
}
