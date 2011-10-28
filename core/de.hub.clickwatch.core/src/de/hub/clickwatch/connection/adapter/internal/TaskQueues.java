package de.hub.clickwatch.connection.adapter.internal;

import java.util.HashMap;
import java.util.Map;

import com.google.inject.Inject;
import com.google.inject.Provider;
import com.google.inject.Singleton;

@Singleton
public class TaskQueues {
	@Inject Provider<TaskQueue> taskQueueProvider;
	private Map<Object, TaskQueue> taskQueues = new HashMap<Object, TaskQueue>();
	
	public void dispatchTask(Object taskQueueKey, final Runnable task) {
		if (taskQueueKey == null) {
			taskQueueKey = this;
		}
		TaskQueue taksQueue = taskQueues.get(taskQueueKey);
		if (taksQueue == null) {
			taksQueue = taskQueueProvider.get();
			taskQueues.put(taskQueueKey, taksQueue);
		}
		taksQueue.addTask(task);
	}
}