package de.hub.clickwatch.apps.god.information;

public class ChannelInformation implements ClientInformations {
	private static final long serialVersionUID = 5036356980563045390L;
	private long time = -1l;
	private String ip, mac = null;
	private int channel = 0;
	
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

	public void setChannel(int channel) {
		this.channel = channel;
	}

	public int getChannel() {
		return channel;
	}
	
	@Override
	public void merge(ClientInformations newInfos) {
		if (newInfos == null) {
			System.err.println("cannot merge <null> newInfos as ChannelInformation");
			return;
		}
		
		ChannelInformation channelInfos = (ChannelInformation)newInfos;
		time = channelInfos.getTime();
		
		if (channelInfos.getClientMac() != null) {
			this.setClientMac(channelInfos.getClientMac());
		}
		
		this.setChannel(channelInfos.getChannel());
	}
}
