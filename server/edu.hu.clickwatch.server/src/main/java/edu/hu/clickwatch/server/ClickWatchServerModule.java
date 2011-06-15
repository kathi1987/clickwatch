package edu.hu.clickwatch.server;

import com.google.inject.AbstractModule;

import edu.hu.clickwatch.server.node.ClickWatchServerNodeAdapter;
import edu.hu.clickwatch.server.node.INodeAdapter;

/**
 * 
 * @author Michael Frey
 */
public class ClickWatchServerModule extends AbstractModule {
	
	@Override
	protected void configure() {
		// Add node adapter implementation to the object treee
		bind(INodeAdapter.class).to(ClickWatchServerNodeAdapter.class);
		//
		overrideConfigure();
	}
	
	protected void overrideConfigure(){}
}
