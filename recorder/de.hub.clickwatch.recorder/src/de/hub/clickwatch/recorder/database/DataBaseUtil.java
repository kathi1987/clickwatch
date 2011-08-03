package de.hub.clickwatch.recorder.database;

import java.util.Iterator;

import org.eclipse.emf.ecore.util.EcoreUtil;

import com.google.common.base.Preconditions;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.google.inject.name.Named;

import de.hub.clickwatch.connection.adapter.IValueAdapter;
import de.hub.clickwatch.model.Handler;
import de.hub.clickwatch.model.Node;
import de.hub.clickwatch.recoder.cwdatabase.ExperimentDescr;
import de.hub.clickwatch.recorder.CWRecorderModule;
import de.hub.clickwatch.recorder.database.hbase.HBaseDataBaseAdapter;
import de.hub.clickwatch.util.ILogger;

@Singleton
public class DataBaseUtil {

	@Inject private IDataBaseRetrieveAdapter dataBaseAdapter;
	@Inject private IValueAdapter valueAdapter;
	@Inject @Named(CWRecorderModule.DB_VALUE_ADAPTER_PROPERTY) private IValueAdapter dbValueAdapter;
	@Inject private ILogger logger;
	
	public <T extends Handler> Iterable<T> getHandler(ExperimentDescr experiment, String nodeId, Class<T> handlerClass) {
		return null;
	}
	
	public Iterator<Handler> getHandlerIterator(ExperimentDescr experiment, String node, String handler) {
		return getHandlerIterator(experiment, node, handler, experiment.getStart(), experiment.getEnd());
	}
	
	public Iterator<Handler> getHandlerIterator(ExperimentDescr experiment, String node, String handler, long start, long end) {
		dataBaseAdapter.initialize(experiment);
		final Iterator<Handler> dbIterator = ((HBaseDataBaseAdapter)dataBaseAdapter).retrieve(node, handler, start, end);
		return new Iterator<Handler>() {
			@Override
			public boolean hasNext() {
				return dbIterator.hasNext();
			}

			@Override
			public Handler next() {
				Handler dbHandler = dbIterator.next();
				if (dbHandler == null) {
					return null;
				} else {
					return valueAdapter.create(dbHandler, dbValueAdapter);
				}
			}

			@Override
			public void remove() {
				dbIterator.remove();
			}
		};
	}
	
	public Handler getHandler(ExperimentDescr experiment, String node, String handler, long time) {
		dataBaseAdapter.initialize(experiment);
		dataBaseAdapter.set(node, time);
		Handler dbHandler = dataBaseAdapter.retrieve(handler);
		if (dbHandler == null) {
			return null;
		}
		return valueAdapter.create(dbHandler, dbValueAdapter);
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
			Handler dbHandler = dataBaseAdapter.retrieve(handlerTimeCopy.getQualifiedName());
			if (dbHandler != null) {
				Preconditions.checkState(dbHandler.getTimestamp() <= time);
				if (dbHandler.getTimestamp() == 0) {
					logger.log(ILogger.WARNING, "empty timestamp", null);
				}
				valueAdapter.update(handlerTimeCopy, dbHandler, dbValueAdapter);
			} else {
				handlerTimeCopy.setTimestamp(0);
				valueAdapter.clearValue(handlerTimeCopy);
			}
		}

		return result;
	}
}
