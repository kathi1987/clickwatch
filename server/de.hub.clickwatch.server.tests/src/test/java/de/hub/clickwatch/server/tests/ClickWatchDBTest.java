package de.hub.clickwatch.server.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Properties;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.junit.Before;
import org.junit.Test;

import de.hub.clickwatch.server.configuration.ConfigurationFileReader;
import de.hub.clickwatch.server.database.ClickWatchDB;
import de.hub.clickwatch.server.database.HandlerRecord;
import de.hub.clickwatch.server.database.MetaDataRecord;
import de.hub.clickwatch.tests.AbstractTest;
import de.hub.clickwatch.xml.DatabaseType;
import de.hub.clickwatch.xml.DocumentRoot;

/**
 * 
 * 
 */
public class ClickWatchDBTest extends AbstractTest {
	/** The path to the configuration file */
	private String mConfigurationFile = "src/test/resources/" + ClickWatchDBTest.class.getPackage().getName().replace(".", "/") + "/configuration.xml";
	/** A properties settings file for the database */
	private Properties mDatabaseProperties = new Properties();
	/** Inject the database */
	private ClickWatchDB mDatabase;
	/** A unique timestamp for the unit test */
	private long mTimestamp = System.currentTimeMillis();

	@Before
	public void initialize() {
		mDatabase = injector.getInstance(ClickWatchDB.class);
		// Setup the configuration file reader
		ConfigurationFileReader reader = new ConfigurationFileReader(mConfigurationFile);
		// Check if the reader could be created
		assert(reader != null);
		// Read the configuration
		Resource result = reader.readConfigurationFile();
		// Check if reading the configuration was sucessful
		assert(result != null);
		// Iterate through the configuration file
		for(EObject eObject : result.getContents()){
			if(eObject instanceof DocumentRoot){
				DocumentRoot configurationFile = (DocumentRoot) eObject;
				//
				DatabaseType database = configurationFile.getExperiments().getExperiment().get(0).getDatabase();
				this.mDatabaseProperties.put("user", database.getUser());
				this.mDatabaseProperties.put("password", database.getPassword());
				this.mDatabaseProperties.put("database", database.getDatabase());
				this.mDatabaseProperties.put("address", database.getAddress());
				this.mDatabaseProperties.put("port", database.getPort().toString());
			}
		}
		// Set up the database 
		this.mDatabase.setUpDatabaseConnection(this.mDatabaseProperties
				.getProperty("user"),
				this.mDatabaseProperties.getProperty("password"), this
						.mDatabaseProperties.getProperty("database"), this
						.mDatabaseProperties.getProperty("port"));
	}

