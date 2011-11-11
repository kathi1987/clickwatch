package de.hub.clickwatch.specificmodels.tests;

import java.io.IOException;

import org.junit.Assert;
import org.junit.Test;

import com.google.inject.AbstractModule;

import de.hub.clickcontrol.IClickSocket;
import de.hub.clickwatch.connection.INodeConnection;
import de.hub.clickwatch.connection.INodeConnectionProvider;
import de.hub.clickwatch.connection.adapter.IHandlerAdapter;
import de.hub.clickwatch.connection.adapter.values.IValueAdapter;
import de.hub.clickwatch.model.Handler;
import de.hub.clickwatch.recorder.ClickSocketPlayer;
import de.hub.clickwatch.recorder.ClickSocketPlayerSocketImpl;
import de.hub.clickwatch.specificmodels.brn.BrnValueAdapter;
import de.hub.clickwatch.specificmodels.brn.device_wifi_link_stat_bcast_stats.Bcast_stats;
import de.hub.clickwatch.test.AbstractTest;

public class SpecificModelsValueAdapterTest extends AbstractTest {
	
	@Override
	protected AbstractModule[] getAdditionalModules() {
		String record = "resources/TestRecord.clickwatchmodel";
		
		return new AbstractModule[] { new ClickSocketPlayer.PlayerModule(record, false) };
	}
	
	@Override
	protected Class<? extends IValueAdapter> getValueAdapterClass() {
		return BrnValueAdapter.class;
	}

	@Override
	protected Class<? extends IClickSocket> getClickSocketClass() {
		return ClickSocketPlayerSocketImpl.class;
	}

	@Test
	public void test() throws IOException {
		INodeConnectionProvider ncp = injector.getInstance(INodeConnectionProvider.class);
		INodeConnection connection = ncp.createConnection("192.168.3.152", "7777");

		Handler handler = connection.getAdapter(IHandlerAdapter.class)
				.getHandler("device_wifi/link_stat/bcast_stats");
		
		Assert.assertNotNull(handler);
		Assert.assertTrue(handler instanceof Bcast_stats);
		Assert.assertNotNull(((Bcast_stats)handler).getEntry());
	}

}
