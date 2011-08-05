package de.hub.clickwatch.apps.god.information;

import java.io.Serializable;

public interface ClientInformations extends Serializable {
	public void setTime(long time);
	public long getTime();
	public void setClientMac(String mac);
	public void setClientIP(String ip);
	public String getClientMac();
	public String getClientIP();
	public void merge(ClientInformations newInfos);
}
