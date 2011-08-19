package de.hub.clickwatch.apps.god;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import de.hub.clickwatch.apps.god.node.NodeInformationProcessor;
import de.hub.clickwatch.apps.god.node.PowerProcessor;
import de.hub.clickwatch.apps.god.node.ChannelProcessor;
import de.hub.clickwatch.apps.god.node.StatsProcessor;
import de.hub.clickwatch.apps.god.node.ChannelStatsProcessor;
import de.hub.clickwatch.apps.god.node.GpsProcessor;
import de.hub.clickwatch.apps.god.node.LinkProcessor;
import de.hub.clickwatch.apps.god.node.LinktableProcessor;
import de.hub.clickwatch.apps.god.node.RoutingtableProcessor;
import de.hub.clickwatch.apps.god.node.MacIpProcessor;

public class SzenarioHWL implements Szenario {
	private static final int NODE_POCESSING_TIMER = 1000;
	private static final int GATEWAY_POCESSING_TIMER = 10000;
	private static final int WAIT_AFTER_ASKING_ERROR = 10 * 1000;	//seconds to wait after faulty read
	private static final int GATEWAY_PROCESSING_TIMER = 10000;
	private static final int COMPUTE_POSITION_TIMER = 3000;
	private static final int WAIT_AFTER_COMPUTE_POSITION_ERROR = 10000;
	
	public static final String[][] ACCESS_POINTS = new String[][] {
		{"192.168.3.71", "7777", "wgt71"},
		{"192.168.3.47", "7777", "wgt47"},
		{"192.168.3.38", "7777", "wgt38"},
		{"192.168.3.37", "7777", "wgt37"}
	};
	
	private static final String[] POWER = new String[] {"device_wifi/data_power", "systempower"};
	
	private static final Class<? extends NodeInformationProcessor> POWER_PROCESSOR = PowerProcessor.class;
	
	private static final String[] CHANNEL = new String[] {"device_wifi/wifidevice/sc", "systemchannel"};
	
	private static final Class<? extends NodeInformationProcessor> CHANNEL_PROCESSOR = ChannelProcessor.class;
	
	private static final String[] STATS_HANDLER = new String[] {"device_wifi/wifidevice/cst", "stats"};
	
	private static final Class<? extends NodeInformationProcessor> STATS_PROCESSOR = StatsProcessor.class;
	
	private static final String[] CHANNELSTAT_HANDLER = new String[] {"device_wifi/wifidevice/cst", "stats"};
	
	private static final Class<? extends NodeInformationProcessor> CHANNELSTAT_PROCESSOR = ChannelStatsProcessor.class;
	
	private static final String[] GPS_HANDLER = new String[] {"gps", "gps_coord"};
	
	private static final Class<? extends NodeInformationProcessor> GPS_PROCESSOR = GpsProcessor.class;

    private static final String[] LINK_HANDLER = new String[] {"device_wifi/link_stat", "bcast_stats"};

	private static final Class<? extends NodeInformationProcessor> LINK_PROCESSOR = LinkProcessor.class;
	
	private static final String[] GET_LINKTABLE_HANDLER = new String[] {"lt", "links"};
	
	private static final String[] SET_LINKTABLE_HANDLER = new String[] {"lt", "links"};

	private static final Class<? extends NodeInformationProcessor> LINKTABLE_PROCESSOR = LinktableProcessor.class;
	
	private static final String[] GET_ROUTINGTABLE_HANDLER = new String[] {"lt", "routes"};
	
	private static final String[] SET_ROUTINGTABLE_HANDLER = new String[] {"lt", "routes"};

	private static final Class<? extends NodeInformationProcessor> ROUTINGTABLE_PROCESSOR = RoutingtableProcessor.class;

	private static final String[] GATEWAY = new String[] {"192.168.4.164", "7777"};
	
	private static final String[] GATEWAY_HANDLER = new String[] {"lease_tab", "leases"};
	
	private static final Class<? extends NodeInformationProcessor> GATEWAY_PROCESSOR = MacIpProcessor.class;
	
	private static final boolean USE_FILE_FOR_NODE_PROCESSOR = false;
	
	private static final String NODE_PROCESSOR_FILEROOT = "../de.hub.clickwatch.apps.god/tmp/recorded/";
	
	private static final String TRAINING_GPS_RSSI_DATA_FOLDER = "../de.hub.clickwatch.apps.god/tmp/training/";
	private static final List<String> TRAINING_GPS_RSSI_DATA = new ArrayList<String>() {
		private static final long serialVersionUID = -8374827580494133616L;
		{
			add("06-1B-B1-05-3B-96");	//is 127.0.0.1 23469
			add("06-1B-B1-05-3B-9F");	//is 127.0.0.1 23468
			add("06-1B-B1-05-3B-A1");	//is 127.0.0.1 23466
			add("06-1B-B1-05-3B-8E");	//is 127.0.0.1 23481
			add("06-1B-B1-05-46-08");	//is 127.0.0.1 23464
			add("06-1B-B1-05-46-09");	//is 127.0.0.1 23463
			add("06-1B-B1-05-46-10");	//is 127.0.0.1 23470
			add("06-1B-B1-07-CD-97");	//is 127.0.0.1 23462
		}
	};
	private static final HashMap<String, String> DATA_MAP_ENDING = new HashMap<String, String>() {
		private static final long serialVersionUID = -8374827580494133616L;
		{
			put("rssi", "_Z.csv");		//rssi
			put("latitude", "_Y.csv");	//52,...
			put("longitude", "_X.csv");	//13,...
		}
	};
	
	
	
