package de.hub.clickwatch.server.tests;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.File;

import org.eclipse.emf.ecore.resource.Resource;
import org.junit.Before;
import org.junit.Test;

import de.hub.clickwatch.server.configuration.ConfigurationFileReader;

public class ConfigurationFileReaderTest {
	private ConfigurationFileReader mReader;
	
	@Before
	public void initialize(){
		final String configurationFile = "src/test/resources/" + ClickWatchServerTest.class.getPackage().getName().replace(".", "/") + "/configuration.xml";
		this.mReader = new ConfigurationFileReader(configurationFile);
	}
	
	@Test
	public void readConfigurationFileTest(){
		Resource resource = this.mReader.readConfigurationFile();
		assertNotNull(resource);
	}
	
	@Test 
	public void getConfigurationFileTest(){
		assertNotNull(this.mReader.getConfigurationFile());
	}
	
	@Test
	public void setConfigurationFileTest(){
		// Get the original configuration file
		File originalConfigurationFile = this.mReader.getConfigurationFile();
		// Verify that the original configuration file is not null
		assertNotNull(originalConfigurationFile);
		// Path to the alternative configuration file
		final String configurationFile = "src/test/resources/" + ClickWatchServerTest.class.getPackage().getName().replace(".", "/") + "/alternative.xml";
		// Create a new configuration file reader
		ConfigurationFileReader alternativeReader = new ConfigurationFileReader(configurationFile);
		// Create an alternative configuration file
		File anotherConfigurationFile = alternativeReader.getConfigurationFile();
		// Verify that the alternative configuration file is not null
		assertNotNull(anotherConfigurationFile);
		// Set the new configuration file
		this.mReader.setConfigurationFile(anotherConfigurationFile);
		// Verify that both files are different
		assertTrue(originalConfigurationFile.getName() != anotherConfigurationFile.getName());
	}	
}
