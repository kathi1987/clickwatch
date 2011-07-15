package de.hub.clickwatch.server.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import de.hub.clickwatch.connection.INodeConnection;
import de.hub.clickwatch.server.ClickWatchServer;
import de.hub.clickwatch.server.configuration.ConfigurationFileReader;


/**
 * The class ClickWatchServerTest tests the functionality of the class ClickWatchServer in project 
 * de.hub.clickwatch.server. 
 * 
 * @author Michael Frey
 */
public class ClickWatchServerTest {
	/** The path to the standard configuration file which is used in this junit test */
	private String mConfigurationFile = "src/test/resources/" + ClickWatchServerTest.class.getPackage().getName().replace(".", "/") + "/configuration.xml";
	/** The server object which holds the node connections */
	private ClickWatchServer mServer;
	
	@Before
	public void initialize(){
		mServer = new ClickWatchServer(mConfigurationFile);
	}
	
	@Test
	public void readConfigurationTest(){
		// The configuration file reader has to be initialized
		assertNotNull(mServer.getConfigurationFileReader());
		// The configuration file in the server has to match the configuration file set in the test
		assertEquals(this.mConfigurationFile, mServer.getConfigurationFile());
		// Read the configuration
		mServer.readConfiguration();
		// Verify that the database was intitalized
		assertNotNull(mServer.getDatabase());
		// Verify that there is a database connection
		assertTrue(mServer.getDatabase().isConnected());
		// 
	}
	
	@Test
	public void activateConfigurationTest(){
		// TODO
	}
		
	
	public void getConnectionListTest(){
		assertNotNull(mServer.getConnectionList());
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
		assertEquals(mConfigurationFile, mServer.getConfigurationFile());
	}
	
	
	public void setConfigurationFileTest(){
		// Determine the path to the configuration file
		String alternative = "src/test/resources" + ClickWatchServerTest.class.getPackage().getName().replace(".", "/") + "/test.xml";
		// Set the path to the configuration file (and read it)
		mServer.setConfigurationFile(alternative);
		// Validate the that both configuration files differ
		assertNotSame(mConfigurationFile, mServer.getConfigurationFile());
		// New configuration file should match alternative configuration file (name)
		assertEquals(alternative, mServer.getConfigurationFile());
	}
}