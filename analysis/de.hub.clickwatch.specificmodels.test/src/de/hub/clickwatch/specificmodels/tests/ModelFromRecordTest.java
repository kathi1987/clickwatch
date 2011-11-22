package de.hub.clickwatch.specificmodels.tests;

import java.io.IOException;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.google.inject.Guice;
import com.google.inject.Injector;

import de.hub.clickwatch.ClickWatchModuleUtil;
import de.hub.clickwatch.connection.INodeConnection;
import de.hub.clickwatch.connection.INodeConnectionProvider;
import de.hub.clickwatch.connection.adapter.INodeAdapter;
import de.hub.clickwatch.connection.adapter.values.XmlValueAdapter;
import de.hub.clickwatch.model.ClickWatchModelFactory;
import de.hub.clickwatch.model.Network;
import de.hub.clickwatch.model.Node;
import de.hub.clickwatch.specificmodels.ClickWatchSpecificModelsModule;
import de.hub.clickwatch.test.ClickwatchTest;
import de.hub.specificmodels.metamodelgenerator.MetaModelGenerator;
import de.hub.specificmodels.modelgenerator.ModelGenerator;

public class ModelFromRecordTest extends ClickwatchTest {
	
	private static final String[] ipAddresses = new String[] {"192.168.3.152", "10.5.70.54", "192.168.3.167", "192.168.3.184"};
	private Injector specificModelsInjector = null;
	
	@Before
	public void additionalSetUp() {
		specificModelsInjector = Guice.createInjector(new ClickWatchSpecificModelsModule());
	}

	private EPackage generateMetaModel(EObject root) {
		return specificModelsInjector.getInstance(MetaModelGenerator.class).generate(root);
	}
	
	private EObject generateModel(EPackage metaModel, EObject source) {
		ModelGenerator modelGenerator = specificModelsInjector.getInstance(ModelGenerator.class);
		return modelGenerator.generate(metaModel, source);
	}

	@Test
    public void testWithSingleHandlerFromOneNode() throws IOException {
        URI recordURI = URI.createFileURI("resources/TestRecord.clickwatchmodel");
        Injector injector = Guice.createInjector(ClickWatchModuleUtil.newBuilder()
                .wRecord(recordURI).wDebugLvl(4)
                .wValueAdapterClass(XmlValueAdapter.class).build());
	    
		INodeConnectionProvider ncp = injector.getInstance(INodeConnectionProvider.class);
		INodeConnection connection = ncp.createConnection(ipAddresses[0], "7777");

		Node node = connection.getAdapter(INodeAdapter.class).pullNode("device_wifi/link_stat", "bcast_stats");
		Network network = ClickWatchModelFactory.eINSTANCE.createNetwork();
		network.getNodes().add(node);
		
		EPackage metaModel = generateMetaModel(network);
		EObject model = generateModel(metaModel, network);
		
		Assert.assertNotNull(model);
		assertBcast_stat(model);
	}
	
	@Test
	public void testWithSingleHandlerFromMultipleNodes() throws IOException {
        URI recordURI = URI.createFileURI("resources/TestRecord.clickwatchmodel");
        Injector injector = Guice.createInjector(ClickWatchModuleUtil.newBuilder()
                .wRecord(recordURI).wDebugLvl(4)
                .wValueAdapterClass(XmlValueAdapter.class).build());
	    
		INodeConnectionProvider ncp = injector.getInstance(INodeConnectionProvider.class);
		Network network = ClickWatchModelFactory.eINSTANCE.createNetwork();
		for (String ipAddress: ipAddresses) {
			INodeConnection connection = ncp.createConnection(ipAddress, "7777");

			Node node = connection.getAdapter(INodeAdapter.class).pullNode("device_wifi/link_stat", "bcast_stats");			
			network.getNodes().add(node);
		}
		
		EPackage metaModel = generateMetaModel(network);
		EObject model = generateModel(metaModel, network);
		
		Assert.assertNotNull(model);
		assertBcast_stat(model);
	}
	
	@Test
	public void testSingleElementFromMultipleNodes() throws IOException {
        URI recordURI = URI.createFileURI("resources/TestRecord.clickwatchmodel");
        Injector injector = Guice.createInjector(ClickWatchModuleUtil.newBuilder()
                .wRecord(recordURI).wDebugLvl(4)
                .wValueAdapterClass(XmlValueAdapter.class).build());
	    
		INodeConnectionProvider ncp = injector.getInstance(INodeConnectionProvider.class);
		Network network = ClickWatchModelFactory.eINSTANCE.createNetwork();
		for (String ipAddress: ipAddresses) {
			INodeConnection connection = ncp.createConnection(ipAddress, "7777");

			Node node = connection.getAdapter(INodeAdapter.class).pullNode("device_wifi/link_stat", "");			
			network.getNodes().add(node);
		}
		
		EPackage metaModel = generateMetaModel(network);
		EObject model = generateModel(metaModel, network);
		
		Assert.assertNotNull(model);
		assertBcast_stat(model);
	}
	
	@Test
	public void testFromMultipleNodes() throws IOException {
        URI recordURI = URI.createFileURI("resources/TestRecord.clickwatchmodel");
        Injector injector = Guice.createInjector(ClickWatchModuleUtil.newBuilder()
                .wRecord(recordURI).wDebugLvl(4)
                .wValueAdapterClass(XmlValueAdapter.class).build());
	    
		INodeConnectionProvider ncp = injector.getInstance(INodeConnectionProvider.class);
		Network network = ClickWatchModelFactory.eINSTANCE.createNetwork();
		for (String ipAddress: ipAddresses) {
			INodeConnection connection = ncp.createConnection(ipAddress, "7777");

			Node node = connection.getAdapter(INodeAdapter.class).pullNode("", "");			
			network.getNodes().add(node);
		}
		
		EPackage metaModel = generateMetaModel(network);
		EObject model = generateModel(metaModel, network);
		
		Assert.assertNotNull(model);
		assertBcast_stat(model);
	}
	
	private Object get(EObject object, String featureName) {
		Object value = object.eGet(object.eClass().getEStructuralFeature(featureName));
		if (value == null) {
			return null;
		} else if (value instanceof List<?>) {
			return ((List<?>)value).get(0);
		} else {
			return value;
		}
	}
	
	private void assertBcast_stat(EObject result) {
		EObject node = (EObject)get(result, "nodes");
		Assert.assertNotNull(node);
		EObject device_wifi = (EObject)get(node, "device_wifi");
		Assert.assertNotNull(device_wifi);
		EObject link_stat = (EObject)get(device_wifi, "link_stat");
		Assert.assertNotNull(link_stat);
		EObject bcast_stats = (EObject)get(link_stat, "bcast_stats");
		Assert.assertNotNull(bcast_stats);
		EObject entry = (EObject)get(bcast_stats, "entry");
		Assert.assertNotNull(entry);
		EObject link = (EObject)get(entry, "link");
		Assert.assertNotNull(link);
		EObject link_info = (EObject)get(link, "link_info");
		Assert.assertNotNull(link_info);
		Assert.assertEquals(100, get(link_info, "size"));
	}

}
