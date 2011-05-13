package edu.hu.clickwatch.server;

import java.io.File;
import java.util.ArrayList;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.osgi.service.log.LogService;

import edu.hu.clickwatch.model.ClickWatchModelFactory;
import edu.hu.clickwatch.model.Network;
import edu.hu.clickwatch.model.Node;
import edu.hu.clickwatch.xml.ConfigurationType;
import edu.hu.clickwatch.xml.NetworkType;
import edu.hu.clickwatch.xml.NodeType;

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
	private ArrayList<NodeConnection> mConnectionList;
	/** The java representation of the xml based network configuration file */
	private ConfigurationType mConfiguration;
	/** Location of the configuration file */
	private String mConfigurationFile;
	
	public Server(){
		
	}
	
	public Server(final String pConfiguration){	
		
		mLogService = ServerPluginActivator.getInstance().getLogService();
		
		this.mConfigurationFile = pConfiguration;
		
		this.readConfigurationFile();
	}
	
	public void readConfigurationFile(){
		try {
			ClassLoader classLoader = edu.hu.clickwatch.xml.ObjectFactory.class.getClassLoader();

			JAXBContext context = JAXBContext.newInstance("edu.hu.clickwatch.xml.ConfigurationType", classLoader);
	        Unmarshaller unmarshaller = context.createUnmarshaller();
	        mConfiguration = (ConfigurationType) unmarshaller.unmarshal(new File(this.mConfigurationFile));
		} catch (JAXBException e) {
			e.printStackTrace();
		} 	
	}
	
	
	public boolean initialize(){
		if(mConfiguration != null){
			// Initialize array list
			mConnectionList = new ArrayList<NodeConnection>();
			// Iterate through network list in xml configuration
			for(NetworkType network : mConfiguration.getNetwork()){
				mLogService.log(LogService.LOG_DEBUG, "Server: Create network " + network.getName());
				// Create a new network model
				Network networkModel = ClickWatchModelFactory.eINSTANCE.createNetwork();
				// Set name of network model
				networkModel.setName(network.getName());
				// Set update interval
				networkModel.setUpdateIntervall(network.getUpdateInterval());
				
				// Iterate through nodes in network
				for(NodeType node : network.getNode()){
					mLogService.log(LogService.LOG_DEBUG, "Server: Create node " + node.getAddress());
					// Create a new node model
					Node nodeModel = ClickWatchModelFactory.eINSTANCE.createNode();
					// Set ip address
					nodeModel.setINetAdress(node.getAddress());
					// Set port
					nodeModel.setPort(Integer.toString(node.getPort()));			
					// Set up node connection
					NodeConnection nodeConnection = new NodeConnection();
					// Add node to node connection
					nodeConnection.setUp(nodeModel);
					// Set up update interval
					nodeConnection.setUpdateInterval(network.getUpdateInterval());
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
				}
			}
		}
		return false;
	}
	
	public ArrayList<NodeConnection> getConnectionList() {
		return mConnectionList;
	}

	public void setConnectionList(ArrayList<NodeConnection> pConnectionList) {
		this.mConnectionList = pConnectionList;
	}	
	
	public void shutdown(){
		mLogService.log(LogService.LOG_DEBUG, "Server: Prepare to shutdown");
		if(mConnectionList != null){
			for(NodeConnection connection : mConnectionList){
				mLogService.log(LogService.LOG_DEBUG, "Server: Disconnect host " + connection.getNode().getINetAdress());
				connection.disconnect();
			}
		}
	}

	public String getConfigurationFile() {
		return mConfigurationFile;
	}

	public void setConfigurationFile(String mConfigurationFile) {
		
		this.mConfigurationFile = mConfigurationFile;
		
		this.readConfigurationFile();
	}
}
