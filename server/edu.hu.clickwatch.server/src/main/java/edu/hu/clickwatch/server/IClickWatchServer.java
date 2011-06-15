package edu.hu.clickwatch.server;

import java.util.ArrayList;

import edu.hu.clickwatch.server.configuration.ConfigurationFileReader;
import edu.hu.clickwatch.server.node.ClickWatchServerNodeConnection;

/**
 * 
 * @author Michael Frey
 */
public interface IClickWatchServer {

	public boolean readConfiguration();
	
	public void activateConfiguration();
	
	public ArrayList<ClickWatchServerNodeConnection> getConnectionList();
	
	public void setConnectionList(ArrayList<ClickWatchServerNodeConnection> pConnectionList);
	
	public void shutdown();
	
	public String getConfigurationFile();
	
	public void setConfigurationFile(String pFile);

	public ConfigurationFileReader getConfigurationFileReader();
	
	public void setConfigurationFileReader(ConfigurationFileReader pReader);
}
