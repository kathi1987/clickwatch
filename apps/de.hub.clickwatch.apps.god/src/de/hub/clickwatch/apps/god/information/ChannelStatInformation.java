package de.hub.clickwatch.apps.god.information;

import java.util.HashMap;
import java.util.Map;

public class ChannelStatInformation implements ClientInformations {
	private static final long serialVersionUID = 723457074176675694L;
	private String ip, mac = null;
	private long time = -1l;
	private int avg_noise, channelLoad = 0;
	private Map<String, Integer> rssiList = new HashMap<String, Integer>(); 
	
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

	public int getAvg_noise() {
		return avg_noise;
	}

	public void setAvg_noise(int avg_noise) {
		this.avg_noise = avg_noise;
	}

	public int getChannelLoad() {
		return channelLoad;
	}

	public void setChannelLoad(int channelLoad) {
		this.channelLoad = channelLoad;
	}

	public void addRssi(String mac, int rssi) {
		this.rssiList.put(mac, rssi);
	}

	public Map<String, Integer> getRssiList() {
		return rssiList;
	}

	@Override
	public void merge(ClientInformations newInfos) {
		if (newInfos == null) {
			System.err.println("cannot merge <null> newInfos as ChannelStatInformation");
			return;
		}
		
		ChannelStatInformation chStatInfos = (ChannelStatInformation)newInfos;
		time = chStatInfos.getTime();
		
		if (chStatInfos.getClientMac() != null) {
			this.setClientMac(chStatInfos.getClientMac());
		}
		
		this.avg_noise = chStatInfos.getAvg_noise();
		this.channelLoad = chStatInfos.getChannelLoad();
		this.rssiList = chStatInfos.getRssiList();
	}
}