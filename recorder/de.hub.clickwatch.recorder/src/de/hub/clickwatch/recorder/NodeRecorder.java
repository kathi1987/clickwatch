package de.hub.clickwatch.recorder;

import java.io.File;
import java.io.IOException;
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
import org.eclipse.emf.ecore.util.EcoreUtil;

import com.google.common.base.Preconditions;
import com.google.inject.Inject;
import com.google.inject.name.Named;

import de.hub.clickwatch.connection.INodeConnection;
import de.hub.clickwatch.connection.INodeConnectionProvider;
import de.hub.clickwatch.connection.adapter.IHandlerAdapter;
import de.hub.clickwatch.connection.adapter.IMetaDataAdapter;
import de.hub.clickwatch.connection.adapter.IValueAdapter;
import de.hub.clickwatch.model.Handler;
import de.hub.clickwatch.model.Network;
import de.hub.clickwatch.model.Node;
import de.hub.clickwatch.recoder.cwdatabase.CWDataBaseFactory;
import de.hub.clickwatch.recoder.cwdatabase.ExperimentStatistics;
import de.hub.clickwatch.recoder.cwdatabase.NodeRecord;
import de.hub.clickwatch.recoder.cwdatabase.NodeRecordDescr;
import de.hub.clickwatch.util.ILogger;
import de.hub.clickwatch.util.Throwables;
import de.hub.emfxml.XmlModelRepository;

public class NodeRecorder implements Runnable {
	
	private ExperimentRecorder parent;
	private Node configuration;
	private boolean inMemory;
	private ExperimentStatistics stats;	

	public void setup(ExperimentRecorder parent, Node configuration,
			boolean inMemory, ExperimentStatistics stats) {
		this.parent = parent;
		this.configuration = configuration;
		this.inMemory = inMemory;
		this.stats = stats;
	}

	private Node metaData;
	private NodeRecord record;
	private Map<String, Handler> keyMap = new HashMap<String, Handler>();
	private INodeConnection connection = null;
	private IHandlerAdapter handlerAdapter = null;
	private long updateInterval = -1;
	private boolean isRecording = true;
	
	@Inject private ILogger logger;
	@Inject private INodeConnectionProvider ncp;
	
	@Inject @Named(CWRecorderModule.L_DEFAULT_UPDATE_INTERVAL_PROPERTY) private long defaultUpdateInterval;
	@Inject @Named(CWRecorderModule.I_HANDLER_PER_RECORD_PROPERTY) private int handlerPerRecord;
	@Inject @Named(CWRecorderModule.B_RECORD_CHANGES_ONLY_PROPERTY) private boolean recordChangesOnly;
	@Inject @Named(CWRecorderModule.DB_VALUE_ADAPTER_PROPERTY) private IValueAdapter valueAdapter;
	
	private List<Double> handlerPulledSValues = new ArrayList<Double>();
	private List<Double> timeSValues = new ArrayList<Double>();

	private void initializeRecorder() {
		logger.log(ILogger.DEBUG, "started recording of " + configuration.getINetAddress(), null);
		
		if (connection == null) {
			connection = ncp.createConnection(configuration);
		}
		connection.connect();
		
		metaData = connection.getAdapter(IMetaDataAdapter.class).pullAllMetaData();
		Network network = (Network)configuration.eContainer();
		if (network != null) {
			metaData.filter(network.getElementFilter(), network.getHandlerFilter());
		}
		updateInterval = network.getUpdateIntervall();
		if (updateInterval < 0) {
			updateInterval = defaultUpdateInterval;
		}
		
		metaData.setINetAddress(configuration.getINetAddress());
		parent.addMetaData(EcoreUtil.copy(metaData));
		logger.log(ILogger.DEBUG, "pulled meta-data for " + configuration.getINetAddress(), null);
		
		handlerAdapter = connection.getAdapter(IHandlerAdapter.class);
		EList<Handler> allHandlers = metaData.getAllHandlers();
		handlerAdapter.configure(allHandlers);
	}
	
	private void recover() {
		try {
			EcoreUtil.delete(metaData);
			connection.disconnect();
		} catch (Exception e) {
			logger.log(ILogger.ERROR, "could not disconnect during recovery", e);
		} finally {
			initializeRecorder();
		}
	}
	
	private void reportHandlerPulled(long time) {
		Preconditions.checkArgument(time > 0);
		long start = record.getStart();
		if (start <= 0 || start > time) {
			record.setStart(time);
			parent.reportStarted(time);
		}
		
		long end = record.getEnd();
		if (end <= 0 || end < time) {
			record.setEnd(time);
		}
	}
	
	private int pullAndRecordHandler() {
		long start = System.nanoTime();
		int recordedHandler = 0;
		Collection<Handler> handlersPulled = handlerAdapter.pullHandler();
		for(Handler handler: handlersPulled) {
			reportHandlerPulled(handler.getTimestamp());
			
			String qualifiedName = handler.getQualifiedName();
			Handler key = keyMap.get(qualifiedName);
			boolean hasChanged = key == null || !(valueAdapter.valuesEquals(key, handler)); 
			keyMap.put(qualifiedName, handler);
			
			if (!recordChangesOnly || hasChanged) {
				Preconditions.checkState(handler.getTimestamp() > 0);
				record.getRecords().add(handler);
				recordedHandler++;
			}
		}
		if (stats != null) {
			handlerPulledSValues.add((double)handlersPulled.size());
			timeSValues.add((double)System.nanoTime() - start);
		}
		
		return recordedHandler;
	}
	
