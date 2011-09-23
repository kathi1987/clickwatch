package de.hub.clickwatch.ui;

import com.google.inject.name.Names;

import de.hub.clickwatch.ClickWatchModule;
import de.hub.clickwatch.connection.INodeConnection;
import de.hub.clickwatch.connection.adapter.PullHandlerAdapter;
import de.hub.clickwatch.connection.adapter.IPullHandlerAdapter;
import de.hub.clickwatch.connection.adapter.IValueAdapter;
import de.hub.clickwatch.connection.adapter.XmlValueAdapter;
import de.hub.clickwatch.merge.IMergeConfiguration;
import de.hub.clickwatch.ui.connection.ClickWatchUIContext;
import de.hub.clickwatch.ui.connection.MergingNodeAdapterMergeConfiguration;
import de.hub.clickwatch.ui.connection.UiNodeConnection;
import de.hub.clickwatch.ui.util.IUIContext;
import de.hub.clickwatch.util.ILogger;

public class ClickWatchUIModule extends ClickWatchModule {

	public static final String DEFAULT_UPDATE_INTERVAL = "defaultUpdateInterval";
	
	@Override
	protected ILogger getLogger() {
		return new ILogger() {				
			@Override
			public synchronized void log(int status, String message, Throwable exception) {
				if (getLogLevel() >= status) {				
					if (status == ILogger.DEBUG) {
						System.out.print("[DEBUG] ");
					} else if (status == ILogger.INFO) {
						System.out.print("[INFO] ");
					} else if (status == ILogger.WARNING) {
						System.out.print("[WARNING] ");
					} else if (status == ILogger.ERROR) {
						System.out.print("[ERROR] ");
					}
					System.out.print(message);
					if (exception != null) {
						System.out.println(": " + exception.getMessage());
						exception.printStackTrace();
					}
					System.out.println("");
				}
			}
		};
	}

	@Override
	protected void configure() {
		super.configure();	
		bindUiContext();
		bindMergeConfiguration();
		bindUpdateInterval();
	}
	
	protected int getLogLevel() {
		return 4;
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
		bind(IPullHandlerAdapter.class).to(PullHandlerAdapter.class);
	}

}
