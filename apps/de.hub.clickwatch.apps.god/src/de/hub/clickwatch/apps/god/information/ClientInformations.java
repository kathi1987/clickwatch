package de.hub.clickwatch.apps.god.information;

import java.io.Serializable;

import de.hub.clickwatch.apps.god.Server;

public interface ClientInformations extends Serializable {
	public void setTime(long time);
	public long getTime();
	public void setClientMac(String mac);
	public void setClientIP(String ip);
	public String getClientMac();
	public String getClientIP();
	public void setServer(Server server);
	public Server getServer();
	public void merge(ClientInformations newInfos);
}
