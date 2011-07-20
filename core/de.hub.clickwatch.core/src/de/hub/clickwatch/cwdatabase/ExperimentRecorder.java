package de.hub.clickwatch.cwdatabase;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.math.stat.descriptive.SummaryStatistics;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;

import com.google.common.base.Preconditions;
import com.google.inject.Inject;
import com.google.inject.name.Named;

import de.hub.clickwatch.ClickWatchModule;
import de.hub.clickwatch.XmlModelRepository;
import de.hub.clickwatch.connection.INodeConnection;
import de.hub.clickwatch.connection.INodeConnectionProvider;
import de.hub.clickwatch.connection.adapter.IHandlerAdapter;
import de.hub.clickwatch.connection.adapter.IMetaDataAdapter;
import de.hub.clickwatch.model.Handler;
import de.hub.clickwatch.model.Network;
import de.hub.clickwatch.model.Node;
import de.hub.clickwatch.util.ILogger;
import de.hub.clickwatch.util.Throwables;

public class ExperimentRecorder {

	public static final String zipExtension = ".zip";
	
	@Inject private INodeConnectionProvider ncp;
	@Inject @Named(ClickWatchModule.L_EXPERIMENT_DEFAULT_RECORDER_UPDATE_INTERVAL) private long defaultUpdateInterval;
	@Inject @Named(ClickWatchModule.I_HANDLER_PER_RECORD) private int handlerPerRecord;
	@Inject @Named(ClickWatchModule.B_RECORD_CHANGES_ONLY) private boolean recordChangesOnly;
	@Inject ILogger logger;
	
	private ExperimentDescr experimentDescr;
	private ExperimentRecord experimentRecord;
	
	private long startTime = 0;
	private long latestTime = 0;
	
	private ExperimentRecorderStats stats = new ExperimentRecorderStats();
		
	public class ExperimentRecorderStats {	
		private static final String pattern = "###,###,###,###.00";
		public SummaryStatistics nodes = new SummaryStatistics();
		public SummaryStatistics nodesRecorded = new SummaryStatistics();
		public SummaryStatistics handlersRecorded = new SummaryStatistics();
		public SummaryStatistics handlersWithKeysRecorded = new SummaryStatistics();
		public SummaryStatistics handlers = new SummaryStatistics();		
		public SummaryStatistics handlersPerNode = new SummaryStatistics();
		public SummaryStatistics recordSize = new SummaryStatistics();
		public SummaryStatistics timePerNodeRecorder = new SummaryStatistics();
		public SummaryStatistics timePerNode = new SummaryStatistics();
		public SummaryStatistics timePerNodePerNodeRecorder = new SummaryStatistics();
		public SummaryStatistics timePerNodePerExperiment = new SummaryStatistics();
		
		String space =          "                           ";
		long serverNodeRecordingStart = 0;
		
		private NumberFormat format = new DecimalFormat(pattern);
		private String format(double number) {
			String result = format.format(number);
			String space = "";
			for (int i = result.length(); i < pattern.length(); i++) {
				space += " ";
			}
			return space + result;
		}
		
		@Override
		public String toString() {
			StringBuffer result = new StringBuffer();
			for (Field field: getClass().getFields()) {
				if (field.getType().isAssignableFrom(SummaryStatistics.class)) {
					SummaryStatistics ss = null;
					try {
						ss = (SummaryStatistics)field.get(this);
					} catch (Exception e) {
						Throwables.propagate(e);
					}
					result.append("" + field.getName() + ":" + space.substring(field.getName().length()) 
							+ format(ss.getSum()) + " (sum)," 
							+ format(ss.getMean()) + " (avr),"  
							+ format(ss.getMax()) + " (max)," 
							+ format(ss.getStandardDeviation()) + " (dev)," 
							+ format(ss.getN()) + "(N)\n");
				}
			}

			return "Statistics:\n" + result.toString();
		} 
	}
	
	private class NodeRecorder implements Runnable {
		private Node nodeToRecord;
		
		private boolean scheduledForStop = false;
		private boolean stopped = false;
		
		private int recordedHandlers = 0;
		
		NodeRecorder(Node nodeToRecord) {
			this.nodeToRecord = nodeToRecord;
		}
		
