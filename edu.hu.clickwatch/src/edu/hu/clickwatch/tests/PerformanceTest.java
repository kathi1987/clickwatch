package edu.hu.clickwatch.tests;

import java.text.DecimalFormat;
import java.text.NumberFormat;

import junit.framework.TestCase;

import com.google.inject.Guice;
import com.google.inject.Injector;

import edu.hu.clickcontrol.IClickSocket;
import edu.hu.clickwatch.GuiceModule;
import edu.hu.clickwatch.model.ClickWatchModelFactory;
import edu.hu.clickwatch.model.Network;
import edu.hu.clickwatch.model.Node;
import edu.hu.clickwatch.nodeadapter.ClickControlNodeXmlValuesAdapter;
import edu.hu.clickwatch.nodeadapter.INodeAdapter;

public class PerformanceTest extends TestCase {
	
	

	private void performTest(int numberOfElements, int numberOfHandler, int numberOfUpdates, int reportOnEach) {
		Runtime runtime = Runtime.getRuntime();
		NumberFormat memFormat = new DecimalFormat("#00,000,000,000,000");
		NumberFormat updatesFormat = new DecimalFormat("#00,000,000");
		
		final IClickSocket clickSocket = TestUtil.createClickSocket(numberOfElements, numberOfHandler);
		Injector injector = Guice.createInjector(new GuiceModule() {
			@Override
			public void configure() {
				bind(IClickSocket.class).toInstance(clickSocket);
				bind(INodeAdapter.class).to(ClickControlNodeXmlValuesAdapter.class);
			}			
		});
		
		Network network = ClickWatchModelFactory.eINSTANCE.createNetwork();
		Node node = ClickWatchModelFactory.eINSTANCE.createNode();
		network.getNodes().add(node);
		
		NodeConnectionTestImpl connection = injector.getInstance(NodeConnectionTestImpl.class);
		connection.setUp(node);
		connection.connect(null);
		connection.getNodeAdapter().connect();
		for (int i = 0; i < numberOfUpdates; i++) {
			connection.runUpdate();
			if (i % reportOnEach == 0) {
				System.out.println("updates run: " + updatesFormat.format(i) + "; memory-usage: " + 
						memFormat.format(runtime.totalMemory() - runtime.freeMemory()) +
						"; heap-size: " + memFormat.format(runtime.totalMemory()));
			}
		}
	}
	
	public void testSingleUpdate() {
		performTest(3, 3, 1, 1);
	}
	
	public void test1kUpdates() {
		performTest(3, 3, 1001, 1000);
	}
	
	public void test100kUpdates() {
		performTest(30, 10, 100 * 1001, 1000);
	}
	
}