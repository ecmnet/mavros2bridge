package px4_msgs.msg.dds;

/**
* 
* Topic data type of the struct "PowerMonitor" defined in "PowerMonitor_.idl". Use this class to provide the TopicDataType to a Participant. 
*
* This file was automatically generated from PowerMonitor_.idl by us.ihmc.idl.generator.IDLGenerator. 
* Do not update this file directly, edit PowerMonitor_.idl instead.
*
*/
public class PowerMonitorPubSubType implements us.ihmc.pubsub.TopicDataType<px4_msgs.msg.dds.PowerMonitor>
{
   public static final java.lang.String name = "px4_msgs::msg::dds_::PowerMonitor_";
   
   @Override
   public final java.lang.String getDefinitionChecksum()
   {
   		return "e5378017259ffec6258645d7750264bd7b560711f074c4917e38cd8e767d26ac";
   }
   
   @Override
   public final java.lang.String getDefinitionVersion()
   {
   		return "";
   }

   private final us.ihmc.idl.CDR serializeCDR = new us.ihmc.idl.CDR();
   private final us.ihmc.idl.CDR deserializeCDR = new us.ihmc.idl.CDR();

   @Override
   public void serialize(px4_msgs.msg.dds.PowerMonitor data, us.ihmc.pubsub.common.SerializedPayload serializedPayload) throws java.io.IOException
   {
      serializeCDR.serialize(serializedPayload);
      write(data, serializeCDR);
      serializeCDR.finishSerialize();
   }

   @Override
   public void deserialize(us.ihmc.pubsub.common.SerializedPayload serializedPayload, px4_msgs.msg.dds.PowerMonitor data) throws java.io.IOException
   {
      deserializeCDR.deserialize(serializedPayload);
      read(data, deserializeCDR);
      deserializeCDR.finishDeserialize();
   }

   public static int getMaxCdrSerializedSize()
   {
      return getMaxCdrSerializedSize(0);
   }

   public static int getMaxCdrSerializedSize(int current_alignment)
   {
      int initial_alignment = current_alignment;

      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);

      current_alignment += 2 + us.ihmc.idl.CDR.alignment(current_alignment, 2);

      current_alignment += 2 + us.ihmc.idl.CDR.alignment(current_alignment, 2);

      current_alignment += 2 + us.ihmc.idl.CDR.alignment(current_alignment, 2);

      current_alignment += 2 + us.ihmc.idl.CDR.alignment(current_alignment, 2);

      current_alignment += 2 + us.ihmc.idl.CDR.alignment(current_alignment, 2);

      current_alignment += 2 + us.ihmc.idl.CDR.alignment(current_alignment, 2);

      current_alignment += 2 + us.ihmc.idl.CDR.alignment(current_alignment, 2);

      current_alignment += 2 + us.ihmc.idl.CDR.alignment(current_alignment, 2);