	@Test
	public void addHandlerRecordTest() {
		// Check if a connection to the database exists
		assertTrue(this.mDatabase.isConnected());
		// Create a metadata record
		MetaDataRecord metaDataRecord = this.createMetaDataRecord();
		// Create a new experiment id
		String id = metaDataRecord.getExperimentId() + " Handler Record Test";
		// Change the metadata record 
		metaDataRecord.setExperimentId(id);
		// Create a handler record
		HandlerRecord handlerRecord = this.createHandlerRecord();
		// Change the metadata record reference
		handlerRecord.setExperimentId(id);
		// Add the metadata handler record to the database;
		this.mDatabase.addExperimentRecord(metaDataRecord);
		// Add the handler record to the database
		this.mDatabase.addHandlerRecord(handlerRecord);
		// Verify that the metadata record data was added to the table
		String query = "SELECT experimentid, nodeid, timestamp, metadata FROM metadatarecord WHERE experimentid = \'" + id + "\'" ;
		// Execute the query
		try {
			// Prepare the query to get the node
			Statement statement = this.mDatabase.getConnection().createStatement();
			// Execute the query
			ResultSet result = statement.executeQuery(query);
			while(result.next()){
				assertEquals(metaDataRecord.getExperimentId(), result.getString(1));
				assertEquals(metaDataRecord.getNode(), result.getString(2));
				assertEquals(metaDataRecord.getTimeStamp(), result.getLong(3));
				assertEquals(metaDataRecord.getMetaData(), result.getString(4));
			}
			// Close the result statement
			result.close();
			// Close the statement
			statement.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}		
		
		// Verify that the metadata record data was added to the table
		query = "SELECT experimentid, nodeid, timestamp FROM handlerrecords WHERE experimentid = \'" + id + "\'" ;
		// Execute the query
		try {
			// Prepare the query to get the node
			Statement statement = this.mDatabase.getConnection().createStatement();
			// Execute the query
			ResultSet result = statement.executeQuery(query);
			while(result.next()){
				assertEquals(handlerRecord.getExperimentId(), result.getString(1));
				assertEquals(handlerRecord.getNodeId(), result.getString(2));
				assertEquals(handlerRecord.getTimeStamp(), result.getLong(3));
			}
			// Close the result statement
			result.close();
			// Close the statement
			statement.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}	
		
		// Since PostgreSQL doesn't support cascade delete we have to delete both entries seperately
		query = "DELETE FROM handlerrecords WHERE experimentid = \'" + id + "\'" ;
		try {
			// Prepare the query to get the node
			Statement statement = this.mDatabase.getConnection().createStatement();
			// Execute the query
			boolean result = statement.execute(query);
			// There should be no dataset
			assertFalse(result);
			//
			this.mDatabase.getConnection().commit();
			// Close the statement
			statement.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}	
		
		// Set up query string for deleting the record from the table
		query = "DELETE FROM metadatarecord WHERE experimentid = \'" + id + "\'" ;
		try {
			// Prepare the query to get the node
			Statement statement = this.mDatabase.getConnection().createStatement();
			// Execute the query
			boolean result = statement.execute(query);
			// There should be no dataset
			assertFalse(result);
			//
			this.mDatabase.getConnection().commit();
			// Close the statement
			statement.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}	
	}

	@Test
	public void addExperimentRecordTest() {
		// Check if a connection to the database exists
		assertTrue(this.mDatabase.isConnected());
		// Create a meta data record
		MetaDataRecord metaDataRecord = this.createMetaDataRecord();
		// Add the meta data record to the database
		this.mDatabase.addExperimentRecord(metaDataRecord);
		// Verify that the data was added to the table
		String query = "SELECT experimentid, nodeid, timestamp, metadata FROM metadatarecord WHERE experimentid = \'JUnit Experiment ID\'" ;
		// Execute the query
		try {
			// Prepare the query to get the node
			Statement statement = this.mDatabase.getConnection().createStatement();
			// Execute the query
			ResultSet result = statement.executeQuery(query);
			while(result.next()){
				assertEquals(metaDataRecord.getExperimentId(), result.getString(1));
				assertEquals(metaDataRecord.getNode(), result.getString(2));
				assertEquals(metaDataRecord.getTimeStamp(), result.getLong(3));
				assertEquals(metaDataRecord.getMetaData(), result.getString(4));
			}
			// Close the result statement
			result.close();
			// Close the statement
			statement.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}		
		// Set up query string for deleting the record from the table
		query = "DELETE FROM metadatarecord WHERE experimentid = \'JUnit Experiment ID\'";
		try {
			// Prepare the query to get the node
			Statement statement = this.mDatabase.getConnection().createStatement();
			// Execute the query
			boolean result = statement.execute(query);
			// There should be no dataset
			assertFalse(result);
			//
			this.mDatabase.getConnection().commit();
			// Close the statement
			statement.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}	
	}

