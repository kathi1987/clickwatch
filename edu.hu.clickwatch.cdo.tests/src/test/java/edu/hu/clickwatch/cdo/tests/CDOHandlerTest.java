package edu.hu.clickwatch.cdo.tests;

import static org.junit.Assert.assertTrue;

import java.math.BigInteger;

import org.junit.Before;
import org.junit.Test;

import edu.hu.clickwatch.cdo.CDOHandler;
import edu.hu.clickwatch.model.ClickWatchModelFactory;
import edu.hu.clickwatch.model.Node;

/**
 * The class tests the class CDOHandler in project edu.hu.clickwatch.cdo. For every
 * method in the class which should be tested is a corresponding test method.
 *
 * @author Michael Frey
 */
public class CDOHandlerTest {
	/** The CDOHandler object which will be tested */
	private CDOHandler mCDOHandler;
	/** The corresponding CDO repository */
	private final String mResource = "click";
	
	/**
	 * The method initializes the CDOHandler object 
	 */
	@Before
	public void initialize(){
		this.mCDOHandler = new CDOHandler("127.0.0.1",  BigInteger.valueOf(2036) , "click");
	}
	
	@Test
	public void setModelTest(){
		
	}
	
	@Test
	public void commitTransactionTest(){
		
	}
	
	@Test
	public void rollbackTransactionTest(){
		
	}
	
	@Test
	public void getModelTest(){
		
	}
		
	/**
	 * This test tests if a session can be opened. For further information about
	 * the use of deprecated methos in the test please refere to the documentation
	 * of the test method closeSessionTest().
	 */
	@SuppressWarnings("deprecation")
	@Test
	public void openSessionTest(){
		this.mCDOHandler.openSession();
		assertTrue(!this.mCDOHandler.sessionIsClosed());
		// Checks if the connector is closed
		assertTrue(!this.mCDOHandler.connectorIsClosed());
		// Checks if the container is active
		assertTrue(this.mCDOHandler.containerIsActive());
	}

	/**
	 * This test tests if a opened session can be closed. The Connection class 
	 * encapsulates various CDO session related component e.g. a connector or 
	 * a container. Unfortunately the class is a inner private class and should
	 * remain a inner private class in class connection. A simple get-method on
	 * a instance of the private class Connection in class CDOhandler is not
	 * possible. Thus get-methods on the encapuslated components have been 
	 * defined and set as deprecated. Future releases will probably test the 
	 * method in better ways.
	 */
	@SuppressWarnings("deprecation")
	@Test
	public void closeSessionTest(){
		// First we'll have to open a cdo session
		this.mCDOHandler.openSession();
		// As part of the test we close the session
		this.mCDOHandler.closeSession();
		// Checks if the session closed
		assertTrue(this.mCDOHandler.sessionIsClosed());
		// Checks if the connector is closed
		assertTrue(this.mCDOHandler.connectorIsClosed());
		// TODO: Checks if the container is active
		// assertTrue(!this.mCDOHandler.containerIsActive());
	}
	
	@Test
	public void openTransactionTest(){
		// Open a CDO session
		this.mCDOHandler.openSession();
		// Create a node
		final Node node = ClickWatchModelFactory.eINSTANCE.createNode();
		node.setPort("22");
		node.setINetAdress("192.168.178.42");
		node.setConnected(false);
		// Open a transaction and prepare resource for commit
		this.mCDOHandler.openTransaction(node);
		//
		//this.mCDOHandler.openTransaction(mResource);
		//	
		this.mCDOHandler.closeSession();
	}
}
