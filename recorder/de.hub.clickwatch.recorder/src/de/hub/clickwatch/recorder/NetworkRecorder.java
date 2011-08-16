package de.hub.clickwatch.recorder;

import java.util.ArrayList;
import java.util.List;

import com.google.inject.Inject;
import com.google.inject.Provider;

import de.hub.clickwatch.model.Node;
import de.hub.clickwatch.recoder.cwdatabase.CWDataBaseFactory;
import de.hub.clickwatch.recoder.cwdatabase.Record;
import de.hub.clickwatch.recoder.cwdatabase.RecordStatistics;
import de.hub.clickwatch.recorder.database.IDataBaseRecordAdapter;
import de.hub.clickwatch.util.ILogger;
import de.hub.clickwatch.util.Throwables;

public class NetworkRecorder {

	private Record record;
	
	private int iniliazedNodeRecorders = 0;
	private int stoppedNodeRecorders = 0;
	private RecordStatistics stats = null;
	
	@Inject private IDataBaseRecordAdapter dataBaseAdapter;
	@Inject private ILogger logger;
	@Inject private Provider<NodeRecorder> recorderProvider;	
	
	public synchronized void record(Record pRecord) {
		long start = System.nanoTime();
		this.record = pRecord;
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
			wait(20000); // timeout after 20 second of initialization
			logger.log(ILogger.DEBUG, "All node recorder are initialized and recording.", null);
			wait(record.getDuration());
			for (NodeRecorder recorder: nodeRecorders) {
				recorder.stop();
			}
			wait(10000); // for all reported stopped, timeout after 10 seconds;
			logger.log(ILogger.DEBUG, "All node recorder have stopped recording", null);
			dataBaseAdapter.close();
			logger.log(ILogger.DEBUG, "db-adapter has been shutdown", null);
		} catch(InterruptedException e) {
			Throwables.propagate(e);
		}
		
		
		stats.getTimeA().addValue(System.nanoTime() - start);
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
}
