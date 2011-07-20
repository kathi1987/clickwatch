package de.hub.clickwatch.cwdatabase;

import java.util.Map.Entry;

import org.eclipse.emf.ecore.util.EcoreUtil;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.google.inject.name.Named;

import de.hub.clickwatch.ClickWatchModule;
import de.hub.clickwatch.connection.adapter.IValueAdapter;
import de.hub.clickwatch.model.Handler;
import de.hub.clickwatch.model.Node;
import de.hub.clickwatch.util.ILogger;

@Singleton
public class DataBaseUtil {

	@Inject private IValueAdapter valueAdapter;
	@Inject @Named(ClickWatchModule.DB_VALUE_ADAPTER) private IValueAdapter dbValueAdapter;
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
		
		NodeRecord nodeRecord = null;
		ExperimentNodeRecordTimeTable experimentNodeRecordTimeTable = experiment.getRecord().getNodeMap().get(node);
		loop: for (Entry<Long, NodeRecordDescr> entry: experimentNodeRecordTimeTable.getNodeMap()) {
			if (entry.getKey() < time) {
				nodeRecord = entry.getValue().getRecord();
				break loop;
			}
		}
		if (nodeRecord == null) {
			// time is newer or older then experiment, use the last record
			nodeRecord = experimentNodeRecordTimeTable.getNodeMap().get(experimentNodeRecordTimeTable.getNodeMap().size() - 1).getValue().getRecord();
		}
		
		loop: for (Handler handler: nodeRecord.getRecords()) {
			if (handler.getTimestamp() < time) {
				String plainRealValue = dbValueAdapter.getPlainRealValue(handler);
				Handler handlerTimeCopy = result.getHandler(handler.getQualifiedName());
				valueAdapter.setModelValue(handlerTimeCopy, plainRealValue);
				if (handler.getTimestamp() == 0) {
					logger.log(ILogger.WARNING, "empty timestamp", null);
				}
				handlerTimeCopy.setTimestamp(handler.getTimestamp());
			} else {
				continue loop;				
			}
		}
		
		return result;
	}
}
