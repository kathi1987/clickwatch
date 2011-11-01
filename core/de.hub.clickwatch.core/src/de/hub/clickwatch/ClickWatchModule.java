package de.hub.clickwatch;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.google.inject.name.Names;

import de.hub.clickcontrol.ClickSocketImpl;
import de.hub.clickcontrol.IClickSocket;
import de.hub.clickwatch.connection.INodeConnectionProvider;
import de.hub.clickwatch.connection.adapter.IHandlerEventAdapter;
import de.hub.clickwatch.connection.adapter.IMetaDataAdapter;
import de.hub.clickwatch.connection.adapter.internal.CompoundHandlerEventAdapter;
import de.hub.clickwatch.connection.adapter.internal.MetaDataAdapter;
import de.hub.clickwatch.connection.adapter.values.IValueAdapter;
import de.hub.clickwatch.connection.adapter.values.StringValueAdapter;
import de.hub.clickwatch.connection.internal.NodeConnectionProvider;
import de.hub.clickwatch.merge.IMergeConfiguration;
import de.hub.clickwatch.merge.ClickWatchNodeMergeConfiguration;
import de.hub.clickwatch.util.ILogger;

public class ClickWatchModule extends AbstractModule {
	
	public static final String I_DEFAULT_TIMEOUT = "timeout";
	public static final String I_REMOTE_UPDATE_PERIOD = "removeUpdateDelay";
	public static final String B_COMPOUND_HANDLER_RECORDS = "compoundHandlerRecords";
	public static final String I_COMPOUND_HANDLER_LOCAL_UPDATE_DELAY = "compoundHandlerLocalUpdateDelay";
	public static final String B_COMPOUND_HANDLER_CHANGES_ONLY = "compoundHandlerChangesOnly";
	public static final String B_COMPOUND_HANDLER_COMPRESSION = "compoundHandlerCompression";
	public static final String CS_IGNORED_HANDLER_NAMES ="ingnoredHandlerNames";
	
	private ILogger logger = null;
	
	@Provides
	protected final ILogger getLogger() {
	    if (logger == null) {
	        logger = createLogger();
	    }
		return logger;
	}
	
	protected ILogger createLogger() {
	    return null;
	}

	@Override
	protected void configure() {
	    bindMergeConfiguration();
	    
		bind(INodeConnectionProvider.class).to(NodeConnectionProvider.class);
		bind(int.class).annotatedWith(Names.named(I_DEFAULT_TIMEOUT)).toInstance(10000);
		
		bindExecutorServices();

		bindValueAdapter();
		
		bind(IMetaDataAdapter.class).to(MetaDataAdapter.class);
		bindHandlerEventAdapter();
		
		bindClickSocket();
	}
	
	protected void bindMergeConfiguration() {
	    bind(IMergeConfiguration.class).to(ClickWatchNodeMergeConfiguration.class);
	}
	
	protected void bindExecutorServices() {
		bind(ScheduledExecutorService.class).toInstance(Executors.newScheduledThreadPool(8));
		bind(ExecutorService.class).toInstance(Executors.newFixedThreadPool(8));
	}
	
	protected void bindValueAdapter() {
		bind(IValueAdapter.class).to(StringValueAdapter.class);
	}
	
	protected void bindClickSocket() {
		bind(IClickSocket.class).to(ClickSocketImpl.class);
	}
	
	protected void bindHandlerEventAdapter() {
		bind(Collection.class).annotatedWith(Names.named(CS_IGNORED_HANDLER_NAMES)).toInstance(
				new HashSet<String>(Arrays.asList(new String[] { 
						"debug", "handlers", "ports", "name", "links" // config, class 
				})));
		bind(IHandlerEventAdapter.class).to(CompoundHandlerEventAdapter.class);
		bind(int.class).annotatedWith(Names.named(I_REMOTE_UPDATE_PERIOD)).toInstance(3000);
		bind(Boolean.class).annotatedWith(Names.named(ClickWatchModule.B_COMPOUND_HANDLER_RECORDS)).toInstance(false);
		bind(Boolean.class).annotatedWith(Names.named(ClickWatchModule.B_COMPOUND_HANDLER_CHANGES_ONLY)).toInstance(false);
		bind(Integer.class).annotatedWith(Names.named(ClickWatchModule.I_COMPOUND_HANDLER_LOCAL_UPDATE_DELAY)).toInstance(1000);
		bind(Boolean.class).annotatedWith(Names.named(ClickWatchModule.B_COMPOUND_HANDLER_COMPRESSION)).toInstance(false);
	}

}
