package de.hub.clickwatch.server;

import com.google.inject.AbstractModule;

/**
 * 
 * @author Michael Frey
 */
public class ClickWatchServerModule extends AbstractModule {
	
	@Override
	protected void configure() {
		// Add node adapter implementation to the object treee
	//	bind(INodeAdapter.class).to(ClickControlNodeAdapter.class);
		//
		overrideConfigure();
	}
	
	protected void overrideConfigure(){}
}
