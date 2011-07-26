package de.hub.clickwatch.recorder.database;

import java.io.File;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;

import com.google.common.base.Preconditions;

import de.hub.clickwatch.model.Handler;
import de.hub.clickwatch.model.Node;
import de.hub.clickwatch.recoder.cwdatabase.CWDataBaseFactory;
import de.hub.clickwatch.recoder.cwdatabase.ExperimentDescr;
import de.hub.clickwatch.recoder.cwdatabase.ExperimentNodeRecordTimeTable;
import de.hub.clickwatch.recoder.cwdatabase.ExperimentRecord;
import de.hub.clickwatch.recoder.cwdatabase.NodeRecord;
import de.hub.clickwatch.recoder.cwdatabase.NodeRecordDescr;
import de.hub.clickwatch.util.ILogger;
import de.hub.clickwatch.util.Throwables;
import de.hub.emfxml.XmlModelRepository;

public class DataBaseAdapter extends AbstractDataBaseRecordAdapter implements IDataBaseRetrieveAdapter {
	
	public static final String zipExtension = ".zip";
	
	private ExperimentRecord experimentRecord = null;
	
	private class NodeDataBaseAdapter extends AbstractNodeDataBaseAdapter {
		Map<String, Handler> keyMap = new HashMap<String, Handler>();
		NodeRecord record;
		
		@Override
		protected void initialize(Node metaData) {
			super.initialize(metaData);
			record = CWDataBaseFactory.eINSTANCE.createNodeRecord();
			recordedHandler = 0;
			addResource(metaData.getINetAddress() + "_" + System.currentTimeMillis(), record);
			
			for (Handler metaDataHandler: metaData.getAllHandlers()) {
				Handler keyHander = keyMap.get(metaDataHandler.getQualifiedName());
				if (keyHander != null) {
					record.getRecords().add(keyHander);
				}
			}
		}
		
		@Override
		protected void reinitialize() {
			record = CWDataBaseFactory.eINSTANCE.createNodeRecord();
			super.reinitialize();
		}
		
		@Override
		protected void record(Handler handler, int sample) {
			long time = handler.getTimestamp();
			
			if (record.getStart() <= 0 || time < record.getStart()) {
				record.setStart(time);
			}
			if (time > record.getEnd()) {
				record.setEnd(time);
			}
			
			record.getRecords().add(handler);
			super.record(handler, sample);
		}
		
		@Override
		protected void save() {
			if (record != null && record.eResource() != null) {
				NodeRecordDescr recordDescr = CWDataBaseFactory.eINSTANCE.createNodeRecordDescr();
				recordDescr.setRecord(record);
				
				if (!experiment.getDataBase().getInMemory()) {
					try {
						record.eResource().save(XmlModelRepository.defaultLoadSaveOptions());					
						logger.log(ILogger.DEBUG, "saved record for node " + nodeId + " in "
								+ record.eResource().getURI().toFileString() + ".", null);
					} catch (IOException e) {
						Throwables.propagate(e);
					}
														
					URI uri = record.eResource().getURI();
					experiment.getStatistics().getRecordSize().addValue(new File(uri.toFileString()).length());			
					
					record.getRecords().clear();
					record.eResource().unload();
														
					report("mem-leak?", 1, 1);
				}
				saveRecord(nodeId, record.getStart(), record.getEnd(), recordDescr);
			}
			super.save();
		}
	}
	
	@Override
	public void initialize(ExperimentDescr experiment, boolean overwrite) {
		super.initialize(experiment, overwrite);
		
		experimentRecord = experiment.getRecord();
		if (experimentRecord == null || overwrite) {
			ResourceSet resourceSet = experiment.eResource().getResourceSet();
			Resource experimentRecordResource = resourceSet.createResource(
					URI.createURI(
							getURIPrefix() 
							+ "_" + System.currentTimeMillis() 
							+ zipExtension));
			
			experimentRecord = CWDataBaseFactory.eINSTANCE.createExperimentRecord();
			experimentRecord.setName(experiment.getName());
			experimentRecordResource.getContents().add(experimentRecord);
			experiment.setRecord(experimentRecord);
		}
	}
	
	
	
	@Override
	public synchronized Object addNode(Node metaData) {
		return super.addNode(metaData);
	}

