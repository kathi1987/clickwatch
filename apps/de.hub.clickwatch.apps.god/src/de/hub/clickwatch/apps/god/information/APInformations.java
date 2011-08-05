package de.hub.clickwatch.apps.god.information;

import java.io.Serializable;

public class APInformations implements Serializable {
	private static final long serialVersionUID = 7571951416012658669L;
	
	private String mac = null;
	private int rssi, std_rssi, min_rssi, max_rssi, pkt_cnt, avg_noise, std_noise = 0;
	private String timeStamp;
	private long time;
	
	public APInformations(String macAddr) {
		mac = macAddr;
	}

	public int getRssi() {
		return rssi;
	}

	public void setRssi(int rssi) {
		this.rssi = rssi;
	}

	public int getStd_rssi() {
		return std_rssi;
	}

	public void setStd_rssi(int std_rssi) {
		this.std_rssi = std_rssi;
	}

	public int getMin_rssi() {
		return min_rssi;
	}

	public void setMin_rssi(int min_rssi) {
		this.min_rssi = min_rssi;
	}

	public int getMax_rssi() {
		return max_rssi;
	}

	public void setMax_rssi(int max_rssi) {
		this.max_rssi = max_rssi;
	}

	public int getPkt_cnt() {
		return pkt_cnt;
	}

	public void setPkt_cnt(int pkt_cnt) {
		this.pkt_cnt = pkt_cnt;
	}

	public String getMac() {
		return mac;
	}

	public String getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(String timeStamp) {
		this.timeStamp = timeStamp;
	}

	public int getAvg_noise() {
		return avg_noise;
	}

	public void setAvg_noise(int avg_noise) {
		this.avg_noise = avg_noise;
	}

	public void setStd_noise(int std_noise) {
		this.std_noise = std_noise;
	}

	public int getStd_noise() {
		return std_noise;
	}

	public void setTime(long time) {
		this.time = time;
	}

	public long getTime() {
		return time;
	}
}