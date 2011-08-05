package de.hub.clickwatch.apps.god.information;

import java.util.HashMap;

public class LinkInformation implements ClientInformations {
	private static final long serialVersionUID = 9214305293191383001L;
	private String ip, mac = null;
	private long time = -1l;
	private HashMap<String, SpecificLinkInformation> linkList = new HashMap<String, SpecificLinkInformation>();
	private int seq, tau, period = 0;
	
	public int getSeq() {
		return seq;
	}
	public void setSeq(int seq) {
		this.seq = seq;
	}
	public int getTau() {
		return tau;
	}
	public void setTau(int tau) {
		this.tau = tau;
	}
	public int getPeriod() {
		return period;
	}
	public void setPeriod(int period) {
		this.period = period;
	}
	public void addLinkListInformation(SpecificLinkInformation newinfo) {
		linkList.put(newinfo.getMac(), newinfo);
	}
	
	public HashMap<String, SpecificLinkInformation> getLinkList() {
		return linkList;
	}
	
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

	@Override
	public void merge(ClientInformations newInfos) {
		if (newInfos == null) {
			System.err.println("cannot merge <null> newInfos as StatsInformation");
			return;
		}
		
		LinkInformation linkInfos = (LinkInformation)newInfos;
		time = linkInfos.getTime();
		
		if (linkInfos.getClientMac() != null) {
			this.setClientMac(linkInfos.getClientMac());
		}
		
		//replace old linkList
		linkList = new HashMap<String, SpecificLinkInformation>();
		linkList = linkInfos.getLinkList();
	}
}