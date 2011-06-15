package edu.hu.clickwatch.logservice.tests;

import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

import edu.hu.clickwatch.logservice.FileLogWriter;

public class FileLogWriterTest {
	private FileLogWriter mWriter;
	
	@Before 
	public void initialize(){
		this.mWriter = new FileLogWriter();
	}
	
	@Test
	public void isInitializedTest(){
		assertNotNull(this.mWriter);
	}
}