	@Test
	public void addHandlerRecordsTest() {
		assertTrue(this.mDatabase.isConnected());
		// Create records
		this.createExperimentRecords();
		// Verify records
		this.verifyExperimentRecords();
		
		// Create a list with metadata records
		ArrayList<HandlerRecord> records = new ArrayList<HandlerRecord>();
		// Add ten records which only differ in their id in experiment id
		for(int i = 0; i < 3; i++){
			HandlerRecord record = createHandlerRecord();
			record.setExperimentId(record.getExperimentId() + " " + i);
			records.add(record);
		}
		// Create the records
		this.mDatabase.addHandlerRecords(records);
		
		// Verify that the data was added to the table
		String query = "SELECT COUNT(*) FROM handlerrecords WHERE experimentid LIKE \'JUnit Experiment ID %\'" ;
		// Execute the query
		try {
			// Prepare the query to get the node
			Statement statement = this.mDatabase.getConnection().createStatement();
			// Execute the query
			ResultSet result = statement.executeQuery(query);
			// The count operator should return the value of three
			while(result.next()){
				assertTrue(result.getInt(1) == 3);
			}
			// Close the result statement
			result.close();
			// Close the statement
			statement.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}	
		
		// Set up query string for deleting the record from the table
		query = "DELETE FROM handlerrecords WHERE experimentid LIKE \'JUnit Experiment ID %\'";
		try {
			// Prepare the query to get the node
			Statement statement = this.mDatabase.getConnection().createStatement();
			// Execute the query
			boolean result = statement.execute(query);
			// There should be no dataset
			assertFalse(result);
			// Commit it
			this.mDatabase.getConnection().commit();
			// Close the statement
			statement.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		// Remove records
		this.removeExperimentRecords();
	}

	@Test
	public void addExperimentRecordsTest() {
		assertTrue(this.mDatabase.isConnected());
		// Create records
		this.createExperimentRecords();
		// Verify records
		this.verifyExperimentRecords();
		// Remove records
		this.removeExperimentRecords();
	}

	private MetaDataRecord createMetaDataRecord() {
		MetaDataRecord result = new MetaDataRecord();
		result.setExperimentId("JUnit Experiment ID");
		result.setNode("127.0.0.1");
		result.setTimeStamp(mTimestamp);
		result.setMetaData("MetaData Example");
		return result;
	}

	private HandlerRecord createHandlerRecord() {
		HandlerRecord result = new HandlerRecord();
		result.setExperimentId("JUnit Experiment ID");
		result.setNodeId("127.0.0.1");
		result.setTimeStamp(mTimestamp);
		result.setQualifiedName("TODO");
		result.setValue("1234");
		return result;
	}
	
	private void createExperimentRecords(){
		// Create a list with metadata records
		ArrayList<MetaDataRecord> records = new ArrayList<MetaDataRecord>();
		// Add ten records which only differ in their id in experiment id
		for(int i = 0; i < 3; i++){
			MetaDataRecord record = createMetaDataRecord();
			record.setExperimentId(record.getExperimentId() + " " + i);
			records.add(record);
		}
		// Create the records
		this.mDatabase.addExperimentRecords(records);
	}
	
	private void verifyExperimentRecords(){
		// Verify that the data was added to the table
		String query = "SELECT COUNT(*) FROM metadatarecord WHERE experimentid LIKE \'JUnit Experiment ID %\'" ;
		// Execute the query
		try {
			// Prepare the query to get the node
			Statement statement = this.mDatabase.getConnection().createStatement();
			// Execute the query
			ResultSet result = statement.executeQuery(query);
			// The count operator should return the value of three
			while(result.next()){
				assertTrue(result.getInt(1) == 3);
			}
			// Close the result statement
			result.close();
			// Close the statement
			statement.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}	
	}
	
	private void removeExperimentRecords(){
		// Set up query string for deleting the record from the table
		String query = "DELETE FROM metadatarecord WHERE experimentid LIKE \'JUnit Experiment ID %\'";
		try {
			// Prepare the query to get the node
			Statement statement = this.mDatabase.getConnection().createStatement();
			// Execute the query
			boolean result = statement.execute(query);
			// There should be no dataset
			assertFalse(result);
			// Commit it
			this.mDatabase.getConnection().commit();
			// Close the statement
			statement.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}	
	}
	
	@Test
	public void closeTest(){
		// Verify that the database connection still holds
		assertTrue(this.mDatabase.isConnected());
		// Close the database connection
		this.mDatabase.close();
		// Validate if the database is closed
		assertFalse(this.mDatabase.isConnected());
		try {
			// Validate if the database connection is actually closed
			assertTrue(this.mDatabase.getConnection().isClosed());
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
