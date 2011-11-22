package de.hub.clickwatch.specificmodels.tests;

import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.junit.Assert;
import org.junit.Test;

import com.google.inject.Guice;
import com.google.inject.Injector;

import de.hub.clickwatch.ClickWatchModuleUtil;
import de.hub.clickwatch.connection.INodeConnection;
import de.hub.clickwatch.connection.INodeConnectionProvider;
import de.hub.clickwatch.connection.adapter.IHandlerAdapter;
import de.hub.clickwatch.model.Handler;
import de.hub.clickwatch.specificmodels.brn.BrnValueAdapter;
import de.hub.clickwatch.specificmodels.brn.device_wifi_link_stat_bcast_stats.Bcast_stats;
import de.hub.clickwatch.test.ClickwatchTest;

public class SpecificModelsValueAdapterTest extends ClickwatchTest {

	@Test
	public void test() throws IOException {
        URI recordURI = URI.createFileURI("resources/TestRecord.clickwatchmodel");
        Injector injector = Guice.createInjector(ClickWatchModuleUtil.newBuilder()
                .wRecord(recordURI).wDebugLvl(4)
                .wValueAdapterClass(BrnValueAdapter.class).build());
        
		INodeConnectionProvider ncp = injector.getInstance(INodeConnectionProvider.class);
		INodeConnection connection = ncp.createConnection("192.168.3.152", "7777");

		Handler handler = connection.getAdapter(IHandlerAdapter.class)
				.getHandler("device_wifi/link_stat/bcast_stats");
		
		Assert.assertNotNull(handler);
		Assert.assertTrue(handler instanceof Bcast_stats);
		Assert.assertNotNull(((Bcast_stats)handler).getEntry());
	}

}