	@Override
	public String[][] get_ACCESS_POINTS() {
		return ACCESS_POINTS;
	}
	@Override
	public String[] get_STATS_HANDLER() {
		return STATS_HANDLER;
	}
	@Override
	public Class<? extends NodeInformationProcessor> get_STATS_PROCESSOR() {
		return STATS_PROCESSOR;
	}
	@Override
	public String[] get_LINK_HANDLER() {
		return LINK_HANDLER;
	}
	@Override
	public Class<? extends NodeInformationProcessor> get_LINK_PROCESSOR() {
		return LINK_PROCESSOR;
	}
	@Override
	public String[] get_CHANNELSTAT_HANDLER() {
		return CHANNELSTAT_HANDLER;
	}
	@Override
	public Class<? extends NodeInformationProcessor> get_CHANNELSTAT_PROCESSOR() {
		return CHANNELSTAT_PROCESSOR;
	}
    @Override
	public String[] get_GPS_HANDLER() {
		return GPS_HANDLER;
	}
	@Override
	public Class<? extends NodeInformationProcessor> get_GPS_PROCESSOR() {
		return GPS_PROCESSOR;
	}
	@Override
	public String[] get_GATEWAY() {
		return GATEWAY;
	}
	@Override
	public String[] get_GATEWAY_HANDLER() {
		return GATEWAY_HANDLER;
	}
	@Override
	public Class<? extends NodeInformationProcessor> get_GATEWAY_PROCESSOR() {
		return GATEWAY_PROCESSOR;
	}
	@Override
	public String get_TRAINING_GPS_RSSI_DATA_FOLDER() {
		return TRAINING_GPS_RSSI_DATA_FOLDER;
	}
	@Override
	public List<String> get_TRAINING_GPS_RSSI_DATA() {
		return TRAINING_GPS_RSSI_DATA;
	}
	@Override
	public HashMap<String, String> get_DATA_MAP_ENDING() {
		return DATA_MAP_ENDING;
	}
	@Override
	public int get_NODE_POCESSING_TIMER() {
		return NODE_POCESSING_TIMER;
	}
	@Override
	public int get_GATEWAY_POCESSING_TIMER() {
		return GATEWAY_POCESSING_TIMER;
	}
	@Override
	public int get_WAIT_AFTER_ASKING_ERROR() {
		return WAIT_AFTER_ASKING_ERROR;
	}
	@Override
	public int get_GATEWAY_PROCESSING_TIMER() {
		return GATEWAY_PROCESSING_TIMER;
	}
	@Override
	public int get_COMPUTE_POSITION_TIMER() {
		return COMPUTE_POSITION_TIMER;
	}
	@Override
	public int get_WAIT_AFTER_COMPUTE_POSITION_ERROR() {
		return WAIT_AFTER_COMPUTE_POSITION_ERROR;
	}
	@Override
	public String[] get_GET_CHANNEL_HANDLER() {
		return CHANNEL;
	}
	@Override
	public String[] get_SET_CHANNEL_HANDLER(int channel) {
		String[] returnStr = CHANNEL;
		returnStr[1] = returnStr[1] + " " + channel;
		return returnStr;
	}
	@Override
	public String[] get_GET_POWER_HANDLER() {
		return POWER;
	}
	@Override
	public String[] get_SET_POWER_HANDLER(int power) {
		String[] returnStr = POWER;
		returnStr[1] = returnStr[1] + " " + power;
		return returnStr;
	}
	@Override
	public Class<? extends NodeInformationProcessor> get_CHANNEL_PROCESSOR() {
		return CHANNEL_PROCESSOR;
	}
	@Override
	public Class<? extends NodeInformationProcessor> get_POWER_PROCESSOR() {
		return POWER_PROCESSOR;
	}
	@Override
	public boolean get_USE_FILE_FOR_NODE_PROCESSOR() {
		return USE_FILE_FOR_NODE_PROCESSOR;
	}
	@Override
	public String get_NODE_PROCESSOR_FILEROOT() {
		return NODE_PROCESSOR_FILEROOT;
	}
	@Override
	public String[] get_GET_ROUTINGTABLE_HANDLER() {
		return GET_ROUTINGTABLE_HANDLER;
	}
	@Override
	public String[] get_SET_ROUTINGTABLE_HANDLER() {
		return SET_ROUTINGTABLE_HANDLER;
	}
	@Override
	public Class<? extends NodeInformationProcessor> get_ROUTINGTABLE_PROCESSOR() {
		return ROUTINGTABLE_PROCESSOR;
	}
	@Override
	public String[] get_GET_LINKTABLE_HANDLER() {
		return GET_LINKTABLE_HANDLER;
	}
	@Override
	public String[] get_SET_LINKTABLE_HANDLER() {
		return SET_LINKTABLE_HANDLER;
	}
	@Override
	public Class<? extends NodeInformationProcessor> get_LINKTABLE_PROCESSOR() {
		return LINKTABLE_PROCESSOR;
	}
}
