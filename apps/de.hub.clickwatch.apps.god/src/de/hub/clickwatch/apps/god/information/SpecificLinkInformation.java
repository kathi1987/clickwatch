package de.hub.clickwatch.apps.god.information;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class SpecificLinkInformation implements Serializable {
	private static final long serialVersionUID = -7342095677546999068L;
	private String mac;
	private double last_rx;
	private int seq, period, tau = 0;
	private Map<Integer, RateLinkInformation> link_info = new HashMap<Integer, RateLinkInformation>();
	
	public String getMac() {
		return mac;
	}
	public void setMac(String mac) {
		this.mac = mac;
	}
	public void setLast_rx(double last_rx) {
		this.last_rx = last_rx;
	}
	public double getLast_rx() {
		return last_rx;
	}
	public int getSeq() {
		return seq;
	}
	public void setSeq(int seq) {
		this.seq = seq;
	}
	public int getPeriod() {
		return period;
	}
	public void setPeriod(int period) {
		this.period = period;
	}
	public int getTau() {
		return tau;
	}
	public void setTau(int tau) {
		this.tau = tau;
	}
	public Map<Integer, RateLinkInformation> getLink_info() {
		return link_info;
	}
	public void setLink_info(Map<Integer, RateLinkInformation> link_info) {
		this.link_info = link_info;
	}
}
