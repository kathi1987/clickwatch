package de.hub.clickwatch.recorder.v2;

import java.util.HashMap;
import java.util.Map;

import com.google.inject.Inject;

import de.hub.clickwatch.connection.INodeConnection;
import de.hub.clickwatch.connection.INodeConnectionProvider;
import de.hub.clickwatch.connection.adapter.IErrorAdapter;
import de.hub.clickwatch.connection.adapter.IErrorAdapter.IErrorListener;
import de.hub.clickwatch.connection.adapter.IHandlerEventAdapter;
import de.hub.clickwatch.model.ClickWatchError;
import de.hub.clickwatch.model.Node;
import de.hub.clickwatch.recorder.database.cwdatabase.Record;
import de.hub.clickwatch.util.ILogger;

public class Recorder implements IErrorListener {
    
    @Inject IDataBaseAdapter dataBaseAdapter;
    @Inject INodeConnectionProvider ncp;
    @Inject ILogger logger;
    
    private Record record = null;
    private Map<Node, RecordHandlerEventListener> listeners = new HashMap<Node, RecordHandlerEventListener>();
    
    public void record(Record record) {
        this.record = record;
        dataBaseAdapter.initialize(record, true);
        for(Node node: record.getConfiguration().getNodes()) {
            if (!node.getErrors().isEmpty()) {
                
            }
            
            RecordHandlerEventListener listener = new RecordHandlerEventListener(dataBaseAdapter, node);
            listeners.put(node, listener);
            INodeConnection nodeConnection = node.getConnection();
            if (nodeConnection == null) {
                nodeConnection = ncp.createConnection(node);               
            }
            nodeConnection.getAdapter(IErrorAdapter.class).addErrorListener(this);
            IHandlerEventAdapter hea = nodeConnection.getAdapter(IHandlerEventAdapter.class);
            hea.addEventListener(listener);            
            hea.start();
            logger.log(ILogger.DEBUG, "started recording for " + node.getINetAddress(), null);
        }                
    }

    @Override
    public void handlerError(ClickWatchError error) {
//        logger.log(ILogger.DEBUG, "recorder caught error for and will stop recording.", null);
//        stop();
    }
    
    public void stop() {
        if (record == null) {
            return;
        }
        for (Node node: record.getConfiguration().getNodes()) {
            INodeConnection nodeConnection = node.getConnection();
            nodeConnection.getAdapter(IHandlerEventAdapter.class).stop();
            RecordHandlerEventListener listener = listeners.get(node);
            nodeConnection.getAdapter(IHandlerEventAdapter.class).removeEventListener(listener);            
            listeners.remove(node);
            dataBaseAdapter.close();
            logger.log(ILogger.DEBUG, "stop recording for " + node.getINetAddress(), null);
        }
    }
    
}
