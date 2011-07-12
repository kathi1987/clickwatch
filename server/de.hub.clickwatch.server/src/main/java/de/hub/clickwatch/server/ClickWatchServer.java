package de.hub.clickwatch.server;

import java.util.ArrayList;
import java.util.Properties;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

import com.google.inject.Inject;
import com.google.inject.Singleton;

import de.hub.clickwatch.XmlModelRepository;
import de.hub.clickwatch.connection.INodeConnection;
import de.hub.clickwatch.connection.INodeConnectionProvider;
import de.hub.clickwatch.model.ClickWatchModelFactory;
import de.hub.clickwatch.model.Network;
import de.hub.clickwatch.model.Node;
import de.hub.clickwatch.server.configuration.ConfigurationFileReader;
import de.hub.clickwatch.server.database.ClickWatchDB;
import de.hub.clickwatch.server.database.MetaDataRecord;
import de.hub.clickwatch.xml.DatabaseType;
import de.hub.clickwatch.xml.ExperimentListType;
import de.hub.clickwatch.xml.ExperimentType;
import de.hub.clickwatch.xml.NodeListType;
import de.hub.clickwatch.xml.NodeType;
import de.hub.clickwatch.xml.impl.ExperimentListTypeImpl;

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
	private ArrayList<INodeConnectionProvider> mConnectionList = new ArrayList<INodeConnectionProvider>();
	/** The configuration file reader */
	private ConfigurationFileReader mConfigurationFileReader;
	/** Location of the configuration file */
	private String mConfigurationFile;
	/** Experiment settings */
	private Properties mExperimentProperties = new Properties();
	/** */
	@Inject
	private INodeConnectionProvider mNodeConnectionProvider;
	/** */
	@Inject
	private XmlModelRepository mXmlModelRepository;

	private ClickWatchDB mDatabase;

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
	public synchronized boolean readConfiguration() {
		Resource resource = this.mConfigurationFileReader
				.readConfigurationFile();

		if (resource != null) {

			
			
			// Im Prinzip muessen wir uns ab durch die Wurzeln hangeln
			for (EObject eObject : resource.getContents()) {
				if (eObject instanceof ExperimentListType) {
					ExperimentListType experimentList = (ExperimentListType) eObject;

					// Iterate through the set of experiments
					for (ExperimentType experiment : experimentList
							.getExperiment()) {
						//
						setUpDatabase(experiment.getDatabase());
						// Create experiment
						createExperiment(experiment);

					}
				}
			}
		}
		return false;
	}

	private void createExperiment(ExperimentType pExperiment) {
		if(this.mDatabase != null){
			// Create a meta data record and add it to the database
			this.mDatabase.addExperimentRecord(new MetaDataRecord(pExperiment));
			// Iterate through the node list
			for(NodeListType nodeList : pExperiment.getNodes()){
				// Iterate through the nodes
				for(NodeType node : nodeList.getNode()){
					
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
			// TODO: Set database handler
			this.mConnectionList.get(i).setUpDatabaseConnection(mProperties);
			// TODO: Connect!
			this.mConnectionList.get(i).connect(null);
		}
	}

	@Override
	public ArrayList<INodeConnectionProvider> getConnectionList() {
		return mConnectionList;
	}

	@Override
	public synchronized void setConnectionList(
			ArrayList<INodeConnectionProvider> pConnectionList) {
		this.mConnectionList = pConnectionList;
	}

	@Override
	public synchronized void shutdown() {
		// mLogService.log(LogService.LOG_DEBUG, "Server: Prepare to shutdown");
		if (mConnectionList != null) {
			for (INodeConnectionProvider connection : mConnectionList) {
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

	public ConfigurationFileReader getConfigurationFileReader() {
		return mConfigurationFileReader;
	}

	public void setConfigurationFileReader(
			ConfigurationFileReader pConfigurationFileReader) {
		this.mConfigurationFileReader = pConfigurationFileReader;
	}

	// / TODO
	public synchronized Node getNode() {
		return null;
	}
}
