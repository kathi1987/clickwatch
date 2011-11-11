package de.hub.clickwatch.specificmodels.tests;

import static de.hub.specificmodels.tests.common.AbstractTests.assertClass;

import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.junit.Test;

import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.Injector;

import de.hub.clickcontrol.IClickSocket;
import de.hub.clickwatch.connection.INodeConnection;
import de.hub.clickwatch.connection.INodeConnectionProvider;
import de.hub.clickwatch.connection.adapter.INodeAdapter;
import de.hub.clickwatch.connection.adapter.values.IValueAdapter;
import de.hub.clickwatch.connection.adapter.values.XmlValueAdapter;
import de.hub.clickwatch.model.ClickWatchModelFactory;
import de.hub.clickwatch.model.Network;
import de.hub.clickwatch.model.Node;
import de.hub.clickwatch.recorder.ClickSocketPlayer;
import de.hub.clickwatch.recorder.ClickSocketPlayerSocketImpl;
import de.hub.clickwatch.specificmodels.ClickWatchSpecificModelsModule;
import de.hub.clickwatch.test.AbstractTest;
import de.hub.specificmodels.metamodelgenerator.MetaModelGenerator;

public class MetaModelFromRecordTest extends AbstractTest {
	
	private static final String[] ipAddresses = new String[] {"192.168.3.152", "10.5.70.54", "192.168.3.167", "192.168.3.184"};
	
	@Override
	protected AbstractModule[] getAdditionalModules() {
		String record = "resources/TestRecord.clickwatchmodel";
		
		return new AbstractModule[] { new ClickSocketPlayer.PlayerModule(record, false) };
	}
	
	private EPackage generate(EObject root) {
		Injector injector = Guice.createInjector(new ClickWatchSpecificModelsModule());
		return injector.getInstance(MetaModelGenerator.class).generate(root);
	}
	
	@Override
	protected Class<? extends IValueAdapter> getValueAdapterClass() {
		return XmlValueAdapter.class;
	}

	@Override
	protected Class<? extends IClickSocket> getClickSocketClass() {
		return ClickSocketPlayerSocketImpl.class;
	}

	@Test
	public void testWithSingleHandlerFromOneNode() throws IOException {
		INodeConnectionProvider ncp = injector.getInstance(INodeConnectionProvider.class);
		INodeConnection connection = ncp.createConnection(ipAddresses[0], "7777");

		Node node = connection.getAdapter(INodeAdapter.class).pullNode("device_wifi/link_stat", "bcast_stats");
		Network network = ClickWatchModelFactory.eINSTANCE.createNetwork();
		network.getNodes().add(node);
		
		EPackage result = generate(network);
		save(result);
		
		assertBcast_stat(result);
	}
	
	@Test
	public void testWithSingleHandlerFromMultipleNodes() throws IOException {
		INodeConnectionProvider ncp = injector.getInstance(INodeConnectionProvider.class);
		Network network = ClickWatchModelFactory.eINSTANCE.createNetwork();
		for (String ipAddress: ipAddresses) {
			INodeConnection connection = ncp.createConnection(ipAddress, "7777");

			Node node = connection.getAdapter(INodeAdapter.class).pullNode("device_wifi/link_stat", "bcast_stats");			
			network.getNodes().add(node);
		}
		
		EPackage result = generate(network);
		save(result);
		
		assertBcast_stat(result);
	}
	
	@Test
	public void testSingleElementFromMultipleNodes() throws IOException {
		INodeConnectionProvider ncp = injector.getInstance(INodeConnectionProvider.class);
		Network network = ClickWatchModelFactory.eINSTANCE.createNetwork();
		for (String ipAddress: ipAddresses) {
			INodeConnection connection = ncp.createConnection(ipAddress, "7777");

			Node node = connection.getAdapter(INodeAdapter.class).pullNode("device_wifi/link_stat", "");			
			network.getNodes().add(node);
		}
		
		EPackage result = generate(network);
		save(result);
		
		assertBcast_stat(result);
	}
	
	@Test
	public void testFromMultipleNodes() throws IOException {
		INodeConnectionProvider ncp = injector.getInstance(INodeConnectionProvider.class);
		Network network = ClickWatchModelFactory.eINSTANCE.createNetwork();
		for (String ipAddress: ipAddresses) {
			INodeConnection connection = ncp.createConnection(ipAddress, "7777");

			Node node = connection.getAdapter(INodeAdapter.class).pullNode("", "");			
			network.getNodes().add(node);
		}
		
		EPackage result = generate(network);
		save(result);
		
		assertBcast_stat(result);
	}
	
	private void assertBcast_stat(EPackage result) {
		assertClass(result, "Entry", null, "from", null, 1);
		assertClass(result, "Entry", null, "seq", null, 1);
		assertClass(result, "Entry", null, "link", null, -1);
		assertClass(result, "Link", null, "tau", null, 1);
		assertClass(result, "Link", null, "last_rx", null, 1);
		assertClass(result, "Link", null, "link_info", null, 1);
		assertClass(result, "Link_info", null, "size", null, 1);
		assertClass(result, "Link_info", null, "rate", null, 1);
	}
	
	private void save(EPackage result) throws IOException {
		ResourceSet rs = new ResourceSetImpl();
		Resource resource = rs.createResource(URI.createFileURI("test_out.ecore"));
		resource.getContents().add(result);
		resource.save(null);
	}
}
