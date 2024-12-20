package px4_msgs.msg.dds;

import us.ihmc.communication.packets.Packet;
import us.ihmc.euclid.interfaces.Settable;
import us.ihmc.euclid.interfaces.EpsilonComparable;
import java.util.function.Supplier;
import us.ihmc.pubsub.TopicDataType;

public class BatteryStatus extends Packet<BatteryStatus> implements Settable<BatteryStatus>, EpsilonComparable<BatteryStatus>
{
   public static final byte BATTERY_SOURCE_POWER_MODULE = (byte) 0;
   public static final byte BATTERY_SOURCE_EXTERNAL = (byte) 1;
   public static final byte BATTERY_SOURCE_ESCS = (byte) 2;
   /**
          * no battery low voltage warning active
          */
   public static final byte BATTERY_WARNING_NONE = (byte) 0;
   /**
          * warning of low voltage
          */
   public static final byte BATTERY_WARNING_LOW = (byte) 1;
   /**
          * critical voltage, return / abort immediately
          */
   public static final byte BATTERY_WARNING_CRITICAL = (byte) 2;
   /**
          * immediate landing required
          */
   public static final byte BATTERY_WARNING_EMERGENCY = (byte) 3;
   /**
          * the battery has failed completely
          */
   public static final byte BATTERY_WARNING_FAILED = (byte) 4;
   /**
          * Battery is diagnosed to be defective or an error occurred, usage is discouraged / prohibited. Possible causes (faults) are listed in faults field.
          */
   public static final byte BATTERY_STATE_UNHEALTHY = (byte) 6;
   /**
          * Battery is charging
          */
   public static final byte BATTERY_STATE_CHARGING = (byte) 7;
   /**
          * Battery has deep discharged
          */
   public static final byte BATTERY_FAULT_DEEP_DISCHARGE = (byte) 0;
   /**
          * Voltage spikes
          */
   public static final byte BATTERY_FAULT_SPIKES = (byte) 1;
   /**
          * One or more cells have failed
          */
   public static final byte BATTERY_FAULT_CELL_FAIL = (byte) 2;
   /**
          * Over-current
          */
   public static final byte BATTERY_FAULT_OVER_CURRENT = (byte) 3;
   /**
          * Over-temperature
          */
   public static final byte BATTERY_FAULT_OVER_TEMPERATURE = (byte) 4;
   /**
          * Under-temperature fault
          */
   public static final byte BATTERY_FAULT_UNDER_TEMPERATURE = (byte) 5;
   /**
          * Vehicle voltage is not compatible with this battery (batteries on same power rail should have similar voltage).
          */
   public static final byte BATTERY_FAULT_INCOMPATIBLE_VOLTAGE = (byte) 6;
   /**
          * Battery firmware is not compatible with current autopilot firmware
          */
   public static final byte BATTERY_FAULT_INCOMPATIBLE_FIRMWARE = (byte) 7;
   /**
          * Battery model is not supported by the system
          */
   public static final byte BATTERY_FAULT_INCOMPATIBLE_MODEL = (byte) 8;
   /**
          * hardware problem
          */
   public static final byte BATTERY_FAULT_HARDWARE_FAILURE = (byte) 9;
   /**
          * Battery had a problem while arming
          */
   public static final byte BATTERY_FAULT_FAILED_TO_ARM = (byte) 10;
   /**
          * Counter - keep it as last element!
          */
   public static final byte BATTERY_FAULT_COUNT = (byte) 11;
   public static final byte MAX_INSTANCES = (byte) 4;
   /**
            * time since system start (microseconds)
            */
   public long timestamp_;
   /**
            * Whether or not a battery is connected, based on a voltage threshold
            */
   public boolean connected_;
   /**
            * Battery voltage in volts, 0 if unknown
            */
   public float voltage_v_;
   /**
            * Battery current in amperes, -1 if unknown
            */
   public float current_a_;
   /**
            * Battery current average in amperes (for FW average in level flight), -1 if unknown
            */
   public float current_average_a_;
   /**
            * Discharged amount in mAh, -1 if unknown
            */
   public float discharged_mah_;
   /**
            * From 1 to 0, -1 if unknown
            */
   public float remaining_;
   /**
            * Power scaling factor, >= 1, or -1 if unknown
            */
   public float scale_;
   /**
            * predicted time in seconds remaining until battery is empty under previous averaged load, NAN if unknown
            */
   public float time_remaining_s_;
   /**
            * Temperature of the battery in degrees Celcius, NaN if unknown
            */
   public float temperature_;
   /**
            * Number of cells, 0 if unknown
            */
   public byte cell_count_;
   /**
            * Battery source
            */
   public byte source_;
   /**
            * Zero based priority is the connection on the Power Controller V1..Vn AKA BrickN-1
            */
   public byte priority_;
   /**
            * actual capacity of the battery
            */
   public int capacity_;
   /**
            * number of discharge cycles the battery has experienced
            */
   public int cycle_count_;
   /**
            * predicted remaining battery capacity based on the average rate of discharge in min
            */
   public int average_time_to_empty_;
   /**
            * serial number of the battery pack
            */
   public int serial_number_;
   /**
            * manufacture date, part of serial number of the battery pack. Formatted as: Day + Month×32 + (Year–1980)×512
            */
   public int manufacture_date_;
   /**
            * state of health. FullChargeCapacity/DesignCapacity, 0-100%.
            */
   public int state_of_health_;
   /**
            * max error, expected margin of error in % in the state-of-charge calculation with a range of 1 to 100%
            */
   public int max_error_;
   /**
            * ID number of a battery. Should be unique and consistent for the lifetime of a vehicle. 1-indexed.
            */
   public byte id_;
   /**
            * interface error counter
            */
   public int interface_error_;
   /**
            * Battery individual cell voltages, 0 if unknown
            */
   public float[] voltage_cell_v_;
   /**
            * Max difference between individual cell voltages
            */
   public float max_cell_voltage_delta_;
   /**
            * Power off event imminent indication, false if unknown
            */
   public boolean is_powering_off_;
   /**
            * Set if the battery is explicitly required before arming
            */
   public boolean is_required_;
   /**
            * Smart battery supply status/fault flags (bitmask) for health indication.
            */
   public int faults_;
   /**
            * Current battery warning
            */
   public byte warning_;
   /**
            * The compensated battery capacity
            */
   public float full_charge_capacity_wh_;
   /**
            * The compensated battery capacity remaining
            */
   public float remaining_capacity_wh_;
   /**
            * Number of battery overdischarge
            */
   public int over_discharge_count_;
   /**
            * Nominal voltage of the battery pack
            */
   public float nominal_voltage_;
   /**
            * [Ohm] Internal resistance per cell estimate
            */
   public float internal_resistance_estimate_;
   /**
            * [V] Open circuit voltage estimate
            */
   public float ocv_estimate_;
   /**
            * [V] Filtered open circuit voltage estimate
            */
   public float ocv_estimate_filtered_;
   /**
            * [0, 1] Normalized volt based state of charge estimate
            */
   public float volt_based_soc_estimate_;
   /**
            * [V] Predicted voltage
            */
   public float voltage_prediction_;
   /**
            * [V] Prediction error
            */
   public float prediction_error_;
   /**
            * Norm of the covariance matrix
            */
   public float estimation_covariance_norm_;

