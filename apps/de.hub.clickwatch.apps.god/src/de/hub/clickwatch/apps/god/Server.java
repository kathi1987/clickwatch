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
	private HashMap<String, String> macIpAPList = new HashMap<String, String>();
	private Szenario szenario = null;
	
	@Inject private INodeConnectionProvider nodeConnectionProvider;
	
	@Override
	public void main(IClickWatchContext ctx) {
		try {
			storageMgr = new StorageManager();
			init_szenario();
		} catch (UnknownHostException e) {
			System.err.println("Given Host not known");
			return;
		}
		
		try {
			Thread.sleep(2*1000);
			System.out.println("all started...\n");
			Thread.sleep(5*1000);
		} catch (InterruptedException int_exc) {
			//nothing to do
		}
		
		//System.out.println(storageMgr.getClientMonitor());
		/*
		if (handleSetter("192.168.3.47", 7777, "device_wifi/wifidevice/sc", "systemchannel", "0")) {
			System.out.println("setting was cool");
		} else {
			System.out.println("setting was totally uncool");
		}
		*/
		System.exit(0);
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
	
	private void init_szenario() throws UnknownHostException {
		this.szenario = new SzenarioHWL();
		
		//start asking APs
		for (int k = 0; k < getSzenario().get_ACCESS_POINTS().length; k++) {
			NodeInformations nodeInf = new NodeInformations(getSzenario().get_ACCESS_POINTS()[k][0], new Integer(getSzenario().get_ACCESS_POINTS()[k][1]));
			nodeInf.addFilter(getSzenario().get_STATS_HANDLER()[0], getSzenario().get_STATS_HANDLER()[1], getSzenario().get_STATS_PROCESSOR());
			nodeInf.addFilter(getSzenario().get_GPS_HANDLER()[0], getSzenario().get_GPS_HANDLER()[1], getSzenario().get_GPS_PROCESSOR());
			nodeInf.addFilter(getSzenario().get_GET_CHANNEL_HANDLER()[0], getSzenario().get_GET_CHANNEL_HANDLER()[1], getSzenario().get_CHANNEL_PROCESSOR());
			nodeInf.addFilter(getSzenario().get_GET_POWER_HANDLER()[0], getSzenario().get_GET_POWER_HANDLER()[1], getSzenario().get_POWER_PROCESSOR());
			nodeInf.addFilter(getSzenario().get_LINK_HANDLER()[0], getSzenario().get_LINK_HANDLER()[1], getSzenario().get_LINK_PROCESSOR());
			nodeInf.addFilter(getSzenario().get_CHANNELSTAT_HANDLER()[0], getSzenario().get_CHANNELSTAT_HANDLER()[1], getSzenario().get_CHANNELSTAT_PROCESSOR());
			nodeInf.addFilter(getSzenario().get_GET_LINKTABLE_HANDLER()[0], getSzenario().get_GET_LINKTABLE_HANDLER()[1], getSzenario().get_LINKTABLE_PROCESSOR());
			nodeInf.addFilter(getSzenario().get_GET_ROUTINGTABLE_HANDLER()[0], getSzenario().get_GET_ROUTINGTABLE_HANDLER()[1], getSzenario().get_ROUTINGTABLE_PROCESSOR());
			macIpAPList.put(getSzenario().get_ACCESS_POINTS()[k][0] + ":" + getSzenario().get_ACCESS_POINTS()[k][1], "-1");
			
			NodeProcessor np = new NodeProcessor(this, nodeConnectionProvider, nodeInf, getSzenario().get_USE_FILE_FOR_NODE_PROCESSOR());
			np.start();
		}
		
		//start asking dhcp
		NodeInformations nodeInf = new NodeInformations(getSzenario().get_GATEWAY()[0], new Integer(getSzenario().get_GATEWAY()[1]));
		nodeInf.addFilter(getSzenario().get_GATEWAY_HANDLER()[0], getSzenario().get_GATEWAY_HANDLER()[1], getSzenario().get_GATEWAY_PROCESSOR());
		NodeProcessor gateway = new NodeProcessor(this, nodeConnectionProvider, nodeInf, getSzenario().get_USE_FILE_FOR_NODE_PROCESSOR());
		gateway.setNodeProcessingTimer(szenario.get_GATEWAY_PROCESSING_TIMER());
		gateway.start();
		
		initLocationProcessor(false);
	}
	
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
	
	public static final void main(String args[]) {
		//args = new String[] { "-d", "-s", "-r../../ui/de.hub.clickwatch.ui/resources/records/record_11-06-23.clickwatchmodel" };
		args = new String[] { "-d", "-s"};
		ClickWatchExternalLauncher.launch(args, Server.class);
	}
}
