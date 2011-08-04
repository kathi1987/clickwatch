package de.hub.clickwatch.apps.god.information;

public class PowerInformation implements ClientInformations {
	private static final long serialVersionUID = -811624497030113245L;
	private long time = -1l;
	private String ip, mac = null;
	private int power = 0;
	
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

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	@Override
	public void merge(ClientInformations newInfos) {
		if (newInfos == null) {
			System.err.println("cannot merge <null> newInfos as GpsInformation");
			return;
		}
		
		PowerInformation powerInfos = (PowerInformation)newInfos;
		time = powerInfos.getTime();
		
		if (powerInfos.getClientMac() != null) {
			this.setClientMac(powerInfos.getClientMac());
		}
		
		this.setPower(powerInfos.getPower());
	}
}