   public BatteryStatus()
   {
      voltage_cell_v_ = new float[14];

   }

   public BatteryStatus(BatteryStatus other)
   {
      this();
      set(other);
   }

   public void set(BatteryStatus other)
   {
      timestamp_ = other.timestamp_;

      connected_ = other.connected_;

      voltage_v_ = other.voltage_v_;

      current_a_ = other.current_a_;

      current_average_a_ = other.current_average_a_;

      discharged_mah_ = other.discharged_mah_;

      remaining_ = other.remaining_;

      scale_ = other.scale_;

      time_remaining_s_ = other.time_remaining_s_;

      temperature_ = other.temperature_;

      cell_count_ = other.cell_count_;

      source_ = other.source_;

      priority_ = other.priority_;

      capacity_ = other.capacity_;

      cycle_count_ = other.cycle_count_;

      average_time_to_empty_ = other.average_time_to_empty_;

      serial_number_ = other.serial_number_;

      manufacture_date_ = other.manufacture_date_;

      state_of_health_ = other.state_of_health_;

      max_error_ = other.max_error_;

      id_ = other.id_;

      interface_error_ = other.interface_error_;

      for(int i1 = 0; i1 < voltage_cell_v_.length; ++i1)
      {
            voltage_cell_v_[i1] = other.voltage_cell_v_[i1];

      }

      max_cell_voltage_delta_ = other.max_cell_voltage_delta_;

      is_powering_off_ = other.is_powering_off_;

      is_required_ = other.is_required_;

      faults_ = other.faults_;

      warning_ = other.warning_;

      full_charge_capacity_wh_ = other.full_charge_capacity_wh_;

      remaining_capacity_wh_ = other.remaining_capacity_wh_;

      over_discharge_count_ = other.over_discharge_count_;

      nominal_voltage_ = other.nominal_voltage_;

      internal_resistance_estimate_ = other.internal_resistance_estimate_;

      ocv_estimate_ = other.ocv_estimate_;

      ocv_estimate_filtered_ = other.ocv_estimate_filtered_;

      volt_based_soc_estimate_ = other.volt_based_soc_estimate_;

      voltage_prediction_ = other.voltage_prediction_;

      prediction_error_ = other.prediction_error_;

      estimation_covariance_norm_ = other.estimation_covariance_norm_;

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
            * Whether or not a battery is connected, based on a voltage threshold
            */
   public void setConnected(boolean connected)
   {
      connected_ = connected;
   }
   /**
            * Whether or not a battery is connected, based on a voltage threshold
            */
   public boolean getConnected()
   {
      return connected_;
   }

   /**
            * Battery voltage in volts, 0 if unknown
            */
   public void setVoltageV(float voltage_v)
   {
      voltage_v_ = voltage_v;
   }
   /**
            * Battery voltage in volts, 0 if unknown
            */
   public float getVoltageV()
   {
      return voltage_v_;
   }

   /**
            * Battery current in amperes, -1 if unknown
            */
   public void setCurrentA(float current_a)
   {
      current_a_ = current_a;
   }
   /**
            * Battery current in amperes, -1 if unknown
            */
   public float getCurrentA()
   {
      return current_a_;
   }

   /**
            * Battery current average in amperes (for FW average in level flight), -1 if unknown
            */
   public void setCurrentAverageA(float current_average_a)
   {
      current_average_a_ = current_average_a;
   }
   /**
            * Battery current average in amperes (for FW average in level flight), -1 if unknown
            */
   public float getCurrentAverageA()
   {
      return current_average_a_;
   }

   /**
            * Discharged amount in mAh, -1 if unknown
            */
   public void setDischargedMah(float discharged_mah)
   {
      discharged_mah_ = discharged_mah;
   }
   /**
            * Discharged amount in mAh, -1 if unknown
            */
   public float getDischargedMah()
   {
      return discharged_mah_;
   }

   /**
            * From 1 to 0, -1 if unknown
            */
   public void setRemaining(float remaining)
   {
      remaining_ = remaining;
   }
   /**
            * From 1 to 0, -1 if unknown
            */
   public float getRemaining()
   {
      return remaining_;
   }

   /**
            * Power scaling factor, >= 1, or -1 if unknown
            */
   public void setScale(float scale)
   {
      scale_ = scale;
   }
   /**
            * Power scaling factor, >= 1, or -1 if unknown
            */
   public float getScale()
   {
      return scale_;
   }

   /**
            * predicted time in seconds remaining until battery is empty under previous averaged load, NAN if unknown
            */
   public void setTimeRemainingS(float time_remaining_s)
   {
      time_remaining_s_ = time_remaining_s;
   }
   /**
            * predicted time in seconds remaining until battery is empty under previous averaged load, NAN if unknown
            */
   public float getTimeRemainingS()
   {
      return time_remaining_s_;
   }

   /**
            * Temperature of the battery in degrees Celcius, NaN if unknown
            */
   public void setTemperature(float temperature)
   {
      temperature_ = temperature;
   }
   /**
            * Temperature of the battery in degrees Celcius, NaN if unknown
            */
   public float getTemperature()
   {
      return temperature_;
   }

   /**
            * Number of cells, 0 if unknown
            */
   public void setCellCount(byte cell_count)
   {
      cell_count_ = cell_count;
   }
   /**
            * Number of cells, 0 if unknown
            */
   public byte getCellCount()
   {
      return cell_count_;
   }

   /**
            * Battery source
            */
   public void setSource(byte source)
   {
      source_ = source;
   }
   /**
            * Battery source
            */
   public int getSource()
   {
      return source_;
   }

   /**
            * Zero based priority is the connection on the Power Controller V1..Vn AKA BrickN-1
            */
   public void setPriority(byte priority)
   {
      priority_ = priority;
   }
   /**
            * Zero based priority is the connection on the Power Controller V1..Vn AKA BrickN-1
            */
   public byte getPriority()
   {
      return priority_;
   }

   /**
            * actual capacity of the battery
            */
   public void setCapacity(int capacity)
   {
      capacity_ = capacity;
   }
   /**
            * actual capacity of the battery
            */
   public int getCapacity()
   {
      return capacity_;
   }

   /**
            * number of discharge cycles the battery has experienced
            */
   public void setCycleCount(int cycle_count)
   {
      cycle_count_ = cycle_count;
   }
   /**
            * number of discharge cycles the battery has experienced
            */
   public int getCycleCount()
   {
      return cycle_count_;
   }

   /**
            * predicted remaining battery capacity based on the average rate of discharge in min
            */
   public void setAverageTimeToEmpty(int average_time_to_empty)
   {
      average_time_to_empty_ = average_time_to_empty;
   }
   /**
            * predicted remaining battery capacity based on the average rate of discharge in min
            */
   public int getAverageTimeToEmpty()
   {
      return average_time_to_empty_;
   }

   /**
            * serial number of the battery pack
            */
   public void setSerialNumber(int serial_number)
   {
      serial_number_ = serial_number;
   }
   /**
            * serial number of the battery pack
            */
   public int getSerialNumber()
   {
      return serial_number_;
   }

   /**
            * manufacture date, part of serial number of the battery pack. Formatted as: Day + Month×32 + (Year–1980)×512
            */
   public void setManufactureDate(int manufacture_date)
   {
      manufacture_date_ = manufacture_date;
   }
   /**
            * manufacture date, part of serial number of the battery pack. Formatted as: Day + Month×32 + (Year–1980)×512
            */
   public int getManufactureDate()
   {
      return manufacture_date_;
   }

   /**
            * state of health. FullChargeCapacity/DesignCapacity, 0-100%.
            */
   public void setStateOfHealth(int state_of_health)
   {
      state_of_health_ = state_of_health;
   }
   /**
            * state of health. FullChargeCapacity/DesignCapacity, 0-100%.
            */
   public int getStateOfHealth()
   {
      return state_of_health_;
   }

   /**
            * max error, expected margin of error in % in the state-of-charge calculation with a range of 1 to 100%
            */
   public void setMaxError(int max_error)
   {
      max_error_ = max_error;
   }
   /**
            * max error, expected margin of error in % in the state-of-charge calculation with a range of 1 to 100%
            */
   public int getMaxError()
   {
      return max_error_;
   }

   /**
            * ID number of a battery. Should be unique and consistent for the lifetime of a vehicle. 1-indexed.
            */
   public void setId(byte id)
   {
      id_ = id;
   }
   /**
            * ID number of a battery. Should be unique and consistent for the lifetime of a vehicle. 1-indexed.
            */
   public byte getId()
   {
      return id_;
   }

   /**
            * interface error counter
            */
   public void setInterfaceError(int interface_error)
   {
      interface_error_ = interface_error;
   }
   /**
            * interface error counter
            */
   public int getInterfaceError()
   {
      return interface_error_;
   }


   /**
            * Battery individual cell voltages, 0 if unknown
            */
   public float[] getVoltageCellV()
   {
      return voltage_cell_v_;
   }

   /**
            * Max difference between individual cell voltages
            */
   public void setMaxCellVoltageDelta(float max_cell_voltage_delta)
   {
      max_cell_voltage_delta_ = max_cell_voltage_delta;
   }
   /**
            * Max difference between individual cell voltages
            */
   public float getMaxCellVoltageDelta()
   {
      return max_cell_voltage_delta_;
   }

   /**
            * Power off event imminent indication, false if unknown
            */
   public void setIsPoweringOff(boolean is_powering_off)
   {
      is_powering_off_ = is_powering_off;
   }
   /**
            * Power off event imminent indication, false if unknown
            */
   public boolean getIsPoweringOff()
   {
      return is_powering_off_;
   }

   /**
            * Set if the battery is explicitly required before arming
            */
   public void setIsRequired(boolean is_required)
   {
      is_required_ = is_required;
   }
   /**
            * Set if the battery is explicitly required before arming
            */
   public boolean getIsRequired()
   {
      return is_required_;
   }

   /**
            * Smart battery supply status/fault flags (bitmask) for health indication.
            */
   public void setFaults(int faults)
   {
      faults_ = faults;
   }
   /**
            * Smart battery supply status/fault flags (bitmask) for health indication.
            */
   public int getFaults()
   {
      return faults_;
   }

   /**
            * Current battery warning
            */
   public void setWarning(byte warning)
   {
      warning_ = warning;
   }
   /**
            * Current battery warning
            */
   public byte getWarning()
   {
      return warning_;
   }

   /**
            * The compensated battery capacity
            */
   public void setFullChargeCapacityWh(float full_charge_capacity_wh)
   {
      full_charge_capacity_wh_ = full_charge_capacity_wh;
   }
   /**
            * The compensated battery capacity
            */
   public float getFullChargeCapacityWh()
   {
      return full_charge_capacity_wh_;
   }

   /**
            * The compensated battery capacity remaining
            */
   public void setRemainingCapacityWh(float remaining_capacity_wh)
   {
      remaining_capacity_wh_ = remaining_capacity_wh;
   }
   /**
            * The compensated battery capacity remaining
            */
   public float getRemainingCapacityWh()
   {
      return remaining_capacity_wh_;
   }

   /**
            * Number of battery overdischarge
            */
   public void setOverDischargeCount(int over_discharge_count)
   {
      over_discharge_count_ = over_discharge_count;
   }
   /**
            * Number of battery overdischarge
            */
   public int getOverDischargeCount()
   {
      return over_discharge_count_;
   }

   /**
            * Nominal voltage of the battery pack
            */
   public void setNominalVoltage(float nominal_voltage)
   {
      nominal_voltage_ = nominal_voltage;
   }
   /**
            * Nominal voltage of the battery pack
            */
   public float getNominalVoltage()
   {
      return nominal_voltage_;
   }

   /**
            * [Ohm] Internal resistance per cell estimate
            */
   public void setInternalResistanceEstimate(float internal_resistance_estimate)
   {
      internal_resistance_estimate_ = internal_resistance_estimate;
   }
   /**
            * [Ohm] Internal resistance per cell estimate
            */
   public float getInternalResistanceEstimate()
   {
      return internal_resistance_estimate_;
   }

   /**
            * [V] Open circuit voltage estimate
            */
   public void setOcvEstimate(float ocv_estimate)
   {
      ocv_estimate_ = ocv_estimate;
   }
   /**
            * [V] Open circuit voltage estimate
            */
   public float getOcvEstimate()
   {
      return ocv_estimate_;
   }

   /**
            * [V] Filtered open circuit voltage estimate
            */
   public void setOcvEstimateFiltered(float ocv_estimate_filtered)
   {
      ocv_estimate_filtered_ = ocv_estimate_filtered;
   }
   /**
            * [V] Filtered open circuit voltage estimate
            */
   public float getOcvEstimateFiltered()
   {
      return ocv_estimate_filtered_;
   }

   /**
            * [0, 1] Normalized volt based state of charge estimate
            */
   public void setVoltBasedSocEstimate(float volt_based_soc_estimate)
   {
      volt_based_soc_estimate_ = volt_based_soc_estimate;
   }
   /**
            * [0, 1] Normalized volt based state of charge estimate
            */
   public float getVoltBasedSocEstimate()
   {
      return volt_based_soc_estimate_;
   }

   /**
            * [V] Predicted voltage
            */
   public void setVoltagePrediction(float voltage_prediction)
   {
      voltage_prediction_ = voltage_prediction;
   }
   /**
            * [V] Predicted voltage
            */
   public float getVoltagePrediction()
   {
      return voltage_prediction_;
   }

   /**
            * [V] Prediction error
            */
   public void setPredictionError(float prediction_error)
   {
      prediction_error_ = prediction_error;
   }
   /**
            * [V] Prediction error
            */
   public float getPredictionError()
   {
      return prediction_error_;
   }

   /**
            * Norm of the covariance matrix
            */
   public void setEstimationCovarianceNorm(float estimation_covariance_norm)
   {
      estimation_covariance_norm_ = estimation_covariance_norm;
   }
   /**
            * Norm of the covariance matrix
            */
   public float getEstimationCovarianceNorm()
   {
      return estimation_covariance_norm_;
   }


   public static Supplier<BatteryStatusPubSubType> getPubSubType()
   {
      return BatteryStatusPubSubType::new;
   }

   @Override
   public Supplier<TopicDataType> getPubSubTypePacket()
   {
      return BatteryStatusPubSubType::new;
   }

   @Override
   public boolean epsilonEquals(BatteryStatus other, double epsilon)
   {
      if(other == null) return false;
      if(other == this) return true;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.timestamp_, other.timestamp_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.connected_, other.connected_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.voltage_v_, other.voltage_v_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.current_a_, other.current_a_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.current_average_a_, other.current_average_a_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.discharged_mah_, other.discharged_mah_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.remaining_, other.remaining_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.scale_, other.scale_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.time_remaining_s_, other.time_remaining_s_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.temperature_, other.temperature_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.cell_count_, other.cell_count_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.source_, other.source_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.priority_, other.priority_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.capacity_, other.capacity_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.cycle_count_, other.cycle_count_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.average_time_to_empty_, other.average_time_to_empty_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.serial_number_, other.serial_number_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.manufacture_date_, other.manufacture_date_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.state_of_health_, other.state_of_health_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.max_error_, other.max_error_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.id_, other.id_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.interface_error_, other.interface_error_, epsilon)) return false;

