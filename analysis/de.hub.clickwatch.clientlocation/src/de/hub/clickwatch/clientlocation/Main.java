package de.hub.clickwatch.clientlocation;

import java.util.HashMap;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import com.google.inject.Guice;
import com.google.inject.Injector;

import de.hub.clickwatch.ClickWatchModule;
import de.hub.clickwatch.ClickWatchStandaloneSetup;
import de.hub.clickwatch.analysis.specificmodels.SpecificMetaModelGenerator;
import de.hub.clickwatch.analysis.specificmodels.SpecificModelGenerator;
import de.hub.clickwatch.clientlocation.clientstats.ClientStats;
import de.hub.clickwatch.clientlocation.clientstats.ClientStatsPackage;
import de.hub.clickwatch.connection.INodeConnection;
import de.hub.clickwatch.connection.INodeConnectionProvider;
import de.hub.clickwatch.connection.adapter.IValueAdapter;
import de.hub.clickwatch.connection.adapter.XmlValueAdapter;
import de.hub.clickwatch.examples.AbstractAnalysis;
import de.hub.clickwatch.model.ClickWatchModelFactory;
import de.hub.clickwatch.model.Network;
import de.hub.clickwatch.model.Node;
import de.hub.clickwatch.util.ILogger;

public class Main extends AbstractAnalysis {
	
	private Injector injector = null;
	private Resource cwResource = null;
	private ResourceSet rs = null;
	
	public void run() throws Exception {
		// initialize
		ClickWatchStandaloneSetup.doSetup();
		if (!EPackage.Registry.INSTANCE.containsKey(ClientStatsPackage.eINSTANCE.getNsURI())) {
			EPackage.Registry.INSTANCE.put(ClientStatsPackage.eINSTANCE.getNsURI(), ClientStatsPackage.eINSTANCE);
		}
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("clientstats", new XMIResourceFactoryImpl());
		
		ClickWatchModule clickWatchModule = new ClickWatchModule() {
			@Override
			protected void bindValueAdapter() {
				bind(IValueAdapter.class).to(XmlValueAdapter.class);
			}
		};
		clickWatchModule.setLogger(new ILogger() {			
			@Override
			public void log(int status, String message, Throwable exception) {
				System.out.println(message + ": " + exception.getMessage());
			}
		});
		injector = Guice.createInjector(clickWatchModule);
		
		rs = new ResourceSetImpl();
		cwResource = rs.createResource(URI.createURI("fake.clickwatchmodel"));
		
		// create network
		Network network = ClickWatchModelFactory.eINSTANCE.createNetwork();
		cwResource.getContents().add(network);
		network.setElementFilter("^(device_wifi|gps)");
		network.setHandlerFilter("^(stats|gps_coord)");
		
		String[] nodeAddresses = new String[] { "192.168.3.44" }; // TODO
		
		// retrieve node data
		for (final String nodeAddress: nodeAddresses) { // TODO
			INodeConnectionProvider ncp = injector.getInstance(INodeConnectionProvider.class);
			INodeConnection nodeConnection = ncp.createConnection(nodeAddress, "7777");
			nodeConnection.connect();
			Node node = nodeConnection.getAdapter(de.hub.clickwatch.connection.adapter.INodeAdapter.class).pullNode(network.getElementFilter(), network.getHandlerFilter());
			nodeConnection.disconnect();
			addNode(network, node);
		}
		
		// create specific models
		// network.getNode().getEle .. getHandler().getDecv
		SpecificMetaModelGenerator metaModelGenerator = new SpecificMetaModelGenerator();
		EPackage specificMetaModel = metaModelGenerator.generateMetaModel(network);
		Resource specificMetaModelResource = rs.createResource(URI.createFileURI("src/edu/hu/clickwatch/clientlocation/SpecificCSMetaModel.ecore")); // TODO
		specificMetaModel.setName("SpecificCSMetaModel");
		specificMetaModelResource.getContents().add(specificMetaModel);
		specificMetaModelResource.save(new HashMap<Object, Object>());
		
		SpecificModelGenerator modelGenerator = new SpecificModelGenerator();
		EObject specificModel = modelGenerator.generateModel(specificMetaModel, network);
		
		// run transformation
		//initialize();	
		specificMetaModel.setNsURI("SpecificCSMetaModel");
		registerPackage(ClientStatsPackage.eINSTANCE);		
		registerPackage(specificMetaModel);
		metaModel = specificMetaModel;
		model = specificModel;
		ClientStats clientStats = (ClientStats)evalXtend(getQualifiedName("createClientStats"));
		
		doIbachMagic(clientStats);
			
		// save results
		Resource clientStatsResource = rs.createResource(URI.createFileURI("src/edu/hu/clickwatch/clientlocation/results.clientstats")); // TODO
		clientStatsResource.getContents().add(clientStats);
		clientStatsResource.save(new HashMap<Object, Object>());
	}
	
	
	private void doIbachMagic(ClientStats clientStats) {
		// TODO Auto-generated method stub
		
	}


	synchronized private Node addNode(Network network, Node node) {
		network.getNodes().add(node);
		return node;
	}

	public static void main(String[] args) throws Exception {
		new Main().run();
	}
	
}
