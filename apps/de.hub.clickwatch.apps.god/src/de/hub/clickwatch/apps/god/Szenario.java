package de.hub.clickwatch.apps.god;

import java.util.HashMap;
import java.util.List;

import de.hub.clickwatch.apps.god.node.NodeInformationProcessor;

public interface Szenario {
	
	public float[] get_AP_METRIC_POSITION(String mac);
	
	public int get_NODE_POCESSING_TIMER();
	
	public int get_GATEWAY_POCESSING_TIMER();
	
	public int get_WAIT_AFTER_ASKING_ERROR();
	
	public int get_GATEWAY_PROCESSING_TIMER();
	
	public int get_COMPUTE_POSITION_TIMER();
	
	public int get_WAIT_AFTER_COMPUTE_POSITION_ERROR();
	
	public char get_LINKTABLE_SEPARATOR();
	
	public String[][] get_ACCESS_POINTS();
	
	public void set_ACCESS_POINTS(String[][] aps);
	
	public String[] get_GET_CHANNEL_HANDLER();
	
	public String[] get_SET_CHANNEL_HANDLER(int channel);
	
	public Class<? extends NodeInformationProcessor> get_CHANNEL_PROCESSOR();
	
	public String[] get_GET_ROUTINGTABLE_HANDLER();
	
	public String[] get_SET_ROUTINGTABLE_HANDLER();
	
	public Class<? extends NodeInformationProcessor> get_ROUTINGTABLE_PROCESSOR();
	
	public String[] get_GET_LINKTABLE_HANDLER();
	
	public String[] get_SET_LINKTABLE_HANDLER();
	
	public Class<? extends NodeInformationProcessor> get_LINKTABLE_PROCESSOR();
	
	public String[] get_GET_POWER_HANDLER();
	
	public String[] get_SET_POWER_HANDLER(int power);
	
	public Class<? extends NodeInformationProcessor> get_POWER_PROCESSOR();
	
	public String[] get_STATS_HANDLER();
	
	public Class<? extends NodeInformationProcessor> get_STATS_PROCESSOR();
	
	public String[] get_GPS_HANDLER();
	
	public Class<? extends NodeInformationProcessor> get_GPS_PROCESSOR();
	
	public String[] get_FLOWINFO_HANDLER();
	
	public Class<? extends NodeInformationProcessor> get_FLOWINFO_PROCESSOR();
	
	public String[] get_FLOWSTAT_HANDLER();
	
	public Class<? extends NodeInformationProcessor> get_FLOWSTAT_PROCESSOR();
	
	public String[] get_CHANNELSTAT_HANDLER();

	public Class<? extends NodeInformationProcessor> get_CHANNELSTAT_PROCESSOR();
	
    public String[] get_LINK_HANDLER();

	public Class<? extends NodeInformationProcessor> get_LINK_PROCESSOR();

	public String[] get_GATEWAY();
	
	public String[] get_GATEWAY_HANDLER();
	
	public Class<? extends NodeInformationProcessor> get_GATEWAY_PROCESSOR();
	
	public String get_TRAINING_GPS_RSSI_DATA_FOLDER();
	
	public List<String> get_TRAINING_GPS_RSSI_DATA();
	
	public HashMap<String, String> get_DATA_MAP_ENDING();
	
	public boolean get_USE_FILE_FOR_NODE_PROCESSOR();
	
	public String get_NODE_PROCESSOR_FILEROOT();
}