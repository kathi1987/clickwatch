package edu.hu.clickwatch;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;

import edu.hu.clickwatch.merge.IMergeConfiguration;
import edu.hu.clickwatch.merge.MergeModule;
import edu.hu.clickwatch.model.ClickWatchNodeMergeConfiguration;
import edu.hu.clickwatch.nodeadapter.ClickControlNodeXmlValuesAdapter;
import edu.hu.clickwatch.nodeadapter.INodeAdapter;
import edu.hu.clickwatch.util.ILogger;

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
