package px4_msgs.msg.dds;

import us.ihmc.communication.packets.Packet;
import us.ihmc.euclid.interfaces.Settable;
import us.ihmc.euclid.interfaces.EpsilonComparable;
import java.util.function.Supplier;
import us.ihmc.pubsub.TopicDataType;

public class DebugArray extends Packet<DebugArray> implements Settable<DebugArray>, EpsilonComparable<DebugArray>
{
   public static final byte ARRAY_SIZE = (byte) 58;/**
            * time since system start (microseconds)
            */
   public long timestamp_;
   /**
            * unique ID of debug array, used to discriminate between arrays
            */
   public int id_;
   /**
            * name of the debug array (max. 10 characters)
            */
   public char[] name_;
   /**
            * data
            */
   public float[] data_;

   public DebugArray()
   {
      name_ = new char[10];

      data_ = new float[58];

   }

   public DebugArray(DebugArray other)
   {
      this();
      set(other);
   }

   public void set(DebugArray other)
   {
      timestamp_ = other.timestamp_;

      id_ = other.id_;

      for(int i1 = 0; i1 < name_.length; ++i1)
      {
            name_[i1] = other.name_[i1];

      }

      for(int i3 = 0; i3 < data_.length; ++i3)
      {
            data_[i3] = other.data_[i3];

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

   /**
            * unique ID of debug array, used to discriminate between arrays
            */
   public void setId(int id)
   {
      id_ = id;
   }
   /**
            * unique ID of debug array, used to discriminate between arrays
            */
   public int getId()
   {
      return id_;
   }


   /**
            * name of the debug array (max. 10 characters)
            */
   public char[] getName()
   {
      return name_;
   }


   /**
            * data
            */
   public float[] getData()
   {
      return data_;
   }


   public static Supplier<DebugArrayPubSubType> getPubSubType()
   {
      return DebugArrayPubSubType::new;
   }

   @Override
   public Supplier<TopicDataType> getPubSubTypePacket()
   {
      return DebugArrayPubSubType::new;
   }

   @Override
   public boolean epsilonEquals(DebugArray other, double epsilon)
   {
      if(other == null) return false;
      if(other == this) return true;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_, other.timestamp_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.id_, other.id_, epsilon)) return false;

      for(int i5 = 0; i5 < name_.length; ++i5)
      {
                if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.name_[i5], other.name_[i5], epsilon)) return false;
      }

      for(int i7 = 0; i7 < data_.length; ++i7)
      {
                if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.data_[i7], other.data_[i7], epsilon)) return false;
      }


      return true;
   }

   @Override
   public boolean equals(Object other)
   {
      if(other == null) return false;
      if(other == this) return true;
      if(!(other instanceof DebugArray)) return false;

      DebugArray otherMyClass = (DebugArray) other;

      if(this.timestamp_ != otherMyClass.timestamp_) return false;

      if(this.id_ != otherMyClass.id_) return false;

      for(int i9 = 0; i9 < name_.length; ++i9)
      {
                if(this.name_[i9] != otherMyClass.name_[i9]) return false;

      }
      for(int i11 = 0; i11 < data_.length; ++i11)
      {
                if(this.data_[i11] != otherMyClass.data_[i11]) return false;

      }

      return true;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("DebugArray {");
      builder.append("timestamp=");
      builder.append(this.timestamp_);      builder.append(", ");
      builder.append("id=");
      builder.append(this.id_);      builder.append(", ");
      builder.append("name=");
      builder.append(java.util.Arrays.toString(this.name_));      builder.append(", ");
      builder.append("data=");
      builder.append(java.util.Arrays.toString(this.data_));
      builder.append("}");
      return builder.toString();
   }
}
