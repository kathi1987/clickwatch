package de.hub.clickwatch.server;

import java.util.ArrayList;

import de.hub.clickwatch.connection.INodeConnectionProvider;
import de.hub.clickwatch.server.configuration.ConfigurationFileReader;


/**
 * 
 * @author Michael Frey
 */
public interface IClickWatchServer {

	public boolean readConfiguration();
	
	public void activateConfiguration();
	
	public ArrayList<INodeConnectionProvider> getConnectionList();
	
	public void setConnectionList(ArrayList<INodeConnectionProvider> pConnectionList);
	
	public void shutdown();
	
	public String getConfigurationFile();
	
	public void setConfigurationFile(String pFile);

	public ConfigurationFileReader getConfigurationFileReader();
	
	public void setConfigurationFileReader(ConfigurationFileReader pReader);
}
