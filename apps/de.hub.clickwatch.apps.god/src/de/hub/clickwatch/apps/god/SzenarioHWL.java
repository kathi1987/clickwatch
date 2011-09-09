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
import de.hub.clickwatch.apps.god.node.FlowstatsProcessor;
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
	public static final char LINKTABLE_SEPARATOR = ';';
	public static final float LINK_UPDATE_MIN_THRESHOLD = 0.15f;
	public static final int LINK_ADD_MIN_THRESHOLD = 5000;
	public static final int MODEL_SIZE_FACTOR = 8;
	
	private String[][] ACCESS_POINTS = new String[][] {
		//{"192.168.3.71", "7777", "wgt71"},
		//{"192.168.3.47", "7777", "wgt47"},
		//{"192.168.3.38", "7777", "wgt38"},
		//{"192.168.3.37", "7777", "wgt37"},
		
		{"192.168.3.34", "7777", "wgt34"},
		{"192.168.3.24", "7777", "wgt24"},
		{"192.168.3.31", "7777", "wgt31"},
		{"192.168.3.73", "7777", "wgt73"},
		{"192.168.3.45", "7777", "wgt45"},
		{"192.168.3.110", "7777", "sk110"},
		{"192.168.3.111", "7777", "sk111"},
		{"192.168.3.112", "7777", "sk112"}
		
		/*	
		{"127.0.0.1", "23454", "wgt34"},
		{"127.0.0.1", "23455", "wgt24"},
		{"127.0.0.1", "23456", "wgt31"},
		{"127.0.0.1", "23457", "wgt73"},
		{"127.0.0.1", "23458", "wgt45"},
		{"127.0.0.1", "23459", "sk110"},
		{"127.0.0.1", "23460", "sk111"},
		{"127.0.0.1", "23461", "sk112"}
		*/	
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
	
	private static final String[] FLOWSTATS_HANDLER = new String[] {"sf", "stats"};
	
	private static final Class<? extends NodeInformationProcessor> FLOWSTATS_PROCESSOR = FlowstatsProcessor.class;

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
	
	private static final String[][] AP_POSITIONS = new String[][] {
		{"pc118", "06-11-6B-61-CF-C4", "52.4293410000", "13.5306580000", "38.0", "-14.0", "-4.0", "-2.0"},
		{"sk110", "06-0B-6B-09-ED-73", "0.0000000000", "0.0000000000", "0.0", "-7.0", "25.0", "3.5"},
		{"sk111", "06-0B-6B-09-F2-94", "0.0000000000", "0.0000000000", "0.0", "-7.0", "25.0", "3.5"},
		{"sk112", "06-0C-42-0C-74-0D", "0.0000000000", "0.0000000000", "0.0", "-7.0", "25.0", "3.5"},
		{"wgt23", "06-0F-B5-3F-42-62", "52.4294580000", "13.5313600000", "38.0", "34.0", "-4.0", "11.0"},
		{"wgt24", "06-0F-B5-3F-21-3C", "52.4293620000", "13.5302120000", "38.0", "-45.0", "-4.0", "0.0"},
		{"wgt25", "06-0F-B5-0B-95-29", "52.4296020000", "13.5311700000", "38.0", "21.0", "-4.0", "27.0"},
		{"wgt28", "06-0F-B5-97-33-1D", "52.4295270000", "13.5312830000", "42.0", "28.0", "0.0", "18.0"},
		{"wgt29", "06-0F-B5-97-36-9A", "52.4296760000", "13.5308240000", "38.0", "-3.0", "-4.0", "35.0"},
		{"wgt31", "06-0F-B5-97-33-6C", "52.4289940000", "13.5298610000", "46.0", "-68.0", "4.0", "-41.0"},
		{"wgt32", "06-0F-B5-3F-45-57", "52.4294650000", "13.5304750000", "34.0", "-27.0", "-8.0", "11.0"},
		{"wgt33", "06-0F-B5-3F-1E-C7", "52.4293090000", "13.5307300000", "34.0", "-9.0", "-8.0", "-6.0"},
		{"wgt34", "06-0F-B5-3F-22-E9", "52.4293030000", "13.5300650000", "38.0", "-55.0", "-4.0", "-7.0"},
		{"wgt35", "06-0F-B5-3F-22-EC", "52.4293880000", "13.5301670000", "38.0", "-48.0", "-4.0", "3.0"},
		{"wgt37", "06-0F-B5-97-33-D2", "52.4294470000", "13.5311830000", "46.0", "21.0", "4.0", "9.0"},
		{"wgt38", "06-0F-B5-97-25-7B", "52.4295450000", "13.5310090000", "46.0", "10.0", "4.0", "20.0"},
		{"wgt39", "06-0F-B5-97-38-5A", "52.4295790000", "13.5304940000", "0.0", "-7.0", "25.0", "3.5"},
		{"wgt40", "06-0F-B5-97-37-FC", "52.4292390000", "13.5309550000", "38.0", "6.0", "-4.0", "-14.0"},
		{"wgt42", "06-0F-B5-3F-20-D6", "52.4309090000", "13.5310010000", "37.0", "-7.0", "25.0", "3.5"},
		{"wgt43", "06-0F-B5-3F-21-81", "52.4309690000", "13.5308130000", "33.0", "-117.7", "133.4", "-2.5"},
		{"wgt44", "06-0F-B5-3F-56-B1", "52.4290310000", "13.5300490000", "34.0", "-56.0", "-8.0", "-37.0"},
		{"wgt45", "06-0F-B5-3F-58-49", "52.4309920000", "13.5314600000", "33.0", "-151.0", "103.7", "-2.5"},
		{"wgt46", "06-0F-B5-97-36-77", "52.4311310000", "13.5316960000", "33.0", "24.0", "4.0", "23.0"},
		{"wgt47", "06-0F-B5-97-36-83", "52.4293780000", "13.5308400000", "46.0", "-2.0", "4.0", "2.0"},
		{"wgt49", "06-0F-B5-3F-1F-1C", "52.4292770000", "13.5309850000", "46.0", "8.0", "4.0", "-9.0"},
		{"wgt51", "06-0F-B5-3F-45-72", "52.4292330000", "13.5295500000", "34.0", "-90.0", "-8.0", "-14.0"},
		{"wgt52", "06-0F-B5-97-34-E9", "52.4310680000", "13.5306360000", "37.0", "3.4", "-8.0", "0.5"},
		{"wgt53", "06-0F-B5-97-36-D9", "52.4311300000", "13.5305240000", "37.0", "-6.6", "-28.0", "0.5"},
		{"wgt54", "06-0F-B5-97-35-86", "52.4308860000", "13.5321520000", "0.0", "-3.8", "13.0", "3.5"},
		{"wgt55", "06-0F-B5-97-35-8C", "52.4293620000", "13.5308670000", "42.0", "0.0", "0.0", "0.0"},
		{"wgt61", "06-0F-B5-3F-1D-3B", "52.4307040000", "13.5313850000", "0.0", "-7.0", "25.0", "3.5"},
		{"wgt63", "06-0F-B5-97-37-5C", "52.4296910000", "13.5307950000", "46.0", "-5.0", "4.0", "37.0"},
		{"wgt70", "06-0F-B5-0D-AE-34", "52.4294990000", "13.5304190000", "38.0", "-30.0", "-4.0", "15.0"},
		{"wgt72", "06-0F-B5-97-36-7D", "52.4295870000", "13.5309260000", "42.0", "4.0", "0.0", "25.0"},
		{"wgt73", "06-0F-B5-97-34-BC", "52.4297480000", "13.5309530000", "42.0", "6.0", "0.0", "43.0"},
		{"wgt74", "06-0F-B5-97-37-37", "52.4295170000", "13.5304140000", "42.0", "-31.0", "0.0", "17.0"},
		{"wgt77", "06-0F-B5-97-36-D8", "52.4292550000", "13.5310170000", "38.0", "10.0", "-4.0", "-12.0"},
		{"wgt78", "06-0F-B5-97-36-54", "52.4292370000", "13.5308540000", "38.0", "-1.0", "-4.0", "-14.0"},
		{"wgt80", "06-0F-B5-97-35-E1", "52.4313310000", "13.5303550000", "33.0", "-7.0", "25.0", "3.5"},
		{"wgt82", "06-0F-B5-97-25-42", "52.4312280000", "13.5306120000", "33.0", "-128.0", "160.4", "-2.5"},
		{"wgt201", "06-0F-B5-97-25-82", "52.4295920000", "13.5309260000", "38.0", "4.0", "-4.0", "26.0"},
		{"seismo162", "06-1B-B1-05-3B-75", "52.4292640000", "13.5310060000", "42.0", "9.0", "0.0", "-11.0"},
		{"seismo151", "06-1B-B1-05-3B-5D", "52.4293290000", "13.5307110000", "42.0", "-11.0", "0.0", "-4.0"}
	};
	
	@Override
	public float[] get_AP_METRIC_POSITION(String mac) {
		for (int k = 0; k < AP_POSITIONS.length; k++) {
			if (AP_POSITIONS[k][1].equals(mac)) {
				return new float[] {new Float(AP_POSITIONS[k][5]) * MODEL_SIZE_FACTOR, new Float(AP_POSITIONS[k][7]) * MODEL_SIZE_FACTOR, new Float(AP_POSITIONS[k][6]) * MODEL_SIZE_FACTOR};
			}
		}
		
		return new float[] {-1, -1, -1};
	}
	
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
	@Override
	public String[] get_FLOWSTATS_HANDLER() {
		return FLOWSTATS_HANDLER;
	}
	@Override
	public Class<? extends NodeInformationProcessor> get_FLOWSTATS_PROCESSOR() {
		return FLOWSTATS_PROCESSOR;
	}
	@Override
	public void set_ACCESS_POINTS(String[][] aps) {
		this.ACCESS_POINTS = aps;
	}
	@Override
	public char get_LINKTABLE_SEPARATOR() {
		return LINKTABLE_SEPARATOR;
	}
}
