package de.hub.clickwatch.apps.god.information;

import java.util.HashMap;
import java.util.Map;

public class RoutingtableInformation implements ClientInformations {
	private static final long serialVersionUID = -955379912962923052L;
	private String ip, mac = null;
	private long time;
	private Map<String, RouteInformation> routingtable = new HashMap<String, RouteInformation>();
	
	@Override
	public String getClientMac() {
		return mac;
	}

	@Override
	public String getClientIP() {
		return ip;
	}
	
	@Override
	public void setClientMac(String mac) {
		this.mac = mac;
	}

	@Override
	public void setClientIP(String ip) {
		this.ip = ip;
	}
	
	@Override
	public void setTime(long time) {
		this.time = time;
	}

	@Override
	public long getTime() {
		return time;
	}
	
	public void setRoutingtable(Map<String, RouteInformation> table) {
		this.routingtable = table;
	}
	
	public Map<String, RouteInformation> getRoutingtable() {
		return routingtable;
	}
	
	@Override
	public void merge(ClientInformations newInfos) {
		if (newInfos == null) {
			System.err.println("cannot merge <null> newInfos as LinktableInformation");
			return;
		}
		
		RoutingtableInformation routingtableInfos = (RoutingtableInformation)newInfos;
		time = routingtableInfos.getTime();
		
		if (routingtableInfos.getClientMac() != null) {
			this.setClientMac(routingtableInfos.getClientMac());
		}
		
		this.setRoutingtable(routingtableInfos.getRoutingtable());
	}

}
