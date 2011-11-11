package de.hub.clickwatch.test.internal;

import junit.framework.Assert;

import org.junit.Test;

import com.google.inject.Guice;
import com.google.inject.Injector;

import de.hub.clickwatch.ClickWatchModuleUtil;
import de.hub.clickwatch.test.ClickwatchTest;
import de.hub.clickwatch.util.Tasks;

public class TasksTest extends ClickwatchTest {
    
    private int counter = 0;
    
    private synchronized void inc() {
        counter++;
    }

    @Test
    public void singleTest() {
        Injector injector = Guice.createInjector(ClickWatchModuleUtil.newBuilder().wThreads(10, 10).build());
        Tasks tasks = injector.getInstance(Tasks.class);
        
        for (int i = 0; i < 10000; i++) {
            final int fi = i;
            tasks.dispatchTask(this, new Runnable() {           
                @Override
                public void run() {
                    Assert.assertEquals(fi, counter++);
                }
            });
        }
        tasks.waitForCompletion(this);
        Assert.assertEquals(counter, 10000);
    }
    
    @Test
    public void multiTest() {
        Injector injector = Guice.createInjector(ClickWatchModuleUtil.newBuilder().wThreads(10, 10).build());
        Tasks tasks = injector.getInstance(Tasks.class);
        
        for (int i = 0; i < 10000; i++) {
            tasks.dispatchTask(i, new Runnable() {           
                @Override
                public void run() {
                    inc();
                }
            });
        }        
        tasks.waitForCompletionAll();
        Assert.assertEquals(counter, 10000);
    }
}
