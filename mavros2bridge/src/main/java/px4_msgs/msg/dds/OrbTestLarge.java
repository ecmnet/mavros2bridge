package px4_msgs.msg.dds;

import us.ihmc.communication.packets.Packet;
import us.ihmc.euclid.interfaces.Settable;
import us.ihmc.euclid.interfaces.EpsilonComparable;
import java.util.function.Supplier;
import us.ihmc.pubsub.TopicDataType;

public class OrbTestLarge extends Packet<OrbTestLarge> implements Settable<OrbTestLarge>, EpsilonComparable<OrbTestLarge>
{
   /**
            * time since system start (microseconds)
            */
   public long timestamp_;
   public int val_;
   public byte[] junk_;

   public OrbTestLarge()
   {
      junk_ = new byte[512];

   }

   public OrbTestLarge(OrbTestLarge other)
   {
      this();
      set(other);
   }

   public void set(OrbTestLarge other)
   {
      timestamp_ = other.timestamp_;

      val_ = other.val_;

      for(int i1 = 0; i1 < junk_.length; ++i1)
      {
            junk_[i1] = other.junk_[i1];

      }

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


   public byte[] getJunk()
   {
      return junk_;
   }


   public static Supplier<OrbTestLargePubSubType> getPubSubType()
   {
      return OrbTestLargePubSubType::new;
   }

   @Override
   public Supplier<TopicDataType> getPubSubTypePacket()
   {
      return OrbTestLargePubSubType::new;
   }

   @Override
   public boolean epsilonEquals(OrbTestLarge other, double epsilon)
   {
      if(other == null) return false;
      if(other == this) return true;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_, other.timestamp_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.val_, other.val_, epsilon)) return false;

      for(int i3 = 0; i3 < junk_.length; ++i3)
      {
                if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.junk_[i3], other.junk_[i3], epsilon)) return false;
      }


      return true;
   }

   @Override
   public boolean equals(Object other)
   {
      if(other == null) return false;
      if(other == this) return true;
      if(!(other instanceof OrbTestLarge)) return false;

      OrbTestLarge otherMyClass = (OrbTestLarge) other;

      if(this.timestamp_ != otherMyClass.timestamp_) return false;

      if(this.val_ != otherMyClass.val_) return false;

      for(int i5 = 0; i5 < junk_.length; ++i5)
      {
                if(this.junk_[i5] != otherMyClass.junk_[i5]) return false;

      }

      return true;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("OrbTestLarge {");
      builder.append("timestamp=");
      builder.append(this.timestamp_);      builder.append(", ");
      builder.append("val=");
      builder.append(this.val_);      builder.append(", ");
      builder.append("junk=");
      builder.append(java.util.Arrays.toString(this.junk_));
      builder.append("}");
      return builder.toString();
   }
}
