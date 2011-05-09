package edu.hu.clickwatch.server.management;

import edu.hu.clickwatch.server.Server;


public class ServerMBean implements IServerMBean {
	private Server mServer = null;
	
	public ServerMBean(Server pServer){
		mServer = pServer;
	}
	
	@Override
	public void shutdown() {
		mServer.shutdown();
	}


}
