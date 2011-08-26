package de.hub.clickwatch.apps.god;

import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.inject.Inject;

import de.hub.clickwatch.apps.god.information.ClientInformations;
import de.hub.clickwatch.apps.god.information.MacIpInformation;
import de.hub.clickwatch.apps.god.information.StorageManager;
import de.hub.clickwatch.apps.god.location.LocationProcessor;
import de.hub.clickwatch.apps.god.node.GpsProcessor;
import de.hub.clickwatch.apps.god.node.MacIpProcessor;
import de.hub.clickwatch.apps.god.node.NodeInformations;
import de.hub.clickwatch.apps.god.node.NodeProcessor;
import de.hub.clickwatch.connection.INodeConnectionProvider;
import de.hub.clickwatch.main.ClickWatchExternalLauncher;
import de.hub.clickwatch.main.IClickWatchContext;
import de.hub.clickwatch.main.IClickWatchMain;

public class Server implements IClickWatchMain {
	private static StorageManager storageMgr = null;
	private static LocationProcessor locationProcessor = null;
	private static Server server = null;
	private static boolean startTheSzenario = true;
	private static boolean startUpdatingProcess = true;
	private NodeProcessor gateway = null;
	private List<NodeProcessor> nodes = null;
	private HashMap<String, String> macIpAPList = new HashMap<String, String>();
	private Szenario szenario = null;
	
	@Inject private INodeConnectionProvider nodeConnectionProvider;
	
	@Override
	public void main(IClickWatchContext ctx) {
		server = this;
		if (startTheSzenario) {
			startSzenario();
		}
	}
	
