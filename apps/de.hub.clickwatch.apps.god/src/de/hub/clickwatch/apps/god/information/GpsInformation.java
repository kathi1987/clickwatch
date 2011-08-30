package de.hub.clickwatch.apps.god.information;

import de.hub.clickwatch.apps.god.Server;

public class GpsInformation implements ClientInformations {
	private static final long serialVersionUID = -8187574858511994953L;
	private String ip, mac = null;
	private int optionalFoundRow = -1;
	private int optionalFoundCol = -1;
	private long time = -1l;
	private int computedByApNum = -1;
	private double lon, lat, speed, alt, accuracy = -1;
	private boolean guessed = false;
	
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

	public double getLon() {
		return lon;
	}

	public void setLon(double lon) {
		this.lon = lon;
	}

	public double getLat() {
		return lat;
	}

	public void setLat(double lat) {
		this.lat = lat;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public double getAlt() {
		return alt;
	}

	public void setAlt(double alt) {
		this.alt = alt;
	}
	
	public void setGuessed(boolean val) {
		this.guessed = val;
	}
	
	public boolean isGuessed() {
		return guessed;
	}
	
	public double getAccuracy() {
		return accuracy;
	}

	public void setAccuracy(double accuracy) {
		this.accuracy = accuracy;
	}

	public int getComputedByApNum() {
		return computedByApNum;
	}

	public void setComputedByApNum(int computedByApNum) {
		this.computedByApNum = computedByApNum;
	}

	public int getOptionalFoundRow() {
		return optionalFoundRow;
	}

	public void setOptionalFoundRow(int optionalFoundRow) {
		this.optionalFoundRow = optionalFoundRow;
	}

	public int getOptionalFoundCol() {
		return optionalFoundCol;
	}

	public void setOptionalFoundCol(int optionalFoundCol) {
		this.optionalFoundCol = optionalFoundCol;
	}

	@Override
	public void merge(ClientInformations newInfos) {
		if (newInfos == null) {
			System.err.println("cannot merge <null> newInfos as GpsInformation");
			return;
		}
		
		GpsInformation gpsInfos = (GpsInformation)newInfos;
		time = gpsInfos.getTime();
		
		if (gpsInfos.getClientMac() != null) {
			this.setClientMac(gpsInfos.getClientMac());
		}
		
		this.setAlt(gpsInfos.getAlt());
		this.setLon(gpsInfos.getLon());
		this.setLat(gpsInfos.getLat());
		this.setSpeed(gpsInfos.getSpeed());
	}
	
	@Override
	public void setServer(Server server) {
	}

	@Override
	public Server getServer() {
		return null;
	}
}