package edu.hu.clickwatch.tests;

import java.text.DecimalFormat;
import java.text.NumberFormat;

import junit.framework.TestCase;
import click.ControlSocket.HandlerInfo;

import com.google.inject.Guice;
import com.google.inject.Injector;

import edu.hu.clickcontrol.IClickSocket;
import edu.hu.clickwatch.GuiceModule;
import edu.hu.clickwatch.model.ClickWatchModelFactory;
import edu.hu.clickwatch.model.Network;
import edu.hu.clickwatch.model.Node;
import edu.hu.clickwatch.nodeadapter.ClickControlNodeXmlValuesAdapter;
import edu.hu.clickwatch.nodeadapter.INodeAdapter;

public class ClickControlNodeConnectionTest extends TestCase {
	
	private IClickSocket createClickSocket(final int numberOfElements, final int numberOfHandlers) {
		return new ClickSocketTestImpl() {	
			@Override
			public void handleWrite(String element, String handler, String value) {
				// empty
			}
			
			@Override
			public String getValue(String element, String handler) {
				return "<foo><bar>TEXT</bar></foo>";
			}
			
			@Override
			public HandlerInfo[] getHandler(String element) {
				HandlerInfo[] result = new HandlerInfo[numberOfHandlers];
				for (int i = 0; i < numberOfHandlers; i++) {
					result[i] = new HandlerInfo(element, "h" + i, true, true);
				}
				return result;
			}
			
			@Override
			public String[] getElements() {
				String[] result = new String[numberOfElements];
				for (int i = 0; i < numberOfElements; i++) {
					result[i] = "e" + i;
				}
				return result;
			}
		};
	}

	private void performTest(int numberOfElements, int numberOfHandler, int numberOfUpdates, int reportOnEach) {
		Runtime runtime = Runtime.getRuntime();
		NumberFormat memFormat = new DecimalFormat("#00,000,000,000,000");
		NumberFormat updatesFormat = new DecimalFormat("#00,000,000");
		
		final IClickSocket clickSocket = createClickSocket(numberOfElements, numberOfHandler);
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
		
		ClickControlNodeConnectionTestImpl connection = injector.getInstance(ClickControlNodeConnectionTestImpl.class);
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
