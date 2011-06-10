package edu.hu.clickwatch.server.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import edu.hu.clickwatch.server.ClickWatchServer;
import edu.hu.clickwatch.server.configuration.ConfigurationFileReader;
import edu.hu.clickwatch.server.node.ClickWatchServerNodeConnection;

/**
 * 
 *  @author Michael Frey
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
		boolean result = mServer.readConfiguration();
		assertTrue(result);
	}
	
	@Test
	public void activateConfigurationTest(){

	}
		
	@Test
	public void getConnectionListTest(){
		assertNotNull(mServer.getConnectionList());
	}
	
	@Test
	public void setConnectionListTest(){
		//
		ArrayList<ClickWatchServerNodeConnection> alternativeConnectionList = new ArrayList<ClickWatchServerNodeConnection>();
		//
		ArrayList<ClickWatchServerNodeConnection> originalConnectionList = mServer.getConnectionList();
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
	
	@Test
	public void getConfigurationFileReaderTest(){
		assertNotNull(mServer.getConfigurationFileReader());
	}
	
	@Test
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
	
	@Test
	public void getConfigurationFileTest(){
		assertEquals(mConfigurationFile, mServer.getConfigurationFile());
	}
	
	@Test
	public void setConfigurationFileTest(){
		//
		String alternative = "src/test/resources" + ClickWatchServerTest.class.getPackage().getName().replace(".", "/") + "/test.xml";
		//
		mServer.setConfigurationFile(alternative);
		//
		assertNotSame(mConfigurationFile, mServer.getConfigurationFile());
		//
		assertEquals(alternative, mServer.getConfigurationFile());
	}
}
