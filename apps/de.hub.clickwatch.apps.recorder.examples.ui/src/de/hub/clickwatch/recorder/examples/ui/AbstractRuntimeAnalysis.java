package de.hub.clickwatch.recorder.examples.ui;

import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.common.util.EList;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.PlatformUI;

import com.google.inject.Inject;

import de.hub.clickwatch.analysis.results.DataEntry;
import de.hub.clickwatch.analysis.results.Result;
import de.hub.clickwatch.connection.adapter.StringValueAdapter;
import de.hub.clickwatch.main.IClickWatchContext;
import de.hub.clickwatch.main.IRecordProvider;
import de.hub.clickwatch.model.Handler;
import de.hub.clickwatch.model.Node;
import de.hub.clickwatch.recorder.INetworkRecorderDataListener;
import de.hub.clickwatch.recorder.NetworkRecorder;
import de.hub.clickwatch.recorder.database.cwdatabase.CWDataBasePackage;
import de.hub.clickwatch.recorder.database.cwdatabase.Record;
import de.hub.clickwatch.recorder.examples.AbstractAnalysis;
import de.hub.clickwatch.specificmodels.brn.BrnValueAdapter;
import de.hub.clickwatch.util.Throwables;

public abstract class AbstractRuntimeAnalysis extends AbstractAnalysis implements INetworkRecorderDataListener {

	@Inject private StringValueAdapter stringValueAdapter;
	@Inject private BrnValueAdapter brnValueAdapter;
	
	private boolean isStopped = false;
	private long currentAnalysisTime = 0;
	
	private IClickWatchContext ctx = null;
	private Record record = null;
	private Collection<Node> nodes = null;
	private Collection<DataHandle> handles = new HashSet<DataHandle>();
	private Map<DataHandle, Queue<Handler>> dataQueues = new HashMap<DataHandle, Queue<Handler>>();
	
	private class DataHandle {
		private final Node node;
		private final String handlerName;
		public DataHandle(Node node, String handlerName) {
			super();
			this.node = node;
			this.handlerName = handlerName;
		}
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + getOuterType().hashCode();
			result = prime * result
					+ ((handlerName == null) ? 0 : handlerName.hashCode());
			result = prime * result + ((node == null) ? 0 : node.hashCode());
			return result;
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			DataHandle other = (DataHandle) obj;
			if (!getOuterType().equals(other.getOuterType()))
				return false;
			if (handlerName == null) {
				if (other.handlerName != null)
					return false;
			} else if (!handlerName.equals(other.handlerName))
				return false;
			if (node == null) {
				if (other.node != null)
					return false;
			} else if (!node.equals(other.node))
				return false;
			return true;
		}
		private AbstractRuntimeAnalysis getOuterType() {
			return AbstractRuntimeAnalysis.this;
		}
	}
	
	private Display getDisplay() {
		return PlatformUI.getWorkbench().getDisplay();
	}
	
	@Override
	public void handlerRecorded(Node node, Handler handler) {
		DataHandle handle = new DataHandle(node, handler.getName());
		if (handles.contains(handle)) {
			Queue<Handler> dataQueue = getDataQueue(handle);
			dataQueue.add(brnValueAdapter.create(handler, stringValueAdapter));
		}
	}

	private Queue<Handler> getDataQueue(DataHandle handle) {
		Queue<Handler> dataQueue = dataQueues.get(handle);
		if (dataQueue == null) {
			if (handles.contains(handle)); {
				dataQueue = new ConcurrentLinkedQueue<Handler>();
				dataQueues.put(handle, dataQueue);
			}
		}
		return dataQueue;
	}
	
	public final <T> Iterable<T> createIterator(Node node, String handlerName, Class<T> handlerClass, IProgressMonitor monitor) {
		final Queue<Handler> dataQueue = getDataQueue(new DataHandle(node, handlerName));
		return new Iterable<T>() {
			@Override
			public Iterator<T> iterator() {
				return new Iterator<T>() {
					@Override
					public boolean hasNext() {
						return !dataQueue.isEmpty();
					}

					@SuppressWarnings("unchecked")
					@Override
					public T next() {
						return (T)dataQueue.poll();
					}

					@Override
					public void remove() {
						throw new UnsupportedOperationException();
					}					
				};
			}
		};
	}
	
	public synchronized void shiftResultWindow(Result result, double size, int timeAxis) {
		EList<DataEntry> entries = result.getDataSet().getEntries();
		if (entries.isEmpty()) {
			return;
		}
		double end= (Double)entries.get(entries.size() - 1).getValues().get(timeAxis);
		double start = end - size;
		if (start <= 0) {
			return;
		}
		int index = 0;
		for(DataEntry entry: entries) {
			if ((Double)(entry.getValues().get(timeAxis)) >= start) {
				break;
			}
			index++;
		}
		for (int i = 0; i < index; i++) {
			entries.remove(0);
		}
	}
	
	public synchronized void updateResult(final Result result) {
		getDisplay().syncExec(new Runnable() {
			@Override
			public void run() {
				result.setTimestamp(new Date());		
			}
		});
	}
	
	protected abstract void analyse(IClickWatchContext ctx, Node node, IProgressMonitor monitor);
	
	public void addObservedHandler(String handlerName) {
		for(Node node: nodes) {
			handles.add(new DataHandle(node, handlerName));
		}
	}
	
	private synchronized void runContiniouslyAnalysis(final AdapterImpl stopAdapter) {
		while(!isStopped) {
			long currentTime = System.currentTimeMillis();
			if (currentTime - currentAnalysisTime > 25) {
				currentAnalysisTime = currentTime;
				for(Node node: nodes) {
					// TODO run different nodes in different threads
					analyse(ctx, node, new NullProgressMonitor());
				}								
			} else {
				try {
					wait(10);
				} catch (InterruptedException e) {
					Throwables.propagate(e);
				}
			}
		}
		record.eAdapters().remove(stopAdapter);
	}

	@Override
	public void main(IClickWatchContext ctx) {
		this.ctx = ctx;
		record = ctx.getAdapter(IRecordProvider.class).getRecord();
		nodes = Arrays.asList(ctx.getAdapter(IRecordProvider.class).getSelectedNodes());
		
		initialize();
		
		NetworkRecorder recorder = record.getNetworkRecorder();
		if (recorder == null) {
			getDisplay().syncExec(new Runnable() {				
				@Override
				public void run() {
					MessageDialog.openInformation(getDisplay().getActiveShell(),
							"Not recording",
							"This analysis is only available during recording.");		
				}
			});			
			return;
		}	
		
		isStopped = false;
		final AdapterImpl stopAdapter = new AdapterImpl() {
			@Override
			public void notifyChanged(Notification msg) {
				if (msg.getFeature() == CWDataBasePackage.eINSTANCE.getRecord_NetworkRecorder()) {
					if (msg.getNewValue() == null) {
						isStopped = true;
					}
				}
			}
		};
		record.eAdapters().add(stopAdapter);
		recorder.addDataListener(this);
		
		new Thread(new Runnable() {			
			@Override
			public void run() {
				runContiniouslyAnalysis(stopAdapter);
			}			
		}, "continious analysis").start();		
	}
	
	public IClickWatchContext getContext() {
		return ctx;
	}
}
