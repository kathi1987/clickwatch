package de.hub.clickwatch.recorder;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;

import com.google.common.base.Preconditions;
import com.google.inject.Inject;
import com.google.inject.Provider;

import de.hub.clickwatch.model.Node;
import de.hub.clickwatch.recoder.cwdatabase.CWDataBaseFactory;
import de.hub.clickwatch.recoder.cwdatabase.ExperimentDescr;
import de.hub.clickwatch.recoder.cwdatabase.ExperimentNodeRecordTimeTable;
import de.hub.clickwatch.recoder.cwdatabase.ExperimentRecord;
import de.hub.clickwatch.recoder.cwdatabase.ExperimentStatistics;
import de.hub.clickwatch.recoder.cwdatabase.NodeRecord;
import de.hub.clickwatch.recoder.cwdatabase.NodeRecordDescr;
import de.hub.clickwatch.util.ILogger;
import de.hub.clickwatch.util.Throwables;
import de.hub.emfxml.XmlModelRepository;

public class ExperimentRecorder {

	private ExperimentDescr experimentDescr;
	private ExperimentRecord experimentRecord;
	
	private int iniliazedNodeRecorders = 0;
	private int stoppedNodeRecorders = 0;
	private long start = -1;
	private long end = -1;
	private ExperimentStatistics stats = null;
	
	public static final String zipExtension = ".zip";
	@Inject private ILogger logger;
	@Inject private Provider<NodeRecorder> recorderProvider;	
	
	public synchronized void saveRecord(Node node, long start, long end, NodeRecordDescr nodeRecord) {		
		Preconditions.checkArgument(start > 0);
		
		ExperimentNodeRecordTimeTable timeTable = experimentRecord.getNodeMap().get(node.getINetAddress());
		if (timeTable == null) {				
			timeTable = CWDataBaseFactory.eINSTANCE.createExperimentNodeRecordTimeTable();
			experimentRecord.getNodeMap().put(node.getINetAddress(), timeTable);
		}

		if (start == 0) {
			return; // does not needed to be saved, this can happen when the record is aborted right when a new record started
		}
		timeTable.getNodeMap().put(start, nodeRecord);
		
		if (!experimentDescr.getDataBase().getInMemory()) {
			try {
				logger.log(ILogger.DEBUG, "saving experiment record and main database file", null);
				if (end > this.end) {
					this.end = end;
				}
				experimentRecord.eResource().save(XmlModelRepository.defaultLoadSaveOptions());
				experimentDescr.eResource().save(XmlModelRepository.defaultLoadSaveOptions());
			} catch (IOException e) {
				Throwables.propagate(e);
			}
		}
	}
	
	private String getURIPrefix() {
		return experimentDescr.getDataBase().getStorageBaseFileString() 
				+ "/.data/" + experimentDescr.getName().replace(" ", "_"); 
		
	}
	
	public synchronized void record(ExperimentDescr experiment) {
		long start = System.nanoTime();
		this.experimentDescr = experiment;
		this.stats = experimentDescr.getStatistics();
		if (stats != null) {
			stats.reset();
		} else {
			this.stats = CWDataBaseFactory.eINSTANCE.createExperimentStatistics();
			experimentDescr.setStatistics(stats);
		}
		
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
			wait(20000); // timeout after 20 second of initialization
			logger.log(ILogger.DEBUG, "All node recorder are initialized and recording.", null);
			wait(experimentDescr.getDuration());
			for (NodeRecorder recorder: nodeRecorders) {
				recorder.stop();
			}
			wait(60000); // for all reported stopped, timeout after 60 seconds
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
