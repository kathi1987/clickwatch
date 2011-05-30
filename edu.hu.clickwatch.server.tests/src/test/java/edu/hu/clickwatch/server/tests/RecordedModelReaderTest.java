package edu.hu.clickwatch.server.tests;

import java.io.File;

import org.eclipse.emf.common.util.URI;
import org.junit.Before;
import org.junit.Test;

import edu.hu.clickwatch.server.ClickWatchServerPlayer;


public class RecordedModelReaderTest {
	/** */
	private String mRecordedFileLocation = "src/test/resources/" + ClickWatchServerTest.class.getPackage().getName().replace(".", "/") + "/record.clickwatchmodel";
	/** */
	private ClickWatchServerPlayer reader;
	
	@Before
	public void initialize() {
		// Instantiate the reader 
		reader = new ClickWatchServerPlayer();		
	}
	
	@Test
	public void initializeTest(){
		// Create the corresponding recorded model file
		File model = new File(mRecordedFileLocation);
		//URI.createFileURI
		reader.initialize(URI.createFileURI(model.getAbsolutePath()));
	}
}

