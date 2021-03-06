package de.hub.clickwatch.test.internal;

import junit.framework.Assert;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.junit.Ignore;
import org.junit.Test;

import com.google.inject.Guice;
import com.google.inject.Injector;

import de.hub.clickwatch.ClickWatchModuleUtil;
import de.hub.clickwatch.ClickWatchModuleUtil.HandlerBehaviour;
import de.hub.clickwatch.connection.INodeConnection;
import de.hub.clickwatch.connection.INodeConnectionProvider;
import de.hub.clickwatch.connection.adapter.AbstractHandlerEventListener;
import de.hub.clickwatch.connection.adapter.IErrorAdapter;
import de.hub.clickwatch.connection.adapter.IErrorAdapter.IErrorListener;
import de.hub.clickwatch.connection.adapter.IHandlerEventAdapter;
import de.hub.clickwatch.connection.adapter.IHandlerEventListener;
import de.hub.clickwatch.connection.adapter.IMergeAdapter;
import de.hub.clickwatch.connection.adapter.IMetaDataAdapter;
import de.hub.clickwatch.connection.adapter.values.IValueAdapter;
import de.hub.clickwatch.connection.adapter.values.XmlValueAdapter;
import de.hub.clickwatch.model.ClickWatchError;
import de.hub.clickwatch.model.Handler;
import de.hub.clickwatch.model.Node;
import de.hub.clickwatch.test.ClickwatchTest;
import de.hub.clickwatch.test.TestUtil;
import de.hub.clickwatch.util.ILogger;

public class HandlerEventAdapterTest extends ClickwatchTest {

    protected IValueAdapter valueAdapter = null;
    protected int handlerCount = 0;

    protected INodeConnection connection;
    protected IHandlerEventAdapter handlerEventAdapter;

    public void setUp() {
        handlerCount = 0;
    }

    protected IHandlerEventListener handlerEventListener = new AbstractHandlerEventListener() {
        @Override
        public synchronized void handlerReceived(Handler handler) {
            Assert.assertNotNull(handler.getQualifiedName());
            Assert.assertNotNull(valueAdapter.getPlainValue(handler));
            EcoreUtil.delete(handler);
            handlerCount++;
        }
    };

    @Ignore("memory leak test, only run when indicated")
    @Test
    public void runPerformanceTest() {
        Injector injector = Guice.createInjector(ClickWatchModuleUtil.newBuilder().wRecord(getTestRecordURI())
                .wDebugLvl(ILogger.DEBUG).wIgnoredHandlers().wHandlerBhvr(HandlerBehaviour.DEFAULT, 0, 1000)
                .wValueAdapterClass(XmlValueAdapter.class).build());

        INodeConnectionProvider ncp = injector.getInstance(INodeConnectionProvider.class);
        connection = ncp.createConnection("192.168.3.152", "7777");
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
        handlerEventAdapter.addEventListener(HandlerEventAdapterTest.class, handlerEventListener);
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

    private void runTest(Runnable runnable) {
        Injector injector = Guice.createInjector(ClickWatchModuleUtil.newBuilder().wRecord(getTestRecordURI())
                .wDebugLvl(ILogger.DEBUG).wIgnoredHandlers().wHandlerBhvr(HandlerBehaviour.DEFAULT, 0, 1000)
                .wValueAdapterClass(XmlValueAdapter.class).build());

        INodeConnectionProvider ncp = injector.getInstance(INodeConnectionProvider.class);
        connection = ncp.createConnection("192.168.3.152", "7777");
        handlerEventAdapter = connection.getAdapter(IHandlerEventAdapter.class);
        valueAdapter = connection.getAdapter(IValueAdapter.class);
        connection.getAdapter(IErrorAdapter.class).addErrorListener(new IErrorListener() {
            @Override
            public void handlerError(ClickWatchError error) {
                Assert.assertTrue(false);
            }
        });
        Node metaData = connection.getAdapter(IMetaDataAdapter.class).pullAllMetaData();
        connection.getAdapter(IMergeAdapter.class).merge(metaData);
        handlerEventAdapter.addEventListener(HandlerEventAdapterTest.class, handlerEventListener);
        handlerEventAdapter.start();

        try {
            Thread.sleep(1900);
        } catch (InterruptedException e) {
            Assert.assertTrue(false);
        }

        Assert.assertEquals(metaData.getAllHandlers().size() * 2, handlerCount);
        runnable.run();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            Assert.assertTrue(false);
        }

        Assert.assertEquals(metaData.getAllHandlers().size() * 2, handlerCount);
    }

    @Test
    public void testDeconfigure() {
        runTest(new Runnable() {
            @Override
            public void run() {
                handlerEventAdapter.stop();
            }
        });
    }

    @Test
    public void testListenerRemove() {
        runTest(new Runnable() {
            @Override
            public void run() {
                handlerEventAdapter.removeEventListener(HandlerEventAdapterTest.class);
            }
        });
    }

    @Test
    public void testConcurrent() {
        Injector injector = Guice.createInjector(ClickWatchModuleUtil.newBuilder().wRecord(getTestRecordURI())
                .wDebugLvl(ILogger.DEBUG).wIgnoredHandlers().wHandlerBhvr(HandlerBehaviour.DEFAULT, 0, 3000).wThreads(2, 2)
                .wValueAdapterClass(XmlValueAdapter.class).build());

        INodeConnectionProvider ncp = injector.getInstance(INodeConnectionProvider.class);

        int handlerCount = 0;
        for (int i = 0; i < 5; i++) {
            connection = ncp.createConnection("192.168.3.152", "7777");
            handlerEventAdapter = connection.getAdapter(IHandlerEventAdapter.class);
            valueAdapter = connection.getAdapter(IValueAdapter.class);
            connection.getAdapter(IErrorAdapter.class).addErrorListener(new IErrorListener() {
                @Override
                public void handlerError(ClickWatchError error) {
                    Assert.assertTrue(false);
                }
            });
            Node metaData = connection.getAdapter(IMetaDataAdapter.class).pullAllMetaData();
            handlerEventAdapter.addEventListener(HandlerEventAdapterTest.class, handlerEventListener);
            connection.getAdapter(IMergeAdapter.class).merge(metaData);
            handlerCount += metaData.getAllHandlers().size();
            handlerEventAdapter.start();
        }

        try {
            Thread.sleep(2900);
        } catch (InterruptedException e) {
            Assert.assertTrue(false);
        }

        Assert.assertEquals(handlerCount, this.handlerCount);
    }
}
