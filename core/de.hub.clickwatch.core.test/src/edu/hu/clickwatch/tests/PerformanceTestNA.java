package edu.hu.clickwatch.tests;

import java.text.DecimalFormat;
import java.text.NumberFormat;

import junit.framework.TestCase;

import org.eclipse.emf.ecore.util.EcoreUtil;

import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.Injector;

import edu.hu.clickcontrol.IClickSocket;
import edu.hu.clickwatch.ClickWatchModule;
import edu.hu.clickwatch.XmlModelRepository;
import edu.hu.clickwatch.model.ClickWatchModelFactory;
import edu.hu.clickwatch.model.Network;
import edu.hu.clickwatch.model.Node;
import edu.hu.clickwatch.nodeadapter.ClickControlNodeAdapter;
import edu.hu.clickwatch.nodeadapter.ClickControlNodeXmlValuesAdapter;
import edu.hu.clickwatch.nodeadapter.INodeAdapter;

public class PerformanceTestNA extends TestCase {
	
	private Runtime runtime = null;
	private NumberFormat memFormat = new DecimalFormat("#00,000,000,000,000");
	private NumberFormat updatesFormat = new DecimalFormat("#00,000,000");
	private NumberFormat milliesFormat = new DecimalFormat("#00:000");
	
	@Override
	public void setUp() {
		runtime = Runtime.getRuntime();
	}

	private void performTest(final Class<? extends INodeAdapter> adapterClass, int numberOfElements, int numberOfHandler, int numberOfUpdates, int reportOnEach) {	
		final IClickSocket clickSocket = TestUtil.createClickSocket(numberOfElements, numberOfHandler, true);
		Injector injector = Guice.createInjector(new ClickWatchModule(), new AbstractModule() {
			@Override
			public void configure() {
				bind(IClickSocket.class).toInstance(clickSocket);
				bind(INodeAdapter.class).to(adapterClass);
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
			report("perfrom a test ", i, reportOnEach);
		}
	}
	
	public void testSingleUpdate() {
		performTest(ClickControlNodeXmlValuesAdapter.class, 3, 3, 1, 1);
	}
	
	public void testSmallUpdates() {
		performTest(ClickControlNodeXmlValuesAdapter.class, 3, 3, 100 * 1000, 100);
	}
	
	public void testLargeUpdates() {
		performTest(ClickControlNodeXmlValuesAdapter.class, 30, 10, 100 * 1000, 10);
	}
	
	public void testLargeUpdatesOnSimpleAdapter() {
		performTest(ClickControlNodeAdapter.class, 30, 10, 100 * 1000, 10);
	}
	
	private void performcePerformenceMeasure(Runnable runnable, long items) {
		long start = System.currentTimeMillis();
		runnable.run();
		long millies = System.currentTimeMillis() - start;
		System.out.println("\ntotal time: " + milliesFormat.format(millies) + 
				", " + (long)(((double)items / millies) * 1000) + " updates per second\n\n");
	}
	
	public void testPerformance() {
		performcePerformenceMeasure(new Runnable() {			
			@Override
			public void run() {
				performTest(ClickControlNodeAdapter.class, 10, 5, 1000, 100);
			}
		}, 10 * 5 * 1000);
		
		performcePerformenceMeasure(new Runnable() {			
			@Override
			public void run() {
				performTest(ClickControlNodeXmlValuesAdapter.class, 10, 5, 1000, 100);
			}
		}, 10 * 5 * 1000);
	}
	
	public void testDeserializeForMemoryLeak() {	
		XmlModelRepository xmlModelRepository = new XmlModelRepository();
		long runs = 200000;
		long reportOnEach = 1000;
		
		for (int i = 0; i < runs; i++) {
			EcoreUtil.delete(xmlModelRepository.deserializeXml("<foo><bar>TEXT</bar></foo>"), true);
			report("deserialize memory leak? ", i, reportOnEach);
		}
	}
	
	public void testRetrieveForMemoryLeak() {
		long runs = 500;
		long reportOnEach = 10;
		
		final IClickSocket clickSocket = TestUtil.createClickSocket(30, 10, false);
		Injector injector = Guice.createInjector(new ClickWatchModule(), new AbstractModule() {
			protected void configure() {
				bind(IClickSocket.class).toInstance(clickSocket);
			}			
		});
		INodeAdapter modelAdapter = injector.getInstance(ClickControlNodeXmlValuesAdapter.class);
		((ClickControlNodeXmlValuesAdapter)modelAdapter).setUp("localhost", "7777");
		modelAdapter.connect();
		
		for (int i = 0; i < runs; i++) {
			EcoreUtil.delete(modelAdapter.retrieve(null, null), true);
			report("retrieve memory leaks?", i, reportOnEach);
		}

	}
	
	private void report(String msg, long run, long reportOnEach) {
		if (run % reportOnEach == 0) {
			runtime.gc();
			System.out.println(msg + " updates run: " + updatesFormat.format(run) + "; memory-usage: " + 
					memFormat.format(runtime.totalMemory() - runtime.freeMemory()) +
					"; heap-size: " + memFormat.format(runtime.totalMemory()));
		}
	}
}