	@Override
	protected AbstractNodeDataBaseAdapter createNodeDataBaseAdapter() {
		return new NodeDataBaseAdapter();
	}
	
	private synchronized void saveRecord(String nodeId, long start, long end, NodeRecordDescr nodeRecord) {		
		Preconditions.checkArgument(start > 0);
		if (experiment.getStart() <= 0 || start < experiment.getStart()) {
			experiment.setStart(start);
		}
		if (end > experiment.getEnd()) {
			experiment.setEnd(end);
		}
		
		ExperimentNodeRecordTimeTable timeTable = experimentRecord.getNodeMap().get(nodeId);
		if (timeTable == null) {				
			timeTable = CWDataBaseFactory.eINSTANCE.createExperimentNodeRecordTimeTable();
			experimentRecord.getNodeMap().put(nodeId, timeTable);
		}

		if (start == 0) {
			return; // does not needed to be saved, this can happen when the record is aborted right when a new record started
		}
		timeTable.getNodeMap().put(start, nodeRecord);
		
		if (!experiment.getDataBase().getInMemory()) {
			try {
				logger.log(ILogger.DEBUG, "saving experiment record and main database file", null);
				experimentRecord.eResource().save(XmlModelRepository.defaultLoadSaveOptions());
				experiment.eResource().save(XmlModelRepository.defaultLoadSaveOptions());
			} catch (IOException e) {
				Throwables.propagate(e);
			}
		}
	}

	private synchronized void addResource(String unique, NodeRecord record) {
		String fileString = getURIPrefix() + "_" + unique+ zipExtension;
		URI uri = URI.createURI(fileString);
		Resource recordResource = experiment.getDataBase().eResource().getResourceSet().createResource(uri);
		recordResource.getContents().add(record);
	}
	
	private String getURIPrefix() {
		return experiment.getDataBase().getStorageBaseFileString() 
				+ "/.data/" + experiment.getName().replace(" ", "_"); 
		
	}
	
	private static Runtime runtime = Runtime.getRuntime();
	private static NumberFormat memFormat = new DecimalFormat("#00,000,000,000,000");
	private static NumberFormat updatesFormat = new DecimalFormat("#00,000,000");
	
	private void report(String msg, long run, long reportOnEach) {
		if (run % reportOnEach == 0) {
			runtime.gc();
			logger.log(ILogger.DEBUG, msg + " updates run: " + updatesFormat.format(run) + "; memory-usage: " + 
					memFormat.format(runtime.totalMemory() - runtime.freeMemory()) +
					"; heap-size: " + memFormat.format(runtime.totalMemory()), null);
		}
	}



	@Override
	public void initialize(ExperimentDescr experiment) {
		if (this.experiment != experiment) {
			this.initialize(experiment, false);
		}
	}
	
	private Resource cache = null;
	private Map<String, Handler> handlerMap = null;

	@Override
	public void set(String nodeId, long time) {
		if (handlerMap != null) {
			handlerMap.clear();
		} else {
			handlerMap = new HashMap<String, Handler>();
		}
		
		// get NodeDescr
		NodeRecordDescr nodeDescr = null;
		ExperimentNodeRecordTimeTable experimentNodeRecordTimeTable = experiment.getRecord().getNodeMap().get(nodeId);
		loop: for (Entry<Long, NodeRecordDescr> entry: experimentNodeRecordTimeTable.getNodeMap()) {
			if (entry.getKey() <= time) {
				nodeDescr = entry.getValue();	
			} else {
				break loop;
			}
		}
		
		if (nodeDescr == null) {
			// given time lies before the experiment
			return;
		}
		
		NodeRecord nodeRecord = nodeDescr.getRecord();
		
		if (cache != null && nodeRecord.eResource() != cache) {
			cache.unload();
		}
		
		if (handlerMap != null) {
			handlerMap.clear();
		} else {
			handlerMap = new HashMap<String, Handler>();
		}
		for (Handler handler: nodeRecord.getRecords()) {
			if (handler.getTimestamp() <= time) {
				handlerMap.put(handler.getQualifiedName(), handler);
			}
		}

		if (nodeRecord.eResource() != null) {
			cache = nodeRecord.eResource();	
		}
	}

	@Override
	public Handler retrieve(String handlerId) {
		if (handlerMap == null) {
			return null;
		} else {
			return handlerMap.get(handlerId);
		}
	}

}
