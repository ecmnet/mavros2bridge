package px4_msgs.msg.dds;

import us.ihmc.communication.packets.Packet;
import us.ihmc.euclid.interfaces.Settable;
import us.ihmc.euclid.interfaces.EpsilonComparable;
import java.util.function.Supplier;
import us.ihmc.pubsub.TopicDataType;

public class FuelTankStatus extends Packet<FuelTankStatus> implements Settable<FuelTankStatus>, EpsilonComparable<FuelTankStatus>
{
   /**
          * fuel type not specified. Fuel levels are normalized (i.e., maximum is 1, and other levels are relative to 1).
          */
   public static final byte MAV_FUEL_TYPE_UNKNOWN = (byte) 0;
   /**
          * represents generic liquid fuels, such as gasoline or diesel. Fuel levels are measured in millilitres (ml), and flow rates in millilitres per second (ml/s).
          */
   public static final byte MAV_FUEL_TYPE_LIQUID = (byte) 1;
   /**
          * represents a gas fuel, such as hydrogen, methane, or propane. Fuel levels are in kilo-Pascal (kPa), and flow rates are in milliliters per second (ml/s).
          */
   public static final byte MAV_FUEL_TYPE_GAS = (byte) 2;
   /**
            * time since system start (microseconds)
            */
   public long timestamp_;
   /**
            * maximum fuel capacity. Must always be provided, either from the driver or a parameter
            */
   public float maximum_fuel_capacity_;
   /**
            * consumed fuel, NaN if not measured. Should not be inferred from the max fuel capacity
            */
   public float consumed_fuel_;
   /**
            * fuel consumption rate, NaN if not measured
            */
   public float fuel_consumption_rate_;
   /**
            * percentage of remaining fuel, UINT8_MAX if not provided
            */
   public byte percent_remaining_;
   /**
            * remaining fuel, NaN if not measured. Should not be inferred from the max fuel capacity
            */
   public float remaining_fuel_;
   /**
            * identifier for the fuel tank. Must match ID of other messages for same fuel system. 0 by default when only a single tank exists
            */
   public byte fuel_tank_id_;
   /**
            * type of fuel based on MAV_FUEL_TYPE enum. Set to MAV_FUEL_TYPE_UNKNOWN if unknown or it does not fit the provided types
            */
   public long fuel_type_;
   /**
            * fuel temperature in Kelvin, NaN if not measured
            */
   public float temperature_;

   public FuelTankStatus()
   {
   }

   public FuelTankStatus(FuelTankStatus other)
   {
      this();
      set(other);
   }

