package de.hub.clickwatch.test.internal;

import org.junit.Ignore;
import org.junit.Test;

import com.google.inject.Guice;
import com.google.inject.Injector;

import de.hub.clickwatch.ClickWatchModuleUtil;
import de.hub.clickwatch.connection.INodeConnection;
import de.hub.clickwatch.connection.INodeConnectionProvider;
import de.hub.clickwatch.connection.adapter.INodeAdapter;
import de.hub.clickwatch.connection.adapter.values.StringValueAdapter;
import de.hub.clickwatch.test.ClickwatchTest;
import de.hub.clickwatch.test.TestUtil;

public class HandlerAdapterWithRecordTest extends ClickwatchTest {

	@Ignore("memoryleak test, only perform when indicated")
	@Test
	public void testWithRecordForMemoryLeak() {
		Injector injector = Guice.createInjector(ClickWatchModuleUtil.newBuilder()
				.wRecord(getTestRecordURI())
				.wDebugLvl(4)
				.wValueAdapterClass(StringValueAdapter.class).build());
		
		INodeConnectionProvider ncp = injector.getInstance(INodeConnectionProvider.class);
		INodeConnection connection = ncp.createConnection("192.168.3.152", "7777");
		INodeAdapter nodeAdapter = connection.getAdapter(INodeAdapter.class);
		
		for (int i = 0; i < 200000; i++) {
			nodeAdapter.pullNode();
			TestUtil.report("MEM-LEAK?", i, 100);			
		}
	}
}