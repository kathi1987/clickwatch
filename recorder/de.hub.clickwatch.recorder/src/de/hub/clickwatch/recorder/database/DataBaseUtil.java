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
import de.hub.clickwatch.model.util.builder.ModelBuilders;
import de.hub.clickwatch.recorder.ClickWatchRecorderModule;
import de.hub.clickwatch.recorder.recorder.HBaseDataBaseAdapter;
import de.hub.clickwatch.recorder.recorder.IDataBaseAdapter;
import de.hub.clickwatch.util.ILogger;

@Singleton
public class DataBaseUtil {

    @Inject private IDataBaseAdapter dataBaseAdapter;
    @Inject private IValueAdapter valueAdapter;
    @Inject @Named(ClickWatchRecorderModule.DB_VALUE_ADAPTER_PROPERTY) private IValueAdapter dbValueAdapter;
    @Inject private ILogger logger;

    private static class DataBaseHandle {
        Record record;
        Node node;
        Handler handler;
        long start;
        long end;
    }

    public static DataBaseHandle createHandle(Record record, Node node, long time) {
        return createHandle(record, node, (Handler)null, time, 0);
    }

    public static DataBaseHandle createHandle(Record record, Node node, Handler handler) {
        return createHandle(record, node, handler);
    }

    public static DataBaseHandle createHandle(Record record, Node node, String handlerName) {
        return createHandle(record, node, ModelBuilders.newHandlerBuilder().withName(handlerName).build());
    }

    public static DataBaseHandle createHandle(Record record, String iNetAddress, String handlerName, long start, long end) {
        return createHandle(record, ModelBuilders.newNodeBuilder().withINetAddress(iNetAddress).build(), ModelBuilders
                .newHandlerBuilder().withName(handlerName).build(), start, end);
    }

    public static DataBaseHandle createHandle(Record record, Node node, String handlerName, long start, long end) {
        return createHandle(record, node, ModelBuilders.newHandlerBuilder().withName(handlerName).build(), start, end);
    }

    public static DataBaseHandle createHandle(Record record, Node node, Handler handler, long time) {
        return createHandle(record, node, handler, time, 0);
    }

    public static DataBaseHandle createHandle(Record record, Node node, Handler handler, long start, long end) {
        DataBaseHandle result = new DataBaseHandle();
        result.record = record;
        result.node = node;
        result.handler = handler;
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
        dataBaseAdapter.initialize(h.record, false);
        final Iterator<Handler> dbIterator = ((HBaseDataBaseAdapter)dataBaseAdapter)
                .retrieve(h.node, h.handler, h.start, h.end);
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
                    int newProgress = (int)(((double)time / (double)duration) * 100);
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
        dataBaseAdapter.initialize(h.record, false);
        Handler dbHandler = dataBaseAdapter.retrieve(h.node, h.handler, h.start);
        if (dbHandler == null) {
            return null;
        }
        return valueAdapter.create(dbHandler, dbValueAdapter);
    }

    public Node getNode(DataBaseHandle h) {
        dataBaseAdapter.initialize(h.record, false);

        Node result = EcoreUtil.copy(h.node);
        loop: for (Node recordNode : h.record.getConfiguration().getNodes()) {
            if (recordNode.getINetAddress().equals(h.node.getINetAddress())) {
                result = EcoreUtil.copy(recordNode);
                break loop;
            }
        }

        if (result == null) {
            // node was not recorded in this record
            return null;
        }

        for (Handler handlerTimeCopy : result.getAllHandlers()) {
            Handler dbHandler = dataBaseAdapter.retrieve(h.node, handlerTimeCopy, h.start);
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
