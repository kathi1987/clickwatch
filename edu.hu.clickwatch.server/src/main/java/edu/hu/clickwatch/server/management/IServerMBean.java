package edu.hu.clickwatch.server.management;

public interface IServerMBean {
	/**
	 * 
	 */
	public void shutdown();
	
	/**
	 * 
	 */
	public void setConfigurationFile(final String pFileLocation);
	
	/**
	 * 
	 */
	public String getConfigurationFile();
	
	/**
	 * 
	 */
	public String[] getConfiguration();
	
	/**
	 * 
	 */
	public void startRecording();
	
	/**
	 * 
	 */
	public void stopRecording();
}
