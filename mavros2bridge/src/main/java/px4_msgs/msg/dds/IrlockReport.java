package px4_msgs.msg.dds;

import us.ihmc.communication.packets.Packet;
import us.ihmc.euclid.interfaces.Settable;
import us.ihmc.euclid.interfaces.EpsilonComparable;
import java.util.function.Supplier;
import us.ihmc.pubsub.TopicDataType;

/**
       * IRLOCK_REPORT message data
       */
public class IrlockReport extends Packet<IrlockReport> implements Settable<IrlockReport>, EpsilonComparable<IrlockReport>
{
   /**
            * time since system start (microseconds)
            */
   public long timestamp_;
   public int signature_;
   /**
            * When looking along the optical axis of the camera, x points right, y points down, and z points along the optical axis.
            * tan(theta), where theta is the angle between the target and the camera center of projection in camera x-axis
            */
   public float pos_x_;
   /**
            * tan(theta), where theta is the angle between the target and the camera center of projection in camera y-axis
            */
   public float pos_y_;
   /**
            * /** size of target along camera x-axis in units of tan(theta) **/
   public float size_x_;
   /**
            * /** size of target along camera y-axis in units of tan(theta) **/
   public float size_y_;

   public IrlockReport()
   {
   }

   public IrlockReport(IrlockReport other)
   {
      this();
      set(other);
   }

   public void set(IrlockReport other)
   {
      timestamp_ = other.timestamp_;

      signature_ = other.signature_;

      pos_x_ = other.pos_x_;

      pos_y_ = other.pos_y_;

      size_x_ = other.size_x_;

      size_y_ = other.size_y_;

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

   public void setSignature(int signature)
   {
      signature_ = signature;
   }
   public int getSignature()
   {
      return signature_;
   }

   /**
            * When looking along the optical axis of the camera, x points right, y points down, and z points along the optical axis.
            * tan(theta), where theta is the angle between the target and the camera center of projection in camera x-axis
            */
   public void setPosX(float pos_x)
   {
      pos_x_ = pos_x;
   }
   /**
            * When looking along the optical axis of the camera, x points right, y points down, and z points along the optical axis.
            * tan(theta), where theta is the angle between the target and the camera center of projection in camera x-axis
            */
   public float getPosX()
   {
      return pos_x_;
   }

   /**
            * tan(theta), where theta is the angle between the target and the camera center of projection in camera y-axis
            */
   public void setPosY(float pos_y)
   {
      pos_y_ = pos_y;
   }
   /**
            * tan(theta), where theta is the angle between the target and the camera center of projection in camera y-axis
            */
   public float getPosY()
   {
      return pos_y_;
   }

   /**
            * /** size of target along camera x-axis in units of tan(theta) **/
   public void setSizeX(float size_x)
   {
      size_x_ = size_x;
   }
   /**
            * /** size of target along camera x-axis in units of tan(theta) **/
   public float getSizeX()
   {
      return size_x_;
   }

   /**
            * /** size of target along camera y-axis in units of tan(theta) **/
   public void setSizeY(float size_y)
   {
      size_y_ = size_y;
   }
   /**
            * /** size of target along camera y-axis in units of tan(theta) **/
   public float getSizeY()
   {
      return size_y_;
   }


   public static Supplier<IrlockReportPubSubType> getPubSubType()
   {
      return IrlockReportPubSubType::new;
   }

   @Override
   public Supplier<TopicDataType> getPubSubTypePacket()
   {
      return IrlockReportPubSubType::new;
   }

   @Override
   public boolean epsilonEquals(IrlockReport other, double epsilon)
   {
      if(other == null) return false;
      if(other == this) return true;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_, other.timestamp_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.signature_, other.signature_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.pos_x_, other.pos_x_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.pos_y_, other.pos_y_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.size_x_, other.size_x_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.size_y_, other.size_y_, epsilon)) return false;


      return true;
   }

   @Override
   public boolean equals(Object other)
   {
      if(other == null) return false;
      if(other == this) return true;
      if(!(other instanceof IrlockReport)) return false;

      IrlockReport otherMyClass = (IrlockReport) other;

      if(this.timestamp_ != otherMyClass.timestamp_) return false;

      if(this.signature_ != otherMyClass.signature_) return false;

      if(this.pos_x_ != otherMyClass.pos_x_) return false;

      if(this.pos_y_ != otherMyClass.pos_y_) return false;

      if(this.size_x_ != otherMyClass.size_x_) return false;

      if(this.size_y_ != otherMyClass.size_y_) return false;


      return true;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("IrlockReport {");
      builder.append("timestamp=");
      builder.append(this.timestamp_);      builder.append(", ");
      builder.append("signature=");
      builder.append(this.signature_);      builder.append(", ");
      builder.append("pos_x=");
      builder.append(this.pos_x_);      builder.append(", ");
      builder.append("pos_y=");
      builder.append(this.pos_y_);      builder.append(", ");
      builder.append("size_x=");
      builder.append(this.size_x_);      builder.append(", ");
      builder.append("size_y=");
      builder.append(this.size_y_);
      builder.append("}");
      return builder.toString();
   }
}
