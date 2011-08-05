package de.hub.clickwatch.apps.god.location;

public class TrainingData {
	private String apMac;
	private double[][] longitude;
	private double[][] latitude;
	private double[][] rssi;
	
	public TrainingData(String mac) {
		this.apMac = mac;
	}
	
	public String getApMac() {
		return apMac;
	}

	public void setApMac(String apMac) {
		this.apMac = apMac;
	}

	public double[][] getLongitude() {
		return longitude;
	}
	public void setLongitude(double[][] longitude) {
		this.longitude = longitude;
	}
	public double[][] getLatitude() {
		return latitude;
	}
	public void setLatitude(double[][] latitude) {
		this.latitude = latitude;
	}
	public double[][] getRssi() {
		return rssi;
	}
	public void setRssi(double[][] rssi) {
		this.rssi = rssi;
	}
}