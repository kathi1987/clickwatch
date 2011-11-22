package de.hub.clickwatch.recorder.examples.ui;

import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.PlatformUI;

import com.google.inject.Inject;

import de.hub.clickwatch.analysis.results.DataEntry;
import de.hub.clickwatch.analysis.results.Result;
import de.hub.clickwatch.connection.INodeConnection;
import de.hub.clickwatch.connection.INodeConnectionProvider;
import de.hub.clickwatch.connection.adapter.IHandlerEventAdapter;
import de.hub.clickwatch.connection.adapter.IHandlerEventListener;
import de.hub.clickwatch.connection.adapter.values.StringValueAdapter;
import de.hub.clickwatch.main.IClickWatchContext;
import de.hub.clickwatch.main.IRecordProvider;
import de.hub.clickwatch.model.Handler;
import de.hub.clickwatch.model.Node;
import de.hub.clickwatch.recorder.examples.AbstractAnalysis;
import de.hub.clickwatch.specificmodels.brn.BrnValueAdapter;
import de.hub.clickwatch.util.ILogger;
import de.hub.clickwatch.util.Throwables;

public abstract class AbstractRuntimeAnalysis extends AbstractAnalysis {

    @Inject private INodeConnectionProvider ncp;
	@Inject private StringValueAdapter stringValueAdapter;
	@Inject private BrnValueAdapter brnValueAdapter;
	@Inject private ILogger logger;
	@Inject private ScheduledExecutorService ses;
	private ScheduledFuture<?> analysisFuture = null;
	
	private long currentAnalysisTime = 0;
	
	private IClickWatchContext ctx = null;
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
			} else if (!node.getINetAddress().equals(other.node.getINetAddress()))
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
	
	private void handlerReceived(Node node, Handler handler) {
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
		List<DataEntry> entries = result.getData().getEntries();
		if (entries.isEmpty()) {
			return;
		}
		double end= (Double)entries.get(entries.size() - 1).getValues()[timeAxis];
		double start = end - size;
		if (start <= 0) {
			return;
		}
		int index = 0;
		for(DataEntry entry: entries) {
			if ((Double)(entry.getValues()[timeAxis]) >= start) {
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
	
	@Override
	public void main(final IClickWatchContext ctx) {
		this.ctx = ctx;
		nodes = Arrays.asList(ctx.getAdapter(IRecordProvider.class).getSelectedNodes());
		
		initialize();						
				
		for(Node node: nodes) {
		    INodeConnection connection = ncp.createConnection(node);
		    IHandlerEventAdapter hea = connection.getAdapter(IHandlerEventAdapter.class);
		    hea.addEventListener(node, new HandlerEventListener(node));
		}	
		
		analysisFuture = ses.scheduleWithFixedDelay(new Runnable() {            
            @Override
            public void run() {
                long currentTime = System.currentTimeMillis();
                if (currentTime - currentAnalysisTime > 25) {
                    currentAnalysisTime = currentTime;
                    for(Node node: nodes) {
                        try {
                            analyse(ctx, node, new NullProgressMonitor());
                        } catch (Exception e) {
                            logger.log(ILogger.ERROR, "exception during analysis", e);
                        }
                    }                               
                } else {
                    try {
                        wait(10);
                    } catch (InterruptedException e) {
                        Throwables.propagate(e);
                    }
                }
            }
        }, 0, 1000, TimeUnit.MILLISECONDS);
	}
	
	private class HandlerEventListener implements IHandlerEventListener {

	    private final Node node;
	    
        public HandlerEventListener(Node node) {
            super();
            this.node = node;
        }

        @Override
        public void handlerReceived(Handler handler) {
            AbstractRuntimeAnalysis.this.handlerReceived(node, handler);
        }

        @Override
        public void receivingStarted() {
            
        }

        @Override
        public void receivingStopped() {
            
        }

        @Override
        public void listeningStarted() {

        }

        @Override
        public void listeningStopped() {
            stop();
        }

        @Override
        public void dispose() {
            stop();
        }	    
	}
	
	private void stop() {
	    if (analysisFuture != null) {
	        analysisFuture.cancel(false);
	    }
	}
	
	public IClickWatchContext getContext() {
		return ctx;
	}
}
