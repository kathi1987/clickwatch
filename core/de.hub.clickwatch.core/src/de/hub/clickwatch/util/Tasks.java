package de.hub.clickwatch.util;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

import com.google.inject.Inject;
import com.google.inject.Provider;
import com.google.inject.Singleton;

@Singleton
public class Tasks {
    @Inject Provider<TaskQueue> taskQueueProvider;
    @Inject ScheduledExecutorService ses;
    @Inject ExecutorService es;
    private Map<Object, TaskQueue> taskQueues = new HashMap<Object, TaskQueue>();

    public void dispatchTask(Object taskQueueKey, final Runnable task) {
        if (taskQueueKey == null) {
            taskQueueKey = this;
        }
        TaskQueue taskQueue = taskQueues.get(taskQueueKey);
        if (taskQueue == null) {
            taskQueue = taskQueueProvider.get();
            taskQueues.put(taskQueueKey, taskQueue);
        }
        taskQueue.addTask(taskQueueKey, task);
    }

    /**
     * Blocks until all tasks in the given queue are completed. This recognized
     * only tasks that are already in the queue, thus after this method returns
     * the queue might have been filled by other tasks again.
     */
    public void waitForCompletion(Object taskQueueKey) {
        taskQueues.get(taskQueueKey).waitForCompletion();        
    }
    
    public void waitForCompletionAll() {
        for (TaskQueue taskQueue: taskQueues.values()) {
            taskQueue.waitForCompletion();
        }
    }

    public void shutdown() {
        ses.shutdownNow();
        es.shutdownNow();
    }
}