	private void initializeRecord() {
		record = CWDataBaseFactory.eINSTANCE.createNodeRecord();
		parent.addResource(configuration.getINetAddress() + "_" + System.currentTimeMillis(), record);
		
		for (Handler metaDataHandler: metaData.getAllHandlers()) {
			Handler keyHander = keyMap.get(metaDataHandler.getQualifiedName());
			if (keyHander != null) {
				record.getRecords().add(keyHander);
			}
		}
	}
	
	private void saveRecord() {
		if (record != null && record.eResource() != null) {
			NodeRecordDescr recordDescr = CWDataBaseFactory.eINSTANCE.createNodeRecordDescr();
			recordDescr.setRecord(record);
			
			parent.saveRecord(configuration, record.getStart(), record.getEnd(), recordDescr);
			
			if (!inMemory) {
				try {
					record.eResource().save(XmlModelRepository.defaultLoadSaveOptions());					
					logger.log(ILogger.DEBUG, "saved record for node " + configuration.getINetAddress() + " in "
							+ record.eResource().getURI().toFileString() + ".", null);
				} catch (IOException e) {
					Throwables.propagate(e);
				}
								
				if (stats != null) {					
					URI uri = record.eResource().getURI();
					stats.getRecordSize().addValue(new File(uri.toFileString()).length());					
				}
				
				record.getRecords().clear();
				record.eResource().unload();
				
				report("mem-leak?", 1, 1);
			}
		}
	}
	
	@Override
	public void run() {
		initializeRecorder();
		boolean needRecordInitialization = true;
		parent.reportInitialized();
		
		int recordedHandlerR = 0;
		int recordedHandlerN = 0;
		int samples = 0;
		int samplesR = 0;
		long start = System.nanoTime();
		
		List<Double> handlersRValues = new ArrayList<Double>();
		List<Double> samplesRValues = new ArrayList<Double>();
		
		boolean isRecovering = false;
		int recoveringTries = 0;
		loop: while(isRecording) {
			if (needRecordInitialization) {
				initializeRecord();
				needRecordInitialization = false;
			}
			if (isRecovering && recoveringTries < 5) {
				try {
					recover();
				} catch(Exception e) {
					logger.log(ILogger.ERROR, "could not recover for the " + ++recoveringTries + "th time for node " 
							+ configuration.getINetAddress(), e);
				}
				if (recoveringTries == 5) {
					logger.log(ILogger.ERROR, "could not recover, tried 5 times, give up on node " 
							+ configuration.getINetAddress(), null);
					break loop;
				}
			}
			int recordedHandlerS = 0;
			try {
				recordedHandlerS = pullAndRecordHandler();
			} catch (Exception e) {
				logger.log(ILogger.ERROR, "exception during pulling handlers in node " 
						+ configuration.getINetAddress() 
						+ ", I try to revover.", e);
				try {
					recover();
				} catch (Exception ee) {
					logger.log(ILogger.ERROR, "could not recover immediatly for node " 
							+ configuration.getINetAddress()
							+ ", I will retry for 5 times with update interval in between", ee);	
					isRecovering = true;
				}
			}
			
			if (samples % 100 == 0) {
				logger.log(ILogger.DEBUG, "Recording " + samples + "th sample for " 
						+ configuration.getINetAddress(), null);
			}
			
			recordedHandlerR += recordedHandlerS;
			recordedHandlerN += recordedHandlerS;
			samples++;
			samplesR++;
			
			if (recordedHandlerR > handlerPerRecord) {
				saveRecord();		
				needRecordInitialization = true;	
				handlersRValues.add((double)recordedHandlerR);
				samplesRValues.add((double)samplesR);
				recordedHandlerR = 0;
				samplesR = 0;
			}	
			
			waitForUpdateInterval();
		}
		saveRecord();
		handlersRValues.add((double)recordedHandlerR);
		samplesRValues.add((double)samplesR);
		
		if (stats != null) {
			stats.getHandlersN().addValue(recordedHandlerN);
			stats.getSamplesN().addValue(samples);
			stats.getTimeN().addValue(System.nanoTime() - start);
			addAll(stats.getHandlersR(), handlersRValues);
			addAll(stats.getSamplesR(), samplesRValues);
			addAll(stats.getHandlersPulledS(), handlerPulledSValues);
			addAll(stats.getTimeS(), timeSValues);
		}
		
		handlerAdapter.deconfigure();
		parent.reportStopped(record.getEnd());
	}
	
	private void addAll(SummaryStatistics stat, Collection<Double> values) {
		for(Double d: values) {
			stat.addValue(d);
		}
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
	
	public synchronized void waitForUpdateInterval() {
		if (updateInterval > 0) {
			try {
				wait(updateInterval); // wait for being stopped
			} catch(InterruptedException e) {
				Throwables.propagate(e);
			}
		}
	}
	
	public synchronized void stop() {
		isRecording = false;
		notify(); // notify the potentially waiting node recorder
	}
}