      return current_alignment - initial_alignment;
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.PowerMonitor data)
   {
      return getCdrSerializedSize(data, 0);
   }

   public final static int getCdrSerializedSize(px4_msgs.msg.dds.PowerMonitor data, int current_alignment)
   {
      int initial_alignment = current_alignment;

      current_alignment += 8 + us.ihmc.idl.CDR.alignment(current_alignment, 8);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 4 + us.ihmc.idl.CDR.alignment(current_alignment, 4);


      current_alignment += 2 + us.ihmc.idl.CDR.alignment(current_alignment, 2);


      current_alignment += 2 + us.ihmc.idl.CDR.alignment(current_alignment, 2);


      current_alignment += 2 + us.ihmc.idl.CDR.alignment(current_alignment, 2);


      current_alignment += 2 + us.ihmc.idl.CDR.alignment(current_alignment, 2);


      current_alignment += 2 + us.ihmc.idl.CDR.alignment(current_alignment, 2);


      current_alignment += 2 + us.ihmc.idl.CDR.alignment(current_alignment, 2);


      current_alignment += 2 + us.ihmc.idl.CDR.alignment(current_alignment, 2);


      current_alignment += 2 + us.ihmc.idl.CDR.alignment(current_alignment, 2);



      return current_alignment - initial_alignment;
   }

   public static void write(px4_msgs.msg.dds.PowerMonitor data, us.ihmc.idl.CDR cdr)
   {
      cdr.write_type_12(data.getTimestamp());

      cdr.write_type_5(data.getVoltageV());

      cdr.write_type_5(data.getCurrentA());

      cdr.write_type_5(data.getPowerW());

      cdr.write_type_1(data.getRconf());

      cdr.write_type_1(data.getRsv());

      cdr.write_type_1(data.getRbv());

      cdr.write_type_1(data.getRp());

      cdr.write_type_1(data.getRc());

      cdr.write_type_1(data.getRcal());

      cdr.write_type_1(data.getMe());

      cdr.write_type_1(data.getAl());

   }

   public static void read(px4_msgs.msg.dds.PowerMonitor data, us.ihmc.idl.CDR cdr)
   {
      data.setTimestamp(cdr.read_type_12());
      	
      data.setVoltageV(cdr.read_type_5());
      	
      data.setCurrentA(cdr.read_type_5());
      	
      data.setPowerW(cdr.read_type_5());
      	
      data.setRconf(cdr.read_type_1());
      	
      data.setRsv(cdr.read_type_1());
      	
      data.setRbv(cdr.read_type_1());
      	
      data.setRp(cdr.read_type_1());
      	
      data.setRc(cdr.read_type_1());
      	
      data.setRcal(cdr.read_type_1());
      	
      data.setMe(cdr.read_type_1());
      	
      data.setAl(cdr.read_type_1());
      	

   }

   @Override
   public final void serialize(px4_msgs.msg.dds.PowerMonitor data, us.ihmc.idl.InterchangeSerializer ser)
   {
      ser.write_type_12("timestamp", data.getTimestamp());
      ser.write_type_5("voltage_v", data.getVoltageV());
      ser.write_type_5("current_a", data.getCurrentA());
      ser.write_type_5("power_w", data.getPowerW());
      ser.write_type_1("rconf", data.getRconf());
      ser.write_type_1("rsv", data.getRsv());
      ser.write_type_1("rbv", data.getRbv());
      ser.write_type_1("rp", data.getRp());
      ser.write_type_1("rc", data.getRc());
      ser.write_type_1("rcal", data.getRcal());
      ser.write_type_1("me", data.getMe());
      ser.write_type_1("al", data.getAl());
   }

   @Override
   public final void deserialize(us.ihmc.idl.InterchangeSerializer ser, px4_msgs.msg.dds.PowerMonitor data)
   {
      data.setTimestamp(ser.read_type_12("timestamp"));
      data.setVoltageV(ser.read_type_5("voltage_v"));
      data.setCurrentA(ser.read_type_5("current_a"));
      data.setPowerW(ser.read_type_5("power_w"));
      data.setRconf(ser.read_type_1("rconf"));
      data.setRsv(ser.read_type_1("rsv"));
      data.setRbv(ser.read_type_1("rbv"));
      data.setRp(ser.read_type_1("rp"));
      data.setRc(ser.read_type_1("rc"));
      data.setRcal(ser.read_type_1("rcal"));
      data.setMe(ser.read_type_1("me"));
      data.setAl(ser.read_type_1("al"));
   }

   public static void staticCopy(px4_msgs.msg.dds.PowerMonitor src, px4_msgs.msg.dds.PowerMonitor dest)
   {
      dest.set(src);
   }

   @Override
   public px4_msgs.msg.dds.PowerMonitor createData()
   {
      return new px4_msgs.msg.dds.PowerMonitor();
   }
   @Override
   public int getTypeSize()
   {
      return us.ihmc.idl.CDR.getTypeSize(getMaxCdrSerializedSize());
   }

   @Override
   public java.lang.String getName()
   {
      return name;
   }
   
   public void serialize(px4_msgs.msg.dds.PowerMonitor data, us.ihmc.idl.CDR cdr)
   {
      write(data, cdr);
   }

   public void deserialize(px4_msgs.msg.dds.PowerMonitor data, us.ihmc.idl.CDR cdr)
   {
      read(data, cdr);
   }
   
   public void copy(px4_msgs.msg.dds.PowerMonitor src, px4_msgs.msg.dds.PowerMonitor dest)
   {
      staticCopy(src, dest);
   }

   @Override
   public PowerMonitorPubSubType newInstance()
   {
      return new PowerMonitorPubSubType();
   }
}
