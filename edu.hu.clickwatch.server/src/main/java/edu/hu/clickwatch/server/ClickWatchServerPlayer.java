package edu.hu.clickwatch.server;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;

import com.google.common.base.Preconditions;
import com.google.inject.AbstractModule;

import edu.hu.clickwatch.model.Network;
import edu.hu.clickwatch.model.Node;
import edu.hu.clickwatch.server.configuration.ClickWatchServerSetup;

public class ClickWatchServerPlayer {
	public final static long UPDATE_INTERVAL = 1000;

	private Resource resource = null;

	private long start = -1;
	
	public ClickWatchServerPlayer() {
		ClickWatchServerSetup.initialize();
	}
	
	public static class PlayerModule extends AbstractModule {
		@Override
		protected void configure() {
			String record = 
						"src/main/resources/" + ClickWatchServerPlayer.class.getPackage().getName().replace(".", "/") + "/socket/record.clickwatchmodel";
		
			ClickWatchServerPlayer player = new ClickWatchServerPlayer();
			player.initialize(URI.createFileURI(record));
			bind(ClickWatchServerPlayer.class).toInstance(player);
		}		
	};


	public void initialize(URI recordUri) {
		ResourceSet rs = new ResourceSetImpl();
		rs.getLoadOptions().put(XMLResource.OPTION_EXTENDED_META_DATA, Boolean.TRUE);
		resource = rs.getResource(recordUri, true);

		Preconditions.checkState(resource.getContents().get(0) instanceof Network);
	}

	public Node getNode(String host, String port, long update) {
		Preconditions.checkState(resource != null);
		Network currentNetwork = (Network)resource.getContents().get((int)(update % resource.getContents().size()));
		
		Preconditions.checkState(currentNetwork != null);
		
		for (Node node : currentNetwork.getNodes()) {
			if (node.getINetAdress().equals(host) && node.getPort().equals(port)) {
				return node;
			}
		}
		return null;
	}

	public long getCurrentUpdate() {
		if (start == -1) {
			start = System.currentTimeMillis();
		}
		return (System.currentTimeMillis() - start) / UPDATE_INTERVAL;
	}
	
	
}
