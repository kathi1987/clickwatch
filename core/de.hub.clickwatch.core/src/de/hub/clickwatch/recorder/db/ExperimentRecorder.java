package de.hub.clickwatch.recorder.db;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.notify.impl.BasicNotifierImpl;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.XMLResource;

import com.google.common.base.Preconditions;
import com.google.inject.Inject;
import com.google.inject.name.Named;

import de.hub.clickwatch.ClickWatchModule;
import de.hub.clickwatch.XmlModelRepository;
import de.hub.clickwatch.connection.INodeConnection;
import de.hub.clickwatch.connection.INodeConnectionProvider;
import de.hub.clickwatch.connection.adapter.IHandlerAdapter;
import de.hub.clickwatch.connection.adapter.IMetaDataAdapter;
import de.hub.clickwatch.cwdatabase.CWDataBaseFactory;
import de.hub.clickwatch.cwdatabase.Experimiment;
import de.hub.clickwatch.cwdatabase.NodeRecord;
import de.hub.clickwatch.model.Handler;
import de.hub.clickwatch.model.Node;
import de.hub.clickwatch.util.ILogger;
import de.hub.clickwatch.util.Throwables;

public class ExperimentRecorder {

	@Inject private INodeConnectionProvider ncp;
	@Inject @Named(ClickWatchModule.L_EXPERIMENT_DEFAULT_RECORDER_UPDATE_INTERVAL) private long updateInterval;
	@Inject @Named(ClickWatchModule.I_HANDLER_PER_RECORD) private int handlerPerRecord;
	@Inject @Named(ClickWatchModule.B_RECORD_CHANGES_ONLY) private boolean recordChangesOnly;
	@Inject ILogger logger;
	
	private Experimiment recordedExperimiment;
	
	private long averageTimeAcc = 0;
	private long averageTimeCount = 0;
	
	private class NodeRecorder implements Runnable {
		private Node nodeToRecord;
		
		private boolean scheduledForStop = false;
		private boolean stopped = false;
		
		private int recordedHandlers = 0;
		private Resource recordResource = null;
		
		NodeRecorder(Node nodeToRecord) {
			this.nodeToRecord = nodeToRecord;
		}
		
		private void save() {
			if (recordResource != null) {
				try {
					Map<Object, Object> options = new HashMap<Object, Object>();
					options.putAll(XmlModelRepository.defaultLoadSaveOptions());
					options.put(Resource.OPTION_ZIP, Boolean.TRUE);
					recordResource.save(options);
				} catch (IOException e) {
					Throwables.propagate(e);
				}
				
				EcoreUtil.delete(recordResource.getContents().get(0));
			}
			logger.log(ILogger.DEBUG, "save record for node " + nodeToRecord.getINetAddress() + ".", null);
		}
		

		private NodeRecord initializeNextRecord() {
			NodeRecord result = CWDataBaseFactory.eINSTANCE.createNodeRecord();
			ResourceSet resourceSet = new ResourceSetImpl();
			URI uri = nextURI();
			recordResource = resourceSet.createResource(uri);
			recordResource.getContents().add(result);
			recordedExperimiment.getRecordURIs().add(uri.toFileString());
			return result;
		}
		
		private URI nextURI() {
			String fileString = recordedExperimiment.getStorageBaseFileStr();
			fileString += "/" + recordedExperimiment.getId() + "_" + nodeToRecord.getINetAddress() + "_" + recordedExperimiment.getRecordURIs().size() + ".cwdatabase";
			return URI.createFileURI(fileString);
		}

		public void run() {
			logger.log(ILogger.DEBUG, "started recording of " + nodeToRecord.getINetAddress(), null);
			
			INodeConnection connection = ncp.createConnection(nodeToRecord);
			connection.connect();
			Node actualNode = connection.getAdapter(IMetaDataAdapter.class).pullAllMetaData();
			recordedExperimiment.getMetaData().add(EcoreUtil.copy(actualNode));
			logger.log(ILogger.DEBUG, "pulled meta-data for " + nodeToRecord.getINetAddress(), null);
			
			IHandlerAdapter handlerAdapter = connection.getAdapter(IHandlerAdapter.class);
			handlerAdapter.configure(actualNode.getAllHandlers());
			
			NodeRecord record = initializeNextRecord();
			Map<String, Handler> keyHandlers = new HashMap<String, Handler>();
			boolean recordKey = true;;
			
			int i = 0;
			while (!scheduledForStop) {
				long time = System.nanoTime();
				
				if (recordKey) {
					for (Handler handler: keyHandlers.values()) {
						Handler keyHandlerCopy = EcoreUtil.copy(handler);
						record.getRecords().add(keyHandlerCopy);
						record.getKey().add(keyHandlerCopy);
					}
					recordKey = false;
				}
				
				for(Handler handler: handlerAdapter.pullHandler()) {
					Handler oldHandler = actualNode.getHandler(handler.getQualifiedName());
					if (oldHandler == null) {
						Preconditions.checkState(false, "pulled a handler that was not in the nodes meta-data");
					}

					if (!recordChangesOnly || recordKey || oldHandler.getValue() == null || 
							!oldHandler.getValue().equals(handler.getValue())) {
						oldHandler.setValue(handler.getValue());
						Handler recordedCopy = EcoreUtil.copy(handler);
						record.getRecords().add(recordedCopy);
						String qualifiedName = recordedCopy.getQualifiedName();
						keyHandlers.put(qualifiedName, recordedCopy);
						recordedHandlers++;
					}
					EcoreUtil.delete(handler);
				}
				
				if (recordedHandlers > handlerPerRecord) {
					save();
					record = initializeNextRecord();
					recordedHandlers = 0;
					recordKey = true;
				}
				
				averageTimeAcc += System.nanoTime() - time;
				averageTimeCount++;
				
				try {
					Thread.sleep(recordedExperimiment.getConfiguration().getUpdateIntervall());
				} catch (InterruptedException e) {
					Throwables.propagate(e);
				}

				i++;
				if (i % 100 == 0) {
					logger.log(ILogger.DEBUG, "pulled handler for " + nodeToRecord.getINetAddress() + " for the " + i + "th time.", null);
				}
			}
			
			save();
			
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
	
	public void record(Experimiment experiment, long runtime) {
		this.recordedExperimiment = experiment;
		final List<NodeRecorder> nodeRecorders = new ArrayList<ExperimentRecorder.NodeRecorder>();
		for (Node recordedNode: recordedExperimiment.getConfiguration().getNodes()) {
			NodeRecorder nodeRecorder = new NodeRecorder(recordedNode);
			nodeRecorders.add(nodeRecorder);
			new Thread(nodeRecorder).start();
		}

		try {
			Thread.sleep(runtime);
		} catch (InterruptedException e) {
			Throwables.propagate(e);
		}
		
		for (NodeRecorder recorder: nodeRecorders) {
			recorder.scheduledForStop = true;
		}
		
		while(isRunning(nodeRecorders)) {
			try {
				Thread.sleep(recordedExperimiment.getConfiguration().getUpdateIntervall());
			} catch (InterruptedException e) {
				Throwables.propagate(e);
			}
		}
		
		logger.log(ILogger.DEBUG, "average time to pull and store a node update " + averageTimeAcc/averageTimeCount, null);
		logger.log(ILogger.DEBUG, "nodes recorded " + averageTimeCount, null);
	}
}