   public void set(FuelTankStatus other)
   {
      timestamp_ = other.timestamp_;

      maximum_fuel_capacity_ = other.maximum_fuel_capacity_;

      consumed_fuel_ = other.consumed_fuel_;

      fuel_consumption_rate_ = other.fuel_consumption_rate_;

      percent_remaining_ = other.percent_remaining_;

      remaining_fuel_ = other.remaining_fuel_;

      fuel_tank_id_ = other.fuel_tank_id_;

      fuel_type_ = other.fuel_type_;

      temperature_ = other.temperature_;

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
            * maximum fuel capacity. Must always be provided, either from the driver or a parameter
            */
   public void setMaximumFuelCapacity(float maximum_fuel_capacity)
   {
      maximum_fuel_capacity_ = maximum_fuel_capacity;
   }
   /**
            * maximum fuel capacity. Must always be provided, either from the driver or a parameter
            */
   public float getMaximumFuelCapacity()
   {
      return maximum_fuel_capacity_;
   }

   /**
            * consumed fuel, NaN if not measured. Should not be inferred from the max fuel capacity
            */
   public void setConsumedFuel(float consumed_fuel)
   {
      consumed_fuel_ = consumed_fuel;
   }
   /**
            * consumed fuel, NaN if not measured. Should not be inferred from the max fuel capacity
            */
   public float getConsumedFuel()
   {
      return consumed_fuel_;
   }

   /**
            * fuel consumption rate, NaN if not measured
            */
   public void setFuelConsumptionRate(float fuel_consumption_rate)
   {
      fuel_consumption_rate_ = fuel_consumption_rate;
   }
   /**
            * fuel consumption rate, NaN if not measured
            */
   public float getFuelConsumptionRate()
   {
      return fuel_consumption_rate_;
   }

   /**
            * percentage of remaining fuel, UINT8_MAX if not provided
            */
   public void setPercentRemaining(byte percent_remaining)
   {
      percent_remaining_ = percent_remaining;
   }
   /**
            * percentage of remaining fuel, UINT8_MAX if not provided
            */
   public byte getPercentRemaining()
   {
      return percent_remaining_;
   }

   /**
            * remaining fuel, NaN if not measured. Should not be inferred from the max fuel capacity
            */
   public void setRemainingFuel(float remaining_fuel)
   {
      remaining_fuel_ = remaining_fuel;
   }
   /**
            * remaining fuel, NaN if not measured. Should not be inferred from the max fuel capacity
            */
   public float getRemainingFuel()
   {
      return remaining_fuel_;
   }

   /**
            * identifier for the fuel tank. Must match ID of other messages for same fuel system. 0 by default when only a single tank exists
            */
   public void setFuelTankId(byte fuel_tank_id)
   {
      fuel_tank_id_ = fuel_tank_id;
   }
   /**
            * identifier for the fuel tank. Must match ID of other messages for same fuel system. 0 by default when only a single tank exists
            */
   public byte getFuelTankId()
   {
      return fuel_tank_id_;
   }

   /**
            * type of fuel based on MAV_FUEL_TYPE enum. Set to MAV_FUEL_TYPE_UNKNOWN if unknown or it does not fit the provided types
            */
   public void setFuelType(long fuel_type)
   {
      fuel_type_ = fuel_type;
   }
   /**
            * type of fuel based on MAV_FUEL_TYPE enum. Set to MAV_FUEL_TYPE_UNKNOWN if unknown or it does not fit the provided types
            */
   public long getFuelType()
   {
      return fuel_type_;
   }

   /**
            * fuel temperature in Kelvin, NaN if not measured
            */
   public void setTemperature(float temperature)
   {
      temperature_ = temperature;
   }
   /**
            * fuel temperature in Kelvin, NaN if not measured
            */
   public float getTemperature()
   {
      return temperature_;
   }


   public static Supplier<FuelTankStatusPubSubType> getPubSubType()
   {
      return FuelTankStatusPubSubType::new;
   }

   @Override
   public Supplier<TopicDataType> getPubSubTypePacket()
   {
      return FuelTankStatusPubSubType::new;
   }

   @Override
   public boolean epsilonEquals(FuelTankStatus other, double epsilon)
   {
      if(other == null) return false;
      if(other == this) return true;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_, other.timestamp_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.maximum_fuel_capacity_, other.maximum_fuel_capacity_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.consumed_fuel_, other.consumed_fuel_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.fuel_consumption_rate_, other.fuel_consumption_rate_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.percent_remaining_, other.percent_remaining_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.remaining_fuel_, other.remaining_fuel_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.fuel_tank_id_, other.fuel_tank_id_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.fuel_type_, other.fuel_type_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.temperature_, other.temperature_, epsilon)) return false;


      return true;
   }

   @Override
   public boolean equals(Object other)
   {
      if(other == null) return false;
      if(other == this) return true;
      if(!(other instanceof FuelTankStatus)) return false;

      FuelTankStatus otherMyClass = (FuelTankStatus) other;

      if(this.timestamp_ != otherMyClass.timestamp_) return false;

      if(this.maximum_fuel_capacity_ != otherMyClass.maximum_fuel_capacity_) return false;

      if(this.consumed_fuel_ != otherMyClass.consumed_fuel_) return false;

      if(this.fuel_consumption_rate_ != otherMyClass.fuel_consumption_rate_) return false;

      if(this.percent_remaining_ != otherMyClass.percent_remaining_) return false;

      if(this.remaining_fuel_ != otherMyClass.remaining_fuel_) return false;

      if(this.fuel_tank_id_ != otherMyClass.fuel_tank_id_) return false;

      if(this.fuel_type_ != otherMyClass.fuel_type_) return false;

      if(this.temperature_ != otherMyClass.temperature_) return false;


      return true;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("FuelTankStatus {");
      builder.append("timestamp=");
      builder.append(this.timestamp_);      builder.append(", ");
      builder.append("maximum_fuel_capacity=");
      builder.append(this.maximum_fuel_capacity_);      builder.append(", ");
      builder.append("consumed_fuel=");
      builder.append(this.consumed_fuel_);      builder.append(", ");
      builder.append("fuel_consumption_rate=");
      builder.append(this.fuel_consumption_rate_);      builder.append(", ");
      builder.append("percent_remaining=");
      builder.append(this.percent_remaining_);      builder.append(", ");
      builder.append("remaining_fuel=");
      builder.append(this.remaining_fuel_);      builder.append(", ");
      builder.append("fuel_tank_id=");
      builder.append(this.fuel_tank_id_);      builder.append(", ");
      builder.append("fuel_type=");
      builder.append(this.fuel_type_);      builder.append(", ");
      builder.append("temperature=");
      builder.append(this.temperature_);
      builder.append("}");
      return builder.toString();
   }
}
