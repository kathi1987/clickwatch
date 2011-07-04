package de.hub.clickwatch.cdo.tests;

import static org.junit.Assert.assertTrue;

import java.math.BigInteger;

import org.junit.Before;
import org.junit.Test;

import de.hub.clickwatch.cdo.CDOHandler;

import de.hub.clickwatch.model.ClickWatchModelFactory;
import de.hub.clickwatch.model.Node;

/**
 * The class tests the class CDOHandler in project edu.hu.clickwatch.cdo. For every
 * method in the class which should be tested is a corresponding test method.
 *
 * @author Michael Frey
 */
public class CDOHandlerTest {
	/** The CDOHandler object which will be tested */
	private CDOHandler mCDOHandler;
	
	/**
	 * The method initializes the CDOHandler object 
	 */
	@Before
	public void initialize(){
		this.mCDOHandler = new CDOHandler("127.0.0.1",  BigInteger.valueOf(2036) , "clicktest");
	}
	
	@Test
	public void commitTransactionTest(){
		// Open a CDO session
		this.mCDOHandler.openSession();
		// Create a node
		final Node node = ClickWatchModelFactory.eINSTANCE.createNode();
		// Set port
		node.setPort("22");
		// Set ip address
		node.setINetAddress("192.168.178.42");
		// Set connection status to false
		node.setConnected(false);
		// Open a transaction and prepare resource for commit
		this.mCDOHandler.openTransaction(node);
		// Commit the transaction
		this.mCDOHandler.commitTransaction();
		// Rollback the transaction
		this.mCDOHandler.rollbackTransaction();
		// Close the transaction
		this.mCDOHandler.closeTransaction();
		// Close the session
		this.mCDOHandler.closeSession();
	}
	
	@Test
	public void rollbackTransactionTest(){
		// Open a CDO session
		this.mCDOHandler.openSession();
		// Create a node
		final Node node = ClickWatchModelFactory.eINSTANCE.createNode();
		// Set port
		node.setPort("22");
		// Set ip address
		node.setINetAddress("192.168.178.42");
		// Set connection status to false
		node.setConnected(false);
		// Open a transaction and prepare resource for commit
		this.mCDOHandler.openTransaction(node);
		// Commit the transaction
		this.mCDOHandler.commitTransaction();
		// Rollback the transaction
		this.mCDOHandler.rollbackTransaction();
		// Close the transaction
		this.mCDOHandler.closeTransaction();
		// Close the session
		this.mCDOHandler.closeSession();
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
	
	/**
	 * The method tests if a transaction can be prepared. 
	 */
	@Test
	public void openTransactionTest(){
		// Open a CDO session
		this.mCDOHandler.openSession();
		// Create a node
		final Node node = ClickWatchModelFactory.eINSTANCE.createNode();
		// Set port
		node.setPort("22");
		// Set ip address
		node.setINetAddress("192.168.178.42");
		// Set connection status to false
		node.setConnected(false);
		// Open a transaction and prepare resource for commit
		this.mCDOHandler.openTransaction(node);	
		// Close the transaction
		this.mCDOHandler.closeTransaction();
		// Close the session
		this.mCDOHandler.closeSession();
	}
}
