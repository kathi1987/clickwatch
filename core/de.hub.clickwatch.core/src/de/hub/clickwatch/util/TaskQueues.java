package de.hub.clickwatch.util;

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
		TaskQueue taskQueue = taskQueues.get(taskQueueKey);
		if (taskQueue == null) {
			taskQueue = taskQueueProvider.get();
			taskQueues.put(taskQueueKey, taskQueue);
		}
		taskQueue.addTask(taskQueueKey, task);
	}
}