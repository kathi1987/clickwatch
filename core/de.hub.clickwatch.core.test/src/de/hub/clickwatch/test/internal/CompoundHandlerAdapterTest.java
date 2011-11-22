package de.hub.clickwatch.test.internal;

import junit.framework.Assert;

import org.junit.Ignore;
import org.junit.Test;

import com.google.inject.Guice;
import com.google.inject.Injector;

import de.hub.clickwatch.ClickWatchModuleUtil;
import de.hub.clickwatch.ClickWatchModuleUtil.HandlerBehaviour;
import de.hub.clickwatch.connection.INodeConnectionProvider;
import de.hub.clickwatch.connection.adapter.IErrorAdapter;
import de.hub.clickwatch.connection.adapter.IErrorAdapter.IErrorListener;
import de.hub.clickwatch.connection.adapter.IHandlerEventAdapter;
import de.hub.clickwatch.connection.adapter.IMergeAdapter;
import de.hub.clickwatch.connection.adapter.IMetaDataAdapter;
import de.hub.clickwatch.connection.adapter.values.IValueAdapter;
import de.hub.clickwatch.connection.adapter.values.StringValueAdapter;
import de.hub.clickwatch.model.Node;
import de.hub.clickwatch.test.TestUtil;

@Ignore("requires a click setup on localhost")
public class CompoundHandlerAdapterTest extends HandlerEventAdapterTest {

	@Ignore("requires a click setup on localhost")
	@Test
	public void test() throws Exception {
		Injector injector = Guice.createInjector(ClickWatchModuleUtil.newBuilder()
				.wHandlerBhvr(HandlerBehaviour.COMPOUND_RECORDING_DIFFERENCES, 500, 2000)
				.wDebugLvl(4)
				.wValueAdapterClass(StringValueAdapter.class).build());

        INodeConnectionProvider ncp = injector.getInstance(INodeConnectionProvider.class);
        connection = ncp.createConnection("localhost", "7777");
        handlerEventAdapter = connection.getAdapter(IHandlerEventAdapter.class);
        valueAdapter = connection.getAdapter(IValueAdapter.class);
        connection.getAdapter(IErrorAdapter.class).addErrorListener(new IErrorListener() {
            @Override
            public void handlerError(de.hub.clickwatch.model.ClickWatchError error) {
                Assert.assertTrue(false);
            }
        });
        Node metaData = connection.getAdapter(IMetaDataAdapter.class).pullAllMetaData();
        connection.getAdapter(IMergeAdapter.class).merge(metaData);
        handlerEventAdapter.addEventListener(CompoundHandlerAdapterTest.class, handlerEventListener);
        connection.getAdapter(IErrorAdapter.class).addErrorListener(new IErrorListener() {           
            @Override
            public void handlerError(de.hub.clickwatch.model.ClickWatchError error) {
                Assert.assertTrue(false);
            }
        });
        handlerEventAdapter.start();

        for (int i = 0; i < 50; i++) {
            try {
                Thread.sleep(2000);
                TestUtil.report("mem-leak?", i, 1);
            } catch (InterruptedException e) {
                Assert.assertTrue(false);
            }
        }
	}
}
