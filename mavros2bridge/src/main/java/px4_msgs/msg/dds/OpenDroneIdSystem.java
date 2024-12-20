package px4_msgs.msg.dds;

import us.ihmc.communication.packets.Packet;
import us.ihmc.euclid.interfaces.Settable;
import us.ihmc.euclid.interfaces.EpsilonComparable;
import java.util.function.Supplier;
import us.ihmc.pubsub.TopicDataType;

public class OpenDroneIdSystem extends Packet<OpenDroneIdSystem> implements Settable<OpenDroneIdSystem>, EpsilonComparable<OpenDroneIdSystem>
{
   public long timestamp_;
   public byte[] id_or_mac_;
   public byte operator_location_type_;
   public byte classification_type_;
   public int operator_latitude_;
   public int operator_longitude_;
   public int area_count_;
   public int area_radius_;
   public float area_ceiling_;
   public float area_floor_;
   public byte category_eu_;
   public byte class_eu_;
   public float operator_altitude_geo_;

   public OpenDroneIdSystem()
   {
      id_or_mac_ = new byte[20];

   }

   public OpenDroneIdSystem(OpenDroneIdSystem other)
   {
      this();
      set(other);
   }

   public void set(OpenDroneIdSystem other)
   {
      timestamp_ = other.timestamp_;

      for(int i1 = 0; i1 < id_or_mac_.length; ++i1)
      {
            id_or_mac_[i1] = other.id_or_mac_[i1];

      }

      operator_location_type_ = other.operator_location_type_;

      classification_type_ = other.classification_type_;

      operator_latitude_ = other.operator_latitude_;

      operator_longitude_ = other.operator_longitude_;

      area_count_ = other.area_count_;

      area_radius_ = other.area_radius_;

      area_ceiling_ = other.area_ceiling_;

      area_floor_ = other.area_floor_;

      category_eu_ = other.category_eu_;

      class_eu_ = other.class_eu_;

      operator_altitude_geo_ = other.operator_altitude_geo_;

   }

   public void setTimestamp(long timestamp)
   {
      timestamp_ = timestamp;
   }
   public long getTimestamp()
   {
      return timestamp_;
   }


   public byte[] getIdOrMac()
   {
      return id_or_mac_;
   }

   public void setOperatorLocationType(byte operator_location_type)
   {
      operator_location_type_ = operator_location_type;
   }
   public byte getOperatorLocationType()
   {
      return operator_location_type_;
   }

   public void setClassificationType(byte classification_type)
   {
      classification_type_ = classification_type;
   }
   public byte getClassificationType()
   {
      return classification_type_;
   }

   public void setOperatorLatitude(int operator_latitude)
   {
      operator_latitude_ = operator_latitude;
   }
   public int getOperatorLatitude()
   {
      return operator_latitude_;
   }

   public void setOperatorLongitude(int operator_longitude)
   {
      operator_longitude_ = operator_longitude;
   }
   public int getOperatorLongitude()
   {
      return operator_longitude_;
   }

   public void setAreaCount(int area_count)
   {
      area_count_ = area_count;
   }
   public int getAreaCount()
   {
      return area_count_;
   }

   public void setAreaRadius(int area_radius)
   {
      area_radius_ = area_radius;
   }
   public int getAreaRadius()
   {
      return area_radius_;
   }

   public void setAreaCeiling(float area_ceiling)
   {
      area_ceiling_ = area_ceiling;
   }
   public float getAreaCeiling()
   {
      return area_ceiling_;
   }

   public void setAreaFloor(float area_floor)
   {
      area_floor_ = area_floor;
   }
   public float getAreaFloor()
   {
      return area_floor_;
   }

   public void setCategoryEu(byte category_eu)
   {
      category_eu_ = category_eu;
   }
   public byte getCategoryEu()
   {
      return category_eu_;
   }

   public void setClassEu(byte class_eu)
   {
      class_eu_ = class_eu;
   }
   public byte getClassEu()
   {
      return class_eu_;
   }

   public void setOperatorAltitudeGeo(float operator_altitude_geo)
   {
      operator_altitude_geo_ = operator_altitude_geo;
   }
   public float getOperatorAltitudeGeo()
   {
      return operator_altitude_geo_;
   }


