package de.hub.clickwatch.apps.god.information;

import java.util.HashMap;
import java.util.Map;

import de.hub.clickwatch.apps.god.Server;
import de.hub.clickwatch.apps.god.SzenarioHWL;

public class LinktableInformation implements ClientInformations {
	private static final long serialVersionUID = 7429643927719980046L;
	private String ip, mac = null;
	private Server parent = null;
	private long time = -1l;
	private Map<String, LinktableLinkInformation> linktable = new HashMap<String, LinktableLinkInformation>();
	
	public Map<String, LinktableLinkInformation> getLinktable() {
		return linktable;
	}
	
	public void setLinktable(Map<String, LinktableLinkInformation> table) {
		this.linktable = table;
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
			System.err.println("cannot merge <null> newInfos as LinktableInformation");
			return;
		}
		
		LinktableInformation linktableInfos = (LinktableInformation)newInfos;
		time = linktableInfos.getTime();
		
		if (linktableInfos.getClientMac() != null) {
			this.setClientMac(linktableInfos.getClientMac());
		}
		
		for (String l : this.getLinktable().keySet()) {
			if (l.startsWith(getClientMac())) {
				if (!linktableInfos.getLinktable().containsKey(l)) {
					parent.getLinktable().removeFromGlobalLinktableIfExistent(l);
				}
			}
		}
		
		for (String l : linktableInfos.getLinktable().keySet()) {
			if (l.startsWith(getClientMac())) {
				if (this.getLinktable().containsKey(l)) {
					if (Math.abs((this.getLinktable().get(l).getMetric() - linktableInfos.getLinktable().get(l).getMetric()) / (float)this.getLinktable().get(l).getMetric()) >= SzenarioHWL.LINK_UPDATE_MIN_THRESHOLD) {
						parent.getLinktable().updateOrAddToGlobalLinktable(l, linktableInfos.getLinktable().get(l));
					}
				} else {
					parent.getLinktable().updateOrAddToGlobalLinktable(l, linktableInfos.getLinktable().get(l));
				}
			}
		}
		
		this.setLinktable(linktableInfos.getLinktable());
	}

	@Override
	public void setServer(Server server) {
		parent = server;
	}

	@Override
	public Server getServer() {
		return parent;
	}

}
