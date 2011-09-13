package de.hub.clickwatch.apps.god.information;

import java.util.ArrayList;
import java.util.List;

public class FlowStatInformation implements ClientInformations {
	private static final long serialVersionUID = -803092432239348743L;
	private String ip, mac = null;
	private long time = -1l;
	private List<FlowRoute> flowRoutes = new ArrayList<FlowRoute>();
	
	@Override
	public void setTime(long time) {
		this.time = time;
	}

	@Override
	public long getTime() {
		return time;
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
	public String getClientMac() {
		return mac;
	}

	@Override
	public String getClientIP() {
		return ip;
	}
	
	public List<FlowRoute> getFlowRoutes() {
		return flowRoutes;
	}

	public void setFlowRoutes(List<FlowRoute> flowRoutes) {
		this.flowRoutes = flowRoutes;
	}

	@Override
	public void merge(ClientInformations newInfos) {
		if (newInfos == null) {
			System.err.println("cannot merge <null> newInfos as FlowStatInformation");
			return;
		}
		
		FlowStatInformation flowInfos = (FlowStatInformation)newInfos;
		time = flowInfos.getTime();
		
		if (flowInfos.getClientMac() != null) {
			this.setClientMac(flowInfos.getClientMac());
		}
		
		this.flowRoutes = flowInfos.getFlowRoutes();
	}
}
