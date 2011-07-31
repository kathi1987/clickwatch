package de.hub.clickwatch.tests;

import org.junit.Ignore;
import org.junit.Test;

import com.google.inject.AbstractModule;

import de.hub.clickcontrol.IClickSocket;
import de.hub.clickwatch.connection.INodeConnection;
import de.hub.clickwatch.connection.INodeConnectionProvider;
import de.hub.clickwatch.connection.adapter.IPullHandlerAdapter;
import de.hub.clickwatch.connection.adapter.IMetaDataAdapter;
import de.hub.clickwatch.connection.adapter.IValueAdapter;
import de.hub.clickwatch.connection.adapter.StringValueAdapter;
import de.hub.clickwatch.recorder.ClickSocketPlayer;
import de.hub.clickwatch.recorder.ClickSocketPlayerSocketImpl;

public class HandlerAdapterWithRecordTest extends AbstractTest {
	
	@Override
	protected AbstractModule[] getAdditionalModules() {
		String record = "resources/" + NodeAdapterWithRecordTest.class.getSimpleName() + ".clickwatchmodel";
		
		return new AbstractModule[] { new ClickSocketPlayer.PlayerModule(record, false) };
	}

	@Override
	protected Class<? extends IValueAdapter> getValueAdapterClass() {
		return StringValueAdapter.class;
	}

	@Override
	protected Class<? extends IClickSocket> getClickSocketClass() {
		return ClickSocketPlayerSocketImpl.class;
	}

	@Ignore("memoryleak test, only perform when indicated")
	@Test
	public void testWithRecordForMemoryLeak() {
		INodeConnectionProvider ncp = injector.getInstance(INodeConnectionProvider.class);
		INodeConnection connection = ncp.createConnection("192.168.3.152", "7777");
		connection.connect();
		IPullHandlerAdapter handlerAdapter = connection.getAdapter(IPullHandlerAdapter.class);
		handlerAdapter.configure(connection.getAdapter(IMetaDataAdapter.class).pullAllMetaData().getAllHandlers());
		
		for (int i = 0; i < 200000; i++) {
			handlerAdapter.pullHandler();
			TestUtil.report("MEM-LEAK?", i, 100);			
		}
	}
}