		private void save(NodeRecord nodeRecord) {
			if (nodeRecord.eResource() != null) {
				NodeRecordDescr nodeRecordDescr = CWDataBaseFactory.eINSTANCE.createNodeRecordDescr();
				nodeRecordDescr.setRecord(nodeRecord);
				
				synchronized (ExperimentRecorder.this) {				
					ExperimentNodeRecordTimeTable timeTable = experimentRecord.getNodeMap().get(nodeToRecord.getINetAddress());
					if (timeTable == null) {				
						timeTable = CWDataBaseFactory.eINSTANCE.createExperimentNodeRecordTimeTable();
						experimentRecord.getNodeMap().put(nodeToRecord.getINetAddress(), timeTable);
					}
					long start = nodeRecord.getStart();
					if (startTime == 0) {
						startTime = start;
					}
					if (start == 0) {
						return; // does not needed to be saved, this can happen when the record is aborted right when a new record started
					}
					timeTable.getNodeMap().put(start, nodeRecordDescr);
				}
				
				try {
					nodeRecord.eResource().save(XmlModelRepository.defaultLoadSaveOptions());
				} catch (IOException e) {
					Throwables.propagate(e);
				}
				
				nodeRecord.getKey().clear();
				nodeRecord.getRecords().clear();
				if (stats != null) {
					URI uri = nodeRecord.eResource().getURI();
					stats.recordSize.addValue(new File(uri.toFileString()).length());	
				}				
				nodeRecord.eResource().unload();
			}
			logger.log(ILogger.DEBUG, "save record for node " + nodeToRecord.getINetAddress() + ".", null);
		}
		

		private NodeRecord initializeNextRecord() {
			NodeRecord result = CWDataBaseFactory.eINSTANCE.createNodeRecord();
			ResourceSet resourceSet = experimentDescr.getDataBase().eResource().getResourceSet();
			URI uri = nextURI();
			Resource recordResource = resourceSet.createResource(uri);
			recordResource.getContents().add(result);
			
			return result;
		}
		
		private URI nextURI() {
			String fileString = experimentDescr.getDataBase().getStorageBaseFileString();
			fileString += "/" + experimentRecord.getName() + "_" + nodeToRecord.getINetAddress() + "_" + System.nanoTime() + zipExtension;
			return URI.createURI(fileString);
		}

		public void run() {
			logger.log(ILogger.DEBUG, "started recording of " + nodeToRecord.getINetAddress(), null);
			if (stats != null) {
				stats.nodes.addValue(1);
			}
			
			INodeConnection connection = ncp.createConnection(nodeToRecord);
			connection.connect();
			
			Node actualNode = connection.getAdapter(IMetaDataAdapter.class).pullAllMetaData();
			Network network = (Network)nodeToRecord.eContainer();
			if (network != null) {
				actualNode.filter(network.getElementFilter(), network.getHandlerFilter());
			}
			
			actualNode.setINetAddress(nodeToRecord.getINetAddress());
			experimentRecord.getMetaData().add(EcoreUtil.copy(actualNode));
			logger.log(ILogger.DEBUG, "pulled meta-data for " + nodeToRecord.getINetAddress(), null);
			
			IHandlerAdapter handlerAdapter = connection.getAdapter(IHandlerAdapter.class);
			EList<Handler> allHandlers = actualNode.getAllHandlers();
			handlerAdapter.configure(allHandlers);
			if (stats != null) {
				stats.handlersPerNode.addValue(allHandlers.size());
				stats.serverNodeRecordingStart = System.nanoTime();
			}
			
			NodeRecord nodeRecord = initializeNextRecord();
			Map<String, Handler> keyHandlers = new HashMap<String, Handler>();
			
			boolean recordKey = true;
			boolean first = true;
			int recordedNodes = 0;
			while (!scheduledForStop) {
				long time = System.nanoTime();
				
				if (recordKey) {
					for (Handler metaDataHandler: allHandlers) {
						Handler keyHander = keyHandlers.get(metaDataHandler.getQualifiedName());
						if (keyHander != null) {
							Handler keyHandlerCopy = EcoreUtil.copy(keyHander);
							nodeRecord.getRecords().add(keyHandlerCopy);
							nodeRecord.getKey().add(keyHandlerCopy);
							if (stats != null) {
								stats.handlersWithKeysRecorded.addValue(1);
							}
						}
					}
					recordKey = false;
				}
				
				for(Handler handler: handlerAdapter.pullHandler()) {
					if (first) {
						first = false;
						long latestNodeTime = handlerAdapter.latestNodeTime();
						nodeRecord.setStart(latestNodeTime);
					}
					Handler oldHandler = actualNode.getHandler(handler.getQualifiedName());
					if (oldHandler == null) {
						Preconditions.checkState(false, "pulled a handler that was not in the nodes meta-data");
					}

					if (!recordChangesOnly || recordKey || oldHandler.getValue() == null || 
							!oldHandler.getValue().equals(handler.getValue())) {
						oldHandler.setValue(handler.getValue());
						nodeRecord.getRecords().add(handler);
						String qualifiedName = handler.getQualifiedName();
						keyHandlers.put(qualifiedName, EcoreUtil.copy(handler));
						recordedHandlers++;
						if (stats != null) {
							stats.handlersWithKeysRecorded.addValue(1);
							stats.handlersRecorded.addValue(1);
						}
					} 
					if (stats != null) {
						stats.handlers.addValue(1);
					}
					latestTime = handler.getTimestamp();
				}
				
				if (recordedHandlers > handlerPerRecord) {
					save(nodeRecord);	
					nodeRecord = initializeNextRecord();
					recordedHandlers = 0;
					recordKey = true;
					first = true;
				}
				
				if (stats != null) {
					stats.timePerNode.addValue((double)(System.nanoTime() - time));
				}
				
				try {
					long updateIntervall = experimentDescr.getNetwork().getUpdateIntervall();
					if (updateIntervall < 0) {
						updateIntervall = defaultUpdateInterval;
					}
					Thread.sleep(updateIntervall);
				} catch (InterruptedException e) {
					Throwables.propagate(e);
				}

				recordedNodes++;
				if (recordedNodes % 100 == 0) {
					logger.log(ILogger.DEBUG, "pulled handler for " + nodeToRecord.getINetAddress() + " for the " + recordedNodes + "th time.", null);
				}
			}
			
			save(nodeRecord);
			if (stats != null) {
				long time = System.nanoTime() - stats.serverNodeRecordingStart;
				stats.timePerNodeRecorder.addValue((double)time);
				stats.timePerNodePerNodeRecorder.addValue(time/recordedNodes);
				stats.nodesRecorded.addValue(recordedNodes);
			}
			stopped = true;
			logger.log(ILogger.DEBUG, "stopped recording of " + nodeToRecord.getINetAddress(), null);
		}

	}
	
