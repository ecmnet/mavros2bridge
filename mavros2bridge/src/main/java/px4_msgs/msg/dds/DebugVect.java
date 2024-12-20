package px4_msgs.msg.dds;

import us.ihmc.communication.packets.Packet;
import us.ihmc.euclid.interfaces.Settable;
import us.ihmc.euclid.interfaces.EpsilonComparable;
import java.util.function.Supplier;
import us.ihmc.pubsub.TopicDataType;

public class DebugVect extends Packet<DebugVect> implements Settable<DebugVect>, EpsilonComparable<DebugVect>
{
   /**
            * time since system start (microseconds)
            */
   public long timestamp_;
   /**
            * max. 10 characters as key / name
            */
   public char[] name_;
   /**
            * x value
            */
   public float x_;
   /**
            * y value
            */
   public float y_;
   /**
            * z value
            */
   public float z_;

   public DebugVect()
   {
      name_ = new char[10];

   }

   public DebugVect(DebugVect other)
   {
      this();
      set(other);
   }

   public void set(DebugVect other)
   {
      timestamp_ = other.timestamp_;

      for(int i1 = 0; i1 < name_.length; ++i1)
      {
            name_[i1] = other.name_[i1];

      }

      x_ = other.x_;

      y_ = other.y_;

      z_ = other.z_;

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
            * max. 10 characters as key / name
            */
   public char[] getName()
   {
      return name_;
   }

   /**
            * x value
            */
   public void setX(float x)
   {
      x_ = x;
   }
   /**
            * x value
            */
   public float getX()
   {
      return x_;
   }

   /**
            * y value
            */
   public void setY(float y)
   {
      y_ = y;
   }
   /**
            * y value
            */
   public float getY()
   {
      return y_;
   }

   /**
            * z value
            */
   public void setZ(float z)
   {
      z_ = z;
   }
   /**
            * z value
            */
   public float getZ()
   {
      return z_;
   }


   public static Supplier<DebugVectPubSubType> getPubSubType()
   {
      return DebugVectPubSubType::new;
   }

   @Override
   public Supplier<TopicDataType> getPubSubTypePacket()
   {
      return DebugVectPubSubType::new;
   }

   @Override
   public boolean epsilonEquals(DebugVect other, double epsilon)
   {
      if(other == null) return false;
      if(other == this) return true;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_, other.timestamp_, epsilon)) return false;

      for(int i3 = 0; i3 < name_.length; ++i3)
      {
                if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.name_[i3], other.name_[i3], epsilon)) return false;
      }

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.x_, other.x_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.y_, other.y_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.z_, other.z_, epsilon)) return false;


      return true;
   }

   @Override
   public boolean equals(Object other)
   {
      if(other == null) return false;
      if(other == this) return true;
      if(!(other instanceof DebugVect)) return false;

      DebugVect otherMyClass = (DebugVect) other;

      if(this.timestamp_ != otherMyClass.timestamp_) return false;

      for(int i5 = 0; i5 < name_.length; ++i5)
      {
                if(this.name_[i5] != otherMyClass.name_[i5]) return false;

      }
      if(this.x_ != otherMyClass.x_) return false;

      if(this.y_ != otherMyClass.y_) return false;

      if(this.z_ != otherMyClass.z_) return false;


      return true;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("DebugVect {");
      builder.append("timestamp=");
      builder.append(this.timestamp_);      builder.append(", ");
      builder.append("name=");
      builder.append(java.util.Arrays.toString(this.name_));      builder.append(", ");
      builder.append("x=");
      builder.append(this.x_);      builder.append(", ");
      builder.append("y=");
      builder.append(this.y_);      builder.append(", ");
      builder.append("z=");
      builder.append(this.z_);
      builder.append("}");
      return builder.toString();
   }
}
