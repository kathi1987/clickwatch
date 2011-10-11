package de.hub.clickwatch.analysis.results.ui;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.PlatformUI;

import de.hub.clickwatch.analysis.results.Result;
import de.hub.clickwatch.main.IClickWatchContext;
import de.hub.clickwatch.main.IClickWatchMain;
import de.hub.clickwatch.main.IRecordProvider;
import de.hub.clickwatch.model.Handler;
import de.hub.clickwatch.model.Node;
import de.hub.clickwatch.recorder.INetworkRecorderDataListener;
import de.hub.clickwatch.recorder.NetworkRecorder;
import de.hub.clickwatch.recorder.database.cwdatabase.CWDataBasePackage;
import de.hub.clickwatch.recorder.database.cwdatabase.Record;
import de.hub.clickwatch.util.Throwables;

public abstract class AbstractRuntimeAnalysis implements IClickWatchMain, INetworkRecorderDataListener {

	private long lastAnalysis = 0;
	private boolean stopped = false;
	private List<Node> selectedNodes = null;
	private Queue<Handler> data = new ConcurrentLinkedQueue<Handler>();
	private Handler latest = null;
	private IClickWatchContext ctx = null;
	private Result[] results = null;
	private Record record = null;
	
	protected IClickWatchContext getContext() {
		return ctx;
	}
	
	protected Record getRecord() {
		return record;
	}
	
	protected abstract void continiousAnalysis(Result[] results, Queue<Handler> data);
	
	protected abstract Result[] createResults();
	
	protected abstract void prepareResults(Result[] results);
	
	protected abstract Handler getData(Node node, Handler handler);
	
	protected boolean isEnabled() {
		return true;
	}
	
	protected void cutOffDataForDuration(long durationInMillies) {
		long currentTime = latest.getTimestamp();
		long startTime = currentTime - (durationInMillies * 1000000);
		while (data.peek().getTimestamp() < startTime) {
			data.poll();
		}
	}
	
	private synchronized void syncronizedContiniousAnalysis(final Result[] results, Queue<Handler> data) {
		if (data.size() > 0 && latest != null) {
			continiousAnalysis(results, data);
			
			getDisplay().syncExec(new Runnable() {
				@Override
				public void run() {
					for(Result result: results) {
						result.setTimestamp(new Date());
					}						
				}
			});
		}
	}

	private Display getDisplay() {
		return PlatformUI.getWorkbench().getDisplay();
	}
	
	@Override
	public void main(IClickWatchContext ctx) {
		this.ctx = ctx;
		record = ctx.getAdapter(IRecordProvider.class).getRecord();
		selectedNodes = Arrays.asList(ctx.getAdapter(IRecordProvider.class).getSelectedNodes());
		results = createResults();
		
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
		stopped = false;
		final AdapterImpl stopAdapter = new AdapterImpl() {
			@Override
			public void notifyChanged(Notification msg) {
				if (msg.getFeature() == CWDataBasePackage.eINSTANCE.getRecord_NetworkRecorder()) {
					if (msg.getNewValue() == null) {
						stopped = true;
					}
				}
			}
		};
		record.eAdapters().add(stopAdapter);
		
		recorder.addDataListener(this);
		prepareResults(results);
		new Thread(new Runnable() {			
			@Override
			public void run() {
				runContiniouslyAnalysis(stopAdapter);
			}			
		}, "continious analysis").start();
	}
	
	private synchronized void runContiniouslyAnalysis(final AdapterImpl stopAdapter) {
		while(!stopped) {
			long currentTime = System.currentTimeMillis();
			if (currentTime - lastAnalysis > 25) {
				syncronizedContiniousAnalysis(results, data);
				lastAnalysis = currentTime;
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
	public synchronized void handlerRecorded(Node node, Handler handler) {
		if (selectedNodes.contains(node)) {
			Handler dataItem = getData(node, handler);
			if (dataItem != null) {
				latest = dataItem;
				data.add(dataItem);
			}								
		}
	}		
}