	private boolean isRunning(Collection<NodeRecorder> recorders) {
		boolean allStopped = true;
		for(NodeRecorder recorder: recorders) {
			allStopped &= recorder.stopped;
		}
		return !allStopped;
	}
	
	public void record(ExperimentDescr experiment) {
		this.experimentDescr = experiment;
		
		ResourceSet resourceSet = experimentDescr.eResource().getResourceSet();
		Resource experimentRecordResource = resourceSet.createResource(
				URI.createURI(
						experimentDescr.getDataBase().getStorageBaseFileString() 
						+ "/" + experiment.getName() 
						+ "_" + System.currentTimeMillis() 
						+ zipExtension));
		experimentRecord = CWDataBaseFactory.eINSTANCE.createExperimentRecord();
		experimentRecord.setName(experimentDescr.getName());
		experimentRecordResource.getContents().add(experimentRecord);
		experimentDescr.setRecord(experimentRecord);
		
		final List<NodeRecorder> nodeRecorders = new ArrayList<ExperimentRecorder.NodeRecorder>();
		for (Node recordedNode: experimentDescr.getNetwork().getNodes()) {
			NodeRecorder nodeRecorder = new NodeRecorder(recordedNode);
			nodeRecorders.add(nodeRecorder);
			new Thread(nodeRecorder).start();
		}

		try {
			Thread.sleep(experiment.getDuration());
		} catch (InterruptedException e) {
			Throwables.propagate(e);
		}
		
		for (NodeRecorder recorder: nodeRecorders) {
			recorder.scheduledForStop = true;
		}
		
		while(isRunning(nodeRecorders)) {
			try {
				Thread.sleep(experimentDescr.getNetwork().getUpdateIntervall());
			} catch (InterruptedException e) {
				Throwables.propagate(e);
			}
		}
		
		if (stats != null) {
			stats.timePerNodePerExperiment.addValue(stats.timePerNodeRecorder.getMean()/stats.nodesRecorded.getSum());
			logger.log(ILogger.DEBUG, stats.toString(), null);
		}
		
		experimentDescr.setStart(startTime);
		experimentDescr.setEnd(latestTime);
		
		try {
			experimentRecordResource.save(XmlModelRepository.defaultLoadSaveOptions());
		} catch (IOException e) {
			Throwables.propagate(e);
		}
	}

	public ExperimentRecorderStats getStats() {
		return stats;
	}

	public void setStats(ExperimentRecorderStats stats) {
		this.stats = stats;
	}
}
