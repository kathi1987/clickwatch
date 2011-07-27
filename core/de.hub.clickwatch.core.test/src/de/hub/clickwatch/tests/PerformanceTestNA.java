package de.hub.clickwatch.tests;

import java.text.DecimalFormat;
import java.text.NumberFormat;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.junit.Ignore;
import org.junit.Test;

import com.google.inject.Guice;
import com.google.inject.Injector;

import de.hub.clickcontrol.IClickSocket;
import de.hub.clickwatch.ClickWatchModule;
import de.hub.clickwatch.connection.INodeConnection;
import de.hub.clickwatch.connection.INodeConnectionProvider;
import de.hub.clickwatch.connection.adapter.AbstractAdapter;
import de.hub.clickwatch.connection.adapter.INodeAdapter;
import de.hub.clickwatch.connection.adapter.IValueAdapter;
import de.hub.clickwatch.connection.adapter.StringValueAdapter;
import de.hub.clickwatch.connection.adapter.XmlValueAdapter;
import de.hub.clickwatch.model.ClickWatchModelFactory;
import de.hub.clickwatch.model.Network;
import de.hub.clickwatch.model.Node;
import de.hub.emfxml.XmlModelRepository;


public class PerformanceTestNA {

	private static NumberFormat milliesFormat = new DecimalFormat("#00:000");
	
	private void performTest(final Class<? extends IValueAdapter> adapterClass, int numberOfElements, int numberOfHandler, int numberOfUpdates, int reportOnEach) {	
		final IClickSocket clickSocket = TestUtil.createClickSocket(numberOfElements, numberOfHandler, true);
		Injector injector = Guice.createInjector(new ClickWatchModule() {
			@Override
			protected void bindValueAdapter() {
				bind(IValueAdapter.class).to(adapterClass);
			}

			@Override
			protected void bindClickSocket() {
				bind(IClickSocket.class).toInstance(clickSocket);
			}			
		});
		
		Network network = ClickWatchModelFactory.eINSTANCE.createNetwork();
		Node node = ClickWatchModelFactory.eINSTANCE.createNode();
		network.getNodes().add(node);
		
		INodeConnectionProvider ncp = injector.getInstance(INodeConnectionProvider.class);
		INodeConnection connection = ncp.createConnection("localhost", "7777");
		connection.connect();
		
		INodeAdapter nodeAdapter = connection.getAdapter(INodeAdapter.class);
		
		for (int i = 0; i < numberOfUpdates; i++) {
			nodeAdapter.pullNode();
			TestUtil.report("perfrom a test ", i, reportOnEach);
		}
	}
	
	@Ignore("memoryleak test, only perform when indicated")
	@Test
	public void testSingleUpdate() {
		performTest(XmlValueAdapter.class, 3, 3, 1, 1);
	}
	
	@Ignore("memoryleak test, only perform when indicated")
	@Test
	public void testSmallUpdates() {
		performTest(XmlValueAdapter.class, 3, 3, 100 * 1000, 100);
	}
	
	@Ignore("memoryleak test, only perform when indicated")
	@Test
	public void testLargeUpdates() {
		performTest(XmlValueAdapter.class, 30, 10, 100 * 1000, 10);
	}
	
	@Ignore("memoryleak test, only perform when indicated")
	@Test
	public void testLargeUpdatesOnSimpleAdapter() {
		performTest(StringValueAdapter.class, 30, 10, 100 * 1000, 10);
	}
	
	private void performcePerformenceMeasure(Runnable runnable, long items) {
		long start = System.currentTimeMillis();
		runnable.run();
		long millies = System.currentTimeMillis() - start;
		System.out.println("\ntotal time: " + milliesFormat.format(millies) + 
				", " + (long)(((double)items / millies) * 1000) + " updates per second\n\n");
	}
	
	@Ignore("memoryleak test, only perform when indicated")
	@Test
	public void testPerformance() {
		performcePerformenceMeasure(new Runnable() {			
			@Override
			public void run() {
				performTest(StringValueAdapter.class, 10, 5, 1000, 100);
			}
		}, 10 * 5 * 1000);
		
		performcePerformenceMeasure(new Runnable() {			
			@Override
			public void run() {
				performTest(XmlValueAdapter.class, 10, 5, 1000, 100);
			}
		}, 10 * 5 * 1000);
	}
	
	@Ignore("memoryleak test, only perform when indicated")
	@Test
	public void testDeserializeForMemoryLeak() {	
		XmlModelRepository xmlModelRepository = new XmlModelRepository();
		long runs = 200000;
		long reportOnEach = 1000;
		
		for (int i = 0; i < runs; i++) {
			EcoreUtil.delete(xmlModelRepository.deserializeXml("<foo><bar>TEXT</bar></foo>"), true);
			TestUtil.report("deserialize memory leak? ", i, reportOnEach);
		}
	}
	
	@Ignore("memoryleak test, only perform when indicated")
	@Test
	public void testRetrieveForMemoryLeak() {
		long runs = 500;
		long reportOnEach = 10;
		
		final IClickSocket clickSocket = TestUtil.createClickSocket(30, 10, false);
		Injector injector = Guice.createInjector(new ClickWatchModule() {
			@Override
			protected void bindValueAdapter() {
				bind(IValueAdapter.class).to(StringValueAdapter.class);
			}

			@Override
			protected void bindClickSocket() {
				bind(IClickSocket.class).toInstance(clickSocket);
			}			
		});
		INodeConnectionProvider ncp = injector.getInstance(INodeConnectionProvider.class);
		INodeConnection connection = ncp.createConnection("localhost", "7777");
		connection.connect();
		
		INodeAdapter nodeAdapter = connection.getAdapter(INodeAdapter.class);
		
		for (int i = 0; i < runs; i++) {
			Node node = nodeAdapter.pullNode();
			((AbstractAdapter)nodeAdapter).clearCaches();
			EcoreUtil.delete(node, true);
			TestUtil.report("retrieve memory leaks?", i, reportOnEach);
		}
	}
}
