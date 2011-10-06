package de.hub.clickwatch.recorder;

import java.util.ArrayList;
import java.util.List;

import com.google.inject.Inject;
import com.google.inject.Provider;

import de.hub.clickwatch.model.Handler;
import de.hub.clickwatch.model.Node;
import de.hub.clickwatch.recorder.database.IDataBaseRecordAdapter;
import de.hub.clickwatch.recorder.database.cwdatabase.CWDataBaseFactory;
import de.hub.clickwatch.recorder.database.cwdatabase.Record;
import de.hub.clickwatch.recorder.database.cwdatabase.RecordStatistics;
import de.hub.clickwatch.util.ILogger;
import de.hub.clickwatch.util.NanoClock;
import de.hub.clickwatch.util.Throwables;

public class NetworkRecorder {

	private Record record;
	
	private int iniliazedNodeRecorders = 0;
	private int stoppedNodeRecorders = 0;
	private RecordStatistics stats = null;
	private boolean aborted = false;
	
	private List<INetworkRecorderStatusListener> statusListeners = new ArrayList<INetworkRecorderStatusListener>();
	private List<INetworkRecorderDataListener> dataListeners = new ArrayList<INetworkRecorderDataListener>();
	
	@Inject private NanoClock clock;
	@Inject private IDataBaseRecordAdapter dataBaseAdapter;
	@Inject private ILogger logger;
	@Inject private Provider<NodeRecorder> recorderProvider;
	
	public synchronized void record(Record pRecord) {
		record(pRecord, pRecord.getDuration());
	}
	
	private void reportStatus(String message) {
		for (INetworkRecorderStatusListener listener: statusListeners) {
			listener.report(message);
		}
	}
	
	public synchronized void start(Record record) {
		record(record, -1);
	}
	
	public synchronized void record(Record record, long duration) {
		long start = clock.currentTimeNanos();
		long time = 0;
		this.record = record;
		this.stats = record.getStatistics();
		if (stats != null) {
			stats.reset();
		} else {
			this.stats = CWDataBaseFactory.eINSTANCE.createRecordStatistics();
			record.setStatistics(stats);
		}
	
		dataBaseAdapter.initialize(record, true);
		
		final List<NodeRecorder> nodeRecorders = new ArrayList<NodeRecorder>();
		for (Node recordedNode: record.getConfiguration().getNodes()) {
			NodeRecorder nodeRecorder = recorderProvider.get(); 
			nodeRecorder.setup(this, recordedNode);
			nodeRecorders.add(nodeRecorder);
			
			stats.getNodesA().addValue(1);
			new Thread(nodeRecorder, "Node-Recorder for: " + recordedNode.getINetAddress()).start();
		}
		
		try {
			reportStatus("start recording on all nodes");
			wait(20000); // timeout after 20 second of initialization
			logger.log(ILogger.DEBUG, "All node recorder are initialized and recording.", null);
			
			do {
				wait(1000);
				time = System.currentTimeMillis() - (start / 1000000);
				reportStatus("have recorded for " + (time/1000) + "s");
			} while(duration > time || (duration == -1 && !aborted));
			
			reportStatus("stop recording on all nodes");
			for (NodeRecorder recorder: nodeRecorders) {
				recorder.stop();
			}
			wait(10000); // for all reported stopped, timeout after 10 seconds;
			reportStatus("finalizing record");
			logger.log(ILogger.DEBUG, "All node recorder have stopped recording", null);
			dataBaseAdapter.close();
			logger.log(ILogger.DEBUG, "db-adapter has been shutdown", null);
		} catch(InterruptedException e) {
			Throwables.propagate(e);
		}
		
		
		stats.getTimeA().addValue(clock.currentTimeNanos() - start);
		logger.log(ILogger.DEBUG, stats.toString(), null);
	}
	
	public synchronized void reportInitialized() {
		iniliazedNodeRecorders++;
		if (iniliazedNodeRecorders == record.getConfiguration().getNodes().size()) {
			notify();
		}
	}
	
	public synchronized void reportStopped() {
		stoppedNodeRecorders++;		
		if (stoppedNodeRecorders == record.getConfiguration().getNodes().size()) {
			notify();
		}
	}
	
	public IDataBaseRecordAdapter getDataBaseAdapter() {
		return dataBaseAdapter;
	}
	
	public RecordStatistics getStatistics() {
		return stats;
	}
	
	public void addStatusListener(INetworkRecorderStatusListener listener) {
		statusListeners.add(listener);
	}
	
	public void removeStatusListener(INetworkRecorderStatusListener listener) {
		statusListeners.remove(listener);
	}
	
	public synchronized void abort() {
		aborted = true;
	}
	
	protected void reportHandlerRecorded(Node node, Handler handler) {
		for (INetworkRecorderDataListener listener: dataListeners) {
			listener.handlerRecorded(node, handler);
		}
	}
	
	public void addDataListener(INetworkRecorderDataListener listener) {
		dataListeners.add(listener);
	}
	
	public void removeDataListener(INetworkRecorderDataListener listener) {
		dataListeners.remove(listener);
	}
}
