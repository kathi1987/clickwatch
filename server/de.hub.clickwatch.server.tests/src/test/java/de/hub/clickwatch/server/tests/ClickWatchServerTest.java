package de.hub.clickwatch.server.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import com.google.inject.AbstractModule;

import de.hub.clickcontrol.IClickSocket;
import de.hub.clickwatch.connection.INodeConnection;
import de.hub.clickwatch.connection.INodeConnectionProvider;
import de.hub.clickwatch.connection.adapter.IMetaDataAdapter;
import de.hub.clickwatch.connection.adapter.IValueAdapter;
import de.hub.clickwatch.connection.adapter.StringValueAdapter;
import de.hub.clickwatch.recorder.ClickSocketPlayer;
import de.hub.clickwatch.recorder.ClickSocketPlayerSocketImpl;
import de.hub.clickwatch.server.ClickWatchServer;
import de.hub.clickwatch.server.configuration.ConfigurationFileReader;
import de.hub.clickwatch.tests.AbstractTest;


/**
 * The class ClickWatchServerTest tests the functionality of the class ClickWatchServer in project 
 * de.hub.clickwatch.server. For every method a test is written.
 * 
 * @author Michael Frey
 */
public class ClickWatchServerTest extends AbstractTest {
	/** The path to the configuration file */
	private String mConfigurationFile = "src/test/resources/" + ClickWatchServerTest.class.getPackage().getName().replace(".", "/") + "/configuration.xml";
		
	@Override
	protected AbstractModule[] getAdditionalModules() {
		String record = "src/test/resources/" + ClickWatchServerTest.class.getPackage().getName().replace(".", "/") + "/" + ClickWatchServerTest.class.getSimpleName() + ".clickwatchmodel";
		return new AbstractModule[] { new ClickSocketPlayer.PlayerModule(record, false) };
	}

	@Override
	protected Class<? extends IValueAdapter> getValueAdapterClass() {
		return StringValueAdapter.class;
	}

	@Override
	protected Class<? extends IClickSocket> getClickSocketClass() {
		return ClickSocketPlayerSocketImpl.class;
	}
	
	@Test
	public void threadTest() throws Exception {
		// Get an instance of the clickwatch server
		ClickWatchServer server = injector.getInstance(ClickWatchServer.class);
		// Create a connection
		INodeConnection connection = injector.getInstance(INodeConnectionProvider.class).createConnection("10.7.205.149", "7777");
		// Connect to the recorded model
		connection.connect();
		// Get the meta data from the node
		connection.getAdapter(IMetaDataAdapter.class).pullAllMetaData();
		// set the configuration
		server.setConfigurationFile(mConfigurationFile);
		// Read the configuration
		server.readConfiguration();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		// Shutdown the server
		server.shutdown();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	/*
	@Test
	public void readConfigurationTest(){
		// Get an instance of the clickwatch server
		ClickWatchServer server = injector.getInstance(ClickWatchServer.class);
		// Set the path to the configuration file
		server.setConfigurationFile(mConfigurationFile);
		// The configuration file reader has to be initialized
		assertNotNull(server.getConfigurationFileReader());
		// The configuration file in the server has to match the configuration file set in the test
		assertEquals(mConfigurationFile, server.getConfigurationFile());
		// Read the configuration
		server.readConfiguration();
		// Verify that the database was intitalized
		assertNotNull(server.getDatabase());
		// Verify that there is a database connection
		assertTrue(server.getDatabase().isConnected());
		// 
	}
	
	@Test
	public void activateConfigurationTest(){
		// TODO
	}
		
	
	public void getConnectionListTest(){
		assertNotNull(server.getConnectionList());
	}
	
	
	public void setConnectionListTest(){
		//
		ArrayList<INodeConnection> alternativeConnectionList = new ArrayList<INodeConnection>();
		//
		ArrayList<INodeConnection> originalConnectionList = mServer.getConnectionList();
		//
		mServer.setConnectionList(alternativeConnectionList);
		//
		assertNotSame(originalConnectionList, mServer.getConnectionList());
		//
		assertEquals(alternativeConnectionList, mServer.getConnectionList());
	}
	
	@Test
	public void shutdownTest(){
		
	}
	
	
	public void getConfigurationFileReaderTest(){
		assertNotNull(mServer.getConfigurationFileReader());
	}
	
	
	public void setConfigurationFileReaderTest(){
		//
		final String alternativeConfigurationFile = "src/test/resources" + ClickWatchServerTest.class.getPackage().getName().replace(".", "/") + "/test.xml";
		//
		final ConfigurationFileReader alternativeReader = new ConfigurationFileReader(alternativeConfigurationFile);
		//
		final ConfigurationFileReader original = mServer.getConfigurationFileReader();
		//
		mServer.setConfigurationFileReader(alternativeReader);
		//
		assertNotSame(original, mServer.getConfigurationFileReader());
		//
		assertEquals(alternativeReader, mServer.getConfigurationFileReader());
	}
	
	
	public void getConfigurationFileTest(){
		// Configuration file has to be equal to the previously set configuration file
		assertEquals(getConfigurationFile(), mServer.getConfigurationFile());
	}
	
	
	public void setConfigurationFileTest(){
		// Determine the path to the configuration file
		String alternative = "src/test/resources" + ClickWatchServerTest.class.getPackage().getName().replace(".", "/") + "/test.xml";
		// Set the path to the configuration file (and read it)
		mServer.setConfigurationFile(alternative);
		// Validate the that both configuration files differ
		assertNotSame(getConfigurationFile(), mServer.getConfigurationFile());
		// New configuration file should match alternative configuration file (name)
		assertEquals(alternative, mServer.getConfigurationFile());
	}
	*/
	
}