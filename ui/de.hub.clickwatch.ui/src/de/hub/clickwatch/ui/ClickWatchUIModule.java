package de.hub.clickwatch.ui;

import com.google.inject.name.Names;

import de.hub.clickwatch.ClickWatchModule;
import de.hub.clickwatch.connection.INodeConnection;
import de.hub.clickwatch.connection.adapter.CompoundHandlerAdapter;
import de.hub.clickwatch.connection.adapter.IHandlerAdapter;
import de.hub.clickwatch.connection.adapter.IValueAdapter;
import de.hub.clickwatch.connection.adapter.XmlValueAdapter;
import de.hub.clickwatch.merge.IMergeConfiguration;
import de.hub.clickwatch.ui.connection.ClickWatchUIContext;
import de.hub.clickwatch.ui.connection.MergingNodeAdapterMergeConfiguration;
import de.hub.clickwatch.ui.connection.UiNodeConnection;
import de.hub.clickwatch.ui.util.IUIContext;

public class ClickWatchUIModule extends ClickWatchModule {

	public static final String DEFAULT_UPDATE_INTERVAL = "defaultUpdateInterval";

	@Override
	protected void configure() {
		super.configure();	
		bindUiContext();
		bindMergeConfiguration();
		bindUpdateInterval();
	}
	
	protected void bindUpdateInterval() {
		bind(int.class).annotatedWith(Names.named(DEFAULT_UPDATE_INTERVAL)).toInstance(5000);
	}

	protected void bindMergeConfiguration() {
		bind(IMergeConfiguration.class).to(MergingNodeAdapterMergeConfiguration.class);
	}

	protected void bindUiContext() {
		bind(IUIContext.class).to(ClickWatchUIContext.class);
	}

	@Override
	protected void bindValueAdapter() {
		bind(IValueAdapter.class).to(XmlValueAdapter.class);
	}

	@Override
	protected void bindNodeConnection() {
		bind(INodeConnection.class).to(UiNodeConnection.class);
	}

	@Override
	protected void bindHandlerAdapter() {
		bind(IHandlerAdapter.class).to(CompoundHandlerAdapter.class);
	}

}
