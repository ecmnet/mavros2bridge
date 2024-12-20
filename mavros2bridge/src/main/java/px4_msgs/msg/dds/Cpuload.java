package px4_msgs.msg.dds;

import us.ihmc.communication.packets.Packet;
import us.ihmc.euclid.interfaces.Settable;
import us.ihmc.euclid.interfaces.EpsilonComparable;
import java.util.function.Supplier;
import us.ihmc.pubsub.TopicDataType;

public class Cpuload extends Packet<Cpuload> implements Settable<Cpuload>, EpsilonComparable<Cpuload>
{
   /**
            * time since system start (microseconds)
            */
   public long timestamp_;
   /**
            * processor load from 0 to 1
            */
   public float load_;
   /**
            * RAM usage from 0 to 1
            */
   public float ram_usage_;

   public Cpuload()
   {
   }

   public Cpuload(Cpuload other)
   {
      this();
      set(other);
   }

   public void set(Cpuload other)
   {
      timestamp_ = other.timestamp_;

      load_ = other.load_;

      ram_usage_ = other.ram_usage_;

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
            * processor load from 0 to 1
            */
   public void setLoad(float load)
   {
      load_ = load;
   }
   /**
            * processor load from 0 to 1
            */
   public float getLoad()
   {
      return load_;
   }

   /**
            * RAM usage from 0 to 1
            */
   public void setRamUsage(float ram_usage)
   {
      ram_usage_ = ram_usage;
   }
   /**
            * RAM usage from 0 to 1
            */
   public float getRamUsage()
   {
      return ram_usage_;
   }


   public static Supplier<CpuloadPubSubType> getPubSubType()
   {
      return CpuloadPubSubType::new;
   }

   @Override
   public Supplier<TopicDataType> getPubSubTypePacket()
   {
      return CpuloadPubSubType::new;
   }

   @Override
   public boolean epsilonEquals(Cpuload other, double epsilon)
   {
      if(other == null) return false;
      if(other == this) return true;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_, other.timestamp_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.load_, other.load_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.ram_usage_, other.ram_usage_, epsilon)) return false;


      return true;
   }

   @Override
   public boolean equals(Object other)
   {
      if(other == null) return false;
      if(other == this) return true;
      if(!(other instanceof Cpuload)) return false;

      Cpuload otherMyClass = (Cpuload) other;

      if(this.timestamp_ != otherMyClass.timestamp_) return false;

      if(this.load_ != otherMyClass.load_) return false;

      if(this.ram_usage_ != otherMyClass.ram_usage_) return false;


      return true;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("Cpuload {");
      builder.append("timestamp=");
      builder.append(this.timestamp_);      builder.append(", ");
      builder.append("load=");
      builder.append(this.load_);      builder.append(", ");
      builder.append("ram_usage=");
      builder.append(this.ram_usage_);
      builder.append("}");
      return builder.toString();
   }
}
