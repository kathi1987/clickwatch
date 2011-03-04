package edu.hu.clickwatch.tests.clicksockets;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;

import com.google.common.base.Preconditions;
import com.google.inject.AbstractModule;

import edu.hu.clickwatch.model.Network;
import edu.hu.clickwatch.model.Node;

public class ClickSocketPlayer {
	
	public final static long UPDATE_INTERVAL = 1000;
	
	private long start = -1;
	
	public static class PlayerModule extends AbstractModule {
		@Override
		protected void configure() {
			String record = 
						"src/" + ClickSocketPlayer.class.getPackage().getName().replace(".", "/") + "/record.clickwatchmodel";
			
			ClickSocketPlayer player = new ClickSocketPlayer();
			player.initialize(URI.createFileURI(record));
			bind(ClickSocketPlayer.class).toInstance(player);
		}		
	};

	private Resource resource = null;

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
