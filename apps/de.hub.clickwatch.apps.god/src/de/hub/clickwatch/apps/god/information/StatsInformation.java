package de.hub.clickwatch.apps.god.information;

import java.util.HashMap;

import de.hub.clickwatch.apps.god.Server;

public class StatsInformation implements ClientInformations {
	private static final long serialVersionUID = -2030838634909934400L;
	private String ip, mac = null;
	private long time;
	private int channelLoad = 0;
	private HashMap<String, APInformations> apList = new HashMap<String, APInformations>();
	
	
	public void addApInformation(APInformations newAPinfo) {
		apList.put(newAPinfo.getMac(), newAPinfo);
	}
	
	public HashMap<String, APInformations> getApList() {
		return apList;
	}
	
	public int getChannelLoad() {
		return channelLoad;
	}
	
	public void setChannelLoad(int channelLoad) {
		this.channelLoad = channelLoad;
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
	
	@Override
	public void merge(ClientInformations newInfos) {
		if (newInfos == null) {
			System.err.println("cannot merge <null> newInfos as StatsInformation");
			return;
		}
		
		StatsInformation statsInfos = (StatsInformation)newInfos;
		time = statsInfos.getTime();
		
		if (statsInfos.getClientMac() != null) {
			this.setClientMac(statsInfos.getClientMac());
		}
		
		//put all AP's into the list (old values will be replaced)
		for (String ap : statsInfos.getApList().keySet()) {
			apList.put(ap, statsInfos.getApList().get(ap));
		}
	}
	
	@Override
	public void setServer(Server server) {
	}

	@Override
	public Server getServer() {
		return null;
	}
}