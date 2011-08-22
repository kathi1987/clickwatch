package de.hub.clickwatch.apps.god.information;

import java.util.ArrayList;
import java.util.List;

public class FlowInformation implements ClientInformations {
	private static final long serialVersionUID = -6583001475924368084L;
	private String ip, mac = null;
	private long time = -1l;
	private List<TxFlow> txflows = new ArrayList<TxFlow>();
	private List<RxFlow> rxflows = new ArrayList<RxFlow>();
	
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

	public List<RxFlow> getRxflows() {
		return rxflows;
	}

	public void setRxflows(List<RxFlow> rxflows) {
		this.rxflows = rxflows;
	}
	
	public List<TxFlow> getTxflows() {
		return txflows;
	}

	public void setTxflows(List<TxFlow> txflows) {
		this.txflows = txflows;
	}

	@Override
	public void merge(ClientInformations newInfos) {
		if (newInfos == null) {
			System.err.println("cannot merge <null> newInfos as FlowInformation");
			return;
		}
		
		FlowInformation flowInfos = (FlowInformation)newInfos;
		time = flowInfos.getTime();
		
		if (flowInfos.getClientMac() != null) {
			this.setClientMac(flowInfos.getClientMac());
		}
		
		this.setRxflows(flowInfos.getRxflows());
		this.setTxflows(flowInfos.getTxflows());
	}

}
