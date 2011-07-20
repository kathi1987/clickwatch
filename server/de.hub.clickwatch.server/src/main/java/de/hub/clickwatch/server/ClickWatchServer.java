package de.hub.clickwatch.server;

import java.util.ArrayList;
import java.util.Collection;
import java.util.TimerTask;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

import com.google.common.base.Function;
import com.google.common.collect.Collections2;
import com.google.inject.Inject;
import com.google.inject.Singleton;

import de.hub.clickwatch.XmlModelRepository;
import de.hub.clickwatch.connection.INodeConnection;
import de.hub.clickwatch.connection.INodeConnectionProvider;
import de.hub.clickwatch.connection.adapter.IHandlerAdapter;
import de.hub.clickwatch.connection.adapter.IMetaDataAdapter;
import de.hub.clickwatch.model.Handler;
import de.hub.clickwatch.server.configuration.ConfigurationFileReader;
import de.hub.clickwatch.server.database.ClickWatchDB;
import de.hub.clickwatch.server.database.HandlerRecord;
import de.hub.clickwatch.server.database.MetaDataRecord;
import de.hub.clickwatch.server.database.RecordFactory;
import de.hub.clickwatch.xml.DatabaseType;
import de.hub.clickwatch.xml.DocumentRoot;
import de.hub.clickwatch.xml.ExperimentType;
import de.hub.clickwatch.xml.NodeType;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/**
 * The server component stores the database and network connection configuration
 * as well as a list with node connections.
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
	/**
	 * A inject node connection provider which allows to create node connections
	 */
	@Inject
	private INodeConnectionProvider mNodeConnectionProvider;
	/**
	 * A xml model repository which allows to serialze/deserialze metadate of a
	 * record
	 */
	@Inject
	private XmlModelRepository mXmlModelRepository;
	/** The connection to the database for the server itself */
	private ClickWatchDB mServerDatabaseConnection = null;
	/** Indicates if the connection to the nodes should be kept */
	private boolean keepConnection = true;
	/** */
	private int NUM_THREADS = 10;
	/** */
	private ScheduledExecutorService mScheduler = Executors
			.newScheduledThreadPool(NUM_THREADS);
	ArrayList<NodeThread> mNodeConnectionList = new ArrayList<NodeThread>();

	private static final boolean DONT_INTERRUPT_IF_RUNNING = false;

	private ArrayList<ExperimentType> mExperiments = new ArrayList<ExperimentType>();
	
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

			// TODO: Debuggen und uriFragment rausfinden um direkt drauf
			// zugreifen zu koennen

			// Im Prinzip muessen wir uns ab durch die Wurzeln hangeln
			for (EObject eObject : resource.getContents()) {
				if (eObject instanceof DocumentRoot) {
					DocumentRoot configurationFile = (DocumentRoot) eObject;

					this.mExperiments.addAll(configurationFile.getExperiments().getExperiment());	
					
		
				}
			}
		}
	}
	
	public ArrayList<ExperimentType> getExperiments(){
		return mExperiments;
	}
	
	public void initialize(){
		// Iterate through the set of experiments
		for (ExperimentType experiment : mExperiments) {
			// Set up the database
			this.setUpDatabase(experiment.getDatabase());

			// Create experiment
			this.createExperiment(experiment,
					experiment.getDatabase());
			
			// Set up the handler (?)

			// Activate connection
			this.activateConfiguration();
		}
	}
	
	/**
	 *  
	 */
	private void createExperiment(ExperimentType pExperiment,
			DatabaseType pDatabase) {
		if (this.mServerDatabaseConnection != null) {
			// Iterate through the list of participating nodes
			for (NodeType node : pExperiment.getNodes().getNode()) {
				// TODO: Start und Stop Zeit, Todo Metadata
				MetaDataRecord record = RecordFactory.createMetaDataRecord();

				record.setExperimentId(pExperiment.getName());
				record.setMetaData("TODO");
				record.setNode(node.getAddress());
				record.setTimeStamp(System.currentTimeMillis());

				this.mServerDatabaseConnection.addExperimentRecord(record);
				
				long initialDelay = Long.parseLong(pExperiment.getStart()) - System.currentTimeMillis();
				long shutdownAfter = Long.parseLong(pExperiment.getStop());
				
				// Initialize the database
				ClickWatchDB db = new ClickWatchDB();
				// Setup the databse with the first entry in the list
				db.setUpDatabaseConnection(pDatabase.getUser(),
						pDatabase.getPassword(), pDatabase.getDatabase(),
						pDatabase.getPort().toString());
				//
				Runnable nodeThread = new NodeThread(
						mNodeConnectionProvider.createConnection(
								node.getAddress(), node.getPort().toString()),
						node.getAddress(), db, pExperiment.getName());
				
				//
				mNodeConnectionList.add((NodeThread)nodeThread);
				
				//
				ScheduledFuture<?> futureExperiment = mScheduler
						.schedule(nodeThread, initialDelay, TimeUnit.MILLISECONDS);
				
				
				//
				Runnable stopNodeThread = new ControlNodeThread(futureExperiment, (NodeThread)nodeThread);
				mScheduler.schedule(stopNodeThread, shutdownAfter, TimeUnit.MILLISECONDS);
			}
		}
	}

	private void setUpDatabase(final DatabaseType pDatabase) {
		// Initialize the database
		this.mServerDatabaseConnection = new ClickWatchDB();
		// Setup the databse with the first entry in the list
		this.mServerDatabaseConnection.setUpDatabaseConnection(
				pDatabase.getUser(), pDatabase.getPassword(),
				pDatabase.getDatabase(), pDatabase.getPort().toString());
	}

	@Override
	public void activateConfiguration() {
		// mLogService.log(LogService.LOG_DEBUG,
		// "Server: Initialize connection to nodes");
		for (INodeConnection connection : mConnectionList) {
			connection.connect();
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
		for(NodeThread thread : mNodeConnectionList){
			thread.setKeepConnection(false);
		}
		this.mServerDatabaseConnection.close();
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
		// this.shutdown();
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

	/**
	 * The method gets the database connection
	 * 
	 * @return The database connection of the server
	 */
	public ClickWatchDB getDatabase() {
		return mServerDatabaseConnection;
	}

	/**
	 * The method sets the database connection
	 */
	public void setDatabase(ClickWatchDB pDatabase) {
		this.mServerDatabaseConnection = pDatabase;
	}

	/**
	 * 
	 * 
	 */
	private class NodeThread implements Runnable {
		/** The connection to a node */
		private INodeConnection mConnection;
		/** The corresponding handler adapter */
		private IHandlerAdapter mHandlerAdapter;
		/** The correseponding meta data adapter */
		private IMetaDataAdapter mMetaDataAdapter;
		/** The identifier of the node */
		private String mNodeId;
		/** Holds the connection to the database */
		private ClickWatchDB mDatabase;
		/** */
		private boolean mKeepConnection = true;
		/** */
		private String mExperiment;
		
		public NodeThread(INodeConnection pConnection, String pNodeId,
				ClickWatchDB pDatabase, String pExperiment) {
			this.mConnection = pConnection;
			this.mMetaDataAdapter = this.mConnection
					.getAdapter(IMetaDataAdapter.class);
			this.mHandlerAdapter = this.mConnection
					.getAdapter(IHandlerAdapter.class);
			this.mNodeId = pNodeId;
			this.mDatabase = pDatabase;
			this.mExperiment = pExperiment;
		}

		@Override
		public void run() {
			long counter = 0;

			this.mConnection.connect();

			mHandlerAdapter.configure(mMetaDataAdapter.pullAllMetaData()
					.getAllHandlers());

			while (mKeepConnection) {
				Collection<Handler> handlerCollection = this.mHandlerAdapter
						.pullHandler();
				/** The method transforms a collection of handlers to a
				 collection of handler records */
				Collection<HandlerRecord> handlerRecords = Collections2
						.transform(handlerCollection,
								new Function<Handler, HandlerRecord>() {
									@Override
									public HandlerRecord apply(Handler pFrom) {
										HandlerRecord result = RecordFactory
												.createHandlerRecord();
										// TODO: Experiment ID
										result.setExperimentId(mExperiment);
										result.setNodeId(mNodeId);
										result.setQualifiedName(pFrom
												.getQualifiedName());
										result.setValue(pFrom.getValue());
										return result;
									}
								});

				mDatabase.addHandlerRecords(handlerRecords);
				counter++;
			}

			System.out.println("Node: " + mNodeId + " : " + counter);
			this.mConnection.disconnect();
			this.mDatabase.close();
		}
		
		public synchronized void setKeepConnection(boolean pKeepConnection){
			this.mKeepConnection = pKeepConnection;
		}
	}

	private class ControlNodeThread implements Runnable {
		private ScheduledFuture<?> fSchedFuture;
		private NodeThread mNodeThread;

		public ControlNodeThread(ScheduledFuture<?> aSchedFuture, NodeThread pNodeThread) {
			fSchedFuture = aSchedFuture;
			mNodeThread = pNodeThread;
		}

		public void run() {
			//
			mNodeThread.setKeepConnection(false);
			//
			fSchedFuture.cancel(DONT_INTERRUPT_IF_RUNNING);
//			mScheduler.shutdown();
		}
	}
}
