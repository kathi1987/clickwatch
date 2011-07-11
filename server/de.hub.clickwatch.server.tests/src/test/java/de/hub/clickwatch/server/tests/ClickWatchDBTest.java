package de.hub.clickwatch.server.tests;

import org.junit.Test;

import de.hub.clickcontrol.IClickSocket;
import de.hub.clickwatch.model.ClickWatchModelFactory;
import de.hub.clickwatch.model.Network;
import de.hub.clickwatch.model.Node;
import de.hub.clickwatch.nodeadapter.ClickControlNodeAdapter;
import de.hub.clickwatch.nodeadapter.INodeAdapter;
import de.hub.clickwatch.recorder.ClickSocketPlayerSocketImpl;
import de.hub.clickwatch.server.database.ClickWatchDB;
import de.hub.clickwatch.tests.AbstractTest;

public class ClickWatchDBTest extends AbstractTest {
	private Network network = null;
	
	private static final ClickWatchModelFactory factory = ClickWatchModelFactory.eINSTANCE;
	/*
	@Override
	protected AbstractModule[] getAdditionalModules() {
		String record = "src/test/resources/" + ClickWatchDBTest.class.getPackage().getName().replace(".", "/") + "/" 
				+ ClickWatchDBTest.class.getSimpleName() + ".clickwatchmodel";
		
		return new AbstractModule[] { new ClickSocketPlayer.PlayerModule(record, false) };
	}

	@Override
	protected IConnectionConfiguration getConnectionConfiguration() {
		return new TestConnectionConfiguration() {
			@Override
			public void runInExtraThread(final Runnable runnable) {
				new Thread(runnable, "ConnectionConfiguration Thread").start();
			}
		};
	}
		*/


	private Node createNode() {
		Node node = factory.createNode();
		network.getNodes().add(node);
		return node;
	}
	
	@Override
	protected void additionalSetUp() {
		network = factory.createNetwork();
		network.setUpdateIntervall(1);
	}
	
	@Override
	protected Class<? extends INodeAdapter> getNodeAdapterClass() {
		return ClickControlNodeAdapter.class;
	}

	@Override
	protected Class<? extends IClickSocket> getClickSocketClass() {
		return ClickSocketPlayerSocketImpl.class;
	}
	
	private static void sleep(){
		try {
			Thread.sleep(30000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void createTableTest(){
		// Get an instance of ClickWatchDb
		ClickWatchDB database = injector.getInstance(ClickWatchDB.class);
		// Build up the file string which specifies where the sql file resides
		final String file = "src/test/resources/" + ClickWatchDBTest.class.getPackage().getName().replace(".", "/") + "/" 
				+ "test" + ".sql";
		// Set up the database connection
		database.setUpDatabaseConnection("clickwatch", "cw", "clickwatch");
		// Checks if the table already exists
		
		// Create tables
		database.createTables(file);
		
		// Check if the table exists
	}
}
