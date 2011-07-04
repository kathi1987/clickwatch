package de.hub.clickwatch.server;

import java.util.ArrayList;

import de.hub.clickwatch.model.ClickControlNodeConnection;
import de.hub.clickwatch.server.configuration.ConfigurationFileReader;


/**
 * 
 * @author Michael Frey
 */
public interface IClickWatchServer {

	public boolean readConfiguration();
	
	public void activateConfiguration();
	
	public ArrayList<ClickControlNodeConnection> getConnectionList();
	
	public void setConnectionList(ArrayList<ClickControlNodeConnection> pConnectionList);
	
	public void shutdown();
	
	public String getConfigurationFile();
	
	public void setConfigurationFile(String pFile);

	public ConfigurationFileReader getConfigurationFileReader();
	
	public void setConfigurationFileReader(ConfigurationFileReader pReader);
}
