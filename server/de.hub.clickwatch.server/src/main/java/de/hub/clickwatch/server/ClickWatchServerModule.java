package de.hub.clickwatch.server;

import com.google.inject.AbstractModule;

import de.hub.clickwatch.nodeadapter.ClickControlNodeAdapter;
import de.hub.clickwatch.nodeadapter.INodeAdapter;

/**
 * 
 * @author Michael Frey
 */
public class ClickWatchServerModule extends AbstractModule {
	
	@Override
	protected void configure() {
		// Add node adapter implementation to the object treee
		bind(INodeAdapter.class).to(ClickControlNodeAdapter.class);
		//
		overrideConfigure();
	}
	
	protected void overrideConfigure(){}
}
