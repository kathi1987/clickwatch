package de.hub.clickwatch;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;

import de.hub.clickwatch.merge.IMergeConfiguration;
import de.hub.clickwatch.merge.MergeModule;
import de.hub.clickwatch.model.ClickWatchNodeMergeConfiguration;
import de.hub.clickwatch.nodeadapter.ClickControlNodeXmlValuesAdapter;
import de.hub.clickwatch.nodeadapter.INodeAdapter;
import de.hub.clickwatch.util.ILogger;


public class ClickWatchModule extends AbstractModule {
	
	private ILogger logger = null;
	
	@Provides ILogger getLogger() {
		return logger;
	}
	
	public void setLogger(ILogger logger) {
		this.logger = logger;
	}

	@Override
	protected final void configure() {
		install(new MergeModule());
		bind(IMergeConfiguration.class).to(ClickWatchNodeMergeConfiguration.class);
		bind(INodeAdapter.class).to(ClickControlNodeXmlValuesAdapter.class);
	}
}
