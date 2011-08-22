package de.hub.clickwatch.apps.god.information;

public class RxFlow {
	private String src, dst;
	private int flowid, packetCount, packetSize, crcErrors, avgHops;
	
	public String getSrc() {
		return src;
	}
	public void setSrc(String src) {
		this.src = src;
	}
	public String getDst() {
		return dst;
	}
	public void setDst(String dst) {
		this.dst = dst;
	}
	public int getFlowid() {
		return flowid;
	}
	public void setFlowid(int flowid) {
		this.flowid = flowid;
	}
	public int getPacketCount() {
		return packetCount;
	}
	public void setPacketCount(int packetCount) {
		this.packetCount = packetCount;
	}
	public int getPacketSize() {
		return packetSize;
	}
	public void setPacketSize(int packetSize) {
		this.packetSize = packetSize;
	}
	public int getCrcErrors() {
		return crcErrors;
	}
	public void setCrcErrors(int crcErrors) {
		this.crcErrors = crcErrors;
	}
	public int getAvgHops() {
		return avgHops;
	}
	public void setAvgHops(int avgHops) {
		this.avgHops = avgHops;
	}	
}
