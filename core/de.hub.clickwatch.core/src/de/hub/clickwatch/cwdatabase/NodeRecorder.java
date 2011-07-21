package de.hub.clickwatch.cwdatabase;

import java.io.File;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.util.EcoreUtil;

import com.google.common.base.Preconditions;
import com.google.inject.Inject;
import com.google.inject.name.Named;

import de.hub.clickwatch.XmlModelRepository;
import de.hub.clickwatch.connection.INodeConnection;
import de.hub.clickwatch.connection.INodeConnectionProvider;
import de.hub.clickwatch.connection.adapter.IHandlerAdapter;
import de.hub.clickwatch.connection.adapter.IMetaDataAdapter;
import de.hub.clickwatch.connection.adapter.IValueAdapter;
import de.hub.clickwatch.model.Handler;
import de.hub.clickwatch.model.Network;
import de.hub.clickwatch.model.Node;
import de.hub.clickwatch.util.ILogger;
import de.hub.clickwatch.util.Throwables;

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
	private IHandlerAdapter handlerAdapter = null;
	private long updateInterval = -1;
	private boolean isRecording = true;
	
	@Inject private ILogger logger;
	@Inject private INodeConnectionProvider ncp;
	
	@Inject @Named(CWDataBaseModule.L_DEFAULT_UPDATE_INTERVAL_PROPERTY) private long defaultUpdateInterval;
	@Inject @Named(CWDataBaseModule.I_HANDLER_PER_RECORD_PROPERTY) private int handlerPerRecord;
	@Inject @Named(CWDataBaseModule.B_RECORD_CHANGES_ONLY_PROPERTY) private boolean recordChangesOnly;
	@Inject @Named(CWDataBaseModule.DB_VALUE_ADAPTER_PROPERTY) private IValueAdapter valueAdapter;

	private void initializeRecorder() {
		logger.log(ILogger.DEBUG, "started recording of " + configuration.getINetAddress(), null);
		
		INodeConnection connection = ncp.createConnection(configuration);
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
			boolean hasChanged = key == null || (valueAdapter.valuesEqual(key, handler)); 
			keyMap.put(qualifiedName, handler);
			
			if (!recordChangesOnly || hasChanged) {
				Preconditions.checkState(handler.getTimestamp() > 0);
				record.getRecords().add(handler);
				recordedHandler++;
			} 
		}
		if (stats != null) {
			stats.getHandlersPulledS().addValue(handlersPulled.size());
			stats.getTimeS().addValue(System.nanoTime() - start);
		}
		
		return recordedHandler;
	}
	
	private void initializeRecord() {
		record = CWDataBaseFactory.eINSTANCE.createNodeRecord();
		parent.addResource(configuration.getINetAddress() + "_" + System.nanoTime(), record);
		
		for (Handler metaDataHandler: metaData.getAllHandlers()) {
			Handler keyHander = keyMap.get(metaDataHandler.getQualifiedName());
			if (keyHander != null) {
				record.getRecords().add(keyHander);
			}
		}
	}
	
	private void saveRecord() {
		if (record.eResource() != null) {
			NodeRecordDescr recordDescr = CWDataBaseFactory.eINSTANCE.createNodeRecordDescr();
			recordDescr.setRecord(record);
			
			parent.saveRecord(configuration, record.getStart(), recordDescr);
			
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
		while(isRecording) {
			if (needRecordInitialization) {
				initializeRecord();
				needRecordInitialization = false;
			}
			int recordedHandlerS = pullAndRecordHandler();
			
			if (samples % 100 == 0) {
				logger.log(ILogger.DEBUG, "Recording " + samples + "th sample for " + configuration.getINetAddress(), null);
			}
			
			recordedHandlerR += recordedHandlerS;
			recordedHandlerN += recordedHandlerS;
			samples++;
			samplesR++;
			
			if (recordedHandlerR > handlerPerRecord) {
				saveRecord();		
				needRecordInitialization = true;
				if (stats != null) {
					stats.getHandlersR().addValue(recordedHandlerR);
					stats.getSamplesR().addValue(samplesR);
				}
				recordedHandlerR = 0;
				samplesR = 0;
			}	
			
			waitForUpdateInterval();
		}
		
		if (stats != null) {
			stats.getHandlersN().addValue(recordedHandlerN);
			stats.getSamplesN().addValue(samples);
			stats.getTimeN().addValue(System.nanoTime() - start);
		}
		saveRecord();
		if (stats != null) {
			stats.getHandlersR().addValue(recordedHandlerR);
			stats.getSamplesR().addValue(samplesR);
		}
		parent.reportStopped(record.getEnd());
	}
	
	private static Runtime runtime = Runtime.getRuntime();
	private static NumberFormat memFormat = new DecimalFormat("#00,000,000,000,000");
	private static NumberFormat updatesFormat = new DecimalFormat("#00,000,000");
	
	public static void report(String msg, long run, long reportOnEach) {
		if (run % reportOnEach == 0) {
			runtime.gc();
			System.out.println(msg + " updates run: " + updatesFormat.format(run) + "; memory-usage: " + 
					memFormat.format(runtime.totalMemory() - runtime.freeMemory()) +
					"; heap-size: " + memFormat.format(runtime.totalMemory()));
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