   public static Supplier<OpenDroneIdSystemPubSubType> getPubSubType()
   {
      return OpenDroneIdSystemPubSubType::new;
   }

   @Override
   public Supplier<TopicDataType> getPubSubTypePacket()
   {
      return OpenDroneIdSystemPubSubType::new;
   }

   @Override
   public boolean epsilonEquals(OpenDroneIdSystem other, double epsilon)
   {
      if(other == null) return false;
      if(other == this) return true;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_, other.timestamp_, epsilon)) return false;

      for(int i3 = 0; i3 < id_or_mac_.length; ++i3)
      {
                if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.id_or_mac_[i3], other.id_or_mac_[i3], epsilon)) return false;
      }

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.operator_location_type_, other.operator_location_type_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.classification_type_, other.classification_type_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.operator_latitude_, other.operator_latitude_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.operator_longitude_, other.operator_longitude_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.area_count_, other.area_count_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.area_radius_, other.area_radius_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.area_ceiling_, other.area_ceiling_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.area_floor_, other.area_floor_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.category_eu_, other.category_eu_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.class_eu_, other.class_eu_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.operator_altitude_geo_, other.operator_altitude_geo_, epsilon)) return false;


      return true;
   }

   @Override
   public boolean equals(Object other)
   {
      if(other == null) return false;
      if(other == this) return true;
      if(!(other instanceof OpenDroneIdSystem)) return false;

      OpenDroneIdSystem otherMyClass = (OpenDroneIdSystem) other;

      if(this.timestamp_ != otherMyClass.timestamp_) return false;

      for(int i5 = 0; i5 < id_or_mac_.length; ++i5)
      {
                if(this.id_or_mac_[i5] != otherMyClass.id_or_mac_[i5]) return false;

      }
      if(this.operator_location_type_ != otherMyClass.operator_location_type_) return false;

      if(this.classification_type_ != otherMyClass.classification_type_) return false;

      if(this.operator_latitude_ != otherMyClass.operator_latitude_) return false;

      if(this.operator_longitude_ != otherMyClass.operator_longitude_) return false;

      if(this.area_count_ != otherMyClass.area_count_) return false;

      if(this.area_radius_ != otherMyClass.area_radius_) return false;

      if(this.area_ceiling_ != otherMyClass.area_ceiling_) return false;

      if(this.area_floor_ != otherMyClass.area_floor_) return false;

      if(this.category_eu_ != otherMyClass.category_eu_) return false;

      if(this.class_eu_ != otherMyClass.class_eu_) return false;

      if(this.operator_altitude_geo_ != otherMyClass.operator_altitude_geo_) return false;


      return true;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("OpenDroneIdSystem {");
      builder.append("timestamp=");
      builder.append(this.timestamp_);      builder.append(", ");
      builder.append("id_or_mac=");
      builder.append(java.util.Arrays.toString(this.id_or_mac_));      builder.append(", ");
      builder.append("operator_location_type=");
      builder.append(this.operator_location_type_);      builder.append(", ");
      builder.append("classification_type=");
      builder.append(this.classification_type_);      builder.append(", ");
      builder.append("operator_latitude=");
      builder.append(this.operator_latitude_);      builder.append(", ");
      builder.append("operator_longitude=");
      builder.append(this.operator_longitude_);      builder.append(", ");
      builder.append("area_count=");
      builder.append(this.area_count_);      builder.append(", ");
      builder.append("area_radius=");
      builder.append(this.area_radius_);      builder.append(", ");
      builder.append("area_ceiling=");
      builder.append(this.area_ceiling_);      builder.append(", ");
      builder.append("area_floor=");
      builder.append(this.area_floor_);      builder.append(", ");
      builder.append("category_eu=");
      builder.append(this.category_eu_);      builder.append(", ");
      builder.append("class_eu=");
      builder.append(this.class_eu_);      builder.append(", ");
      builder.append("operator_altitude_geo=");
      builder.append(this.operator_altitude_geo_);
      builder.append("}");
      return builder.toString();
   }
}
