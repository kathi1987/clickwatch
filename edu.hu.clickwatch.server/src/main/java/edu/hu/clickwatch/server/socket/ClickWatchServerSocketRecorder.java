package edu.hu.clickwatch.server.socket;

import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

import com.google.common.base.Throwables;
import com.google.inject.Guice;
import com.google.inject.Injector;

import edu.hu.clickwatch.model.ClickWatchModelFactory;
import edu.hu.clickwatch.model.Network;
import edu.hu.clickwatch.model.Node;
import edu.hu.clickwatch.server.ClickWatchServerModule;
import edu.hu.clickwatch.server.configuration.ClickWatchServerSetup;
import edu.hu.clickwatch.server.node.ClickWatchServerNodeAdapter;
import edu.hu.clickwatch.server.node.INodeAdapter;

public class ClickWatchServerSocketRecorder {

	private Injector injector;
	
	private static long UPDATE_INTERVALL = 1000;
	private static int NUMBER_OF_RECORDS = 10;

	public ClickWatchServerSocketRecorder() {
		ClickWatchServerSetup.initialize();
		injector = Guice.createInjector(new ClickWatchServerModule() {
			@Override
			protected void overrideConfigure() {
				bind(INodeAdapter.class).to(ClickWatchServerNodeAdapter.class);
			}
		});
	}

	public void record(String[] args) {
		String recordFile = args[0];
		ResourceSet rs = new ResourceSetImpl();
		Resource resource = rs.createResource(URI.createFileURI(recordFile));
		
		for (int record = 0; record < NUMBER_OF_RECORDS; record++) {
			Network result = ClickWatchModelFactory.eINSTANCE.createNetwork();
			RetrieveLoop: for (int i = 1; i < args.length; i = i + 2) {
				String host = args[i];
				String port = args[i + 1];
	
				Node node = null;
				try {
					node = retrieve(host, port);
					node.setPort(port);
					node.setINetAdress(host);
				} catch (Throwable e) {
					e.printStackTrace();
					System.err.println("Exception while retrieving " + host + "["
							+ port + "]\n");
					continue RetrieveLoop;
				}
				result.getNodes().add(node);
			}
			resource.getContents().add(result);
			
			try {
				Thread.sleep(UPDATE_INTERVALL);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		try {
			resource.save(null);
		} catch (IOException e) {
			e.printStackTrace();
			Throwables.propagate(e);
		}
	}

	public Node retrieve(String host, String port) {
		INodeAdapter nodeAdapter = injector.getInstance(INodeAdapter.class);
		((ClickWatchServerNodeAdapter) nodeAdapter).setUp(host, port);
		nodeAdapter.connect();
		Node result = nodeAdapter.retrieve("", "");
		nodeAdapter.disconnect();
		return EcoreUtil.copy(result);
	}
}
