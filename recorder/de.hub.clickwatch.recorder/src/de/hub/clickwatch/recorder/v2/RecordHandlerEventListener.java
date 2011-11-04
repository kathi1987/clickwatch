package de.hub.clickwatch.recorder.v2;

import de.hub.clickwatch.connection.adapter.IHandlerEventListener;
import de.hub.clickwatch.model.Handler;
import de.hub.clickwatch.model.Node;

public class RecordHandlerEventListener implements IHandlerEventListener {

    private final IDataBaseAdapter dataBaseAdapter;
    private final Node node;
    
    public RecordHandlerEventListener(IDataBaseAdapter dataBaseAdapter, Node node) {
        super();
        this.dataBaseAdapter = dataBaseAdapter;
        this.node = node;
    }

    @Override
    public void handlerReceived(Handler handler) {
        dataBaseAdapter.record(node, handler);
    }

    @Override
    public void receivingStarted() {
        
    }

    @Override
    public void receivingStopped() {
        
    }

    @Override
    public void listeningStarted() {
        
    }

    @Override
    public void listeningStopped() {
        dataBaseAdapter.close();
    }

    @Override
    public void dispose() {
        
    }
}
