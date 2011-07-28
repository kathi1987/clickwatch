package de.hub.clickcontrol;

import org.apache.commons.math.stat.descriptive.SummaryStatistics;

import click.ControlSocket;

public class ClickSocketStatistics {

	private final ControlSocket cs;
	private SummaryStatistics timeRequest = new SummaryStatistics();
	private SummaryStatistics timeRead = new SummaryStatistics();
	private SummaryStatistics bytesRequest = new SummaryStatistics();
	private SummaryStatistics bytesRead = new SummaryStatistics();
	
	protected ClickSocketStatistics(ControlSocket cs) {
		this.cs = cs;
	}
	
	public void resetStatistics() {
		cs.resetStatistics();
		bytesRequest.clear();
		bytesRead.clear();
		timeRequest.clear();
		timeRead.clear();
	}
	
	public void addRequest(long time) {
		bytesRequest.addValue(cs.getReadBytes());
		cs.resetStatistics();
		timeRequest.addValue(time);
	}
	
	public void addRead(long time) {
		timeRead.addValue(time);
		bytesRead.addValue(cs.getReadBytes());
		addRequest(time);
	}

	public Double getBytesRequest() {
		return bytesRequest.getSum();
	}

	public Double getTimeRequest() {
		return timeRequest.getSum();
	}
}
