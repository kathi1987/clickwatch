package de.hub.clickwatch.recorder.test;

import java.util.Iterator;

import junit.framework.Assert;

import org.junit.Test;

import com.google.inject.Guice;
import com.google.inject.Injector;

import de.hub.clickwatch.ClickWatchModuleUtil;
import de.hub.clickwatch.ClickWatchModuleUtil.HandlerBehaviour;
import de.hub.clickwatch.connection.INodeConnection;
import de.hub.clickwatch.connection.INodeConnectionProvider;
import de.hub.clickwatch.connection.adapter.IHandlerEventAdapter;
import de.hub.clickwatch.connection.adapter.IHandlerEventListener;
import de.hub.clickwatch.connection.adapter.IMergeAdapter;
import de.hub.clickwatch.connection.adapter.IMetaDataAdapter;
import de.hub.clickwatch.model.Handler;
import de.hub.clickwatch.model.Node;
import de.hub.clickwatch.model.util.builder.ModelBuilders;
import de.hub.clickwatch.recorder.ClickWatchRecorderModuleUtil;
import de.hub.clickwatch.recorder.database.Record;
import de.hub.clickwatch.recorder.database.util.builder.DatabaseBuilders;
import de.hub.clickwatch.recorder.recorder.HBaseDataBaseAdapter;
import de.hub.clickwatch.recorder.recorder.IDataBaseAdapter;
import de.hub.clickwatch.recorder.recorder.Recorder;
import de.hub.clickwatch.test.ClickwatchTest;

public class RecorderTest extends ClickwatchTest {
    
    @Override
    protected HandlerDescr[] handlers() {
        return new HandlerDescr[] {
                createHander("e", "h", "testValue")
        };
    }

    @Test
    public void testRecorder() throws Exception {
        // @formatter:off
        Injector injector = Guice.createInjector(
                ClickWatchModuleUtil.newBuilder()
                    .wClickSocketImpl(getTestClickSocket())
                    .wLogger(getTestLogger()).build(),
                ClickWatchRecorderModuleUtil.newBuilder()
                    .wDataBaseAdapterClass(HBaseDataBaseAdapter.class)
                    .wSaveRecordFileDuringRecord(false).build());

        Record record = DatabaseBuilders.newRecordBuilder()
                .withName("test")
                .withConfiguration(
                        ModelBuilders.newNetworkBuilder()
                        .withName("network")
                        .withNodes(
                                ModelBuilders.newNodeBuilder()
                                .withINetAddress("localhost").withPort("7777"))).build();
        // @formatter:on
        
        Node node = record.getConfiguration().getNodes().get(0);
        INodeConnection connection = injector.getInstance(INodeConnectionProvider.class).createConnection(node);
        connection.getAdapter(IMergeAdapter.class).merge(connection.getAdapter(IMetaDataAdapter.class).pullAllMetaData());
        connection.close();
        
        Recorder recorder = injector.getInstance(Recorder.class);
        recorder.record(record);
        connection.getAdapter(IHandlerEventAdapter.class).start();
        Thread.sleep(5000);
        recorder.stop();
        connection.dispose();
        
        Thread.sleep(200);
        
        IDataBaseAdapter dataBaseAdapter = injector.getInstance(IDataBaseAdapter.class);
        dataBaseAdapter.initialize(record, false);
        Iterator<Handler> iterator = dataBaseAdapter.retrieve(node, ModelBuilders.newHandlerBuilder().withName("e/h").build());
        int i = 0;
        while (iterator.hasNext()) {
            Handler handler = (Handler)iterator.next();
            Assert.assertEquals("testValue", handler.getValue());
            i++;
        }
        Assert.assertTrue(i > 3);
        dataBaseAdapter.close();
    }
    
    @Test
    public void testRecorderWithRecord() throws Exception {
        // @formatter:off
        Injector injector = Guice.createInjector(
                ClickWatchModuleUtil.newBuilder()               
                    .wRecord(getTestRecordURI())
                    .wHandlerBhvr(HandlerBehaviour.DEFAULT, 1000, 1000)
                    .wLogger(getTestLogger()).build(),
                ClickWatchRecorderModuleUtil.newBuilder()
                    .wDataBaseAdapterClass(HBaseDataBaseAdapter.class)
                    .wSaveRecordFileDuringRecord(false).build());

        Record record = DatabaseBuilders.newRecordBuilder()
                .withName("test")
                .withConfiguration(
                        ModelBuilders.newNetworkBuilder()
                        .withName("network")
                        .withNodes(
                                ModelBuilders.newNodeBuilder()
                                .withINetAddress("192.168.3.152").withPort("7777"))).build();
        // @formatter:on
        
        Node node = record.getConfiguration().getNodes().get(0);
        INodeConnection connection = injector.getInstance(INodeConnectionProvider.class).createConnection(node);
        connection.getAdapter(IMergeAdapter.class).merge(connection.getAdapter(IMetaDataAdapter.class).pullAllMetaData());
        connection.close();
        
        Recorder recorder = injector.getInstance(Recorder.class);
        recorder.record(record);
        connection.getAdapter(IHandlerEventAdapter.class).start();
        Thread.sleep(5000);
        recorder.stop();
        connection.dispose();
        
        Thread.sleep(200);
        
        IDataBaseAdapter dataBaseAdapter = injector.getInstance(IDataBaseAdapter.class);
        dataBaseAdapter.initialize(record, false);
        Iterator<Handler> iterator = dataBaseAdapter.retrieve(node, ModelBuilders.newHandlerBuilder().withName("seismo/channelstatinfo").build());
        int i = 0;
        while (iterator.hasNext()) {
            Handler handler = (Handler)iterator.next();
            Assert.assertNotNull(handler.getValue());
            i++;
        }
        Assert.assertTrue(i > 3);
        dataBaseAdapter.close();
    }
}
