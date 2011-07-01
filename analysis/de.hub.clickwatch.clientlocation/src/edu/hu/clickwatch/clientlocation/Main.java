package edu.hu.clickwatch.clientlocation;

import java.util.HashMap;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.Injector;

import edu.hu.clickwatch.ClickWatchModule;
import edu.hu.clickwatch.ClickWatchStandaloneSetup;
import edu.hu.clickwatch.analysis.specificmodels.SpecificMetaModelGenerator;
import edu.hu.clickwatch.analysis.specificmodels.SpecificModelGenerator;
import edu.hu.clickwatch.clientlocation.clientstats.ClientStats;
import edu.hu.clickwatch.clientlocation.clientstats.ClientStatsPackage;
import edu.hu.clickwatch.examples.AbstractAnalysis;
import edu.hu.clickwatch.model.ClickWatchModelFactory;
import edu.hu.clickwatch.model.Network;
import edu.hu.clickwatch.model.Node;
import edu.hu.clickwatch.nodeadapter.AbstractNodeAdapter;
import edu.hu.clickwatch.nodeadapter.ClickControlXSDNodeAdapter;
import edu.hu.clickwatch.nodeadapter.INodeAdapter;
import edu.hu.clickwatch.util.ILogger;

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
		
		ClickWatchModule clickWatchModule = new ClickWatchModule();
		clickWatchModule.setLogger(new ILogger() {			
			@Override
			public void log(int status, String message, Throwable exception) {
				System.out.println(message + ": " + exception.getMessage());
			}
		});
		injector = Guice.createInjector(clickWatchModule, new AbstractModule() {
			
			@Override
			protected void configure() {
				bind(INodeAdapter.class).to(ClickControlXSDNodeAdapter.class);
			}
		});
		
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
			INodeAdapter nodeAdapter = injector.getInstance(INodeAdapter.class);
			((AbstractNodeAdapter)nodeAdapter).setUp(nodeAddress, "7777"); // TODO
			nodeAdapter.connect();
			Node node = nodeAdapter.retrieve(network.getElementFilter(), network.getHandlerFilter());
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
