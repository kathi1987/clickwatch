package de.hub.clickwatch.recorder.database;

import com.google.common.base.Preconditions;
import com.google.inject.Inject;
import com.google.inject.name.Named;

import de.hub.clickwatch.model.Handler;
import de.hub.clickwatch.model.Node;
import de.hub.clickwatch.recoder.cwdatabase.ExperimentDescr;
import de.hub.clickwatch.recorder.CWRecorderModule;
import de.hub.clickwatch.util.ILogger;

public abstract class AbstractDataBaseRecordAdapter implements IDataBaseRecordAdapter {
	
	@Inject @Named(CWRecorderModule.I_HANDLER_PER_RECORD_PROPERTY) private int handlerPerRecord;
	
	@Inject protected ILogger logger;
	
	protected ExperimentDescr experiment;
	
	protected abstract class AbstractNodeDataBaseAdapter {
		protected String nodeId = null;
		
		int recordedHandler = 0;
		int startSample = 0;
		
		protected void initialize(Node metaData) {
			nodeId = metaData.getINetAddress();
			recordedHandler = 0;
		}
		
		protected void reinitialize() {
			recordedHandler = 0;
		}
		
		protected void record(Handler handler, int sample) {
			recordedHandler++;
			if (recordedHandler > handlerPerRecord) {
				save();
				reinitialize();
				experiment.getStatistics().getSamplesR().addValue(sample - startSample);
				startSample = sample;
			}
		}
		
		protected void save() {		
			experiment.getStatistics().getHandlersR().addValue(recordedHandler);
		}
	}
	
	@Override
	public void initialize(ExperimentDescr experiment, boolean overwrite) {
		this.experiment = experiment;
		if (overwrite && experiment.getMetaData() != null) {
			experiment.setStart(0);
			experiment.setEnd(0);
			experiment.getMetaData().clear();
		}
	}
	
	
	
	@Override
	public synchronized Object addNode(Node metaData) {
		experiment.getMetaData().add(metaData);
		AbstractNodeDataBaseAdapter nodeDBAdapter = createNodeDataBaseAdapter();
		nodeDBAdapter.initialize(metaData);
		return nodeDBAdapter;
	}

	
	protected abstract AbstractNodeDataBaseAdapter createNodeDataBaseAdapter();


	@Override
	public boolean record(Object nodeDBAdapter, Handler handler, boolean hasChanged, int sample) {
		if (hasChanged) {
			Preconditions.checkState(handler.getTimestamp() > 0);
			((AbstractNodeDataBaseAdapter)nodeDBAdapter).record(handler, sample);
			return true;
		} else {
			return false;
		}
	}

	@Override
	public void close(Object nodeAdapter) {
		((AbstractNodeDataBaseAdapter)nodeAdapter).save();
	}

	@Override
	public void close() {
		// empty
	}
}
