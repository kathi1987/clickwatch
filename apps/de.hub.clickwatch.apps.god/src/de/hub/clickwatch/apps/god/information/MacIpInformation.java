package de.hub.clickwatch.apps.god.information;

public class MacIpInformation implements ClientInformations {
	private static final long serialVersionUID = -2733669306142897408L;
	private long time;
	private String ip, mac;
	private boolean ap;
	
	public boolean isAP() {
		return ap;
	}
	
	public void setAp(boolean ap) {
		this.ap = ap;
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
			System.err.println("cannot merge <null> newInfos as MacIpInformation");
			return;
		}
		
		MacIpInformation newMacIp = (MacIpInformation)newInfos;
		time = newMacIp.getTime();
		mac = newMacIp.getClientMac();
		ip = newMacIp.getClientIP();
	}

}
