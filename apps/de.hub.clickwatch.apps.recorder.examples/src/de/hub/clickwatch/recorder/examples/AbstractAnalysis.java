package de.hub.clickwatch.recorder.examples;

import static de.hub.clickwatch.recorder.database.DataBaseUtil.createHandle;

import java.util.Iterator;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.SubProgressMonitor;

import com.google.common.base.Preconditions;
import com.google.inject.Inject;

import de.hub.clickwatch.main.IClickWatchContext;
import de.hub.clickwatch.main.IClickWatchMain;
import de.hub.clickwatch.main.IProgressMonitorProvider;
import de.hub.clickwatch.main.IRecordProvider;
import de.hub.clickwatch.model.Handler;
import de.hub.clickwatch.model.Node;
import de.hub.clickwatch.recorder.database.DataBaseUtil;
import de.hub.clickwatch.recorder.database.cwdatabase.Record;
import de.hub.clickwatch.util.ILogger;

public abstract class AbstractAnalysis implements IClickWatchMain {

	@Inject private ILogger logger;
	@Inject private DataBaseUtil dbUtil;
	private IClickWatchContext ctx;
	private Record record;
	private long start;
	private long end;

	int finishedRunner = 0;
	
	public <T> Iterable<T> createIterator(Node node, String handlerName, Class<T> handlerClass, IProgressMonitor monitor) {
		final Iterator<Handler> iterator = dbUtil.getHandlerIterator(
				createHandle(record, node.getINetAddress(), handlerName, start, end), monitor);
		return new Iterable<T>() {
			@Override
			public Iterator<T> iterator() {
				return new Iterator<T>() {

					@Override
					public boolean hasNext() {
						return iterator.hasNext();
					}

					@SuppressWarnings("unchecked")
					@Override
					public T next() {
						return (T)iterator.next();
					}

					@Override
					public void remove() {
						throw new UnsupportedOperationException();
					}
				};
			}
		};
	}
	
	protected void initialize() {
		// empty
	}
	
	protected abstract void analyse(IClickWatchContext ctx, Node node, IProgressMonitor monitor);
	
	public void setWindowInMS(long from, long length) {
		this.start += from * 1e6;
		this.end = this.start + (long)(length * 1e6);
		
		Preconditions.checkState(this.start >= record.getStart() && this.start < record.getEnd());
		Preconditions.checkState(this.end > record.getStart() && this.end <= record.getEnd());
		Preconditions.checkState(this.end > this.start);
	}
	
	public IClickWatchContext getContext() {
		return ctx;
	}
	
	@Override
	public void main(final IClickWatchContext ctx) {
		this.ctx = ctx;
		record = ctx.getAdapter(IRecordProvider.class).getRecord();
		start = record.getStart();
		end = record.getEnd();
		
		initialize();
		
		Node[] nodes = ctx.getAdapter(IRecordProvider.class).getSelectedNodes();
		final IProgressMonitor monitor = ctx.getAdapter(IProgressMonitorProvider.class).getProgressMonitor();
		
		monitor.beginTask("Performing analysis on all nodes", nodes.length*100);
		finishedRunner = 0;
		for (final Node node: nodes) {
			Thread nodeRunner = new Thread(new Runnable() {
				@Override
				public void run() {
					try {
						analyse(ctx, node, new SubProgressMonitor(monitor, 100));
					} catch (Exception e) {
						logger.log(ILogger.ERROR, "exception during analysis", e);
					}
					finishedRunner++;
				}
			});
			nodeRunner.setName("Analysis NodeRunner");
			nodeRunner.start();
		}
		
		waitForAllRunnersFinished(nodes.length);
		monitor.done();
	}
	
	private synchronized void waitForAllRunnersFinished(int nodes) {
		while(finishedRunner < nodes) {
			try {
				wait(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}