	public void stopSzenario() {
		for (NodeProcessor np : nodes) {
			np.stopProcessor();
		}
		gateway.stopProcessor();
		System.out.print("stopping processors ... ");
		try {
			for (NodeProcessor np : nodes) {
				np.join();
			}
			gateway.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("done");
	}
	
	public void startSzenario() {
		System.out.print("starting szenario ... ");
		try {
			storageMgr = new StorageManager();
			init_szenario();
		} catch (UnknownHostException e) {
			System.err.println("\nERROR: Given Host not known");
			return;
		}
		System.out.println("done");
	}
	
	public boolean handleSetter(String host, Integer port, String element, String handler, String value) {
		try {
			NodeInformations nodeInf = new NodeInformations(host, port);
			nodeInf.addFilter(element, handler, value);
			NodeProcessor singleProc = new NodeProcessor(this, nodeInf, getSzenario().get_USE_FILE_FOR_NODE_PROCESSOR());
			singleProc.callsSetter(true);
			singleProc.start();
			singleProc.join();
			return true;
		} catch (Exception exc) {
			System.err.println("Exception in handlerSetter: " + exc.getMessage());
		}
		
		return false;
	}
	
	public Map<String, String> getApList() {
		Map<String, String> list = new HashMap<String, String>();
		for (int k=0; k < getSzenario().get_ACCESS_POINTS().length; k++) {
			String name = getSzenario().get_ACCESS_POINTS()[k][2];
			String port = getSzenario().get_ACCESS_POINTS()[k][1];
			String ip = getSzenario().get_ACCESS_POINTS()[k][0];
						
			for (String ipPort : macIpAPList.keySet()) {
				if (ipPort.equals(ip + ":" + port)) {
					list.put(name, macIpAPList.get(ipPort));
					break;
				}
			}
		}
		return list;
	}
	
	public Szenario getSzenario() {
		return szenario;
	}
	
	public StorageManager getStorageManager() {
		return storageMgr;
	}
	
	public void storeInformations(String handler, List<ClientInformations> informations, String ip, String port) {
		if ((macIpAPList.containsKey(ip + ":" + port)) &&
				(macIpAPList.get(ip + ":" + port).equals("-1")) 
				&& (informations != null) 
				&& (handler.equals(GpsProcessor.class.getName()))) {
			
			ClientInformations info = informations.get(0);	//get Mac address of AP out of "info"
			
			List<ClientInformations> mac_ap_ip_info = new ArrayList<ClientInformations>();
			MacIpInformation macIp = new MacIpInformation();
			macIp.setAp(true);
			macIp.setClientIP(ip);
			macIp.setClientMac(info.getClientMac());
			macIp.setTime(System.currentTimeMillis());
			mac_ap_ip_info.add(macIp);                                                      
			
			macIpAPList.put(ip + ":" + port, info.getClientMac());
			storageMgr.store(MacIpProcessor.class.getName(), mac_ap_ip_info);
		}
		storageMgr.store(handler, informations);
	}
	
	private NodeProcessor startAskingAp(String hostname, int port) throws UnknownHostException {
		NodeInformations nodeInf = new NodeInformations(hostname, port);
		nodeInf.addFilter(getSzenario().get_STATS_HANDLER()[0], getSzenario().get_STATS_HANDLER()[1], getSzenario().get_STATS_PROCESSOR());
		nodeInf.addFilter(getSzenario().get_GPS_HANDLER()[0], getSzenario().get_GPS_HANDLER()[1], getSzenario().get_GPS_PROCESSOR());
		nodeInf.addFilter(getSzenario().get_GET_CHANNEL_HANDLER()[0], getSzenario().get_GET_CHANNEL_HANDLER()[1], getSzenario().get_CHANNEL_PROCESSOR());
		nodeInf.addFilter(getSzenario().get_GET_POWER_HANDLER()[0], getSzenario().get_GET_POWER_HANDLER()[1], getSzenario().get_POWER_PROCESSOR());
		nodeInf.addFilter(getSzenario().get_LINK_HANDLER()[0], getSzenario().get_LINK_HANDLER()[1], getSzenario().get_LINK_PROCESSOR());
		nodeInf.addFilter(getSzenario().get_CHANNELSTAT_HANDLER()[0], getSzenario().get_CHANNELSTAT_HANDLER()[1], getSzenario().get_CHANNELSTAT_PROCESSOR());
		if (!szenario.get_USE_FILE_FOR_NODE_PROCESSOR()) {
			nodeInf.addFilter(getSzenario().get_GET_LINKTABLE_HANDLER()[0], getSzenario().get_GET_LINKTABLE_HANDLER()[1], getSzenario().get_LINKTABLE_PROCESSOR());
			nodeInf.addFilter(getSzenario().get_GET_ROUTINGTABLE_HANDLER()[0], getSzenario().get_GET_ROUTINGTABLE_HANDLER()[1], getSzenario().get_ROUTINGTABLE_PROCESSOR());
			nodeInf.addFilter(getSzenario().get_FLOWSTATS_HANDLER()[0], getSzenario().get_FLOWSTATS_HANDLER()[1], getSzenario().get_FLOWSTATS_PROCESSOR());
		}
		macIpAPList.put(hostname + ":" + port, "-1");
		
		NodeProcessor np = new NodeProcessor(this, nodeConnectionProvider, nodeInf, getSzenario().get_USE_FILE_FOR_NODE_PROCESSOR());
		if (startUpdatingProcess) {
			np.start();
		}
		
		return np;
	}
	
	public void updateInfosFromNodes() {
		for (NodeProcessor np: nodes) {
			np.setMaxCounter(1);
			np.run();
			np.resetMaxCounter();
		}
	}
	
	private void init_szenario() throws UnknownHostException {
		if (this.szenario == null) {
			this.szenario = new SzenarioHWL();
		}
		this.nodes = new ArrayList<NodeProcessor>();
		
		//start asking APs
		for (int k = 0; k < getSzenario().get_ACCESS_POINTS().length; k++) {
			nodes.add(startAskingAp(getSzenario().get_ACCESS_POINTS()[k][0], new Integer(getSzenario().get_ACCESS_POINTS()[k][1])));
		}
		
		//start asking dhcp
		NodeInformations nodeInf = new NodeInformations(getSzenario().get_GATEWAY()[0], new Integer(getSzenario().get_GATEWAY()[1]));
		nodeInf.addFilter(getSzenario().get_GATEWAY_HANDLER()[0], getSzenario().get_GATEWAY_HANDLER()[1], getSzenario().get_GATEWAY_PROCESSOR());
		gateway = new NodeProcessor(this, nodeConnectionProvider, nodeInf, getSzenario().get_USE_FILE_FOR_NODE_PROCESSOR());
		gateway.setNodeProcessingTimer(szenario.get_GATEWAY_PROCESSING_TIMER());
		gateway.start();
		
		//initLocationProcessor(false);
	}
	
	public void addNode(String ip, String port, String mac) throws UnknownHostException {
		String[][] aps = server.getSzenario().get_ACCESS_POINTS();
		String[][] newAps = new String[aps.length+1][3];
		for (int m = 0; m < aps.length; m++) {
			newAps[m][0] = aps[m][0];
			newAps[m][1] = aps[m][1];
			newAps[m][2] = aps[m][2];
		}
		
		newAps[newAps.length-1][0] = ip;
		newAps[newAps.length-1][1] = port;
		newAps[newAps.length-1][2] = mac;
		
		server.getSzenario().set_ACCESS_POINTS(newAps);
		nodes.add(startAskingAp(ip, new Integer(port)));
	}
	
	@SuppressWarnings("unused")
	private void initLocationProcessor(boolean halfhalfMethod) {
		//start LocationProcessor
		locationProcessor = new LocationProcessor(this, storageMgr);
		locationProcessor.setTakeHalfTrainingData(halfhalfMethod);
		if (locationProcessor.setup()) {
			locationProcessor.start();
		} else {
			System.err.println("training setup failed, ending program");
			System.exit(-1);
		}
	}
	
	public static Server getInstance() {
		return server;
	}
	
	public static final void startServer(boolean startSzenario, boolean startAutomaticUpdating) {
		//String[] args = new String[] { "-d", "-s", "-r../../ui/de.hub.clickwatch.ui/resources/records/record_11-06-23.clickwatchmodel" };
		startTheSzenario = startSzenario; 
		startUpdatingProcess = startAutomaticUpdating;
		String[] args = new String[] { "-d", "-s"};
		ClickWatchExternalLauncher.launch(args, Server.class);
	} 
	
	public static final void main(String args[]) {
		startServer(true, true);
	}
}
