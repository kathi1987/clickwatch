package de.hub.clickwatch.util;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

import com.google.common.base.Preconditions;
import com.google.inject.Inject;

public final class TaskQueue implements Runnable {

    @Inject private ILogger logger;
	@Inject private ExecutorService es;
	private Queue<Runnable> tasks = new ConcurrentLinkedQueue<Runnable>();
	private Future<?> future = null;
	
	private Object key = null;

    protected synchronized void addTask(Object key, Runnable task) {
        if (this.key == null) {
            this.key = key;
        }
        Preconditions.checkArgument(this.key == key);
            
		tasks.add(task);
		if (tasks.size() > 500) {
		    logger.log(ILogger.WARNING, "large taksQueue detected, size=" + tasks.size(), null);
		}
		if (future == null || future.isDone()) {
			future = es.submit(this);
		}
	}
	
	private synchronized void submit() {
		future = es.submit(this);
	}
	
	@Override
	public void run() {
		if (!tasks.isEmpty()) {
			Runnable task = (Runnable)tasks.poll();
			try {
			    task.run();
			} catch(Exception e) {
			    logger.log(ILogger.WARNING, "task on " + toString() + " ended with exception", e);
			}
		}
		if (!tasks.isEmpty()) {
			submit();			
		}
	}
	
    /**
     * Blocks until all tasks in this queue are completed. This recognized
     * only tasks that are already in the queue, thus after this method returns
     * the queue might have been filled by other tasks again.
     */
	protected synchronized void waitForCompletion() {
	    addTask(key, new Runnable() {
            @Override
            public void run() {
                notifyForCompletion();
            }
        });
        try {
            wait();
        } catch (InterruptedException e) {
            Throwables.propagate(e);
        }
        return;
	}
	
	private synchronized void notifyForCompletion() {
	    this.notifyAll();
	}
	

    @Override
    public String toString() {
        return "TaskQueue [key=" + key.toString() + "]";
    }
	
}
