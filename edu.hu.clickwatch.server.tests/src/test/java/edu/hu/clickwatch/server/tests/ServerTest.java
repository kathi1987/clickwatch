package edu.hu.clickwatch.server.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import edu.hu.clickwatch.server.ConfigurationFileReader;
import edu.hu.clickwatch.server.NodeConnection;
import edu.hu.clickwatch.server.Server;

/**
 * 
 *  @author Michael Frey
 */
public class ServerTest {
	/** The path to the standard configuration file which is used in this junit test */
	private String mConfigurationFile = "src/test/resources" + ServerTest.class.getPackage().getName().replace(".", "/") + "/configuration.xml";
	/** The server object which holds the node connections */
	private Server mServer;
	
	@Before
	public void initialize(){
		mServer = new Server(mConfigurationFile);
	}
	
	@Test
	public void initializeTest(){

	}
	
	@Test
	public void getConnectionListTest(){
		assertNotNull(mServer.getConnectionList());
	}
	
	@Test
	public void setConnectionListTest(){
		//
		ArrayList<NodeConnection> alternativeConnectionList = new ArrayList<NodeConnection>();
		//
		ArrayList<NodeConnection> originalConnectionList = mServer.getConnectionList();
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
		final String alternativeConfigurationFile = "src/test/resources" + ServerTest.class.getPackage().getName().replace(".", "/") + "/test.xml";
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
		String alternative = "src/test/resources" + ServerTest.class.getPackage().getName().replace(".", "/") + "/test.xml";
		//
		mServer.setConfigurationFile(alternative);
		//
		assertNotSame(mConfigurationFile, mServer.getConfigurationFile());
		//
		assertEquals(alternative, mServer.getConfigurationFile());
	}
}
