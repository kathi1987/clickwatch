package de.hub.clickwatch.cwdatabase;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;

import com.google.common.base.Preconditions;
import com.google.inject.Inject;
import com.google.inject.Provider;

import de.hub.clickwatch.XmlModelRepository;
import de.hub.clickwatch.model.Node;
import de.hub.clickwatch.util.ILogger;
import de.hub.clickwatch.util.Throwables;

public class ExperimentRecorder {

	private ExperimentDescr experimentDescr;
	private ExperimentRecord experimentRecord;
	
	private int iniliazedNodeRecorders = 0;
	private int stoppedNodeRecorders = 0;
	private long start = -1;
	private long end = -1;
	private ExperimentStatistics stats = null;
	
	public static final String zipExtension = ".zip";
	@Inject ILogger logger;
	@Inject Provider<NodeRecorder> recorderProvider;	
	
	public synchronized void saveRecord(Node node, long time, NodeRecordDescr nodeRecord) {		
		Preconditions.checkArgument(time > 0);
		ExperimentNodeRecordTimeTable timeTable = experimentRecord.getNodeMap().get(node.getINetAddress());
		if (timeTable == null) {				
			timeTable = CWDataBaseFactory.eINSTANCE.createExperimentNodeRecordTimeTable();
			experimentRecord.getNodeMap().put(node.getINetAddress(), timeTable);
		}

		if (time == 0) {
			return; // does not needed to be saved, this can happen when the record is aborted right when a new record started
		}
		timeTable.getNodeMap().put(time, nodeRecord);			
	}
	
	private String getURIPrefix() {
		return experimentDescr.getDataBase().getStorageBaseFileString() 
				+ "/" + experimentDescr.getName(); 
		
	}
	
	public synchronized void record(ExperimentDescr experiment) {
		long start = System.nanoTime();
		this.experimentDescr = experiment;
		this.stats = experimentDescr.getStatistics();
		
		ResourceSet resourceSet = experimentDescr.eResource().getResourceSet();
		Resource experimentRecordResource = resourceSet.createResource(
				URI.createURI(
						getURIPrefix() 
						+ "_" + System.currentTimeMillis() 
						+ zipExtension));
		experimentRecord = CWDataBaseFactory.eINSTANCE.createExperimentRecord();
		experimentRecord.setName(experimentDescr.getName());
		experimentRecordResource.getContents().add(experimentRecord);
		experimentDescr.setRecord(experimentRecord);
		
		final List<NodeRecorder> nodeRecorders = new ArrayList<NodeRecorder>();
		for (Node recordedNode: experimentDescr.getNetwork().getNodes()) {
			NodeRecorder nodeRecorder = recorderProvider.get(); 
			nodeRecorder.setup(this, recordedNode, experimentDescr.getDataBase().getInMemory(), stats);
			nodeRecorders.add(nodeRecorder);
			if (stats != null) {
				stats.getNodesA().addValue(1);
			}
			new Thread(nodeRecorder).start();
		}
		
		try {
			wait(); // for all reported initialized, TODO timeout
			logger.log(ILogger.DEBUG, "All node recorder are initialized and recording.", null);
			wait(experimentDescr.getDuration());
			for (NodeRecorder recorder: nodeRecorders) {
				recorder.stop();
			}
			wait(); // for all reported stopped, // TODO timeout
			logger.log(ILogger.DEBUG, "All node recorder have stopped recording.", null);
		} catch(InterruptedException e) {
			Throwables.propagate(e);
		}
		
		
		if (stats != null) {
			stats.getTimeA().addValue(System.nanoTime() - start);
			logger.log(ILogger.DEBUG, stats.toString(), null);
		}
		
		experimentDescr.setStart(start);
		experimentDescr.setEnd(end);
		
		if (!experimentDescr.getDataBase().getInMemory()) {
			try {
				experimentRecordResource.save(XmlModelRepository.defaultLoadSaveOptions());
			} catch (IOException e) {
				Throwables.propagate(e);
			}
		}
	}
	
	public synchronized void reportInitialized() {
		iniliazedNodeRecorders++;
		if (iniliazedNodeRecorders == experimentDescr.getNetwork().getNodes().size()) {
			notify();
		}
	}
	
	public synchronized void reportStarted(long time) {
		if (start < 0 || time < start) {
			start = time;
		}
	}
	
	public synchronized void reportStopped(long time) {
		Preconditions.checkArgument(time > 0);
		stoppedNodeRecorders++;
		if (time > end) {
			end = time;
		}
		if (stoppedNodeRecorders == experimentDescr.getNetwork().getNodes().size()) {
			notify();
		}
	}

	public synchronized void addMetaData(Node nodeMetaData) {
		experimentRecord.getMetaData().add(nodeMetaData);
	}

	public synchronized void addResource(String unique, NodeRecord record) {
		String fileString = getURIPrefix() + "_" + unique+ zipExtension;
		URI uri = URI.createURI(fileString);
		Resource recordResource = experimentDescr.getDataBase().eResource().getResourceSet().createResource(uri);
		recordResource.getContents().add(record);
	}
}
