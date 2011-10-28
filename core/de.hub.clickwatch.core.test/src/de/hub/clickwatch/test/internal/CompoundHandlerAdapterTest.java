package de.hub.clickwatch.test.internal;

import org.junit.Ignore;
import org.junit.Test;

import com.google.inject.Guice;
import com.google.inject.Injector;

import de.hub.clickwatch.ClickWatchModuleUtil;
import de.hub.clickwatch.ClickWatchModuleUtil.HandlerBehaviour;
import de.hub.clickwatch.connection.INodeConnection;
import de.hub.clickwatch.connection.INodeConnectionProvider;
import de.hub.clickwatch.connection.adapter.IHandlerEventAdapter;
import de.hub.clickwatch.connection.adapter.IMetaDataAdapter;
import de.hub.clickwatch.connection.adapter.values.StringValueAdapter;
import de.hub.clickwatch.test.AbstractClickwatchTest;

public class CompoundHandlerAdapterTest extends AbstractClickwatchTest {

	@Ignore("requires a click setup on localhost")
	@Test
	public void test() throws Exception {
		Injector injector = Guice.createInjector(ClickWatchModuleUtil.newBuilder()
				.wHandlerBhvr(HandlerBehaviour.COMPOUND_RECORDING_DIFFERENCES, 2000, 500)
				.wDebugLvl(4)
				.wValueAdapterClass(StringValueAdapter.class).build());
		
		INodeConnectionProvider ncp = injector.getInstance(INodeConnectionProvider.class);
		INodeConnection nodeConnection = ncp.createConnection("localhost", "7777");
		IHandlerEventAdapter handlerEventAdapter = nodeConnection.getAdapter(IHandlerEventAdapter.class);
//		nodeConnection.connect();

//		handlerEventAdapter.configure(metaData)
		// TODO ....
		IMetaDataAdapter metaDataAdapter = nodeConnection.getAdapter(IMetaDataAdapter.class);
//		handlerEventAdapter.configure(metaDataAdapter.pullAllMetaData().getAllHandlers());
		
		for (int i = 0; i < 10; i++) {
			Thread.sleep(300);		
//			Collection<Handler> handlers = handlerAdapter.pullHandler();
//			Assert.assertTrue(handlers.size() >= 6);
//			boolean hasValue = false;
//			for (Handler handler: handlers) {
//				if (handler.getValue() != null && !handler.getValue().trim().equals("")) {
//					hasValue = true;
//				}
//			}
//			Assert.assertTrue(hasValue);
		}
	}
}
