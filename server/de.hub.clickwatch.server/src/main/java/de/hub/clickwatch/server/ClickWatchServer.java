package de.hub.clickwatch.server;

import java.util.ArrayList;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

import com.google.inject.Inject;
import com.google.inject.Singleton;

import de.hub.clickwatch.XmlModelRepository;
import de.hub.clickwatch.connection.INodeConnection;
import de.hub.clickwatch.connection.INodeConnectionProvider;
import de.hub.clickwatch.model.Node;
import de.hub.clickwatch.server.configuration.ConfigurationFileReader;
import de.hub.clickwatch.server.database.ClickWatchDB;
import de.hub.clickwatch.server.database.MetaDataRecord;
import de.hub.clickwatch.xml.DatabaseType;
import de.hub.clickwatch.xml.DocumentRoot;
import de.hub.clickwatch.xml.ExperimentListType;
import de.hub.clickwatch.xml.ExperimentType;
import de.hub.clickwatch.xml.NodeListType;
import de.hub.clickwatch.xml.NodeType;

/**
 * The server component stores the database and network connection configuration
 * as well as a list with node connections
 * 
 * @author Michael Frey
 */
@Singleton
public class ClickWatchServer implements IClickWatchServer {
	/** Access to the OSGi log service */
	// private LogService mLogService = null;
	/** The array list holds a list of node connections */
	private ArrayList<INodeConnection> mConnectionList = new ArrayList<INodeConnection>();
	/** The configuration file reader */
	private ConfigurationFileReader mConfigurationFileReader;
	/** Location of the configuration file */
	private String mConfigurationFile;
	/** A inject node connection provider which allows to create node connections */
	@Inject
	private INodeConnectionProvider mNodeConnectionProvider;
	/** A xml model repository which allows to serialze/deserialze metadate of a record */
	@Inject
	private XmlModelRepository mXmlModelRepository;
	/** The connection to the database */
	private ClickWatchDB mDatabase = null;

	public ClickWatchDB getDatabase() {
		return mDatabase;
	}

	public void setDatabase(ClickWatchDB pDatabase) {
		this.mDatabase = pDatabase;
	}

	@Inject
	public ClickWatchServer() {

	}

	public ClickWatchServer(final String pConfiguration) {
		// Set the location of the configuration file
		this.mConfigurationFile = pConfiguration;
		// Initialize the configuration file reader
		this.mConfigurationFileReader = new ConfigurationFileReader(
				this.mConfigurationFile);
	}

	@Override
	public synchronized void readConfiguration() {
		Resource resource = this.mConfigurationFileReader
				.readConfigurationFile();

		if (resource != null) {

			// TODO: Debuggen und uriFragment rausfinden um direkt drauf zugreifen zu koennen
			
			// Im Prinzip muessen wir uns ab durch die Wurzeln hangeln
			for (EObject eObject : resource.getContents()) {
				if(eObject instanceof DocumentRoot){
					DocumentRoot configurationFile = (DocumentRoot) eObject;
					
					// Iterate through the set of experiments
					for (ExperimentType experiment : configurationFile.getExperiments().getExperiment()) {
						// Set up the database
						this.setUpDatabase(experiment.getDatabase());
						// Create experiment
						this.createExperiment(experiment);
						// Set up the handler (?)
						
						// Activate connection 
						this.activateConfiguration();
					}
					
				}
			}
		}
	}

	/**
	 *  
	 */
	private void createExperiment(ExperimentType pExperiment) {
		if(this.mDatabase != null){
			// Iterate through the list of participating nodes
			for(NodeListType nodeList : pExperiment.getNodes()){
				for(NodeType node : nodeList.getNode()){
					// TODO: Start und Stop Zeit, Todo Metadata
					this.mDatabase.addExperimentRecord(new MetaDataRecord(pExperiment.getName(), node.getAddress(), 12345, "TODO"));
					// Connect to the node and add the connection to the list
					this.mConnectionList.add(mNodeConnectionProvider.createNodeConnect(node.getAddress(), node.getPort().toString()));

				}
			}
		}
	}

	private void setUpDatabase(final EList<DatabaseType> pDatabase) {
		/**
		 * We ignore the fact that it's possible to setup multiple databases.
		 * For the future it might be interesting to add multiple databases and
		 * hence to allow to 'mirror' data.
		 */
		if (pDatabase.size() > 0) {
			// Initialize the database
			this.mDatabase = new ClickWatchDB();
			// Setup the databse with the first entry in the list
			this.mDatabase.setUpDatabaseConnection(pDatabase.get(0).getUser(),
					pDatabase.get(0).getPassword(), pDatabase.get(0)
							.getDatabase(), pDatabase.get(0).getPort()
							.toString());
		}
	}


	@Override
	public void activateConfiguration() {
		for (int i = 0; i < this.mConnectionList.size(); i++) {
			// TODO: Connect!
			//this.mConnectionList.get(i).
		}
	}

	@Override
	public ArrayList<INodeConnection> getConnectionList() {
		return mConnectionList;
	}

	@Override
	public synchronized void setConnectionList(
			ArrayList<INodeConnection> pConnectionList) {
		this.mConnectionList = pConnectionList;
	}

	@Override
	public synchronized void shutdown() {
		// mLogService.log(LogService.LOG_DEBUG, "Server: Prepare to shutdown");
		if (mConnectionList != null) {
			for (INodeConnection connection : mConnectionList) {
				// Disconnect
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
		this.mConfigurationFileReader = new ConfigurationFileReader(
				this.mConfigurationFile);
	}

	/**
	 * 
	 */
	public ConfigurationFileReader getConfigurationFileReader() {
		return mConfigurationFileReader;
	}

	/**
	 * 
	 */
	public void setConfigurationFileReader(
			ConfigurationFileReader pConfigurationFileReader) {
		this.mConfigurationFileReader = pConfigurationFileReader;
	}

	// / TODO
	public synchronized Node getNode() {
		return null;
	}
}
