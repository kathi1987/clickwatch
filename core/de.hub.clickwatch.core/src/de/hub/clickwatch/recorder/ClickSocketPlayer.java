package de.hub.clickwatch.recorder;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;

import com.google.common.base.Preconditions;
import com.google.inject.AbstractModule;
import com.google.inject.Provides;

import de.hub.clickwatch.model.Network;
import de.hub.clickwatch.model.Node;

public class ClickSocketPlayer implements IClickSocketPlayer {
	
	private static final long updateInterval = 1000;
	private final boolean emulateTime;
	private int time = 0;
	
	public ClickSocketPlayer(boolean emulateTime) {
		this.emulateTime = emulateTime;
	}
	
	public ClickSocketPlayer() {
		this(false);
	}
	
	public static class PlayerModule extends AbstractModule {
		
		private String record;
		private boolean emulateTime;
		private ClickSocketPlayer player = null;
		
		public PlayerModule(String record, boolean emulateTime) {
			this.record = record;
			this.emulateTime = emulateTime;
		}
		
		@Override
		protected void configure() {	
			
		}		
		
		@Provides
		synchronized ClickSocketPlayer provideClickSocketPlayer() {
			if (player == null) {
				player = new ClickSocketPlayer(emulateTime);
				player.initialize(URI.createFileURI(record));
			} 
			return player;
		}
	};

	private Resource resource = null;

	public synchronized void initialize(URI recordUri) {
		ResourceSet rs = new ResourceSetImpl();
		rs.getLoadOptions().put(XMLResource.OPTION_EXTENDED_META_DATA, Boolean.TRUE);
		resource = rs.getResource(recordUri, true);

		Preconditions.checkState(resource.getContents().get(0) instanceof Network);
	}

	public synchronized Node getNode(String host, String port) {
		Preconditions.checkState(resource != null);
		int index = 0;
		if (emulateTime) {
			index = (int)(System.currentTimeMillis() / updateInterval) % resource.getContents().size();
		} else {
			index = time++ % resource.getContents().size();
		}
		
		Network currentNetwork = (Network)resource.getContents().get(index);
		
		Preconditions.checkState(currentNetwork != null);
		
		for (Node node : currentNetwork.getNodes()) {
			if (node.getINetAddress().equals(host) && node.getPort().equals(port)) {
				return node;
			}
		}
		return null;
	}

}
