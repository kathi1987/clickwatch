package de.hub.clickwatch.apps.god.information;

import java.text.DecimalFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

import de.hub.clickwatch.apps.god.node.ChannelProcessor;
import de.hub.clickwatch.apps.god.node.ChannelStatsProcessor;
import de.hub.clickwatch.apps.god.node.GpsProcessor;
import de.hub.clickwatch.apps.god.node.LinkProcessor;
import de.hub.clickwatch.apps.god.node.MacIpProcessor;
import de.hub.clickwatch.apps.god.node.PowerProcessor;
import de.hub.clickwatch.apps.god.node.StatsProcessor;

public class StorageManager {
	private static ConcurrentHashMap<String,
	HashMap<String, ClientInformations>> clientInfos = 
		new ConcurrentHashMap<String,
			HashMap<String, ClientInformations>>();

	public void store(String handler, List<ClientInformations> informations) {
		if (handler == null) {
			System.err.println("StorageManager 'store' cannot be called empty handler");
			return;
		}
		if (informations == null) {
			System.err.println("StorageManager 'store' cannot be called with <null> arguments (from " + handler + ")");
			return;
		}
		
		for (ClientInformations clInfos : informations) {
			if (clientInfos.containsKey(clInfos.getClientMac())) {	//client exists
				if (clientInfos.get(clInfos.getClientMac()).containsKey(handler)) {
					//we need to merge
					clientInfos.get(clInfos.getClientMac()).get(handler).merge(clInfos);
				} else {
					//insert item into inner HashMap for client
					clientInfos.get(clInfos.getClientMac()).put(handler, clInfos);
				}
			} else {
				//create new HashMap
				HashMap<String, ClientInformations> newClInfo = new HashMap<String, ClientInformations>();
				newClInfo.put(handler, clInfos);
				clientInfos.put(clInfos.getClientMac(), newClInfo);
			}
		}
	}
	
	public Set<String> getClientMacs() {
		return clientInfos.keySet();
	}
	
	public void reset() {
		clientInfos = new ConcurrentHashMap<String,	HashMap<String, ClientInformations>>();
	}
	
	public String getClientMonitor() {
		String info = ":::: " + clientInfos.size() + " clients in list ::::\n";
		
		for (String client : clientInfos.keySet()) {
			if (clientInfos.get(client).keySet().contains(GpsProcessor.class.getName())) {	//display only clients WITH gps-values
				info += "\n\nclient " + client + "\n";
			
				for (String handler : clientInfos.get(client).keySet()) {
					info += "\t==> " + handler + "\n";
					
					if (handler.equals(StatsProcessor.class.getName())) {
						StatsInformation statsInfo = (StatsInformation)clientInfos.get(client).get(handler);
						
						for (String ap : statsInfo.getApList().keySet()) {
							info += "\t\tis seen by: " + statsInfo.getApList().get(ap).getMac() +
									" @ '" + new Date(statsInfo.getApList().get(ap).getTime()) + 
									"' with rssi: " + statsInfo.getApList().get(ap).getRssi() + "\n";
						}
						
					} else if (handler.equals(MacIpProcessor.class.getName())) {
						info += "\t\tMac " + ((MacIpInformation)clientInfos.get(client).get(handler)).getClientMac() + " <===> " + ((MacIpInformation)clientInfos.get(client).get(handler)).getClientIP() + "\n";
						
					} else if (handler.equals(GpsProcessor.class.getName())) {
						boolean guessed = ((GpsInformation)clientInfos.get(client).get(handler)).isGuessed();
						
						double lat = ((GpsInformation)clientInfos.get(client).get(handler)).getLat();
						double lon = ((GpsInformation)clientInfos.get(client).get(handler)).getLon();
						DecimalFormat df = new DecimalFormat( "#.0000000000" );
						
						info += "\t\tguessed: " + guessed;
						if (((GpsInformation)clientInfos.get(client).get(handler)).getOptionalFoundCol() != -1) {
							info += " row/col (" + ((GpsInformation)clientInfos.get(client).get(handler)).getOptionalFoundRow() + "/" + ((GpsInformation)clientInfos.get(client).get(handler)).getOptionalFoundCol() + ")";
						}
						
						info += " Lat/Lon (" + df.format(lat)+ "/" + df.format(lon) + ") @ '" + new Date(((GpsInformation)clientInfos.get(client).get(handler)).getTime()) + "'";
						
						if (guessed) {
							info += " computed by " + ((GpsInformation)clientInfos.get(client).get(handler)).getComputedByApNum() + " ap's and ";
						}
						info += " with rms of " + ((GpsInformation)clientInfos.get(client).get(handler)).getAccuracy() + "\n";
						
					} else if (handler.equals(PowerProcessor.class.getName())) {
						info += "\t\tCurrent Power: " + ((PowerInformation)clientInfos.get(client).get(handler)).getPower() + "\n";
						
					} else if (handler.equals(ChannelProcessor.class.getName())) {
						info += "\t\tCurrent Channel: " + ((ChannelInformation)clientInfos.get(client).get(handler)).getChannel() + "\n";
					
					} else if (handler.equals(ChannelStatsProcessor.class.getName())) {
						ChannelStatInformation chStat = (ChannelStatInformation)clientInfos.get(client).get(handler);
						info += "\t\tChannelStatInfo: (avg_noise:" + chStat.getAvg_noise() + ", chLoad:" + chStat.getChannelLoad() + ")\n";
						for (String nb : chStat.getRssiList().keySet()) {
							info += "\t\t\t- " + nb + " ==> " + chStat.getRssiList().get(nb) + "\n";
						}
					} else if (handler.equals(LinkProcessor.class.getName())) {
						LinkInformation linkInf = (LinkInformation)clientInfos.get(client).get(handler);
						info += "\t\tlink (seq=" + linkInf.getSeq() + ", period=" + linkInf.getPeriod() + ", tau=" + linkInf.getTau() + ")\n";
						
						for (String spec : linkInf.getLinkList().keySet()) {
							info += "\t\t\tlink to " + linkInf.getLinkList().get(spec).getMac() + 
								" (seq=" + linkInf.getLinkList().get(spec).getSeq() + 
								", period=" + linkInf.getLinkList().get(spec).getPeriod() +
								", last_rx=" + linkInf.getLinkList().get(spec).getLast_rx() +
								", tau=" + linkInf.getLinkList().get(spec).getTau() + ")\n";
							
							for (Integer rate : linkInf.getLinkList().get(spec).getLink_info().keySet()) {
								info += "\t\t\t\t- size=" + linkInf.getLinkList().get(spec).getLink_info().get(rate).getRate() +
									", rate=" + linkInf.getLinkList().get(spec).getLink_info().get(rate).getRate() +
									", fwd=" + linkInf.getLinkList().get(spec).getLink_info().get(rate).getFwd() + 
									", rev=" + linkInf.getLinkList().get(spec).getLink_info().get(rate).getRev() + "\n";
							}
						}
					}
				}
			}
		}
		return info;
	}
	
	public HashMap<String, ClientInformations> getClientInformations(String MacAddr) {
		if (clientInfos.containsKey(MacAddr)) {
			return clientInfos.get(MacAddr);
		}
		
		return null;
	}	
}
