package de.hub.clickwatch.recorder.database;

import org.eclipse.emf.ecore.util.EcoreUtil;

import com.google.common.base.Preconditions;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.google.inject.name.Named;

import de.hub.clickwatch.connection.adapter.IValueAdapter;
import de.hub.clickwatch.model.ClickWatchModelFactory;
import de.hub.clickwatch.model.Handler;
import de.hub.clickwatch.model.Node;
import de.hub.clickwatch.recoder.cwdatabase.ExperimentDescr;
import de.hub.clickwatch.recorder.CWRecorderModule;
import de.hub.clickwatch.util.ILogger;

@Singleton
public class DataBaseUtil {

	@Inject private IDataBaseRetrieveAdapter dataBaseAdapter;
	@Inject private IValueAdapter valueAdapter;
	@Inject @Named(CWRecorderModule.DB_VALUE_ADAPTER_PROPERTY) private IValueAdapter dbValueAdapter;
	@Inject private ILogger logger;
	
	public Handler getHandler(ExperimentDescr experiment, String node, String handler, long time) {
		dataBaseAdapter.initialize(experiment);
		dataBaseAdapter.set(node, time);
		Handler dbHandler = dataBaseAdapter.retrieve(handler);
		Handler result = ClickWatchModelFactory.eINSTANCE.createHandler();
		result.setTimestamp(dbHandler.getTimestamp());
		if (dbValueAdapter.getClass().equals(valueAdapter.getClass())) {
			valueAdapter.moveValue(dbHandler, result);
		} else {
			String plainRealValue = dbValueAdapter.getPlainRealValue(dbHandler);
			valueAdapter.setModelValue(result, plainRealValue);
		}
		return result;
	}
	
	public Node getNode(ExperimentDescr experiment, String node, long time) {
		return getNode(experiment, node, null, null, time);
	}
	
	public Node getNode(ExperimentDescr experiment, String node, String elementFilter, String handlerFilter, long time) {
		dataBaseAdapter.initialize(experiment);
		
		Node result = null;
		for (Node metaData: experiment.getMetaData()) {
			if (metaData.getINetAddress().equals(node)) {
				result = EcoreUtil.copy(metaData);
			}
		}
		
		if (result == null) {
			// node was not recorded in this experiment
			return null;
		}
		
		if (elementFilter != null && handlerFilter != null) {
			result.filter(elementFilter, handlerFilter);
		}
		
		dataBaseAdapter.set(node, time);
		
		for (Handler handlerTimeCopy: result.getAllHandlers()) {
			Handler handler = dataBaseAdapter.retrieve(handlerTimeCopy.getQualifiedName());
			if (handler != null) {
				Preconditions.checkState(handler.getTimestamp() <= time);
				if (dbValueAdapter.getClass().equals(valueAdapter.getClass())) {
					valueAdapter.moveValue(handler, handlerTimeCopy);
				} else {
					String plainRealValue = dbValueAdapter.getPlainRealValue(handler);
					valueAdapter.setModelValue(handlerTimeCopy, plainRealValue);
				}
	
				if (handler.getTimestamp() == 0) {
					logger.log(ILogger.WARNING, "empty timestamp", null);
				}
				handlerTimeCopy.setTimestamp(handler.getTimestamp());
			} else {
				handlerTimeCopy.setTimestamp(0);
				valueAdapter.clearValue(handlerTimeCopy);
			}
		}

		return result;
	}
}
