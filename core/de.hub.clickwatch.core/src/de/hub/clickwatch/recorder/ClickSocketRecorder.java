package de.hub.clickwatch.recorder;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.XMLResource;

import com.google.inject.Guice;
import com.google.inject.Injector;

import de.hub.clickwatch.ClickWatchModule;
import de.hub.clickwatch.ClickWatchStandaloneSetup;
import de.hub.clickwatch.connection.INodeConnection;
import de.hub.clickwatch.connection.INodeConnectionProvider;
import de.hub.clickwatch.connection.adapter.INodeAdapter;
import de.hub.clickwatch.connection.adapter.values.IValueAdapter;
import de.hub.clickwatch.connection.adapter.values.StringValueAdapter;
import de.hub.clickwatch.model.ClickWatchModelFactory;
import de.hub.clickwatch.model.Network;
import de.hub.clickwatch.model.Node;
import de.hub.clickwatch.util.ILogger;
import de.hub.clickwatch.util.Throwables;

public class ClickSocketRecorder {

	private Injector injector;
	
	private static long UPDATE_INTERVALL = 0;
	private static int NUMBER_OF_RECORDS = 30;

	public ClickSocketRecorder() {
		ClickWatchStandaloneSetup.doSetup();
		ClickWatchModule clickWatchModule = new ClickWatchModule() {

			@Override
			protected void bindValueAdapter() {
				bind(IValueAdapter.class).to(StringValueAdapter.class);
			}
		};
		clickWatchModule.setLogger(new ILogger() {			
			@Override
			public void log(int status, String message, Throwable exception) {
				System.out.println(message + ":\n");
				exception.printStackTrace();
			}
		});
		injector = Guice.createInjector(clickWatchModule);
	}

	public void record(String[] args) {
		String recordFile = args[0];
		ResourceSet rs = new ResourceSetImpl();
		Resource resource = rs.createResource(URI.createFileURI(recordFile));
		
		Map<Object, Object> options = new HashMap<Object, Object>();
		options.put(XMLResource.OPTION_EXTENDED_META_DATA, Boolean.TRUE);
		
		for (int record = 0; record < NUMBER_OF_RECORDS; record++) {
			System.out.println("start to retrieve data in round " + record);
			Network result = ClickWatchModelFactory.eINSTANCE.createNetwork();
			RetrieveLoop: for (int i = 1; i < args.length; i++) {
				String host = args[i];
				String port = "7777";
	
				Node node = null;
				try {
					node = retrieve(host, port);
					node.setPort(port);
					node.setINetAddress(host);
				} catch (Throwable e) {
					e.printStackTrace();
					System.err.println("Exception while retrieving " + host + "["
							+ port + "]\n");
					continue RetrieveLoop;
				}
				result.getNodes().add(node);
				System.out.println("successfully retrieved one set of data from " + host);
			}
			resource.getContents().add(result);
			
			try {
				Thread.sleep(UPDATE_INTERVALL);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		try {
			resource.save(options);
		} catch (IOException e) {
			e.printStackTrace();
			Throwables.propagate(e);
		}
	}

	public Node retrieve(String host, String port) {
		INodeConnectionProvider ncp = injector.getInstance(INodeConnectionProvider.class);
		INodeConnection connection = ncp.createConnection(host, port);
		INodeAdapter nodeAdapter =connection.getAdapter(INodeAdapter.class);
		Node result = nodeAdapter.pullNode();
		connection.close();
		return EcoreUtil.copy(result);
	}

	/**
	 * @param args
	 *            first String is name of the record file, after that each other
	 *            strings are host, port, host, port ...
	 */
	public static void main(String[] args) {
		ClickSocketRecorder instance = new ClickSocketRecorder();
		instance.record(args);
	}
}
