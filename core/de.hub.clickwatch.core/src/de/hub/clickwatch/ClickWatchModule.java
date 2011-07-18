package de.hub.clickwatch;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.google.inject.name.Names;

import de.hub.clickcontrol.ClickSocketImpl;
import de.hub.clickcontrol.IClickSocket;
import de.hub.clickwatch.connection.INodeConnection;
import de.hub.clickwatch.connection.INodeConnectionProvider;
import de.hub.clickwatch.connection.NodeConnection;
import de.hub.clickwatch.connection.NodeConnectionProvider;
import de.hub.clickwatch.connection.adapter.HandlerAdapter;
import de.hub.clickwatch.connection.adapter.IHandlerAdapter;
import de.hub.clickwatch.connection.adapter.IMetaDataAdapter;
import de.hub.clickwatch.connection.adapter.INodeAdapter;
import de.hub.clickwatch.connection.adapter.IValueAdapter;
import de.hub.clickwatch.connection.adapter.MetaDataAdapter;
import de.hub.clickwatch.connection.adapter.NodeAdapter;
import de.hub.clickwatch.connection.adapter.StringValueAdapter;
import de.hub.clickwatch.util.ILogger;


public class ClickWatchModule extends AbstractModule {
	
	public static final String DEFAULT_TIMEOUT = "timeout";
	public static final String L_EXPERIMENT_DEFAULT_RECORDER_UPDATE_INTERVAL = "experiment_recorder_update_interval";
	public static final String I_HANDLER_PER_RECORD = "handler_per_record";
	public static final String B_RECORD_CHANGES_ONLY = "record_changes_only";
	
	private ILogger logger = null;
	
	@Provides
	protected ILogger getLogger() {
		return logger;
	}
	
	public void setLogger(ILogger logger) {
		this.logger = logger;
	}

	@Override
	protected void configure() {
		bind(long.class).annotatedWith(Names.named(L_EXPERIMENT_DEFAULT_RECORDER_UPDATE_INTERVAL)).toInstance(new Long(2000));
		bind(int.class).annotatedWith(Names.named(I_HANDLER_PER_RECORD)).toInstance(2000);
		bind(boolean.class).annotatedWith(Names.named(B_RECORD_CHANGES_ONLY)).toInstance(true);
		
		bind(INodeConnectionProvider.class).to(NodeConnectionProvider.class);
		bind(int.class).annotatedWith(Names.named(DEFAULT_TIMEOUT)).toInstance(5000);
		
		bindNodeConnection();
		bindValueAdapter();
		
		bind(IMetaDataAdapter.class).to(MetaDataAdapter.class);
		bindHandlerAdapter();
		bindNodeAdapter();
		
		bindClickSocket();
	}
	
	protected void bindNodeConnection() {		
		bind(INodeConnection.class).to(NodeConnection.class);		
	}
	
	protected void bindValueAdapter() {
		bind(IValueAdapter.class).to(StringValueAdapter.class);
	}
	
	protected void bindNodeAdapter() {		
		bind(INodeAdapter.class).to(NodeAdapter.class);
	}
	
	protected void bindClickSocket() {
		bind(IClickSocket.class).to(ClickSocketImpl.class);
	}
	
	protected void bindHandlerAdapter() {
		bind(IHandlerAdapter.class).to(HandlerAdapter.class);
	}

}
