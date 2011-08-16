package de.hub.clickwatch.recorder.database;

import com.google.common.base.Preconditions;
import com.google.inject.Inject;
import com.google.inject.name.Named;

import de.hub.clickwatch.model.Handler;
import de.hub.clickwatch.model.Node;
import de.hub.clickwatch.recoder.cwdatabase.Record;
import de.hub.clickwatch.recorder.CWRecorderModule;
import de.hub.clickwatch.util.ILogger;

public abstract class AbstractDataBaseRecordAdapter implements IDataBaseRecordAdapter {
	
	@Inject @Named(CWRecorderModule.I_HANDLER_PER_RECORD_PROPERTY) private int handlerPerRecord;
	
	@Inject protected ILogger logger;
	
	protected Record record;
	
	protected abstract class AbstractNodeDataBaseAdapter {
		protected String nodeId = null;
		
		protected int recordedHandler = 0;
		int startSample = 0;
		int sample = 0;
		
		protected void initialize(Node metaData) {
			nodeId = metaData.getINetAddress();
			recordedHandler = 0;
		}
		
		protected void reinitialize() {
			recordedHandler = 0;
		}
		
		protected void record(Handler handler, int sample) {
			this.sample = sample;
			recordedHandler++;
			if (recordedHandler > handlerPerRecord) {
				save();
				reinitialize();
			}
		}
		
		protected void save() {
			record.getStatistics().getSamplesR().addValue(sample - startSample);
			startSample = sample;
			record.getStatistics().getHandlersR().addValue(recordedHandler);
		}
	}
	
	@Override
	public void initialize(Record record, boolean overwrite) {
		this.record = record;
		if (overwrite && record.getMetaData() != null) {
			record.setStart(0);
			record.setEnd(0);
			record.getMetaData().clear();
		}
	}
	
	
	
	@Override
	public synchronized Object addNode(Node metaData) {
		record.getMetaData().add(metaData);
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
