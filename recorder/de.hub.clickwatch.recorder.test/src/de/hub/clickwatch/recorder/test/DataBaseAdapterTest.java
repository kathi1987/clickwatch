package de.hub.clickwatch.recorder.test;

import java.util.Iterator;

import junit.framework.Assert;

import org.junit.Test;

import com.google.inject.Guice;
import com.google.inject.Injector;

import de.hub.clickwatch.ClickWatchModuleUtil;
import de.hub.clickwatch.connection.adapter.values.IValueAdapter;
import de.hub.clickwatch.model.Handler;
import de.hub.clickwatch.model.Node;
import de.hub.clickwatch.model.util.builder.ModelBuilders;
import de.hub.clickwatch.recorder.ClickWatchRecorderModuleUtil;
import de.hub.clickwatch.recorder.database.Record;
import de.hub.clickwatch.recorder.database.util.builder.DatabaseBuilders;
import de.hub.clickwatch.recorder.recorder.HBaseDataBaseAdapter;
import de.hub.clickwatch.recorder.recorder.IDataBaseAdapter;
import de.hub.clickwatch.test.ClickwatchTest;
import de.hub.clickwatch.util.NanoClock;

public class DataBaseAdapterTest extends ClickwatchTest {

    @Test
    public void testPutAndRetrieve() throws Exception {
        // @formatter:off
        Injector injector = Guice.createInjector(
                ClickWatchModuleUtil.newBuilder()
                    .wClickSocketImpl(getTestClickSocket())
                    .wLogger(getTestLogger()).build(),
                ClickWatchRecorderModuleUtil.newBuilder()
                    .wDataBaseAdapterClass(HBaseDataBaseAdapter.class)
                    .wSaveRecordFileDuringRecord(false).build());
        // @formatter:on

        IDataBaseAdapter dataBaseAdapter = injector.getInstance(IDataBaseAdapter.class);
        Record record = DatabaseBuilders.newRecordBuilder().withName("test").build();
        dataBaseAdapter.initialize(record, true);

        // test put
        Node node = ModelBuilders.newNodeBuilder().withINetAddress("localhost").withPort("7777").build();
        NanoClock clock = injector.getInstance(NanoClock.class);
        long latest = 0;
        for (int i = 0; i < 1000; i++) {
            latest =  clock.currentTimeNanos();
            Handler handler = injector.getInstance(IValueAdapter.class).create("test.test", latest,
                    "testValue");            
            dataBaseAdapter.record(node, handler);
        }
        dataBaseAdapter.close();
        
        Thread.sleep(200);

        // test retrieve all
        Handler handler = ModelBuilders.newHandlerBuilder().withName("test.test").build();
        dataBaseAdapter.initialize(record, false);
        for (int tryies = 0; tryies < 23; tryies++) {                        
            Iterator<Handler> iterator = dataBaseAdapter.retrieve(node, handler);
            int i = 0;
            while (iterator.hasNext()) {
                Handler currentHandler = (Handler)iterator.next();
                Assert.assertEquals("testValue", currentHandler.getValue());
                i++;
            }
            Assert.assertEquals(1000, i);        
        }
        dataBaseAdapter.close();
        
        Thread.sleep(200);
        
        // test retrieve one
        dataBaseAdapter.initialize(record, false);            
        Handler currentHandler = dataBaseAdapter.retrieve(node, handler, latest);
        Assert.assertEquals("testValue", currentHandler.getValue());
        dataBaseAdapter.close();
    }

}
