package de.hub.clickwatch.server;

import java.util.ArrayList;
import java.util.Properties;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

import com.google.inject.Inject;

import de.hub.clickwatch.model.ClickWatchModelFactory;
import de.hub.clickwatch.model.Network;
import de.hub.clickwatch.model.Node;
import de.hub.clickwatch.server.configuration.ConfigurationFileReader;
import de.hub.clickwatch.xml.configuration.DatabaseType;
import de.hub.clickwatch.xml.configuration.NetworkType;
import de.hub.clickwatch.xml.configuration.NodeType;


/**
 * The server component stores the database and network connection configuration as well as
 * a list with node connections
 * 
 * @author Michael Frey
 */
public class ClickWatchServer implements IClickWatchServer {
	/** Access to the OSGi log service */
//	private LogService mLogService = null;
	/**	The array list holds a list of node connections */
	private ArrayList<DBNodeConnection> mConnectionList = new ArrayList<DBNodeConnection>();
	/** The configuration file reader */
	private ConfigurationFileReader mConfigurationFileReader;
	/** Location of the configuration file */
	private String mConfigurationFile;
	/** Database settings */
	private Properties mProperties = new Properties();
	
	@Inject
	public ClickWatchServer(){
		
	}
	
	public ClickWatchServer(final String pConfiguration){	
		// Set the location of the configuration file
		this.mConfigurationFile = pConfiguration;	
		// Initialize the configuration file reader 
		this.mConfigurationFileReader = new ConfigurationFileReader(this.mConfigurationFile);
	}
	
	@Override
	public synchronized boolean readConfiguration(){
		Resource resource = this.mConfigurationFileReader.readConfigurationFile();
		
		if(resource != null){
			for(EObject eObject : resource.getContents()){
				if(eObject instanceof NodeType){	
					NodeType node = (NodeType)eObject;
					// Debug
					//mLogService.log(LogService.LOG_DEBUG, "Server: Create node " + node.getAddress());		
					//mLogService.log(LogService.LOG_DEBUG, "Server: Create node " + node.getAddress());
					// Create a new node model
					Node nodeModel = ClickWatchModelFactory.eINSTANCE.createNode();
					// Set ip address
					nodeModel.setINetAddress(node.getAddress());
					// Set port
					nodeModel.setPort(node.getPort().toString());			
					// Set up node connection
					// DBNodeConnection nodeConnection = new DBNodeConnection();
					// Add node to node connection
					// nodeConnection.setUp(nodeModel);
					// Fixme: Set up update interval
					//nodeConnection.setUpdateInterval(network.getUpdateInterval());					
					// Add node connection to array list
					//mConnectionList.add(nodeConnection);
				}else if(eObject instanceof NetworkType){
					NetworkType network = (NetworkType)eObject;
					// Debug
					//mLogService.log(LogService.LOG_DEBUG, "Server: Create network " + network.getName());					
					// Create a new network model
					Network networkModel = ClickWatchModelFactory.eINSTANCE.createNetwork();
					// Set name of network model
					networkModel.setName(network.getName());
					/// Set update interval
					networkModel.setUpdateIntervall(network.getUpdateInterval());	
				} else if(eObject instanceof DatabaseType) {
					// TODO: Database configuration
					DatabaseType databaseSettings = (DatabaseType)eObject;
					mProperties.put("user", databaseSettings.getUser());
					mProperties.put("pass", databaseSettings.getPassword());
					mProperties.put("address", databaseSettings.getAddress());
					mProperties.put("port", databaseSettings.getPort());
				} else {
					// This should not happen
				}
			}
			return true;
		}
		return false;
	}
	
	@Override
	public void activateConfiguration(){
		for(int i = 0; i < this.mConnectionList.size(); i++){
			// TODO: Set database handler
			//this.mConnectionList.get(i).setDatabaseHandler(null);
			// TODO: Connect!
			this.mConnectionList.get(i).connect(null);
		}
	}
	
	@Override
	public ArrayList<DBNodeConnection> getConnectionList() {
		return mConnectionList;
	}

	@Override
	public synchronized void setConnectionList(ArrayList<DBNodeConnection> pConnectionList) {
		this.mConnectionList = pConnectionList;
	}	
	
	@Override
	public synchronized void shutdown(){
		//mLogService.log(LogService.LOG_DEBUG, "Server: Prepare to shutdown");
		if(mConnectionList != null){
			for(DBNodeConnection connection : mConnectionList){
			//	mLogService.log(LogService.LOG_DEBUG, "Server: Disconnect host " + connection.getNode().getINetAdress());
				connection.disconnect();
			}
		}
	}

	@Override
	public String getConfigurationFile() {
		return mConfigurationFile;
	}
	
	@Override
	public synchronized void setConfigurationFile(String pConfigurationFile) {
		// Set configuration file
		this.mConfigurationFile = pConfigurationFile;
		// Shutdown existing connections
		this.shutdown();
		// Set up new configuration file reader
		this.mConfigurationFileReader = new ConfigurationFileReader(this.mConfigurationFile);
	}

	public ConfigurationFileReader getConfigurationFileReader() {
		return mConfigurationFileReader;
	}

	public void setConfigurationFileReader(
			ConfigurationFileReader pConfigurationFileReader) {
		this.mConfigurationFileReader = pConfigurationFileReader;
	}
	
	/// TODO
	public synchronized Node getNode(){
		return null;
	}
}
