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



	@Override
	public void setConfigurationFile(String pFileLocation) {
		synchronized (mServer) {
			this.mServer.setConfigurationFile(pFileLocation);
		}
	}



	@Override
	public String getConfigurationFile() {
		String result= "";
		
		synchronized (mServer) {
			result = this.mServer.getConfigurationFile();
		}
		
		return result;
	}



	@Override
	public String[] getConfiguration() {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public void startRecording() {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void stopRecording() {
		// TODO Auto-generated method stub
		
	}
}
