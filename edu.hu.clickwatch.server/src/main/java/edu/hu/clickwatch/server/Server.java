package edu.hu.clickwatch.server;

import java.util.ArrayList;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.osgi.service.log.LogService;

import Configuration.CdoType;
import Configuration.NetworkType;
import Configuration.NodeType;
import edu.hu.clickwatch.cdo.CDOHandler;
import edu.hu.clickwatch.model.ClickWatchModelFactory;
import edu.hu.clickwatch.model.Network;
import edu.hu.clickwatch.model.Node;

/**
 * The server component stores the database and network connection configuration as well as
 * a list with node connections
 * 
 * @author Michael Frey
 */
public class Server {
	/** Access to the OSGi log service */
	private LogService mLogService = null;
	/**	The array list holds a list of node connections */
	private ArrayList<NodeConnection> mConnectionList = new ArrayList<NodeConnection>();
	/** The configuration file reader */
	private ConfigurationFileReader mConfigurationFileReader;
	/** Location of the configuration file */
	private String mConfigurationFile;
	/** A handler for the CDO connection */
	private CDOHandler mDatabaseHandler;
	
	public Server(final String pConfiguration){	
		//
		//mLogService = ServerPluginActivator.getInstance().getLogService();
		// Set the location of the configuration file
		this.mConfigurationFile = pConfiguration;	
		// Initialize the configuration file reader 
		this.mConfigurationFileReader = new ConfigurationFileReader(this.mConfigurationFile);
	}
	
	public synchronized boolean initialize(){
		Resource resource = this.mConfigurationFileReader.readConfigurationFile();
		
		if(resource != null){
			// Initialize array list
			mConnectionList = new ArrayList<NodeConnection>();
			
			for(EObject eObject : resource.getContents()){
				if(eObject instanceof NodeType){	
					NodeType node = (NodeType)eObject;
					// Debug
					//mLogService.log(LogService.LOG_DEBUG, "Server: Create node " + node.getAddress());		
					//mLogService.log(LogService.LOG_DEBUG, "Server: Create node " + node.getAddress());
					// Create a new node model
					Node nodeModel = ClickWatchModelFactory.eINSTANCE.createNode();
					// Set ip address
					nodeModel.setINetAdress(node.getAddress());
					// Set port
					nodeModel.setPort(node.getPort().toString());			
					// Set up node connection
					NodeConnection nodeConnection = new NodeConnection();
					// Add node to node connection
					nodeConnection.setUp(nodeModel);
					// Fixme: Set up update interval
					//nodeConnection.setUpdateInterval(network.getUpdateInterval());
					// Set element filter if necessary
					if(node.getElementFilter() != null){
						nodeConnection.setElementFilter(node.getElementFilter());
					}
					// Set handler filter if necessary
					if(node.getElementFilter() != null){
						nodeConnection.setHandlerFilter(node.getHandlerFilter());
					}
					// Connect!
					nodeConnection.connect();				
					// Add node connection to array list
					mConnectionList.add(nodeConnection);
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
				} else if(eObject instanceof CdoType) {
					CdoType cdo = (CdoType) eObject;
					//
					this.mDatabaseHandler = new CDOHandler(cdo.getAddress(), cdo.getPort(), cdo.getRepository());
					
				} else {
					
				}
			}
			// TODO: Aehm, soll das so sein
			return true;
		}
		return false;
	}
	
	public ArrayList<NodeConnection> getConnectionList() {
		return mConnectionList;
	}

	public synchronized void setConnectionList(ArrayList<NodeConnection> pConnectionList) {
		this.mConnectionList = pConnectionList;
	}	
	
	public synchronized void shutdown(){
		//mLogService.log(LogService.LOG_DEBUG, "Server: Prepare to shutdown");
		if(mConnectionList != null){
			for(NodeConnection connection : mConnectionList){
			//	mLogService.log(LogService.LOG_DEBUG, "Server: Disconnect host " + connection.getNode().getINetAdress());
				connection.disconnect();
			}
		}
	}

	public String getConfigurationFile() {
		return mConfigurationFile;
	}

	public synchronized void setConfigurationFile(String mConfigurationFile) {
		// Set configuration file
		this.mConfigurationFile = mConfigurationFile;
		// Reset configuration or add it to configuration
		
		// Set up connections
	}

	public ConfigurationFileReader getConfigurationFileReader() {
		return mConfigurationFileReader;
	}

	public void setConfigurationFileReader(
			ConfigurationFileReader pConfigurationFileReader) {
		this.mConfigurationFileReader = pConfigurationFileReader;
	}
	
}
