package edu.hu.clickwatch.cdo.tests;

import java.math.BigInteger;

import org.junit.Before;
import org.junit.Test;

import edu.hu.clickwatch.cdo.CDOHandler;

public class CDOHandlerTest {
	
	private CDOHandler mCDOHandler;
	
	@Before
	public void initialize(){
		mCDOHandler = new CDOHandler("127.0.0.1",  BigInteger.valueOf(2036) , "click");
	}
/*
	public void openSession();
	
	public void openTransaction(final String pResource);

	public void commitTransaction();
	
	public void rollbackTransaction();

	public EObject getModel();

	public void setModel(EObject pModel);

	void closeSession();}
	*/
	
	@Test
	public void setModelTest(){
		
	}
	
	@Test
	public void getModelTest(){
		
	}
	
	@Test
	public void openSessionTest(){
		mCDOHandler.openSession();
	}
	
	@Test
	public void closeSessionTest(){
		mCDOHandler.closeSession();
	}
}
