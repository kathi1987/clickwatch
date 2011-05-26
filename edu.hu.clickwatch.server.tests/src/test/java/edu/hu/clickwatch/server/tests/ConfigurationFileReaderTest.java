package edu.hu.clickwatch.server.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;

import java.io.File;

import org.eclipse.emf.ecore.resource.Resource;
import org.junit.Before;
import org.junit.Test;

import edu.hu.clickwatch.server.ConfigurationFileReader;


/**
 * 
 * @author Michael Frey
 */
public class ConfigurationFileReaderTest {
	/** The path to the standard configuration file which is used in this junit test */
	private String mConfigurationFile = "src/test/resources/" + ServerTest.class.getPackage().getName().replace(".", "/") + "/configuration.xml";
	/** The configuration file reader object */
	private ConfigurationFileReader mReader = null;
	
	@Before 
	public void initialize(){
		mReader = new ConfigurationFileReader(mConfigurationFile);
		assertNotNull(mReader);
	}
	
	@Test
	public void getConfigurationFileTest(){
		// Check if the path in mConfigurationFile is equal to the path stored in the configuration file reader class
		int result = mConfigurationFile.compareTo(mReader.getConfigurationFile().getPath());
		// Check if the result is the expected value of the zero since both paths are equal
		assertEquals(0, result);
	}
	
	@Test
	public void readConfigurationFileTest(){
		// Read the configuration file
		Resource resource = mReader.readConfigurationFile();
		// If a error occured reading the configuration file the object would be null
		assertNotNull(resource);
	}
		
	@Test
	public void setConfigurationFileTest(){
		// A path to the new alterantive configuration file
		String alternateConfigurationFile = "src/test/resources/" + ServerTest.class.getPackage().getName().replace(".", "/") + "/test.xml";
		// Create a new alternative configuration file
		File alternativeFile = new File(alternateConfigurationFile);
		// Save the original file stored in the configuration file reader
		File originalFile = mReader.getConfigurationFile();
		// Set the configuration file
		mReader.setConfigurationFile(alternativeFile);
		// Original file and new file shouldn't be the same
		assertNotSame(originalFile, mReader.getConfigurationFile());
		// New file loaded in test should be the same file which is saved in the configuration file reader
		assertEquals(alternativeFile, mReader.getConfigurationFile());
	}	
}