      for(int i3 = 0; i3 < voltage_cell_v_.length; ++i3)
      {
                if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.voltage_cell_v_[i3], other.voltage_cell_v_[i3], epsilon)) return false;
      }

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.max_cell_voltage_delta_, other.max_cell_voltage_delta_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.is_powering_off_, other.is_powering_off_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsBoolean(this.is_required_, other.is_required_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.faults_, other.faults_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.warning_, other.warning_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.full_charge_capacity_wh_, other.full_charge_capacity_wh_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.remaining_capacity_wh_, other.remaining_capacity_wh_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.over_discharge_count_, other.over_discharge_count_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.nominal_voltage_, other.nominal_voltage_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.internal_resistance_estimate_, other.internal_resistance_estimate_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.ocv_estimate_, other.ocv_estimate_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.ocv_estimate_filtered_, other.ocv_estimate_filtered_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.volt_based_soc_estimate_, other.volt_based_soc_estimate_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.voltage_prediction_, other.voltage_prediction_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.prediction_error_, other.prediction_error_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.estimation_covariance_norm_, other.estimation_covariance_norm_, epsilon)) return false;


      return true;
   }

   @Override
   public boolean equals(Object other)
   {
      if(other == null) return false;
      if(other == this) return true;
      if(!(other instanceof BatteryStatus)) return false;

      BatteryStatus otherMyClass = (BatteryStatus) other;

      if(this.timestamp_ != otherMyClass.timestamp_) return false;

      if(this.connected_ != otherMyClass.connected_) return false;

      if(this.voltage_v_ != otherMyClass.voltage_v_) return false;

      if(this.current_a_ != otherMyClass.current_a_) return false;

      if(this.current_average_a_ != otherMyClass.current_average_a_) return false;

      if(this.discharged_mah_ != otherMyClass.discharged_mah_) return false;

      if(this.remaining_ != otherMyClass.remaining_) return false;

      if(this.scale_ != otherMyClass.scale_) return false;

      if(this.time_remaining_s_ != otherMyClass.time_remaining_s_) return false;

      if(this.temperature_ != otherMyClass.temperature_) return false;

      if(this.cell_count_ != otherMyClass.cell_count_) return false;

      if(this.source_ != otherMyClass.source_) return false;

      if(this.priority_ != otherMyClass.priority_) return false;

      if(this.capacity_ != otherMyClass.capacity_) return false;

      if(this.cycle_count_ != otherMyClass.cycle_count_) return false;

      if(this.average_time_to_empty_ != otherMyClass.average_time_to_empty_) return false;

      if(this.serial_number_ != otherMyClass.serial_number_) return false;

      if(this.manufacture_date_ != otherMyClass.manufacture_date_) return false;

      if(this.state_of_health_ != otherMyClass.state_of_health_) return false;

      if(this.max_error_ != otherMyClass.max_error_) return false;

      if(this.id_ != otherMyClass.id_) return false;

      if(this.interface_error_ != otherMyClass.interface_error_) return false;

      for(int i5 = 0; i5 < voltage_cell_v_.length; ++i5)
      {
                if(this.voltage_cell_v_[i5] != otherMyClass.voltage_cell_v_[i5]) return false;

      }
      if(this.max_cell_voltage_delta_ != otherMyClass.max_cell_voltage_delta_) return false;

      if(this.is_powering_off_ != otherMyClass.is_powering_off_) return false;

      if(this.is_required_ != otherMyClass.is_required_) return false;

      if(this.faults_ != otherMyClass.faults_) return false;

      if(this.warning_ != otherMyClass.warning_) return false;

      if(this.full_charge_capacity_wh_ != otherMyClass.full_charge_capacity_wh_) return false;

      if(this.remaining_capacity_wh_ != otherMyClass.remaining_capacity_wh_) return false;

      if(this.over_discharge_count_ != otherMyClass.over_discharge_count_) return false;

      if(this.nominal_voltage_ != otherMyClass.nominal_voltage_) return false;

      if(this.internal_resistance_estimate_ != otherMyClass.internal_resistance_estimate_) return false;

      if(this.ocv_estimate_ != otherMyClass.ocv_estimate_) return false;

      if(this.ocv_estimate_filtered_ != otherMyClass.ocv_estimate_filtered_) return false;

      if(this.volt_based_soc_estimate_ != otherMyClass.volt_based_soc_estimate_) return false;

      if(this.voltage_prediction_ != otherMyClass.voltage_prediction_) return false;

      if(this.prediction_error_ != otherMyClass.prediction_error_) return false;

      if(this.estimation_covariance_norm_ != otherMyClass.estimation_covariance_norm_) return false;


      return true;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("BatteryStatus {");
      builder.append("timestamp=");
      builder.append(this.timestamp_);      builder.append(", ");
      builder.append("connected=");
      builder.append(this.connected_);      builder.append(", ");
      builder.append("voltage_v=");
      builder.append(this.voltage_v_);      builder.append(", ");
      builder.append("current_a=");
      builder.append(this.current_a_);      builder.append(", ");
      builder.append("current_average_a=");
      builder.append(this.current_average_a_);      builder.append(", ");
      builder.append("discharged_mah=");
      builder.append(this.discharged_mah_);      builder.append(", ");
      builder.append("remaining=");
      builder.append(this.remaining_);      builder.append(", ");
      builder.append("scale=");
      builder.append(this.scale_);      builder.append(", ");
      builder.append("time_remaining_s=");
      builder.append(this.time_remaining_s_);      builder.append(", ");
      builder.append("temperature=");
      builder.append(this.temperature_);      builder.append(", ");
      builder.append("cell_count=");
      builder.append(this.cell_count_);      builder.append(", ");
      builder.append("source=");
      builder.append(this.source_);      builder.append(", ");
      builder.append("priority=");
      builder.append(this.priority_);      builder.append(", ");
      builder.append("capacity=");
      builder.append(this.capacity_);      builder.append(", ");
      builder.append("cycle_count=");
      builder.append(this.cycle_count_);      builder.append(", ");
      builder.append("average_time_to_empty=");
      builder.append(this.average_time_to_empty_);      builder.append(", ");
      builder.append("serial_number=");
      builder.append(this.serial_number_);      builder.append(", ");
      builder.append("manufacture_date=");
      builder.append(this.manufacture_date_);      builder.append(", ");
      builder.append("state_of_health=");
      builder.append(this.state_of_health_);      builder.append(", ");
      builder.append("max_error=");
      builder.append(this.max_error_);      builder.append(", ");
      builder.append("id=");
      builder.append(this.id_);      builder.append(", ");
      builder.append("interface_error=");
      builder.append(this.interface_error_);      builder.append(", ");
      builder.append("voltage_cell_v=");
      builder.append(java.util.Arrays.toString(this.voltage_cell_v_));      builder.append(", ");
      builder.append("max_cell_voltage_delta=");
      builder.append(this.max_cell_voltage_delta_);      builder.append(", ");
      builder.append("is_powering_off=");
      builder.append(this.is_powering_off_);      builder.append(", ");
      builder.append("is_required=");
      builder.append(this.is_required_);      builder.append(", ");
      builder.append("faults=");
      builder.append(this.faults_);      builder.append(", ");
      builder.append("warning=");
      builder.append(this.warning_);      builder.append(", ");
      builder.append("full_charge_capacity_wh=");
      builder.append(this.full_charge_capacity_wh_);      builder.append(", ");
      builder.append("remaining_capacity_wh=");
      builder.append(this.remaining_capacity_wh_);      builder.append(", ");
      builder.append("over_discharge_count=");
      builder.append(this.over_discharge_count_);      builder.append(", ");
      builder.append("nominal_voltage=");
      builder.append(this.nominal_voltage_);      builder.append(", ");
      builder.append("internal_resistance_estimate=");
      builder.append(this.internal_resistance_estimate_);      builder.append(", ");
      builder.append("ocv_estimate=");
      builder.append(this.ocv_estimate_);      builder.append(", ");
      builder.append("ocv_estimate_filtered=");
      builder.append(this.ocv_estimate_filtered_);      builder.append(", ");
      builder.append("volt_based_soc_estimate=");
      builder.append(this.volt_based_soc_estimate_);      builder.append(", ");
      builder.append("voltage_prediction=");
      builder.append(this.voltage_prediction_);      builder.append(", ");
      builder.append("prediction_error=");
      builder.append(this.prediction_error_);      builder.append(", ");
      builder.append("estimation_covariance_norm=");
      builder.append(this.estimation_covariance_norm_);
      builder.append("}");
      return builder.toString();
   }
}
