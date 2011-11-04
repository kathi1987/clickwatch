package de.hub.clickwatch.recorder.database;

import java.util.Iterator;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.ecore.util.EcoreUtil;

import com.google.common.base.Preconditions;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.google.inject.name.Named;

import de.hub.clickwatch.connection.adapter.values.IValueAdapter;
import de.hub.clickwatch.model.Handler;
import de.hub.clickwatch.model.Node;
import de.hub.clickwatch.recorder.ClickWatchRecorderModule;
import de.hub.clickwatch.recorder.database.cwdatabase.Record;
import de.hub.clickwatch.recorder.database.hbase.HBaseDataBaseAdapter;
import de.hub.clickwatch.util.ILogger;

@Singleton
public class DataBaseUtil {

	@Inject private IDataBaseRetrieveAdapter dataBaseAdapter;
	@Inject private IValueAdapter valueAdapter;
	@Inject @Named(ClickWatchRecorderModule.DB_VALUE_ADAPTER_PROPERTY) private IValueAdapter dbValueAdapter;
	@Inject private ILogger logger;
	
	private static class DataBaseHandle {
		Record record;
		String nodeId;
		String handlerId;
		long start;
		long end;
	}
	
	public static DataBaseHandle createHandle(Record record, Node node, long time) {
		return createHandle(record, node.getINetAddress(), null, time, 0);
	}
	
	public static DataBaseHandle createHandle(Record record, String nodeId, long time) {
		return createHandle(record, nodeId, null, time, 0);
	}
	
	public static DataBaseHandle createHandle(Record record, Node node, Handler handler) {
		return createHandle(record, node.getINetAddress(), handler.getQualifiedName());
	}
	
	public static DataBaseHandle createHandle(Record record, String nodeId, String handlerId) {
		return createHandle(record, nodeId, handlerId, record.getStart(), record.getEnd());
	}
	
	public static DataBaseHandle createHandle(Record record, Node node, Handler handler, long time) {
		return createHandle(record, node.getINetAddress(), handler.getQualifiedName(), time, 0);
	}
	
	public static DataBaseHandle createHandle(Record record, String nodeId, String handlerId, long time) {
		return createHandle(record, nodeId, handlerId, time, 0);
	}
	
	public static DataBaseHandle createHandle(Record record, String nodeId, String handlerId, long start, long end) {
		DataBaseHandle result = new DataBaseHandle();
		result.record = record;
		result.nodeId = nodeId;
		result.handlerId = handlerId;
		result.start = start;
		result.end = end;
		return result;
	}
	
	public <T extends Handler> Iterable<T> getHandler(Record record, String nodeId, Class<T> handlerClass) {
		return null; // TODO
	}
	
	public Iterator<Handler> getHandlerIterator(DataBaseHandle h) {
		return getHandlerIterator(h, new NullProgressMonitor());
	}
	
	public Iterator<Handler> getHandlerIterator(final DataBaseHandle h, final IProgressMonitor monitor) {
		monitor.beginTask("Going throw the data base", 100);
		dataBaseAdapter.initialize(h.record);
		final Iterator<Handler> dbIterator = ((HBaseDataBaseAdapter)dataBaseAdapter).retrieve(h.nodeId, h.handlerId, h.start, h.end);
		final long duration = h.end - h.start;
		return new Iterator<Handler>() {
			int progress = 0;
			@Override
			public boolean hasNext() {
				boolean result = dbIterator.hasNext();
				if (!result) {
					monitor.done();
				}
				return result;
			}

			@Override
			public Handler next() {
				Handler dbHandler = dbIterator.next();
				if (dbHandler == null) {
					return null;
				} else {
					long time = dbHandler.getTimestamp() - h.start;
					int newProgress = (int)(((double)time / (double)duration)*100);
					if (newProgress > progress) {
						monitor.worked(newProgress - progress);
						progress = newProgress;
					}
					return valueAdapter.create(dbHandler, dbValueAdapter);
				}
			}

			@Override
			public void remove() {
				dbIterator.remove();
			}
		};
	}
	
	public Handler getHandler(DataBaseHandle h) {
		dataBaseAdapter.initialize(h.record);
		dataBaseAdapter.set(h.nodeId, h.start);
		Handler dbHandler = dataBaseAdapter.retrieve(h.handlerId);
		if (dbHandler == null) {
			return null;
		}
		return valueAdapter.create(dbHandler, dbValueAdapter);
	}
	
	public Node getNode(DataBaseHandle h) {
		return getNode(h, null, null);
	}
	
	public Node getNode(DataBaseHandle h, String elementFilter, String handlerFilter) {
		dataBaseAdapter.initialize(h.record);
		
		Node result = null;
		for (Node metaData: h.record.getMetaData()) {
			if (metaData.getINetAddress().equals(h.nodeId)) {
				result = EcoreUtil.copy(metaData);
			}
		}
		
		if (result == null) {
			// node was not recorded in this record
			return null;
		}
		
		if (elementFilter != null && handlerFilter != null) {
			result.filter(elementFilter, handlerFilter);
		}
		
		dataBaseAdapter.set(h.nodeId, h.start);
		
		for (Handler handlerTimeCopy: result.getAllHandlers()) {
			Handler dbHandler = dataBaseAdapter.retrieve(handlerTimeCopy.getQualifiedName());
			if (dbHandler != null) {
				Preconditions.checkState(dbHandler.getTimestamp() <= h.start);
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
