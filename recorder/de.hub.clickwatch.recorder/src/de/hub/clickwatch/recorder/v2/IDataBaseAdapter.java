package de.hub.clickwatch.recorder.v2;

import java.util.Iterator;

import de.hub.clickwatch.model.Handler;
import de.hub.clickwatch.model.Node;
import de.hub.clickwatch.recorder.database.cwdatabase.Record;

public interface IDataBaseAdapter {

    public void initialize(Record record, boolean isNew);
    
    public void record(Node node, Handler handler);
    
    public Iterator<Handler> retrieve(Node node, Handler handler);
    
    public Iterator<Handler> retrieve(Node node, Handler handler, long start, long stop);
    
    public Handler retrieve(Node node, Handler handler, long time);
    
    public void close();
}
