package de.hub.clickwatch.recorder.database;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.emf.ecore.util.EcoreUtil;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.google.inject.name.Named;

import de.hub.clickwatch.connection.adapter.IValueAdapter;
import de.hub.clickwatch.model.Handler;
import de.hub.clickwatch.model.Node;
import de.hub.clickwatch.recoder.cwdatabase.ExperimentDescr;
import de.hub.clickwatch.recoder.cwdatabase.ExperimentNodeRecordTimeTable;
import de.hub.clickwatch.recoder.cwdatabase.NodeRecord;
import de.hub.clickwatch.recoder.cwdatabase.NodeRecordDescr;
import de.hub.clickwatch.recorder.CWRecorderModule;
import de.hub.clickwatch.util.ILogger;

@Singleton
public class DataBaseUtil {

	@Inject private IValueAdapter valueAdapter;
	@Inject @Named(CWRecorderModule.DB_VALUE_ADAPTER_PROPERTY) private IValueAdapter dbValueAdapter;
	@Inject private ILogger logger;
	
	public Node getNode(ExperimentDescr experiment, String node, long time) {
		Node result = null;
		for (Node metaData: experiment.getRecord().getMetaData()) {
			if (metaData.getINetAddress().equals(node)) {
				result = EcoreUtil.copy(metaData);
			}
		}
		
		if (result == null) {
			// node was not recorded in this experiment
			return null;
		}
		
		
		NodeRecordDescr nodeDescr = null;
		ExperimentNodeRecordTimeTable experimentNodeRecordTimeTable = experiment.getRecord().getNodeMap().get(node);
		loop: for (Entry<Long, NodeRecordDescr> entry: experimentNodeRecordTimeTable.getNodeMap()) {
			if (entry.getKey() <= time) {
				nodeDescr = entry.getValue();	
			} else {
				break loop;
			}
		}
		
		if (nodeDescr == null) {
			// given time lies before the experiment
			return result;
		}
		NodeRecord nodeRecord = nodeDescr.getRecord();
		
		Map<String, Handler> handlerMap = new HashMap<String, Handler>();
		for (Handler handler: nodeRecord.getRecords()) {
			if (handler.getTimestamp() <= time) {
				handlerMap.put(handler.getQualifiedName(), handler);
			}
		}
		
		for (Handler handler: handlerMap.values()) {
			String plainRealValue = dbValueAdapter.getPlainRealValue(handler);
			Handler handlerTimeCopy = result.getHandler(handler.getQualifiedName());
			valueAdapter.setModelValue(handlerTimeCopy, plainRealValue);
			if (handler.getTimestamp() == 0) {
				logger.log(ILogger.WARNING, "empty timestamp", null);
			}
			handlerTimeCopy.setTimestamp(handler.getTimestamp());
		}

		if (nodeRecord.eResource() != null) {
			nodeRecord.eResource().unload();	
		}
		return result;
	}
}
