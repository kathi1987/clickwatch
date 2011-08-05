package de.hub.clickwatch.apps.god.information;

import java.io.Serializable;

public class RateLinkInformation implements Serializable {
	private static final long serialVersionUID = -5817982329322218216L;
	private int size, rate, fwd, rev = 0;
	
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public int getRate() {
		return rate;
	}
	public void setRate(int rate) {
		this.rate = rate;
	}
	public int getFwd() {
		return fwd;
	}
	public void setFwd(int fwd) {
		this.fwd = fwd;
	}
	public int getRev() {
		return rev;
	}
	public void setRev(int rev) {
		this.rev = rev;
	}
}
