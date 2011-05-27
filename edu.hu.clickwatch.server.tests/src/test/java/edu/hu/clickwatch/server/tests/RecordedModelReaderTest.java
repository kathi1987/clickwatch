package edu.hu.clickwatch.server.tests;

import java.io.File;

import org.eclipse.emf.common.util.URI;
import org.junit.Before;
import org.junit.Test;

import edu.hu.clickwatch.server.RecordedModelReader;


public class RecordedModelReaderTest {
	/** */
	private String mRecordedFileLocation = "src/test/resources/" + ServerTest.class.getPackage().getName().replace(".", "/") + "/record.clickwatchmodel";
	/** */
	private RecordedModelReader reader;
	
	@Before
	public void initialize() {
		// Instantiate the reader 
		reader = new RecordedModelReader();		
	}
	
	@Test
	public void initializeTest(){
		// Create the corresponding recorded model file
		File model = new File(mRecordedFileLocation);
		//URI.createFileURI
		reader.initialize(URI.createFileURI(model.getAbsolutePath()));
	}
}

